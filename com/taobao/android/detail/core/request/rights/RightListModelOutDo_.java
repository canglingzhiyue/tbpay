package com.taobao.android.detail.core.request.rights;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class RightListModelOutDo_ extends BaseOutDo {
    private RightListModel data;

    static {
        kge.a(50877064);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public RightListModel mo2429getData() {
        return this.data;
    }

    public void setData(RightListModel rightListModel) {
        this.data = rightListModel;
    }
}
