package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class qri {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f33048a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "batteryState=" + this.f33048a + ", batteryLevel=" + this.b + ", lowPowerMode=" + this.c + ", temperature=" + this.d;
    }
}
