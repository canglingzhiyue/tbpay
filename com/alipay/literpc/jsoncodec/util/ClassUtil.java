package com.alipay.literpc.jsoncodec.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ClassUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean isSimpleType(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2368a84", new Object[]{cls})).booleanValue() : cls.isPrimitive() || cls.equals(String.class) || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(Boolean.class) || cls.equals(Short.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Void.class);
    }

    public static ParameterizedType makeParameterizedType(final Type type, final Type... typeArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ParameterizedType) ipChange.ipc$dispatch("fd798bad", new Object[]{type, typeArr}) : new ParameterizedType() { // from class: com.alipay.literpc.jsoncodec.util.ClassUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.reflect.ParameterizedType
            public Type getOwnerType() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Type) ipChange2.ipc$dispatch("ea915ba7", new Object[]{this});
                }
                return null;
            }

            @Override // java.lang.reflect.ParameterizedType
            public Type getRawType() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Type) ipChange2.ipc$dispatch("710dcd12", new Object[]{this}) : type;
            }

            @Override // java.lang.reflect.ParameterizedType
            public Type[] getActualTypeArguments() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Type[]) ipChange2.ipc$dispatch("cdcdbcd3", new Object[]{this});
                }
                ArrayList arrayList = new ArrayList();
                for (Type type2 : typeArr) {
                    arrayList.add(type2);
                }
                return (Type[]) arrayList.toArray(new Type[arrayList.size()]);
            }
        };
    }

    public static Class<?> getRawClass(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("987c4d49", new Object[]{type});
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getRawClass(((ParameterizedType) type).getRawType());
        }
        throw new IllegalArgumentException("TODO");
    }
}
