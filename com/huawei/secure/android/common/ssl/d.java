package com.huawei.secure.android.common.ssl;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import tb.cyq;
import tb.cyr;
import tb.cyu;

@Deprecated
/* loaded from: classes4.dex */
public class d extends SSLSocketFactory {
    @Deprecated
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    @Deprecated
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();

    /* renamed from: a  reason: collision with root package name */
    private static final String f7608a = d.class.getSimpleName();
    private static volatile d b = null;
    private SSLContext c = null;
    private SSLSocket d = null;
    private Context e;
    private String[] f;
    private X509TrustManager g;
    private String[] h;
    private String[] i;
    private String[] j;

    private d(Context context) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        if (context == null) {
            cyu.c(f7608a, "SecureSSLSocketFactory: context is null");
            return;
        }
        b(context);
        a(c.a());
        this.g = f.a(context);
        this.c.init(null, new X509TrustManager[]{this.g}, null);
    }

    public static d a(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        cyr.a(context);
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d(context);
                }
            }
        }
        if (b.e == null && context != null) {
            b.b(context);
        }
        String str = "getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
        return b;
    }

    private void a(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (!cyq.a(this.j)) {
            cyu.a(f7608a, "set protocols");
            c.c((SSLSocket) socket, this.j);
            z = true;
        } else {
            z = false;
        }
        if (!cyq.a(this.i) || !cyq.a(this.h)) {
            cyu.a(f7608a, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            c.d(sSLSocket);
            if (!cyq.a(this.i)) {
                c.a(sSLSocket, this.i);
            } else {
                c.b(sSLSocket, this.h);
            }
        } else {
            z2 = false;
        }
        if (!z) {
            cyu.a(f7608a, "set default protocols");
            c.d((SSLSocket) socket);
        }
        if (!z2) {
            cyu.a(f7608a, "set default cipher suites");
            c.a((SSLSocket) socket);
        }
    }

    public void a(SSLContext sSLContext) {
        this.c = sSLContext;
    }

    public void b(Context context) {
        this.e = context.getApplicationContext();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        cyu.a(f7608a, "createSocket: host , port");
        Socket createSocket = this.c.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.d = (SSLSocket) createSocket;
            this.f = (String[]) this.d.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        cyu.a(f7608a, "createSocket s host port autoClose");
        Socket createSocket = this.c.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.d = (SSLSocket) createSocket;
            this.f = (String[]) this.d.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f;
        return strArr != null ? strArr : new String[0];
    }
}
