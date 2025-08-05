package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ruk;

/* loaded from: classes3.dex */
public /* synthetic */ class ShopLoftNewVideoView$getWebView$1 extends FunctionReferenceImpl implements ruk<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopLoftNewVideoView$getWebView$1(ShopLoftNewVideoView shopLoftNewVideoView) {
        super(0, shopLoftNewVideoView, ShopLoftNewVideoView.class, "getPlayerInfo", "getPlayerInfo()Lcom/alibaba/fastjson/JSONObject;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final JSONObject mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3153bc1f", new Object[]{this});
        }
        ShopLoftNewVideoView shopLoftNewVideoView = (ShopLoftNewVideoView) this.receiver;
        return ShopLoftNewVideoView.$ipChange;
    }
}
