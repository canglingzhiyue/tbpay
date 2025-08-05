package com.taobao.android.abilitykit.ability.pop.render;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import kotlin.jvm.internal.q;
import tb.dle;
import tb.dlr;
import tb.dlx;
import tb.fmg;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b<P extends com.taobao.android.abilitykit.ability.pop.model.c, CONTEXT extends dlr> implements IAKPopRender<P, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.abilitykit.ability.pop.model.c f8938a;
    private dlx b;
    private fmg c;

    static {
        kge.a(63233293);
        kge.a(1155607034);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void dW_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b500d3", new Object[]{this});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public /* bridge */ /* synthetic */ void a(dle dleVar, com.taobao.android.abilitykit.ability.pop.model.c cVar, View view, d dVar) {
        a((b<P, CONTEXT>) ((dlr) dleVar), (dlr) cVar, view, dVar);
    }

    public final void a(dlx dlxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56303e8", new Object[]{this, dlxVar});
        } else {
            this.b = dlxVar;
        }
    }

    public void a(CONTEXT abilityRuntimeContext, P params, View view, d callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b1a31a", new Object[]{this, abilityRuntimeContext, params, view, callback});
            return;
        }
        q.d(abilityRuntimeContext, "abilityRuntimeContext");
        q.d(params, "params");
        q.d(callback, "callback");
        this.f8938a = params;
        Context a2 = abilityRuntimeContext.a();
        if (!(a2 instanceof dlx)) {
            a2 = null;
        }
        this.b = (dlx) a2;
        Context a3 = abilityRuntimeContext.a();
        if (!(a3 instanceof fmg)) {
            a3 = null;
        }
        this.c = (fmg) a3;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(String type, JSONObject jSONObject) {
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, type, jSONObject});
            return;
        }
        q.d(type, "type");
        com.taobao.android.abilitykit.ability.pop.model.c cVar = this.f8938a;
        if (cVar != null && (bVar = cVar.f8913a) != null && !bVar.y()) {
            return;
        }
        if (q.a((Object) type, (Object) IAKPopRender.LifecycleType.CHANGE_POSITION) || q.a((Object) type, (Object) IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE)) {
            dlx dlxVar = this.b;
            if (dlxVar == null) {
                return;
            }
            dlxVar.a(jSONObject);
            return;
        }
        dlx dlxVar2 = this.b;
        if (dlxVar2 == null) {
            return;
        }
        dlxVar2.a(type, jSONObject);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void b(String type, JSONObject jSONObject) {
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        fmg fmgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, type, jSONObject});
            return;
        }
        q.d(type, "type");
        com.taobao.android.abilitykit.ability.pop.model.c cVar = this.f8938a;
        if (cVar == null || (bVar = cVar.f8913a) == null || !bVar.F() || (fmgVar = this.c) == null) {
            return;
        }
        fmgVar.b(type, jSONObject);
    }
}
