package com.taobao.message.lab.comfrm.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class BeanUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<Integer, Field> sMap;

    static {
        kge.a(-607357427);
        sMap = new ConcurrentHashMap();
    }

    private static List<String> split(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6c2db0bc", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '.' || charAt == '[') {
                if (i != i2) {
                    arrayList.add(str.substring(i, i2));
                }
                i = i2 + 1;
            }
        }
        if (i == 0) {
            arrayList.add(str);
        } else {
            arrayList.add(str.substring(i));
        }
        return arrayList;
    }

    public static Object get(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("19fb748f", new Object[]{obj, str});
        }
        List<String> split = split(str);
        Object obj2 = obj;
        for (int i = 0; i < split.size(); i++) {
            if (obj2 == null) {
                return null;
            }
            String str2 = split.get(i);
            if (str2.contains(riy.ARRAY_END_STR)) {
                int i2 = -1;
                try {
                    i2 = Integer.parseInt(str2.substring(0, str2.lastIndexOf(93)));
                } catch (Exception unused) {
                }
                if (i2 < 0) {
                    continue;
                } else if (obj2 instanceof List) {
                    List list = (List) obj2;
                    if (i2 >= list.size()) {
                        return null;
                    }
                    obj2 = list.get(i2);
                } else if (obj2 instanceof Object[]) {
                    Object[] objArr = (Object[]) obj2;
                    if (i2 >= objArr.length) {
                        return null;
                    }
                    obj2 = objArr[i2];
                } else if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj2;
                    if (i2 < jSONArray.length()) {
                        try {
                            obj2 = jSONArray.get(i2);
                        } catch (JSONException unused2) {
                        }
                    }
                    return null;
                } else {
                    continue;
                }
            } else {
                obj2 = getRaw(obj2, str2);
            }
        }
        return obj2;
    }

    public static Object getRaw(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            try {
                return ((JSONObject) obj).get(str);
            } catch (JSONException unused) {
                return null;
            }
        } else if (obj == null) {
            return obj;
        } else {
            int hashCode = obj.getClass().hashCode() + str.hashCode();
            Field field = sMap.get(Integer.valueOf(hashCode));
            if (field == null) {
                field = getField(obj.getClass(), str);
                if (field == null) {
                    return null;
                }
                field.setAccessible(true);
                sMap.put(Integer.valueOf(hashCode), field);
            }
            if (field == null) {
                return obj;
            }
            try {
                return field.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return obj;
            }
        }
    }

    public static Field getField(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("90de8d19", new Object[]{cls, str});
        }
        if (cls == null) {
            return null;
        }
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return getField(cls.getSuperclass(), str);
        }
    }
}
