package com.alipay.sdk.api;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.app.pay.PayTask;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.app.PayTaskCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AlipaySDKJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TRADE_PAY_PRO = "tradePay";
    public static final String ACTION_TRADE_PAY_STD = "tradePayWithAlipay";
    public static final String API_NAME = "AlipaySDK";
    public static final String LOG_TAG = "phonecashiermsp";
    public static final String OPT_EXT_PARAMS = "extParams";
    public static final String OPT_ORDER_STRING = "orderStr";
    public static final String OPT_SCHEME = "scheme";

    public static /* synthetic */ Object ipc$super(AlipaySDKJSBridge alipaySDKJSBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ r access$000(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("287f841", new Object[]{str, str2}) : p(str, str2);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION_TRADE_PAY_STD.equals(str)) {
            LogUtil.record(2, LOG_TAG, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, "triggered with " + str + ", " + str2);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                final String optString = jSONObject.optString("orderStr");
                jSONObject.optString("scheme");
                jSONObject.optJSONObject("extParams");
                if (StringUtils.isEmpty(optString)) {
                    wVCallBackContext.error(p("HY_PARAM_ERR", "missing orderStr"));
                    return true;
                }
                final Activity aC = aC();
                if (aC == null) {
                    wVCallBackContext.error(p("HY_FAILED", "activity not found"));
                    return true;
                }
                LogUtil.record(2, LOG_TAG, "innerExecuteStd", "starting payment w std sdk: ".concat(String.valueOf(optString)));
                Thread thread = new Thread(new Runnable() { // from class: com.alipay.sdk.api.AlipaySDKJSBridge.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            Map<String, String> payV2 = new PayTaskCompat(aC).payV2(optString, true);
                            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "innerExecuteStd", "payment finish w std sdk: ".concat(String.valueOf(payV2)));
                            r rVar = new r("HY_SUCCESS");
                            rVar.a(new JSONObject(payV2));
                            wVCallBackContext.success(rVar);
                        } catch (Throwable th) {
                            LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "innerExecuteStd", "exception during payment");
                            LogUtil.printExceptionStackTrace(th);
                            wVCallBackContext.error(AlipaySDKJSBridge.access$000("HY_FAILED", "exception during payment"));
                        }
                    }
                });
                thread.setName("AlipayJsBridgePayThread");
                TaskHelper.execute(thread);
                return true;
            } catch (Exception e) {
                LogUtil.record(4, LOG_TAG, "innerExecuteStd", "option check failed");
                LogUtil.printExceptionStackTrace(e);
                wVCallBackContext.error(p("HY_PARAM_ERR", "option check failed"));
                return true;
            }
        } else if (ACTION_TRADE_PAY_PRO.equals(str)) {
            LogUtil.record(2, LOG_TAG, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, "triggered with " + str + ", " + str2);
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                String optString2 = jSONObject2.optString("orderStr");
                jSONObject2.optString("scheme");
                JSONObject optJSONObject = jSONObject2.optJSONObject("extParams");
                if (StringUtils.isEmpty(optString2)) {
                    wVCallBackContext.error(p("HY_PARAM_ERR", "missing orderStr"));
                    return true;
                }
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                if (!(this.mWebView.getContext() instanceof Activity)) {
                    LogUtil.record(4, LOG_TAG, "innerExecutePro", "activity not found");
                    wVCallBackContext.error(p("HY_FAILED", "activity not found"));
                    return true;
                }
                Activity aC2 = aC();
                if (aC2 == null) {
                    wVCallBackContext.error(p("HY_FAILED", "activity not found"));
                    return true;
                }
                LogUtil.record(2, LOG_TAG, "innerExecutePro", "starting payment w pro sdk: ".concat(String.valueOf(optString2)));
                try {
                    new PayTask(aC2, new PayTask.OnPayListener() { // from class: com.alipay.sdk.api.AlipaySDKJSBridge.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.pay.PayTask.OnPayListener
                        public void onPaySuccess(Context context, String str3, String str4, String str5) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("9a71bc85", new Object[]{this, context, str3, str4, str5});
                                return;
                            }
                            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "innerExecutePro", "payment success w pro sdk: " + str3 + ", " + str4 + ", " + str5);
                            r rVar = new r("HY_SUCCESS");
                            rVar.a("resultStatus", str3);
                            rVar.a("memo", str4);
                            rVar.a("result", str5);
                            wVCallBackContext.success(rVar);
                        }

                        @Override // com.alipay.android.app.pay.PayTask.OnPayListener
                        public void onPayFailed(Context context, String str3, String str4, String str5) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("50907699", new Object[]{this, context, str3, str4, str5});
                                return;
                            }
                            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "innerExecutePro", "payment failed w pro sdk: " + str3 + ", " + str4 + ", " + str5);
                            r rVar = new r("HY_FAILED");
                            rVar.a("resultStatus", str3);
                            rVar.a("memo", str4);
                            rVar.a("result", str5);
                            wVCallBackContext.error(rVar);
                        }
                    }).pay(optString2, optJSONObject.toString(), null);
                    return true;
                } catch (Throwable th) {
                    LogUtil.record(4, LOG_TAG, "innerExecutePro", "exception during payment");
                    LogUtil.printExceptionStackTrace(th);
                    wVCallBackContext.error(p("HY_FAILED", "exception during payment"));
                    return true;
                }
            } catch (Exception e2) {
                LogUtil.record(4, LOG_TAG, "innerExecutePro", "option check failed");
                LogUtil.printExceptionStackTrace(e2);
                wVCallBackContext.error(p("HY_PARAM_ERR", "option check failed"));
                return true;
            }
        } else {
            LogUtil.record(2, LOG_TAG, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, "missing: ".concat(String.valueOf(str)));
            return false;
        }
    }

    private static r p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("6b8902c1", new Object[]{str, str2});
        }
        r rVar = new r(str);
        rVar.a("apiMsg", str2);
        return rVar;
    }

    private Activity aC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("a1a25abf", new Object[]{this});
        }
        Context context = this.mWebView.getContext();
        if (!(context instanceof Activity)) {
            LogUtil.record(4, LOG_TAG, "tryGetActivity", "activity not found");
            return null;
        }
        return (Activity) context;
    }
}
