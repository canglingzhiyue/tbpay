package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class gxc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static gxd f28551a;

    static {
        kge.a(102082668);
    }

    public static void a(gxd gxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb219065", new Object[]{gxdVar});
        } else {
            f28551a = gxdVar;
        }
    }

    public static void a(String str, long j, boolean z, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23213a31", new Object[]{str, new Long(j), new Boolean(z), hashMap});
            return;
        }
        gxd gxdVar = f28551a;
        if (gxdVar == null) {
            return;
        }
        gxdVar.a("LcMNN", str, j, z, hashMap);
    }
}
