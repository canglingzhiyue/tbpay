package com.alipay.android.msp.network.http.http;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes3.dex */
public class ZSSLSocketFactory implements LayeredSocketFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private X509HostnameVerifier b = SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;

    /* renamed from: a  reason: collision with root package name */
    private final javax.net.ssl.SSLSocketFactory f4932a = HttpsURLConnection.getDefaultSSLSocketFactory();

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("f9006d73", new Object[]{this, socket, str, new Integer(i), new Boolean(z)});
        }
        SSLSocket sSLSocket = (SSLSocket) this.f4932a.createSocket(socket, str, i, z);
        SSLSocketUtil.enableTlsExtensions(sSLSocket, str);
        int soTimeout = socket.getSoTimeout();
        a(socket, 15000);
        try {
            sSLSocket.startHandshake();
            a(socket, soTimeout);
            this.b.verify(str, sSLSocket);
            return sSLSocket;
        } catch (Throwable th) {
            a(socket, soTimeout);
            throw th;
        }
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Socket) ipChange.ipc$dispatch("d90ad0b5", new Object[]{this}) : (SSLSocket) this.f4932a.createSocket();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) throws IOException, UnknownHostException, ConnectTimeoutException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("7cb83a53", new Object[]{this, socket, str, new Integer(i), inetAddress, new Integer(i2), httpParams});
        }
        if (str == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        if (httpParams == null) {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
        if (socket == null) {
            socket = createSocket();
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        SSLSocketUtil.enableTlsExtensions(sSLSocket, str);
        if (inetAddress != null || i2 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            sSLSocket.bind(new InetSocketAddress(inetAddress, i2));
        }
        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
        int soTimeout = HttpConnectionParams.getSoTimeout(httpParams);
        sSLSocket.connect(new InetSocketAddress(str, i), connectionTimeout);
        sSLSocket.setSoTimeout(soTimeout);
        try {
            this.b.verify(str, sSLSocket);
            return sSLSocket;
        } catch (IOException e) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw e;
        }
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public boolean isSecure(Socket socket) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1dbb9eb", new Object[]{this, socket})).booleanValue();
        }
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        }
        if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        }
        if (socket.isClosed()) {
            throw new IllegalArgumentException("Socket is closed.");
        }
        return true;
    }

    public void setHostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b8584b", new Object[]{this, x509HostnameVerifier});
        } else if (x509HostnameVerifier == null) {
            throw new IllegalArgumentException("Hostname verifier may not be null");
        } else {
            this.b = x509HostnameVerifier;
        }
    }

    public X509HostnameVerifier getHostnameVerifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (X509HostnameVerifier) ipChange.ipc$dispatch("eb72f913", new Object[]{this}) : this.b;
    }

    private static void a(Socket socket, int i) throws SocketException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408e911c", new Object[]{socket, new Integer(i)});
            return;
        }
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.setSoTimeout(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
