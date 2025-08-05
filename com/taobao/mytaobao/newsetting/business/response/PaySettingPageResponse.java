package com.taobao.mytaobao.newsetting.business.response;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class PaySettingPageResponse extends BaseOutDo {
    public PaySettingPageResult data;

    static {
        kge.a(-1179579788);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public PaySettingPageResult mo2429getData() {
        return this.data;
    }

    public void setData(PaySettingPageResult paySettingPageResult) {
        this.data = paySettingPageResult;
    }
}
