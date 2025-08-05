package com.taobao.tao.detail.uimodel;

import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class ItemVO implements Serializable {
    public String evaluateCount;
    public String favcount;
    public String itemNumId;
    public String itemStatus;
    public String location;
    public String[] picsPath;
    public String price;
    public String quantity;
    public String quantityText;
    public boolean sku;
    public String stuffStatus;
    public String title;
    public String totalSoldQuantity;
    public String[] videoPath;

    static {
        kge.a(-1318070428);
        kge.a(1028243835);
    }

    public ItemVO() {
        tpc.a("com.taobao.tao.detail.uimodel.ItemVO");
    }
}
