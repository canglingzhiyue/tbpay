package com.taobao.android.detail2.core.framework.base.media.videodecide.net;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.a;
import java.io.Serializable;
import mtopsdk.mtop.domain.MtopRequest;
import tb.fla;
import tb.kge;

/* loaded from: classes5.dex */
public class MediaVideoInfoRequestV2 implements Serializable, fla {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String API_NAME = "mtop.taobao.content.detail.video.info";
    private String VERSION = "2.0";
    public long videoId = 0;
    public String source = null;
    public String type = null;
    public String extendParameters = null;

    static {
        kge.a(2027600863);
        kge.a(1028243835);
        kge.a(1579116182);
    }

    @Override // tb.fla
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return null;
    }

    public String getApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this}) : this.API_NAME;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.VERSION;
    }

    @Override // tb.fla
    public MtopRequest getMtopRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8175faa3", new Object[]{this});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(getData());
        mtopRequest.setApiName(this.API_NAME);
        mtopRequest.setVersion(this.VERSION);
        return mtopRequest;
    }

    private String getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoId", (Object) Long.valueOf(this.videoId));
        jSONObject.put("source", (Object) this.source);
        jSONObject.put("type", (Object) this.type);
        jSONObject.put(a.KEY_EXTEND_PARAMETERS, (Object) this.extendParameters);
        return JSONObject.toJSONString(jSONObject);
    }
}
