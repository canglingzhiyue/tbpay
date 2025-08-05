package com.taobao.android.split;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class FlexaNative {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15266a;

    public static native int addAssetPath(Context context, String str);

    public static native String getFileMd5(String str);

    private static native boolean initialize();

    public static native boolean isDexFileRegistered(Object obj);

    public static native boolean mergePatchAndVerify(String str, String str2, String str3, String str4);

    public static native void registerDexFile(ClassLoader classLoader, Object obj);

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f15266a;
    }

    static {
        kge.a(-2082580553);
        f15266a = true;
        try {
            System.loadLibrary("flexa-runtime");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
