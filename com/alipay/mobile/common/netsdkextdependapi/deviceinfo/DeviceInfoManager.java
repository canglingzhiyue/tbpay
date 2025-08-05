package com.alipay.mobile.common.netsdkextdependapi.deviceinfo;

/* loaded from: classes3.dex */
public interface DeviceInfoManager {
    String getAccessPoint();

    String getAlipayLocaleDes();

    String getCellInfo();

    String getClientId();

    String getDeviceId();

    DeviceLevelEnum getDevicePerformanceLevel();

    int getDevicePerformanceScore();

    String getImei();

    String getImsi();

    String getLatitude();

    String getLongitude();

    String getMobileBrand();

    String getMobileModel();

    String getRomVersion();

    int getScreenHeight();

    int getScreenWidth();

    String getSystemVersion();

    String getUserAgent();

    String getVmType();

    boolean isLowEndDevice();

    boolean isRooted();

    boolean reInitDeviceInfo();
}
