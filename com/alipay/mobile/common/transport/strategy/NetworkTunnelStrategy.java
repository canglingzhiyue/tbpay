package com.alipay.mobile.common.transport.strategy;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.utils.config.ConfigureChangedListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* loaded from: classes3.dex */
public class NetworkTunnelStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TUNNEL_TYPE_AMNET = 3;
    public static final int TUNNEL_TYPE_ORIGINAL = 1;
    public static final int TUNNEL_TYPE_SPDY = 2;
    public static final int TUNNEL_TYPE_UNINIT = -1;

    /* renamed from: a  reason: collision with root package name */
    private static NetworkTunnelStrategy f5614a;
    private NetworkTunnelChangedObservible b;
    private NetworkConfigureChangedListener c;
    private Context i;
    private String j;
    private int d = -1;
    private int e = -1;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean k = false;

    /* loaded from: classes3.dex */
    public class NetworkConfigureChangedListener implements ConfigureChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public NetworkConfigureChangedListener() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
                return;
            }
            try {
                LogCatUtil.debug("NetworkTunnelStrategy", "update change");
                if (NetworkTunnelStrategy.access$000(NetworkTunnelStrategy.this) == null) {
                    LogCatUtil.error("NetworkTunnelStrategy", "Context is null. so dangerous!!");
                    return;
                }
                NetworkTunnelStrategy.access$100(NetworkTunnelStrategy.this);
                if (NetworkTunnelStrategy.access$200(NetworkTunnelStrategy.this) == NetworkTunnelStrategy.access$300(NetworkTunnelStrategy.this)) {
                    return;
                }
                int access$300 = NetworkTunnelStrategy.access$300(NetworkTunnelStrategy.this);
                NetworkTunnelStrategy.access$302(NetworkTunnelStrategy.this, NetworkTunnelStrategy.access$200(NetworkTunnelStrategy.this));
                TunnelChangeEventModel tunnelChangeEventModel = new TunnelChangeEventModel();
                tunnelChangeEventModel.currentTunnelType = access$300;
                tunnelChangeEventModel.newTunnelType = NetworkTunnelStrategy.access$200(NetworkTunnelStrategy.this);
                NetworkTunnelStrategy.this.notifyTunnelChanged(tunnelChangeEventModel);
            } catch (Throwable th) {
                LogCatUtil.error("NetworkTunnelStrategy", th);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class NetworkTunnelChangedObservible extends Observable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public NetworkTunnelChangedObservible() {
        }

        public static /* synthetic */ Object ipc$super(NetworkTunnelChangedObservible networkTunnelChangedObservible, String str, Object... objArr) {
            if (str.hashCode() == -310743881) {
                super.notifyObservers(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // java.util.Observable
        public void notifyObservers(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed7a6cb7", new Object[]{this, obj});
                return;
            }
            setChanged();
            super.notifyObservers(obj);
        }
    }

    public static /* synthetic */ Context access$000(NetworkTunnelStrategy networkTunnelStrategy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c5974dc1", new Object[]{networkTunnelStrategy}) : networkTunnelStrategy.i;
    }

    public static /* synthetic */ void access$100(NetworkTunnelStrategy networkTunnelStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3caa72e8", new Object[]{networkTunnelStrategy});
        } else {
            networkTunnelStrategy.c();
        }
    }

    public static /* synthetic */ int access$200(NetworkTunnelStrategy networkTunnelStrategy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("571b6bfa", new Object[]{networkTunnelStrategy})).intValue() : networkTunnelStrategy.e;
    }

    public static /* synthetic */ int access$300(NetworkTunnelStrategy networkTunnelStrategy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("718c6519", new Object[]{networkTunnelStrategy})).intValue() : networkTunnelStrategy.d;
    }

    public static /* synthetic */ int access$302(NetworkTunnelStrategy networkTunnelStrategy, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e188092", new Object[]{networkTunnelStrategy, new Integer(i)})).intValue();
        }
        networkTunnelStrategy.d = i;
        return i;
    }

    public static final NetworkTunnelStrategy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkTunnelStrategy) ipChange.ipc$dispatch("68870a22", new Object[0]);
        }
        NetworkTunnelStrategy networkTunnelStrategy = f5614a;
        if (networkTunnelStrategy != null) {
            return networkTunnelStrategy;
        }
        synchronized (NetworkTunnelStrategy.class) {
            if (f5614a != null) {
                return f5614a;
            }
            f5614a = new NetworkTunnelStrategy();
            return f5614a;
        }
    }

    private NetworkTunnelStrategy() {
        n();
    }

    public void init(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{this, context, str});
        } else if (this.k) {
        } else {
            this.k = true;
            this.i = context;
            this.j = str;
            b();
        }
    }

    public boolean isUse4Utdid(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2952e39e", new Object[]{this, str, new Integer(i), new Integer(i2)})).booleanValue() : StrategyUtil.grayscaleUtdid(str, new int[]{i, i2});
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.AMNET_SWITCH);
        if (MiscUtils.grayscaleUtdid(this.j, stringValue)) {
            LogCatUtil.info("NetworkTunnelStrategy", "isEnabledAmnet is true, utdid=" + this.j);
            return true;
        }
        LogCatUtil.info("NetworkTunnelStrategy", "isEnabledAmnet is false, grayscaleValue=" + stringValue + ", utdid=" + this.j);
        return false;
    }

    public boolean isUseExtTransport(TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3c95ddf", new Object[]{this, transportContext})).booleanValue() : a(transportContext.api) && d();
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : StrategyUtil.isUse4OperationType(TransportConfigureManager.getInstance().getStringValueList(TransportConfigureItem.OPERATION_TYPE_LIST, ","), str);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c();
        this.d = this.e;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LogCatUtil.debug("NetworkTunnelStrategy", "updateTunnlType");
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        this.e = -1;
        if (e()) {
            this.g = true;
            this.e = 2;
            if (transportConfigureManager.equalsString(TransportConfigureItem.H5_SPDY_SWITCH, "T")) {
                this.h = true;
            } else {
                this.h = false;
            }
        } else {
            this.g = false;
            this.h = false;
        }
        if (f()) {
            this.e = 3;
            this.f = true;
        } else {
            this.f = false;
        }
        if (this.e != -1) {
            return;
        }
        this.e = 1;
    }

    private final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        int i = this.d;
        return i == 2 || i == 3;
    }

    public final boolean isUseExtTransportForRealtime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51551e7a", new Object[]{this})).booleanValue();
        }
        if (!MiscUtils.isPushProcess(this.i)) {
            return isCanUseAmnet() || isCanUseSpdy();
        }
        LogCatUtil.debug("NetworkTunnelStrategy", "===> Rpc push process does not use spdy <===");
        return false;
    }

    public boolean isCanUseSpdyDataTunel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a063c382", new Object[]{this})).booleanValue() : isCanUseSpdy() && this.d == 2;
    }

    public boolean isCanUseSpdy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd76b3be", new Object[]{this})).booleanValue() : this.g;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!m()) {
            return false;
        }
        if (g()) {
            return i() && k();
        }
        LogCatUtil.debug("NetworkTunnelStrategy", "isUseSpdy4Devices == false");
        return false;
    }

    public boolean isCanUseAmnet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1fa6f19b", new Object[]{this})).booleanValue() : this.d == 3;
    }

    public boolean isCanUseAmnetOnOnlyPush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6784df20", new Object[]{this})).booleanValue();
        }
        if (!TransportStrategy.isEnabledOnlyPush()) {
            return isCanUseAmnet();
        }
        return true;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : a() && h() && j() && l();
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        return a(transportConfigureManager.getStringValue(TransportConfigureItem.SPDY_BLACK_LIST_PHONE_BRAND), transportConfigureManager.getStringValue(TransportConfigureItem.SPDY_BLACK_LIST_PHONE_MODEL), transportConfigureManager.getStringValue(TransportConfigureItem.SPDY_BLACK_LIST_CPU_MODEL));
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        return a(transportConfigureManager.getStringValue(TransportConfigureItem.AMNET_BLACK_LIST_PHONE_BRAND), transportConfigureManager.getStringValue(TransportConfigureItem.AMNET_BLACK_LIST_PHONE_MODEL), transportConfigureManager.getStringValue(TransportConfigureItem.AMNET_BLACK_LIST_CPU_MODEL));
    }

    private boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (!StrategyUtil.isUse4Brand(str)) {
            LogCatUtil.info("NetworkTunnelStrategy", "isUse4Brand is false. brandBlackList=[" + str + "] ");
            return false;
        } else if (!StrategyUtil.isUse4Model(str2)) {
            LogCatUtil.info("NetworkTunnelStrategy", "isUse4Brand is false. isUse4Model=[" + str2 + "] ");
            return false;
        } else if (StrategyUtil.isUse4Hardware(str3)) {
            return true;
        } else {
            LogCatUtil.info("NetworkTunnelStrategy", "isUse4Hardware is false. cpuModelBackList=[" + str3 + "] ");
            return false;
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.i != null && StrategyUtil.isUse4Net(this.i, TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SPDY_DISABLED_NET_KEY));
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (this.i != null) {
            return StrategyUtil.isUse4Net(this.i, TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.AMNET_DISABLED_NET_KEY));
        }
        LogCatUtil.error("NetworkTunnelStrategy", "mContext is null. so return false");
        return false;
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : StrategyUtil.isUse4SdkVersion(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SPDY_DISABLED_SDK_VERSION));
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : StrategyUtil.isUse4SdkVersion(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.AMNET_DISABLED_SDK_VERSION));
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        String stringValue = getConfigureManager().getStringValue(TransportConfigureItem.SPDY_SWITCH);
        return !StringUtils.isEmpty(stringValue) && stringValue.startsWith("T");
    }

    public final TransportConfigureManager getConfigureManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransportConfigureManager) ipChange.ipc$dispatch("7563e2be", new Object[]{this}) : TransportConfigureManager.getInstance();
    }

    public int getConnFailMaxTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c5f084b", new Object[]{this})).intValue() : TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.CONN_FAIL_MAX_TIMES);
    }

    public void addNetworkTunnelChangedListener(NetworkTunnelChangedListener networkTunnelChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522581ef", new Object[]{this, networkTunnelChangedListener});
            return;
        }
        LogCatUtil.printInfo("NetworkTunnelStrategy", "addNetworkTunnelChangedListener: " + networkTunnelChangedListener.getClass().getName());
        o().addObserver(networkTunnelChangedListener);
    }

    public void removeNetworkTunnelChangedListener(NetworkTunnelChangedListener networkTunnelChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b2de12", new Object[]{this, networkTunnelChangedListener});
        } else {
            o().deleteObserver(networkTunnelChangedListener);
        }
    }

    public void notifyNetworkTunnelChangedEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb917ee9", new Object[]{this, new Integer(i)});
        } else {
            o().notifyObservers(Integer.valueOf(i));
        }
    }

    public ConfigureChangedListener getConfigureChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigureChangedListener) ipChange.ipc$dispatch("e853d663", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new NetworkConfigureChangedListener();
        }
        return this.c;
    }

    public boolean isCanUseSpdyForH5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83c7d98e", new Object[]{this})).booleanValue() : this.h;
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            TransportConfigureManager.getInstance().addConfigureChangedListener(getConfigureChangedListener());
        }
    }

    private NetworkTunnelChangedObservible o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkTunnelChangedObservible) ipChange.ipc$dispatch("b7a35f73", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new NetworkTunnelChangedObservible();
        }
        return this.b;
    }

    public void notifyTunnelChanged(TunnelChangeEventModel tunnelChangeEventModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0b7eaa", new Object[]{this, tunnelChangeEventModel});
            return;
        }
        try {
            o().notifyObservers(tunnelChangeEventModel);
            a(tunnelChangeEventModel);
        } catch (Throwable th) {
            LogCatUtil.error("NetworkTunnelStrategy", " notifyTunnelChanged exception ", th);
        }
    }

    public void notifyFirstTunnelChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde58d8c", new Object[]{this});
            return;
        }
        TunnelChangeEventModel tunnelChangeEventModel = new TunnelChangeEventModel();
        tunnelChangeEventModel.currentTunnelType = -1;
        tunnelChangeEventModel.newTunnelType = this.d;
        notifyTunnelChanged(tunnelChangeEventModel);
        LogCatUtil.info("NetworkTunnelStrategy", "notifyFirstTunnelChanged finish.  newTunnelType = " + this.d);
    }

    public boolean isCanUseSpdyLongLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8583674", new Object[]{this})).booleanValue() : TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.SPDY_LONGLINK_SWITCH, "T");
    }

    private void a(TunnelChangeEventModel tunnelChangeEventModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde694a8", new Object[]{this, tunnelChangeEventModel});
            return;
        }
        try {
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType(AmnetTunnelManager.LOG_SUBTYPE);
            int i = tunnelChangeEventModel.currentTunnelType;
            String str2 = RPCDataItems.VALUE_NETTUNNEL_SPDY;
            if (i == 3) {
                str = "AMNET";
            } else {
                str = tunnelChangeEventModel.currentTunnelType == 2 ? str2 : "";
            }
            if (tunnelChangeEventModel.newTunnelType == 3) {
                str2 = "AMNET";
            } else if (tunnelChangeEventModel.newTunnelType != 2) {
                str2 = "";
            }
            monitorLoggerModel.getExtPramas().put(AmnetTunnelManager.LOG_KEY_OLD_LIB, str);
            monitorLoggerModel.getExtPramas().put(AmnetTunnelManager.LOG_KEY_NEW_LIB, str2);
            monitorLoggerModel.setParam1("1.0");
            monitorLoggerModel.setParam2(str);
            monitorLoggerModel.setParam3(str2);
            LogCatUtil.debug("NetworkTunnelStrategy", "networkTunnel switch perflog:" + monitorLoggerModel.toString());
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
        } catch (Throwable th) {
            LogCatUtil.error("NetworkTunnelStrategy", "perfLog exception", th);
        }
    }

    public int getCurrentDataTunnlType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("385929d2", new Object[]{this})).intValue() : this.d;
    }
}
