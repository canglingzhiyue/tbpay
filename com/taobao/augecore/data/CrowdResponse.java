package com.taobao.augecore.data;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes6.dex */
public class CrowdResponse extends BaseOutDo implements Serializable {
    private CrowdResponseData data;

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public CrowdResponseData mo2429getData() {
        return this.data;
    }

    public void setData(CrowdResponseData crowdResponseData) {
        this.data = crowdResponseData;
    }
}
