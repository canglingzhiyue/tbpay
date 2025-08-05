package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class tpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, long j, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff6798c", new Object[]{str, new Long(j), new Boolean(z), str2});
        } else {
            jpr.a(sda.a("iCart", str, z, bed.PID, "http://taobao.com/jstracker/android/cart.html").a(z ? 0.001f : 1.0f).a(System.currentTimeMillis() - j).b(str2));
        }
    }
}
