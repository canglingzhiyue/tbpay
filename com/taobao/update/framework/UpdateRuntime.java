package com.taobao.update.framework;

import android.app.Application;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.rem;
import tb.reo;
import tb.req;
import tb.rer;
import tb.ret;
import tb.rew;
import tb.rex;
import tb.rey;
import tb.rez;
import tb.rfa;
import tb.rfb;
import tb.rfc;
import tb.rgo;

/* loaded from: classes9.dex */
public class UpdateRuntime {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int bundleUpdateMinDisk;
    public static boolean forceInstallAfaterDownload;
    public static boolean installBundleAfterDownload;
    public static boolean popDialogBeforeInstall;
    public static String processName;
    public static String sAppName;
    public static boolean sBundleUpdateSuccess;
    private static Application sContext;
    public static String sGroup;
    public static int sLogoResourceId;
    public static boolean sSevenDaysUpdate;
    public static String sTTid;
    public boolean commited;

    static {
        kge.a(-1807786997);
        sSevenDaysUpdate = false;
        bundleUpdateMinDisk = 200;
    }

    public static void init(Application application, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c23106", new Object[]{application, str, str2, str3});
            return;
        }
        sContext = application;
        sGroup = str3;
        sTTid = str;
        if (!TextUtils.isEmpty(str2)) {
            sAppName = str2;
        } else {
            sAppName = application.getApplicationInfo().loadLabel(application.getPackageManager()).toString();
        }
        sContext.registerActivityLifecycleCallbacks(new rem());
        rez.sClickbg2Exit = false;
        a.registerClass(rfc.class);
        a.registerClass("sysnotify", rfb.class);
        a.registerClass(AgooConstants.MESSAGE_NOTIFICATION, rfa.class);
        a.registerClass(rez.class);
        a.registerInstance(new rex());
        a.registerInstance(new rey());
        popDialogBeforeInstall = true;
        forceInstallAfaterDownload = false;
        bundleUpdateMinDisk = 200;
        sLogoResourceId = sContext.getApplicationInfo().icon;
    }

    public static void init(Application application, com.taobao.update.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7f2aea", new Object[]{application, bVar});
            return;
        }
        sContext = application;
        sGroup = bVar.group;
        sTTid = bVar.ttid;
        if (!TextUtils.isEmpty(bVar.appName)) {
            sAppName = bVar.appName;
        } else {
            sAppName = application.getApplicationInfo().loadLabel(application.getPackageManager()).toString();
        }
        sContext.registerActivityLifecycleCallbacks(new rem());
        rez.sClickbg2Exit = false;
        Class[] clsArr = new Class[1];
        clsArr[0] = bVar.uiToastClass != null ? bVar.uiToastClass : rfc.class;
        a.registerClass(clsArr);
        a.registerClass("sysnotify", bVar.uiSysNotifyClass != null ? bVar.uiSysNotifyClass : rfb.class);
        a.registerClass(AgooConstants.MESSAGE_NOTIFICATION, bVar.uiNotifyClass != null ? bVar.uiNotifyClass : rfa.class);
        Class[] clsArr2 = new Class[1];
        clsArr2[0] = bVar.uiConfirmClass != null ? bVar.uiConfirmClass : rez.class;
        a.registerClass(clsArr2);
        a.registerInstance(bVar.logImpl != null ? bVar.logImpl : new rex());
        a.registerInstance(bVar.threadExecutorImpl != null ? bVar.threadExecutorImpl : new rey());
        popDialogBeforeInstall = bVar.popDialogBeforeInstall;
        forceInstallAfaterDownload = bVar.forceInstallAfaterDownload;
        installBundleAfterDownload = bVar.installBundleAfterDownload;
        bundleUpdateMinDisk = bVar.bundleUpdateMinDisk;
        sLogoResourceId = sContext.getApplicationInfo().icon;
    }

    public static Application getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("6500554f", new Object[0]) : sContext;
    }

    public static void doUIAlertForConfirm(final String str, final rew rewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d7b6bb1", new Object[]{str, rewVar});
        } else {
            rgo.execute(new Runnable() { // from class: com.taobao.update.framework.UpdateRuntime.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    rer rerVar = (rer) a.getInstance(rer.class);
                    if (rerVar != null) {
                        rerVar.alertForConfirm(str, rewVar);
                    } else {
                        Log.e("Updater", "UIConfirm is null");
                    }
                }
            });
        }
    }

    public static void toast(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{str});
        } else {
            rgo.execute(new Runnable() { // from class: com.taobao.update.framework.UpdateRuntime.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ret retVar = (ret) a.getInstance(ret.class);
                    if (retVar == null) {
                        return;
                    }
                    retVar.toast(str);
                }
            });
        }
    }

    public static void tips(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb24d89", new Object[]{new Boolean(z), str, str2});
        } else if (!z) {
        } else {
            toast(str2);
        }
    }

    public static void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
            return;
        }
        reo reoVar = (reo) a.getInstance(reo.class);
        if (reoVar == null) {
            return;
        }
        reoVar.debug("update.sdk", str);
    }

    public static void log(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c62840", new Object[]{str, th});
            return;
        }
        reo reoVar = (reo) a.getInstance(reo.class);
        if (reoVar != null) {
            reoVar.error("update.sdk", str, th);
        } else {
            Log.e("update.sdk", str, th);
        }
    }

    public static void execute(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        req reqVar = (req) a.getInstance(req.class);
        if (reqVar != null) {
            reqVar.execute(runnable);
        } else {
            new Thread(new Runnable() { // from class: com.taobao.update.framework.UpdateRuntime.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Process.setThreadPriority(10);
                    runnable.run();
                }
            }).start();
        }
    }

    public static void execute(final Runnable runnable, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44672449", new Object[]{runnable, new Integer(i)});
            return;
        }
        req reqVar = (req) a.getInstance(req.class);
        if (reqVar != null) {
            reqVar.delayExecute(runnable, i);
        } else {
            new Thread(new Runnable() { // from class: com.taobao.update.framework.UpdateRuntime.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Process.setThreadPriority(10);
                    try {
                        Thread.sleep(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    runnable.run();
                }
            }).start();
        }
    }
}
