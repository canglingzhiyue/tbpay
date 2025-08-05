package com.taobao.android.detail.sdk.request.endorsement;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class EndorsementRequestParams extends DetailVRequestParams implements Serializable {
    public String sellerId;

    static {
        kge.a(-1750071480);
        kge.a(1028243835);
    }

    public EndorsementRequestParams(String str) {
        this.sellerId = str;
        tpc.a("com.taobao.android.detail.sdk.request.endorsement.EndorsementRequestParams");
    }
}
