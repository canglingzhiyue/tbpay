package com.loc;

import android.content.Context;
import android.net.SSLSessionCache;
import android.os.Build;
import com.loc.m;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class bs extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private SSLSocketFactory f7703a;
    private Context b;
    private SSLContext c;

    public bs(Context context, SSLContext sSLContext) {
        if (context != null) {
            try {
                this.b = context.getApplicationContext();
            } catch (Throwable th) {
                try {
                    av.b(th, "myssl", "<init>");
                    try {
                        if (this.c == null && Build.VERSION.SDK_INT >= 9) {
                            this.c = SSLContext.getDefault();
                        }
                    } catch (Throwable th2) {
                        av.b(th2, "myssl", "<init2>");
                    }
                    try {
                        if (this.f7703a != null) {
                            return;
                        }
                        this.f7703a = (SSLSocketFactory) SSLSocketFactory.getDefault();
                        return;
                    } catch (Throwable th3) {
                        av.b(th3, "myssl", "<init3>");
                        return;
                    }
                } catch (Throwable th4) {
                    try {
                        if (this.c == null && Build.VERSION.SDK_INT >= 9) {
                            this.c = SSLContext.getDefault();
                        }
                    } catch (Throwable th5) {
                        av.b(th5, "myssl", "<init2>");
                    }
                    try {
                        if (this.f7703a == null) {
                            this.f7703a = (SSLSocketFactory) SSLSocketFactory.getDefault();
                        }
                    } catch (Throwable th6) {
                        av.b(th6, "myssl", "<init3>");
                    }
                    throw th4;
                }
            }
        }
        this.c = sSLContext;
        if (sSLContext != null) {
            this.f7703a = sSLContext.getSocketFactory();
        }
        try {
            if (this.c == null && Build.VERSION.SDK_INT >= 9) {
                this.c = SSLContext.getDefault();
            }
        } catch (Throwable th7) {
            av.b(th7, "myssl", "<init2>");
        }
        try {
            if (this.f7703a != null) {
                return;
            }
            this.f7703a = (SSLSocketFactory) SSLSocketFactory.getDefault();
        } catch (Throwable th8) {
            av.b(th8, "myssl", "<init3>");
        }
    }

    private static Socket a(Socket socket) {
        try {
            if (Build.VERSION.SDK_INT >= 21 && m.f.b && (socket instanceof SSLSocket)) {
                ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
            }
        } catch (Throwable th) {
            av.b(th, "myssl", "stlv2");
        }
        return socket;
    }

    private void a(SSLSessionCache sSLSessionCache) {
        SSLContext sSLContext = this.c;
        if (sSLContext == null) {
            return;
        }
        try {
            SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
            Field declaredField = sSLSessionCache.getClass().getDeclaredField(x.c("UbVNlc3Npb25DYWNoZQ"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(sSLSessionCache);
            Method[] methods = clientSessionContext.getClass().getMethods();
            String c = x.c("Yc2V0UGVyc2lzdGVudENhY2hl");
            for (Method method : methods) {
                if (method.getName().equals(c)) {
                    method.invoke(clientSessionContext, obj);
                    return;
                }
            }
        } catch (Throwable th) {
            av.b(th, "myssl", "isc2");
        }
    }

    private static void b(Socket socket) {
        if (Build.VERSION.SDK_INT >= 17 && m.f.c && m.f.e && (socket instanceof SSLSocket)) {
            int i = m.f.f > m.f.d ? m.f.d : m.f.f;
            if (i > 17 && Build.VERSION.SDK_INT > i) {
                return;
            }
            try {
                socket.getClass().getMethod(x.c("Cc2V0VXNlU2Vzc2lvblRpY2tldHM"), Boolean.TYPE).invoke(socket, Boolean.TRUE);
            } catch (Throwable th) {
                av.b(th, "myssl", "sust");
            }
        }
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 17 && m.f.c && this.b != null && this.c != null) {
            int i = m.f.d;
            if (i > 17 && Build.VERSION.SDK_INT > i) {
                return;
            }
            SSLSessionCache sSLSessionCache = new SSLSessionCache(this.b);
            if (Build.VERSION.SDK_INT <= 20 || Build.VERSION.SDK_INT >= 28) {
                a(sSLSessionCache);
                return;
            }
            try {
                sSLSessionCache.getClass().getMethod(x.c("MaW5zdGFsbA"), SSLSessionCache.class, SSLContext.class).invoke(sSLSessionCache, sSLSessionCache, this.c);
            } catch (Throwable th) {
                av.b(th, "myssl", "isc1");
                a(sSLSessionCache);
            }
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        boolean z;
        IOException iOException;
        try {
            if (this.f7703a == null) {
                return null;
            }
            Socket a2 = a(this.f7703a.createSocket());
            b(a2);
            return a2;
        } finally {
            if (!z) {
            }
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        try {
            if (this.f7703a == null) {
                return null;
            }
            Socket a2 = a(this.f7703a.createSocket(str, i));
            b(a2);
            return a2;
        } catch (Throwable th) {
            av.b(th, "myssl", "cs3");
            if (th instanceof UnknownHostException) {
                throw ((UnknownHostException) th);
            }
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        try {
            if (this.f7703a == null) {
                return null;
            }
            Socket a2 = a(this.f7703a.createSocket(str, i, inetAddress, i2));
            b(a2);
            return a2;
        } catch (Throwable th) {
            av.b(th, "myssl", "cs4");
            if (th instanceof UnknownHostException) {
                throw ((UnknownHostException) th);
            }
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            return null;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        boolean z;
        IOException iOException;
        try {
            if (this.f7703a == null) {
                return null;
            }
            Socket a2 = a(this.f7703a.createSocket(inetAddress, i));
            b(a2);
            return a2;
        } finally {
            if (!z) {
            }
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        boolean z;
        IOException iOException;
        try {
            if (this.f7703a == null) {
                return null;
            }
            Socket a2 = a(this.f7703a.createSocket(inetAddress, i, inetAddress2, i2));
            b(a2);
            return a2;
        } finally {
            if (!z) {
            }
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        boolean z2;
        IOException iOException;
        try {
            if (this.f7703a == null) {
                return null;
            }
            Socket a2 = a(this.f7703a.createSocket(socket, str, i, z));
            b(a2);
            return a2;
        } finally {
            if (!z2) {
            }
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            if (this.f7703a != null) {
                return this.f7703a.getDefaultCipherSuites();
            }
        } catch (Throwable th) {
            av.b(th, "myssl", "gdcs");
        }
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            if (this.f7703a != null) {
                return this.f7703a.getSupportedCipherSuites();
            }
        } catch (Throwable th) {
            av.b(th, "myssl", "gscs");
        }
        return new String[0];
    }
}
