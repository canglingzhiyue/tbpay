package com.alipay.mobile.common.transport.ssl;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class EmptyX509TrustManagerWrapper implements X509TrustManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee06893b", new Object[]{this, x509CertificateArr, str});
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6d06b3", new Object[]{this, x509CertificateArr, str});
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate[]) ipChange.ipc$dispatch("cdefad90", new Object[]{this});
        }
        return null;
    }
}
