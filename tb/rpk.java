package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import com.ut.mini.behavior.UTEventId;
import com.ut.mini.h;
import com.ut.mini.module.plugin.a;
import com.ut.mini.module.plugin.d;
import com.ut.mini.module.trackerlistener.b;
import java.util.Map;

/* loaded from: classes9.dex */
public class rpk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f33301a;
    private static rpk b;
    private static Context c;
    private static rph d;

    public static /* synthetic */ rph a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rph) ipChange.ipc$dispatch("f0a2874", new Object[0]) : d;
    }

    static {
        kge.a(-986261351);
        f33301a = false;
        b = new rpk();
        c = null;
    }

    private rpk() {
    }

    public static rpk getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rpk) ipChange.ipc$dispatch("201488e7", new Object[0]) : b;
    }

    public static void init(Context context, rph rphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a3a157", new Object[]{context, rphVar});
        } else if (f33301a || context == null || rphVar == null) {
        } else {
            c = context;
            d = rphVar;
            b();
            c();
            rpj.f33300a = any.d().i();
            rpj.b = "" + System.currentTimeMillis();
            f33301a = true;
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : c;
    }

    public rph getDataCollectorAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rph) ipChange.ipc$dispatch("da39dff3", new Object[]{this}) : d;
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            rpl.a(new Runnable() { // from class: tb.rpk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    rpk.a().createTable("dc_ut_scene_node");
                    rpk.a().createTable("dc_ut_pv_node");
                    rpk.a().createTable("dc_ut_tap_node");
                    rpk.a().createTable("dc_ut_expose_node");
                    rpk.a().createTable("dc_ut_other_node");
                    rpk.a().createTable("dc_ut_scroll_node");
                    rpk.a().createTable("dc_ut_edge");
                }
            });
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        final int[] iArr = {-1};
        d.getInstance().registerPlugin(new a() { // from class: tb.rpk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.mini.module.plugin.a
            public String getPluginName() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("fd12a725", new Object[]{this}) : "UTDataCollector";
            }

            @Override // com.ut.mini.module.plugin.a
            public int[] getAttentionEventIds() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (int[]) ipChange2.ipc$dispatch("873e4cb7", new Object[]{this}) : iArr;
            }

            @Override // com.ut.mini.module.plugin.a
            public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
                }
                try {
                    rpm.c(map);
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
        }, false, null, null);
        b.getInstance().registerListener(new com.ut.mini.module.trackerlistener.a() { // from class: tb.rpk.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.mini.module.trackerlistener.a
            public String trackerListenerName() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1d8246a2", new Object[]{this}) : "UTDataCollector";
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
                } else {
                    rpm.a(obj, str);
                }
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void updatePageName(UTTracker uTTracker, Object obj, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
                } else {
                    rpm.b(obj, str);
                }
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void updatePagePropertiesEnd(UTTracker uTTracker, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c913703", new Object[]{this, uTTracker, obj});
                } else {
                    rpm.a(obj, uTTracker.getPageProperties(obj));
                }
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void pageDisAppearEnd(UTTracker uTTracker, Object obj, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f6fd959", new Object[]{this, uTTracker, obj, map});
                } else {
                    rpm.b(obj, map);
                }
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void beginScene(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb3d8d51", new Object[]{this, str, map});
                } else {
                    rpm.a(str, map);
                }
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void updateScene(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9272571", new Object[]{this, str, map});
                } else {
                    rpm.b(str, map);
                }
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void endScene(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7b1e3f03", new Object[]{this, str, map});
                } else {
                    rpm.c(str, map);
                }
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void beginEvent(h hVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ca353937", new Object[]{this, hVar});
                } else if (hVar == null || hVar.getEventId() != UTEventId.SCROLL.getEventId()) {
                } else {
                    rpm.a(hVar.getLogMap());
                }
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void endEvent(h hVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63e15369", new Object[]{this, hVar});
                } else if (hVar == null || hVar.getEventId() != UTEventId.SCROLL.getEventId()) {
                } else {
                    rpm.b(hVar.getLogMap());
                }
            }

            @Override // com.ut.mini.module.trackerlistener.a
            public void sessionTimeout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17d804f2", new Object[]{this});
                    return;
                }
                rpj.b = "" + System.currentTimeMillis();
            }
        });
    }
}
