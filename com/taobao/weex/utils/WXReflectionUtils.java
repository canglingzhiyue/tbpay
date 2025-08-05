package com.taobao.weex.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes9.dex */
public class WXReflectionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1994797036);
    }

    public static Object parseArgument(Type type, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9b13a890", new Object[]{type, obj});
        }
        if (obj != null) {
            if (obj.getClass() == type) {
                return obj;
            }
            if ((type instanceof Class) && ((Class) type).isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        if (type == String.class) {
            return obj instanceof String ? obj : JSON.toJSONString(obj);
        } else if (type == Integer.TYPE) {
            return obj.getClass().isAssignableFrom(Integer.TYPE) ? obj : Integer.valueOf(WXUtils.getInt(obj));
        } else if (type == Long.TYPE) {
            return obj.getClass().isAssignableFrom(Long.TYPE) ? obj : Long.valueOf(WXUtils.getLong(obj));
        } else if (type == Double.TYPE) {
            return obj.getClass().isAssignableFrom(Double.TYPE) ? obj : Double.valueOf(WXUtils.getDouble(obj));
        } else if (type == Float.TYPE) {
            return obj.getClass().isAssignableFrom(Float.TYPE) ? obj : Float.valueOf(WXUtils.getFloat(obj));
        } else if (type == JSONArray.class && obj != null && obj.getClass() == JSONArray.class) {
            return obj;
        } else {
            if (type == JSONObject.class && obj != null && obj.getClass() == JSONObject.class) {
                return obj;
            }
            return JSON.parseObject(obj instanceof String ? (String) obj : JSON.toJSONString(obj), type, new Feature[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[Catch: Exception -> 0x00c5, TryCatch #0 {Exception -> 0x00c5, blocks: (B:10:0x0022, B:12:0x002a, B:14:0x002e, B:41:0x00a8, B:43:0x00b0, B:47:0x00c2, B:46:0x00ba, B:16:0x0032, B:18:0x003a, B:21:0x0043, B:23:0x004b, B:26:0x0054, B:28:0x005c, B:31:0x0065, B:33:0x006d, B:37:0x0078, B:38:0x0081, B:39:0x008f, B:40:0x009c), top: B:50:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setValue(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.weex.utils.WXReflectionUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r3 = 2
            r1[r3] = r5
            java.lang.String r3 = "8de60fb8"
            r0.ipc$dispatch(r3, r1)
            return
        L18:
            if (r3 == 0) goto Lc5
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L22
            goto Lc5
        L22:
            java.lang.reflect.Field r4 = getDeclaredField(r3, r4)     // Catch: java.lang.Exception -> Lc5
            boolean r0 = r5 instanceof java.math.BigDecimal     // Catch: java.lang.Exception -> Lc5
            if (r0 != 0) goto L32
            boolean r0 = r5 instanceof java.lang.Number     // Catch: java.lang.Exception -> Lc5
            if (r0 != 0) goto L32
            boolean r0 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> Lc5
            if (r0 == 0) goto L76
        L32:
            java.lang.Class r0 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 == r1) goto L9c
            java.lang.Class r0 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch: java.lang.Exception -> Lc5
            if (r0 != r1) goto L43
            goto L9c
        L43:
            java.lang.Class r0 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 == r1) goto L8f
            java.lang.Class r0 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class r1 = java.lang.Double.TYPE     // Catch: java.lang.Exception -> Lc5
            if (r0 != r1) goto L54
            goto L8f
        L54:
            java.lang.Class r0 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 == r1) goto L81
            java.lang.Class r0 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lc5
            if (r0 != r1) goto L65
            goto L81
        L65:
            java.lang.Class r0 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r0 == r1) goto L78
            java.lang.Class r0 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> Lc5
            if (r0 != r1) goto L76
            goto L78
        L76:
            r0 = r5
            goto La8
        L78:
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> Lc5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> Lc5
            goto La8
        L81:
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> Lc5
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Exception -> Lc5
            int r0 = (int) r0     // Catch: java.lang.Exception -> Lc5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lc5
            goto La8
        L8f:
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> Lc5
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Exception -> Lc5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> Lc5
            goto La8
        L9c:
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> Lc5
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Exception -> Lc5
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Exception -> Lc5
        La8:
            java.lang.Class r1 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> Lc5
            if (r1 == r2) goto Lb8
            java.lang.Class r1 = r4.getType()     // Catch: java.lang.Exception -> Lc5
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r1 != r2) goto Lc2
        Lb8:
            if (r5 == 0) goto Lc2
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lc5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> Lc5
        Lc2:
            setProperty(r3, r4, r0)     // Catch: java.lang.Exception -> Lc5
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.utils.WXReflectionUtils.setValue(java.lang.Object, java.lang.String, java.lang.Object):void");
    }

    public static Field getDeclaredField(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("7e82c4d4", new Object[]{obj, str});
        }
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void setProperty(Object obj, Field field, Object obj2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        if (obj == null || field == null) {
            return;
        }
        try {
            field.setAccessible(true);
            field.set(obj, obj2);
        } catch (Exception unused) {
        }
    }
}
