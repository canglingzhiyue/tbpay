package com.taobao.android.gateway.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigDecimal;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(158848808);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str != null && !str.equals("false") && !str.equalsIgnoreCase("0") && !str.isEmpty();
    }

    public static int a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251237", new Object[]{obj})).intValue();
        }
        if (obj != null) {
            if (obj instanceof String) {
                if (!"".equals(obj)) {
                    return Integer.parseInt((String) obj);
                }
                return 0;
            } else if (obj instanceof Character) {
                return ((Character) obj).charValue();
            } else {
                if (obj instanceof Boolean) {
                    throw new IllegalArgumentException("Boolean->Integer coercion exception");
                }
                if (obj instanceof Number) {
                    return ((Number) obj).intValue();
                }
            }
        }
        return 0;
    }

    public static long b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f056ab79", new Object[]{obj})).longValue();
        }
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof String) {
            if (!"".equals(obj)) {
                return Long.parseLong((String) obj);
            }
            return 0L;
        } else if (obj instanceof Character) {
            return ((Character) obj).charValue();
        } else {
            if (!(obj instanceof Boolean) && (obj instanceof Number)) {
                return ((Number) obj).longValue();
            }
            return 0L;
        }
    }

    public static BigDecimal c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("adaaa094", new Object[]{obj});
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("BigDecimal coercion exception. arg is null");
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if ("".equals(str.trim())) {
                return BigDecimal.valueOf(0L);
            }
            return new BigDecimal(str);
        } else if (obj instanceof Number) {
            return new BigDecimal(obj.toString());
        } else {
            if (!(obj instanceof Character)) {
                return null;
            }
            return new BigDecimal((int) ((Character) obj).charValue());
        }
    }

    public static double d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84b9ddf5", new Object[]{obj})).doubleValue();
        }
        if (obj != null) {
            if (obj instanceof String) {
                String str = (String) obj;
                return "".equals(str.trim()) ? mto.a.GEO_NOT_SUPPORT : Double.parseDouble(str);
            } else if (obj instanceof Character) {
                return ((Character) obj).charValue();
            } else {
                if (obj instanceof Number) {
                    return d(obj);
                }
                if (obj instanceof Boolean) {
                    throw new IllegalArgumentException("Boolean->Double coercion exception");
                }
            }
        }
        return mto.a.GEO_NOT_SUPPORT;
    }

    public static boolean e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceeb774c", new Object[]{obj})).booleanValue();
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        return (str.indexOf(46) == -1 && str.indexOf(101) == -1 && str.indexOf(69) == -1) ? false : true;
    }
}
