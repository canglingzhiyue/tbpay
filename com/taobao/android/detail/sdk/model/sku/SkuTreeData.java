package com.taobao.android.detail.sdk.model.sku;

import com.taobao.android.detail.sdk.model.base.Unit;
import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

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
            kge.a(-1317380071);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(536586797);
    }

    public SkuTreeData() {
        this.type = 3;
        tpc.a("com.taobao.android.detail.sdk.model.sku.SkuTreeData");
    }
}
