package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.b;
import java.util.Map;

/* loaded from: classes6.dex */
public class ild {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(604971945);
    }

    public static boolean a(ilb ilbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede13edd", new Object[]{ilbVar})).booleanValue();
        }
        if (ilbVar == null) {
            ilt.a("ResourceGuardianApi", "addPerformanceWarningListener failed. listener is null");
            return false;
        }
        return ikz.a().a(ilbVar);
    }

    public static boolean b(ilb ilbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc64455e", new Object[]{ilbVar})).booleanValue();
        }
        if (ilbVar == null) {
            ilt.a("ResourceGuardianApi", "removePerformanceWarningListener failed. listener is null");
            return false;
        }
        return ikz.a().b(ilbVar);
    }

    public static Map<String, String> a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("35efba90", new Object[]{new Integer(i)}) : ikz.a().a(i);
    }

    public static b a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("edd1cd96", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)}) : ikz.a().a(i, i2, i3);
    }
}
