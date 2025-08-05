package com.alipay.zoloz.hardware.camera;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import com.alipay.zoloz.hardware.DeviceSetting;
import java.util.Map;

/* loaded from: classes3.dex */
public interface ICameraInterface {
    @Deprecated
    public static final String KEY_FACE_REGION = "faceRegion";
    public static final String KEY_FACE_REGIONS = "faceRegions";
    public static final String KEY_SET_ISP = "setIsp";

    void addCallback(ICameraCallback iCameraCallback);

    boolean beautifyAvatar(Bitmap bitmap);

    void closeCamera();

    PointF colorToDepth(PointF pointF);

    PointF depthToColor(PointF pointF);

    CameraParams getCameraParams();

    String getCameraSN();

    int getCameraViewRotation();

    int getColorHeight();

    int getColorMode();

    int getColorWidth();

    int getDepthHeight();

    int getDepthWidth();

    String getFirmwareVersion();

    int getPreviewHeight();

    int getPreviewWidth();

    Rect getROI();

    Object getUVCCamera();

    void initCamera(DeviceSetting deviceSetting);

    boolean isMirror();

    void openCamera(DeviceSetting deviceSetting);

    void releaseCamera();

    void removeCallback(ICameraCallback iCameraCallback);

    boolean setDrawCapturing(boolean z);

    void setFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener);

    void setGLSurfaceViewListener(IGLSurfaceViewListener iGLSurfaceViewListener);

    void setRenderLayers(Map<String, Object> map);

    void setScanCodeMode();

    void setScanFaceMode();

    void startCamera();

    void startColorCamera();

    void startDepthCamera();

    void startPreview(SurfaceHolder surfaceHolder, float f, int i, int i2);

    void stopCamera();

    void stopColorCamera();

    void stopDepthCamera();

    void stopPreview();
}
