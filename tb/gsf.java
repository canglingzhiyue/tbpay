package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class gsf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f28428a;

    static {
        kge.a(-149728776);
        f28428a = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f28428a == null) {
            try {
                Class.forName("tb.kaw");
                f28428a = true;
            } catch (ClassNotFoundException unused) {
                f28428a = false;
            }
        }
        return f28428a.booleanValue();
    }

    public static Boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("410b752f", new Object[]{str});
        }
        if (!a() || str == null) {
            return false;
        }
        String[] split = str.split(",");
        return split.length > 0 && kaw.a().a("Jarvis-workflow-engine", Arrays.asList(split), "dT1KYXJ2aXMtd29ya2Zsb3ctZW5naW5l").size() > 0;
    }
}
