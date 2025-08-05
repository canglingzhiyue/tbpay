package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cs<E extends Enum<E>> extends dt {

    /* renamed from: a  reason: collision with root package name */
    final Member f3072a;
    final Class b;
    final Class c;
    final long d;
    byte[] e;
    long f;
    final Enum[] g;
    final String[] h;
    final long[] i;
    byte[][] j;
    String[] k;

    static {
        kge.a(-1504367475);
    }

    public cs(Class cls, Class cls2, Member member, String[] strArr, long j) {
        this.b = cls;
        this.c = cls2;
        this.d = j;
        this.f3072a = member;
        if (member instanceof AccessibleObject) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        this.g = (Enum[]) cls2.getEnumConstants();
        Enum[] enumArr = this.g;
        this.h = new String[enumArr.length];
        this.i = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.g;
            if (i >= enumArr2.length) {
                this.k = strArr;
                return;
            }
            String name = enumArr2[i].name();
            this.h[i] = name;
            this.i[i] = com.alibaba.fastjson2.util.c.b(name);
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Enum r3 = (Enum) obj;
        if (r3 == null) {
            jSONWriter.n();
            return;
        }
        Member member = this.f3072a;
        if (member != null) {
            try {
                Object invoke = member instanceof Field ? ((Field) member).get(obj) : ((Method) member).invoke(obj, new Object[0]);
                if (invoke != obj) {
                    jSONWriter.f(invoke);
                    return;
                }
            } catch (Exception e) {
                throw new JSONException("getEnumValue error", e);
            }
        }
        if (jSONWriter.a(JSONWriter.Feature.WriteEnumUsingToString)) {
            jSONWriter.d(r3.toString());
            return;
        }
        String str = null;
        if (this.k != null) {
            int ordinal = r3.ordinal();
            String[] strArr = this.k;
            if (ordinal < strArr.length) {
                str = strArr[ordinal];
            }
        }
        if (str == null) {
            str = r3.name();
        }
        jSONWriter.d(str);
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.a(obj, type, j)) {
            if (this.e == null) {
                String a2 = TypeUtils.a(this.c);
                this.e = b.CC.a(a2);
                this.f = com.alibaba.fastjson2.util.c.b(a2);
            }
            jSONWriter.b(this.e, this.f);
        }
        Enum r2 = (Enum) obj;
        if (jSONWriter.a(JSONWriter.Feature.WriteEnumUsingToString)) {
            jSONWriter.d(r2.toString());
            return;
        }
        if (this.j == null) {
            this.j = new byte[this.h.length];
        }
        int ordinal = r2.ordinal();
        byte[] bArr = this.j[ordinal];
        if (bArr == null) {
            bArr = b.CC.a(this.h[ordinal]);
            this.j[ordinal] = bArr;
        }
        jSONWriter.d(bArr);
    }
}
