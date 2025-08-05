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
public class dg extends em {

    /* renamed from: a  reason: collision with root package name */
    static final dg f2989a;
    static final long b;
    final com.alibaba.fastjson2.function.d<short[], Object> c;

    static {
        kge.a(968050640);
        f2989a = new dg(null);
        b = com.alibaba.fastjson2.util.c.b("[S");
    }

    dg(com.alibaba.fastjson2.function.d<short[], Object> dVar) {
        super(short[].class);
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
        short[] sArr = new short[16];
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.b()) {
                throw new JSONException(jSONReader.d("input end"));
            }
            int i2 = i + 1;
            if (i2 - sArr.length > 0) {
                int length = sArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                sArr = Arrays.copyOf(sArr, i3);
            }
            sArr[i] = (short) jSONReader.R();
            i = i2;
        }
        jSONReader.s();
        short[] copyOf = Arrays.copyOf(sArr, i);
        com.alibaba.fastjson2.function.d<short[], Object> dVar = this.c;
        return dVar != null ? dVar.apply(copyOf) : copyOf;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.a((byte) -110)) {
            long F = jSONReader.F();
            if (F != b && F != df.b) {
                throw new JSONException("not support autoType : " + jSONReader.aG());
            }
        }
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        short[] sArr = new short[t];
        for (int i = 0; i < t; i++) {
            sArr[i] = (short) jSONReader.R();
        }
        com.alibaba.fastjson2.function.d<short[], Object> dVar = this.c;
        return dVar != null ? dVar.apply(sArr) : sArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        short shortValue;
        short[] sArr = new short[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                shortValue = 0;
            } else if (obj instanceof Number) {
                shortValue = ((Number) obj).shortValue();
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Short.TYPE);
                if (a2 == null) {
                    throw new JSONException("can not cast to short " + obj.getClass());
                }
                shortValue = ((Short) a2.apply(obj)).shortValue();
            }
            sArr[i] = shortValue;
            i++;
        }
        com.alibaba.fastjson2.function.d<short[], Object> dVar = this.c;
        return dVar != null ? dVar.apply(sArr) : sArr;
    }
}
