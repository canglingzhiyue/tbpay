package com.taobao.tao.detail.uimodel;

import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class DeliveryVO implements Serializable {
    public String areaId;
    public String deliveryFeeType;
    public List<String> deliveryFees;
    public String destination;
    public String firstFee;
    public String title;

    static {
        kge.a(55695365);
        kge.a(1028243835);
    }

    public DeliveryVO() {
        tpc.a("com.taobao.tao.detail.uimodel.DeliveryVO");
    }
}
