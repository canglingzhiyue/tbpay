package com.taobao.tao.detail.uimodel;

import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class MoreServiceFragementVO implements Serializable {
    public DeliveryVO delivery;
    public String favcount;
    public List<GuaranteeItemVO> guaranteeItem;
    @Deprecated
    public boolean isJHSorEbookProduct;
    public List<String> promotionList;
    public String promotionName;
    public String quantity;
    public String stuffStatus;
    public String title;

    static {
        kge.a(-800248926);
        kge.a(1028243835);
    }

    public MoreServiceFragementVO() {
        tpc.a("com.taobao.tao.detail.uimodel.MoreServiceFragementVO");
    }
}
