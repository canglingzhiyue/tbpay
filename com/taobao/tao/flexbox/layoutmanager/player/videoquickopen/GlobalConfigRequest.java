package com.taobao.tao.flexbox.layoutmanager.player.videoquickopen;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.taobao.android.shop.features.category.b;
import com.taobao.login4android.session.constants.SessionConstants;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GlobalConfigRequest implements IMTOPDataObject {
    public JSONObject extendParams;
    private String API_NAME = "mtop.taobao.content.detail.mix.globalconfig";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String REQUEST_TYPE = "GET";
    public JSONArray sourceList = null;

    static {
        kge.a(-1609724484);
        kge.a(-350052935);
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api", this.API_NAME);
        jSONObject.put("v", this.VERSION);
        jSONObject.put(SessionConstants.ECODE, Integer.valueOf(this.NEED_ECODE ? 1 : 0));
        jSONObject.put(MspGlobalDefine.SESSION, Integer.valueOf(this.NEED_SESSION ? 1 : 0));
        jSONObject.put("type", this.REQUEST_TYPE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("source", (Object) this.sourceList);
        jSONObject2.put(com.taobao.android.fluid.framework.data.remote.a.KEY_EXTEND_PARAMETERS, (Object) this.extendParams);
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }

    public void buildExtendParams() {
        this.VERSION = "2.0";
        this.extendParams = new JSONObject();
        this.extendParams.put(b.REQ_SUPPORTWEEX, (Object) true);
    }

    public String getApi() {
        return this.API_NAME;
    }

    public String getVersion() {
        return this.VERSION;
    }

    public boolean isNeedEcode() {
        return this.NEED_ECODE;
    }

    public boolean isNeedSession() {
        return this.NEED_SESSION;
    }
}
