package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class sgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f33565a = "";
    public String b = "";
    public String c = "";
    public String d = "";

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "deviceType=" + this.f33565a + ", deviceLevel=" + this.b + ", deviceModel=" + this.c + ", deviceBrand=" + this.d;
    }
}
