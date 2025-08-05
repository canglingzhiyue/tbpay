package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", InputFrame3.TYPE_RESPONSE, "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSEBizBridge$favorOrUnFavorShop$2 extends Lambda implements rul<IMtopInnerAdapter.Response, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BridgeCallback $bridgeCallback;
    public final /* synthetic */ f $instance;
    public final /* synthetic */ boolean $isFavor;
    public final /* synthetic */ String $sellerId;
    public final /* synthetic */ TMSEBizBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSEBizBridge$favorOrUnFavorShop$2(TMSEBizBridge tMSEBizBridge, BridgeCallback bridgeCallback, boolean z, f fVar, String str) {
        super(1);
        this.this$0 = tMSEBizBridge;
        this.$bridgeCallback = bridgeCallback;
        this.$isFavor = z;
        this.$instance = fVar;
        this.$sellerId = str;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(IMtopInnerAdapter.Response response) {
        invoke2(response);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IMtopInnerAdapter.Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f3a00a", new Object[]{this, response});
            return;
        }
        q.d(response, "response");
        if (response.getSuccess() && response.getData() != null) {
            JSONObject data = response.getData();
            q.a(data);
            JSONObject jSONObject = data.getJSONObject("data");
            if ((jSONObject != null ? jSONObject.toJSONString() : null) != null) {
                this.$bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                TMSEBizBridge tMSEBizBridge = this.this$0;
                String str = this.$isFavor ? "TRVfavorShop" : "TRVunFavorShop";
                String h = this.$instance.h();
                String str2 = this.$sellerId;
                TMSEBizBridge tMSEBizBridge2 = this.this$0;
                f fVar = this.$instance;
                TMSEBizBridge.monitor$default(tMSEBizBridge, "TRVTbApiPage", str, h, null, TMSEBizBridge.$ipChange, null, str2, null, 168, null);
                return;
            }
            this.$bridgeCallback.sendBridgeResponse(BridgeResponse.newError(5, "服务端数据解析错误"));
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "error", response.getErrorCode());
        jSONObject3.put((JSONObject) "message", response.getErrorMsg());
        jSONObject3.put((JSONObject) "errorMessage", response.getErrorMsg());
        this.$bridgeCallback.sendJSONResponse(jSONObject2);
    }
}
