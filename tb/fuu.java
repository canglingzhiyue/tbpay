package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;

/* loaded from: classes.dex */
public class fuu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ADD = 1;
    public static final int TYPE_DIV = 4;
    public static final int TYPE_MOD = 5;
    public static final int TYPE_MUL = 3;
    public static final int TYPE_SUB = 2;

    /* renamed from: a  reason: collision with root package name */
    public static long f28134a;

    static {
        kge.a(-1323599369);
        f28134a = 0L;
    }

    public static Object a(Object[] objArr, int i) {
        double doubleValue;
        long longValue;
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d9b56018", new Object[]{objArr, new Integer(i)});
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    int length = objArr.length;
                    long j = 0;
                    boolean z = false;
                    double d2 = mto.a.GEO_NOT_SUPPORT;
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = objArr[i2];
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (!z && !fqr.b(str)) {
                                longValue = fqr.d(str);
                                d = mto.a.GEO_NOT_SUPPORT;
                            }
                            doubleValue = fqr.c(str);
                            d = doubleValue;
                            longValue = 0;
                            z = true;
                        } else {
                            if (!z && !fqr.b(obj)) {
                                if (!(obj instanceof Integer) && !(obj instanceof Long)) {
                                    longValue = f28134a;
                                    d = mto.a.GEO_NOT_SUPPORT;
                                }
                                longValue = ((Number) obj).longValue();
                                d = mto.a.GEO_NOT_SUPPORT;
                            }
                            doubleValue = ((Number) obj).doubleValue();
                            d = doubleValue;
                            longValue = 0;
                            z = true;
                        }
                        if (z) {
                            if (j != 0) {
                                d2 = j;
                                j = 0;
                            }
                            if (i2 == 0) {
                                d2 = d;
                            } else if (i == 1) {
                                d2 += d;
                            } else if (i == 2) {
                                d2 -= d;
                            } else if (i == 3) {
                                d2 *= d;
                            } else if (i != 4) {
                                if (i == 5) {
                                    if (d == mto.a.GEO_NOT_SUPPORT) {
                                        return Long.valueOf(f28134a);
                                    }
                                    d2 %= d;
                                }
                            } else if (d == mto.a.GEO_NOT_SUPPORT) {
                                return Long.valueOf(f28134a);
                            } else {
                                d2 /= d;
                            }
                        } else if (i2 == 0) {
                            j = longValue;
                        } else if (i == 1) {
                            j += longValue;
                        } else if (i == 2) {
                            j -= longValue;
                        } else if (i == 3) {
                            j *= longValue;
                        } else if (i != 4) {
                            if (i == 5) {
                                if (longValue == 0) {
                                    return Long.valueOf(f28134a);
                                }
                                j %= longValue;
                            }
                        } else if (longValue == 0) {
                            return Long.valueOf(f28134a);
                        } else {
                            j /= longValue;
                        }
                        if (z && (d2 == Double.POSITIVE_INFINITY || d2 == Double.NEGATIVE_INFINITY || Double.NaN == d2)) {
                            return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
                        }
                    }
                    return z ? Double.valueOf(d2) : Long.valueOf(j);
                }
            } catch (Throwable unused) {
                return Long.valueOf(f28134a);
            }
        }
        return Long.valueOf(f28134a);
    }
}
