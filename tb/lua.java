package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class lua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lud f30923a;

    static {
        kge.a(-1043348817);
    }

    public lua(lud ludVar) {
        this.f30923a = ludVar;
    }

    public lud e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lud) ipChange.ipc$dispatch("2dce15ff", new Object[]{this}) : this.f30923a;
    }
}
