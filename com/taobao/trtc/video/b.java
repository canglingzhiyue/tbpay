package com.taobao.trtc.video;

import android.content.Context;
import android.view.Surface;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.IArtcExternalVideoCapturer;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.utils.h;
import java.nio.ByteBuffer;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import tb.kge;
import tb.qvc;

/* loaded from: classes9.dex */
public class b implements IArtcExternalVideoCapturer, VideoCapturer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TrtcExternalVideoCapturer";
    private SurfaceTextureHelper c;
    private SurfaceTextureHelper d;
    private IArtcExternalVideoCapturer.Observer i;
    private IArtcExternalVideoCapturer.Observer j;
    private d k;
    private c q;
    private c r;
    private a s;
    private a t;

    /* renamed from: a  reason: collision with root package name */
    private final Object f23198a = new Object();
    private final Object b = new Object();
    private C0993b g = null;
    private C0993b h = null;
    private CameraVideoCapturer.CameraEventsHandler l = null;
    private CameraVideoCapturer.CameraEventsHandler m = null;
    private CameraVideoCapturer.CameraStatistics n = null;
    private CameraVideoCapturer.CameraStatistics o = null;
    private CameraVideoCapturer.CameraStatistics p = null;
    private com.taobao.trtc.impl.f u = null;
    private Surface e = null;
    private Surface f = null;

    /* loaded from: classes9.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f23210a;
        public int b;

        static {
            kge.a(-1754217020);
        }

        public c(int i, int i2) {
            this.f23210a = i;
            this.b = i2;
        }
    }

    /* loaded from: classes9.dex */
    public interface d {
        void a(IArtcExternalVideoCapturer.CapturerType capturerType, int i, int i2);
    }

    static {
        kge.a(-907943572);
        kge.a(1157743024);
        kge.a(1096430148);
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03670f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
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
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, VideoCapturer.CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2bf1fa", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
        }
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db66480", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // org.webrtc.VideoCapturer
    public void onVideoFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e83fa40", new Object[]{this, videoFrame});
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
    public void setDummyRender(com.taobao.trtc.video.a aVar) {
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
    public void setSubDummyRender(com.taobao.trtc.video.a aVar) {
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

    public static /* synthetic */ d a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bfb824c", new Object[]{bVar}) : bVar.k;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics a(b bVar, CameraVideoCapturer.CameraStatistics cameraStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("344b4f96", new Object[]{bVar, cameraStatistics});
        }
        bVar.n = cameraStatistics;
        return cameraStatistics;
    }

    public static /* synthetic */ C0993b b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0993b) ipChange.ipc$dispatch("d31d4ed", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics b(b bVar, CameraVideoCapturer.CameraStatistics cameraStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("a7584bd7", new Object[]{bVar, cameraStatistics});
        }
        bVar.o = cameraStatistics;
        return cameraStatistics;
    }

    public static /* synthetic */ C0993b c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0993b) ipChange.ipc$dispatch("e6827cc", new Object[]{bVar}) : bVar.h;
    }

    public static /* synthetic */ Object d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ac4b031b", new Object[]{bVar}) : bVar.f23198a;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("fc6282e6", new Object[]{bVar}) : bVar.n;
    }

    public static /* synthetic */ com.taobao.trtc.impl.f f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.trtc.impl.f) ipChange.ipc$dispatch("3176216a", new Object[]{bVar}) : bVar.u;
    }

    public static /* synthetic */ SurfaceTextureHelper g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTextureHelper) ipChange.ipc$dispatch("7bf17fb2", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraEventsHandler h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraVideoCapturer.CameraEventsHandler) ipChange.ipc$dispatch("20e6423f", new Object[]{bVar}) : bVar.l;
    }

    public static /* synthetic */ c i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("15ae1925", new Object[]{bVar}) : bVar.q;
    }

    public static /* synthetic */ SurfaceTextureHelper j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTextureHelper) ipChange.ipc$dispatch("38acce8f", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ c k(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("181abee3", new Object[]{bVar}) : bVar.r;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraStatistics l(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraVideoCapturer.CameraStatistics) ipChange.ipc$dispatch("ab6bbe3f", new Object[]{bVar}) : bVar.o;
    }

    public static /* synthetic */ CameraVideoCapturer.CameraEventsHandler m(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraVideoCapturer.CameraEventsHandler) ipChange.ipc$dispatch("8344f044", new Object[]{bVar}) : bVar.m;
    }

    public void a(com.taobao.trtc.impl.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434a4951", new Object[]{this, fVar});
        } else {
            this.u = fVar;
        }
    }

    /* renamed from: com.taobao.trtc.video.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0993b implements VideoSink {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object f23209a = new Object();
        private final Object b = new Object();
        private CameraVideoCapturer.CameraStatistics c;
        private CapturerObserver d;
        private final a e;
        private final IArtcExternalVideoCapturer.CapturerType f;

        static {
            kge.a(1464575337);
            kge.a(-1747124137);
        }

        public static /* synthetic */ CapturerObserver a(C0993b c0993b) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CapturerObserver) ipChange.ipc$dispatch("7e80a254", new Object[]{c0993b}) : c0993b.d;
        }

        public static /* synthetic */ CapturerObserver a(C0993b c0993b, CapturerObserver capturerObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CapturerObserver) ipChange.ipc$dispatch("3c25f324", new Object[]{c0993b, capturerObserver});
            }
            c0993b.d = capturerObserver;
            return capturerObserver;
        }

        public C0993b(CapturerObserver capturerObserver, a aVar, IArtcExternalVideoCapturer.CapturerType capturerType) {
            TrtcLog.d(b.TAG, "TrtcVideoSink ctor capturerType:" + capturerType);
            synchronized (this.f23209a) {
                this.d = capturerObserver;
            }
            this.e = aVar;
            this.f = capturerType;
        }

        @Override // org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
                return;
            }
            synchronized (this.f23209a) {
                if (this.d != null) {
                    if (this.c != null) {
                        videoFrame.setTimestampNs(videoFrame.getTimestampNs() - (CameraVideoCapturer.CameraStatistics.preProcessCostTime * 1000000));
                    }
                    this.d.onFrameCaptured(videoFrame);
                }
            }
            synchronized (this.b) {
                if (this.c != null) {
                    this.c.addFrame();
                }
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            TrtcLog.d(b.TAG, "startStatistics, type: " + this.f);
            a aVar = this.e;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }

        public void a(CapturerObserver capturerObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4254820", new Object[]{this, capturerObserver});
                return;
            }
            synchronized (this.f23209a) {
                this.d = capturerObserver;
            }
        }

        public void b(CapturerObserver capturerObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1450c3f", new Object[]{this, capturerObserver});
                return;
            }
            synchronized (this.f23209a) {
                if (capturerObserver != null) {
                    if (capturerObserver != this.d) {
                        TrtcLog.d(b.TAG, "updateObserver, " + this.d + " -> " + capturerObserver);
                        this.d = capturerObserver;
                    }
                }
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            TrtcLog.d(b.TAG, "resetObserver");
            synchronized (this.f23209a) {
                TrtcLog.d(b.TAG, "capturerObserver = null");
                this.d = null;
            }
        }

        public void a(CameraVideoCapturer.CameraStatistics cameraStatistics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3e608b8", new Object[]{this, cameraStatistics});
                return;
            }
            synchronized (this.b) {
                TrtcLog.d(b.TAG, "setStatistics, statistics: " + cameraStatistics);
                this.c = cameraStatistics;
            }
        }
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoCapturer
    public Surface getSurface(IArtcExternalVideoCapturer.CapturerType capturerType) {
        Surface surface;
        Surface surface2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("8bc907c5", new Object[]{this, capturerType});
        }
        if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
            synchronized (this.f23198a) {
                if (this.c != null && this.e == null) {
                    TrtcLog.d(TAG, "new priSurface");
                    this.e = new Surface(this.c.getSurfaceTexture());
                }
                TrtcLog.d(TAG, "get pri surface:" + this.e + ", priSurfaceTextureHelper:" + this.c);
                surface2 = this.e;
            }
            return surface2;
        }
        synchronized (this.b) {
            if (this.d != null && this.f == null) {
                TrtcLog.d(TAG, "new subSurface");
                this.f = new Surface(this.d.getSurfaceTexture());
            }
            TrtcLog.d(TAG, "get sub surface:" + this.f + ", subSurfaceTextureHelper:" + this.d);
            surface = this.f;
        }
        return surface;
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoCapturer
    public void setObserver(IArtcExternalVideoCapturer.CapturerType capturerType, IArtcExternalVideoCapturer.Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca1efef", new Object[]{this, capturerType, observer});
            return;
        }
        if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
            synchronized (this.f23198a) {
                this.i = observer;
            }
        } else {
            synchronized (this.b) {
                this.j = observer;
            }
        }
        TrtcLog.d(TAG, "setObserver:" + observer + " type:" + capturerType);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e74da", new Object[]{this, dVar});
            return;
        }
        this.k = dVar;
        TrtcLog.d(TAG, "set video size observer: " + dVar);
    }

    private void a(final IArtcExternalVideoCapturer.CapturerType capturerType, final SurfaceTextureHelper surfaceTextureHelper, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ffadb", new Object[]{this, capturerType, surfaceTextureHelper, new Integer(i), new Integer(i2)});
        } else if (surfaceTextureHelper == null) {
        } else {
            surfaceTextureHelper.getHandler().post(new Runnable() { // from class: com.taobao.trtc.video.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TrtcLog.d(b.TAG, "update VideoSize, " + i + "x" + i2 + ", type: " + capturerType);
                    surfaceTextureHelper.stopListening();
                    if (b.a(b.this) != null) {
                        b.a(b.this).a(capturerType, i, i2);
                    }
                    surfaceTextureHelper.setTextureSize(i, i2);
                    if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
                        surfaceTextureHelper.startListening(b.b(b.this));
                    } else if (capturerType != IArtcExternalVideoCapturer.CapturerType.SUB) {
                    } else {
                        surfaceTextureHelper.startListening(b.c(b.this));
                    }
                }
            });
        }
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoCapturer
    public void setVideoSize(IArtcExternalVideoCapturer.CapturerType capturerType, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29759da", new Object[]{this, capturerType, new Integer(i), new Integer(i2)});
        } else if (capturerType == IArtcExternalVideoCapturer.CapturerType.PRI) {
            TrtcLog.d(TAG, "PRI setVideoSize, " + i + "x" + i2);
            c cVar = this.q;
            if (cVar != null && (cVar.f23210a != i || this.q.b != i2)) {
                c cVar2 = this.q;
                cVar2.f23210a = i;
                cVar2.b = i2;
                a(capturerType, this.c, i, i2);
                return;
            }
            this.q = new c(i, i2);
        } else if (capturerType != IArtcExternalVideoCapturer.CapturerType.SUB) {
        } else {
            TrtcLog.d(TAG, "SUB setVideoSize, " + i + "x" + i2);
            c cVar3 = this.r;
            if (cVar3 != null) {
                if (cVar3.f23210a == i && this.r.b == i2) {
                    return;
                }
                c cVar4 = this.r;
                cVar4.f23210a = i;
                cVar4.b = i2;
                a(capturerType, this.d, i, i2);
                return;
            }
            this.r = new c(i, i2);
        }
    }

    @Override // com.taobao.artc.api.IArtcExternalVideoCapturer
    public void updateFrameInfo(IArtcExternalVideoCapturer.CapturerType capturerType, final IArtcExternalVideoCapturer.FrameInfo frameInfo) {
        SurfaceTextureHelper surfaceTextureHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec841d36", new Object[]{this, capturerType, frameInfo});
        } else if (capturerType != IArtcExternalVideoCapturer.CapturerType.PRI || this.n == null || (surfaceTextureHelper = this.c) == null) {
        } else {
            surfaceTextureHelper.getHandler().post(new Runnable() { // from class: com.taobao.trtc.video.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (b.d(b.this)) {
                        if (b.e(b.this) != null && frameInfo != null) {
                            b.e(b.this).addBeautyFrame();
                            b.e(b.this).addBeautyCostTime(frameInfo.preCostMs);
                        }
                    }
                }
            });
        }
    }

    public void a(int i) {
        IArtcExternalVideoCapturer.MixMode mixMode;
        C0993b c0993b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TrtcLog.d(TAG, "updateMixMode: " + i);
        if (i == 1) {
            mixMode = IArtcExternalVideoCapturer.MixMode.NEED_MIX_SCALE;
        } else if (i == 3) {
            mixMode = IArtcExternalVideoCapturer.MixMode.NEED_SCALE;
        } else {
            mixMode = IArtcExternalVideoCapturer.MixMode.NONE;
        }
        IArtcExternalVideoCapturer.Observer observer = this.i;
        if (observer == null) {
            return;
        }
        observer.onExternalVideoCaptureMixMode(mixMode);
        if ((mixMode != IArtcExternalVideoCapturer.MixMode.NEED_MIX_SCALE && mixMode != IArtcExternalVideoCapturer.MixMode.NEED_SCALE) || (c0993b = this.h) == null) {
            return;
        }
        c0993b.a();
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6a2077", new Object[]{this, surfaceTextureHelper, context, capturerObserver});
            return;
        }
        synchronized (this.f23198a) {
            TrtcLog.d(TAG, "Initialize, surfaceTextureHelper:" + surfaceTextureHelper + ", capture observer:" + capturerObserver);
            this.c = surfaceTextureHelper;
            if (this.l == null) {
                this.l = new CameraVideoCapturer.CameraEventsHandler() { // from class: com.taobao.trtc.video.b.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onCameraClosed() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("128938f7", new Object[]{this});
                        }
                    }

                    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onCameraDisconnected() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("14a23346", new Object[]{this});
                        }
                    }

                    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onCameraError(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e259615", new Object[]{this, str});
                        }
                    }

                    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onCameraOpening(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("226fce65", new Object[]{this, str});
                        }
                    }

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
                    public void onCameraFreezed(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8c3133fa", new Object[]{this, str});
                            return;
                        }
                        h.a(b.TAG, "Pri external capture freezed");
                        if (!qvc.a("enableCaptureFreezedUpdate", true)) {
                            return;
                        }
                        b.f(b.this).e(str, "pri");
                    }

                    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onFirstFrameAvailable() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf76454", new Object[]{this});
                        } else {
                            TrtcLog.a(b.TAG, "pri capture onFirstFrameAvailable");
                        }
                    }
                };
            }
            this.s = new a() { // from class: com.taobao.trtc.video.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.trtc.video.b.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    TrtcLog.d(b.TAG, "onPriStatisticsStart");
                    if (b.e(b.this) == null) {
                        b bVar = b.this;
                        b.a(bVar, new CameraVideoCapturer.CameraStatistics(b.g(bVar), b.h(b.this)));
                    }
                    if (b.b(b.this) == null) {
                        return;
                    }
                    b.b(b.this).a(b.e(b.this));
                }
            };
            if (this.g == null && capturerObserver != null) {
                this.g = new C0993b(capturerObserver, this.s, IArtcExternalVideoCapturer.CapturerType.PRI);
            }
            if (this.i != null) {
                TrtcLog.a(TAG, "startPriCapture onExternalVideoCaptureInitialized");
                this.i.onExternalVideoCaptureInitialized();
            }
            this.g.b(capturerObserver);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e95964b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        synchronized (this.f23198a) {
            TrtcLog.d(TAG, "startCapture, " + i + "x" + i2 + "@" + i3 + "fps, format:" + i4);
            if (this.g != null && C0993b.a(this.g) != null) {
                C0993b.a(this.g).onCapturerStarted(true);
            }
            if (this.c != null && this.c.getHandler() != null) {
                this.c.getHandler().post(new Runnable() { // from class: com.taobao.trtc.video.b.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b.g(b.this).startListening(b.b(b.this));
                        if (b.i(b.this) != null) {
                            b.g(b.this).setTextureSize(b.i(b.this).f23210a, b.i(b.this).b);
                        } else {
                            TrtcLog.a(b.TAG, "start PRI capture error for video size invalid");
                        }
                    }
                });
            }
            if (this.i != null) {
                TrtcLog.a(TAG, "startPriCapture onExternalVideoCaptureStarted");
                this.i.onExternalVideoCaptureStarted();
                if (this.g != null) {
                    this.g.a();
                }
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6236b", new Object[]{this});
            return;
        }
        TrtcLog.d(TAG, "stopCapture");
        SurfaceTextureHelper surfaceTextureHelper = this.c;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.getHandler().post(new Runnable() { // from class: com.taobao.trtc.video.b.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.g(b.this).stopListening();
                    }
                }
            });
        }
        synchronized (this.f23198a) {
            if (this.g != null) {
                this.g.a((CameraVideoCapturer.CameraStatistics) null);
                if (C0993b.a(this.g) != null) {
                    C0993b.a(this.g).onCapturerStopped();
                }
            }
            if (this.i != null) {
                this.i.onExternalVideoCaptureStopped();
            }
            if (this.n != null) {
                this.n.release();
                this.n = null;
            }
        }
    }

    public void a(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bada4c6", new Object[]{this, surfaceTextureHelper});
            return;
        }
        synchronized (this.b) {
            TrtcLog.d(TAG, "initSubCapture:" + surfaceTextureHelper);
            this.d = surfaceTextureHelper;
            if (this.j != null) {
                TrtcLog.a(TAG, "initSubCapture onExternalVideoCaptureInitialized");
                this.j.onExternalVideoCaptureInitialized();
            }
        }
    }

    public void a(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        synchronized (this.b) {
            TrtcLog.d(TAG, "startSubCapture width:" + i + " height:" + i2);
            if (this.h != null && C0993b.a(this.h) != null) {
                C0993b.a(this.h).onCapturerStarted(true);
            }
            if (this.d != null && this.d.getHandler() != null) {
                this.d.getHandler().post(new Runnable() { // from class: com.taobao.trtc.video.b.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b.j(b.this).startListening(b.c(b.this));
                        if (b.k(b.this) == null) {
                            b.j(b.this).setTextureSize(i, i2);
                            TrtcLog.d(b.TAG, "SUB start capture error for video size invalid, use size from video layout");
                            return;
                        }
                        TrtcLog.d(b.TAG, "subSurface setTextureSize: " + b.k(b.this).f23210a + "x" + b.k(b.this).b);
                        b.j(b.this).setTextureSize(b.k(b.this).f23210a, b.k(b.this).b);
                    }
                });
            }
            if (this.j != null) {
                TrtcLog.a(TAG, "startSubCapture onExternalVideoCaptureStarted");
                this.j.onExternalVideoCaptureStarted();
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TrtcLog.d(TAG, "stopSubCapture");
        SurfaceTextureHelper surfaceTextureHelper = this.d;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.getHandler().post(new Runnable() { // from class: com.taobao.trtc.video.b.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.j(b.this).stopListening();
                    }
                }
            });
        }
        synchronized (this.b) {
            if (this.h != null && C0993b.a(this.h) != null) {
                C0993b.a(this.h).onCapturerStopped();
                C0993b.a(this.h, null);
            }
            if (this.j != null) {
                this.j.onExternalVideoCaptureStopped();
            }
            if (this.o != null) {
                this.o.release();
                this.o = null;
            }
            TrtcLog.d(TAG, "subVideoSink = null subSurface = null");
            this.h = null;
            this.f = null;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void setSubCapturerObserver(CapturerObserver capturerObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ad1ce1", new Object[]{this, capturerObserver});
            return;
        }
        synchronized (this.b) {
            if (capturerObserver != null) {
                try {
                    TrtcLog.d(TAG, "setSubCapturerObserver:" + capturerObserver);
                    if (this.m == null) {
                        this.m = new CameraVideoCapturer.CameraEventsHandler() { // from class: com.taobao.trtc.video.b.10
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                            public void onCameraClosed() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("128938f7", new Object[]{this});
                                }
                            }

                            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                            public void onCameraDisconnected() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("14a23346", new Object[]{this});
                                }
                            }

                            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                            public void onCameraError(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7e259615", new Object[]{this, str});
                                }
                            }

                            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                            public void onCameraOpening(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("226fce65", new Object[]{this, str});
                                }
                            }

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
                            public void onCameraFreezed(String str) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8c3133fa", new Object[]{this, str});
                                    return;
                                }
                                h.a(b.TAG, "Sub external capture freezed");
                                if (!qvc.a("enableCaptureFreezedUpdate", true)) {
                                    return;
                                }
                                b.f(b.this).e(str, com.taobao.android.weex_framework.util.a.ATOM_EXT_sub);
                            }

                            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
                            public void onFirstFrameAvailable() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("cf76454", new Object[]{this});
                                } else {
                                    TrtcLog.a(b.TAG, "pri capture onFirstFrameAvailable");
                                }
                            }
                        };
                    }
                    this.t = new a() { // from class: com.taobao.trtc.video.b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.trtc.video.b.a
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            TrtcLog.d(b.TAG, "onSubStatisticsStart");
                            if (b.l(b.this) == null) {
                                b bVar = b.this;
                                b.b(bVar, new CameraVideoCapturer.CameraStatistics(b.j(bVar), b.m(b.this)));
                            }
                            if (b.c(b.this) == null) {
                                return;
                            }
                            b.c(b.this).a(b.l(b.this));
                        }
                    };
                    if (this.h == null) {
                        TrtcLog.d(TAG, "new subVideoSink");
                        this.h = new C0993b(capturerObserver, this.t, IArtcExternalVideoCapturer.CapturerType.SUB);
                    } else if (C0993b.a(this.h) == null) {
                        TrtcLog.d(TAG, "subVideoSink setObserver");
                        this.h.a(capturerObserver);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (capturerObserver == null && this.h != null) {
                TrtcLog.d(TAG, "resetSubCapturerObserver");
                this.h.b();
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void resetCapturerObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0df0458", new Object[]{this});
            return;
        }
        synchronized (this.f23198a) {
            if (this.g != null) {
                TrtcLog.d(TAG, "resetCapturerObserver");
                this.g.b();
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            TrtcLog.d(TAG, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        }
    }
}
