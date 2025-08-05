package com.taobao.android.detail.core.model.viewmodel.desc;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import tb.epf;
import tb.eph;
import tb.kge;

/* loaded from: classes4.dex */
public class k extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9759a;
    public eph b;

    static {
        kge.a(601170199);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == 381019392) {
            return super.b();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.ScrollableContainerModel";
    }

    public k(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f9759a = jSONObject.getString("extraText");
        }
    }

    @Override // tb.epf
    public eph b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eph) ipChange.ipc$dispatch("16b5e500", new Object[]{this});
        }
        this.b = super.b();
        return this.b;
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : d() == null || d().isEmpty();
    }
}
