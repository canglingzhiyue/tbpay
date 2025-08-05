package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import tb.kge;

@JSONType(deserializeFeatures = {JSONReader.Feature.SupportAutoType}, typeName = "java.lang.reflect.ParameterizedType")
/* loaded from: classes2.dex */
public final class j implements ParameterizedType {

    /* renamed from: a  reason: collision with root package name */
    private final Type[] f3037a;
    private final Type b = null;
    private final Type c;

    static {
        kge.a(842198984);
        kge.a(-1358034611);
    }

    public j(Type type, Type... typeArr) {
        this.c = type;
        this.f3037a = typeArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j jVar = (j) obj;
            if (!Arrays.equals(this.f3037a, jVar.f3037a)) {
                return false;
            }
            Type type = this.b;
            if (type == null ? jVar.b != null : !type.equals(jVar.b)) {
                return false;
            }
            Type type2 = this.c;
            if (type2 != null) {
                return type2.equals(jVar.c);
            }
            if (jVar.c == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f3037a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.c;
    }

    public int hashCode() {
        Type[] typeArr = this.f3037a;
        int i = 0;
        int hashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.b;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.c;
        if (type2 != null) {
            i = type2.hashCode();
        }
        return hashCode2 + i;
    }
}
