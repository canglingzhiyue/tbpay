package com.taobao.tao.detail.uimodel.presale;

import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class PreSaleVO implements Serializable {
    public String depositPrice;
    public String endTime;
    public String origPrice;
    public String price;
    public String startTime;
    public int type;

    static {
        kge.a(680087046);
        kge.a(1028243835);
    }

    public PreSaleVO() {
        tpc.a("com.taobao.tao.detail.uimodel.presale.PreSaleVO");
    }
}
