package com.taobao.tao.flexbox.layoutmanager.player.videodecide.model;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.taobao.android.fluid.framework.data.remote.a;
import com.taobao.login4android.session.constants.SessionConstants;
import tb.kge;

/* loaded from: classes8.dex */
public class MediaVideoInfoRequestV2 extends MediaVideoInfoRequest {
    private String API_NAME = "mtop.taobao.content.detail.video.info";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String REQUEST_TYPE = "GET";
    public long videoId = 0;
    public String source = null;
    public String type = null;
    public String extendParameters = null;

    static {
        kge.a(415844815);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequest
    public boolean isEnableServerABR() {
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequest
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api", this.API_NAME);
        jSONObject.put("v", this.VERSION);
        jSONObject.put(SessionConstants.ECODE, Integer.valueOf(this.NEED_ECODE ? 1 : 0));
        jSONObject.put(MspGlobalDefine.SESSION, Integer.valueOf(this.NEED_SESSION ? 1 : 0));
        jSONObject.put("type", this.REQUEST_TYPE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("videoId", (Object) Long.valueOf(this.videoId));
        jSONObject2.put("source", (Object) this.source);
        jSONObject2.put("type", (Object) this.type);
        jSONObject2.put(a.KEY_EXTEND_PARAMETERS, (Object) this.extendParameters);
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequest
    public String getApi() {
        return this.API_NAME;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequest
    public String getVersion() {
        return this.VERSION;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequest
    public boolean isNeedEcode() {
        return this.NEED_ECODE;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequest
    public boolean isNeedSession() {
        return this.NEED_SESSION;
    }
}
