package com.taobao.android.bsdiff;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class Bsdiff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static native int nativePatch(String str, String str2, String str3);

    static {
        try {
            System.loadLibrary("bsdiff-jni");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static int patch(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("92c9f160", new Object[]{str, str2, str3})).intValue() : nativePatch(str, str2, str3);
    }
}
