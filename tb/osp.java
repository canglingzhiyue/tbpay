package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.gateway.datastructure.a;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.gateway.msgcenter.b;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.megaadaptivekit.gesture.a;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.d;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdContainerMsg;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdGatewayMsg;
import com.taobao.tao.recommend3.gateway.request.c;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.k;
import com.taobao.tao.recommend4.recyclerview.m;
import com.taobao.tao.recommend4.recyclerview.p;
import com.taobao.tao.util.DensityUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.oot;
import tb.osm;
import tb.oso;

/* loaded from: classes8.dex */
public class osp implements osm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_INFO = "apiInfo";
    public static final int DEFAULT_COLUMN_COUNT = 2;
    public static final String NATIVE_CUSTOM_PARAMS = "nativeCustomParams";
    public static final String RMD_CONTAINER = "rmd_container";

    /* renamed from: a  reason: collision with root package name */
    public static a f32364a;
    public static a b;
    public static a c;
    public static a d;
    private static gkj w;
    private final oti A;
    private final syf B;
    private final osl D;
    private View.OnAttachStateChangeListener E;
    private final otg F;
    private int I;
    private DinamicXEngine N;
    private OnScreenChangedListener O;
    private boolean P;
    private boolean Q;
    private JSONObject R;
    private boolean S;
    private int T;
    private boolean U;
    private boolean V;
    private HomeChildRecyclerView.a W;
    private com.taobao.android.megaadaptivekit.gesture.a X;
    private WeakReference<Context> f;
    private ksk g;
    private JSONObject h;
    private osc i;
    private m j;
    private String k;
    private p l;
    private osg m;
    private gjv r;
    private ope s;
    private c t;
    private b u;
    private JSONObject v;
    private ksn x;
    private boolean y;
    private final osr z;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private final int q = -1;
    public oso e = null;
    private int G = 0;
    private int H = 0;
    private final int C = 3;
    private String Y = null;
    private final int Z = 8;
    private final int aa = -1;
    private int J = 0;
    private RecyclerView.OnScrollListener K = new RecyclerView.OnScrollListener() { // from class: tb.osp.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
            if (str.hashCode() == 806944192) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            osp ospVar = osp.this;
            osp.a(ospVar, osp.o(ospVar) + i2);
            if (osp.o(osp.this) <= osp.p(osp.this).a(kst.a(osp.d(osp.this)), 0)) {
                return;
            }
            osp.h(osp.this);
            if (jqm.a()) {
                e.b("jimbo", "request net data because scroll instance is " + osp.o(osp.this));
            }
            osp.q(osp.this);
        }
    };
    private View.OnAttachStateChangeListener L = new View.OnAttachStateChangeListener() { // from class: tb.osp.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            if (!osp.r(osp.this)) {
                osp.h(osp.this);
            }
            osp.q(osp.this);
        }
    };
    private oot.a M = new oot.a() { // from class: tb.osp.8
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.oot.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (!TextUtils.equals(str, osp.d(osp.this).f30287a)) {
            } else {
                com.taobao.android.ai.b.a().d();
            }
        }
    };

    /* renamed from: tb.osp$12  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass12 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32368a = new int[WindowType.values().length];

        static {
            try {
                f32368a[WindowType.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32368a[WindowType.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32368a[WindowType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32368a[WindowType.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32368a[WindowType.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : "recommend_home_main";
    }

    public static /* synthetic */ int a(osp ospVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1863a82a", new Object[]{ospVar, new Integer(i)})).intValue();
        }
        ospVar.J = i;
        return i;
    }

    public static /* synthetic */ boolean a(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f8875450", new Object[]{ospVar})).booleanValue() : ospVar.Q;
    }

    public static /* synthetic */ boolean a(osp ospVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1863e80c", new Object[]{ospVar, new Boolean(z)})).booleanValue();
        }
        ospVar.Q = z;
        return z;
    }

    public static /* synthetic */ void b(osp ospVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70a5acd", new Object[]{ospVar});
        } else {
            ospVar.O();
        }
    }

    public static /* synthetic */ void b(osp ospVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4171d6", new Object[]{ospVar, new Integer(i)});
        } else {
            ospVar.b(i);
        }
    }

    public static /* synthetic */ void b(osp ospVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa41b1a7", new Object[]{ospVar, new Boolean(z)});
        } else {
            ospVar.b(z);
        }
    }

    public static /* synthetic */ osc c(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osc) ipChange.ipc$dispatch("cdfbb259", new Object[]{ospVar}) : ospVar.i;
    }

    public static /* synthetic */ boolean c(osp ospVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc1f7b4a", new Object[]{ospVar, new Boolean(z)})).booleanValue();
        }
        ospVar.o = z;
        return z;
    }

    public static /* synthetic */ ksk d(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ksk) ipChange.ipc$dispatch("b59bb834", new Object[]{ospVar}) : ospVar.g;
    }

    public static /* synthetic */ void d(osp ospVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfd44e5", new Object[]{ospVar, new Boolean(z)});
        } else {
            ospVar.c(z);
        }
    }

    public static /* synthetic */ boolean e(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2936e54", new Object[]{ospVar})).booleanValue() : ospVar.n;
    }

    public static /* synthetic */ boolean e(osp ospVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdb0e88", new Object[]{ospVar, new Boolean(z)})).booleanValue();
        }
        ospVar.P = z;
        return z;
    }

    public static /* synthetic */ boolean f(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a11674d5", new Object[]{ospVar})).booleanValue() : ospVar.o;
    }

    public static /* synthetic */ void g(osp ospVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f997b52", new Object[]{ospVar});
        } else {
            ospVar.u();
        }
    }

    public static /* synthetic */ void h(osp ospVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1c81d3", new Object[]{ospVar});
        } else {
            ospVar.dk_();
        }
    }

    public static /* synthetic */ boolean i(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c9f8858", new Object[]{ospVar})).booleanValue() : ospVar.V;
    }

    public static /* synthetic */ m j(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("2edd69f7", new Object[]{ospVar}) : ospVar.j;
    }

    public static /* synthetic */ int k(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49a59549", new Object[]{ospVar})).intValue() : ospVar.L();
    }

    public static /* synthetic */ com.taobao.android.megaadaptivekit.gesture.a l(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.megaadaptivekit.gesture.a) ipChange.ipc$dispatch("7c8c44a7", new Object[]{ospVar}) : ospVar.X;
    }

    public static /* synthetic */ boolean m(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26aba25c", new Object[]{ospVar})).booleanValue() : ospVar.P;
    }

    public static /* synthetic */ void n(osp ospVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152ea8d9", new Object[]{ospVar});
        } else {
            ospVar.G();
        }
    }

    public static /* synthetic */ int o(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b1af4d", new Object[]{ospVar})).intValue() : ospVar.J;
    }

    public static /* synthetic */ osg p(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osg) ipChange.ipc$dispatch("913395a8", new Object[]{ospVar}) : ospVar.m;
    }

    public static /* synthetic */ void q(osp ospVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7bc5c", new Object[]{ospVar});
        } else {
            ospVar.v();
        }
    }

    public static /* synthetic */ boolean r(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf3ac2e1", new Object[]{ospVar})).booleanValue() : ospVar.p;
    }

    public static /* synthetic */ otg s(osp ospVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (otg) ipChange.ipc$dispatch("48191c86", new Object[]{ospVar}) : ospVar.F;
    }

    static {
        kge.a(-850390902);
        kge.a(1998584065);
        kge.a(1577330053);
        f32364a = new a(e());
        b = new a(e() + ".error");
        c = new a(e() + ".loading");
        d = new a(e() + ".*.overlay");
    }

    public static osp a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osp) ipChange.ipc$dispatch("5c346f65", new Object[]{kskVar});
        }
        if (kskVar == null) {
            return null;
        }
        com.taobao.tao.linklog.a.a("scaleScene", "RecommendManagerImpl", "gateway2.0 type : " + kskVar.f30287a);
        return new osp(kskVar);
    }

    public static osp a(ksk kskVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osp) ipChange.ipc$dispatch("f7f5e99b", new Object[]{kskVar, str});
        }
        if (kskVar == null) {
            return null;
        }
        if (TextUtils.equals("tmallhk_ds_native_taobao", str)) {
            return new osp(ksk.REC_DIRECT_SALE_CART);
        }
        return new osp(kskVar);
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            opq.a(map);
        }
    }

    public void a(osc oscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8816b79", new Object[]{this, oscVar});
        } else {
            this.i = oscVar;
        }
    }

    public RecyclerView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3fe22864", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        this.f = new WeakReference<>(context);
        this.j = m.a(this);
        this.j.a(this.z);
        this.j.a(this.I);
        if (this.S) {
            this.j.c(this.T);
        }
        k exposureListener = this.j.f20997a.getExposureListener();
        if (exposureListener != null) {
            exposureListener.a(A());
        }
        this.e = new oso(this.g, this.j.f20997a, this.z);
        this.e.a(new oso.a() { // from class: tb.osp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.oso.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (!z) {
                } else {
                    boolean o = osp.this.o();
                    if (osp.a(osp.this) != o) {
                        osp.a(osp.this, o);
                        osp.this.n().b().a(o, o && com.taobao.homepage.utils.b.d());
                        osp.b(osp.this, o);
                        e.e("RecommendManagerImpl", "hud screen status changed: " + o);
                    }
                    osp.b(osp.this);
                    e.e("RecommendManagerImpl", "current is hud screen: " + o);
                }
            }

            @Override // tb.oso.a
            public void a(boolean z, boolean z2, boolean z3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("271102ec", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
                    return;
                }
                if (osp.c(osp.this) != null) {
                    try {
                        if (osp.c(osp.this) instanceof osb) {
                            ((osb) osp.c(osp.this)).a(z2);
                        }
                        if (!Boolean.parseBoolean(otj.a(osp.d(osp.this).f30287a, "isNextPageToDeltaRefresh", "true"))) {
                            osp.c(osp.this).a();
                        } else if (z) {
                            osp.c(osp.this).a();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (osp.e(osp.this) && osp.f(osp.this) && z2) {
                    osp.g(osp.this);
                }
                osp.c(osp.this, false);
            }

            @Override // tb.oso.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (osp.c(osp.this) != null) {
                    try {
                        osp.c(osp.this).b();
                    } catch (Throwable unused) {
                    }
                }
                if (osp.f(osp.this)) {
                    osp.h(osp.this);
                    if (jqm.a()) {
                        e.b("jimbo", "request cache failed, so request net");
                    }
                }
                osp.c(osp.this, false);
            }
        });
        d.b(this.g.f30287a).a(this.e.a(), this.e);
        this.j.a(z());
        this.z.b();
        w();
        n().a((Activity) context);
        D();
        if (this.S) {
            b(context);
        }
        return this.j.f20997a;
    }

    private void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!this.V) {
        } else {
            this.X = new com.taobao.android.megaadaptivekit.gesture.a(context);
            this.X.a(new com.taobao.android.megaadaptivekit.gesture.b() { // from class: tb.osp.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.megaadaptivekit.gesture.b
                public void a(ScaleGestureDetector scaleGestureDetector) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("adc0528a", new Object[]{this, scaleGestureDetector});
                    } else {
                        e.e("RecommendManagerImpl", "ScaleGestureDetector onScale");
                    }
                }

                @Override // com.taobao.android.megaadaptivekit.gesture.b
                public void a(a.C0547a c0547a) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2fe0a1d3", new Object[]{this, c0547a});
                    } else if (!osp.a(osp.this) || !osp.i(osp.this) || osp.j(osp.this) == null) {
                    } else {
                        if (osp.k(osp.this) != osp.j(osp.this).g()) {
                            osp ospVar = osp.this;
                            osp.d(ospVar, osp.a(ospVar));
                        }
                        e.e("RecommendManagerImpl", "ScaleGestureDetector onChange: " + c0547a);
                    }
                }
            });
            this.X.a(new com.taobao.android.megaadaptivekit.gesture.c() { // from class: tb.osp.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.megaadaptivekit.gesture.c
                public WindowType a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (WindowType) ipChange2.ipc$dispatch("7f2471e7", new Object[]{this});
                    }
                    if (!(context instanceof Activity)) {
                        return WindowType.MEDIUM;
                    }
                    return h.a().b((Activity) context);
                }

                @Override // com.taobao.android.megaadaptivekit.gesture.c
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : com.taobao.homepage.utils.b.c() && !com.taobao.homepage.utils.b.b(context);
                }
            });
            if (this.j == null) {
                return;
            }
            if (this.W == null) {
                this.W = new HomeChildRecyclerView.a() { // from class: tb.osp.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView.a
                    public void a(MotionEvent motionEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                        } else if (!osp.a(osp.this)) {
                        } else {
                            osp.l(osp.this).a(motionEvent);
                        }
                    }
                };
            }
            this.j.a(this.W);
        }
    }

    private void K() {
        HomeChildRecyclerView.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        com.taobao.android.megaadaptivekit.gesture.a aVar2 = this.X;
        if (aVar2 != null) {
            aVar2.a();
        }
        m mVar = this.j;
        if (mVar == null || (aVar = this.W) == null) {
            return;
        }
        mVar.b(aVar);
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        this.h = jSONObject;
        if (this.h == null) {
            this.h = new JSONObject();
        }
        if (osf.b(this)) {
            this.h.put("isNeedSubSelectionData", (Object) true);
        } else {
            this.h.put("isNeedSubSelectionData", (Object) false);
        }
        this.k = "manualRequest";
        this.s.a(this.g.f30287a, this.k);
        if (this.g.f30287a.contains(OrderBizCode.orderList) && tif.c().booleanValue() && tif.f().booleanValue()) {
            if (jSONObject != null && jSONObject.containsKey("orderIdsStr")) {
                String string = jSONObject.getString("orderIdsStr");
                if (string != null && !string.trim().isEmpty()) {
                    String[] split = string.split(",");
                    if (split.length < 3) {
                        a(Integer.valueOf(split.length));
                        return;
                    }
                }
            } else {
                a((Integer) 0);
                return;
            }
        }
        if (this.n && !this.y) {
            bT_();
            return;
        }
        this.y = false;
        dk_();
    }

    @Override // tb.osm
    public void a(kso ksoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d23ef9f", new Object[]{this, ksoVar, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.h;
        if (jSONObject2 == null) {
            return;
        }
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        this.o = false;
        this.p = true;
        JSONObject l = l();
        l.put("forceRequest", "true");
        l.put(NATIVE_CUSTOM_PARAMS, (Object) ksoVar);
        opb.a("ViewClick", f32364a, this.v, -1, l);
    }

    @Override // tb.osm
    public ksn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ksn) ipChange.ipc$dispatch("16b8ab37", new Object[]{this}) : this.x;
    }

    public void a(ksn ksnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297c1c1e", new Object[]{this, ksnVar, jSONObject});
            return;
        }
        if (ksnVar != null && !ksnVar.c()) {
            this.x = ksnVar;
        } else {
            this.x = null;
        }
        c(jSONObject);
    }

    private JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("48d58e13", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = this.h;
        if (jSONObject3 != null) {
            jSONObject2.putAll(jSONObject3);
            jSONObject.put("bizParam", (Object) jSONObject2);
        }
        if (com.alibaba.ability.localization.b.c()) {
            this.x = com.taobao.oversea.theme.a.a();
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append("海外多语言问海外要对应的api,api是: ");
            ksn ksnVar = this.x;
            sb.append(ksnVar != null ? ksnVar.a() : "");
            strArr[0] = sb.toString();
            e.e("RecommendManagerImpl", strArr);
        }
        ksn ksnVar2 = this.x;
        if (ksnVar2 != null && !ksnVar2.c()) {
            jSONObject.put("apiInfo", (Object) this.x);
        }
        return jSONObject;
    }

    @Override // tb.osm
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        r();
        opb.a("ViewClick", b, this.v, -1, l());
    }

    @Override // tb.osm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        r();
        opb.a("ViewAppear", c, this.v, -1, l());
    }

    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (this.s.j(this.g.f30287a)) {
            this.y = true;
            c(this.h);
        } else if (!osf.a(this)) {
        } else {
            r();
            opb.a("PageBack", f32364a, this.v, -1, l());
            otg otgVar = this.F;
            if (otgVar == null) {
                return;
            }
            otgVar.d();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("setBottomOffset : ");
        sb.append(i);
        sb.append(", wrapper is null ? ");
        if (this.j != null) {
            z = false;
        }
        sb.append(z);
        strArr[0] = sb.toString();
        e.e("RecommendManagerImpl", strArr);
        this.I = i;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        ose.b(this.g.f30287a, this);
        if (ose.a(this.g.f30287a)) {
            e.e("RecommendManagerImpl", "购后单例内容移除 containerId : " + this.g.f30287a);
            boolean a2 = j.a("buyAfterRecmdMessageCenter", true);
            b bVar = this.u;
            if (bVar != null && a2) {
                bVar.b();
            }
            d.d(this.g.f30287a);
            d.e(this.g.b);
            d.g(this.g.f30287a);
            d.i(this.g.f30287a);
        }
        com.taobao.android.ai.b.a().e();
        this.z.c();
        this.z.d();
        oti otiVar = this.A;
        if (otiVar != null) {
            otiVar.a();
        }
        osl oslVar = this.D;
        if (oslVar != null) {
            oslVar.a();
        }
        m mVar = this.j;
        if (mVar != null) {
            mVar.a();
        }
        otg otgVar = this.F;
        if (otgVar != null) {
            otgVar.e();
        }
        x();
        this.z.a();
        E();
        K();
        e.e("RecommendManagerImpl", "destroy RecommendManagerImpl: " + hashCode());
    }

    @Override // tb.osm
    public ksk f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ksk) ipChange.ipc$dispatch("357f4056", new Object[]{this}) : this.g;
    }

    @Override // tb.osm
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.g.f30287a;
    }

    @Override // tb.osm
    public Context h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("96c352e7", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // tb.osm
    public RecyclerView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("d8cf254", new Object[]{this});
        }
        m mVar = this.j;
        if (mVar != null) {
            return mVar.f20997a;
        }
        return null;
    }

    @Override // tb.osm
    public List<SectionModel> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : this.s.g(this.g.f30287a);
    }

    @Override // tb.osm
    public JSONObject t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e6142a1b", new Object[]{this});
        }
        AwesomeGetContainerData b2 = this.s.b(this.g.f30287a);
        if (b2 != null) {
            return b2.getExt();
        }
        return null;
    }

    @Override // tb.osm
    public AwesomeGetPageData s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetPageData) ipChange.ipc$dispatch("10dcf7ba", new Object[]{this});
        }
        AwesomeGetContainerData b2 = this.s.b(this.g.f30287a);
        if (b2 != null) {
            return b2.getPageParams();
        }
        return null;
    }

    @Override // tb.osm
    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.s.b(this.g.f30287a).isLastPage();
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerId", (Object) this.g.f30287a);
        jSONObject2.put("deleteModel", (Object) jSONObject);
        com.taobao.android.gateway.datastructure.b bVar = new com.taobao.android.gateway.datastructure.b("DeleteOperation", d, jSONObject2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message == null) {
            return;
        }
        this.u.a(message);
    }

    public void b(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e034b276", new Object[]{this, kskVar});
            return;
        }
        com.taobao.android.ai.b.a().a(kskVar.f30287a);
        if (kskVar != this.g) {
            c(kskVar);
            m mVar = this.j;
            if (mVar != null && mVar.b != null) {
                this.j.b.a(kskVar);
            }
            com.taobao.android.ai.b.a().b();
        } else {
            com.taobao.android.ai.b.a().c();
        }
        m mVar2 = this.j;
        if (mVar2 != null) {
            mVar2.b();
            this.j.a(kskVar);
            HomeChildRecyclerView homeChildRecyclerView = this.j.f20997a;
            if (homeChildRecyclerView != null) {
                homeChildRecyclerView.updateContainerType(this.g);
            }
        }
        oti otiVar = this.A;
        if (otiVar == null) {
            return;
        }
        otiVar.a(kskVar);
    }

    private osp(ksk kskVar) {
        ose.a(kskVar.a(), this);
        this.z = new osr();
        this.A = new oti(kskVar, this.z);
        this.B = new syf(kskVar, this.z);
        this.D = new osl(this.z);
        this.z.a(new opu());
        this.F = new otg(this.z);
        this.U = J();
        if (!this.U) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.N = com.taobao.tao.recommend3.a.a().a(kskVar.a());
            ldf.e("RecommendManagerImpl", "构建DX耗时： " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        c(kskVar);
        e.e("RecommendManagerImpl", "create RecommendManagerImpl: " + hashCode());
    }

    private void c(ksk kskVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb7b8f7", new Object[]{this, kskVar});
            return;
        }
        this.g = kskVar;
        a(kskVar, this.z);
        this.v = new JSONObject();
        this.v.put("containerId", (Object) this.g.f30287a);
        this.l = new p(this);
        d.a(this.g.f30287a, this.l);
        this.m = new osg();
        this.n = this.m.a(kst.a(this.g), false);
        com.taobao.android.ai.b.a().a(this, this.s);
        com.taobao.android.ai.b.a().a(kskVar.f30287a);
        this.Q = o();
        this.P = com.taobao.infoflow.taobao.subservice.biz.padandfolddeviceservice.b.b(Globals.getApplication());
        this.S = com.taobao.homepage.utils.b.c() || com.taobao.homepage.utils.b.b();
        if (!this.S || !M()) {
            z = false;
        }
        this.V = z;
        sdi.a();
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else if ((!com.taobao.homepage.utils.b.b() && !com.taobao.homepage.utils.b.c()) || this.O != null) {
        } else {
            this.O = F();
            h.a().c(this.O);
            e.a("RecommendManagerImpl", "fold or pad device register screen change listener: " + hashCode(), new Throwable().fillInStackTrace());
        }
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else if ((!com.taobao.homepage.utils.b.b() && !com.taobao.homepage.utils.b.c()) || this.O == null) {
        } else {
            h.a().d(this.O);
            this.O = null;
            e.e("RecommendManagerImpl", "fold or pad device unregister screen change listener: " + hashCode());
        }
    }

    private OnScreenChangedListener F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnScreenChangedListener) ipChange.ipc$dispatch("3be53ed", new Object[]{this}) : new OnScreenChangedListener() { // from class: tb.osp.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onActivityChanged(Activity activity, int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
                }
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(final int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                } else {
                    com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: tb.osp.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!com.taobao.homepage.utils.b.b() && !com.taobao.homepage.utils.b.c()) {
                            } else {
                                boolean z = i == 1 || com.taobao.homepage.utils.b.b(osp.this.h());
                                boolean o = osp.this.o();
                                if (z != osp.m(osp.this)) {
                                    osp.e(osp.this, z);
                                    osp.d(osp.this, o);
                                    if (com.taobao.homepage.utils.b.c()) {
                                        osp.n(osp.this);
                                    }
                                } else {
                                    osp.d(osp.this, o);
                                }
                                e.e("RecommendManagerImpl", "onScreenChange, isPortrait: " + z);
                            }
                        }
                    }, 0L);
                }
            }
        };
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        DinamicXEngine.a(true);
        n().k();
        sdi.a();
        m mVar = this.j;
        if (mVar == null) {
            return;
        }
        mVar.a(z, p());
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        m mVar = this.j;
        if (mVar == null) {
            return;
        }
        int h = mVar.h();
        b(z);
        this.j.f();
        if (h > 0) {
            this.j.d(h);
            e.e("RecommendManagerImpl", "scroll to position: " + h);
        }
        e.e("RecommendManagerImpl", "force refresh ui");
    }

    private void a(ksk kskVar, otc otcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d6e587", new Object[]{this, kskVar, otcVar});
            return;
        }
        try {
            e.e("RecommendManagerImpl", "initGateway");
            Application a2 = g.a();
            String str = kskVar.b;
            if (w == null) {
                e.e("RecommendManagerImpl", "create new GatewayConfigCenter");
                w = new gkj(str, "gateway2/recmd_r4_gateway2.json", com.taobao.tao.recommend4.manager.utils.a.GATEWAY_R4_DEFAULT_CONFIG_JSON, true);
            }
            this.r = new gjv(str, w.a());
            this.u = new b();
            d.a(kskVar.f30287a, this.u);
            if (this.e != null) {
                this.e.a(kskVar);
                this.u.a(this.e.a(), this.e);
            }
            d.b(kskVar.b, this.u);
            this.r.a(this.u);
            this.s = new ope(a2, str);
            d.a(kskVar.f30287a, this.s);
            this.t = new c();
            this.t.a(new osq(otcVar));
            this.r.a(new oou(this.s), "recmd.expireTabs");
            this.r.a(new oov(this.s), "recmd.loadCache");
            this.r.a(new oot(this.s, this.M), "recmd.dataProcess");
            this.r.a(new ooz(this.s), "recmd.uiRefresh");
            this.r.a(new oox(this.s, this.t), "recmd.request");
            this.r.a(new ooy(this.s), "recmd.scrollToTop");
            this.r.a(new oos(this.s), "recmd.dataDelete");
            this.r.a(new oow(), "recmd.playerQueue");
            this.r.a(new opa(), "recmd.widgetPostMsg");
            this.r.a(new tig(), "recmd.prefetchDataProcess");
            this.r.a(new opd(this.s), "recmdItemLastIndex");
            this.r.a(new opc(this.s), "recmdClickId");
        } catch (GatewayException e) {
            e.a("RecommendManagerImpl", "init Gateway failed", e);
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        e.e("RecommendManagerImpl", "replaceRegister");
        ksk kskVar = this.g;
        if (kskVar == null) {
            return;
        }
        if (this.u != null) {
            d.a(kskVar.f30287a, this.u);
            d.b(this.g.b, this.u);
        }
        if (this.s != null) {
            d.a(this.g.f30287a, this.s);
        }
        if (this.l == null) {
            return;
        }
        d.a(this.g.f30287a, this.l);
    }

    public void bT_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ca0074", new Object[]{this});
            return;
        }
        r();
        this.o = true;
        opb.a("ViewCreate", f32364a, this.v, -1, l());
    }

    private void dk_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d5ed3f", new Object[]{this});
            return;
        }
        r();
        this.o = false;
        this.p = true;
        opb.a("ViewAppear", f32364a, this.v, -1, l());
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else if (this.h == null) {
        } else {
            r();
            this.o = false;
            this.p = true;
            JSONObject l = l();
            l.put("strategy", "cancelOther");
            l.put("forceRequest", "true");
            opb.a("ViewAppear", f32364a, this.v, -1, l);
            e.e("RecommendManagerImpl", "requestNetDataByScreenChange");
        }
    }

    @Override // tb.osm
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject l = l();
        if (l == null || jSONObject == null) {
            return;
        }
        l.getJSONObject("bizParam").putAll(jSONObject);
        l.put("isCurrentPage", (Object) true);
        opb.a("NewInteractive", f32364a, this.v, -1, l);
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
            return;
        }
        JSONObject l = l();
        if (l == null) {
            return;
        }
        JSONObject jSONObject2 = l.getJSONObject("bizParam");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.putAll(jSONObject);
        opb.a("PullToRefresh", f32364a, this.v, -1, l);
    }

    @Override // tb.osm
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        this.H = this.G;
        e.e("RecommendManagerImpl", "on item click");
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        m mVar = this.j;
        if (mVar == null || mVar.f20997a == null) {
            return;
        }
        myb nestedScrollParent = this.j.f20997a.getNestedScrollParent();
        if (nestedScrollParent != null && (nestedScrollParent instanceof RecyclerView)) {
            ((RecyclerView) nestedScrollParent).addOnScrollListener(this.K);
        } else if (nestedScrollParent == null) {
            e.e("registerOnScrollListener scrollParent == null", new String[0]);
        }
        this.j.f20997a.addOnAttachStateChangeListener(this.L);
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        m mVar = this.j;
        if (mVar == null || mVar.f20997a == null) {
            return;
        }
        myb nestedScrollParent = this.j.f20997a.getNestedScrollParent();
        if (nestedScrollParent != null && (nestedScrollParent instanceof RecyclerView)) {
            ((RecyclerView) nestedScrollParent).removeOnScrollListener(this.K);
        }
        this.j.f20997a.removeOnAttachStateChangeListener(this.L);
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        String g = g();
        if (g == null) {
            e.e("RecommendManagerImpl", "containerId == null");
            return str2;
        }
        JSONObject a2 = oqb.a(g);
        if (a2 == null) {
            e.e("RecommendManagerImpl", "passParams == null");
            return str2;
        }
        JSONObject jSONObject = a2.getJSONObject(ops.OPTIMIZATION_CONFIG);
        if (jSONObject == null) {
            e.e("RecommendManagerImpl", "optimizationConfig == null");
            return str2;
        }
        String string = jSONObject.getString(str);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        e.e("RecommendManagerImpl", "value == null");
        return str2;
    }

    @Override // tb.osm
    public otc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (otc) ipChange.ipc$dispatch("f08d9c0", new Object[]{this}) : this.z;
    }

    public void a(osm.a aVar) {
        osl oslVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb9df92", new Object[]{this, aVar});
            return;
        }
        m mVar = this.j;
        if (mVar == null || (oslVar = this.D) == null) {
            return;
        }
        mVar.a(aVar, oslVar);
    }

    @Override // tb.osm
    public DinamicXEngine n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("3c899af2", new Object[]{this});
        }
        DinamicXEngine dinamicXEngine = this.N;
        if (dinamicXEngine == null || (!dinamicXEngine.d() && this.U)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.N = com.taobao.tao.recommend3.a.a().a(g());
            ldf.e("RecommendManagerImpl", "构建DX耗时： " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        return this.N;
    }

    @Override // tb.osm
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        ksk kskVar = this.g;
        if (kskVar != null && !TextUtils.isEmpty(kskVar.f30287a)) {
            return com.taobao.homepage.utils.b.a(this.g.f30287a);
        }
        return false;
    }

    @Override // tb.osm
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        if (!this.Q) {
            return 2;
        }
        if (com.taobao.homepage.utils.b.c() && com.taobao.homepage.utils.b.b(h())) {
            return 2;
        }
        if (this.V) {
            return L();
        }
        return H();
    }

    private int L() {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4447ec6", new Object[]{this})).intValue();
        }
        Context h = h();
        if (!(h instanceof Activity)) {
            return 2;
        }
        a.C0547a a2 = a.C0547a.a(h);
        if (com.taobao.homepage.utils.b.c() && !com.taobao.homepage.utils.b.b(h)) {
            return a2.a();
        }
        int i = AnonymousClass12.f32368a[h.a().b((Activity) h).ordinal()];
        if (i == 1) {
            e = a2.e();
        } else if (i == 2) {
            e = a2.f();
        } else if (i == 3) {
            e = a2.d();
        } else if (i == 4) {
            e = a2.c();
        } else {
            e = i != 5 ? 2 : a2.b();
        }
        if (e <= 0) {
            return 2;
        }
        e.e("RecommendManagerImpl", "getScaleColumn: " + e);
        return e;
    }

    @Override // tb.osm
    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.T;
    }

    private int H() {
        WindowType b2;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40c20c2", new Object[]{this})).intValue();
        }
        if (this.R == null) {
            this.R = I();
        }
        if (this.R == null) {
            return 2;
        }
        Context h = h();
        if (!(h instanceof Activity)) {
            return 2;
        }
        if (this.T > 0) {
            b2 = h.a().a(DensityUtil.px2dip(h, this.T));
        } else {
            b2 = h.a().b((Activity) h);
        }
        try {
            i2 = AnonymousClass12.f32368a[b2.ordinal()];
        } catch (Exception unused) {
        }
        if (i2 == 1) {
            i = this.R.getIntValue("min");
        } else if (i2 == 2) {
            i = this.R.getIntValue("small");
        } else if (i2 == 3) {
            i = this.R.getIntValue("medium");
        } else if (i2 == 4) {
            i = this.R.getIntValue("large");
        } else {
            i = i2 != 5 ? 2 : this.R.getIntValue("max");
        }
        if (i <= 0) {
            return 2;
        }
        e.e("RecommendManagerImpl", "getColumnByConfig: " + i);
        return i;
    }

    private JSONObject I() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("98e3a370", new Object[]{this});
        }
        try {
            if (this.g != null && this.s != null) {
                AwesomeGetContainerInnerData c2 = this.s.c(this.g.f30287a);
                if (c2 != null && c2.getExt() != null && (string = c2.getExt().getString("columnCountConfig")) != null) {
                    return JSONObject.parseObject(string);
                }
                return JSONObject.parseObject("{\"min\":\"2\",\"small\":\"2\",\"medium\":\"4\",\"large\":\"5\",\"max\":\"5\"}");
            }
            return JSONObject.parseObject("{\"min\":\"2\",\"small\":\"2\",\"medium\":\"4\",\"large\":\"5\",\"max\":\"5\"}");
        } catch (Exception unused) {
            return null;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.T = i;
        if (this.T <= 0 || !this.S) {
            return;
        }
        n().b().a(this.T);
        m mVar = this.j;
        if (mVar != null) {
            mVar.c(i);
        }
        e.e("RecommendManagerImpl", "setContainerWidth: " + i);
    }

    public void bd_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0178a64", new Object[]{this});
            return;
        }
        AwesomeGetContainerData b2 = this.s.b(g());
        if (b2 == null) {
            return;
        }
        b2.base = null;
        b2.delta = null;
        b2.totalSectionList.clear();
    }

    public void a(m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36296b61", new Object[]{this, aVar});
            return;
        }
        m mVar = this.j;
        if (mVar == null) {
            return;
        }
        mVar.a(aVar);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        m mVar = this.j;
        if (mVar == null) {
            return;
        }
        mVar.a(z);
    }

    public void be_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cc6303", new Object[]{this});
            return;
        }
        m mVar = this.j;
        if (mVar == null) {
            return;
        }
        mVar.c();
    }

    public void bf_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3813ba2", new Object[]{this});
            return;
        }
        m mVar = this.j;
        if (mVar == null) {
            return;
        }
        mVar.d();
    }

    public void a(NewScrollLogic.PullState pullState, NewScrollLogic.PullState pullState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722f4868", new Object[]{this, pullState, pullState2});
            return;
        }
        m mVar = this.j;
        if (mVar == null) {
            return;
        }
        mVar.a(pullState, pullState2);
    }

    public void br_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6316", new Object[]{this});
            return;
        }
        m mVar = this.j;
        if (mVar == null || mVar.f20997a == null) {
            return;
        }
        k exposureListener = this.j.f20997a.getExposureListener();
        if (exposureListener != null) {
            exposureListener.a();
        }
        this.G = 0;
        this.H = 0;
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        m mVar = this.j;
        if (mVar == null || mVar.f20997a == null) {
            return;
        }
        this.E = y();
        this.j.f20997a.addOnAttachStateChangeListener(this.E);
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        m mVar = this.j;
        if (mVar == null || mVar.f20997a == null || this.E == null) {
            return;
        }
        this.j.f20997a.removeOnAttachStateChangeListener(this.E);
    }

    private View.OnAttachStateChangeListener y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("fd5740d5", new Object[]{this}) : new View.OnAttachStateChangeListener() { // from class: tb.osp.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                } else if (osp.s(osp.this) == null || osp.d(osp.this) == null) {
                } else {
                    osp.s(osp.this).a(osp.d(osp.this));
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                } else if (osp.s(osp.this) == null) {
                } else {
                    osp.s(osp.this).c();
                }
            }
        };
    }

    private otp z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (otp) ipChange.ipc$dispatch("cf62019a", new Object[]{this}) : new otp() { // from class: tb.osp.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.otp
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (osp.s(osp.this) == null) {
                } else {
                    osp.s(osp.this).a();
                }
            }

            @Override // tb.otp
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (osp.s(osp.this) == null) {
                } else {
                    osp.s(osp.this).b();
                }
            }
        };
    }

    private com.taobao.tao.recommend4.recyclerview.j A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.recommend4.recyclerview.j) ipChange.ipc$dispatch("59bbf987", new Object[]{this}) : new com.taobao.tao.recommend4.recyclerview.j() { // from class: tb.osp.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.recyclerview.j
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else {
                    osp.b(osp.this, i);
                }
            }
        };
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (B()) {
            this.G = i - 1;
        } else {
            this.G = i;
        }
        if (!C()) {
            return;
        }
        JSONObject insertParam = this.s.b(this.g.f30287a).getInsertParam();
        int a2 = a(insertParam, "notClickCardsCount");
        int a3 = a(insertParam, "invertedInsertPos");
        if (a2 <= 0 || a3 <= 0) {
            e.e("RecommendManagerImpl", "insert param is invalid");
            return;
        }
        e.e("RecommendManagerImpl", "cur exposure count: " + this.G + " last insert exposure count: " + this.H);
        if (this.G - this.H < a2) {
            return;
        }
        e.e("RecommendManagerImpl", "perform insert cards, expose cards count: " + this.G);
        a(a3, i - 1);
        this.H = this.G;
    }

    private boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        List<SectionModel> j = j();
        if (j != null && !j.isEmpty()) {
            String string = j.get(0).getString("sectionBizCode");
            if (!TextUtils.isEmpty(string) && (string.endsWith("_head") || string.endsWith("_tabs"))) {
                return true;
            }
        }
        return false;
    }

    private void a(int i, int i2) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        String str = this.g.f30287a;
        AwesomeGetContainerData b2 = this.s.b(str);
        if (b2 == null) {
            return;
        }
        List<SectionModel> insertSections = b2.getInsertSections();
        if (insertSections == null || insertSections.isEmpty()) {
            e.e("RecommendManagerImpl", "invalid insert data");
        } else if (this.j.f20997a.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            if (i2 < i - 1) {
                e.e("RecommendManagerImpl", "insert pos invalid: " + i);
                return;
            }
            int i3 = (i2 + 1) - i;
            RecyclerView.Adapter adapter = this.j.f20997a.getAdapter();
            if (!(adapter instanceof com.taobao.tao.recommend4.recyclerview.h) || (a2 = ((com.taobao.tao.recommend4.recyclerview.h) adapter).a(i3)) == null) {
                return;
            }
            String string = a2.getString("sectionBizCode");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            int a3 = opb.a(string, this.s.e(str));
            if (a3 >= 0) {
                List<SectionModel> e = this.s.e(str);
                e.addAll(a3, insertSections);
                this.s.b(str).updateBaseSections(e);
                e.e("RecommendManagerImpl", "perform insert into base");
            } else {
                int a4 = opb.a(string, this.s.f(str));
                if (a4 == -1) {
                    e.e("RecommendManagerImpl", "not found insert pos");
                    return;
                }
                List<SectionModel> f = this.s.f(str);
                SectionModel sectionModel = f.get(a4);
                if (sectionModel == null) {
                    return;
                }
                for (SectionModel sectionModel2 : insertSections) {
                    sectionModel2.put("invalidType", sectionModel.get("invalidType"));
                    sectionModel2.put("updateRules", (Object) sectionModel.getJSONArray("updateRules"));
                }
                f.addAll(a4, insertSections);
                this.s.b(str).updateDeltaSections(f);
                e.e("RecommendManagerImpl", "perform insert into delta");
            }
            int i4 = i3;
            for (SectionModel sectionModel3 : insertSections) {
                sectionModel3.getArgs().put("realExposeIndex", (Object) Integer.valueOf(i4));
                i4++;
            }
            JSONObject insertParam = this.s.b(str).getInsertParam();
            if (insertParam != null) {
                insertParam.put("hasInsert", (Object) true);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerModel", (Object) this.s.b(str));
            jSONObject.put("_msgType", (Object) "uiRefresh");
            jSONObject.put("dataChangeType", (Object) "delta");
            jSONObject.put("dataSourceType", (Object) "remote");
            jSONObject.put("containerId", (Object) str);
            d.b(str).a(RecmdContainerMsg.getMessage(jSONObject));
            e.e("RecommendManagerImpl", "perform insert card , pos:" + i3);
        }
    }

    private boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        AwesomeGetContainerData b2 = this.s.b(this.g.f30287a);
        return b2 != null && b2.supportInsertSections();
    }

    private int a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48075345", new Object[]{this, jSONObject, str})).intValue();
        }
        try {
            return jSONObject.getIntValue(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    private boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : j.a("enableDelayCreateAfterBuyDxEngine", true);
    }

    private boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : j.a("enableHudDeviceInfoFlowZoom", true);
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("forceRequest", (Object) "true");
        jSONObject.put("bizParam", (Object) f((JSONObject) null));
        opb.a(tif.GROUP, f32364a, this.v, -1, jSONObject);
    }

    private void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            return;
        }
        AwesomeGetData d2 = tif.d();
        Map<String, AwesomeGetContainerData> containers = d2.getContainers();
        if (containers == null) {
            return;
        }
        if (num.intValue() > 0) {
            containers.put("recommend_orderlist_catapult_main", containers.remove("recommend_orderlist_main"));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dataModel", (Object) d2);
        opb.a("OrderListPrefetchDataConsume", f32364a, this.v, -1, jSONObject);
    }

    private JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ef769c3", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (osf.b(this)) {
            jSONObject.put("isNeedSubSelectionData", (Object) true);
        }
        return jSONObject;
    }

    private void O() {
        AwesomeGetContainerInnerData c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        m mVar = this.j;
        if (mVar == null || mVar.f20997a == null || (c2 = this.s.c(this.g.f30287a)) == null || c2.getExt() == null) {
            return;
        }
        JSONObject ext = c2.getExt();
        int i = 8;
        int i2 = -1;
        String string = ext.getString("channelBgColor");
        if (string != null) {
            this.j.a(b(string), 0);
        } else if (!TextUtils.equals(ext.getString("removeBannerTitle"), "true")) {
        } else {
            String str = this.Y;
            if (str != null) {
                this.j.a(b(str), d(8));
            } else if (!TextUtils.equals(ext.getString("openPostBuyLabStyle"), "true")) {
            } else {
                String string2 = ext.getString("backgroundColor");
                String string3 = ext.getString("marginTop");
                if (string2 != null) {
                    i2 = b(string2);
                }
                if (string3 != null) {
                    i = Integer.parseInt(string3);
                }
                this.j.a(i2, d(i));
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.Y = str;
        }
    }

    private int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable th) {
            e.a("RecommendManagerImpl", "parseColor failed", th);
            return -1;
        }
    }

    private int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.N != null && h() != null) {
            return gbg.a(this.N, h(), i);
        }
        return 16;
    }
}
