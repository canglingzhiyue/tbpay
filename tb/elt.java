package tb;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.aligallery.AliGalleryContainer;
import com.taobao.android.detail.core.aura.utils.g;
import com.taobao.android.detail.core.aura.widget.c;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.basic.c;
import com.taobao.android.detail.core.inside.InsideLinearLayout;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.s;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.iyh;

/* loaded from: classes4.dex */
public class elt implements j<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_VIEW_TAG = "tt_detail_header_pic_view_tag";

    /* renamed from: a  reason: collision with root package name */
    private q f27412a;
    private Context b;
    private AliGalleryContainer d;
    private int c = -1;
    private volatile boolean f = true;
    private Map<String, Integer> o = new ConcurrentHashMap();
    private int g = -1;
    private ezm h = new ezm() { // from class: tb.elt.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ezm
        public boolean a(a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
            d a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) s.EVENT_TYPE_ALTERNATIVE);
            jSONObject.put("fields", (Object) aVar.b());
            Event a3 = emx.a(elt.a(elt.this)).b().n().a(new ActionModel(jSONObject), eje.a(elt.b(elt.this)).C().f10055a, null, null);
            if (a3 == null || (a2 = f.a(elt.a(elt.this))) == null) {
                return false;
            }
            a2.a(a3);
            return true;
        }
    };
    private final eld m = new eld() { // from class: tb.elt.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.eld
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.eld
        public void a(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26196df8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            } else {
                elt.c(elt.this).setFixContainerRatioPercent(f);
            }
        }
    };
    private final InsideLinearLayout.a n = new InsideLinearLayout.a() { // from class: tb.elt.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.a
        public void b(InsideLinearLayout.InsideDetailState insideDetailState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f10a4df", new Object[]{this, insideDetailState});
            }
        }

        @Override // com.taobao.android.detail.core.inside.InsideLinearLayout.a
        public void a(InsideLinearLayout.InsideDetailState insideDetailState) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e974ede", new Object[]{this, insideDetailState});
            } else if (elt.c(elt.this) == null || !(elt.a(elt.this) instanceof com.taobao.android.detail.core.detail.activity.c)) {
            } else {
                if (((com.taobao.android.detail.core.detail.activity.c) elt.a(elt.this)).c() == 1) {
                    i = 1;
                }
                if (i == 0) {
                    elt.c(elt.this).setFixContainerRatio(0.0f);
                }
                elt.c(elt.this).setPagerMode(i);
            }
        }
    };
    private dwi i = new dwi() { // from class: tb.elt.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dwi
        public void a(String str) {
            final iyh a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            final DetailCoreActivity a3 = eje.a(elt.b(elt.this));
            if (a3 == null || !(elt.a(elt.this) instanceof com.taobao.android.detail.core.aura.observer.a) || (a2 = ((com.taobao.android.detail.core.aura.observer.a) elt.a(elt.this)).a()) == null) {
                return;
            }
            final String a4 = g.a(a2.a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH), str);
            a3.runOnUiThread(new Runnable() { // from class: tb.elt.5.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RecyclerView recyclerView = (RecyclerView) a3.findViewById(R.id.mainpage2);
                    if (recyclerView == null || recyclerView.isComputingLayout()) {
                        return;
                    }
                    a2.a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, a4);
                }
            });
        }
    };
    private RecyclerView.OnScrollListener j = new RecyclerView.OnScrollListener() { // from class: tb.elt.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 806944192) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode != 2142696127) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            } else {
                super.onScrollStateChanged(recyclerView, i);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (elt.c(elt.this) == null) {
                return;
            }
            if (elt.c(elt.this).getRootView().getWindowToken() == null) {
                if (!elt.d(elt.this)) {
                    return;
                }
                elt.c(elt.this).pagePause(false);
                elt.a(elt.this, false);
            } else if (elt.d(elt.this)) {
            } else {
                elt.c(elt.this).pageResume(false);
                elt.a(elt.this, true);
            }
        }
    };
    private dwh k = new dwh() { // from class: tb.elt.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dwh
        public void a(String str, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
            } else if (!(elt.a(elt.this) instanceof DetailCoreActivity)) {
            } else {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", (Object) str);
                jSONObject.put("image", (Object) jSONObject2);
                jSONObject.put("bizId", (Object) "blacklight");
                ((DetailCoreActivity) elt.a(elt.this)).a(jSONObject, view);
            }
        }
    };
    private ViewPager.OnPageChangeListener l = new ViewPager.OnPageChangeListener() { // from class: tb.elt.8
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            } else if (elt.c(elt.this) == null || i2 != 0 || elt.e(elt.this) == i) {
            } else {
                if (i == 0) {
                    elt.c(elt.this).pageResume(true);
                } else {
                    elt.c(elt.this).pagePause(true);
                }
                elt.a(elt.this, i);
            }
        }
    };
    private els e = new els();

    static {
        kge.a(604243242);
        kge.a(-1453870097);
    }

    public static /* synthetic */ int a(elt eltVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbabc94b", new Object[]{eltVar, new Integer(i)})).intValue();
        }
        eltVar.g = i;
        return i;
    }

    public static /* synthetic */ Context a(elt eltVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2684b903", new Object[]{eltVar}) : eltVar.b;
    }

    public static /* synthetic */ boolean a(elt eltVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbac092d", new Object[]{eltVar, new Boolean(z)})).booleanValue();
        }
        eltVar.f = z;
        return z;
    }

    public static /* synthetic */ q b(elt eltVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("47b7f073", new Object[]{eltVar}) : eltVar.f27412a;
    }

    public static /* synthetic */ AliGalleryContainer c(elt eltVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliGalleryContainer) ipChange.ipc$dispatch("db4cd25b", new Object[]{eltVar}) : eltVar.d;
    }

    public static /* synthetic */ boolean d(elt eltVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b29f1e92", new Object[]{eltVar})).booleanValue() : eltVar.f;
    }

    public static /* synthetic */ int e(elt eltVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1222502", new Object[]{eltVar})).intValue() : eltVar.g;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, cVar}) : a(cVar);
    }

    public elt(q qVar) {
        this.f27412a = qVar;
        this.b = qVar.e();
        emu.a("com.taobao.android.detail.core.standard.mainscreen.render.component.TTDetailHeaderPicPresenter");
    }

    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this});
        }
        f.a(this.b).b(eno.a(c.class), this);
        f.a(this.b).a(eno.a(c.class), this);
        FrameLayout frameLayout = new FrameLayout(this.b);
        if (this.d == null) {
            this.d = new AliGalleryContainer(this.b, eje.b(this.f27412a));
            this.d.setOnSkuPropPathSelectedListener(this.i);
            this.d.setOnShareListener(this.k);
            eyx detailContext = this.d.getDetailContext();
            ezl c = detailContext.c();
            c.a("openRate", this.h);
            if (com.taobao.android.detail.ttdetail.utils.j.c()) {
                ezh f = detailContext.f();
                f.a(com.taobao.android.detail.core.aura.widget.c.DX_WIDGET_ID, new c.b());
                f.a(dxf.DX_EVENT_DETAILSKUSCROLLED, new dxf(this.o));
                f.a(dxe.DX_PARSER_DETAILSKUGETSCROLLED, new dxe(this.o));
                ioh iohVar = new ioh(this.f27412a);
                c.a("change_sku_frame", iohVar);
                c.a("switch_main_pic", iohVar);
                ioi ioiVar = new ioi(this.f27412a);
                c.a("openSKU", ioiVar);
                c.a("addToCart", ioiVar);
                c.a("buyNow", ioiVar);
                c.a("openFloatDialog", ioiVar);
                List<String> f2 = com.taobao.android.detail.ttdetail.utils.j.f();
                if (f2 != null && !f2.isEmpty()) {
                    for (String str : f2) {
                        c.a(str, ioiVar);
                    }
                }
            }
            Context context = this.b;
            if (context instanceof com.taobao.android.detail.core.aura.observer.a) {
                ((com.taobao.android.detail.core.aura.observer.a) context).a().a(com.taobao.android.detail.core.aura.observer.d.KEY_PRICE_MODEL, new iyh.a() { // from class: tb.elt.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.iyh.a
                    public void a(String str2, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                        } else {
                            elt.c(elt.this).updateLightOffPriceInfo(str3);
                        }
                    }
                });
            }
            ViewParent parent = this.d.getRootView().getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.d.getRootView());
            }
            Context context2 = this.b;
            if (context2 instanceof com.taobao.android.detail.core.detail.activity.c) {
                com.taobao.android.detail.core.detail.activity.c cVar = (com.taobao.android.detail.core.detail.activity.c) context2;
                if (cVar.J_()) {
                    this.d.setPagerMode(1);
                    this.d.setFixContainerRatio(1.5384616f);
                    this.d.setFixContainerRatioPercent(0.0f);
                    cVar.a(this.m);
                    cVar.a(this.n);
                }
            }
        }
        frameLayout.addView(this.d.getRootView(), new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return frameLayout;
    }

    public void b() {
        AliGalleryContainer aliGalleryContainer;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DetailCoreActivity a2 = eje.a(this.f27412a);
        if (a2 == null) {
            return;
        }
        int e = a2.e();
        if ((e != -1 && (i = this.c) != -1 && e == i) || (aliGalleryContainer = this.d) == null) {
            return;
        }
        this.e.a(aliGalleryContainer.getRootView(), a2);
        ViewPager U = a2.U();
        if (U != null) {
            U.removeOnPageChangeListener(this.l);
            U.addOnPageChangeListener(this.l);
        }
        RecyclerView recyclerView = (RecyclerView) a2.findViewById(R.id.mainpage2);
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.j);
            recyclerView.addOnScrollListener(this.j);
        }
        this.g = -1;
        this.c = e;
        ViewGroup d = d();
        this.d.setMiniVideoContainer(d);
        this.d.setMtopData(a2.L_());
        this.d.setFloatAnimationContainer(d);
    }

    public static boolean a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c6de315", new Object[]{qVar})).booleanValue();
        }
        if (qVar == null || !(qVar.e() instanceof DetailCoreActivity)) {
            return false;
        }
        return ((DetailCoreActivity) qVar.e()).K_();
    }

    public i a(com.taobao.android.detail.core.event.basic.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("8b7d820", new Object[]{this, cVar});
        }
        AliGalleryContainer aliGalleryContainer = this.d;
        if (aliGalleryContainer != null) {
            aliGalleryContainer.scrollToFrameWithPropPath(cVar.a());
        }
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private ViewGroup d() {
        DetailCoreActivity detailCoreActivity;
        JSONObject L_;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5ee44eca", new Object[]{this});
        }
        if (this.d == null) {
            return null;
        }
        Context context = this.b;
        if ((context instanceof DetailCoreActivity) && (L_ = (detailCoreActivity = (DetailCoreActivity) context).L_()) != null && !L_.getBooleanValue("preload")) {
            return detailCoreActivity.T();
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Context context = this.b;
        if (context instanceof DetailCoreActivity) {
            ViewPager U = ((DetailCoreActivity) context).U();
            if (U != null) {
                U.removeOnPageChangeListener(this.l);
            }
            RecyclerView recyclerView = (RecyclerView) ((DetailCoreActivity) this.b).findViewById(R.id.mainpage2);
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(this.j);
            }
        }
        Context context2 = this.b;
        if (context2 instanceof com.taobao.android.detail.core.detail.activity.c) {
            com.taobao.android.detail.core.detail.activity.c cVar = (com.taobao.android.detail.core.detail.activity.c) context2;
            cVar.b(this.m);
            cVar.b(this.n);
        }
        AliGalleryContainer aliGalleryContainer = this.d;
        if (aliGalleryContainer != null) {
            aliGalleryContainer.destroy();
            this.d = null;
        }
        f.a(this.b).b(eno.a(com.taobao.android.detail.core.event.basic.c.class), this);
    }
}
