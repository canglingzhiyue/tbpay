package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class doc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static double f26878a = 6378.137d;

    private static double a(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{new Double(d)})).doubleValue() : (d * 3.141592653589793d) / 180.0d;
    }

    public static double a(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("944517d6", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4)})).doubleValue();
        }
        double a2 = a(d2);
        double a3 = a(d4);
        return (Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((a2 - a3) / 2.0d), 2.0d) + ((Math.cos(a2) * Math.cos(a3)) * Math.pow(Math.sin((a(d) - a(d3)) / 2.0d), 2.0d)))) * 2.0d) * f26878a) * 10000.0d) / 10000.0d) * 1000.0d;
    }

    public static Double a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("9dc64e50", new Object[]{str, str2, str3, str4});
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3) && !StringUtils.isEmpty(str4)) {
            try {
                return Double.valueOf(a(Double.parseDouble(str), Double.parseDouble(str2), Double.parseDouble(str3), Double.parseDouble(str4)));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }
}
