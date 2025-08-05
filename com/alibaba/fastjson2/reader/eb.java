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
public class eb extends em {

    /* renamed from: a  reason: collision with root package name */
    static final eb f3008a;

    static {
        kge.a(48405892);
        f3008a = new eb();
    }

    public eb() {
        super(Number[].class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.aF()) {
            return null;
        }
        if (!jSONReader.q()) {
            throw new JSONException(jSONReader.d("TODO"));
        }
        Number[] numberArr = new Number[16];
        int i = 0;
        while (!jSONReader.r()) {
            int i2 = i + 1;
            if (i2 - numberArr.length > 0) {
                int length = numberArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                numberArr = (Number[]) Arrays.copyOf(numberArr, i3);
            }
            numberArr[i] = jSONReader.ae();
            i = i2;
        }
        jSONReader.s();
        return Arrays.copyOf(numberArr, i);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        Number[] numberArr = new Number[t];
        for (int i = 0; i < t; i++) {
            numberArr[i] = jSONReader.ae();
        }
        return numberArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        Number[] numberArr = new Number[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj != null && !(obj instanceof Number)) {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Number.class);
                if (a2 == null) {
                    throw new JSONException("can not cast to Number " + obj.getClass());
                }
                obj = a2.apply(obj);
            }
            numberArr[i] = (Number) obj;
            i++;
        }
        return numberArr;
    }
}
