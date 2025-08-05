package com.taobao.android.detail.datasdk.model.datamodel.sku;

import com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
    public class CatPropertys implements Serializable {
        public String brandId;
        public String brandName;

        static {
            kge.a(1460676363);
            kge.a(1028243835);
        }

        public CatPropertys() {
        }
    }

    /* loaded from: classes4.dex */
    public class ItemImages implements Serializable {
        public String[] images;
        public String mainImage;

        static {
            kge.a(-268587730);
            kge.a(1028243835);
        }

        public ItemImages() {
        }
    }

    static {
        kge.a(-1477543199);
        kge.a(1028243835);
    }

    public BundletemVO() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.sku.BundletemVO");
    }
}
