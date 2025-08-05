package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import tb.kge;

/* loaded from: classes2.dex */
public final class dh extends em {
    public static final long HASH_TYPE;

    /* renamed from: a  reason: collision with root package name */
    static final dh f2990a;

    static {
        kge.a(353488119);
        f2990a = new dh();
        HASH_TYPE = com.alibaba.fastjson2.util.c.b("[Integer");
    }

    dh() {
        super(Integer[].class);
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
        Integer[] numArr = new Integer[16];
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.b()) {
                throw new JSONException(jSONReader.d("input end"));
            }
            int i2 = i + 1;
            if (i2 - numArr.length > 0) {
                int length = numArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                numArr = (Integer[]) Arrays.copyOf(numArr, i3);
            }
            numArr[i] = jSONReader.T();
            i = i2;
        }
        jSONReader.s();
        return Arrays.copyOf(numArr, i);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.a((byte) -110)) {
            long F = jSONReader.F();
            if (F != HASH_TYPE && F != di.HASH_TYPE) {
                throw new JSONException(jSONReader.d("not support type " + jSONReader.aG()));
            }
        }
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        Integer[] numArr = new Integer[t];
        for (int i = 0; i < t; i++) {
            numArr[i] = jSONReader.T();
        }
        return numArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        Integer num;
        Integer[] numArr = new Integer[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                num = null;
            } else if (obj instanceof Number) {
                num = Integer.valueOf(((Number) obj).intValue());
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Integer.class);
                if (a2 == null) {
                    throw new JSONException("can not cast to Integer " + obj.getClass());
                }
                num = (Integer) a2.apply(obj);
            }
            numArr[i] = num;
            i++;
        }
        return numArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
