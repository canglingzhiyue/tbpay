package com.alipay.mobile.common.netsdkextdependapi.appinfo;

/* loaded from: classes3.dex */
public interface AppInfoManager {
    <T> T findServiceByInterface(String str);

    String getAppIdForMPaaS();

    String getAppKeyForMPaaS();

    String getAwid();

    String getChannelId();

    String getLastTagId();

    String getProductId();

    String getProductName();

    String getProductVersion();

    String getReleaseCode();

    String getReleaseType();

    String getTrackerID();

    String getWorkspaceIdForMPaaS();

    boolean isBackgroundRunning();

    boolean isDebuggable();

    boolean isReleaseTypeDev();

    boolean isReleaseTypeRC();

    void loadLibrary(String str);
}
