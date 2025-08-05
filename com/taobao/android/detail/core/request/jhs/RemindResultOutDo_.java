package com.taobao.android.detail.core.request.jhs;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class RemindResultOutDo_ extends BaseOutDo {
    private RemindResult data;

    static {
        kge.a(1190788327);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public RemindResult mo2429getData() {
        return this.data;
    }

    public void setData(RemindResult remindResult) {
        this.data = remindResult;
    }
}
