package com.taobao.android.detail.wrapper.ext.request.o2o;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class QueryO2OData implements Serializable, IMTOPDataObject {
    public long count;
    public JSONObject model;

    static {
        kge.a(280191750);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public QueryO2OData() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.o2o.QueryO2OData");
    }
}
