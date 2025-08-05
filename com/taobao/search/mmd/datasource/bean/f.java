package com.taobao.search.mmd.datasource.bean;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TEMPLATE_PROPERTY = "property";
    public static final String TEMPLATE_SINGLE_ROW = "singleRow";

    /* renamed from: a  reason: collision with root package name */
    private String f19165a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    static {
        kge.a(-445358821);
    }

    private f() {
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public static f a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("9f7569f5", new Object[]{jSONObject});
        }
        f fVar = new f();
        fVar.f19165a = jSONObject.optString("fieldTemplate");
        fVar.b = jSONObject.optString("textColor");
        fVar.c = jSONObject.optString("text");
        fVar.d = jSONObject.optString("icon");
        fVar.e = jSONObject.optString("propertyName");
        fVar.f = jSONObject.optString("propertyValueName");
        fVar.g = jSONObject.optString("borderRadius");
        fVar.h = jSONObject.optString("rightIcon");
        fVar.i = jSONObject.optString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR);
        fVar.j = jSONObject.optString("url");
        return fVar;
    }
}
