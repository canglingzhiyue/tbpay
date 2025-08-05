package com.alibaba.android.split.core.internal;

import android.util.Log;
import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import dalvik.system.DexFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.bgt;
import tb.kge;

/* loaded from: classes2.dex */
public final class ApkLoaderV21 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String INSTANT_TAG = "instant";
    private static final String PATCH_TAG = "patch";
    private static final String TAG = "ApkLoaderV21";
    private static Object sCookie;
    private static bgt sLogger;

    static {
        kge.a(1393239294);
        kge.a(-324479817);
        sCookie = null;
        sLogger = new bgt(TAG);
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a833250", new Object[]{this, classLoader, set, new Boolean(z)});
        } else {
            injectNativeLibs(classLoader, set, z);
        }
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final boolean loadDex(ClassLoader classLoader, File file, q qVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("91cbc261", new Object[]{this, classLoader, file, qVar, new Boolean(z), new Boolean(z2)})).booleanValue() : injectDexElements(classLoader, file, qVar, z, new NomalDexElementMaker(), WeexZipModule.NAME, new JudgerFromExits(), z2);
    }

    public static void injectNativeLibs(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35e4e82", new Object[]{classLoader, set, new Boolean(z)});
        } else if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File file : set) {
                String absolutePath = file.getParentFile().getAbsolutePath();
                if (file.length() != 0) {
                    "Adding native library parent directory: ".concat(absolutePath);
                }
                hashSet.add(file.getParentFile());
            }
            FieldObjectHolder arrayCreate = ObjectInvoker.arrayCreate(dexPathList(classLoader), "nativeLibraryDirectories", File[].class);
            List asList = Arrays.asList((File[]) arrayCreate.getObject());
            if (!z) {
                hashSet.removeAll(asList);
                int size = hashSet.size();
                StringBuilder sb = new StringBuilder(30);
                sb.append("Adding directories ");
                sb.append(size);
                Log.e(TAG, sb.toString());
                if (size <= 0) {
                    return;
                }
                arrayCreate.setObjectsArrayBefore(hashSet);
            } else if (hashSet.size() > 0) {
                arrayCreate.setObjectsArrayBefore(hashSet);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a A[EDGE_INSN: B:63:0x011a->B:39:0x011a ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean injectDexElements(java.lang.ClassLoader r16, java.io.File r17, com.alibaba.android.split.q r18, boolean r19, com.alibaba.android.split.core.internal.DexElementsMaker r20, java.lang.String r21, com.alibaba.android.split.core.internal.DexOptJudger r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.internal.ApkLoaderV21.injectDexElements(java.lang.ClassLoader, java.io.File, com.alibaba.android.split.q, boolean, com.alibaba.android.split.core.internal.DexElementsMaker, java.lang.String, com.alibaba.android.split.core.internal.DexOptJudger, boolean):boolean");
    }

    private static void replaceOriginalPatch(List list, Object[] objArr, String str, FieldObjectHolder fieldObjectHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b55ff14", new Object[]{list, objArr, str, fieldObjectHolder});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            DexFile dexFile = (DexFile) ObjectInvoker.create(obj, str, DexFile.class).getObject();
            if (!dexFile.toString().contains(PATCH_TAG) && !dexFile.toString().contains("instant")) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(obj2);
        }
        fieldObjectHolder.replaceObjectsArray(arrayList);
    }

    private static boolean hasPatched(Collection<Object> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a6d23a9", new Object[]{collection})).booleanValue();
        }
        for (Object obj : collection) {
            DexFile dexFile = (DexFile) ObjectInvoker.create(obj, "dexFile", DexFile.class).getObject();
            if (dexFile.toString().contains(PATCH_TAG) && dexFile.toString().contains("instant")) {
                return true;
            }
        }
        return false;
    }

    public static Object dexPathList(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fa13fc29", new Object[]{classLoader}) : ObjectInvoker.create(classLoader, "pathList", Object.class).getObject();
    }
}
