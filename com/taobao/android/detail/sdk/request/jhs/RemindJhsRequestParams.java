package com.taobao.android.detail.sdk.request.jhs;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class RemindJhsRequestParams extends DetailVRequestParams implements Serializable {
    public String itemNumId;
    public String salesSite;

    static {
        kge.a(1582341279);
        kge.a(1028243835);
    }

    public RemindJhsRequestParams(String str) {
        this.itemNumId = str;
        tpc.a("com.taobao.android.detail.sdk.request.jhs.RemindJhsRequestParams");
    }
}
