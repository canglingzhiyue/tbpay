package com.alipay.zoloz.hardware.camera.abs;

import android.os.Looper;
import com.alipay.zoloz.hardware.camera.data.CameraData;
import com.alipay.zoloz.hardware.camera.fps.FpsCallback;
import com.alipay.zoloz.hardware.camera.fps.FpsMonitor;
import com.alipay.zoloz.hardware.camera.param.SlirCameraParam;

/* loaded from: classes3.dex */
public abstract class AbsSlirCamera extends AbsCamera<SlirCameraParam, CameraData> {
    public AbsSlirCamera(Looper looper, FpsCallback fpsCallback) {
        super(looper, FpsMonitor.FPS_NAME_SLIR, fpsCallback);
        this.d = new SlirCameraParam(640, 480, 6, 0, true, null);
    }
}
