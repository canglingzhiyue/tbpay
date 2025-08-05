package com.taobao.tao.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.android.weex_framework.util.a;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import tb.kge;

/* loaded from: classes8.dex */
public class SystemUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-714708331);
    }

    public static String getCpuInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edf694b9", new Object[0]);
        }
        String str = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                str = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                Log.e("Could not read from file /proc/cpuinfo", e.toString());
            }
        } catch (FileNotFoundException e2) {
            Log.e("BaseParameter-Could not open file /proc/cpuinfo", e2.toString());
        }
        return str != null ? str.substring(str.indexOf(58) + 1).trim() : "";
    }

    public static int getSystemVersion() {
        try {
            try {
                return Build.VERSION.class.getField("SDK_INT").getInt(null);
            } catch (Exception e) {
                e.printStackTrace();
                return 2;
            }
        } catch (Exception unused) {
            return Integer.parseInt((String) Build.VERSION.class.getField("SDK").get(null));
        }
    }

    public static boolean isServiceRunning(Context context, String str) {
        ActivityManager activityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("316efd1b", new Object[]{context, str})).booleanValue();
        }
        if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(30)) {
                if (runningServiceInfo.service.getClassName().contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEmulator(Context context) {
        String proxy_getDeviceId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de3df326", new Object[]{context})).booleanValue();
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null && ((proxy_getDeviceId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager)) == null || proxy_getDeviceId.equals("000000000000000"));
    }

    public static int getScreenWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
}
