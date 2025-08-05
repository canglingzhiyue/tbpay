package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.writer.bg;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
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
public final class cj extends aaj implements bg {
    static final cj l;

    static {
        kge.a(1486220490);
        kge.a(-1047766740);
        l = new cj(null, null);
    }

    public cj(String str, Locale locale) {
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
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        JSONWriter.a aVar = jSONWriter.b;
        Calendar calendar = (Calendar) obj;
        long timeInMillis = calendar.getTimeInMillis();
        if (this.b || (this.f25183a == null && aVar.e())) {
            jSONWriter.e(timeInMillis / 1000);
        } else if (this.f25183a == null && aVar.d()) {
            jSONWriter.e(timeInMillis);
        } else {
            com.alibaba.fastjson2.time.f a2 = com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(timeInMillis), aVar.b());
            int i = a2.b;
            int i2 = a2.f3024a.f3021a.f3020a;
            if (i2 >= 0 && i2 <= 9999) {
                if (this.f25183a == null && aVar.f()) {
                    jSONWriter.a(i2, a2.f3024a.f3021a.b, a2.f3024a.f3021a.c, a2.f3024a.b.f3022a, a2.f3024a.b.b, a2.f3024a.b.c, a2.f3024a.b.d / 1000000, i, true);
                    return;
                }
                if ((this.f25183a == null ? aVar.c() : this.f25183a) == null) {
                    short s = a2.f3024a.f3021a.b;
                    short s2 = a2.f3024a.f3021a.c;
                    byte b = a2.f3024a.b.f3022a;
                    byte b2 = a2.f3024a.b.b;
                    byte b3 = a2.f3024a.b.c;
                    int i3 = a2.f3024a.b.d;
                    if (i3 == 0) {
                        jSONWriter.b(i2, s, s2, b, b2, b3);
                        return;
                    } else {
                        jSONWriter.a(i2, s, s2, b, b2, b3, i3 / 1000000, i, false);
                        return;
                    }
                }
            }
            String str = this.f25183a;
            if (str == null) {
                str = jSONWriter.b.c();
            }
            jSONWriter.d(new SimpleDateFormat(str).format(calendar.getTime()));
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
            jSONWriter.f(((Calendar) obj).getTimeInMillis());
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
