package com.taobao.tao.flexbox.layoutmanager.core;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1623902529);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
        if (r9.equals("*") != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.Object r7, java.lang.Object r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.l.a(java.lang.Object, java.lang.Object, java.lang.String):java.lang.Object");
    }

    private static Object b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("eeb6464d", new Object[]{obj});
        }
        if (obj == null) {
            obj = "";
        }
        return ((obj instanceof Map) || (obj instanceof List)) ? obj.toString() : obj;
    }

    private static Boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e6dff0c3", new Object[]{obj});
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            if (obj.equals("true")) {
                return true;
            }
            if (obj.equals("false")) {
                return false;
            }
        }
        if (d(obj).floatValue() > 0.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static Number d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("88a0f141", new Object[]{obj});
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Float.valueOf((String) obj);
            } catch (Exception unused) {
            }
        } else if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            return 1;
        }
        return 0;
    }

    private static Number a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("d38cb48", new Object[]{obj, obj2});
        }
        Number d = d(obj);
        Number d2 = d(obj2);
        if ((d instanceof Integer) && (d2 instanceof Integer)) {
            return Integer.valueOf(d.intValue() + d2.intValue());
        }
        return a(d.floatValue() + d2.floatValue());
    }

    private static Number b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("9a25e267", new Object[]{obj, obj2});
        }
        Number d = d(obj);
        Number d2 = d(obj2);
        if ((d instanceof Integer) && (d2 instanceof Integer)) {
            return Integer.valueOf(d.intValue() - d2.intValue());
        }
        return a(d.floatValue() - d2.floatValue());
    }

    private static Number c(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("2712f986", new Object[]{obj, obj2});
        }
        Number d = d(obj);
        Number d2 = d(obj2);
        if ((d instanceof Integer) && (d2 instanceof Integer)) {
            return Integer.valueOf(d.intValue() * d2.intValue());
        }
        return a(d.floatValue() * d2.floatValue());
    }

    private static Number d(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Number) ipChange.ipc$dispatch("b40010a5", new Object[]{obj, obj2}) : a(d(obj).floatValue() / d(obj2).floatValue());
    }

    private static Number e(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Number) ipChange.ipc$dispatch("40ed27c4", new Object[]{obj, obj2}) : Integer.valueOf(d(obj).intValue() % d(obj2).intValue());
    }

    private static Boolean f(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d5708262", new Object[]{obj, obj2});
        }
        Number d = d(obj);
        Number d2 = d(obj2);
        if ((d instanceof Integer) && (d2 instanceof Integer)) {
            if (d.intValue() <= d2.intValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (d.floatValue() <= d2.floatValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Boolean g(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e6264f23", new Object[]{obj, obj2});
        }
        Number d = d(obj);
        Number d2 = d(obj2);
        if ((d instanceof Integer) && (d2 instanceof Integer)) {
            if (d.intValue() < d2.intValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (d.floatValue() < d2.floatValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Number a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("d26b1310", new Object[]{new Float(f)});
        }
        int i = (int) f;
        if (i == f) {
            return Integer.valueOf(i);
        }
        return Float.valueOf(f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0137 A[LOOP:1: B:71:0x0133->B:73:0x0137, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object a(java.lang.String r11, java.util.List r12, com.taobao.tao.flexbox.layoutmanager.core.y r13) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.l.a(java.lang.String, java.util.List, com.taobao.tao.flexbox.layoutmanager.core.y):java.lang.Object");
    }

    public static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof String) {
            return ((String) obj).startsWith("$.");
        }
        return false;
    }

    public static Object a(String str, Object obj, y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("23616db1", new Object[]{str, obj, yVar});
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (list != null) {
                try {
                    return a(str, list, yVar);
                } catch (Exception e) {
                    ogg.a("Expression", e.getMessage());
                }
            }
            return "";
        } else if (!(obj instanceof Map)) {
            return obj;
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll((Map) obj);
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                jSONObject.put((JSONObject) entry.getKey(), (String) a(str, entry.getValue(), yVar));
            }
            return jSONObject;
        }
    }
}
