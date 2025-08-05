package com.ali.adapt.api;

/* loaded from: classes.dex */
public interface AliServiceFinder {
    <T> T findServiceImpl(Class<T> cls);

    <T> void findServiceImpl(Class<T> cls, AliServiceFindedCallback<T> aliServiceFindedCallback);
}
