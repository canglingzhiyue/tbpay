package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class jzh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29881a;
    public final int b;
    public final long c;

    public jzh(int i, int i2, long j) {
        this.f29881a = i;
        this.b = i2;
        this.c = j;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "detail: { totalCount=" + this.f29881a + ",sensitiveCount=" + this.b + ",duration=" + this.c + "ms }";
    }
}
