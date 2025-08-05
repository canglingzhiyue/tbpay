package com.alibaba.android.split.core.internal;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class TBSplitCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1298959213);
    }

    public static ApkLoader getApkLoader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkLoader) ipChange.ipc$dispatch("18b1437a", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.PREVIEW_SDK_INT != 0) {
            int i = Build.VERSION.SDK_INT;
            if (i == 27) {
                return new ApkLoaderV27();
            }
            if (i == 28) {
                return new ApkLoaderV28();
            }
        }
        if (Build.VERSION.SDK_INT < 21) {
            return new ApkLoaderV21();
        }
        if (Build.VERSION.SDK_INT > 33) {
            return new ApkLoaderV34();
        }
        switch (Build.VERSION.SDK_INT) {
            case 21:
                return new ApkLoaderV21();
            case 22:
                return new ApkLoaderV22();
            case 23:
                return new ApkLoaderV23();
            case 24:
                return new ApkLoaderV24();
            case 25:
                return new ApkLoaderV25();
            case 26:
                return new ApkLoaderV26();
            case 27:
                return new ApkLoaderV27();
            case 28:
                if (!Build.VERSION.CODENAME.equalsIgnoreCase("Q")) {
                    return new ApkLoaderV27();
                }
                return new ApkLoaderV28();
            case 29:
                return new ApkLoaderV29();
            default:
                return new ApkLoaderV30();
        }
    }
}
