package com.taobao.android.detail.sdk.request.area;

import com.taobao.android.detail.sdk.model.network.area.AreaInfoModel;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class QuerySupportedAreaResult extends BaseOutDo {
    private AreaInfoModel data;

    static {
        kge.a(-715756846);
    }

    public QuerySupportedAreaResult() {
        tpc.a("com.taobao.android.detail.sdk.request.area.QuerySupportedAreaResult");
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public AreaInfoModel mo2429getData() {
        return this.data;
    }

    public void setData(AreaInfoModel areaInfoModel) {
        this.data = areaInfoModel;
    }
}
