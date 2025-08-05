package com.alipay.tianyan.mobilesdk;

import com.alipay.mobile.common.logging.api.monitor.BatteryID;
import com.alipay.mobile.common.logging.api.monitor.BatteryModel;
import com.alipay.mobile.common.logging.api.monitor.DataflowID;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class TianyanLoggingStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean isMonitorBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cdbb7a9", new Object[0])).booleanValue() : TianyanLoggingDispatcher.sIsMonitorBackground;
    }

    public static boolean isFrameworkBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c2197cd", new Object[0])).booleanValue() : TianyanLoggingDispatcher.sIsFrameworkBackground;
    }

    public static boolean isStrictBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cafeb22c", new Object[0])).booleanValue() : TianyanLoggingDispatcher.sIsStrictBackground;
    }

    public static boolean isRelaxedBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88974cbe", new Object[0])).booleanValue() : TianyanLoggingDispatcher.sIsRelaxedBackground;
    }

    public static void acceptTimeTicksMadly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba0263", new Object[0]);
        } else {
            TianyanLoggingDispatcher.acceptTimeTicksMadly();
        }
    }

    public static String getBundleByClass(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5c27546", new Object[]{str}) : TianyanLoggingDispatcher.getBundleByClass(str);
    }

    public static String getConfigValueByKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("133742d6", new Object[]{str, str2}) : TianyanLoggingDispatcher.getConfigValueByKey(str, str2);
    }

    public static void notePowerConsume(BatteryModel batteryModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6e24cd", new Object[]{batteryModel});
        } else {
            TianyanLoggingDispatcher.notePowerConsume(batteryModel);
        }
    }

    public static boolean isPowerConsumeAccept(BatteryID batteryID, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("480ff68d", new Object[]{batteryID, str})).booleanValue() : TianyanLoggingDispatcher.isPowerConsumeAccept(batteryID, str);
    }

    public static void noteTraficConsume(DataflowModel dataflowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c762511a", new Object[]{dataflowModel});
        } else {
            TianyanLoggingDispatcher.noteTraficConsume(dataflowModel);
        }
    }

    public static boolean isTraficConsumeAccept(DataflowID dataflowID, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60c5afd0", new Object[]{dataflowID, str})).booleanValue() : TianyanLoggingDispatcher.isTraficConsumeAccept(dataflowID, str);
    }
}
