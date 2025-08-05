package com.alibaba.android.split.core.internal;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes2.dex */
public final class JudgerFromExpire implements DexOptJudger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1280167012);
        kge.a(1380541967);
    }

    @Override // com.alibaba.android.split.core.internal.DexOptJudger
    public final boolean hasDexOpted(Object obj, File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8cca70a", new Object[]{this, obj, file, file2})).booleanValue();
        }
        try {
            return !((Boolean) ObjectInvoker.invoke((Class) Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, (Object) file.getPath())).booleanValue();
        } catch (Exception unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
