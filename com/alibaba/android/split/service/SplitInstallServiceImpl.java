package com.alibaba.android.split.service;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.util.Pair;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import com.alibaba.android.split.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE;
import com.alibaba.android.split.p;
import com.alibaba.android.split.s;
import com.alibaba.android.split.service.SplitInstallServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.bgj;
import tb.bgs;
import tb.bgu;
import tb.bhi;
import tb.bhk;
import tb.bhl;
import tb.kge;
import tb.qte;

/* loaded from: classes2.dex */
public class SplitInstallServiceImpl extends SplitInstallServiceStub implements BIND_SPLIT_INSTALL_SERVICE {
    private static final String CANCEL_INSTALL = "cancelInstall";
    private static final String DEFERRED_INSTALL = "deferrdInstall";
    private static final String GET_SESSION_STATE = "getSessionState";
    private static final String START_INSTALL = "startInstall";
    private static AtomicInteger atomicInteger;
    private static Map<String, Handler> handlerMap;
    private static Map<List<String>, Runnable> sInstallTaskMap;
    private static volatile int sJobId;
    public static final Map<Integer, b> sesstionMap;
    private final Context context;
    private bgu iLogger = (bgu) com.alibaba.android.split.a.b(bgu.class, "SplitInstallServiceImpl");
    private JobScheduler mJobScheduler;

    /* loaded from: classes2.dex */
    public interface a {
        void onDownloadStateChange(b bVar);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void deferredLanguageInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void deferredLanguageUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void getSessionStates(String str, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
    }

    static {
        kge.a(-1056072956);
        kge.a(-1430668418);
        sInstallTaskMap = new ConcurrentHashMap();
        atomicInteger = new AtomicInteger(1);
        sesstionMap = new ConcurrentHashMap();
        handlerMap = new ConcurrentHashMap();
        sJobId = 1;
    }

    public SplitInstallServiceImpl(Context context) {
        this.mJobScheduler = null;
        this.context = context;
        this.mJobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void startInstall(String str, List<Bundle> list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        bgu bguVar = this.iLogger;
        bguVar.d("startInstall trigger to startInstall:" + Arrays.toString(list.toArray()), new Object[0]);
        if (!handlerMap.containsKey(START_INSTALL)) {
            HandlerThread handlerThread = new HandlerThread(START_INSTALL);
            handlerThread.start();
            handlerMap.put(START_INSTALL, new Handler(handlerThread.getLooper()));
        }
        List<String> moduleNames = moduleNames(list);
        Collections.sort(moduleNames);
        new Pair(false, 0);
        Pair<Boolean, Integer> supended = supended(moduleNames);
        if (((Boolean) supended.first).booleanValue()) {
            final int intValue = ((Integer) supended.second).intValue();
            bhl bhlVar = new bhl(this.context, intValue, str, list, bundle, splitInstallResultCallback, new a() { // from class: com.alibaba.android.split.service.-$$Lambda$SplitInstallServiceImpl$EKkdIRYmtWjAg0-scccXv1MSZL8
                @Override // com.alibaba.android.split.service.SplitInstallServiceImpl.a
                public final void onDownloadStateChange(SplitInstallServiceImpl.b bVar) {
                    SplitInstallServiceImpl.lambda$startInstall$0(intValue, bVar);
                }
            }, true, sesstionMap.get(Integer.valueOf(intValue)));
            bhlVar.a(qte.a());
            handlerMap.get(START_INSTALL).post(bhlVar);
            return;
        }
        bhl bhlVar2 = new bhl(this.context, atomicInteger.getAndIncrement(), str, list, bundle, splitInstallResultCallback, new a() { // from class: com.alibaba.android.split.service.SplitInstallServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                SplitInstallServiceImpl.this = this;
            }

            @Override // com.alibaba.android.split.service.SplitInstallServiceImpl.a
            public void onDownloadStateChange(b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1111f0be", new Object[]{this, bVar});
                } else if (bVar.f2505a != 3 && bVar.f2505a != 6 && bVar.f2505a != 5) {
                } else {
                    Collections.sort(bVar.g);
                    SplitInstallServiceImpl.sInstallTaskMap.remove(bVar.g);
                }
            }
        }, false, null);
        bhlVar2.a(qte.a());
        sInstallTaskMap.put(moduleNames, bhlVar2);
        handlerMap.get(START_INSTALL).post(bhlVar2);
    }

    public static /* synthetic */ void lambda$startInstall$0(int i, b bVar) {
        sesstionMap.put(Integer.valueOf(i), bVar);
    }

    private boolean installed(List<String> list) {
        HashSet hashSet = new HashSet(list);
        for (b bVar : sesstionMap.values()) {
            if (bVar.f2505a == 5) {
                for (String str : bVar.g) {
                    if (hashSet.contains(str)) {
                        hashSet.remove(str);
                    }
                }
            }
        }
        return hashSet.size() == 0;
    }

    private Pair<Boolean, Integer> supended(List<String> list) {
        for (String str : list) {
            for (Map.Entry<Integer, b> entry : sesstionMap.entrySet()) {
                if (entry.getValue().f2505a == 8) {
                    for (String str2 : entry.getValue().g) {
                        if (str.equals(str2)) {
                            return new Pair<>(true, entry.getKey());
                        }
                    }
                    continue;
                }
            }
        }
        return new Pair<>(false, 0);
    }

    public static boolean downloaded(List<String> list) {
        HashSet hashSet = new HashSet(list);
        for (b bVar : sesstionMap.values()) {
            if (bVar.f2505a == 3) {
                for (String str : bVar.g) {
                    if (hashSet.contains(str)) {
                        hashSet.remove(str);
                    }
                }
            }
        }
        return hashSet.size() == 0;
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void cancelInstall(String str, int i, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        if (!handlerMap.containsKey(CANCEL_INSTALL)) {
            HandlerThread handlerThread = new HandlerThread(CANCEL_INSTALL);
            handlerThread.start();
            handlerMap.put(CANCEL_INSTALL, new Handler(handlerThread.getLooper()));
        }
        if (sesstionMap.containsKey(Integer.valueOf(i)) && sesstionMap.get(Integer.valueOf(i)).f2505a == 2) {
            handlerMap.get(CANCEL_INSTALL).post(new bhi(this.context, str, i, sesstionMap.get(Integer.valueOf(i)), bundle, splitInstallResultCallback));
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("error_code", -4);
        splitInstallResultCallback.onError(bundle2);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void getSessionState(String str, int i, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        if (!handlerMap.containsKey(GET_SESSION_STATE)) {
            HandlerThread handlerThread = new HandlerThread(GET_SESSION_STATE);
            handlerThread.start();
            handlerMap.put(GET_SESSION_STATE, new Handler(handlerThread.getLooper()));
        }
        if (sesstionMap.containsKey(Integer.valueOf(i))) {
            handlerMap.get(GET_SESSION_STATE).post(new bhk(this.context, i, sesstionMap.get(Integer.valueOf(i)), splitInstallResultCallback));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", -4);
        splitInstallResultCallback.onError(bundle);
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void deferredUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        List<String> moduleNames = moduleNames(list);
        for (String str2 : p.a().a()) {
            if (moduleNames.contains(str2)) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("error_code", 0);
                splitInstallResultCallback.onDeferredUninstall(bundle2);
                return;
            }
        }
    }

    @Override // com.alibaba.android.split.api.ISplitInstallService
    public void deferredInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        List<String> moduleNames = moduleNames(list);
        if (downloading(moduleNames) || downloaded(moduleNames) || installed(moduleNames)) {
            this.iLogger.d("deferredInstall installing:%s", Arrays.toString(list.toArray()));
            Bundle bundle2 = new Bundle();
            bundle2.putInt("error_code", -17);
            splitInstallResultCallback.onDeferredInstall(bundle2);
            return;
        }
        int andIncrement = atomicInteger.getAndIncrement();
        this.iLogger.d("deferredInstall sessionId:%s", Integer.valueOf(andIncrement));
        ArrayList arrayList = new ArrayList();
        for (String str2 : moduleNames) {
            arrayList.add(((s) com.alibaba.android.split.a.a((Class<? extends Object>) s.class, new Object[0])).a(str2));
        }
        if (arrayList.size() == 0) {
            this.iLogger.d("deferredInstall INVALID_REQUEST", new Object[0]);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("error_code", -3);
            splitInstallResultCallback.onDeferredInstall(bundle3);
            return;
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putStringArray("module_names", (String[]) moduleNames.toArray(new String[0]));
        persistableBundle.putInt("version_code", bundle.getInt("version_code", 0));
        persistableBundle.putInt("sessionId", andIncrement);
        int i = sJobId;
        sJobId = i + 1;
        JobInfo.Builder builder = new JobInfo.Builder(i, new ComponentName(this.context, "fakeClass"));
        builder.setExtras(persistableBundle);
        bgj.a().a(new bgs(this.context, builder.build()));
        Bundle bundle4 = new Bundle();
        bundle4.putInt("error_code", 0);
        splitInstallResultCallback.onDeferredInstall(bundle4);
    }

    public static boolean downloading(List<String> list) {
        HashSet hashSet = new HashSet(list);
        for (Map.Entry<Integer, b> entry : sesstionMap.entrySet()) {
            if (entry.getValue().f2505a == 2) {
                for (String str : entry.getValue().g) {
                    if (hashSet.contains(str)) {
                        hashSet.remove(str);
                    }
                }
            }
        }
        return hashSet.size() == 0;
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int f2505a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public List<String> g;

        static {
            kge.a(958094326);
        }

        private b(int i, int i2, int i3, String str, int i4, int i5, List<String> list) {
            this.f2505a = i;
            this.b = i2;
            this.c = i3;
            this.d = str;
            this.e = i4;
            this.f = i5;
            this.g = list;
        }

        public static b a(int i, int i2, int i3, String str, int i4, int i5, List<String> list) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d7b8005", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), str, new Integer(i4), new Integer(i5), list}) : new b(i, i2, i3, str, i4, i5, list);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TaskDetail{state=" + this.f2505a + ", taskId=" + this.b + ", errorCode=" + this.c + ", errorMessage='" + this.d + "', bytes_downloaded=" + this.e + ", total_bytes_to_download=" + this.f + ", fileInfos=" + this.g + '}';
        }
    }

    static List<String> moduleNames(List<Bundle> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i).getString("module_name");
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }
}
