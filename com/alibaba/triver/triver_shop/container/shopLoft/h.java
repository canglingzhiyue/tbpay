package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareContent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class h implements com.alibaba.triver.triver_shop.container.shopLoft.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f3727a;
    private TBLiveOpenCardView b;
    private ViewGroup c;
    private JSONObject d;
    private com.alibaba.triver.triver_shop.newShop.data.d e;
    private b.a f;
    private View g;
    private FrameLayout h;
    private View i;

    /* loaded from: classes3.dex */
    public interface a extends b.a.InterfaceC0126a {
        void b();

        void c();
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            h.a(h.this);
            h.this.play();
        }
    }

    static {
        kge.a(-316991494);
        kge.a(-563039837);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
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
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : "";
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
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

    public static final /* synthetic */ void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("558a16e3", new Object[]{hVar});
        } else {
            hVar.d();
        }
    }

    public static final /* synthetic */ View b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b41b09c4", new Object[]{hVar}) : hVar.i;
    }

    public static final /* synthetic */ void c(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f644521", new Object[]{hVar});
        } else {
            hVar.f();
        }
    }

    public static final /* synthetic */ void d(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc515c40", new Object[]{hVar});
        } else {
            hVar.e();
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View inflate = View.inflate(this.f3727a, R.layout.view_tab3_live_error_layout, null);
        ((TextView) inflate.findViewById(R.id.shop_live_retry_text)).setOnClickListener(new b());
        TextView goHomePageText = (TextView) inflate.findViewById(R.id.shop_live_go_home_page_text);
        q.b(goHomePageText, "goHomePageText");
        o.e(goHomePageText);
        this.g = inflate;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        TBLiveOpenCardView tBLiveOpenCardView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
        } else if (context == null) {
        } else {
            this.f3727a = context;
            this.c = new FrameLayout(context);
            this.f = aVar;
            b();
            c();
            if (aVar != null) {
                b.a.InterfaceC0126a a2 = aVar.a(EmbedShopLoftComponent.c.class.getName());
                if (a2 != null && (a2 instanceof EmbedShopLoftComponent.c)) {
                    this.e = ((EmbedShopLoftComponent.c) a2).b();
                }
                b.a.InterfaceC0126a a3 = aVar.a(EmbedShopLoftComponent.b.class.getName());
                if (a3 != null && (a3 instanceof EmbedShopLoftComponent.b)) {
                    this.h = ((EmbedShopLoftComponent.b) a3).b();
                }
            }
            this.b = new TBLiveOpenCardView(context);
            TBLiveOpenCardView tBLiveOpenCardView2 = this.b;
            if (tBLiveOpenCardView2 != null) {
                tBLiveOpenCardView2.setSubBusinessType("ShopSampleCard");
            }
            ViewGroup viewGroup = this.c;
            q.a(viewGroup);
            viewGroup.addView(this.b);
            this.d = jSONObject;
            String string = jSONObject == null ? null : jSONObject.getString("coverPicUrl");
            if (!TextUtils.isEmpty(string) && (tBLiveOpenCardView = this.b) != null) {
                tBLiveOpenCardView.setImageUrl(string);
            }
            TBLiveOpenCardView tBLiveOpenCardView3 = this.b;
            if (tBLiveOpenCardView3 != null) {
                tBLiveOpenCardView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            TBLiveOpenCardView tBLiveOpenCardView4 = this.b;
            if (tBLiveOpenCardView4 != null) {
                tBLiveOpenCardView4.setPlayerData(jSONObject);
            }
            TBLiveOpenCardView tBLiveOpenCardView5 = this.b;
            q.a(tBLiveOpenCardView5);
            tBLiveOpenCardView5.setPlayVideo(true);
            View view = new View(context);
            o.a(view, new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, kotlin.collections.g.a(new Integer[]{Integer.valueOf(Color.parseColor("#FF000000")), Integer.valueOf(Color.parseColor("#00000000"))})));
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.addView(view, o.a(0, o.e((Number) 265), 0, 0, 0, 0, 0, 125, null));
        }
    }

    private final void c() {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Context context = this.f3727a;
        View view = null;
        if (context != null && (a2 = o.a(context, R.layout.view_tab3_live_loading_layout)) != null) {
            TUrlImageView tUrlImageView = (TUrlImageView) a2.findViewById(R.id.view_tab3_live_progress_icon);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01Lz8fBP1FtCKzfI6Ig_!!6000000000544-54-tps-72-72.apng");
                tUrlImageView.setSkipAutoSize(true);
            }
            t tVar = t.INSTANCE;
            view = a2;
        }
        this.i = view;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView = this.b;
        if (tBLiveOpenCardView != null && tBLiveOpenCardView.isPlaying()) {
            z = true;
        }
        if (z) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.h.h(this.e);
        TBLiveOpenCardView tBLiveOpenCardView2 = this.b;
        if (tBLiveOpenCardView2 == null) {
            return;
        }
        tBLiveOpenCardView2.playVideo(new c(), new d());
    }

    /* loaded from: classes3.dex */
    public static final class c implements com.taobao.taolive.uikit.api.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.taolive.uikit.api.a
        public void onInfo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44be144f", new Object[]{this, new Integer(i)});
                return;
            }
            ceg.Companion.b(q.a("ShopNewLiveLoftView tbLiveOpenCardView onInfo: ", (Object) Integer.valueOf(i)));
            if (i != 100005) {
                return;
            }
            View b = h.b(h.this);
            if (b != null) {
                o.j(b);
            }
            h.c(h.this);
        }

        @Override // com.taobao.taolive.uikit.api.a
        public void onError(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
                return;
            }
            ceg.Companion.b(q.a("ShopNewLiveLoftView tbLiveOpenCardView onError: ", (Object) Integer.valueOf(i)));
            h.d(h.this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements com.taobao.taolive.uikit.api.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.taolive.uikit.api.b
        public void onMediaError(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            ceg.a aVar = ceg.Companion;
            aVar.b("ShopNewLiveLoftView tbLiveOpenCardView onMediaError: " + i + ", " + i2);
            if (i == -10604) {
                h.this.a();
            } else {
                h.d(h.this);
            }
        }

        @Override // com.taobao.taolive.uikit.api.b
        public void onMediaInfo(long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
                return;
            }
            ceg.a aVar = ceg.Companion;
            aVar.b("ShopNewLiveLoftView tbLiveOpenCardView onMediaInfo: " + j + ", " + j2 + ", " + j3 + ", " + obj);
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            FrameLayout frameLayout2 = frameLayout;
            View view = this.i;
            if (view == null) {
                return;
            }
            o.a(frameLayout2, view);
        }
        View view2 = this.g;
        if (view2 != null) {
            o.j(view2);
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopNewLiveLoftView$showLoadingView$1(this), 5000L);
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view != null) {
            o.j(view);
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            FrameLayout frameLayout2 = frameLayout;
            View view2 = this.g;
            if (view2 == null) {
                return;
            }
            o.a(frameLayout2, view2);
        }
        a g = g();
        if (g == null) {
            return;
        }
        g.c();
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view != null) {
            o.j(view);
        }
        a g = g();
        if (g == null) {
            return;
        }
        g.b();
    }

    private final a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1b31aa8c", new Object[]{this});
        }
        b.a aVar = this.f;
        b.a.InterfaceC0126a a2 = aVar == null ? null : aVar.a(a.class.getName());
        if (!(a2 instanceof a)) {
            return null;
        }
        return (a) a2;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        TBLiveOpenCardView tBLiveOpenCardView;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView2 = this.b;
        if (tBLiveOpenCardView2 != null && !tBLiveOpenCardView2.isPlaying()) {
            z = true;
        }
        if (z || (tBLiveOpenCardView = this.b) == null) {
            return;
        }
        tBLiveOpenCardView.stopVideo();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView = this.b;
        if (tBLiveOpenCardView == null) {
            return;
        }
        tBLiveOpenCardView.setMuted(z);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        TBLiveOpenCardView tBLiveOpenCardView = this.b;
        if (tBLiveOpenCardView == null) {
            return;
        }
        tBLiveOpenCardView.destroy();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("16970404", new Object[]{this}) : new LinkedHashMap();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            o.j(viewGroup);
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            o.k(viewGroup2);
        }
        return this.c;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this}) : new ShareContent();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String str = null;
        View inflate = View.inflate(this.f3727a, R.layout.view_tab3_live_end_layout, null);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            viewGroup2.addView(inflate, o.a(0, 0, 0, 0, 0, 0, 0, 127, null));
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.e;
        if (dVar != null) {
            str = dVar.U();
        }
        if (str == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.a.a(this.f3727a, "mtop.mediaplatform.live.getshopliveinfoList", AfcCustomSdk.SDK_VERSION, ai.b(kotlin.j.a("sellerId", str), kotlin.j.a("pre", "true")), new ShopNewLiveLoftView$onLiveEnd$1(inflate), ShopNewLiveLoftView$onLiveEnd$2.INSTANCE, false, false, false, null, false, null, RSoException.ERROR_LOAD_FALLBACK_SYSTEM_LOAD_FAILED, null);
    }
}
