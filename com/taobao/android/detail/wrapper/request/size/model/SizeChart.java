package com.taobao.android.detail.wrapper.request.size.model;

import java.io.Serializable;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class SizeChart implements Serializable {
    public List<SizeChartDo> data;
    public String picTitle;
    public int recLine;
    public boolean shadow;
    public String sketchMap;
    public String tip;
    public String title;

    /* loaded from: classes5.dex */
    public static class SizeChartDo implements Serializable {
        public int maxLength;
        public List<String> rowData;
        public String tip;
        public String title;

        static {
            kge.a(1757997972);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(521737360);
        kge.a(1028243835);
    }

    public SizeChart() {
        emu.a("com.taobao.android.detail.wrapper.request.size.model.SizeChart");
    }
}
