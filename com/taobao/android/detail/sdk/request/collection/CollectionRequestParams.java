package com.taobao.android.detail.sdk.request.collection;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class CollectionRequestParams extends DetailVRequestParams implements Serializable {
    public static final String K_ITEM_ID = "itemId";
    public String favType = "1";
    public String itemId;

    static {
        kge.a(1664655206);
        kge.a(1028243835);
    }

    public CollectionRequestParams(String str) {
        this.itemId = str;
        tpc.a("com.taobao.android.detail.sdk.request.collection.CollectionRequestParams");
    }
}
