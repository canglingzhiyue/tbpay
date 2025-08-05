package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class tdv<L, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final L f34048a;
    private final R b;

    static {
        kge.a(1691052394);
    }

    public tdv(L l, R r) {
        this.f34048a = l;
        this.b = r;
    }

    public R a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (R) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return riy.BRACKET_START_STR + this.f34048a + ", " + this.b + riy.BRACKET_END_STR;
    }
}
