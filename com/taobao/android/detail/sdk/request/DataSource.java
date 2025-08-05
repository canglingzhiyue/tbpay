package com.taobao.android.detail.sdk.request;

import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class DataSource implements Serializable {
    public String apiName;
    public String apiVersion;

    static {
        kge.a(613248389);
        kge.a(1028243835);
    }

    public DataSource(String str, String str2) {
        this.apiName = str;
        this.apiVersion = str2;
        tpc.a("com.taobao.android.detail.sdk.request.DataSource");
    }
}
