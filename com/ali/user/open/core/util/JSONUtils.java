package com.ali.user.open.core.util;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class JSONUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(274044940);
    }

    public static Integer optInteger(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a727235d", new Object[]{jSONObject, str});
        }
        if (!jSONObject.has(str)) {
            return null;
        }
        return Integer.valueOf(jSONObject.optInt(str));
    }

    public static String optString(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a315bc3", new Object[]{jSONObject, str});
        }
        if (!jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static Long optLong(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("28afe063", new Object[]{jSONObject, str});
        }
        if (!jSONObject.has(str)) {
            return null;
        }
        return Long.valueOf(jSONObject.optLong(str));
    }

    public static Boolean optBoolean(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("82d2f309", new Object[]{jSONObject, str});
        }
        if (jSONObject.has(str)) {
            z = jSONObject.optBoolean(str);
        }
        return Boolean.valueOf(z);
    }

    public static JSONObject toJsonObject(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5fd030aa", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Map) {
                        jSONObject.put(entry.getKey(), toJsonObject((Map) value));
                    } else if (value instanceof List) {
                        jSONObject.put(entry.getKey(), toJsonArray((List) value));
                    } else if (value.getClass().isArray()) {
                        jSONObject.put(entry.getKey(), toJsonArray((Object[]) value));
                    } else {
                        jSONObject.put(entry.getKey(), value);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static JSONArray toJsonArray(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("bc90fdbc", new Object[]{objArr});
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            if (obj instanceof Map) {
                jSONArray.put(toJsonObject((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static JSONArray toJsonArray(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6c9bd62", new Object[]{list});
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                jSONArray.put(toJsonObject((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27f0818b", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                hashMap.put(next, toMap((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                hashMap.put(next, toList((JSONArray) opt));
            } else {
                hashMap.put(next, opt);
            }
        }
        return hashMap;
    }

    public static List<Object> toList(JSONArray jSONArray) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bee424ad", new Object[]{jSONArray});
        }
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(toMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(toList((JSONArray) obj));
            } else {
                arrayList.add(jSONArray.get(i));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Character[], T] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.Byte[]] */
    public static <T> T parseStringValue(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("be7e0013", new Object[]{str, cls});
        }
        if (str == 0 || cls == null) {
            return null;
        }
        if (String.class.equals(cls)) {
            return str;
        }
        if (Short.TYPE.equals(cls) || Short.class.equals(cls)) {
            return (T) Short.valueOf(str);
        }
        if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
            return (T) Integer.valueOf(str);
        }
        if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
            return (T) Long.valueOf(str);
        }
        if (Boolean.TYPE.equals(cls) || Boolean.class.equals(cls)) {
            return (T) Boolean.valueOf(str);
        }
        if (Float.TYPE.equals(cls) || Float.class.equals(cls)) {
            return (T) Float.valueOf(str);
        }
        if (Double.TYPE.equals(cls) || Double.class.equals(cls)) {
            return (T) Double.valueOf(str);
        }
        if (Byte.TYPE.equals(cls) || Byte.class.equals(cls)) {
            return (T) Byte.valueOf(str);
        }
        if (Character.TYPE.equals(cls) || Character.class.equals(cls)) {
            return (T) Character.valueOf(str.charAt(0));
        }
        if (Date.class.isAssignableFrom(cls)) {
            try {
                return (T) new SimpleDateFormat("yyyyMMddHHmmssSSSZ", Locale.US).parse(str);
            } catch (ParseException e) {
                throw new RuntimeException("Parse Date error", e);
            }
        }
        char charAt = str.charAt(0);
        if (!cls.isArray()) {
            if (charAt == '{') {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (Map.class.isAssignableFrom(cls)) {
                        return (T) toMap(jSONObject);
                    }
                    return (T) toPOJO(jSONObject, cls);
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            } else if (!cls.isAssignableFrom(String.class)) {
                return null;
            } else {
                return str;
            }
        }
        Class<?> componentType = cls.getComponentType();
        if (charAt == '[') {
            try {
                return (T) toPOJOArray(new JSONArray(str), componentType);
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        } else if (String.class.equals(componentType)) {
            return (T) str.split(",");
        } else {
            if (Character.TYPE.equals(componentType)) {
                return (T) str.toCharArray();
            }
            if (Character.class.equals(componentType)) {
                char[] charArray = str.toCharArray();
                ?? r5 = (T) new Character[charArray.length];
                while (i < r5.length) {
                    r5[i] = Character.valueOf(charArray[i]);
                    i++;
                }
                return r5;
            } else if (Byte.TYPE.equals(componentType)) {
                return (T) Base64.decode(str, 0);
            } else {
                if (!Byte.class.equals(componentType)) {
                    return null;
                }
                byte[] decode = Base64.decode(str, 0);
                ?? r52 = (T) new Byte[decode.length];
                while (i < r52.length) {
                    r52[i] = Byte.valueOf(decode[i]);
                    i++;
                }
                return r52;
            }
        }
    }

    public static <T> T toPOJO(JSONObject jSONObject, Class<T> cls) {
        Field[] fields;
        char c;
        Object obj;
        if (jSONObject == null || cls == null || cls == Void.TYPE) {
            return null;
        }
        try {
            T newInstance = cls.newInstance();
            for (Field field : cls.getFields()) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (jSONObject.has(name)) {
                    if (!type.isPrimitive()) {
                        if (type == String.class) {
                            obj = jSONObject.getString(name);
                        } else {
                            if (type != Boolean.class && type != Integer.class && type != Short.class && type != Long.class && type != Double.class) {
                                if (type.isArray()) {
                                    obj = toPOJOArray(jSONObject.getJSONArray(name), type.getComponentType());
                                } else if (Map.class.isAssignableFrom(type)) {
                                    obj = toMap(jSONObject.getJSONObject(name));
                                } else {
                                    obj = toPOJO(jSONObject.getJSONObject(name), type);
                                }
                            }
                            obj = jSONObject.get(name);
                        }
                        field.set(newInstance, obj);
                    } else if (type == Boolean.TYPE) {
                        field.setBoolean(newInstance, jSONObject.getBoolean(name));
                    } else if (type == Byte.TYPE) {
                        field.setByte(newInstance, (byte) jSONObject.getInt(name));
                    } else if (type == Character.TYPE) {
                        String string = jSONObject.getString(name);
                        if (string != null && string.length() != 0) {
                            c = string.charAt(0);
                            field.setChar(newInstance, c);
                        }
                        c = 0;
                        field.setChar(newInstance, c);
                    } else if (type == Short.TYPE) {
                        field.setShort(newInstance, (short) jSONObject.getInt(name));
                    } else if (type == Integer.TYPE) {
                        field.setInt(newInstance, jSONObject.getInt(name));
                    } else if (type == Long.TYPE) {
                        field.setLong(newInstance, jSONObject.getLong(name));
                    } else if (type == Float.TYPE) {
                        field.setFloat(newInstance, (float) jSONObject.getDouble(name));
                    } else if (type == Double.TYPE) {
                        field.setDouble(newInstance, jSONObject.getDouble(name));
                    }
                }
            }
            return newInstance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T[] toPOJOArray(JSONArray jSONArray, Class<T> cls) {
        char c;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("b29b97c3", new Object[]{jSONArray, cls}));
        }
        if (jSONArray == null || cls == null || cls == Void.TYPE) {
            return null;
        }
        Object newInstance = Array.newInstance((Class<?>) cls, jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (!cls.isPrimitive()) {
                    if (cls == String.class) {
                        obj = jSONArray.getString(i);
                    } else {
                        if (cls != Boolean.class && cls != Integer.class && cls != Short.class && cls != Long.class && cls != Double.class) {
                            if (cls.isArray()) {
                                obj = toPOJOArray(jSONArray.getJSONArray(i), cls.getComponentType());
                            } else if (Map.class.isAssignableFrom(cls)) {
                                obj = toMap(jSONArray.getJSONObject(i));
                            } else {
                                obj = toPOJO(jSONArray.getJSONObject(i), cls);
                            }
                        }
                        obj = jSONArray.get(i);
                    }
                    Array.set(newInstance, i, obj);
                } else if (cls == Boolean.TYPE) {
                    Array.setBoolean(newInstance, i, jSONArray.getBoolean(i));
                } else if (cls == Byte.TYPE) {
                    Array.setByte(newInstance, i, (byte) jSONArray.getInt(i));
                } else if (cls == Character.TYPE) {
                    String string = jSONArray.getString(i);
                    if (string != null && string.length() != 0) {
                        c = string.charAt(0);
                        Array.setChar(newInstance, i, c);
                    }
                    c = 0;
                    Array.setChar(newInstance, i, c);
                } else if (cls == Short.TYPE) {
                    Array.setShort(newInstance, i, (short) jSONArray.getInt(i));
                } else if (cls == Integer.TYPE) {
                    Array.setInt(newInstance, i, jSONArray.getInt(i));
                } else if (cls == Long.TYPE) {
                    Array.setLong(newInstance, i, jSONArray.getLong(i));
                } else if (cls == Float.TYPE) {
                    Array.setFloat(newInstance, i, (float) jSONArray.getDouble(i));
                } else if (cls == Double.TYPE) {
                    Array.setDouble(newInstance, i, jSONArray.getDouble(i));
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return (T[]) ((Object[]) newInstance);
    }
}
