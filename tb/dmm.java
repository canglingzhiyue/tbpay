package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.SoftReference;
import kotlin.a;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class dmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dmm INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static SoftReference<dkt> f26859a;

    static {
        kge.a(1277919733);
        INSTANCE = new dmm();
    }

    private dmm() {
    }

    @JvmStatic
    private static final dkt a() {
        dkt dktVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkt) ipChange.ipc$dispatch("f03b9f1", new Object[0]);
        }
        SoftReference<dkt> softReference = f26859a;
        if (softReference != null && (dktVar = softReference.get()) != null) {
            return dktVar;
        }
        dkt dktVar2 = new dkt(new alr("AbilityKit", "AbilityKit"), null);
        f26859a = new SoftReference<>(dktVar2);
        return dktVar2;
    }

    public static /* synthetic */ dkx a(String str, JSONObject jSONObject, dle dleVar, dll dllVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("de6cd90d", new Object[]{str, jSONObject, dleVar, dllVar, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            dleVar = null;
        }
        if ((i & 8) != 0) {
            dllVar = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        return a(str, jSONObject, dleVar, dllVar, z);
    }

    @JvmStatic
    public static final dkx<?> a(String type, JSONObject params, dle dleVar, dll dllVar, boolean z) {
        dkt a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("b88f9afe", new Object[]{type, params, dleVar, dllVar, new Boolean(z)});
        }
        q.d(type, "type");
        q.d(params, "params");
        if (dleVar == null || (a2 = dleVar.e()) == null) {
            a2 = a();
        }
        return a2.a(new JSONObject(ai.b(j.a("type", type), j.a("params", params), j.a("isMainThread", Boolean.valueOf(z)))), dleVar, dllVar);
    }

    @JvmStatic
    public static final String a(Throwable th) {
        String a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th}) : (th == null || (a2 = a.a(th)) == null) ? "" : a2;
    }
}
