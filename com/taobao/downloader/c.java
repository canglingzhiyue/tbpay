package com.taobao.downloader;

import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.riy;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (Globals.getApplication() != null) {
            try {
                return Globals.getApplication().getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return "1.0.0";
            }
        }
        throw new RuntimeException("application is null");
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            for (int i = 0; i < split.length; i++) {
                if (i >= split2.length) {
                    return true;
                }
                if (!split[i].equals(split2[i])) {
                    return Integer.valueOf(split[i]).intValue() > Integer.valueOf(split2[i]).intValue();
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String a2 = a();
        if (str.endsWith(riy.PLUS)) {
            String substring = str.substring(0, str.length() - 1);
            if (!substring.equals(a2)) {
                return a(a2, substring);
            }
            return true;
        } else if (str.endsWith("-")) {
            String substring2 = str.substring(0, str.length() - 1);
            if (!substring2.equals(a2)) {
                return a(substring2, a2);
            }
            return true;
        } else {
            return str.equals(a2);
        }
    }
}
