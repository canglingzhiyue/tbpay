package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class qrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f33049a = -1;
    public float b = -1.0f;
    public float c = -1.0f;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "cpuCores=" + this.f33049a + ", deviceCpuUsage=" + this.b + ", appCpuUsage=" + this.c;
    }
}
