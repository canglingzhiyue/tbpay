package com.alibaba.fastjson2.time;

import java.util.Arrays;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f3020a;
    public final short b;
    public final short c;

    static {
        kge.a(-76557895);
    }

    private b(int i, int i2, int i3) {
        this.f3020a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static b a(int i, int i2, int i3) {
        if (i2 <= 0 || i2 > 12) {
            throw new DateTimeException("Invalid value for month (valid values [1,12]): " + i2);
        } else if (i3 > 0 && i3 <= 31) {
            return b(i, i2, i3);
        } else {
            throw new DateTimeException("Invalid value for month (valid values [1,31]): " + i3);
        }
    }

    public static b a(long j) {
        long j2;
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new b(c.a(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static boolean a(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    private static b b(int i, int i2, int i3) {
        if (i3 > 28) {
            int i4 = 31;
            if (i2 == 2) {
                i4 = a(i) ? 29 : 28;
            } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date month-" + i3 + "'");
            }
        }
        return new b(i, i2, i3);
    }

    public c a() {
        return c.a(this, d.MIN);
    }

    public f a(e eVar) {
        return f.a(c.a(this, d.MIN), eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f3020a == bVar.f3020a && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3020a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }
}
