package tb;

import com.alibaba.ability.b;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.weex_framework.adapter.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J<\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/taobao/android/adam/aura/AuraEventBridgeAbility;", "Lcom/alibaba/ability/IAbility;", "()V", "eventType", "", "(Ljava/lang/String;)V", "evType", e.RECORD_EXECUTE, "Lcom/alibaba/ability/result/ExecuteResult;", "api", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "", "", "Lcom/alibaba/ability/AbilityData;", "callback", "Lcom/alibaba/ability/callback/AbilityCallback;", "Companion", "adam_android_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public final class dng implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_AURA_EVENT_BRIDGE = "auraEventBridge";
    public static final String AURA_EVENT_BRIDGE = "1383713017440984839";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f26867a;

    static {
        kge.a(-1202855351);
        kge.a(-948502777);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/adam/aura/AuraEventBridgeAbility$Companion;", "", "()V", "API_AURA_EVENT_BRIDGE", "", "AURA_EVENT_BRIDGE", "adam_android_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(1419920977);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.c(api, "api");
        q.c(context, "context");
        q.c(params, "params");
        q.c(callback, "callback");
        if (!(context.d() instanceof l)) {
            return a$a.Companion.b("AbilityContext invalid");
        }
        Object d = context.d();
        if (d == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.dinamicx.eventchain.DXUIAbilityRuntimeContext");
        }
        l lVar = (l) d;
        DXRuntimeContext h = lVar.h();
        if (!((h != null ? h.a() : null) instanceof art)) {
            return a$a.Companion.b("dxUserContext invalid");
        }
        DXRuntimeContext h2 = lVar.h();
        q.a((Object) h2, "akDxCtx.dxRootViewRuntimeContext");
        Object a2 = h2.a();
        if (a2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.android.aura.service.event.dx.AURADXUserContext");
        }
        art artVar = (art) a2;
        d dVar = new d();
        dVar.a(artVar.b);
        dVar.a(d.EXT_KEY_DX_RUNTIME_CONTEXT, lVar.h());
        String str2 = this.f26867a;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            Object obj = params.get("eventType");
            if (!(obj instanceof String)) {
                obj = null;
            }
            str = (String) obj;
        } else {
            str = this.f26867a;
        }
        Object obj2 = params.get("eventFields");
        if (!(obj2 instanceof JSONObject)) {
            obj2 = null;
        }
        dVar.a((JSONObject) obj2);
        dVar.a(artVar.e());
        dVar.a(artVar.d());
        if (str != null) {
            dVar.b(str);
            com.alibaba.android.aura.q qVar = artVar.f25540a;
            q.a((Object) qVar, "auraUserCtx.mUserContext");
            c.a(qVar.b(), str, dVar);
            Util.a("exposure_AuraEventBridge", Util.a("AuraEventBridge", "AuraEventBridge", lVar.h()));
        }
        return new FinishResult(null, null, 3, null);
    }
}
