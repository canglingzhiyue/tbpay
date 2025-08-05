package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.video.a;
import org.webrtc.VideoCapturer;
import tb.kge;

/* loaded from: classes9.dex */
public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private VideoCapturer.CapturerObserver capturerObserver;
    private int height;
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private SurfaceTextureHelper surfaceTextureHelper;
    private VirtualDisplay virtualDisplay;
    private int width;
    private long numCapturedFrames = 0;
    private boolean isDisposed = false;

    static {
        kge.a(788076032);
        kge.a(1157743024);
        kge.a(-1747124137);
    }

    @Override // org.webrtc.VideoCapturer
    public void enableBeautyProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92077f9d", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableShapeProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1558f91c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void enableTorch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db66480", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // org.webrtc.VideoCapturer
    public void onVideoFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e83fa40", new Object[]{this, videoFrame});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void resetCapturerObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0df0458", new Object[]{this});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setBeautyParam(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c267736", new Object[]{this, new Float(f), new Float(f2)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setBlack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ee5c90", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setDummyRender(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ad4960", new Object[]{this, aVar});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setFaceParam(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd578fb5", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubCapturerObserver(CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ad1ce1", new Object[]{this, capturerObserver});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubDummyRender(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d0d77c", new Object[]{this, aVar});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setVideoContentMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3c05ae", new Object[]{this, new Boolean(z)});
        }
    }

    public static /* synthetic */ SurfaceTextureHelper access$000(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTextureHelper) ipChange.ipc$dispatch("eb703484", new Object[]{screenCapturerAndroid}) : screenCapturerAndroid.surfaceTextureHelper;
    }

    public static /* synthetic */ VideoCapturer.CapturerObserver access$100(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoCapturer.CapturerObserver) ipChange.ipc$dispatch("e39148e2", new Object[]{screenCapturerAndroid}) : screenCapturerAndroid.capturerObserver;
    }

    public static /* synthetic */ VirtualDisplay access$200(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VirtualDisplay) ipChange.ipc$dispatch("58ebb18e", new Object[]{screenCapturerAndroid}) : screenCapturerAndroid.virtualDisplay;
    }

    public static /* synthetic */ VirtualDisplay access$202(ScreenCapturerAndroid screenCapturerAndroid, VirtualDisplay virtualDisplay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VirtualDisplay) ipChange.ipc$dispatch("a00f5f32", new Object[]{screenCapturerAndroid, virtualDisplay});
        }
        screenCapturerAndroid.virtualDisplay = virtualDisplay;
        return virtualDisplay;
    }

    public static /* synthetic */ MediaProjection access$300(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaProjection) ipChange.ipc$dispatch("c5786b1e", new Object[]{screenCapturerAndroid}) : screenCapturerAndroid.mediaProjection;
    }

    public static /* synthetic */ MediaProjection access$302(ScreenCapturerAndroid screenCapturerAndroid, MediaProjection mediaProjection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaProjection) ipChange.ipc$dispatch("703348ab", new Object[]{screenCapturerAndroid, mediaProjection});
        }
        screenCapturerAndroid.mediaProjection = mediaProjection;
        return mediaProjection;
    }

    public static /* synthetic */ MediaProjection.Callback access$400(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaProjection.Callback) ipChange.ipc$dispatch("41369e10", new Object[]{screenCapturerAndroid}) : screenCapturerAndroid.mediaProjectionCallback;
    }

    public static /* synthetic */ void access$500(ScreenCapturerAndroid screenCapturerAndroid) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b297ab", new Object[]{screenCapturerAndroid});
        } else {
            screenCapturerAndroid.createVirtualDisplay();
        }
    }

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private void checkNotDisposed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3530477", new Object[]{this});
        } else if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, VideoCapturer.CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2bf1fa", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
            return;
        }
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6a2077", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
        } else {
            initialize(surfaceTextureHelper, context, (VideoCapturer.CapturerObserver) capturerObserver);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e95964b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.mediaProjectionManager == null) {
            return;
        }
        this.mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        if (this.mediaProjection != null && this.capturerObserver != null && this.surfaceTextureHelper != null) {
            this.mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.capturerObserver.onCapturerStarted(true);
            this.surfaceTextureHelper.startListening(this);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6236b", new Object[]{this});
            return;
        }
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ScreenCapturerAndroid.access$000(ScreenCapturerAndroid.this).stopListening();
                ScreenCapturerAndroid.access$100(ScreenCapturerAndroid.this).onCapturerStopped();
                if (ScreenCapturerAndroid.access$200(ScreenCapturerAndroid.this) != null) {
                    ScreenCapturerAndroid.access$200(ScreenCapturerAndroid.this).release();
                    ScreenCapturerAndroid.access$202(ScreenCapturerAndroid.this, null);
                }
                if (ScreenCapturerAndroid.access$300(ScreenCapturerAndroid.this) == null) {
                    return;
                }
                ScreenCapturerAndroid.access$300(ScreenCapturerAndroid.this).unregisterCallback(ScreenCapturerAndroid.access$400(ScreenCapturerAndroid.this));
                ScreenCapturerAndroid.access$300(ScreenCapturerAndroid.this).stop();
                ScreenCapturerAndroid.access$302(ScreenCapturerAndroid.this, null);
            }
        });
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.isDisposed = true;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03670f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: org.webrtc.ScreenCapturerAndroid.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ScreenCapturerAndroid.access$200(ScreenCapturerAndroid.this).release();
                ScreenCapturerAndroid.access$500(ScreenCapturerAndroid.this);
            }
        });
    }

    private void createVirtualDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7f465a", new Object[]{this});
            return;
        }
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("TRTC_ScreenCapture", this.width, this.height, 400, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
            return;
        }
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    public long getNumCapturedFrames() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("587dab0f", new Object[]{this})).longValue() : this.numCapturedFrames;
    }
}
