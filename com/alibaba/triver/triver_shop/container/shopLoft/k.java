package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareContent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class k implements com.alibaba.triver.triver_shop.container.shopLoft.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f3733a;
    private TBLVOpenShopCardComponent b;
    private ViewGroup c;
    private com.alibaba.triver.triver_shop.newShop.data.d d;
    private b.a e;
    private View f;
    private FrameLayout g;
    private View h;
    private boolean i;
    private rul<? super JSONObject, t> j;
    private boolean k;

    /* loaded from: classes3.dex */
    public interface a extends b.a.InterfaceC0126a {
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
            k.a(k.this);
            k.this.play();
        }
    }

    static {
        kge.a(1229951731);
        kge.a(-563039837);
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

    public static final /* synthetic */ void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("558b7400", new Object[]{kVar});
        } else {
            kVar.e();
        }
    }

    public static final /* synthetic */ View b(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("47ac39a1", new Object[]{kVar}) : kVar.h;
    }

    public static final /* synthetic */ void c(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f65a23e", new Object[]{kVar});
        } else {
            kVar.g();
        }
    }

    public static final /* synthetic */ void d(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc52b95d", new Object[]{kVar});
        } else {
            kVar.f();
        }
    }

    public final rul<JSONObject, t> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("f0a3bb5", new Object[]{this}) : this.j;
    }

    public final void a(rul<? super JSONObject, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
        } else {
            this.j = rulVar;
        }
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View inflate = View.inflate(this.f3733a, R.layout.view_tab3_live_error_layout, null);
        ((TextView) inflate.findViewById(R.id.shop_live_retry_text)).setOnClickListener(new b());
        TextView goHomePageText = (TextView) inflate.findViewById(R.id.shop_live_go_home_page_text);
        q.b(goHomePageText, "goHomePageText");
        o.e(goHomePageText);
        this.f = inflate;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
        } else if (context == null) {
        } else {
            ceg.Companion.a(q.a("ggg ShopLiveOpenCardView initWithData ", (Object) jSONObject));
            this.f3733a = context;
            this.c = new FrameLayout(context);
            this.e = aVar;
            c();
            d();
            if (aVar != null) {
                b.a.InterfaceC0126a a2 = aVar.a(EmbedShopLoftComponent.c.class.getName());
                if (a2 != null && (a2 instanceof EmbedShopLoftComponent.c)) {
                    this.d = ((EmbedShopLoftComponent.c) a2).b();
                }
                b.a.InterfaceC0126a a3 = aVar.a(EmbedShopLoftComponent.b.class.getName());
                if (a3 != null && (a3 instanceof EmbedShopLoftComponent.b)) {
                    this.g = ((EmbedShopLoftComponent.b) a3).b();
                }
            }
            View view = null;
            Map c2 = jSONObject == null ? null : ai.c(jSONObject);
            if ((jSONObject == null ? null : jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID)) == null && c2 != null) {
                c2.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, jSONObject.getString("id"));
            }
            if (c2 != null) {
                c2.put("initMuteStatus", true);
            }
            if (c2 != null) {
                c2.put("shopCardDisableGoodsCard", false);
            }
            if (c2 != null) {
                c2.put("shopCardDisableComment", Boolean.valueOf(this.k));
            }
            if (c2 != null) {
                c2.put("liveUrlList", (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("queryParam")) == null) ? null : jSONObject2.getJSONArray("liveUrlList"));
            }
            if (c2 != null) {
                c2.put("shopBottomOffset", Integer.valueOf(o.a((Number) 30)));
            }
            this.b = new TBLVOpenShopCardComponent(context, c2);
            TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
            if (tBLVOpenShopCardComponent != null) {
                tBLVOpenShopCardComponent.a((TBLVOpenShopCardComponent.a) new c());
            }
            ViewGroup viewGroup = this.c;
            q.a(viewGroup);
            TBLVOpenShopCardComponent tBLVOpenShopCardComponent2 = this.b;
            if (tBLVOpenShopCardComponent2 != null) {
                view = tBLVOpenShopCardComponent2.m();
            }
            viewGroup.addView(view);
            View view2 = new View(context);
            o.a(view2, new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, kotlin.collections.g.a(new Integer[]{Integer.valueOf(Color.parseColor("#FF000000")), Integer.valueOf(Color.parseColor("#00000000"))})));
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.addView(view2, o.a(0, o.e((Number) 265), 0, 0, 0, 0, 0, 125, null));
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements TBLVOpenShopCardComponent.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            View b = k.b(k.this);
            if (b != null) {
                o.j(b);
            }
            k.c(k.this);
        }

        @Override // com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                k.this.b();
            }
        }

        @Override // com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                k.d(k.this);
            }
        }

        @Override // com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.a
        public void a(TBLVOpenShopCardComponent.TBLVOpenShopCardComponentClickType tBLVOpenShopCardComponentClickType, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("482dad03", new Object[]{this, tBLVOpenShopCardComponentClickType, map});
                return;
            }
            Object obj = null;
            if (tBLVOpenShopCardComponentClickType == TBLVOpenShopCardComponent.TBLVOpenShopCardComponentClickType.DEFAULT) {
                rul<JSONObject, t> a2 = k.this.a();
                if (a2 == null) {
                    return;
                }
                a2.mo2421invoke(null);
            } else if (tBLVOpenShopCardComponentClickType == TBLVOpenShopCardComponent.TBLVOpenShopCardComponentClickType.GOODS_CARD) {
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                if (map != null) {
                    obj = map.get("itemId");
                }
                jSONObject.put(aw.PARAM_ITEM_IDS, (Object) String.valueOf(obj));
                jSONObject.put(aw.PARAM_ITEM_HOLD_TYPE, (Object) "insideDetail");
                rul<JSONObject, t> a3 = k.this.a();
                if (a3 == null) {
                    return;
                }
                a3.mo2421invoke(jSONObject);
            }
        }
    }

    private final void d() {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Context context = this.f3733a;
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
        this.h = view;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent == null) {
            return;
        }
        tBLVOpenShopCardComponent.i();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        this.i = true;
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent == null) {
            return;
        }
        tBLVOpenShopCardComponent.j();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent == null) {
            return;
        }
        tBLVOpenShopCardComponent.k();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        this.i = false;
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent == null) {
            return;
        }
        tBLVOpenShopCardComponent.l();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.h.h(this.d);
        if (!this.i) {
            willAppear();
            didAppear();
        }
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent == null) {
            return;
        }
        tBLVOpenShopCardComponent.cQ_();
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            FrameLayout frameLayout2 = frameLayout;
            View view = this.h;
            if (view == null) {
                return;
            }
            o.a(frameLayout2, view);
        }
        View view2 = this.f;
        if (view2 != null) {
            o.j(view2);
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopLiveOpenCardView$showLoadingView$1(this), 5000L);
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            o.j(view);
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            FrameLayout frameLayout2 = frameLayout;
            View view2 = this.f;
            if (view2 == null) {
                return;
            }
            o.a(frameLayout2, view2);
        }
        h();
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            o.j(view);
        }
        h();
    }

    private final a h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2be8d46a", new Object[]{this});
        }
        b.a aVar = this.e;
        b.a.InterfaceC0126a a2 = aVar == null ? null : aVar.a(a.class.getName());
        if (!(a2 instanceof a)) {
            return null;
        }
        return (a) a2;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        this.i = false;
        try {
            Result.a aVar = Result.Companion;
            TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
            if (tBLVOpenShopCardComponent != null) {
                tBLVOpenShopCardComponent.k();
            }
            TBLVOpenShopCardComponent tBLVOpenShopCardComponent2 = this.b;
            if (tBLVOpenShopCardComponent2 != null) {
                tBLVOpenShopCardComponent2.l();
            }
            TBLVOpenShopCardComponent tBLVOpenShopCardComponent3 = this.b;
            if (tBLVOpenShopCardComponent3 != null) {
                tBLVOpenShopCardComponent3.b();
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLVOpenShopCardComponent tBLVOpenShopCardComponent = this.b;
        if (tBLVOpenShopCardComponent == null) {
            return;
        }
        tBLVOpenShopCardComponent.a(z);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        willDisappear();
        didDisappear();
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

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String str = null;
        View inflate = View.inflate(this.f3733a, R.layout.view_tab3_live_end_layout, null);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            viewGroup2.addView(inflate, o.a(0, 0, 0, 0, 0, 0, 0, 127, null));
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.d;
        if (dVar != null) {
            str = dVar.U();
        }
        if (str == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.a.a(this.f3733a, "mtop.mediaplatform.live.getshopliveinfoList", AfcCustomSdk.SDK_VERSION, ai.b(kotlin.j.a("sellerId", str), kotlin.j.a("pre", "true")), new ShopLiveOpenCardView$onLiveEnd$1(inflate), ShopLiveOpenCardView$onLiveEnd$2.INSTANCE, false, false, false, null, false, null, RSoException.ERROR_LOAD_FALLBACK_SYSTEM_LOAD_FAILED, null);
    }
}
