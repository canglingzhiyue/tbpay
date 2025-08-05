package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.zip.GZIPInputStream;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class dm extends em {

    /* renamed from: a  reason: collision with root package name */
    static final dm f2995a;
    static final long b;
    final String c;

    static {
        kge.a(-522875996);
        f2995a = new dm(null);
        b = com.alibaba.fastjson2.util.c.b("[Byte");
    }

    public dm(String str) {
        super(Byte[].class);
        this.c = str;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.aF()) {
            return null;
        }
        int i = 0;
        if (jSONReader.q()) {
            Byte[] bArr = new Byte[16];
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
                    bArr = (Byte[]) Arrays.copyOf(bArr, i3);
                }
                Integer T = jSONReader.T();
                bArr[i] = T == null ? null : Byte.valueOf(T.byteValue());
                i = i2;
            }
            jSONReader.s();
            return Arrays.copyOf(bArr, i);
        } else if (jSONReader.a() == 'x') {
            return jSONReader.Q();
        } else {
            if (jSONReader.z()) {
                if ("hex".equals(this.c)) {
                    return jSONReader.P();
                }
                String az = jSONReader.az();
                if (az.isEmpty()) {
                    return null;
                }
                if ("base64".equals(this.c)) {
                    return com.alibaba.fastjson2.util.d.b(az);
                }
                if ("gzip,base64".equals(this.c) || "gzip".equals(this.c)) {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(com.alibaba.fastjson2.util.d.b(az)));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            byte[] bArr2 = new byte[1024];
                            int read = gZIPInputStream.read(bArr2);
                            if (read == -1) {
                                return byteArrayOutputStream.toByteArray();
                            }
                            if (read > 0) {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                        }
                    } catch (IOException e) {
                        throw new JSONException(jSONReader.d("unzip bytes error."), e);
                    }
                }
            }
            throw new JSONException(jSONReader.d("TODO"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.a((byte) -110) && jSONReader.F() != b) {
            throw new JSONException("not support autoType : " + jSONReader.aG());
        } else if (jSONReader.z() && "hex".equals(this.c)) {
            return jSONReader.P();
        } else {
            int t = jSONReader.t();
            if (t == -1) {
                return null;
            }
            Byte[] bArr = new Byte[t];
            for (int i = 0; i < t; i++) {
                Integer T = jSONReader.T();
                bArr[i] = T == null ? null : Byte.valueOf(T.byteValue());
            }
            return bArr;
        }
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        Byte b2;
        Byte[] bArr = new Byte[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                b2 = null;
            } else if (obj instanceof Number) {
                b2 = Byte.valueOf(((Number) obj).byteValue());
            } else {
                com.alibaba.fastjson2.function.d a2 = JSONFactory.defaultObjectReaderProvider.a(obj.getClass(), Byte.class);
                if (a2 == null) {
                    throw new JSONException("can not cast to Byte " + obj.getClass());
                }
                b2 = (Byte) a2.apply(obj);
            }
            bArr[i] = b2;
            i++;
        }
        return bArr;
    }
}
