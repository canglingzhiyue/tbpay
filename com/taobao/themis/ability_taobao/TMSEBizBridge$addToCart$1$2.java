package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.ability_taobao.TMSEBizBridge;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.crd;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", InputFrame3.TYPE_RESPONSE, "Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSEBizBridge$addToCart$1$2 extends Lambda implements rul<IMtopInnerAdapter.Response, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSEBizBridge.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSEBizBridge$addToCart$1$2(TMSEBizBridge.b bVar) {
        super(1);
        this.this$0 = bVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(IMtopInnerAdapter.Response response) {
        invoke2(response);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IMtopInnerAdapter.Response response) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f3a00a", new Object[]{this, response});
            return;
        }
        q.d(response, "response");
        if (response.getSuccess()) {
            JSONArray jSONArray = null;
            try {
                Result.a aVar = Result.Companion;
                JSONObject data = response.getData();
                jSONArray = (data == null || (jSONObject = data.getJSONObject("data")) == null) ? null : jSONObject.getJSONArray("bizIds");
                Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(i.a(th));
            }
            if (jSONArray != null) {
                BridgeCallback bridgeCallback = this.this$0.d;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "itemIds", (String) jSONArray);
                jSONObject3.put((JSONObject) "success", (String) true);
                t tVar = t.INSTANCE;
                bridgeCallback.sendJSONResponse(jSONObject2);
                q.a(jSONArray);
                for (Object obj : jSONArray) {
                    TMSEBizBridge tMSEBizBridge = TMSEBizBridge.this;
                    f c = this.this$0.e.c();
                    String h = c != null ? c.h() : null;
                    String obj2 = obj.toString();
                    TMSEBizBridge tMSEBizBridge2 = TMSEBizBridge.this;
                    this.this$0.e.c();
                    TMSEBizBridge.monitor$default(tMSEBizBridge, "TRVTbApiPage", "TRVaddToCart", h, obj2, TMSEBizBridge.$ipChange, "/mapp.guide.pdp", null, null, crd.DETECT_WIDTH, null);
                }
                return;
            }
            this.this$0.d.sendBridgeResponse(BridgeResponse.newError(5, "服务端数据解析错误"));
            return;
        }
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject4;
        jSONObject5.put((JSONObject) "errorCode", response.getErrorCode());
        jSONObject5.put((JSONObject) "message", response.getErrorMsg());
        jSONObject5.put((JSONObject) "errorMessage", response.getErrorMsg());
        jSONObject5.put((JSONObject) "error", (String) 10);
        this.this$0.d.sendJSONResponse(jSONObject4);
    }
}
