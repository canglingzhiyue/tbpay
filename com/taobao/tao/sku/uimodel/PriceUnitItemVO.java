package com.taobao.tao.sku.uimodel;

import java.io.Serializable;
import java.util.HashMap;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class PriceUnitItemVO implements Serializable {
    public String add;
    public String depositPrice;
    public int display;
    public String limitCount;
    public String limitDesc;
    public String limitTime;
    public String logo;
    public String name;
    public HashMap<String, String> nameStyle;
    public String price;
    public String tip;
    public boolean valid;

    static {
        kge.a(1155531853);
        kge.a(1028243835);
    }

    public PriceUnitItemVO() {
        tpc.a("com.taobao.tao.sku.uimodel.PriceUnitItemVO");
    }
}
