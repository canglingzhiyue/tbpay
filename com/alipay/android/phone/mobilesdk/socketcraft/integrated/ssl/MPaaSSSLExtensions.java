package com.alipay.android.phone.mobilesdk.socketcraft.integrated.ssl;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.DefaultSSLExtensions;
import com.alipay.mobile.common.transport.utils.SSLSocketUtil;
import com.android.alibaba.ip.runtime.IpChange;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public class MPaaSSSLExtensions extends DefaultSSLExtensions {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.DefaultSSLExtensions, com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.SSLExtensions
    public void enableTlsExtensions(SSLSocket sSLSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc6e1c7", new Object[]{this, sSLSocket, str});
        } else {
            SSLSocketUtil.enableTlsExtensions(sSLSocket, str);
        }
    }
}
