package com.taobao.tao;

import android.app.Application;
import android.content.pm.PackageManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import javax.annotation.Nonnull;
import tb.kge;

/* loaded from: classes.dex */
public class Globals {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Application sApplication;
    private static ClassLoader sClassLoader;
    private static String sInstalledVersionName;

    static {
        kge.a(-330423408);
    }

    public static void init(@Nonnull Application application, @Nonnull ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8854d442", new Object[]{application, classLoader});
            return;
        }
        sApplication = application;
        sClassLoader = classLoader;
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("5749e470", new Object[0]) : sApplication;
    }

    public static ClassLoader getClassLoader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[0]) : sClassLoader;
    }

    public static String getVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        if (!StringUtils.isEmpty(sInstalledVersionName)) {
            return sInstalledVersionName;
        }
        try {
            sInstalledVersionName = getApplication().getPackageManager().getPackageInfo(getApplication().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            sInstalledVersionName = "5.0.0";
        }
        return sInstalledVersionName;
    }

    public static String getInstalledVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b947cc3a", new Object[0]);
        }
        if (StringUtils.isEmpty(sInstalledVersionName)) {
            getVersionName();
        }
        return sInstalledVersionName;
    }

    public static int getVersionCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a446ea9", new Object[0])).intValue();
        }
        try {
            return getApplication().getPackageManager().getPackageInfo(getApplication().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
