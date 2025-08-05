package com.alipay.mobile.common.transport;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class GlobalTransportCallbackRegistrar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static GlobalTransportCallbackRegistrar f5516a;
    private List<TransportCallback> b;

    public static final GlobalTransportCallbackRegistrar getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalTransportCallbackRegistrar) ipChange.ipc$dispatch("154dc3ad", new Object[0]);
        }
        GlobalTransportCallbackRegistrar globalTransportCallbackRegistrar = f5516a;
        if (globalTransportCallbackRegistrar != null) {
            return globalTransportCallbackRegistrar;
        }
        synchronized (GlobalTransportCallbackRegistrar.class) {
            if (f5516a != null) {
                return f5516a;
            }
            f5516a = new GlobalTransportCallbackRegistrar();
            return f5516a;
        }
    }

    private GlobalTransportCallbackRegistrar() {
    }

    public void addTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c4e369", new Object[]{this, transportCallback});
        } else if (transportCallback == null) {
            LogCatUtil.warn("GlobalTransportCallbackRegistrar", "[addTransportCallback] transportCallback is null.");
        } else {
            try {
                getCallbackList().add(transportCallback);
                LogCatUtil.info("GlobalTransportCallbackRegistrar", "[addTransportCallback] transportCallback class name = " + transportCallback.getClass().getName());
            } catch (Throwable th) {
                LogCatUtil.error("GlobalTransportCallbackRegistrar", "[addTransportCallback] Exception = " + th.toString(), th);
            }
        }
    }

    public void removeTransportCallback(TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9eb3fa6", new Object[]{this, transportCallback});
        } else if (transportCallback == null) {
            LogCatUtil.warn("GlobalTransportCallbackRegistrar", "[removeTransportCallback] transportCallback is null.");
        } else {
            try {
                getCallbackList().remove(transportCallback);
                LogCatUtil.info("GlobalTransportCallbackRegistrar", "[removeTransportCallback] transportCallback class name = " + transportCallback.getClass().getName());
            } catch (Throwable th) {
                LogCatUtil.error("GlobalTransportCallbackRegistrar", "[removeTransportCallback] Exception = " + th.toString(), th);
            }
        }
    }

    public List<TransportCallback> getCallbackList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3b76a547", new Object[]{this});
        }
        List<TransportCallback> list = this.b;
        if (list != null) {
            return list;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            this.b = Collections.synchronizedList(new ArrayList(1));
            return this.b;
        }
    }

    public List<TransportCallback> refCallbackList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6930946a", new Object[]{this}) : this.b;
    }
}
