package com.taobao.login4android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.config.LoginSwitch;

/* loaded from: classes7.dex */
public class StatusReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.status";
    private long mLastHandleTime;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && (System.currentTimeMillis() - this.mLastHandleTime < 60000 || !NetworkUtil.isNetworkConnected())) {
                return;
            }
            this.mLastHandleTime = System.currentTimeMillis();
            if (!LoginSwitch.getSwitch("enable_auth_prefetch", "true") || ServiceFactory.getService(NumberAuthService.class) == null || !((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).needPrefetch() || !TextUtils.isEmpty(Login.getLoginToken())) {
                return;
            }
            ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).preFecth("networkConnected");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
