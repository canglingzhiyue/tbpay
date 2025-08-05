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
public final class cs extends em {

    /* renamed from: a  reason: collision with root package name */
    static final cs f2974a;
    static final long b;

    static {
        kge.a(1987777020);
        f2974a = new cs();
        b = com.alibaba.fastjson2.util.c.b("[Double");
    }

    cs() {
        super(Double[].class);
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
        Double[] dArr = new Double[16];
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.b()) {
                throw new JSONException(jSONReader.d("input end"));
            }
            int i2 = i + 1;
            if (i2 - dArr.length > 0) {
                int length = dArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                dArr = (Double[]) Arrays.copyOf(dArr, i3);
            }
            dArr[i] = jSONReader.ad();
            i = i2;
        }
        jSONReader.s();
        return Arrays.copyOf(dArr, i);
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
        Double[] dArr = new Double[t];
        for (int i = 0; i < t; i++) {
            dArr[i] = jSONReader.ad();
        }
        return dArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        Double d;
        Double[] dArr = new Double[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                d = null;
            } else if (obj instanceof Number) {
                d = Double.valueOf(((Number) obj).doubleValue());
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Double.class);
                if (a2 == null) {
                    throw new JSONException("can not cast to Double " + obj.getClass());
                }
                d = (Double) a2.apply(obj);
            }
            dArr[i] = d;
            i++;
        }
        return dArr;
    }
}
