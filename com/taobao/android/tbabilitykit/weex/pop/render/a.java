package com.taobao.android.tbabilitykit.weex.pop.render;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.a;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.weex.WeexExternalEventType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.dle;
import tb.dlr;
import tb.dlx;
import tb.dmr;
import tb.fhu;
import tb.jvs;
import tb.kge;

/* loaded from: classes6.dex */
public final class a<P extends com.taobao.android.abilitykit.ability.pop.model.a, CTX extends dlr> extends com.taobao.android.abilitykit.ability.pop.render.a<P, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private com.taobao.android.abilitykit.ability.pop.render.d c;
    private CTX d;
    private final e e;
    private d f;
    private boolean g;
    private boolean h;

    static {
        kge.a(-475984808);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1544639176) {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1565871512) {
            super.a((a) ((dlr) objArr[0]), (dlr) ((com.taobao.android.abilitykit.ability.pop.model.a) objArr[1]), (View) objArr[2], (com.taobao.android.abilitykit.ability.pop.render.d) objArr[3]);
            return null;
        } else if (hashCode != 1714797822) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac48c96d", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.b = z;
        }
    }

    public static final /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c37e324b", new Object[]{aVar})).booleanValue() : aVar.b;
    }

    public static final /* synthetic */ ViewGroup b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("4ab62a2f", new Object[]{aVar}) : aVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.a, com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public /* bridge */ /* synthetic */ void a(dle dleVar, com.taobao.android.abilitykit.ability.pop.model.c cVar, View view, com.taobao.android.abilitykit.ability.pop.render.d dVar) {
        a((a<P, CTX>) ((dlr) dleVar), (dlr) ((com.taobao.android.abilitykit.ability.pop.model.a) cVar), view, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.abilitykit.ability.pop.render.a, com.taobao.android.abilitykit.ability.pop.render.b
    public /* bridge */ /* synthetic */ void a(dlr dlrVar, com.taobao.android.abilitykit.ability.pop.model.c cVar, View view, com.taobao.android.abilitykit.ability.pop.render.d dVar) {
        a((a<P, CTX>) dlrVar, (dlr) ((com.taobao.android.abilitykit.ability.pop.model.a) cVar), view, dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e weexFragmentProxy) {
        super(weexFragmentProxy.b());
        q.d(weexFragmentProxy, "weexFragmentProxy");
        this.e = weexFragmentProxy;
        this.h = dmr.K();
        this.e.a(new TAKWeex2Render$1(this));
        this.e.a(new TAKWeex2Render$2(this));
        if (this.h) {
            this.e.a(new jvs() { // from class: com.taobao.android.tbabilitykit.weex.pop.render.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvs
                public final void a(Map<String, Object> map) {
                    IpChange ipChange = $ipChange;
                    boolean z = true;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                        return;
                    }
                    Object obj = map.get(Constants.Name.CONTENT_OFFSET);
                    if (!(obj instanceof org.json.JSONObject)) {
                        return;
                    }
                    a aVar = a.this;
                    if (((org.json.JSONObject) obj).getDouble("y") >= 0) {
                        z = false;
                    }
                    a.a(aVar, z);
                    ViewGroup b = a.b(a.this);
                    if (b == null) {
                        return;
                    }
                    b.requestDisallowInterceptTouchEvent(a.a(a.this));
                }
            });
        }
        this.b = true;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean a(View contentView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, contentView, new Integer(i)})).booleanValue();
        }
        q.d(contentView, "contentView");
        if (i >= 0) {
            return this.b;
        }
        return false;
    }

    public final CTX c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CTX) ipChange.ipc$dispatch("1e670832", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a
    public void a(CTX akCtx, P params, View view, com.taobao.android.abilitykit.ability.pop.render.d callback) {
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d554d98", new Object[]{this, akCtx, params, view, callback});
            return;
        }
        q.d(akCtx, "akCtx");
        q.d(params, "params");
        q.d(callback, "callback");
        this.c = callback;
        this.d = akCtx;
        this.f8938a = params;
        this.f = new d();
        this.e.a(this.f);
        super.a((a<P, CTX>) akCtx, (CTX) params, view, callback);
        fhu k = akCtx.k();
        Object a2 = k != null ? k.a() : null;
        if (!(a2 instanceof HashMap)) {
            a2 = null;
        }
        HashMap hashMap = (HashMap) a2;
        if (hashMap == null) {
            return;
        }
        if (hashMap.get("instance") instanceof p) {
            Object obj = hashMap.get("instance");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.weex_framework.MUSInstance");
            }
            Object tag2 = ((p) obj).getTag("std_pop_anim_listener");
            if (!(tag2 instanceof dlx)) {
                tag2 = null;
            }
            dlx dlxVar = (dlx) tag2;
            if (dlxVar == null) {
                return;
            }
            a(dlxVar);
            return;
        }
        Object obj2 = hashMap.get("instance");
        if (!(obj2 instanceof WeexInstance)) {
            obj2 = null;
        }
        WeexInstance weexInstance = (WeexInstance) obj2;
        if (weexInstance == null || (tag = weexInstance.getTag("std_pop_anim_listener")) == null || !(tag instanceof dlx)) {
            return;
        }
        a((dlx) tag);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a, com.taobao.android.abilitykit.ability.pop.render.b, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(String type, JSONObject jSONObject) {
        com.taobao.android.abilitykit.ability.pop.model.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, type, jSONObject});
            return;
        }
        q.d(type, "type");
        super.a(type, jSONObject);
        if (q.a((Object) type, (Object) IAKPopRender.LifecycleType.OFFSET_ENABLE) || q.a((Object) type, (Object) IAKPopRender.LifecycleType.OFFSET_DISABLE)) {
            this.e.a();
        }
        if ((q.a((Object) type, (Object) IAKPopRender.LifecycleType.IN_ANIMATION_END) || q.a((Object) type, (Object) IAKPopRender.LifecycleType.CHANGE_SIZE_END)) && !dmr.d()) {
            this.e.a();
        }
        com.taobao.android.abilitykit.ability.pop.model.c cVar = this.f8938a;
        if (cVar != null && (bVar = cVar.f8913a) != null && bVar.H()) {
            if (q.a((Object) type, (Object) IAKPopRender.LifecycleType.CHANGE_POSITION) || q.a((Object) type, (Object) IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE)) {
                Object obj = jSONObject != null ? jSONObject.get("data") : null;
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 != null) {
                    if (!this.g) {
                        this.g = true;
                        this.e.a(jSONObject2, a(), WeexExternalEventType.START);
                    }
                    this.e.a(jSONObject2, a(), WeexExternalEventType.UPDATE);
                }
            }
            if (q.a((Object) type, (Object) IAKPopRender.LifecycleType.OUT_ANIMATION_END) || q.a((Object) type, (Object) IAKPopRender.LifecycleType.IN_ANIMATION_END) || q.a((Object) type, (Object) IAKPopRender.LifecycleType.PAN_ANIMATION_RECOVER_END)) {
                Object obj2 = jSONObject != null ? jSONObject.get("data") : null;
                if (!(obj2 instanceof JSONObject)) {
                    obj2 = null;
                }
                JSONObject jSONObject3 = (JSONObject) obj2;
                if (jSONObject3 != null) {
                    if (!this.g) {
                        this.e.a(jSONObject3, a(), WeexExternalEventType.START);
                    }
                    this.g = false;
                    this.e.a(jSONObject3, a(), WeexExternalEventType.END);
                }
            }
        }
        if (q.a((Object) IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE, (Object) type)) {
            return;
        }
        this.e.a(type, jSONObject);
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.a, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        d dVar = this.f;
        if (dVar != null) {
            dVar.a(new Rect(0, 0, i, i2));
            this.e.a(dVar);
        }
        super.a(i, i2);
    }
}
