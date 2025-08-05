package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;
import tb.riy;

/* loaded from: classes3.dex */
public class ZThreadSafeClientConnManager extends ThreadSafeClientConnManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ZThreadSafeClientConnManager zThreadSafeClientConnManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1554832987) {
            super.finalize();
            return null;
        } else if (hashCode != 457600989) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.shutdown();
            return null;
        }
    }

    public static /* synthetic */ void access$000(ZThreadSafeClientConnManager zThreadSafeClientConnManager, BasicPoolEntry basicPoolEntry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0606f", new Object[]{zThreadSafeClientConnManager, basicPoolEntry});
        } else {
            zThreadSafeClientConnManager.a(basicPoolEntry);
        }
    }

    public ZThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
        HttpClientConnChangedListener.getInstance().addClientConnectionManager(this);
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClientConnectionOperator) ipChange.ipc$dispatch("cea04ecc", new Object[]{this, schemeRegistry}) : new ZClientConnectionOperator(schemeRegistry);
    }

    public ClientConnectionRequest requestConnection(final HttpRoute httpRoute, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientConnectionRequest) ipChange.ipc$dispatch("aa6d5798", new Object[]{this, httpRoute, obj});
        }
        final PoolEntryRequest requestPoolEntry = this.connectionPool.requestPoolEntry(httpRoute, obj);
        return new ClientConnectionRequest() { // from class: com.alipay.mobile.common.transport.http.ZThreadSafeClientConnManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void abortRequest() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("282a3e46", new Object[]{this});
                } else {
                    requestPoolEntry.abortRequest();
                }
            }

            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ManagedClientConnection) ipChange2.ipc$dispatch("6f0cbda0", new Object[]{this, new Long(j), timeUnit});
                }
                if (httpRoute == null) {
                    throw new IllegalArgumentException("Route may not be null.");
                }
                LogCatUtil.info("ZThreadSafeClientConnManager", "ThreadSafeClientConnManager.getConnection: " + httpRoute + ", timeout = " + j);
                BasicPoolEntry poolEntry = requestPoolEntry.getPoolEntry(j, timeUnit);
                ZThreadSafeClientConnManager.access$000(ZThreadSafeClientConnManager.this, poolEntry);
                return new ZBasicPooledConnAdapter(ZThreadSafeClientConnManager.this, poolEntry);
            }
        };
    }

    private void a(BasicPoolEntry basicPoolEntry) {
        try {
            Method declaredMethod = basicPoolEntry.getClass().getDeclaredMethod("getConnection", new Class[0]);
            declaredMethod.setAccessible(true);
            Socket socket = ((OperatedClientConnection) declaredMethod.invoke(basicPoolEntry, new Object[0])).getSocket();
            if (socket == null) {
                LogCatUtil.warn("ZThreadSafeClientConnManager", "[recordSocketInfo] socket is null.");
                return;
            }
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            if (remoteSocketAddress == null) {
                LogCatUtil.warn("ZThreadSafeClientConnManager", "[recordSocketInfo] remoteSocketAddress is null.");
            } else if (!(remoteSocketAddress instanceof InetSocketAddress)) {
                LogCatUtil.warn("ZThreadSafeClientConnManager", "[recordSocketInfo] remoteSocketAddress it's not InetSocketAddress, remoteSocketAddress = " + remoteSocketAddress.getClass().getName());
            } else {
                InetAddress address = ((InetSocketAddress) remoteSocketAddress).getAddress();
                if (address == null) {
                    LogCatUtil.warn("ZThreadSafeClientConnManager", "[recordSocketInfo] inetAddress is null.");
                    return;
                }
                String str = address.getHostAddress() + ":" + socket.getPort();
                TransportContextThreadLocalUtils.setTargetHost(str);
                LogCatUtil.info("ZThreadSafeClientConnManager", "requestConnection target host=[" + str + riy.ARRAY_END_STR);
            }
        } catch (Throwable th) {
            LogCatUtil.error("ZThreadSafeClientConnManager", "Problem tagging socket.", th);
        }
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        super.shutdown();
        HttpClientConnChangedListener.getInstance().removeClientConnectionManager(this);
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        HttpClientConnChangedListener.getInstance().removeClientConnectionManager(this);
    }
}
