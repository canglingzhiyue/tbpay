package com.ali.user.open.ucc.util;

import com.ali.user.open.callback.LoginCallback;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.InitResultCallback;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.session.Session;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccService;
import com.ali.user.open.ucc.data.DefaultDataProvider;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cew;
import tb.kge;

/* loaded from: classes2.dex */
public class MtopRemoteLogin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MtopRemoteLogin";

    static {
        kge.a(-2051578584);
    }

    public static /* synthetic */ void access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            sendUT(str);
        }
    }

    public static void login(final String str, LoginCallback loginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ae1685", new Object[]{str, loginCallback});
            return;
        }
        SDKLogger.e(TAG, "TRUSTLOGIN_ENTER");
        if (System.currentTimeMillis() - UccStatus.getLastLoginTime(str) > 3000) {
            UccStatus.resetLoginFlag(str);
        }
        if (UccStatus.isLogining(str) && System.currentTimeMillis() - UccStatus.getLastLoginTime(str) < cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT) {
            UccCallbackManager.registerTrustLoginUccCallback(str, loginCallback);
            return;
        }
        UccStatus.compareAndSetLogining(str, false, true);
        UccCallbackManager.registerTrustLoginUccCallback(str, loginCallback);
        AliMemberSDK.init(KernelContext.getApplicationContext(), new InitResultCallback() { // from class: com.ali.user.open.ucc.util.MtopRemoteLogin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.callback.FailureCallback
            public void onFailure(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str2});
                }
            }

            @Override // com.ali.user.open.core.callback.InitResultCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                if (((UccService) AliMemberSDK.getService(UccService.class)).getUccDataProvider() == null) {
                    ((UccService) AliMemberSDK.getService(UccService.class)).setUccDataProvider(new DefaultDataProvider());
                }
                ((UccService) AliMemberSDK.getService(UccService.class)).trustLogin(str, (Map<String, String>) null, new UccCallback() { // from class: com.ali.user.open.ucc.util.MtopRemoteLogin.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onSuccess(String str2, Map map) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("b5e17230", new Object[]{this, str2, map});
                            return;
                        }
                        SDKLogger.e(MtopRemoteLogin.TAG, "TRUSTLOGIN_SUCCESS");
                        MtopRemoteLogin.access$000("TRUSTLOGIN_SUCCESS");
                        UccStatus.resetLoginFlag(str2);
                        if (UccCallbackManager.getTrustLoginCallbackWithSite(str2) == null) {
                            return;
                        }
                        for (LoginCallback loginCallback2 : UccCallbackManager.getTrustLoginCallbackWithSite(str2)) {
                            if (loginCallback2 != null) {
                                loginCallback2.onSuccess(null);
                            }
                        }
                        UccCallbackManager.unregisterTrustLoginCallback(str2);
                    }

                    @Override // com.ali.user.open.ucc.UccCallback
                    public void onFail(String str2, int i, String str3) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i), str3});
                            return;
                        }
                        SDKLogger.e(MtopRemoteLogin.TAG, "TRUSTLOGIN_FAIL site=" + str2 + ";code=" + i);
                        MtopRemoteLogin.access$000("TRUSTLOGIN_FAIL");
                        UccStatus.resetLoginFlag(str2);
                        if (UccCallbackManager.getTrustLoginCallbackWithSite(str2) == null) {
                            return;
                        }
                        for (LoginCallback loginCallback2 : UccCallbackManager.getTrustLoginCallbackWithSite(str2)) {
                            if (loginCallback2 != null) {
                                loginCallback2.onFailure(i, str3);
                            }
                        }
                        UccCallbackManager.unregisterTrustLoginCallback(str2);
                    }
                });
            }
        });
    }

    private static void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{str});
            return;
        }
        try {
            ((UserTrackerService) AliMemberSDK.getService(UserTrackerService.class)).send("Page_UccMtopRemoteLogin", str, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Session getSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("a5d69a45", new Object[]{str});
        }
        try {
            return ((UccService) AliMemberSDK.getService(UccService.class)).getSession(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
