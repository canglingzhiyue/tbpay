package com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SCLogCatFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SCLogCatInterface f5114a;

    public static void setLogImpl(SCLogCatInterface sCLogCatInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e419d273", new Object[]{sCLogCatInterface});
        } else {
            f5114a = sCLogCatInterface;
        }
    }

    public static SCLogCatInterface getSCLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SCLogCatInterface) ipChange.ipc$dispatch("b3fae11b", new Object[0]);
        }
        SCLogCatInterface sCLogCatInterface = f5114a;
        if (sCLogCatInterface != null) {
            return sCLogCatInterface;
        }
        synchronized (SCLogCatFactory.class) {
            if (f5114a != null) {
                return f5114a;
            }
            if (!PlatformUtil.isAndroidPlatform()) {
                f5114a = PlatformUtil.createJavaLogImpl();
            } else if (PlatformUtil.isAndroidMPaaSPlatform()) {
                f5114a = PlatformUtil.createAndroidMPaaSLogImpl();
            } else {
                f5114a = PlatformUtil.createAndroidLogImpl();
            }
            return f5114a;
        }
    }
}
