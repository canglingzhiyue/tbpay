package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public final class ocb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2036072459);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            spz.a("NumUtils", "", e);
            return 0;
        }
    }

    public static float b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e563", new Object[]{str})).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            spz.a("NumUtils", "", e);
            return 0.0f;
        }
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)}) : slm.a(j);
    }
}
