package com.taobao.android.detail.sdk.request.rights;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class RightListRequestParams extends DetailVRequestParams implements Serializable {
    public String model = "Detail";
    public String serviceIds;

    static {
        kge.a(150384787);
        kge.a(1028243835);
    }

    public RightListRequestParams(String str) {
        this.serviceIds = str;
        tpc.a("com.taobao.android.detail.sdk.request.rights.RightListRequestParams");
    }
}
