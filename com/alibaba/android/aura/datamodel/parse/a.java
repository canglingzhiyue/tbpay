package com.alibaba.android.aura.datamodel.parse;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "protocol")

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f2131a;
    @JSONField(name = "confirm")
    private boolean b;
    private String c;

    static {
        kge.a(1286601591);
    }

    public a(JSONObject jSONObject, boolean z) {
        this.b = true;
        this.b = z;
        this.f2131a = jSONObject;
    }

    public a(JSONObject jSONObject) {
        this.b = true;
        this.f2131a = jSONObject;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f2131a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }
}
