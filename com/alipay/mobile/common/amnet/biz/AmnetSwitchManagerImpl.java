package com.alipay.mobile.common.amnet.biz;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnetcore.AmnetSwitchManager;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.config.UserNetworkPreferencesManager;
import com.alipay.mobile.common.transport.strategy.StrategyUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transportext.Transport;
import com.alipay.mobile.common.utils.config.ConfigureChangedListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* loaded from: classes3.dex */
public class AmnetSwitchManagerImpl implements AmnetSwitchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetSwitchManagerImpl f5364a;
    private static final Map<String, AmnetConfigureItem> b = new HashMap();
    private AmnetSwitchChangedListener c = new AmnetSwitchChangedListener();
    private Boolean d;

    /* loaded from: classes3.dex */
    public class AmnetSwitchChangedListener implements ConfigureChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AmnetSwitchChangedListener() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
                return;
            }
            LogCatUtil.info("AMNET-SW", "switch update");
            if (!((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).isActivated()) {
                return;
            }
            Transport.Altering altering = new Transport.Altering();
            altering.id = 1L;
            altering.status = 12;
            Transport.instance().alter(altering, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetSwitchManagerImpl.AmnetSwitchChangedListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    LogCatUtil.info("AMNET-SW", "notify amnet update switch, result=" + z);
                }
            });
            AmnetTunnelManager.getInstance().updateBifrostSwitch();
            AmnetTunnelManager.getInstance().considerTunnelChange();
            AmnetSwitchManagerImpl.access$000(AmnetSwitchManagerImpl.this);
        }
    }

    public static /* synthetic */ void access$000(AmnetSwitchManagerImpl amnetSwitchManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9f61fa", new Object[]{amnetSwitchManagerImpl});
        } else {
            amnetSwitchManagerImpl.a();
        }
    }

    static {
        AmnetConfigureItem[] values;
        for (AmnetConfigureItem amnetConfigureItem : AmnetConfigureItem.values()) {
            b.put(amnetConfigureItem.getConfigName(), amnetConfigureItem);
        }
    }

    private AmnetSwitchManagerImpl() {
    }

    public static AmnetSwitchManagerImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetSwitchManagerImpl) ipChange.ipc$dispatch("9e075093", new Object[0]);
        }
        AmnetSwitchManagerImpl amnetSwitchManagerImpl = f5364a;
        if (amnetSwitchManagerImpl != null) {
            return amnetSwitchManagerImpl;
        }
        synchronized (AmnetSwitchManagerImpl.class) {
            if (f5364a != null) {
                return f5364a;
            }
            f5364a = new AmnetSwitchManagerImpl();
            return f5364a;
        }
    }

    public ConfigureChangedListener getConfigureChangedListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConfigureChangedListener) ipChange.ipc$dispatch("e853d663", new Object[]{this}) : this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence, T, java.lang.String] */
    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public <T> T pullSwitch(String str, T t) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("721ebeec", new Object[]{this, str, t});
        }
        try {
            if (!StringUtils.isEmpty(str) && b != null) {
                AmnetConfigureItem amnetConfigureItem = b.get(str);
                if (amnetConfigureItem == null) {
                    LogCatUtil.warn("AMNET-SW", "pullSwitch item is null.");
                    return t;
                }
                ?? r2 = (T) TransportConfigureManager.getInstance().getStringValue(amnetConfigureItem);
                if (StringUtils.isEmpty(r2)) {
                    LogCatUtil.warn("AMNET-SW", "pullSwitch value is null.");
                    return t;
                }
                LogCatUtil.debug("AMNET-SW", "pullSwitch, key=" + str + ",value=" + ((String) r2));
                if (t instanceof Boolean) {
                    Boolean.valueOf(false);
                    return (T) Boolean.valueOf(a(amnetConfigureItem.getType(), r2));
                } else if (t instanceof String[]) {
                    return !StringUtils.isEmpty(r2) ? (T) r2.split(",") : t;
                } else {
                    if (t instanceof Integer) {
                        Object valueOf = Integer.valueOf(Integer.parseInt(r2));
                        if (valueOf == null) {
                            return t;
                        }
                        obj = valueOf;
                    } else if (t instanceof String) {
                        return r2;
                    } else {
                        if (t instanceof Long) {
                            Object valueOf2 = Long.valueOf(Long.parseLong(r2));
                            if (valueOf2 == null) {
                                return t;
                            }
                            obj = valueOf2;
                        } else if (t instanceof Float) {
                            Object valueOf3 = Float.valueOf(Float.parseFloat(r2));
                            if (valueOf3 == null) {
                                return t;
                            }
                            obj = valueOf3;
                        } else if (!(t instanceof Double)) {
                            return t;
                        } else {
                            Object valueOf4 = Double.valueOf(Double.parseDouble(r2));
                            obj = valueOf4;
                            if (valueOf4 == null) {
                                return t;
                            }
                        }
                    }
                    return obj;
                }
            }
            LogCatUtil.warn("AMNET-SW", "pullSwitch input is null or map is null.");
            return t;
        } catch (Throwable th) {
            LogCatUtil.warn("AMNET-SW", "pullSwitch" + th.toString());
            return t;
        }
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableInitMergeSync() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a3fbb01", new Object[]{this})).booleanValue() : TransportStrategy.isEnableInitMergeSyncSwitch();
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableSFC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("29ea4ee", new Object[]{this})).booleanValue() : MiscUtils.grayscaleUtdidForABTest(AmnetConfigureItem.AMNET_SHORT_FREQ_CONN);
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableShortLink(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25e17b08", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return MiscUtils.grayscaleUtdidForABTest(AmnetConfigureItem.BIFROST_SHORT_LINK);
        }
        return MiscUtils.grayscaleUtdidForABTest(AmnetConfigureItem.AMNET_SHORT_LINK);
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableST() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2c1ff9", new Object[]{this})).booleanValue() : MiscUtils.grayscaleUtdidForABTest(AmnetConfigureItem.AMNET_ST_TO);
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableZstd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb6fb9e1", new Object[]{this})).booleanValue() : MiscUtils.grayscaleUtdidForABTest(TransportConfigureItem.ZSTD_GRAY);
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean needCheckSpannerZstd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7864c33", new Object[]{this})).booleanValue();
        }
        try {
            return TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.ZSTD_SPANNER_SWITCH) != 0;
        } catch (Throwable th) {
            LogCatUtil.warn("AMNET-SW", "needCheckSpannerZstd: " + th.toString());
            return true;
        }
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public long downgradePeriod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("666af011", new Object[]{this})).longValue();
        }
        try {
            long longValue = TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.ZSTD_DOWNGRADE_PERIOD);
            if (longValue >= 0) {
                return longValue;
            }
            return 7200L;
        } catch (Throwable th) {
            LogCatUtil.warn("AMNET-SW", "downgradePeriod: " + th.toString());
            return 7200L;
        }
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean useBifrost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d782ce1", new Object[]{this})).booleanValue() : TransportStrategy.isEnableBifrost();
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean enableListenNetworkSignalStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b826bd8", new Object[]{this})).booleanValue();
        }
        try {
            String stringValue = TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_LISTEN_SIGNAL_STRENGTH);
            LogCatUtil.info("AMNET-SW", "enableNetworkSignalStrengthListen b_lss=" + stringValue);
            if (!StringUtils.isEmpty(stringValue)) {
                if ("T".equals(stringValue)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("AMNET-SW", "enableListenNetworkSignalStrength error:", th);
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean enableBifrostUseWakeLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c136de7", new Object[]{this})).booleanValue();
        }
        try {
            String stringValue = TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_WAKELOCK_SWITCH);
            if (!StringUtils.isEmpty(stringValue)) {
                if ("1".equals(stringValue)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("AMNET-SW", "enableBifrostUseWakeLock error:", th);
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public int getLonglinkConnMax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3677d86", new Object[]{this})).intValue();
        }
        try {
            int intValue = TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.LONGLINK_CONN_MAX);
            LogCatUtil.debug("AMNET-SW", "getLonglinkConnMax value:" + intValue);
            return intValue;
        } catch (Throwable th) {
            LogCatUtil.error("AMNET-SW", "enableBifrostUseWakeLock error:", th);
            return 1;
        }
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean forceTlsVerify() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38f002b4", new Object[]{this})).booleanValue() : StringUtils.equals(TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.AMNET_FORCE_TLS_VERIFY), "T");
    }

    public boolean enableBifrostDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c8c84c6", new Object[]{this})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_DOWNGRADE_ENABLE);
        return StringUtils.isEmpty(stringValue) || !"0".equals(stringValue);
    }

    public boolean enableBifrostLocalDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51ffd24f", new Object[]{this})).booleanValue();
        }
        if (MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_LOCAL_DOWNGRADE_ENABLE))) {
            return true;
        }
        LogCatUtil.info("AMNET-SW", "[enableBifrostLocalDowngrade] No downgrade.");
        return false;
    }

    public boolean enableBifrostHttp2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d824d7b", new Object[]{this})).booleanValue() : MiscUtils.grayscaleUtdidForABTest(TransportConfigureItem.BIFROST_USE_H2);
    }

    public boolean isEnabledBifrostDynamicLib() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70b33117", new Object[]{this})).booleanValue() : MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_DYNAMIC_LIB_FEATURE_SWITCH));
    }

    public int getDynamicLibDownloadInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("81433343", new Object[]{this})).intValue() : TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.BIFROST_DYNAMIC_LIB_DOWNLOAD_INTERVAL);
    }

    public boolean isForceSSLHandshake(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec58ed9", new Object[]{this, context})).booleanValue();
        }
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        this.d = Boolean.valueOf(MiscUtils.getBooleanFromMetaData(context, "is_force_ssl_handshake"));
        LogCatUtil.info("AMNET-SW", "[isForceSSLHandshake] forceSSLHandshake = " + this.d.booleanValue());
        return this.d.booleanValue();
    }

    public boolean isCanStartMainProcDispatch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7008b630", new Object[]{this})).booleanValue() : TransportConfigureManager.getInstance().equalsString(AmnetConfigureItem.START_MAIN_PROC_DISPATCH_SWITCH, "T");
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && str.startsWith("T")) {
            if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), str2)) {
                return false;
            }
        } else if (!StringUtils.isEmpty(str) && str.startsWith("B")) {
            if (!StringUtils.isEmpty(str2)) {
                return StrategyUtil.isUse4Model(str2.trim().toLowerCase().replaceAll("\\s+", "_"));
            }
        } else if (StringUtils.isEmpty(str2) || !str2.startsWith("T")) {
            return false;
        }
        return true;
    }

    private void a() {
        Pair<String, Integer> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                LogCatUtil.info("AMNET-SW", "[updateBindedHostInfos] Enter.");
            }
            UserNetworkPreferencesManager.getInstance().forceLoadLocalBindHosts();
            Map<String, Pair<String, Integer>> allBindHostPairs = UserNetworkPreferencesManager.getInstance().getAllBindHostPairs();
            if (allBindHostPairs != null && !allBindHostPairs.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                AmnetOperationManager amnetOperationManager = (AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class);
                for (Map.Entry<String, Pair<String, Integer>> entry : allBindHostPairs.entrySet()) {
                    if (!StringUtils.isEmpty(entry.getKey()) && (value = entry.getValue()) != null) {
                        if (value == UserNetworkPreferencesManager.EMPTY_PAIR) {
                            amnetOperationManager.setBindHost(entry.getKey(), "");
                        } else {
                            String str = ((String) value.first) + ":" + value.second;
                            amnetOperationManager.setBindHost(entry.getKey(), str);
                            sb.append(entry.getKey());
                            sb.append("=");
                            sb.append(str);
                            sb.append(",");
                        }
                    }
                }
                if (sb.length() <= 0) {
                    return;
                }
                LogCatUtil.info("AMNET-SW", "[updateBindedHostInfos] Host infos = " + sb.toString());
            }
        } catch (Throwable th) {
            LogCatUtil.error("AMNET-SW", "[updateBindedHostInfos] Exception: " + th.toString(), th);
        }
    }
}
