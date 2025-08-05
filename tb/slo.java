package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import com.taobao.analysis.v3.FalcoSpanLayer;
import com.taobao.analysis.v3.o;
import com.taobao.analysis.v3.v;
import com.taobao.android.order.bundle.cache.a;
import com.taobao.falco.FalcoEnvironment;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.weex.ui.component.WXImage;
import java.util.List;
import java.util.Map;
import tb.nkw;

/* loaded from: classes7.dex */
public class slo extends o implements shc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String aE;
    private int ai;
    private final String as;
    private long at;
    private long au;
    private long av;
    private long aw;
    private long ax;
    private long ay;
    private long az;

    /* renamed from: a  reason: collision with root package name */
    private static final mzh f33706a = new mzh("falcoId");
    private static final mzh c = new mzh("techStack");
    private static final mzh aj = new mzh("uid");
    private static final mzh k = new mzh("fromPageName");
    private static final mzh l = new mzh("fromPageURL");
    private static final mzh m = new mzh("pageName");
    private static final mzh n = new mzh("pageURL");
    private static final mzh ak = new mzh("pageType");
    private static final mzh o = new mzh("transition");
    private static final mzh p = new mzh("topic");
    private static final mzh q = new mzh("abBucketIds");
    private static final mzh r = new mzh("isFirstLoad");
    private static final mzh s = new mzh("errorCode");
    private static final mzg t = new mzg(jvf.KEY_USER_ACTION_T);
    private static final mzg u = new mzg(IMultiTabPerformanceListener.ON_ROUTE_START);
    private static final mzg v = new mzg(IMultiTabPerformanceListener.ON_ROUTE_END);
    private static final mzg w = new mzg("pageCreateS");
    private static final mzg x = new mzg(IMultiTabPerformanceListener.ON_CONTAINER_INIT_START);
    private static final mzg y = new mzg(IMultiTabPerformanceListener.ON_CONTAINER_INIT_END);
    private static final mzg z = new mzg(IMultiTabPerformanceListener.ON_ENGINE_INIT_START);
    private static final mzg A = new mzg(IMultiTabPerformanceListener.ON_ENGINE_INIT_END);
    private static final mzg B = new mzg("pageCreateE");
    private static final mzg C = new mzg(IMultiTabPerformanceListener.ON_REQUEST_START);
    private static final mzg D = new mzg(IMultiTabPerformanceListener.ON_REQUEST_END);
    private static final mzg E = new mzg("pageReadyVisibleS");
    private static final mzg F = new mzg("pageReadyVisibleE");
    private static final mzg G = new mzg("pageReadyFirstFrameS");
    private static final mzg H = new mzg("pageReadyFirstFrameE");
    private static final mzg I = new mzg("pageFirstFrameRenderS");
    private static final mzg J = new mzg("pageFirstFrameRenderE");
    private static final mzg K = new mzg("bizDisplayT");
    private static final mzg L = new mzg("displayT");
    private static final mzg M = new mzg("fcp");
    private static final mzg N = new mzg("fmp");
    private static final mzg O = new mzg(nfc.PHA_MONITOR_MEASURE_FSP);
    private static final mzg P = new mzg("tti");
    private static final mzh Q = new mzh("containerColdLaunch");
    private static final mzh R = new mzh("renderType");
    private static final mzh S = new mzh("hitSnapshot");
    private static final mzh T = new mzh("kernelType");
    private static final mzh U = new mzh("containerAppId");
    private static final mzh al = new mzh("isHitCache");
    private static final mzg aC = new mzg("leaveTime");
    private static final mzh aD = new mzh("leaveType");
    private static final mzh V = new mzh("netType");
    private static final mzg W = new mzg("launchStart");
    private static final mzh X = new mzh("deviceLevel");
    private static final mzh Y = new mzh("startType");
    private static final mzh Z = new mzh("afcId");
    private static final mzg aa = new mzg("processId");
    private static final mzg ab = new mzg("processType");
    private static final mzg ac = new mzg("processStart");
    private static final mze ad = new mze("lowPowerMode");
    private static final mzh b = new mzh("envFalcoId");
    private static final mzh am = new mzh("installation");
    private static final mze an = new mze("launchStatus");
    private static final mze ao = new mze("temperature");
    private static final mzh ap = new mzh("launchType");
    private static final mzh aq = new mzh(p.KEY_DEVICE_TYPE);
    private static final mzh ar = new mzh("afcType");
    private static final mzh aA = new mzh(WXImage.ERRORDESC);
    private static final mzh aB = new mzh("errorSignal");
    private static final mzg ae = new mzg("tapResponse");
    private static final mzg af = new mzg("bizFirstScreen");
    private static final mzg ag = new mzg(a.SCENE_FIRSTSCREEN);
    private static final mzg ah = new mzg(pqe.STAGE_INTERACTIVE);

    public static /* synthetic */ Object ipc$super(slo sloVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 764027430) {
            super.a(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode != 1848324648) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.a((mzi<mzi>) objArr[0], (mzi) objArr[1]);
        }
    }

    @Override // com.taobao.analysis.v3.o
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public slo(v vVar, String str, String str2, long j, Map<String, Object> map, List<mzp> list) {
        super(vVar, str, str2, j, map, list, FalcoSpanLayer.LOAD_ACTION);
        this.at = -1L;
        this.au = -1L;
        this.av = -1L;
        this.aw = -1L;
        this.ax = -1L;
        this.ay = -1L;
        this.az = -1L;
        a(Long.valueOf(j));
        b((mzi<mzh>) c, (mzh) "native");
        b((mzi<mzh>) aj, (mzh) tmt.b());
        this.as = tmt.a();
        b((mzi<mzh>) f33706a, (mzh) this.as);
    }

    public void a(quo quoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc0cc02d", new Object[]{this, quoVar});
            return;
        }
        FalcoEnvironment a2 = FalcoEnvironment.a();
        if (a2 != null) {
            String b2 = a2.b();
            if (!TextUtils.isEmpty(b2)) {
                sgw l2 = a2.l();
                iwb d = a2.d();
                shb e = a2.e();
                tis c2 = a2.c();
                tcc g = a2.g();
                qri f = a2.f();
                b((mzi<mzh>) b, (mzh) b2);
                b((mzi<mzh>) ar, (mzh) c2.b);
                b((mzi<mzg>) ac, (mzg) Long.valueOf(d.c));
                b((mzi<mzg>) W, (mzg) Long.valueOf(e.b));
                b((mzi<mzh>) ap, (mzh) e.f33577a);
                b((mzi<mzh>) am, (mzh) e.d);
                b((mzi<mze>) an, (mze) Integer.valueOf(e.f));
                b((mzi<mze>) ad, (mze) Integer.valueOf(f.c));
                b((mzi<mze>) ao, (mze) Integer.valueOf(f.d));
                b((mzi<mzh>) V, (mzh) g.f34017a);
                b((mzi<mzh>) X, (mzh) l2.b);
                b((mzi<mzh>) aq, (mzh) l2.f33565a);
                return;
            }
        }
        b((mzi<mzh>) V, (mzh) quoVar.a());
        b((mzi<mzg>) W, (mzg) Long.valueOf(quoVar.b()));
        b((mzi<mzh>) X, (mzh) quoVar.c());
        b((mzi<mzh>) Y, (mzh) quoVar.d());
        b((mzi<mzh>) Z, (mzh) quoVar.h());
        b((mzi<mzg>) aa, (mzg) Long.valueOf(quoVar.e()));
        b((mzi<mzg>) ab, (mzg) Long.valueOf(quoVar.f()));
        b((mzi<mzg>) ac, (mzg) Long.valueOf(quoVar.g()));
        b((mzi<mze>) ad, (mze) Integer.valueOf(quoVar.i() ? 1 : 0));
    }

    @Override // tb.shc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.as;
    }

    @Override // tb.shc
    public void g_(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e39569", new Object[]{this, str});
        } else {
            b((mzi<mzh>) c, (mzh) str);
        }
    }

    @Override // tb.shc
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            b((mzi<mzh>) k, (mzh) str);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else {
            b((mzi<mzh>) l, (mzh) a(str, 512));
        }
    }

    @Override // tb.shc
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else {
            b((mzi<mzh>) m, (mzh) str);
        }
    }

    @Override // tb.shc
    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
        } else {
            b((mzi<mzh>) n, (mzh) a(str, 512));
        }
    }

    @Override // tb.shc
    public void h_(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe52448", new Object[]{this, str});
        } else {
            b((mzi<mzh>) o, (mzh) str);
        }
    }

    public void i_(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe6b327", new Object[]{this, str});
        } else {
            b((mzi<mzh>) s, (mzh) str);
        }
    }

    @Override // tb.shc
    public void a(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l2});
            return;
        }
        this.at = i(l2);
        b((mzi<mzg>) t, (mzg) Long.valueOf(this.at));
    }

    @Override // tb.shc
    public void b(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6fca28", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) u, (mzg) Long.valueOf(i(l2)));
        }
    }

    @Override // tb.shc
    public void c(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7808bfa9", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) v, (mzg) Long.valueOf(i(l2)));
        }
    }

    @Override // tb.shc
    public void d(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a1b52a", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) w, (mzg) Long.valueOf(i(l2)));
        }
    }

    @Override // tb.shc
    public void j(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0377630", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) x, (mzg) Long.valueOf(i(l2)));
        }
    }

    @Override // tb.shc
    public void a_(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e509fe4", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) z, (mzg) Long.valueOf(i(l2)));
        }
    }

    @Override // tb.shc
    public void n(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b4c34", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) A, (mzg) Long.valueOf(i(l2)));
        }
    }

    @Override // tb.shc
    public void o(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3441b5", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) y, (mzg) Long.valueOf(i(l2)));
        }
    }

    @Override // tb.shc
    public void e(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913aaaab", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) B, (mzg) Long.valueOf(i(l2)));
        }
    }

    @Override // tb.shc
    public void p(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcd3736", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) C, (mzg) Long.valueOf(i(l2)));
        }
    }

    @Override // tb.shc
    public void q(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28662cb7", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) D, (mzg) Long.valueOf(i(l2)));
        }
    }

    public void f(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd3a02c", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) G, (mzg) Long.valueOf(i(l2)));
        }
    }

    public void g(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6c95ad", new Object[]{this, l2});
        } else {
            b((mzi<mzg>) I, (mzg) Long.valueOf(i(l2)));
        }
    }

    public void h(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7058b2e", new Object[]{this, l2});
            return;
        }
        this.au = i(l2);
        b((mzi<mzg>) J, (mzg) Long.valueOf(this.au));
        long j = this.at;
        if (j < 0) {
            return;
        }
        long j2 = this.au - j;
        b((mzi<mzg>) ae, (mzg) Long.valueOf(j2));
        a(j2);
    }

    @Override // tb.shc
    public void c_(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5c1522", new Object[]{this, l2});
            return;
        }
        this.aw = i(l2);
        b((mzi<mzg>) K, (mzg) Long.valueOf(this.aw));
    }

    public void l(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9696132", new Object[]{this, l2});
            return;
        }
        this.av = i(l2);
        b((mzi<mzg>) L, (mzg) Long.valueOf(this.av));
    }

    @Override // tb.shc
    public void r(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ff2238", new Object[]{this, l2});
            return;
        }
        this.az = k(l2);
        b((mzi<mzg>) M, (mzg) Long.valueOf(this.az - k()));
    }

    @Override // tb.shc
    public void s(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419817b9", new Object[]{this, l2});
            return;
        }
        this.ay = k(l2);
        b((mzi<mzg>) O, (mzg) Long.valueOf(this.ay - k()));
    }

    public void m(Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60256b3", new Object[]{this, l2});
            return;
        }
        this.ax = i(l2);
        b((mzi<mzg>) P, (mzg) Long.valueOf(this.ax));
    }

    @Override // tb.shc
    public void j_(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e84206", new Object[]{this, str});
        } else {
            b((mzi<mzh>) p, (mzh) str);
        }
    }

    @Override // tb.shc
    public void c(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z2)});
        } else {
            b((mzi<mzh>) Q, (mzh) (z2 ? "1" : "0"));
        }
    }

    @Override // tb.shc
    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b147f", new Object[]{this, str});
        } else {
            b((mzi<mzh>) R, (mzh) str);
        }
    }

    @Override // tb.shc
    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25cadc0", new Object[]{this, str});
        } else {
            b((mzi<mzh>) T, (mzh) str);
        }
    }

    @Override // tb.shc
    public void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
        } else {
            b((mzi<mzh>) r, (mzh) (z2 ? "1" : "0"));
        }
    }

    @Override // tb.shc
    public void b(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z2)});
        } else {
            b((mzi<mzh>) al, (mzh) (z2 ? "1" : "0"));
        }
    }

    @Override // tb.shc
    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e4701", new Object[]{this, str});
        } else {
            b((mzi<mzh>) U, (mzh) str);
        }
    }

    @Override // tb.shc
    public void a(shc shcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb9cb6a", new Object[]{this, shcVar});
            return;
        }
        this.d = shcVar.k();
        Map<String, ?> j = shcVar.j();
        if (j.isEmpty()) {
            return;
        }
        j((String) j.get(k.a()));
        k((String) j.get(l.a()));
        l((String) j.get(m.a()));
        m((String) j.get(n.a()));
        h_((String) j.get(o.a()));
        j_((String) j.get(p.a()));
        i_((String) j.get(s.a()));
        a("1".equals(j.get(r.a())));
        b("1".equals(j.get(al.a())));
        g_((String) j.get(c.a()));
        if (j.containsKey(t.a())) {
            this.at = ((Long) j.get(t.a())).longValue();
            b((mzi<mzg>) t, (mzg) Long.valueOf(this.at));
        }
        mzg mzgVar = u;
        b((mzi<mzg>) mzgVar, (mzg) ((Long) j.get(mzgVar.a())));
        mzg mzgVar2 = v;
        b((mzi<mzg>) mzgVar2, (mzg) ((Long) j.get(mzgVar2.a())));
        mzg mzgVar3 = w;
        b((mzi<mzg>) mzgVar3, (mzg) ((Long) j.get(mzgVar3.a())));
        mzg mzgVar4 = B;
        b((mzi<mzg>) mzgVar4, (mzg) ((Long) j.get(mzgVar4.a())));
        mzg mzgVar5 = E;
        b((mzi<mzg>) mzgVar5, (mzg) ((Long) j.get(mzgVar5.a())));
        mzg mzgVar6 = F;
        b((mzi<mzg>) mzgVar6, (mzg) ((Long) j.get(mzgVar6.a())));
        mzg mzgVar7 = G;
        b((mzi<mzg>) mzgVar7, (mzg) ((Long) j.get(mzgVar7.a())));
        mzg mzgVar8 = H;
        b((mzi<mzg>) mzgVar8, (mzg) ((Long) j.get(mzgVar8.a())));
        mzg mzgVar9 = I;
        b((mzi<mzg>) mzgVar9, (mzg) ((Long) j.get(mzgVar9.a())));
        if (!j.containsKey(J.a())) {
            return;
        }
        this.au = ((Long) j.get(J.a())).longValue();
        b((mzi<mzg>) J, (mzg) Long.valueOf(this.au));
    }

    @Override // com.taobao.analysis.v3.o
    public void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
            return;
        }
        long j2 = this.aw;
        if (j2 >= 0) {
            long j3 = this.au;
            if (j3 >= 0) {
                b((mzi<mzg>) af, (mzg) Long.valueOf(j2 - j3));
            }
        }
        long j4 = this.av;
        if (j4 >= 0) {
            long j5 = this.au;
            if (j5 >= 0) {
                b((mzi<mzg>) ag, (mzg) Long.valueOf(j4 - j5));
            }
        }
        long j6 = this.ax;
        if (j6 >= 0) {
            long j7 = this.av;
            if (j7 >= 0) {
                b((mzi<mzg>) ah, (mzg) Long.valueOf(j6 - j7));
            }
        }
        b((mzi<mzg>) aC, (mzg) Long.valueOf(j));
        nkw.b b2 = nkw.b();
        if (b2 != null) {
            b((mzi<mzh>) s, (mzh) b2.a());
            b((mzi<mzh>) aA, (mzh) b2.b());
            b((mzi<mzh>) aB, (mzh) String.valueOf(b2.c()));
        }
        super.a(j, str);
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f17983", new Object[]{this, str});
            return;
        }
        this.aE = str;
        b((mzi<mzh>) aD, (mzh) str);
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.aE);
    }

    @Override // com.taobao.analysis.v3.o, tb.mzm, tb.myr
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            a(j, "succeed");
        }
    }

    @Override // com.taobao.analysis.v3.o, com.taobao.analysis.v3.n
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(n(), str);
        }
    }

    @Override // com.taobao.analysis.v3.o, tb.mzm, tb.myr
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b(n());
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : j().containsKey(w.a());
    }

    private long i(Long l2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c39e80a3", new Object[]{this, l2})).longValue() : k(l2) - k();
    }

    private String a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i)}) : (str == null || str.length() <= i) ? str : str.substring(0, i);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.ai = i;
        }
    }

    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.ai;
    }

    @Override // tb.mzm
    public synchronized <T> myr a(mzi<T> mziVar, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("6e2b3228", new Object[]{this, mziVar, t2});
        }
        return this;
    }

    @Override // tb.mzm, tb.myr
    public synchronized myr a(String str, Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("b8ea1b3c", new Object[]{this, str, number});
        }
        return this;
    }

    @Override // tb.mzm, tb.myr
    public synchronized myr a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("953d4604", new Object[]{this, str, str2});
        }
        return this;
    }

    @Override // tb.mzm, tb.myr
    public synchronized myr a(String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("5f2fe7de", new Object[]{this, str, new Boolean(z2)});
        }
        return this;
    }

    private <T> void b(mzi<T> mziVar, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274c0a19", new Object[]{this, mziVar, t2});
        } else {
            super.a((mzi<mzi<T>>) mziVar, (mzi<T>) t2);
        }
    }

    @Override // tb.shc
    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bfe042", new Object[]{this, str});
        } else {
            b((mzi<mzh>) ak, (mzh) str);
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        a("pageName=" + i(m.a()) + ",falcoId=" + a() + ",tapResponse=" + j);
    }
}
