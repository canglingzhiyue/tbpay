package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1232729278);
    }

    public static int a(int i, fkr fkrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcfc2791", new Object[]{new Integer(i), fkrVar})).intValue() : (fkrVar != null && fkrVar.z()) ? i - 1 : i;
    }
}
