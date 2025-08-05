package com.taobao.android.detail.sdk.model.template;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.vmodel.main.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f10307a;
    public JSONObject b;

    static {
        kge.a(-1572598165);
    }

    public b(String str) {
        tpc.a("com.taobao.android.detail.sdk.model.template.DescRequestApi");
        this.b = JSON.parseObject(str);
        JSONObject parseObject = JSON.parseObject(this.b.getString("value"));
        if (parseObject == null) {
            return;
        }
        this.f10307a = parseObject.getString(c.K_API_NAME);
    }
}
