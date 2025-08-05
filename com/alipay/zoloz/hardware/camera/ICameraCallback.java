package com.alipay.zoloz.hardware.camera;

/* loaded from: classes3.dex */
public interface ICameraCallback {
    void onColorFrame(ColorFrameData colorFrameData);

    void onError(int i);

    void onPreviewFrame(CameraData cameraData);

    void onSurfaceChanged(double d, double d2);

    void onSurfaceCreated();

    void onSurfaceDestroyed();
}
