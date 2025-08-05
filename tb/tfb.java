package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class tfb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f34072a;
    private final String b;

    static {
        kge.a(1190513770);
    }

    public tfb(boolean z, String str) {
        this.f34072a = z;
        this.b = str;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f34072a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
