package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.content.Context;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.util.AttributeSet;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.web.ShopBaseWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.UCExtension;
import kotlin.jvm.internal.q;
import tb.ceg;
import tb.cen;
import tb.kge;

/* loaded from: classes3.dex */
public class ShopWrapWebView extends ShopBaseWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable actionAfterOnPageFinish;
    private boolean alreadyInjectOnNShopPreloadResume;
    private boolean alreadyPreloadPageFinished;
    private String currentPageName;
    private final boolean enableShopIndexPreSetPreloadStatus;
    private Runnable loadFailedProcessor;
    private boolean realOnPageFinish;
    private com.alibaba.triver.triver_shop.newShop.data.d shopData;
    private c shopFrameworkBizAdapter;
    private String shopId;
    private com.alibaba.triver.triver_shop.newShop.view.extend.a shopLoftWebViewBizAdapter;
    private com.alibaba.triver.triver_shop.newShop.view.embed.c swipeBigCardComponent;

    static {
        kge.a(585682797);
    }

    public ShopWrapWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.shopLoftWebViewBizAdapter = new com.alibaba.triver.triver_shop.newShop.view.extend.a();
        this.shopFrameworkBizAdapter = new c();
        this.enableShopIndexPreSetPreloadStatus = cen.Companion.an();
    }

    public ShopWrapWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.shopLoftWebViewBizAdapter = new com.alibaba.triver.triver_shop.newShop.view.extend.a();
        this.shopFrameworkBizAdapter = new c();
        this.enableShopIndexPreSetPreloadStatus = cen.Companion.an();
    }

    public ShopWrapWebView(Context context) {
        super(context);
        this.shopLoftWebViewBizAdapter = new com.alibaba.triver.triver_shop.newShop.view.extend.a();
        this.shopFrameworkBizAdapter = new c();
        this.enableShopIndexPreSetPreloadStatus = cen.Companion.an();
    }

    public final com.alibaba.triver.triver_shop.newShop.data.d getShopData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("4264be0e", new Object[]{this}) : this.shopData;
    }

    public final void setShopData(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab51df78", new Object[]{this, dVar});
        } else {
            this.shopData = dVar;
        }
    }

    public final String getShopId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3946bb2", new Object[]{this}) : this.shopId;
    }

    public final void setShopId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f804", new Object[]{this, str});
        } else {
            this.shopId = str;
        }
    }

    public final String getCurrentPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this}) : this.currentPageName;
    }

    public final void setCurrentPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5febd62", new Object[]{this, str});
        } else {
            this.currentPageName = str;
        }
    }

    public final com.alibaba.triver.triver_shop.newShop.view.embed.c getSwipeBigCardComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.embed.c) ipChange.ipc$dispatch("7d710925", new Object[]{this}) : this.swipeBigCardComponent;
    }

    public final void setSwipeBigCardComponent(com.alibaba.triver.triver_shop.newShop.view.embed.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f95491", new Object[]{this, cVar});
        } else {
            this.swipeBigCardComponent = cVar;
        }
    }

    public final boolean getAlreadyPreloadPageFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("54f9d3", new Object[]{this})).booleanValue() : this.alreadyPreloadPageFinished;
    }

    public final void setAlreadyPreloadPageFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c82459", new Object[]{this, new Boolean(z)});
        } else {
            this.alreadyPreloadPageFinished = z;
        }
    }

    public final boolean getAlreadyInjectOnNShopPreloadResume() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4398e52f", new Object[]{this})).booleanValue() : this.alreadyInjectOnNShopPreloadResume;
    }

    public final void setAlreadyInjectOnNShopPreloadResume(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7067715", new Object[]{this, new Boolean(z)});
        } else {
            this.alreadyInjectOnNShopPreloadResume = z;
        }
    }

    public final Runnable getLoadFailedProcessor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("74e175b4", new Object[]{this}) : this.loadFailedProcessor;
    }

    public final void setLoadFailedProcessor(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd64c1d2", new Object[]{this, runnable});
        } else {
            this.loadFailedProcessor = runnable;
        }
    }

    public final com.alibaba.triver.triver_shop.newShop.view.extend.a getShopLoftWebViewBizAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.extend.a) ipChange.ipc$dispatch("bfe9f011", new Object[]{this}) : this.shopLoftWebViewBizAdapter;
    }

    public final void setShopLoftWebViewBizAdapter(com.alibaba.triver.triver_shop.newShop.view.extend.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486180cd", new Object[]{this, aVar});
            return;
        }
        q.d(aVar, "<set-?>");
        this.shopLoftWebViewBizAdapter = aVar;
    }

    public final c getShopFrameworkBizAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("38476ad9", new Object[]{this}) : this.shopFrameworkBizAdapter;
    }

    public final void setShopFrameworkBizAdapter(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81d8d41", new Object[]{this, cVar});
            return;
        }
        q.d(cVar, "<set-?>");
        this.shopFrameworkBizAdapter = cVar;
    }

    @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView
    public void render(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95df87a7", new Object[]{this, str});
            return;
        }
        initRenderSettings();
        UCExtension uCExtension = getUCExtension();
        if (uCExtension != null) {
            uCExtension.setClient(new b(this));
        }
        loadUrl(str);
    }

    /* loaded from: classes3.dex */
    public static final class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode != 534767588) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            }
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            ShopWrapWebView.this.setAlreadyPreloadPageFinished(true);
            ceg.Companion.b("preload shopIndex pageFinish");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            ShopWrapWebView.this.doOnPageFinishAction();
        }
    }

    public final void startPreloadShopIndexWeb() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b86f826", new Object[]{this});
            return;
        }
        ceg.Companion.b("start preload shopIndex");
        setWebViewClient(new a(this.context));
        if (cen.Companion.ae()) {
            ceg.Companion.b("use preRelease preRenderUrl");
            str = "https://pages.wapa.taobao.com/shop/app/tb-shop-team/shop-isomorphism/home?isNShopPreload=true";
        } else {
            ceg.Companion.b("use online preRenderUrl");
            str = "https://tbshop.m.taobao.com/app/tb-shop-team/shop-isomorphism/home?isNShopPreload=true";
        }
        render(str);
        if (this.enableShopIndexPreSetPreloadStatus) {
            this.alreadyPreloadPageFinished = true;
        }
        ceg.Companion.b(q.a("start preload shop index web use : ", (Object) str));
    }

    public final void startRenderByRealUrl(String str) {
        String jSONString;
        JSONObject X;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b0a1f3", new Object[]{this, str});
        } else if (!this.alreadyPreloadPageFinished) {
            ceg.Companion.b("shopIndex star render by real url failed, not page finished");
        } else if (this.alreadyInjectOnNShopPreloadResume) {
            ceg.Companion.b("alreadyInjectOnNShopPreloadResume");
        } else {
            com.alibaba.triver.triver_shop.preload.a a2 = com.alibaba.triver.triver_shop.preload.e.INSTANCE.a();
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.shopData;
            String str2 = null;
            if (!q.a((Object) (dVar == null ? null : dVar.T()), (Object) (a2 == null ? null : a2.a()))) {
                a2 = null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject;
            jSONObject3.put((JSONObject) "preloadData", (String) jSONObject2);
            jSONObject3.put((JSONObject) "url", str);
            com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.shopData;
            boolean z = !(dVar2 != null && dVar2.bk()) || cen.Companion.ai();
            if (z) {
                JSONObject jSONObject4 = jSONObject2;
                com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.shopData;
                if (dVar3 != null && !dVar3.f()) {
                    com.alibaba.triver.triver_shop.newShop.data.d dVar4 = this.shopData;
                    jSONString = (dVar4 == null || (X = dVar4.X()) == null) ? null : X.toJSONString();
                } else {
                    com.alibaba.triver.triver_shop.newShop.data.d dVar5 = this.shopData;
                    jSONString = JSONObject.toJSONString(dVar5 == null ? null : dVar5.X(), SerializerFeature.DisableCircularReferenceDetect);
                }
                jSONObject4.put((JSONObject) g.KEY_SHOP_FETCH, jSONString);
                if (a2 != null) {
                    str2 = a2.c();
                }
                jSONObject4.put((JSONObject) "minidata", str2);
            }
            ceg.Companion.b(q.a("injectShopFetchUseMainThread : ", (Object) Boolean.valueOf(z)));
            final ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1 shopWrapWebView$startRenderByRealUrl$injectJsBlock$1 = new ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1(this, jSONObject);
            if (this.enableShopIndexPreSetPreloadStatus) {
                if (this.realOnPageFinish) {
                    shopWrapWebView$startRenderByRealUrl$injectJsBlock$1.mo2427invoke();
                } else {
                    this.actionAfterOnPageFinish = new Runnable() { // from class: com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView$startRenderByRealUrl$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                shopWrapWebView$startRenderByRealUrl$injectJsBlock$1.mo2427invoke();
                            }
                        }
                    };
                }
            } else {
                shopWrapWebView$startRenderByRealUrl$injectJsBlock$1.mo2427invoke();
            }
            this.alreadyInjectOnNShopPreloadResume = true;
        }
    }

    public final void doOnPageFinishAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b63849", new Object[]{this});
            return;
        }
        this.realOnPageFinish = true;
        Runnable runnable = this.actionAfterOnPageFinish;
        if (runnable != null) {
            runnable.run();
        }
        this.actionAfterOnPageFinish = null;
    }

    public final void printPreloadStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5279bb35", new Object[]{this});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("preload webView PageFinish : " + this.alreadyPreloadPageFinished + ", alreadyInject : " + this.alreadyInjectOnNShopPreloadResume);
    }
}
