package com.taobao.android.detail2.core.framework.view.navbar;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;
import tb.kge;

/* loaded from: classes5.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f11646a;
    private JSONObject b;
    private String c;
    private String d;
    private int e;
    private com.taobao.android.detail2.core.framework.data.model.d f;
    private JSONObject g;
    private String h;

    static {
        kge.a(1469033012);
    }

    public l(JSONObject jSONObject, int i, com.taobao.android.detail2.core.framework.data.model.d dVar) {
        if (jSONObject == null) {
            return;
        }
        this.g = jSONObject;
        this.f11646a = jSONObject.getString(MspWebActivity.BTN_TYPE);
        this.h = jSONObject.getString("bizType");
        this.b = jSONObject.getJSONObject("fields");
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null) {
            this.d = jSONObject2.getString("iconUrl");
            this.c = this.b.getString("iconFont");
        }
        this.e = i;
        this.f = dVar;
    }

    public boolean a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f2441c6", new Object[]{this, lVar})).booleanValue();
        }
        if (lVar == null) {
            return false;
        }
        return (Objects.equals(this.c, lVar.c) || Objects.equals(this.d, lVar.d)) && Objects.equals(this.f11646a, lVar.f11646a) && this.e == lVar.e;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f11646a;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.e;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.g;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.c;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d;
    }

    public com.taobao.android.detail2.core.framework.data.model.d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("cf4461be", new Object[]{this}) : this.f;
    }
}
