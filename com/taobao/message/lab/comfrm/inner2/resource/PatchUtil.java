package com.taobao.message.lab.comfrm.inner2.resource;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ApplicationBuildInfo;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner2.config.PatchInfo;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.io.File;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class PatchUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(598749578);
    }

    public static boolean equals(PatchInfo patchInfo, PatchInfo patchInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c63246a", new Object[]{patchInfo, patchInfo2})).booleanValue();
        }
        if (patchInfo == null && patchInfo2 != null) {
            return true;
        }
        if (patchInfo != null && patchInfo2 == null) {
            return true;
        }
        return (patchInfo == null || patchInfo2 == null || TextUtils.equals(patchInfo.patchVersion, patchInfo2.patchVersion)) ? false : true;
    }

    public static void commitMonitor(String str, String str2, String str3, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851ba916", new Object[]{str, str2, str3, new Boolean(z), str4});
            return;
        }
        HashMap hashMap = new HashMap(4);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("patchVersion", str);
        }
        hashMap.put("stage", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("file", str3);
        if (TextUtils.isEmpty(str4)) {
            hashMap.put("hit", z ? "1" : "0");
            AppMonitor.Alarm.commitSuccess(Constants.Monitor.MODULE_MONITOR, Constants.Monitor.POINT_PATCH, JSON.toJSONString(hashMap));
            return;
        }
        String jSONString = JSON.toJSONString(hashMap);
        Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(1015).errCode(str4).errMsg("ResourceManager Patch Error").ext("param", jSONString).build());
        AppMonitor.Alarm.commitFail(Constants.Monitor.MODULE_MONITOR, Constants.Monitor.POINT_PATCH, jSONString, str4, "");
    }

    public static String getDir(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d7ffc7", new Object[]{patchInfo});
        }
        String diskFileDir = FileUtil.getDiskFileDir(ApplicationUtil.getApplication(), Constants.Monitor.POINT_PATCH);
        return diskFileDir + File.separator + ApplicationBuildInfo.getAppVersionName() + File.separator + patchInfo.patchVersion;
    }
}
