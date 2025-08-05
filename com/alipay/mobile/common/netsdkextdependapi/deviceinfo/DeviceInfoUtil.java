package com.alipay.mobile.common.netsdkextdependapi.deviceinfo;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class DeviceInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final String getDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a7d1d2", new Object[0]) : a().getDeviceId();
    }

    public static final String getClientId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b6a8bd", new Object[0]) : a().getClientId();
    }

    public static final String getLatitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f4fa657", new Object[0]) : a().getLatitude();
    }

    public static final String getLongitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16d079a0", new Object[0]) : a().getLongitude();
    }

    public static String getAlipayLocaleDes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0c8f801", new Object[0]);
        }
        try {
            return a().getAlipayLocaleDes();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final String getVmType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77d037d2", new Object[0]) : a().getVmType();
    }

    public static final boolean reInitDeviceInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f9358772", new Object[0])).booleanValue() : a().reInitDeviceInfo();
    }

    public static final String getSystemVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2d238e6", new Object[0]) : a().getSystemVersion();
    }

    public static final String getUserAgent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c888a235", new Object[0]) : a().getUserAgent();
    }

    public static final int getScreenWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue() : a().getScreenWidth();
    }

    public static final int getScreenHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue() : a().getScreenHeight();
    }

    public static final String getMobileBrand() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("edf2af8a", new Object[0]) : a().getMobileBrand();
    }

    public static final String getMobileModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22c7928", new Object[0]) : a().getMobileModel();
    }

    public static final String getAccessPoint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a134b63", new Object[0]) : a().getAccessPoint();
    }

    public static final String getImei() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fb5387b", new Object[0]) : a().getImei();
    }

    public static final String getImsi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e6b9a09", new Object[0]) : a().getImsi();
    }

    public static final boolean isRooted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48b0f5d6", new Object[0])).booleanValue() : a().isRooted();
    }

    public static final String getCellInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b73cd413", new Object[0]) : a().getCellInfo();
    }

    public static final String getRomVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4cc8fcdb", new Object[0]) : a().getRomVersion();
    }

    public static final boolean isLowEndDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2df92972", new Object[0])).booleanValue();
        }
        try {
            return a().isLowEndDevice();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final int getDevicePerformanceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ebf4728", new Object[0])).intValue();
        }
        try {
            return a().getDevicePerformanceScore();
        } catch (Throwable unused) {
            return Integer.MAX_VALUE;
        }
    }

    public static final DeviceLevelEnum getDevicePerformanceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceLevelEnum) ipChange.ipc$dispatch("9cd8ede3", new Object[0]);
        }
        try {
            return a().getDevicePerformanceLevel();
        } catch (Throwable unused) {
            return DeviceLevelEnum.LOW;
        }
    }

    private static final DeviceInfoManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeviceInfoManager) ipChange.ipc$dispatch("17ed9548", new Object[0]) : DeviceInfoManagerFactory.getInstance().getDefaultBean();
    }
}
