package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import tb.mto;

/* loaded from: classes.dex */
public class fqr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1678746499);
    }

    public static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return e((String) obj);
        }
        if (obj instanceof JSONArray) {
            if (((JSONArray) obj).size() > 0) {
                return true;
            }
        } else if (obj instanceof JSONObject) {
            if (((JSONObject) obj).size() > 0) {
                return true;
            }
        } else if (!(obj instanceof Number) || ((Number) obj).intValue() != 0) {
            return true;
        }
        return false;
    }

    private static boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue() : str != null && !str.equals("false") && !str.equalsIgnoreCase("0") && !str.isEmpty();
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean a(Number number, Number number2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd1fdf10", new Object[]{number, number2})).booleanValue() : number.doubleValue() == number2.doubleValue();
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && str.indexOf(".") != -1;
    }

    public static boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{obj})).booleanValue() : (obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal);
    }

    public static double c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea2", new Object[]{str})).doubleValue();
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return mto.a.GEO_NOT_SUPPORT;
        }
    }

    public static long d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e9", new Object[]{str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static Number c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("31830062", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (b(str)) {
                return Double.valueOf(c(str));
            }
            return Long.valueOf(d(str));
        } else if (b(obj)) {
            return Double.valueOf(((Number) obj).doubleValue());
        } else {
            if (!(obj instanceof Integer) && !(obj instanceof Long)) {
                return null;
            }
            return Long.valueOf(((Number) obj).longValue());
        }
    }
}
