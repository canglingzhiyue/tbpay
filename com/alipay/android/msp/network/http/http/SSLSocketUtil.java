package com.alipay.android.msp.network.http.http;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

@Deprecated
/* loaded from: classes3.dex */
public class SSLSocketUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f4930a;
    private static Method b;
    private static Method c;
    private static SSLCertificateSocketFactory d;

    public static final void enableTlsExtensions(SSLSocket sSLSocket, String str) {
        Class<?> e;
        if (sSLSocket != null && !sSLSocket.isClosed() && !sSLSocket.isInputShutdown() && !sSLSocket.isOutputShutdown()) {
            if ((Build.VERSION.SDK_INT > 25 && a(sSLSocket, str)) || (e = e()) == null || !e.isInstance(sSLSocket)) {
                return;
            }
            try {
                Method c2 = c();
                if (c2 != null) {
                    c2.invoke(sSLSocket, Boolean.TRUE);
                }
                Method d2 = d();
                if (d2 == null) {
                    return;
                }
                d2.invoke(sSLSocket, str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static boolean a(SSLSocket sSLSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14eb5776", new Object[]{sSLSocket, str})).booleanValue();
        }
        SSLCertificateSocketFactory a2 = a();
        if (a2 == null) {
            LogUtil.record(4, "SSLSocketUtil:enableTlsExtensionsV2", "[enableTlsExtensionsV2] sslCertificateSocketFactory is null.");
            return false;
        }
        try {
            a2.setHostname(sSLSocket, str);
            a2.setUseSessionTickets(sSLSocket, true);
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    private static SSLCertificateSocketFactory a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLCertificateSocketFactory) ipChange.ipc$dispatch("9354a31f", new Object[0]);
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = d;
        if (sSLCertificateSocketFactory != null) {
            return sSLCertificateSocketFactory;
        }
        synchronized (SSLSocketUtil.class) {
            if (d != null) {
                return d;
            }
            d = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(12000);
            d.setTrustManagers(new TrustManager[]{b()});
            return d;
        }
    }

    private static X509TrustManager b() throws KeyManagementException {
        TrustManager[] trustManagers;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509TrustManager) ipChange.ipc$dispatch("e7225e73", new Object[0]);
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new KeyManagementException("Failed to find an X509TrustManager in " + Arrays.toString(trustManagers));
        } catch (KeyStoreException e) {
            throw new KeyManagementException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new KeyManagementException(e2);
        }
    }

    private static final Method d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3554a9f3", new Object[0]);
        }
        Method method = c;
        if (method != null) {
            return method;
        }
        try {
            c = e().getMethod("setHostname", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return c;
    }

    private static final Method c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("34a7fe54", new Object[0]);
        }
        Method method = b;
        if (method != null) {
            return method;
        }
        try {
            b = e().getMethod("setUseSessionTickets", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return b;
    }

    private static final Class<?> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("8fe80319", new Object[0]);
        }
        Class<?> cls = f4930a;
        if (cls != null) {
            return cls;
        }
        synchronized (SSLSocketUtil.class) {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (f4930a != null) {
                return f4930a;
            }
            try {
                f4930a = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                f4930a = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            return f4930a;
        }
    }
}
