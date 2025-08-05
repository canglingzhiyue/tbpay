package com.nirvana.tools.jsoner;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public class d<T> {
    private Constructor mConstructor;
    private Class<? super T> mGenericsClz;

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return JsonHelper.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    private void setup() {
        this.mGenericsClz = (Class<? super T>) JsonHelper.b(getSuperclassTypeParameter(getClass()));
        Class<? super T> cls = this.mGenericsClz;
        if (cls != null) {
            try {
                this.mConstructor = cls.getDeclaredConstructor(new Class[0]);
                return;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return;
            }
        }
        throw new IllegalArgumentException("JsonType's generics is not recognizable!");
    }

    public T newInstance() {
        if (this.mConstructor == null) {
            setup();
        }
        Constructor constructor = this.mConstructor;
        if (constructor != null) {
            try {
                constructor.setAccessible(true);
                return (T) this.mConstructor.newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InstantiationException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
