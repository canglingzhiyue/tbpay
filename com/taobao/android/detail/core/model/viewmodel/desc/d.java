package com.taobao.android.detail.core.model.viewmodel.desc;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import tb.eby;
import tb.epf;
import tb.kge;

/* loaded from: classes4.dex */
public class d extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9746a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    static {
        kge.a(722940667);
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.ItemInfo2ViewModel";
    }

    public d(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f9746a = jSONObject.getString(eby.KEY_PIC_URL);
        this.b = jSONObject.getString("price");
        this.c = jSONObject.getString("title");
        this.d = jSONObject.getString("tips");
        this.e = jSONObject.getString("jumpUrl");
        this.f = jSONObject.getString("itemId");
        this.g = jSONObject.getString("avType");
        this.h = jSONObject.getString("widthRatio");
    }
}
