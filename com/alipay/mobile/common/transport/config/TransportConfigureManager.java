package com.alipay.mobile.common.transport.config;

import android.content.Context;
import android.os.FileObserver;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transport.zfeatures.LoginRefreshManager;
import com.alipay.mobile.common.utils.config.ConfigureCtrlManagerImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.ils;
import tb.riy;

/* loaded from: classes3.dex */
public class TransportConfigureManager extends ConfigureCtrlManagerImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SDCARD_CONFIG_FILE = "transport_config.json";
    public static final String SDCARD_SRV_CONFIG_FILE = "srv_transport_config.json";
    public static TransportConfigureManager transportConfigureManager;

    /* renamed from: a  reason: collision with root package name */
    private int f5525a = 0;
    private boolean b = false;
    private ConfigFileListener c;

    public static /* synthetic */ Object ipc$super(TransportConfigureManager transportConfigureManager2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -548367912:
                return super.parseObject((String) objArr[0]);
            case -490727030:
                super.notifyConfigureChangedEvent();
                return null;
            case -69246850:
                return new Boolean(super.updateFromSharedPref((Context) objArr[0], (String) objArr[1], (String) objArr[2]));
            case 59993334:
                super.clearConfig();
                return null;
            case 1208567045:
                return new Boolean(super.updateFromJsonStrAndSave((Context) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]));
            case 1228393960:
                return new Boolean(super.partialUpdateFromMapAndSave((Context) objArr[0], (Map) objArr[1], (String) objArr[2], (String) objArr[3]));
            case 1686691324:
                return new Boolean(super.isLoadedConfig());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final TransportConfigureManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportConfigureManager) ipChange.ipc$dispatch("6cef96c", new Object[0]);
        }
        TransportConfigureManager transportConfigureManager2 = transportConfigureManager;
        if (transportConfigureManager2 != null) {
            return transportConfigureManager2;
        }
        synchronized (TransportConfigureManager.class) {
            if (transportConfigureManager != null) {
                return transportConfigureManager;
            }
            transportConfigureManager = new TransportConfigureManager();
            return transportConfigureManager;
        }
    }

    private TransportConfigureManager() {
        a();
    }

    public boolean resetConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35bf2954", new Object[]{this, context})).booleanValue();
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "resetConfig");
        this.f5525a = 0;
        return updateConfig(context);
    }

    public boolean firstUpdateConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("641c9eca", new Object[]{this, context})).booleanValue();
        }
        if (this.b) {
            return true;
        }
        this.b = true;
        LogCatUtil.info("Conf_TransportConfigureManager", "=====> firstUpdateConfig <=====");
        return updateConfig(context);
    }

    public boolean updateConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83080b9a", new Object[]{this, context})).booleanValue();
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "updateConfig");
        try {
            e(context);
            super.clearConfig();
            super.updateFromSharedPref(context, NwSharedSwitchUtil.SHARED_FILE_NAME, NwSharedSwitchUtil.KEY_NET_SWITCH_ONE);
            super.updateFromSharedPref(context, NwSharedSwitchUtil.SHARED_FILE_NAME, NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
            c(context);
            return super.isLoadedConfig();
        } catch (Exception e) {
            LogCatUtil.error("Conf_TransportConfigureManager", e);
            return false;
        } finally {
            this.b = true;
            notifyConfigureChangedEvent();
        }
    }

    public boolean updateConfig(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2e272f8", new Object[]{this, context, str, new Boolean(z)})).booleanValue();
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "updateConfig json: " + str);
        try {
            if (z) {
                super.clearConfig();
            }
            e(context);
            super.updateFromSharedPref(context, NwSharedSwitchUtil.SHARED_FILE_NAME, NwSharedSwitchUtil.KEY_NET_SWITCH_ONE);
            super.updateFromJsonStrAndSave(context, str, NwSharedSwitchUtil.SHARED_FILE_NAME, NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
            c(context);
            return super.isLoadedConfig();
        } catch (Exception e) {
            LogCatUtil.error("Conf_TransportConfigureManager", e);
            return false;
        } finally {
            this.b = true;
            delayNotifyConfigureChangedEvent();
        }
    }

    public boolean updateConfig(Context context, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ffd4d3d", new Object[]{this, context, map, str})).booleanValue();
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "updateConfig map config: " + map.toString());
        try {
            e(context);
            super.partialUpdateFromMapAndSave(context, map, NwSharedSwitchUtil.SHARED_FILE_NAME, str);
            return super.isLoadedConfig();
        } catch (Exception e) {
            LogCatUtil.error("Conf_TransportConfigureManager", e);
            return false;
        } finally {
            this.b = true;
            delayNotifyConfigureChangedEvent();
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!TransportStrategy.isEnabledOnlyUseBifrostH2(context)) {
        } else {
            enableOnlyUseBifrostH2();
        }
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        try {
            String gwfurl = ReadSettingServerUrl.getInstance().getGWFURL(context);
            URL url = new URL(gwfurl);
            LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. gw url: " + gwfurl);
            if (MiscUtils.isOnlineUrl(url)) {
                TransportConfigureItem.SPDY_SWITCH.setValue("T");
                LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. Open online env spdy finish.");
            } else if (MiscUtils.isTestUrl(url)) {
                TransportConfigureItem.SPDY_SWITCH.setValue("T");
                TransportConfigureItem.SPDY_URL.setValue(MiscUtils.getTestGwUrl());
                LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. Open test env spdy finish.");
            } else if (MiscUtils.isSandboxUrl(url)) {
                TransportConfigureItem.SPDY_SWITCH.setValue(UTConstant.Args.UT_SUCCESS_F);
                LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. Close sandbox env spdy finish.");
            } else {
                LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. Close unknow env amnet and spdy finish.");
                TransportConfigureItem.AMNET_SWITCH.setValue("0,0");
                TransportConfigureItem.SPDY_SWITCH.setValue(UTConstant.Args.UT_SUCCESS_F);
            }
            if (!MiscUtils.isDebugger(context)) {
                return;
            }
            TransportConfigureItem.DJG_SWITCH.setValue(ils.ARCH_BIT64);
            LogCatUtil.printInfo("Conf_TransportConfigureManager", "initConfigItemsByEnv. Debug env, default open django switch.");
            TransportConfigureItem.IPRANK_AB_SWITCH.setValue(ils.ARCH_BIT64);
            TransportConfigureItem.EASTEREGGS.setValue("T");
            TransportConfigureItem.LOGIN_REFRESH_SWITCH.setValue(ils.ARCH_BIT64);
            LoginRefreshManager.getInstance().enableRefresh();
            TransportConfigureItem.GO_URLCONNECTION_SWITCH.setValue(ils.ARCH_BIT64);
            TransportConfigureItem.TRANSPORT_LOCAL_AMNET.setValue(ils.ARCH_BIT64);
            getInstance().setValue(TransportConfigureItem.TRANSPORT_LOCAL_AMNET, ils.ARCH_BIT64);
        } catch (Throwable th) {
            LogCatUtil.error("Conf_TransportConfigureManager", th);
        }
    }

    public int getLatestVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4d4ea95", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(getConfgureVersion()) + getVersionSecond();
        } catch (Throwable th) {
            LogCatUtil.warn("Conf_TransportConfigureManager", "getLatestVersion exception : " + th.toString());
            return 0;
        }
    }

    @Override // com.alipay.mobile.common.utils.config.ConfigureCtrlManagerImpl, com.alipay.mobile.common.utils.config.ConfigureCtrlManager
    public String getConfgureVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50f418fc", new Object[]{this}) : getStringValue(TransportConfigureItem.VERSION);
    }

    public int getVersionSecond() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae70c130", new Object[]{this})).intValue() : getIntValue(TransportConfigureItem.VERSION2);
    }

    @Override // com.alipay.mobile.common.utils.config.ConfigureCtrlManagerImpl, com.alipay.mobile.common.utils.config.ConfigureCtrlManager
    public void notifyConfigureChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c0198a", new Object[]{this});
            return;
        }
        int latestVersion = getLatestVersion();
        LogCatUtil.info("Conf_TransportConfigureManager", "notifyConfigureChangedEvent. currentVersion=[" + this.f5525a + "], latestVersion=[" + latestVersion + "] ");
        super.notifyConfigureChangedEvent();
        getInstance().b();
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        loadConfigFromSettingTool(context);
        d(context);
        a(context);
    }

    private void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        try {
            if (!MiscUtils.isDebugger(context)) {
                return;
            }
            String configFromSdcard = MiscUtils.getConfigFromSdcard(SDCARD_CONFIG_FILE);
            if (TextUtils.isEmpty(configFromSdcard)) {
                return;
            }
            LogCatUtil.info("Conf_TransportConfigureManager", "loadConfigFromSdcard: " + configFromSdcard);
            mergeConfig(super.parseObject(configFromSdcard));
        } catch (Exception e) {
            LogCatUtil.error("Conf_TransportConfigureManager", e);
        }
    }

    private void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{this, context});
            return;
        }
        b(context);
        a(context);
    }

    public void delayNotifyConfigureChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cfe787", new Object[]{this});
            return;
        }
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            LogCatUtil.warn("Conf_TransportConfigureManager", "delayNotifyConfigureChangedEvent sleep exception : " + e.toString());
        }
        notifyConfigureChangedEvent();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = TransportEnvUtil.getContext();
        if (context == null) {
            LogCatUtil.error("Conf_TransportConfigureManager", "specialHandle.  context is null. ");
        } else if (!MiscUtils.isInAlipayClient(context) || !MiscUtils.isPushProcess(context) || MiscUtils.isRealPushProcess(context) || this.c != null) {
        } else {
            this.c = new ConfigFileListener(MiscUtils.getSharedPrefsDir(TransportEnvUtil.getContext()));
            this.c.startWatching();
            LogCatUtil.info("Conf_TransportConfigureManager", "configFileListener startWatching");
        }
    }

    /* loaded from: classes3.dex */
    public static class ConfigFileListener extends FileObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static byte STATE_BUSY = 2;
        public static byte STATE_IDLE = 1;

        /* renamed from: a  reason: collision with root package name */
        private byte f5526a;

        public static /* synthetic */ byte access$002(ConfigFileListener configFileListener, byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e36fa6df", new Object[]{configFileListener, new Byte(b)})).byteValue();
            }
            configFileListener.f5526a = b;
            return b;
        }

        public ConfigFileListener(String str) {
            super(str);
            this.f5526a = STATE_IDLE;
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb74f7cb", new Object[]{this, new Integer(i), str});
            } else if (TextUtils.isEmpty(str) || !str.equals(NwSharedSwitchUtil.SHARED_FILE) || i != 2) {
            } else {
                LogCatUtil.info("Conf_TransportConfigureManager", "ConfigFileListener. path=[" + str + "]  event=[" + i + "] ");
                byte b = this.f5526a;
                byte b2 = STATE_BUSY;
                if (b == b2) {
                    LogCatUtil.info("Conf_TransportConfigureManager", "ConfigFileListener. state is STATE_BUSY, return.");
                    return;
                }
                this.f5526a = b2;
                try {
                    NetworkAsyncTaskExecutor.executeSerial(new Runnable() { // from class: com.alipay.mobile.common.transport.config.TransportConfigureManager.ConfigFileListener.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                TransportConfigureManager.getInstance().updateConfig(TransportEnvUtil.getContext());
                            } catch (Throwable th) {
                                try {
                                    LogCatUtil.error("Conf_TransportConfigureManager", "ConfigFileListener. updateConfig exception.", th);
                                } finally {
                                    ConfigFileListener.access$002(ConfigFileListener.this, ConfigFileListener.STATE_IDLE);
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    LogCatUtil.error("Conf_TransportConfigureManager", "ConfigFileListener. executeSerial exception.", th);
                    this.f5526a = STATE_IDLE;
                }
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transport.config.TransportConfigureManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LogCatUtil.debug("Conf_TransportConfigureManager", "config change,generate new clientABTagValues");
                    }
                }
            }, 1L, TimeUnit.SECONDS);
        }
    }

    public boolean loadConfigFromSettingTool(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("856e37cf", new Object[]{this, context})).booleanValue();
        }
        try {
            if (!MiscUtils.isDebugger(context)) {
                return false;
            }
            ReadSettingServerUrl readSettingServerUrl = ReadSettingServerUrl.getInstance();
            Boolean isEnableAmnetSetting = readSettingServerUrl.isEnableAmnetSetting(context);
            LogCatUtil.debug("Conf_TransportConfigureManager", "enableAmnetSetting=[" + isEnableAmnetSetting + riy.ARRAY_END_STR);
            if (isEnableAmnetSetting == null) {
                return false;
            }
            String gwfurl = readSettingServerUrl.getGWFURL(context);
            URL url = new URL(gwfurl);
            if (isEnableAmnetSetting != null && isEnableAmnetSetting == Boolean.TRUE) {
                enableAmnetSetting(context, gwfurl, url);
            } else {
                TransportConfigureManager transportConfigureManager2 = getInstance();
                transportConfigureManager2.setValue(TransportConfigureItem.SPDY_SWITCH, UTConstant.Args.UT_SUCCESS_F);
                transportConfigureManager2.setValue(TransportConfigureItem.AMNET_SWITCH, "0,0,0");
                transportConfigureManager2.setValue(TransportConfigureItem.NO_DOWN_HTTPS, "0-1");
                transportConfigureManager2.setValue(TransportConfigureItem.RPCV2_SWITCH, "T");
                LogCatUtil.info("Conf_TransportConfigureManager", "Disable ext transport!");
            }
            LogCatUtil.debug("Conf_TransportConfigureManager", "settings config load finish!");
            return true;
        } catch (Exception e) {
            LogCatUtil.warn("Conf_TransportConfigureManager", e.toString());
            return false;
        }
    }

    public void enableAmnetSetting(Context context, String str, URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3527ade8", new Object[]{this, context, str, url});
            return;
        }
        TransportConfigureManager transportConfigureManager2 = getInstance();
        transportConfigureManager2.setValue(TransportConfigureItem.AMNET_SWITCH, ils.ARCH_BIT64);
        transportConfigureManager2.setValue(TransportConfigureItem.NO_DOWN_HTTPS, "1-1");
        transportConfigureManager2.setValue(TransportConfigureItem.RPCV2_SWITCH, "T");
        transportConfigureManager2.setValue(TransportConfigureItem.AMNET_BLACK_LIST_PHONE_BRAND, "");
        transportConfigureManager2.setValue(TransportConfigureItem.AMNET_BLACK_LIST_PHONE_MODEL, "");
        transportConfigureManager2.setValue(TransportConfigureItem.AMNET_BLACK_LIST_CPU_MODEL, "");
        transportConfigureManager2.setValue(TransportConfigureItem.AMNET_DISABLED_NET_KEY, "");
        transportConfigureManager2.setValue(TransportConfigureItem.AMNET_DISABLED_SDK_VERSION, "");
        if (!setAmnetConfigByDns(context)) {
            setAmnetConfigByGwUrl(context, str, url, transportConfigureManager2);
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "enableAmnetSetting done");
    }

    public void enableOnlyUseBifrostH2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a3f936", new Object[]{this});
            return;
        }
        TransportConfigureManager transportConfigureManager2 = getInstance();
        transportConfigureManager2.setValue(TransportConfigureItem.AMNET_SWITCH, ils.ARCH_BIT64);
        transportConfigureManager2.setValue(TransportConfigureItem.USE_BIFROST, ils.ARCH_BIT64);
        transportConfigureManager2.setValue(TransportConfigureItem.BIFROST_USE_H2, ils.ARCH_BIT64);
        transportConfigureManager2.setValue(TransportConfigureItem.INIT_MERGE_CMD, ils.ARCH_BIT64);
        transportConfigureManager2.setValue(TransportConfigureItem.BIFROST_DISABLSE_RPC_DOWNGRADE, ils.ARCH_BIT64);
        transportConfigureManager2.setValue(TransportConfigureItem.SPDY_SWITCH, UTConstant.Args.UT_SUCCESS_F);
        LogCatUtil.info("Conf_TransportConfigureManager", "enableOnlyUseBifrostH2 done");
    }

    public boolean setAmnetConfigByDns(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a803fc4", new Object[]{this, context})).booleanValue();
        }
        TransportConfigureManager transportConfigureManager2 = getInstance();
        String amnetDnsSetting = ReadSettingServerUrl.getInstance().getAmnetDnsSetting(context);
        if (TextUtils.isEmpty(amnetDnsSetting)) {
            return false;
        }
        String trim = amnetDnsSetting.trim();
        if (TextUtils.isEmpty(trim)) {
            return false;
        }
        transportConfigureManager2.setValue(TransportConfigureItem.MMTP_URL, trim);
        if (trim.endsWith(":8903")) {
            LogCatUtil.info("Conf_TransportConfigureManager", "setAmnetConfigByDns port is 8903, don't need to shake hands");
            transportConfigureManager2.setValue(TransportConfigureItem.AMNET_HS, UTConstant.Args.UT_SUCCESS_F);
        } else {
            transportConfigureManager2.setValue(TransportConfigureItem.AMNET_HS, "T");
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "setAmnetConfigByDns finish,  amnetDnsSetting=[" + trim + riy.ARRAY_END_STR);
        return true;
    }

    public void setAmnetConfigByGwUrl(Context context, String str, URL url, TransportConfigureManager transportConfigureManager2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a346af7", new Object[]{this, context, str, url, transportConfigureManager2});
            return;
        }
        if (MiscUtils.isOnlineUrl(url)) {
            if (MiscUtils.isRCVersion(context)) {
                transportConfigureManager2.setValue(TransportConfigureItem.MMTP_URL, "mygwrc.alipay.com:443");
            } else {
                transportConfigureManager2.setValue(TransportConfigureItem.MMTP_URL, "mygw.alipay.com:443");
            }
        } else if (MiscUtils.isPreUrl(url)) {
            transportConfigureManager2.setValue(TransportConfigureItem.MMTP_URL, "mygwpre.alipay.com:443");
        } else if (url.getPort() != -1) {
            TransportConfigureItem transportConfigureItem = TransportConfigureItem.MMTP_URL;
            transportConfigureManager2.setValue(transportConfigureItem, url.getHost() + ":" + url.getPort());
            if (url.getPort() == 8903) {
                transportConfigureManager2.setValue(TransportConfigureItem.AMNET_HS, UTConstant.Args.UT_SUCCESS_F);
            } else {
                transportConfigureManager2.setValue(TransportConfigureItem.AMNET_HS, "T");
            }
        } else {
            TransportConfigureItem transportConfigureItem2 = TransportConfigureItem.MMTP_URL;
            transportConfigureManager2.setValue(transportConfigureItem2, url.getHost() + ":443");
            transportConfigureManager2.setValue(TransportConfigureItem.AMNET_HS, "T");
        }
        LogCatUtil.debug("Conf_TransportConfigureManager", "enableAmnetSetting gw_url=[" + str + "] mapping to amnet_url=" + transportConfigureManager2.getStringValue(TransportConfigureItem.MMTP_URL) + "");
    }
}
