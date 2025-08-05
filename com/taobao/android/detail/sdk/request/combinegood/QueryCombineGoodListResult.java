package com.taobao.android.detail.sdk.request.combinegood;

import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.sku.uimodel.BundletemVO;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class QueryCombineGoodListResult implements Serializable {
    public List<BundletemVO> bundleItemList;
    public Map<String, String> bundleSkuMap;
    public String buyText;
    public String cartText;
    public JSONObject mOriginalMtopData;
    public boolean success;

    static {
        kge.a(1287777986);
        kge.a(1028243835);
    }

    public QueryCombineGoodListResult() {
        tpc.a("com.taobao.android.detail.sdk.request.combinegood.QueryCombineGoodListResult");
    }
}
