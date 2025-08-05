package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cm extends em {

    /* renamed from: a  reason: collision with root package name */
    static final cm f2969a;
    static final long b;
    final com.alibaba.fastjson2.function.d<char[], Object> c;

    static {
        kge.a(-1292270102);
        f2969a = new cm(null);
        b = com.alibaba.fastjson2.util.c.b("[C");
    }

    public cm(com.alibaba.fastjson2.function.d<char[], Object> dVar) {
        super(char[].class);
        this.c = dVar;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.aF()) {
            return null;
        }
        if (jSONReader.a() == '\"') {
            char[] charArray = jSONReader.az().toCharArray();
            com.alibaba.fastjson2.function.d<char[], Object> dVar = this.c;
            return dVar != null ? dVar.apply(charArray) : charArray;
        } else if (!jSONReader.q()) {
            throw new JSONException(jSONReader.d("TODO"));
        } else {
            char[] cArr = new char[16];
            int i = 0;
            while (!jSONReader.r()) {
                int i2 = i + 1;
                if (i2 - cArr.length > 0) {
                    int length = cArr.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    cArr = Arrays.copyOf(cArr, i3);
                }
                if (jSONReader.d()) {
                    cArr[i] = (char) jSONReader.R();
                } else {
                    String az = jSONReader.az();
                    cArr[i] = az == null ? (char) 0 : az.charAt(0);
                }
                i = i2;
            }
            jSONReader.s();
            char[] copyOf = Arrays.copyOf(cArr, i);
            com.alibaba.fastjson2.function.d<char[], Object> dVar2 = this.c;
            return dVar2 != null ? dVar2.apply(copyOf) : copyOf;
        }
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.a((byte) -110) && jSONReader.F() != b) {
            throw new JSONException("not support autoType : " + jSONReader.aG());
        } else if (jSONReader.z()) {
            return jSONReader.az().toCharArray();
        } else {
            int t = jSONReader.t();
            if (t == -1) {
                return null;
            }
            char[] cArr = new char[t];
            for (int i = 0; i < t; i++) {
                if (jSONReader.d()) {
                    cArr[i] = (char) jSONReader.R();
                } else {
                    cArr[i] = jSONReader.az().charAt(0);
                }
            }
            com.alibaba.fastjson2.function.d<char[], Object> dVar = this.c;
            return dVar != null ? dVar.apply(cArr) : cArr;
        }
    }
}
