package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.util.f;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.aak;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class d<T> implements Comparable<d> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2982a;
    public final String b;
    public final Class c;
    public final Type d;
    public final long e;
    public final String f;
    public final Method g;
    public final Field h;
    protected final long i;
    public final Object j;
    public final Locale k;
    final boolean l;
    final long m;
    final long n;
    volatile bu o;
    volatile com.alibaba.fastjson2.d p;
    final boolean q;
    final boolean r;
    Type s;
    Class t;
    volatile bu u;

    static {
        kge.a(-181259565);
        kge.a(415966670);
    }

    public d(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Method method, Field field) {
        this.b = str;
        this.d = type;
        this.c = cls;
        boolean z = false;
        this.l = cls != null && (cls.isPrimitive() || cls == String.class || cls == List.class || Serializable.class.isAssignableFrom(cls) || Modifier.isInterface(cls.getModifiers()));
        this.e = j;
        this.m = com.alibaba.fastjson2.util.c.b(str);
        this.n = com.alibaba.fastjson2.util.c.a(str);
        this.f2982a = i;
        this.f = str2;
        this.k = locale;
        this.j = obj;
        this.g = method;
        this.h = field;
        this.r = (field != null && Modifier.isFinal(field.getModifiers())) || (aak.READ_ONLY & j) != 0;
        long objectFieldOffset = (field == null || (j & aak.DISABLE_UNSAFE) != 0) ? -1L : com.alibaba.fastjson2.util.e.UNSAFE.objectFieldOffset(field);
        this.i = objectFieldOffset;
        if (objectFieldOffset == -1 && field != null && method == null) {
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        if (cls != null && !cls.isPrimitive() && cls != String.class && cls != List.class && cls != Map.class && !cls.isEnum()) {
            Class<?> cls2 = null;
            if (method != null) {
                cls2 = method.getDeclaringClass();
            } else if (field != null) {
                cls2 = field.getDeclaringClass();
            }
            z = BeanUtils.a((Class) cls2, cls);
        }
        this.q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bu a(Type type, Class cls, String str, Locale locale) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String c = TypeUtils.c(type);
        char c2 = 65535;
        switch (c.hashCode()) {
            case -1374008726:
                if (c.equals("byte[]")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2887:
                if (c.equals("[B")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1087757882:
                if (c.equals("java.sql.Date")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1088242009:
                if (c.equals("java.sql.Time")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1252880906:
                if (c.equals("java.sql.Timestamp")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return new f.c(str, locale);
        }
        if (c2 == 1) {
            return new f.e(str, locale);
        }
        if (c2 == 2) {
            return new f.b(str, locale);
        }
        if (c2 == 3 || c2 == 4) {
            return new dm(str);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return cl.a(str, locale);
        }
        if (cls != Date.class) {
            return null;
        }
        return cq.a(str, locale);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(d dVar) {
        Class<?> cls;
        Class<?> cls2;
        Class<?> declaringClass;
        Class<?> declaringClass2;
        int compareTo = this.b.compareTo(dVar.b);
        if (compareTo != 0) {
            int i = this.f2982a;
            int i2 = dVar.f2982a;
            if (i < i2) {
                return -1;
            }
            if (i <= i2) {
                return compareTo;
            }
            return 1;
        }
        int i3 = c() == dVar.c() ? 0 : c() ? 1 : -1;
        if (i3 != 0) {
            return i3;
        }
        Member member = this.h;
        if (member == null) {
            member = this.g;
        }
        Member member2 = dVar.h;
        if (member2 == null) {
            member2 = dVar.g;
        }
        if (member != null && member2 != null && member.getClass() != member2.getClass() && (declaringClass2 = member.getDeclaringClass()) != (declaringClass = member2.getDeclaringClass())) {
            if (declaringClass2.isAssignableFrom(declaringClass)) {
                return 1;
            }
            if (declaringClass.isAssignableFrom(declaringClass2)) {
                return -1;
            }
        }
        Field field = this.h;
        if (field != null && dVar.h != null) {
            Class<?> declaringClass3 = field.getDeclaringClass();
            Class<?> declaringClass4 = dVar.h.getDeclaringClass();
            for (Class<? super Object> superclass = declaringClass3.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                if (superclass == declaringClass4) {
                    return 1;
                }
            }
            do {
                declaringClass4 = declaringClass4.getSuperclass();
                if (declaringClass4 != null && declaringClass4 != Object.class) {
                }
            } while (declaringClass4 != declaringClass3);
            return -1;
        }
        Method method = this.g;
        if (method != null && dVar.g != null) {
            Class<?> declaringClass5 = method.getDeclaringClass();
            Class<?> declaringClass6 = dVar.g.getDeclaringClass();
            for (Class<? super Object> superclass2 = declaringClass5.getSuperclass(); superclass2 != null && superclass2 != Object.class; superclass2 = superclass2.getSuperclass()) {
                if (superclass2 == declaringClass6) {
                    return -1;
                }
            }
            do {
                declaringClass6 = declaringClass6.getSuperclass();
                if (declaringClass6 == null || declaringClass6 == Object.class) {
                    Class<?>[] parameterTypes = this.g.getParameterTypes();
                    Class<?>[] parameterTypes2 = dVar.g.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes2.length == 1 && (cls = parameterTypes[0]) != (cls2 = parameterTypes2[0])) {
                        if (cls.isAssignableFrom(cls2)) {
                            return 1;
                        }
                        if (cls2.isAssignableFrom(cls)) {
                            return -1;
                        }
                        if (cls.isEnum() && (cls2 == Integer.class || cls2 == Integer.TYPE)) {
                            return 1;
                        }
                        if (cls2.isEnum() && (cls == Integer.class || cls == Integer.TYPE)) {
                            return -1;
                        }
                        JSONField jSONField = (JSONField) BeanUtils.a((AnnotatedElement) this.g, (Class<Annotation>) JSONField.class);
                        JSONField jSONField2 = (JSONField) BeanUtils.a((AnnotatedElement) dVar.g, (Class<Annotation>) JSONField.class);
                        if (jSONField != null && jSONField2 == null) {
                            return -1;
                        }
                        if (jSONField == null && jSONField2 != null) {
                            return 1;
                        }
                    }
                    String name = this.g.getName();
                    String name2 = dVar.g.getName();
                    if (!name.equals(name2)) {
                        String a2 = BeanUtils.a(name, (String) null);
                        String a3 = BeanUtils.a(name2, (String) null);
                        if (this.b.equals(a2) && !dVar.b.equals(a3)) {
                            return 1;
                        }
                        if (dVar.b.equals(a3) && !this.b.equals(a2)) {
                            return -1;
                        }
                    }
                }
            } while (declaringClass6 != declaringClass5);
            return 1;
        }
        bu d = d();
        bu d2 = dVar.d();
        if (d != null && d2 == null) {
            return -1;
        }
        if (d == null && d2 != null) {
            return 1;
        }
        Class cls3 = this.c;
        Class cls4 = dVar.c;
        boolean isPrimitive = cls3.isPrimitive();
        boolean isPrimitive2 = cls4.isPrimitive();
        if (isPrimitive && !isPrimitive2) {
            return -1;
        }
        if (!isPrimitive && isPrimitive2) {
            return 1;
        }
        boolean startsWith = cls3.getName().startsWith("java.", 0);
        boolean startsWith2 = cls4.getName().startsWith("java.", 0);
        if (startsWith && !startsWith2) {
            return -1;
        }
        if (!startsWith && startsWith2) {
            return 1;
        }
        return i3;
    }

    public bu a(JSONReader.c cVar) {
        if (this.o != null) {
            return this.o;
        }
        bu a2 = cVar.a(this.d);
        this.o = a2;
        return a2;
    }

    public bu a(JSONReader jSONReader) {
        if (this.o != null) {
            return this.o;
        }
        bu a2 = jSONReader.a(this.d);
        this.o = a2;
        return a2;
    }

    public bu a(ObjectReaderProvider objectReaderProvider) {
        if (this.o != null) {
            return this.o;
        }
        bu a2 = objectReaderProvider.a(this.d, (this.e & JSONReader.Feature.FieldBased.mask) != 0);
        this.o = a2;
        return a2;
    }

    public Type a() {
        return this.s;
    }

    public void a(JSONReader jSONReader, T t) {
        b(jSONReader, t);
    }

    public void a(JSONReader jSONReader, Object obj, String str) {
        com.alibaba.fastjson2.d a2;
        if (this.p == null || !this.p.toString().equals(str)) {
            a2 = com.alibaba.fastjson2.d.a(str);
            this.p = a2;
        } else {
            a2 = this.p;
        }
        jSONReader.a(this, obj, a2);
    }

    public void a(JSONReader jSONReader, List list, int i, String str) {
        jSONReader.a((Collection) list, i, com.alibaba.fastjson2.d.a(str));
    }

    public void a(T t) {
        Object obj = this.j;
        if (obj != null) {
            a((d<T>) t, obj);
        }
    }

    public void a(T t, byte b) {
        a((d<T>) t, Byte.valueOf(b));
    }

    public void a(T t, char c) {
        a((d<T>) t, Character.valueOf(c));
    }

    public void a(T t, double d) {
        a((d<T>) t, Double.valueOf(d));
    }

    public void a(T t, float f) {
        a((d<T>) t, Float.valueOf(f));
    }

    public void a(T t, int i) {
        a((d<T>) t, Integer.valueOf(i));
    }

    public void a(T t, long j) {
        a((d<T>) t, Long.valueOf(j));
    }

    public abstract void a(T t, Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r10, java.lang.Object r11, long r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.d.a(java.lang.Object, java.lang.Object, long):void");
    }

    public void a(Object obj, String str, Object obj2) {
    }

    public void a(T t, short s) {
        a((d<T>) t, Short.valueOf(s));
    }

    public void a(T t, boolean z) {
        a((d<T>) t, Boolean.valueOf(z));
    }

    public boolean a(Class cls) {
        return this.c == cls;
    }

    public bu b(JSONReader.c cVar) {
        if (this.u != null) {
            return this.u;
        }
        bu a2 = cVar.a(this.s);
        this.u = a2;
        return a2;
    }

    public abstract Object b(JSONReader jSONReader);

    public abstract void b(JSONReader jSONReader, T t);

    public boolean b() {
        return (this.e & aak.UNWRAPPED_MASK) != 0;
    }

    public bu c(JSONReader jSONReader) {
        return b(jSONReader.f2934a);
    }

    public void c(JSONReader jSONReader, Object obj) {
        jSONReader.N();
    }

    public boolean c() {
        return this.r;
    }

    public bu d() {
        return null;
    }

    public String toString() {
        Member member = this.g;
        if (member == null) {
            member = this.h;
        }
        return member != null ? member.getName() : this.b;
    }
}
