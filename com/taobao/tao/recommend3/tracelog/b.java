package com.taobao.tao.recommend3.tracelog;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.i;
import com.taobao.tao.log.TLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.oqc;
import tb.org;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_CREATE = "Home_OnCreate";
    public static final String HOME_CREATE_CONTAINER = "Home_CreateContainer";
    public static final String HOME_CREATE_VIEW = "Home_OnCreateView";
    public static final String HOME_DATA_PROCESS_TRIGGER = "Home_DataProcessTrigger";
    public static final String HOME_LAYOUT = "Home_Layout";
    public static final String HOME_MAIN_PRERENDER = "Home_Main_Prerender";
    public static final String HOME_NAVI = "Home_Navi";
    public static final String HOME_RENDER = "Home_Render";
    public static final String HOME_RESUME = "Home_OnResume";
    public static final String HOME_START = "Home_OnStart";
    public static final String HOME_SUB_PRERENDER = "Home_Sub_Prerender";
    public static final String HOME_VISIBLE = "Home_Visible";
    public static final String HOME_VISIBLE_ONLY = "Home_VisibleOnly";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, b> f20951a;
    private static final Object b;
    private String c;
    private f e;
    private Map<String, TraceModel> d = new ConcurrentHashMap();
    private AtomicBoolean f = new AtomicBoolean(false);
    private Handler g = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void a(b bVar, Map map, TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3267a7", new Object[]{bVar, map, traceModel, new Boolean(z)});
        } else {
            bVar.a(map, traceModel, z);
        }
    }

    static {
        kge.a(-598164149);
        f20951a = new ConcurrentHashMap();
        b = new Object();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f.set(z);
        }
    }

    private b(String str) {
        this.c = str;
        this.e = new f(str);
        if (!i.a()) {
            this.f.set(true);
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ca162113", new Object[0]) : a((String) null);
    }

    public static b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3d1b3789", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || StringUtils.equals(str, oqc.a().l())) {
            str = oqc.a().m();
        }
        b bVar = f20951a.get(str);
        if (bVar == null) {
            synchronized (b) {
                if (bVar == null) {
                    bVar = new b(str);
                    f20951a.put(str, bVar);
                }
            }
        }
        return bVar;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else {
            a(str, i, (Map<String, Object>) null);
        }
    }

    public void a(String str, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6e4a54", new Object[]{this, str, new Integer(i), map});
        } else {
            a(str, i, map, true);
        }
    }

    public void a(String str, int i, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35bb300", new Object[]{this, str, new Integer(i), map, new Boolean(z)});
        } else if (!c.a(b()) || !this.f.get()) {
        } else {
            if (this.d.get(str) != null) {
                TLog.loge("home", "GlobalTrace", str + " startTrace already have startModel。replace with new time, key=" + str);
                if (!z) {
                    return;
                }
            }
            TraceModel traceModel = new TraceModel(str, i, map);
            this.d.put(str, traceModel);
            a(traceModel, true);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(str, (Map<String, Object>) null);
        }
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(str, map, SystemClock.uptimeMillis());
        }
    }

    public void a(String str, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a5b411", new Object[]{this, str, map, new Long(j)});
        } else if (!c.a(b())) {
        } else {
            TraceModel remove = this.d.remove(str);
            if (remove == null) {
                TLog.loge("home", "GlobalTrace", str + " endTrace failed, no startModel");
                return;
            }
            remove.endModel(map, j);
            a(remove, false);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            a(str, 1, c.b(), SystemClock.uptimeMillis());
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            a(str, 1, c.a(), SystemClock.uptimeMillis());
        }
    }

    public void a(String str, int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fb8551", new Object[]{this, str, new Integer(i), new Long(j), new Long(j2)});
        } else if (!c.a(b())) {
        } else {
            a(new TraceModel(str, i, j, j2, true), false);
        }
    }

    private void a(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c350f7", new Object[]{this, traceModel, new Boolean(z)});
        } else if (traceModel == null) {
        } else {
            a(1, traceModel, z);
            a(3, traceModel, z);
            a(2, traceModel, z);
        }
    }

    private void a(int i, final TraceModel traceModel, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2558262a", new Object[]{this, new Integer(i), traceModel, new Boolean(z)});
            return;
        }
        final Map<String, org> a2 = this.e.a(i);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        e eVar = new e() { // from class: com.taobao.tao.recommend3.tracelog.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend3.tracelog.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    b.a(b.this, a2, traceModel, z);
                }
            }
        };
        if (i == 2) {
            eVar.run();
        } else if (i == 3) {
            this.g.post(eVar);
        } else if (!this.f.get()) {
            eVar.run();
        } else {
            com.taobao.gateway.dispatch.a.b().a(eVar);
        }
    }

    private void a(Map<String, org> map, TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9524d8ac", new Object[]{this, map, traceModel, new Boolean(z)});
            return;
        }
        for (org orgVar : map.values()) {
            if (orgVar != null) {
                orgVar.c(traceModel, z);
            }
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            com.taobao.monitor.adapter.c.a(str);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            com.taobao.monitor.adapter.c.b(str);
        }
    }
}
