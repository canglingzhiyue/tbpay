package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import java.io.File;
import java.util.Set;
import tb.kge;

/* loaded from: classes2.dex */
public final class ApkLoaderV22 implements ApkLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1393239295);
        kge.a(-324479817);
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final void loadNativeLib(ClassLoader classLoader, Set<File> set, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a833250", new Object[]{this, classLoader, set, new Boolean(z)});
        } else {
            ApkLoaderV21.injectNativeLibs(classLoader, set, z);
        }
    }

    @Override // com.alibaba.android.split.core.internal.ApkLoader
    public final boolean loadDex(ClassLoader classLoader, File file, q qVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("91cbc261", new Object[]{this, classLoader, file, qVar, new Boolean(z), new Boolean(z2)})).booleanValue() : ApkLoaderV21.injectDexElements(classLoader, file, qVar, z, new NomalDexElementMaker(), WeexZipModule.NAME, new JudgerFromExits(), z2);
    }
}
