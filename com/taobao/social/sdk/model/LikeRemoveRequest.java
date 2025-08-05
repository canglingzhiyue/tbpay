package com.taobao.social.sdk.model;

import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes8.dex */
public class LikeRemoveRequest extends MtopRequest {
    private String API_NAME = "mtop.taobao.social.like.remove";
    private String VERSION = "1.0";

    static {
        kge.a(1042437258);
    }

    public LikeRemoveRequest() {
        setApiName(this.API_NAME);
        setVersion(this.VERSION);
        setNeedEcode(true);
        setNeedSession(true);
        this.dataParams = new HashMap();
    }

    public void setNamespace(long j) {
        Map<String, String> map = this.dataParams;
        map.put("namespace", "" + j);
    }

    public void setNamespace(String str) {
        Map<String, String> map = this.dataParams;
        map.put("namespace", "" + str);
    }

    public void setTargetId(long j) {
        Map<String, String> map = this.dataParams;
        map.put("targetId", "" + j);
    }

    public void setTargetId(String str) {
        Map<String, String> map = this.dataParams;
        map.put("targetId", "" + str);
    }
}
