package com.taobao.android.alinnkit.net;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.exception.AliNNKitLibraryLoadException;
import tb.dpq;
import tb.dpu;
import tb.ihq;
import tb.ihz;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AliNNKitBaseNet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean sNativeLibAvailable;
    public String mBizName;
    public String mModelFiles;
    public String mModelId;

    public abstract void release();

    static {
        kge.a(248880446);
        sNativeLibAvailable = false;
        try {
            ihz c = ihq.a().c("MNN");
            ihz c2 = ihq.a().c("mnnkitcore");
            ihz c3 = ihq.a().c("MNN_CL");
            ihz c4 = ihq.a().c("MNN_Express");
            if (!c.g()) {
                dpq.c("AliNNJava", "Load Remote libMNN.so failed.", new Object[0]);
            }
            if (!c2.g()) {
                dpq.c("AliNNJava", "Load Remote libmnnkitcore.so failed.", new Object[0]);
            }
            if (!c3.g()) {
                dpq.c("AliNNJava", "Load Remote libMNN_CL.so failed.", new Object[0]);
            }
            if (!c4.g()) {
                dpq.c("AliNNJava", "Load Remote libMNN_Express.so failed.", new Object[0]);
            }
            sNativeLibAvailable = c.g() && c2.g();
        } catch (Throwable th) {
            sNativeLibAvailable = false;
            dpq.d("AliNNJava", "Load libmnnkitcore.so failed with exception=%s", th);
        }
    }

    public static boolean isCpuAbiSupported(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0a93f9", new Object[]{str})).booleanValue();
        }
        for (String str2 : Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI}) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNativeLibAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a7eb450", new Object[0])).booleanValue() : sNativeLibAvailable;
    }

    public static boolean checkIfNativeUnavailable(dpu dpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee1f31e6", new Object[]{dpuVar})).booleanValue();
        }
        boolean z = !sNativeLibAvailable;
        if (z) {
            dpuVar.a(new AliNNKitLibraryLoadException());
        }
        return z;
    }
}
