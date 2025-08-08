package com.ut.share.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class InstalledPackages {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mIsInstalled = 0;
    private PackageInfo mPackageInfo;
    private PackageManager mPackageManager;
    private String mPackageName;

    static {
        kge.a(-1483061833);
    }

    public InstalledPackages(Context context, String str) {
        this.mPackageName = str;
        this.mPackageManager = context.getPackageManager();
    }

    public boolean installedApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbabe952", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(this.mPackageName)) {
            this.mPackageInfo = null;
            this.mIsInstalled = -1;
            return false;
        }
        int i = this.mIsInstalled;
        if (i == 1) {
            return true;
        }
        if (i == -1) {
            return false;
        }
        try {
            this.mPackageInfo = this.mPackageManager.getPackageInfo(this.mPackageName, 0);
            this.mIsInstalled = 1;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            this.mPackageInfo = null;
            this.mIsInstalled = -1;
            return false;
        }
    }

    public PackageInfo getPackageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("4454a4a8", new Object[]{this});
        }
        if (this.mIsInstalled == 0) {
            installedApp();
        }
        return this.mPackageInfo;
    }
}
