package com.alipay.mobile.common.amnet.service;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.security.realidentity.u2;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetUserInfo;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService;
import com.alipay.mobile.common.amnet.service.util.PushIpcHelper;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SignRequest;
import com.alipay.mobile.common.netsdkextdependapi.security.SignResult;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MpaasPropertiesUtil;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.taolive.room.utils.ag;
import java.util.HashMap;
import java.util.Map;
import tb.cpe;
import tb.riy;

/* loaded from: classes3.dex */
public class AmnetInitInfosHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f5370a;
    private static String b;
    private static Map<Byte, Map<String, String>> c = new HashMap();
    private static MainProcGeneralListenService d = null;

    /* loaded from: classes3.dex */
    public static class HashMapTypeReference extends TypeReference<Map<Byte, Map<String, String>>> {
    }

    public static Map<Byte, Map<String, String>> collectFacade(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6c14c3ef", new Object[]{map});
        }
        try {
            collecteInitInfoFlowV2(map);
        } catch (Exception e) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", e);
        }
        return map;
    }

    public static void collecteInitInfoFlowV2(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d726ae1b", new Object[]{map});
            return;
        }
        Map<Byte, Map<String, String>> initInfoFromLocalDeviceInfo = getInitInfoFromLocalDeviceInfo(map);
        if (mergeAndGetInitInfoFromMainProcDeviceInfo(initInfoFromLocalDeviceInfo)) {
            return;
        }
        if (!c.isEmpty()) {
            a(initInfoFromLocalDeviceInfo, c);
        } else {
            e(initInfoFromLocalDeviceInfo);
        }
    }

    public static final Map<Byte, Map<String, String>> getInitInfoFromLocalDeviceInfo(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5f08f02", new Object[]{map});
        }
        LogCatUtil.info("amnet_AmnetInitInfosHelper", "collect AmnetInitInfosHelper ");
        HashMap hashMap = new HashMap();
        hashMap.put("utdid", getUtdId());
        hashMap.put("userId", AmnetUserInfo.getUserId());
        hashMap.put("cacheSessionId", AmnetUserInfo.getSessionId());
        hashMap.put("systemType", "android");
        hashMap.put("appType", cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
        hashMap.put(u2.q, "phone");
        hashMap.put("isPushEnable", "T");
        try {
            hashMap.put("vmType", DeviceInfoUtil.getVmType());
            hashMap.put("apiLevel", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("releaseVersion", AppInfoUtil.getReleaseCode());
        } catch (Throwable th) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", th);
        }
        hashMap.put("channels", AppInfoUtil.getChannelId());
        hashMap.put(LoggingSPCache.STORAGE_PRODUCTID, AppInfoUtil.getProductId());
        hashMap.put(LoggingSPCache.STORAGE_PRODUCTVERSION, AppInfoUtil.getProductVersion());
        DeviceInfoUtil.reInitDeviceInfo();
        hashMap.put("systemVersion", DeviceInfoUtil.getSystemVersion());
        hashMap.put("userAgent", DeviceInfoUtil.getUserAgent());
        hashMap.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, String.valueOf(DeviceInfoUtil.getScreenWidth()));
        hashMap.put("screenHigh", String.valueOf(DeviceInfoUtil.getScreenHeight()));
        hashMap.put("mobileBrand", DeviceInfoUtil.getMobileBrand());
        hashMap.put("mobileModel", DeviceInfoUtil.getMobileModel());
        hashMap.put("romVersion", DeviceInfoUtil.getRomVersion());
        hashMap.put(ag.KEY_ACCESS_POINT, DeviceInfoUtil.getAccessPoint());
        hashMap.put("imei", DeviceInfoUtil.getImei());
        hashMap.put("imsi", DeviceInfoUtil.getImsi());
        hashMap.put("isPrisonBreak", String.valueOf(DeviceInfoUtil.isRooted()));
        b(hashMap);
        a(hashMap);
        if (!StringUtils.isEmpty(AmnetUserInfo.getUserId())) {
            hashMap.put("clientPostion", DeviceInfoUtil.getCellInfo());
        } else {
            hashMap.put("clientPostion", "-1;-1");
        }
        c(hashMap);
        Map<String, String> map2 = map.get((byte) 0);
        if (map2 == null) {
            map.put((byte) 0, hashMap);
        } else {
            map2.putAll(hashMap);
        }
        if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
            try {
                LogCatUtil.debug("amnet_AmnetInitInfosHelper", "collect [ AmnetInitInfosHelper ] " + JSON.toJSONString(map));
            } catch (Throwable th2) {
                LogCatUtil.error("amnet_AmnetInitInfosHelper", th2);
            }
        }
        return map;
    }

    private static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        String workspaceIdForMPaaS = AppInfoUtil.getWorkspaceIdForMPaaS();
        if (StringUtils.isEmpty(workspaceIdForMPaaS)) {
            return;
        }
        map.put(HeaderConstant.HEADER_KEY_WORKSPACE_ID, workspaceIdForMPaaS);
        String valueOf = String.valueOf(System.currentTimeMillis());
        map.put("currentTime", valueOf);
        String a2 = a(AmnetEnvHelper.getAppContext());
        SignRequest signRequest = new SignRequest();
        signRequest.appkey = MpaasPropertiesUtil.getAppKeyFromMetaData(AmnetEnvHelper.getAppContext());
        signRequest.content = workspaceIdForMPaaS + "" + a2 + "" + valueOf;
        signRequest.signType = SignRequest.SIGN_TYPE_MD5;
        SignResult signature = SecurityUtil.signature(signRequest);
        if (!StringUtils.isEmpty(signature.sign)) {
            map.put("sign", signature.sign);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[putDatasForMPaaS] Sign infos. AppName:");
        sb.append(a2);
        sb.append(", raw content:");
        sb.append(signRequest.content);
        sb.append(", sign :");
        sb.append(signature.isSuccess() ? signature.sign : "NULL");
        LogCatUtil.info("amnet_AmnetInitInfosHelper", sb.toString());
    }

    private static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
            return;
        }
        String appIdForMPaaS = AppInfoUtil.getAppIdForMPaaS();
        if (!StringUtils.isEmpty(appIdForMPaaS)) {
            map.put("AppName", appIdForMPaaS);
        } else {
            map.put("AppName", a(AmnetEnvHelper.getAppContext()));
        }
    }

    private static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{map});
        } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            if (TransportStrategy.isEnabledOnlyPush()) {
                map.put("only_push", "true");
                return;
            }
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "Can not use amnet, but no enable onlypush.");
            map.put("only_push", "false");
        } else {
            map.put("only_push", "false");
        }
    }

    public static Map<Byte, Map<String, String>> getInitInfoFromMainProcDeviceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d85f8c2d", new Object[0]);
        }
        try {
            return a().collect(new HashMap(0));
        } catch (Throwable th) {
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "collect init from main proc. " + th.toString());
            return null;
        }
    }

    public static boolean mergeAndGetInitInfoFromMainProcDeviceInfo(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d351b5b0", new Object[]{map})).booleanValue();
        }
        try {
            waitBinde();
            LogCatUtil.info("amnet_AmnetInitInfosHelper", "start get main process !!");
            Map<Byte, Map<String, String>> initInfoFromMainProcDeviceInfo = getInitInfoFromMainProcDeviceInfo();
            if (!d(initInfoFromMainProcDeviceInfo)) {
                return false;
            }
            b(c, initInfoFromMainProcDeviceInfo);
            SharedPreUtils.putData(AmnetEnvHelper.getAppContext(), "amnet_init_info", a(JSON.toJSONString(c)));
            LogCatUtil.info("amnet_AmnetInitInfosHelper", "get main process init success !!");
            a(map, initInfoFromMainProcDeviceInfo);
            return true;
        } catch (Throwable th) {
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "collect init from main proc. " + th.toString());
            return false;
        }
    }

    private static boolean d(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1127953e", new Object[]{map})).booleanValue() : !isInitMapEmpty(map) && !isStringMapEmpty(map.get((byte) 0));
    }

    public static boolean waitBinde() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc83265e", new Object[0])).booleanValue();
        }
        if (!PushIpcHelper.hasRegister() && (AmnetServiceLifeCycleListener.getInstance().isBindedMainProc() || MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext()) || MiscUtils.isMainProcessRuning(AmnetEnvHelper.getAppContext()))) {
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "Main bunded ,  waiting callback register!");
            PushIpcHelper.waitBinded();
            return true;
        } else if (PushIpcHelper.hasRegister()) {
            return true;
        } else {
            LogCatUtil.warn("amnet_AmnetInitInfosHelper", "No bunded , return false!");
            return false;
        }
    }

    private static boolean a(Map<Byte, Map<String, String>> map, Map<Byte, Map<String, String>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0efabcc", new Object[]{map, map2})).booleanValue();
        }
        if (isInitMapEmpty(map2)) {
            return false;
        }
        for (Map.Entry<Byte, Map<String, String>> entry : map2.entrySet()) {
            if (entry.getValue() != null && !entry.getValue().isEmpty()) {
                Map<String, String> map3 = map.get(entry.getKey());
                if (map3 != null) {
                    map3.putAll(entry.getValue());
                } else {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return true;
    }

    private static boolean b(Map<Byte, Map<String, String>> map, Map<Byte, Map<String, String>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c86b8d", new Object[]{map, map2})).booleanValue();
        }
        if (isInitMapEmpty(map2)) {
            return false;
        }
        for (Map.Entry<Byte, Map<String, String>> entry : map2.entrySet()) {
            if (entry.getValue() != null && !entry.getValue().isEmpty()) {
                Map<String, String> map3 = map.get(entry.getKey());
                if (map3 != null) {
                    for (Map.Entry<String, String> entry2 : entry.getValue().entrySet()) {
                        map3.put(entry2.getKey(), entry2.getValue());
                    }
                } else {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return true;
    }

    private static boolean e(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8c96b9d", new Object[]{map})).booleanValue();
        }
        String str = "";
        try {
            str = b(SharedPreUtils.getStringData(AmnetEnvHelper.getAppContext(), "amnet_init_info"));
            if (!StringUtils.isEmpty(str)) {
                return a(map, parseJson2MapAndUpdateMemCache(str));
            }
            return false;
        } catch (Exception e) {
            logJsonEmptyErr(str, e);
            return false;
        }
    }

    public static Map<Byte, Map<String, String>> parseJson2MapAndUpdateMemCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c140714e", new Object[]{str});
        }
        Map<Byte, Map<String, String>> parseJson2Map = parseJson2Map(str);
        if (parseJson2Map == null) {
            return null;
        }
        c.clear();
        c.putAll(parseJson2Map);
        return parseJson2Map;
    }

    public static String getUtdId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9ac854f", new Object[0]) : DeviceInfoUtil.getDeviceId();
    }

    public static boolean isInitMapEmpty(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6dcc177", new Object[]{map})).booleanValue() : map == null || map.isEmpty();
    }

    public static boolean isStringMapEmpty(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c896856", new Object[]{map})).booleanValue() : map == null || map.isEmpty();
    }

    public static void logJsonEmptyErr(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5dbed1", new Object[]{str, exc});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("initJson=[");
        if (StringUtils.isEmpty(str)) {
            str = " is empty ";
        }
        sb.append(str);
        sb.append(riy.ARRAY_END_STR);
        LogCatUtil.error("amnet_AmnetInitInfosHelper", sb.toString(), exc);
    }

    public static void logJsonParseErr(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a21d1b7", new Object[]{str, exc});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("JSON.parseObject exception. initJson=[");
        if (StringUtils.isEmpty(str)) {
            str = " is empty ";
        }
        sb.append(str);
        sb.append(riy.ARRAY_END_STR);
        LogCatUtil.error("amnet_AmnetInitInfosHelper", sb.toString(), exc);
    }

    public static Map<Byte, Map<String, String>> parseJson2Map(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a75190b", new Object[]{str});
        }
        try {
            Map<Byte, Map<String, String>> map = (Map) JSON.parseObject(str, new HashMapTypeReference(), new Feature[0]);
            if (isInitMapEmpty(map) || isStringMapEmpty(map.get((byte) 0))) {
                return null;
            }
            return map;
        } catch (Exception e) {
            SharedPreUtils.removeData(AmnetEnvHelper.getAppContext(), "amnet_init_info");
            logJsonParseErr(str, e);
            return null;
        }
    }

    public static void updateUserInfoForInitInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f2ee80", new Object[]{str, str2});
            return;
        }
        if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
            LogCatUtil.printInfo("amnet_AmnetInitInfosHelper", "updateUserInfoForInitInfo userId=[" + str + "] sessionId=[" + str2 + "] ");
        }
        f5370a = str;
        b = str2;
        Map<String, String> map = c.get((byte) 0);
        if (map != null && !map.isEmpty()) {
            map.put("userId", f5370a);
            map.put("cacheSessionId", b);
            SharedPreUtils.putData(AmnetEnvHelper.getAppContext(), "amnet_init_info", a(JSON.toJSONString(c)));
            return;
        }
        String b2 = b(SharedPreUtils.getStringData(AmnetEnvHelper.getAppContext(), "amnet_init_info"));
        if (StringUtils.isEmpty(b2)) {
            return;
        }
        Map<? extends Byte, ? extends Map<String, String>> map2 = (Map) JSON.parseObject(b2, new HashMapTypeReference(), new Feature[0]);
        if (!d(map2)) {
            return;
        }
        Map map3 = (Map) map2.get((byte) 0);
        map3.put("userId", f5370a);
        map3.put("cacheSessionId", b);
        c.clear();
        c.putAll(map2);
        SharedPreUtils.putData(AmnetEnvHelper.getAppContext(), "amnet_init_info", a(JSON.toJSONString(map3)));
    }

    public static void updateSyncInitInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c753dc", new Object[]{map});
            return;
        }
        LogCatUtil.info("amnet_AmnetInitInfosHelper", "updateSyncInitInfo.");
        try {
            Map<String, String> map2 = c.get((byte) 2);
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            map2.clear();
            map2.putAll(map);
            SharedPreUtils.putData(AmnetEnvHelper.getAppContext(), "amnet_init_info", a(JSON.toJSONString(c)));
        } catch (Exception e) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", e);
        }
    }

    private static MainProcGeneralListenService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainProcGeneralListenService) ipChange.ipc$dispatch("b54b2729", new Object[0]);
        }
        if (d == null) {
            d = (MainProcGeneralListenService) PushIpcHelper.getIpcProxy(MainProcGeneralListenService.class);
        }
        return d;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                LogCatUtil.debug("amnet_AmnetInitInfosHelper", "encrypt,val is null");
                return "";
            }
            return SecurityUtil.encrypt(str);
        } catch (Throwable th) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", th);
            return "";
        }
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                LogCatUtil.debug("amnet_AmnetInitInfosHelper", "decrypt,enVal is null");
                return "";
            }
            return SecurityUtil.decrypt(str);
        } catch (Throwable th) {
            LogCatUtil.error("amnet_AmnetInitInfosHelper", th);
            return "";
        }
    }

    private static final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        String productName = AppInfoUtil.getProductName();
        return productName == null ? "unknow_app_name" : productName;
    }
}
