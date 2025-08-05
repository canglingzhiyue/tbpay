package mtopsdk.mtop.global;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.LocalConfig;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;
import tb.rxe;
import tb.ryy;

/* loaded from: classes.dex */
public class SwitchConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AB_CANCEL_CONN_READ_TIMEOUT = "mtop_cancel_conn_read_timeout";
    public static final String AB_JSON1_ENABLE = "mtop_fast_json_1";
    public static final String AB_JSON2_ENABLE = "mtop_fast_json_2";
    public static final String AB_JS_TIMEOUT = "mtop_js_bridge_timeout";
    public static final String AB_OPT_STREAM_PARSED = "mtop_opt_stream_parse_v2";
    public static final String AB_OPT_THREAD = "mtop_opt_thread";
    public static final String AB_PREFETCH_LOCAL_MODE = "mtop_prefetch_local_mode_close";
    public static final String AB_SIGN_DEGRADED = "mtop_sign_degraded";
    public static final String AB_STREAM_JSON_ENABLE = "mtop_stream_json";
    public static final String AB_STREAM_JSON_OBJECT_ENABLE = "mtop_stream_json_parse_object";
    public static final String AB_WAIT_MAIN_THREAD = "wait_main_thread";
    private static final String TAG = "mtopsdk.SwitchConfig";
    private static Class abGlobalClazz;
    public static final HashSet<String> authErrorCodeSet;
    private static final SwitchConfig config;
    public static final Map<String, String> errorMappingMsgMap;
    private static volatile Map<String, String> individualApiLockIntervalMap;
    private static Method isABFeatureOpened;
    private static final LocalConfig localConfig;
    private static rxe mtopConfigListener;
    private static final RemoteConfig remoteConfig;
    public volatile Set<String> degradeApiCacheSet = null;
    public volatile Set<String> degradeBizErrorMappingApiSet = null;
    public volatile Set<String> allowSwitchToPostApiSet = null;
    public volatile Set<String> allowPageUrlCutApiSet = null;
    public volatile Set<String> allowRefererCutApiSet = null;
    public volatile Set<String> allowCustomPrefetchExpireTimeApiSet = null;
    private boolean enablePrefetchIgnore = false;
    private boolean enableSignDegraded = false;
    public volatile Set<String> signDegradedApiSet = null;
    public volatile Set<ryy> signDegradedApiSet2 = null;
    private boolean enableJsBridgeTimeout = false;
    private boolean cancelDefaultConnTimeout = false;
    private boolean supportZstd = true;
    private boolean optThreadAliveTime = false;
    private boolean optStreamParse = false;
    private boolean streamJsonEnable = false;
    private boolean streamJsonParseObjectEnable = false;
    private boolean fastJson1Enable = false;
    private boolean fastJson2Enable = false;
    private boolean unitProtectCheckEnable = true;
    private boolean prefetchLocalMode = true;
    public volatile Set<String> jsBridgeTimeoutApiSet = null;
    public volatile Set<String> supportZstdApiSet = new HashSet();
    public volatile Set<String> cookieDisableApiSet = null;
    public volatile boolean waitMainThread = false;

    public boolean isSimpleLinkEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c710c", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(293713368);
        config = new SwitchConfig();
        remoteConfig = RemoteConfig.getInstance();
        localConfig = LocalConfig.getInstance();
        mtopConfigListener = null;
        individualApiLockIntervalMap = new ConcurrentHashMap(8);
        errorMappingMsgMap = new ConcurrentHashMap(8);
        authErrorCodeSet = new HashSet<>(8);
        errorMappingMsgMap.put(ErrorConstant.ErrorMappingType.NETWORK_ERROR_MAPPING, ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
        errorMappingMsgMap.put(ErrorConstant.ErrorMappingType.FLOW_LIMIT_ERROR_MAPPING, ErrorConstant.MappingMsg.FLOW_LIMIT_MAPPING_MSG);
        errorMappingMsgMap.put(ErrorConstant.ErrorMappingType.SERVICE_ERROR_MAPPING, ErrorConstant.MappingMsg.SERVICE_MAPPING_MSG);
        authErrorCodeSet.add(ErrorConstant.ERRCODE_FAIL_SYS_ACCESS_TOKEN_EXPIRED);
        authErrorCodeSet.add(ErrorConstant.ERRCODE_FAIL_SYS_ILLEGAL_ACCESS_TOKEN);
        try {
            Class<?> cls = Class.forName("com.taobao.android.ab.api.ABGlobal");
            abGlobalClazz = cls;
            isABFeatureOpened = cls.getMethod("isFeatureOpened", Context.class, String.class);
        } catch (Throwable unused) {
        }
    }

    private SwitchConfig() {
        this.supportZstdApiSet.add("*");
    }

    public static SwitchConfig getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SwitchConfig) ipChange.ipc$dispatch("1af9ed5b", new Object[0]) : config;
    }

    public void initConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67001ef", new Object[]{this, context});
            return;
        }
        rxe rxeVar = mtopConfigListener;
        if (rxeVar != null) {
            rxeVar.a(context);
        }
        initABGlobal(context);
    }

    private void initABGlobal(Context context) {
        try {
            boolean z = false;
            this.enablePrefetchIgnore = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, RemoteConfig.TB_IGNORE_PREFETCH)).booleanValue();
            this.enableSignDegraded = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_SIGN_DEGRADED)).booleanValue();
            this.enableJsBridgeTimeout = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_JS_TIMEOUT)).booleanValue();
            this.cancelDefaultConnTimeout = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_CANCEL_CONN_READ_TIMEOUT)).booleanValue();
            this.optThreadAliveTime = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_OPT_THREAD)).booleanValue();
            this.optStreamParse = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_OPT_STREAM_PARSED)).booleanValue();
            this.streamJsonEnable = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_STREAM_JSON_ENABLE)).booleanValue();
            this.streamJsonParseObjectEnable = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_STREAM_JSON_OBJECT_ENABLE)).booleanValue();
            this.fastJson2Enable = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_JSON2_ENABLE)).booleanValue();
            this.fastJson1Enable = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_JSON1_ENABLE)).booleanValue();
            this.waitMainThread = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_WAIT_MAIN_THREAD)).booleanValue();
            if (!((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, AB_PREFETCH_LOCAL_MODE)).booleanValue()) {
                z = true;
            }
            this.prefetchLocalMode = z;
            TBSdkLog.e(TAG, "[initABGlobal]enablePrefetchIgnore = " + this.enablePrefetchIgnore + ", enableSignDegraded = " + this.enableSignDegraded + ", enableJsBridgeTimeout = " + this.enableJsBridgeTimeout + ", cancelDefaultConnTimeout = " + this.cancelDefaultConnTimeout + ", optThreadAliveTime = " + this.optThreadAliveTime + ", waitMainThread = " + this.waitMainThread + ", optStreamParse = " + this.optStreamParse + ", streamJsonEnable = " + this.streamJsonEnable + ", streamJsonParseObjectEnable = " + this.streamJsonParseObjectEnable + ", prefetchLocalMode = " + this.prefetchLocalMode);
        } catch (Throwable unused) {
        }
    }

    public boolean isABGlobalFeatureOpened(Context context, String str) {
        boolean z = false;
        try {
            z = ((Boolean) isABFeatureOpened.invoke(abGlobalClazz, context, str)).booleanValue();
            TBSdkLog.e(TAG, "[isABGlobalFeatureOpened] key = " + str + ", opened = " + z);
            return z;
        } catch (Throwable unused) {
            TBSdkLog.e(TAG, "[isABGlobalFeatureOpened] error key = " + str + ", opened = " + z);
            return z;
        }
    }

    public void setMtopConfigListener(rxe rxeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fad66b8", new Object[]{this, rxeVar});
        } else {
            mtopConfigListener = rxeVar;
        }
    }

    public static rxe getMtopConfigListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rxe) ipChange.ipc$dispatch("9072d4ac", new Object[0]) : mtopConfigListener;
    }

    public boolean isGlobalErrorCodeMappingOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a536627b", new Object[]{this})).booleanValue() : localConfig.enableErrorCodeMapping && remoteConfig.enableErrorCodeMapping;
    }

    public boolean isBizErrorCodeMappingOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b97c897", new Object[]{this})).booleanValue() : localConfig.enableBizErrorCodeMapping && remoteConfig.enableBizErrorCodeMapping;
    }

    public boolean isGlobalSpdySwitchOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f27191c8", new Object[]{this})).booleanValue() : localConfig.enableSpdy && remoteConfig.enableSpdy;
    }

    public SwitchConfig setGlobalSpdySwitchOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwitchConfig) ipChange.ipc$dispatch("c4612dd5", new Object[]{this, new Boolean(z)});
        }
        localConfig.enableSpdy = z;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setGlobalSpdySwitchOpen]set local spdySwitchOpen=" + z);
        }
        return this;
    }

    public boolean isGlobalSpdySslSwitchOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6dd7556", new Object[]{this})).booleanValue() : localConfig.enableSsl && remoteConfig.enableSsl;
    }

    public SwitchConfig setGlobalSpdySslSwitchOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwitchConfig) ipChange.ipc$dispatch("dc661073", new Object[]{this, new Boolean(z)});
        }
        localConfig.enableSsl = z;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setGlobalSpdySslSwitchOpen]set local spdySslSwitchOpen=" + z);
        }
        return this;
    }

    public long getGlobalApiLockInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b6d7a6c", new Object[]{this})).longValue() : remoteConfig.apiLockInterval;
    }

    public long getGlobalAttackAttackWaitInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d5a7ede", new Object[]{this})).longValue() : remoteConfig.antiAttackWaitInterval;
    }

    public long getGlobalBizErrorMappingCodeLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e9384cce", new Object[]{this})).longValue() : remoteConfig.bizErrorMappingCodeLength;
    }

    @Deprecated
    public boolean isGlobalUnitSwitchOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("80d1dc1a", new Object[]{this})).booleanValue() : localConfig.enableUnit && remoteConfig.enableUnit;
    }

    public boolean isGlobalCacheSwitchOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6474469e", new Object[]{this})).booleanValue() : remoteConfig.enableCache;
    }

    @Deprecated
    public SwitchConfig setGlobalUnitSwitchOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwitchConfig) ipChange.ipc$dispatch("539c63a7", new Object[]{this, new Boolean(z)});
        }
        localConfig.enableUnit = z;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setGlobalUnitSwitchOpen]set local unitSwitchOpen=" + z);
        }
        return this;
    }

    public boolean isMtopsdkPropertySwitchOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("75e37d66", new Object[]{this})).booleanValue() : localConfig.enableProperty && remoteConfig.enableProperty;
    }

    public SwitchConfig setMtopsdkPropertySwitchOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SwitchConfig) ipChange.ipc$dispatch("dc9e4283", new Object[]{this, new Boolean(z)});
        }
        localConfig.enableProperty = z;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[setMtopsdkPropertySwitchOpen]set local mtopsdkPropertySwitchOpen=" + z);
        }
        return this;
    }

    public Map<String, String> getIndividualApiLockIntervalMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ef90efdd", new Object[]{this}) : individualApiLockIntervalMap;
    }

    public long getIndividualApiLockInterval(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a83e2400", new Object[]{this, str})).longValue();
        }
        if (StringUtils.isBlank(str)) {
            return 0L;
        }
        String str2 = individualApiLockIntervalMap.get(str);
        if (StringUtils.isBlank(str2)) {
            return 0L;
        }
        try {
            return Long.parseLong(str2);
        } catch (Exception e) {
            TBSdkLog.e(TAG, "[getIndividualApiLockInterval]parse individual apiLock interval error.apiKey=" + str + " ---" + e.toString());
            return 0L;
        }
    }

    public int getUseSecurityAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59e276d8", new Object[]{this})).intValue() : remoteConfig.useSecurityAdapter;
    }

    public boolean getProcessBgMethodNew() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c68164c", new Object[]{this})).booleanValue() : remoteConfig.processBgMethodNew;
    }

    public boolean getEnableFullTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8809603", new Object[]{this})).booleanValue() : remoteConfig.enableFullTraceId;
    }

    public boolean getEnableFalcoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af99f78a", new Object[]{this})).booleanValue() : remoteConfig.enableFalcoId;
    }

    public boolean getEnableChannelLazy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("54ceba69", new Object[]{this})).booleanValue() : remoteConfig.enableChannelLazy;
    }

    public boolean isWidgetUseLocalData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c61c9a7", new Object[]{this})).booleanValue() : remoteConfig.isWidgetUseLocalData;
    }

    public boolean getEnableExtDataAlignIos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a65a325", new Object[]{this})).booleanValue() : remoteConfig.enableExtDataAlignIos;
    }

    public boolean getEnableResponseHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1f13e412", new Object[]{this})).booleanValue() : remoteConfig.responseHeader;
    }

    public boolean isEnablePrefetchIgnore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("103558e1", new Object[]{this})).booleanValue() : this.enablePrefetchIgnore;
    }

    public boolean isEnableLongParamOptimize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b369dac", new Object[]{this})).booleanValue() : remoteConfig.enableLongParamOptimize;
    }

    public long getSwitchToPostThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b23e46e1", new Object[]{this})).longValue() : remoteConfig.switchToPostThreshold;
    }

    public int getHeaderCutThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d6b07e6", new Object[]{this})).intValue() : remoteConfig.headerCutThreshold;
    }

    public boolean allowRemoveDeviceInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dad953c", new Object[]{this})).booleanValue() : remoteConfig.removeDeviceInfo;
    }

    public boolean dynamicInjectMtopInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb966b58", new Object[]{this})).booleanValue() : remoteConfig.dynamicInjectMtopInstance;
    }

    public boolean fetchRemoteMtopInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("874e7848", new Object[]{this})).booleanValue() : remoteConfig.fetchRemoteMtopInstance;
    }

    public boolean removePreLimitOfLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae823e41", new Object[]{this})).booleanValue() : remoteConfig.removePreLimitOfLogin;
    }

    public boolean checkLoginStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("62b3899e", new Object[]{this})).booleanValue() : remoteConfig.checkLoginStatus;
    }

    public boolean isEnableSignDegraded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8400083", new Object[]{this})).booleanValue() : this.enableSignDegraded;
    }

    public boolean isAddRefererField() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f37830f", new Object[]{this})).booleanValue() : remoteConfig.addRefererField;
    }

    public boolean isEnableJsBridgeTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cfcf74d", new Object[]{this})).booleanValue() : this.enableJsBridgeTimeout;
    }

    public boolean isCancelDefaultConnTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e633783", new Object[]{this})).booleanValue() : this.cancelDefaultConnTimeout;
    }

    public boolean isSupportZstd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18bdf1d9", new Object[]{this})).booleanValue() : this.supportZstd;
    }

    public boolean removeWifiInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("760ab712", new Object[]{this})).booleanValue() : remoteConfig.removeWifiInfo;
    }

    public boolean isOptThreadAliveTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b567a6f2", new Object[]{this})).booleanValue() : this.optThreadAliveTime;
    }

    public boolean isOptStreamParse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0754db5", new Object[]{this})).booleanValue() : this.optStreamParse;
    }

    public boolean isStreamJsonEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ddc4fb80", new Object[]{this})).booleanValue() : this.streamJsonEnable;
    }

    public boolean isStreamJsonParseObjectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("92cccfce", new Object[]{this})).booleanValue() : this.streamJsonParseObjectEnable;
    }

    public boolean isFastJson2Enable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("882acaf2", new Object[]{this})).booleanValue() : this.fastJson2Enable;
    }

    public boolean isFastJson1Enable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3461831", new Object[]{this})).booleanValue() : this.fastJson1Enable;
    }

    public boolean isOptH5LoginTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ba9c239", new Object[]{this})).booleanValue() : remoteConfig.optH5LoginTimeout;
    }

    public boolean uaAddDeviceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b5206510", new Object[]{this})).booleanValue() : remoteConfig.uaAddDeviceType;
    }

    public boolean isUnitProtectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69050c8f", new Object[]{this})).booleanValue() : remoteConfig.unitProtectEnable;
    }

    public boolean isSsrSupportZstd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e05e6bb", new Object[]{this})).booleanValue() : remoteConfig.ssrSupportZstd;
    }

    public boolean isUnitCalibrationEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ed6b0ea", new Object[]{this})).booleanValue() : remoteConfig.unitCalibrationEnable;
    }

    public long getUnitCalibrationTTL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a53382b7", new Object[]{this})).longValue() : remoteConfig.unitCalibrationTTL;
    }

    public boolean isPrefetchLocalModeEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c9e17db", new Object[]{this})).booleanValue() : this.prefetchLocalMode;
    }
}
