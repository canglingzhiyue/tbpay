package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.utils.TrtcLog;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;
import tb.kge;

/* loaded from: classes9.dex */
public class d implements CapturerObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SurfaceTextureHelper f23107a;
    private final l b;
    private VideoCapturer c;
    private SurfaceViewRenderer d;
    private String h;
    private TrtcStreamConfig j;
    private TrtcInputStreamImpl k;
    private boolean l;
    private TrtcInputStreamImpl m;
    private com.taobao.trtc.video.a n;
    private final Object e = new Object();
    private final Object f = new Object();
    private final AtomicBoolean g = new AtomicBoolean(false);
    private String i = "LocalVideoSub";

    static {
        kge.a(887068696);
        kge.a(-105333223);
    }

    public static /* synthetic */ l a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("928cd006", new Object[]{dVar}) : dVar.b;
    }

    public static /* synthetic */ SurfaceTextureHelper a(d dVar, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("235101d9", new Object[]{dVar, surfaceTextureHelper});
        }
        dVar.f23107a = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public static /* synthetic */ Object b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3c561c9e", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ SurfaceViewRenderer c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceViewRenderer) ipChange.ipc$dispatch("86926dd2", new Object[]{dVar}) : dVar.d;
    }

    public static /* synthetic */ TrtcInputStreamImpl d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcInputStreamImpl) ipChange.ipc$dispatch("314d78d2", new Object[]{dVar}) : dVar.k;
    }

    public static /* synthetic */ SurfaceTextureHelper e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTextureHelper) ipChange.ipc$dispatch("937b6275", new Object[]{dVar}) : dVar.f23107a;
    }

    public d(String str, l lVar, TrtcStreamConfig trtcStreamConfig, TrtcInputStreamImpl trtcInputStreamImpl) {
        this.h = str;
        this.j = trtcStreamConfig;
        this.b = lVar;
        if (trtcInputStreamImpl != null) {
            this.k = trtcInputStreamImpl;
            this.l = false;
            return;
        }
        this.k = new TrtcInputStreamImpl(lVar, str, trtcStreamConfig);
        this.l = true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.trtc.utils.b.a("CameraInputStream start error for ref is null", this.h, this.b);
        try {
            if (this.f23107a == null) {
                this.f23107a = SurfaceTextureHelper.create("STH-" + this.h, this.b.d());
            }
        } catch (Exception e) {
            com.taobao.trtc.utils.h.a("CameraInputStream", "start camera input stream, create camera capture error: " + e.getMessage());
        }
        if (this.c == null) {
            this.c = com.taobao.trtc.video.g.a(h.f23132a, new CameraVideoCapturer.CameraEventsHandler() { // from class: com.taobao.trtc.impl.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                public int onCameraPreview(int i, int i2, int i3, float[] fArr, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("5fd25e54", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), fArr, new Long(j)})).intValue();
                    }
                    return 0;
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                public int onCameraPreview(ByteBuffer byteBuffer, AConstants.ColorSpace colorSpace, int i, int i2, int i3, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("cc3a2aa7", new Object[]{this, byteBuffer, colorSpace, new Integer(i), new Integer(i2), new Integer(i3), new Long(j)})).intValue();
                    }
                    return 0;
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                public void onCameraError(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e259615", new Object[]{this, str});
                        return;
                    }
                    com.taobao.trtc.utils.h.a("CameraInputStream", "open camera error: " + str);
                    d.a(d.this).a().a(str);
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                public void onCameraDisconnected() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("14a23346", new Object[]{this});
                        return;
                    }
                    TrtcLog.d("CameraInputStream", "camera disconnect");
                    d.a(d.this).a().a();
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                public void onCameraFreezed(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8c3133fa", new Object[]{this, str});
                        return;
                    }
                    com.taobao.trtc.utils.h.a("CameraInputStream", "camera freeze: " + str);
                    d.a(d.this).a().e(str, "pri");
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                public void onCameraOpening(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("226fce65", new Object[]{this, str});
                        return;
                    }
                    TrtcLog.d("CameraInputStream", "Camera: " + str + " opening");
                    d.a(d.this).a().b(str);
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                public void onFirstFrameAvailable() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf76454", new Object[]{this});
                        return;
                    }
                    TrtcLog.d("CameraInputStream", "camera first frame available");
                    d.a(d.this).a().b();
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                public void onCameraClosed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("128938f7", new Object[]{this});
                        return;
                    }
                    TrtcLog.d("CameraInputStream", "camera closed");
                    d.a(d.this).a().c();
                }
            }, this.b.e().config.isPreferFrontCamera());
            TrtcLog.d("CameraInputStream", "create camera video capture done");
            this.c.initialize(this.f23107a, h.f23132a, new CapturerObserver() { // from class: com.taobao.trtc.impl.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
                public void onCapturerStarted(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
                    } else {
                        TrtcLog.d("CameraInputStream", "PRI onCapturerStarted");
                    }
                }

                @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
                public void onCapturerStopped() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("844419e9", new Object[]{this});
                    } else {
                        TrtcLog.d("CameraInputStream", "PRI onCapturerStopped");
                    }
                }

                @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
                public void onFrameCaptured(VideoFrame videoFrame) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
                        return;
                    }
                    synchronized (d.b(d.this)) {
                        if (d.c(d.this) != null) {
                            d.c(d.this).onFrame(videoFrame);
                        }
                    }
                    if (d.d(d.this) != null) {
                        d.d(d.this).a(videoFrame);
                    }
                    videoFrame.release();
                }
            });
            TrtcLog.d("CameraInputStream", "init camera capture done");
        }
        this.c.startCapture(this.j.getVideoHeight(), this.j.getVideoWidth(), this.j.getVideoFps(), 2);
        this.g.set(true);
        this.n = new com.taobao.trtc.video.a();
        this.n.a(this.b.d());
        this.c.setDummyRender(this.n);
        TrtcLog.d("CameraInputStream", "camera capture start done");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.c != null) {
                this.c.stopCapture();
                this.g.set(false);
                this.c = null;
            }
            if (this.n != null) {
                this.n.a();
                this.n = null;
            }
            TrtcLog.d("CameraInputStream", "camera capture stop done");
        } catch (Exception e) {
            com.taobao.trtc.utils.h.a("CameraInputStream", "stop camera input stream errof: " + e.getMessage());
        }
    }

    public ITrtcInputStream c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcInputStream) ipChange.ipc$dispatch("ab035743", new Object[]{this}) : this.k;
    }

    public ITrtcInputStream d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcInputStream) ipChange.ipc$dispatch("b2688c62", new Object[]{this}) : a(this.i);
    }

    public boolean e() {
        VideoCapturer videoCapturer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        a(this.i);
        if (this.g.get() && (videoCapturer = this.c) != null) {
            videoCapturer.setSubCapturerObserver(this);
        }
        return true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        VideoCapturer videoCapturer = this.c;
        if (videoCapturer != null) {
            videoCapturer.setSubCapturerObserver(null);
        }
        return true;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.c == null) {
        } else {
            TrtcLog.d("CameraInputStream", "enable mix: " + z);
            ((CameraVideoCapturer) this.c).setNeedMix(z);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        VideoCapturer videoCapturer = this.c;
        if (videoCapturer == null) {
            return;
        }
        videoCapturer.enableBeautyProcess(z);
    }

    public void a(SurfaceViewRenderer surfaceViewRenderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e4719", new Object[]{this, surfaceViewRenderer});
            return;
        }
        synchronized (this.e) {
            this.d = surfaceViewRenderer;
            TrtcLog.d("CameraInputStream", "update render for input stream, render: " + surfaceViewRenderer);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        VideoCapturer videoCapturer = this.c;
        if (videoCapturer == null) {
            return;
        }
        videoCapturer.enableTorch(z);
    }

    public CameraVideoCapturer g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer) ipChange.ipc$dispatch("c9daa3ec", new Object[]{this});
        }
        if (!this.g.get()) {
            return null;
        }
        return (CameraVideoCapturer) this.c;
    }

    public void a(String str, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f585aa", new Object[]{this, str, bArr, new Integer(i)});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.k;
        if (trtcInputStreamImpl != null && trtcInputStreamImpl.f23090a.equals(str)) {
            this.k.a(bArr, i);
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl2 = this.m;
        if (trtcInputStreamImpl2 == null || !trtcInputStreamImpl2.f23090a.equals(str)) {
            return;
        }
        this.m.a(bArr, i);
    }

    public void a(TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acd942d", new Object[]{this, iVar});
        } else if (this.k != null && iVar.f23041a.equals("TrtcLocalStream")) {
            this.k.a(iVar);
        } else {
            TrtcInputStreamImpl trtcInputStreamImpl = this.k;
            if (trtcInputStreamImpl != null && trtcInputStreamImpl.f23090a.equals(iVar.f23041a)) {
                this.k.a(iVar);
                return;
            }
            TrtcInputStreamImpl trtcInputStreamImpl2 = this.m;
            if (trtcInputStreamImpl2 == null || !trtcInputStreamImpl2.f23090a.equals(iVar.f23041a)) {
                return;
            }
            this.m.a(iVar);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            if (this.m != null) {
                this.m.a();
                this.m = null;
            }
            if (this.k != null && this.l) {
                this.k.a();
                this.k = null;
            }
            if (this.c != null) {
                this.c.resetCapturerObserver();
                this.c.stopCapture();
                this.c.dispose();
                this.c = null;
            }
            if (this.f23107a == null || this.f23107a.getHandler() == null) {
                return;
            }
            this.f23107a.getHandler().post(new Runnable() { // from class: com.taobao.trtc.impl.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    d.e(d.this).dispose();
                    d.a(d.this, null);
                }
            });
        } catch (InterruptedException e) {
            com.taobao.trtc.utils.h.a("CameraInputStream", "release video capture error: " + e.getMessage());
        }
    }

    @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
    public void onCapturerStarted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
        } else {
            TrtcLog.d("CameraInputStream", "SUB onCapturerStarted");
        }
    }

    @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
    public void onCapturerStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844419e9", new Object[]{this});
        } else {
            TrtcLog.d("CameraInputStream", "SUB onCapturerStarted");
        }
    }

    @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.m;
        if (trtcInputStreamImpl == null) {
            return;
        }
        trtcInputStreamImpl.a(videoFrame);
        videoFrame.release();
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        TrtcLog.d("CameraInputStream", "mute local video to black, enable: " + z);
        if (!this.g.get()) {
            return;
        }
        this.c.setBlack(z);
    }

    private TrtcInputStreamImpl a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("6d6fca36", new Object[]{this, str});
        }
        if (this.m == null) {
            this.m = new TrtcInputStreamImpl(this.b, str, new TrtcStreamConfig.a().a(360, 640, 20).d(true).a());
        }
        return this.m;
    }
}
