package com.taobao.android.detail.sdk.request.jhs.marketingaction;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class JhsMarketingActionRequestParams extends DetailVRequestParams implements Serializable {
    public String attributes;
    public String id;
    public String itemId;
    public String type;

    static {
        kge.a(1746750849);
        kge.a(1028243835);
    }

    public JhsMarketingActionRequestParams(String str, String str2, String str3, String str4) {
        this.type = str2;
        this.attributes = str4;
        this.itemId = str;
        this.id = str3;
        tpc.a("com.taobao.android.detail.sdk.request.jhs.marketingaction.JhsMarketingActionRequestParams");
    }
}
