package com.alibaba.security.ccrc.service;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CcrcContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CcrcContext";

    public static boolean init(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("624f99f", new Object[]{context, str})).booleanValue() : init(context, str, false);
    }

    public static boolean isLogEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4628c1e8", new Object[0])).booleanValue() : Logging.enable;
    }

    public static void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{str});
        } else {
            CcrcContextImpl.getInstance().setAppKey(str);
        }
    }

    public static void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{str});
        } else {
            CcrcContextImpl.getInstance().setAppVersion(str);
        }
    }

    public static void setLogEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed2daa8", new Object[]{new Boolean(z)});
        } else {
            Logging.enable = z;
        }
    }

    public static void setLogTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca6549", new Object[]{str});
        } else {
            Logging.TAG = str;
        }
    }

    public static String version() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("deb50921", new Object[0]) : "1.16.1";
    }

    public static boolean init(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be7aec9d", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            Logging.e(TAG, "context is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            Logging.e(TAG, "ttid is empty");
            return false;
        } else {
            return CcrcContextImpl.getInstance().init(context, str, z);
        }
    }
}
