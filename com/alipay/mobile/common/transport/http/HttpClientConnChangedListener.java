package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionManager;

/* loaded from: classes3.dex */
public class HttpClientConnChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HttpClientConnChangedListener b;

    /* renamed from: a  reason: collision with root package name */
    private List<ClientConnectionManager> f5553a;

    public static final HttpClientConnChangedListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpClientConnChangedListener) ipChange.ipc$dispatch("c34004ed", new Object[0]);
        }
        HttpClientConnChangedListener httpClientConnChangedListener = b;
        if (httpClientConnChangedListener != null) {
            return httpClientConnChangedListener;
        }
        synchronized (HttpClientConnChangedListener.class) {
            if (b != null) {
                return b;
            }
            b = new HttpClientConnChangedListener();
            return b;
        }
    }

    private List<ClientConnectionManager> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<ClientConnectionManager> list = this.f5553a;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            if (this.f5553a != null) {
                return this.f5553a;
            }
            this.f5553a = new ArrayList(5);
            return this.f5553a;
        }
    }

    public void addClientConnectionManager(ClientConnectionManager clientConnectionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbda8467", new Object[]{this, clientConnectionManager});
            return;
        }
        try {
            a().add(clientConnectionManager);
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientConnChangedListener", "[addClientConnectionManager] Exception: " + th.toString());
        }
    }

    public void removeClientConnectionManager(ClientConnectionManager clientConnectionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b74cbe4", new Object[]{this, clientConnectionManager});
            return;
        }
        try {
            a().remove(clientConnectionManager);
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientConnChangedListener", "[removeClientConnectionManager] Exception: " + th.toString());
        }
    }

    public void notifyNetworkChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825a4292", new Object[]{this});
            return;
        }
        List<ClientConnectionManager> a2 = a();
        if (a2 == null) {
            LogCatUtil.info("HttpClientConnChangedListener", "[notifyNetworkChangedEvent] clientConnectionManagers maybe null.");
            return;
        }
        try {
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                a2.get(i).closeIdleConnections(0L, TimeUnit.MILLISECONDS);
            }
            LogCatUtil.info("HttpClientConnChangedListener", "[notifyNetworkChangedEvent] Idle connection is closed.");
        } catch (Throwable th) {
            LogCatUtil.warn("HttpClientConnChangedListener", "[notifyNetworkChangedEvent] Exception: " + th.toString());
        }
    }
}
