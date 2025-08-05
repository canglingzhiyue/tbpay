package com.taobao.android.tschedule;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.aidl.ITScheduleStatus;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.jkq;
import tb.jli;
import tb.jmi;
import tb.kge;

/* loaded from: classes6.dex */
public class TScheduleStatusService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TS.StatusService";
    private static Map<String, String> b;
    private static Set<String> c;
    private static HashMap<String, String> d;
    private static HashMap<String, String> e;

    /* renamed from: a  reason: collision with root package name */
    public TScheduleStatusBinder f15654a = new TScheduleStatusBinder();

    public static /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[0]) : b;
    }

    public static /* synthetic */ Set e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("d6c0f95b", new Object[0]) : c;
    }

    public static /* synthetic */ HashMap f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("31745610", new Object[0]) : d;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : this.f15654a;
    }

    /* loaded from: classes6.dex */
    class TScheduleStatusBinder extends ITScheduleStatus.Stub {
        static {
            kge.a(531036018);
        }

        public void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException {
        }

        TScheduleStatusBinder() {
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void reset() {
            TScheduleStatusService.a();
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void updatePageUrl(String str, String str2) {
            TScheduleStatusService.a(str, str2);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getPageUrl(String str) {
            return TScheduleStatusService.a(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getPageKeys() {
            return JSON.toJSONString(TScheduleStatusService.d().keySet());
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getChangeFlags() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(TScheduleStatusService.e());
            return JSON.toJSONString(hashSet);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void finishChange(String str) {
            TScheduleStatusService.e().remove(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void addRenderUrl(String str, String str2) {
            TScheduleStatusService.b(str, str2);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void removeRenderUrlByKey(String str) {
            TScheduleStatusService.b(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String removeRenderUrlByValue(String str) {
            return TScheduleStatusService.c(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getRenderUrl(String str) {
            return TScheduleStatusService.d(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public boolean isRenderUrl(String str) {
            return TScheduleStatusService.e(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getRenderUrls() {
            return TScheduleStatusService.b();
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void addConfigUrl(String str, String str2) {
            TScheduleStatusService.a(str, str2, null);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public boolean isConfigrUrl(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return TScheduleStatusService.f().values().contains(jmi.a(str));
        }
    }

    static {
        kge.a(119829359);
        b = new ConcurrentHashMap();
        c = new HashSet();
        d = new HashMap<>();
        e = new HashMap<>();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            d.clear();
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String str3 = b.get(str);
            if (!TextUtils.equals(str3, str2)) {
                String str4 = null;
                Iterator<String> it = e.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (TextUtils.equals(str3, e.get(next))) {
                        str4 = next;
                        break;
                    }
                }
                if (str4 != null) {
                    c.add(str4);
                    e.j().a();
                }
            }
            b.put(str, str2);
            if (!d.containsKey(str)) {
                return;
            }
            d.put(str, jmi.a(str2));
        }
    }

    public static void a(String str, String str2, List<TimeContent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3a26d", new Object[]{str, str2, list});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            String str3 = jmi.a(str2, list).content;
            if (str2.startsWith(jli.PREFIX)) {
                String substring = str2.substring(9);
                HashMap<String, String> hashMap = d;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = jmi.a(str3);
                }
                hashMap.put(substring, str2);
                return;
            }
            d.put(str, jmi.a(str3));
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String str2 = b.get(str);
        if (!TextUtils.isEmpty(str2)) {
            String a2 = jmi.a(UTABTest.COMPONENT_URI, str2, "bucket");
            if (!TextUtils.isEmpty(a2) && !TextUtils.equals(a2, str2)) {
                jkq.a(TAG, "fetch url from utabtest, new url = " + a2 + ", originUrl=" + str2);
                return a2;
            }
        }
        return str2;
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            e.put(str, str2);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            e.remove(str);
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<String> it = e.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (TextUtils.equals(str, e.get(next))) {
                str2 = next;
                break;
            }
        }
        if (str2 != null) {
            e.remove(str2);
        }
        return str2;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str}) : e.get(str);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return e.values().contains(str);
        }
        return false;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : JSON.toJSONString(e);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        HashMap<String, String> hashMap = e;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }
}
