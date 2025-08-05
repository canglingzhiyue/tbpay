package com.taobao.android.detail.sdk.request.diva;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class DivaExtraRelationRequest extends DetailVRequestParams implements Serializable {
    public String fileId;
    public String itemId;
    public String sellerId;

    static {
        kge.a(-15434958);
        kge.a(1028243835);
    }

    public DivaExtraRelationRequest(String str, String str2, String str3) {
        this.itemId = str;
        this.fileId = str2;
        this.sellerId = str3;
        tpc.a("com.taobao.android.detail.sdk.request.diva.DivaExtraRelationRequest");
    }
}
