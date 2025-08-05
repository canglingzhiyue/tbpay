package com.ut.share;

import android.content.Context;
import android.content.Intent;
import com.alipay.share.sdk.openapi.IAPAPIEventHandler;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.IDDAPIEventHandler;
import com.ut.share.executor.AlipayExecutor;
import com.ut.share.executor.DingTalkExecutor;
import com.ut.share.executor.ExecutorFactory;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareCallbackHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1755602152);
    }

    public static void handleAlipayResponse(Intent intent, IAPAPIEventHandler iAPAPIEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d2df7d", new Object[]{intent, iAPAPIEventHandler});
            return;
        }
        AlipayExecutor alipayExecutor = (AlipayExecutor) ExecutorFactory.getInstance().findExecutor(SharePlatform.Alipay);
        if (alipayExecutor == null || alipayExecutor.getAlipay() == null) {
            return;
        }
        alipayExecutor.getAlipay().handleShareResponse(intent, iAPAPIEventHandler);
    }

    public static void handleDingTalkResponse(Context context, Intent intent, IDDAPIEventHandler iDDAPIEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fb988a", new Object[]{context, intent, iDDAPIEventHandler});
            return;
        }
        DingTalkExecutor dingTalkExecutor = (DingTalkExecutor) ExecutorFactory.getInstance().findExecutor(SharePlatform.DingTalk);
        if (dingTalkExecutor == null || dingTalkExecutor.getDingTalk() == null) {
            return;
        }
        dingTalkExecutor.getDingTalk().handleShareResponse(context, intent, iDDAPIEventHandler);
    }
}
