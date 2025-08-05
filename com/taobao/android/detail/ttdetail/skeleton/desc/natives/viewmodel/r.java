package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import tb.kge;

/* loaded from: classes5.dex */
public class r extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10891a;
    public g b;

    static {
        kge.a(502998044);
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        if (str.hashCode() == 1149753565) {
            return super.g();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public r(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f10891a = jSONObject.getString("extraText");
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public g g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4487d8dd", new Object[]{this});
        }
        this.b = super.g();
        return this.b;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : f() == null || f().isEmpty();
    }
}
