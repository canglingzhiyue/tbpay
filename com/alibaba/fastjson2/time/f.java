package com.alibaba.fastjson2.time;

import com.alibaba.fastjson2.util.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import tb.kge;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f3024a;
    public final int b;
    public final e c;

    static {
        kge.a(-680105485);
    }

    private f(c cVar, int i, e eVar) {
        this.f3024a = cVar;
        this.b = i;
        this.c = eVar;
    }

    private static f a(long j, int i, e eVar) {
        int a2 = eVar.a(a.a(j, i));
        return new f(c.a(j, i, a2), a2, eVar);
    }

    public static f a(a aVar, e eVar) {
        return a(aVar.b, aVar.c, eVar);
    }

    public static f a(b bVar, d dVar, e eVar) {
        return b(c.a(bVar, dVar), eVar);
    }

    public static f a(c cVar, e eVar) {
        return b(cVar, eVar);
    }

    public static f b(c cVar, e eVar) {
        return new f(cVar, eVar.a(cVar.a(eVar)), eVar);
    }

    public a a() {
        return a.a(c() / 1000, this.f3024a.b.d);
    }

    public long b() {
        return c() / 1000;
    }

    public long c() {
        b bVar = this.f3024a.f3021a;
        d dVar = this.f3024a.b;
        if (this.c == e.SHANGHAI_ZONE_ID || this.c.e.equals(e.SHANGHAI_ZONE_ID_NAME)) {
            long a2 = DateUtils.a(bVar.f3020a, bVar.b, bVar.c, dVar.f3022a, dVar.b, dVar.c);
            return ((a2 - (a2 >= 684900000 ? 28800 : DateUtils.a(a2))) * 1000) + (dVar.d / 1000000);
        }
        Calendar calendar = Calendar.getInstance(this.c.d);
        calendar.set(bVar.f3020a, bVar.b - 1, bVar.c, dVar.f3022a, dVar.b, dVar.c);
        calendar.set(14, dVar.d / 1000000);
        return calendar.getTimeInMillis();
    }

    public boolean equals(Object obj) {
        e eVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        c cVar = this.f3024a;
        c cVar2 = fVar.f3024a;
        return cVar == cVar2 || (cVar != null && cVar.equals(cVar2) && this.b == fVar.b && this.c == fVar.c) || ((eVar = this.c) != null && eVar.equals(fVar.c));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3024a, Integer.valueOf(this.b), this.c});
    }
}
