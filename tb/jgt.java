package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Throwable a(Throwable th) {
        Throwable th2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("e6ec64f2", new Object[]{th});
        }
        do {
            th2 = th;
            th = th.getCause();
            if (th == null) {
                break;
            }
        } while (th2 != th);
        return th2;
    }
}
