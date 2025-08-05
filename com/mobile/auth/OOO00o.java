package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class OOO00o extends SSLSocketFactory {
    private static final String[] O00000Oo = {"TLSv1.1", "TLSv1.2"};
    final SSLSocketFactory O000000o;

    public OOO00o(SSLSocketFactory sSLSocketFactory) {
        this.O000000o = sSLSocketFactory;
    }

    private static Socket O000000o(Socket socket) {
        try {
            if (socket instanceof SSLSocket) {
                ((SSLSocket) socket).setEnabledProtocols(O00000Oo);
            }
            return socket;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        try {
            return O000000o(this.O000000o.createSocket(str, i));
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        try {
            return O000000o(this.O000000o.createSocket(str, i, inetAddress, i2));
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        try {
            return O000000o(this.O000000o.createSocket(inetAddress, i));
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        try {
            return O000000o(this.O000000o.createSocket(inetAddress, i, inetAddress2, i2));
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        try {
            return O000000o(this.O000000o.createSocket(socket, str, i, z));
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return this.O000000o.getDefaultCipherSuites();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return this.O000000o.getSupportedCipherSuites();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
