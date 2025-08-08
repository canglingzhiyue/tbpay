package com.taobao.message.notification.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.utl.UTMini;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.message.notification.base.EnvService;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.statistic.TBS;
import com.taobao.tao.image.ImageStrategyConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.mpa;

/* loaded from: classes7.dex */
public class EnvUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ImageStrategyConfig imageStrategyConfig;
    private static Application sApplication;

    static {
        kge.a(309479467);
        imageStrategyConfig = ImageStrategyConfig.a(RemoteMessageConst.NOTIFICATION, 7201).a();
    }

    public static boolean isAppBackGround() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b377d350", new Object[0])).booleanValue() : EnvService.instance().isAppBackGround(null);
    }

    public static boolean isAppBackGround(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63a3421a", new Object[]{str})).booleanValue() : EnvService.instance().isAppBackGround(str);
    }

    public static Activity getTopActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("1d7099f3", new Object[0]) : c.b();
    }

    public static Fragment getTopFragment() {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("5eebfff8", new Object[0]);
        }
        Activity topActivity = getTopActivity();
        if (!(topActivity instanceof FragmentActivity) || (fragments = ((FragmentActivity) topActivity).getSupportFragmentManager().getFragments()) == null) {
            return null;
        }
        for (Fragment fragment : fragments) {
            Fragment topVisibleChildFragment = getTopVisibleChildFragment(fragment);
            if (topVisibleChildFragment != null) {
                return topVisibleChildFragment;
            }
            if (fragment.isVisible()) {
                return fragment;
            }
        }
        return null;
    }

    private static Fragment getTopVisibleChildFragment(Fragment fragment) {
        List<Fragment> fragments;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("a6afc914", new Object[]{fragment});
        }
        if (fragment == null) {
            return null;
        }
        if (fragment.isAdded() && (fragments = fragment.getChildFragmentManager().getFragments()) != null && fragments.size() > 0) {
            for (Fragment fragment2 : fragments) {
                Fragment topVisibleChildFragment = getTopVisibleChildFragment(fragment2);
                if (topVisibleChildFragment != null) {
                    return topVisibleChildFragment;
                }
            }
        }
        if (!fragment.isVisible()) {
            return null;
        }
        return fragment;
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (sApplication == null) {
            sApplication = getSystemApp();
        }
        return sApplication;
    }

    private static Application getSystemApp() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getAppStatusForClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81ff5be0", new Object[]{new Integer(i)});
        }
        if (i != 0) {
            return "foreground";
        }
        d a2 = c.a();
        return a2 == null ? "" : StringUtils.equals(a2.a("launchType", mpa.HOT), mpa.COLD) ? "notLaunched" : "background";
    }

    public static String getAppStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("315c6c5c", new Object[0]) : !isProcessRight(getApplication()) ? "channel" : isAppBackGround() ? "background" : "foreground";
    }

    public static boolean isProcessRight(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("359ac94e", new Object[]{context})).booleanValue() : EnvService.instance().isProcessRight(context);
    }

    public static boolean isNightMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("591cbbdc", new Object[0])).booleanValue() : (getApplication().getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static void UTShow(HashMap<String, String> hashMap, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ca03fd", new Object[]{hashMap, new Integer(i), str});
        } else if (hashMap == null || hashMap.isEmpty()) {
        } else {
            hashMap.put(StEvent.SHOW_TIME, String.valueOf(System.currentTimeMillis()));
            hashMap.put("app_status", getAppStatus());
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2201, "Page_Push_TBMSGPush_Show", Integer.valueOf(i), str, mapToArray(hashMap));
            hashMap.put("arg1", "Page_Push_TBMSGPush_Show");
            hashMap.put("url", str);
            AppMonitor.Counter.commit("MPMMessage", "PushTracker", JSON.toJSONString(hashMap), 1.0d);
        }
    }

    public static void UTClick(HashMap<String, String> hashMap, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceba6faa", new Object[]{hashMap, new Integer(i), str});
        } else if (hashMap == null || hashMap.isEmpty()) {
        } else {
            String valueOf = String.valueOf(System.currentTimeMillis());
            hashMap.put("clickTime", valueOf);
            hashMap.put("app_status", getAppStatusForClick(i));
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2101, "Page_Push_TBMSGPush_Click", Integer.valueOf(i), str, mapToArray(hashMap));
            hashMap.put("arg1", "Page_Push_TBMSGPush_Click");
            hashMap.put("url", str);
            AppMonitor.Counter.commit("MPMMessage", "PushTracker", JSON.toJSONString(hashMap), 1.0d);
            if (i != 0) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("isInAppPush", "0");
            hashMap2.put(ActivityJumpUtil.LANDING_URL, str);
            hashMap2.put("clickTime,", valueOf);
            hashMap2.put(PushConstants.KEY_PUSH_ID, hashMap.get(PushConstants.KEY_PUSH_ID));
            hashMap2.put("messageId", hashMap.get("messageId"));
            TFCCommonUtils.a(TFCCommonUtils.FlowType.MESSAGE, (String) hashMap2.get(ActivityJumpUtil.LANDING_URL), hashMap2);
        }
    }

    public static void UTPermissionShow(HashMap<String, String> hashMap, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988f0ec", new Object[]{hashMap, new Integer(i), str});
        } else if (hashMap == null || hashMap.isEmpty()) {
        } else {
            hashMap.put(StEvent.SHOW_TIME, String.valueOf(System.currentTimeMillis()));
            hashMap.put("app_status", getAppStatus());
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2201, "Page_Push_TBPermissionPush_Show", Integer.valueOf(i), str, mapToArray(hashMap));
            hashMap.put("arg1", "Page_Push_TBPermissionPush_Show");
            hashMap.put("url", str);
            AppMonitor.Counter.commit("TBPermissionPush", "PushTracker", JSON.toJSONString(hashMap), 1.0d);
        }
    }

    public static String[] mapToArray(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d9a5539", new Object[]{hashMap});
        }
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        String[] strArr = new String[entrySet.size()];
        for (Map.Entry<String, String> entry : entrySet) {
            strArr[i] = entry.getKey() + "=" + entry.getValue();
            i++;
        }
        return strArr;
    }

    public static HashMap<String, String> createUTData(String str, String str2, String str3, String str4, String str5, String str6, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d1b2b52e", new Object[]{str, str2, str3, str4, str5, str6, hashMap});
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(PushConstants.KEY_PUSH_ID, str);
        hashMap.put("messageId", str2);
        hashMap.put("innerPush", str4);
        if (!StringUtils.isEmpty(str5)) {
            hashMap.put("messageType", str5);
        }
        if (!StringUtils.isEmpty(str3)) {
            hashMap.put("bizType", str3);
        }
        if (!StringUtils.isEmpty(str6)) {
            hashMap.put("source", str6);
        }
        return hashMap;
    }
}
