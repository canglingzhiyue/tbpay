package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.g;
import com.alibaba.triver.triver_shop.newShop.ClickView;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaPlayCenter;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mediaplay.MediaType;
import com.taobao.mediaplay.player.MediaAspectRatio;
import com.taobao.mediaplay.player.e;
import com.taobao.mediaplay.player.f;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Pair;
import kotlin.Result;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.cen;
import tb.eby;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes3.dex */
public final class ShopLoftNewVideoView extends ShopLoftViewNewStyleBaseView implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MediaPlayCenter h;
    private String i;
    private String j;
    private String k;
    private int m;
    private int n;
    private TUrlImageView o;
    private TUrlImageView p;
    private com.alibaba.triver.triver_shop.container.shopLoft.newStyle.d q;
    private boolean t;
    private float l = 1.7777778f;
    private final String r = "https://img.alicdn.com/imgextra/i3/O1CN01mZTjld1GqHPdygPdg_!!6000000000673-2-tps-84-84.png";
    private final String s = "https://img.alicdn.com/imgextra/i3/O1CN01Dw6Ypv1R3Em1OMooC_!!6000000002055-2-tps-84-84.png";

    /* loaded from: classes3.dex */
    public static final class a implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // com.taobao.mediaplay.player.f
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            MediaPlayCenter c = ShopLoftNewVideoView.c(ShopLoftNewVideoView.this);
            if (c == null) {
                q.b("mediaPlayCenter");
                throw null;
            } else if (c.isPlaying()) {
                ShopLoftNewVideoView.d(ShopLoftNewVideoView.this);
            } else {
                ShopLoftNewVideoView.a(ShopLoftNewVideoView.this);
                com.alibaba.triver.triver_shop.container.shopLoft.newStyle.d e = ShopLoftNewVideoView.e(ShopLoftNewVideoView.this);
                if (e != null) {
                    e.a(true);
                } else {
                    q.b("videoPlayController");
                    throw null;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (ShopLoftNewVideoView.this.b()) {
                ShopLoftNewVideoView.f(ShopLoftNewVideoView.this);
            } else {
                ShopLoftNewVideoView.g(ShopLoftNewVideoView.this);
            }
        }
    }

    static {
        kge.a(-837559149);
        kge.a(-613305621);
    }

    public static /* synthetic */ Object ipc$super(ShopLoftNewVideoView shopLoftNewVideoView, String str, Object... objArr) {
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

    @Override // com.taobao.mediaplay.player.e
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
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

    public static final /* synthetic */ void a(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e093a8e6", new Object[]{shopLoftNewVideoView});
        } else {
            shopLoftNewVideoView.x();
        }
    }

    public static final /* synthetic */ MediaPlayCenter c(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaPlayCenter) ipChange.ipc$dispatch("2a7bcfe", new Object[]{shopLoftNewVideoView}) : shopLoftNewVideoView.h;
    }

    public static final /* synthetic */ void d(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17770c3", new Object[]{shopLoftNewVideoView});
        } else {
            shopLoftNewVideoView.y();
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.container.shopLoft.newStyle.d e(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.container.shopLoft.newStyle.d) ipChange.ipc$dispatch("46c2602b", new Object[]{shopLoftNewVideoView}) : shopLoftNewVideoView.q;
    }

    public static final /* synthetic */ void f(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb9f601", new Object[]{shopLoftNewVideoView});
        } else {
            shopLoftNewVideoView.v();
        }
    }

    public static final /* synthetic */ void g(ShopLoftNewVideoView shopLoftNewVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825b38a0", new Object[]{shopLoftNewVideoView});
        } else {
            shopLoftNewVideoView.w();
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.t;
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
        this.q = (com.alibaba.triver.triver_shop.container.shopLoft.newStyle.d) a2;
        t();
        u();
        q();
    }

    private final void t() {
        Integer d2;
        int i;
        Integer d3;
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
        this.m = (string == null || (d2 = n.d(string)) == null) ? 0 : d2.intValue();
        String string2 = j.getString("width");
        if (string2 != null && (d3 = n.d(string2)) != null) {
            i2 = d3.intValue();
        }
        this.n = i2;
        int i3 = this.m;
        if (i3 == 0 || (i = this.n) == 0) {
            return;
        }
        this.l = i3 / i;
    }

    private final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        int a2 = o.a((Number) 30) + o.a(p()) + o.a((Number) 30);
        this.t = h.b();
        this.h = new MediaPlayCenter(p());
        String str = this.i;
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter.setMediaId(this.j);
        MediaPlayCenter mediaPlayCenter2 = this.h;
        if (mediaPlayCenter2 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter2.setMediaUrl(str);
        MediaPlayCenter mediaPlayCenter3 = this.h;
        if (mediaPlayCenter3 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter3.setMediaType(MediaType.VIDEO);
        MediaPlayCenter mediaPlayCenter4 = this.h;
        if (mediaPlayCenter4 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter4.setConfigGroup("DW");
        MediaPlayCenter mediaPlayCenter5 = this.h;
        if (mediaPlayCenter5 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter5.setNeedPlayControlView(false);
        MediaPlayCenter mediaPlayCenter6 = this.h;
        if (mediaPlayCenter6 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter6.hideController();
        MediaPlayCenter mediaPlayCenter7 = this.h;
        if (mediaPlayCenter7 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter7.setBusinessId("shop_mini_video");
        if (cen.Companion.e()) {
            MediaPlayCenter mediaPlayCenter8 = this.h;
            if (mediaPlayCenter8 == null) {
                q.b("mediaPlayCenter");
                throw null;
            }
            mediaPlayCenter8.setUseShortAudioFocus(true);
        }
        MediaPlayCenter mediaPlayCenter9 = this.h;
        if (mediaPlayCenter9 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter9.setBizCode(cen.Companion.e() ? "TRIVER_SHOP_BIGCARD" : "TRIVER_SHOP_BIGCARD_TEMP");
        MediaPlayCenter mediaPlayCenter10 = this.h;
        if (mediaPlayCenter10 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter10.setMediaSource("CDNVideo");
        MediaPlayCenter mediaPlayCenter11 = this.h;
        if (mediaPlayCenter11 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter11.setPlayerType(3);
        MediaPlayCenter mediaPlayCenter12 = this.h;
        if (mediaPlayCenter12 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter12.setScenarioType(0);
        MediaPlayCenter mediaPlayCenter13 = this.h;
        if (mediaPlayCenter13 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter13.setVideoLoop(true);
        MediaPlayCenter mediaPlayCenter14 = this.h;
        if (mediaPlayCenter14 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter14.setMute(this.t);
        MediaPlayCenter mediaPlayCenter15 = this.h;
        if (mediaPlayCenter15 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter15.setMediaAspectRatio(MediaAspectRatio.DW_CENTER_CROP);
        MediaPlayCenter mediaPlayCenter16 = this.h;
        if (mediaPlayCenter16 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter16.setVideoRecycleListener(a.INSTANCE);
        String str2 = this.k;
        if (str2 != null) {
            com.taobao.phenix.intf.b.h().a(str2).succListener(new b()).fetch();
            if (l.b()) {
                TUrlImageView tUrlImageView = new TUrlImageView(p());
                tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01xenXqr1O62GkoCtKn_!!6000000001655-2-tps-750-1334.png");
                o.a(g(), tUrlImageView);
            } else {
                ImageView imageView = new ImageView(p());
                com.taobao.phenix.intf.b.h().a(ImageStrategyDecider.decideUrl(str2, 300, 300, null)).bitmapProcessors(new com.taobao.phenix.compat.effects.b(p(), 15)).into(imageView, 2.0f);
                imageView.setScaleX(3.0f);
                imageView.setScaleY(3.0f);
                o.a(g(), imageView);
            }
        }
        MediaPlayCenter mediaPlayCenter17 = this.h;
        if (mediaPlayCenter17 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter17.setup();
        MediaPlayCenter mediaPlayCenter18 = this.h;
        if (mediaPlayCenter18 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter18.prepareToFirstFrame();
        int i = (this.m == 0 || this.n == 0) ? -2 : (int) (com.alibaba.triver.triver_shop.newShop.ext.b.b((Activity) p()).widthPixels * this.l);
        FrameLayout g = g();
        MediaPlayCenter mediaPlayCenter19 = this.h;
        if (mediaPlayCenter19 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        g.addView(mediaPlayCenter19.getView(), new FrameLayout.LayoutParams(-1, i, 17));
        TUrlImageView tUrlImageView2 = new TUrlImageView(p());
        tUrlImageView2.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01Km8yT71aV1JdMdoKB_!!6000000003334-2-tps-124-140.png");
        o.d(tUrlImageView2);
        t tVar = t.INSTANCE;
        this.o = tUrlImageView2;
        FrameLayout g2 = g();
        TUrlImageView tUrlImageView3 = this.o;
        if (tUrlImageView3 == null) {
            q.b("pauseButton");
            throw null;
        }
        g2.addView(tUrlImageView3, new FrameLayout.LayoutParams(o.a((Number) 47), o.a((Number) 55), 17));
        ClickView clickView = new ClickView(p());
        clickView.setOnClickListener(new c());
        o.a(g(), clickView);
        MediaPlayCenter mediaPlayCenter20 = this.h;
        if (mediaPlayCenter20 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter20.setMediaLifecycleListener(this);
        TUrlImageView tUrlImageView4 = new TUrlImageView(p());
        this.p = tUrlImageView4;
        if (b()) {
            tUrlImageView4.setImageUrl(this.r);
        } else {
            tUrlImageView4.setImageUrl(this.s);
        }
        tUrlImageView4.setOnClickListener(new d());
        int a3 = o.a((Number) 30);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a3, a3);
        layoutParams.topMargin = a2;
        layoutParams.gravity = 8388661;
        layoutParams.rightMargin = o.a((Number) 15);
        g().addView(tUrlImageView4, layoutParams);
    }

    /* loaded from: classes3.dex */
    public static final class b<T extends com.taobao.phenix.intf.event.d> implements com.taobao.phenix.intf.event.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(com.taobao.phenix.intf.event.d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, dVar})).booleanValue() : a((SuccPhenixEvent) dVar);
        }

        public final boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            MediaPlayCenter c = ShopLoftNewVideoView.c(ShopLoftNewVideoView.this);
            if (c != null) {
                c.setCoverImg(succPhenixEvent.getDrawable(), true);
                return true;
            }
            q.b("mediaPlayCenter");
            throw null;
        }
    }

    private final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.p;
        if (tUrlImageView == null) {
            q.b("muteButton");
            throw null;
        }
        tUrlImageView.setImageUrl(this.s);
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter.mute(false);
        h.a(false);
        this.t = false;
    }

    private final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.p;
        if (tUrlImageView == null) {
            q.b("muteButton");
            throw null;
        }
        tUrlImageView.setImageUrl(this.r);
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter.mute(true);
        h.a(true);
        this.t = true;
    }

    private final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else if (!l()) {
        } else {
            MediaPlayCenter mediaPlayCenter = this.h;
            if (mediaPlayCenter == null) {
                q.b("mediaPlayCenter");
                throw null;
            }
            mediaPlayCenter.start();
            TUrlImageView tUrlImageView = this.o;
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
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter.pause();
        TUrlImageView tUrlImageView = this.o;
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
        this.t = h.b();
        if (this.t) {
            w();
        } else {
            v();
        }
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
        TUrlImageView tUrlImageView = this.o;
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
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter != null) {
            mediaPlayCenter.mute(z);
        } else {
            q.b("mediaPlayCenter");
            throw null;
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
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        mediaPlayCenter.pause();
        MediaPlayCenter mediaPlayCenter2 = this.h;
        if (mediaPlayCenter2 != null) {
            mediaPlayCenter2.destroy();
        } else {
            q.b("mediaPlayCenter");
            throw null;
        }
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
            o.getShopLoftWebViewBizAdapter().a(new ShopLoftNewVideoView$getWebView$1(this));
            ShopWrapWebView o2 = o();
            q.a(o2);
            o2.getShopLoftWebViewBizAdapter().a(new ShopLoftNewVideoView$getWebView$2(this));
        }
        ShopWrapWebView o3 = o();
        q.a(o3);
        return o3;
    }

    private final JSONObject z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c031f21", new Object[]{this});
        }
        Pair[] pairArr = new Pair[3];
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        pairArr[0] = j.a("totalTime", Integer.valueOf(mediaPlayCenter.getDuration()));
        MediaPlayCenter mediaPlayCenter2 = this.h;
        if (mediaPlayCenter2 == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        pairArr[1] = j.a("currentTime", Integer.valueOf(mediaPlayCenter2.getCurrentPosition()));
        MediaPlayCenter mediaPlayCenter3 = this.h;
        if (mediaPlayCenter3 != null) {
            pairArr[2] = j.a("isPlaying", Boolean.valueOf(mediaPlayCenter3.isPlaying()));
            return com.alibaba.triver.triver_shop.newShop.ext.d.a(pairArr);
        }
        q.b("mediaPlayCenter");
        throw null;
    }

    /* loaded from: classes3.dex */
    public final class NewVideoViewWebView extends ShopWrapWebView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean hasMove;
        private float moveSize;
        private float startX;
        private float startY;
        public final /* synthetic */ ShopLoftNewVideoView this$0;
        private int touchSlop;

        static {
            kge.a(-156126648);
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
        public NewVideoViewWebView(ShopLoftNewVideoView this$0, Context context) {
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

    @Override // com.taobao.mediaplay.player.e
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        ShopWrapWebView o = o();
        if (o == null) {
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        int duration = mediaPlayCenter.getDuration();
        MediaPlayCenter mediaPlayCenter2 = this.h;
        if (mediaPlayCenter2 != null) {
            g.a(o, duration, mediaPlayCenter2.getCurrentPosition());
        } else {
            q.b("mediaPlayCenter");
            throw null;
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            return;
        }
        ShopWrapWebView o = o();
        if (o == null) {
            return;
        }
        g.c(o);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        ShopWrapWebView o = o();
        if (o == null) {
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter == null) {
            q.b("mediaPlayCenter");
            throw null;
        }
        int duration = mediaPlayCenter.getDuration();
        MediaPlayCenter mediaPlayCenter2 = this.h;
        if (mediaPlayCenter2 != null) {
            g.a(o, duration, mediaPlayCenter2.getCurrentPosition());
        } else {
            q.b("mediaPlayCenter");
            throw null;
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            return;
        }
        ShopWrapWebView o = o();
        if (o == null) {
            return;
        }
        MediaPlayCenter mediaPlayCenter = this.h;
        if (mediaPlayCenter != null) {
            g.a(o, mediaPlayCenter.getDuration(), i);
        } else {
            q.b("mediaPlayCenter");
            throw null;
        }
    }
}
