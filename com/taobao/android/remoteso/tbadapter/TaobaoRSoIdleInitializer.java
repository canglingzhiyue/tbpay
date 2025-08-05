package com.taobao.android.remoteso.tbadapter;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.uc.webview.export.extension.GlobalSettings;
import com.uc.webview.export.extension.SettingKeys;
import java.io.File;
import java.util.HashMap;
import tb.ihp;
import tb.ihq;
import tb.ihw;
import tb.ikq;
import tb.ikw;

/* loaded from: classes6.dex */
public final class TaobaoRSoIdleInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_TAOBAO_REMOTE_SO = "TaobaoRemoteSo";

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            RSoLog.c("TaobaoRSoIdleInitializer.init(), start");
            ihp.by_().f();
            String obtainUCCommonLibDir = obtainUCCommonLibDir();
            GlobalSettings.set(SettingKeys.CommonLibDir, obtainUCCommonLibDir);
            RSoLog.c("tbadapter, GlobalSettings.set() done, SettingKeys.CommonLibDir to " + obtainUCCommonLibDir);
            RSoLog.c("TaobaoRSoIdleInitializer.init(), success");
        } catch (Throwable th) {
            ikq.a("TaobaoRSoInitializer.init()  error", th);
        }
    }

    private static String obtainUCCommonLibDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5eb35393", new Object[0]);
        }
        ihw a2 = ihq.b().a("common_lib_uc");
        if (!a2.g()) {
            RSoLog.c("initUCCommonLib, fetch failed ");
            return "";
        }
        String b = a2.b();
        if (ikw.a((CharSequence) b)) {
            RSoLog.c("initUCCommonLib, lib path is empty ");
            return "";
        }
        File file = new File(b);
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            ikq.a("initUCCommonLib,parent==null", file.toString());
            return "";
        } else if (!parentFile.isDirectory()) {
            ikq.a("initUCCommonLib,parent is not dir", parentFile.toString());
            return "";
        } else {
            return parentFile.getPath();
        }
    }
}
