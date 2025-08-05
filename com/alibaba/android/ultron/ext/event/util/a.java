package com.alibaba.android.ultron.ext.event.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.android.ultron.ext.event.util.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.android.t;
import com.taobao.tao.util.NavUrls;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_PAY_RESULT_FAILED_ACTION = "com.alipay.android.app.pay.ACTION_PAY_FAILED";
    public static final String ALIPAY_PAY_RESULT_SUCESS_ACTION = "com.alipay.android.app.pay.ACTION_PAY_SUCCESS";
    public static final String KEY_ALIPAY_BLOCK = "alipayBlock";
    public static final String KEY_FROM = "from";
    public static final String KEY_ORDER_ID = "orderids";
    public static final String KEY_SIGN_STR = "signStr";
    public static final String KEY_SIMPLE_PAY = "simplepay";
    public static final String KEY_SUCCESS_URL = "backURL";
    public static final String KEY_UNSUCCESS_URL = "unSuccessUrl";
    public static final String KEY_WAP_PAY_URL = "alipayURL";

    /* renamed from: com.alibaba.android.ultron.ext.event.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0089a {
        void a(Context context, Intent intent);

        void b(Context context, Intent intent);
    }

    static {
        kge.a(1630557244);
    }

    public static void a(Context context, JSONObject jSONObject, InterfaceC0089a interfaceC0089a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b231ac83", new Object[]{context, jSONObject, interfaceC0089a});
        } else if (a(context, jSONObject)) {
        } else {
            String string = jSONObject.getString("from");
            String string2 = jSONObject.getString("orderids");
            String string3 = jSONObject.getString("signStr");
            String string4 = jSONObject.getString(FullPage.PARAM_BACK2Tab2URL);
            String string5 = jSONObject.containsKey("simplePay") ? jSONObject.getString("simplePay") : "1";
            String string6 = jSONObject.getString("unSuccessUrl");
            String string7 = jSONObject.getString("alipayURL");
            HashMap hashMap = new HashMap();
            hashMap.put("from", string);
            hashMap.put("orderids", string2);
            hashMap.put("signStr", string3);
            hashMap.put("simplepay", string5);
            hashMap.put("backURL", string4);
            hashMap.put("unSuccessUrl", string6);
            hashMap.put("alipayURL", string7);
            if (interfaceC0089a != null) {
                hashMap.put(KEY_ALIPAY_BLOCK, "true");
                a(context, interfaceC0089a);
            }
            a(context, hashMap);
        }
    }

    private static void a(Context context, final InterfaceC0089a interfaceC0089a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04090b3", new Object[]{context, interfaceC0089a});
            return;
        }
        final LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        localBroadcastManager.registerReceiver(new BroadcastReceiver() { // from class: com.alibaba.android.ultron.ext.event.util.AlipayUtil$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                if (intent.getAction().equals("com.alipay.android.app.pay.ACTION_PAY_SUCCESS")) {
                    a.InterfaceC0089a.this.a(context2, intent);
                }
                if (intent.getAction().equals("com.alipay.android.app.pay.ACTION_PAY_FAILED")) {
                    a.InterfaceC0089a.this.b(context2, intent);
                }
                localBroadcastManager.unregisterReceiver(this);
            }
        }, intentFilter);
    }

    private static boolean a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cb6e294", new Object[]{context, jSONObject})).booleanValue();
        }
        if (jSONObject != null && context != null) {
            String string = jSONObject.getString("overrideUrl");
            if (!TextUtils.isEmpty(string)) {
                Bundle bundle = new Bundle();
                for (String str : jSONObject.keySet()) {
                    bundle.putString(str, jSONObject.getString(str));
                }
                t.a().a(context).a(bundle).a(string);
                return true;
            }
        }
        return false;
    }

    private static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
            return;
        }
        map.put("result", "1");
        t.a().a(context).a(a(map).toString());
    }

    private static Uri.Builder a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri.Builder) ipChange.ipc$dispatch("6aafdc5d", new Object[]{map});
        }
        Uri.Builder buildUpon = Uri.parse(NavUrls.NAV_URL_ALIPAY).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        return buildUpon;
    }
}
