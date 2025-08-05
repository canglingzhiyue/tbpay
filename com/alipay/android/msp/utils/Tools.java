package com.alipay.android.msp.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public class Tools {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getActiveNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b3338d", new Object[0]);
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) GlobalHelper.getInstance().getContext().getSystemService("connectivity")).getActiveNetworkInfo();
            return (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) ? "none" : activeNetworkInfo.getType() == 1 ? "wifi" : activeNetworkInfo.getExtraInfo();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "none";
        }
    }

    public static NetworkInfo getActiveNetworkInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("98d5f88e", new Object[0]);
        }
        try {
            return ((ConnectivityManager) MspContextUtil.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    public static String toStringThrowable(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc164fc6", new Object[]{th});
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
