package com.alipay.mobile.common.transport.ssl;

import com.android.alibaba.ip.runtime.IpChange;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class X509TrustManagerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static X509TrustManager f5609a;

    public static final X509TrustManager getX509TrustManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509TrustManager) ipChange.ipc$dispatch("76c44e24", new Object[0]);
        }
        X509TrustManager x509TrustManager = f5609a;
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        synchronized (X509TrustManager.class) {
            if (f5609a != null) {
                return f5609a;
            }
            f5609a = new X509TrustManagerWrapper();
            return f5609a;
        }
    }

    public static final void setX509TrustManager(X509TrustManager x509TrustManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae2c4a", new Object[]{x509TrustManager});
        } else {
            f5609a = x509TrustManager;
        }
    }

    public static final void resetX509TrustManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b486ddd1", new Object[0]);
        } else {
            f5609a = new X509TrustManagerWrapper();
        }
    }
}
