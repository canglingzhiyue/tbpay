package com.taobao.android.launcher.common;

import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.speed.TBSpeed;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import com.taobao.tao.util.BuiltConfig;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.GetAppKeyFromSecurity;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Locale;
import tb.jqm;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Object> f13109a = new HashMap<>(25);

    public static HashMap<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{str});
        }
        if ("InitLoginParam".equals(str)) {
            f13109a.put("checkSessionInvalid", Boolean.valueOf(Login.checkSessionValid()));
            f13109a.put("sid", Login.getSid());
            f13109a.put("userId", Login.getUserId());
        }
        if ("InitBasicParam".equals(str)) {
            f13109a.putAll(a());
        }
        return f13109a;
    }

    public static <T> T a(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("42bc9164", new Object[]{str, t});
        }
        T t2 = (T) f13109a.get(str);
        return t2 == null ? t : t2;
    }

    public static HashMap<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[0]);
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("isDebuggable", Boolean.valueOf(jqm.a()));
        hashMap.put("process", LauncherRuntime.c);
        hashMap.put("packageName", LauncherRuntime.b);
        hashMap.put("ttid", LauncherRuntime.d);
        hashMap.put("isNextLaunch", true);
        hashMap.put("launchStartTime", Long.valueOf(LauncherRuntime.f13108a));
        hashMap.put("appVersion", LauncherRuntime.e);
        hashMap.put("packageTag", LauncherRuntime.f);
        hashMap.put("deviceId", UTDevice.getUtdid(LauncherRuntime.g));
        hashMap.put(OConstant.LAUNCH_ENVINDEX, Integer.valueOf(EnvironmentSwitcher.a()));
        hashMap.put("projectId", EnvironmentSwitcher.d());
        hashMap.put(OConstant.LAUNCH_ONLINEAPPKEY, GetAppKeyFromSecurity.getAppKey(0));
        hashMap.put(OConstant.LAUNCH_PREAPPKEY, GetAppKeyFromSecurity.getAppKey(0));
        hashMap.put("constantAppkey", Constants.appkey);
        if (jqm.a()) {
            hashMap.put(OConstant.LAUNCH_TESTAPPKEY, GetAppKeyFromSecurity.getAppKey(2));
        } else {
            hashMap.put(OConstant.LAUNCH_TESTAPPKEY, "");
        }
        hashMap.put("isUserTracklogEnable", Boolean.valueOf(BuiltConfig.getBoolean(R.string.userTrackLogEnable)));
        hashMap.put("isMiniPackage", false);
        hashMap.put("checkSessionInvalid", Boolean.valueOf(Login.checkSessionValid()));
        hashMap.put("sid", Login.getSid());
        hashMap.put("userId", Login.getUserId());
        hashMap.put("speedFlag", TBSpeed.getSpeedDesc(LauncherRuntime.g));
        hashMap.put("ngLaunch", true);
        hashMap.put("currentLocale", Locale.getDefault().getLanguage());
        hashMap.put("loginScheduleAsync", true);
        return hashMap;
    }
}
