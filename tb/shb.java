package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class shb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f33577a = "";
    public long b = -1;
    public long c = -1;
    public String d = "";
    public int e = -1;
    public int f = -1;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "launchType=" + this.f33577a + ", launchStart=" + this.b + ", launchLeave=" + this.c + ", installType=" + this.d + ", isFirstLaunch=" + this.e + ", launchStatus=" + this.f;
    }
}
