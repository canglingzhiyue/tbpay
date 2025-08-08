package com.android.taobao.safeclean;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.CleanList;
import com.android.taobao.safeclean.b;
import com.android.taobao.safeclean.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.cja;
import tb.cjb;
import tb.kge;

/* loaded from: classes.dex */
public class m implements d<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DO_CLEAN = 0;
    public static final int DO_STORE = 1;

    /* renamed from: a */
    public static Application f6406a;
    private com.android.taobao.safeclean.b b;
    private n c;
    private b d;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static m f6408a;

        static {
            kge.a(1338495634);
            f6408a = new m();
        }

        public static /* synthetic */ m a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("a9a57176", new Object[0]) : f6408a;
        }
    }

    static {
        kge.a(-1995559266);
        kge.a(-673478844);
    }

    public static /* synthetic */ void lambda$4nemgp2r6OhczFqMG05IsXuQPIo(m mVar) {
        mVar.b();
    }

    public static /* synthetic */ void lambda$G1p2o_o3GqeJkGQSVyAEx8O0e54(CleanList cleanList) {
        a(cleanList);
    }

    /* renamed from: lambda$eOoj-qhv9VCS738r21qhkWJ8sKU */
    public static /* synthetic */ void m618lambda$eOojqhv9VCS738r21qhkWJ8sKU(m mVar, CleanList cleanList, AtomicReference atomicReference, String str, String str2) {
        mVar.a(cleanList, atomicReference, str, str2);
    }

    public static /* synthetic */ void a(m mVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40934bfa", new Object[]{mVar, str});
        } else {
            mVar.a(str);
        }
    }

    private m() {
        this.b = new com.android.taobao.safeclean.b();
        this.d = new b();
        this.c = new n();
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("a9a57176", new Object[0]) : a.a();
    }

    @Override // com.android.taobao.safeclean.d
    public synchronized void a(final String str, final String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str3)) {
        } else {
            try {
                CleanList cleanList = (CleanList) JSON.parseObject(str3, CleanList.class);
                if (!this.d.a(str2, cleanList)) {
                    return;
                }
                final CleanList a2 = a(cleanList, 1);
                final CleanList a3 = a(cleanList, 0);
                if (str.equals("local")) {
                    a3.cleanDataList.addAll(a2.cleanDataList);
                    a2.cleanDataList.clear();
                }
                final AtomicReference atomicReference = new AtomicReference(false);
                Runnable runnable = null;
                Runnable runnable2 = (a2 == null || a2.cleanDataList.size() <= 0) ? null : new Runnable() { // from class: com.android.taobao.safeclean.-$$Lambda$m$G1p2o_o3GqeJkGQSVyAEx8O0e54
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.lambda$G1p2o_o3GqeJkGQSVyAEx8O0e54(CleanList.this);
                    }
                };
                if (a3 != null && a3.cleanDataList.size() > 0) {
                    runnable = new Runnable() { // from class: com.android.taobao.safeclean.-$$Lambda$m$eOoj-qhv9VCS738r21qhkWJ8sKU
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.m618lambda$eOojqhv9VCS738r21qhkWJ8sKU(m.this, a3, atomicReference, str2, str);
                        }
                    };
                }
                if (runnable != null) {
                    runnable.run();
                }
                if (runnable2 != null) {
                    cjb.a(runnable2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void a(CleanList cleanList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441460f6", new Object[]{cleanList});
        } else {
            g.a().a("local", JSON.toJSONString(cleanList));
        }
    }

    public /* synthetic */ void a(CleanList cleanList, final AtomicReference atomicReference, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4229ebab", new Object[]{this, cleanList, atomicReference, str, str2});
        } else {
            this.b.a(cleanList.cleanDataList, new b.a() { // from class: com.android.taobao.safeclean.m.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    m.this = this;
                }

                @Override // com.android.taobao.safeclean.b.a
                public void c(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
                        return;
                    }
                    if (cja.b(i) > 3) {
                        Log.e("SimpleCleaner", "miss id:" + i + " limited");
                        g.a().a(i);
                    } else {
                        cja.a(i);
                        atomicReference.set(true);
                    }
                    Log.e("SimpleCleaner", "miss id:" + i + " file not exit");
                }

                @Override // com.android.taobao.safeclean.b.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (((Boolean) atomicReference.get()).booleanValue()) {
                    } else {
                        m.a(m.this, str);
                        if (!str2.equalsIgnoreCase("local")) {
                            return;
                        }
                        g.a().a("local");
                    }
                }

                @Override // com.android.taobao.safeclean.b.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    g.a().a(i);
                    k.a(String.valueOf(i));
                }

                @Override // com.android.taobao.safeclean.b.a
                public void b(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                        return;
                    }
                    atomicReference.set(true);
                    k.a(String.valueOf(i), "-1", "delete failed");
                }
            });
        }
    }

    private CleanList a(CleanList cleanList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CleanList) ipChange.ipc$dispatch("2134beb7", new Object[]{this, cleanList, new Integer(i)});
        }
        CleanList cleanList2 = new CleanList();
        cleanList2.appVersion = cleanList.appVersion;
        for (CleanList.CleanModel cleanModel : cleanList.cleanDataList) {
            if (cleanModel.strategy == i) {
                cleanList2.cleanDataList.add(cleanModel);
            }
        }
        return cleanList2;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            g.a().b(str);
        }
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        String a2 = a((Context) application);
        f6406a = application;
        a(application, a2);
    }

    private void a(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be04981", new Object[]{this, application, str});
        } else if (!application.getPackageName().equals(str)) {
        } else {
            new h();
            cjb.a(new Runnable() { // from class: com.android.taobao.safeclean.-$$Lambda$m$4nemgp2r6OhczFqMG05IsXuQPIo
                {
                    m.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    m.lambda$4nemgp2r6OhczFqMG05IsXuQPIo(m.this);
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    public /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c.a()) {
        } else {
            new i();
        }
    }

    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        int myPid = Process.myPid();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final List<c> f6409a = new ArrayList();

        static {
            kge.a(-2061954922);
        }

        public b() {
            this.f6409a.add(new c.C0206c());
            this.f6409a.add(new c.a());
        }

        public boolean a(String str, CleanList cleanList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("41252ec4", new Object[]{this, str, cleanList})).booleanValue();
            }
            if (cleanList != null && cleanList.cleanDataList.size() != 0) {
                for (c cVar : this.f6409a) {
                    if (cVar instanceof c.b) {
                        return false;
                    }
                    if ((cVar instanceof c.C0206c) && !cVar.a(str, g.a().b())) {
                        return false;
                    }
                    if ((cVar instanceof c.a) && !cVar.a(cleanList.appVersion, g.a().f())) {
                        return false;
                    }
                }
                a(cleanList, g.a().d());
                if (cleanList.cleanDataList.size() > 0) {
                    return true;
                }
            }
            return false;
        }

        private void a(CleanList cleanList, SparseBooleanArray sparseBooleanArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b607cd", new Object[]{this, cleanList, sparseBooleanArray});
            } else if (cleanList.cleanDataList != null && cleanList.cleanDataList.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (CleanList.CleanModel cleanModel : cleanList.cleanDataList) {
                    if (sparseBooleanArray.get(cleanModel.dataId)) {
                        Log.e("SimpleCleaner", "filtered sucess Id:" + cleanModel.dataId);
                        arrayList.add(cleanModel);
                    }
                }
                cleanList.cleanDataList.removeAll(arrayList);
            }
        }
    }
}
