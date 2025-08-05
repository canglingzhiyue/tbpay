package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.g;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareContent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.j;
import kotlin.jvm.internal.q;
import tb.ceg;
import tb.cen;
import tb.eby;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class ShopLoftViewNewStyleBaseView extends c.b implements com.alibaba.triver.triver_shop.container.shopLoft.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f3748a;
    public FrameLayout b;
    public FrameLayout c;
    public FrameLayout d;
    public com.alibaba.triver.triver_shop.container.shopLoft.newStyle.a e;
    public Map<String, String> f;
    public Context g;
    private int i;
    private TUrlImageView j;
    private JSONObject k;
    private boolean l;
    private boolean m;
    private View n;
    private ShopWrapWebView o;
    private b.c q;
    private final String h = "https://gw.alicdn.com/imgextra/i4/O1CN01fze6V91bZt8qjCFWY_!!6000000003480-2-tps-96-96.png";
    private JSONObject p = new JSONObject();

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;
        public final /* synthetic */ JSONObject c;

        public a(Context context, JSONObject jSONObject) {
            this.b = context;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View decorView;
            TUrlImageView h;
            TUrlImageView h2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView = ShopLoftViewNewStyleBaseView.this;
            Context context = this.b;
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            Window window = ((Activity) context).getWindow();
            String str = null;
            shopLoftViewNewStyleBaseView.a((window == null || (decorView = window.getDecorView()) == null) ? null : (TUrlImageView) decorView.findViewById(R.id.shop_loft_search_button));
            TUrlImageView h3 = ShopLoftViewNewStyleBaseView.this.h();
            if (h3 != null) {
                str = h3.getImageUrl();
            }
            if (str == null && (h2 = ShopLoftViewNewStyleBaseView.this.h()) != null) {
                h2.setImageUrl(ShopLoftViewNewStyleBaseView.a(ShopLoftViewNewStyleBaseView.this));
            }
            TUrlImageView h4 = ShopLoftViewNewStyleBaseView.this.h();
            if (h4 != null) {
                final JSONObject jSONObject = this.c;
                final Context context2 = this.b;
                h4.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String string;
                        IpChange ipChange2 = $ipChange;
                        boolean z = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        JSONObject jSONObject2 = JSONObject.this;
                        if (jSONObject2 == null || (string = jSONObject2.getString("shopSearchUrl")) == null) {
                            return;
                        }
                        Context context3 = context2;
                        if (string.length() <= 0) {
                            z = false;
                        }
                        if (!z) {
                            return;
                        }
                        l.a(context3, string);
                    }
                });
            }
            if (!ShopLoftViewNewStyleBaseView.this.l() || (h = ShopLoftViewNewStyleBaseView.this.h()) == null) {
                return;
            }
            o.b(h);
        }
    }

    static {
        kge.a(1936336511);
        kge.a(-563039837);
    }

    public static /* synthetic */ Object ipc$super(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1507519932) {
            super.a(objArr[0]);
            return null;
        } else if (hashCode == -262755451) {
            super.b(objArr[0]);
            return null;
        } else if (hashCode != 982009030) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c(objArr[0]);
            return null;
        }
    }

    public JSONObject q_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3ec6f2b5", new Object[]{this});
        }
        return null;
    }

    public static final /* synthetic */ String a(ShopLoftViewNewStyleBaseView shopLoftViewNewStyleBaseView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e42c9166", new Object[]{shopLoftViewNewStyleBaseView}) : shopLoftViewNewStyleBaseView.h;
    }

    public final b.c A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.c) ipChange.ipc$dispatch("a0328bea", new Object[]{this}) : this.q;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.i;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.d(view, "<set-?>");
        this.f3748a = view;
    }

    public final View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42261fae", new Object[]{this});
        }
        View view = this.f3748a;
        if (view != null) {
            return view;
        }
        q.b("rootView");
        throw null;
    }

    public final void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        q.d(frameLayout, "<set-?>");
        this.b = frameLayout;
    }

    public final FrameLayout f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ef845acc", new Object[]{this});
        }
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            return frameLayout;
        }
        q.b("bottomNavContainer");
        throw null;
    }

    public final void b(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713b9fec", new Object[]{this, frameLayout});
            return;
        }
        q.d(frameLayout, "<set-?>");
        this.c = frameLayout;
    }

    public final FrameLayout g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("77b49aab", new Object[]{this});
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            return frameLayout;
        }
        q.b("contentArea");
        throw null;
    }

    public final void c(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef135bed", new Object[]{this, frameLayout});
            return;
        }
        q.d(frameLayout, "<set-?>");
        this.d = frameLayout;
    }

    public final void a(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3e34e", new Object[]{this, tUrlImageView});
        } else {
            this.j = tUrlImageView;
        }
    }

    public final TUrlImageView h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("4a4fd2ad", new Object[]{this}) : this.j;
    }

    public final void a(com.alibaba.triver.triver_shop.container.shopLoft.newStyle.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d645a802", new Object[]{this, aVar});
            return;
        }
        q.d(aVar, "<set-?>");
        this.e = aVar;
    }

    public final com.alibaba.triver.triver_shop.container.shopLoft.newStyle.a i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.container.shopLoft.newStyle.a) ipChange.ipc$dispatch("12ec2580", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.container.shopLoft.newStyle.a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        q.b("shopLoftDXEngine");
        throw null;
    }

    public final JSONObject j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2185e711", new Object[]{this}) : this.k;
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        q.d(map, "<set-?>");
        this.f = map;
    }

    public final Map<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this});
        }
        Map<String, String> map = this.f;
        if (map != null) {
            return map;
        }
        q.b("utArgs");
        throw null;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.l;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.m;
    }

    public final void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.n = view;
        }
    }

    public final View n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("dde482f7", new Object[]{this}) : this.n;
    }

    public final void a(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c2f90a", new Object[]{this, shopWrapWebView});
        } else {
            this.o = shopWrapWebView;
        }
    }

    public final ShopWrapWebView o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopWrapWebView) ipChange.ipc$dispatch("8435c182", new Object[]{this}) : this.o;
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        q.d(context, "<set-?>");
        this.g = context;
    }

    public final Context p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e14276ef", new Object[]{this});
        }
        Context context = this.g;
        if (context != null) {
            return context;
        }
        q.b("context");
        throw null;
    }

    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        this.q = cVar;
        q.a(context);
        a(context);
        this.k = jSONObject;
        JSONObject jSONObject3 = null;
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("spmParams")) != null) {
            jSONObject3 = jSONObject2.getJSONObject("args");
        }
        a((Map<String, String>) new LinkedHashMap());
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    Map<String, String> k = k();
                    String key = entry.getKey();
                    q.b(key, "entry.key");
                    k.put(key, entry.getValue().toString());
                }
            }
        }
        t();
        this.i = o.a((Number) 50) + o.a(context);
        a(cz_());
        View a2 = o.a(context, R.layout.view_shop_loft_new_style_2023_view);
        q.a(a2);
        o.a((ViewGroup) e(), a2);
        View findViewById = e().findViewById(R.id.shop_loft_2023_new_style_bottom_nav);
        q.b(findViewById, "rootView.findViewById(R.id.shop_loft_2023_new_style_bottom_nav)");
        a((FrameLayout) findViewById);
        View findViewById2 = e().findViewById(R.id.shop_loft_2023_new_style_web_area);
        q.b(findViewById2, "rootView.findViewById(R.id.shop_loft_2023_new_style_web_area)");
        c((FrameLayout) findViewById2);
        View findViewById3 = e().findViewById(R.id.shop_loft_2023_new_style_content_area);
        q.b(findViewById3, "rootView.findViewById(R.id.shop_loft_2023_new_style_content_area)");
        b((FrameLayout) findViewById3);
        q.a(aVar);
        b.a.InterfaceC0126a a3 = aVar.a("shopLoftDXEngine");
        if (a3 != null) {
            a(((b) a3).b());
            b.a.InterfaceC0126a a4 = aVar.a("shopLoftPerformanceMonitorObject");
            if (a4 != null) {
                ((b.InterfaceC0127b) a4).a(this.p);
                a(cVar);
                r();
                e().post(new a(context, jSONObject));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.IShopLoftView.IShopLoftPerformanceMonitor");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftDXEngineLifecycleObject");
    }

    private final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        this.p.put((JSONObject) "nativeRenderStart", (String) Long.valueOf(System.currentTimeMillis()));
        JSONObject jSONObject = this.p;
        JSONObject jSONObject2 = this.k;
        String str = null;
        jSONObject.put((JSONObject) "sceneId", jSONObject2 == null ? null : jSONObject2.getString("sceneId"));
        JSONObject jSONObject3 = this.p;
        JSONObject jSONObject4 = this.k;
        jSONObject3.put((JSONObject) "id", jSONObject4 == null ? null : jSONObject4.getString("id"));
        JSONObject jSONObject5 = this.p;
        JSONObject jSONObject6 = this.k;
        if (jSONObject6 != null) {
            str = jSONObject6.getString("nativeIndex");
        }
        jSONObject5.put((JSONObject) UiUtil.INPUT_TYPE_VALUE_NUM, str);
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            this.p.put((JSONObject) "nativeRenderEnd", (String) Long.valueOf(System.currentTimeMillis()));
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.k;
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("dxTemplates");
        JSONObject jSONObject3 = jSONObject2 == null ? null : jSONObject2.getJSONObject("bottomNavTemplateData");
        if (jSONObject3 == null) {
            return;
        }
        jSONObject.put((JSONObject) "nativeConfig", (String) com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("autoScrollText", Boolean.valueOf(cen.Companion.s()))));
        i().a(jSONObject3, jSONObject, jSONObject.hashCode(), new ShopLoftViewNewStyleBaseView$initBottomNavTemplate$1(this), new ShopLoftViewNewStyleBaseView$initBottomNavTemplate$2(jSONObject3));
    }

    public void a(b.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b74a", new Object[]{this, cVar});
            return;
        }
        ShopWrapWebView a2 = a();
        JSONObject jSONObject = this.k;
        String str = null;
        String string = jSONObject == null ? null : jSONObject.getString("webLayerUrl");
        if (string == null) {
            ceg.Companion.b("webLayerUrl is null");
            return;
        }
        Uri.Builder buildUpon = Uri.parse(string).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("paddingTopAndBottom", o.f(Integer.valueOf(this.i)) + ",114");
        JSONObject jSONObject2 = this.k;
        if (jSONObject2 != null) {
            str = jSONObject2.getString("listInstanceId");
        }
        String uri = appendQueryParameter.appendQueryParameter("listInstanceId", str).build().toString();
        q.b(uri, "parse(webUrl).buildUpon().appendQueryParameter(\n            \"paddingTopAndBottom\",\n            \"${statusBarAndHeaderNavHeight.px2rpx()},${114}\"\n        ).appendQueryParameter(ShopLoftKeys.KEY_LIST_INSTANCE_ID, params?.getString(ShopLoftKeys.KEY_LIST_INSTANCE_ID))\n            .build().toString()");
        a2.getShopLoftWebViewBizAdapter().a(this.k);
        a2.loadUrl(uri);
        ShopWrapWebView shopWrapWebView = a2;
        o.g(shopWrapWebView);
        a2.getShopLoftWebViewBizAdapter().b(o.c((Number) 114));
        a2.getShopLoftWebViewBizAdapter().a(cVar);
        ShopLoftNewStyleWebWrapLayout shopLoftNewStyleWebWrapLayout = new ShopLoftNewStyleWebWrapLayout(this, p());
        shopLoftNewStyleWebWrapLayout.setShopWrapWebView(a2);
        o.a(shopLoftNewStyleWebWrapLayout, shopWrapWebView);
        o.a((ViewGroup) e(), shopLoftNewStyleWebWrapLayout);
    }

    public ShopWrapWebView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("641fdd50", new Object[]{this});
        }
        if (this.o == null) {
            this.o = new ShopWrapWebView(p());
        }
        ShopWrapWebView shopWrapWebView = this.o;
        q.a(shopWrapWebView);
        return shopWrapWebView;
    }

    public View cz_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bc6865d1", new Object[]{this}) : new FrameLayout(p());
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : e();
    }

    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        this.l = true;
        TUrlImageView tUrlImageView = this.j;
        if (tUrlImageView != null) {
            o.b(tUrlImageView);
        }
        WVStandardEventCenter.postNotificationToJS(this.o, "shopContentList.viewAppear", "");
    }

    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        this.l = false;
        TUrlImageView tUrlImageView = this.j;
        if (tUrlImageView != null) {
            o.e(tUrlImageView);
        }
        WVStandardEventCenter.postNotificationToJS(this.o, "shopContentList.viewDisappear", "");
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public String getUTPageName() {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        JSONObject jSONObject2 = this.k;
        return (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("spmParams")) == null || (string = jSONObject.getString("arg1")) == null) ? "" : string;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("16970404", new Object[]{this}) : k();
    }

    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.o;
        if (shopWrapWebView == null) {
            return;
        }
        g.b(shopWrapWebView);
    }

    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.o;
        if (shopWrapWebView == null) {
            return;
        }
        g.a(shopWrapWebView);
    }

    public void onDestroyed() {
        com.alibaba.triver.triver_shop.newShop.view.extend.a shopLoftWebViewBizAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        i().b().a(c.shopLoft2023StyleBottomNavArea, this);
        ShopWrapWebView shopWrapWebView = this.o;
        JSONObject jSONObject = null;
        if (shopWrapWebView != null && (shopLoftWebViewBizAdapter = shopWrapWebView.getShopLoftWebViewBizAdapter()) != null) {
            jSONObject = shopLoftWebViewBizAdapter.b();
        }
        if (jSONObject != null) {
            this.p.putAll(jSONObject);
        }
        ShopWrapWebView shopWrapWebView2 = this.o;
        if (shopWrapWebView2 == null) {
            return;
        }
        shopWrapWebView2.destroyWebView();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        JSONObject jSONObject = this.k;
        String str = null;
        shareContent.imageUrl = jSONObject == null ? null : jSONObject.getString(eby.KEY_PIC_URL);
        JSONObject jSONObject2 = this.k;
        shareContent.title = jSONObject2 == null ? null : jSONObject2.getString("title");
        JSONObject jSONObject3 = this.k;
        if (jSONObject3 != null) {
            str = jSONObject3.getString("description");
        }
        shareContent.description = str;
        return shareContent;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c.b
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (!this.l) {
        } else {
            super.a(obj);
            JSONObject s = s();
            String str = null;
            String string = s == null ? null : s.getString("id");
            if (string == null) {
                return;
            }
            JSONObject s2 = s();
            if (s2 != null) {
                str = s2.getString("ifCollection");
            }
            boolean a2 = q.a((Object) str, (Object) "true");
            ShopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1 shopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1 = new ShopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1(this, a2);
            if (a2) {
                com.alibaba.triver.triver_shop.d.INSTANCE.d(p(), string, u(), shopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1, q_());
            } else {
                com.alibaba.triver.triver_shop.d.INSTANCE.c(p(), string, u(), shopLoftViewNewStyleBaseView$shopLoftCollection$collectionCallback$1, q_());
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c.b
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (!this.l) {
        } else {
            super.b(obj);
            JSONObject s = s();
            String str = null;
            String string = s == null ? null : s.getString("id");
            if (string == null) {
                return;
            }
            JSONObject s2 = s();
            if (s2 != null) {
                str = s2.getString("ifLike");
            }
            boolean a2 = q.a((Object) str, (Object) "true");
            ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1 shopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1 = new ShopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1(this, a2);
            if (a2) {
                com.alibaba.triver.triver_shop.d.INSTANCE.b(p(), string, u(), shopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1, q_());
            } else {
                com.alibaba.triver.triver_shop.d.INSTANCE.a(p(), string, u(), shopLoftViewNewStyleBaseView$shopLoftLike$likeCallback$1, q_());
            }
        }
    }

    private final String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("326979a4", new Object[]{this});
        }
        JSONObject jSONObject = this.k;
        if (jSONObject != null) {
            return jSONObject.getString("origin");
        }
        return null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c.b
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
        } else if (!this.l) {
        } else {
            super.c(obj);
            Context p = p();
            if (!(p instanceof ShopLoftActivity)) {
                return;
            }
            ((ShopLoftActivity) p).a();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c.b
    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
        } else if (!this.l) {
        } else {
            if (!(obj instanceof JSONObject)) {
                ceg.Companion.b("showWindVanePop param not json");
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.a.a((Activity) p(), (JSONObject) obj);
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c.b
    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
        } else if (!this.l || !(obj instanceof String)) {
        } else {
            l.a(p(), (String) obj);
        }
    }

    public final JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d26c569a", new Object[]{this});
        }
        View view = this.n;
        if (!(view instanceof DXRootView)) {
            return null;
        }
        return ((DXRootView) view).getData();
    }

    /* loaded from: classes3.dex */
    public final class ShopLoftNewStyleWebWrapLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetected;
        private boolean needDispatchToWeb;
        private ShopWrapWebView shopWrapWebView;
        public final /* synthetic */ ShopLoftViewNewStyleBaseView this$0;

        static {
            kge.a(-139996373);
        }

        public static /* synthetic */ Object ipc$super(ShopLoftNewStyleWebWrapLayout shopLoftNewStyleWebWrapLayout, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShopLoftNewStyleWebWrapLayout(ShopLoftViewNewStyleBaseView this$0, Context context) {
            super(context);
            q.d(this$0, "this$0");
            q.d(context, "context");
            this.this$0 = this$0;
        }

        public final ShopWrapWebView getShopWrapWebView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ShopWrapWebView) ipChange.ipc$dispatch("eed26e0e", new Object[]{this}) : this.shopWrapWebView;
        }

        public final void setShopWrapWebView(ShopWrapWebView shopWrapWebView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13acc580", new Object[]{this, shopWrapWebView});
            } else {
                this.shopWrapWebView = shopWrapWebView;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            this.this$0.a(true);
            ShopWrapWebView shopWrapWebView = this.shopWrapWebView;
            if (shopWrapWebView == null) {
                return false;
            }
            if (shopWrapWebView.getShopLoftWebViewBizAdapter().f()) {
                super.dispatchTouchEvent(motionEvent);
                return true;
            } else if (o.a(motionEvent)) {
                this.alreadyDetected = false;
                this.needDispatchToWeb = false;
                float y = motionEvent.getY();
                int height = shopWrapWebView.getHeight() - shopWrapWebView.getShopLoftWebViewBizAdapter().d();
                boolean z = y >= ((float) (height - shopWrapWebView.getShopLoftWebViewBizAdapter().c())) && y <= ((float) height);
                this.alreadyDetected = true;
                if (!z) {
                    return false;
                }
                this.needDispatchToWeb = true;
                return super.dispatchTouchEvent(motionEvent);
            } else if (!this.alreadyDetected || !this.needDispatchToWeb) {
                return false;
            } else {
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
        }
    }
}
