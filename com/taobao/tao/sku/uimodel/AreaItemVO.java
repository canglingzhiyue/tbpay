package com.taobao.tao.sku.uimodel;

import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class AreaItemVO implements Serializable {
    public List<AreaItemVO> areas;
    public boolean city;
    public String cityId;
    public String name;

    static {
        kge.a(524948741);
        kge.a(1028243835);
    }

    public AreaItemVO() {
        tpc.a("com.taobao.tao.sku.uimodel.AreaItemVO");
    }
}
