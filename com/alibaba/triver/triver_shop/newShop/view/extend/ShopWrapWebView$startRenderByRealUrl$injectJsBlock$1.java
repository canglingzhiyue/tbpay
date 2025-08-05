package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $resumeData;
    public final /* synthetic */ ShopWrapWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1(ShopWrapWebView shopWrapWebView, JSONObject jSONObject) {
        super(0);
        this.this$0 = shopWrapWebView;
        this.$resumeData = jSONObject;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.this$0;
        shopWrapWebView.evaluateJavascript("if (window.onNShopPreloadResume) {window.onNShopPreloadResume(" + this.$resumeData + ");} else {window.__nShopPreloadResumeData__ = " + this.$resumeData + '}', new WVUCWebView.WVValueCallback() { // from class: com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.uc.WVUCWebView.WVValueCallback, android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                } else {
                    ceg.Companion.b(q.a("shopIndex star render by real url get message : ", (Object) str));
                }
            }
        });
    }
}
