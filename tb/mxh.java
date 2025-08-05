package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(839593561);
    }

    private static int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : (i >> 16) & 255;
    }

    private static int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{new Integer(i)})).intValue() : (i >> 8) & 255;
    }

    private static int d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{new Integer(i)})).intValue() : i & 255;
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : ((((double) b(i)) * 0.299d) + (((double) c(i)) * 0.587d)) + (((double) d(i)) * 0.114d) >= 192.0d;
    }
}
