package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.q;
import java.io.File;
import java.util.Set;

/* loaded from: classes.dex */
public interface ApkLoader {
    boolean loadDex(ClassLoader classLoader, File file, q qVar, boolean z, boolean z2);

    void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z);
}
