package com.alipay.mars.app;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AppLogic {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "bifrost.AppLogic";

    /* renamed from: a  reason: collision with root package name */
    private static ICallBack f5320a;

    /* loaded from: classes3.dex */
    public static class AccountInfo {
        public long uin;
        public String userName;

        public AccountInfo() {
            this.uin = 0L;
            this.userName = "";
        }

        public AccountInfo(long j, String str) {
            this.uin = 0L;
            this.userName = "";
            this.uin = j;
            this.userName = str;
        }
    }

    /* loaded from: classes3.dex */
    public static class DeviceInfo {
        public String devicename;
        public String devicetype;

        public DeviceInfo(String str, String str2) {
            this.devicename = "";
            this.devicetype = "";
            this.devicename = str;
            this.devicetype = str2;
        }
    }

    /* loaded from: classes3.dex */
    public interface ICallBack {
        AccountInfo getAccountInfo();

        String getAppFilePath();

        int getClientVersion();

        String getCurLanguage();

        DeviceInfo getDeviceType();
    }

    public static void setCallBack(ICallBack iCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7212a4a5", new Object[]{iCallBack});
        } else {
            f5320a = iCallBack;
        }
    }

    public static String getAppFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c6ea2ad", new Object[0]);
        }
        ICallBack iCallBack = f5320a;
        if (iCallBack != null) {
            return iCallBack.getAppFilePath();
        }
        return null;
    }

    public static AccountInfo getAccountInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccountInfo) ipChange.ipc$dispatch("d7faf1d4", new Object[0]);
        }
        ICallBack iCallBack = f5320a;
        if (iCallBack != null) {
            return iCallBack.getAccountInfo();
        }
        return null;
    }

    public static int getClientVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b23f3d1", new Object[0])).intValue();
        }
        ICallBack iCallBack = f5320a;
        if (iCallBack != null) {
            return iCallBack.getClientVersion();
        }
        return 0;
    }

    public static DeviceInfo getDeviceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfo) ipChange.ipc$dispatch("d1a14144", new Object[0]);
        }
        ICallBack iCallBack = f5320a;
        if (iCallBack != null) {
            return iCallBack.getDeviceType();
        }
        return null;
    }

    public static String getCurLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("714573b7", new Object[0]);
        }
        ICallBack iCallBack = f5320a;
        if (iCallBack != null) {
            return iCallBack.getCurLanguage();
        }
        return null;
    }
}
