package com.taobao.android.detail.wrapper.request.size.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class SizeChartItemModel implements Serializable {
    public int maxLength;
    public List<String> rowData = new ArrayList();
    public String tip;
    public String title;

    static {
        kge.a(-369118938);
        kge.a(1028243835);
    }

    public SizeChartItemModel() {
        emu.a("com.taobao.android.detail.wrapper.request.size.model.SizeChartItemModel");
    }
}
