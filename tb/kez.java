package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class kez {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static kez b;

    static {
        kge.a(-780373189);
    }

    public static kez a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kez) ipChange.ipc$dispatch("f06d2be", new Object[0]);
        }
        if (b == null) {
            synchronized (kez.class) {
                if (b == null) {
                    b = new kez();
                }
            }
        }
        return b;
    }

    private kez() {
    }
}
