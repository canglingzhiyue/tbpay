package com.taobao.login4android.uninstall;

import android.text.TextUtils;
import android.util.Log;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.AutoLoginCallback;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.UninstallService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.biz.autologin.AutoLoginBusiness;
import com.taobao.login4android.biz.uninstall.UninstallManager;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.InternalTokenCallback;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.login.ReloginDelegate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class DefaultUninstallServiceImpl implements UninstallService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.DefaultRelogin";

    @Override // com.ali.user.mobile.service.UninstallService
    public void clearSessionData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21c7dda", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.service.UninstallService
    public boolean isSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8a2150", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void access$000(DefaultUninstallServiceImpl defaultUninstallServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45552e87", new Object[]{defaultUninstallServiceImpl, str});
        } else {
            defaultUninstallServiceImpl.stepUT(str);
        }
    }

    public static /* synthetic */ void access$100(DefaultUninstallServiceImpl defaultUninstallServiceImpl, String str, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22eae1d", new Object[]{defaultUninstallServiceImpl, str, commonDataCallback});
        } else {
            defaultUninstallServiceImpl.step7(str, commonDataCallback);
        }
    }

    public static /* synthetic */ void access$200(DefaultUninstallServiceImpl defaultUninstallServiceImpl, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9c1d1d", new Object[]{defaultUninstallServiceImpl, str, str2, str3});
        } else {
            defaultUninstallServiceImpl.failUT(str, str2, str3);
        }
    }

    public static /* synthetic */ void access$300(DefaultUninstallServiceImpl defaultUninstallServiceImpl, CommonDataCallback commonDataCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc51108", new Object[]{defaultUninstallServiceImpl, commonDataCallback, new Integer(i), str});
        } else {
            defaultUninstallServiceImpl.failCallback(commonDataCallback, i, str);
        }
    }

    public static /* synthetic */ void access$400(DefaultUninstallServiceImpl defaultUninstallServiceImpl, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2587548", new Object[]{defaultUninstallServiceImpl, str, hashMap});
        } else {
            defaultUninstallServiceImpl.track(str, hashMap);
        }
    }

    @Override // com.ali.user.mobile.service.UninstallService
    public void triggerRelogin(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96771580", new Object[]{this, commonDataCallback});
            return;
        }
        LoginTLogAdapter.trace(TAG, "relogin triggerRelogin: default  impl start");
        stepUT("restore_session_default_start");
        final NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
        if (numberAuthService != null && LoginSwitch.getSwitch("default_uninstall_relogin", "true")) {
            numberAuthService.getLoginMaskPhone(LoginSwitch.getSwitch("default_restore_session_get_phone_timeout", 5000), "uninstallDefault", new CommonDataCallback() { // from class: com.taobao.login4android.uninstall.DefaultUninstallServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.CommonDataCallback
                public void onSuccess(Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        return;
                    }
                    LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_step6");
                    DefaultUninstallServiceImpl.access$000(DefaultUninstallServiceImpl.this, "doRelogin_step6");
                    DefaultUninstallServiceImpl.access$100(DefaultUninstallServiceImpl.this, map.get("number"), commonDataCallback);
                }

                @Override // com.ali.user.mobile.callback.CommonDataCallback
                public void onFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_gap6");
                    DefaultUninstallServiceImpl.access$200(DefaultUninstallServiceImpl.this, String.valueOf(i), str, "doRelogin_gap6");
                    if (LoginSwitch.getSwitch("closeCompensate", "false")) {
                        DefaultUninstallServiceImpl.access$000(DefaultUninstallServiceImpl.this, "doRelogin_CloseCompensate");
                        LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_CloseCompensate");
                        DefaultUninstallServiceImpl.access$300(DefaultUninstallServiceImpl.this, commonDataCallback, -3, "closeCompensate=true");
                        return;
                    }
                    DefaultUninstallServiceImpl.access$300(DefaultUninstallServiceImpl.this, commonDataCallback, -3, "closeCompensate=false");
                    final long currentTimeMillis = System.currentTimeMillis();
                    numberAuthService.addPrefetchResultObserver(new NumberAuthService.PrefetchResultObserver() { // from class: com.taobao.login4android.uninstall.DefaultUninstallServiceImpl.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.service.NumberAuthService.PrefetchResultObserver
                        public void onResult(Map<String, String> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("14d0b3c2", new Object[]{this, map});
                                return;
                            }
                            numberAuthService.removePrefetchResultObserver(this);
                            DefaultUninstallServiceImpl.access$400(DefaultUninstallServiceImpl.this, "restore_get_phone_by_notify_default", null);
                            LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "restore_get_phone_by_notify_default");
                            if (!TextUtils.equals(map.get("scene"), "networkConnected")) {
                                DefaultUninstallServiceImpl.access$300(DefaultUninstallServiceImpl.this, commonDataCallback, -4, "not networkConnected scene");
                                return;
                            }
                            String str2 = map.get("number");
                            if (TextUtils.isEmpty(str2)) {
                                DefaultUninstallServiceImpl.access$300(DefaultUninstallServiceImpl.this, commonDataCallback, -5, "number is null");
                                return;
                            }
                            DefaultUninstallServiceImpl.access$400(DefaultUninstallServiceImpl.this, "fetchPhoneCompensateSuccess_default", null);
                            LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "fetchPhoneCompensateSuccess_default");
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 - currentTimeMillis <= 10000) {
                                LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "valideIntervalSuccess_default");
                                DefaultUninstallServiceImpl.access$400(DefaultUninstallServiceImpl.this, "valideIntervalSuccess_default", null);
                                DefaultUninstallServiceImpl.access$100(DefaultUninstallServiceImpl.this, str2, commonDataCallback);
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("duration", String.valueOf(currentTimeMillis2 - currentTimeMillis));
                            DefaultUninstallServiceImpl.access$400(DefaultUninstallServiceImpl.this, "valideIntervalFail_default", hashMap);
                            LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "valideIntervalFail_default");
                            DefaultUninstallServiceImpl.access$300(DefaultUninstallServiceImpl.this, commonDataCallback, -6, "valideIntervalFail");
                        }
                    });
                }
            });
        } else {
            failCallback(commonDataCallback, -2, "service null or orange null");
        }
    }

    private void track(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59b4297", new Object[]{this, str, hashMap});
        } else {
            UserTrackAdapter.sendUserTrack("page_login_restore_session", str, hashMap);
        }
    }

    private void step7(String str, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a314e9", new Object[]{this, str, commonDataCallback});
            return;
        }
        LoginTLogAdapter.trace(TAG, "step7");
        boolean z = LoginSwitch.getSwitch("checkLoginingBefore", "false");
        if (z) {
            if (UninstallManager.checkIsLoggingIn()) {
                failUT("-3", "isLogining", "doRelogin_gap7_isLogining");
                return;
            }
            LoginStatus.compareAndSetLogining(false, true);
        }
        AutoLoginBusiness.genUninstallToken(str, new AnonymousClass2(z, commonDataCallback));
    }

    /* renamed from: com.taobao.login4android.uninstall.DefaultUninstallServiceImpl$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass2 implements InternalTokenCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CommonDataCallback f17971a;
        public final /* synthetic */ boolean c;

        public AnonymousClass2(boolean z, CommonDataCallback commonDataCallback) {
            this.c = z;
            this.f17971a = commonDataCallback;
        }

        @Override // com.taobao.login4android.login.InternalTokenCallback
        public void onSucess(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ef46cb4", new Object[]{this, str});
                return;
            }
            DefaultUninstallServiceImpl.access$000(DefaultUninstallServiceImpl.this, "doRelogin_step7");
            LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_step7");
            ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getToken(new NumAuthTokenCallback() { // from class: com.taobao.login4android.uninstall.DefaultUninstallServiceImpl.2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                public void onGetAuthTokenSuccess(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20cbbe7a", new Object[]{this, str2});
                        return;
                    }
                    LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_step8");
                    DefaultUninstallServiceImpl.access$000(DefaultUninstallServiceImpl.this, "doRelogin_step8");
                    LoginController.getInstance().doReloginWithCallback(AnonymousClass2.this.c, str, str2, true, new AutoLoginCallback() { // from class: com.taobao.login4android.uninstall.DefaultUninstallServiceImpl.2.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.model.AutoLoginCallback
                        public void onSuccess() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                                return;
                            }
                            LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_step9");
                            DefaultUninstallServiceImpl.access$000(DefaultUninstallServiceImpl.this, "doRelogin_step9");
                            if (AnonymousClass2.this.c) {
                                LoginStatus.resetLoginFlag();
                            }
                            if (AnonymousClass2.this.f17971a == null) {
                                return;
                            }
                            AnonymousClass2.this.f17971a.onSuccess(new HashMap());
                        }

                        @Override // com.ali.user.mobile.model.AutoLoginCallback
                        public void onBizFail(int i, String str3) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i), str3});
                                return;
                            }
                            if (AnonymousClass2.this.c) {
                                LoginStatus.resetLoginFlag();
                            }
                            DefaultUninstallServiceImpl.access$200(DefaultUninstallServiceImpl.this, String.valueOf(i), str3, "doRelogin_gap9");
                            LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_gap9");
                            DefaultUninstallServiceImpl.access$300(DefaultUninstallServiceImpl.this, AnonymousClass2.this.f17971a, i, str3);
                        }

                        @Override // com.ali.user.mobile.model.AutoLoginCallback
                        public void onNetworkError() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("933d2000", new Object[]{this});
                                return;
                            }
                            if (AnonymousClass2.this.c) {
                                LoginStatus.resetLoginFlag();
                            }
                            DefaultUninstallServiceImpl.access$200(DefaultUninstallServiceImpl.this, "-1", "networkError", "doRelogin_gap9");
                            LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_gap9 networkError");
                            DefaultUninstallServiceImpl.access$300(DefaultUninstallServiceImpl.this, AnonymousClass2.this.f17971a, -1, "networkError");
                        }
                    });
                }

                @Override // com.ali.user.mobile.model.NumAuthTokenCallback
                public void onGetAuthTokenFail(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("27f95aee", new Object[]{this, new Integer(i), str2});
                        return;
                    }
                    if (AnonymousClass2.this.c) {
                        LoginStatus.resetLoginFlag();
                    }
                    DefaultUninstallServiceImpl.access$200(DefaultUninstallServiceImpl.this, String.valueOf(i), str2, "doRelogin_gap8");
                    LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_gap8");
                    DefaultUninstallServiceImpl.access$300(DefaultUninstallServiceImpl.this, AnonymousClass2.this.f17971a, i, str2);
                }
            });
        }

        @Override // com.taobao.login4android.login.InternalTokenCallback
        public void onFail(String str, String str2) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            if (this.c) {
                LoginStatus.resetLoginFlag();
            }
            DefaultUninstallServiceImpl.access$200(DefaultUninstallServiceImpl.this, str, str2, "doRelogin_gap7");
            LoginTLogAdapter.trace(DefaultUninstallServiceImpl.TAG, "doRelogin_gap7");
            if (TextUtils.equals("14145", str)) {
                z = LoginSwitch.getSwitch("uninstallTagCaseNoHistory", "true");
            } else if (TextUtils.equals("14148", str)) {
                z = LoginSwitch.getSwitch("uninstallTagCaseBlockList", "false");
            } else {
                z = LoginSwitch.getSwitch("uninstallTagCaseGenTokenFail", "true");
            }
            if (z) {
                ReloginDelegate.setReloginOnce();
            }
            int i = -2;
            try {
                i = Integer.parseInt(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            DefaultUninstallServiceImpl.access$300(DefaultUninstallServiceImpl.this, this.f17971a, i, str2);
        }
    }

    private void failCallback(CommonDataCallback commonDataCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7ef0d2", new Object[]{this, commonDataCallback, new Integer(i), str});
        } else if (commonDataCallback == null) {
        } else {
            commonDataCallback.onFail(i, str);
        }
    }

    @Override // com.ali.user.mobile.service.UninstallService
    public void saveSessionData(List<SessionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c652a59b", new Object[]{this, list});
        } else {
            LoginTLogAdapter.e(TAG, "saveSessionData");
        }
    }

    private void failUT(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e61722", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", str);
        hashMap.put("message", str2);
        Log.e("login.restore", str3 + ",code=" + str + ",msg=" + str2);
        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, str3, hashMap);
    }

    private void stepUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922756bc", new Object[]{this, str});
            return;
        }
        Log.e("login.restore", str);
        UserTrackAdapter.sendUT(str);
    }
}
