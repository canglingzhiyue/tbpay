package com.taobao.message.chatv2.viewcenter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ApplicationBuildInfo;
import com.taobao.message.uikit.util.ApplicationUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class ViewCenterEnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String OS;
    public int appBuildNumber;
    public String appBundleID;
    public String appVersion;
    public String dinamicxSDKVersion;

    static {
        kge.a(678046526);
    }

    public static ViewCenterEnv newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewCenterEnv) ipChange.ipc$dispatch("35d2db2b", new Object[0]);
        }
        ViewCenterEnv viewCenterEnv = new ViewCenterEnv();
        viewCenterEnv.OS = "Android";
        viewCenterEnv.appBuildNumber = ApplicationBuildInfo.getVersionCode();
        viewCenterEnv.appBundleID = ApplicationUtil.getApplication().getPackageName();
        viewCenterEnv.appVersion = ApplicationBuildInfo.getAppVersionName();
        viewCenterEnv.dinamicxSDKVersion = "25";
        return viewCenterEnv;
    }
}
