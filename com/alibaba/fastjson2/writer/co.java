package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Currency;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class co extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final co f3069a;
    static final co b;
    static final byte[] c;
    static final long d;
    final Class e;

    static {
        kge.a(-2055020131);
        f3069a = new co(null);
        b = new co(null);
        c = b.CC.a(TypeUtils.a(Currency.class));
        d = com.alibaba.fastjson2.util.c.b(TypeUtils.a(Currency.class));
    }

    co(Class cls) {
        this.e = cls;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.e) {
            b(jSONWriter, obj, obj2, type, j);
        } else if (obj == null) {
            jSONWriter.n();
        } else {
            jSONWriter.d(((Currency) obj).getCurrencyCode());
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        Currency currency = (Currency) obj;
        if (jSONWriter.d(currency) && this.e == null) {
            jSONWriter.b(c, d);
        }
        jSONWriter.d(currency.getCurrencyCode());
    }
}
