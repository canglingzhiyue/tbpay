package com.taobao.android.detail.sdk.request.o2o;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class QueryO2OData implements Serializable, IMTOPDataObject {
    public long count;
    public JSONObject model;

    static {
        kge.a(-1817276911);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public QueryO2OData() {
        tpc.a("com.taobao.android.detail.sdk.request.o2o.QueryO2OData");
    }
}
