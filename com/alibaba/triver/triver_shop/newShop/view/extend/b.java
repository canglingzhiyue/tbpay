package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$createShopLoft$1$1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.i;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedView;
import com.uc.webview.export.extension.IEmbedViewContainer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.cen;
import tb.kge;
import tb.ruw;

/* loaded from: classes3.dex */
public final class b extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ShopWrapWebView b;

    static {
        kge.a(-12132789);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 1410714603) {
            if (hashCode != 1507240588) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onWebViewEvent((WebView) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        return super.getEmbedView((EmbedViewConfig) objArr[0], (IEmbedViewContainer) objArr[1]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ShopWrapWebView webView) {
        super(webView);
        q.d(webView, "webView");
        this.b = webView;
    }

    public final ShopWrapWebView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopWrapWebView) ipChange.ipc$dispatch("641fdd50", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.browser.i, android.taobao.windvane.extra.uc.WVUCClient, com.uc.webview.export.extension.UCClient
    public IEmbedView getEmbedView(EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (IEmbedView) ipChange.ipc$dispatch("5415cbeb", new Object[]{this, embedViewConfig, iEmbedViewContainer});
        }
        if (embedViewConfig == null || iEmbedViewContainer == null) {
            ceg.a aVar = ceg.Companion;
            StringBuilder sb = new StringBuilder();
            sb.append("create embed view failed config is null = ");
            sb.append(embedViewConfig == null);
            sb.append(" , container is null = ");
            if (iEmbedViewContainer != null) {
                z = false;
            }
            sb.append(z);
            aVar.b(sb.toString());
            return null;
        } else if (q.a((Object) ((String) embedViewConfig.mObjectParam.get("type")), (Object) "shop-loft-web")) {
            return a(embedViewConfig, iEmbedViewContainer);
        } else {
            return super.getEmbedView(embedViewConfig, iEmbedViewContainer);
        }
    }

    @Override // com.taobao.browser.i, android.taobao.windvane.extra.uc.WVUCClient, com.uc.webview.export.extension.UCClient
    public void onWebViewEvent(WebView webView, int i, Object obj) {
        Object m2371constructorimpl;
        Long e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d6aa8c", new Object[]{this, webView, new Integer(i), obj});
            return;
        }
        super.onWebViewEvent(webView, i, obj);
        try {
            Result.a aVar = Result.Companion;
            if ((i == 13 || i == 14) && (obj instanceof Map) && ((Map) obj).containsKey("ts")) {
                Object obj2 = ((Map) obj).get("ts");
                String obj3 = obj2 == null ? null : obj2.toString();
                if (com.alibaba.triver.triver_shop.newShop.ext.i.b(a().getCurrentPageName()) && obj3 != null && (e = n.e(obj3)) != null) {
                    long longValue = e.longValue();
                    com.alibaba.triver.triver_shop.newShop.data.d shopData = a().getShopData();
                    if (shopData != null) {
                        shopData.b("shopindex_real_uc_t2", Long.valueOf(longValue));
                    }
                }
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

    /* JADX WARN: Type inference failed for: r3v0, types: [com.alibaba.triver.triver_shop.container.shopLoft.a, T] */
    private final IEmbedView a(EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEmbedView) ipChange.ipc$dispatch("7b035b92", new Object[]{this, embedViewConfig, iEmbedViewContainer});
        }
        IEmbedView iEmbedView = null;
        try {
            Result.a aVar = Result.Companion;
            Context _getContext = a()._getContext();
            if (!(_getContext instanceof Activity)) {
                if (_getContext instanceof MutableContextWrapper) {
                    _getContext = ((MutableContextWrapper) _getContext).getBaseContext();
                    if (_getContext instanceof Activity) {
                    }
                }
                _getContext = null;
            }
            if (_getContext == null) {
                ceg.Companion.b("create shop loft web component failed : no activity context");
            } else {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? aVar2 = new com.alibaba.triver.triver_shop.container.shopLoft.a();
                aVar2.a((Activity) _getContext);
                aVar2.onCreate(new HashMap());
                objectRef.element = aVar2;
                if (cen.Companion.o()) {
                    aVar2.a(new ShopWebUCClient$createShopLoft$1$1.AnonymousClass1(this));
                }
                com.alibaba.ariver.engine.api.embedview.IEmbedView iEmbedView2 = (com.alibaba.ariver.engine.api.embedview.IEmbedView) objectRef.element;
                int i = embedViewConfig.mWidth;
                int i2 = embedViewConfig.mHeight;
                String valueOf = String.valueOf(embedViewConfig.mEmbedViewID);
                String str = embedViewConfig.mType;
                Map map = embedViewConfig.mObjectParam;
                final View view = iEmbedView2.getView(i, i2, valueOf, str, map == null ? null : com.alibaba.triver.triver_shop.newShop.ext.b.c(map));
                iEmbedViewContainer.setOnStateChangedListener(new IEmbedViewContainer.OnStateChangedListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$createShopLoft$1$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$createShopLoft$1$1$1  reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass1 extends Lambda implements ruw<String, JSONObject, t> {
                        public static volatile transient /* synthetic */ IpChange $ipChange;
                        public final /* synthetic */ b this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(b bVar) {
                            super(2);
                            this.this$0 = bVar;
                        }

                        @Override // tb.ruw
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ t mo2423invoke(String str, JSONObject jSONObject) {
                            invoke2(str, jSONObject);
                            return t.INSTANCE;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(String str, JSONObject jSONObject) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("fe686b07", new Object[]{this, str, jSONObject});
                            } else {
                                WVStandardEventCenter.postNotificationToJS(this.this$0.a(), str, jSONObject == null ? null : jSONObject.toString());
                            }
                        }
                    }

                    @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
                    public void onAttachedToWebView() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f1bdbec2", new Object[]{this});
                        } else {
                            objectRef.element.onAttachedToWebView();
                        }
                    }

                    @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
                    public void onDetachedFromWebView() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f7ebb65", new Object[]{this});
                        } else {
                            objectRef.element.onDetachedToWebView();
                        }
                    }

                    @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
                    public void onDestroy() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6532022", new Object[]{this});
                        } else {
                            objectRef.element.onDestroy();
                        }
                    }
                });
                iEmbedViewContainer.setOnParamChangedListener(new IEmbedViewContainer.OnParamChangedListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$createShopLoft$1$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
                    public final void onParamChanged(String[] strArr, String[] strArr2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
                        } else {
                            objectRef.element.onParamChanged(strArr, strArr2);
                        }
                    }
                });
                iEmbedViewContainer.setOnVisibilityChangedListener(new IEmbedViewContainer.OnVisibilityChangedListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$createShopLoft$1$3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
                    public final void onVisibilityChanged(int i3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7606d219", new Object[]{this, new Integer(i3)});
                        } else {
                            objectRef.element.onEmbedViewVisibilityChanged(i3);
                        }
                    }
                });
                iEmbedView = new IEmbedView() { // from class: com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$createShopLoft$1$4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.uc.webview.export.extension.IEmbedView
                    public View getView() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (View) ipChange2.ipc$dispatch("576a35e4", new Object[]{this});
                        }
                        View realView = view;
                        q.b(realView, "realView");
                        return realView;
                    }

                    @Override // com.uc.webview.export.extension.IEmbedView
                    public Bitmap getSnapShot() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Bitmap) ipChange2.ipc$dispatch("48acabf", new Object[]{this});
                        }
                        Bitmap snapshot = objectRef.element.getSnapshot();
                        q.b(snapshot, "iEmbedView.snapshot");
                        return snapshot;
                    }
                };
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        return iEmbedView;
    }
}
