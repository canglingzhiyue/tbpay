package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import tb.kge;
import tb.mto;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ct extends em {

    /* renamed from: a  reason: collision with root package name */
    static final ct f2975a;
    static final long b;
    final com.alibaba.fastjson2.function.d<double[], Object> c;

    static {
        kge.a(-727327323);
        f2975a = new ct(null);
        b = com.alibaba.fastjson2.util.c.b("[D");
    }

    ct(com.alibaba.fastjson2.function.d<double[], Object> dVar) {
        super(double[].class);
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
        double[] dArr = new double[16];
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
                dArr = Arrays.copyOf(dArr, i3);
            }
            dArr[i] = jSONReader.ac();
            i = i2;
        }
        jSONReader.s();
        double[] copyOf = Arrays.copyOf(dArr, i);
        com.alibaba.fastjson2.function.d<double[], Object> dVar = this.c;
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
        double[] dArr = new double[t];
        for (int i = 0; i < t; i++) {
            dArr[i] = jSONReader.ac();
        }
        com.alibaba.fastjson2.function.d<double[], Object> dVar = this.c;
        return dVar != null ? dVar.apply(dArr) : dArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        double doubleValue;
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                doubleValue = mto.a.GEO_NOT_SUPPORT;
            } else if (obj instanceof Number) {
                doubleValue = ((Number) obj).doubleValue();
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Double.TYPE);
                if (a2 == null) {
                    throw new JSONException("can not cast to double " + obj.getClass());
                }
                doubleValue = ((Double) a2.apply(obj)).doubleValue();
            }
            dArr[i] = doubleValue;
            i++;
        }
        com.alibaba.fastjson2.function.d<double[], Object> dVar = this.c;
        return dVar != null ? dVar.apply(dArr) : dArr;
    }
}
