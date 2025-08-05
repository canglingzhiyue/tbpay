package com.taobao.message.uikit.util;

import android.app.Application;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes7.dex */
public class ApplicationUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Boolean DEBUG;
    private static Application sApp;
    private static String sAppKey;
    private static int sEnvType;
    private static String sTTID;
    private static String sUTDID;

    static {
        kge.a(-2111048211);
        sApp = null;
        DEBUG = null;
        sEnvType = -1;
        sUTDID = null;
        sAppKey = null;
        sTTID = null;
    }

    public static String getTTID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]) : sTTID;
    }

    public static void setTTID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb95dce", new Object[]{str});
        } else {
            sTTID = str;
        }
    }

    public static String getUTDID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22b9b56f", new Object[0]) : sUTDID;
    }

    public static void setUTDID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1558e4f", new Object[]{str});
        } else {
            sUTDID = str;
        }
    }

    public static String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[0]) : sAppKey;
    }

    public static void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{str});
        } else {
            sAppKey = str;
        }
    }

    public static int getEnvType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2a2dd8b", new Object[0])).intValue() : sEnvType;
    }

    public static void setEnvType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8024377", new Object[]{new Integer(i)});
        } else {
            sEnvType = i;
        }
    }

    public static void setDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{new Boolean(z)});
        } else {
            DEBUG = Boolean.valueOf(z);
        }
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        if (DEBUG == null) {
            try {
                DEBUG = Boolean.valueOf((getApplication().getApplicationInfo().flags & 2) != 0);
            } catch (Exception unused) {
            }
        }
        Boolean bool = DEBUG;
        return bool != null && bool.booleanValue();
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (sApp == null) {
            sApp = getSystemApp();
        }
        return sApp;
    }

    public static void setApplication(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac3b6a", new Object[]{application});
        } else if (application == null) {
        } else {
            sApp = application;
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
}
