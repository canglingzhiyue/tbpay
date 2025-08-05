package com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SSLExtensionsFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SSLExtensions f5116a;

    public static final SSLExtensions getInstance() {
        SSLExtensions sSLExtensions = f5116a;
        if (sSLExtensions != null) {
            return sSLExtensions;
        }
        synchronized (SSLExtensions.class) {
            if (PlatformUtil.isAndroidMPaaSPlatform()) {
                f5116a = (SSLExtensions) Class.forName("com.alipay.android.phone.mobilesdk.socketcraft.integrated.ssl.MPaaSSSLExtensions").newInstance();
                SCLogCatUtil.info("SSLExtensionsFactory", String.format("New instance ok, class: %s", "com.alipay.android.phone.mobilesdk.socketcraft.integrated.ssl.MPaaSSSLExtensions"));
            }
            if (f5116a == null) {
                f5116a = new DefaultSSLExtensions();
            }
        }
        return f5116a;
    }
}
