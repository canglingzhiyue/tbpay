package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes2.dex */
public final class SkipDexOpter implements DexOptJudger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1741609728);
        kge.a(1380541967);
    }

    @Override // com.alibaba.android.split.core.internal.DexOptJudger
    public final boolean hasDexOpted(Object obj, File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8cca70a", new Object[]{this, obj, file, file2})).booleanValue();
        }
        return true;
    }
}
