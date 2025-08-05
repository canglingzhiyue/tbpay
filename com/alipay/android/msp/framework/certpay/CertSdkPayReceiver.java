package com.alipay.android.msp.framework.certpay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iao;

/* loaded from: classes3.dex */
public class CertSdkPayReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CertSdkPayReceiver.onReceive", iao.NEXT_TAG_RECEIVER);
        if (intent == null) {
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CertSdkPayReceiver.onReceive", "传入LiveConnectReceiver的intent为空，退出");
            return;
        }
        String stringExtra = intent.getStringExtra("certpay_session");
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CertSdkPayReceiver.onReceive", stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        String stringExtra2 = intent.getStringExtra(MspGlobalDefine.SCHEME_PAY_RESULT);
        try {
            String oldSession = CertPayManager.getInstance(context).getOldSession(stringExtra);
            LogUtil.record(2, "AlipayStore:onMspAction", "oldSession=".concat(String.valueOf(oldSession)));
            int i = -1;
            if (!TextUtils.isEmpty(oldSession)) {
                i = Integer.parseInt(oldSession);
            }
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
            if (!(mspContextByBizId instanceof MspTradeContext)) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "CertPayExitBizIdError", "CertPayExitBizIdError");
                return;
            }
            MspTradeContext mspTradeContext = (MspTradeContext) mspContextByBizId;
            MspPayResult mspPayResult = mspTradeContext.getMspPayResult();
            if (mspPayResult != null) {
                mspPayResult.setSourceResult(stringExtra2);
            }
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "CertSdkPayReceiver.exit", stringExtra2);
            mspTradeContext.exit(0);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "CertPayExitException", e);
        }
    }
}
