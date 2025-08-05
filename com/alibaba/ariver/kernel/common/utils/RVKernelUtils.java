package com.alibaba.ariver.kernel.common.utils;

import android.app.Application;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import tb.kge;

/* loaded from: classes2.dex */
public class RVKernelUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AriverKernel";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f2911a;

    static {
        kge.a(441837821);
        f2911a = null;
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        if (f2911a == null) {
            Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
            if (applicationContext == null) {
                return false;
            }
            try {
                f2911a = Boolean.valueOf((applicationContext.getApplicationInfo().flags & 2) != 0);
            } catch (Throwable th) {
                RVLogger.e("AriverKernel", "exception detail", th);
            }
        }
        if (f2911a == null) {
            f2911a = false;
        }
        return f2911a.booleanValue();
    }

    public static String getClientVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("589c7882", new Object[0]);
        }
        try {
            Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
            return applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static Resources getResources() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("36fe0307", new Object[0]) : ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources(RVConstants.ARIVER_BUNDLE_NAME);
    }

    public static boolean enableAriverActivityLeak() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89296c6b", new Object[0])).booleanValue();
        }
        try {
            z = TextUtils.equals("true", ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("enableAriverActivityLeakV2", "false"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.e("AriverActivityLeak", "enableAriverActivityLeakV2: " + z);
        return z;
    }

    public static Thread getCurrentThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("54a87913", new Object[0]) : VExecutors.currentThread();
    }
}
