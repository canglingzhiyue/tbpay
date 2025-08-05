package com.taobao.android.detail.core.request.jhs.marketing;

import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class JhsMarketingRequestParams extends a implements Serializable {
    private static final String K_ITEM_ID = "itemId";
    private String itemId;

    static {
        kge.a(1153262396);
        kge.a(1028243835);
    }

    public JhsMarketingRequestParams(String str) {
        this.itemId = str;
        emu.a("com.taobao.android.detail.core.request.jhs.marketing.JhsMarketingRequestParams");
    }
}
