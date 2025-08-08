package com.alipay.android.msp.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.cctemplate.utils.MD5;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.MspPaySession;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.lowdevice.MspLowDeviceManager;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.phone.wallet.spmtracker.SpmTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class ApLinkTokenUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AP_LINK_OPEN_AUTH_INVOKE = "a283.b16116.c39778.d87934";
    public static final String AP_LINK_SPM_BEFORE_NET_REQUEST = "a283.b16116.c39778.d95594";
    public static final String AP_LINK_SPM_BIZ_CODE = "pay";
    public static final String AP_LINK_SPM_JUMP_TO_LOGIN = "a283.b16116.c39778.d80265";
    public static final String AP_LINK_SPM_PAYMENT_BOOT = "a283.b16116.c39778.d80264";
    public static final String AP_LINK_SPM_RECV_EXT_PAYMENT = "a283.b16116.c39778.d80266";
    public static final String AP_LINK_TOKEN_EXT_INFO_KEY = "ap_link_token";
    public static final String AP_LINK_TOKEN_KEY_FROM_SCAN_CODE = "ap_scan_codec_link_token";
    public static final String AP_LINK_TOKEN_SPM_EXT_KEY = "ap_link_token";
    public static final String BIG_SCREEN_ADAPT_SWITCH = "big_screen_adapt_switch";
    public static final String EXT_SCENE_ACCESSIBILITY = "ext_scene_accessibility";
    public static final String EXT_SCENE_AGEDNESS_VERSION = "ext_scene_agedness_version";
    public static final String EXT_SCENE_BIG_SCREEN = "ext_scene_big_screen";
    public static final String EXT_SCENE_LOW_DEVICE = "ext_scene_low_device";
    public static final String KEY_END_CODE = "end_code";
    public static final String KEY_EXEC_TIME = "exec_time";
    public static final String KEY_TRACE_ID = "trace_id";
    public static final String MARK_SPM_EXT_KEY = "ap_mk";
    public static final String ORDER_STRING_SPM_EXT_KEY = "orderStr";
    public static final String SPM_EXT_PAYMENT_START_SUCCESS = "a283.b16116.c39778.d178815";
    public static final String SPM_PAYMENT_END = "a283.b39457.c99711.d206384";

    public static String generateExtPayTradeToken(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6990b18", new Object[]{str, str2, new Boolean(z)});
        }
        return generateTradeToken(str + str2, "EP", z ? '1' : '0');
    }

    public static String generateFallbackTradeToken(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("76893ae3", new Object[]{str}) : generateTradeToken(str, "UK", '0');
    }

    public static String generateUniqueSuffixForOuterApLinkToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5946e048", new Object[]{str});
        }
        String encryptMd5_32 = MD5.encryptMd5_32(str + System.currentTimeMillis() + UUID.randomUUID().toString());
        return "_INR" + encryptMd5_32.substring(0, 8);
    }

    private static String generateTradeToken(String str, String str2, char c) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5e4bce8", new Object[]{str, str2, new Character(c)});
        }
        try {
            str3 = str2 + c + MD5.encryptMd5_32(str + System.currentTimeMillis() + UUID.randomUUID().toString());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            str3 = "";
        }
        LogUtil.record(2, "ApLinkTokenUtils#generateExtPayTradeToken", "生成 token: ".concat(String.valueOf(str3)));
        return str3;
    }

    private static Map<String, String> getSpmExtForExternalPayment(String str, MspPaySession mspPaySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9a2ae0ee", new Object[]{str, mspPaySession});
        }
        HashMap hashMap = new HashMap();
        if (mspPaySession != null && mspPaySession.getLocalInvokeInfo() != null) {
            hashMap.putAll(mspPaySession.getLocalInvokeInfo());
        }
        if (mspPaySession != null && !StringUtils.isEmpty(mspPaySession.getApLinkToken())) {
            hashMap.put("ap_link_token", mspPaySession.getApLinkToken());
        }
        return hashMap;
    }

    public static void spmExpExtPay(Context context, MspPaySession mspPaySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d01f9d6", new Object[]{context, mspPaySession});
            return;
        }
        if (context == null) {
            try {
                context = GlobalHelper.getInstance().getContext();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        String str = "";
        if (mspPaySession != null) {
            str = mspPaySession.getEncodeOrderSuffix();
        }
        Map<String, String> spmExtForExternalPayment = getSpmExtForExternalPayment(str, mspPaySession);
        spmExtForExternalPayment.put("orderStr", str);
        SpmTracker.expose(context, AP_LINK_SPM_RECV_EXT_PAYMENT, "pay", 1, spmExtForExternalPayment);
        LogUtil.record(2, "ApLinkTokenUtils#spmExpExtPay", "外部: ".concat(String.valueOf(spmExtForExternalPayment)));
    }

    public static void spmExtPaymentStartSuccess(Context context, MspPaySession mspPaySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed3e738", new Object[]{context, mspPaySession});
            return;
        }
        if (context == null) {
            try {
                context = GlobalHelper.getInstance().getContext();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        Map<String, String> spmExtForExternalPayment = getSpmExtForExternalPayment(mspPaySession != null ? mspPaySession.getOrderSuffix() : "", mspPaySession);
        spmExtForExternalPayment.put(MARK_SPM_EXT_KEY, "s-true");
        SpmTracker.expose(context, SPM_EXT_PAYMENT_START_SUCCESS, "pay", 1, spmExtForExternalPayment);
        LogUtil.record(2, "ApLinkTokenUtils", "唤起成功: ".concat(String.valueOf(spmExtForExternalPayment)));
    }

    private static void insertSpmExtInfo(MspTradeContext mspTradeContext, Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8c72fe", new Object[]{mspTradeContext, context, map});
            return;
        }
        map.put("orderStr", mspTradeContext.getEncodeOrderInfo());
        String apLinkToken = mspTradeContext.getApLinkToken();
        if (!StringUtils.isEmpty(apLinkToken)) {
            map.put("ap_link_token", apLinkToken);
        }
        MspExtSceneManager mspExtSceneManager = MspExtSceneManager.getInstance(context);
        map.put(EXT_SCENE_AGEDNESS_VERSION, Boolean.toString(PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(mspTradeContext.getBizId())));
        map.put(EXT_SCENE_ACCESSIBILITY, mspExtSceneManager.isAccessibilityEnabled());
        map.put(EXT_SCENE_BIG_SCREEN, mspExtSceneManager.isBigScreen());
        map.put(EXT_SCENE_LOW_DEVICE, String.valueOf(MspLowDeviceManager.getInstance().isLowDevice()));
        StringBuilder sb = new StringBuilder();
        sb.append(MspExtSceneManager.onPadAdaptMode(context));
        map.put(BIG_SCREEN_ADAPT_SWITCH, sb.toString());
    }

    public static void spmExpPayBoot(MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce95736", new Object[]{mspTradeContext, str});
            return;
        }
        Context context = null;
        if (mspTradeContext != null) {
            try {
                context = mspTradeContext.getContext();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        if (context == null) {
            context = GlobalHelper.getInstance().getContext();
        }
        HashMap hashMap = new HashMap();
        String encodeOrderInfo = mspTradeContext.getEncodeOrderInfo();
        if (!StringUtils.isEmpty(encodeOrderInfo)) {
            hashMap.put("orderStr", encodeOrderInfo);
        }
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("clientBizType", str);
        }
        hashMap.put("extInfo", URLEncoder.encode(((JSONObject) JSONObject.toJSON(mspTradeContext.getExtInfoModel())).toJSONString(), "utf8"));
        insertSpmExtInfo(mspTradeContext, context, hashMap);
        SpmTracker.expose(context, AP_LINK_SPM_PAYMENT_BOOT, mspTradeContext.getBizCodeForKeySpm(), 1, hashMap);
        LogUtil.record(2, "ApLinkTokenUtils#spmExpPayBoot", "开始: ".concat(String.valueOf(hashMap)));
    }

    public static void spmPaymentEnd(MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87ae1e", new Object[]{mspTradeContext, str});
            return;
        }
        Context context = null;
        if (mspTradeContext != null) {
            try {
                context = mspTradeContext.getContext();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        if (context == null) {
            context = GlobalHelper.getInstance().getContext();
        }
        HashMap hashMap = new HashMap();
        insertSpmExtInfo(mspTradeContext, context, hashMap);
        hashMap.put("resultResultStr", str);
        hashMap.put(KEY_TRACE_ID, mspTradeContext.getStatisticInfo().getAttr(Vector.Time, "traceId"));
        hashMap.put("resultEndCode", mspTradeContext.getStatisticInfo().getAttr(Vector.Result, "endCode"));
        hashMap.put(KEY_EXEC_TIME, mspTradeContext.getStatisticInfo().getAttr(Vector.Result, "execTime"));
        SpmTracker.expose(context, SPM_PAYMENT_END, mspTradeContext.getBizCodeForKeySpm(), 1, hashMap);
        MspExtSceneManager.getInstance(context).resetInfo();
    }

    public static String tryUseLinkTokenAsLogTrace(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5227268d", new Object[]{mspTradeContext});
        }
        String str = "";
        try {
            String apLinkToken = mspTradeContext.getApLinkToken();
            if (StringUtils.isEmpty(apLinkToken)) {
                return str;
            }
            try {
                mspTradeContext.getStatisticInfo().updateAttr(Vector.Time, "traceId", apLinkToken);
                return apLinkToken;
            } catch (Throwable th) {
                th = th;
                str = apLinkToken;
                LogUtil.printExceptionStackTrace(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void spmExpJumpLogin(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d583bc6", new Object[]{context, str, new Integer(i)});
            return;
        }
        if (context == null) {
            try {
                context = GlobalHelper.getInstance().getContext();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("ap_link_token", str);
            hashMap.put("loginMode", String.valueOf(i));
        }
        SpmTracker.expose(context, AP_LINK_SPM_JUMP_TO_LOGIN, "pay", 1, hashMap);
        LogUtil.record(2, "ApLinkTokenUtils#spmExpPayBoot", "跳转登录: ".concat(String.valueOf(hashMap)));
    }

    public static void spmExpOpenAuthInvoke(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fd5711", new Object[]{context, str, map});
            return;
        }
        if (context == null) {
            try {
                context = GlobalHelper.getInstance().getContext();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("ap_link_token", str);
        }
        SpmTracker.expose(context, AP_LINK_OPEN_AUTH_INVOKE, "pay", 1, hashMap);
        LogUtil.record(2, "ApLinkTokenUtils#spmExpOpenAuthInvoke", "通用: ".concat(String.valueOf(hashMap)));
    }

    public static void spmExpBeforeRequest(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ddb29c", new Object[]{context, str, str2, str3});
            return;
        }
        if (context == null) {
            try {
                context = GlobalHelper.getInstance().getContext();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("ap_link_token", str);
        }
        if (!StringUtils.isEmpty(str2)) {
            hashMap.put("orderStr", str2);
        }
        if (!StringUtils.isEmpty(str3)) {
            hashMap.put("method", str3);
        }
        SpmTracker.expose(context, AP_LINK_SPM_BEFORE_NET_REQUEST, "pay", 1, hashMap);
        LogUtil.record(2, "ApLinkTokenUtils#spmExpOpenAuthInvoke", "请求前: ".concat(String.valueOf(hashMap)));
    }

    public static void fixApLinkToken(JSONObject jSONObject, int i) {
        MspTradeContext tradeContextByBizId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4b67f5", new Object[]{jSONObject, new Integer(i)});
        } else if (jSONObject == null || (tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i)) == null) {
        } else {
            String string = jSONObject.getString("ap_link_token");
            String apLinkToken = tradeContextByBizId.getApLinkToken();
            if (StringUtils.isEmpty(string) || StringUtils.isEmpty(apLinkToken) || StringUtils.equals(string, apLinkToken)) {
                return;
            }
            jSONObject.put("ap_link_token", (Object) apLinkToken);
            LogUtil.record(8, "RpcRequestDecoratorV2:fixApLinkToken", "exApLinkToken=" + string + ", cover by contextApLinkToken=" + apLinkToken);
            tradeContextByBizId.getStatisticInfo().addError(ErrorType.WARNING, "FixApLinkToken", string);
        }
    }
}
