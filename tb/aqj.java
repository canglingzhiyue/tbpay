package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class aqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aqj f25517a;
    private static String b;

    static {
        kge.a(-2135093220);
        kge.a(-1041518443);
        f25517a = null;
        b = "6.5.12.14";
    }

    private aqj() {
    }

    public static synchronized aqj a() {
        synchronized (aqj.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aqj) ipChange.ipc$dispatch("f027224", new Object[0]);
            }
            if (f25517a == null) {
                f25517a = new aqj();
            }
            return f25517a;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : b;
    }
}
