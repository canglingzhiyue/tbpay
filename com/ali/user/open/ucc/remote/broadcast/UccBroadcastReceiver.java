package com.ali.user.open.ucc.remote.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.cookies.CookieManagerWrapper;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.service.MemberExecutorService;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.util.FileUtils;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import tb.kge;

/* loaded from: classes2.dex */
public class UccBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.LoginBroadcastReceiver";

    static {
        kge.a(-2025553896);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            String action = intent.getAction();
            if (StringUtils.equals(action, UccResultAction.NOTIFY_UCC_LOGIN_SUCCESS.name())) {
                final String stringExtra = intent.getStringExtra("site");
                String stringExtra2 = intent.getStringExtra("process");
                if (!ConfigManager.getInstance().isMultiProcessEnable || StringUtils.isEmpty(stringExtra) || StringUtils.equals(stringExtra2, CommonUtils.getProcessName(context))) {
                    return;
                }
                ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postTask(new Runnable() { // from class: com.ali.user.open.ucc.remote.broadcast.UccBroadcastReceiver.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            CookieManagerWrapper.INSTANCE.refreshCookie(stringExtra);
                        }
                    }
                });
            } else if (ConfigManager.getInstance().isMultiProcessEnable && StringUtils.equals(action, UccResultAction.NOTIFY_UCC_LOGOUT.name())) {
                final String stringExtra3 = intent.getStringExtra("site");
                ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postTask(new Runnable() { // from class: com.ali.user.open.ucc.remote.broadcast.UccBroadcastReceiver.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            CookieManagerWrapper.INSTANCE.clearCookies(stringExtra3);
                        }
                    }
                });
            } else if (StringUtils.equals(action, LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS) || !StringUtils.equals(action, LoginBroadcastReceiver.NOTIFY_LOGOUT)) {
            } else {
                ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postTask(new Runnable() { // from class: com.ali.user.open.ucc.remote.broadcast.UccBroadcastReceiver.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        CookieManagerWrapper.INSTANCE.clearCookies("eleme", FileUtils.readFileData(KernelContext.getApplicationContext(), CookieManagerWrapper.INSTANCE.getCoookieBackupFileNameBySite("eleme")));
                        ((OauthService) AliMemberSDK.getService(OauthService.class)).logoutAll(KernelContext.getApplicationContext());
                    }
                });
            }
        }
    }
}
