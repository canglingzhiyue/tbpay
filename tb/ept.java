package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ept {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATAPARSE = "dataParse";
    public static final String DRAWVIEW = "drawView";
    public static final String INIT = "init";
    public static final String LIFECYCLE = "lifeCycle";
    public static final String NETWORK = "netWork";
    public static final String PAGELOAD = "pageLoad";
    public static final String SUB_BIND_VIEW = "bindData";
    public static final String SUB_CREATE_VIEW = "createView";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f27512a;
    private static List b;

    static {
        kge.a(882629616);
        f27512a = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        arrayList.add("mtopTotalTime");
        b.add("networkTotalTime");
        b.add("waitExecuteTime");
        b.add("buildParamsTime");
        b.add("computeSignTime");
        b.add("computeMiniWuaTime");
        b.add("computeWuaTime");
        b.add("waitCallbackTime");
        b.add("firstDataTime");
        b.add("serverRT");
        b.add("recvSize");
        emu.a("com.taobao.android.detail.datasdk.protocol.utils.UmbrellaPerformanceUtils");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            f27512a.put(str, str2);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (epj.e() == null) {
        } else {
            epj.e().a("Page_Detail");
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (epj.e() == null) {
        } else {
            epj.e().a("Page_Detail", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
        r3 = r1;
        r4 = r16;
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
        if (r11 < r4.b) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
        if (r13 > r4.c) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
        a(tb.ept.SUB_CREATE_VIEW, r10, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.util.Map<java.lang.String, tb.epc.a> r18) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ept.a(java.util.Map):void");
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (epj.e() == null) {
        } else {
            epj.e().a("Page_Detail", str, str2);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (epj.e() == null) {
        } else {
            c();
            epj.e().b("Page_Detail");
        }
    }

    private static void c() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        Map<String, String> map = f27512a;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if ("netWork".equals(entry.getKey()) && (split = value.split(",")) != null) {
                for (String str : split) {
                    String[] split2 = str.split("=");
                    if (split2 != null && split2.length == 2) {
                        String str2 = split2[0];
                        String str3 = split2[1];
                        if (b.contains(str2)) {
                            a("netWork", str2, Long.valueOf(str3).longValue());
                        }
                    }
                }
            }
        }
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
        } else if (epj.e() == null) {
        } else {
            epj.e().a("Page_Detail", str, j);
        }
    }

    public static void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
        } else if (epj.e() == null) {
        } else {
            epj.e().a("Page_Detail", str, str2, j);
        }
    }
}
