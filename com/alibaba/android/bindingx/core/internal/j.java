package com.alibaba.android.bindingx.core.internal;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> b;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f2240a;

    static {
        kge.a(-131286219);
        b = new HashMap(32);
    }

    public static j a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("2c823830", new Object[]{lVar});
        }
        if (lVar == null) {
            return null;
        }
        if (!StringUtils.isEmpty(lVar.b)) {
            return new j(lVar.b);
        }
        if (lVar.c == null) {
            return null;
        }
        return new j(lVar.c);
    }

    public j(String str) {
        try {
            this.f2240a = (JSONObject) new JSONTokener(str).nextValue();
        } catch (Throwable th) {
            com.alibaba.android.bindingx.core.h.a("[Expression] expression is illegal. \n ", th);
        }
    }

    public j(JSONObject jSONObject) {
        this.f2240a = jSONObject;
    }

    public Object a(Map<String, Object> map) throws IllegalArgumentException, JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ee1e2b5", new Object[]{this, map}) : a(this.f2240a, map);
    }

    private double a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251232", new Object[]{this, obj})).doubleValue();
        }
        if (obj instanceof String) {
            return Double.parseDouble((String) obj);
        }
        if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return mto.a.GEO_NOT_SUPPORT;
            }
            return 1.0d;
        }
        return ((Double) obj).doubleValue();
    }

    private boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof String) {
            return "".equals(obj);
        }
        if (!(obj instanceof Double)) {
            return ((Boolean) obj).booleanValue();
        }
        return ((Double) obj).doubleValue() != mto.a.GEO_NOT_SUPPORT;
    }

    private boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{this, obj, obj2})).booleanValue();
        }
        if ((obj instanceof n) && (obj2 instanceof n)) {
            return obj == obj2;
        } else if ((obj instanceof String) && (obj2 instanceof String)) {
            return obj.equals(obj2);
        } else {
            return (!(obj instanceof Boolean) || !(obj2 instanceof Boolean)) ? a(obj) == a(obj2) : b(obj) == b(obj2);
        }
    }

    private boolean b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4eaa425", new Object[]{this, obj, obj2})).booleanValue();
        }
        if ((obj instanceof n) && !(obj2 instanceof n)) {
            return false;
        }
        if ((obj instanceof Boolean) && !(obj2 instanceof Boolean)) {
            return false;
        }
        if ((obj instanceof Double) && !(obj2 instanceof Double)) {
            return false;
        }
        return (!(obj instanceof String) || (obj2 instanceof String)) && obj == obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r0.equals("Identifier") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object a(org.json.JSONObject r10, java.util.Map<java.lang.String, java.lang.Object> r11) throws java.lang.IllegalArgumentException, org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.bindingx.core.internal.j.a(org.json.JSONObject, java.util.Map):java.lang.Object");
    }

    private Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        Object a2 = a((Class<?>) JSMath.class, str);
        if (a2 == null) {
            a2 = a((Class<?>) TimingFunctions.class, str);
        }
        if (a2 == null && com.alibaba.android.bindingx.core.h.f2229a) {
            com.alibaba.android.bindingx.core.h.d("can not find inentifier: " + str);
        }
        return a2;
    }

    private static Object a(Class<?> cls, String str) {
        try {
            Object obj = b.get(str);
            if (obj == null) {
                obj = cls.getMethod(str, new Class[0]).invoke(null, new Object[0]);
            }
            if (obj != null) {
                b.put(str, obj);
            }
            return obj;
        } catch (Throwable unused) {
            return null;
        }
    }
}
