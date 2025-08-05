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
public class cz extends em {

    /* renamed from: a  reason: collision with root package name */
    static final cz f2981a;
    static final long b;
    final com.alibaba.fastjson2.function.d<float[], Object> c;

    static {
        kge.a(1082696152);
        f2981a = new cz(null);
        b = com.alibaba.fastjson2.util.c.b("[F");
    }

    cz(com.alibaba.fastjson2.function.d<float[], Object> dVar) {
        super(float[].class);
        this.c = dVar;
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
        float[] fArr = new float[16];
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
                fArr = Arrays.copyOf(fArr, i3);
            }
            fArr[i] = jSONReader.aa();
            i = i2;
        }
        jSONReader.s();
        float[] copyOf = Arrays.copyOf(fArr, i);
        com.alibaba.fastjson2.function.d<float[], Object> dVar = this.c;
        return dVar != null ? dVar.apply(copyOf) : copyOf;
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
        float[] fArr = new float[t];
        for (int i = 0; i < t; i++) {
            fArr[i] = jSONReader.aa();
        }
        com.alibaba.fastjson2.function.d<float[], Object> dVar = this.c;
        return dVar != null ? dVar.apply(fArr) : fArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        float floatValue;
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                floatValue = 0.0f;
            } else if (obj instanceof Number) {
                floatValue = ((Number) obj).floatValue();
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Float.TYPE);
                if (a2 == null) {
                    throw new JSONException("can not cast to float " + obj.getClass());
                }
                floatValue = ((Float) a2.apply(obj)).floatValue();
            }
            fArr[i] = floatValue;
            i++;
        }
        com.alibaba.fastjson2.function.d<float[], Object> dVar = this.c;
        return dVar != null ? dVar.apply(fArr) : fArr;
    }
}
