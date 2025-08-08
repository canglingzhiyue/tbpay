package com.taobao.login4android.init;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.c;
import com.taobao.login4android.TaoBaoLoginInitializer;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.monitor.adapter.b;
import com.taobao.tao.TaobaoApplication;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class LoginInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PARAM_FORCE_THREAD = "loginScheduleAsync";
    private static final String TAG = "login.LoginInitializer1";

    static {
        kge.a(-1303676358);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        String processName = TaobaoApplication.getProcessName(application);
        String str = "LoginInitializer init() called with: application = [" + application + "], params = [" + hashMap + "],currentProcessName=" + processName;
        Login.init(application.getApplicationContext());
        if ("com.taobao.taobao".equals(processName)) {
            try {
                b.a("login_sdk_pre_init", "true");
                if (hashMap != null && hashMap.containsKey(PARAM_FORCE_THREAD)) {
                    z = true;
                }
                TaoBaoLoginInitializer.init(application, z);
                UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "login_sdk_pre_init_enabled", null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                preInitIfNeed(application);
            } catch (Exception unused) {
            }
            try {
                registerFeatureComponentLoader(application);
            } catch (Exception unused2) {
            }
        }
        tryToAttachDebugTools(application);
    }

    private void tryToAttachDebugTools(Application application) {
        try {
            Method declaredMethod = Class.forName("com.taobao.login4android.debugtools.DebugToolsInitializer").getDeclaredMethod("init", Application.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, application);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void registerFeatureComponentLoader(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a8f13b", new Object[]{this, application});
            return;
        }
        try {
            if (!LoginSwitch.getSwitch("login_init_register_component_loader", "true")) {
                return;
            }
            LoginTLogAdapter.trace(TAG, "registerFeatureComponentLoader: ");
            c.Companion.a().a("login4taobao", new c.InterfaceC0628c() { // from class: com.taobao.login4android.init.LoginInitializer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.appbundle.c.InterfaceC0628c
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    LoginTLogAdapter.trace(LoginInitializer.TAG, "onFeatureComponentLoaded() called with: componentName = [" + str + riy.ARRAY_END_STR);
                    TaoBaoLoginInitializer.init(application);
                    UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "login_init_component_loaded", null);
                }
            });
        } catch (Exception e) {
            LoginTLogAdapter.trace(TAG, "registerFeatureComponentLoader: ", e);
        }
    }

    private void preInitIfNeed(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92894672", new Object[]{this, application});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.init.LoginInitializer.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        int i = LoginSwitch.getSwitch("restore_session_launch_time_limit", 0);
                        if (!StringUtils.isEmpty(Login.getOldUserId()) || LoginContext.getLaunchTimes() > i || !LoginSwitch.isInABTestRegion("init_login_sdk_speed_up_uninstall", 10000)) {
                            return;
                        }
                        UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_init_speed_up", null);
                        b.a("login_sdk_init_by_relogin", "true");
                        TaoBaoLoginInitializer.init(application);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
