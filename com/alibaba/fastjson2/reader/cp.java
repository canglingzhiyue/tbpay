package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Currency;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cp extends em {

    /* renamed from: a  reason: collision with root package name */
    static final cp f2972a;
    static final long b;

    static {
        kge.a(585327517);
        f2972a = new cp();
        b = com.alibaba.fastjson2.util.c.b("Currency");
    }

    cp() {
        super(Currency.class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        String az;
        if (jSONReader.x()) {
            JSONObject jSONObject = new JSONObject();
            jSONReader.a(jSONObject, new JSONReader.Feature[0]);
            az = jSONObject.getString("currency");
            if (az == null) {
                az = jSONObject.getString("currencyCode");
            }
        } else {
            az = jSONReader.az();
        }
        if (az == null || az.isEmpty()) {
            return null;
        }
        return Currency.getInstance(az);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.c() == -110) {
            jSONReader.D();
            long F = jSONReader.F();
            if (F != b && F != -7860540621745740270L) {
                throw new JSONException(jSONReader.d("currency not support input autoTypeClass " + jSONReader.aG()));
            }
        }
        String az = jSONReader.az();
        if (az == null || az.isEmpty()) {
            return null;
        }
        return Currency.getInstance(az);
    }
}
