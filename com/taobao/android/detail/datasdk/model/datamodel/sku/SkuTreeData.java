package com.taobao.android.detail.datasdk.model.datamodel.sku;

import com.taobao.android.detail.datasdk.model.datamodel.base.Unit;
import java.io.Serializable;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class SkuTreeData extends BaseSkuInputComponent {
    public Unit api;
    public List<Branch> branches;
    public Boolean sync;

    /* loaded from: classes4.dex */
    public static class Branch implements Serializable {
        public List<Branch> branches;
        public Boolean leaf;
        public String query;
        public Boolean sync;
        public String text;

        static {
            kge.a(152878227);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-863042829);
    }

    public SkuTreeData() {
        this.type = 3;
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.sku.SkuTreeData");
    }
}
