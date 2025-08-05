package com.alipay.mobile.common.transport.interceptors;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class TransportInterceptorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static TransportInterceptorManager f5596a;
    private List<TransportInterceptor> b;

    public static final TransportInterceptorManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportInterceptorManager) ipChange.ipc$dispatch("dc40247f", new Object[0]);
        }
        TransportInterceptorManager transportInterceptorManager = f5596a;
        if (transportInterceptorManager != null) {
            return transportInterceptorManager;
        }
        synchronized (TransportInterceptorManager.class) {
            if (f5596a != null) {
                return f5596a;
            }
            f5596a = new TransportInterceptorManager();
            return f5596a;
        }
    }

    public synchronized void addInterceptor(TransportInterceptor transportInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca87fb1", new Object[]{this, transportInterceptor});
        } else if (transportInterceptor == null) {
            LogCatUtil.warn("TransportInterceptorManager", "addInterceptor.   Illegal argument, transportInterceptor maybe null");
        } else if (a().contains(transportInterceptor)) {
            LogCatUtil.warn("TransportInterceptorManager", "addInterceptor.   Illegal argument, transportInterceptor already exists.");
        } else {
            a().add(transportInterceptor);
        }
    }

    public synchronized void removeInterceptor(TransportInterceptor transportInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720a73ae", new Object[]{this, transportInterceptor});
        } else if (this.b == null || this.b.isEmpty()) {
        } else {
            if (transportInterceptor == null) {
                return;
            }
            a().remove(transportInterceptor);
        }
    }

    public synchronized void onPreTransportInterceptor(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6160e734", new Object[]{this, str, map});
            return;
        }
        if (this.b != null && !this.b.isEmpty()) {
            for (TransportInterceptor transportInterceptor : this.b) {
                long currentTimeMillis = System.currentTimeMillis();
                transportInterceptor.preRequestInterceptor(str, map);
                LogCatUtil.warn("TransportInterceptorManager", "preRequestInterceptor finish. obj = [" + transportInterceptor.getClass().getName() + "], cost time: " + (System.currentTimeMillis() + currentTimeMillis));
            }
        }
    }

    private List<TransportInterceptor> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        List<TransportInterceptor> list = this.b;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            ArrayList arrayList = new ArrayList(1);
            this.b = arrayList;
            return arrayList;
        }
    }
}
