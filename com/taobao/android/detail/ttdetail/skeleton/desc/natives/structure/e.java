package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import tb.kge;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public String f10861a;
    public JSONObject b;

    static {
        kge.a(-732451718);
    }

    public e(String str) {
        this.b = JSON.parseObject(str);
        JSONObject parseObject = JSON.parseObject(this.b.getString("value"));
        if (parseObject == null) {
            return;
        }
        this.f10861a = parseObject.getString(com.taobao.android.detail.sdk.vmodel.main.c.K_API_NAME);
    }
}
