package com.taobao.android.dinamicx.expression.expr_v2;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import tb.fne;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ARRAY = 6;
    public static final int TYPE_BOOL = 4;
    public static final int TYPE_BUILTIN_OBJECT = 8;
    public static final int TYPE_FLOAT = 3;
    public static final int TYPE_FUNCTION = 9;
    public static final int TYPE_INT = 2;
    public static final int TYPE_INVALID = -1;
    public static final int TYPE_JAVA_OBJECT = 10;
    public static final int TYPE_NULL = 1;
    public static final int TYPE_OBJECT = 7;
    public static final int TYPE_STRING = 5;
    public static final int TYPE_UNDEFINED = 0;

    /* renamed from: a  reason: collision with root package name */
    private final int f11869a;
    private final long b;
    private final double c;
    private final Object d;

    static {
        kge.a(531660177);
    }

    private f(int i, long j, double d, Object obj) {
        this.f11869a = i;
        this.b = j;
        this.c = d;
        this.d = obj;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        switch (this.f11869a) {
            case -1:
                return android.taobao.windvane.connect.e.DEFAULT_HTTPS_ERROR_INVALID;
            case 0:
                return "UNDEFINED";
            case 1:
                return "NULL";
            case 2:
                return fne.TYPE_INT;
            case 3:
                return "FLOAT";
            case 4:
                return fne.TYPE_BOOLEAN;
            case 5:
                return fne.TYPE_STRING;
            case 6:
                return "ARRAY";
            case 7:
                return "OBJECT";
            case 8:
                return "BUILTIN_OBJECT";
            case 9:
                return "FUNCTION";
            default:
                throw new IllegalArgumentException("Invalid type" + this.f11869a);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        int i = this.f11869a;
        return i == 2 || i == 3 || i == 1 || i == 0;
    }

    public double c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b58", new Object[]{this})).doubleValue();
        }
        int i = this.f11869a;
        if (i == 0) {
            return Double.NaN;
        }
        if (i == 1) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        throw new IllegalArgumentException("cannot cast to number, type: " + this.f11869a);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        switch (this.f11869a) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
                return "undefined";
            case 1:
            case 6:
            case 7:
            case 8:
                return "object";
            case 2:
            case 3:
                return "number";
            case 4:
                return com.taobao.android.weex_framework.util.a.ATOM_boolean;
            case 5:
                return "string";
            case 9:
                return com.taobao.android.weex_framework.util.a.ATOM_function;
            default:
                throw new IllegalArgumentException("Invalid type" + this.f11869a);
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f11869a;
    }

    public static f f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("6b17c89f", new Object[0]) : new f(1, 0L, mto.a.GEO_NOT_SUPPORT, null);
    }

    public static f g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("8533473e", new Object[0]) : new f(0, 0L, mto.a.GEO_NOT_SUPPORT, null);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        int i = this.f11869a;
        return i == 0 || i == 1;
    }

    public static f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("2f0764fa", new Object[]{str});
        }
        if (str == null) {
            throw new IllegalStateException("string can't be null");
        }
        return new f(5, 0L, mto.a.GEO_NOT_SUPPORT, str);
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        if (this.f11869a == 5) {
            return (String) this.d;
        }
        throw new IllegalStateException("getText illegal type: " + this.f11869a);
    }

    public static f a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("b4b30d28", new Object[]{obj});
        }
        if (obj == null) {
            throw new IllegalStateException("对象不可以是 null");
        }
        return new f(10, 0L, mto.a.GEO_NOT_SUPPORT, obj);
    }

    public Object j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77e79761", new Object[]{this});
        }
        if (this.f11869a == 10) {
            return this.d;
        }
        throw new IllegalStateException("getText illegal type: " + this.f11869a);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.f11869a == 5;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.f11869a == 10;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        switch (this.f11869a) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
                return "undefined";
            case 1:
                return "null";
            case 2:
                return String.valueOf(this.b);
            case 3:
                return String.valueOf(this.c);
            case 4:
                if (this.b != 0) {
                    z = true;
                }
                return String.valueOf(z);
            case 5:
                return (String) this.d;
            case 6:
                return "[object Array]";
            case 7:
            case 8:
                return "[object Object]";
            case 9:
                return "[function]";
            case 10:
                return "[java object]";
            default:
                throw new IllegalArgumentException("Invalid type convert to string" + this.f11869a);
        }
    }

    public static f a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("3b1b2b5c", new Object[]{jSONArray}) : new f(6, 0L, mto.a.GEO_NOT_SUPPORT, jSONArray);
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.f11869a == 6;
    }

    public JSONArray o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("37943608", new Object[]{this});
        }
        if (!n()) {
            throw new IllegalStateException("getArray from a type:" + this.f11869a);
        }
        return (JSONArray) this.d;
    }

    public static f a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9fd46464", new Object[]{jSONObject}) : new f(7, 0L, mto.a.GEO_NOT_SUPPORT, jSONObject);
    }

    public static f a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("f03fb4af", new Object[]{gVar}) : new f(8, 0L, mto.a.GEO_NOT_SUPPORT, gVar);
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.f11869a == 7;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.f11869a == 8;
    }

    public JSONObject r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bec48319", new Object[]{this});
        }
        if (!p()) {
            throw new IllegalStateException("getObject from a type:" + this.f11869a);
        }
        return (JSONObject) this.d;
    }

    public g s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("be7d36d1", new Object[]{this});
        }
        if (!q()) {
            throw new IllegalStateException("getBuiltInObject from a type:" + this.f11869a);
        }
        return (g) this.d;
    }

    public static f a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("97efc932", new Object[]{jVar}) : new f(9, 0L, mto.a.GEO_NOT_SUPPORT, jVar);
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.f11869a == 9;
    }

    public j u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("f2b4346c", new Object[]{this});
        }
        if (!t()) {
            throw new IllegalStateException("getFunction from a type:" + this.f11869a);
        }
        return (j) this.d;
    }

    public static f a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("256cbb10", new Object[]{new Long(j)}) : new f(2, j, mto.a.GEO_NOT_SUPPORT, null);
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.f11869a == 2;
    }

    public long w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27172", new Object[]{this})).longValue();
        }
        if (this.f11869a == 2) {
            return this.b;
        }
        throw new IllegalStateException("getInt from: " + this);
    }

    public long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b088f3", new Object[]{this})).longValue();
        }
        int i = this.f11869a;
        if (i == 0 || i == 1) {
            return 0L;
        }
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return (long) this.c;
        }
        if (i == 5) {
            return Long.parseLong((String) this.d);
        }
        throw new IllegalStateException("can't conver to int:" + this);
    }

    public static f a(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("12591cd6", new Object[]{new Double(d)}) : new f(3, 0L, d, null);
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.f11869a == 3;
    }

    public double z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ccb7ef", new Object[]{this})).doubleValue();
        }
        if (this.f11869a == 3) {
            return this.c;
        }
        throw new IllegalStateException("getInt from: " + this);
    }

    public double A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a97c36", new Object[]{this})).doubleValue();
        }
        int i = this.f11869a;
        if (i == 0) {
            return Double.NaN;
        }
        if (i == 1) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 5) {
            return Double.parseDouble((String) this.d);
        }
        throw new IllegalStateException("can't conver to float:" + this);
    }

    public static f a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("2f66100", new Object[]{new Boolean(z)});
        }
        return new f(4, z ? 1L : 0L, mto.a.GEO_NOT_SUPPORT, null);
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.f11869a == 4;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        if (this.f11869a == 4) {
            return this.b != 0;
        }
        throw new IllegalStateException("can't getBool :" + this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        switch (this.f11869a) {
            case 0:
            case 1:
                break;
            case 2:
            case 4:
                if (this.b != 0) {
                    return true;
                }
                break;
            case 3:
                return this.c != mto.a.GEO_NOT_SUPPORT;
            case 5:
                return ((String) this.d).length() != 0 && !((String) this.d).equalsIgnoreCase("false");
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                throw new IllegalStateException("invalid type");
        }
        return false;
    }

    public Object D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("800de3c7", new Object[]{this});
        }
        switch (e()) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
            case 1:
                return null;
            case 2:
                return Long.valueOf(w());
            case 3:
                return Double.valueOf(z());
            case 4:
                return Boolean.valueOf(B());
            case 5:
                return i();
            case 6:
                return o();
            case 7:
                return r();
            case 8:
                return s();
            case 9:
                return u();
            case 10:
                return j();
            default:
                return null;
        }
    }

    public static Object a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5493e374", new Object[]{fVar});
        }
        switch (fVar.e()) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
            case 1:
                return null;
            case 2:
                return Long.valueOf(fVar.w());
            case 3:
                return Double.valueOf(fVar.z());
            case 4:
                return Boolean.valueOf(fVar.B());
            case 5:
                return fVar.i();
            case 6:
                return fVar.o();
            case 7:
                return fVar.r();
            case 8:
                return fVar.s();
            case 9:
                return fVar.u();
            case 10:
                return fVar.j();
            default:
                return null;
        }
    }

    public static f b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("36fdc207", new Object[]{obj});
        }
        if (obj == null) {
            return g();
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return a((JSONArray) obj);
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        if (obj instanceof Boolean) {
            return a(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Integer) {
            return a(((Integer) obj).intValue());
        }
        if (obj instanceof Float) {
            return a(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return a(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return a(((Double) obj).doubleValue());
        }
        if (obj instanceof BigDecimal) {
            return a(((BigDecimal) obj).doubleValue());
        }
        if (obj instanceof Object) {
            return a(obj);
        }
        throw new IllegalArgumentException("Unsupport value from JSON: " + obj.getClass());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        switch (this.f11869a) {
            case -1:
            case 0:
            case 1:
                return "";
            case 2:
                return String.valueOf(this.b);
            case 3:
                return String.valueOf(this.c);
            case 4:
                if (this.b != 0) {
                    z = true;
                }
                return String.valueOf(z);
            case 5:
                return String.valueOf(this.d);
            case 6:
                return c(this.d);
            case 7:
            case 8:
                return "[object Object]";
            case 9:
                return "function " + ((j) this.d).getDxFunctionName() + "() { [native code] }";
            case 10:
                StringBuilder sb = new StringBuilder();
                sb.append("[java Object]");
                Object obj = this.d;
                sb.append(obj != null ? obj.getClass().getSimpleName() : "null");
                return sb.toString();
            default:
                throw new IllegalArgumentException("Invalid type" + this.f11869a);
        }
    }

    private String c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3897149a", new Object[]{this, obj});
        }
        if (!(obj instanceof JSONArray)) {
            return obj instanceof JSONObject ? "[object Object]" : obj != null ? obj.toString() : "";
        }
        JSONArray jSONArray = (JSONArray) obj;
        int size = jSONArray.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(c(jSONArray.get(i)));
            if (i < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public boolean b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd2eb4c3", new Object[]{this, fVar})).booleanValue() : this.d == fVar.d;
    }
}
