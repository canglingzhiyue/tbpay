package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mqe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str});
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj != null ? obj.toString() : str;
    }

    public static long a(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7dacf4", new Object[]{obj, new Long(j)})).longValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        try {
            String a2 = a(obj, (String) null);
            if (!StringUtils.isEmpty(a2)) {
                return Long.parseLong(a2);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return j;
    }

    public static float a(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7d9dec", new Object[]{obj, new Float(f)})).floatValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        try {
            String a2 = a(obj, (String) null);
            if (!StringUtils.isEmpty(a2)) {
                return Float.parseFloat(a2);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return f;
    }

    public static int a(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7da932", new Object[]{obj, new Integer(i)})).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return obj == null ? i : a(obj.toString(), i);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static boolean a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e7de914", new Object[]{obj, new Boolean(z)})).booleanValue();
        }
        if (obj == null) {
            return z;
        }
        try {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if ((obj instanceof String) && !StringUtils.isEmpty((String) obj)) {
                return Boolean.parseBoolean((String) obj);
            }
            String obj2 = obj.toString();
            return StringUtils.isEmpty(obj2) ? z : Boolean.parseBoolean(obj2);
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }
}
