package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintStream;

/* loaded from: classes.dex */
public final class ihq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile nhq f29032a;

    static {
        f29032a = new nhn();
        try {
            f29032a = iho.a();
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            printStream.println("Initializer.obtainInitializedCore failed, maybe not in taobao env.\n err=" + th);
        }
    }

    public static iia a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iia) ipChange.ipc$dispatch("f05f5fd", new Object[0]) : f29032a.bz_();
    }

    public static ihx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihx) ipChange.ipc$dispatch("16b79a64", new Object[0]) : f29032a.b();
    }

    public static nhq c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nhq) ipChange.ipc$dispatch("1e6b84c5", new Object[0]) : f29032a;
    }
}
