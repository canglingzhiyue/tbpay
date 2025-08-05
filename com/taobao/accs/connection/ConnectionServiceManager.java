package com.taobao.accs.connection;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IGlobalClientInfoService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.o;
import com.taobao.aranger.intf.ProcessStateListener;
import com.taobao.mass.MassClient;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dco;
import tb.jzv;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class ConnectionServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ConnectionServiceManager";
    public static final String TYPE_ALL_WEATHER = "2";
    public static final String TYPE_DUAL = "3";
    public static final String TYPE_FOREGROUND = "4";
    private final Map<String, b> connServiceMap;
    private AtomicBoolean isInit;
    private final ProcessStateListener processStateListener;
    private String serviceType;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final ConnectionServiceManager f8213a;

        static {
            kge.a(-560305552);
            f8213a = new ConnectionServiceManager();
        }

        public static /* synthetic */ ConnectionServiceManager a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ConnectionServiceManager) ipChange.ipc$dispatch("ae3719c", new Object[0]) : f8213a;
        }
    }

    static {
        kge.a(141269917);
    }

    public static /* synthetic */ Map access$200(ConnectionServiceManager connectionServiceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d3c69b20", new Object[]{connectionServiceManager}) : connectionServiceManager.connServiceMap;
    }

    private ConnectionServiceManager() {
        this.connServiceMap = new ConcurrentHashMap();
        this.isInit = new AtomicBoolean();
        this.processStateListener = new ProcessStateListener() { // from class: com.taobao.accs.connection.ConnectionServiceManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.aranger.intf.ProcessStateListener
            public void onProcessStart(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("107b37c3", new Object[]{this, str});
                }
            }

            @Override // com.taobao.aranger.intf.ProcessStateListener
            public void onProcessStop(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("72a7dcc3", new Object[]{this, str});
                    return;
                }
                ALog.e(ConnectionServiceManager.TAG, "onProcessStop: " + str, new Object[0]);
                com.taobao.accs.connection.state.a.a().b(StateMachine.Event.obtain(103));
                boolean z = false;
                for (b bVar : ConnectionServiceManager.access$200(ConnectionServiceManager.this).values()) {
                    if (!bVar.d()) {
                        ALog.e(ConnectionServiceManager.TAG, "not aranger proxy", new Object[0]);
                        return;
                    }
                    if (!z) {
                        try {
                            IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) jzv.b(new ComponentName(jzv.a(), AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, jzv.a()));
                            if (GlobalClientInfo.mAgooAppReceiver != null) {
                                iGlobalClientInfoService.setRemoteAgooAppReceiver(GlobalClientInfo.mAgooAppReceiver);
                            }
                            if (GlobalClientInfo.getInstance(jzv.a()).getAppReceiver() != null) {
                                for (Map.Entry<String, IAppReceiver> entry : GlobalClientInfo.getInstance(jzv.a()).getAppReceiver().entrySet()) {
                                    iGlobalClientInfoService.setRemoteAppReceiver(entry.getKey(), entry.getValue());
                                }
                            }
                        } catch (Throwable th) {
                            ALog.e(ConnectionServiceManager.TAG, "on processStateListener global error", th, new Object[0]);
                        }
                        z = true;
                    }
                    bVar.e();
                }
            }
        };
        setServiceType();
    }

    public static ConnectionServiceManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnectionServiceManager) ipChange.ipc$dispatch("e77b3d46", new Object[0]) : a.a();
    }

    public void coldLaunch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c32dd4be", new Object[]{this});
            return;
        }
        try {
            ALog.e(TAG, "coldLaunch", new Object[0]);
            com.taobao.accs.connection.a.f8214a.a();
        } catch (Exception e) {
            ALog.e(TAG, "coldLaunch err", e, new Object[0]);
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.isInit.getAndSet(true)) {
            ALog.e(TAG, "already init", new Object[0]);
        } else {
            ALog.e(TAG, "init", new Object[0]);
            if (!o.e(GlobalClientInfo.getContext()) || "3".equals(this.serviceType)) {
                return;
            }
            jzv.b(this.processStateListener);
        }
    }

    public IConnection getConnectionWrapper(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnection) ipChange.ipc$dispatch("1eb52e35", new Object[]{this, str});
        }
        IConnection iConnection = null;
        try {
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            b bVar = this.connServiceMap.get(str);
            if (bVar == null) {
                if (isDual()) {
                    bVar = new c();
                } else {
                    bVar = getConnServiceByType(!TextUtils.isEmpty(configByTag.getConnType()) ? configByTag.getConnType() : this.serviceType);
                }
                this.connServiceMap.put(str, bVar);
            }
            iConnection = bVar.a(str, configByTag);
        } catch (Throwable th) {
            ALog.e(TAG, "getConnectionWrapper err", th, new Object[0]);
            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_VERIFY, "getConnectionWrapper err", mto.a.GEO_NOT_SUPPORT);
        }
        if (iConnection == null) {
            ALog.e(TAG, "getConnectionWrapper Null", new Object[0]);
            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_VERIFY, "getConnectionWrapper null", mto.a.GEO_NOT_SUPPORT);
        }
        return iConnection;
    }

    public List<IConnection> getConnections(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3d83d6d7", new Object[]{this, str});
        }
        if (str != null && (bVar = this.connServiceMap.get(str)) != null) {
            return bVar.a();
        }
        return null;
    }

    public boolean isAllWeather(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e53bb2b2", new Object[]{this, str})).booleanValue() : this.connServiceMap.get(str) instanceof com.taobao.accs.connection.a;
    }

    public boolean isDual() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d73c651", new Object[]{this})).booleanValue() : "3".equals(this.serviceType);
    }

    private void setServiceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c30f7d4", new Object[]{this});
        } else if (UtilityImpl.isDualApp(GlobalClientInfo.getContext())) {
            this.serviceType = "3";
        } else {
            String l = l.l(GlobalClientInfo.getContext());
            ALog.e(TAG, "getServiceType by orange " + l, new Object[0]);
            String a2 = dco.a(GlobalClientInfo.getContext(), dco.FILE_CONN_SERVICES_V1, l);
            if (TextUtils.isEmpty(a2)) {
                a2 = l;
            }
            this.serviceType = a2;
            ALog.e(TAG, "getServiceType by orange, final: " + l, new Object[0]);
            com.taobao.accs.utl.d.a("accs", BaseMonitor.COUNT_SERVICE_TYPE, this.serviceType, mto.a.GEO_NOT_SUPPORT);
        }
    }

    private b getConnServiceByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6238eb5", new Object[]{this, str});
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 0;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return new c();
        }
        if (c == 1) {
            return new com.taobao.accs.connection.a();
        }
        if (c == 2) {
            return new e();
        }
        return new com.taobao.accs.connection.a();
    }

    public boolean isCurProcessAllow2Connect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3cde2dd", new Object[]{this, str})).booleanValue();
        }
        try {
        } catch (Exception e) {
            ALog.e(TAG, "isCurProcessAllow2Connect err", e, new Object[0]);
        }
        if (isAllWeather(str) && !((com.taobao.accs.connection.a) this.connServiceMap.get(str)).b()) {
            return false;
        }
        if (isDual()) {
            return UtilityImpl.isMainProcess(GlobalClientInfo.getContext());
        }
        if (this.connServiceMap.get(str) instanceof e) {
            return UtilityImpl.isMainProcess(GlobalClientInfo.getContext());
        }
        return true;
    }

    public boolean isProxyConnection(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3fa0a77", new Object[]{this, str})).booleanValue() : this.connServiceMap.get(str).d();
    }

    public void onChannelConnectionChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4899a3b", new Object[]{this, new Boolean(z)});
            return;
        }
        for (b bVar : this.connServiceMap.values()) {
            bVar.a(z);
        }
    }

    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
            return;
        }
        Iterator<b> it = this.connServiceMap.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onAppBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cad717", new Object[]{this});
            return;
        }
        for (Map.Entry<String, b> entry : this.connServiceMap.entrySet()) {
            if (UtilityImpl.isChannelProcess(GlobalClientInfo.getContext()) && (entry.getValue() instanceof com.taobao.accs.connection.a)) {
                ((com.taobao.accs.connection.a) entry.getValue()).c();
            }
            onBackground(entry.getKey());
        }
    }

    public void onBackground(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb02f3e", new Object[]{this, str});
            return;
        }
        for (IConnection iConnection : getConnections(str)) {
            try {
                iConnection.sendMessage(Message.buildBackground(iConnection.getHost(null)));
                iConnection.setForeBackState(0);
                if (MassClient.getInstance().isNotEmpty()) {
                    ALog.i(TAG, "send mass background state frame", new Object[0]);
                    iConnection.sendMessage(Message.buildMassMessage(iConnection.getAppkey(), "back", "powermsg", iConnection.getHost(null), iConnection.getConfigTag(), GlobalClientInfo.getContext()));
                }
            } catch (Exception e) {
                ALog.e(TAG, "onBackground err", e, new Object[0]);
            }
        }
        this.connServiceMap.get(str).f();
    }
}
