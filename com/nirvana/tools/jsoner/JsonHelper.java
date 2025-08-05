package com.nirvana.tools.jsoner;

import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class JsonHelper {

    /* renamed from: a  reason: collision with root package name */
    static final Type[] f8083a = new Type[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a implements Serializable, GenericArrayType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f8084a;

        public a(Type type) {
            this.f8084a = JsonHelper.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && JsonHelper.a((Type) this, (Type) ((GenericArrayType) obj));
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f8084a;
        }

        public final int hashCode() {
            return this.f8084a.hashCode();
        }

        public final String toString() {
            return JsonHelper.c(this.f8084a) + MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements Serializable, ParameterizedType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f8085a;
        private final Type b;
        private final Type[] c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                com.nirvana.tools.jsoner.c.a(z);
            }
            this.f8085a = type == null ? null : JsonHelper.a(type);
            this.b = JsonHelper.a(type2);
            this.c = (Type[]) typeArr.clone();
            int length = this.c.length;
            for (int i = 0; i < length; i++) {
                com.nirvana.tools.jsoner.c.a(this.c[i]);
                JsonHelper.d(this.c[i]);
                Type[] typeArr2 = this.c;
                typeArr2[i] = JsonHelper.a(typeArr2[i]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && JsonHelper.a((Type) this, (Type) ((ParameterizedType) obj));
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f8085a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.b;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.c) ^ this.b.hashCode()) ^ JsonHelper.a((Object) this.f8085a);
        }

        public final String toString() {
            int length = this.c.length;
            if (length == 0) {
                return JsonHelper.c(this.b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(JsonHelper.c(this.b));
            sb.append("<");
            sb.append(JsonHelper.c(this.c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(JsonHelper.c(this.c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c implements Serializable, WildcardType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f8086a;
        private final Type b;

        public c(Type[] typeArr, Type[] typeArr2) {
            Type a2;
            boolean z = true;
            com.nirvana.tools.jsoner.c.a(typeArr2.length <= 1);
            com.nirvana.tools.jsoner.c.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                com.nirvana.tools.jsoner.c.a(typeArr2[0]);
                JsonHelper.d(typeArr2[0]);
                com.nirvana.tools.jsoner.c.a(typeArr[0] != Object.class ? false : z);
                this.b = JsonHelper.a(typeArr2[0]);
                a2 = Object.class;
            } else {
                com.nirvana.tools.jsoner.c.a(typeArr[0]);
                JsonHelper.d(typeArr[0]);
                this.b = null;
                a2 = JsonHelper.a(typeArr[0]);
            }
            this.f8086a = a2;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && JsonHelper.a((Type) this, (Type) ((WildcardType) obj));
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.b;
            return type != null ? new Type[]{type} : JsonHelper.f8083a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f8086a};
        }

        public final int hashCode() {
            Type type = this.b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f8086a.hashCode() + 31);
        }

        public final String toString() {
            StringBuilder sb;
            Type type;
            if (this.b != null) {
                sb = new StringBuilder("? super ");
                type = this.b;
            } else if (this.f8086a == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder("? extends ");
                type = this.f8086a;
            }
            sb.append(JsonHelper.c(type));
            return sb.toString();
        }
    }

    static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.nirvana.tools.jsoner.JsonHelper$a] */
    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new a(a((Type) cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean a(Type type, Type type2) {
        while (type != type2) {
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
            } else if (!(type instanceof GenericArrayType)) {
                if (type instanceof WildcardType) {
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
            } else if (!(type2 instanceof GenericArrayType)) {
                return false;
            } else {
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            }
        }
        return true;
    }

    public static Class<?> b(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                com.nirvana.tools.jsoner.c.a(rawType instanceof Class);
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (!(type instanceof WildcardType)) {
                    String name = type == null ? "null" : type.getClass().getName();
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
                }
                type = ((WildcardType) type).getUpperBounds()[0];
            }
        }
        return (Class) type;
    }

    public static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static void d(Type type) {
        com.nirvana.tools.jsoner.c.a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }
}
