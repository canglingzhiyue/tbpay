package com.taobao.android.detail.datasdk.model.datamodel.sku;

import java.io.Serializable;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AreaNewItemVO implements Serializable {
    public List<AreaNewItemVO> branches;
    public boolean leaf;
    public String query;
    public String text;

    static {
        kge.a(1460446093);
        kge.a(1028243835);
    }

    public AreaNewItemVO() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.sku.AreaNewItemVO");
    }
}
