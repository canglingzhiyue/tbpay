package tb;

import android.graphics.RectF;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-443693914);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                cot.b("ParseUtil", "error while parsing " + str);
            }
        }
        return i;
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
                cot.b("ParseUtil", "error while parsing " + str);
            }
        }
        return j;
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                cot.b("ParseUtil", "error while parsing " + str);
            }
        }
        return f;
    }

    public static String a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("368a2247", new Object[]{rectF});
        }
        if (rectF == null) {
            return "0,0,0,0";
        }
        return rectF.left + "," + rectF.top + "," + rectF.right + "," + rectF.bottom;
    }

    public static RectF a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("686ffd15", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length != 4) {
            return null;
        }
        float f = i;
        float f2 = i2;
        return new RectF(a(split[0], 0.0f) * f, a(split[1], 0.0f) * f2, a(split[2], 0.0f) * f, a(split[3], 0.0f) * f2);
    }
}
