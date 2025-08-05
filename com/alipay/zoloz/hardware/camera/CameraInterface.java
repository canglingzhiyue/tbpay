package com.alipay.zoloz.hardware.camera;

import com.alipay.zoloz.hardware.DeviceSetting;
import com.alipay.zoloz.hardware.camera.data.CameraDatas;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class CameraInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CameraInterface";

    /* renamed from: a  reason: collision with root package name */
    private static CameraInterface f6229a = new CameraInterface();

    public void register(CameraCallback<com.alipay.zoloz.hardware.camera.param.CameraParams, CameraDatas> cameraCallback, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf390ebd", new Object[]{this, cameraCallback, new Integer(i)});
        }
    }

    public void setDeviceSetting(DeviceSetting deviceSetting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c14e40b", new Object[]{this, deviceSetting});
        }
    }

    public void unregister(CameraCallback<com.alipay.zoloz.hardware.camera.param.CameraParams, CameraDatas> cameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d336d0d", new Object[]{this, cameraCallback});
        }
    }

    private CameraInterface() {
    }

    public static CameraInterface getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraInterface) ipChange.ipc$dispatch("b74fc586", new Object[0]) : f6229a;
    }
}
