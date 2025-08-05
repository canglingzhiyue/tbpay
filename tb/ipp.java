package tb;

import android.content.Context;
import com.alibaba.android.icart.core.event.l;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ipp extends idl<Map<String, Map<String, bmy>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sKeyCart = "cart";
    public static final String sKeyUltron = "ultron";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, bmy> f29217a = new HashMap();
    private final Map<String, bmy> b = new HashMap();
    private boolean c = false;

    static {
        kge.a(1337796250);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, tb.bmy>>, java.lang.Object] */
    @Override // tb.idl
    public /* synthetic */ Map<String, Map<String, bmy>> a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ff610946", new Object[]{this, new Boolean(z)}) : b(z);
    }

    @Override // tb.idl
    public void a(Context context) {
        Map<String, Class<? extends bmy>> a2 = bmx.a();
        if (a2 != null) {
            for (Map.Entry<String, Class<? extends bmy>> entry : a2.entrySet()) {
                try {
                    this.f29217a.put(entry.getKey(), entry.getValue().newInstance());
                } catch (Exception unused) {
                    this.c = false;
                    return;
                }
            }
        }
        Map<String, Class<? extends bmy>> a3 = l.a();
        if (a3 != null) {
            for (Map.Entry<String, Class<? extends bmy>> entry2 : a3.entrySet()) {
                try {
                    this.b.put(entry2.getKey(), entry2.getValue().newInstance());
                } catch (Exception unused2) {
                    this.c = false;
                    return;
                }
            }
        }
        this.c = true;
    }

    public Map<String, Map<String, bmy>> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78d94f00", new Object[]{this, new Boolean(z)});
        }
        if (!this.c) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ultron", this.f29217a);
        hashMap.put("cart", this.b);
        return hashMap;
    }
}
