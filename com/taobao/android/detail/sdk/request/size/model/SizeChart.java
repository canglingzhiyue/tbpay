package com.taobao.android.detail.sdk.request.size.model;

import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SizeChart implements Serializable {
    public List<SizeChartDo> data;
    public String picTitle;
    public int recLine;
    public boolean shadow;
    public String sketchMap;
    public String tip;
    public String title;

    /* loaded from: classes4.dex */
    public static class SizeChartDo implements Serializable {
        public int maxLength;
        public List<String> rowData;
        public String tip;
        public String title;

        static {
            kge.a(-2129077939);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-245559351);
        kge.a(1028243835);
    }

    public SizeChart() {
        tpc.a("com.taobao.android.detail.sdk.request.size.model.SizeChart");
    }
}
