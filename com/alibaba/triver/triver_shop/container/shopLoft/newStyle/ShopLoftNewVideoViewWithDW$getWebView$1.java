package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ruk;

/* loaded from: classes3.dex */
public /* synthetic */ class ShopLoftNewVideoViewWithDW$getWebView$1 extends FunctionReferenceImpl implements ruk<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopLoftNewVideoViewWithDW$getWebView$1(ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW) {
        super(0, shopLoftNewVideoViewWithDW, ShopLoftNewVideoViewWithDW.class, "getPlayerInfo", "getPlayerInfo()Lcom/alibaba/fastjson/JSONObject;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final JSONObject mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3153bc1f", new Object[]{this});
        }
        ShopLoftNewVideoViewWithDW shopLoftNewVideoViewWithDW = (ShopLoftNewVideoViewWithDW) this.receiver;
        return ShopLoftNewVideoViewWithDW.$ipChange;
    }
}
