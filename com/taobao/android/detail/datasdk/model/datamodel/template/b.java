package com.taobao.android.detail.datasdk.model.datamodel.template;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.vmodel.main.c;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f10063a;
    public JSONObject b;

    static {
        kge.a(1055736113);
    }

    public b(String str) {
        this.b = JSON.parseObject(str);
        JSONObject parseObject = JSON.parseObject(this.b.getString("value"));
        if (parseObject == null) {
            return;
        }
        this.f10063a = parseObject.getString(c.K_API_NAME);
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.DescRequestApi");
    }
}
