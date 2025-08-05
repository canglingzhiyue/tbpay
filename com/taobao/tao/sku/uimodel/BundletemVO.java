package com.taobao.tao.sku.uimodel;

import com.taobao.android.detail.sdk.model.node.SkuBaseNode;
import com.taobao.android.detail.sdk.model.node.SkuCoreNode;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class BundletemVO implements Serializable {
    public CatPropertys catPropertys;
    public String itemId;
    public ItemImages itemImages;
    public String itemTitle;
    public String itemUrl;
    public String price;
    public String priceChar;
    public SkuBaseNode skuBase;
    public SkuCoreNode skuCore;
    public String sourceItemId;
    public String timesBuy;

    /* loaded from: classes8.dex */
    public class CatPropertys implements Serializable {
        public String brandId;
        public String brandName;

        static {
            kge.a(302469797);
            kge.a(1028243835);
        }

        public CatPropertys() {
        }
    }

    /* loaded from: classes8.dex */
    public class ItemImages implements Serializable {
        public String[] images;
        public String mainImage;

        static {
            kge.a(-1373702328);
            kge.a(1028243835);
        }

        public ItemImages() {
        }
    }

    static {
        kge.a(-864649977);
        kge.a(1028243835);
    }

    public BundletemVO() {
        tpc.a("com.taobao.tao.sku.uimodel.BundletemVO");
    }
}
