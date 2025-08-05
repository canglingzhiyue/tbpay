package com.alipay.mobile.common.transport.http;

import android.os.Build;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.ssl.ZCustSSLSocketFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.SSLSocketUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* loaded from: classes3.dex */
public class ZSSLSocketFactory implements LayeredSocketFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static X509HostnameVerifier f5566a = SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("f9006d73", new Object[]{this, socket, str, new Integer(i), new Boolean(z)});
        }
        SSLSocket sSLSocket = (SSLSocket) ZCustSSLSocketFactory.getSSLSocketFactory().createSocket(socket, str, i, z);
        if (Build.VERSION.SDK_INT < 20 && MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.LOW_VERSION_ENABLE_SSL))) {
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            sSLSocket.setEnabledProtocols(supportedProtocols);
            LogCatUtil.debug("ZSSLSocketFactory", "force enable: " + Arrays.toString(supportedProtocols));
        }
        SSLSocketUtil.enableTlsExtensions(sSLSocket, str);
        int soTimeout = socket.getSoTimeout();
        a(socket, 15000);
        try {
            sSLSocket.startHandshake();
            a(socket, soTimeout);
            f5566a.verify(str, sSLSocket);
            return sSLSocket;
        } catch (Throwable th) {
            a(socket, soTimeout);
            throw th;
        }
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Socket) ipChange.ipc$dispatch("d90ad0b5", new Object[]{this}) : (SSLSocket) ZCustSSLSocketFactory.getSSLSocketFactory().createSocket();
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
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
            f5566a.verify(str, sSLSocket);
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
    public boolean isSecure(Socket socket) {
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
            f5566a = x509HostnameVerifier;
        }
    }

    public X509HostnameVerifier getHostnameVerifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (X509HostnameVerifier) ipChange.ipc$dispatch("eb72f913", new Object[]{this}) : f5566a;
    }

    private void a(Socket socket, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408e911c", new Object[]{this, socket, new Integer(i)});
            return;
        }
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.setSoTimeout(i);
        } catch (Exception e) {
            LogCatUtil.warn("ZSSLSocketFactory", "setSoTimeout exception : " + e.toString());
        }
    }

    public static final void setX509HostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f276b1e5", new Object[]{x509HostnameVerifier});
        } else {
            f5566a = x509HostnameVerifier;
        }
    }

    public static final void resetX509HostnameVerifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec66d745", new Object[0]);
        } else {
            f5566a = SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        }
    }
}
