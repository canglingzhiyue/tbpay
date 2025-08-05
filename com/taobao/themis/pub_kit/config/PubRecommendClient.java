package com.taobao.themis.pub_kit.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.network.RequestParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.d;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\f\rB!\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u000e"}, d2 = {"Lcom/taobao/themis/pub_kit/config/PubRecommendClient;", "Lcom/taobao/themis/kernel/network/AsyncRequestClient;", "Lcom/taobao/themis/pub_kit/config/PubRecommendClient$PubRecommendRequestParam;", "Lcom/alibaba/fastjson/JSONObject;", "params", "requestListener", "Lcom/taobao/themis/kernel/network/CommonListener;", "(Lcom/taobao/themis/pub_kit/config/PubRecommendClient$PubRecommendRequestParam;Lcom/taobao/themis/kernel/network/CommonListener;)V", "configFailureResponse", InputFrame3.TYPE_RESPONSE, "", "configSuccessResponse", "Companion", "PubRecommendRequestParam", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubRecommendClient extends com.taobao.themis.kernel.network.a<PubRecommendRequestParam, JSONObject, JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(252203750);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.network.d
    /* renamed from: configFailureResponse */
    public /* synthetic */ Object mo1502configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9e7a26fb", new Object[]{this, bArr}) : b(bArr);
    }

    @Override // com.taobao.themis.kernel.network.d
    public /* synthetic */ Object configSuccessResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e02d8962", new Object[]{this, bArr}) : a(bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubRecommendClient(PubRecommendRequestParam params, com.taobao.themis.kernel.network.b<JSONObject, JSONObject> requestListener) {
        super(params, requestListener);
        q.d(params, "params");
        q.d(requestListener, "requestListener");
    }

    public JSONObject a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9797964f", new Object[]{this, bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            Object obj = JSON.parseObject(new String(bArr, d.UTF_8)).getJSONObject("data").getJSONArray("result").get(0);
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            return (JSONObject) obj;
        } catch (Throwable th) {
            TMSLogger.b("PubRecommendClient", "PubRecommendClient.configSuccessResponse: " + th.getMessage(), th);
            return null;
        }
    }

    public JSONObject b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("60988d90", new Object[]{this, bArr});
        }
        if (bArr != null) {
            return JSON.parseObject(new String(bArr, d.UTF_8));
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/config/PubRecommendClient$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1767003822);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/pub_kit/config/PubRecommendClient$PubRecommendRequestParam;", "Lcom/taobao/themis/kernel/network/RequestParams;", "appId", "", "delta", "Lcom/alibaba/fastjson/JSONObject;", "strongGuideAlgorithmUserStayTime", "", "strongGuideAlgorithmUserClickTime", "strongGuideUserStayTime", "strongInterveneUserStayTime", "(Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;IIII)V", "toMap", "", "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class PubRecommendRequestParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final JSONObject delta;
        private final int strongGuideAlgorithmUserClickTime;
        private final int strongGuideAlgorithmUserStayTime;
        private final int strongGuideUserStayTime;
        private final int strongInterveneUserStayTime;

        static {
            kge.a(85099323);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PubRecommendRequestParam(String appId, JSONObject delta, int i, int i2, int i3, int i4) {
            super(appId);
            q.d(appId, "appId");
            q.d(delta, "delta");
            this.delta = delta;
            this.strongGuideAlgorithmUserStayTime = i;
            this.strongGuideAlgorithmUserClickTime = i2;
            this.strongGuideUserStayTime = i3;
            this.strongInterveneUserStayTime = i4;
            this.version = "1.0";
            this.api = "mtop.relationrecommend.WirelessRecommend.recommend";
            this.needLogin = true;
            this.headers = ai.b(j.a("content-type", HeaderConstant.HEADER_VALUE_OLD_TYPE));
            this.method = "POST";
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("appId", 39379L);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "miniAppId", getAppId());
            jSONObject2.put((JSONObject) "strongGuideAlgorithmUserStayTime", (String) Integer.valueOf(this.strongGuideAlgorithmUserStayTime));
            jSONObject2.put((JSONObject) "strongGuideAlgorithmUserClickTime", (String) Integer.valueOf(this.strongGuideAlgorithmUserClickTime));
            jSONObject2.put((JSONObject) "strongGuideUserStayTime", (String) Integer.valueOf(this.strongGuideUserStayTime));
            jSONObject2.put((JSONObject) "strongInterveneUserStayTime", (String) Integer.valueOf(this.strongInterveneUserStayTime));
            jSONObject2.put((JSONObject) "delta", this.delta.toJSONString());
            t tVar = t.INSTANCE;
            linkedHashMap.put("params", jSONObject.toJSONString());
            return linkedHashMap;
        }
    }
}
