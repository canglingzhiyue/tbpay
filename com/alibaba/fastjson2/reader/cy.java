package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cy extends em {

    /* renamed from: a  reason: collision with root package name */
    static final cy f2980a;
    static final long b;

    static {
        kge.a(-96126487);
        f2980a = new cy();
        b = com.alibaba.fastjson2.util.c.b("[Float");
    }

    cy() {
        super(Float[].class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.aF()) {
            return null;
        }
        if (!jSONReader.q()) {
            if (!jSONReader.z()) {
                throw new JSONException(jSONReader.d("TODO"));
            }
            String az = jSONReader.az();
            if (az.isEmpty()) {
                return null;
            }
            throw new JSONException(jSONReader.d("not support input " + az));
        }
        Float[] fArr = new Float[16];
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.b()) {
                throw new JSONException(jSONReader.d("input end"));
            }
            int i2 = i + 1;
            if (i2 - fArr.length > 0) {
                int length = fArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                fArr = (Float[]) Arrays.copyOf(fArr, i3);
            }
            fArr[i] = jSONReader.ab();
            i = i2;
        }
        jSONReader.s();
        return Arrays.copyOf(fArr, i);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.a((byte) -110) && jSONReader.F() != b) {
            throw new JSONException("not support autoType : " + jSONReader.aG());
        }
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        Float[] fArr = new Float[t];
        for (int i = 0; i < t; i++) {
            fArr[i] = jSONReader.ab();
        }
        return fArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        Float f;
        Float[] fArr = new Float[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                f = null;
            } else if (obj instanceof Number) {
                f = Float.valueOf(((Number) obj).floatValue());
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Float.class);
                if (a2 == null) {
                    throw new JSONException("can not cast to Float " + obj.getClass());
                }
                f = (Float) a2.apply(obj);
            }
            fArr[i] = f;
            i++;
        }
        return fArr;
    }
}
