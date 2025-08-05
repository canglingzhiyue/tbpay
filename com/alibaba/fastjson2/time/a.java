package com.alibaba.fastjson2.time;

import java.sql.Timestamp;
import java.util.Date;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final a f3019a;
    public final long b;
    public final int c;

    static {
        kge.a(1645896161);
        f3019a = new a(0L, 0);
    }

    private a(long j, int i) {
        this.b = j;
        this.c = i;
    }

    public static a a(long j) {
        return a(com.alibaba.fastjson2.util.d.a(j, 1000L), ((int) com.alibaba.fastjson2.util.d.b(j, 1000L)) * 1000000);
    }

    private static a a(long j, int i) {
        if ((i | j) == 0) {
            return f3019a;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new a(j, i);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    public static a a(long j, long j2) {
        return a(com.alibaba.fastjson2.util.d.c(j, com.alibaba.fastjson2.util.d.a(j2, 1000000000L)), (int) com.alibaba.fastjson2.util.d.b(j2, 1000000000L));
    }

    public static a a(Timestamp timestamp) {
        return a(timestamp.getTime() / 1000, timestamp.getNanos());
    }

    public static a a(Date date) {
        return a(date.getTime());
    }

    public long a() {
        long d;
        int i;
        long j = this.b;
        if (j >= 0 || this.c <= 0) {
            d = com.alibaba.fastjson2.util.d.d(this.b, 1000L);
            i = this.c / 1000000;
        } else {
            d = com.alibaba.fastjson2.util.d.d(j + 1, 1000L);
            i = (this.c / 1000000) - 1000;
        }
        return com.alibaba.fastjson2.util.d.c(d, i);
    }

    public Date b() {
        return new Date(a());
    }

    public String toString() {
        return "Instant(" + this.b + ", " + this.c + riy.BRACKET_END_STR;
    }
}
