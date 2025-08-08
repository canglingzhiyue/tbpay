package com.taobao.update.dynamicfeature;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.k;
import com.alibaba.android.split.p;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.framework.UpdateRuntime;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bgy;
import tb.kge;
import tb.ren;
import tb.rfy;
import tb.rgp;
import tb.rgq;

/* loaded from: classes9.dex */
public class FeatureDynamicJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLEAR_FLEXA_DATA = "clearFlexaData";
    private static final String CLOSE_AUTO_DOWNLOAD = "disable_auto_download";
    private static final String CLOSE_FLEXA = "closeFlexa";
    private static final String DEFFERED_DOWNLOAD_FEATURES_ENABLED = "deffered_download_feature_enabled";
    private static final String DYNAMIC_FEATURES_CONFIG = "dynamic_features_config";
    private static final String FLEXA_FORCE_ENABLED = "flexa_force_enabled";
    private static final String GET_CAN_USE_HISTORY_APK_FEATURES = "getCanUseHistoryApkFeatures";
    private static final String GET_INSIDEOF_APK_FEATURES = "getInsideOfApkFeatures";
    private static final String GET_INSTALLED_DYNAMICFEATURES = "getInstallDynamicFeatures";
    private static final String JSDynamicBridge = "JSDynamicBridge";
    private static final String OPEN_FLEXA = "openFlexa";
    private static SharedPreferences mSharedPreferences;
    private static SharedPreferences sharedPreferences;

    public static /* synthetic */ Object ipc$super(FeatureDynamicJSBridge featureDynamicJSBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1805363744);
        mSharedPreferences = UpdateRuntime.getContext().getSharedPreferences("dynamic_flexa_switch", 0);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            q.a(JSDynamicBridge, (Class<? extends e>) FeatureDynamicJSBridge.class, true);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str.equals(CLOSE_FLEXA)) {
            rfy.getInstance().clearCache();
            r rVar = new r();
            rVar.a("info", "close Flexa");
            wVCallBackContext.success(rVar);
            UpdateRuntime.toast("即将关闭Flexa动态加载开关,之前数据将被清楚...,所有feature都不会加载");
            try {
                stopApplication(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (str.equals(OPEN_FLEXA)) {
            r rVar2 = new r();
            rVar2.a("info", "open Flexa!");
            wVCallBackContext.success(rVar2);
            UpdateRuntime.toast("即将打开Flexa动态加载开关,所有feature可以正常下载，安装");
            setFlexaEnabled(UpdateRuntime.getContext(), true);
        } else if (str.equals(CLOSE_AUTO_DOWNLOAD)) {
            r rVar3 = new r();
            rVar3.a("info", "close auto download!");
            wVCallBackContext.success(rVar3);
            UpdateRuntime.toast("即将关闭静默下载，主动触发的安装不会关闭");
            try {
                setDefferedDownloadFeaturesEnabled(UpdateRuntime.getContext(), false);
                stopApplication(false);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (str.equals(CLEAR_FLEXA_DATA)) {
            r rVar4 = new r();
            rVar4.a("info", "clear flexa data");
            wVCallBackContext.success(rVar4);
            UpdateRuntime.toast("清除安装数据,可以测试首装push场景");
            try {
                stopApplication(false);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        } else if (str.equals(GET_INSTALLED_DYNAMICFEATURES)) {
            r rVar5 = new r();
            rVar5.a("info", JSON.toJSON(getInstalledDynamicFeatures()));
            wVCallBackContext.success(rVar5);
            UpdateRuntime.toast("获取已经装的dynamicFeature");
        } else if (str.equals(GET_INSIDEOF_APK_FEATURES)) {
            r rVar6 = new r();
            rVar6.a("info", getInsideApkFeatures());
            wVCallBackContext.success(rVar6);
            UpdateRuntime.toast("获取已经装的dynamicFeature");
        } else if (str.equals(GET_CAN_USE_HISTORY_APK_FEATURES)) {
            r rVar7 = new r();
            rVar7.a("info", getCanUseHistoryFeatures());
            wVCallBackContext.success(rVar7);
            UpdateRuntime.toast("获取可复用的历史feature");
        }
        return true;
    }

    private Map<String, String> getInstalledDynamicFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d37e8b4", new Object[]{this});
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        com.alibaba.android.split.manager.b c = ((com.alibaba.android.split.manager.a) k.a()).c();
        for (String str : p.a().a()) {
            concurrentHashMap.put(str, c.b(str).a().getAbsolutePath());
        }
        return concurrentHashMap;
    }

    private List<String> getCanUseHistoryFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("164efdbc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : com.android.tools.bundleInfo.b.a().j()) {
            if (!StringUtils.isEmpty(com.android.tools.bundleInfo.b.a().c(str).matchedAppVersion)) {
                arrayList.add(str + "------>" + com.android.tools.bundleInfo.b.a().c(str).matchedAppVersion);
            }
        }
        return arrayList;
    }

    private List<String> getInsideApkFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("121dc759", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : com.android.tools.bundleInfo.b.a().j()) {
            String str2 = UpdateRuntime.getContext().getApplicationInfo().nativeLibraryDir;
            String str3 = com.android.tools.bundleInfo.b.a().c(str).md5;
            if (rgp.isMd5Same(str3, new File(str2, "lib" + str + bgy.SO_EXTENSION).getPath())) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static SharedPreferences getSharePreferences(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("71f5d2c6", new Object[]{context});
        }
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("dynamic_features_config", 0);
        }
        return sharedPreferences;
    }

    public static boolean setDefferedDownloadFeaturesEnabled(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a545a4", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        SharedPreferences.Editor edit = getSharePreferences(context).edit();
        return edit.putBoolean("deffered_download_feature_enabled_" + rgq.getVersionName(), z).commit();
    }

    public static boolean setFlexaEnabled(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3f9c0b2", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        SharedPreferences.Editor edit = getSharePreferences(context).edit();
        return edit.putBoolean("flexa_force_enabled_" + rgq.getVersionName(), z).commit();
    }

    public static void delete(File file) throws IOException {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258726a9", new Object[]{file});
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                delete(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    public static void stopApplication(boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7493ff", new Object[]{new Boolean(z)});
            return;
        }
        File p = k.a().b().p();
        if (z) {
            setFlexaEnabled(UpdateRuntime.getContext(), false);
        }
        delete(p);
        ren.getInstance().clearActivityStack();
        if (!rgq.getProcessName(UpdateRuntime.getContext()).contains(UpdateRuntime.getContext().getPackageName())) {
            return;
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) UpdateRuntime.getContext().getSystemService("activity")).getRunningAppProcesses();
            for (int i = 0; i < runningAppProcesses.size(); i++) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                String str = runningAppProcessInfo.processName;
                if (str.contains(UpdateRuntime.getContext().getPackageName() + ":")) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        } catch (Exception unused) {
        }
        Process.killProcess(Process.myPid());
    }
}
