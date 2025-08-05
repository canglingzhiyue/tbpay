package com.alibaba.android.ultron.ext.event.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-974468134);
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject2 == null) {
        } else {
            a((Object) jSONObject, (Object) jSONObject2);
        }
    }

    private static void a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184a7920", new Object[]{obj, obj2});
        } else if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : ((JSONObject) obj2).entrySet()) {
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    if (jSONObject.get(entry.getKey()) instanceof JSONObject) {
                        a(jSONObject.getJSONObject(entry.getKey()), value);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject.put(entry.getKey(), (Object) jSONObject2);
                        a(jSONObject2, value);
                    }
                } else if (value instanceof JSONArray) {
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put(entry.getKey(), (Object) jSONArray);
                    a(jSONArray, value);
                } else {
                    jSONObject.put(entry.getKey(), value);
                }
            }
        } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            JSONArray jSONArray2 = (JSONArray) obj;
            JSONArray jSONArray3 = (JSONArray) obj2;
            int size = jSONArray3.size();
            for (int i = 0; i < size; i++) {
                Object obj3 = jSONArray3.get(i);
                if (obj3 instanceof JSONObject) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONArray2.add(i, jSONObject3);
                    a(jSONObject3, obj3);
                } else if (obj3 instanceof JSONArray) {
                    JSONArray jSONArray4 = new JSONArray();
                    jSONArray2.add(i, jSONArray4);
                    a(jSONArray4, obj3);
                } else {
                    jSONArray2.add(i, obj3);
                }
            }
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        a((Object) jSONObject2, (Object) jSONObject);
        return jSONObject2;
    }

    public static JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b36fc2ae", new Object[]{jSONArray});
        }
        JSONArray jSONArray2 = new JSONArray();
        a(jSONArray2, jSONArray);
        return jSONArray2;
    }

    public static void a(Object obj, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df337f6", new Object[]{obj, jSONObject, str});
        } else {
            a(obj, jSONObject, str, "");
        }
    }

    public static void a(Object obj, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b29040", new Object[]{obj, jSONObject, str, str2});
        } else if (obj == null || jSONObject == null) {
        } else {
            b(obj, jSONObject, str, str2);
        }
    }

    private static void b(Object obj, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d91f9f", new Object[]{obj, jSONObject, str, str2});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (str == null || !str.equals(entry.getKey())) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        String str3 = (String) value;
                        if (d.a(str3) && (str2 == null || str2.equals("") || d.b(str3).equalsIgnoreCase(str2))) {
                            Object a2 = d.a(str3, jSONObject);
                            if (a2 instanceof JSONObject) {
                                jSONObject2.put(entry.getKey(), (Object) a((JSONObject) a2));
                            } else if (a2 instanceof JSONArray) {
                                jSONObject2.put(entry.getKey(), (Object) a((JSONArray) a2));
                            } else {
                                jSONObject2.put(entry.getKey(), a2);
                            }
                        }
                    } else if (value instanceof JSONObject) {
                        b(value, jSONObject, str, str2);
                    } else if (value instanceof JSONArray) {
                        b(value, jSONObject, str, str2);
                    }
                }
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    String str4 = (String) obj2;
                    if (d.a(str4)) {
                        Object a3 = d.a(str4, jSONObject);
                        if (a3 instanceof JSONObject) {
                            jSONArray.set(i, a((JSONObject) a3));
                        } else if (a3 instanceof JSONArray) {
                            jSONArray.set(i, a((JSONArray) a3));
                        } else {
                            jSONArray.set(i, a3);
                        }
                    }
                } else if (obj2 instanceof JSONObject) {
                    b(obj2, jSONObject, str, str2);
                } else if (obj2 instanceof JSONArray) {
                    b(obj2, jSONObject, str, str2);
                }
            }
        }
    }
}
