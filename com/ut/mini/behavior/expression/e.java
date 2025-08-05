package com.ut.mini.behavior.expression;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import java.math.BigInteger;
import tb.apr;
import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Number f24094a;

    static {
        kge.a(-1462169239);
        f24094a = new Integer(0);
    }

    public static String a(Object obj) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            apr.a("ExpressionUtils", e, new Object[0]);
            return "";
        }
    }

    public static Number a(Object obj, Class cls) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("8017cc0f", new Object[]{obj, cls});
        }
        if (obj == null || "".equals(obj)) {
            return a(f24094a, cls);
        }
        if (obj instanceof Character) {
            return a((Number) new Short((short) ((Character) obj).charValue()), cls);
        }
        if (obj instanceof Boolean) {
            return a(f24094a, cls);
        }
        if (obj.getClass() == cls) {
            return (Number) obj;
        }
        if (obj instanceof Number) {
            return a((Number) obj, cls);
        }
        if (obj instanceof String) {
            try {
                return a((String) obj, cls);
            } catch (Exception e) {
                apr.a("ExpressionUtils", e, new Object[0]);
                return a(f24094a, cls);
            }
        }
        apr.c("ExpressionUtils", "不支持的类型，valueClass", obj.getClass().getName());
        return a((Number) 0, cls);
    }

    public static Number a(Number number, Class cls) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("973cb245", new Object[]{number, cls});
        }
        if (cls == Byte.class || cls == Byte.TYPE) {
            return Byte.valueOf(number.byteValue());
        }
        if (cls == Short.class || cls == Short.TYPE) {
            return Short.valueOf(number.shortValue());
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return Integer.valueOf(number.intValue());
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return Long.valueOf(number.longValue());
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return Float.valueOf(number.floatValue());
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return Double.valueOf(number.doubleValue());
        }
        if (cls == BigInteger.class) {
            if (number instanceof BigDecimal) {
                return ((BigDecimal) number).toBigInteger();
            }
            return BigInteger.valueOf(number.longValue());
        } else if (cls == BigDecimal.class) {
            if (number instanceof BigInteger) {
                return new BigDecimal((BigInteger) number);
            }
            return new BigDecimal(number.doubleValue());
        } else {
            return new Integer(0);
        }
    }

    public static Number a(String str, Class cls) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Number) ipChange.ipc$dispatch("d8d0a7d", new Object[]{str, cls});
        }
        if (cls == Byte.class || cls == Byte.TYPE) {
            return Byte.valueOf(str);
        }
        if (cls == Short.class || cls == Short.TYPE) {
            return Short.valueOf(str);
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return Integer.valueOf(str);
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return Long.valueOf(str);
        }
        if (cls == Float.class || cls == Float.TYPE) {
            return Float.valueOf(str);
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return Double.valueOf(str);
        }
        if (cls == BigInteger.class) {
            return new BigInteger(str);
        }
        if (cls == BigDecimal.class) {
            return new BigDecimal(str);
        }
        return new Integer(0);
    }

    public static boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{obj})).booleanValue() : obj instanceof BigInteger;
    }

    public static boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{obj})).booleanValue() : obj instanceof BigDecimal;
    }

    public static boolean d(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84b9de0b", new Object[]{obj})).booleanValue() : obj != null && a((Class) obj.getClass());
    }

    public static boolean a(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("20fa47d9", new Object[]{cls})).booleanValue() : cls == Float.class || cls == Float.TYPE || cls == Double.class || cls == Double.TYPE;
    }

    public static boolean e(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ceeb774c", new Object[]{obj})).booleanValue() : obj != null && b((Class) obj.getClass());
    }

    public static boolean b(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7800278", new Object[]{cls})).booleanValue() : cls == Byte.class || cls == Byte.TYPE || cls == Short.class || cls == Short.TYPE || cls == Character.class || cls == Character.TYPE || cls == Integer.class || cls == Integer.TYPE || cls == Long.class || cls == Long.TYPE;
    }

    public static boolean a(Object obj, Object obj2, o oVar) throws ExpressionException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d4e9306", new Object[]{obj, obj2, oVar})).booleanValue();
        }
        if (c(obj2)) {
            return oVar.a((BigDecimal) a(obj, BigDecimal.class), (BigDecimal) a(obj2, BigDecimal.class));
        }
        if (d(obj2)) {
            return oVar.a(a(obj, Double.class).doubleValue(), a(obj2, Double.class).doubleValue());
        }
        if (b(obj2)) {
            return oVar.a((BigInteger) a(obj, BigInteger.class), (BigInteger) a(obj2, BigInteger.class));
        }
        if (!e(obj2)) {
            return false;
        }
        return oVar.a(a(obj, Double.class).doubleValue(), a(obj2, Double.class).doubleValue());
    }
}
