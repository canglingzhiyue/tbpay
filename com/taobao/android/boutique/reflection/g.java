package com.taobao.android.boutique.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public interface g {
    Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException;

    Field[] a(Class<?> cls) throws SecurityException;

    Field getDeclaredField(Class<?> cls, String str) throws NoSuchFieldException;
}
