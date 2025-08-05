package com.mobile.auth;

import android.net.Network;
import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import anet.channel.util.HttpConstant;
import com.cmic.sso.sdk.a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public class O00o0000 extends O00O0O0o {
    private static final String[] O00000o0 = {"TLSv1.2"};
    private final HttpsURLConnection O00000oO;
    private final Network O00000oo;
    private final a O0000O0o;
    private final String O00000o = O00o0000.class.getSimpleName();
    HostnameVerifier O00000Oo = HttpsURLConnection.getDefaultHostnameVerifier();

    public O00o0000(HttpsURLConnection httpsURLConnection, Network network, a aVar) {
        this.O00000oO = httpsURLConnection;
        this.O00000oo = network;
        this.O0000O0o = aVar;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        String requestProperty = this.O00000oO.getRequestProperty(HttpConstant.HOST);
        if (requestProperty != null) {
            str = requestProperty;
        }
        String str2 = this.O00000o;
        O0O000o.O00000Oo(str2, "customized createSocket. host: " + str);
        String str3 = this.O00000o;
        O0O000o.O00000Oo(str3, "plainSocket localAddress: " + socket.getLocalAddress().getHostAddress());
        if (z) {
            O0O000o.O00000Oo(this.O00000o, "plainSocket close");
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket();
        if (this.O00000oo != null && Build.VERSION.SDK_INT >= 21) {
            this.O00000oo.bindSocket(sSLSocket);
        }
        sSLSocket.connect(socket.getRemoteSocketAddress());
        this.O0000O0o.a("socketip", sSLSocket.getLocalAddress().getHostAddress());
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        if (Build.VERSION.SDK_INT < 20) {
            O0O000o.O00000Oo(this.O00000o, "5.0以下启动tls 1.2");
            sSLSocket.setEnabledProtocols(O00000o0);
            sSLSocket.setEnabledCipherSuites(new String[]{"TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"});
        }
        if (Build.VERSION.SDK_INT >= 17) {
            O0O000o.O00000Oo(this.O00000o, "Setting SNI hostname");
            sSLCertificateSocketFactory.setHostname(sSLSocket, str);
        } else {
            O0O000o.O00000Oo(this.O00000o, "No documented SNI support on Android <4.2, trying with reflection");
            try {
                sSLSocket.getClass().getMethod("setHostname", String.class).invoke(sSLSocket, str);
            } catch (Exception e) {
                e.printStackTrace();
                O0O000o.O000000o(this.O00000o, "SNI not useable");
            }
        }
        SSLSession session = sSLSocket.getSession();
        if (!this.O00000Oo.verify(str, session)) {
            throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
        }
        String str4 = this.O00000o;
        O0O000o.O00000Oo(str4, "Established " + session.getProtocol() + " connection with " + session.getPeerHost() + " using " + session.getCipherSuite());
        return sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
