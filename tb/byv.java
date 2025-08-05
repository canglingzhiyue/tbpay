package tb;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class byv extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private Method f26190a = null;
    private String b;

    static {
        kge.a(-1523963295);
    }

    public byv(String str) {
        this.b = str;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
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
        if (this.b == null) {
            this.b = str;
        }
        bzd.a("host" + this.b + "port" + i + "autoClose" + z);
        InetAddress inetAddress = socket.getInetAddress();
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        if (Build.VERSION.SDK_INT >= 17) {
            sSLCertificateSocketFactory.setHostname(sSLSocket, this.b);
        } else {
            try {
                if (this.f26190a == null) {
                    this.f26190a = sSLSocket.getClass().getMethod("setHostname", String.class);
                    this.f26190a.setAccessible(true);
                }
                this.f26190a.invoke(sSLSocket, this.b);
            } catch (Exception e) {
                bzd.a("SNI not useable", e);
            }
        }
        sSLSocket.getSession();
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
