package com.alibaba.android.split.core.internal;

import java.lang.ClassLoader;

/* loaded from: classes2.dex */
public interface ClassLoaderTransformer<T extends ClassLoader> {
    T transform(ClassLoader classLoader) throws Exception;
}
