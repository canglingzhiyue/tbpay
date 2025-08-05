package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.k;
import java.util.Map;

/* loaded from: classes.dex */
public class ldk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static k f30500a;

    static {
        kge.a(59874256);
    }

    public static void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9abba24", new Object[]{kVar});
        } else {
            f30500a = kVar;
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        k kVar = f30500a;
        if (kVar == null) {
            ldf.b("InfoFlowUmbrella", "commitSuccess gUmbrella == null");
            return;
        }
        try {
            kVar.a(str, str2, str3, str4, str5, map);
        } catch (Throwable th) {
            ldf.a("InfoFlowUmbrella", "commitSuccess error", th);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        k kVar = f30500a;
        if (kVar == null) {
            ldf.b("InfoFlowUmbrella", "commitFailure gUmbrella == null");
            return;
        }
        try {
            kVar.a(str, str2, str3, str4, str5, map, str6, str7);
        } catch (Throwable th) {
            ldf.a("InfoFlowUmbrella", "commitFailure error", th);
        }
    }

    public static void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a2bd78a", new Object[]{str, str2, str3, str4, str5, map});
        } else {
            a(str, str2, str3, str4, str5, map);
        }
    }
}
