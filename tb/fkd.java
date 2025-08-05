package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1126752420);
    }

    public static String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str}) : obj != null ? obj.toString() : str;
    }

    public static int a(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7da932", new Object[]{obj, new Integer(i)})).intValue();
        }
        try {
            return a(obj);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int a(Object obj) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{obj})).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt((String) obj);
        }
        throw new IllegalArgumentException("" + obj + " is invalid Integer");
    }

    public static float a(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7d9dec", new Object[]{obj, new Float(f)})).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f;
    }

    public static boolean a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e7de914", new Object[]{obj, new Boolean(z)})).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.equalsIgnoreCase("true")) {
                return true;
            }
            if (str.equalsIgnoreCase("false")) {
                return false;
            }
            try {
                return Float.parseFloat((String) obj) > 0.0f;
            } catch (Exception unused) {
            }
        } else if (obj instanceof Number) {
            return ((Number) obj).floatValue() > 0.0f;
        } else if (obj instanceof List) {
            return ((List) obj).size() > 0;
        } else if (obj instanceof Map) {
            return ((Map) obj).size() > 0;
        }
        return z;
    }
}
