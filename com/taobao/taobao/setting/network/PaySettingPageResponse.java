package com.taobao.taobao.setting.network;

import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes8.dex */
public class PaySettingPageResponse extends BaseOutDo {
    public PaySettingPageResult data;

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public PaySettingPageResult mo2429getData() {
        return this.data;
    }

    public void setData(PaySettingPageResult paySettingPageResult) {
        this.data = paySettingPageResult;
    }
}
