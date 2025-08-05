package com.taobao.android.gateway.datastructure;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f12701a;
    private a b;
    private JSONObject c;
    private b d;
    private JSONArray e;
    private c f;

    static {
        kge.a(739973850);
    }

    public b(String str, a aVar, JSONObject jSONObject) {
        this(str, aVar, jSONObject, null, null);
    }

    public b(String str, a aVar, JSONObject jSONObject, JSONArray jSONArray, b bVar) {
        this.f12701a = str;
        this.b = aVar;
        this.c = jSONObject;
        this.d = bVar;
        this.e = jSONArray;
        this.d = bVar;
        b bVar2 = this.d;
        if (bVar2 != null) {
            this.f = bVar2.f();
        } else {
            this.f = new c();
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f12701a;
    }

    public a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9278c99e", new Object[]{this}) : this.b;
    }

    public b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("cc436b9c", new Object[]{this}) : this.d;
    }

    public JSONArray e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("ad1c0252", new Object[]{this}) : this.e;
    }

    public c f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3fd8af79", new Object[]{this}) : this.f;
    }
}
