package com.taobao.android.detail.core.request.area;

import com.taobao.android.detail.core.model.datamodel.area.AreaInfoModel;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class QuerySupportedAreaResult extends BaseOutDo {
    private AreaInfoModel data;

    static {
        kge.a(2072054765);
    }

    public QuerySupportedAreaResult() {
        emu.a("com.taobao.android.detail.core.request.area.QuerySupportedAreaResult");
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
