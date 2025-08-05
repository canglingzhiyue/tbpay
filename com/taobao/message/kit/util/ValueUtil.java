package com.taobao.message.kit.util;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class ValueUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1785060614);
    }

    public static <T> double getDouble(Map<T, ?> map, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88791e01", new Object[]{map, t})).doubleValue() : getDouble(map, t, mto.a.GEO_NOT_SUPPORT);
    }

    public static <T> double getDouble(Map<T, ?> map, T t, double d) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86ab0479", new Object[]{map, t, new Double(d)})).doubleValue();
        }
        if (map == null) {
            return d;
        }
        try {
            obj = map.get(t);
        } catch (Exception unused) {
        }
        if (obj == null) {
            return d;
        }
        if (obj instanceof String) {
            d = Double.valueOf((String) obj).doubleValue();
        } else if (obj instanceof Integer) {
            d = ((Double) obj).doubleValue();
        } else if (obj instanceof Long) {
            d = ((Long) obj).longValue();
        } else if (obj instanceof Short) {
            d = ((Short) obj).shortValue();
        } else if (obj instanceof Boolean) {
            d = ((Boolean) obj).booleanValue() ? 1.0d : mto.a.GEO_NOT_SUPPORT;
        } else if (obj instanceof Double) {
            d = ((Double) obj).doubleValue();
        } else if (obj instanceof BigDecimal) {
            d = ((BigDecimal) obj).doubleValue();
        }
        return d;
    }

    public static <T> int getInteger(Map<T, ?> map, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8d98465", new Object[]{map, t})).intValue() : getInteger(map, t, 0);
    }

    public static <T> int getInteger(Map<T, ?> map, T t, int i) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52577cc4", new Object[]{map, t, new Integer(i)})).intValue();
        }
        if (map == null) {
            return i;
        }
        try {
            obj = map.get(t);
        } catch (Exception unused) {
        }
        if (obj == null) {
            return i;
        }
        if (obj instanceof String) {
            i = Integer.valueOf((String) obj).intValue();
        } else if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            i = (int) ((Long) obj).longValue();
        } else if (obj instanceof Short) {
            i = ((Short) obj).shortValue();
        } else if (obj instanceof Boolean) {
            i = ((Boolean) obj).booleanValue();
        } else {
            i = i;
            if (obj instanceof BigDecimal) {
                i = ((BigDecimal) obj).intValue();
            }
        }
        return i;
    }

    public static int getInteger(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43aba0ab", new Object[]{obj, new Integer(i)})).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj).intValue();
            } catch (Exception unused) {
                return i;
            }
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            if (obj instanceof Short) {
                return ((Short) obj).shortValue();
            }
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() ? 1 : 0 : obj instanceof BigDecimal ? ((BigDecimal) obj).intValue() : i;
        }
    }

    public static <T> long getLong(Map<T, ?> map, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("efdfdcbc", new Object[]{map, t})).longValue() : getLong(map, t, 0L);
    }

    public static <T> long getLong(Map<T, ?> map, T t, long j) {
        int shortValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1c32f0", new Object[]{map, t, new Long(j)})).longValue();
        }
        if (map == null) {
            return j;
        }
        try {
            Object obj = map.get(t);
            if (obj == null) {
                return j;
            }
            if (obj instanceof String) {
                return Long.valueOf((String) obj).longValue();
            }
            if (obj instanceof Integer) {
                shortValue = ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                return ((Long) obj).longValue();
            } else {
                if (!(obj instanceof Short)) {
                    return obj instanceof BigDecimal ? ((BigDecimal) obj).longValue() : j;
                }
                shortValue = ((Short) obj).shortValue();
            }
            return shortValue;
        } catch (Exception unused) {
            return j;
        }
    }

    public static <T> boolean getBoolean(Map<T, ?> map, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b58103cc", new Object[]{map, t})).booleanValue() : getBoolean(map, t, false);
    }

    public static <T> boolean getBoolean(Map<T, ?> map, T t, boolean z) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faa02810", new Object[]{map, t, new Boolean(z)})).booleanValue();
        }
        if (map == null) {
            return z;
        }
        try {
            obj = map.get(t);
        } catch (Exception unused) {
        }
        if (obj == null) {
            return z;
        }
        if (obj instanceof Boolean) {
            z = ((Boolean) obj).booleanValue();
        } else if (obj instanceof String) {
            z = Boolean.valueOf((String) obj).booleanValue();
        }
        return z;
    }

    public static <T> String getString(Map<T, ?> map, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b454932d", new Object[]{map, t}) : getString(map, t, null);
    }

    public static <T> String getString(Map<T, ?> map, T t, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("892f4d63", new Object[]{map, t, str});
        }
        if (map == null) {
            return str;
        }
        try {
            Object obj = map.get(t);
            if (obj == null) {
                return str;
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            return obj.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String getString(Bundle bundle, Bundle bundle2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a914ddbe", new Object[]{bundle, bundle2, str, str2});
        }
        if (bundle.containsKey(str)) {
            return bundle.getString(str, str2);
        }
        return bundle2.containsKey(str) ? bundle2.getString(str, str2) : str2;
    }

    public static int getInteger(Bundle bundle, Bundle bundle2, String str, int i) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f7d583d", new Object[]{bundle, bundle2, str, new Integer(i)})).intValue();
        }
        if (bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (!(obj instanceof String)) {
                return i;
            }
            String string = bundle.getString(str, String.valueOf(i));
            if (!"".equals(string)) {
                intValue = Integer.valueOf(string).intValue();
                return intValue;
            }
            return -1;
        } else if (!bundle2.containsKey(str)) {
            return i;
        } else {
            Object obj2 = bundle2.get(str);
            if (obj2 instanceof Integer) {
                return ((Integer) obj2).intValue();
            }
            if (!(obj2 instanceof String)) {
                return i;
            }
            String string2 = bundle2.getString(str, String.valueOf(i));
            if (!"".equals(string2)) {
                intValue = Integer.valueOf(string2).intValue();
                return intValue;
            }
            return -1;
        }
    }

    public static <T, S> S getValue(Map<T, ?> map, T t, Class<S> cls, S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (S) ipChange.ipc$dispatch("d1da9e98", new Object[]{map, t, cls, s});
        }
        try {
            return (S) map.get(t);
        } catch (Exception e) {
            if (!ApplicationUtil.isDebug()) {
                return s;
            }
            throw new IllegalStateException(t + " cast error", e);
        }
    }

    public static <T> T getValue(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("98045b4a", new Object[]{str, t});
        }
        try {
            if (t instanceof Boolean) {
                return (T) Boolean.valueOf(Boolean.parseBoolean(str));
            }
            if (t instanceof Integer) {
                return (T) Integer.valueOf(Integer.parseInt(str));
            }
            if (t instanceof Long) {
                return (T) Long.valueOf(Long.parseLong(str));
            }
            if (t instanceof String) {
                return str;
            }
            if (ApplicationUtil.isDebug()) {
                throw new IllegalStateException("defaultVal type not known");
            }
            return t;
        } catch (Exception e) {
            if (!ApplicationUtil.isDebug()) {
                return t;
            }
            throw new IllegalStateException(str + " cast error", e);
        }
    }

    public static Map<String, Object> convertMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1cf484a", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public static Map<String, String> getMapForJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6fbb7dd1", new Object[]{str});
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (Exception e) {
            TLog.loge("ValueUtil", "getMapForJson " + str);
            e.printStackTrace();
            return null;
        }
    }

    public static <T> Map getMap(Map<T, ?> map, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("69c9c549", new Object[]{map, t}) : getMap(map, t, null);
    }

    public static <T> Map getMap(Map<T, ?> map, T t, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7b82366", new Object[]{map, t, map2});
        }
        if (map == null) {
            return map2;
        }
        try {
            Object obj = map.get(t);
            if (obj != null && (obj instanceof Map)) {
                return (Map) obj;
            }
            return map2;
        } catch (Exception unused) {
            return map2;
        }
    }

    public static <T> void putValue(Map<T, Object> map, T t, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e9d3f4", new Object[]{map, t, obj});
        } else if (map == null) {
        } else {
            map.put(t, obj);
        }
    }

    public static int toInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81d8ac91", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
