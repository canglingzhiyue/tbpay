package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.util.DateUtils;
import com.taobao.tao.shop.common.ShopConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.kge;

/* loaded from: classes2.dex */
abstract class FieldWriterDate<T> extends FieldWriter<T> {
    static AtomicReferenceFieldUpdater<FieldWriterDate, byte[]> A;
    static AtomicReferenceFieldUpdater<FieldWriterDate, char[]> B;
    protected DateTimeFormatter C;
    final boolean D;
    final boolean E;
    final boolean F;
    final boolean G;
    final boolean H;
    final boolean I;
    protected bg J;
    volatile char[] cacheFormat19UTF16;
    volatile byte[] cacheFormat19UTF8;

    static {
        kge.a(250795137);
        A = AtomicReferenceFieldUpdater.newUpdater(FieldWriterDate.class, byte[].class, "cacheFormat19UTF8");
        B = AtomicReferenceFieldUpdater.newUpdater(FieldWriterDate.class, char[].class, "cacheFormat19UTF16");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FieldWriterDate(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        boolean z6 = true;
        if (str2 != null) {
            char c = 65535;
            switch (str2.hashCode()) {
                case -1074095546:
                    if (str2.equals("millis")) {
                        c = 0;
                        break;
                    }
                    break;
                case -288020395:
                    if (str2.equals("unixtime")) {
                        c = 2;
                        break;
                    }
                    break;
                case -276306848:
                    if (str2.equals("yyyyMMdd")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1333195168:
                    if (str2.equals("yyyy-MM-dd HH:mm:ss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1349114208:
                    if (str2.equals("yyyyMMddHHmmss")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2095190916:
                    if (str2.equals("iso8601")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        z6 = false;
                        z = true;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        this.D = z5;
                        this.E = z6;
                        this.I = z;
                        this.F = z2;
                        this.G = z3;
                        this.H = z4;
                    } else if (c == 3) {
                        z6 = false;
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        this.D = z5;
                        this.E = z6;
                        this.I = z;
                        this.F = z2;
                        this.G = z3;
                        this.H = z4;
                    } else if (c == 4) {
                        z6 = false;
                        z = false;
                        z2 = true;
                        z3 = false;
                        z4 = false;
                        this.D = z5;
                        this.E = z6;
                        this.I = z;
                        this.F = z2;
                        this.G = z3;
                        this.H = z4;
                    } else if (c == 5) {
                        z6 = false;
                        z = false;
                        z2 = false;
                        z3 = true;
                        z4 = false;
                        this.D = z5;
                        this.E = z6;
                        this.I = z;
                        this.F = z2;
                        this.G = z3;
                        this.H = z4;
                    }
                }
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                this.D = z5;
                this.E = z6;
                this.I = z;
                this.F = z2;
                this.G = z3;
                this.H = z4;
            }
            z5 = true;
        }
        z6 = false;
        z = false;
        z2 = false;
        z3 = false;
        z4 = false;
        this.D = z5;
        this.E = z6;
        this.I = z;
        this.F = z2;
        this.G = z3;
        this.H = z4;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Class cls) {
        if (cls == this.c) {
            du duVar = jSONWriter.b.f2940a;
            if (this.J == null) {
                if ((duVar.g & 16) == 0) {
                    cp cpVar = this.f == null ? cp.l : new cp(this.f, null);
                    this.J = cpVar;
                    return cpVar;
                }
                this.J = duVar.b(cls, cls, false);
            }
            return this.J;
        }
        return jSONWriter.a(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean a() {
        return this.D;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void b(JSONWriter jSONWriter, long j) {
        long a2;
        long j2;
        int i;
        int i2;
        if (jSONWriter.e) {
            a(jSONWriter);
            jSONWriter.f(j);
            return;
        }
        JSONWriter.a aVar = jSONWriter.b;
        if (this.I || (this.f == null && aVar.e())) {
            a(jSONWriter);
            jSONWriter.e(j / 1000);
        } else if (this.D || (this.f == null && aVar.d())) {
            a(jSONWriter);
            jSONWriter.e(j);
        } else {
            com.alibaba.fastjson2.time.e b = aVar.b();
            String c = this.f != null ? this.f : aVar.c();
            boolean z = this.H || (aVar.g() && this.f == null);
            if (c == null || this.G || z) {
                long a3 = com.alibaba.fastjson2.util.d.a(j, 1000L) + (com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID.equals(b) ? DateUtils.a(a2) : b.a(com.alibaba.fastjson2.time.a.a(j)));
                long a4 = com.alibaba.fastjson2.util.d.a(a3, 86400L);
                int b2 = (int) com.alibaba.fastjson2.util.d.b(a3, 86400L);
                long j3 = (a4 + 719528) - 60;
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
                int i3 = (int) j6;
                int i4 = ((i3 * 5) + 2) / 153;
                int i5 = ((i4 + 2) % 12) + 1;
                int i6 = 1 + (i3 - (((i4 * 306) + 5) / 10));
                int a5 = com.alibaba.fastjson2.time.c.a(j5 + j2 + (i4 / 10));
                long j7 = b2;
                if (j7 < 0 || j7 > 86399) {
                    throw new DateTimeException("Invalid secondOfDay " + j7);
                }
                int i7 = (int) (j7 / 3600);
                long j8 = j7 - (i7 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
                int i8 = (int) (j8 / 60);
                int i9 = (int) (j8 - (i8 * 60));
                if (a5 >= 0 && a5 <= 9999) {
                    if (this.G) {
                        a(jSONWriter);
                        jSONWriter.a(a5, i5, i6, i7, i8, i9);
                        return;
                    } else if (z) {
                        a(jSONWriter);
                        jSONWriter.b(a5, i5, i6, i7, i8, i9);
                        return;
                    } else {
                        int b3 = (int) com.alibaba.fastjson2.util.d.b(j, 1000L);
                        if (b3 == 0) {
                            a(jSONWriter);
                            jSONWriter.b(a5, i5, i6, i7, i8, i9);
                            return;
                        }
                        int a6 = aVar.b().a(com.alibaba.fastjson2.time.a.a(j));
                        a(jSONWriter);
                        jSONWriter.a(a5, i5, i6, i7, i8, i9, b3, a6, false);
                        return;
                    }
                }
            }
            a(jSONWriter);
            com.alibaba.fastjson2.time.f a7 = com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(j), b);
            if ((this.E || (aVar.f() && this.f == null)) && (i = a7.f3024a.f3021a.f3020a) >= 0 && i <= 9999) {
                jSONWriter.a(i, a7.f3024a.f3021a.b, a7.f3024a.f3021a.c, a7.f3024a.b.f3022a, a7.f3024a.b.b, a7.f3024a.b.c, a7.f3024a.b.d / 1000000, a7.b, true);
            } else if (this.F && (i2 = a7.f3024a.f3021a.f3020a) >= 0 && i2 <= 9999) {
                jSONWriter.a(i2, a7.f3024a.f3021a.b, a7.f3024a.f3021a.c);
            } else {
                DateTimeFormatter e = e();
                if (e == null) {
                    e = aVar.h();
                }
                Date date = new Date(j);
                jSONWriter.d(e != null ? e.a(date) : DateUtils.a(date, jSONWriter.b.b()));
            }
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b() {
        return this.E;
    }

    public DateTimeFormatter e() {
        if (this.C == null && this.f != null && !this.D && !this.E && !this.I) {
            this.C = DateTimeFormatter.e(this.f);
        }
        return this.C;
    }
}
