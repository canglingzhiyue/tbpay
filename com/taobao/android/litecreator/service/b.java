package com.taobao.android.litecreator.service;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(858043091);
    }

    public static <T> T a(Class<T> cls, Object... objArr) {
        Constructor<?>[] constructors;
        Constructor<?> constructor;
        ServiceImpl serviceImpl = (ServiceImpl) cls.getAnnotation(ServiceImpl.class);
        if (serviceImpl == null) {
            throw new IllegalArgumentException(cls.getName() + " must annotate BeanImpl");
        }
        try {
            Class<?> cls2 = Class.forName(serviceImpl.value());
            Class<?>[] clsArr = new Class[objArr == null ? 0 : objArr.length];
            for (int i = 0; i < clsArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
            if (clsArr.length == 0) {
                constructor = cls2.getConstructor(clsArr);
            } else {
                Constructor<?> constructor2 = null;
                for (Constructor<?> constructor3 : cls2.getConstructors()) {
                    Class<?>[] parameterTypes = constructor3.getParameterTypes();
                    if (parameterTypes.length == clsArr.length) {
                        boolean z = true;
                        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                            if (!parameterTypes[i2].isAssignableFrom(clsArr[i2])) {
                                z = false;
                            }
                        }
                        if (z) {
                            constructor2 = constructor3;
                        }
                    }
                }
                constructor = constructor2;
            }
            if (constructor == null) {
                throw new NoSuchMethodException("Do you have right constructor with right params input");
            }
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Please make sure you have right ServiceImpl annotation, and keep class avoid proguard ", e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Do you have right constructor with right params input", e2);
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
