package com.taobao.android.detail.wrapper.pagemanager.headerpic;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.aligallery.AliGalleryContainer;
import com.taobao.android.detail.core.aura.utils.g;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.basic.c;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.s;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import tb.dwh;
import tb.dwi;
import tb.els;
import tb.emu;
import tb.emx;
import tb.eno;
import tb.ezm;
import tb.iyh;
import tb.kge;
import tb.lcm;
import tb.lpa;

/* loaded from: classes5.dex */
public class b implements j<c>, lpa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f11440a;
    private AliGalleryContainer c;
    private els d;
    private int b = -1;
    private volatile boolean e = true;
    private int f = -1;
    private RecyclerView.OnScrollListener g = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
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
            if (b.a(b.this) == null) {
                return;
            }
            if (b.a(b.this).getRootView().getWindowToken() == null) {
                if (!b.b(b.this)) {
                    return;
                }
                b.a(b.this).pagePause(false);
                b.a(b.this, false);
            } else if (b.b(b.this)) {
            } else {
                b.a(b.this).pageResume(false);
                b.a(b.this, true);
            }
        }
    };
    private dwh h = new dwh() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dwh
        public void a(String str, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
            } else if (!(b.c(b.this) instanceof DetailCoreActivity)) {
            } else {
                DetailCoreActivity c = b.c(b.this);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", (Object) str);
                jSONObject.put("image", (Object) jSONObject2);
                jSONObject.put("bizId", (Object) "blacklight");
                c.a(jSONObject, view);
            }
        }
    };
    private ViewPager.OnPageChangeListener i = new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.b.3
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
            } else if (b.a(b.this) == null || i2 != 0 || b.d(b.this) == i) {
            } else {
                if (i == 0) {
                    b.a(b.this).pageResume(true);
                } else {
                    b.a(b.this).pagePause(true);
                }
                b.a(b.this, i);
            }
        }
    };
    private ezm j = new ezm() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.b.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ezm
        public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
            d a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) s.EVENT_TYPE_ALTERNATIVE);
            jSONObject.put("fields", (Object) aVar.b());
            Event a3 = emx.a(b.c(b.this)).b().n().a(new ActionModel(jSONObject), b.c(b.this).C().f10055a, null, null);
            if (a3 == null || (a2 = f.a(b.c(b.this))) == null) {
                return false;
            }
            a2.a(a3);
            return true;
        }
    };
    private dwi k = new dwi() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.b.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dwi
        public void a(String str) {
            final iyh a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (b.c(b.this) == null || b.c(b.this).isFinishing() || !(b.c(b.this) instanceof com.taobao.android.detail.core.aura.observer.a) || (a2 = ((com.taobao.android.detail.core.aura.observer.a) b.c(b.this)).a()) == null) {
            } else {
                final String a3 = g.a(a2.a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH), str);
                b.c(b.this).runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.wrapper.pagemanager.headerpic.b.5.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        RecyclerView recyclerView = (RecyclerView) b.c(b.this).findViewById(R.id.mainpage2);
                        if (recyclerView == null || recyclerView.isComputingLayout()) {
                            return;
                        }
                        a2.a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, a3);
                    }
                });
            }
        }
    };

    static {
        kge.a(-439299970);
        kge.a(-1453870097);
        kge.a(-671507480);
    }

    public static /* synthetic */ int a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e20cf2b5", new Object[]{bVar, new Integer(i)})).intValue();
        }
        bVar.f = i;
        return i;
    }

    public static /* synthetic */ AliGalleryContainer a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliGalleryContainer) ipChange.ipc$dispatch("fda9f487", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e20d3297", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.e = z;
        return z;
    }

    public static /* synthetic */ boolean b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aef61044", new Object[]{bVar})).booleanValue() : bVar.e;
    }

    public static /* synthetic */ DetailCoreActivity c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("db43e86a", new Object[]{bVar}) : bVar.f11440a;
    }

    public static /* synthetic */ int d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abb817f1", new Object[]{bVar})).intValue() : bVar.f;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, cVar}) : a(cVar);
    }

    public b(lcm lcmVar) {
        emu.a("com.taobao.android.detail.wrapper.pagemanager.headerpic.DetailHeaderPicV3Component");
        if (!(lcmVar.a() instanceof DetailCoreActivity)) {
            throw new IllegalArgumentException("activity must be DetailCoreActivity");
        }
        this.f11440a = lcmVar.a();
        this.d = new els();
    }

    public i a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("8b7d820", new Object[]{this, cVar});
        }
        AliGalleryContainer aliGalleryContainer = this.c;
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

    private ViewGroup c() {
        JSONObject L_;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6e13476b", new Object[]{this});
        }
        if (this.c == null) {
            return null;
        }
        DetailCoreActivity detailCoreActivity = this.f11440a;
        if ((detailCoreActivity instanceof DetailCoreActivity) && (L_ = detailCoreActivity.L_()) != null && !L_.getBooleanValue("preload")) {
            return detailCoreActivity.T();
        }
        return null;
    }

    @Override // tb.lpa
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        f.a(this.f11440a).b(eno.a(c.class), this);
        f.a(this.f11440a).a(eno.a(c.class), this);
        if (this.c == null) {
            DetailCoreActivity detailCoreActivity = this.f11440a;
            this.c = new AliGalleryContainer(detailCoreActivity, detailCoreActivity.h);
            this.c.setOnSkuPropPathSelectedListener(this.k);
            this.c.setOnShareListener(this.h);
            this.c.getDetailContext().c().a("openRate", this.j);
            ViewParent parent = this.c.getRootView().getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c.getRootView());
            }
        }
        return this.c.getRootView();
    }

    @Override // tb.lpa
    public void a(lcm lcmVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f285f542", new Object[]{this, lcmVar});
            return;
        }
        int e = this.f11440a.e();
        if ((e != -1 && (i = this.b) != -1 && e == i) || this.c == null) {
            return;
        }
        this.d.a(this.f11440a);
        ViewPager U = this.f11440a.U();
        if (U != null) {
            U.removeOnPageChangeListener(this.i);
            U.addOnPageChangeListener(this.i);
        }
        RecyclerView recyclerView = (RecyclerView) this.f11440a.findViewById(R.id.mainpage2);
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.g);
            recyclerView.addOnScrollListener(this.g);
        }
        this.f = -1;
        this.b = e;
        this.c.setMiniVideoContainer(c());
        this.c.setMtopData(this.f11440a.L_());
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.c.setFixContainerRatio(f);
        }
    }

    @Override // tb.lpa
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.f11440a;
        if (detailCoreActivity instanceof DetailCoreActivity) {
            ViewPager U = detailCoreActivity.U();
            if (U != null) {
                U.removeOnPageChangeListener(this.i);
            }
            RecyclerView recyclerView = (RecyclerView) this.f11440a.findViewById(R.id.mainpage2);
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(this.g);
            }
        }
        AliGalleryContainer aliGalleryContainer = this.c;
        if (aliGalleryContainer != null) {
            aliGalleryContainer.destroy();
            this.c = null;
        }
        f.a(this.f11440a).b(eno.a(c.class), this);
    }
}
