package com.taobao.android.detail.ttdetail.component.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.b;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* loaded from: classes4.dex */
public class s implements b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f10561a;

    public s(r rVar) {
        this.f10561a = rVar;
    }

    @Override // com.taobao.android.detail.ttdetail.async.b.a
    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (com.taobao.android.detail.ttdetail.utils.a.b(this.f10561a.mComponentData)) {
            this.f10561a.fireExposeEvent(new RuntimeAbilityParam[0]);
            r.b(this.f10561a);
            r rVar = this.f10561a;
            r.a(rVar, rVar.mComponentData, jSONObject);
            this.f10561a.getParentComponent().updateComponent();
        } else {
            a("not set component fields asyncStatus=success");
        }
    }

    @Override // com.taobao.android.detail.ttdetail.async.b.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            r.a(this.f10561a, false);
        }
    }
}
