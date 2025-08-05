package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", InputFrame3.TYPE_RESPONSE, "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSEBizBridge$checkGoodsCollectedStatus$3 extends Lambda implements rul<IMtopInnerAdapter.Response, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BridgeCallback $bridgeCallback;
    public final /* synthetic */ String $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSEBizBridge$checkGoodsCollectedStatus$3(BridgeCallback bridgeCallback, String str) {
        super(1);
        this.$bridgeCallback = bridgeCallback;
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
            JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("result") : null;
            if (jSONObject2 != null) {
                BridgeCallback bridgeCallback = this.$bridgeCallback;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = jSONObject3;
                jSONObject4.put((JSONObject) "id", this.$id);
                jSONObject4.put((JSONObject) "isCollect", (String) jSONObject2.getBoolean("collectStatus"));
                t tVar = t.INSTANCE;
                bridgeCallback.sendJSONResponse(jSONObject3);
                return;
            }
            JSONObject data2 = response.getData();
            q.a(data2);
            String string = data2.getString("errorMsg");
            if (string == null) {
                string = "检查收藏状态失败";
            }
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = jSONObject5;
            JSONObject data3 = response.getData();
            q.a(data3);
            String string2 = data3.getString("errorCode");
            if (string2 == null) {
                string2 = "UNKNOWN_ERROR";
            }
            jSONObject6.put((JSONObject) "errorCode", string2);
            jSONObject6.put((JSONObject) "message", string);
            jSONObject6.put((JSONObject) "errorMessage", string);
            jSONObject6.put((JSONObject) "error", (String) 10);
            this.$bridgeCallback.sendJSONResponse(jSONObject5);
            return;
        }
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = jSONObject7;
        jSONObject8.put((JSONObject) "errorCode", response.getErrorCode());
        jSONObject8.put((JSONObject) "message", response.getErrorMsg());
        jSONObject8.put((JSONObject) "errorMessage", response.getErrorMsg());
        jSONObject8.put((JSONObject) "error", (String) 10);
        this.$bridgeCallback.sendJSONResponse(jSONObject7);
    }
}
