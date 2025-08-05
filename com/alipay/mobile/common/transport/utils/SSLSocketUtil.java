package com.alipay.mobile.common.transport.utils;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import com.alipay.mobile.common.transport.ssl.X509TrustManagerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;

/* loaded from: classes3.dex */
public class SSLSocketUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f5635a;
    private static Method b;
    private static Method c;
    private static SSLCertificateSocketFactory d;

    public static final SSLCertificateSocketFactory getSSLCertificateSocketFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLCertificateSocketFactory) ipChange.ipc$dispatch("148491f4", new Object[0]);
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
            d.setTrustManagers(new TrustManager[]{X509TrustManagerFactory.getX509TrustManager()});
            return d;
        }
    }

    public static final void enableTlsExtensions(SSLSocket sSLSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc6e1c7", new Object[]{sSLSocket, str});
        } else if (sSLSocket == null) {
            LogCatUtil.warn("SSLSocketUtil", "[enableTlsExtensions] Illegal socket param. socket is null.");
        } else if (sSLSocket.isClosed() || sSLSocket.isInputShutdown() || sSLSocket.isOutputShutdown()) {
            LogCatUtil.warn("SSLSocketUtil", "[enableTlsExtensions] Illegal socket param. socket is closed.");
        } else if (Build.VERSION.SDK_INT > 25 && a(sSLSocket, str)) {
        } else {
            b(sSLSocket, str);
        }
    }

    private static boolean a(SSLSocket sSLSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14eb5776", new Object[]{sSLSocket, str})).booleanValue();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = getSSLCertificateSocketFactory();
        if (sSLCertificateSocketFactory == null) {
            LogCatUtil.warn("SSLSocketUtil", "[enableTlsExtensionsV2] sslCertificateSocketFactory is null.");
            return false;
        }
        try {
            sSLCertificateSocketFactory.setHostname(sSLSocket, str);
            sSLCertificateSocketFactory.setUseSessionTickets(sSLSocket, true);
            if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                LogCatUtil.info("SSLSocketUtil", "[enableTlsExtensionsV2] Execution success.");
            }
            return true;
        } catch (Throwable th) {
            LogCatUtil.error("SSLSocketUtil", "[enableTlsExtensionsV2] enableTlsExtensionsV2 fail. Exception：" + th.toString(), th);
            return false;
        }
    }

    private static void b(SSLSocket sSLSocket, String str) {
        Class<?> c2 = c();
        if (c2 == null) {
            LogCatUtil.warn("SSLSocketUtil", "[enableTlsExtensionsV1] localOpenSslSocketClass is null. ");
        } else if (!c2.isInstance(sSLSocket)) {
        } else {
            try {
                Method b2 = b();
                if (b2 != null) {
                    b2.invoke(sSLSocket, true);
                }
                Method a2 = a();
                if (a2 != null) {
                    a2.invoke(sSLSocket, str);
                }
                if (!MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                    return;
                }
                LogCatUtil.info("SSLSocketUtil", "[enableTlsExtensionsV1] Execution success.");
            } catch (Throwable th) {
                LogCatUtil.warn("SSLSocketUtil", "This isn't Android 2.3 or better. getMethodSetHostname exception:" + th.toString());
            }
        }
    }

    private static final Method a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("334ea716", new Object[0]);
        }
        Method method = c;
        if (method != null) {
            return method;
        }
        try {
            c = c().getMethod("setHostname", String.class);
        } catch (NoSuchMethodException e) {
            LogCatUtil.warn("SSLSocketUtil", "This isn't Android 2.3 or better. getMethodSetHostname exception:" + e.toString());
        }
        return c;
    }

    private static final Method b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("33fb52b5", new Object[0]);
        }
        Method method = b;
        if (method != null) {
            return method;
        }
        try {
            b = c().getMethod("setUseSessionTickets", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            LogCatUtil.warn("SSLSocketUtil", "This isn't Android 2.3 or better. getMethodSetUseSessionTickets exception:" + e.toString());
        }
        return b;
    }

    private static final Class<?> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("76b61817", new Object[0]);
        }
        Class<?> cls = f5635a;
        if (cls != null) {
            return cls;
        }
        synchronized (SSLSocketUtil.class) {
            try {
            } catch (Exception e) {
                LogCatUtil.warn("SSLSocketUtil", "This isn't an Android runtime, exception:" + e.toString());
            }
            if (f5635a != null) {
                return f5635a;
            }
            try {
                f5635a = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                f5635a = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            return f5635a;
        }
    }
}
