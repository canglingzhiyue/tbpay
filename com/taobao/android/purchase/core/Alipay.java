package com.taobao.android.purchase.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alipay.auth.mobile.common.AlipayAuthConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.helper.g;
import com.taobao.android.t;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.login4android.api.Login;
import com.taobao.tao.util.NavUrls;
import tb.kge;

/* loaded from: classes6.dex */
public class Alipay {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FROM = "from";
    public static final String KEY_ORDER_ID = "orderids";
    public static final String KEY_SIGN_STR = "signStr";
    public static final String KEY_SIMPLE_PAY = "simplepay";
    public static final String KEY_SUCCESS_URL = "backURL";
    public static final String KEY_UNSUCCESS_URL = "unSuccessUrl";
    public static final String KEY_WAP_PAY_URL = "alipayURL";

    static {
        kge.a(1419726367);
    }

    public static void a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{context, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (string = jSONObject2.getString(AlipayAuthConstant.SIGN_DATA)) == null) {
        } else {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("BIND_ALIPAY_SUCCESS");
                intentFilter.addAction("BIND_ALIPAY_FAILED");
                context.registerReceiver(new LoginBroadcastReceiver(), intentFilter);
                Login.bindAlipay("login", string);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-670872148);
        }

        private LoginBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            context.unregisterReceiver(this);
            UnifyLog.d("Alipay", com.taobao.browser.commonUrlFilter.LoginBroadcastReceiver.TAG, "收到广播,跳转到订单待付款");
            Bundle bundle = new Bundle();
            bundle.putString(g.IN_PARAM_ORDER_LIST_TYPE, "WAIT_TO_PAY");
            t.a().a(context).a(bundle).a(NavUrls.NAV_URL_ORDER_LIST[0]);
        }
    }
}
