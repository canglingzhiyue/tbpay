package com.taobao.tao.detail.uimodel;

import com.taobao.detail.domain.base.PriceUnit;
import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class WanrentuanVO implements Serializable {
    @Deprecated
    public String balance;
    @Deprecated
    public String deposit;
    @Deprecated
    public String originalPrice;
    @Deprecated
    public String preSaleNum;
    public List<PriceUnit> priceUnits;
    @Deprecated
    public String remainingTime;
    @Deprecated
    public String totalPrice;

    static {
        kge.a(-852616202);
        kge.a(1028243835);
    }

    public WanrentuanVO() {
        tpc.a("com.taobao.tao.detail.uimodel.WanrentuanVO");
    }
}
