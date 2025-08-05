package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class adl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile adl f25269a;
    private static final Map<String, adk> b;

    static {
        kge.a(1144750131);
        b = new ConcurrentHashMap();
    }

    private adl() {
    }

    public static adl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (adl) ipChange.ipc$dispatch("f024195", new Object[0]);
        }
        if (f25269a == null) {
            synchronized (adl.class) {
                if (f25269a == null) {
                    f25269a = new adl();
                }
            }
        }
        return f25269a;
    }

    public void a(adk adkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcdd530", new Object[]{this, adkVar});
        } else {
            b.put(adkVar.a(), adkVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            b.remove(str);
        }
    }

    public adk b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (adk) ipChange.ipc$dispatch("7d19960b", new Object[]{this, str}) : b.get(str);
    }
}
