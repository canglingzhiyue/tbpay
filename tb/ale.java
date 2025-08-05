package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public class ale {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static double a(double d, double d2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25d0bdc9", new Object[]{new Double(d), new Double(d2), new Integer(i)})).doubleValue() : new BigDecimal(Double.toString(d)).divide(new BigDecimal(Double.toString(d2)), i, 1).doubleValue();
    }

    public static float a(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25edd58b", new Object[]{new Float(f), new Float(f2), new Integer(i)})).floatValue() : new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(f2)), i, 1).floatValue();
    }
}
