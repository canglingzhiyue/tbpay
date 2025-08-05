package com.alibaba.android.split.core.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface DexElementsMaker {
    Object[] makeElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2);

    Object[] makeElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2, ClassLoader classLoader);
}
