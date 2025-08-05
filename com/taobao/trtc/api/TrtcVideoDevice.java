package com.taobao.trtc.api;

import android.content.Intent;
import android.graphics.Bitmap;
import com.taobao.trtc.api.ITrtcObserver;
import org.webrtc.SurfaceViewRenderer;

/* loaded from: classes9.dex */
public interface TrtcVideoDevice {
    void enableBeauty(boolean z);

    void enableTorch(boolean z);

    boolean isFrontFacing();

    void muteLocalVideo(boolean z);

    void pauseScreenCapture(boolean z);

    void preferredFront(boolean z);

    @Deprecated
    void setEventObserver(ITrtcObserver.f fVar);

    void setLocalView(SurfaceViewRenderer surfaceViewRenderer) throws TrtcException;

    void setRemoteVideoView(SurfaceViewRenderer surfaceViewRenderer, String str) throws TrtcException;

    void setSubCaptureParams(int i, int i2, int i3);

    void setVideoMirror(boolean z, boolean z2) throws TrtcException;

    ITrtcInputStream startCapture(TrtcStreamConfig trtcStreamConfig) throws TrtcException;

    ITrtcInputStream startScreenCapture(TrtcStreamConfig trtcStreamConfig, Intent intent) throws TrtcException;

    ITrtcInputStream startSubCapture() throws TrtcException;

    void stopCapture() throws TrtcException;

    void stopScreenCapture() throws TrtcException;

    void stopSubCapture() throws TrtcException;

    boolean switchCamera() throws TrtcException;

    Bitmap takeRemoteSnapshot(String str);
}
