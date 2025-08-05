package com.taobao.login4android.biz.uninstall;

import android.os.Build;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.service.UninstallService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class UninstallManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_KEY = "default";
    private static UninstallManager instance;
    private static final Map<String, UninstallService> services;

    static {
        kge.a(1566303122);
        instance = null;
        services = new HashMap();
    }

    public static synchronized UninstallManager getInstance() {
        synchronized (UninstallManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UninstallManager) ipChange.ipc$dispatch("4eca2ff1", new Object[0]);
            }
            if (instance == null) {
                instance = new UninstallManager();
            }
            return instance;
        }
    }

    private UninstallManager() {
        try {
            services.put("default", (UninstallService) Class.forName("com.taobao.login4android.uninstall.DefaultUninstallServiceImpl").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (!"oppo".equalsIgnoreCase(Build.BRAND)) {
                return;
            }
            services.put("oppo", (UninstallService) Class.forName("com.taobao.login4android.uninstall.OppoUninstallServiceImpl").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public UninstallService getService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UninstallService) ipChange.ipc$dispatch("d5675c0a", new Object[]{this});
        }
        String str = Build.BRAND;
        if (str != null && services.containsKey(str.toLowerCase())) {
            UninstallService uninstallService = services.get(str.toLowerCase());
            if (uninstallService.isSupport()) {
                return uninstallService;
            }
            UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_service_is_not_support", null);
        }
        return services.get("default");
    }

    public UninstallService getDefaultService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UninstallService) ipChange.ipc$dispatch("4833bbf", new Object[]{this}) : services.get("default");
    }

    public void saveSessionData(SessionList sessionList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1c1", new Object[]{this, sessionList});
        } else if (getService() == null || sessionList == null || sessionList.sessionModels == null || sessionList.sessionModels.size() == 0) {
        } else {
            getService().saveSessionData(sessionList.sessionModels);
        }
    }

    public void clearSessionData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21c7dda", new Object[]{this});
        } else if (getService() == null) {
        } else {
            getService().clearSessionData();
        }
    }

    public static boolean checkIsLoggingIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2de643d", new Object[0])).booleanValue() : LoginStatus.isLogining();
    }

    public void triggerRelogin(CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96771580", new Object[]{this, commonDataCallback});
        } else if (getService() == null) {
        } else {
            LoginTLogAdapter.trace("login.ReloginDelegate", "triggerRelogin service:" + getService().getClass().getName());
            getService().triggerRelogin(commonDataCallback);
        }
    }
}
