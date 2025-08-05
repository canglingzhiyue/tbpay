package com.taobao.android.ultron.common.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONArray f15730a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    static {
        kge.a(-1404702153);
    }

    public a() {
    }

    public a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f15730a = jSONObject.getJSONArray("type");
            this.b = jSONObject.getString("containerType");
            this.c = jSONObject.getString("name");
            this.d = jSONObject.getString("url");
            this.e = jSONObject.getString("version");
            this.f = jSONObject.getString("md5");
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (("DynamicTemplate [type=" + this.f15730a) != null) {
            return this.f15730a.toJSONString();
        }
        return "null, containerType=" + this.b + ", name=" + this.c + ", url=" + this.d + ", version=" + this.e + riy.ARRAY_END_STR;
    }
}
