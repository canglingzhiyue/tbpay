package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import tb.kge;

/* loaded from: classes2.dex */
public final class br extends em {
    public static final br INSTANCE;
    public static final long TYPE_HASH_CODE = 20315;

    static {
        kge.a(2016896947);
        INSTANCE = new br();
    }

    public br() {
        super(Object[].class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        Object az;
        if (jSONReader.o()) {
            return null;
        }
        if (!jSONReader.q()) {
            throw new JSONException(jSONReader.d("TODO"));
        }
        Object[] objArr = new Object[16];
        int i = 0;
        while (!jSONReader.r()) {
            int i2 = i + 1;
            if (i2 - objArr.length > 0) {
                int length = objArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                objArr = Arrays.copyOf(objArr, i3);
            }
            char a2 = jSONReader.a();
            if (a2 != '\"') {
                if (a2 != '+') {
                    if (a2 != '[') {
                        if (a2 != 'f') {
                            if (a2 == 'n') {
                                jSONReader.aE();
                                az = null;
                            } else if (a2 != 't') {
                                if (a2 == '{') {
                                    az = jSONReader.aI();
                                } else if (a2 != '-' && a2 != '.') {
                                    switch (a2) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            throw new JSONException(jSONReader.aR());
                                    }
                                }
                            }
                        }
                        az = Boolean.valueOf(jSONReader.aL());
                    } else {
                        az = jSONReader.aN();
                    }
                }
                az = jSONReader.ae();
            } else {
                az = jSONReader.az();
            }
            objArr[i] = az;
            i = i2;
        }
        jSONReader.s();
        return Arrays.copyOf(objArr, i);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    /* renamed from: a */
    public Object[] b(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            objArr[i] = obj;
            i++;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        Object valueOf;
        bu a2;
        if (jSONReader.c() == -110 && (a2 = jSONReader.a(Object[].class, TYPE_HASH_CODE, j)) != this) {
            return a2.b(jSONReader, type, obj, j);
        }
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        Object[] objArr = new Object[t];
        for (int i = 0; i < t; i++) {
            byte c = jSONReader.c();
            if (c >= 73 && c <= 125) {
                valueOf = jSONReader.az();
            } else if (c == -110) {
                bu a3 = jSONReader.a(Object.class, 0L, j);
                if (a3 != null) {
                    valueOf = a3.b(jSONReader, null, null, j);
                }
                valueOf = jSONReader.aM();
            } else if (c == -81) {
                jSONReader.D();
                valueOf = null;
            } else if (c == -79) {
                jSONReader.D();
                valueOf = Boolean.TRUE;
            } else if (c == -80) {
                jSONReader.D();
                valueOf = Boolean.FALSE;
            } else {
                if (c == -66) {
                    valueOf = Long.valueOf(jSONReader.Y());
                }
                valueOf = jSONReader.aM();
            }
            objArr[i] = valueOf;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
