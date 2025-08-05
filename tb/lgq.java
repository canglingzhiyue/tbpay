package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.homepage.utils.n;
import com.taobao.performance.l;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.topmultitab.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class lgq implements IMultiTabPerformanceListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNDER_LINE = "_";
    private final i b;

    /* renamed from: a  reason: collision with root package name */
    private l f30578a = null;
    private final Map<String, l> c = new ConcurrentHashMap();
    private long d = 0;
    private String e = "";
    private long f = 0;

    static {
        kge.a(1000801499);
        kge.a(-8762410);
    }

    public lgq(i iVar) {
        this.b = iVar;
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
        } else if (TextUtils.equals(str2, IMultiTabPerformanceListener.TAB_SCROLL_SELECT)) {
        } else {
            this.f30578a = d(str);
            if (!e("onPageCreateStart")) {
                return;
            }
            this.f30578a.c(j);
            this.f30578a.d(j);
            this.f30578a.a(true);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void b(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1863f3b", new Object[]{this, str, new Long(j), str2});
        } else if (TextUtils.equals(str2, IMultiTabPerformanceListener.TAB_SCROLL_SELECT)) {
        } else {
            this.f30578a = d(str);
            if (!e("onPageCreateEnd")) {
                return;
            }
            this.f30578a.e(j);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
            g.a("MultiTabPerformance", "MultiTabPerformance onRenderState ApmBuilder or stage null");
        } else if (!e("onRenderState")) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1258252939:
                    if (str.equals(IMultiTabPerformanceListener.ON_REQUEST_END)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1258252925:
                    if (str.equals(IMultiTabPerformanceListener.ON_REQUEST_START)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1030542692:
                    if (str.equals(IMultiTabPerformanceListener.ON_FCP_END)) {
                        c = 4;
                        break;
                    }
                    break;
                case 114956972:
                    if (str.equals(IMultiTabPerformanceListener.ON_FSP_END)) {
                        c = 5;
                        break;
                    }
                    break;
                case 835168564:
                    if (str.equals(IMultiTabPerformanceListener.ON_CONTAINER_INIT_END)) {
                        c = 1;
                        break;
                    }
                    break;
                case 835168578:
                    if (str.equals(IMultiTabPerformanceListener.ON_CONTAINER_INIT_START)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f30578a.f(j);
            } else if (c == 1) {
                this.f30578a.g(j);
            } else if (c == 2) {
                this.f30578a.h(j);
            } else if (c == 3) {
                this.f30578a.i(j);
            } else if (c == 4) {
                this.f30578a.j(j);
            } else if (c != 5) {
            } else {
                this.f30578a.k(j);
            }
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!e("setTechStack")) {
        } else {
            String b = this.b.b(i);
            if (TextUtils.isEmpty(b)) {
                g.a("MultiTabPerformance", "MultiTabPerformance setTechStack containerType null position:" + i);
                return;
            }
            char c = 65535;
            switch (b.hashCode()) {
                case -139919088:
                    if (b.equals("campaign")) {
                        c = 4;
                        break;
                    }
                    break;
                case 179717709:
                    if (b.equals(syc.DX_CONTAINER)) {
                        c = 3;
                        break;
                    }
                    break;
                case 514841930:
                    if (b.equals("subscribe")) {
                        c = 1;
                        break;
                    }
                    break;
                case 989204668:
                    if (b.equals("recommend")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1463130501:
                    if (b.equals(c.HOME_TAB_ID_HOUR_DELIVERY)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0 || c == 1 || c == 2 || c == 3) {
                b = "native";
            } else if (c == 4) {
                b = "h5";
            }
            this.f30578a.a(b);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!e("setTransition")) {
        } else {
            this.f30578a.d(str);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!e("setTopic")) {
        } else {
            this.f30578a.e(str);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            if (!e("setAbExperiment")) {
            }
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!e("setIsHitCache")) {
        } else {
            this.f30578a.b(z);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.f30578a = d(str);
        if (!e("onTabSelect")) {
            return;
        }
        g.a("MultiTabPerformance", "MultiTabPerformance onTabSelect tabId:" + str + ",position:" + i + ",span:" + this.f30578a.b());
        l lVar = this.f30578a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i);
        lVar.c(sb.toString());
        a(com.taobao.performance.g.MULTI_TAB_OPT, b());
        a(i);
        c();
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{this, str, new Integer(i)});
            return;
        }
        c(str, i);
        Map<String, l> map = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i);
        g.a("MultiTabPerformance", "MultiTabPerformance onTabUnSelect tabId:" + str + ",position:" + i);
        a(map.get(sb.toString()));
    }

    private void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926cacf", new Object[]{this, str, new Integer(i)});
        } else if (n.n().e()) {
            l lVar = this.f30578a;
            lVar.b(str + "_" + i);
        } else {
            if (this.d == 0) {
                this.d = System.currentTimeMillis();
            }
            if (this.f == 0) {
                this.f = this.d;
                try {
                    this.f = FalcoGlobalTracer.get().l().k();
                } catch (Exception e) {
                    g.a("MultiTabPerformance", "MultiTabPerformance labelOnTabUnSelect touchStartTime get error:", e);
                }
            }
            if (!TextUtils.isEmpty(this.e)) {
                return;
            }
            this.e = str + "_" + i;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (n.n().e()) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                currentTimeMillis = FalcoGlobalTracer.get().l().k();
            } catch (Exception e) {
                g.a("MultiTabPerformance", "MultiTabPerformance labelOnTabSelect touchStartTime get error:", e);
            }
            this.f30578a.a(currentTimeMillis);
            this.f30578a.b(currentTimeMillis);
        } else {
            this.f30578a.a(this.f);
            this.f30578a.b(this.d);
            this.f30578a.b(this.e);
            this.f = 0L;
            this.d = 0L;
            this.e = "";
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        g.a("MultiTabPerformance", "MultiTabPerformance onStop commit:");
        a(this.f30578a);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : n.n().i();
    }

    @Override // com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener
    public shc c(String str) {
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shc) ipChange.ipc$dispatch("7dce7e64", new Object[]{this, str});
        }
        if (!e("getSpan") || (lVar = this.c.get(str)) == null) {
            return null;
        }
        return lVar.b();
    }

    private l d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("e51b12f6", new Object[]{this, str});
        }
        int a2 = this.b.a(str);
        Map<String, l> map = this.c;
        l lVar = map.get(str + "_" + a2);
        if (lVar == null) {
            lVar = new l();
        }
        Map<String, l> map2 = this.c;
        map2.put(str + "_" + a2, lVar);
        return lVar;
    }

    private void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff6811d", new Object[]{this, lVar});
        } else if (lVar == null) {
            g.a("MultiTabPerformance", "MultiTabPerformance commit apmPerfMonitor null:");
        } else {
            g.a("MultiTabPerformance", "MultiTabPerformance commit span:" + lVar.b());
            lVar.a();
            for (Map.Entry<String, l> entry : this.c.entrySet()) {
                if (entry.getValue() == lVar) {
                    this.c.remove(entry.getKey());
                }
            }
        }
    }

    private boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        if (this.f30578a != null) {
            return true;
        }
        g.a("MultiTabPerformance", "MultiTabPerformance " + str + "-> checkApmMonitorAvailable mCurrentApmPerfMonitor null");
        return false;
    }
}
