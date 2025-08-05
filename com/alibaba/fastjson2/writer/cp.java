package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.writer.bg;
import com.taobao.tao.shop.common.ShopConstants;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import tb.aaj;
import tb.cqa;
import tb.dqj;
import tb.dqo;
import tb.dqs;
import tb.dqv;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cp extends aaj implements bg {
    static final cp l;
    static final char[] m;
    static final byte[] n;
    static final char[] o;
    static final byte[] p;

    static {
        kge.a(-1504409798);
        kge.a(-1047766740);
        l = new cp(null, null);
        m = "new Date(".toCharArray();
        n = "new Date(".getBytes(StandardCharsets.UTF_8);
        o = "{\"@type\":\"java.sql.Date\",\"val\":".toCharArray();
        p = "{\"@type\":\"java.sql.Date\",\"val\":".getBytes(StandardCharsets.UTF_8);
    }

    public cp(String str, Locale locale) {
        super(str, locale);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ FieldWriter a(long j) {
        return bg.CC.$default$a(this, j);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(JSONWriter jSONWriter, Object obj) {
        a(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String str;
        JSONWriter.a aVar;
        long a2;
        long j2;
        byte[] bArr;
        char[] cArr;
        JSONWriter jSONWriter2 = jSONWriter;
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        JSONWriter.a aVar2 = jSONWriter2.b;
        Date date = (Date) obj;
        long time = date.getTime();
        if (jSONWriter2.a(obj, type)) {
            char c = '}';
            if (jSONWriter2.d) {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    cArr = o;
                } else {
                    cArr = m;
                    c = ')';
                }
                jSONWriter2.a(cArr, 0, cArr.length);
            } else {
                if ("java.sql.Date".equals(date.getClass().getName())) {
                    bArr = p;
                } else {
                    bArr = n;
                    c = ')';
                }
                jSONWriter2.d(bArr);
            }
            jSONWriter2.e(time);
            jSONWriter2.c(c);
        } else if (this.c || (this.f25183a == null && aVar2.d())) {
            jSONWriter2.e(time);
        } else if (this.b || (this.f25183a == null && aVar2.e())) {
            jSONWriter2.e(time / 1000);
        } else {
            com.alibaba.fastjson2.time.e b = aVar2.b();
            int a3 = com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID.equals(b) ? DateUtils.a(com.alibaba.fastjson2.util.d.a(time, 1000L)) : (b == com.alibaba.fastjson2.time.e.c || com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC.equals(b.e)) ? 0 : com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(time), b).b;
            boolean z = this.d || aVar2.f();
            if (z) {
                str = null;
            } else {
                str = this.f25183a;
                if (str == null) {
                    str = aVar2.c();
                }
            }
            if (str == null) {
                long a4 = com.alibaba.fastjson2.util.d.a(time, 1000L) + (com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID.equals(b) ? DateUtils.a(a2) : b.a(com.alibaba.fastjson2.time.a.a(time)));
                long a5 = com.alibaba.fastjson2.util.d.a(a4, 86400L);
                int b2 = (int) com.alibaba.fastjson2.util.d.b(a4, 86400L);
                long j3 = (a5 + 719528) - 60;
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
                int i3 = ((i2 + 2) % 12) + 1;
                int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
                int a6 = com.alibaba.fastjson2.time.c.a(j5 + j2 + (i2 / 10));
                long j7 = b2;
                if (j7 < 0 || j7 > 86399) {
                    throw new DateTimeException("Invalid secondOfDay " + j7);
                }
                int i5 = (int) (j7 / 3600);
                aVar = aVar2;
                int i6 = a3;
                long j8 = j7 - (i5 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
                int i7 = (int) (j8 / 60);
                int i8 = (int) (j8 - (i7 * 60));
                if (a6 >= 0 && a6 <= 9999) {
                    int b3 = (int) com.alibaba.fastjson2.util.d.b(time, 1000L);
                    if (b3 != 0 || z) {
                        jSONWriter.a(a6, i3, i4, i5, i7, i8, b3, i6, z);
                        return;
                    } else if (i5 == 0 && i7 == 0 && i8 == 0 && "java.sql.Date".equals(date.getClass().getName())) {
                        jSONWriter.b(a6, i3, i4);
                        return;
                    } else {
                        jSONWriter.b(a6, i3, i4, i5, i7, i8);
                        return;
                    }
                }
                jSONWriter2 = jSONWriter;
            } else {
                aVar = aVar2;
            }
            jSONWriter2.d((this.f25183a != null ? a() : aVar.h()).a(date));
        }
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(cqa cqaVar) {
        bg.CC.$default$a(this, cqaVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqj dqjVar) {
        bg.CC.$default$a((bg) this, dqjVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqo dqoVar) {
        bg.CC.$default$a((bg) this, dqoVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqs dqsVar) {
        bg.CC.$default$a((bg) this, dqsVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(dqv dqvVar) {
        bg.CC.$default$a((bg) this, dqvVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ boolean a(JSONWriter jSONWriter) {
        boolean a2;
        a2 = jSONWriter.a(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
        return a2;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void b(JSONWriter jSONWriter, Object obj) {
        e(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
        } else {
            jSONWriter.f(((Date) obj).getTime());
        }
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ List<FieldWriter> bn_() {
        List<FieldWriter> emptyList;
        emptyList = Collections.emptyList();
        return emptyList;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg.CC.$default$c(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void d(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg.CC.$default$d(this, jSONWriter, obj, obj2, type, j);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg.CC.$default$e(this, jSONWriter, obj, obj2, type, j);
    }
}
