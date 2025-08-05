package mtopsdk.common.util;

import android.content.Context;
import android.taobao.windvane.cache.d;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes.dex */
public class RemoteConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.RemoteConfig";
    public static final String TB_IGNORE_PREFETCH = "mtop_ignorePrefetch";
    public static final String TB_SPEED_TS_ENABLE = "tsEnable";
    public static final String TB_SPEED_U_LAND = "preUland";
    private static RemoteConfig instance;
    private static Map<String, Integer> segmentSizeMap;
    private Map<String, String> configItemsMap = null;
    public boolean enableErrorCodeMapping = true;
    public boolean enableBizErrorCodeMapping = false;
    public long bizErrorMappingCodeLength = 24;
    public boolean enableSpdy = true;
    @Deprecated
    public boolean enableUnit = true;
    public boolean enableSsl = true;
    public boolean enableCache = true;
    public boolean enableProperty = false;
    public boolean degradeToSQLite = false;
    public boolean enableNewExecutor = true;
    public long apiLockInterval = 10;
    public String individualApiLockInterval = "";
    public String degradeApiCacheList = "";
    public String removeCacheBlockList = "";
    public String degradeBizErrorMappingApiList = "";
    public boolean enableLongParamOptimize = true;
    public String allowSwitchToPostApiList = "";
    public String allowPageUrlCutApiList = "";
    public String allowRefererCutApiList = "";
    public long switchToPostThreshold = 8192;
    public int headerCutThreshold = 1024;
    public String allowCustomPrefetchExpiredTimeApiList = "";
    public String errorMappingMsg = "";
    public long antiAttackWaitInterval = 20;
    public int useSecurityAdapter = 6;
    public boolean prefetch = false;
    public int segmentRetryTimes = -1;
    public int uploadThreadNums = -1;
    public boolean processBgMethodNew = true;
    public boolean responseHeader = true;
    public boolean removeDeviceInfo = true;
    public boolean dynamicInjectMtopInstance = false;
    public boolean fetchRemoteMtopInstance = true;
    public boolean removePreLimitOfLogin = true;
    public boolean checkLoginStatus = true;
    public final Set<String> useHttpsBizcodeSets = new HashSet();
    public final Set<String> degradeBizcodeSets = new HashSet();
    public boolean enableArupTlog = true;
    public boolean enableFullTraceId = false;
    public boolean enableFalcoId = true;
    public boolean enableChannelLazy = false;
    public boolean isWidgetUseLocalData = false;
    public boolean enableExtDataAlignIos = true;
    public String signDegradedApiList = "";
    public String jsBridgeTimeoutApiList = "";
    public String cookieDisableApiList = "";
    public String supportZstdApiList = "";
    public boolean addRefererField = true;
    public boolean removeWifiInfo = true;
    public String signDegradedApiList2 = "";
    public boolean optH5LoginTimeout = true;
    public boolean uaAddDeviceType = true;
    public boolean unitProtectEnable = true;
    public boolean ssrSupportZstd = false;
    public long unitCalibrationTTL = d.DEFAULT_MAX_AGE;
    public boolean unitCalibrationEnable = false;

    public static RemoteConfig getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteConfig) ipChange.ipc$dispatch("61224ee5", new Object[0]);
        }
        if (instance == null) {
            synchronized (RemoteConfig.class) {
                if (instance == null) {
                    instance = new RemoteConfig();
                }
            }
        }
        return instance;
    }

    static {
        kge.a(-2023621874);
        HashMap hashMap = new HashMap();
        segmentSizeMap = hashMap;
        hashMap.put("2G", 32768);
        segmentSizeMap.put("3G", 65536);
        segmentSizeMap.put("4G", 524288);
        segmentSizeMap.put("WIFI", 524288);
        segmentSizeMap.put("UNKONWN", 131072);
        segmentSizeMap.put("NET_NO", 131072);
    }

    public Integer getSegmentSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a31faa16", new Object[]{this, str});
        }
        if (!StringUtils.isBlank(str)) {
            return segmentSizeMap.get(str);
        }
        return null;
    }

    public void setSegmentSize(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60423a40", new Object[]{this, str, new Integer(i)});
        } else if (StringUtils.isBlank(str) || i <= 0) {
        } else {
            segmentSizeMap.put(str, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:344:0x0d94 -> B:399:0x0da8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:355:0x0e0c -> B:392:0x0e20). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:366:0x0e7f -> B:406:0x0e93). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0359 -> B:383:0x036d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x040b -> B:395:0x041f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0481 -> B:421:0x0495). Please submit an issue!!! */
    public void updateRemoteConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79811698", new Object[]{this});
            return;
        }
        this.configItemsMap = SwitchConfigUtil.getSwitchConfigByGroupName(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_ANDROID_SWITCH);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[updateRemoteConfig] configItemsMap=" + this.configItemsMap);
        }
        if (this.configItemsMap == null) {
            return;
        }
        String configItemByKey = getConfigItemByKey(SwitchConfigUtil.ENABLE_ERROR_CODE_MAPPING_KEY, "true");
        this.enableErrorCodeMapping = "true".equals(configItemByKey);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setEnableErrorCodeMapping]remote enableErrorCodeMappingConfig=" + configItemByKey + ",enableErrorCodeMapping=" + this.enableErrorCodeMapping);
        }
        String configItemByKey2 = getConfigItemByKey(SwitchConfigUtil.ENABLE_BIZ_ERROR_CODE_MAPPING_KEY, "false");
        this.enableBizErrorCodeMapping = "true".equals(configItemByKey2);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setEnableBizErrorCodeMapping]remote enableBizErrorCodeMappingConfig=" + configItemByKey2 + ",enableBizErrorCodeMapping=" + this.enableBizErrorCodeMapping);
        }
        String configItemByKey3 = getConfigItemByKey(SwitchConfigUtil.ENABLE_SPDY_KEY, "true");
        this.enableSpdy = "true".equals(configItemByKey3);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setEnableSpdy]remote spdySwitchConfig=" + configItemByKey3 + ",enableSpdy=" + this.enableSpdy);
        }
        String configItemByKey4 = getConfigItemByKey(SwitchConfigUtil.ENABLE_SSL_KEY, "true");
        this.enableSsl = "true".equals(configItemByKey4);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setEnableSsl]remote spdySslSwitchConfig=" + configItemByKey4 + ",enableSsl=" + this.enableSsl);
        }
        String configItemByKey5 = getConfigItemByKey(SwitchConfigUtil.ENABLE_CACHE_KEY, "true");
        this.enableCache = "true".equalsIgnoreCase(configItemByKey5);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setEnableCache]remote cacheSwitchConfig=" + configItemByKey5 + ",enableCache=" + this.enableCache);
        }
        String configItemByKey6 = getConfigItemByKey(SwitchConfigUtil.ENABLE_MTOPSDK_PROPERTY_KEY, "false");
        this.enableProperty = !"false".equalsIgnoreCase(configItemByKey6);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setEnableProperty]remote mtopsdkPropertySwitchConfig=" + configItemByKey6 + ",enableProperty=" + this.enableProperty);
        }
        String configItemByKey7 = getConfigItemByKey(SwitchConfigUtil.DEGRADE_TO_SQLITE_KEY, "false");
        this.degradeToSQLite = true ^ "false".equalsIgnoreCase(configItemByKey7);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setDegradeToSQLite]remote degradeToSQLiteConfig=" + configItemByKey7 + ",degradeToSQLite=" + this.degradeToSQLite);
        }
        String configItemByKey8 = getConfigItemByKey(SwitchConfigUtil.ENABLE_NEW_EXECUTOR, "true");
        this.enableNewExecutor = "true".equalsIgnoreCase(configItemByKey8);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setEnableNewExecutor]remote enableNewExecutorConfig=" + configItemByKey8 + ",enableNewExecutor=" + this.enableNewExecutor);
        }
        String configItemByKey9 = getConfigItemByKey(SwitchConfigUtil.API_LOCK_INTERVAL_KEY, null);
        if (StringUtils.isNotBlank(configItemByKey9)) {
            try {
                this.apiLockInterval = Long.parseLong(configItemByKey9);
            } catch (Exception unused) {
                TBSdkLog.e(TAG, "[setApiLockInterval]parse apiLockIntervalConfig error,apiLockIntervalConfig=" + configItemByKey9);
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setApiLockInterval]remote apiLockIntervalConfig=" + configItemByKey9 + ",apiLockInterval=" + this.apiLockInterval);
        }
        String configItemByKey10 = getConfigItemByKey(SwitchConfigUtil.OPEN_PREFETCH, "false");
        this.prefetch = "true".equalsIgnoreCase(configItemByKey10);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setPrefetch]remote openPrefetchConfig=" + configItemByKey10 + ",prefetch=" + this.prefetch);
        }
        String configItemByKey11 = getConfigItemByKey(SwitchConfigUtil.ENABLE_FULL_TRACE_ID, "false");
        this.enableFullTraceId = "true".equalsIgnoreCase(configItemByKey11);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setFullTraceIdEnable]remote fullTraceIdConfig=" + configItemByKey11 + ",enable=" + this.enableFullTraceId);
        }
        String configItemByKey12 = getConfigItemByKey(SwitchConfigUtil.ENABLE_FALCO_ID, "true");
        this.enableFalcoId = "true".equalsIgnoreCase(configItemByKey12);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setFalcoIdEnable]remote falcoIdConfig=" + configItemByKey12 + ",enable=" + this.enableFalcoId);
        }
        String configItemByKey13 = getConfigItemByKey(SwitchConfigUtil.ADD_REFERER, "true");
        this.addRefererField = "true".equalsIgnoreCase(configItemByKey13);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[addReferer]remote addRefererField=" + configItemByKey13 + ",addRefererField=" + this.addRefererField);
        }
        String configItemByKey14 = getConfigItemByKey(SwitchConfigUtil.ENABLE_EXTDATA_ALIGIN_IOS, "true");
        if (StringUtils.isNotBlank(configItemByKey14)) {
            this.enableExtDataAlignIos = "true".equalsIgnoreCase(configItemByKey14);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[setExtTypeAlignIosConfig]remote extTypeAlignIosConfig=" + configItemByKey14 + ",enable=" + this.enableExtDataAlignIos);
            }
            try {
                Mtop instance2 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance2.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance2.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ENABLE_EXTDATA_ALIGIN_IOS, configItemByKey14);
                } else {
                    TBSdkLog.e(TAG, "[extTypeAlignIosConfig]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused2) {
                configItemByKey14 = "[extTypeAlignIosConfig]parse useSecAdapterConfig error,extTypeAlignIosConfig=" + configItemByKey14;
                TBSdkLog.e(TAG, configItemByKey14);
            }
        }
        try {
            Mtop instance3 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance3.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance3.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.OPEN_PREFETCH, configItemByKey10);
            } else {
                TBSdkLog.e(TAG, "[prefetch]context can't be null.wait INNER mtopInstance init.");
            }
        } catch (Exception unused3) {
            TBSdkLog.e(TAG, "[prefetch]parse useSecAdapterConfig error,openPrefetchConfig=" + configItemByKey10);
        }
        String configItemByKey15 = getConfigItemByKey(SwitchConfigUtil.PROCESS_BG_METHOD, "");
        if (StringUtils.isNotBlank(configItemByKey15)) {
            this.processBgMethodNew = "true".equalsIgnoreCase(configItemByKey15);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[setPrefetch]remote openPrefetchConfig=" + configItemByKey10 + ",prefetch=" + this.prefetch);
            }
            try {
                Mtop instance4 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance4.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance4.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.PROCESS_BG_METHOD, configItemByKey15);
                } else {
                    TBSdkLog.e(TAG, "[processBgMethodNew]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused4) {
                TBSdkLog.e(TAG, "[processBgMethodNew]parse processBgMethodNewConfig error,processBgMethodNewConfig=" + configItemByKey15);
            }
        }
        String configItemByKey16 = getConfigItemByKey(SwitchConfigUtil.ENABLE_CHANNEL_LAZY, "");
        if (StringUtils.isNotBlank(configItemByKey16)) {
            this.enableChannelLazy = "true".equalsIgnoreCase(configItemByKey16);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[setChannelLazyConfig]remote channelLazyConfig=" + configItemByKey16 + ",enable=" + this.enableChannelLazy);
            }
            try {
                Mtop instance5 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance5.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance5.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ENABLE_CHANNEL_LAZY, configItemByKey16);
                } else {
                    TBSdkLog.e(TAG, "[enableChannelLazy]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused5) {
                configItemByKey16 = "[enableChannelLazy]parse channelLazyConfig error,channelLazyConfig=" + configItemByKey16;
                TBSdkLog.e(TAG, configItemByKey16);
            }
        }
        String configItemByKey17 = getConfigItemByKey(SwitchConfigUtil.ANTI_ATTACK_WAIT_INTERVAL_KEY, null);
        if (StringUtils.isNotBlank(configItemByKey17)) {
            try {
                this.antiAttackWaitInterval = Long.parseLong(configItemByKey17);
            } catch (Exception unused6) {
                TBSdkLog.e(TAG, "[setAntiAttackWaitInterval]parse antiAttackWaitIntervalConfig error,antiAttackWaitIntervalConfig=" + configItemByKey17);
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setAntiAttackWaitInterval]remote antiAttackWaitIntervalConfig=" + configItemByKey17 + ",antiAttackWaitInterval=" + this.antiAttackWaitInterval);
        }
        String configItemByKey18 = getConfigItemByKey(SwitchConfigUtil.BIZ_ERROR_MAPPING_CODE_LENGTH_KEY, null);
        if (StringUtils.isNotBlank(configItemByKey18)) {
            try {
                this.bizErrorMappingCodeLength = Long.parseLong(configItemByKey18);
            } catch (Exception unused7) {
                TBSdkLog.e(TAG, "[setBizErrorMappingCodeLength]parse bizErrorMappingCodeLengthConfig error,bizErrorMappingCodeLengthConfig=" + configItemByKey18);
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setBizErrorMappingCodeLength]remote bizErrorMappingCodeLengthConfig=" + configItemByKey18 + ",bizErrorMappingCodeLength=" + this.bizErrorMappingCodeLength);
        }
        String configItemByKey19 = getConfigItemByKey(SwitchConfigUtil.UNIT_CALIBRATION_TTL, null);
        if (StringUtils.isNotBlank(configItemByKey19)) {
            try {
                this.unitCalibrationTTL = Long.parseLong(configItemByKey19);
            } catch (Exception unused8) {
                TBSdkLog.e(TAG, "[setUnitConfigTTL]parse unitConfigTTL error, unitCalibrationTTL=" + configItemByKey19);
            }
        }
        this.individualApiLockInterval = getConfigItemByKey(SwitchConfigUtil.INDIVIDUAL_API_LOCK_INTERVAL_KEY, "");
        this.degradeApiCacheList = getConfigItemByKey(SwitchConfigUtil.DEGRADE_API_CACHE_LIST_KEY, "");
        this.removeCacheBlockList = getConfigItemByKey(SwitchConfigUtil.REMOVE_CACHE_BLOCK_LIST_KEY, "");
        this.degradeBizErrorMappingApiList = getConfigItemByKey(SwitchConfigUtil.DEGRADE_BIZ_ERROR_MAPPING_API_LIST_KEY, "");
        this.errorMappingMsg = getConfigItemByKey(SwitchConfigUtil.ERROR_MAPPING_MSG_KEY, "");
        String configItemByKey20 = getConfigItemByKey(SwitchConfigUtil.ENABLE_LONG_PARAM_OPTIMIZE, "");
        if (StringUtils.isNotBlank(configItemByKey20)) {
            try {
                boolean parseBoolean = Boolean.parseBoolean(configItemByKey20);
                if (parseBoolean != this.enableLongParamOptimize) {
                    this.enableLongParamOptimize = parseBoolean;
                    Mtop instance6 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                    if (instance6.getMtopConfig().context != null) {
                        ConfigStoreManager.getInstance().saveConfigItem(instance6.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ENABLE_LONG_PARAM_OPTIMIZE, configItemByKey20);
                    } else {
                        TBSdkLog.e(TAG, "[setEnableLongParamOptimize]context can't be null.wait INNER mtopInstance init.");
                    }
                }
            } catch (Exception unused9) {
                TBSdkLog.e(TAG, "[setEnableLongParamOptimize]parse enableLongParamOptimizeConfig error,enableLongParamOptimizeConfig=" + configItemByKey20);
            }
        }
        String configItemByKey21 = getConfigItemByKey(SwitchConfigUtil.ALLOW_SWITCH_TO_POST_API_LIST_KEY, "");
        if (StringUtils.isNotBlank(configItemByKey21) && !configItemByKey21.equals(this.allowSwitchToPostApiList)) {
            this.allowSwitchToPostApiList = configItemByKey21;
            Mtop instance7 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance7.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance7.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ALLOW_SWITCH_TO_POST_API_LIST_KEY, this.allowSwitchToPostApiList);
            } else {
                TBSdkLog.e(TAG, "[setAllowSwitchToPostApiList]context can't be null.wait INNER mtopInstance init.");
            }
        }
        String configItemByKey22 = getConfigItemByKey(SwitchConfigUtil.PREFETCH_EXPIRED_TIME_API_LIST_KEY, "");
        if (StringUtils.isNotBlank(configItemByKey22) && !configItemByKey22.equals(this.allowCustomPrefetchExpiredTimeApiList)) {
            this.allowCustomPrefetchExpiredTimeApiList = configItemByKey22;
            Mtop instance8 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance8.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance8.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.PREFETCH_EXPIRED_TIME_API_LIST_KEY, this.allowCustomPrefetchExpiredTimeApiList);
            } else {
                TBSdkLog.e(TAG, "[allowCustomPrefetchExpiredTimeApiList]context can't be null.wait INNER mtopInstance init.");
            }
        }
        String configItemByKey23 = getConfigItemByKey(SwitchConfigUtil.ALLOW_PAGE_URL_CUT_API_LIST_KEY, "");
        if (StringUtils.isNotBlank(configItemByKey23) && !configItemByKey23.equals(this.allowPageUrlCutApiList)) {
            this.allowPageUrlCutApiList = configItemByKey23;
            Mtop instance9 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance9.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance9.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ALLOW_PAGE_URL_CUT_API_LIST_KEY, this.allowPageUrlCutApiList);
            } else {
                TBSdkLog.e(TAG, "[setAllowPageUrlCutApiList]context can't be null.wait INNER mtopInstance init.");
            }
        }
        String configItemByKey24 = getConfigItemByKey(SwitchConfigUtil.ALLOW_REFERER_CUT_API_LIST_KEY, "");
        if (StringUtils.isNotBlank(configItemByKey24) && !configItemByKey24.equals(this.allowRefererCutApiList)) {
            this.allowRefererCutApiList = configItemByKey24;
            Mtop instance10 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance10.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance10.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ALLOW_REFERER_CUT_API_LIST_KEY, this.allowRefererCutApiList);
            } else {
                TBSdkLog.e(TAG, "[setAllowRefererCutApiList]context can't be null.wait INNER mtopInstance init.");
            }
        }
        String configItemByKey25 = getConfigItemByKey(SwitchConfigUtil.SWITCH_TO_POST_THRESHOLD, "");
        if (StringUtils.isNotBlank(configItemByKey25)) {
            try {
                long parseLong = Long.parseLong(configItemByKey25);
                if (parseLong > 0 && parseLong != this.switchToPostThreshold) {
                    this.switchToPostThreshold = parseLong;
                }
                Mtop instance11 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance11.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance11.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.SWITCH_TO_POST_THRESHOLD, configItemByKey25);
                } else {
                    TBSdkLog.e(TAG, "[setSwitchToPostThreshold]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused10) {
                TBSdkLog.e(TAG, "[setSwitchToPostThreshold]parse switchToPostThresholdConfig error,switchToPostThresholdConfig=" + configItemByKey25);
            }
        }
        String configItemByKey26 = getConfigItemByKey(SwitchConfigUtil.SIGN_DEGRADED_API_LIST, "");
        if (StringUtils.isNotBlank(configItemByKey26) && !configItemByKey26.equals(this.signDegradedApiList)) {
            this.signDegradedApiList = configItemByKey26;
            Mtop instance12 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance12.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance12.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.SIGN_DEGRADED_API_LIST, this.signDegradedApiList);
            } else {
                TBSdkLog.e(TAG, "[setSignDegradedApiList]context can't be null.wait INNER mtopInstance init.");
            }
        }
        String configItemByKey27 = getConfigItemByKey(SwitchConfigUtil.SIGN_DEGRADED_API_LIST2, "");
        if (StringUtils.isNotBlank(configItemByKey27) && !configItemByKey27.equals(this.signDegradedApiList2)) {
            this.signDegradedApiList2 = configItemByKey27;
            Mtop instance13 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance13.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance13.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.SIGN_DEGRADED_API_LIST2, this.signDegradedApiList2);
            } else {
                TBSdkLog.e(TAG, "[setSignDegradedApiList2]context can't be null.wait INNER mtopInstance init.");
            }
        }
        String configItemByKey28 = getConfigItemByKey(SwitchConfigUtil.JS_BRIDGE_TIMEOUT_API_LIST, "");
        if (StringUtils.isNotBlank(configItemByKey28) && !configItemByKey28.equals(this.jsBridgeTimeoutApiList)) {
            this.jsBridgeTimeoutApiList = configItemByKey28;
            Mtop instance14 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance14.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance14.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.JS_BRIDGE_TIMEOUT_API_LIST, this.jsBridgeTimeoutApiList);
            } else {
                TBSdkLog.e(TAG, "[setJsBridgeTimeoutApiList]context can't be null.wait INNER mtopInstance init.");
            }
        }
        String configItemByKey29 = getConfigItemByKey(SwitchConfigUtil.SUPPORT_ZSTD_API_LIST, "");
        if (StringUtils.isNotBlank(configItemByKey29) && !configItemByKey29.equals(this.supportZstdApiList)) {
            this.supportZstdApiList = configItemByKey29;
            Mtop instance15 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance15.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance15.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.SUPPORT_ZSTD_API_LIST, this.supportZstdApiList);
            } else {
                TBSdkLog.e(TAG, "[setSupportZstdApiList]context can't be null.wait INNER mtopInstance init.");
            }
        }
        String configItemByKey30 = getConfigItemByKey(SwitchConfigUtil.COOKIE_DISABLE_API_LIST, "");
        if (StringUtils.isNotBlank(configItemByKey30) && !configItemByKey30.equals(this.cookieDisableApiList)) {
            this.cookieDisableApiList = configItemByKey30;
            Mtop instance16 = Mtop.instance(Mtop.Id.INNER, (Context) null);
            if (instance16.getMtopConfig().context != null) {
                ConfigStoreManager.getInstance().saveConfigItem(instance16.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.COOKIE_DISABLE_API_LIST, this.cookieDisableApiList);
            } else {
                TBSdkLog.e(TAG, "[cookieDisableApiListConfig]context can't be null.wait INNER mtopInstance init.");
            }
        }
        String configItemByKey31 = getConfigItemByKey(SwitchConfigUtil.ALLOW_REMOVE_DEVICE_INFO, "");
        if (StringUtils.isNotBlank(configItemByKey31)) {
            try {
                this.removeDeviceInfo = Boolean.parseBoolean(configItemByKey31);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, "[allowRemoveDeviceInfo]remote allowRemoveDeviceInfo=" + configItemByKey31 + ",allow=" + this.removeDeviceInfo);
                }
                Mtop instance17 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance17.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance17.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ALLOW_REMOVE_DEVICE_INFO, configItemByKey31);
                } else {
                    TBSdkLog.e(TAG, "[setRemoveDeviceInfo]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused11) {
                TBSdkLog.e(TAG, "[setRemoveDeviceInfo]parse removeDeviceInfoStr error, removeDeviceInfoStr=" + configItemByKey31);
            }
        }
        String configItemByKey32 = getConfigItemByKey(SwitchConfigUtil.ALLOW_REMOVE_WIFI_INFO, "");
        if (StringUtils.isNotBlank(configItemByKey32)) {
            try {
                this.removeWifiInfo = Boolean.parseBoolean(configItemByKey32);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, "[removeWifiInfo]remote removeWifiInfo=" + configItemByKey32 + ",allow=" + this.removeWifiInfo);
                }
                Mtop instance18 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance18.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance18.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ALLOW_REMOVE_WIFI_INFO, configItemByKey32);
                } else {
                    TBSdkLog.e(TAG, "[removeWifiInfo]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused12) {
                TBSdkLog.e(TAG, "[removeWifiInfo]parse removeWifiInfoStr error, removeWifiInfoStr=" + configItemByKey32);
            }
        }
        String configItemByKey33 = getConfigItemByKey(SwitchConfigUtil.OPT_H5_LOGIN_TIMEOUT, "");
        if (StringUtils.isNotBlank(configItemByKey33)) {
            try {
                this.optH5LoginTimeout = Boolean.parseBoolean(configItemByKey33);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, "[optH5LoginTimeout]remote optH5LoginTimeout=" + configItemByKey33 + ",allow=" + this.optH5LoginTimeout);
                }
                Mtop instance19 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance19.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance19.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.OPT_H5_LOGIN_TIMEOUT, configItemByKey33);
                } else {
                    TBSdkLog.e(TAG, "[optH5LoginTimeout]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused13) {
                TBSdkLog.e(TAG, "[optH5LoginTimeout]parse optH5LoginTimeoutStr error, optH5LoginTimeoutStr=" + configItemByKey33);
            }
        }
        String configItemByKey34 = getConfigItemByKey(SwitchConfigUtil.ADD_DEVICE_TYPE, "");
        if (StringUtils.isNotBlank(configItemByKey34)) {
            try {
                this.uaAddDeviceType = Boolean.parseBoolean(configItemByKey34);
                Mtop instance20 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance20.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance20.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ADD_DEVICE_TYPE, configItemByKey34);
                } else {
                    TBSdkLog.e(TAG, "[uaAddDeviceType]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused14) {
                TBSdkLog.e(TAG, "[uaAddDeviceType]parse uaAddDeviceType error, uaAddDeviceTypeStr=" + configItemByKey34);
            }
        }
        String configItemByKey35 = getConfigItemByKey(SwitchConfigUtil.UNIT_PROTECT_ENABLE, "");
        if (StringUtils.isNotBlank(configItemByKey35)) {
            try {
                this.unitProtectEnable = Boolean.parseBoolean(configItemByKey35);
                Mtop instance21 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance21.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance21.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.UNIT_PROTECT_ENABLE, configItemByKey35);
                } else {
                    TBSdkLog.e(TAG, "[unitProtectEnable]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused15) {
                TBSdkLog.e(TAG, "[unitProtectEnable]parse unitProtectEnable error, unitProtectEnableStr=" + configItemByKey35);
            }
        }
        String configItemByKey36 = getConfigItemByKey(SwitchConfigUtil.DYNAMIC_INJECT_MTOP_INSTANCE, "");
        if (StringUtils.isNotBlank(configItemByKey36)) {
            try {
                this.dynamicInjectMtopInstance = Boolean.parseBoolean(configItemByKey36);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, "[dynamicInjectMtopInstance]remote dynamicInjectMtopInstance=" + configItemByKey36 + ",allow=" + this.dynamicInjectMtopInstance);
                }
                Mtop instance22 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance22.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance22.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.DYNAMIC_INJECT_MTOP_INSTANCE, configItemByKey36);
                } else {
                    TBSdkLog.e(TAG, "[dynamicInjectMtopInstanceStr]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused16) {
                TBSdkLog.e(TAG, "[dynamicInjectMtopInstanceStr]parse dynamicInjectMtopInstanceStr error, dynamicInjectMtopInstanceStr=" + configItemByKey36);
            }
        }
        String configItemByKey37 = getConfigItemByKey(SwitchConfigUtil.FETCH_REMOTE_MTOP_INSTANCE, "");
        if (StringUtils.isNotBlank(configItemByKey37)) {
            try {
                this.fetchRemoteMtopInstance = Boolean.parseBoolean(configItemByKey37);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, "[fetchRemoteMtopInstance]remote fetchRemoteMtopInstance=" + configItemByKey37 + ",allow=" + this.fetchRemoteMtopInstance);
                }
                Mtop instance23 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance23.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance23.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.FETCH_REMOTE_MTOP_INSTANCE, configItemByKey37);
                } else {
                    TBSdkLog.e(TAG, "[fetchRemoteMtopInstanceStr]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused17) {
                TBSdkLog.e(TAG, "[fetchRemoteMtopInstanceStr]parse fetchRemoteMtopInstanceStr error, fetchRemoteMtopInstanceStr=" + configItemByKey37);
            }
        }
        String configItemByKey38 = getConfigItemByKey(SwitchConfigUtil.REMOVE_PRE_LIMIT_OF_LOGIN, "");
        if (StringUtils.isNotBlank(configItemByKey38)) {
            try {
                this.removePreLimitOfLogin = Boolean.parseBoolean(configItemByKey38);
            } catch (Exception unused18) {
                TBSdkLog.e(TAG, "[removePreLimitOfLoginStr]parse removePreLimitOfLoginStr error, removePreLimitOfLoginStr=" + configItemByKey38);
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[removePreLimitOfLogin]remote removePreLimitOfLogin=" + configItemByKey38 + ", remove=" + this.removePreLimitOfLogin);
        }
        String configItemByKey39 = getConfigItemByKey(SwitchConfigUtil.CHECK_LOGIN_STATUS, "");
        if (StringUtils.isNotBlank(configItemByKey39)) {
            try {
                this.checkLoginStatus = Boolean.parseBoolean(configItemByKey39);
            } catch (Exception unused19) {
                TBSdkLog.e(TAG, "[checkLoginStatusStr]parse checkLoginStatusStr error, checkLoginStatusStr=" + configItemByKey39);
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[checkLoginStatusStr]remote checkLoginStatusStr=" + configItemByKey39 + ", remove=" + this.checkLoginStatus);
        }
        String configItemByKey40 = getConfigItemByKey(SwitchConfigUtil.HEADER_CUT_THRESHOLD, "");
        if (StringUtils.isNotBlank(configItemByKey40)) {
            try {
                int parseInt = Integer.parseInt(configItemByKey40);
                if (parseInt > 0 && parseInt != this.headerCutThreshold) {
                    this.headerCutThreshold = parseInt;
                }
                Mtop instance24 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance24.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance24.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.HEADER_CUT_THRESHOLD, configItemByKey40);
                } else {
                    TBSdkLog.e(TAG, "[setHeaderCutThreshold]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused20) {
                TBSdkLog.e(TAG, "[setHeaderCutThreshold]parse headerCutThresholdConfig error,headerCutThresholdConfig=" + configItemByKey40);
            }
        }
        String configItemByKey41 = getConfigItemByKey(SwitchConfigUtil.USE_SECURITY_ADAPTER, "");
        if (StringUtils.isNotBlank(configItemByKey41)) {
            try {
                int parseInt2 = Integer.parseInt(configItemByKey41);
                if (parseInt2 != this.useSecurityAdapter) {
                    this.useSecurityAdapter = parseInt2;
                    Mtop instance25 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                    if (instance25.getMtopConfig().context != null) {
                        ConfigStoreManager.getInstance().saveConfigItem(instance25.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.USE_SECURITY_ADAPTER, configItemByKey41);
                    } else {
                        TBSdkLog.e(TAG, "[useSecurityAdapter]context can't be null.wait INNER mtopInstance init.");
                    }
                }
            } catch (Exception unused21) {
                TBSdkLog.e(TAG, "[useSecurityAdapter]parse useSecAdapterConfig error,useSecAdapterConfig=" + configItemByKey41);
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[useSecurityAdapter]remote useSecurityAdapterSwitchConfig=" + configItemByKey41 + ",useSecurityAdapter=" + this.useSecurityAdapter);
        }
        String configItemByKey42 = getConfigItemByKey("responseHeader", "");
        if (StringUtils.isNotBlank(configItemByKey42)) {
            try {
                boolean equalsIgnoreCase = "true".equalsIgnoreCase(configItemByKey42);
                if (equalsIgnoreCase != this.responseHeader) {
                    this.responseHeader = equalsIgnoreCase;
                    Mtop instance26 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                    if (instance26.getMtopConfig().context != null) {
                        ConfigStoreManager.getInstance().saveConfigItem(instance26.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", "responseHeader", configItemByKey42);
                    } else {
                        TBSdkLog.e(TAG, "[responseHeader]context can't be null.wait INNER mtopInstance init.");
                    }
                }
            } catch (Throwable unused22) {
                TBSdkLog.e(TAG, "[responseHeader]parse responseHeader error,responseHeaderConfig=" + configItemByKey42);
            }
        }
        String configItemByKey43 = getConfigItemByKey(SwitchConfigUtil.WIDGET_USE_LOCAL_DATA, "");
        if (StringUtils.isNotBlank(configItemByKey43)) {
            this.isWidgetUseLocalData = "true".equalsIgnoreCase(configItemByKey43);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[setWidgetUseLocalData]remote isWidgetUseLocalData=" + configItemByKey43 + ",enable=" + this.isWidgetUseLocalData);
            }
            try {
                Mtop instance27 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance27.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance27.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.WIDGET_USE_LOCAL_DATA, configItemByKey43);
                } else {
                    TBSdkLog.e(TAG, "[setWidgetUseLocalData]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused23) {
                configItemByKey43 = "[setWidgetUseLocalData]parse setWidgetUseLocalData error,setWidgetUseLocalData=" + configItemByKey43;
                TBSdkLog.e(TAG, configItemByKey43);
            }
        }
        String configItemByKey44 = getConfigItemByKey(SwitchConfigUtil.SSR_SUPPORT_ZSTD, "");
        if (StringUtils.isNotBlank(configItemByKey44)) {
            this.ssrSupportZstd = "true".equalsIgnoreCase(configItemByKey44);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[ssrSupportZstdStr]remote ssrSupportZstdStr=" + configItemByKey44 + ",enable=" + this.ssrSupportZstd);
            }
            try {
                Mtop instance28 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance28.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance28.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.SSR_SUPPORT_ZSTD, configItemByKey44);
                } else {
                    TBSdkLog.e(TAG, "[ssrSupportZstdStr]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused24) {
                configItemByKey44 = "[ssrSupportZstdStr]parse ssrSupportZstdStr error,ssrSupportZstdStr=" + configItemByKey44;
                TBSdkLog.e(TAG, configItemByKey44);
            }
        }
        String configItemByKey45 = getConfigItemByKey(SwitchConfigUtil.UNIT_CALIBRATION_ENABLE, "");
        if (StringUtils.isNotBlank(configItemByKey45)) {
            this.unitCalibrationEnable = "true".equalsIgnoreCase(configItemByKey45);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[unitCalibrationEnable]remote unitCalibrationEnableStr=" + configItemByKey45 + ",enable=" + this.unitCalibrationEnable);
            }
            try {
                Mtop instance29 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance29.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance29.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.UNIT_CALIBRATION_ENABLE, configItemByKey45);
                } else {
                    TBSdkLog.e(TAG, "[unitCalibrationEnable]context can't be null.wait INNER mtopInstance init.");
                }
            } catch (Exception unused25) {
                TBSdkLog.e(TAG, "[unitCalibrationEnable]parse unitCalibrationEnable error,unitCalibrationEnable=" + configItemByKey45);
            }
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("[setOtherConfigItemKey] individualApiLockInterval =");
        sb.append(this.individualApiLockInterval);
        sb.append(", degradeApiCacheList =");
        sb.append(this.degradeApiCacheList);
        sb.append(", removeCacheBlockList =");
        sb.append(this.removeCacheBlockList);
        sb.append(", degradeBizErrorMappingApiList =");
        sb.append(this.degradeBizErrorMappingApiList);
        sb.append(", errorMappingMsg =");
        sb.append(this.errorMappingMsg);
        TBSdkLog.i(TAG, sb.toString());
    }

    public void updateUploadRemoteConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a623b3f9", new Object[]{this});
            return;
        }
        Map<String, String> switchConfigByGroupName = SwitchConfigUtil.getSwitchConfigByGroupName(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[updateUploadRemoteConfig] uploadConfigItemsMap=" + switchConfigByGroupName);
        }
        if (switchConfigByGroupName == null) {
            return;
        }
        String str = switchConfigByGroupName.get(SwitchConfigUtil.SEGMENT_RETRY_TIMES_KEY);
        if (StringUtils.isNotBlank(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    this.segmentRetryTimes = parseInt;
                }
            } catch (Exception unused) {
                TBSdkLog.w(TAG, "[updateUploadRemoteConfig]parse segmentRetryTimes error,segmentRetryTimesStr=" + str);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[updateUploadRemoteConfig]remote segmentRetryTimesStr=" + str + ",segmentRetryTimes=" + this.segmentRetryTimes);
            }
        }
        String str2 = switchConfigByGroupName.get(SwitchConfigUtil.UPLOAD_THREAD_NUMS_KEY);
        if (!StringUtils.isNotBlank(str)) {
            return;
        }
        try {
            int parseInt2 = Integer.parseInt(str2);
            if (parseInt2 >= 0) {
                this.uploadThreadNums = parseInt2;
            }
        } catch (Exception unused2) {
            TBSdkLog.w(TAG, "[updateUploadRemoteConfig]parse uploadThreadNums error,uploadThreadNumsStr=" + str2);
        }
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, "[updateUploadRemoteConfig]remote uploadThreadNumsStr=" + str2 + ",uploadThreadNums=" + this.uploadThreadNums);
    }

    private String getConfigItemByKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1f3faa8", new Object[]{this, str, str2});
        }
        String str3 = null;
        try {
            if (this.configItemsMap != null) {
                str3 = this.configItemsMap.get(str);
            }
        } catch (Exception e) {
            TBSdkLog.w(TAG, "[getConfigItemByKey] get config item error; key=" + str, e);
        }
        return str3 == null ? str2 : str3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:6|7)|(35:8|9|(2:11|(1:13))|14|(2:16|(1:18))|19|(2:21|(1:23))|24|25|(2:27|(1:29))|30|(2:32|(1:34))|35|(2:37|(1:39))|40|(2:42|(1:44))|45|46|(2:48|(1:50))|51|(2:53|(1:55))|56|(2:58|(1:60))|61|(2:63|(1:65))|66|(2:68|(1:70))|71|(2:73|(1:75))|76|(2:78|(1:80))|81|(2:83|(1:85))|86|(2:88|(1:90)))|92|93|(1:95)|96|(1:98)|99|(1:101)|102|(1:104)|106|107) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04b5, code lost:
        mtopsdk.common.util.TBSdkLog.e(mtopsdk.common.util.RemoteConfig.TAG, "[loadLocalConfig]parse local long_param_optimize error.");
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0422 A[Catch: Throwable -> 0x04b5, TryCatch #2 {Throwable -> 0x04b5, blocks: (B:92:0x03e3, B:94:0x03f4, B:95:0x03fa, B:97:0x040b, B:98:0x0411, B:100:0x0422, B:101:0x0428, B:103:0x0462), top: B:113:0x03e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0462 A[Catch: Throwable -> 0x04b5, TRY_LEAVE, TryCatch #2 {Throwable -> 0x04b5, blocks: (B:92:0x03e3, B:94:0x03f4, B:95:0x03fa, B:97:0x040b, B:98:0x0411, B:100:0x0422, B:101:0x0428, B:103:0x0462), top: B:113:0x03e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03f4 A[Catch: Throwable -> 0x04b5, TryCatch #2 {Throwable -> 0x04b5, blocks: (B:92:0x03e3, B:94:0x03f4, B:95:0x03fa, B:97:0x040b, B:98:0x0411, B:100:0x0422, B:101:0x0428, B:103:0x0462), top: B:113:0x03e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x040b A[Catch: Throwable -> 0x04b5, TryCatch #2 {Throwable -> 0x04b5, blocks: (B:92:0x03e3, B:94:0x03f4, B:95:0x03fa, B:97:0x040b, B:98:0x0411, B:100:0x0422, B:101:0x0428, B:103:0x0462), top: B:113:0x03e3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadLocalConfig(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.RemoteConfig.loadLocalConfig(android.content.Context):void");
    }

    public void loadLocalChannelLazyConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d8840d", new Object[]{this, context});
            return;
        }
        String configItem = ConfigStoreManager.getInstance().getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ENABLE_CHANNEL_LAZY);
        if (!StringUtils.isNotBlank(configItem)) {
            return;
        }
        this.enableChannelLazy = "true".equalsIgnoreCase(configItem);
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, "[setChannelLazyConfig]remote channelLazyConfig=" + configItem + ",enable=" + this.enableChannelLazy);
    }

    public void loadLocalWidgetConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a16a396", new Object[]{this, context});
            return;
        }
        String configItem = ConfigStoreManager.getInstance().getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.WIDGET_USE_LOCAL_DATA);
        if (!StringUtils.isNotBlank(configItem)) {
            return;
        }
        this.isWidgetUseLocalData = "true".equalsIgnoreCase(configItem);
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i(TAG, "[isWidgetUseLocalData]remote isWidgetUseLocalDataStr=" + configItem + ",isWidgetUseLocalData=" + this.isWidgetUseLocalData);
    }

    public void loadLocalUserAgentConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8471b8a", new Object[]{this, context});
            return;
        }
        String configItem = ConfigStoreManager.getInstance().getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ADD_DEVICE_TYPE);
        if (!StringUtils.isNotBlank(configItem)) {
            return;
        }
        this.uaAddDeviceType = Boolean.parseBoolean(configItem);
    }
}
