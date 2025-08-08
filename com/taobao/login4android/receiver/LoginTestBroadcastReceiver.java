package com.taobao.login4android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.jsbridge.SDKJSBridgeService;

/* loaded from: classes7.dex */
public class LoginTestBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            String action = intent.getAction();
            if (StringUtils.isEmpty(action) || !"com.ali.user.sdk.login.TEST_ACCOUNT_SSO".equals(action)) {
                return;
            }
            String stringExtra = intent.getStringExtra("token");
            if (StringUtils.isEmpty(stringExtra)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) "testAccountSso");
            jSONObject.put("token", (Object) stringExtra);
            new SDKJSBridgeService().testSsoLogin(null, jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
