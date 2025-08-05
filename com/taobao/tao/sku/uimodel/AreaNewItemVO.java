package com.taobao.tao.sku.uimodel;

import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class AreaNewItemVO implements Serializable {
    public List<AreaNewItemVO> branches;
    public boolean leaf;
    public String query;
    public String text;

    static {
        kge.a(2040312883);
        kge.a(1028243835);
    }

    public AreaNewItemVO() {
        tpc.a("com.taobao.tao.sku.uimodel.AreaNewItemVO");
    }
}
