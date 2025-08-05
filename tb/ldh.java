package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.g;

/* loaded from: classes.dex */
public class ldh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f30497a;

    static {
        kge.a(2114112846);
    }

    public static void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a9e8a8", new Object[]{gVar});
        } else {
            f30497a = gVar;
        }
    }

    public static void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{str, str2, str3, new Double(d)});
            return;
        }
        g gVar = f30497a;
        if (gVar == null) {
            ldf.b("InfoFlowMonitor", "counterCommit2 gInfoFlowMonitor == null");
            return;
        }
        try {
            gVar.a(str, str2, str3, d);
        } catch (Throwable th) {
            ldf.a("InfoFlowMonitor", "counterCommit2 error", th);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        g gVar = f30497a;
        if (gVar == null) {
            ldf.b("InfoFlowMonitor", "commitSuccess gInfoFlowMonitor == null");
            return;
        }
        try {
            gVar.a(str, str2, str3);
        } catch (Throwable th) {
            ldf.a("InfoFlowMonitor", "commitSuccess error", th);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        g gVar = f30497a;
        if (gVar == null) {
            ldf.b("InfoFlowMonitor", "commitFail gInfoFlowMonitor == null");
            return;
        }
        try {
            gVar.a(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            ldf.a("InfoFlowMonitor", "commitFail error", th);
        }
    }
}
