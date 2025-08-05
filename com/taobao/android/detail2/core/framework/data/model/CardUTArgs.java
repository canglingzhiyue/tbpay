package com.taobao.android.detail2.core.framework.data.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class CardUTArgs implements Serializable {
    public String pageName;
    public String spmCnt;

    static {
        kge.a(1306871703);
        kge.a(1028243835);
    }

    public CardUTArgs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.pageName = jSONObject.getString("pageName");
        this.spmCnt = jSONObject.getString("spmCnt");
    }
}
