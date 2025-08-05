package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class V24DexElementsMaker implements DexElementsMaker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1669335414);
        kge.a(1895230030);
    }

    @Override // com.alibaba.android.split.core.internal.DexElementsMaker
    public final Object[] makeElements(Object obj, ArrayList arrayList, File file, ArrayList arrayList2, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("881c5ada", new Object[]{this, obj, arrayList, file, arrayList2, classLoader}) : ApkLoaderV23.makeDexElements(obj, arrayList, file, arrayList2, classLoader);
    }

    @Override // com.alibaba.android.split.core.internal.DexElementsMaker
    public Object[] makeElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("32eabeb2", new Object[]{this, obj, arrayList, file, arrayList2}) : ApkLoaderV23.makePathElements(obj, arrayList, file, arrayList2);
    }
}
