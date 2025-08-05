package com.taobao.update;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.reo;
import tb.rep;
import tb.req;
import tb.rez;
import tb.rfa;
import tb.rfb;
import tb.rfc;

/* loaded from: classes9.dex */
public class b {
    public static List<String> blackDialogActivity;
    public String appName;
    public Application application;
    public String city;
    public boolean clickBackViewExitDialog;
    public int delayedStartTime;
    public String group;
    public reo logImpl;
    public int logoResourceId;
    public rep nativeLibUpdateListener;
    public boolean popDialogBeforeInstall;
    public boolean push;
    public req threadExecutorImpl;
    public String ttid;
    public boolean autoStart = true;
    public boolean foregroundRequest = true;
    public int delayedKillAppTime = 5000;
    public boolean forceInstallAfaterDownload = false;
    public boolean installBundleAfterDownload = false;
    public boolean enableNavProcessor = false;
    public boolean isOutApk = false;
    public boolean enabledSoLoader = true;
    public boolean enableDialogUiV2 = true;
    public Class uiToastClass = rfc.class;
    public Class uiNotifyClass = rfa.class;
    public Class uiSysNotifyClass = rfb.class;
    public Class uiConfirmClass = rez.class;
    public int bundleUpdateMinDisk = 200;

    static {
        kge.a(-1896616939);
        blackDialogActivity = new ArrayList();
    }

    public b(Application application) {
        this.application = application;
    }
}
