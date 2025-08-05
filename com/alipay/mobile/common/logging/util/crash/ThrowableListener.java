package com.alipay.mobile.common.logging.util.crash;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public abstract class ThrowableListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ThrowableListener f5471a;

    public abstract void onThrowable(String str);

    public static void addThrowableListener(ThrowableListener throwableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810ebb6a", new Object[]{throwableListener});
            return;
        }
        try {
            f5471a = throwableListener;
        } catch (Throwable unused) {
        }
    }

    public static void processThrowable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a791ef62", new Object[]{str});
            return;
        }
        try {
            if (f5471a == null) {
                return;
            }
            f5471a.onThrowable(str);
        } catch (Throwable unused) {
        }
    }
}
