package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import tb.kge;

/* loaded from: classes5.dex */
public class w extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10897a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;
    public String h;

    static {
        kge.a(1256241121);
    }

    public w(ComponentModel componentModel) {
        super(componentModel);
        com.taobao.android.detail.ttdetail.utils.i.a("MyLog", "DescViewModelFactory--创建Vessel");
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.b = jSONObject.getString("bizType");
        this.f = jSONObject.getIntValue("height");
        this.e = jSONObject.getIntValue("loadMode");
        if (this.f < 0) {
            this.f = 0;
        }
        if (this.e < 0) {
            this.e = 0;
        }
        this.f10897a = jSONObject.getString("url");
        this.c = jSONObject.getString("md5");
        this.d = jSONObject.getString("spm");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.g = jSONObject2.getString("itemId");
        this.h = jSONObject2.getString("sellerId");
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.f10897a);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.l;
    }
}
