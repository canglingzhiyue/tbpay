package tb;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.m;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.themis.kernel.i;
import java.util.HashMap;

/* loaded from: classes.dex */
public class oqd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTOP_STAGE_ASSEMBLEPARAMS = "assembleParams";
    public static final String MTOP_STAGE_ASSEMBLEPARAMS_STARTTIME = "assembleParamsStartTime";
    public static final String MTOP_STAGE_DATAPARSE = "dataParse";
    public static final String MTOP_STAGE_NETWORKREQUEST = "networkRequest";

    /* renamed from: a  reason: collision with root package name */
    private static a f32281a;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f32285a;
        public long b;
        public HashMap<String, String> h = new HashMap<>();
        public HashMap<String, Long> i = new HashMap<>();

        static {
            kge.a(211075266);
        }
    }

    static {
        kge.a(1300389580);
    }

    public static synchronized void a(String str, String str2, long j, long j2, HashMap<String, String> hashMap, boolean z) {
        synchronized (oqd.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9afdf87d", new Object[]{str, str2, new Long(j), new Long(j2), hashMap, new Boolean(z)});
            } else if (TextUtils.isEmpty(str)) {
            } else {
                if (TextUtils.equals(str2, MTOP_STAGE_ASSEMBLEPARAMS)) {
                    a aVar = new a();
                    f32281a = aVar;
                    aVar.f32285a = str;
                    f32281a.b = j;
                }
                if (f32281a == null) {
                    return;
                }
                if (!TextUtils.equals(str, f32281a.f32285a)) {
                    f32281a = null;
                    return;
                }
                if (TextUtils.equals(str, "coldStart")) {
                    s.f18233a.d().a(str2, Long.valueOf(SystemClock.uptimeMillis()));
                }
                f32281a.h.put(str2, String.valueOf(j2));
                if (hashMap != null && !hashMap.isEmpty()) {
                    f32281a.h.putAll(hashMap);
                }
                if (z && j > 0) {
                    final HashMap hashMap2 = new HashMap();
                    hashMap2.put(i.CDN_REQUEST_TYPE, f32281a.f32285a);
                    hashMap2.put("totalTime", String.valueOf(j - f32281a.b));
                    if (TextUtils.equals(f32281a.f32285a, "coldStart") && Build.VERSION.SDK_INT >= 24) {
                        hashMap2.put("startTotalTime", String.valueOf(j - Process.getStartUptimeMillis()));
                    }
                    hashMap2.put("level", g.b());
                    if (f32281a.h != null && f32281a.h.size() > 0) {
                        hashMap2.putAll(f32281a.h);
                    }
                    f32281a = null;
                    com.taobao.gateway.dispatch.a.b().f(new Runnable() { // from class: tb.oqd.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            HashMap<String, String> c = tmx.c();
                            if (c != null && !c.isEmpty()) {
                                hashMap2.putAll(c);
                            }
                            m.a().a("homeMtop", "home_mtop_cos_time", "1.0", "Page_Home_Mtop", "", hashMap2);
                        }
                    });
                }
            }
        }
    }

    public static void a(String str, long j, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a64e6", new Object[]{str, new Long(j), str2, str3});
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(i.CDN_REQUEST_TYPE, str);
        hashMap.put("duration", String.valueOf(j));
        hashMap.put("level", g.b());
        hashMap.put("containerId", str2);
        hashMap.put("dataSourceType", str3);
        com.taobao.gateway.dispatch.a.b().f(new Runnable() { // from class: tb.oqd.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                HashMap<String, String> c = tmx.c();
                if (c != null && !c.isEmpty()) {
                    hashMap.putAll(c);
                }
                m.a().a("uiRefresh", "home_mtop_cos_time", "1.0", "Page_Home_Mtop", "", hashMap);
            }
        });
    }

    public static void b(final String str, final String str2, final String str3, final HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabdb14c", new Object[]{str, str2, str3, hashMap});
        } else {
            com.taobao.gateway.dispatch.a.b().f(new Runnable() { // from class: tb.oqd.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        oqd.a(str, str2, str3, hashMap);
                    }
                }
            });
        }
    }

    public static void a(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bc5fad", new Object[]{str, str2, str3, hashMap});
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("stage", str);
        hashMap2.put("duration", str3);
        hashMap2.put("level", g.b());
        if (!TextUtils.isEmpty(str2)) {
            hashMap2.put("eventType", str2.toLowerCase());
        }
        if (hashMap != null && hashMap.size() > 0) {
            hashMap2.putAll(hashMap);
        }
        m.a().a("homeMtop", "home_mtop_cos_time", "1.0", "Page_Home", "", hashMap2);
    }
}
