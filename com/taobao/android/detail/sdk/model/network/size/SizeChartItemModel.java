package com.taobao.android.detail.sdk.model.network.size;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SizeChartItemModel implements Serializable {
    public int maxLength;
    public List<String> rowData = new ArrayList();
    public String tip;
    public String title;

    static {
        kge.a(-950036576);
        kge.a(1028243835);
    }

    public SizeChartItemModel() {
        tpc.a("com.taobao.android.detail.sdk.model.network.size.SizeChartItemModel");
    }
}
