package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class slm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final DecimalFormat f33705a;
    private static final DecimalFormat b;

    static {
        kge.a(924663670);
        f33705a = new DecimalFormat("####.#亿");
        b = new DecimalFormat("####.#万");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setDecimalSeparator('.');
        f33705a.setDecimalFormatSymbols(decimalFormatSymbols);
        b.setDecimalFormatSymbols(decimalFormatSymbols);
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (j > 99999999) {
            return f33705a.format(j / 1.0E8d);
        }
        if (j > 9999) {
            return b.format(j / 10000.0d);
        }
        return String.valueOf(j);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue() : (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) ? Integer.valueOf(str).intValue() : i;
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : TextUtils.isEmpty(str) ? z : TextUtils.isDigitsOnly(str) ? Integer.valueOf(str).intValue() != 0 : TextUtils.isEmpty(str) ? z : "true".equalsIgnoreCase(str);
    }

    public static boolean a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b26fbb", new Object[]{strArr})).booleanValue();
        }
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        return false;
    }

    public static boolean a(Map<String, Object> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ec6b911", new Object[]{map, str, new Boolean(z)})).booleanValue();
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return "true".equalsIgnoreCase((String) obj);
        }
        return obj instanceof Integer ? ((Integer) obj).intValue() != 0 : obj instanceof Long ? 0 != ((Long) obj).longValue() : z;
    }

    public static JSONArray a(JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5e38fac7", new Object[]{jSONObject, strArr});
        }
        if (jSONObject == null || strArr == null || strArr.length == 0) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray = null;
        while (i < strArr.length) {
            int i2 = i + 1;
            if (i2 == strArr.length) {
                jSONArray = jSONObject2.getJSONArray(strArr[i]);
            } else {
                jSONObject2 = jSONObject2.getJSONObject(strArr[i]);
            }
            if (jSONObject2 == null) {
                return null;
            }
            i = i2;
        }
        return jSONArray;
    }

    public static Object b(JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("88e3a49a", new Object[]{jSONObject, strArr});
        }
        if (jSONObject == null || strArr == null || strArr.length == 0) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject;
        Object obj = null;
        for (int i = 0; i < strArr.length; i++) {
            if (i == strArr.length - 1) {
                obj = jSONObject2.get(strArr[i]);
            } else {
                jSONObject2 = jSONObject2.getJSONObject(strArr[i]);
            }
            if (jSONObject2 == null) {
                return null;
            }
        }
        return obj;
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        int i2 = i / 1000;
        return b(i2 / 60) + ":" + b(i2 % 60);
    }

    public static <T> T a(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8e00aaf9", new Object[]{list});
        }
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    private static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }
}
