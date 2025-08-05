package com.taobao.android.fluid.framework.data.remote;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.login4android.session.constants.SessionConstants;
import tb.kge;

/* loaded from: classes5.dex */
public class MediaContentDetailRequest implements IMTOPRequest {
    public String contentId;
    private final String API_NAME = "mtop.taobao.content.detail.mix.detail";
    private final String VERSION = "1.0";
    private final boolean NEED_ECODE = false;
    private final boolean NEED_SESSION = true;
    public String detailParameters = null;
    public String source = null;
    public String extendParameters = null;

    static {
        kge.a(865954204);
        kge.a(-1823959057);
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getApi() {
        return "mtop.taobao.content.detail.mix.detail";
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getVersion() {
        return "1.0";
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public boolean isNeedEcode() {
        return false;
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public boolean isNeedSession() {
        return true;
    }

    public JSONObject toJsonObjectForCacheCompare() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api", (Object) "mtop.taobao.content.detail.mix.detail");
        jSONObject.put("v", (Object) "1.0");
        jSONObject.put(SessionConstants.ECODE, (Object) 0);
        jSONObject.put(MspGlobalDefine.SESSION, (Object) 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("contentId", (Object) this.contentId);
        jSONObject2.put(a.KEY_DETAIL_PARAMETERS, (Object) this.detailParameters);
        jSONObject2.put("source", (Object) this.source);
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }
}
