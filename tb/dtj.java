package tb;

import com.alibaba.ability.b;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class dtj implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private art f26963a;
    private AURAGlobalData b;
    private String c;

    static {
        kge.a(-921630469);
        kge.a(-948502777);
    }

    public abstract ExecuteResult a(JSONObject jSONObject, aln alnVar);

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String str, als alsVar, Map<String, ?> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, str, alsVar, map, alnVar});
        }
        Object d = alsVar.d();
        if (!(d instanceof l)) {
            return new ErrorResult("AliBuy_00001", "userContextObj is not DXUIAbilityRuntimeContext type");
        }
        DXRuntimeContext h = ((l) d).h();
        if (h == null) {
            return new ErrorResult("AliBuy_00002", "dxRuntimeContext is null");
        }
        Object a2 = h.a();
        if (!(a2 instanceof art)) {
            return new ErrorResult("AliBuy_00003", "contextObj is not AURADXUserContext type");
        }
        this.c = str;
        this.f26963a = (art) a2;
        return a((JSONObject) map, alnVar);
    }

    public Object[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("d4ae18c9", new Object[]{this});
        }
        e();
        return this.f26963a.e();
    }

    public AURARenderComponent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("931e7d94", new Object[]{this});
        }
        e();
        return this.f26963a.b();
    }

    public q c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("4c9f2bd5", new Object[]{this});
        }
        e();
        return this.f26963a.a();
    }

    public AURAGlobalData d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("d7fa6101", new Object[]{this});
        }
        AURAGlobalData aURAGlobalData = this.b;
        if (aURAGlobalData != null) {
            return aURAGlobalData;
        }
        e();
        this.b = (AURAGlobalData) bbc.a(this.f26963a.f(), "adamAuraGlobalData", AURAGlobalData.class, null);
        return this.b;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f26963a == null) {
            throw new IllegalArgumentException("AURADXUserContext can not null!!");
        }
    }
}
