package com.taobao.taobao.scancode.common.mtop.resp;

import com.taobao.taobao.scancode.common.mtop.data.CainiaoLdDetailH5AuthGetRespData;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class CainiaoLdDetailH5AuthGetResp extends BaseOutDo {
    private CainiaoLdDetailH5AuthGetRespData data;

    static {
        kge.a(1283942745);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public CainiaoLdDetailH5AuthGetRespData mo2429getData() {
        return this.data;
    }

    public void setData(CainiaoLdDetailH5AuthGetRespData cainiaoLdDetailH5AuthGetRespData) {
        this.data = cainiaoLdDetailH5AuthGetRespData;
    }
}
