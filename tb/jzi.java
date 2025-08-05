package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class jzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29882a;
    public final boolean b;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public jzi(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f29882a = z;
        this.b = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Option{ dumpEnabled=" + this.f29882a + ", arrangeEnabled=" + this.b + ", replyOnlyEnabled=" + this.d + ", receiverEnabled=" + this.e + ", qosScheduleEnabled=" + this.f + " }";
    }
}
