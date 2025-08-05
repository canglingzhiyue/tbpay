package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.exception.a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/* loaded from: classes5.dex */
public class fxr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1994423663);
    }

    public static <T> T a(String str, JSONObject jSONObject, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("58d80d18", new Object[]{str, jSONObject, t});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                T t2 = (T) jSONObject.get(str);
                return t2 == null ? t : t2;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return t;
    }

    public static JSONArray a(String str, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("bb94b758", new Object[]{str, jSONObject, jSONArray});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                JSONArray jSONArray2 = jSONObject.getJSONArray(str);
                return jSONArray2 == null ? jSONArray : jSONArray2;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONArray;
    }

    public static JSONObject a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d54ff8d2", new Object[]{str, jSONObject, jSONObject2});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                return jSONObject3 == null ? jSONObject2 : jSONObject3;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return jSONObject2;
    }

    public static Boolean a(String str, JSONObject jSONObject, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b329b14c", new Object[]{str, jSONObject, bool});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                Boolean bool2 = jSONObject.getBoolean(str);
                return bool2 == null ? bool : bool2;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return bool;
    }

    public static String a(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb330a58", new Object[]{str, jSONObject, str2});
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                return string == null ? str2 : string;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return str2;
    }

    public static int a(String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("608255b8", new Object[]{str, jSONObject, new Integer(i)})).intValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                Integer integer = jSONObject.getInteger(str);
                return integer == null ? i : integer.intValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i;
    }

    public static float a(String str, JSONObject jSONObject, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60824a72", new Object[]{str, jSONObject, new Float(f)})).floatValue();
        }
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                Float f2 = jSONObject.getFloat(str);
                return f2 == null ? f : f2.floatValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return f;
    }

    public static <T> JSONObject a(T t, boolean z, Class<? super T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("db7674d", new Object[]{t, new Boolean(z), cls});
        }
        if (t == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, t.getClass(), t, z, cls);
        return jSONObject;
    }

    public static <T> void a(JSONObject jSONObject, Class<?> cls, T t, boolean z, Class<? super T> cls2) {
        Field[] declaredFields;
        if (cls == null || cls == Object.class) {
            return;
        }
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (!z || !Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    if (!jSONObject.containsKey(field.getName())) {
                        jSONObject.put(field.getName(), field.get(t));
                    }
                }
            }
            if (cls2 == null || cls == cls2) {
                return;
            }
            a(jSONObject, cls.getSuperclass(), t, z, cls2);
        } catch (Exception e) {
            a.b(e);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                JSONObject jSONObject3 = new JSONObject();
                a((JSONObject) value, jSONObject3);
                jSONObject2.put(entry.getKey(), (Object) jSONObject3);
            } else if (value instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) value;
                JSONArray jSONArray2 = new JSONArray();
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject4 = new JSONObject();
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        a((JSONObject) obj, jSONObject4);
                        jSONArray2.add(jSONObject4);
                    } else if ((obj instanceof String) || (obj instanceof Number)) {
                        jSONArray2.add(obj);
                    } else {
                        String jSONString = JSON.toJSONString(obj);
                        jSONArray2.add(JSON.parse(jSONString));
                        fux.b("命中deepClone else逻辑" + jSONString);
                    }
                }
                jSONObject2.put(entry.getKey(), (Object) jSONArray2);
            } else if (entry.getValue() != null) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
