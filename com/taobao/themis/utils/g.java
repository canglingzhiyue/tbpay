package com.taobao.themis.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.File;
import tb.kge;

/* loaded from: classes9.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = ":FileUtils";

    static {
        kge.a(1713463023);
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        if (str != null) {
            return a(new File(str));
        }
        return 0L;
    }

    public static long a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a979fd3", new Object[]{file})).longValue();
        }
        long j = 0;
        if (!b(file)) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                j += a(file2);
            }
        }
        return j;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (str == null || str.length() == 0) {
            return str2;
        }
        int length = str.length();
        if (str2 == null || str2.length() == 0) {
            if (str.charAt(length - 1) == '/') {
                return str;
            }
            return str + "/";
        }
        if (str2.startsWith("./")) {
            str2 = str2.substring(1);
        }
        if (str.charAt(length - 1) == '/') {
            if (str2.charAt(0) == '/') {
                return str.substring(0, str.length() - 1) + str2;
            }
            return str + str2;
        } else if (str2.charAt(0) == '/') {
            return str + str2;
        } else {
            return str + "/" + str2;
        }
    }

    public static boolean b(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("584201a4", new Object[]{file})).booleanValue() : file != null && file.exists();
    }

    public static String a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7da5f8a", new Object[]{str, context});
        }
        if (context == null) {
            return null;
        }
        try {
            return com.taobao.themis.utils.io.i.b(AssetsDelegate.proxy_open(context.getAssets(), str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
