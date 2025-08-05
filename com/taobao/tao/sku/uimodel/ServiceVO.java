package com.taobao.tao.sku.uimodel;

import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class ServiceVO implements Serializable {
    public boolean canOperate;
    public boolean isGroupMulti;
    public boolean isRequired;
    public List<List<ServiceUnitItemVO>> servicesList;

    static {
        kge.a(-1995965022);
        kge.a(1028243835);
    }

    public ServiceVO() {
        tpc.a("com.taobao.tao.sku.uimodel.ServiceVO");
    }
}
