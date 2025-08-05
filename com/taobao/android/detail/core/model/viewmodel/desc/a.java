package com.taobao.android.detail.core.model.viewmodel.desc;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.detail.domain.base.Unit;
import tb.epf;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9743a;
    public String b;
    public String c;
    public String d;
    public Unit e;

    static {
        kge.a(2055871638);
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.CouponViewModel";
    }

    public a(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f9743a = jSONObject.getString("price");
        this.b = jSONObject.getString("timePeriod");
        this.c = jSONObject.getString("tips");
        this.d = jSONObject.getString("title");
        String string = jSONObject.getString("getCouponApi");
        if (TextUtils.isEmpty(string)) {
            this.e = null;
            return;
        }
        try {
            this.e = (Unit) JSONObject.parseObject(string, Unit.class);
        } catch (Exception unused) {
            this.e = null;
        }
    }
}
