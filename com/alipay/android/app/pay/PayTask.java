package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.selftest.SelfTestManager;
import com.alipay.android.msp.core.MspEngine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.model.MspPaySession;
import com.alipay.android.msp.framework.certpay.CertPayManager;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MspAsyncTask;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.callback.IAlipayCallback;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MQPThirdPayUtils;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.Constants;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class PayTask extends MspAsyncTask<Object, Void, MspResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity activity;
    private OnPayListener x;
    private boolean y = false;
    private IAlipayCallback z = new IAlipayCallback() { // from class: com.alipay.android.app.pay.PayTask.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.msp.pay.callback.IAlipayCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32b5bd9d", new Object[]{this, str, str2, new Integer(i), bundle});
                return;
            }
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "PayTask.startActivity", "startActivity, className = " + str2 + ", callingPid = " + i);
            Activity activity = null;
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt(MspBaseActivity.KEY_ID, i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            intent.setClassName(str, str2);
            if (PayTask.access$000(PayTask.this) != null) {
                try {
                    if (!DrmManager.getInstance(PayTask.access$000(PayTask.this)).isDegrade(DrmKey.DEGRADE_START_SDK_ACTIVITY_NEW_TASK, true, PayTask.access$000(PayTask.this))) {
                        intent.addFlags(268435456);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
                PayTask.access$000(PayTask.this).startActivity(intent);
                return;
            }
            try {
                MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
                if (tradeContextByBizId != null) {
                    tradeContextByBizId.getStatisticInfo().addError("np", "PayTaskActNull", "bizid=".concat(String.valueOf(i)));
                }
                try {
                    activity = PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity();
                } catch (Throwable unused) {
                }
                if (activity != null) {
                    activity.startActivity(intent);
                } else if (tradeContextByBizId == null) {
                } else {
                    tradeContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, "TopActNull", "bizid=".concat(String.valueOf(i)));
                }
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
            }
        }
    };

    /* loaded from: classes3.dex */
    public interface CupDirectAppsCallback {
        void onResult(boolean z);
    }

    /* loaded from: classes3.dex */
    public interface OnPayListener {
        void onPayFailed(Context context, String str, String str2, String str3);

        void onPaySuccess(Context context, String str, String str2, String str3);
    }

    /* loaded from: classes3.dex */
    public interface TaoBaoOnPayListener extends OnPayListener {
        void onTaoBaoPayFailed(Context context, String str, String str2, String str3, String str4, String str5, String str6);

        void onTaoBaoPaySuccess(Context context, String str, String str2, String str3, String str4, String str5, String str6);
    }

    public static /* synthetic */ Object ipc$super(PayTask payTask, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute((PayTask) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Activity access$000(PayTask payTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("51492303", new Object[]{payTask}) : payTask.activity;
    }

    public PayTask(Activity activity, OnPayListener onPayListener) {
        this.activity = activity;
        this.x = onPayListener;
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "PayTask.PayTask", "PayTask init");
    }

    public void pay(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22352ac3", new Object[]{this, str, str2});
            return;
        }
        "pay orderInfo = ".concat(String.valueOf(str));
        execute(str);
    }

    public void pay(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8c49cd", new Object[]{this, str, str2, str3});
            return;
        }
        "payWithParams orderInfo = ".concat(String.valueOf(str));
        "payWithParams extendParams = ".concat(String.valueOf(str2));
        execute(str, str2);
    }

    public void manager(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7639a7e", new Object[]{this, str});
            return;
        }
        this.y = true;
        execute(str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.android.msp.framework.taskscheduler.MspAsyncTask
    /* renamed from: doInBackground */
    public MspResult mo520doInBackground(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResult) ipChange.ipc$dispatch("f31a5ffe", new Object[]{this, objArr});
        }
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "PayTask.doInBackground", "PayTask doInBackground startPay ");
        SelfTestManager.triggerSelfTestAsync(this.activity);
        GlobalConstant.loadProperties(this.activity);
        String str = null;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        String obj = objArr[0].toString();
        if (StringUtils.isEmpty(obj)) {
            return null;
        }
        if (objArr.length >= 2 && objArr[1] != null) {
            str = objArr[1].toString();
        }
        return b(obj, str);
    }

    private MspResult b(String str, String str2) {
        String startPay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResult) ipChange.ipc$dispatch("650c634d", new Object[]{this, str, str2});
        }
        String str3 = "processSDKPay orderInfo = " + str + " extendParams = " + str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str.hashCode());
        CertPayManager.getInstance(this.activity).initCallBack(sb.toString(), "");
        String paramsError = Result.getParamsError();
        try {
            if (this.activity == null) {
                return new MspResult(paramsError);
            }
            try {
                if (this.z != null) {
                    MspContextManager.getInstance().registerCallback(this.z, null);
                }
                if (!this.y) {
                    if (str.startsWith("http")) {
                        startPay = b(str);
                    } else {
                        startPay = MspEngine.startPay(new MspPaySession(str, str2, false));
                    }
                } else {
                    if (!StringUtils.isEmpty(str)) {
                        str = str + "&bizcontext=\"{\"biz_type\":\"payment_setting\"}\"";
                    }
                    MspEngine.startPay(new MspPaySession(str, null, false));
                    startPay = "true";
                }
                paramsError = startPay;
                LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "PayTask.processSDKPay", paramsError);
                if (this.z != null) {
                    MspContextManager.getInstance().unregisterAlipayCallback(this.z);
                    CertPayManager.dispose();
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            this.y = false;
            return new MspResult(paramsError);
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:6:0x0017, B:8:0x0025, B:14:0x0034, B:16:0x0044, B:18:0x004d, B:17:0x0049, B:20:0x0058, B:21:0x005d), top: B:24:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:6:0x0017, B:8:0x0025, B:14:0x0034, B:16:0x0044, B:18:0x004d, B:17:0x0049, B:20:0x0058, B:21:0x005d), top: B:24:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String b(java.lang.String r5) {
        /*
            java.lang.String r0 = "alipay"
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.android.app.pay.PayTask.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L17
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r5
            java.lang.String r5 = "6111438d"
            java.lang.Object r5 = r1.ipc$dispatch(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L17:
            java.lang.String r1 = "\\?"
            java.lang.String[] r5 = r5.split(r1)     // Catch: java.lang.Exception -> L5e
            r1 = r5[r4]     // Catch: java.lang.Exception -> L5e
            boolean r2 = r1.contains(r0)     // Catch: java.lang.Exception -> L5e
            if (r2 != 0) goto L31
            java.lang.String r2 = "taobao"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Exception -> L5e
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r1 = 0
            goto L32
        L31:
            r1 = 1
        L32:
            if (r1 == 0) goto L58
            r1 = r5[r3]     // Catch: java.lang.Exception -> L5e
            java.lang.String r2 = "&"
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Exception -> L5e
            r5 = r5[r4]     // Catch: java.lang.Exception -> L5e
            boolean r5 = r5.contains(r0)     // Catch: java.lang.Exception -> L5e
            if (r5 == 0) goto L49
            java.lang.String r5 = c(r1)     // Catch: java.lang.Exception -> L5e
            goto L4d
        L49:
            java.lang.String r5 = b(r1)     // Catch: java.lang.Exception -> L5e
        L4d:
            com.alipay.android.msp.core.model.MspPaySession r0 = new com.alipay.android.msp.core.model.MspPaySession     // Catch: java.lang.Exception -> L5e
            r1 = 0
            r0.<init>(r5, r1, r4)     // Catch: java.lang.Exception -> L5e
            java.lang.String r5 = com.alipay.android.msp.core.MspEngine.startPay(r0)     // Catch: java.lang.Exception -> L5e
            return r5
        L58:
            java.net.MalformedURLException r5 = new java.net.MalformedURLException     // Catch: java.lang.Exception -> L5e
            r5.<init>()     // Catch: java.lang.Exception -> L5e
            throw r5     // Catch: java.lang.Exception -> L5e
        L5e:
            java.lang.String r5 = com.alipay.android.app.pay.Result.getParamsError()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.pay.PayTask.b(java.lang.String):java.lang.String");
    }

    private static String b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31bc34ca", new Object[]{strArr});
        }
        for (String str : strArr) {
            if (str.contains("signStr")) {
                return str.substring(str.indexOf("signStr=") + 8);
            }
        }
        return null;
    }

    private static String c(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be5c5fcb", new Object[]{strArr});
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        for (String str5 : strArr) {
            if (str5.contains("sid")) {
                str = str5.substring(str5.indexOf(Constants.SIDW) + 4);
            } else if (str5.contains("trade_no")) {
                str2 = str5.substring(str5.indexOf("trade_no=") + 9);
            } else if (str5.contains("appevn")) {
                str3 = str5.substring(str5.indexOf("appevn=") + 7);
            } else if (str5.contains("payPhaseId")) {
                str4 = str5.substring(str5.indexOf("payPhaseId=") + 11);
            }
        }
        String str6 = "extern_token=\"" + str + "\"&trade_no=\"" + str2 + "\"&app_name=\"tb\"&partner=\"TAOBAO_PARTNER_ORDER\"";
        if (!StringUtils.isEmpty(str3)) {
            str6 = str6 + "&appevn=\"" + str3 + "\"";
        }
        if (StringUtils.isEmpty(str4)) {
            return str6;
        }
        return str6 + "&payPhaseId=\"" + str4 + "\"";
    }

    @Override // com.alipay.android.msp.framework.taskscheduler.MspAsyncTask
    public void onPostExecute(MspResult mspResult) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a812f1", new Object[]{this, mspResult});
            return;
        }
        super.onPostExecute((PayTask) mspResult);
        if (this.x == null) {
            return;
        }
        if (mspResult != null && StringUtils.equals(mspResult.resultStatus, "9000")) {
            OnPayListener onPayListener = this.x;
            if (onPayListener instanceof TaoBaoOnPayListener) {
                ((TaoBaoOnPayListener) onPayListener).onTaoBaoPaySuccess(this.activity, mspResult.resultStatus, mspResult.memo, mspResult.result, mspResult.openTime, mspResult.netError, mspResult.extendInfo);
            } else {
                onPayListener.onPaySuccess(this.activity, mspResult.resultStatus, mspResult.memo, mspResult.result);
            }
        } else if (mspResult != null && StringUtils.equals(mspResult.resultStatus, "10000")) {
            String str3 = mspResult.result;
            if (!StringUtils.isEmpty(str3)) {
                str3 = str3.replace("BANK_CARD-", "BANK_CARD;");
            }
            String str4 = str3;
            OnPayListener onPayListener2 = this.x;
            if (onPayListener2 instanceof TaoBaoOnPayListener) {
                ((TaoBaoOnPayListener) onPayListener2).onTaoBaoPaySuccess(this.activity, mspResult.resultStatus, mspResult.memo, str4, mspResult.openTime, mspResult.netError, mspResult.extendInfo);
            } else {
                onPayListener2.onPaySuccess(this.activity, mspResult.resultStatus, mspResult.memo, str4);
            }
        } else {
            OnPayListener onPayListener3 = this.x;
            String str5 = "操作已经取消。";
            String str6 = "";
            if (onPayListener3 instanceof TaoBaoOnPayListener) {
                TaoBaoOnPayListener taoBaoOnPayListener = (TaoBaoOnPayListener) onPayListener3;
                Activity activity = this.activity;
                if (mspResult == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ResultStatus.CANCELED.getStatus());
                    str2 = sb.toString();
                } else {
                    str2 = mspResult.resultStatus;
                }
                String str7 = str2;
                if (mspResult != null) {
                    str5 = mspResult.memo;
                }
                String str8 = str5;
                String str9 = mspResult == null ? str6 : mspResult.result;
                String str10 = mspResult == null ? str6 : mspResult.openTime;
                String str11 = mspResult == null ? str6 : mspResult.netError;
                if (mspResult != null) {
                    str6 = mspResult.extendInfo;
                }
                taoBaoOnPayListener.onTaoBaoPayFailed(activity, str7, str8, str9, str10, str11, str6);
                return;
            }
            Activity activity2 = this.activity;
            if (mspResult == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ResultStatus.CANCELED.getStatus());
                str = sb2.toString();
            } else {
                str = mspResult.resultStatus;
            }
            if (mspResult != null) {
                str5 = mspResult.memo;
            }
            if (mspResult != null) {
                str6 = mspResult.result;
            }
            onPayListener3.onPayFailed(activity2, str, str5, str6);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.activity = null;
        this.z = null;
        this.x = null;
    }

    public static JSONObject getPreposeCashierRequestParams(Map<String, String> map, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("520aae1a", new Object[]{map, context}) : MspEngine.getPreposeCashierRequestParams(map, context);
    }

    public static Map<String, Object> decCashierObfs(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8b1b0467", new Object[]{str}) : MspEngine.decCashierObfs(str);
    }

    public static void getCupDirectApps(Context context, final CupDirectAppsCallback cupDirectAppsCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d018f2", new Object[]{context, cupDirectAppsCallback});
        } else if (context == null) {
        } else {
            LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "PayTask.getCupDirectApps");
            Class<?> cls = null;
            try {
                cls = Class.forName("com.alipay.android.msp.biz.thirdpay.CUPThirdPayImpl");
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            if (cls == null) {
                return;
            }
            try {
                MQPThirdPayUtils.getCupDirectApps(context, new MQPThirdPayUtils.CupDirectAppsCallback() { // from class: com.alipay.android.app.pay.PayTask.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.msp.utils.MQPThirdPayUtils.CupDirectAppsCallback
                    public void onResult(List<String> list) {
                        IpChange ipChange2 = $ipChange;
                        boolean z = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5e4abc54", new Object[]{this, list});
                            return;
                        }
                        CupDirectAppsCallback cupDirectAppsCallback2 = CupDirectAppsCallback.this;
                        if (cupDirectAppsCallback2 == null) {
                            return;
                        }
                        if (list == null || list.size() <= 0) {
                            z = false;
                        }
                        cupDirectAppsCallback2.onResult(z);
                    }
                });
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
            }
        }
    }
}
