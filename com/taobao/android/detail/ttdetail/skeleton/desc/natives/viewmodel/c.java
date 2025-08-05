package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.Unit;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10869a;
    public String b;
    public String c;
    public String d;
    public Unit e;

    static {
        kge.a(-239816719);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public c(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f10869a = jSONObject.getString("price");
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
