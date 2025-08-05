package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import com.alibaba.fastjson.JSONObject;
import tb.kge;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public String f10862a;
    public String b;

    static {
        kge.a(-374111260);
    }

    public f(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f10862a = jSONObject.getString("weexUrl");
            this.b = jSONObject.getString("priority");
        }
    }
}
