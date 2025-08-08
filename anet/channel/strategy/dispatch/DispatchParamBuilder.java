package anet.channel.strategy.dispatch;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.security.SecurityHelper;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import anet.channel.util.Utils;
import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.antibrush.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class DispatchParamBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "amdc.DispatchParamBuilder";

    static {
        kge.a(2114979904);
    }

    public static Map buildParamMap(Map<String, Object> map, AmdcStatistic amdcStatistic) {
        String appkey;
        NetworkStatusHelper.NetworkStatus networkStatus;
        String str;
        String sign;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("467c2578", new Object[]{map, amdcStatistic});
        }
        if (amdcStatistic == null) {
            ALog.e(TAG, "amdc as is empty", null, new Object[0]);
            return null;
        }
        IAmdcSign sign2 = AmdcRuntimeInfo.getSign();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - GlobalAppRuntimeInfo.getInitTime() <= AwcnConfig.getAmdcLightTime();
        boolean z2 = AwcnConfig.isSecondRefreshABEnable() && AwcnConfig.isAmdcUpdateEnable();
        boolean isAmdcPriorityUpdateEnable = AwcnConfig.isAmdcPriorityUpdateEnable();
        if (isAmdcPriorityUpdateEnable) {
            z2 = true;
        }
        ALog.e(TAG, "amdc buildParamMap", null, "isAllowLightAmdcRequest", Boolean.valueOf(z), "isAmdcUpdateEnable", Boolean.valueOf(z2), "time", Long.valueOf(currentTimeMillis - GlobalAppRuntimeInfo.getInitTime()), "isAmdcPriorityUpdateEnable", Boolean.valueOf(isAmdcPriorityUpdateEnable));
        if (z2 && z) {
            appkey = GlobalAppRuntimeInfo.getAppkey();
            if (appkey == null || appkey.isEmpty()) {
                ALog.e(TAG, "amdc appkey is empty", null, "isAllowLightAmdcRequest", Boolean.valueOf(z));
                return null;
            }
        } else if (sign2 == null) {
            ALog.e(TAG, "amdc sign is null", null, "isAllowLightAmdcRequest", Boolean.valueOf(z));
            return null;
        } else if (StringUtils.isEmpty(sign2.getAppkey())) {
            ALog.e(TAG, "amdc appkey is empty", null, "isAllowLightAmdcRequest", Boolean.valueOf(z));
            return null;
        } else {
            appkey = sign2.getAppkey();
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (!NetworkStatusHelper.isConnected()) {
            ALog.e(TAG, "no network, don't send amdc request", null, new Object[0]);
            return null;
        }
        map.put("appkey", appkey);
        map.put("platform", "android");
        map.put("netType", status.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : AmdcRuntimeInfo.getParams().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (jSONObject.length() > 0) {
                map.put("other", jSONObject.toString());
            }
        } catch (Exception unused) {
            ALog.e(TAG, "other set error.", null, new Object[0]);
        }
        map.put("channel", AmdcRuntimeInfo.appChannel);
        map.put("appName", AmdcRuntimeInfo.appName);
        map.put("appVersion", AmdcRuntimeInfo.appVersion);
        map.put(DispatchConstants.STACK_TYPE, Integer.toString(getStackType()));
        map.put("domain", formatDomains(map));
        String abStrategy = Utils.getAbStrategy();
        if (!StringUtils.isEmpty(abStrategy)) {
            map.put(DispatchConstants.AB_STRATEGY, abStrategy);
        }
        map.put("t", String.valueOf(System.currentTimeMillis()));
        HashMap hashMap = new HashMap();
        hashMap.put(DispatchConstants.PLATFORM_VERSION, Build.VERSION.RELEASE);
        if (!StringUtils.isEmpty(GlobalAppRuntimeInfo.getUtdid())) {
            hashMap.put("deviceId", GlobalAppRuntimeInfo.getUtdid());
        }
        hashMap.put(DispatchConstants.CARRIER, NetworkStatusHelper.getCarrier());
        hashMap.put(DispatchConstants.MNC, NetworkStatusHelper.getSimOp());
        String str2 = "noSec";
        if (z2) {
            if (z) {
                networkStatus = status;
                str = "secData";
                map.put("rm", "l");
                map.put("signType", str2);
                map.put(DispatchConstants.CONFIG_VERSION, "1");
            } else {
                str = "secData";
                networkStatus = status;
                if (sign2.useSecurityGuard()) {
                    str2 = a.KEY_SEC;
                }
                map.put("signType", str2);
            }
            map.put(BizContext.KEY_SDK_VERSION, "1");
            String userId = GlobalAppRuntimeInfo.getUserId();
            if (isAmdcPriorityUpdateEnable) {
                map.put("v", DispatchConstants.PRIORITY_VER_CODE_PROTOCOL);
                String priority = AmdcPriorityHelper.getPriority(0, SwitchMonitorLogUtil.SRC_AMDC, userId);
                if (priority != null && !priority.isEmpty()) {
                    hashMap.put(DispatchConstants.U_PRIORITY, priority);
                }
                amdcStatistic.priority = priority;
                ALog.e(TAG, "[amdc priority] set priority =" + priority, SwitchMonitorLogUtil.SRC_AMDC, new Object[0]);
            } else {
                map.put("v", DispatchConstants.LATEST_VER_CODE_PROTOCOL);
            }
            if (!StringUtils.isEmpty(userId)) {
                hashMap.put("sid", userId);
            }
            if (z) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                String encryptNoDeps = SecurityHelper.encryptNoDeps(SecurityHelper.getSecretKey(valueOf), new JSONObject(hashMap).toString(), null, "[amdc]");
                ALog.e(TAG, "amdc rm is l, encryptNoDeps!", null, "isAllowLightAmdcRequest", Boolean.valueOf(z), "isAmdcUpdateEnable", Boolean.valueOf(z2));
                String replaceAll = (encryptNoDeps == null || encryptNoDeps.isEmpty()) ? null : encryptNoDeps.replaceAll("\n", "");
                map.put("st", valueOf);
                map.put(str, replaceAll);
                sign = BuildConfig.RPC_TYPE_DEF;
            } else {
                map.put(str, sign2.aesEncryptStr(new JSONObject(hashMap).toString()));
                ALog.e(TAG, "amdc rm not is l, aesEncryptStr!", null, "isAllowLightAmdcRequest", Boolean.valueOf(z), "isAmdcUpdateEnable", Boolean.valueOf(z2));
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(hashMap);
                sign = getSign(sign2, hashMap2);
                if (StringUtils.isEmpty(sign)) {
                    return null;
                }
            }
            map.put("sign", sign);
        } else {
            networkStatus = status;
            if (AwcnConfig.isZstdDictDecompressOpened()) {
                map.put("v", DispatchConstants.UPGRADE_VER_CODE_PROTOCOL);
            } else {
                map.put("v", DispatchConstants.VER_CODE_PROTOCOL);
            }
            if (!StringUtils.isEmpty(GlobalAppRuntimeInfo.getUserId())) {
                map.put("sid", GlobalAppRuntimeInfo.getUserId());
            }
            if (sign2.useSecurityGuard()) {
                str2 = a.KEY_SEC;
            }
            map.put("signType", str2);
            map.put("secData", sign2.aesEncryptStr(new JSONObject(hashMap).toString()));
            ALog.e(TAG, "amdc, aesEncryptStr!", null, "isAllowLightAmdcRequest", Boolean.valueOf(z), "isAmdcUpdateEnable", Boolean.valueOf(z2));
            HashMap hashMap3 = new HashMap();
            hashMap3.putAll(map);
            hashMap3.putAll(hashMap);
            String sign3 = getSign(sign2, hashMap3);
            if (StringUtils.isEmpty(sign3)) {
                return null;
            }
            map.put("sign", sign3);
        }
        if (map != null) {
            amdcStatistic.version = DispatchCore.parseObjectString(map, "v");
        }
        map.put(DispatchConstants.NETWORK_ID, NetworkStatusHelper.getUniqueId(networkStatus));
        return map;
    }

    private static int getStackType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15dbc1a6", new Object[0])).intValue();
        }
        int stackType = Inet64Util.getStackType();
        if (stackType == 1) {
            return 4;
        }
        if (stackType == 2) {
            return 2;
        }
        return stackType != 3 ? 4 : 1;
    }

    private static String formatDomains(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b529b07a", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : (Set) map.remove("hosts")) {
            sb.append(str);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String getSign(IAmdcSign iAmdcSign, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("670bf8b", new Object[]{iAmdcSign, map});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("appkey")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("domain")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("appName")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("appVersion")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.BSSID)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("channel")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("deviceId")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.LATITUDE)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.LONGTITUDE)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.MACHINE)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("netType")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("other")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("platform")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.PLATFORM_VERSION)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.PRE_IP)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("sid")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("t")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("v")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get("signType")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.CONFIG_VERSION)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.CARRIER)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.MNC)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.STACK_TYPE)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.Utils.stringNull2Empty(map.get(DispatchConstants.AB_STRATEGY)));
        try {
            return iAmdcSign.sign(sb.toString());
        } catch (Exception e) {
            ALog.e(TAG, "get sign failed", null, e, new Object[0]);
            return null;
        }
    }
}
