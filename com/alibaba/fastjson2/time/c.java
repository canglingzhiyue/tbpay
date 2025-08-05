package com.alibaba.fastjson2.time;

import com.alibaba.fastjson2.util.DateUtils;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import tb.kge;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f3021a;
    public final d b;

    static {
        kge.a(930485286);
    }

    private c(b bVar, d dVar) {
        this.f3021a = bVar;
        this.b = dVar;
    }

    public static int a(long j) {
        if (j < -999999999 || j > 999999999) {
            throw new DateTimeException("Invalid value for year (valid values [-999_999_999, 999_999_999]): " + j);
        }
        return (int) j;
    }

    public static c a(int i, int i2, int i3, int i4, int i5, int i6) {
        return new c(b.a(i, i2, i3), d.a(i4, i5, i6));
    }

    public static c a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new c(b.a(i, i2, i3), d.a(i4, i5, i6, i7));
    }

    public static c a(long j, int i, int i2) {
        long j2;
        long j3 = i;
        c(j3);
        return new c(b.a(com.alibaba.fastjson2.util.d.a(j + i2, 86400L)), d.a((((int) com.alibaba.fastjson2.util.d.b(j2, 86400L)) * 1000000000) + j3));
    }

    public static c a(a aVar, e eVar) {
        if (aVar != null) {
            if (eVar == null) {
                throw new NullPointerException("zone");
            }
            return a(aVar.b, aVar.c, eVar.a(aVar));
        }
        throw new NullPointerException(Baggage.Amnet.SECURITY_INSTANT);
    }

    public static c a(b bVar, d dVar) {
        if (bVar != null) {
            if (dVar == null) {
                throw new NullPointerException("time");
            }
            return new c(bVar, dVar);
        }
        throw new NullPointerException("date");
    }

    public static void b(long j) {
        if (j < 0 || j > 86399999999999L) {
            throw new DateTimeException("Invalid value for year (valid values [0, 86399999999999]): " + j);
        }
    }

    public static void c(long j) {
        if (j < 0 || j > 999999999) {
            throw new DateTimeException("Invalid value for year (valid values [0, 999_999_999]): " + j);
        }
    }

    public a a(e eVar) {
        Calendar calendar = Calendar.getInstance(eVar.d);
        calendar.set(this.f3021a.f3020a, this.f3021a.b - 1, this.f3021a.c, this.b.f3022a, this.b.b, this.b.c);
        return a.a(calendar.getTime().getTime() / 1000, this.b.d);
    }

    public Timestamp a() {
        return new Timestamp(this.f3021a.f3020a - 1900, this.f3021a.b - 1, this.f3021a.c, this.b.f3022a, this.b.b, this.b.c, this.b.d);
    }

    public boolean equals(Object obj) {
        d dVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        b bVar = this.f3021a;
        b bVar2 = cVar.f3021a;
        return bVar == bVar2 || (bVar != null && bVar.equals(bVar2) && this.b == cVar.b) || ((dVar = this.b) != null && dVar.equals(cVar.b));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3021a, this.b});
    }

    public String toString() {
        return DateUtils.a(this, "yyyy-MM-dd HH:mm:ss");
    }
}
