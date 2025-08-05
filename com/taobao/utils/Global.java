package com.taobao.utils;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.f;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes.dex */
public final class Global {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long StartupTime;
    private static Application sApplication;
    private static String sPackageName;
    private static String sVersionName;
    private static long startupTimestamp;

    static {
        kge.a(1222632596);
        StartupTime = SystemClock.uptimeMillis();
        startupTimestamp = -1L;
    }

    public static String getPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[0]);
        }
        if (TextUtils.isEmpty(sPackageName) && getApplication() != null) {
            sPackageName = getApplication().getPackageName();
        }
        return sPackageName;
    }

    public static String getVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        if (TextUtils.isEmpty(sVersionName)) {
            try {
                sVersionName = getApplication().getPackageManager().getPackageInfo(getApplication().getPackageName(), 0).versionName;
            } catch (Exception e) {
                Log.e("VersionInfo", TLogTracker.SCENE_EXCEPTION, e);
            }
        }
        return sVersionName;
    }

    public static synchronized Application getApplication() {
        synchronized (Global.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
            }
            if (sApplication == null) {
                sApplication = getSystemApp();
            }
            return sApplication;
        }
    }

    public static synchronized void setApplication(Application application) {
        synchronized (Global.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bac3b6a", new Object[]{application});
            } else {
                sApplication = application;
            }
        }
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

    public static long getStartupTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("157e8f8a", new Object[0])).longValue();
        }
        f b = com.taobao.alimama.services.a.d().b();
        if (b != null && startupTimestamp == -1) {
            startupTimestamp = (StartupTime - SystemClock.uptimeMillis()) + b.b();
        }
        return startupTimestamp;
    }
}
