package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class dmn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final dmn INSTANCE;
    public static final String TYPE_COUNTER = "appMonitorCounter";
    public static final String TYPE_FAIL = "appMonitorFail";
    public static final String TYPE_SUCCESS = "appMonitorSuccess";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26860a;
    private static boolean b;

    static {
        kge.a(91674922);
        INSTANCE = new dmn();
    }

    private dmn() {
    }

    @JvmStatic
    public static final void a(dle akCtx, dlh dlhVar, dkw akErrorRet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb5e80b", new Object[]{akCtx, dlhVar, akErrorRet});
            return;
        }
        q.d(akCtx, "akCtx");
        q.d(akErrorRet, "akErrorRet");
        a(akCtx, dlhVar, akErrorRet.c());
    }

    @JvmStatic
    public static final void a(dle akCtx, dlh dlhVar, dkv dkvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb573ac", new Object[]{akCtx, dlhVar, dkvVar});
            return;
        }
        q.d(akCtx, "akCtx");
        if (!INSTANCE.a()) {
            return;
        }
        JSONObject a2 = INSTANCE.a(akCtx, dlhVar);
        String str = null;
        a2.put("params", (Object) (dlhVar != null ? dlhVar.c() : null));
        String jSONString = a2.toJSONString();
        String valueOf = String.valueOf(dkvVar != null ? Integer.valueOf(dkvVar.a()) : null);
        if (dkvVar != null) {
            str = dkvVar.b();
        }
        AppMonitor.Alarm.commitFail("AbilityKit", "ExecuteException", jSONString, valueOf, str);
        dlb.b().a("AbilityKitErr", jSONString);
    }

    @JvmStatic
    public static final void a(dlh dlhVar, dkv dkvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e0c539", new Object[]{dlhVar, dkvVar});
        } else if (!INSTANCE.a()) {
        } else {
            JSONObject jSONObject = new JSONObject(2);
            String str = null;
            jSONObject.put("params", (Object) (dlhVar != null ? dlhVar.c() : null));
            jSONObject.put("api", (Object) (dlhVar != null ? dlhVar.b() : null));
            String jSONString = jSONObject.toJSONString();
            String valueOf = String.valueOf(dkvVar != null ? Integer.valueOf(dkvVar.a()) : null);
            if (dkvVar != null) {
                str = dkvVar.b();
            }
            AppMonitor.Alarm.commitFail("StdPop", "apiCallFail", jSONString, valueOf, str);
            dlb.b().a("AbilityKitErr", jSONString);
        }
    }

    @JvmStatic
    public static final void a(dle akCtx, dlh dlhVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9ed4b9", new Object[]{akCtx, dlhVar, new Long(j)});
            return;
        }
        q.d(akCtx, "akCtx");
        if (!INSTANCE.a() || !dmr.n()) {
            return;
        }
        AppMonitor.Counter.commit("AbilityKit", "ExecuteCount", INSTANCE.a(akCtx, dlhVar).toJSONString(), 1.0d);
    }

    private final JSONObject a(dle dleVar, dlh dlhVar) {
        alr a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6441ce8b", new Object[]{this, dleVar, dlhVar});
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = j.a("bizId", dlb.e().a(dleVar.e()));
        dkt e = dleVar.e();
        String str = null;
        pairArr[1] = j.a("namespace", (e == null || (a2 = e.a()) == null) ? null : a2.e());
        if (dlhVar != null) {
            str = dlhVar.b();
        }
        pairArr[2] = j.a("abilityType", str);
        return new JSONObject(ai.b(pairArr));
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (b) {
            return f26860a;
        }
        f26860a = true;
        b = true;
        return f26860a;
    }
}
