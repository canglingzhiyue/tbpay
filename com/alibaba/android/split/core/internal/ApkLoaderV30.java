package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Set;
import tb.bgv;
import tb.kge;

/* loaded from: classes.dex */
public class ApkLoaderV30 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static bgv sLogger;

    static {
        kge.a(1393239324);
        kge.a(-324479817);
        sLogger = new bgv("ApkLoaderV30");
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a833250", new Object[]{this, classLoader, set, new Boolean(z)});
        } else {
            ApkLoaderV26.innerLoad(classLoader, set, z);
        }
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public boolean loadDex(ClassLoader classLoader, File file, q qVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91cbc261", new Object[]{this, classLoader, file, qVar, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (z && z2) {
            return ApkLoaderV29.performDexOptSecondary(qVar.a());
        }
        V24DexElementsMaker v24DexElementsMaker = new V24DexElementsMaker();
        SkipDexOpter skipDexOpter = new SkipDexOpter();
        ApkLoaderV29.performDexOptSecondary(qVar.a());
        return ApkLoaderV21.injectDexElements(classLoader, file, qVar, z, v24DexElementsMaker, "path", skipDexOpter, z2);
    }
}
