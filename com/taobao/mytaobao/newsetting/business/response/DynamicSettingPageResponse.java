package com.taobao.mytaobao.newsetting.business.response;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class DynamicSettingPageResponse extends BaseOutDo {
    public DynamicSettingPageResult data;

    static {
        kge.a(478420861);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public DynamicSettingPageResult mo2429getData() {
        return this.data;
    }

    public void setData(DynamicSettingPageResult dynamicSettingPageResult) {
        this.data = dynamicSettingPageResult;
    }
}
