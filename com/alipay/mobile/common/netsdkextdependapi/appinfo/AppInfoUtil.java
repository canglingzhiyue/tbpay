package com.alipay.mobile.common.netsdkextdependapi.appinfo;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class AppInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final String getProductVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34f467a", new Object[0]) : a().getProductVersion();
    }

    public static final String getTrackerID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ea51f7c", new Object[0]) : a().getTrackerID();
    }

    public static final String getProductId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d388ffc5", new Object[0]) : a().getProductId();
    }

    public static final String getReleaseType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6eda812e", new Object[0]) : a().getReleaseType();
    }

    public static final boolean isReleaseTypeDev() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a5de1c9", new Object[0])).booleanValue() : a().isReleaseTypeDev();
    }

    public static final boolean isReleaseTypeRC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("329c9d53", new Object[0])).booleanValue() : a().isReleaseTypeRC();
    }

    public static final boolean isDebuggable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue() : a().isDebuggable();
    }

    public static final String getReleaseCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5542a05b", new Object[0]) : a().getReleaseCode();
    }

    public static final String getChannelId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ac47931", new Object[0]) : a().getChannelId();
    }

    public static final String getProductName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("625b295", new Object[0]) : a().getProductName();
    }

    public static final String getAppIdForMPaaS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca24750c", new Object[0]) : a().getAppIdForMPaaS();
    }

    public static final String getWorkspaceIdForMPaaS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38fde398", new Object[0]) : a().getWorkspaceIdForMPaaS();
    }

    public static final String getAppKeyForMPaaS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff13adbe", new Object[0]) : a().getAppKeyForMPaaS();
    }

    public static final boolean isBackgroundRunning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a678db2", new Object[0])).booleanValue() : a().isBackgroundRunning();
    }

    public static final String getAwid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be6c2512", new Object[0]) : a().getAwid();
    }

    public static final String getLastTagId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5964bbf0", new Object[0]) : a().getLastTagId();
    }

    public static final void loadLibrary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5824adc6", new Object[]{str});
        } else {
            a().loadLibrary(str);
        }
    }

    public static <T> T findServiceByInterface(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("4377b7bb", new Object[]{str}) : (T) a().findServiceByInterface(str);
    }

    private static final AppInfoManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppInfoManager) ipChange.ipc$dispatch("b01e88e8", new Object[0]) : AppInfoManagerFactory.getInstance().getDefaultBean();
    }
}
