package com.ali.user.open.ut;

import android.app.Activity;
import android.text.TextUtils;
import com.ali.user.open.core.service.UserTrackerService;
import com.ali.user.open.core.trace.SDKLogger;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class UserTrackerImpl implements UserTrackerService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.UserTraceImpl";

    @Override // com.ali.user.open.core.service.UserTrackerService
    public void send(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6cd24c", new Object[]{this, str, map});
        } else {
            send("", str, map);
        }
    }

    @Override // com.ali.user.open.core.service.UserTrackerService
    public void send(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88a1782", new Object[]{this, str, str2, map});
            return;
        }
        try {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
            Map<String, String> appInfo = getAppInfo();
            StringBuilder sb = new StringBuilder();
            sb.append("[LoginUtAnalytics] sendUT, page=");
            if (!TextUtils.isEmpty(str)) {
                uTCustomHitBuilder.setEventPage(str);
                sb.append(str);
            }
            sb.append(", arg1=");
            sb.append(str2);
            sb.append(",args=");
            if (map != null) {
                appInfo.putAll(map);
                sb.append(JSON.toJSONString(map));
            }
            uTCustomHitBuilder.setProperties(appInfo);
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            SDKLogger.d("login.UserTraceImpl", sb.toString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.service.UserTrackerService
    public void sendControl(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8316d0ab", new Object[]{this, str, str2, str3, map});
            return;
        }
        try {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, str2);
            if (!TextUtils.isEmpty(str3)) {
                uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, str3);
            }
            uTControlHitBuilder.setProperties(map);
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.service.UserTrackerService
    public void updatePageName(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d91b77f", new Object[]{this, activity, str, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(activity, str);
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(activity, str);
            if (map == null) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, map);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.service.UserTrackerService
    public void skipPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3613c7", new Object[]{this, activity});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(activity);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.service.UserTrackerService
    public void pageDisAppear(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fccd8d", new Object[]{this, activity});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static Map<String, String> getAppInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8df17875", new Object[0]) : new HashMap();
    }
}
