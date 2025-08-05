package tb;

import android.taobao.windvane.connect.e;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.weex_framework.util.a;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import tb.mto;

/* loaded from: classes.dex */
public class gfx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte TYPE_ARRAY = 6;
    public static final byte TYPE_BOOL = 4;
    public static final byte TYPE_BUILTIN_OBJECT = 8;
    public static final byte TYPE_DOUBLE = 3;
    public static final byte TYPE_FUNCTION = 9;
    public static final byte TYPE_INT = 2;
    public static final byte TYPE_INVALID = -1;
    public static final byte TYPE_JAVA_OBJECT = 10;
    public static final byte TYPE_MAP = 7;
    public static final byte TYPE_NULL = 1;
    public static final byte TYPE_STRING = 5;
    public static final byte TYPE_UNDEFINED = 0;

    /* renamed from: a  reason: collision with root package name */
    private static final gfx f28314a;
    private static final gfx b;
    private static final gfx c;
    private static final gfx d;
    private final byte e;
    private final long f;
    private final double g;
    private final Object h;

    static {
        kge.a(-86910931);
        f28314a = new gfx((byte) 1, 0L, mto.a.GEO_NOT_SUPPORT, null);
        b = new gfx((byte) 0, 0L, mto.a.GEO_NOT_SUPPORT, null);
        c = new gfx((byte) 4, 1L, mto.a.GEO_NOT_SUPPORT, null);
        d = new gfx((byte) 4, 0L, mto.a.GEO_NOT_SUPPORT, null);
    }

    private gfx(byte b2, long j, double d2, Object obj) {
        this.e = b2;
        this.f = j;
        this.g = d2;
        this.h = obj;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        switch (this.e) {
            case -1:
                return e.DEFAULT_HTTPS_ERROR_INVALID;
            case 0:
                return "UNDEFINED";
            case 1:
                return "NULL";
            case 2:
                return fne.TYPE_INT;
            case 3:
                return fne.TYPE_DOUBLE;
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
                throw new IllegalArgumentException("Invalid type" + ((int) this.e));
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        byte b2 = this.e;
        return b2 == 2 || b2 == 3 || b2 == 1 || b2 == 0;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        switch (this.e) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
                return a.ATOM_EXT_Undefined;
            case 1:
                return a.ATOM_EXT_Null;
            case 2:
                return "Int";
            case 3:
                return "Double";
            case 4:
                return a.ATOM_Boolean;
            case 5:
                return a.ATOM_String;
            case 6:
                return "List";
            case 7:
                return a.ATOM_Map;
            case 8:
            default:
                throw new IllegalArgumentException("Invalid type" + ((int) this.e));
            case 9:
                return a.ATOM_function;
            case 10:
                return "java_object";
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.e;
    }

    public static gfx e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("2dcb9a41", new Object[0]) : f28314a;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.e == 1;
    }

    public static gfx g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("3d2ee4ff", new Object[0]) : b;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        byte b2 = this.e;
        return b2 == 0 || b2 == 1;
    }

    public static gfx a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("7c6fadbb", new Object[]{str});
        }
        if (str == null) {
            return e();
        }
        return new gfx((byte) 5, 0L, mto.a.GEO_NOT_SUPPORT, str);
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        if (this.e == 5) {
            return (String) this.h;
        }
        throw new IllegalStateException("getText illegal type: " + ((int) this.e));
    }

    public static gfx a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("16bb4f69", new Object[]{obj}) : b(obj);
    }

    public Object j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77e79761", new Object[]{this});
        }
        if (this.e == 10) {
            return this.h;
        }
        throw new IllegalStateException("getText illegal type: " + ((int) this.e));
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.e == 5;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.e == 10;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : toString();
    }

    public static gfx a(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("fa5c06b4", new Object[]{list});
        }
        if (list == null) {
            return e();
        }
        return new gfx((byte) 6, 0L, mto.a.GEO_NOT_SUPPORT, list);
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.e == 6 && (this.h instanceof JSONArray);
    }

    public JSONArray o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("37943608", new Object[]{this});
        }
        if (!n()) {
            throw new IllegalStateException("getArray from a type:" + ((int) this.e));
        }
        return (JSONArray) this.h;
    }

    public static gfx a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("24b07970", new Object[]{map}) : new gfx((byte) 7, 0L, mto.a.GEO_NOT_SUPPORT, map);
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.e == 7 && (this.h instanceof JSONObject);
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.e == 8;
    }

    public JSONObject r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bec48319", new Object[]{this});
        }
        if (!p()) {
            throw new IllegalStateException("getObject from a type:" + ((int) this.e));
        }
        return (JSONObject) this.h;
    }

    public gfy s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfy) ipChange.ipc$dispatch("9982a592", new Object[]{this});
        }
        if (!q()) {
            throw new IllegalStateException("getBuiltInObject from a type:" + ((int) this.e));
        }
        return (gfy) this.h;
    }

    public static gfx a(ghe gheVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("d02636f9", new Object[]{gheVar}) : new gfx((byte) 9, 0L, mto.a.GEO_NOT_SUPPORT, gheVar);
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.e == 9;
    }

    public ghe u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghe) ipChange.ipc$dispatch("a8e5f566", new Object[]{this});
        }
        if (!t()) {
            throw new IllegalStateException("getFunction from a type:" + ((int) this.e));
        }
        return (ghe) this.h;
    }

    public static gfx a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("daab5f51", new Object[]{new Long(j)}) : new gfx((byte) 2, j, mto.a.GEO_NOT_SUPPORT, null);
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.e == 2;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue();
        }
        if (this.e == 2) {
            return (int) this.f;
        }
        throw new IllegalStateException("getInt from: " + this);
    }

    public long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b088f3", new Object[]{this})).longValue();
        }
        if (this.e == 2) {
            return this.f;
        }
        throw new IllegalStateException("getInt from: " + this);
    }

    public long y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea074", new Object[]{this})).longValue();
        }
        byte b2 = this.e;
        if (b2 == 0 || b2 == 1) {
            return 0L;
        }
        if (b2 != 2) {
            if (b2 == 3) {
                return (long) this.g;
            }
            if (b2 != 4) {
                if (b2 == 5) {
                    return Long.parseLong((String) this.h);
                }
                if (!DinamicXEngine.j()) {
                    return 0L;
                }
                throw new IllegalStateException("can't conver to int:" + this);
            }
        }
        return this.f;
    }

    public static gfx a(double d2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("20f2b897", new Object[]{new Double(d2)}) : new gfx((byte) 3, 0L, d2, null);
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.e == 3;
    }

    public double A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a97c36", new Object[]{this})).doubleValue();
        }
        if (this.e == 3) {
            return this.g;
        }
        throw new IllegalStateException("getDouble from: " + this);
    }

    public double B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b793b7", new Object[]{this})).doubleValue();
        }
        byte b2 = this.e;
        if (b2 == 0 || b2 == 1) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        if (b2 == 2) {
            return this.f;
        }
        if (b2 == 3) {
            return this.g;
        }
        if (b2 == 5) {
            return Double.parseDouble((String) this.h);
        }
        if (!DinamicXEngine.j()) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        throw new IllegalStateException("can't conver to double:" + this);
    }

    public static gfx a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("9859ad5", new Object[]{new Float(f)}) : new gfx((byte) 3, 0L, f, null);
    }

    public float C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c5ab3a", new Object[]{this})).floatValue();
        }
        byte b2 = this.e;
        if (b2 == 0) {
            return Float.NaN;
        }
        if (b2 == 5) {
            return Float.parseFloat((String) this.h);
        }
        if (b2 == 2) {
            return (float) this.f;
        }
        if (b2 == 3) {
            return (float) this.g;
        }
        throw new IllegalStateException("can't conver to float:" + this);
    }

    public static gfx a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfx) ipChange.ipc$dispatch("1f427141", new Object[]{new Boolean(z)}) : z ? c : d;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : this.e == 4;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue();
        }
        if (this.e == 4) {
            return this.f != 0;
        }
        throw new IllegalStateException("can't getBool :" + this);
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
        }
        byte b2 = this.e;
        if (b2 != 0 && b2 != 1) {
            if (b2 != 2) {
                if (b2 == 3) {
                    return this.g != mto.a.GEO_NOT_SUPPORT;
                } else if (b2 != 4) {
                    if (b2 == 5) {
                        return Boolean.parseBoolean((String) this.h);
                    }
                    throw new IllegalStateException("can't conver to boolean:" + this);
                }
            }
            if (this.f != 0) {
                return true;
            }
        }
        return false;
    }

    public Map G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bcc6bb03", new Object[]{this});
        }
        Object obj = this.h;
        if (!(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }

    public List H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c3a81998", new Object[]{this});
        }
        Object obj = this.h;
        if (!(obj instanceof List)) {
            return null;
        }
        return (List) obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue();
        }
        switch (this.e) {
            case 0:
            case 1:
                break;
            case 2:
            case 4:
                if (this.f != 0) {
                    return true;
                }
                break;
            case 3:
                return this.g != mto.a.GEO_NOT_SUPPORT;
            case 5:
                return ((String) this.h).length() != 0 && !((String) this.h).equalsIgnoreCase("false");
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

    public Object J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a7304381", new Object[]{this});
        }
        switch (d()) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
            case 1:
                return null;
            case 2:
                return Integer.valueOf(w());
            case 3:
                return Double.valueOf(A());
            case 4:
                return Boolean.valueOf(E());
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

    public Object K() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2db5fe20", new Object[]{this});
        }
        if (k() || n() || p() || l() || t()) {
            return this.h;
        }
        if (v()) {
            return Long.valueOf(this.f);
        }
        if (D()) {
            if (this.f == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (z()) {
            return Double.valueOf(this.g);
        } else {
            if (h() || !DinamicXEngine.j()) {
                return null;
            }
            throw new IllegalArgumentException("Invalid type");
        }
    }

    public static Object a(gfx gfxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("14c1cc53", new Object[]{gfxVar});
        }
        switch (gfxVar.d()) {
            case -1:
                throw new IllegalArgumentException("Invalid type");
            case 0:
            case 1:
                return null;
            case 2:
                return Integer.valueOf(gfxVar.w());
            case 3:
                return Double.valueOf(gfxVar.A());
            case 4:
                return Boolean.valueOf(gfxVar.E());
            case 5:
                return gfxVar.i();
            case 6:
                return gfxVar.o();
            case 7:
                return gfxVar.r();
            case 8:
                return gfxVar.s();
            case 9:
                return gfxVar.u();
            case 10:
                return gfxVar.j();
            default:
                return null;
        }
    }

    public static gfx b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("1767fb08", new Object[]{obj});
        }
        if (obj == null) {
            return e();
        }
        if (obj instanceof JSONObject) {
            return a((Map<String, Object>) ((JSONObject) obj));
        }
        if (obj instanceof JSONArray) {
            return a((List<Object>) ((JSONArray) obj));
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
            return new gfx((byte) 10, 0L, mto.a.GEO_NOT_SUPPORT, obj);
        }
        if (DinamicXEngine.j()) {
            throw new IllegalArgumentException("Unsupport value from JSON: " + obj.getClass());
        }
        return e();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        switch (this.e) {
            case -1:
            case 0:
            case 1:
                if (!DinamicXEngine.j()) {
                    return "";
                }
                throw new IllegalArgumentException("cann't convert type " + ((int) this.e) + " toString");
            case 2:
                return String.valueOf(this.f);
            case 3:
                return String.valueOf(this.g);
            case 4:
                if (this.f != 0) {
                    z = true;
                }
                return String.valueOf(z);
            case 5:
                Object obj = this.h;
                return obj instanceof String ? obj.toString() : "";
            case 6:
                return c(this.h);
            case 7:
            case 8:
                return this.h.toString();
            case 9:
                return "function " + ((ghe) this.h).getDxFunctionName() + "() { [native code] }";
            case 10:
                StringBuilder sb = new StringBuilder();
                sb.append("[java Object]");
                Object obj2 = this.h;
                sb.append(obj2 != null ? obj2.getClass().getSimpleName() : "null");
                return sb.toString();
            default:
                throw new IllegalArgumentException("Invalid type" + ((int) this.e));
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

    public boolean b(gfx gfxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8b00744", new Object[]{this, gfxVar})).booleanValue() : this.h == gfxVar.h;
    }
}
