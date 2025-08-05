package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import org.webrtc.VideoFrame;
import tb.kge;

/* loaded from: classes9.dex */
public class NativeCapturerObserver implements CapturerObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long nativeSource;
    private final SurfaceTextureHelper surfaceTextureHelper;

    static {
        kge.a(-2140651760);
        kge.a(-105333223);
    }

    private static native void nativeCapturerStarted(long j, boolean z);

    private static native void nativeCapturerStopped(long j);

    private static native void nativeOnFrameCaptured(long j, int i, int i2, int i3, long j2, VideoFrame.Buffer buffer, int i4);

    private static native void nativeOnFrameCaptured2(long j, int i, int i2, int i3, long j2, VideoFrame.Buffer buffer, int i4, VideoFrame.Buffer buffer2, int i5);

    public NativeCapturerObserver(long j) {
        this.nativeSource = j;
        this.surfaceTextureHelper = null;
    }

    public NativeCapturerObserver(long j, SurfaceTextureHelper surfaceTextureHelper) {
        this.nativeSource = j;
        this.surfaceTextureHelper = surfaceTextureHelper;
    }

    @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
    public void onCapturerStarted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
        } else {
            nativeCapturerStarted(this.nativeSource, z);
        }
    }

    @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
    public void onCapturerStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844419e9", new Object[]{this});
        } else {
            nativeCapturerStopped(this.nativeSource);
        }
    }

    @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
        } else if (videoFrame.hasPreviewBuffer()) {
            nativeOnFrameCaptured2(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer(), videoFrame.getType(), videoFrame.getPreviewBuffer(), videoFrame.getPreviewType());
        } else {
            nativeOnFrameCaptured(this.nativeSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer(), videoFrame.getType());
        }
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            return;
        }
        surfaceTextureHelper.dispose();
    }
}
