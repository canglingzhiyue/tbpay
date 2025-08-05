package com.taobao.tao.sku.uimodel;

import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class SkuTitleBarVO implements Serializable {
    public String itemTitle;
    public int limitCount;
    public String otherPrice;
    public String otherPriceName;
    public String picTips;
    public String picUrl;
    public String price;
    public String quantity;
    public String quantityText;
    public String unSelectText;

    static {
        kge.a(-1877854459);
        kge.a(1028243835);
    }

    public SkuTitleBarVO() {
        tpc.a("com.taobao.tao.sku.uimodel.SkuTitleBarVO");
    }
}
