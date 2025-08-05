package org.webrtc;

import android.content.Context;
import com.taobao.trtc.video.a;

/* loaded from: classes9.dex */
public interface VideoCapturer {

    @Deprecated
    /* loaded from: classes9.dex */
    public interface CapturerObserver {
        void onCapturerStarted(boolean z);

        void onCapturerStopped();

        void onFrameCaptured(VideoFrame videoFrame);
    }

    void changeCaptureFormat(int i, int i2, int i3);

    void dispose();

    void enableBeautyProcess(boolean z);

    void enableShapeProcess(boolean z);

    void enableTorch(boolean z);

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, org.webrtc.CapturerObserver capturerObserver);

    @Deprecated
    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void onVideoFrame(VideoFrame videoFrame);

    void resetCapturerObserver();

    void setBeautyParam(float f, float f2);

    void setBlack(boolean z);

    void setDummyRender(a aVar);

    void setFaceParam(float f, float f2, float f3, float f4, float f5, float f6);

    void setSubCapturerObserver(org.webrtc.CapturerObserver capturerObserver);

    void setSubDummyRender(a aVar);

    void setVideoContentMirror(boolean z);

    void startCapture(int i, int i2, int i3, int i4);

    void stopCapture() throws InterruptedException;
}
