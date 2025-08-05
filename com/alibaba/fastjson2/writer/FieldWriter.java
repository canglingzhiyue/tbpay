package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.util.f;
import com.taobao.tao.shop.common.ShopConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.GZIPOutputStream;
import tb.aak;
import tb.crd;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class FieldWriter<T> implements Comparable {
    static final AtomicReferenceFieldUpdater<FieldWriter, bg> y;

    /* renamed from: a  reason: collision with root package name */
    public final String f3039a;
    public final Type b;
    public final Class c;
    public final long d;
    public final int e;
    public final String f;
    public final DecimalFormat g;
    public final String h;
    public final Field i;
    public final Method j;
    protected final long k;
    protected final boolean l;
    final long m;
    final byte[] n;
    final char[] o;
    final byte[] p;
    long q;
    final boolean r;
    final JSONWriter.b s;
    final boolean t;
    final boolean u;
    final boolean v;
    transient JSONWriter.b w;
    volatile bg x;

    static {
        kge.a(-1741372877);
        kge.a(415966670);
        y = AtomicReferenceFieldUpdater.newUpdater(FieldWriter.class, bg.class, "x");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FieldWriter(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        int i2;
        if ("string".equals(str2) && cls != String.class) {
            j |= JSONWriter.Feature.WriteNonStringValueAsString.mask;
        }
        this.f3039a = str;
        this.e = i;
        this.f = str2;
        this.h = str3;
        this.m = com.alibaba.fastjson2.util.c.b(str);
        this.d = j;
        this.b = TypeUtils.a(type);
        this.c = cls;
        this.r = cls != null && (Serializable.class.isAssignableFrom(cls) || !Modifier.isFinal(cls.getModifiers()));
        this.i = field;
        this.j = method;
        this.l = cls.isPrimitive();
        this.p = b.CC.a(this.f3039a);
        DecimalFormat decimalFormat = null;
        if (str2 != null && (cls == Float.TYPE || cls == float[].class || cls == Float.class || cls == Float[].class || cls == Double.TYPE || cls == double[].class || cls == Double.class || cls == Double[].class || cls == BigDecimal.class || cls == BigDecimal[].class)) {
            decimalFormat = new DecimalFormat(str2);
        }
        this.g = decimalFormat;
        this.k = field != null ? com.alibaba.fastjson2.util.e.UNSAFE.objectFieldOffset(field) : -1L;
        this.t = com.taobao.android.weex_framework.util.a.ATOM_symbol.equals(str2);
        this.u = "trim".equals(str2);
        this.v = (j & aak.RAW_VALUE_MASK) != 0;
        this.s = new JSONWriter.b(JSONWriter.b.ROOT, str);
        int length = str.length();
        int i3 = length + 3;
        int i4 = i3;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt <= 0 || charAt > 127) {
                i4 = charAt > 2047 ? i4 + 2 : i4 + 1;
            }
        }
        byte[] bArr = new byte[i4];
        bArr[0] = 34;
        int i6 = 1;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt2 = str.charAt(i7);
            if (charAt2 > 0 && charAt2 <= 127) {
                i2 = i6 + 1;
                bArr[i6] = (byte) charAt2;
            } else if (charAt2 > 2047) {
                int i8 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >> '\f') & 15) | 224);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((charAt2 >> 6) & 63) | 128);
                i2 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & riy.CONDITION_IF) | 128);
            } else {
                int i10 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >> 6) & 31) | crd.DETECT_WIDTH);
                i6 = i10 + 1;
                bArr[i10] = (byte) ((charAt2 & riy.CONDITION_IF) | 128);
            }
            i6 = i2;
        }
        bArr[i6] = 34;
        bArr[i6 + 1] = 58;
        this.n = bArr;
        char[] cArr = new char[i3];
        cArr[0] = '\"';
        str.getChars(0, str.length(), cArr, 1);
        cArr[cArr.length - 2] = '\"';
        cArr[cArr.length - 1] = riy.CONDITION_IF_MIDDLE;
        this.o = cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bg a(Type type, Class cls, String str, Locale locale, Class cls2) {
        if (Map.class.isAssignableFrom(cls2)) {
            return cls.isAssignableFrom(cls2) ? dl.a(type, cls2) : dl.a(cls2);
        } else if (Calendar.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? cj.l : new cj(str, locale);
        } else if (BigDecimal.class == cls2) {
            return (str == null || str.isEmpty()) ? cg.f3062a : new cg(new DecimalFormat(str), null);
        } else if (BigDecimal[].class == cls2) {
            return (str == null || str.isEmpty()) ? new bv(BigDecimal.class, null) : new bv(BigDecimal.class, new DecimalFormat(str));
        } else {
            String name = cls2.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 1087757882) {
                if (hashCode != 1088242009) {
                    if (hashCode == 1252880906 && name.equals("java.sql.Timestamp")) {
                        c = 2;
                    }
                } else if (name.equals("java.sql.Time")) {
                    c = 0;
                }
            } else if (name.equals("java.sql.Date")) {
                c = 1;
            }
            if (c == 0) {
                return f.d.a(str);
            }
            if (c == 1) {
                return new cp(str, locale);
            }
            if (c == 2) {
                return new f.C0108f(str);
            }
            return null;
        }
    }

    private boolean a(JSONWriter jSONWriter, com.alibaba.fastjson2.s sVar) {
        int i;
        int identityHashCode = System.identityHashCode(sVar);
        long j = this.q;
        if (j != 0 && ((int) j) == identityHashCode) {
            i = (int) (j >> 32);
        } else {
            i = sVar.a(this.m);
            this.q = (i << 32) | identityHashCode;
        }
        if (i != -1) {
            jSONWriter.a(-i);
            return true;
        }
        return false;
    }

    public final JSONWriter.b a(JSONWriter.b bVar) {
        JSONWriter.b bVar2 = this.w;
        if (bVar2 != null) {
            return bVar2.f2941a == bVar ? this.w : new JSONWriter.b(bVar, this.f3039a);
        }
        JSONWriter.b bVar3 = new JSONWriter.b(bVar, this.f3039a);
        this.w = bVar3;
        return bVar3;
    }

    public bg a(JSONWriter jSONWriter, Class cls) {
        if (cls == Float[].class) {
            DecimalFormat decimalFormat = this.g;
            return decimalFormat != null ? new bv(Float.class, decimalFormat) : bv.FLOAT_ARRAY;
        } else if (cls == Double[].class) {
            DecimalFormat decimalFormat2 = this.g;
            return decimalFormat2 != null ? new bv(Double.class, decimalFormat2) : bv.DOUBLE_ARRAY;
        } else if (cls != BigDecimal[].class) {
            return jSONWriter.a(cls);
        } else {
            DecimalFormat decimalFormat3 = this.g;
            return decimalFormat3 != null ? new bv(BigDecimal.class, decimalFormat3) : bv.DECIMAL_ARRAY;
        }
    }

    public bg a(JSONWriter jSONWriter, Type type) {
        return jSONWriter.a(type, (Class) null);
    }

    public Object a(T t) {
        if (t == null) {
            throw new JSONException("field.get error, " + this.f3039a);
        } else if (this.i == null) {
            throw new UnsupportedOperationException();
        } else {
            try {
                return (this.k == -1 || this.l) ? this.i.get(t) : com.alibaba.fastjson2.util.e.UNSAFE.getObject(t, this.k);
            } catch (IllegalAccessException | IllegalArgumentException e) {
                throw new JSONException("field.get error, " + this.f3039a, e);
            }
        }
    }

    public final void a(JSONWriter jSONWriter) {
        if (jSONWriter.e) {
            com.alibaba.fastjson2.s sVar = jSONWriter.g;
            if (sVar != null && a(jSONWriter, sVar)) {
                return;
            }
            jSONWriter.a(this.p, this.m);
            return;
        }
        if (!jSONWriter.f && (jSONWriter.b.a() & JSONWriter.Feature.UnquoteFieldName.mask) == 0) {
            if (jSONWriter.c) {
                jSONWriter.e(this.n);
                return;
            } else if (jSONWriter.d) {
                jSONWriter.a(this.o);
                return;
            }
        }
        jSONWriter.b(this.f3039a);
        jSONWriter.m();
    }

    public void a(JSONWriter jSONWriter, double d) {
        a(jSONWriter);
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.a(d, decimalFormat);
        } else {
            jSONWriter.a(d);
        }
    }

    public void a(JSONWriter jSONWriter, float f) {
        a(jSONWriter);
        DecimalFormat decimalFormat = this.g;
        if (decimalFormat != null) {
            jSONWriter.a(f, decimalFormat);
        } else {
            jSONWriter.a(f);
        }
    }

    public void a(JSONWriter jSONWriter, int i) {
        a(jSONWriter);
        jSONWriter.d(i);
    }

    public void a(JSONWriter jSONWriter, long j) {
        a(jSONWriter);
        if ((this.d & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.d(Long.toString(j));
        } else {
            jSONWriter.e(j);
        }
    }

    public void a(JSONWriter jSONWriter, Enum r2) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(JSONWriter jSONWriter, T t);

    public void a(JSONWriter jSONWriter, String str) {
        a(jSONWriter);
        if (str == null && (this.d & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) != 0) {
            jSONWriter.d("");
            return;
        }
        if (this.u && str != null) {
            str = str.trim();
        }
        if (this.t && jSONWriter.e) {
            jSONWriter.e(str);
        } else if (this.v) {
            jSONWriter.a(str);
        } else {
            jSONWriter.d(str);
        }
    }

    public void a(JSONWriter jSONWriter, boolean z) {
        throw new UnsupportedOperationException();
    }

    public void a(JSONWriter jSONWriter, boolean z, long j) {
        com.alibaba.fastjson2.time.a a2;
        long j2;
        if (jSONWriter.e) {
            jSONWriter.f(j);
            return;
        }
        JSONWriter.a aVar = jSONWriter.b;
        if (a() || aVar.d()) {
            if (z) {
                a(jSONWriter);
            }
            jSONWriter.e(j);
            return;
        }
        com.alibaba.fastjson2.time.e b = aVar.b();
        if (aVar.c() != null) {
            com.alibaba.fastjson2.time.f a3 = com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(j), b);
            if (b() || aVar.f()) {
                jSONWriter.a(a3.f3024a.f3021a.f3020a, a3.f3024a.f3021a.b, a3.f3024a.f3021a.c, a3.f3024a.b.f3022a, a3.f3024a.b.b, a3.f3024a.b.c, a3.f3024a.b.d / 1000000, a3.b, true);
                return;
            }
            String a4 = aVar.h().a(a3);
            if (z) {
                a(jSONWriter);
            }
            jSONWriter.d(a4);
            return;
        }
        long a5 = com.alibaba.fastjson2.time.a.a(j).b + b.a(a2);
        long a6 = com.alibaba.fastjson2.util.d.a(a5, 86400L);
        int b2 = (int) com.alibaba.fastjson2.util.d.b(a5, 86400L);
        long j3 = (a6 + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        int a7 = com.alibaba.fastjson2.time.c.a(j5 + j2 + (i2 / 10));
        long j7 = b2;
        com.alibaba.fastjson2.time.c.b(j7);
        int i5 = (int) (j7 / 3600);
        long j8 = j7 - (i5 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
        int i6 = (int) (j8 / 60);
        int i7 = (int) (j8 - (i6 * 60));
        if (z) {
            a(jSONWriter);
        }
        jSONWriter.b(a7, i3, i4, i5, i6, i7);
    }

    public void a(JSONWriter jSONWriter, boolean z, List list) {
        throw new UnsupportedOperationException();
    }

    public void a(JSONWriter jSONWriter, byte[] bArr) {
        if (bArr == null) {
            if (!jSONWriter.b()) {
                return;
            }
            a(jSONWriter);
            jSONWriter.p();
            return;
        }
        a(jSONWriter);
        if ("base64".equals(this.f) || (this.f == null && (jSONWriter.c(this.d) & JSONWriter.Feature.WriteByteArrayAsBase64.mask) != 0)) {
            jSONWriter.b(bArr);
        } else if ("hex".equals(this.f)) {
            jSONWriter.c(bArr);
        } else if (!"gzip,base64".equals(this.f) && !"gzip".equals(this.f)) {
            jSONWriter.a(bArr);
        } else {
            GZIPOutputStream gZIPOutputStream = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    gZIPOutputStream = bArr.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, bArr.length) : new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    com.alibaba.fastjson2.util.d.a(gZIPOutputStream);
                    jSONWriter.b(byteArray);
                } catch (IOException e) {
                    throw new JSONException("write gzipBytes error", e);
                }
            } catch (Throwable th) {
                com.alibaba.fastjson2.util.d.a(gZIPOutputStream);
                throw th;
            }
        }
    }

    public boolean a() {
        return false;
    }

    public void b(JSONWriter jSONWriter, long j) {
        a(jSONWriter, true, j);
    }

    public void b(JSONWriter jSONWriter, Enum r2) {
        a(jSONWriter);
        jSONWriter.a(r2);
    }

    public void b(JSONWriter jSONWriter, boolean z, List<String> list) {
        throw new UnsupportedOperationException();
    }

    public boolean b() {
        return false;
    }

    public abstract boolean b(JSONWriter jSONWriter, T t);

    public bg c() {
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Class<?> declaringClass;
        Class<?> declaringClass2;
        FieldWriter fieldWriter = (FieldWriter) obj;
        int i = this.e;
        int i2 = fieldWriter.e;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int compareTo = this.f3039a.compareTo(fieldWriter.f3039a);
        if (compareTo != 0) {
            return compareTo;
        }
        Member member = this.i;
        if (member == null) {
            member = this.j;
        }
        Member member2 = fieldWriter.i;
        if (member2 == null) {
            member2 = fieldWriter.j;
        }
        if (member != null && member2 != null && (declaringClass2 = member.getDeclaringClass()) != (declaringClass = member2.getDeclaringClass())) {
            if (declaringClass2.isAssignableFrom(declaringClass)) {
                return 1;
            }
            if (declaringClass.isAssignableFrom(declaringClass2)) {
                return -1;
            }
        }
        if ((member instanceof Field) && (member2 instanceof Method)) {
            return -1;
        }
        boolean z = member instanceof Method;
        if (z && (member2 instanceof Field)) {
            return 1;
        }
        Class cls = fieldWriter.c;
        Class<?> cls2 = this.c;
        if (cls2 != cls && cls2 != null && cls != null) {
            if (cls2.isAssignableFrom(cls)) {
                return 1;
            }
            if (cls.isAssignableFrom(cls2)) {
                return -1;
            }
        }
        if (cls2 == Boolean.TYPE && cls != Boolean.TYPE) {
            return 1;
        }
        if (cls2 == Boolean.class && cls == Boolean.class && z && (member2 instanceof Method)) {
            String name = member.getName();
            String name2 = member2.getName();
            if (name.startsWith("is") && name2.startsWith("get")) {
                return 1;
            }
            if (name.startsWith("get") && name2.startsWith("is")) {
                return -1;
            }
        }
        if (z && (member2 instanceof Method)) {
            String name3 = member.getName();
            String name4 = member2.getName();
            if (!name3.equals(name4)) {
                String b = BeanUtils.b(name3, (String) null);
                String b2 = BeanUtils.b(name4, (String) null);
                if (this.f3039a.equals(b) && !fieldWriter.f3039a.equals(b2)) {
                    return 1;
                }
                if (this.f3039a.equals(b2) && !fieldWriter.f3039a.equals(b)) {
                    return -1;
                }
            }
        }
        return compareTo;
    }

    public final JSONWriter.b d() {
        return this.s;
    }

    public String toString() {
        return this.f3039a;
    }
}
