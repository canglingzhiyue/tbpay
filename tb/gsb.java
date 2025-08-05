package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gsb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (j / 100000000 >= 1) {
            return (((float) (j / 10000000)) / 10.0f) + "E";
        } else if (j / 10000 >= 1) {
            return (((float) (j / 1000)) / 10.0f) + "W";
        } else {
            return j + "";
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str == null || "".equals(str);
    }
}
