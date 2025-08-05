package com.taobao.social.sdk.model;

import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes8.dex */
public class LikeAddRequest extends MtopRequest {
    private String API_NAME = "mtop.taobao.social.like.add";
    private String VERSION = "2.0";

    static {
        kge.a(-515303441);
    }

    public LikeAddRequest() {
        setApiName(this.API_NAME);
        setVersion(this.VERSION);
        setNeedEcode(true);
        setNeedSession(true);
        this.dataParams = new HashMap();
    }

    public void setTargetId(long j) {
        Map<String, String> map = this.dataParams;
        map.put("targetId", "" + j);
    }

    public void setTargetId(String str) {
        Map<String, String> map = this.dataParams;
        map.put("targetId", "" + str);
    }

    public void setNamespace(long j) {
        Map<String, String> map = this.dataParams;
        map.put("namespace", "" + j);
    }

    public void setNamespace(String str) {
        Map<String, String> map = this.dataParams;
        map.put("namespace", "" + str);
    }

    public void setTargetOwnerId(long j) {
        Map<String, String> map = this.dataParams;
        map.put("targetOwnerId", "" + j);
    }

    public void setTargetOwnerId(String str) {
        Map<String, String> map = this.dataParams;
        map.put("targetOwnerId", "" + str);
    }

    public void setTargetCover(String str) {
        this.dataParams.put("targetCover", str);
    }

    public void setTargetUrl(String str) {
        this.dataParams.put("targetUrl", str);
    }

    public void setTargetTitle(String str) {
        this.dataParams.put("targetTitle", str);
    }

    public void setOrigin(String str) {
        this.dataParams.put("origin", str);
    }
}
