package com.alibaba.fastjson.util;

import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson2.util.c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes.dex */
public class FieldInfo implements Comparable<FieldInfo> {
    public final String[] alternateNames;
    public final Class<?> declaringClass;
    public final Field field;
    public final boolean fieldAccess;
    private final JSONField fieldAnnotation;
    public final Class<?> fieldClass;
    public final boolean fieldTransient;
    public final Type fieldType;
    public final String format;
    public final boolean getOnly;
    public final boolean isEnum;
    public final Method method;
    private final JSONField methodAnnotation;
    public final String name;
    public final long nameHashCode;
    private int ordinal;
    public final int serialzeFeatures;

    static {
        kge.a(-550019387);
        kge.a(415966670);
    }

    public FieldInfo(String str, Class<?> cls, Class<?> cls2, Type type, Field field, int i, int i2) {
        this.ordinal = 0;
        this.name = str;
        this.declaringClass = cls;
        this.fieldClass = cls2;
        this.fieldType = type;
        this.method = null;
        this.field = field;
        this.ordinal = i;
        this.serialzeFeatures = i2;
        boolean z = true;
        this.isEnum = cls2.isEnum() && !JSONAware.class.isAssignableFrom(cls2);
        this.fieldAnnotation = null;
        this.methodAnnotation = null;
        if (field != null) {
            int modifiers = field.getModifiers();
            if ((modifiers & 1) == 0 && this.method != null) {
                z = false;
            }
            this.fieldAccess = z;
            this.fieldTransient = Modifier.isTransient(modifiers);
        } else {
            this.fieldAccess = false;
            this.fieldTransient = false;
        }
        this.getOnly = false;
        long j = -3750763034362895579L;
        for (int i3 = 0; i3 < str.length(); i3++) {
            j = (j ^ str.charAt(i3)) * c.MAGIC_PRIME;
        }
        this.nameHashCode = j;
        this.format = null;
        this.alternateNames = new String[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0133, code lost:
        r13 = r5.declaringClass.getTypeParameters();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013b, code lost:
        if (r15 >= r13.length) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
        if (r8.equals(r13[r15]) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0145, code lost:
        r12 = r14[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
        r15 = r15 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FieldInfo(java.lang.String r6, java.lang.reflect.Method r7, java.lang.reflect.Field r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, int r11, int r12, com.alibaba.fastjson.annotation.JSONField r13, com.alibaba.fastjson.annotation.JSONField r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.FieldInfo.<init>(java.lang.String, java.lang.reflect.Method, java.lang.reflect.Field, java.lang.Class, java.lang.reflect.Type, int, int, com.alibaba.fastjson.annotation.JSONField, com.alibaba.fastjson.annotation.JSONField, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type getFieldType(java.lang.Class<?> r10, java.lang.reflect.Type r11, java.lang.reflect.Type r12) {
        /*
            if (r10 == 0) goto Ld9
            if (r11 != 0) goto L6
            goto Ld9
        L6:
            boolean r0 = r12 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L26
            r0 = r12
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            java.lang.reflect.Type r10 = getFieldType(r10, r11, r0)
            if (r0 == r10) goto L25
            java.lang.Class r10 = com.alibaba.fastjson.util.TypeUtils.getClass(r10)
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r10, r1)
            java.lang.Class r10 = r10.getClass()
            return r10
        L25:
            return r12
        L26:
            boolean r0 = com.alibaba.fastjson.util.TypeUtils.isGenericParamType(r11)
            if (r0 != 0) goto L2d
            return r12
        L2d:
            boolean r0 = r12 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L64
            java.lang.reflect.Type r0 = com.alibaba.fastjson.util.TypeUtils.getGenericParamType(r11)
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.Class r2 = com.alibaba.fastjson.util.TypeUtils.getClass(r0)
            r3 = r12
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            r4 = 0
        L3f:
            java.lang.reflect.TypeVariable[] r5 = r2.getTypeParameters()
            int r5 = r5.length
            if (r4 >= r5) goto L64
            java.lang.reflect.TypeVariable[] r5 = r2.getTypeParameters()
            r5 = r5[r4]
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = r3.getName()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L61
            java.lang.reflect.Type[] r10 = r0.getActualTypeArguments()
            r10 = r10[r4]
            return r10
        L61:
            int r4 = r4 + 1
            goto L3f
        L64:
            boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Ld9
            r0 = r12
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r2 = r0.getActualTypeArguments()
            boolean r3 = r11 instanceof java.lang.reflect.ParameterizedType
            r4 = 0
            if (r3 == 0) goto L7b
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
        L76:
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            goto L90
        L7b:
            java.lang.reflect.Type r11 = r10.getGenericSuperclass()
            boolean r11 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r11 == 0) goto L8e
            java.lang.reflect.Type r11 = r10.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.Class r10 = r10.getSuperclass()
            goto L76
        L8e:
            r10 = r4
            r11 = r10
        L90:
            r5 = r4
            r3 = 0
            r4 = 0
        L93:
            int r6 = r2.length
            if (r3 >= r6) goto Lc9
            if (r11 == 0) goto Lc9
            r6 = r2[r3]
            boolean r7 = r6 instanceof java.lang.reflect.TypeVariable
            if (r7 == 0) goto Lc6
            java.lang.reflect.TypeVariable r6 = (java.lang.reflect.TypeVariable) r6
            r7 = r5
            r5 = r4
            r4 = 0
        La3:
            int r8 = r10.length
            if (r4 >= r8) goto Lc4
            r8 = r10[r4]
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = r6.getName()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto Lc1
            if (r7 != 0) goto Lbc
            java.lang.reflect.Type[] r7 = r11.getActualTypeArguments()
        Lbc:
            r5 = r7[r4]
            r2[r3] = r5
            r5 = 1
        Lc1:
            int r4 = r4 + 1
            goto La3
        Lc4:
            r4 = r5
            r5 = r7
        Lc6:
            int r3 = r3 + 1
            goto L93
        Lc9:
            if (r4 == 0) goto Ld9
            com.alibaba.fastjson.util.ParameterizedTypeImpl r10 = new com.alibaba.fastjson.util.ParameterizedTypeImpl
            java.lang.reflect.Type r11 = r0.getOwnerType()
            java.lang.reflect.Type r12 = r0.getRawType()
            r10.<init>(r2, r11, r12)
            return r10
        Ld9:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.FieldInfo.getFieldType(java.lang.Class, java.lang.reflect.Type, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldInfo fieldInfo) {
        int i = this.ordinal;
        int i2 = fieldInfo.ordinal;
        if (i < i2) {
            return -1;
        }
        if (i <= i2) {
            return this.name.compareTo(fieldInfo.name);
        }
        return 1;
    }

    public boolean equals(FieldInfo fieldInfo) {
        return fieldInfo == this || compareTo(fieldInfo) == 0;
    }

    public Object get(Object obj) throws IllegalAccessException, InvocationTargetException {
        return this.fieldAccess ? this.field.get(obj) : this.method.invoke(obj, new Object[0]);
    }

    public JSONField getAnnotation() {
        JSONField jSONField = this.fieldAnnotation;
        return jSONField != null ? jSONField : this.methodAnnotation;
    }

    public void set(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Method method = this.method;
        if (method != null) {
            method.invoke(obj, obj2);
        } else {
            this.field.set(obj, obj2);
        }
    }

    public String toString() {
        return this.name;
    }
}
