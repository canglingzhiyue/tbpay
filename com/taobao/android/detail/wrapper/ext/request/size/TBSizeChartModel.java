package com.taobao.android.detail.wrapper.ext.request.size;

import com.taobao.android.detail.wrapper.request.size.model.RateInfo;
import com.taobao.android.detail.wrapper.request.size.model.RoleSize;
import com.taobao.android.detail.wrapper.request.size.model.SizeChart;
import java.io.Serializable;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class TBSizeChartModel extends MtopResponse implements Serializable {
    public RateInfo rateInfo;
    public RoleSize roleSize;
    public SizeChart sizeChart;

    static {
        kge.a(1689077331);
        kge.a(1028243835);
    }

    public TBSizeChartModel() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartModel");
    }
}
