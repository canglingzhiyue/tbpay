package com.nirvana.tools.jsoner;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final b f8087a = new b();

    public static <T> T a(JSONObject jSONObject, d<T> dVar, List<Field> list) {
        T newInstance = dVar.newInstance();
        if (newInstance instanceof e) {
            ((e) newInstance).fromJson(jSONObject);
            return newInstance;
        }
        return (T) a(jSONObject, newInstance, list);
    }

    public static <T> T a(JSONObject jSONObject, T t, List<Field> list) {
        if (jSONObject != null && t != null) {
            Class<?> cls = t.getClass();
            f a2 = f8087a.a(cls);
            if (a2 == null) {
                a2 = new f(cls);
                f8087a.a(cls, a2);
            }
            List<Field> list2 = a2.f8089a;
            if (list2 != null && list2.size() > 0) {
                for (Field field : list2) {
                    g a3 = a2.a(field.getName());
                    if (a3 == null) {
                        a3 = new g(field);
                        a2.a(field.getName(), a3);
                    }
                    if (!a3.c) {
                        String str = a3.f8090a;
                        if (jSONObject.has(str)) {
                            if (a3.a()) {
                                a(field, str, jSONObject, t);
                            } else if (a3.b()) {
                                try {
                                    field.setAccessible(true);
                                    e eVar = (e) a3.b.newInstance();
                                    Object opt = jSONObject.opt(str);
                                    if (opt instanceof JSONObject) {
                                        eVar.fromJson((JSONObject) opt);
                                    } else if (opt instanceof String) {
                                        eVar.fromJson(new JSONObject(String.valueOf(opt)));
                                    }
                                    field.set(t, eVar);
                                    field = null;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        if (field != null && list != null) {
                            list.add(field);
                        }
                    }
                }
            }
        }
        return t;
    }

    public static <T extends e> List<T> a(String str, d<T> dVar) {
        try {
            return a(new JSONArray(str), dVar);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T extends e> List<T> a(JSONArray jSONArray, d<T> dVar) {
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                if (length <= 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        T newInstance = dVar.newInstance();
                        newInstance.fromJson(jSONObject);
                        arrayList.add(newInstance);
                    }
                }
                return arrayList;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static Map<String, Integer> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() <= 0) {
                return null;
            }
            HashMap hashMap = new HashMap(jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, Integer.valueOf(jSONObject.getInt(next)));
            }
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.length() <= 0) {
                    return null;
                }
                HashMap hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
                return hashMap;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static <T extends e> JSONArray a(Collection<T> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null && collection.size() > 0) {
            for (T t : collection) {
                jSONArray.put(t.toJson());
            }
        }
        return jSONArray;
    }

    public static <T extends e> JSONArray a(List<T> list) {
        return a((Collection) list);
    }

    public static JSONObject a(Object obj, List<Field> list) {
        return a(obj, list, false);
    }

    public static JSONObject a(Object obj, List<Field> list, boolean z) {
        JSONObject json;
        JSONObject jSONObject = new JSONObject();
        Class<?> cls = obj.getClass();
        f a2 = f8087a.a(cls);
        if (a2 == null) {
            a2 = new f(cls);
            f8087a.a(cls, a2);
        }
        List<Field> list2 = a2.f8089a;
        if (list2 != null && list2.size() > 0) {
            for (Field field : list2) {
                g a3 = a2.a(field.getName());
                if (a3 == null) {
                    a3 = new g(field);
                    a2.a(field.getName(), a3);
                }
                if (!a3.c) {
                    Field field2 = null;
                    if (a3.a()) {
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (!z || obj2 != null) {
                                jSONObject.put(a3.f8090a, obj2);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        if (a3.b()) {
                            field.setAccessible(true);
                            e eVar = (e) field.get(obj);
                            if (eVar != null && ((json = eVar.toJson()) != null || !z)) {
                                jSONObject.put(a3.f8090a, json);
                            }
                        }
                        field2 = field;
                    }
                    if (field2 != null && list != null) {
                        list.add(field2);
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean a(Class<?> cls) {
        return Integer.TYPE.equals(cls) || Integer.class.equals(cls) || int[].class.equals(cls) || Integer[].class.equals(cls) || Short.TYPE.equals(cls) || Short.class.equals(cls) || short[].class.equals(cls) || Short[].class.equals(cls) || Long.TYPE.equals(cls) || Long.class.equals(cls) || long[].class.equals(cls) || Long[].class.equals(cls) || Float.TYPE.equals(cls) || Float.class.equals(cls) || float[].class.equals(cls) || Float[].class.equals(cls) || Double.TYPE.equals(cls) || Double.class.equals(cls) || double[].class.equals(cls) || Double[].class.equals(cls);
    }

    private static boolean a(Field field, String str, JSONObject jSONObject, Object obj) {
        Object valueOf;
        try {
            field.setAccessible(true);
            Class<?> type = field.getType();
            if (String.class.equals(type)) {
                valueOf = jSONObject.optString(str);
            } else {
                if (!Boolean.TYPE.equals(type) && !Boolean.class.equals(type)) {
                    if (!Integer.TYPE.equals(type) && !Integer.class.equals(type)) {
                        if (!Long.TYPE.equals(type) && !Long.class.equals(type)) {
                            if (!Double.TYPE.equals(type) && !Double.class.equals(type)) {
                                valueOf = jSONObject.opt(str);
                            }
                            valueOf = Double.valueOf(jSONObject.optDouble(str));
                        }
                        valueOf = Long.valueOf(jSONObject.optLong(str));
                    }
                    valueOf = Integer.valueOf(jSONObject.optInt(str));
                }
                valueOf = Boolean.valueOf(jSONObject.optBoolean(str));
            }
            field.set(obj, valueOf);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean b(Class<?> cls) {
        return String.class.equals(cls) || StringBuilder.class.equals(cls) || String[].class.equals(cls) || StringBuilder[].class.equals(cls) || StringBuffer.class.equals(cls) || CharSequence.class.equals(cls) || StringBuffer[].class.equals(cls) || CharSequence[].class.equals(cls);
    }

    public static boolean c(Class<?> cls) {
        return Byte.TYPE.equals(cls) || Byte.class.equals(cls) || byte[].class.equals(cls) || Byte[].class.equals(cls) || Character.TYPE.equals(cls) || Character.class.equals(cls) || char[].class.equals(cls) || Character[].class.equals(cls);
    }

    public static boolean d(Class<?> cls) {
        return Boolean.TYPE.equals(cls) || Boolean.class.equals(cls) || boolean[].class.equals(cls) || Boolean[].class.equals(cls);
    }
}
