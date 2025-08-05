package com.taobao.android.detail.sdk.request.jhs.marketing;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class JhsMarketingRequestParams extends DetailVRequestParams implements Serializable {
    private static final String K_ITEM_ID = "itemId";
    private String itemId;

    static {
        kge.a(1116284897);
        kge.a(1028243835);
    }

    public JhsMarketingRequestParams(String str) {
        this.itemId = str;
        tpc.a("com.taobao.android.detail.sdk.request.jhs.marketing.JhsMarketingRequestParams");
    }
}
