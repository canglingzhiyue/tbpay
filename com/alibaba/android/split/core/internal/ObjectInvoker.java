package com.alibaba.android.split.core.internal;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class ObjectInvoker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(837630499);
    }

    public static Object invoke(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(method(obj, str, cls2).invoke(obj, obj2));
        } catch (Exception e) {
            throw new InvokeException(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    public static Object invoke(Class cls, String str, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(method(cls, str, cls3).invoke(null, obj));
        } catch (Exception e) {
            throw new InvokeException(String.format("Failed to invoke static method %s on type %s", str, cls), e);
        }
    }

    public static Object invoke(Class cls, String str, Class cls2, Class cls3, Object obj, Class cls4, Object obj2) {
        try {
            return cls2.cast(method(cls, str, cls3, cls4).invoke(null, obj, obj2));
        } catch (Exception e) {
            throw new InvokeException(String.format("Failed to invoke static method %s on type %s", str, cls), e);
        }
    }

    public static Object invoke(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(method(obj, str, cls2, cls3, cls4).invoke(null, obj2, obj3, obj4));
        } catch (Exception e) {
            throw new InvokeException(String.format("Failed to invoke static method %s on type %s", str, obj), e);
        }
    }

    public static FieldObjectHolder create(Object obj, String str, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FieldObjectHolder) ipChange.ipc$dispatch("189c87b8", new Object[]{obj, str, cls}) : new FieldObjectHolder(obj, field(obj, str), cls);
    }

    public static FieldObjectHolder arrayCreate(Object obj, String str, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FieldObjectHolder) ipChange.ipc$dispatch("f777875f", new Object[]{obj, str, cls}) : new FieldObjectHolder(obj, field(obj, str), cls);
    }

    private static Method method(Object obj, String str, Class... clsArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Method) ipChange.ipc$dispatch("a88561e8", new Object[]{obj, str, clsArr}) : method((Class) obj.getClass(), str, clsArr);
    }

    private static Method method(Class cls, String str, Class... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("2530d6f7", new Object[]{cls, str, clsArr});
        }
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new InvokeException(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    private static Field field(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("7d5fcca4", new Object[]{obj, str});
        }
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new InvokeException(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    public static String digest(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1420f48e", new Object[]{bArr});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static Object notNull(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e133d199", new Object[]{obj, obj2});
        }
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
        return obj;
    }

    public static void notFalse(boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f781b9", new Object[]{new Boolean(z), obj});
        } else if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object invoke(Object obj, String str, Class<Object[]> cls, Class<List> cls2, List<File> list, Class<File> cls3, File file, Class<List> cls4, List<IOException> list2, Class<ClassLoader> cls5, ClassLoader classLoader) {
        try {
            return cls.cast(method(obj, str, cls2, cls3, cls4, cls5).invoke(null, list, file, list2, classLoader));
        } catch (Exception e) {
            throw new InvokeException(String.format("Failed to invoke static method %s on type %s", str, obj), e);
        }
    }
}
