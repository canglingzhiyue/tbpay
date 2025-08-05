package com.alipay.mobile.common.transport.ssl;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public class X509TrustManagerWrapper extends EmptyX509TrustManagerWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final X509TrustManager f5610a;

    public X509TrustManagerWrapper(X509TrustManager x509TrustManager) {
        this.f5610a = x509TrustManager;
    }

    public X509TrustManagerWrapper() {
        this.f5610a = a();
    }

    @Override // com.alipay.mobile.common.transport.ssl.EmptyX509TrustManagerWrapper, javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee06893b", new Object[]{this, x509CertificateArr, str});
            return;
        }
        LogCatUtil.info("X509TrustManagerWrapper", "[checkClientTrusted] enter");
        this.f5610a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // com.alipay.mobile.common.transport.ssl.EmptyX509TrustManagerWrapper, javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6d06b3", new Object[]{this, x509CertificateArr, str});
            return;
        }
        LogCatUtil.info("X509TrustManagerWrapper", "[checkServerTrusted] enter.");
        try {
            this.f5610a.checkServerTrusted(x509CertificateArr, str);
        } catch (Throwable th) {
            LogCatUtil.info("X509TrustManagerWrapper", "checkServerTrusted: authMethod:" + str + ", x509Certificates: " + Arrays.toString(x509CertificateArr));
            if (th instanceof CertificateException) {
                throw ((CertificateException) th);
            }
            throw new CertificateException(th);
        }
    }

    @Override // com.alipay.mobile.common.transport.ssl.EmptyX509TrustManagerWrapper, javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate[]) ipChange.ipc$dispatch("cdefad90", new Object[]{this});
        }
        X509Certificate[] acceptedIssuers = this.f5610a.getAcceptedIssuers();
        StringBuilder sb = new StringBuilder();
        sb.append("[getAcceptedIssuers] acceptedIssuers len : ");
        sb.append(acceptedIssuers != null ? Integer.valueOf(acceptedIssuers.length) : " is null. ");
        LogCatUtil.info("X509TrustManagerWrapper", sb.toString());
        return acceptedIssuers;
    }

    private static final X509TrustManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509TrustManager) ipChange.ipc$dispatch("72e32614", new Object[0]);
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            return a(trustManagerFactory.getTrustManagers());
        } catch (KeyStoreException e) {
            throw new KeyManagementException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new KeyManagementException(e2);
        }
    }

    private static final X509TrustManager a(TrustManager[] trustManagerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509TrustManager) ipChange.ipc$dispatch("9493f4e3", new Object[]{trustManagerArr});
        }
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new KeyManagementException("Failed to find an X509TrustManager in " + Arrays.toString(trustManagerArr));
    }
}
