package com.taobao.trtc.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.IArtcExternalVideoCapturer;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.video.b;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoFrame;
import tb.kge;

/* loaded from: classes9.dex */
public class g implements b.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private l f23127a;
    private com.taobao.trtc.video.b b;
    private com.taobao.trtc.video.c c;
    private TrtcInputStreamImpl d;
    private TrtcInputStreamImpl e;
    private SurfaceTextureHelper f;
    private SurfaceTextureHelper g;
    private SurfaceViewRenderer j;
    private volatile boolean h = false;
    private final Object i = new Object();
    private int k = 0;
    private long l = 0;
    private boolean m = false;

    static {
        kge.a(-2106539144);
        kge.a(1843558586);
    }

    public static /* synthetic */ int a(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("260d6b46", new Object[]{gVar, new Integer(i)})).intValue();
        }
        gVar.k = i;
        return i;
    }

    public static /* synthetic */ long a(g gVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("260d6f08", new Object[]{gVar, new Long(j)})).longValue();
        }
        gVar.l = j;
        return j;
    }

    public static /* synthetic */ TrtcInputStreamImpl a(g gVar, TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("d09ddc66", new Object[]{gVar, trtcInputStreamImpl});
        }
        gVar.d = trtcInputStreamImpl;
        return trtcInputStreamImpl;
    }

    public static /* synthetic */ SurfaceTextureHelper a(g gVar, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("f745b05c", new Object[]{gVar, surfaceTextureHelper});
        }
        gVar.f = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public static /* synthetic */ boolean a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("434abdb4", new Object[]{gVar})).booleanValue() : gVar.h;
    }

    public static /* synthetic */ TrtcInputStreamImpl b(g gVar, TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("deaa0645", new Object[]{gVar, trtcInputStreamImpl});
        }
        gVar.e = trtcInputStreamImpl;
        return trtcInputStreamImpl;
    }

    public static /* synthetic */ Object b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6220fd21", new Object[]{gVar}) : gVar.i;
    }

    public static /* synthetic */ SurfaceTextureHelper b(g gVar, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("c705e3fb", new Object[]{gVar, surfaceTextureHelper});
        }
        gVar.g = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public static /* synthetic */ SurfaceViewRenderer c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceViewRenderer) ipChange.ipc$dispatch("bb1cad15", new Object[]{gVar}) : gVar.j;
    }

    public static /* synthetic */ TrtcInputStreamImpl d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcInputStreamImpl) ipChange.ipc$dispatch("12fc055", new Object[]{gVar}) : gVar.d;
    }

    public static /* synthetic */ boolean e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e88a4fb8", new Object[]{gVar})).booleanValue() : gVar.m;
    }

    public static /* synthetic */ SurfaceTextureHelper f(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTextureHelper) ipChange.ipc$dispatch("aaaeac13", new Object[]{gVar}) : gVar.g;
    }

    public static /* synthetic */ SurfaceTextureHelper g(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTextureHelper) ipChange.ipc$dispatch("65244c94", new Object[]{gVar}) : gVar.f;
    }

    public static /* synthetic */ TrtcInputStreamImpl h(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcInputStreamImpl) ipChange.ipc$dispatch("e4b142d1", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ int i(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8dc9e1ab", new Object[]{gVar})).intValue();
        }
        int i = gVar.k;
        gVar.k = i + 1;
        return i;
    }

    public static /* synthetic */ long j(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b719c62d", new Object[]{gVar})).longValue() : gVar.l;
    }

    public static /* synthetic */ int k(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e069aaad", new Object[]{gVar})).intValue() : gVar.k;
    }

    public void a(l lVar, com.taobao.trtc.video.b bVar, com.taobao.trtc.video.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a617b56a", new Object[]{this, lVar, bVar, cVar});
            return;
        }
        this.f23127a = lVar;
        this.b = bVar;
        this.c = cVar;
        this.h = true;
        bVar.a(lVar.a());
        if (this.f == null) {
            this.f = SurfaceTextureHelper.create("STH-PRI", lVar.d());
        }
        bVar.a(this);
        bVar.initialize(this.f, h.f23132a, new CapturerObserver() { // from class: com.taobao.trtc.impl.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
            public void onCapturerStarted(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
            public void onCapturerStopped() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("844419e9", new Object[]{this});
                }
            }

            @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
            public void onFrameCaptured(VideoFrame videoFrame) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
                } else if (!g.a(g.this)) {
                } else {
                    synchronized (g.b(g.this)) {
                        if (g.c(g.this) != null) {
                            g.c(g.this).onFrame(videoFrame);
                        }
                    }
                    if (g.d(g.this) == null || g.e(g.this)) {
                        return;
                    }
                    g.d(g.this).a(videoFrame);
                }
            }
        });
        TrtcLog.d("ExternalStream", "init");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.h = false;
        c();
        b();
        SurfaceTextureHelper surfaceTextureHelper = this.g;
        if (surfaceTextureHelper != null && surfaceTextureHelper.getHandler() != null) {
            this.g.getHandler().post(new Runnable() { // from class: com.taobao.trtc.impl.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    g.f(g.this).stopListening();
                    g.f(g.this).dispose();
                    g.b(g.this, (SurfaceTextureHelper) null);
                    if (g.d(g.this) == null) {
                        return;
                    }
                    g.d(g.this).a();
                    g.a(g.this, (TrtcInputStreamImpl) null);
                }
            });
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.f;
        if (surfaceTextureHelper2 != null && surfaceTextureHelper2.getHandler() != null) {
            this.f.getHandler().post(new Runnable() { // from class: com.taobao.trtc.impl.g.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    g.g(g.this).stopListening();
                    g.g(g.this).dispose();
                    g.a(g.this, (SurfaceTextureHelper) null);
                    if (g.h(g.this) == null) {
                        return;
                    }
                    g.h(g.this).a();
                    g.b(g.this, (TrtcInputStreamImpl) null);
                }
            });
        }
        this.f23127a = null;
        this.b = null;
        this.c = null;
        TrtcLog.d("ExternalStream", "deinit");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void a(SurfaceViewRenderer surfaceViewRenderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e4719", new Object[]{this, surfaceViewRenderer});
            return;
        }
        synchronized (this.i) {
            this.j = surfaceViewRenderer;
        }
    }

    public ITrtcInputStream a(TrtcStreamConfig trtcStreamConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("bd18da5f", new Object[]{this, trtcStreamConfig, str});
        }
        if (!this.h) {
            TrtcLog.a("ExternalStream", "start capture, need init first");
            return null;
        }
        TrtcLog.d("ExternalStream", "startCapture, stream id:" + str);
        if (this.d == null) {
            this.d = new TrtcInputStreamImpl(this.f23127a, str, trtcStreamConfig);
        }
        this.b.startCapture(trtcStreamConfig.getVideoWidth(), trtcStreamConfig.getVideoHeight(), trtcStreamConfig.getVideoFps(), 2);
        return this.d;
    }

    public ITrtcInputStream b(TrtcStreamConfig trtcStreamConfig, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("8448267e", new Object[]{this, trtcStreamConfig, str});
        }
        if (!this.h || this.d == null) {
            TrtcLog.a("ExternalStream", "start sub capture error");
            return null;
        }
        TrtcLog.d("ExternalStream", "startSubCapture, stream id:" + str);
        if (this.e == null) {
            TrtcLog.d("ExternalStream", "new inputStreamSub");
            this.e = new TrtcInputStreamImpl(this.f23127a, str, trtcStreamConfig);
        }
        this.e.a(trtcStreamConfig);
        if (this.g == null) {
            TrtcLog.d("ExternalStream", "new surfaceTextureHelperSub");
            this.g = SurfaceTextureHelper.create("STH-SUB", this.f23127a.d());
        }
        this.b.a(this.g);
        this.b.setSubCapturerObserver(new CapturerObserver() { // from class: com.taobao.trtc.impl.g.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
            public void onCapturerStarted(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
            public void onCapturerStopped() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("844419e9", new Object[]{this});
                }
            }

            @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
            public void onFrameCaptured(VideoFrame videoFrame) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
                } else if (!g.a(g.this) || g.h(g.this) == null || g.e(g.this)) {
                } else {
                    g.h(g.this).a(videoFrame);
                    g.i(g.this);
                    if (g.j(g.this) != 0 && System.currentTimeMillis() - g.j(g.this) < 5000) {
                        return;
                    }
                    g.a(g.this, System.currentTimeMillis());
                    TrtcLog.d("ExternalStream", "onFrameCaptured sub streamID: " + str + " onFrame | fps:" + (g.k(g.this) / 5));
                    g.a(g.this, 0);
                }
            }
        });
        this.b.a(trtcStreamConfig.getVideoWidth(), trtcStreamConfig.getVideoHeight());
        return this.e;
    }

    public void b() {
        com.taobao.trtc.video.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TrtcLog.d("ExternalStream", "stopCapture pri");
        if (!this.h || (bVar = this.b) == null) {
            return;
        }
        try {
            bVar.stopCapture();
            this.b.dispose();
        } catch (Exception e) {
            TrtcLog.a("ExternalStream", "stop capture exception: " + e.getMessage());
        }
    }

    public void c() {
        com.taobao.trtc.video.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TrtcLog.d("ExternalStream", "stopCapture sub");
        if (!this.h || (bVar = this.b) == null) {
            return;
        }
        try {
            bVar.a();
        } catch (Exception e) {
            TrtcLog.a("ExternalStream", "stop sub capture exception: " + e.getMessage());
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.e;
        if (trtcInputStreamImpl != null) {
            trtcInputStreamImpl.a();
            TrtcLog.d("ExternalStream", "inputStreamSub = null");
            this.e = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.g;
        if (surfaceTextureHelper == null) {
            return;
        }
        surfaceTextureHelper.dispose();
        TrtcLog.d("ExternalStream", "surfaceTextureHelperSub = null");
        this.g = null;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TrtcLog.d("ExternalStream", "updateMixMode: " + i);
        if (!this.h) {
            return;
        }
        this.b.a(i);
    }

    public void a(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        com.taobao.trtc.video.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1359e950", new Object[]{this, trtcVideoLayoutParams});
        } else if (trtcVideoLayoutParams == null || (bVar = this.b) == null) {
        } else {
            bVar.setVideoSize(IArtcExternalVideoCapturer.CapturerType.SUB, trtcVideoLayoutParams.subWidth, trtcVideoLayoutParams.subHeight);
        }
    }

    public void a(String str, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505269c6", new Object[]{this, str, videoFrame});
            return;
        }
        com.taobao.trtc.video.c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.a(str, videoFrame);
    }

    @Override // com.taobao.trtc.video.b.d
    public void a(IArtcExternalVideoCapturer.CapturerType capturerType, int i, int i2) {
        TrtcInputStreamImpl trtcInputStreamImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e974f3", new Object[]{this, capturerType, new Integer(i), new Integer(i2)});
        } else if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
            TrtcInputStreamImpl trtcInputStreamImpl2 = this.d;
            if (trtcInputStreamImpl2 == null) {
                return;
            }
            trtcInputStreamImpl2.b.updateVideoSize(i, i2);
        } else if (capturerType != IArtcExternalVideoCapturer.CapturerType.SUB || (trtcInputStreamImpl = this.e) == null) {
        } else {
            trtcInputStreamImpl.b.updateVideoSize(i, i2);
        }
    }

    public void a(TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acd942d", new Object[]{this, iVar});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.d;
        if (trtcInputStreamImpl == null) {
            return;
        }
        trtcInputStreamImpl.a(iVar);
    }
}
