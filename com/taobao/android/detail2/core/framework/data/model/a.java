package com.taobao.android.detail2.core.framework.data.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fjt;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f11520a;
    public JSONObject b;
    public String c;
    public String d;
    public String e;

    static {
        kge.a(34211669);
    }

    public a(JSONObject jSONObject) {
        a(jSONObject);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            fjt.a(fjt.TAG_RENDER, "PlaceHolderComponent解析失败，root为空");
        } else {
            this.f11520a = jSONObject;
            this.b = jSONObject.getJSONObject("data");
            JSONObject jSONObject2 = this.b;
            if (jSONObject2 == null) {
                fjt.a(fjt.TAG_RENDER, "PlaceHolderComponent解析失败，root.data为空");
                return;
            }
            this.c = jSONObject2.getString("imageUrl");
            this.d = this.b.getString("contentModeScene");
            this.e = this.b.getString("imageRatio");
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
    }
}
