package com.taobao.tao.sku.uimodel;

import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class ServiceUnitItemVO implements Serializable {
    @Deprecated
    public String add;
    public boolean free;
    public boolean isDefaultSelected;
    public boolean isMustSelect;
    public boolean multi;
    public String name;
    public String price;
    public String valueId;

    static {
        kge.a(500921785);
        kge.a(1028243835);
    }

    public ServiceUnitItemVO() {
        tpc.a("com.taobao.tao.sku.uimodel.ServiceUnitItemVO");
    }
}
