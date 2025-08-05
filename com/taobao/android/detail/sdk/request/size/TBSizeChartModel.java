package com.taobao.android.detail.sdk.request.size;

import com.taobao.android.detail.sdk.request.size.model.RateInfo;
import com.taobao.android.detail.sdk.request.size.model.RoleSize;
import com.taobao.android.detail.sdk.request.size.model.SizeChart;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class TBSizeChartModel implements Serializable {
    public RateInfo rateInfo;
    public RoleSize roleSize;
    public SizeChart sizeChart;

    static {
        kge.a(-105231832);
        kge.a(1028243835);
    }

    public TBSizeChartModel() {
        tpc.a("com.taobao.android.detail.sdk.request.size.TBSizeChartModel");
    }
}
