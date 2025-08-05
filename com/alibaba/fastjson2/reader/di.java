package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import tb.kge;

/* loaded from: classes2.dex */
public final class di extends em {
    public static final long HASH_TYPE;

    /* renamed from: a  reason: collision with root package name */
    static final di f2991a;
    final com.alibaba.fastjson2.function.d<int[], Object> b;

    static {
        kge.a(-175913078);
        f2991a = new di(int[].class, null);
        HASH_TYPE = com.alibaba.fastjson2.util.c.b("[I");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public di(Class cls, com.alibaba.fastjson2.function.d<int[], Object> dVar) {
        super(cls);
        this.b = dVar;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.w) {
            return b(jSONReader, type, obj, j);
        }
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
        int[] iArr = new int[16];
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.b()) {
                throw new JSONException(jSONReader.d("input end"));
            }
            int i2 = i + 1;
            if (i2 - iArr.length > 0) {
                int length = iArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                iArr = Arrays.copyOf(iArr, i3);
            }
            iArr[i] = jSONReader.R();
            i = i2;
        }
        jSONReader.s();
        int[] copyOf = Arrays.copyOf(iArr, i);
        com.alibaba.fastjson2.function.d<int[], Object> dVar = this.b;
        return dVar != null ? dVar.apply(copyOf) : copyOf;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.a((byte) -110)) {
            long F = jSONReader.F();
            if (F != HASH_TYPE && F != dh.HASH_TYPE) {
                throw new JSONException("not support autoType : " + jSONReader.aG());
            }
        }
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        int[] iArr = new int[t];
        for (int i = 0; i < t; i++) {
            iArr[i] = jSONReader.R();
        }
        com.alibaba.fastjson2.function.d<int[], Object> dVar = this.b;
        return dVar != null ? dVar.apply(iArr) : iArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        int intValue;
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                intValue = 0;
            } else if (obj instanceof Number) {
                intValue = ((Number) obj).intValue();
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Integer.TYPE);
                if (a2 == null) {
                    throw new JSONException("can not cast to int " + obj.getClass());
                }
                intValue = ((Integer) a2.apply(obj)).intValue();
            }
            iArr[i] = intValue;
            i++;
        }
        com.alibaba.fastjson2.function.d<int[], Object> dVar = this.b;
        return dVar != null ? dVar.apply(iArr) : iArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
