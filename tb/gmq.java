package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.k;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class gmq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMON_ASYNC_THREAD = "common_async_thread";
    public static final String MAIN_THREAD = "main_thread";
    public static final String TRACK_CENTER_DEGRADE = "trackCenterDegrade";

    /* renamed from: a  reason: collision with root package name */
    private static String f28382a;
    private static boolean b;
    private static boolean c;
    private static String d;
    private static Map<String, Long> e;
    private static Map<String, Long> f;
    private static List<String> g;
    private static int h;
    private static int i;
    private static HandlerThread j;
    private static Handler k;
    private static Runnable l;

    public static /* synthetic */ int a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i2)})).intValue();
        }
        h = i2;
        return i2;
    }

    public static /* synthetic */ void a(String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j2)});
        } else {
            b(str, str2, j2);
        }
    }

    public static /* synthetic */ void a(String str, boolean z, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25c5a18", new Object[]{str, new Boolean(z), str2, new Long(j2)});
        } else {
            b(str, z, str2, j2);
        }
    }

    public static /* synthetic */ String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : f(str);
    }

    public static /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            e(str);
        }
    }

    public static /* synthetic */ boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : b;
    }

    public static /* synthetic */ boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : c;
    }

    public static /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
        } else {
            x();
        }
    }

    public static /* synthetic */ String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : f28382a;
    }

    public static /* synthetic */ int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue();
        }
        int i2 = i;
        i = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue() : i;
    }

    public static /* synthetic */ List l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("566a3ef4", new Object[0]) : g;
    }

    public static /* synthetic */ Map m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("44113da9", new Object[0]) : f;
    }

    public static /* synthetic */ Map n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("11bb9f6a", new Object[0]) : e;
    }

    public static /* synthetic */ int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[0])).intValue() : h;
    }

    public static /* synthetic */ Runnable p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("59bd2f3d", new Object[0]) : l;
    }

    public static /* synthetic */ Handler q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("702fc74e", new Object[0]) : k;
    }

    static {
        kge.a(144769222);
        f28382a = "TrackCenter";
        b = false;
        d = "Page_Home";
        e = Collections.synchronizedMap(new LinkedHashMap());
        f = Collections.synchronizedMap(new LinkedHashMap());
        g = Collections.synchronizedList(new ArrayList());
        h = 0;
        i = 0;
        HandlerThread a2 = jbg.a("TrackCenterHandlerThread");
        j = a2;
        a2.start();
        k = new Handler(j.getLooper()) { // from class: tb.gmq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 673877017) {
                    super.handleMessage((Message) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                super.handleMessage(message);
                if (gmq.f() || !gmq.g() || message.obj == null) {
                    return;
                }
                gmr gmrVar = (gmr) message.obj;
                if (gmrVar.f28383a == 0) {
                    gmq.a(gmrVar.b, gmrVar.d, gmrVar.e, gmrVar.c);
                } else if (gmrVar.f28383a == 1) {
                    gmq.a(gmrVar.b, gmrVar.e, gmrVar.c);
                } else if (gmrVar.f28383a != 2) {
                } else {
                    gmq.c(gmq.b(gmrVar.b));
                    gmq.h();
                }
            }
        };
        l = new Runnable() { // from class: tb.gmq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (gmq.f() || !gmq.g()) {
                    String i2 = gmq.i();
                    TLog.logd(i2, "LooperRunnable=stopTimer+isDegrade=" + gmq.f() + "-ready=" + gmq.g());
                    gmq.b();
                } else {
                    gmq.j();
                    if (gmq.k() > 30) {
                        gmq.c(gmq.b("too_long_time_event"));
                        gmq.l().clear();
                        gmq.a(0);
                    }
                    if (gmq.m().size() > 20 || gmq.n().size() > 15) {
                        gmq.c(gmq.b("too_many_event"));
                        gmq.l().clear();
                        gmq.a(0);
                    }
                    if (gmq.o() <= 0) {
                        gmq.h();
                        return;
                    }
                    if (jqm.a()) {
                        String i3 = gmq.i();
                        TLog.logd(i3, "sendPerformanceAsync=" + gmq.l().toString());
                    }
                    gmq.q().postDelayed(gmq.p(), 800L);
                }
            }
        };
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            c = true;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!c) {
        } else {
            TLog.logd(f28382a, "stopPerformanceTrack");
            k.removeCallbacksAndMessages(null);
            j.quit();
            r();
            c = false;
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    private static void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[0]);
            return;
        }
        e.clear();
        f.clear();
    }

    private static Map<String, Long> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa35996a", new Object[]{str});
        }
        if (str != null && str.equals(MAIN_THREAD)) {
            return e;
        }
        return f;
    }

    private static String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[0]) : Looper.getMainLooper().getThread() == Thread.currentThread() ? MAIN_THREAD : COMMON_ASYNC_THREAD;
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
        } else {
            a(str, z, s());
        }
    }

    public static void a(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{str, new Boolean(z), str2});
        } else if (b || !c) {
        } else {
            Message message = new Message();
            gmr gmrVar = new gmr();
            gmrVar.b = str;
            gmrVar.f28383a = 0;
            gmrVar.d = z;
            gmrVar.e = str2;
            gmrVar.c = SystemClock.uptimeMillis();
            message.obj = gmrVar;
            k.sendMessage(message);
        }
    }

    private static void b(String str, boolean z, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979dc8d9", new Object[]{str, new Boolean(z), str2, new Long(j2)});
        } else if (b || !c) {
        } else {
            if (z) {
                g.add(str);
                h++;
            }
            c(f(str), str2, j2);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, s());
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (b || !c) {
        } else {
            Message message = new Message();
            gmr gmrVar = new gmr();
            gmrVar.b = str;
            gmrVar.f28383a = 1;
            gmrVar.e = str2;
            gmrVar.c = SystemClock.uptimeMillis();
            message.obj = gmrVar;
            k.sendMessage(message);
        }
    }

    private static void b(String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fcde7", new Object[]{str, str2, new Long(j2)});
        } else if (b || !c) {
        } else {
            c(str + "_end_time", str2, j2);
            if (g.contains(str)) {
                g.remove(str);
            }
            h--;
        }
    }

    private static void c(String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c850306", new Object[]{str, str2, new Long(j2)});
            return;
        }
        Map<String, Long> d2 = d(str2);
        if (d2 != null) {
            d2.put(str, Long.valueOf(j2));
            if (!jqm.a()) {
                return;
            }
            String str3 = f28382a;
            TLog.logd(str3, "point=" + str + "--currentTimeMillis=" + j2 + "--currentThread=" + Thread.currentThread().getName());
            return;
        }
        TLog.logd(f28382a, "no can use thread map");
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (b) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str3);
            AppMonitor.Counter.commit(str, str2, k.a(jSONObject), 1.0d);
            if (!jqm.a()) {
                return;
            }
            String str4 = f28382a;
            TLog.logd(str4, "fieldName=" + str2 + "-point=" + str3);
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (b) {
        } else {
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("clickParam");
                if (jSONObject2 == null) {
                    c();
                    return;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
                if (jSONObject3 == null) {
                    c();
                    return;
                }
                String string = jSONObject3.getString("spm");
                if (string == null || !string.startsWith("a2141")) {
                    c();
                    return;
                } else if (string.lastIndexOf(".") <= 0) {
                    c();
                    return;
                } else {
                    String substring = string.substring(0, string.lastIndexOf("."));
                    a("Page_Home", "track_center_action", "main_model_tap_" + substring);
                    return;
                }
            }
            c();
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            a("Page_Home", "track_center_action", "main_model_spm_null_count");
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (b || !c || w()) {
            TLog.logd(f28382a, " sendPerformanceAsync");
            b();
        } else {
            k.postDelayed(l, 0L);
        }
    }

    private static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        f.put(str, Long.valueOf(uptimeMillis));
        e.put(str, Long.valueOf(uptimeMillis));
    }

    private static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[0]);
        } else {
            e(f("cold_start_track_end_event"));
        }
    }

    private static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{str});
        }
        return str + "_start_time";
    }

    private static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[0]);
            return;
        }
        long v = v();
        for (Map.Entry<String, Long> entry : e.entrySet()) {
            entry.setValue(Long.valueOf(entry.getValue().longValue() - v));
        }
        for (Map.Entry<String, Long> entry2 : f.entrySet()) {
            entry2.setValue(Long.valueOf(entry2.getValue().longValue() - v));
        }
    }

    private static long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69459f1", new Object[0])).longValue();
        }
        try {
            d a2 = c.a();
            if (a2 == null) {
                return -1L;
            }
            return a2.a("startProcessSystemClockTime", -1L);
        } catch (Throwable th) {
            TLog.loge(f28382a, "uniteTimeCal IAppPreferences error", th);
            return -1L;
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (b || !c || w()) {
        } else {
            gmr gmrVar = new gmr();
            gmrVar.b = "cold_start_track_direct_send_event";
            gmrVar.f28383a = 2;
            gmrVar.c = SystemClock.uptimeMillis();
            Message message = new Message();
            message.obj = gmrVar;
            k.sendMessage(message);
        }
    }

    private static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : e.isEmpty() && f.isEmpty();
    }

    private static void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[0]);
            return;
        }
        g.clear();
        h = 0;
        t();
        try {
            u();
            String str = MAIN_THREAD + "=" + e.toString() + ";" + COMMON_ASYNC_THREAD + "=" + f.toString();
            AppMonitor.Alarm.commitSuccess(d, "track_center_performance", str);
            if (jqm.a()) {
                TLog.logd(f28382a, "sendPerformanceAsync=" + str);
            }
        } catch (Exception unused) {
            TLog.logd(f28382a, "performanceEventsMap.toString error");
        }
        b();
    }
}
