package com.alipay.android.msp.network.decorator;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.MspExtInfoModel;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.lowdevice.MspLowDeviceManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.util.FwUtils;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.RpcRequestDataV2;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public final class RpcRequestDecoratorV2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static RpcRequestDataV2 todo(RequestConfig requestConfig, String str, int i, boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcRequestDataV2) ipChange.ipc$dispatch("f92cc6a7", new Object[]{requestConfig, str, new Integer(i), new Boolean(z)}) : todo(requestConfig, str, i, z, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:17|(2:96|(1:98)(2:99|(1:101)(2:102|(1:104)(30:105|23|(1:27)|28|(1:30)(1:95)|31|(3:33|(1:35)(1:93)|36)(1:94)|37|(1:39)(1:92)|40|(1:91)(1:46)|47|(1:49)|50|(1:54)|55|(3:83|84|(14:86|87|58|(1:60)|61|(1:63)(1:82)|64|65|66|(5:68|69|70|(1:72)|73)|79|70|(0)|73))|57|58|(0)|61|(0)(0)|64|65|66|(0)|79|70|(0)|73))))(1:21)|22|23|(2:25|27)|28|(0)(0)|31|(0)(0)|37|(0)(0)|40|(1:42)|91|47|(0)|50|(2:52|54)|55|(0)|57|58|(0)|61|(0)(0)|64|65|66|(0)|79|70|(0)|73) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03be, code lost:
        com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03b9 A[Catch: Throwable -> 0x03bd, TRY_LEAVE, TryCatch #0 {Throwable -> 0x03bd, blocks: (B:98:0x03b1, B:100:0x03b9), top: B:144:0x03b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0308 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alipay.android.msp.network.model.RpcRequestDataV2 todo(com.alipay.android.msp.network.model.RequestConfig r25, final java.lang.String r26, final int r27, boolean r28, boolean r29) throws com.alibaba.fastjson.JSONException {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.network.decorator.RpcRequestDecoratorV2.todo(com.alipay.android.msp.network.model.RequestConfig, java.lang.String, int, boolean, boolean):com.alipay.android.msp.network.model.RpcRequestDataV2");
    }

    private static JSONObject a(JSONObject jSONObject, MspTradeContext mspTradeContext, String str, String str2, int i, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50c7e7b8", new Object[]{jSONObject, mspTradeContext, str, str2, new Integer(i), requestConfig});
        }
        jSONObject.put(MspGlobalDefine.MSP_SWITCH_VERSION, (Object) DrmManager.getInstance(GlobalHelper.getInstance().getContext()).getVersion());
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "checkpoint before sourceBundleId");
        if (!TextUtils.isEmpty(str) && mspTradeContext != null) {
            jSONObject.put("sourceBundleId", (Object) str);
            jSONObject.put("sourceBundleSigMd5", (Object) mspTradeContext.getPaySession().getInvokeFromAppSign());
        }
        jSONObject.put("agednessVersion", (Object) Boolean.valueOf(PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(i)));
        jSONObject.put("isLowDevice", (Object) Boolean.valueOf(MspLowDeviceManager.getInstance().isLowDevice()));
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("VIData", (Object) str2);
        }
        String extendParams = requestConfig.getExtendParams(MspGlobalDefine.EXT_INSIDE_ENV);
        if (!TextUtils.isEmpty(extendParams)) {
            jSONObject.put(MspGlobalDefine.INSIDE_ENV, (Object) extendParams);
        }
        PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_BUILD_GET_EXTINFO");
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "checkpoint before sourceBundleId");
        Map<String, String> map = null;
        String join = TextUtils.join("|", FwUtils.concatMultiList(ThirdPayManager.getAvailableThirdPayTypes(GlobalHelper.getInstance().getContext()), ThirdPayManager.getExternalProvidedThirdPayTypes(mspTradeContext), mspTradeContext != null ? mspTradeContext.getPaySession().getInstalled3rdAppList() : null, ThirdPayManager.getListCupDirectApps()));
        if (!TextUtils.isEmpty(join)) {
            jSONObject.put("supported_3rd_pay", (Object) join);
        }
        LogUtil.record(2, "RpcRequestDecoratorV2:getVidataTime", "checkpoint before getBizInfo");
        if (mspTradeContext != null) {
            try {
                map = mspTradeContext.getPaySession().getExtInfo();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        if (map != null && map.size() > 0) {
            for (String str3 : map.keySet()) {
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = map.get(str3);
                    if (!TextUtils.isEmpty(str4)) {
                        jSONObject.put(str3, (Object) str4);
                    }
                }
            }
            ApLinkTokenUtils.fixApLinkToken(jSONObject, i);
        }
        return jSONObject;
    }

    private static JSONObject a(JSONObject jSONObject, MspTradeContext mspTradeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("85081b02", new Object[]{jSONObject, mspTradeContext, str});
        }
        if (mspTradeContext == null) {
            return jSONObject;
        }
        MspExtInfoModel extInfoModel = mspTradeContext.getExtInfoModel();
        extInfoModel.setVIData(str);
        try {
            jSONObject = JsonUtil.merge(jSONObject, (JSONObject) JSONObject.toJSON(extInfoModel));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            mspTradeContext.getStatisticInfo().addError(ErrorType.DEFAULT, "assembleExtInfoError", e);
        }
        jSONObject.remove("tc_verify_token");
        jSONObject.remove("terminal_custom_info");
        jSONObject.remove("terminal_source");
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_SOURCE_KEY);
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_ID_KEY);
        jSONObject.remove(MspGlobalDefine.INVOKE_FROM_API_KEY);
        return jSONObject;
    }
}
