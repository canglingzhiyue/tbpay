package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.t;
import com.alibaba.fastjson2.writer.du;
import com.taobao.media.MediaConstant;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import tb.aai;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class BeanUtils {

    /* renamed from: a */
    static final AtomicReference<char[]> f3025a;
    static final i[] b;
    static final Type[] c;
    static final ConcurrentMap<Class, Field[]> d;
    static final ConcurrentMap<Class, Map<String, Field>> e;
    static final ConcurrentMap<Class, Field[]> f;
    static final ConcurrentMap<Class, Method[]> g;
    static final ConcurrentMap<Class, Constructor[]> h;
    private static volatile boolean i;
    private static volatile Constructor<?> j;
    private static volatile Method k;
    private static volatile Method l;
    private static volatile Method m;
    private static volatile boolean n;

    /* loaded from: classes2.dex */
    public static final class GenericArrayTypeImpl implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        static {
            kge.a(-888985718);
            kge.a(-1710753758);
            kge.a(1028243835);
        }

        public GenericArrayTypeImpl(Type type) {
            this.componentType = BeanUtils.d(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && BeanUtils.a((Type) this, (Type) ((GenericArrayType) obj));
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return BeanUtils.f(this.componentType) + MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParameterizedTypeImpl implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        static {
            kge.a(-1909228571);
            kge.a(-1358034611);
            kge.a(1028243835);
        }

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                BeanUtils.a(z);
            }
            this.ownerType = type == null ? null : BeanUtils.d(type);
            this.rawType = BeanUtils.d(type2);
            this.typeArguments = (Type[]) typeArr.clone();
            int length = this.typeArguments.length;
            for (int i = 0; i < length; i++) {
                BeanUtils.b(this.typeArguments[i]);
                BeanUtils.g(this.typeArguments[i]);
                Type[] typeArr2 = this.typeArguments;
                typeArr2[i] = BeanUtils.d(typeArr2[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && BeanUtils.a((Type) this, (Type) ((ParameterizedType) obj));
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ BeanUtils.a((Object) this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return BeanUtils.f(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(BeanUtils.f(this.rawType));
            sb.append("<");
            sb.append(BeanUtils.f(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(BeanUtils.f(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class WildcardTypeImpl implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        static {
            kge.a(1313473954);
            kge.a(-1118548422);
            kge.a(1028243835);
        }

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Type d;
            boolean z = true;
            BeanUtils.a(typeArr2.length <= 1);
            BeanUtils.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                BeanUtils.b(typeArr2[0]);
                BeanUtils.g(typeArr2[0]);
                BeanUtils.a(typeArr[0] != Object.class ? false : z);
                this.lowerBound = BeanUtils.d(typeArr2[0]);
                d = Object.class;
            } else {
                BeanUtils.b(typeArr[0]);
                BeanUtils.g(typeArr[0]);
                this.lowerBound = null;
                d = BeanUtils.d(typeArr[0]);
            }
            this.upperBound = d;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && BeanUtils.a((Type) this, (Type) ((WildcardType) obj));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : BeanUtils.c;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.lowerBound != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.lowerBound;
            } else if (this.upperBound == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.upperBound;
            }
            sb.append(BeanUtils.f(type));
            return sb.toString();
        }
    }

    static {
        kge.a(-500861482);
        f3025a = new AtomicReference<>();
        b = new i[2048];
        c = new Type[0];
        d = new ConcurrentHashMap();
        e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
        g = new ConcurrentHashMap();
        h = new ConcurrentHashMap();
    }

    static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static int a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    private static Class<?> a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static String a(String str, int i2) {
        int length = str.length();
        char[] cArr = new char[length - i2];
        str.getChars(i2, length, cArr, 0);
        char c2 = cArr[0];
        boolean z = true;
        if (cArr.length <= 1 || cArr[1] < 'A' || cArr[1] > 'Z') {
            z = false;
        }
        if (c2 >= 'A' && c2 <= 'Z' && !z) {
            cArr[0] = (char) (c2 + ' ');
        }
        return new String(cArr);
    }

    static String a(String str, int i2, char c2) {
        int i3;
        char charAt;
        char charAt2;
        int i4;
        int i5;
        char charAt3;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i8 = i2;
        int i9 = 0;
        while (i8 < length) {
            try {
                char charAt6 = str.charAt(i8);
                if (i8 == i2) {
                    if (charAt6 >= 'a' && charAt6 <= 'z' && (i7 = i8 + 1) < length && (charAt5 = str.charAt(i7)) >= 'a' && charAt5 <= 'z') {
                        charAt6 = (char) (charAt6 - ' ');
                    } else if (charAt6 == '_' && (i6 = i8 + 1) < length && (charAt4 = str.charAt(i6)) >= 'a' && charAt4 <= 'z') {
                        andSet[i9] = charAt6;
                        charAt6 = (char) (charAt4 - ' ');
                        i9++;
                        i8 = i6;
                    }
                } else if (charAt6 < 'A' || charAt6 > 'Z' || (i5 = i8 + 1) >= length || ((charAt3 = str.charAt(i5)) >= 'A' && charAt3 <= 'Z')) {
                    if (charAt6 >= 'A' && charAt6 <= 'Z' && i8 > i2 && (i3 = i8 + 1) < length && (charAt = str.charAt(i3)) >= 'A' && charAt <= 'Z' && (charAt2 = str.charAt(i8 - 1)) >= 'a' && charAt2 <= 'z') {
                        i4 = i9 + 1;
                        andSet[i9] = c2;
                        i9 = i4;
                    }
                } else if (i8 > i2) {
                    i4 = i9 + 1;
                    andSet[i9] = c2;
                    i9 = i4;
                }
                andSet[i9] = charAt6;
                i8++;
                i9++;
            } finally {
                TypeUtils.e.set(TypeUtils.d, andSet);
            }
        }
        return new String(andSet, 0, i9);
    }

    private static String a(String str, int i2, int i3) {
        char c2;
        char[] cArr = new char[i2 - i3];
        str.getChars(i3, i2, cArr, 0);
        char c3 = cArr[0];
        if (c3 >= 'a' && c3 <= 'z' && cArr.length > 1) {
            cArr[0] = (char) (c3 - ' ');
        } else if (c3 == '_' && cArr.length > 2 && (c2 = cArr[1]) >= 'a' && c2 <= 'z' && cArr[2] >= 'a' && cArr[2] <= 'z') {
            cArr[1] = (char) (c2 - ' ');
        }
        return new String(cArr);
    }

    static String a(String str, int i2, boolean z) {
        int i3;
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i4 = i2;
        int i5 = 0;
        while (i4 < length) {
            try {
                char charAt = str.charAt(i4);
                if (z) {
                    if (charAt >= 'A' && charAt <= 'Z') {
                        if (i4 > i2) {
                            andSet[i5] = '_';
                            i5++;
                        }
                    }
                    if (charAt >= 'a' && charAt <= 'z') {
                        i3 = charAt - ' ';
                        charAt = (char) i3;
                    }
                } else if (charAt >= 'A' && charAt <= 'Z') {
                    if (i4 > i2) {
                        andSet[i5] = '_';
                        i5++;
                    }
                    i3 = charAt + ' ';
                    charAt = (char) i3;
                }
                andSet[i5] = charAt;
                i4++;
                i5++;
            } finally {
                TypeUtils.e.set(TypeUtils.d, andSet);
            }
        }
        return new String(andSet, 0, i5);
    }

    public static String a(String str, String str2) {
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        if (length <= 3) {
            return str;
        }
        int i2 = str.startsWith("set", 0) ? 3 : 0;
        char c2 = 65535;
        boolean z = true;
        switch (str2.hashCode()) {
            case -2068429102:
                if (str2.equals("UpperCase")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1112704575:
                if (str2.equals("NeverUseThisValueExceptDefaultValue")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1336502620:
                if (str2.equals("PascalCase")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1655544038:
                if (str2.equals("CamelCase")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1976554305:
                if (str2.equals("UpperCaseWithUnderScores")) {
                    c2 = 4;
                    break;
                }
                break;
            case 2087942256:
                if (str2.equals("SnakeCase")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        if (c2 == 0 || c2 == 1) {
            char[] cArr = new char[length - i2];
            str.getChars(i2, length, cArr, 0);
            char c3 = cArr[0];
            if (cArr.length <= 1 || cArr[1] < 'A' || cArr[1] > 'Z') {
                z = false;
            }
            if (c3 >= 'A' && c3 <= 'Z' && !z) {
                cArr[0] = (char) (c3 + ' ');
            }
            return new String(cArr);
        } else if (c2 == 2) {
            return a(str, length, i2);
        } else {
            if (c2 == 3) {
                return b(str, i2);
            }
            if (c2 == 4) {
                return a(str, i2, true);
            }
            if (c2 != 5) {
                throw new JSONException("TODO : " + str2);
            }
            char[] cArr2 = new char[length - i2];
            str.getChars(i2, length, cArr2, 0);
            char c4 = cArr2[0];
            for (int i3 = 0; i3 < cArr2.length; i3++) {
                char c5 = cArr2[i3];
                if (c5 >= 'a' && c4 <= 'z') {
                    cArr2[i3] = (char) (c5 - ' ');
                }
            }
            return new String(cArr2);
        }
    }

    public static String a(Method method, boolean z, String str) {
        Class<?> returnType;
        String name = method.getName();
        if (!name.startsWith("is") || (((returnType = method.getReturnType()) == Boolean.class || returnType == Boolean.TYPE) && !z)) {
            String b2 = b(name, str);
            if (b2.length() <= 2 || b2.charAt(0) < 'A' || b2.charAt(0) > 'Z' || b2.charAt(1) < 'A' || b2.charAt(1) > 'Z') {
                return b2;
            }
            char[] charArray = b2.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            Field b3 = b((Class) method.getDeclaringClass(), new String(charArray));
            return (b3 == null || !Modifier.isPublic(b3.getModifiers())) ? b2 : b3.getName();
        }
        return name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <A extends Annotation> A a(Annotation annotation, Class<A> cls) {
        if (annotation != 0) {
            if (cls == null) {
                throw new NullPointerException("annotationType must not be null");
            }
            if (annotation.annotationType() != cls) {
                return null;
            }
            return annotation;
        }
        throw new NullPointerException("annotation must not be null");
    }

    public static <A extends Annotation> A a(AnnotatedElement annotatedElement, Class<A> cls) {
        if (cls != null) {
            return (A) annotatedElement.getAnnotation(cls);
        }
        throw new NullPointerException("annotationType must not be null");
    }

    public static Constructor a(Class cls, boolean z) {
        Class<?> declaringClass;
        if (cls == StackTraceElement.class) {
            return null;
        }
        Constructor[] constructorArr = h.get(cls);
        if (constructorArr == null) {
            constructorArr = cls.getDeclaredConstructors();
            h.put(cls, constructorArr);
        }
        for (Constructor<?> constructor : constructorArr) {
            if (constructor.getParameterTypes().length == 0) {
                return constructor;
            }
        }
        if (z && (declaringClass = cls.getDeclaringClass()) != null) {
            for (Constructor<?> constructor2 : constructorArr) {
                if (constructor2.getParameterTypes().length == 1 && declaringClass.equals(constructor2.getParameterTypes()[0])) {
                    return constructor2;
                }
            }
        }
        return null;
    }

    public static GenericArrayType a(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    public static Member a(Class cls, Object obj) {
        boolean z;
        Class<?> declaringClass;
        Field b2;
        if (cls == null) {
            return null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Method[] methodArr = g.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            g.put(cls, methodArr);
        }
        for (final Method method : methodArr) {
            if (method.getReturnType() != Void.class && (declaringClass = method.getDeclaringClass()) != Enum.class && declaringClass != Object.class) {
                final String name = method.getName();
                if (!name.equals("values") && method.getParameterTypes().length == 0) {
                    if (a((AnnotatedElement) method)) {
                        return method;
                    }
                    if (name.startsWith("get", 0) && (b2 = b(cls, b(name, (String) null))) != null && a((AnnotatedElement) b2)) {
                        return method;
                    }
                    final AtomicReference atomicReference = new AtomicReference();
                    for (Class<?> cls2 : interfaces) {
                        e(cls2, new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.util.-$$Lambda$BeanUtils$IT6AizFULOCK1B8NDDtNKSjisBk
                            @Override // com.alibaba.fastjson2.function.c
                            public final void accept(Object obj2) {
                                BeanUtils.lambda$IT6AizFULOCK1B8NDDtNKSjisBk(name, atomicReference, method, (Method) obj2);
                            }
                        });
                        Class a2 = obj instanceof ObjectReaderProvider ? ((ObjectReaderProvider) obj).a((Class) cls2) : (obj instanceof du ? (du) obj : JSONFactory.defaultObjectWriterProvider).a(cls2);
                        if (a2 != null) {
                            e(a2, new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.util.-$$Lambda$BeanUtils$9NEBNa1HyRMCb5_OEJMFhO5SC2E
                                @Override // com.alibaba.fastjson2.function.c
                                public final void accept(Object obj2) {
                                    BeanUtils.lambda$9NEBNa1HyRMCb5_OEJMFhO5SC2E(name, atomicReference, method, (Method) obj2);
                                }
                            });
                        }
                    }
                    Member member = (Member) atomicReference.get();
                    if (member != null) {
                        return member;
                    }
                }
            }
        }
        Field[] fieldArr = d.get(cls);
        if (fieldArr == null) {
            fieldArr = cls.getFields();
            d.put(cls, fieldArr);
        }
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        for (Field field : fieldArr) {
            if (enumArr != null) {
                String name2 = field.getName();
                for (Enum r8 : enumArr) {
                    if (name2.equals(r8.name())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (a((AnnotatedElement) field) && !z) {
                return field;
            }
        }
        return null;
    }

    public static Method a(Class cls, String str) {
        Method[] methodArr = g.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            g.put(cls, methodArr);
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    public static Method a(Class cls, Method method) {
        boolean z;
        if (cls != null && cls != Object.class && cls != Serializable.class) {
            Method[] methodArr = g.get(cls);
            if (methodArr == null) {
                methodArr = cls.getMethods();
                g.put(cls, methodArr);
            }
            for (Method method2 : methodArr) {
                if (method2.getName().equals(method.getName()) && method2.getParameterTypes().length == method.getParameterTypes().length) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= parameterTypes.length) {
                            z = true;
                            break;
                        } else if (!parameterTypes[i2].equals(parameterTypes2[i2])) {
                            z = false;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z) {
                        return method2;
                    }
                }
            }
        }
        return null;
    }

    public static ParameterizedType a(Type type, Type type2, Type... typeArr) {
        return new ParameterizedTypeImpl(type, type2, typeArr);
    }

    public static Type a(t tVar, Class<?> cls, Class cls2, Type type) {
        while (cls != Object.class) {
            if (cls2 == cls) {
                return a(tVar.a(), cls2, type, new HashMap());
            }
            tVar = t.a(a(tVar.a(), cls, cls.getGenericSuperclass(), new HashMap()));
            cls = tVar.b();
        }
        return null;
    }

    public static Type a(t tVar, Class<?> cls, Member member, Type type) {
        Class<?> declaringClass = member == null ? null : member.getDeclaringClass();
        while (cls != Object.class) {
            Type a2 = tVar == null ? null : tVar.a();
            if (declaringClass != cls) {
                Type genericSuperclass = cls.getGenericSuperclass();
                if (genericSuperclass == null) {
                    break;
                }
                tVar = t.a(a(a2, cls, genericSuperclass, new HashMap()));
                cls = tVar.b();
            } else {
                return a(a2, declaringClass, type, new HashMap());
            }
        }
        return null;
    }

    static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (interfaces[i2] == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(interfaces[i2])) {
                    return a(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (cls != null && !cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return a(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x005c, code lost:
        if (a((java.lang.Object) r1, (java.lang.Object) r9) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00d8, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00da, code lost:
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00dd, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type a(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            r0 = 0
        L1:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L25
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L16
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L15
            return r11
        L15:
            return r2
        L16:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L1e
            r0 = r1
        L1e:
            java.lang.reflect.Type r11 = a(r9, r10, r1)
            if (r11 == r1) goto Ld8
            goto L1
        L25:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L4a
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L4a
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = a(r9, r10, r11, r12)
            boolean r10 = a(r11, r9)
            if (r10 == 0) goto L43
            r11 = r1
            goto Ld8
        L43:
            java.lang.reflect.GenericArrayType r9 = a(r9)
        L47:
            r11 = r9
            goto Ld8
        L4a:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L60
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = a(r9, r10, r1, r12)
            boolean r10 = a(r1, r9)
            if (r10 == 0) goto L43
            goto Ld8
        L60:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto La6
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = a(r9, r10, r1, r12)
            boolean r1 = a(r4, r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L7a:
            if (r2 >= r6) goto L9b
            r7 = r5[r2]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r7 == r8) goto L98
            java.lang.reflect.Type r8 = a(r9, r10, r7, r12)
            boolean r7 = a(r8, r7)
            if (r7 != 0) goto L98
            if (r1 != 0) goto L96
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = 1
        L96:
            r5[r2] = r8
        L98:
            int r2 = r2 + 1
            goto L7a
        L9b:
            if (r1 == 0) goto Ld8
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = a(r4, r9, r5)
            goto L47
        La6:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Ld8
            r1 = r11
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r4 = r1.getLowerBounds()
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            int r5 = r4.length
            if (r5 != r3) goto Lc7
            r1 = r4[r2]
            java.lang.reflect.Type r9 = a(r9, r10, r1, r12)
            r10 = r4[r2]
            if (r9 == r10) goto Ld8
            java.lang.reflect.WildcardType r11 = c(r9)
            goto Ld8
        Lc7:
            int r4 = r1.length
            if (r4 != r3) goto Ld8
            r3 = r1[r2]
            java.lang.reflect.Type r9 = a(r9, r10, r3, r12)     // Catch: java.lang.Throwable -> Lde
            r10 = r1[r2]
            if (r9 == r10) goto Ld8
            java.lang.reflect.WildcardType r11 = b(r9)
        Ld8:
            if (r0 == 0) goto Ldd
            r12.put(r0, r11)
        Ldd:
            return r11
        Lde:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    static Type a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a2 = a(typeVariable);
        if (a2 == null) {
            return typeVariable;
        }
        Type a3 = a(type, cls, a2);
        if (!(a3 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a3).getActualTypeArguments()[a((Object[]) a2.getTypeParameters(), (Object) typeVariable)];
    }

    public static /* synthetic */ void a(int i2, int i3, Class cls, char c2, String str, Field[] fieldArr, Field field) {
        String name = field.getName();
        int length = name.length();
        if (length == i2 - i3) {
            if (field.getType() != cls && !cls.isAssignableFrom(field.getType())) {
                return;
            }
            if (c2 >= 'A' && c2 <= 'Z' && c2 + ' ' == name.charAt(0) && name.regionMatches(1, str, i3 + 1, length - 1)) {
                fieldArr[0] = field;
            } else if (!name.regionMatches(0, str, i3, length)) {
            } else {
                fieldArr[1] = field;
            }
        }
    }

    public static void a(Class cls, com.alibaba.fastjson2.function.c<Field> cVar) {
        boolean z;
        boolean z2;
        if (cls == null || cVar == null) {
            return;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            z = false;
        } else {
            z = superclass.getName().equals("com.google.protobuf.GeneratedMessageV3");
            if (!z) {
                a(superclass, cVar);
            }
        }
        Field[] fieldArr = f.get(cls);
        if (fieldArr == null) {
            try {
                fieldArr = cls.getDeclaredFields();
                f.put(cls, fieldArr);
            } catch (Throwable unused) {
                fieldArr = new Field[0];
            }
            int length = fieldArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = true;
                    break;
                } else if (Modifier.isStatic(fieldArr[i2].getModifiers())) {
                    z2 = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                ArrayList arrayList = new ArrayList(fieldArr.length);
                for (Field field : fieldArr) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(field);
                    }
                }
                fieldArr = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
            }
            d.put(cls, fieldArr);
        }
        for (Field field2 : fieldArr) {
            if ((field2.getModifiers() & 8) == 0) {
                if (z) {
                    String name = field2.getName();
                    Class<?> type = field2.getType();
                    if ("cardsmap_".equals(name) && type.getName().equals("com.google.protobuf.MapField")) {
                        return;
                    }
                }
                Class<?> declaringClass = field2.getDeclaringClass();
                if (declaringClass != AbstractMap.class && declaringClass != HashMap.class && declaringClass != LinkedHashMap.class && declaringClass != TreeMap.class && declaringClass != ConcurrentHashMap.class) {
                    cVar.accept(field2);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0186, code lost:
        if (a((java.lang.reflect.AnnotatedElement) r9, (java.lang.Class<java.lang.annotation.Annotation>) com.alibaba.fastjson2.annotation.JSONField.class) == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0268, code lost:
        if (r16 != false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.Class r23, java.lang.Class r24, boolean r25, com.alibaba.fastjson2.function.c<java.lang.reflect.Method> r26) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.a(java.lang.Class, java.lang.Class, boolean, com.alibaba.fastjson2.function.c):void");
    }

    public static void a(Class<?> cls, aai aaiVar) {
        Constructor[] constructorArr = h.get(cls);
        if (constructorArr == null) {
            constructorArr = cls.getDeclaredConstructors();
            h.put(cls, constructorArr);
        }
        Constructor<?> constructor = null;
        String[] strArr = aaiVar.l;
        for (Constructor<?> constructor2 : constructorArr) {
            int length = constructor2.getParameterTypes().length;
            if (strArr == null || length == strArr.length) {
                if (length > 2) {
                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                    if (parameterTypes[length - 2] == Integer.TYPE && "kotlin.jvm.internal.DefaultConstructorMarker".equals(parameterTypes[length - 1].getName())) {
                        aaiVar.j = constructor2;
                    }
                }
                if (constructor == null || constructor.getParameterTypes().length < length) {
                    constructor = constructor2;
                }
            }
        }
        aaiVar.i = constructor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x00b8, code lost:
        if (java.util.Map.class.isAssignableFrom(r10) == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.Class r12, tb.aai r13, java.lang.Class r14, com.alibaba.fastjson2.function.c<java.lang.reflect.Method> r15) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.a(java.lang.Class, tb.aai, java.lang.Class, com.alibaba.fastjson2.function.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0035, code lost:
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0037, code lost:
        r11.a(r10, r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
        r10.e |= tb.aak.FIELD_MASK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0046, code lost:
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
        if (r4 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.Class r9, tb.aak r10, com.alibaba.fastjson2.reader.ObjectReaderProvider r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.f
            java.lang.Object r0 = r0.get(r9)
            java.lang.reflect.Field[] r0 = (java.lang.reflect.Field[]) r0
            if (r0 != 0) goto L13
            java.lang.reflect.Field[] r0 = r9.getDeclaredFields()
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r1 = com.alibaba.fastjson2.util.BeanUtils.f
            r1.put(r9, r0)
        L13:
            r1 = 0
            r2 = 0
        L15:
            int r3 = r0.length
            if (r2 >= r3) goto L55
            r3 = r0[r2]
            int r4 = r3.getModifiers()
            r5 = r4 & 8
            if (r5 != 0) goto L52
            r4 = r4 & 1
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = 0
        L29:
            java.lang.String r5 = r3.getName()
            boolean r6 = r5.equals(r12)
            r7 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            if (r6 == 0) goto L40
            if (r4 == 0) goto L3a
        L37:
            r11.a(r10, r9, r3)
        L3a:
            long r3 = r10.e
            long r3 = r3 | r7
            r10.e = r3
            goto L52
        L40:
            boolean r6 = r5.equals(r13)
            if (r6 == 0) goto L49
            if (r4 == 0) goto L3a
            goto L37
        L49:
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto L52
            if (r4 == 0) goto L3a
            goto L37
        L52:
            int r2 = r2 + 1
            goto L15
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.a(java.lang.Class, tb.aak, com.alibaba.fastjson2.reader.ObjectReaderProvider, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0054, code lost:
        if (java.util.Collection.class.isAssignableFrom(r6) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.Class r8, boolean r9, com.alibaba.fastjson2.function.c<java.lang.reflect.Method> r10) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.g
            java.lang.Object r0 = r0.get(r8)
            java.lang.reflect.Method[] r0 = (java.lang.reflect.Method[]) r0
            if (r0 != 0) goto L13
            java.lang.reflect.Method[] r0 = r8.getMethods()
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r1 = com.alibaba.fastjson2.util.BeanUtils.g
            r1.put(r8, r0)
        L13:
            int r8 = r0.length
            r1 = 0
            r2 = 0
        L16:
            if (r2 >= r8) goto L7f
            r3 = r0[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r4 = r4.length
            r5 = 3
            if (r4 != 0) goto L5a
            java.lang.String r6 = r3.getName()
            if (r9 == 0) goto L36
            int r7 = r6.length()
            if (r7 <= r5) goto L7c
            java.lang.String r7 = "get"
            boolean r6 = r6.startsWith(r7, r1)
            if (r6 == 0) goto L7c
        L36:
            java.lang.Class r6 = r3.getReturnType()
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r7 = java.util.concurrent.atomic.AtomicInteger.class
            if (r6 == r7) goto L56
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r7 = java.util.concurrent.atomic.AtomicLong.class
            if (r6 == r7) goto L56
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r7 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r6 == r7) goto L56
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r7 = java.util.concurrent.atomic.AtomicIntegerArray.class
            if (r6 == r7) goto L56
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r7 = java.util.concurrent.atomic.AtomicLongArray.class
            if (r6 == r7) goto L56
            java.lang.Class<java.util.Collection> r7 = java.util.Collection.class
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 == 0) goto L5a
        L56:
            r10.accept(r3)
            goto L7c
        L5a:
            r6 = 1
            if (r4 != r6) goto L7c
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L7c
            java.lang.String r4 = r3.getName()
            int r6 = r4.length()
            if (r9 == 0) goto L56
            if (r6 <= r5) goto L7c
            java.lang.String r5 = "set"
            boolean r4 = r4.startsWith(r5, r1)
            if (r4 == 0) goto L7c
            goto L56
        L7c:
            int r2 = r2 + 1
            goto L16
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.a(java.lang.Class, boolean, com.alibaba.fastjson2.function.c):void");
    }

    public static /* synthetic */ void a(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (!method2.getName().equals(str) || !a((AnnotatedElement) method2)) {
            return;
        }
        atomicReference.set(method);
    }

    public static void a(aai aaiVar, Annotation annotation, Method method) {
        char c2;
        char c3;
        long j2;
        JSONWriter.Feature feature;
        try {
            Object invoke = method.invoke(annotation, new Object[0]);
            String name = method.getName();
            switch (name.hashCode()) {
                case -1315832283:
                    if (name.equals("serializeEnumAsJavaBean")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1210506547:
                    if (name.equals("alphabetic")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1052827512:
                    if (name.equals("naming")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1008770331:
                    if (name.equals("orders")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -940893828:
                    if (name.equals("serialzeFeatures")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -853109563:
                    if (name.equals("typeKey")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -676507419:
                    if (name.equals("typeName")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 90259659:
                    if (name.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_includes)) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1752415457:
                    if (name.equals(TSRecmdReqPrefetch.PREFETCH_PARAMS_IGNORE)) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1869860669:
                    if (name.equals("serializeFeatures")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1970571962:
                    if (name.equals("seeAlso")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    Class[] clsArr = (Class[]) invoke;
                    if (clsArr.length == 0) {
                        return;
                    }
                    aaiVar.f = clsArr;
                    return;
                case 1:
                    String str = (String) invoke;
                    if (str.isEmpty()) {
                        return;
                    }
                    aaiVar.b = str;
                    return;
                case 2:
                    String str2 = (String) invoke;
                    if (str2.isEmpty()) {
                        return;
                    }
                    aaiVar.f25182a = str2;
                    return;
                case 3:
                    if (((Boolean) invoke).booleanValue()) {
                        return;
                    }
                    aaiVar.A = false;
                    return;
                case 4:
                case 5:
                    for (Enum r16 : (Enum[]) invoke) {
                        String name2 = r16.name();
                        switch (name2.hashCode()) {
                            case -1937516631:
                                if (name2.equals("WriteNullNumberAsZero")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1779797023:
                                if (name2.equals("IgnoreErrorGetter")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -335314544:
                                if (name2.equals("WriteEnumUsingToString")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -211922948:
                                if (name2.equals("BrowserCompatible")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -102443356:
                                if (name2.equals("WriteNullStringAsEmpty")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -62964779:
                                if (name2.equals("NotWriteRootClassName")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1009181687:
                                if (name2.equals("WriteNullListAsEmpty")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1519175029:
                                if (name2.equals("WriteNonStringValueAsString")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1808123471:
                                if (name2.equals("WriteNullBooleanAsFalse")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1879776036:
                                if (name2.equals("WriteClassName")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2049970061:
                                if (name2.equals("WriteMapNullValue")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.WriteNulls;
                                break;
                            case 1:
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.WriteNullListAsEmpty;
                                break;
                            case 2:
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.WriteNullStringAsEmpty;
                                break;
                            case 3:
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.WriteNullNumberAsZero;
                                break;
                            case 4:
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.WriteNullBooleanAsFalse;
                                break;
                            case 5:
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.BrowserCompatible;
                                break;
                            case 6:
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.WriteClassName;
                                break;
                            case 7:
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.WriteNonStringValueAsString;
                                break;
                            case '\b':
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.WriteEnumUsingToString;
                                break;
                            case '\t':
                                j2 = aaiVar.n;
                                feature = JSONWriter.Feature.NotWriteRootClassName;
                                break;
                            case '\n':
                                aaiVar.n |= JSONWriter.Feature.IgnoreErrorGetter.mask;
                                continue;
                            default:
                                continue;
                        }
                        aaiVar.n = j2 | feature.mask;
                    }
                    return;
                case 6:
                    if (!((Boolean) invoke).booleanValue()) {
                        return;
                    }
                    aaiVar.o = true;
                    return;
                case 7:
                    aaiVar.p = ((Enum) invoke).name();
                    return;
                case '\b':
                    String[] strArr = (String[]) invoke;
                    if (strArr.length == 0) {
                        return;
                    }
                    if (aaiVar.q == null) {
                        aaiVar.q = strArr;
                        return;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (String str3 : aaiVar.q) {
                        linkedHashSet.add(str3);
                    }
                    Collections.addAll(linkedHashSet, strArr);
                    aaiVar.q = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                    return;
                case '\t':
                    String[] strArr2 = (String[]) invoke;
                    if (strArr2.length == 0) {
                        return;
                    }
                    aaiVar.s = strArr2;
                    return;
                case '\n':
                    String[] strArr3 = (String[]) invoke;
                    if (strArr3.length == 0) {
                        return;
                    }
                    aaiVar.r = strArr3;
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static boolean a(Class cls, Class cls2) {
        Class<?> enclosingClass = cls2.getEnclosingClass();
        if (enclosingClass == null || (cls != null && !cls.equals(enclosingClass))) {
            return false;
        }
        Constructor[] constructorArr = h.get(cls2);
        if (constructorArr == null) {
            constructorArr = cls2.getDeclaredConstructors();
            h.put(cls2, constructorArr);
        }
        if (constructorArr.length == 0) {
            return false;
        }
        Class<?>[] parameterTypes = constructorArr[0].getParameterTypes();
        if (parameterTypes.length != 0) {
            return enclosingClass.equals(parameterTypes[0]);
        }
        return false;
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static boolean a(AnnotatedElement annotatedElement) {
        for (Annotation annotation : annotatedElement.getAnnotations()) {
            String name = annotation.annotationType().getName();
            char c2 = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 1054232478) {
                if (hashCode == 2064312146 && name.equals("com.alibaba.fastjson2.annotation.JSONField")) {
                    c2 = 1;
                }
            } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                c2 = 0;
            }
            if (c2 == 0 || c2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static String[] a(Class<?> cls) {
        if (j == null && !i) {
            try {
                j = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getConstructor(Class.class);
            } catch (Throwable unused) {
                i = true;
            }
        }
        if (j == null) {
            return null;
        }
        if (k == null && !i) {
            try {
                k = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getMethod("getConstructors", new Class[0]);
            } catch (Throwable unused2) {
                i = true;
            }
        }
        if (l == null && !i) {
            try {
                l = Class.forName("kotlin.reflect.f").getMethod("getParameters", new Class[0]);
            } catch (Throwable unused3) {
                i = true;
            }
        }
        if (m == null && !i) {
            try {
                m = Class.forName("kotlin.reflect.KParameter").getMethod("getName", new Class[0]);
            } catch (Throwable unused4) {
                i = true;
            }
        }
        if (n) {
            return null;
        }
        try {
            Iterator it = ((Iterable) k.invoke(j.newInstance(cls), new Object[0])).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) l.invoke(next, new Object[0]);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            if (obj == null) {
                return null;
            }
            List list2 = (List) l.invoke(obj, new Object[0]);
            String[] strArr = new String[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                strArr[i2] = (String) m.invoke(list2.get(i2), new Object[0]);
            }
            return strArr;
        } catch (Throwable unused5) {
            n = true;
            return null;
        }
    }

    public static String[] a(Constructor constructor) {
        Class declaringClass = constructor.getDeclaringClass();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (Throwable.class.isAssignableFrom(declaringClass)) {
            int length = parameterTypes.length;
            if (length != 1) {
                if (length == 2 && parameterTypes[0] == String.class && Throwable.class.isAssignableFrom(parameterTypes[1])) {
                    return new String[]{"message", "cause"};
                }
            } else if (parameterTypes[0] == String.class) {
                return new String[]{"message"};
            } else {
                if (Throwable.class.isAssignableFrom(parameterTypes[0])) {
                    return new String[]{"cause"};
                }
            }
        }
        int length2 = parameterTypes.length;
        String[] strArr = new String[length2];
        if (length2 > 0 && parameterTypes[0] == declaringClass.getDeclaringClass() && !Modifier.isStatic(declaringClass.getModifiers())) {
            strArr[0] = "this.$0";
        }
        return strArr;
    }

    public static <T> T b(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static String b(String str, int i2) {
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i3 = i2;
        int i4 = 0;
        while (i3 < length) {
            try {
                char charAt = str.charAt(i3);
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                    if (i3 > i2) {
                        andSet[i4] = '_';
                        i4++;
                    }
                }
                andSet[i4] = charAt;
                i3++;
                i4++;
            } finally {
                TypeUtils.e.set(TypeUtils.d, andSet);
            }
        }
        return new String(andSet, 0, i4);
    }

    static String b(String str, int i2, boolean z) {
        int i3;
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i4 = i2;
        int i5 = 0;
        while (i4 < length) {
            try {
                char charAt = str.charAt(i4);
                if (z) {
                    if (charAt < 'A' || charAt > 'Z') {
                        if (charAt >= 'a' && charAt <= 'z') {
                            i3 = charAt - ' ';
                            charAt = (char) i3;
                        }
                    } else if (i4 > i2) {
                        andSet[i5] = '-';
                        i5++;
                    }
                } else if (charAt >= 'A' && charAt <= 'Z') {
                    if (i4 > i2) {
                        andSet[i5] = '-';
                        i5++;
                    }
                    i3 = charAt + ' ';
                    charAt = (char) i3;
                }
                andSet[i5] = charAt;
                i4++;
                i5++;
            } finally {
                TypeUtils.e.set(TypeUtils.d, andSet);
            }
        }
        return new String(andSet, 0, i5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String b(String str, String str2) {
        char c2;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        int i2 = 0;
        boolean startsWith = str.startsWith("is", 0);
        boolean startsWith2 = str.startsWith("get", 0);
        int i3 = startsWith ? 2 : startsWith2 ? 3 : 0;
        if (length == i3) {
            return str;
        }
        switch (str2.hashCode()) {
            case -2068429102:
                if (str2.equals("UpperCase")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1863045342:
                if (str2.equals("UpperCaseWithDots")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1112704575:
                if (str2.equals("NeverUseThisValueExceptDefaultValue")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 601822360:
                if (str2.equals("UpperCaseWithDashes")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1336502620:
                if (str2.equals("PascalCase")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1371349591:
                if (str2.equals("UpperCamelCaseWithSpaces")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1460726553:
                if (str2.equals("KebabCase")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1655544038:
                if (str2.equals("CamelCase")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1839922637:
                if (str2.equals("CamelCase1x")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1976554305:
                if (str2.equals("UpperCaseWithUnderScores")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2087942256:
                if (str2.equals("SnakeCase")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                int i4 = length - i3;
                char[] andSet = f3025a.getAndSet(null);
                if (andSet == null || andSet.length < i4) {
                    andSet = new char[Math.max(32, i4)];
                }
                try {
                    str.getChars(i3, length, andSet, 0);
                    char c3 = andSet[0];
                    boolean z = andSet.length > 1 && andSet[1] >= 'A' && andSet[1] <= 'Z';
                    if (c3 >= 'A' && c3 <= 'Z' && !z) {
                        andSet[0] = (char) (c3 + ' ');
                    }
                    if (i4 <= 8) {
                        long j2 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                char c4 = andSet[i5];
                                if (c4 > 128) {
                                    j2 = 0;
                                } else {
                                    j2 = (j2 << 8) + c4;
                                    i5++;
                                }
                            }
                        }
                        if (j2 != 0) {
                            int length2 = ((int) j2) & (b.length - 1);
                            i iVar = b[length2];
                            if (iVar == null) {
                                String str3 = new String(andSet, 0, i4);
                                b[length2] = new i(str3, j2);
                                return str3;
                            } else if (iVar.b == j2) {
                                return iVar.f3036a;
                            }
                        }
                    }
                    return new String(andSet, 0, i4);
                } finally {
                    f3025a.set(andSet);
                }
            case 2:
                char[] cArr = new char[length - i3];
                str.getChars(i3, length, cArr, 0);
                char c5 = cArr[0];
                if (c5 >= 'A' && c5 <= 'Z') {
                    cArr[0] = (char) (c5 + ' ');
                }
                return new String(cArr);
            case 3:
                return a(str, length, i3);
            case 4:
                return b(str, i3);
            case 5:
                return a(str, i3, true);
            case 6:
                return a(str, i3, ' ');
            case 7:
                return str.substring(i3).toUpperCase();
            case '\b':
                return b(str, i3, true);
            case '\t':
                return c(str, i3, true);
            case '\n':
                if (startsWith) {
                    i2 = 2;
                } else if (startsWith2) {
                    i2 = 3;
                }
                StringBuilder sb = new StringBuilder();
                for (int i6 = i2; i6 < str.length(); i6++) {
                    char charAt = str.charAt(i6);
                    if (charAt >= 'A' && charAt <= 'Z') {
                        charAt = (char) (charAt + ' ');
                        if (i6 > i2) {
                            sb.append('-');
                        }
                    }
                    sb.append(charAt);
                }
                return sb.toString();
            default:
                throw new JSONException("TODO : " + str2);
        }
    }

    public static Field b(Class cls, String str) {
        boolean z;
        Map<String, Field> map = e.get(cls);
        if (map == null) {
            HashMap hashMap = new HashMap();
            Field[] fieldArr = f.get(cls);
            if (fieldArr == null) {
                try {
                    fieldArr = cls.getDeclaredFields();
                    f.put(cls, fieldArr);
                } catch (Throwable unused) {
                    fieldArr = new Field[0];
                }
                int length = fieldArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = true;
                        break;
                    } else if (Modifier.isStatic(fieldArr[i2].getModifiers())) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    ArrayList arrayList = new ArrayList(fieldArr.length);
                    for (Field field : fieldArr) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            arrayList.add(field);
                        }
                    }
                    fieldArr = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                }
                d.put(cls, fieldArr);
            }
            for (Field field2 : fieldArr) {
                hashMap.put(field2.getName(), field2);
            }
            e.put(cls, hashMap);
            map = e.get(cls);
        }
        return map.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0061 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0067 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Field b(java.lang.Class r14, java.lang.reflect.Method r15) {
        /*
            java.lang.String r5 = r15.getName()
            int r1 = r5.length()
            java.lang.Class r0 = r15.getReturnType()
            r2 = 3
            r3 = 2
            r7 = 1
            r8 = 0
            if (r1 <= r3) goto L5a
            char r4 = r5.charAt(r8)
            char r6 = r5.charAt(r7)
            char r9 = r5.charAt(r3)
            r10 = 105(0x69, float:1.47E-43)
            r11 = 115(0x73, float:1.61E-43)
            if (r4 != r10) goto L30
            if (r6 != r11) goto L30
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r0 == r4) goto L2e
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r0 != r4) goto L5a
        L2e:
            r4 = 1
            goto L5b
        L30:
            r10 = 103(0x67, float:1.44E-43)
            r12 = 116(0x74, float:1.63E-43)
            r13 = 101(0x65, float:1.42E-43)
            if (r4 != r10) goto L44
            if (r6 != r13) goto L44
            if (r9 != r12) goto L44
            if (r1 <= r2) goto L40
            r4 = 1
            goto L41
        L40:
            r4 = 0
        L41:
            r6 = r4
            r4 = 0
            goto L5c
        L44:
            if (r4 != r11) goto L5a
            if (r6 != r13) goto L5a
            if (r9 != r12) goto L5a
            if (r1 <= r2) goto L55
            java.lang.Class[] r4 = r15.getParameterTypes()
            int r4 = r4.length
            if (r4 != r7) goto L55
            r4 = 1
            goto L56
        L55:
            r4 = 0
        L56:
            r9 = r4
            r4 = 0
            r6 = 0
            goto L5d
        L5a:
            r4 = 0
        L5b:
            r6 = 0
        L5c:
            r9 = 0
        L5d:
            java.lang.reflect.Field[] r10 = new java.lang.reflect.Field[r3]
            if (r4 != 0) goto L65
            if (r6 != 0) goto L65
            if (r9 == 0) goto L89
        L65:
            if (r4 != 0) goto L71
            if (r6 == 0) goto L6a
            goto L71
        L6a:
            java.lang.Class[] r15 = r15.getParameterTypes()
            r15 = r15[r8]
            goto L72
        L71:
            r15 = r0
        L72:
            if (r4 == 0) goto L75
            r2 = 2
        L75:
            int r0 = r1 - r2
            char[] r0 = new char[r0]
            r5.getChars(r2, r1, r0, r8)
            char r4 = r0[r8]
            com.alibaba.fastjson2.util.-$$Lambda$BeanUtils$RpNEQfGxz7J25r-Ap0mxkSXKhGo r9 = new com.alibaba.fastjson2.util.-$$Lambda$BeanUtils$RpNEQfGxz7J25r-Ap0mxkSXKhGo
            r0 = r9
            r3 = r15
            r6 = r10
            r0.<init>()
            a(r14, r9)
        L89:
            r14 = r10[r8]
            if (r14 == 0) goto L90
            r14 = r10[r8]
            return r14
        L90:
            r14 = r10[r7]
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.b(java.lang.Class, java.lang.reflect.Method):java.lang.reflect.Field");
    }

    public static WildcardType b(Type type) {
        return new WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, c);
    }

    public static void b(Class cls, com.alibaba.fastjson2.function.c<Method> cVar) {
        Method[] methodArr = g.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            g.put(cls, methodArr);
        }
        for (Method method : methodArr) {
            if (Modifier.isStatic(method.getModifiers())) {
                cVar.accept(method);
            }
        }
    }

    public static void b(Class cls, Class cls2, com.alibaba.fastjson2.function.c<Method> cVar) {
        a(cls, cls2, false, cVar);
    }

    public static void b(Object obj, Object obj2) {
        boolean z;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        Field[] fieldArr = f.get(cls);
        if (fieldArr == null) {
            fieldArr = cls.getDeclaredFields();
            int length = fieldArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                } else if (Modifier.isStatic(fieldArr[i2].getModifiers())) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                ArrayList arrayList = new ArrayList(fieldArr.length);
                for (Field field : fieldArr) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(field);
                    }
                }
                fieldArr = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
            }
            d.put(cls, fieldArr);
        }
        Field field2 = null;
        for (Field field3 : fieldArr) {
            if ("this$0".equals(field3.getName())) {
                field2 = field3;
            }
        }
        if (field2 == null) {
            return;
        }
        field2.setAccessible(true);
        try {
            field2.set(obj, obj2);
        } catch (IllegalAccessException unused) {
            throw new JSONException("setNoneStaticMemberClassParent error, class " + cls);
        }
    }

    public static /* synthetic */ void b(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (!method2.getName().equals(str) || !a((AnnotatedElement) method2)) {
            return;
        }
        atomicReference.set(method);
    }

    public static boolean b(Class cls) {
        Annotation[] declaredAnnotations;
        for (final Annotation annotation : cls.getDeclaredAnnotations()) {
            JSONType jSONType = (JSONType) a(annotation, (Class<Annotation>) JSONType.class);
            if (jSONType != null) {
                return jSONType.writeEnumAsJavaBean();
            }
            Class<? extends Annotation> annotationType = annotation.annotationType();
            if ("com.alibaba.fastjson.annotation.JSONType".equals(annotationType.getName())) {
                final aai aaiVar = new aai();
                d(annotationType, new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.util.-$$Lambda$BeanUtils$qF5127Jw6feHTw3cbEYxmTWtIRE
                    @Override // com.alibaba.fastjson2.function.c
                    public final void accept(Object obj) {
                        BeanUtils.lambda$qF5127Jw6feHTw3cbEYxmTWtIRE(aai.this, annotation, (Method) obj);
                    }
                });
                if (aaiVar.o) {
                    return true;
                }
            }
        }
        return false;
    }

    static String c(String str, int i2, boolean z) {
        int i3;
        int length = str.length();
        char[] andSet = TypeUtils.e.getAndSet(TypeUtils.d, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i4 = i2;
        int i5 = 0;
        while (i4 < length) {
            try {
                char charAt = str.charAt(i4);
                if (z) {
                    if (charAt < 'A' || charAt > 'Z') {
                        if (charAt >= 'a' && charAt <= 'z') {
                            i3 = charAt - ' ';
                            charAt = (char) i3;
                        }
                    } else if (i4 > i2) {
                        andSet[i5] = '.';
                        i5++;
                    }
                } else if (charAt >= 'A' && charAt <= 'Z') {
                    if (i4 > i2) {
                        andSet[i5] = '.';
                        i5++;
                    }
                    i3 = charAt + ' ';
                    charAt = (char) i3;
                }
                andSet[i5] = charAt;
                i4++;
                i5++;
            } finally {
                TypeUtils.e.set(TypeUtils.d, andSet);
            }
        }
        return new String(andSet, 0, i5);
    }

    public static String c(String str, String str2) {
        char charAt;
        char charAt2;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        if (str != null && !str.isEmpty()) {
            char c2 = 65535;
            switch (str2.hashCode()) {
                case -2068429102:
                    if (str2.equals("UpperCase")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case -1863045342:
                    if (str2.equals("UpperCaseWithDots")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case -1112704575:
                    if (str2.equals("NeverUseThisValueExceptDefaultValue")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -46641534:
                    if (str2.equals("LowerCaseWithUnderScores")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 246111473:
                    if (str2.equals("NoChange")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 572594479:
                    if (str2.equals("UpperCamelCaseWithUnderScores")) {
                        c2 = 15;
                        break;
                    }
                    break;
                case 601822360:
                    if (str2.equals("UpperCaseWithDashes")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 928600554:
                    if (str2.equals("UpperCamelCaseWithDashes")) {
                        c2 = 16;
                        break;
                    }
                    break;
                case 975280372:
                    if (str2.equals("UpperCamelCaseWithDots")) {
                        c2 = 17;
                        break;
                    }
                    break;
                case 1315531521:
                    if (str2.equals("LowerCaseWithDots")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 1336502620:
                    if (str2.equals("PascalCase")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1371349591:
                    if (str2.equals("UpperCamelCaseWithSpaces")) {
                        c2 = 14;
                        break;
                    }
                    break;
                case 1460726553:
                    if (str2.equals("KebabCase")) {
                        c2 = 18;
                        break;
                    }
                    break;
                case 1488507313:
                    if (str2.equals("LowerCase")) {
                        c2 = '\r';
                        break;
                    }
                    break;
                case 1492440247:
                    if (str2.equals("LowerCaseWithDashes")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 1655544038:
                    if (str2.equals("CamelCase")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1839922637:
                    if (str2.equals("CamelCase1x")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1976554305:
                    if (str2.equals("UpperCaseWithUnderScores")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 2087942256:
                    if (str2.equals("SnakeCase")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    char charAt3 = str.charAt(0);
                    char charAt4 = str.length() > 1 ? str.charAt(1) : (char) 0;
                    if (charAt3 >= 'A' && charAt3 <= 'Z' && str.length() > 1 && (charAt4 < 'A' || charAt4 > 'Z')) {
                        char[] charArray = str.toCharArray();
                        charArray[0] = (char) (charAt3 + ' ');
                        return new String(charArray);
                    }
                    break;
                case 3:
                    char charAt5 = str.charAt(0);
                    if (charAt5 < 'A' || charAt5 > 'Z' || str.length() <= 1) {
                        return str;
                    }
                    char[] charArray2 = str.toCharArray();
                    charArray2[0] = (char) (charAt5 + ' ');
                    return new String(charArray2);
                case 4:
                    char charAt6 = str.charAt(0);
                    if (charAt6 >= 'a' && charAt6 <= 'z' && str.length() > 1 && (charAt2 = str.charAt(1)) >= 'a' && charAt2 <= 'z') {
                        char[] charArray3 = str.toCharArray();
                        charArray3[0] = (char) (charAt6 - ' ');
                        return new String(charArray3);
                    } else if (charAt6 != '_' || str.length() <= 1 || (charAt = str.charAt(1)) < 'a' || charAt > 'z') {
                        return str;
                    } else {
                        char[] charArray4 = str.toCharArray();
                        charArray4[1] = (char) (charAt - ' ');
                        return new String(charArray4);
                    }
                case 5:
                    return b(str, 0);
                case 6:
                    return a(str, 0, true);
                case 7:
                    return a(str, 0, false);
                case '\b':
                    return b(str, 0, true);
                case '\t':
                    return b(str, 0, false);
                case '\n':
                    return c(str, 0, true);
                case 11:
                    return c(str, 0, false);
                case '\f':
                    return str.toUpperCase();
                case '\r':
                    return str.toLowerCase();
                case 14:
                    return a(str, 0, ' ');
                case 15:
                    return a(str, 0, '_');
                case 16:
                    return a(str, 0, '-');
                case 17:
                    return a(str, 0, '.');
                case 18:
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        char charAt7 = str.charAt(i2);
                        if (charAt7 >= 'A' && charAt7 <= 'Z') {
                            charAt7 = (char) (charAt7 + ' ');
                            if (i2 > 0) {
                                sb.append('-');
                            }
                        }
                        sb.append(charAt7);
                    }
                    return sb.toString();
                default:
                    throw new JSONException("TODO : " + str2);
            }
        }
        return str;
    }

    public static Field c(Class cls, String str) {
        Field[] fieldArr = d.get(cls);
        if (fieldArr == null) {
            fieldArr = cls.getFields();
            d.put(cls, fieldArr);
        }
        for (Field field : fieldArr) {
            if (field.getName().equals(str)) {
                return field;
            }
        }
        return null;
    }

    public static WildcardType c(Type type) {
        return new WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static void c(Class cls, com.alibaba.fastjson2.function.c<Constructor> cVar) {
        Constructor<?>[] constructorArr = h.get(cls);
        if (constructorArr == null) {
            constructorArr = cls.getDeclaredConstructors();
            h.put(cls, constructorArr);
        }
        for (Constructor<?> constructor : constructorArr) {
            cVar.accept(constructor);
        }
    }

    public static String[] c(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        String[] strArr = new String[enumArr.length];
        Field[] fieldArr = d.get(cls);
        if (fieldArr == null) {
            fieldArr = cls.getFields();
            d.put(cls, fieldArr);
        }
        for (Field field : fieldArr) {
            String name = field.getName();
            int i2 = 0;
            while (true) {
                if (i2 < enumArr.length) {
                    String name2 = enumArr[i2].name();
                    if (name.equals(name2)) {
                        JSONField jSONField = (JSONField) field.getAnnotation(JSONField.class);
                        if (jSONField != null) {
                            String name3 = jSONField.name();
                            if (name3.length() != 0 && !name3.equals(name2)) {
                                strArr[i2] = name3;
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
        int i3 = 0;
        for (String str : strArr) {
            if (str == null) {
                i3++;
            }
        }
        if (i3 == strArr.length) {
            return null;
        }
        return strArr;
    }

    public static Method d(Class cls, String str) {
        Method[] methodArr = g.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            g.put(cls, methodArr);
        }
        for (Method method : methodArr) {
            if (!Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length == 0 && method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    public static Type d(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new GenericArrayTypeImpl(d(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void d(Class cls, com.alibaba.fastjson2.function.c<Method> cVar) {
        Method[] methodArr = g.get(cls);
        if (methodArr == null) {
            methodArr = cls.getMethods();
            g.put(cls, methodArr);
        }
        for (Method method : methodArr) {
            if (method.getParameterTypes().length == 0 && method.getDeclaringClass() != Object.class) {
                String name = method.getName();
                char c2 = 65535;
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            c2 = 2;
                        }
                    } else if (name.equals("hashCode")) {
                        c2 = 1;
                    }
                } else if (name.equals("toString")) {
                    c2 = 0;
                }
                if (c2 != 0 && c2 != 1 && c2 != 2) {
                    cVar.accept(method);
                }
            }
        }
    }

    public static Class<?> e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return e(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static void e(Class cls, com.alibaba.fastjson2.function.c<Method> cVar) {
        b(cls, (Class) null, cVar);
    }

    public static String f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static void g(Type type) {
        a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    public static /* synthetic */ void lambda$9NEBNa1HyRMCb5_OEJMFhO5SC2E(String str, AtomicReference atomicReference, Method method, Method method2) {
        a(str, atomicReference, method, method2);
    }

    public static /* synthetic */ void lambda$IT6AizFULOCK1B8NDDtNKSjisBk(String str, AtomicReference atomicReference, Method method, Method method2) {
        b(str, atomicReference, method, method2);
    }

    /* renamed from: lambda$RpNEQfGxz7J25r-Ap0mxkSXKhGo */
    public static /* synthetic */ void m219lambda$RpNEQfGxz7J25rAp0mxkSXKhGo(int i2, int i3, Class cls, char c2, String str, Field[] fieldArr, Field field) {
        a(i2, i3, cls, c2, str, fieldArr, field);
    }

    public static /* synthetic */ void lambda$qF5127Jw6feHTw3cbEYxmTWtIRE(aai aaiVar, Annotation annotation, Method method) {
        a(aaiVar, annotation, method);
    }
}
