package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;

/* loaded from: classes2.dex */
public class biv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-575458767);
    }

    private static int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{new Integer(i)})).intValue() : (i >> 16) & 255;
    }

    private static int d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{new Integer(i)})).intValue() : (i >> 8) & 255;
    }

    private static int e(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aef4f60a", new Object[]{new Integer(i)})).intValue() : i & 255;
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : ((((double) c(i)) * 0.299d) + (((double) d(i)) * 0.587d)) + (((double) e(i)) * 0.114d) < 192.0d;
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue();
        }
        try {
            return FestivalMgr.a().a("actionbarTextColor", i);
        } catch (Throwable unused) {
            return i;
        }
    }
}
