package com.taobao.android.tbuprofen.magic;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class RuntimeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static native boolean disableVerifierNative();

    private static native boolean isVerifierEnableNative();

    static {
        kge.a(-1889609516);
        System.loadLibrary("tbuprofen-magic");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return disableVerifierNative();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return isVerifierEnableNative();
    }
}
