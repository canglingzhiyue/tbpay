package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.i;

/* loaded from: classes.dex */
public class ldj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static i f30499a;

    static {
        kge.a(-198540388);
    }

    public static void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9aad166", new Object[]{iVar});
        } else {
            f30499a = iVar;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        i iVar = f30499a;
        if (iVar == null) {
            ldf.d("InfoFlowOrangeConfig", "getString is null");
            return str2;
        }
        try {
            return iVar.a(str, str2);
        } catch (Throwable th) {
            ldf.a("InfoFlowOrangeConfig", "getString error", th);
            return str2;
        }
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        i iVar = f30499a;
        if (iVar == null) {
            ldf.d("InfoFlowOrangeConfig", "getIntValue is null");
            return i;
        }
        try {
            return iVar.a(str, i);
        } catch (Throwable th) {
            ldf.a("InfoFlowOrangeConfig", "getIntValue error", th);
            return i;
        }
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        i iVar = f30499a;
        if (iVar == null) {
            ldf.d("InfoFlowOrangeConfig", "getBooleanValue is null");
            return z;
        }
        try {
            return iVar.a(str, z);
        } catch (Throwable th) {
            ldf.a("InfoFlowOrangeConfig", "getBooleanValue error", th);
            return z;
        }
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        i iVar = f30499a;
        if (iVar == null) {
            ldf.d("InfoFlowOrangeConfig", "getFloatValue is null");
            return f;
        }
        try {
            return iVar.a(str, f);
        } catch (Throwable th) {
            ldf.a("InfoFlowOrangeConfig", "getFloatValue error", th);
            return f;
        }
    }
}
