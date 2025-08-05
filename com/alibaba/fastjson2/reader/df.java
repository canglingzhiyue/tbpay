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
public class df extends em {

    /* renamed from: a  reason: collision with root package name */
    static final df f2988a;
    static final long b;

    static {
        kge.a(-1307002639);
        f2988a = new df();
        b = com.alibaba.fastjson2.util.c.b("[Short");
    }

    df() {
        super(Short[].class);
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
        Short[] shArr = new Short[16];
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.b()) {
                throw new JSONException(jSONReader.d("input end"));
            }
            int i2 = i + 1;
            if (i2 - shArr.length > 0) {
                int length = shArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                shArr = (Short[]) Arrays.copyOf(shArr, i3);
            }
            Integer T = jSONReader.T();
            shArr[i] = Short.valueOf(T == null ? (short) 0 : T.shortValue());
            i = i2;
        }
        jSONReader.s();
        return Arrays.copyOf(shArr, i);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.a((byte) -110)) {
            long F = jSONReader.F();
            if (F != b && F != dg.b) {
                throw new JSONException(jSONReader.d("not support type " + jSONReader.aG()));
            }
        }
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        Short[] shArr = new Short[t];
        for (int i = 0; i < t; i++) {
            Integer T = jSONReader.T();
            shArr[i] = T == null ? null : Short.valueOf(T.shortValue());
        }
        return shArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        Short sh;
        Short[] shArr = new Short[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                sh = null;
            } else if (obj instanceof Number) {
                sh = Short.valueOf(((Number) obj).shortValue());
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Short.class);
                if (a2 == null) {
                    throw new JSONException("can not cast to Short " + obj.getClass());
                }
                sh = (Short) a2.apply(obj);
            }
            shArr[i] = sh;
            i++;
        }
        return shArr;
    }
}
