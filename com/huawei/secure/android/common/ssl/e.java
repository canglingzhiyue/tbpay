package com.huawei.secure.android.common.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import tb.cyq;
import tb.cyu;

/* loaded from: classes4.dex */
public class e extends SSLSocketFactory {
    private static final String h = "e";
    private static volatile e i;

    /* renamed from: a  reason: collision with root package name */
    protected SSLContext f7609a;
    protected SSLSocket b = null;
    protected String[] c;
    protected X509TrustManager d;
    protected String[] e;
    protected String[] f;
    protected String[] g;

    public e(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f7609a = null;
        this.f7609a = c.a();
        a(x509TrustManager);
        this.f7609a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    private void a(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (!cyq.a(this.g)) {
            cyu.a(h, "set protocols");
            c.c((SSLSocket) socket, this.g);
            z = true;
        } else {
            z = false;
        }
        if (!cyq.a(this.f) || !cyq.a(this.e)) {
            cyu.a(h, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            c.d(sSLSocket);
            if (!cyq.a(this.f)) {
                c.a(sSLSocket, this.f);
            } else {
                c.b(sSLSocket, this.e);
            }
        } else {
            z2 = false;
        }
        if (!z) {
            cyu.a(h, "set default protocols");
            c.d((SSLSocket) socket);
        }
        if (!z2) {
            cyu.a(h, "set default cipher suites");
            c.a((SSLSocket) socket);
        }
    }

    public void a(X509TrustManager x509TrustManager) {
        this.d = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2) throws IOException {
        cyu.a(h, "createSocket: host , port");
        Socket createSocket = this.f7609a.getSocketFactory().createSocket(str, i2);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.b = (SSLSocket) createSocket;
            this.c = (String[]) this.b.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws IOException, UnknownHostException {
        return createSocket(str, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        cyu.a(h, "createSocket s host port autoClose");
        Socket createSocket = this.f7609a.getSocketFactory().createSocket(socket, str, i2, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.b = (SSLSocket) createSocket;
            this.c = (String[]) this.b.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.c;
        return strArr != null ? strArr : new String[0];
    }
}
