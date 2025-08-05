package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import tb.kge;

/* loaded from: classes2.dex */
public final class dk extends em {
    public static final long HASH_TYPE;

    /* renamed from: a  reason: collision with root package name */
    static final dk f2993a;

    static {
        kge.a(-1221709832);
        f2993a = new dk();
        HASH_TYPE = com.alibaba.fastjson2.util.c.b("[Long");
    }

    dk() {
        super(Long[].class);
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
        Long[] lArr = new Long[16];
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.b()) {
                throw new JSONException(jSONReader.d("input end"));
            }
            int i2 = i + 1;
            if (i2 - lArr.length > 0) {
                int length = lArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                lArr = (Long[]) Arrays.copyOf(lArr, i3);
            }
            lArr[i] = jSONReader.Z();
            i = i2;
        }
        jSONReader.s();
        return Arrays.copyOf(lArr, i);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.a((byte) -110)) {
            long F = jSONReader.F();
            if (F != HASH_TYPE && F != dl.HASH_TYPE && F != dh.HASH_TYPE && F != di.HASH_TYPE) {
                throw new JSONException(jSONReader.d("not support type " + jSONReader.aG()));
            }
        }
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        Long[] lArr = new Long[t];
        for (int i = 0; i < t; i++) {
            lArr[i] = jSONReader.Z();
        }
        return lArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        Long l;
        Long[] lArr = new Long[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                l = null;
            } else if (obj instanceof Number) {
                l = Long.valueOf(((Number) obj).longValue());
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Long.class);
                if (a2 == null) {
                    throw new JSONException("can not cast to Integer " + obj.getClass());
                }
                l = (Long) a2.apply(obj);
            }
            lArr[i] = l;
            i++;
        }
        return lArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
