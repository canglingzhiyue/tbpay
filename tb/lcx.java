package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.a;

/* loaded from: classes.dex */
public class lcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f30486a;

    static {
        kge.a(1907527088);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a72e6e", new Object[]{aVar});
        } else {
            f30486a = aVar;
        }
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        a aVar = f30486a;
        if (aVar == null) {
            ldf.d("InfoFlowAbGlobal", "gIInfoFlowAbGlobal is null");
            return false;
        }
        try {
            return aVar.a(str, str2, str3);
        } catch (Throwable th) {
            ldf.a("InfoFlowAbGlobal", "isFeatureOpened error", th);
            return false;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        a aVar = f30486a;
        if (aVar == null) {
            ldf.d("InfoFlowAbGlobal", "gIInfoFlowAbGlobal is null");
            return false;
        }
        try {
            return aVar.a(str);
        } catch (Throwable th) {
            ldf.a("InfoFlowAbGlobal", "isFeatureOpenedByServer error", th);
            return false;
        }
    }
}
