package anet.channel.util;

import com.android.alibaba.ip.runtime.IpChange;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import tb.kge;

/* loaded from: classes.dex */
public class HttpSslUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated
    public static final HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER;
    @Deprecated
    public static final SSLSocketFactory TRUST_ALL_SSL_SOCKET_FACTORY;
    public static SSLSocketFactory sslSocketFactory;
    public static HostnameVerifier verifier;

    static {
        kge.a(-585344904);
        ALLOW_ALL_HOSTNAME_VERIFIER = null;
        TRUST_ALL_SSL_SOCKET_FACTORY = null;
    }

    public static SSLSocketFactory getSSLSocketFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SSLSocketFactory) ipChange.ipc$dispatch("8af93504", new Object[0]) : sslSocketFactory;
    }

    public static void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f41164a", new Object[]{sSLSocketFactory});
        } else {
            sslSocketFactory = sSLSocketFactory;
        }
    }

    public static HostnameVerifier getHostnameVerifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HostnameVerifier) ipChange.ipc$dispatch("a5b76288", new Object[0]) : verifier;
    }

    public static void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b1f28a", new Object[]{hostnameVerifier});
        } else {
            verifier = hostnameVerifier;
        }
    }
}
