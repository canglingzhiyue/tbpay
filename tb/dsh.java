package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class dsh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static dsh f26940a;

    static {
        kge.a(-2137382335);
        f26940a = new dsh();
    }

    public static dsh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dsh) ipChange.ipc$dispatch("f03d685", new Object[0]) : f26940a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : dsk.b();
    }
}
