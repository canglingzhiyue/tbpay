package dt;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f24790a;

    /* loaded from: classes9.dex */
    public interface a {
    }

    static {
        kge.a(-1967765015);
        f24790a = null;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("df554b7d", new Object[0]) : f24790a;
    }
}
