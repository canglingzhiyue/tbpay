package com.android.alibaba.ip.runtime;

/* loaded from: classes3.dex */
public interface PatchesLoader {

    /* loaded from: classes3.dex */
    public interface ClassLoaderListener {
        void onLoadResult(String str, boolean z, Throwable th);

        boolean onPrePareLoad(String str);
    }

    /* loaded from: classes3.dex */
    public interface PatchLoaderListener extends ClassLoaderListener {
        void onLoadAllFinish(boolean z);
    }

    void addClassLoadListener(ClassLoaderListener classLoaderListener);

    boolean load();
}
