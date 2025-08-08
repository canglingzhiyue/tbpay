package com.taobao.pexode.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import tb.kge;
import tb.qol;

/* loaded from: classes.dex */
public class NdkCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18683a;
    private static String[] b;

    private static native boolean nativeCpuSupportNEON();

    private static native String nativeGetCpuAbi(String str);

    private static native String nativeGetCpuAbiList();

    private static native boolean nativeIsSeekable(FileDescriptor fileDescriptor);

    private static native int nativeLoadedVersionTest();

    public static native void nativePinBitmap(Bitmap bitmap) throws RuntimeException;

    public static native void nativePinBitmapWithAddr(Bitmap bitmap, long[] jArr) throws Exception;

    public static native void nativeUnpinBitmap(Bitmap bitmap) throws RuntimeException;

    static {
        kge.a(-1364842689);
        b = null;
        try {
            System.loadLibrary("pexcore");
            f18683a = nativeLoadedVersionTest() == 2;
            qol.f(com.taobao.pexode.d.TAG, "system load lib%s.so success", "pexcore");
        } catch (UnsatisfiedLinkError e) {
            qol.h(com.taobao.pexode.d.TAG, "system load lib%s.so error=%s", "pexcore", e);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f18683a) {
        } else {
            f18683a = d.a("pexcore", 2) && nativeLoadedVersionTest() == 2;
            qol.f(com.taobao.pexode.d.TAG, "retry load lib%s.so result=%b", "pexcore", Boolean.valueOf(f18683a));
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f18683a;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (b == null) {
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    String nativeGetCpuAbiList = nativeGetCpuAbiList();
                    if (!StringUtils.isEmpty(nativeGetCpuAbiList)) {
                        b = nativeGetCpuAbiList.split(",");
                    }
                } else {
                    b = new String[]{nativeGetCpuAbi(Build.CPU_ABI)};
                }
            } catch (UnsatisfiedLinkError e) {
                qol.h(com.taobao.pexode.d.TAG, "NdkCore.isCpuAbiSupported error=%s", e);
            }
            if (b == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    b = Build.SUPPORTED_ABIS;
                } else {
                    b = new String[]{Build.CPU_ABI};
                }
            }
        }
        for (String str2 : b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
