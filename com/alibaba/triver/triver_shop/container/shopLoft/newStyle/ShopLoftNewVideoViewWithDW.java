package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.g;
import com.alibaba.triver.triver_shop.container.shopLoft.j;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.bl;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.cen;
import tb.eby;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopLoftNewVideoViewWithDW extends ShopLoftViewNewStyleBaseView implements aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bl h;
    private String i;
    private String j;
    private String k;
    private int m;
    private int n;
    private boolean o;
    private TUrlImageView p;
    private TUrlImageView q;
    private d r;
    private int t;
    private TUrlImageView u;
    private j y;
    private float l = 1.7777778f;
    private int s = o.a((Number) 30);
    private boolean x = true;
    private final String v = "https://img.alicdn.com/imgextra/i3/O1CN01mZTjld1GqHPdygPdg_!!6000000000673-2-tps-84-84.png";
    private final String w = "https://img.alicdn.com/imgextra/i3/O1CN01Dw6Ypv1R3Em1OMooC_!!6000000002055-2-tps-84-84.png";

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
            ShopLoftNewVideoViewWithDW.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            bl c = ShopLoftNewVideoViewWithDW.c(ShopLoftNewVideoViewWithDW.this);
            if (c != null && c.k()) {
                z = true;
            }
            if (z) {
                ShopLoftNewVideoViewWithDW.d(ShopLoftNewVideoViewWithDW.this);
                return;
            }
            ShopLoftNewVideoViewWithDW.a(ShopLoftNewVideoViewWithDW.this);
            d e = ShopLoftNewVideoViewWithDW.e(ShopLoftNewVideoViewWithDW.this);
            if (e != null) {
                e.a(true);
            } else {
                q.b("videoPlayController");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
            ShopLoftNewVideoViewWithDW.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            bl c = ShopLoftNewVideoViewWithDW.c(ShopLoftNewVideoViewWithDW.this);
            if (c != null && c.h()) {
                ShopLoftNewVideoViewWithDW.f(ShopLoftNewVideoViewWithDW.this);
                b.c A = ShopLoftNewVideoViewWithDW.this.A();
                if (A == null) {
                    return;
                }
                A.a(b.c.EVENT_ON_MUTE_STATUS_CHANGED, com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("isMuted", false)));
                return;
            }
            ShopLoftNewVideoViewWithDW.g(ShopLoftNewVideoViewWithDW.this);
            b.c A2 = ShopLoftNewVideoViewWithDW.this.A();
            if (A2 == null) {
                return;
            }
            A2.a(b.c.EVENT_ON_MUTE_STATUS_CHANGED, com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("isMuted", true)));
        }
    }

    static {
        kge.a(-1989775796);
        kge.a(-123403623);
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1430104719:
                super.initWithData((Context) objArr[0], (JSONObject) objArr[1], (b.c) objArr[2], (b.a) objArr[3]);
                return null;
            case -1087026559:
                super.onDestroyed();
                return null;
            case 50486379:
                super.didDisappear();
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1580371323:
                super.didAppear();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    public static final /* synthetic */ void a(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2fdfcd", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.x();
        }
    }

    public static final /* synthetic */ bl c(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bl) ipChange.ipc$dispatch("9979890a", new Object[]{shopLoftNewVideoViewWithDW}) : shopLoftNewVideoViewWithDW.h;
    }

    public static final /* synthetic */ void d(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a38dea", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.y();
        }
    }

    public static final /* synthetic */ d e(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d2d04fa4", new Object[]{shopLoftNewVideoViewWithDW}) : shopLoftNewVideoViewWithDW.r;
    }

    public static final /* synthetic */ void f(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f0aca8", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.v();
        }
    }

    public static final /* synthetic */ void g(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97173c07", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.w();
        }
    }

    public static final /* synthetic */ void h(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963dcb66", new Object[]{shopLoftNewVideoViewWithDW});
        } else {
            shopLoftNewVideoViewWithDW.B();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        super.initWithData(context, jSONObject, cVar, aVar);
        q.a(aVar);
        b.a.InterfaceC0126a a2 = aVar.a("shopLoftVideoController");
        if (a2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.newStyle.VideoPlayController");
        }
        this.r = (d) a2;
        b.a.InterfaceC0126a a3 = aVar.a("shopLoftFeedsController");
        if (a3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftFeedsController");
        }
        this.y = (j) a3;
        t();
        u();
        q();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public View cz_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bc6865d1", new Object[]{this}) : new FrameLayout(p()) { // from class: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW$getDelegateRooView$1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final GestureDetector gestureDetector;
            private final a simpleGestureDetector;

            /* loaded from: classes3.dex */
            public static final class a extends GestureDetector.SimpleOnGestureListener {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ShopLoftNewVideoViewWithDW f3747a;

                public a(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
                    this.f3747a = shopLoftNewVideoViewWithDW;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public void onLongPress(MotionEvent motionEvent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                    } else {
                        ShopLoftNewVideoViewWithDW.h(this.f3747a);
                    }
                }
            }

            public static /* synthetic */ Object ipc$super(ShopLoftNewVideoViewWithDW$getDelegateRooView$1 shopLoftNewVideoViewWithDW$getDelegateRooView$1, String str, Object... objArr) {
                if (str.hashCode() == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            {
                this.simpleGestureDetector = new a(ShopLoftNewVideoViewWithDW.this);
                this.gestureDetector = new GestureDetector(getContext(), this.simpleGestureDetector);
            }

            public final a getSimpleGestureDetector() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("41182999", new Object[]{this}) : this.simpleGestureDetector;
            }

            public final GestureDetector getGestureDetector() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (GestureDetector) ipChange2.ipc$dispatch("82bf1660", new Object[]{this}) : this.gestureDetector;
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                }
                this.gestureDetector.onTouchEvent(motionEvent);
                return super.dispatchTouchEvent(motionEvent);
            }
        };
    }

    private final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        ceg.Companion.b("trigger shop loft video LongClick");
        ShopWrapWebView o = o();
        if (o == null) {
            return;
        }
        g.d(o);
    }

    private final void t() {
        Integer d;
        int i;
        Integer d2;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        JSONObject j = j();
        if (j == null) {
            return;
        }
        this.j = j.getString("videoId");
        this.i = j.getString("videoUrl");
        this.k = j.getString(eby.KEY_PIC_URL);
        String string = j.getString("height");
        this.m = (string == null || (d = n.d(string)) == null) ? 0 : d.intValue();
        String string2 = j.getString("width");
        if (string2 != null && (d2 = n.d(string2)) != null) {
            i2 = d2.intValue();
        }
        this.n = i2;
        int i3 = this.m;
        if (i3 != 0 && (i = this.n) != 0) {
            this.l = i3 / i;
        }
        String string3 = j.getString("initMuteStatus");
        if (string3 == null) {
            return;
        }
        this.x = q.a((Object) string3, (Object) "true");
    }

    private final void u() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map<String, String> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.t = this.s + o.a(p()) + o.a((Number) 30);
        boolean z = this.x;
        bl.a aVar = new bl.a((Activity) p());
        int i = com.alibaba.triver.triver_shop.newShop.ext.b.b((Activity) p()).widthPixels;
        int i2 = (this.m == 0 || this.n == 0) ? -2 : (int) (i * this.l);
        aVar.d(i2);
        aVar.c(i);
        aVar.b(this.j);
        aVar.a(this.i);
        aVar.a(DWInstanceType.VIDEO);
        if (cen.Companion.e()) {
            aVar.s(true);
        }
        aVar.f(cen.Companion.e() ? "TRIVER_SHOP_BIGCARD" : "TRIVER_SHOP_BIGCARD_TEMP");
        aVar.d("TBVideo");
        aVar.d(h.b());
        aVar.a(DWAspectRatio.DW_CENTER_CROP);
        JSONObject j = j();
        aVar.a((j == null || (jSONObject = j.getJSONObject("spmParams")) == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null || (c = com.alibaba.triver.triver_shop.newShop.ext.b.c(jSONObject2)) == null) ? null : com.alibaba.triver.triver_shop.newShop.ext.b.f(c));
        this.h = aVar.c();
        bl blVar = this.h;
        if (blVar != null) {
            blVar.a(this);
        }
        String str = this.k;
        if (str != null) {
            TUrlImageView tUrlImageView = new TUrlImageView(p());
            tUrlImageView.setImageUrl(str);
            bl blVar2 = this.h;
            if (blVar2 != null) {
                blVar2.a(tUrlImageView);
            }
            t tVar = t.INSTANCE;
            this.q = tUrlImageView;
            if (l.b()) {
                TUrlImageView tUrlImageView2 = new TUrlImageView(p());
                tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01xenXqr1O62GkoCtKn_!!6000000001655-2-tps-750-1334.png");
                o.a(g(), tUrlImageView2);
            } else {
                ImageView imageView = new ImageView(p());
                com.taobao.phenix.intf.b.h().a(ImageStrategyDecider.decideUrl(str, 300, 300, null)).bitmapProcessors(new com.taobao.phenix.compat.effects.b(p(), 15)).into(imageView, 2.0f);
                imageView.setScaleX(3.0f);
                imageView.setScaleY(3.0f);
                o.a(g(), imageView);
            }
        }
        bl blVar3 = this.h;
        if (blVar3 != null) {
            blVar3.a();
        }
        bl blVar4 = this.h;
        if (blVar4 != null) {
            blVar4.d();
        }
        FrameLayout g = g();
        bl blVar5 = this.h;
        g.addView(blVar5 == null ? null : blVar5.l(), new FrameLayout.LayoutParams(-1, i2, 17));
        TUrlImageView tUrlImageView3 = new TUrlImageView(p());
        tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Km8yT71aV1JdMdoKB_!!6000000003334-2-tps-124-140.png");
        o.d(tUrlImageView3);
        t tVar2 = t.INSTANCE;
        this.p = tUrlImageView3;
        FrameLayout g2 = g();
        TUrlImageView tUrlImageView4 = this.p;
        if (tUrlImageView4 == null) {
            q.b("pauseButton");
            throw null;
        }
        g2.addView(tUrlImageView4, new FrameLayout.LayoutParams(o.a((Number) 47), o.a((Number) 55), 17));
        ClickView clickView = new ClickView(p());
        clickView.setOnClickListener(new a());
        o.a(g(), clickView);
        TUrlImageView tUrlImageView5 = new TUrlImageView(p());
        this.u = tUrlImageView5;
        if (z) {
            tUrlImageView5.setImageUrl(this.v);
        } else {
            tUrlImageView5.setImageUrl(this.w);
        }
        tUrlImageView5.setOnClickListener(new b());
        int a2 = o.a((Number) 30);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.topMargin = this.t;
        layoutParams.gravity = 8388661;
        layoutParams.rightMargin = o.a((Number) 15);
        g().addView(tUrlImageView5, layoutParams);
    }

    private final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.u;
        if (tUrlImageView == null) {
            q.b("muteButton");
            throw null;
        }
        tUrlImageView.setImageUrl(this.w);
        bl blVar = this.h;
        if (blVar != null) {
            blVar.e(false);
        }
        h.a(false);
    }

    private final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.u;
        if (tUrlImageView == null) {
            q.b("muteButton");
            throw null;
        }
        tUrlImageView.setImageUrl(this.v);
        bl blVar = this.h;
        if (blVar != null) {
            blVar.e(true);
        }
        h.a(true);
    }

    private final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else if (!l()) {
        } else {
            if (this.o) {
                bl blVar = this.h;
                if (blVar != null) {
                    blVar.e();
                }
            } else {
                bl blVar2 = this.h;
                if (blVar2 != null) {
                    blVar2.c();
                }
            }
            TUrlImageView tUrlImageView = this.p;
            if (tUrlImageView != null) {
                o.d(tUrlImageView);
            } else {
                q.b("pauseButton");
                throw null;
            }
        }
    }

    private final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        bl blVar = this.h;
        if (blVar != null) {
            blVar.f();
        }
        TUrlImageView tUrlImageView = this.p;
        if (tUrlImageView != null) {
            o.b(tUrlImageView);
        } else {
            q.b("pauseButton");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        super.didAppear();
        play();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        super.didDisappear();
        pause();
        TUrlImageView tUrlImageView = this.p;
        if (tUrlImageView != null) {
            o.d(tUrlImageView);
        } else {
            q.b("pauseButton");
            throw null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            x();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            y();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        bl blVar = this.h;
        if (blVar != null) {
            blVar.e(z);
        }
        if (z) {
            w();
        } else {
            v();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        super.onDestroyed();
        bl blVar = this.h;
        if (blVar != null) {
            blVar.f();
        }
        bl blVar2 = this.h;
        if (blVar2 == null) {
            return;
        }
        blVar2.m();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        try {
            Result.a aVar = Result.Companion;
            x();
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        y();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public ShopWrapWebView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("641fdd50", new Object[]{this});
        }
        if (o() == null) {
            a((ShopWrapWebView) new NewVideoViewWebView(this, p()));
            ShopWrapWebView o = o();
            q.a(o);
            o.getShopLoftWebViewBizAdapter().a(new ShopLoftNewVideoViewWithDW$getWebView$1(this));
            ShopWrapWebView o2 = o();
            q.a(o2);
            o2.getShopLoftWebViewBizAdapter().a(new ShopLoftNewVideoViewWithDW$getWebView$2(this));
            ShopWrapWebView o3 = o();
            q.a(o3);
            o3.getShopLoftWebViewBizAdapter().b(new ShopLoftNewVideoViewWithDW$getWebView$3(this));
            ShopWrapWebView o4 = o();
            q.a(o4);
            o4.getShopLoftWebViewBizAdapter().c(new ShopLoftNewVideoViewWithDW$getWebView$4(this));
            ShopWrapWebView o5 = o();
            q.a(o5);
            o5.getShopLoftWebViewBizAdapter().b(new ShopLoftNewVideoViewWithDW$getWebView$5(this));
        }
        ShopWrapWebView o6 = o();
        q.a(o6);
        return o6;
    }

    private final JSONObject z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c031f21", new Object[]{this});
        }
        Pair[] pairArr = new Pair[3];
        bl blVar = this.h;
        Boolean bool = null;
        pairArr[0] = kotlin.j.a("totalTime", blVar == null ? null : Long.valueOf(blVar.q()));
        bl blVar2 = this.h;
        pairArr[1] = kotlin.j.a("currentTime", blVar2 == null ? null : Integer.valueOf(blVar2.j()));
        bl blVar3 = this.h;
        if (blVar3 != null) {
            bool = Boolean.valueOf(blVar3.k());
        }
        pairArr[2] = kotlin.j.a("isPlaying", bool);
        return com.alibaba.triver.triver_shop.newShop.ext.d.a(pairArr);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public JSONObject q_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3ec6f2b5", new Object[]{this});
        }
        bl blVar = this.h;
        if (blVar != null) {
            return com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("current_play_time", Integer.valueOf(blVar.j())));
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c.b
    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : q_();
    }

    /* loaded from: classes3.dex */
    public final class NewVideoViewWebView extends ShopWrapWebView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean hasMove;
        private float moveSize;
        private float startX;
        private float startY;
        public final /* synthetic */ ShopLoftNewVideoViewWithDW this$0;
        private int touchSlop;

        static {
            kge.a(-1835324031);
        }

        public static /* synthetic */ Object ipc$super(NewVideoViewWebView newVideoViewWebView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1253202540) {
                if (hashCode != 143825882) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            }
            return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewVideoViewWebView(ShopLoftNewVideoViewWithDW this$0, Context context) {
            super(context);
            q.d(this$0, "this$0");
            q.d(context, "context");
            this.this$0 = this$0;
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
        public boolean coreDispatchTouchEvent(MotionEvent event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, event})).booleanValue();
            }
            q.d(event, "event");
            if (event.getAction() == 0) {
                this.moveSize = 0.0f;
                this.hasMove = false;
                this.startX = event.getX();
                this.startY = event.getY();
                RecyclerView l = o.l(this);
                if (l != null) {
                    l.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (event.getAction() == 1) {
                RecyclerView l2 = o.l(this);
                if (l2 != null) {
                    l2.requestDisallowInterceptTouchEvent(false);
                }
                if (this.hasMove) {
                    return super.coreDispatchTouchEvent(event);
                }
            }
            if (event.getAction() == 2 && !this.hasMove && com.alibaba.triver.triver_shop.newShop.ext.b.a(this.startX, this.startY, event.getX(), event.getY()) >= this.touchSlop) {
                this.hasMove = true;
            }
            return super.coreDispatchTouchEvent(event);
        }

        @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
        public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            RecyclerView l;
            RecyclerView l2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
            }
            if ((i3 == 0 && i < 0) || (i3 == i5 && i > 0)) {
                return false;
            }
            if (i4 == 0 && i2 <= 0 && (l2 = o.l(this)) != null) {
                l2.requestDisallowInterceptTouchEvent(false);
            }
            if (i4 == i6 && i2 > 0 && (l = o.l(this)) != null) {
                l.requestDisallowInterceptTouchEvent(false);
            }
            return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.o = true;
        ShopWrapWebView o = o();
        if (o == null) {
            return;
        }
        bl blVar = this.h;
        int q = blVar == null ? 0 : (int) blVar.q();
        bl blVar2 = this.h;
        if (blVar2 != null) {
            i = blVar2.j();
        }
        g.a(o, q, i);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopWrapWebView o = o();
        if (o == null) {
            return;
        }
        g.c(o);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        ShopWrapWebView o = o();
        if (o == null) {
            return;
        }
        bl blVar = this.h;
        int q = blVar == null ? 0 : (int) blVar.q();
        bl blVar2 = this.h;
        if (blVar2 != null) {
            i = blVar2.j();
        }
        g.a(o, q, i);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        ShopWrapWebView o;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            return;
        }
        bl blVar = this.h;
        if (blVar == null || !blVar.k()) {
            z = false;
        }
        if (!z || (o = o()) == null) {
            return;
        }
        bl blVar2 = this.h;
        if (blVar2 != null) {
            i2 = (int) blVar2.q();
        }
        g.a(o, i2, i);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        ceg.a aVar = ceg.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("onDWError : ");
        sb.append((Object) (obj == null ? null : obj.toString()));
        sb.append(" , ");
        sb.append(i);
        sb.append(" , ");
        sb.append(i2);
        aVar.b(sb.toString());
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        d dVar = this.r;
        if (dVar == null) {
            q.b("videoPlayController");
            throw null;
        } else if (dVar.b()) {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new ShopLoftNewVideoViewWithDW$onVideoComplete$1(this));
        } else {
            play();
        }
    }
}
