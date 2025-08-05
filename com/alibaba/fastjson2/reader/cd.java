package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tb.aai;
import tb.aak;
import tb.kge;

/* loaded from: classes2.dex */
public class cd {
    public static final cd INSTANCE;

    /* loaded from: classes2.dex */
    public final class a implements com.alibaba.fastjson2.function.c {

        /* renamed from: a */
        final Class f2960a;
        final Type b;
        final String c;
        final String[] d;
        final aai e;
        final aak f;
        final Map<String, d> g;
        final ObjectReaderProvider h;

        static {
            kge.a(2146850419);
            kge.a(-1053621173);
        }

        a(Class cls, Type type, String str, String[] strArr, aai aaiVar, aak aakVar, Map<String, d> map, ObjectReaderProvider objectReaderProvider) {
            cd.this = r1;
            this.f2960a = cls;
            this.b = type;
            this.c = str;
            this.d = strArr;
            this.e = aaiVar;
            this.f = aakVar;
            this.g = map;
            this.h = objectReaderProvider;
        }

        /* JADX WARN: Removed duplicated region for block: B:184:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x00fb A[SYNTHETIC] */
        @Override // com.alibaba.fastjson2.function.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void accept(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 674
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cd.a.accept(java.lang.Object):void");
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements com.alibaba.fastjson2.function.c {

        /* renamed from: a */
        final Class f2961a;
        final Type b;
        final String c;
        final aak d;
        final Map<String, d> e;
        final ObjectReaderProvider f;
        final aai g;
        final boolean h;

        static {
            kge.a(1916708012);
            kge.a(-1053621173);
        }

        public b(Class cls, Type type, String str, aak aakVar, Map<String, d> map, ObjectReaderProvider objectReaderProvider, aai aaiVar, boolean z) {
            cd.this = r1;
            this.f2961a = cls;
            this.b = type;
            this.c = str;
            this.d = aakVar;
            this.e = map;
            this.f = objectReaderProvider;
            this.g = aaiVar;
            this.h = z;
        }

        @Override // com.alibaba.fastjson2.function.c
        public void accept(Object obj) {
            String name;
            int i;
            int i2;
            String[] strArr;
            Field field = (Field) obj;
            this.d.b();
            boolean z = true;
            if (this.h) {
                this.d.e |= JSONReader.Feature.FieldBased.mask;
            } else {
                this.d.f = (field.getModifiers() & 1) == 0;
            }
            this.d.e |= this.g.m;
            this.d.b = this.g.y;
            this.f.a(this.d, this.f2961a, field);
            if (this.d.f) {
                if (!((this.d.e & aak.UNWRAPPED_MASK) != 0 && Map.class.isAssignableFrom(field.getType()))) {
                    return;
                }
            }
            if (this.d.f25184a == null || this.d.f25184a.isEmpty()) {
                name = field.getName();
                String str = this.c;
                if (str != null) {
                    name = BeanUtils.c(name, str);
                }
            } else {
                name = this.d.f25184a;
            }
            String str2 = name;
            String[] strArr2 = this.g.r;
            if (strArr2 != null && strArr2.length > 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= strArr2.length) {
                        z = false;
                        break;
                    } else if (str2.equals(strArr2[i3])) {
                        this.d.d = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z && this.d.d == 0) {
                    this.d.d = strArr2.length;
                }
            }
            Class<?> type = field.getType();
            Type genericType = field.getGenericType();
            d a2 = cd.this.a(this.f2961a, this.b, str2, this.d.d, this.d.e, this.d.b, this.d.o, this.d.n, genericType, type, field, cd.a(this.f, genericType, type, this.d));
            d dVar = this.e.get(str2);
            if (dVar == null || a2.compareTo(dVar) > 0) {
                this.e.put(str2, a2);
            }
            if (this.d.g != null) {
                String[] strArr3 = this.d.g;
                int length = strArr3.length;
                int i4 = 0;
                while (i4 < length) {
                    String str3 = strArr3[i4];
                    if (!str2.equals(str3)) {
                        i = i4;
                        i2 = length;
                        strArr = strArr3;
                        d a3 = cd.this.a(this.f2961a, this.b, str3, this.d.d, this.d.e, (String) null, this.d.o, this.d.n, genericType, type, field, (bu) null);
                        if (this.e.get(str3) == null) {
                            this.e.put(str3, a3);
                        }
                    } else {
                        i = i4;
                        i2 = length;
                        strArr = strArr3;
                    }
                    i4 = i + 1;
                    length = i2;
                    strArr3 = strArr;
                }
            }
        }
    }

    static {
        kge.a(832476000);
        INSTANCE = new cd();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.alibaba.fastjson2.reader.bu a(com.alibaba.fastjson2.reader.ObjectReaderProvider r7, java.lang.reflect.Type r8, java.lang.Class r9, tb.aak r10) {
        /*
            com.alibaba.fastjson2.reader.bu r0 = r10.a()
            r1 = 0
            if (r0 != 0) goto L64
            java.lang.Class<?> r2 = r10.i
            if (r2 != 0) goto Lf
            java.lang.Class<?> r2 = r10.j
            if (r2 == 0) goto L64
        Lf:
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r2 = r2.isAssignableFrom(r9)
            if (r2 == 0) goto L64
            java.lang.Class<?> r2 = r10.i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L31
            java.lang.Class<?> r2 = r10.i     // Catch: java.lang.Exception -> L31
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r5)     // Catch: java.lang.Exception -> L31
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L31
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L31
            java.lang.Object r2 = r2.newInstance(r5)     // Catch: java.lang.Exception -> L31
            com.alibaba.fastjson2.reader.bu r2 = (com.alibaba.fastjson2.reader.bu) r2     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
            r2 = r4
        L32:
            java.lang.Class<?> r5 = r10.j
            if (r5 == 0) goto L4a
            java.lang.Class<?> r5 = r10.j     // Catch: java.lang.Exception -> L4a
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L4a
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch: java.lang.Exception -> L4a
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L4a
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L4a
            java.lang.Object r3 = r5.newInstance(r3)     // Catch: java.lang.Exception -> L4a
            com.alibaba.fastjson2.reader.bu r3 = (com.alibaba.fastjson2.reader.bu) r3     // Catch: java.lang.Exception -> L4a
            goto L4b
        L4a:
            r3 = r4
        L4b:
            if (r2 != 0) goto L4f
            if (r3 == 0) goto L64
        L4f:
            long r4 = r10.e
            com.alibaba.fastjson2.reader.bu r8 = com.alibaba.fastjson2.reader.du.a(r8, r9, r4)
            boolean r10 = r8 instanceof com.alibaba.fastjson2.reader.dy
            if (r10 == 0) goto L64
            com.alibaba.fastjson2.reader.dy r8 = (com.alibaba.fastjson2.reader.dy) r8
            if (r2 == 0) goto L5f
            r8.j = r2
        L5f:
            if (r3 == 0) goto L63
            r8.i = r3
        L63:
            return r8
        L64:
            if (r0 != 0) goto L93
            java.lang.Class<java.math.BigDecimal> r8 = java.math.BigDecimal.class
            if (r9 != r8) goto L75
            java.lang.Class<java.math.BigDecimal> r8 = java.math.BigDecimal.class
            com.alibaba.fastjson2.reader.bu r7 = r7.a(r8, r1)
            com.alibaba.fastjson2.reader.cg r8 = com.alibaba.fastjson2.reader.cg.f2964a
            if (r7 == r8) goto L93
            goto L92
        L75:
            java.lang.Class<java.math.BigInteger> r8 = java.math.BigInteger.class
            if (r9 != r8) goto L84
            java.lang.Class<java.math.BigInteger> r8 = java.math.BigInteger.class
            com.alibaba.fastjson2.reader.bu r7 = r7.a(r8, r1)
            com.alibaba.fastjson2.reader.ch r8 = com.alibaba.fastjson2.reader.ch.f2965a
            if (r7 == r8) goto L93
            goto L92
        L84:
            java.lang.Class<java.util.Date> r8 = java.util.Date.class
            if (r9 != r8) goto L93
            java.lang.Class<java.util.Date> r8 = java.util.Date.class
            com.alibaba.fastjson2.reader.bu r7 = r7.a(r8, r1)
            com.alibaba.fastjson2.reader.cq r8 = com.alibaba.fastjson2.reader.cq.INSTANCE
            if (r7 == r8) goto L93
        L92:
            r0 = r7
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cd.a(com.alibaba.fastjson2.reader.ObjectReaderProvider, java.lang.reflect.Type, java.lang.Class, tb.aak):com.alibaba.fastjson2.reader.bu");
    }

    public static /* synthetic */ Object a(Method method, Object obj) {
        try {
            return method.invoke(obj, new Object[0]);
        } catch (Throwable th) {
            throw new JSONException("create instance error", th);
        }
    }

    public static /* synthetic */ void a(Class cls, ObjectReaderProvider objectReaderProvider, Class cls2, aai aaiVar, String str, aak aakVar, Method method) {
        if (method.getReturnType() != cls) {
            return;
        }
        aak aakVar2 = new aak();
        objectReaderProvider.a(aakVar2, cls2, method);
        String str2 = aakVar2.f25184a;
        if (str2 == null) {
            str2 = BeanUtils.a(method, aaiVar.u, PropertyNamingStrategy.CamelCase.name());
        }
        if (aakVar2.k == null || !str.equals(str2)) {
            return;
        }
        aakVar.k = aakVar2.k;
    }

    public /* synthetic */ void a(aak aakVar, ObjectReaderProvider objectReaderProvider, Class cls, String str, Class cls2, aai aaiVar, int i, Map map, Type type, Method method) {
        int i2;
        String[] strArr;
        String str2;
        aakVar.b();
        objectReaderProvider.a(aakVar, cls, method);
        if (aakVar.f) {
            return;
        }
        String name = method.getName();
        if (aakVar.f25184a == null || aakVar.f25184a.isEmpty()) {
            if (!(name.length() <= str.length() || !name.startsWith(str, 0))) {
                name = BeanUtils.a(name, i);
            } else if (method.getDeclaringClass() == Object.class || method.getReturnType() != cls2) {
                return;
            } else {
                if (method.getAnnotation(JSONField.class) == null && (aaiVar.m & JSONReader.Feature.SupportSmartMatch.mask) == 0) {
                    return;
                }
            }
        } else {
            name = aakVar.f25184a;
        }
        String str3 = name;
        if (method.getParameterTypes().length == 0) {
            d a2 = a(cls2, cls2, str3, aakVar.d, aakVar.e, aakVar.b, aakVar.o, aakVar.n, method.getGenericReturnType(), method.getReturnType(), method, (bu) null);
            d dVar = (d) map.get(str3);
            if (dVar == null) {
                map.put(str3, a2);
                return;
            } else if (dVar.compareTo(a2) <= 0) {
                return;
            } else {
                map.put(str3, a2);
                return;
            }
        }
        Type type2 = method.getGenericParameterTypes()[0];
        Class<?> cls3 = method.getParameterTypes()[0];
        method.setAccessible(true);
        d a3 = a(cls2, type, str3, aakVar.d, aakVar.e, aakVar.b, aakVar.o, aakVar.n, type2, cls3, method, (bu) null);
        String str4 = str3;
        d dVar2 = (d) map.get(str4);
        if (dVar2 == null || dVar2.compareTo(a3) > 0) {
            map.put(str4, a3);
        }
        String[] strArr2 = aakVar.g;
        if (strArr2 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < strArr2.length) {
            String str5 = strArr2[i3];
            if (str4.equals(str5) || ((d) map.get(str5)) != null) {
                i2 = i3;
                strArr = strArr2;
                str2 = str4;
            } else {
                i2 = i3;
                strArr = strArr2;
                str2 = str4;
                map.put(str5, a(cls2, type, str5, aakVar.d, aakVar.e, aakVar.b, aakVar.o, aakVar.n, type2, cls3, method, (bu) null));
            }
            i3 = i2 + 1;
            strArr2 = strArr;
            str4 = str2;
        }
    }

    /* renamed from: lambda$H-KUIuaMKX5crIbMx3f8rUHwdjQ */
    public static /* synthetic */ void m213lambda$HKUIuaMKX5crIbMx3f8rUHwdjQ(List list, Constructor constructor) {
        list.add(constructor);
    }

    /* renamed from: lambda$RND4fxdJ04rHnv73LB-rPkyeF6I */
    public static /* synthetic */ Object m214lambda$RND4fxdJ04rHnv73LBrPkyeF6I(Method method, Object obj) {
        return a(method, obj);
    }

    public <T> com.alibaba.fastjson2.function.d<Map<Long, Object>, T> a(Constructor constructor, Constructor constructor2, String... strArr) {
        if (constructor2 == null) {
            constructor.setAccessible(true);
        } else {
            constructor2.setAccessible(true);
        }
        return new com.alibaba.fastjson2.reader.a(null, constructor, null, null, constructor2, strArr);
    }

    public <T, R> com.alibaba.fastjson2.function.d<T, R> a(final Method method) {
        method.setAccessible(true);
        return new com.alibaba.fastjson2.function.d() { // from class: com.alibaba.fastjson2.reader.-$$Lambda$cd$RND4fxdJ04rHnv73LB-rPkyeF6I
            @Override // com.alibaba.fastjson2.function.d
            public final Object apply(Object obj) {
                return cd.m214lambda$RND4fxdJ04rHnv73LBrPkyeF6I(method, obj);
            }
        };
    }

    public <T> com.alibaba.fastjson2.function.d<Map<Long, Object>, T> a(Method method, String... strArr) {
        method.setAccessible(true);
        return new c(method, strArr);
    }

    public <T> bu<T> a(Class<T> cls) {
        return a((Class) cls, (Type) cls, false, JSONFactory.defaultObjectReaderProvider);
    }

    public <T> bu<T> a(Class<T> cls, long j, Supplier<T> supplier, com.alibaba.fastjson2.function.d dVar, d... dVarArr) {
        return a(cls, (String) null, j, supplier, dVar, dVarArr);
    }

    public <T> bu<T> a(Class cls, com.alibaba.fastjson2.function.d<Map<Long, Object>, T> dVar, d... dVarArr) {
        return new el(cls, null, null, 0L, dVar, null, dVarArr, null, null, null);
    }

    public <T> bu<T> a(Class<T> cls, String str, long j, Supplier<T> supplier, com.alibaba.fastjson2.function.d dVar, d... dVarArr) {
        if (cls != null) {
            int modifiers = cls.getModifiers();
            if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
                return new cb(cls, str, null, j, supplier, dVar, dVarArr);
            }
        }
        switch (dVarArr.length) {
            case 1:
                return new bv(cls, null, null, j, supplier, dVar, dVarArr);
            case 2:
                return new bw(cls, null, null, j, supplier, dVar, dVarArr);
            case 3:
                return new bx(cls, null, null, j, supplier, dVar, dVarArr);
            case 4:
                return new by(cls, null, null, j, supplier, dVar, dVarArr);
            case 5:
                return new bz(cls, null, null, j, supplier, dVar, dVarArr);
            case 6:
                return new ca(cls, null, null, j, supplier, dVar, dVarArr);
            default:
                return new cb(cls, str, null, j, supplier, dVar, dVarArr);
        }
    }

    public <T> bu<T> a(Class<T> cls, String str, Class[] clsArr, String[] strArr, Class cls2, d... dVarArr) {
        return new en(cls, b(cls), str, clsArr, strArr, cls2, dVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00f0 A[LOOP:4: B:136:0x00ed->B:138:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.alibaba.fastjson2.reader.bu a(java.lang.Class r12, java.lang.reflect.Method r13, com.alibaba.fastjson2.reader.ObjectReaderProvider r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cd.a(java.lang.Class, java.lang.reflect.Method, com.alibaba.fastjson2.reader.ObjectReaderProvider):com.alibaba.fastjson2.reader.bu");
    }

    protected <T> bu<T> a(final Class<T> cls, final Type type, final ObjectReaderProvider objectReaderProvider, final aai aaiVar) {
        com.alibaba.fastjson2.function.d a2 = aaiVar.d != null ? a(aaiVar.d) : null;
        final Class<T> cls2 = aaiVar.c;
        String str = aaiVar.e;
        if (str == null || str.isEmpty()) {
            str = com.taobao.android.weex_framework.util.a.ATOM_with;
        }
        final String str2 = str;
        final int length = str2.length();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final aak aakVar = new aak();
        BeanUtils.a((Class) cls2, false, (com.alibaba.fastjson2.function.c<Method>) new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.reader.-$$Lambda$cd$NZ7ho2awsSIXUNKjaogh4fUI5Ec
            @Override // com.alibaba.fastjson2.function.c
            public final void accept(Object obj) {
                cd.this.a(aakVar, objectReaderProvider, cls, str2, cls2, aaiVar, length, linkedHashMap, type, (Method) obj);
            }
        });
        d[] dVarArr = new d[linkedHashMap.size()];
        linkedHashMap.values().toArray(dVarArr);
        Arrays.sort(dVarArr);
        return a(cls2, 0L, b(cls2), a2, dVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:400:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> com.alibaba.fastjson2.reader.bu<T> a(java.lang.Class<T> r26, java.lang.reflect.Type r27, boolean r28, com.alibaba.fastjson2.reader.ObjectReaderProvider r29) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cd.a(java.lang.Class, java.lang.reflect.Type, boolean, com.alibaba.fastjson2.reader.ObjectReaderProvider):com.alibaba.fastjson2.reader.bu");
    }

    public <T> bu<T> a(Constructor constructor, String... strArr) {
        com.alibaba.fastjson2.function.d<Map<Long, Object>, T> b2 = b(constructor, strArr);
        Class<T> declaringClass = constructor.getDeclaringClass();
        return a(declaringClass, b2, a(JSONFactory.defaultObjectReaderProvider, declaringClass, declaringClass, constructor, constructor.getParameterTypes(), strArr));
    }

    public <T> d a(Class<T> cls, Type type, String str, int i, long j, String str2, Type type2, Class cls2, String str3, Class cls3, bu buVar) {
        return a(cls, type, str, i, j, str2, null, null, type2, cls2, str3, cls3, buVar);
    }

    public <T> d a(Class<T> cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, Type type2, Class cls2, String str3, Class cls3, bu buVar) {
        Type type3;
        if (buVar != null) {
            bl blVar = new bl(str, type2, cls2, str3, i, j, str2, locale, obj);
            blVar.y = buVar;
            return blVar;
        } else if (type2 == Byte.TYPE || type2 == Byte.class) {
            return new bc(str, cls2, str3, i, j, str2, locale, obj);
        } else {
            if (type2 == Short.TYPE || type2 == Short.class) {
                return new al(str, cls2, str3, i, j, str2, locale, obj);
            }
            if (type2 == Integer.TYPE || type2 == Integer.class) {
                return new aq(str, cls2, str3, i, j, str2, locale, obj);
            }
            if (type2 == Long.TYPE || type2 == Long.class) {
                return new aw(str, cls2, str3, i, j, str2, locale, obj);
            }
            Class<?> cls4 = null;
            if ((type2 instanceof Class) || type == null) {
                type3 = null;
            } else {
                type3 = BeanUtils.a((com.alibaba.fastjson2.t) com.alibaba.fastjson2.t.a(type), (Class<?>) cls, cls3, type2);
                if (type3 != null) {
                    cls4 = TypeUtils.b(type3);
                }
            }
            return new bl(str, type3 == null ? type2 : type3, cls4 == null ? cls2 : cls4, str3, i, j, str2, locale, obj);
        }
    }

    public <T> d<T> a(Class cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, Type type2, Class cls2, Field field, bu buVar) {
        Type type3;
        Class<?> cls3;
        Object obj2 = obj;
        if ((obj2 instanceof String) && cls2.isEnum()) {
            obj2 = Enum.valueOf(cls2, (String) obj2);
        }
        if (obj2 != null && obj2.getClass() != cls2) {
            com.alibaba.fastjson2.function.d a2 = JSONFactory.c().a(obj2.getClass(), type2);
            if (a2 == null) {
                throw new JSONException("illegal defaultValue : " + obj2 + ", class " + cls2.getName());
            }
            obj2 = a2.apply(obj2);
        }
        Object obj3 = obj2;
        if (field != null && !cls.getName().startsWith("java.lang", 0)) {
            field.setAccessible(true);
        }
        if (buVar != null) {
            bk bkVar = new bk(str, type2, cls2, i, j | aak.READ_USING_MASK, str2, obj3, field);
            bkVar.y = buVar;
            return bkVar;
        } else if (cls2 == Integer.TYPE) {
            return new as(str, cls2, i, str2, (Integer) obj3, field);
        } else {
            if (cls2 == Integer.class) {
                return new ao(str, cls2, i, j, str2, (Integer) obj3, field);
            }
            if (cls2 == Long.TYPE) {
                return new ay(str, cls2, i, j, str2, (Long) obj3, field);
            }
            if (cls2 == Long.class) {
                return new au(str, cls2, i, j, str2, (Long) obj3, field);
            }
            if (cls2 == Short.TYPE) {
                return new am(str, cls2, i, j, str2, (Short) obj3, field);
            }
            if (cls2 == Short.class) {
                return new aj(str, cls2, i, j, str2, (Short) obj3, field);
            }
            if (cls2 == Boolean.TYPE) {
                return new u(str, i, j, str2, (Boolean) obj3, field);
            }
            if (cls2 == Boolean.class) {
                return new s(str, cls2, i, j, str2, (Boolean) obj3, field);
            }
            if (cls2 == Byte.TYPE) {
                return new bd(str, cls2, i, j, str2, (Byte) obj3, field);
            }
            if (cls2 == Byte.class) {
                return new ba(str, cls2, i, j, str2, (Byte) obj3, field);
            }
            if (cls2 == Float.TYPE) {
                return new ah(str, cls2, i, j, str2, (Float) obj3, field);
            }
            if (cls2 == Float.class) {
                return new af(str, cls2, i, j, str2, (Float) obj3, field);
            }
            if (cls2 == Double.TYPE) {
                return new ad(str, cls2, i, j, str2, (Double) obj3, field);
            }
            if (cls2 == Double.class) {
                return new ab(str, cls2, i, j, str2, (Double) obj3, field);
            }
            if (cls2 == Character.TYPE) {
                return new w(str, i, j, str2, (Character) obj3, field);
            }
            if (cls2 == BigDecimal.class) {
                return new o(str, cls2, i, j, str2, (BigDecimal) obj3, field);
            }
            if (cls2 == BigInteger.class) {
                return new q(str, cls2, i, j, str2, (BigInteger) obj3, field);
            }
            if (cls2 == String.class) {
                return new bo(str, cls2, i, j, str2, (String) obj3, field);
            }
            if (cls2 == Date.class) {
                return new z(str, type2, cls2, i, j, str2, locale, obj3, field, null, null);
            }
            if (cls2 == AtomicBoolean.class) {
                return new f(str, cls2, i, str2, (AtomicBoolean) obj3, field);
            }
            if (cls2 == AtomicReference.class) {
                return new m(str, type2, cls2, i, str2, field);
            }
            Type type4 = null;
            if (!(type2 instanceof Class)) {
                type3 = BeanUtils.a(com.alibaba.fastjson2.t.a(type), cls, field, type2);
                cls3 = TypeUtils.b(type3);
            } else {
                type3 = null;
                cls3 = null;
            }
            boolean isFinal = Modifier.isFinal(field.getModifiers());
            if (!Collection.class.isAssignableFrom(cls2)) {
                if (Map.class.isAssignableFrom(cls2) && (type3 instanceof ParameterizedType) && ((ParameterizedType) type3).getActualTypeArguments().length == 2 && isFinal && (j & JSONReader.Feature.FieldBased.mask) == 0) {
                    return new bh(str, type3, cls3, i, j, str2, field);
                }
                if (isFinal) {
                    if (cls2 == int[].class) {
                        return new ar(str, cls2, i, j, str2, (int[]) obj3, field);
                    }
                    if (cls2 == long[].class) {
                        return new ax(str, cls2, i, j, str2, (long[]) obj3, field);
                    }
                }
                return cls3 != null ? ((j & aak.UNWRAPPED_MASK) == 0 || !Map.class.isAssignableFrom(cls3)) ? new bk(str, type3, cls2, i, j, str2, obj3, field) : new bh(str, type3, cls2, i, j, str2, field) : new bk(str, type2, cls2, i, j, str2, obj3, field);
            }
            if (type3 instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type3).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    Type type5 = actualTypeArguments[0];
                    Class<?> b2 = TypeUtils.b(type5);
                    if (b2 != String.class) {
                        return new bg(str, type3, cls3, type5, b2, i, j, str2, locale, (Collection) obj3, field);
                    }
                    if (isFinal && (j & JSONReader.Feature.FieldBased.mask) == 0) {
                        return new x(str, type3, cls3, i, j, str2, field);
                    }
                    return new bg(str, type3, cls3, String.class, String.class, i, j, str2, locale, null, field);
                }
            }
            if (type2 instanceof ParameterizedType) {
                Type[] actualTypeArguments2 = ((ParameterizedType) type2).getActualTypeArguments();
                if (actualTypeArguments2.length > 0) {
                    type4 = actualTypeArguments2[0];
                }
            }
            Class cls4 = type4 == null ? Object.class : type4;
            return new bg(str, type2, cls2, cls4, TypeUtils.e(cls4), i, j, str2, locale, (Collection) obj3, field);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:368:0x0405  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> com.alibaba.fastjson2.reader.d a(java.lang.Class<T> r17, java.lang.reflect.Type r18, java.lang.String r19, int r20, long r21, java.lang.String r23, java.util.Locale r24, java.lang.Object r25, java.lang.reflect.Type r26, java.lang.Class r27, java.lang.reflect.Method r28, com.alibaba.fastjson2.reader.bu r29) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cd.a(java.lang.Class, java.lang.reflect.Type, java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Method, com.alibaba.fastjson2.reader.bu):com.alibaba.fastjson2.reader.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson2.reader.d[] a(com.alibaba.fastjson2.reader.ObjectReaderProvider r30, java.lang.Class r31, java.lang.reflect.Type r32, java.lang.reflect.AccessibleObject r33, java.lang.Class[] r34, java.lang.String... r35) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.cd.a(com.alibaba.fastjson2.reader.ObjectReaderProvider, java.lang.Class, java.lang.reflect.Type, java.lang.reflect.AccessibleObject, java.lang.Class[], java.lang.String[]):com.alibaba.fastjson2.reader.d[]");
    }

    protected <T> d[] a(Class<T> cls, Type type, aai aaiVar, boolean z, ObjectReaderProvider objectReaderProvider) {
        aai aaiVar2;
        if (aaiVar == null) {
            aai aaiVar3 = new aai();
            objectReaderProvider.a(aaiVar3, (Class<?>) cls);
            aaiVar2 = aaiVar3;
        } else {
            aaiVar2 = aaiVar;
        }
        String str = aaiVar2.p;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        aak aakVar = new aak();
        String[] strArr = aaiVar2.r;
        b bVar = new b(cls, type, str, aakVar, linkedHashMap, objectReaderProvider, aaiVar2, z);
        if (z) {
            BeanUtils.a((Class) cls, (com.alibaba.fastjson2.function.c<Field>) bVar);
        } else {
            BeanUtils.a((Class) cls, (com.alibaba.fastjson2.function.c<Field>) bVar);
            a aVar = new a(cls, type, str, strArr, aaiVar2, aakVar, linkedHashMap, objectReaderProvider);
            BeanUtils.a(cls, aaiVar2, objectReaderProvider.j.get(cls), aVar);
            if (cls.isInterface()) {
                BeanUtils.e(cls, aVar);
            }
        }
        d[] dVarArr = new d[linkedHashMap.size()];
        linkedHashMap.values().toArray(dVarArr);
        Arrays.sort(dVarArr);
        return dVarArr;
    }

    public <T> Supplier<T> b(Class<T> cls) {
        if (!cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return new com.alibaba.fastjson2.reader.b(declaredConstructor);
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                throw new JSONException("get constructor error, class " + cls.getName(), th);
            }
        }
        return null;
    }

    public <T> com.alibaba.fastjson2.function.d<Map<Long, Object>, T> b(Constructor constructor, String... strArr) {
        constructor.setAccessible(true);
        return new com.alibaba.fastjson2.reader.a(null, constructor, null, null, null, strArr);
    }

    protected <T> bu<T> b(final Class<T> cls, Type type, final ObjectReaderProvider objectReaderProvider, final aai aaiVar) {
        Class<?>[] parameterTypes;
        Class<?> declaringClass;
        String[] strArr;
        Type[] genericParameterTypes;
        Annotation[][] parameterAnnotations;
        String[] strArr2;
        LinkedHashMap linkedHashMap;
        aak aakVar;
        boolean z;
        int i;
        Class<?>[] clsArr;
        String[] strArr3;
        com.alibaba.fastjson2.function.d<Map<Long, Object>, T> a2;
        d[] dVarArr;
        int i2;
        String[] strArr4;
        String str;
        aak aakVar2;
        Class cls2 = cls;
        ObjectReaderProvider objectReaderProvider2 = objectReaderProvider;
        aai aaiVar2 = aaiVar;
        aak aakVar3 = new aak();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (aaiVar2.i != null) {
            parameterTypes = aaiVar2.i.getParameterTypes();
            declaringClass = aaiVar2.i.getDeclaringClass();
            strArr = BeanUtils.a(aaiVar2.i);
            genericParameterTypes = aaiVar2.i.getGenericParameterTypes();
            parameterAnnotations = aaiVar2.i.getParameterAnnotations();
        } else {
            parameterTypes = aaiVar2.k.getParameterTypes();
            declaringClass = aaiVar2.k.getDeclaringClass();
            strArr = new String[parameterTypes.length];
            genericParameterTypes = aaiVar2.k.getGenericParameterTypes();
            parameterAnnotations = aaiVar2.k.getParameterAnnotations();
        }
        Class<?>[] clsArr2 = parameterTypes;
        Class<?> cls3 = declaringClass;
        String[] strArr5 = strArr;
        Type[] typeArr = genericParameterTypes;
        Annotation[][] annotationArr = parameterAnnotations;
        int i3 = 0;
        while (true) {
            if (i3 >= clsArr2.length) {
                strArr2 = strArr5;
                linkedHashMap = linkedHashMap2;
                aakVar = aakVar3;
                z = true;
                i = 0;
                clsArr = clsArr2;
                break;
            }
            aakVar3.b();
            if (aaiVar2.i != null) {
                z = true;
                objectReaderProvider.a(aakVar3, cls, aaiVar2.i, i3, annotationArr);
            } else {
                z = true;
                objectReaderProvider2.a(aakVar3, cls2, aaiVar2.k, i3);
            }
            if (clsArr2.length == z && (aakVar3.e & aak.VALUE_MASK) != 0) {
                strArr2 = strArr5;
                clsArr = clsArr2;
                linkedHashMap = linkedHashMap2;
                aakVar = aakVar3;
                i = 0;
                break;
            }
            String str2 = aakVar3.f25184a;
            if (str2 == null || str2.isEmpty()) {
                if (aaiVar2.l != null && i3 < aaiVar2.l.length) {
                    str2 = aaiVar2.l[i3];
                }
                if (str2 == null || str2.isEmpty()) {
                    str2 = IWXUserTrackAdapter.MONITOR_ARG + i3;
                }
            }
            if (!str2.startsWith(IWXUserTrackAdapter.MONITOR_ARG, 0)) {
                strArr5[i3] = str2;
            } else if (strArr5.length > i3) {
                str2 = strArr5[i3];
            }
            final String str3 = str2;
            final Class<?> cls4 = clsArr2[i3];
            String[] strArr6 = strArr5;
            int i4 = i3;
            final aak aakVar4 = aakVar3;
            BeanUtils.e(cls2, new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.reader.-$$Lambda$cd$ou8sUfGlZ4EcL-x8A8DY2Fyjkxg
                @Override // com.alibaba.fastjson2.function.c
                public final void accept(Object obj) {
                    cd.a(cls4, objectReaderProvider, cls, aaiVar, str3, aakVar4, (Method) obj);
                }
            });
            String str4 = (str3 == null || str3.isEmpty()) ? IWXUserTrackAdapter.MONITOR_ARG + i4 : str3;
            Type type2 = typeArr[i4];
            bu a3 = a(objectReaderProvider2, type2, cls4, aakVar3);
            String str5 = str4;
            Class<?>[] clsArr3 = clsArr2;
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            aak aakVar5 = aakVar3;
            d a4 = a(cls, type, str4, i4, aakVar3.e, aakVar3.b, type2, cls4, str5, cls3, a3);
            String str6 = str5;
            linkedHashMap3.put(str6, a4);
            String[] strArr7 = aakVar5.g;
            if (strArr7 != null) {
                int i5 = 0;
                while (i5 < strArr7.length) {
                    String str7 = strArr7[i5];
                    if (str6.equals(str7) || ((d) linkedHashMap3.get(str7)) != null) {
                        i2 = i5;
                        strArr4 = strArr7;
                        str = str6;
                        aakVar2 = aakVar5;
                    } else {
                        aakVar2 = aakVar5;
                        i2 = i5;
                        strArr4 = strArr7;
                        str = str6;
                        linkedHashMap3.put(str7, a(cls, type, str7, i4, aakVar5.e, aakVar5.b, type2, cls4, str6, cls3, null));
                    }
                    i5 = i2 + 1;
                    aakVar5 = aakVar2;
                    strArr7 = strArr4;
                    str6 = str;
                }
            }
            aak aakVar6 = aakVar5;
            i3 = i4 + 1;
            objectReaderProvider2 = objectReaderProvider;
            aaiVar2 = aaiVar;
            linkedHashMap2 = linkedHashMap3;
            strArr5 = strArr6;
            clsArr2 = clsArr3;
            aakVar3 = aakVar6;
            cls2 = cls;
        }
        if (clsArr.length == z) {
            aak aakVar7 = aakVar;
            if ((aakVar7.e & aak.VALUE_MASK) != 0) {
                Type type3 = aaiVar.i == null ? aaiVar.k.getGenericParameterTypes()[i] : typeArr[i];
                Class<?> cls5 = aaiVar.i == null ? aaiVar.k.getParameterTypes()[i] : aaiVar.i.getParameterTypes()[i];
                Object obj = aakVar7.n;
                if (obj != null && obj.getClass() != cls5) {
                    com.alibaba.fastjson2.function.d a5 = JSONFactory.c().a(obj.getClass(), type3);
                    if (a5 == null) {
                        throw new JSONException("illegal defaultValue : " + obj + ", class " + cls5.getName());
                    }
                    obj = a5.apply(obj);
                }
                return new eh(cls, type3, cls5, aakVar7.e, aakVar7.b, obj, aaiVar.i, aaiVar.k, null);
            }
        }
        if (aaiVar.i != null) {
            strArr3 = strArr2;
            a2 = a(aaiVar.i, aaiVar.j, strArr3);
        } else {
            strArr3 = strArr2;
            a2 = a(aaiVar.k, strArr3);
        }
        com.alibaba.fastjson2.function.d<Map<Long, Object>, T> dVar = a2;
        d[] dVarArr2 = new d[linkedHashMap.size()];
        linkedHashMap.values().toArray(dVarArr2);
        Arrays.sort(dVarArr2);
        d[] a6 = a((Class) cls, type, (aai) null, false, objectReaderProvider);
        Arrays.sort(a6);
        boolean[] zArr = null;
        int i6 = 0;
        for (int i7 = 0; i7 < a6.length; i7++) {
            if (linkedHashMap.containsKey(a6[i7].b)) {
                if (zArr == null) {
                    zArr = new boolean[a6.length];
                }
                zArr[i7] = z;
                i6++;
            }
        }
        if (i6 > 0) {
            d[] dVarArr3 = new d[a6.length - i6];
            for (int i8 = 0; i8 < a6.length; i8++) {
                if (!zArr[i8]) {
                    dVarArr3[i] = a6[i8];
                    i++;
                }
            }
            dVarArr = dVarArr3;
        } else {
            dVarArr = a6;
        }
        return new el(cls, aaiVar.f25182a, aaiVar.b, aaiVar.m, dVar, strArr3, dVarArr2, dVarArr, aaiVar.f, aaiVar.g);
    }
}
