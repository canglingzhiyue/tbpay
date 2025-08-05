package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.c;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.aspect.error.umbrella.monitor")
/* loaded from: classes2.dex */
public final class avo extends arm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25636a = "AURAMonitor";
    private UMLinkLogInterface b;

    static {
        kge.a(485557021);
    }

    public static /* synthetic */ Object ipc$super(avo avoVar, String str, Object... objArr) {
        if (str.hashCode() == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arm, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.b = bpp.a();
    }

    @Override // tb.aro
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
            return;
        }
        String d = a().d();
        String f = bVar.f();
        String format = String.format("%s_%s", f, bVar.a());
        String b = bVar.b();
        HashMap hashMap = new HashMap();
        HashMap<String, String> b2 = b(bVar);
        this.b.logError("AURAMonitor", d, f, null, format, b, hashMap, a.a(b2));
        this.b.commitFailure(f, "AURAMonitor", "1.0", "AURAMonitor", d, b2, format, b);
        ard a2 = arc.a();
        a2.c(arc.AURA_LOGGER, "onError", d + "|" + f + "|" + format + "|" + b + "|" + b2);
    }

    private HashMap<String, String> b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("377c04a4", new Object[]{this, bVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("bizCode", a().d());
        Map<String, Object> c = bVar.c();
        if (c != null) {
            for (Map.Entry<String, Object> entry : c.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        c e = bVar.e();
        if (e != null) {
            hashMap.put("serviceCode", e.c());
            hashMap.put("flowCode", e.d());
        }
        return hashMap;
    }
}
