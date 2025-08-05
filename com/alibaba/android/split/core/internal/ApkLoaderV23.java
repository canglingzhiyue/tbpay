package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.bgv;
import tb.kge;

/* loaded from: classes2.dex */
public final class ApkLoaderV23 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ApkLoaderV23";
    private static bgv sLogger;

    static {
        kge.a(1393239296);
        kge.a(-324479817);
        sLogger = new bgv(TAG);
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a833250", new Object[]{this, classLoader, set, new Boolean(z)});
        } else {
            injectNativelibs(classLoader, set, new PathElementsMakerAboveV22(), z);
        }
    }

    public static void injectNativelibs(ClassLoader classLoader, Set<File> set, PathElementsMaker pathElementsMaker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52d0b5", new Object[]{classLoader, set, pathElementsMaker, new Boolean(z)});
        } else if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File file : set) {
                hashSet.add(file.getParentFile());
            }
            Object dexPathList = ApkLoaderV21.dexPathList(classLoader);
            List list = (List) ObjectInvoker.create(dexPathList, "nativeLibraryDirectories", List.class).getObject();
            hashSet.removeAll(list);
            list.addAll(hashSet);
            ArrayList arrayList = new ArrayList();
            Object[] makeElements = pathElementsMaker.makeElements(dexPathList, new ArrayList(hashSet), null, arrayList);
            if (arrayList.size() > 0) {
                throw new SplitLoadException("Error in makePathElements");
            }
            ObjectInvoker.arrayCreate(dexPathList, "nativeLibraryPathElements", Object.class).setObjectsArrayBefore(makeElements);
        }
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final boolean loadDex(ClassLoader classLoader, File file, q qVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("91cbc261", new Object[]{this, classLoader, file, qVar, new Boolean(z), new Boolean(z2)})).booleanValue() : injectDexElements(classLoader, file, qVar, z, WeexZipModule.NAME, z2);
    }

    public static boolean injectDexElements(ClassLoader classLoader, File file, q qVar, boolean z, String str, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f27e0123", new Object[]{classLoader, file, qVar, new Boolean(z), str, new Boolean(z2)})).booleanValue() : ApkLoaderV21.injectDexElements(classLoader, file, qVar, z, new V23DexElementsMaker(), str, new JudgerFromExits(), z2);
    }

    private static Object[] makePathElementsInternal(Object obj, List<File> list, File file, List<IOException> list2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("c9b23f44", new Object[]{obj, list, file, list2}) : (Object[]) ObjectInvoker.invoke(obj, "makePathElements", Object[].class, List.class, list, File.class, file, List.class, list2);
    }

    private static Object[] makeDexElementsInternal(Object obj, List<File> list, File file, List<IOException> list2, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("c4e7bdb2", new Object[]{obj, list, file, list2, classLoader}) : (Object[]) ObjectInvoker.invoke(obj, "makeDexElements", Object[].class, List.class, list, File.class, file, List.class, list2, ClassLoader.class, classLoader);
    }

    public static Object[] makePathElements(Object obj, List<File> list, File file, List<IOException> list2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("af6f1a27", new Object[]{obj, list, file, list2}) : makePathElementsInternal(obj, list, file, list2);
    }

    public static Object[] makeDexElements(Object obj, List<File> list, File file, List<IOException> list2, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("fc869d6f", new Object[]{obj, list, file, list2, classLoader}) : makeDexElementsInternal(obj, list, file, list2, classLoader);
    }
}
