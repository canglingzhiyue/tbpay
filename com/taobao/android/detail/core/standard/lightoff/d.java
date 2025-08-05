package com.taobao.android.detail.core.standard.lightoff;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import tb.aqs;
import tb.ekk;
import tb.ekl;
import tb.elq;
import tb.elr;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.locator.receiver.lightOff")
/* loaded from: classes4.dex */
public final class d implements ekl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private elq f9838a;

    static {
        kge.a(240494963);
        kge.a(-1823923563);
    }

    @Override // tb.ekl
    public String F_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec7b57c0", new Object[]{this});
        }
        return null;
    }

    @Override // tb.eki
    public void b(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d586e2b4", new Object[]{this, ekkVar});
        }
    }

    @Override // tb.eki
    public void c(ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c409e935", new Object[]{this, ekkVar});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public d() {
        emu.a("com.taobao.android.detail.core.standard.lightoff.PicGalleryLightOffLocatorExtension");
    }

    @Override // tb.arl
    public void onCreate(q qVar, com.alibaba.android.aura.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f9838a = elr.a((String) qVar.a("token", String.class));
        }
    }

    @Override // tb.eki
    public void a(ekk ekkVar) {
        AURARenderComponent f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
        } else if (this.f9838a == null || (f = ekkVar.f()) == null || f.data == null || f.data.fields == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            Object obj = f.data.fields.get("code");
            String str = obj instanceof String ? (String) obj : "";
            jSONObject.put(ThemisConfig.SCENE_SELECT, (Object) str);
            this.f9838a.c(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) str);
            if (this.f9838a.i() == null) {
                return;
            }
            this.f9838a.i().a(jSONObject2);
        }
    }
}
