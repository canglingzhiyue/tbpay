package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
final class z<T> extends aa<T> {
    final com.alibaba.fastjson2.function.a<T, Date> v;

    static {
        kge.a(-662244063);
    }

    public z(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Field field, Method method, com.alibaba.fastjson2.function.a<T, Date> aVar) {
        super(str, type, cls, i, j, str2, locale, obj, method, field, cq.a(str2, locale));
        this.v = aVar;
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        a((z<T>) t, new Date(j));
    }

    @Override // com.alibaba.fastjson2.reader.aa
    protected void a(T t, Date date) {
        com.alibaba.fastjson2.function.a<T, Date> aVar = this.v;
        if (aVar != null) {
            aVar.accept(t, date);
        } else if (t == null) {
            throw new JSONException("set " + this.b + " error, object is null");
        } else if (this.g != null) {
            try {
                this.g.invoke(t, date);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        } else if (this.i != -1) {
            com.alibaba.fastjson2.util.e.UNSAFE.putObject(t, this.i, date);
        } else {
            try {
                this.h.set(t, date);
            } catch (Exception e2) {
                throw new JSONException("set " + this.b + " error", e2);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        a((z<T>) t, (Date) this.w.a(jSONReader, this.d, this.b, this.e));
    }

    @Override // com.alibaba.fastjson2.reader.aa
    protected void b(T t) {
        a((z<T>) t, (Date) null);
    }
}
