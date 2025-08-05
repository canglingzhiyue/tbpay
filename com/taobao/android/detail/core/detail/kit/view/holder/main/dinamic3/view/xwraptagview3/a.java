package com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f9585a;
    public String b;

    static {
        kge.a(-1186127497);
    }

    public a() {
    }

    public a(JSONObject jSONObject) {
        try {
            this.f9585a = jSONObject.getString("img");
            this.b = jSONObject.getString("text");
        } catch (Exception e) {
            e.printStackTrace();
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.Tag");
    }
}
