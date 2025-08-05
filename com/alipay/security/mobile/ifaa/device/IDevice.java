package com.alipay.security.mobile.ifaa.device;

/* loaded from: classes3.dex */
public interface IDevice {
    String getDeviceId();

    String getDeviceModel();

    String getDeviceToken(byte[] bArr);
}
