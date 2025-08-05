package com.taobao.android.goodprice.homepage.service.impl.bizservice.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public final class BxUploadParams implements IMTOPDataObject {
    public String appId;
    public String params;

    static {
        kge.a(1993551424);
        kge.a(-350052935);
    }

    public BxUploadParams(String str, String str2) {
        this.appId = str;
        this.params = str2;
    }
}
