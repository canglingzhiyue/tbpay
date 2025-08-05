package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class xlk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static xlj f34364a;

    static {
        kge.a(-1237576151);
        f34364a = null;
    }

    public static void setUTService(xlj xljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4bb5335", new Object[]{xljVar});
        } else {
            f34364a = xljVar;
        }
    }

    public static xlj getUTService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xlj) ipChange.ipc$dispatch("818a1669", new Object[0]) : f34364a;
    }
}
