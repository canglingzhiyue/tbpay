package com.taobao.android.detail.sdk.request.combinegood;

import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class QueryCombineGoodRequestParams extends DetailVRequestParams implements Serializable {
    public String itemId;

    static {
        kge.a(1132481326);
        kge.a(1028243835);
    }

    public QueryCombineGoodRequestParams(String str) {
        this.itemId = str;
        tpc.a("com.taobao.android.detail.sdk.request.combinegood.QueryCombineGoodRequestParams");
    }
}
