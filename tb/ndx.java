package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class ndx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2071382767);
    }

    public static double a(int i, int i2, int i3, int i4, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ae6404", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Double(d)})).doubleValue();
        }
        double d2 = i2 / d;
        double d3 = i4 / d;
        double a2 = ((i / d) - (i3 / d)) * 3600.0d * a((d2 / 2.0d) + (d3 / 2.0d));
        double d4 = (d3 - d2) * 3600.0d * 0.03081841820987654d;
        return Math.sqrt((a2 * a2) + (d4 * d4));
    }

    private static double a(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{new Double(d)})).doubleValue() : b(d) / 60.0d;
    }

    private static double b(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d65963", new Object[]{new Double(d)})).doubleValue() : c(d) / 60.0d;
    }

    private static double c(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b3202", new Object[]{new Double(d)})).doubleValue() : (Math.sin(((90.0d - d) * 3.1415926d) / 180.0d) * 40075.36d) / 360.0d;
    }
}
