package org.webrtc;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaRecorder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.ArtcVideoLayout;
import com.taobao.trtc.api.TrtcVideoLayout;
import com.taobao.trtc.video.a;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoCapturer;
import tb.kge;

/* loaded from: classes9.dex */
public class Camera1Capturer extends CameraCapturer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String cameraName;

    static {
        kge.a(241215393);
    }

    public static /* synthetic */ Object ipc$super(Camera1Capturer camera1Capturer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1902799285:
                super.startCapture(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case -1845002339:
                super.enableBeautyProcess(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1800594207:
                super.setSubCapturerObserver((CapturerObserver) objArr[0]);
                return null;
            case -1648991104:
                return new Boolean(super.isScreencast());
            case -1341507959:
                super.setNeedMix(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1209115504:
                super.setBlack(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1099316777:
                super.switchCamera((CameraVideoCapturer.CameraSwitchHandler) objArr[0]);
                return null;
            case -947073615:
                super.printStackTrace();
                return null;
            case -581464139:
                super.setFaceParam(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue(), ((Number) objArr[4]).floatValue(), ((Number) objArr[5]).floatValue());
                return null;
            case -549714514:
                super.setVideoContentMirror(((Boolean) objArr[0]).booleanValue());
                return null;
            case -522255272:
                super.resetCapturerObserver();
                return null;
            case -405743748:
                super.setSubDummyRender((a) objArr[0]);
                return null;
            case -341433493:
                super.stopCapture();
                return null;
            case -281516208:
                return super.takeSnapshot();
            case -231181085:
                super.setVideoLayout((TrtcVideoLayout) objArr[0]);
                return null;
            case 358152476:
                super.enableShapeProcess(((Boolean) objArr[0]).booleanValue());
                return null;
            case 442527299:
                super.setVideoLayout((ArtcVideoLayout) objArr[0]);
                return null;
            case 453207823:
                super.changeCaptureFormat(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 577536806:
                super.dispose();
                return null;
            case 1048836672:
                super.onVideoFrame((VideoFrame) objArr[0]);
                return null;
            case 1470974304:
                super.setDummyRender((a) objArr[0]);
                return null;
            case 1482310292:
                super.enableTorch(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1538728932:
                return new Boolean(super.isFrontFacing());
            case 1546024758:
                super.setBeautyParam(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            case 1691282753:
                return new Integer(super.getBrightness());
            case 1785340023:
                super.initialize((SurfaceTextureHelper) objArr[0], (Context) objArr[1], (CapturerObserver) objArr[2]);
                return null;
            case 1810221289:
                super.setBrightness(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bf601de", new Object[]{this, mediaRecorder, mediaRecorderHandler});
        }
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a693ec", new Object[]{this, mediaRecorderHandler});
        }
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i, int i2, int i3) {
        super.changeCaptureFormat(i, i2, i3);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void enableBeautyProcess(boolean z) {
        super.enableBeautyProcess(z);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void enableShapeProcess(boolean z) {
        super.enableShapeProcess(z);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void enableTorch(boolean z) {
        super.enableTorch(z);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ int getBrightness() {
        return super.getBrightness();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void onVideoFrame(VideoFrame videoFrame) {
        super.onVideoFrame(videoFrame);
    }

    @Override // org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void resetCapturerObserver() {
        super.resetCapturerObserver();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void setBeautyParam(float f, float f2) {
        super.setBeautyParam(f, f2);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void setBlack(boolean z) {
        super.setBlack(z);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void setBrightness(int i) {
        super.setBrightness(i);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void setDummyRender(a aVar) {
        super.setDummyRender(aVar);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void setFaceParam(float f, float f2, float f3, float f4, float f5, float f6) {
        super.setFaceParam(f, f2, f3, f4, f5, f6);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void setNeedMix(boolean z) {
        super.setNeedMix(z);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void setSubCapturerObserver(CapturerObserver capturerObserver) {
        super.setSubCapturerObserver(capturerObserver);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void setSubDummyRender(a aVar) {
        super.setSubDummyRender(aVar);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void setVideoContentMirror(boolean z) {
        super.setVideoContentMirror(z);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void setVideoLayout(ArtcVideoLayout artcVideoLayout) {
        super.setVideoLayout(artcVideoLayout);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void setVideoLayout(TrtcVideoLayout trtcVideoLayout) {
        super.setVideoLayout(trtcVideoLayout);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i, int i2, int i3, int i4) {
        super.startCapture(i, i2, i3, i4);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ Bitmap takeSnapshot() {
        return super.takeSnapshot();
    }

    public Camera1Capturer(Context context, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        super(context, str, cameraEventsHandler, new Camera1Enumerator());
        this.cameraName = str;
    }

    @Override // org.webrtc.CameraCapturer
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d81918", new Object[]{this, createSessionCallback, events, context, surfaceTextureHelper, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            Camera1Session.create(createSessionCallback, events, i4, context, surfaceTextureHelper, Camera1Enumerator.getCameraIndex(str), i, i2, i3);
        }
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public boolean isFrontFacing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5bb723e4", new Object[]{this})).booleanValue() : super.isFrontFacing();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, VideoCapturer.CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2bf1fa", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
        } else {
            initialize(surfaceTextureHelper, context, capturerObserver);
        }
    }
}
