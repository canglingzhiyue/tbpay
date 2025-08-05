package com.taobao.social.sdk.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes8.dex */
public class CountAndStatusRequest extends MtopRequest {
    private String API_NAME = "mtop.taobao.social.aggregation.countandstatus";
    private String VERSION = "1.0";

    static {
        kge.a(-208097461);
    }

    public CountAndStatusRequest() {
        setApiName(this.API_NAME);
        setVersion(this.VERSION);
        setNeedEcode(false);
        setNeedSession(true);
        this.dataParams = new HashMap();
    }

    public void setTargetIds(String[] strArr) {
        this.dataParams.put("targetIds", Arrays.toString(strArr));
    }

    public void setCommentNamespace(long j) {
        Map<String, String> map = this.dataParams;
        map.put("commentNamespace", "" + j);
    }

    public void setBrowseNamespace(long j) {
        Map<String, String> map = this.dataParams;
        map.put("browseNamespace", "" + j);
    }

    public void setLikeNamespace(long j) {
        Map<String, String> map = this.dataParams;
        map.put("likeNamespace", "" + j);
    }

    public void setIsLikeCount(boolean z) {
        Map<String, String> map = this.dataParams;
        map.put("isLikeCount", "" + z);
    }

    public void setIsLikeStatus(boolean z) {
        Map<String, String> map = this.dataParams;
        map.put("isLikeStatus", "" + z);
    }

    public void setDislikeNamespace(long j) {
        Map<String, String> map = this.dataParams;
        map.put("dislikeNamespace", "" + j);
    }

    public void setIsDisLikeCount(boolean z) {
        Map<String, String> map = this.dataParams;
        map.put("isDisLikeCount", "" + z);
    }

    public void setIsDisLikeStatus(boolean z) {
        Map<String, String> map = this.dataParams;
        map.put("isDisLikeStatus", "" + z);
    }
}
