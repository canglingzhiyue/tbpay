package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.i;
import com.ut.mini.behavior.UTEventId;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rpm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, rps> f33305a;
    private static rps b;
    private static rps c;
    private static Map<String, rpt> d;
    private static rpu e;

    public static /* synthetic */ void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            b(str, str2);
        }
    }

    public static /* synthetic */ void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            b(str, str2, str3);
        }
    }

    public static /* synthetic */ void a(String str, String str2, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaf5d6b", new Object[]{str, str2, map, new Boolean(z)});
        } else {
            d(str, str2, map, z);
        }
    }

    public static /* synthetic */ void a(String str, Map map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b82901d", new Object[]{str, map, str2});
        } else {
            b(str, map, str2);
        }
    }

    public static /* synthetic */ void b(String str, String str2, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2443666c", new Object[]{str, str2, map, new Boolean(z)});
        } else {
            c(str, str2, map, z);
        }
    }

    public static /* synthetic */ void d(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443f3af0", new Object[]{str, map});
        } else {
            h(str, map);
        }
    }

    public static /* synthetic */ void e(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a591d78f", new Object[]{str, map});
        } else {
            i(str, map);
        }
    }

    public static /* synthetic */ void f(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4742e", new Object[]{str, map});
        } else {
            g(str, map);
        }
    }

    static {
        kge.a(852158655);
        f33305a = Collections.synchronizedMap(new HashMap());
        d = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized void a(final Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            } else if (map == null) {
            } else {
                final String str = "" + System.currentTimeMillis();
                rpl.a(new Runnable() { // from class: tb.rpm.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            rpm.d(str, map);
                        }
                    }
                });
            }
        }
    }

    public static synchronized void b(final Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
            } else if (map == null) {
            } else {
                final String str = "" + System.currentTimeMillis();
                rpl.a(new Runnable() { // from class: tb.rpm.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            rpm.e(str, map);
                        }
                    }
                });
            }
        }
    }

    public static synchronized void a(final String str, final Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20476513", new Object[]{str, map});
                return;
            }
            apr.b(i.TAG, "commitSceneEnter scene", str, "properties", map);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            final String str2 = "" + System.currentTimeMillis();
            rpl.a(new Runnable() { // from class: tb.rpm.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rpm.a(str, map, str2);
                    }
                }
            });
        }
    }

    public static synchronized void b(String str, Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
                return;
            }
            apr.b(i.TAG, "commitUpdateSceneProperties scene", str, "logMap", map);
            a(str, map, false);
        }
    }

    public static synchronized void c(String str, Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ec9e51", new Object[]{str, map});
                return;
            }
            apr.b(i.TAG, "commitLeaveScene scene", str, "logMap", map);
            a(str, map, true);
        }
    }

    private static synchronized void a(final String str, final Map<String, String> map, final boolean z) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8a5f021", new Object[]{str, map, new Boolean(z)});
            } else if (TextUtils.isEmpty(str)) {
            } else {
                final String str2 = "" + System.currentTimeMillis();
                rpl.a(new Runnable() { // from class: tb.rpm.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            rpm.a(str, str2, map, z);
                        }
                    }
                });
            }
        }
    }

    public static synchronized void a(Object obj, final String str) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65cbb30e", new Object[]{obj, str});
                return;
            }
            apr.b(i.TAG, "commitEnter context", obj, "pageName", str);
            if (obj == null) {
                return;
            }
            final String str2 = "" + obj.hashCode();
            final String str3 = "" + System.currentTimeMillis();
            rpl.a(new Runnable() { // from class: tb.rpm.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    apr.b(i.TAG, "commitEnter contextHashCode", str2);
                    rpm.a(str2, str, str3);
                }
            });
        }
    }

    private static synchronized void b(String str, String str2, String str3) {
        String str4;
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
                return;
            }
            if (!aqc.e(str2)) {
                str4 = str + "_" + str2.hashCode();
            } else {
                str4 = str;
            }
            rps rpsVar = new rps();
            rpsVar.cold_start_id = rpj.f33300a;
            rpsVar.session_id = rpj.b;
            rpsVar.pv_key = str4;
            rpsVar.event_id = "2001";
            rpsVar.createTime = str3;
            rpsVar.user_id = rpj.a();
            rpsVar.page = str2;
            rpsVar.scene = rpsVar.page;
            long save = rpsVar.save();
            apr.b(i.TAG, "commitEnterNode seqId", Long.valueOf(save));
            if (save <= 0) {
                return;
            }
            rpsVar.id = save;
            b = rpsVar;
            f33305a.put(str, rpsVar);
        }
    }

    public static synchronized void a(Object obj, Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe578c1", new Object[]{obj, map});
                return;
            }
            apr.b(i.TAG, "commitUpdateProperties context", obj, "logMap", map);
            a(obj, map, false);
        }
    }

    public static synchronized void b(Object obj, Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71381560", new Object[]{obj, map});
                return;
            }
            apr.b(i.TAG, "commitLeave context", obj, "logMap", map);
            a(obj, map, true);
        }
    }

    private static synchronized void a(Object obj, final Map<String, String> map, final boolean z) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecca5233", new Object[]{obj, map, new Boolean(z)});
            } else if (obj == null || map == null) {
            } else {
                final String str = "" + obj.hashCode();
                final String str2 = "" + System.currentTimeMillis();
                rpl.a(new Runnable() { // from class: tb.rpm.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            rpm.b(str, str2, map, z);
                        }
                    }
                });
            }
        }
    }

    private static synchronized void c(String str, String str2, Map<String, String> map, boolean z) {
        String str3;
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49d76f6d", new Object[]{str, str2, map, new Boolean(z)});
                return;
            }
            rps rpsVar = f33305a.get(str);
            if (rpsVar == null) {
                return;
            }
            rpsVar.updateBizMap(map);
            if (z) {
                rpsVar.page = map.get(LogField.PAGE.toString());
                if (!aqc.e(rpsVar.page)) {
                    str3 = str + "_" + rpsVar.page.hashCode();
                } else {
                    str3 = str + "_";
                }
                rpsVar.pv_key = str3;
                rpsVar.updateTime = str2;
                rpsVar.scene = rpsVar.page;
                rpsVar.from_scene = map.get(LogField.ARG1.toString());
            }
            apr.b(i.TAG, "update count", Long.valueOf(rpsVar.update()));
            if (z) {
                f33305a.remove(str);
                a(rpsVar);
                c = rpsVar;
            }
        }
    }

    public static synchronized void b(Object obj, final String str) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f26bde0f", new Object[]{obj, str});
                return;
            }
            apr.b(i.TAG, "updatePvName context", obj, "pageName", str);
            if (obj != null && !aqc.e(str)) {
                final String str2 = "" + obj.hashCode();
                rpl.a(new Runnable() { // from class: tb.rpm.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        apr.b(i.TAG, "updatePvName contextHashCode", str2);
                        rpm.a(str2, str);
                    }
                });
            }
        }
    }

    private static synchronized void b(String str, String str2) {
        String str3;
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
                return;
            }
            if (!aqc.e(str2)) {
                str3 = str + "_" + str2.hashCode();
            } else {
                str3 = str;
            }
            rps rpsVar = f33305a.get(str);
            if (rpsVar == null) {
                return;
            }
            rpsVar.pv_key = str3;
            rpsVar.page = str2;
            rpsVar.scene = rpsVar.page;
            apr.b(i.TAG, "updatePvNodeName count", Long.valueOf(rpsVar.updatePageName()));
        }
    }

    public static synchronized void c(final Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2985bedb", new Object[]{map});
            } else if (map == null) {
            } else {
                final String str = "" + System.currentTimeMillis();
                rpl.a(new Runnable() { // from class: tb.rpm.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            rpm.f(str, map);
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc A[Catch: all -> 0x00da, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000c, B:9:0x0019, B:13:0x002d, B:15:0x0035, B:17:0x0045, B:22:0x004e, B:24:0x0056, B:33:0x007d, B:38:0x00cc, B:40:0x00d0, B:42:0x00d5, B:26:0x005e, B:28:0x0066, B:31:0x006f, B:32:0x0076), top: B:48:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void g(java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rpm.g(java.lang.String, java.util.Map):void");
    }

    private static synchronized void a(String str, String str2, Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
                return;
            }
            apr.b(i.TAG, "commitPvNodeWindVane");
            rps rpsVar = new rps();
            rpsVar.cold_start_id = rpj.f33300a;
            rpsVar.session_id = rpj.b;
            rpsVar.event_id = str;
            rpsVar.createTime = str2;
            rpsVar.updateTime = str2;
            rpsVar.user_id = rpj.a();
            rpsVar.page = map.get(LogField.PAGE.toString());
            rpsVar.updateBizMap(map);
            rpsVar.save();
        }
    }

    private static synchronized void a(rpn rpnVar) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd7aaee8", new Object[]{rpnVar});
            } else {
                apr.b(i.TAG, "commitEdgeInPv seqId", Long.valueOf(a((rpn) b, rpnVar, false)));
            }
        }
    }

    private static synchronized void a(rps rpsVar) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd7cf4c3", new Object[]{rpsVar});
                return;
            }
            b(rpsVar);
            c(rpsVar);
        }
    }

    private static synchronized void b(rps rpsVar) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfffb44", new Object[]{rpsVar});
            } else {
                apr.b(i.TAG, "commitPvEdgeInPv seqId", Long.valueOf(a((rpn) c, (rpn) rpsVar, true)));
            }
        }
    }

    private static synchronized void c(rps rpsVar) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da8301c5", new Object[]{rpsVar});
                return;
            }
            Map<String, rpt> map = d;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, rpt> entry : map.entrySet()) {
                    apr.b(i.TAG, "commitPvEdgeInScene seqId", Long.valueOf(a((rpn) entry.getValue(), (rpn) rpsVar, true)));
                }
            }
        }
    }

    private static synchronized long a(rpn rpnVar, rpn rpnVar2, boolean z) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fd706e60", new Object[]{rpnVar, rpnVar2, new Boolean(z)})).longValue();
            } else if (rpnVar == null || rpnVar2 == null) {
                return -1L;
            } else {
                rpp rppVar = new rpp();
                rppVar.left_node_id = rpnVar.id;
                rppVar.left_table = rpnVar.getTableName();
                rppVar.left_event_id = rpnVar.event_id;
                rppVar.left_event_name = rpnVar.page;
                rppVar.left_scene = rpnVar.scene;
                rppVar.right_node_id = rpnVar2.id;
                rppVar.right_table = rpnVar2.getTableName();
                rppVar.right_event_id = rpnVar2.event_id;
                if (z) {
                    rppVar.right_event_name = rpnVar2.page;
                } else {
                    try {
                        Map<String, String> map = rpnVar2.bizMap;
                        if (map != null) {
                            rppVar.right_event_name = map.get(LogField.ARG1.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
                rppVar.right_scene = rpnVar2.scene;
                rppVar.create_time = rpnVar2.updateTime;
                return rppVar.save();
            }
        }
    }

    private static synchronized void b(String str, Map<String, String> map, String str2) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cb8e2fc", new Object[]{str, map, str2});
            } else if (aqc.e(str)) {
            } else {
                rpt rptVar = new rpt();
                rptVar.cold_start_id = rpj.f33300a;
                rptVar.session_id = rpj.b;
                rptVar.event_id = "2701";
                rptVar.createTime = str2;
                rptVar.user_id = rpj.a();
                rptVar.page = str;
                rptVar.scene = str;
                rptVar.updateBizMap(map);
                long save = rptVar.save();
                apr.b(i.TAG, "commitEnterSceneNode seqId", Long.valueOf(save));
                if (save <= 0) {
                    return;
                }
                rptVar.id = save;
                d.put(str, rptVar);
            }
        }
    }

    private static synchronized void d(String str, String str2, Map<String, String> map, boolean z) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f6b786e", new Object[]{str, str2, map, new Boolean(z)});
                return;
            }
            rpt rptVar = d.get(str);
            if (rptVar == null) {
                return;
            }
            rptVar.updateBizMap(map);
            if (z) {
                rptVar.updateTime = str2;
            }
            apr.b(i.TAG, "update count", Long.valueOf(rptVar.update()));
            if (z) {
                d.remove(str);
            }
        }
    }

    private static synchronized void h(String str, Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c989ad6c", new Object[]{str, map});
                return;
            }
            rpu rpuVar = new rpu();
            rpuVar.cold_start_id = rpj.f33300a;
            rpuVar.session_id = rpj.b;
            rpuVar.event_id = "" + UTEventId.SCROLL.getEventId();
            rpuVar.createTime = str;
            rpuVar.user_id = rpj.a();
            rpuVar.page = map.get(LogField.PAGE.toString());
            rpuVar.updateBizMap(map);
            long save = rpuVar.save();
            apr.b(i.TAG, "commitEnterScrollNode seqId", Long.valueOf(save), "tyoe", rpuVar.getTableName());
            if (save <= 0) {
                return;
            }
            rpuVar.id = save;
            a(rpuVar);
            e = rpuVar;
        }
    }

    private static synchronized void i(String str, Map<String, String> map) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2adc4a0b", new Object[]{str, map});
                return;
            }
            if (e != null && map != null) {
                String str2 = map.get(LogField.PAGE.toString());
                if (str2 != null && str2.equals(e.page)) {
                    e.updateBizMap(map);
                    e.updateTime = str;
                    apr.b(i.TAG, "update count", Long.valueOf(e.update()));
                    e = null;
                }
            }
        }
    }

    private static synchronized void b(rpn rpnVar) {
        synchronized (rpm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfdb569", new Object[]{rpnVar});
            } else {
                apr.b(i.TAG, "commitEdgeInScroll seqId", Long.valueOf(a((rpn) e, rpnVar, false)));
            }
        }
    }
}
