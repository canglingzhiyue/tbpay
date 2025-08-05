package com.taobao.taobao.internal.helper;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_ACTION = "TBCashierStageBroadcast";

    public static void a(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602ff7e0", new Object[]{context, str, str2, new Boolean(z)});
            return;
        }
        a(context, str, str2);
        a(context, z);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        a(str, str2);
        b(context, "afterPayment", str2);
        b(context, true);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        b(context, "beforePayment", null);
        b(context, false);
    }

    private static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ALIPAY_ACTION);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("from", "tbPay");
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("result", str2);
        }
        intent.putExtra("stage", str);
        intent.putExtra("blockSplashADDuration", "3600");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    private static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(z ? "com.alipay.android.app.pay.ACTION_PAY_SUCCESS" : "com.alipay.android.app.pay.ACTION_PAY_FAILED");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("action", (Object) str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("result", (Object) str2);
        }
        new com.alibaba.alibity.container.broadcast.b().a("tbPay", CashdeskConstants.TB_CASH_DESK_BROADCAST_RESULT_ACTION, jSONObject);
    }

    private static void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{context, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setAction("TBBootImageForbiddenModeBroadcast");
        intent.putExtra("stage", z ? "stopForbidden" : "startForbidden");
        intent.putExtra("timeout", "3600");
        intent.putExtra("bizId", "TBBuy");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
