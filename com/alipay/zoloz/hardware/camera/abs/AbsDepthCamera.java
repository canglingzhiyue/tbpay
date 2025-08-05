package com.alipay.zoloz.hardware.camera.abs;

import android.os.Looper;
import com.alipay.zoloz.hardware.camera.data.CameraData;
import com.alipay.zoloz.hardware.camera.fps.FpsCallback;
import com.alipay.zoloz.hardware.camera.param.CameraIntrinParam;
import com.alipay.zoloz.hardware.camera.param.DepthCameraParam;

/* loaded from: classes3.dex */
public abstract class AbsDepthCamera extends AbsCamera<DepthCameraParam, CameraData> {
    public AbsDepthCamera(Looper looper, FpsCallback fpsCallback, CameraIntrinParam cameraIntrinParam) {
        super(looper, "depth", fpsCallback);
        this.d = new DepthCameraParam(640, 480, 50, 0, true, cameraIntrinParam);
    }
}
