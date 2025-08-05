package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ci extends em {

    /* renamed from: a  reason: collision with root package name */
    static final ci f2966a;
    static final long b;

    static {
        kge.a(1158399102);
        f2966a = new ci();
        b = com.alibaba.fastjson2.util.c.b("[Z");
    }

    ci() {
        super(boolean[].class);
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
        boolean[] zArr = new boolean[16];
        int i = 0;
        while (!jSONReader.r()) {
            int i2 = i + 1;
            if (i2 - zArr.length > 0) {
                int length = zArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                zArr = Arrays.copyOf(zArr, i3);
            }
            zArr[i] = jSONReader.aL();
            i = i2;
        }
        jSONReader.s();
        return Arrays.copyOf(zArr, i);
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
        boolean[] zArr = new boolean[t];
        for (int i = 0; i < t; i++) {
            zArr[i] = jSONReader.aL();
        }
        return zArr;
    }
}
