package com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl;

import com.android.alibaba.ip.runtime.IpChange;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public class DefaultSSLExtensions implements SSLExtensions {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.SSLExtensions
    public void enableTlsExtensions(SSLSocket sSLSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc6e1c7", new Object[]{this, sSLSocket, str});
        }
    }
}
