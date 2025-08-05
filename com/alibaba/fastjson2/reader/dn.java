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
public class dn extends em {

    /* renamed from: a  reason: collision with root package name */
    static final dn f2996a;
    static final long b;
    final String c;
    final com.alibaba.fastjson2.function.d<byte[], Object> d;
    final long e;

    static {
        kge.a(1805462781);
        f2996a = new dn(null);
        b = com.alibaba.fastjson2.util.c.b("[B");
    }

    dn(String str) {
        super(byte[].class);
        this.c = str;
        this.d = null;
        this.e = 0L;
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
            byte[] b2 = (jSONReader.a(this.e | j) & JSONReader.Feature.Base64StringAsByteArray.mask) != 0 ? com.alibaba.fastjson2.util.d.b(jSONReader.az()) : jSONReader.Q();
            com.alibaba.fastjson2.function.d<byte[], Object> dVar = this.d;
            return dVar != null ? dVar.apply(b2) : b2;
        }
        byte[] bArr = new byte[16];
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.b()) {
                throw new JSONException(jSONReader.d("input end"));
            }
            int i2 = i + 1;
            if (i2 - bArr.length > 0) {
                int length = bArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                bArr = Arrays.copyOf(bArr, i3);
            }
            bArr[i] = (byte) jSONReader.R();
            i = i2;
        }
        jSONReader.s();
        byte[] copyOf = Arrays.copyOf(bArr, i);
        com.alibaba.fastjson2.function.d<byte[], Object> dVar2 = this.d;
        return dVar2 != null ? dVar2.apply(copyOf) : copyOf;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        byte[] bArr;
        if (jSONReader.a((byte) -110)) {
            long F = jSONReader.F();
            if (F != b && F != dm.b) {
                throw new JSONException("not support autoType : " + jSONReader.aG());
            }
        }
        if (jSONReader.O()) {
            bArr = jSONReader.Q();
        } else if (jSONReader.z()) {
            bArr = com.alibaba.fastjson2.util.d.b(jSONReader.az());
        } else {
            int t = jSONReader.t();
            if (t == -1) {
                return null;
            }
            byte[] bArr2 = new byte[t];
            for (int i = 0; i < t; i++) {
                bArr2[i] = (byte) jSONReader.R();
            }
            bArr = bArr2;
        }
        com.alibaba.fastjson2.function.d<byte[], Object> dVar = this.d;
        return dVar != null ? dVar.apply(bArr) : bArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        byte byteValue;
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                byteValue = 0;
            } else if (obj instanceof Number) {
                byteValue = ((Number) obj).byteValue();
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Byte.TYPE);
                if (a2 == null) {
                    throw new JSONException("can not cast to byte " + obj.getClass());
                }
                byteValue = ((Byte) a2.apply(obj)).byteValue();
            }
            bArr[i] = byteValue;
            i++;
        }
        com.alibaba.fastjson2.function.d<byte[], Object> dVar = this.d;
        return dVar != null ? dVar.apply(bArr) : bArr;
    }
}
