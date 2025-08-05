package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hfa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static hfc f28581a;

    static {
        kge.a(1403352067);
    }

    public static void a(hfc hfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd84d93", new Object[]{hfcVar});
        } else {
            f28581a = hfcVar;
        }
    }

    public static void a(String str, String str2, long j, boolean z, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e93a8b27", new Object[]{str, str2, new Long(j), new Boolean(z), hashMap});
            return;
        }
        hfc hfcVar = f28581a;
        if (hfcVar == null) {
            return;
        }
        hfcVar.a(str, str2, j, z, hashMap);
    }

    public static void a(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bc5fad", new Object[]{str, str2, str3, hashMap});
            return;
        }
        hfc hfcVar = f28581a;
        if (hfcVar == null) {
            return;
        }
        hfcVar.a(str, str2, str3, hashMap);
    }
}
