package com.alipay.mobile.common.transport.http;

import android.text.TextUtils;
import android.util.Pair;
import com.alipay.mobile.common.transport.config.UserNetworkPreferencesManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.SocketUtil;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.conn.DefaultClientConnection;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import tb.riy;

/* loaded from: classes3.dex */
public class ZClientConnectionOperator extends DefaultClientConnectionOperator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_DNS_RETRY_COUNT = 20;
    private byte b;
    private byte c;
    private List<String> d;

    /* renamed from: a  reason: collision with root package name */
    private static final PlainSocketFactory f5560a = new PlainSocketFactory();
    public static byte DEFAULT_MIN_CONNECT_COUNT = 4;

    public static /* synthetic */ Object ipc$super(ZClientConnectionOperator zClientConnectionOperator, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2094754246) {
            super.openConnection((OperatedClientConnection) objArr[0], (HttpHost) objArr[1], (InetAddress) objArr[2], (HttpContext) objArr[3], (HttpParams) objArr[4]);
            return null;
        } else if (hashCode != -372744897) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.prepareSocket((Socket) objArr[0], (HttpContext) objArr[1], (HttpParams) objArr[2]);
            return null;
        }
    }

    public ZClientConnectionOperator(SchemeRegistry schemeRegistry) {
        super(schemeRegistry);
        this.b = (byte) 0;
        this.c = (byte) 1;
    }

    public void openConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8324963a", new Object[]{this, operatedClientConnection, httpHost, inetAddress, httpContext, httpParams});
            return;
        }
        a(httpContext);
        while (true) {
            try {
                a(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                return;
            } catch (IOException e) {
                assertShutdown(operatedClientConnection, e);
                if ((e instanceof HttpException) && !((HttpException) e).isCanRetry()) {
                    throw e;
                }
                if (!c(httpContext)) {
                    throw e;
                }
                if (i >= 120) {
                    LogCatUtil.warn("ClientConnectionOperator", "[openConnection] Limit connection, i = " + i);
                    throw e;
                }
                try {
                    LogCatUtil.warn("ClientConnectionOperator", "[openConnection] Retry the build task after 1s .");
                    Thread.sleep(1000L);
                    i++;
                } catch (Throwable th) {
                    LogCatUtil.warn("ClientConnectionOperator", "[openConnection] Maybe thread interrupted. Exception = " + th.toString());
                    throw e;
                }
            }
        }
    }

    private void a(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdf1853", new Object[]{this, operatedClientConnection, httpHost, inetAddress, httpContext, httpParams});
        } else if (this.c == 2) {
            try {
                super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                this.c = (byte) 2;
                try {
                    b(httpContext).getCurrentDataContainer().putDataItem(RPCDataItems.ORIGHC, "T");
                } catch (Exception e) {
                    LogCatUtil.warn("ClientConnectionOperator", "putDataItem1 exception : " + e.toString());
                }
            } catch (IOException e2) {
                assertShutdown(operatedClientConnection, e2);
                if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                    LogCatUtil.warn("ClientConnectionOperator", "ZClientConnectionOperator. isNetworkAvailable == false ");
                    throw e2;
                }
                byte b = (byte) (this.b + 1);
                this.b = b;
                if (b < 5) {
                    LogCatUtil.warn("ClientConnectionOperator", "ZClientConnectionOperator. orig err count : " + ((int) this.b));
                    throw e2;
                }
                this.b = (byte) 0;
                LogCatUtil.info("ClientConnectionOperator", "ZClientConnectionOperator. use cust retry!");
                openConnectionCustome(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                this.c = (byte) 1;
            }
        } else {
            try {
                openConnectionCustome(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                this.c = (byte) 1;
            } catch (IOException e3) {
                assertShutdown(operatedClientConnection, e3);
                if ((e3 instanceof HttpException) && !((HttpException) e3).isCanRetry()) {
                    throw e3;
                }
                if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                    LogCatUtil.warn("ClientConnectionOperator", "ZClientConnectionOperator. isNetworkAvailable == false ");
                    throw e3;
                }
                byte b2 = (byte) (this.b + 1);
                this.b = b2;
                if (b2 < 5) {
                    LogCatUtil.warn("ClientConnectionOperator", "ZClientConnectionOperator. cust err count : " + ((int) this.b));
                    throw e3;
                }
                this.b = (byte) 0;
                LogCatUtil.info("ClientConnectionOperator", "ZClientConnectionOperator. use origin retry!");
                super.openConnection(operatedClientConnection, httpHost, inetAddress, httpContext, httpParams);
                this.c = (byte) 2;
                try {
                    b(httpContext).getCurrentDataContainer().putDataItem(RPCDataItems.ORIGHC, "T");
                } catch (Exception e4) {
                    LogCatUtil.warn("ClientConnectionOperator", "putDataItem exception : " + e4.toString());
                }
            }
        }
    }

    private void a(HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ab69d6", new Object[]{this, httpContext});
            return;
        }
        try {
            TransportContext b = b(httpContext);
            if (!b.mRadicalStrategy) {
                return;
            }
            b.getCurrentDataContainer().putDataItem(RPCDataItems.RADICAL_STRATEGY, "T");
        } catch (Throwable th) {
            LogCatUtil.warn("ClientConnectionOperator", "[recordLogsForPre] Exception: " + th.toString());
        }
    }

    public void assertShutdown(OperatedClientConnection operatedClientConnection, IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e051c71", new Object[]{this, operatedClientConnection, iOException});
        } else if (a(operatedClientConnection)) {
            throw iOException;
        } else {
            if (iOException == null || TextUtils.isEmpty(iOException.getMessage()) || !iOException.getMessage().contains("shutdown")) {
                return;
            }
            LogCatUtil.info("ClientConnectionOperator", "Connection shutdown, don't retry!");
            throw iOException;
        }
    }

    public void openConnectionCustome(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) {
        SocketFactory socketFactory;
        LayeredSocketFactory layeredSocketFactory;
        HttpHost httpHost2;
        InetAddress[] inetAddressArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b06009e", new Object[]{this, operatedClientConnection, httpHost, inetAddress, httpContext, httpParams});
        } else if (operatedClientConnection == null) {
            throw new IllegalArgumentException("Connection must not be null.");
        } else {
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
                socketFactory = f5560a;
                layeredSocketFactory = (LayeredSocketFactory) socketFactory2;
            } else {
                socketFactory = socketFactory2;
                layeredSocketFactory = null;
            }
            Pair<String, Integer> bindHostPairByDomain = UserNetworkPreferencesManager.getInstance().getBindHostPairByDomain(httpHost.getHostName());
            if (bindHostPairByDomain != null) {
                inetAddressArr = new InetAddress[]{InetAddress.getByAddress(DnsUtil.ipToBytesByReg((String) bindHostPairByDomain.first))};
                httpHost2 = new HttpHost(httpHost.getHostName(), ((Integer) bindHostPairByDomain.second).intValue(), httpHost.getSchemeName());
            } else {
                httpHost2 = httpHost;
                inetAddressArr = null;
            }
            if (inetAddressArr == null) {
                inetAddressArr = DnsUtil.isLogicIP(httpHost2.getHostName()) ? new InetAddress[]{InetAddress.getByAddress(DnsUtil.ipToBytesByReg(httpHost2.getHostName()))} : a(httpHost2, httpContext, operatedClientConnection);
            }
            InetAddress[] inetAddressArr2 = inetAddressArr;
            int i = 0;
            while (true) {
                int i2 = i;
                HttpHost httpHost3 = httpHost2;
                SocketFactory socketFactory3 = socketFactory2;
                try {
                    connect(operatedClientConnection, httpHost2, inetAddress, httpContext, httpParams, scheme, socketFactory2, socketFactory, layeredSocketFactory, inetAddressArr2);
                    return;
                } catch (IOException e) {
                    LogCatUtil.debug("ClientConnectionOperator", "openConnectionCustome ex=[" + e.toString() + riy.ARRAY_END_STR);
                    assertShutdown(operatedClientConnection, e);
                    if (i2 >= 4) {
                        LogCatUtil.debug("ClientConnectionOperator", "connRetryCount>=4, Don't retry");
                        throw e;
                    } else if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                        LogCatUtil.debug("ClientConnectionOperator", "Network not available, Don't retry");
                        throw e;
                    } else if (DnsUtil.isLogicIP(httpHost3.getHostName())) {
                        LogCatUtil.debug("ClientConnectionOperator", "Logic ip, Don't retry");
                        throw e;
                    } else if (TransportContextThreadLocalUtils.isFromLocalDns()) {
                        LogCatUtil.debug("ClientConnectionOperator", "Local dns, Don't retry");
                        throw e;
                    } else {
                        if (TransportContextThreadLocalUtils.isFromHttpDns()) {
                            LogCatUtil.debug("ClientConnectionOperator", "openConnectionCustome ex,remove ips in httpdns,try iprank");
                            AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
                            if (dnsClient != null) {
                                dnsClient.setErrorByHost(httpHost3.getHostName());
                            }
                            try {
                                inetAddressArr2 = DnsUtil.getAllByName(httpHost3.getHostName());
                            } catch (Throwable th) {
                                LogCatUtil.warn("ClientConnectionOperator", "AlipayDNSHelper#getAllByName error: " + th.toString());
                                inetAddressArr2 = null;
                            }
                            if (inetAddressArr2 == null || inetAddressArr2.length == 0) {
                                throw e;
                            }
                        } else if (TransportContextThreadLocalUtils.isFromIpRank()) {
                            LogCatUtil.debug("ClientConnectionOperator", "openConnectionCustome ex,remove ips in iprank,try localdns");
                            try {
                                inetAddressArr2 = DnsUtil.getAllByName(httpHost3.getHostName());
                            } catch (Throwable th2) {
                                LogCatUtil.warn("ClientConnectionOperator", "AlipayDNSHelper#getAllByNameByLocalDNS error: " + th2.toString());
                                inetAddressArr2 = null;
                            }
                            if (inetAddressArr2 == null || inetAddressArr2.length == 0) {
                                throw e;
                            }
                        } else if (TransportContextThreadLocalUtils.isFromLocalCacheDns() && !a().contains(RPCDataItems.VALUE_DT_LOCAL_CACHE_DNS)) {
                            LogCatUtil.debug("ClientConnectionOperator", "openConnectionCustome exception,remove ips in local cache,try localdns");
                            HttpDns.getInstance().getGetAllByNameHelper().removeCache(httpHost3.getHostName());
                            try {
                                inetAddressArr2 = HttpDns.getInstance().getGetAllByNameHelper().getAllByName(httpHost3.getHostName());
                            } catch (Throwable th3) {
                                LogCatUtil.warn("ClientConnectionOperator", "getGetAllByNameHelper#getAllByName error: " + th3.toString());
                                inetAddressArr2 = null;
                            }
                            if (inetAddressArr2 == null || inetAddressArr2.length <= 0) {
                                throw e;
                            }
                            a().add(RPCDataItems.VALUE_DT_LOCAL_CACHE_DNS);
                        } else {
                            throw e;
                        }
                        i = i2 + 1;
                        httpHost2 = httpHost3;
                        socketFactory2 = socketFactory3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x04ee, code lost:
        if (r0 != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0556, code lost:
        if (r0 != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0558, code lost:
        r1.assertShutdown(r39, r7);
        r6 = r6;
        r10 = r10;
        r11 = r11;
        r17 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0365 A[Catch: all -> 0x0371, Throwable -> 0x0376, SocketTimeoutException -> 0x0379, ConnectTimeoutException -> 0x038c, SocketException -> 0x039e, TryCatch #48 {Throwable -> 0x0376, blocks: (B:98:0x0276, B:100:0x027b, B:133:0x035d, B:135:0x0365, B:136:0x0370), top: B:266:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0430 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0561 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.net.SocketTimeoutException] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v66 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.net.InetAddress] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r17v27 */
    /* JADX WARN: Type inference failed for: r17v47 */
    /* JADX WARN: Type inference failed for: r17v48 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r45v0, types: [org.apache.http.conn.scheme.SocketFactory] */
    /* JADX WARN: Type inference failed for: r47v0, types: [org.apache.http.conn.scheme.LayeredSocketFactory] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.InetAddress] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void connect(org.apache.http.conn.OperatedClientConnection r39, org.apache.http.HttpHost r40, java.net.InetAddress r41, org.apache.http.protocol.HttpContext r42, org.apache.http.params.HttpParams r43, org.apache.http.conn.scheme.Scheme r44, org.apache.http.conn.scheme.SocketFactory r45, org.apache.http.conn.scheme.SocketFactory r46, org.apache.http.conn.scheme.LayeredSocketFactory r47, java.net.InetAddress[] r48) {
        /*
            Method dump skipped, instructions count: 1587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.http.ZClientConnectionOperator.connect(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams, org.apache.http.conn.scheme.Scheme, org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.scheme.SocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory, java.net.InetAddress[]):void");
    }

    private void a(HttpHost httpHost, InetAddress inetAddress, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa981b13", new Object[]{this, httpHost, inetAddress, new Boolean(z), new Integer(i)});
            return;
        }
        if (!DnsUtil.isLogicIP(httpHost.getHostName())) {
            b(httpHost, inetAddress, z, i);
        }
        AlipayQosService.getInstance().estimate(z ? i : 5000.0d, (byte) 2);
    }

    private void b(HttpHost httpHost, InetAddress inetAddress, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ec7054", new Object[]{this, httpHost, inetAddress, new Boolean(z), new Integer(i)});
            return;
        }
        try {
            AlipayHttpDnsClient.getDnsClient().feedback(httpHost.getHostName(), inetAddress.getHostAddress(), z, i);
            if (z) {
                return;
            }
            HttpDns.getInstance().getGetAllByNameHelper().removeCache(httpHost.getHostName());
        } catch (Throwable th) {
            LogCatUtil.error("ClientConnectionOperator", th);
        }
    }

    private TransportContext b(HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransportContext) ipChange.ipc$dispatch("68ab238e", new Object[]{this, httpContext}) : (TransportContext) httpContext.getAttribute(TransportConstants.KEY_NET_CONTEXT);
    }

    private InetAddress[] a(HttpHost httpHost, HttpContext httpContext, OperatedClientConnection operatedClientConnection) {
        UnknownHostException unknownHostException;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("b9a63095", new Object[]{this, httpHost, httpContext, operatedClientConnection});
        }
        TransportContext b = b(httpContext);
        if (b == null || !b.isFastReturnFailure() || b.taskRetryedCount != 0) {
            z = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (true) {
            try {
                return a(httpHost, httpContext);
            } catch (Throwable th) {
                if (!a(currentTimeMillis, i, th, operatedClientConnection)) {
                    if (th instanceof UnknownHostException) {
                        unknownHostException = (UnknownHostException) th;
                    } else {
                        unknownHostException = new UnknownHostException("Unknown host: " + httpHost.getHostName());
                        unknownHostException.initCause(th);
                    }
                    if (!z) {
                        throw unknownHostException;
                    }
                    LogCatUtil.warn("ClientConnectionOperator", "[getInetAddresses] Hin fast return failure.");
                    HttpException httpException = new HttpException(9, unknownHostException.toString(), unknownHostException);
                    httpException.setCanRetry(false);
                    throw httpException;
                }
                i++;
            }
        }
    }

    private boolean a(long j, int i, Throwable th, OperatedClientConnection operatedClientConnection, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8daaaf", new Object[]{this, new Long(j), new Integer(i), th, operatedClientConnection, new Integer(i2)})).booleanValue();
        }
        if (a(operatedClientConnection)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < 0 || currentTimeMillis > 12000) {
            LogCatUtil.warn("ClientConnectionOperator", "[isCanRetryDns] Can not redns， dnsCost = " + currentTimeMillis + ",  Exception: " + th.toString());
            return false;
        } else if (i >= i2) {
            LogCatUtil.warn("ClientConnectionOperator", "[isCanRetryDns] Can not redns. retryCount = " + i + ", Exception: " + th.toString());
            return false;
        } else {
            LogCatUtil.debug("ClientConnectionOperator", "[isCanRetryDns] Will sleep 1s.");
            try {
                Thread.sleep(1000L);
                LogCatUtil.warn("ClientConnectionOperator", "[isCanRetryDns] Can redns. Exception: " + th.toString());
                return true;
            } catch (Throwable th2) {
                LogCatUtil.warn("ClientConnectionOperator", "[isCanRetryDns] sleep exception = " + th2.toString());
                return false;
            }
        }
    }

    private boolean a(long j, int i, Throwable th, OperatedClientConnection operatedClientConnection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8499335c", new Object[]{this, new Long(j), new Integer(i), th, operatedClientConnection})).booleanValue() : a(j, i, th, operatedClientConnection, 20);
    }

    private boolean a(OperatedClientConnection operatedClientConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1814ee2", new Object[]{this, operatedClientConnection})).booleanValue();
        }
        if (!(operatedClientConnection instanceof ZDefaultClientConnection)) {
            LogCatUtil.warn("ClientConnectionOperator", "[isShutdownZ] Not instanceof ZDefaultClientConnection. conn = " + operatedClientConnection.getClass().getName());
            return false;
        } else if (!((ZDefaultClientConnection) operatedClientConnection).isShutdownZ()) {
            return false;
        } else {
            LogCatUtil.info("ClientConnectionOperator", "[isShutdownZ] Connection shutdown by isShutdownZ, don't retry!");
            return true;
        }
    }

    private InetAddress[] a(HttpHost httpHost, HttpContext httpContext) {
        InetAddress[] allByName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("f2dbcfd7", new Object[]{this, httpHost, httpContext});
        }
        TransportContext b = b(httpContext);
        if (b != null) {
            b.getCurrentDataContainer().timeItemDot("DNS_TIME");
        }
        try {
            try {
                AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
                if (dnsClient != null) {
                    allByName = dnsClient.getAllByName(httpHost.getHostName(), b);
                    if (allByName != null && allByName.length != 0) {
                        LogCatUtil.info("ClientConnectionOperator", "ZClientConnectionOperator addresses len = " + allByName.length + ",ips = [" + Arrays.toString(allByName) + riy.ARRAY_END_STR);
                    }
                    allByName = DnsUtil.getAllByName(httpHost.getHostName());
                } else {
                    LogCatUtil.info("ClientConnectionOperator", "ZClientConnectionOperator dnsClient is null");
                    allByName = DnsUtil.getAllByName(httpHost.getHostName());
                }
            } catch (UnknownHostException e) {
                LogCatUtil.error("ClientConnectionOperator", "ZClientConnectionOperator ex:" + e.toString());
                throw e;
            } catch (Exception e2) {
                LogCatUtil.error("ClientConnectionOperator", "ZClientConnectionOperator Exception", e2);
                allByName = DnsUtil.getAllByName(httpHost.getHostName());
                if (b != null) {
                }
                return allByName;
            }
        } finally {
            if (b != null) {
                b.getCurrentDataContainer().timeItemRelease("DNS_TIME");
            }
        }
    }

    private List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new ArrayList(2);
        }
        return this.d;
    }

    public void prepareSocket(Socket socket, HttpContext httpContext, HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c85d3f", new Object[]{this, socket, httpContext, httpParams});
            return;
        }
        super.prepareSocket(socket, httpContext, httpParams);
        int soTimeout = HttpConnectionParams.getSoTimeout(httpParams);
        if (soTimeout <= 0) {
            return;
        }
        boolean sndTimeOut = SocketUtil.setSndTimeOut(socket, soTimeout);
        LogCatUtil.info("ClientConnectionOperator", "setSndTimeOut result: " + sndTimeOut);
    }

    public OperatedClientConnection createConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OperatedClientConnection) ipChange.ipc$dispatch("9b1065f7", new Object[]{this});
        }
        try {
            return new ZDefaultClientConnection();
        } catch (Throwable th) {
            LogCatUtil.warn("ClientConnectionOperator", "[createConnection] Exception", th);
            return new DefaultClientConnection();
        }
    }

    private boolean c(HttpContext httpContext) {
        TransportContext b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("142e475c", new Object[]{this, httpContext})).booleanValue();
        }
        if (httpContext == null || (b = b(httpContext)) == null || b.allowedRetryDuration <= 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - b.startExecutionTime;
        LogCatUtil.info("ClientConnectionOperator", "[isAllowedRetryDuration] timeLeft = " + currentTimeMillis + ", startExecutionTime = " + b.startExecutionTime + ", allowedRetryDuration = " + b.allowedRetryDuration);
        if (currentTimeMillis < 1) {
            LogCatUtil.warn("ClientConnectionOperator", "[isAllowedRetryDuration] Illegal time left.");
            return false;
        } else if (currentTimeMillis <= b.allowedRetryDuration) {
            return true;
        } else {
            LogCatUtil.warn("ClientConnectionOperator", "[isAllowedRetryDuration] No time left.");
            return false;
        }
    }
}
