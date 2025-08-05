package com.taobao.android.detail.wrapper.ext.request.size;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class TBSizeChartModelOutDo_ extends BaseOutDo {
    private TBSizeChartModel data;

    static {
        kge.a(389765945);
    }

    public TBSizeChartModelOutDo_() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartModelOutDo_");
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public TBSizeChartModel mo2429getData() {
        return this.data;
    }

    public void setData(TBSizeChartModel tBSizeChartModel) {
        this.data = tBSizeChartModel;
    }
}
