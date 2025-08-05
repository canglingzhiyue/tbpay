package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", InputFrame3.TYPE_RESPONSE, "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSEBizBridge$collectOrUnCollectGoods$3 extends Lambda implements rul<IMtopInnerAdapter.Response, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ApiContext $apiContext;
    public final /* synthetic */ BridgeCallback $bridgeCallback;
    public final /* synthetic */ String $id;
    public final /* synthetic */ boolean $isCollect;
    public final /* synthetic */ TMSEBizBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSEBizBridge$collectOrUnCollectGoods$3(TMSEBizBridge tMSEBizBridge, boolean z, BridgeCallback bridgeCallback, ApiContext apiContext, String str) {
        super(1);
        this.this$0 = tMSEBizBridge;
        this.$isCollect = z;
        this.$bridgeCallback = bridgeCallback;
        this.$apiContext = apiContext;
        this.$id = str;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(IMtopInnerAdapter.Response response) {
        invoke2(response);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IMtopInnerAdapter.Response response) {
        String str;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f3a00a", new Object[]{this, response});
            return;
        }
        q.d(response, "response");
        if (response.getSuccess() && response.getData() != null) {
            String str2 = this.$isCollect ? "collectGood" : "unCollectGoods";
            JSONObject data = response.getData();
            q.a(data);
            JSONObject jSONObject2 = data.getJSONObject("data");
            String str3 = null;
            if (q.a((Object) ((jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("result")) == null) ? null : jSONObject.getBoolean(str2)), (Object) true)) {
                this.$bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                TMSEBizBridge tMSEBizBridge = this.this$0;
                String str4 = this.$isCollect ? "TRVcollectGoods" : "TRVunCollectGoods";
                f c = this.$apiContext.c();
                if (c != null) {
                    str3 = c.h();
                }
                String str5 = this.$id;
                TMSEBizBridge tMSEBizBridge2 = this.this$0;
                this.$apiContext.c();
                TMSEBizBridge.monitor$default(tMSEBizBridge, "TRVTbApiPage", str4, str3, str5, TMSEBizBridge.$ipChange, "/mapp.guide.pdp", null, null, 128, null);
                return;
            }
            JSONObject data2 = response.getData();
            q.a(data2);
            JSONObject jSONObject3 = data2.getJSONObject("data");
            if (jSONObject3 == null || (str = jSONObject3.getString("errorMsg")) == null) {
                str = this.$isCollect ? "收藏失败" : "取消收藏失败";
            }
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = jSONObject4;
            JSONObject data3 = response.getData();
            q.a(data3);
            String string = data3.getString("errorCode");
            if (string == null) {
                string = "UNKNOWN_ERROR";
            }
            jSONObject5.put((JSONObject) "errorCode", string);
            jSONObject5.put((JSONObject) "message", str);
            jSONObject5.put((JSONObject) "errorMessage", str);
            jSONObject5.put((JSONObject) "error", (String) 10);
            this.$bridgeCallback.sendJSONResponse(jSONObject4);
            return;
        }
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = jSONObject6;
        jSONObject7.put((JSONObject) "errorCode", response.getErrorCode());
        jSONObject7.put((JSONObject) "message", response.getErrorMsg());
        jSONObject7.put((JSONObject) "errorMessage", response.getErrorMsg());
        jSONObject7.put((JSONObject) "error", (String) 10);
        this.$bridgeCallback.sendJSONResponse(jSONObject6);
    }
}
