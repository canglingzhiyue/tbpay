package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class spn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f33815a = -1;
    public long b = -1;
    public long c = -1;
    public int d = -1;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "memTotal=" + this.f33815a + ", memFree=" + this.b + ", javaMemUsage=" + this.c + ", isLowMemory=" + this.d;
    }
}
