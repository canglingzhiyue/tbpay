package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import com.taobao.taobao.scancode.gateway.util.o;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class oys {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f32494a;
    private static boolean b;
    private static oys c;
    private static AtomicBoolean d;
    private static final List<Pair<String, Map<String, String>>> e;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        f32494a = str;
        return str;
    }

    public static /* synthetic */ AtomicBoolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("bf6c05e9", new Object[0]) : d;
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f32494a;
    }

    public static /* synthetic */ List e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[0]) : e;
    }

    static {
        kge.a(-509047120);
        d = new AtomicBoolean(false);
        e = new ArrayList();
    }

    private oys() {
        OrangeConfig.getInstance().registerListener(new String[]{"android_scancode_client"}, new g() { // from class: tb.oys.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:11:0x0084 A[Catch: Throwable -> 0x00c7, TRY_LEAVE, TryCatch #2 {Throwable -> 0x00c7, blocks: (B:6:0x001d, B:8:0x0076, B:9:0x007e, B:11:0x0084), top: B:32:0x001d }] */
            @Override // com.taobao.orange.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onConfigUpdate(java.lang.String r5, boolean r6) {
                /*
                    r4 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = tb.oys.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1d
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r3] = r4
                    r1[r2] = r5
                    r5 = 2
                    java.lang.Boolean r2 = new java.lang.Boolean
                    r2.<init>(r6)
                    r1[r5] = r2
                    java.lang.String r5 = "9458c0f9"
                    r0.ipc$dispatch(r5, r1)
                    return
                L1d:
                    java.util.concurrent.atomic.AtomicBoolean r5 = tb.oys.b()     // Catch: java.lang.Throwable -> Lc7
                    r5.set(r2)     // Catch: java.lang.Throwable -> Lc7
                    com.taobao.orange.OrangeConfig r5 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: java.lang.Throwable -> Lc7
                    java.lang.String r6 = "android_scancode_client"
                    java.lang.String r0 = "canUploadCodeMarkers"
                    java.lang.String r1 = "false"
                    java.lang.String r5 = r5.getConfig(r6, r0, r1)     // Catch: java.lang.Throwable -> Lc7
                    boolean r5 = java.lang.Boolean.parseBoolean(r5)     // Catch: java.lang.Throwable -> Lc7
                    tb.oys.a(r5)     // Catch: java.lang.Throwable -> Lc7
                    com.taobao.orange.OrangeConfig r5 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: java.lang.Throwable -> Lc7
                    java.lang.String r6 = "android_scancode_client"
                    java.lang.String r0 = "ignoredCodeMarkers"
                    java.lang.String r1 = ""
                    java.lang.String r5 = r5.getConfig(r6, r0, r1)     // Catch: java.lang.Throwable -> Lc7
                    tb.oys.b(r5)     // Catch: java.lang.Throwable -> Lc7
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
                    r5.<init>()     // Catch: java.lang.Throwable -> Lc7
                    java.lang.String r6 = "CodeMarkerUtils:update canUploadCodeMarkers:"
                    r5.append(r6)     // Catch: java.lang.Throwable -> Lc7
                    boolean r6 = tb.oys.c()     // Catch: java.lang.Throwable -> Lc7
                    r5.append(r6)     // Catch: java.lang.Throwable -> Lc7
                    java.lang.String r6 = ",ignoredCodeMarkers:"
                    r5.append(r6)     // Catch: java.lang.Throwable -> Lc7
                    java.lang.String r6 = tb.oys.d()     // Catch: java.lang.Throwable -> Lc7
                    r5.append(r6)     // Catch: java.lang.Throwable -> Lc7
                    java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lc7
                    java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lc7
                    com.taobao.taobao.scancode.gateway.util.o.a(r5, r6)     // Catch: java.lang.Throwable -> Lc7
                    java.util.List r5 = tb.oys.e()     // Catch: java.lang.Throwable -> Lc7
                    if (r5 == 0) goto Lc6
                    java.util.List r5 = tb.oys.e()     // Catch: java.lang.Throwable -> Lc7
                    java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lc7
                L7e:
                    boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc7
                    if (r6 == 0) goto Lb5
                    java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Lc7
                    android.util.Pair r6 = (android.util.Pair) r6     // Catch: java.lang.Throwable -> Lc7
                    if (r6 != 0) goto L8d
                    goto L7e
                L8d:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
                    r0.<init>()     // Catch: java.lang.Throwable -> L7e
                    java.lang.String r1 = "CodeMarkerUtils:resend data:"
                    r0.append(r1)     // Catch: java.lang.Throwable -> L7e
                    java.lang.Object r1 = r6.first     // Catch: java.lang.Throwable -> L7e
                    java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L7e
                    r0.append(r1)     // Catch: java.lang.Throwable -> L7e
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7e
                    java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L7e
                    com.taobao.taobao.scancode.gateway.util.o.a(r0, r1)     // Catch: java.lang.Throwable -> L7e
                    tb.oys r0 = tb.oys.this     // Catch: java.lang.Throwable -> L7e
                    java.lang.Object r1 = r6.first     // Catch: java.lang.Throwable -> L7e
                    java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L7e
                    java.lang.Object r6 = r6.second     // Catch: java.lang.Throwable -> L7e
                    java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L7e
                    r0.a(r1, r6)     // Catch: java.lang.Throwable -> L7e
                    goto L7e
                Lb5:
                    java.util.List r5 = tb.oys.e()     // Catch: java.lang.Throwable -> Lc6
                    monitor-enter(r5)     // Catch: java.lang.Throwable -> Lc6
                    java.util.List r6 = tb.oys.e()     // Catch: java.lang.Throwable -> Lc3
                    r6.clear()     // Catch: java.lang.Throwable -> Lc3
                    monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc3
                    goto Lc6
                Lc3:
                    r6 = move-exception
                    monitor-exit(r5)     // Catch: java.lang.Throwable -> Lc3
                    throw r6     // Catch: java.lang.Throwable -> Lc6
                Lc6:
                    return
                Lc7:
                    r5 = move-exception
                    java.lang.Object[] r6 = new java.lang.Object[r3]
                    java.lang.String r0 = "CodeMarkerUtils:Code Marker update error"
                    com.taobao.taobao.scancode.gateway.util.o.a(r5, r0, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: tb.oys.AnonymousClass1.onConfigUpdate(java.lang.String, boolean):void");
            }
        });
    }

    public static oys a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oys) ipChange.ipc$dispatch("f08ee75", new Object[0]);
        }
        if (c == null) {
            synchronized (oys.class) {
                if (c == null) {
                    c = new oys();
                }
            }
        }
        return c;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, null);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str2)) {
            hashMap.put(str2, str3);
        }
        a(str, hashMap);
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (!d.get()) {
                if (e.size() > 10) {
                    o.a("CodeMarkerUtils:cached data out of range 30,drop it", new Object[0]);
                    return;
                }
                try {
                    synchronized (e) {
                        e.add(new Pair<>(str, map));
                    }
                    o.a("CodeMarkerUtils:cached data :" + str, new Object[0]);
                } catch (Throwable unused) {
                }
            } else if (!b) {
            } else {
                if (!StringUtils.isEmpty(f32494a) && f32494a.contains(str)) {
                    o.a("CodeMarkerUtils:ignore:" + str, new Object[0]);
                    return;
                }
                b(str, map);
            }
        }
    }

    private void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        try {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Page_ScanCode_CM", str);
            if (map != null && !map.isEmpty()) {
                uTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
            StringBuilder sb = new StringBuilder();
            sb.append("CodeMarkerUtils:upload:{path:");
            sb.append(str);
            sb.append(",args:");
            sb.append(map == null ? "null" : map.toString());
            sb.append(riy.BLOCK_END_STR);
            o.a(sb.toString(), new Object[0]);
        } catch (Throwable unused) {
        }
    }
}
