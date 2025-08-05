package com.alipay.android.msp.network.http.http;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes3.dex */
public class ZClientConnectionOperator extends DefaultClientConnectionOperator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final PlainSocketFactory f4931a = new PlainSocketFactory();
    private boolean b;

    public static /* synthetic */ Object ipc$super(ZClientConnectionOperator zClientConnectionOperator, String str, Object... objArr) {
        if (str.hashCode() == -2094754246) {
            super.openConnection((OperatedClientConnection) objArr[0], (HttpHost) objArr[1], (InetAddress) objArr[2], (HttpContext) objArr[3], (HttpParams) objArr[4]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ZClientConnectionOperator(SchemeRegistry schemeRegistry) {
        super(schemeRegistry);
        this.b = true;
    }

    public void openConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) throws IOException {
        LayeredSocketFactory layeredSocketFactory;
        SocketFactory socketFactory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8324963a", new Object[]{this, operatedClientConnection, httpHost, inetAddress, httpContext, httpParams});
            return;
        }
        LogUtil.record(4, "", "ZClientConnectionOperator::openConnection", "startPay");
        if (PluginManager.getDnsEngine().isClientConnDegrade()) {
            super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
            return;
        }
        try {
            LogUtil.record(4, "", "ZClientConnectionOperator::openConnection", "try custom open conn");
            if (operatedClientConnection == null) {
                throw new IllegalArgumentException("Connection must not be null.");
            }
            if (httpHost == null) {
                throw new IllegalArgumentException("Target host must not be null.");
            }
            if (httpParams == null) {
                throw new IllegalArgumentException("Parameters must not be null.");
            }
            if (operatedClientConnection.isOpen()) {
                throw new IllegalArgumentException("Connection must not be open.");
            }
            Scheme scheme = this.schemeRegistry.getScheme(httpHost.getSchemeName());
            SocketFactory socketFactory2 = scheme.getSocketFactory();
            if (socketFactory2 instanceof LayeredSocketFactory) {
                socketFactory = f4931a;
                layeredSocketFactory = (LayeredSocketFactory) socketFactory2;
            } else {
                layeredSocketFactory = null;
                socketFactory = socketFactory2;
            }
            String hostName = httpHost.getHostName();
            InetAddress[] a2 = DnsUtil.isLogicIP(hostName) ? new InetAddress[]{InetAddress.getByAddress(DnsUtil.ipToBytesByReg(hostName))} : a(hostName);
            if (a2 == null) {
                LogUtil.record(4, "", "ZClientConnectionOperator::openCustomConnection", "query addresses failed, call default impl.");
                super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                return;
            }
            LogUtil.record(4, "", "ZClientConnectionOperator::openCustomConnection", "addresses len:" + a2.length);
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            a(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams, scheme, socketFactory2, socketFactory, layeredSocketFactory, a2);
            LogUtil.record(4, "", "ZClientConnectionOperator::openCustomConnection", "CustomConnectTime: " + (SystemClock.elapsedRealtime() - valueOf.longValue()) + "ms");
        } catch (IOException e) {
            a(e);
            super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
        }
    }

    private static void a(IOException iOException) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf264cc", new Object[]{iOException});
        } else if (iOException != null && !TextUtils.isEmpty(iOException.getMessage()) && iOException.getMessage().contains("shutdown")) {
            throw iOException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0 A[LOOP:0: B:7:0x005f->B:61:0x01a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.net.Socket] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.apache.http.conn.OperatedClientConnection r26, org.apache.http.HttpHost r27, java.net.InetAddress r28, org.apache.http.protocol.HttpContext r29, org.apache.http.params.HttpParams r30, org.apache.http.conn.scheme.Scheme r31, org.apache.http.conn.scheme.SocketFactory r32, org.apache.http.conn.scheme.SocketFactory r33, org.apache.http.conn.scheme.LayeredSocketFactory r34, java.net.InetAddress[] r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.http.http.ZClientConnectionOperator.a(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams, org.apache.http.conn.scheme.Scheme, org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory, java.net.InetAddress[]):void");
    }

    private InetAddress[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("b992fb45", new Object[]{this, str});
        }
        this.b = true;
        InetAddress[] inetAddresses = PluginManager.getDnsEngine().getInetAddresses(str);
        if (inetAddresses != null && inetAddresses.length != 0) {
            return inetAddresses;
        }
        this.b = false;
        LogUtil.record(4, "", "ZClientConnectionOperator::getInetAddresses", "get empty InetAddress from DnsManager, try InetAddress.getAllByName");
        try {
            return InetAddress.getAllByName(str);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return inetAddresses;
        }
    }
}
