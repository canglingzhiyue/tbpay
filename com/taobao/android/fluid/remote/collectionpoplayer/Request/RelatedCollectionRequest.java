package com.taobao.android.fluid.remote.collectionpoplayer.Request;

import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes5.dex */
public class RelatedCollectionRequest extends MtopRequest {
    private String API_NAME = "mtop.cogman.container.center.login";
    private String VERSION = "1.0";
    public String appId;
    private String entityId;
    private String params;

    static {
        kge.a(2109151622);
    }

    @Override // mtopsdk.mtop.domain.MtopRequest
    public boolean isNeedEcode() {
        return false;
    }

    @Override // mtopsdk.mtop.domain.MtopRequest
    public boolean isNeedSession() {
        return false;
    }

    public void setEntityId(String str) {
        this.entityId = str;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public String getApi() {
        return this.appId;
    }

    @Override // mtopsdk.mtop.domain.MtopRequest
    public String getVersion() {
        return this.VERSION;
    }
}
