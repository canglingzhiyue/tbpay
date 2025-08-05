package com.taobao.trtc.impl;

import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcException;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.api.TrtcVideoDevice;
import com.taobao.trtc.impl.TrtcInnerDefines;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.video.TrtcDecodedTextureHelper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoFrame;
import tb.kge;

/* loaded from: classes9.dex */
public class l implements TrtcVideoDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TrtcEngineImpl f23145a;
    private EglBase b;
    private EglBase.Context c;
    private long d;
    private SurfaceViewRenderer e;
    private d j;
    private j k;
    private final f n;
    private g o;
    private a p;
    private final Map<String, SurfaceViewRenderer> f = new HashMap();
    private final AtomicBoolean g = new AtomicBoolean(false);
    private boolean h = false;
    private boolean i = false;
    private final Map<String, TrtcInputStreamImpl> l = new HashMap();
    private final Map<String, i> m = new HashMap();

    static {
        kge.a(-1708110396);
        kge.a(566529664);
    }

    public static /* synthetic */ f a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("5d155554", new Object[]{lVar}) : lVar.n;
    }

    /* loaded from: classes9.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f23147a;
        public int b;
        private int d;

        static {
            kge.a(222505228);
        }

        private a() {
            this.f23147a = 360;
            this.b = 640;
            this.d = 20;
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2ef44e1", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("baf9cbc8", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.d = i;
            return i;
        }
    }

    /* loaded from: classes9.dex */
    public class b implements RendererCommon.RendererEvents {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;

        static {
            kge.a(-346719241);
            kge.a(176547547);
        }

        public b(String str) {
            this.b = str;
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db6440b8", new Object[]{this});
                return;
            }
            com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "[renderEvent] first frame rendered, id: " + this.b);
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c569a442", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "[renderEvent] frame resoution change: " + i + "x" + i2 + ", rotation: " + i3);
        }
    }

    public l(TrtcEngineImpl trtcEngineImpl, f fVar) {
        this.f23145a = trtcEngineImpl;
        this.n = fVar;
    }

    public f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("d77943d7", new Object[]{this}) : this.n;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g.get()) {
        } else {
            this.b = EglBase.StaticMethod.create();
            this.c = this.b.mo2430getEglBaseContext();
            this.d = this.c.getNativeEglContext();
            TrtcDecodedTextureHelper.setEglBase(this.c);
            this.g.set(true);
            TrtcLog.d("TrtcVideoDeivce", "init done");
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TrtcLog.d("TrtcVideoDeivce", "deInit start");
        this.g.set(false);
        if (this.o != null) {
            this.o.a();
            this.o = null;
        }
        if (this.e != null) {
            this.e.release();
            this.e = null;
        }
        for (SurfaceViewRenderer surfaceViewRenderer : this.f.values()) {
            if (surfaceViewRenderer != null) {
                surfaceViewRenderer.release();
            }
        }
        this.f.clear();
        if (this.j != null) {
            this.j.h();
            this.j = null;
        }
        if (this.k != null) {
            this.k.b();
            this.k = null;
        }
        for (String str : this.l.keySet()) {
            a(str);
        }
        for (String str2 : this.m.keySet()) {
            c(str2);
        }
        this.l.clear();
        this.m.clear();
        TrtcDecodedTextureHelper.disposeEglContext();
        if (this.b != null) {
            this.c = null;
            this.b.release();
            this.b = null;
        }
        this.f23145a = null;
        TrtcLog.d("TrtcVideoDeivce", "deInit done");
    }

    public EglBase.Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EglBase.Context) ipChange.ipc$dispatch("7e0636cb", new Object[]{this});
        }
        if (!this.g.get()) {
            b();
        }
        return this.c;
    }

    public TrtcInnerConfig e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcInnerConfig) ipChange.ipc$dispatch("591b046e", new Object[]{this}) : this.f23145a.i();
    }

    public TrtcEngineImpl f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcEngineImpl) ipChange.ipc$dispatch("5b31402f", new Object[]{this});
        }
        if (!this.g.get()) {
            return null;
        }
        return this.f23145a;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.d;
    }

    public void a(String str, VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505269c6", new Object[]{this, str, videoFrame});
        } else if (videoFrame != null && str != null) {
            if (this.o != null) {
                if (!this.f23145a.x()) {
                    this.o.a((String) null, videoFrame);
                } else {
                    this.o.a(str, videoFrame);
                }
            }
            SurfaceViewRenderer surfaceViewRenderer = this.f.get(str);
            if (surfaceViewRenderer != null) {
                surfaceViewRenderer.onFrame(videoFrame);
                return;
            }
            for (SurfaceViewRenderer surfaceViewRenderer2 : this.f.values()) {
                surfaceViewRenderer2.onFrame(videoFrame);
            }
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!str2.isEmpty()) {
            this.n.d(str2);
            for (i iVar : this.m.values()) {
                if (iVar != null) {
                    iVar.a(str2);
                }
            }
        }
    }

    public void a(String str, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f585aa", new Object[]{this, str, bArr, new Integer(i)});
        } else if (bArr.length <= 0) {
        } else {
            TrtcLog.d("TrtcVideoDeivce", "onData - stream id: " + str + ", type: " + i);
            if (this.j != null) {
                TrtcLog.d("TrtcVideoDeivce", "onData - camear stream id: " + str);
                this.j.a(str, bArr, i);
            }
            TrtcInputStreamImpl trtcInputStreamImpl = this.l.get(str);
            if (trtcInputStreamImpl != null) {
                TrtcLog.d("TrtcVideoDeivce", "onData - input stream id: " + str);
                trtcInputStreamImpl.a(bArr, i);
                return;
            }
            i iVar = this.m.get(str);
            if (iVar == null) {
                return;
            }
            TrtcLog.d("TrtcVideoDeivce", "onData - output stream id: " + str);
            iVar.a(bArr, i);
        }
    }

    public TrtcInputStreamImpl a(String str, TrtcStreamConfig trtcStreamConfig, ITrtcInputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrtcInputStreamImpl) ipChange.ipc$dispatch("9cc72aa0", new Object[]{this, str, trtcStreamConfig, aVar});
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.l.get(str);
        if (trtcInputStreamImpl != null) {
            TrtcLog.d("TrtcVideoDeivce", "stream id:" + str + ", input stream exist");
            trtcInputStreamImpl.a(aVar);
            return this.l.get(str);
        }
        TrtcInputStreamImpl trtcInputStreamImpl2 = new TrtcInputStreamImpl(this, str, trtcStreamConfig, aVar);
        trtcInputStreamImpl2.a(aVar);
        this.l.put(str, trtcInputStreamImpl2);
        return trtcInputStreamImpl2;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.l.get(str);
        if (trtcInputStreamImpl != null) {
            trtcInputStreamImpl.a();
        }
        this.l.remove(str);
    }

    public i b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("e746cec9", new Object[]{this, str});
        }
        if (this.m.get(str) != null) {
            TrtcLog.d("TrtcVideoDeivce", "stream id: " + str + ", output stream exist");
            return this.m.get(str);
        }
        i iVar = new i(this.f23145a, str);
        this.m.put(str, iVar);
        return iVar;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        i iVar = this.m.get(str);
        if (iVar == null) {
            return;
        }
        iVar.b();
        this.m.remove(str);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        i iVar = this.m.get(str);
        if (iVar == null) {
            return;
        }
        iVar.a();
    }

    public void a(TrtcDefines.TrtcMixMode trtcMixMode) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c4b2a4", new Object[]{this, trtcMixMode});
            return;
        }
        TrtcLog.d("TrtcVideoDeivce", "onMixModeUpdate: " + trtcMixMode);
        d dVar = this.j;
        if (dVar != null) {
            if (trtcMixMode == TrtcDefines.TrtcMixMode.MIX_LOCAL) {
                z = true;
            }
            dVar.a(z);
        }
        int ordinal = trtcMixMode.ordinal();
        if (this.o == null) {
            return;
        }
        if (this.f23145a.x()) {
            ordinal = TrtcDefines.TrtcMixMode.MiX_SERVER.ordinal() + 1;
        }
        this.o.a(ordinal);
    }

    public synchronized void a(TrtcDefines.i iVar, TrtcDefines.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580bb423", new Object[]{this, iVar, nVar});
            return;
        }
        if (this.j != null) {
            this.j.a(iVar);
        }
        g h = ((l) this.f23145a.f()).h();
        if (h != null && "TrtcLiveStream".equals(iVar.f23041a)) {
            h.a(iVar);
            return;
        }
        for (String str : this.l.keySet()) {
            if (str.equals(iVar.f23041a)) {
                this.l.get(str).a(iVar);
            }
        }
        for (String str2 : this.m.keySet()) {
            if (str2.equals(nVar.f23046a)) {
                this.m.get(str2).a(nVar);
            }
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void setEventObserver(ITrtcObserver.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ce68a2", new Object[]{this, fVar});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "API - setVideoEventObserver: " + fVar);
        this.n.a(fVar);
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void setVideoMirror(boolean z, boolean z2) {
        CameraVideoCapturer g;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e60559f", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "setVideoMirror, pushMirror:" + z + " previewMirror:" + z2);
        if (!this.f23145a.f("setVideoMirror")) {
            return;
        }
        this.h = z;
        this.i = z2;
        if (z2 == z) {
            z3 = false;
        }
        if (this.e != null) {
            this.e.setMirror(z3);
        }
        if (this.j != null && (g = this.j.g()) != null) {
            g.setVideoContentMirror(z);
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void setLocalView(SurfaceViewRenderer surfaceViewRenderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415f16a6", new Object[]{this, surfaceViewRenderer});
        } else if (!this.f23145a.f("setLocalView")) {
        } else {
            com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "API - setLocalView, view: " + surfaceViewRenderer);
            if (this.f23145a.i().config.isUseExternalVideoRender()) {
                TrtcLog.a("TrtcVideoDeivce", "external video render is set, can not do this");
                return;
            }
            if (this.e != null) {
                if (surfaceViewRenderer == null) {
                    TrtcLog.d("TrtcVideoDeivce", "setLocalView release old local by null,  view: " + this.e);
                    this.e.release();
                    this.e = null;
                } else if (this.e.equals(surfaceViewRenderer)) {
                    com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "setLocalView, is the same render, ignore it");
                    return;
                } else {
                    TrtcLog.d("TrtcVideoDeivce", "setLocalView release old local by new render view: " + this.e);
                    this.e.release();
                    this.e = null;
                }
            }
            if (surfaceViewRenderer != null && this.b != null) {
                try {
                    surfaceViewRenderer.init(this.b.mo2430getEglBaseContext(), new b(f().w()));
                } catch (Exception unused) {
                }
                surfaceViewRenderer.setIsRemote(false);
                TrtcLog.d("TrtcVideoDeivce", "setLocalView, init view: " + surfaceViewRenderer);
            }
            this.e = surfaceViewRenderer;
            if (this.j != null) {
                this.j.a(this.e);
            }
            setVideoMirror(this.h, this.i);
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void setRemoteVideoView(SurfaceViewRenderer surfaceViewRenderer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3a8c5a", new Object[]{this, surfaceViewRenderer, str});
        } else if (!this.f23145a.f("setRemoteVideoView")) {
        } else {
            com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "API - setRemoteVideoView, userId:" + str + ", view: " + surfaceViewRenderer);
            SurfaceViewRenderer surfaceViewRenderer2 = this.f.get(str);
            if (surfaceViewRenderer2 != null) {
                if (surfaceViewRenderer == null) {
                    surfaceViewRenderer2.release();
                    this.f.remove(str);
                    TrtcLog.d("TrtcVideoDeivce", "release remote view by null for id: " + str);
                    return;
                } else if (surfaceViewRenderer2.equals(surfaceViewRenderer)) {
                    com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "setRemoteVideoView, is the same render, ignore it");
                    return;
                } else {
                    surfaceViewRenderer2.release();
                    this.f.remove(str);
                    TrtcLog.d("TrtcVideoDeivce", "release remote view by new render, for id: " + str);
                }
            }
            if (surfaceViewRenderer != null && this.b != null) {
                try {
                    surfaceViewRenderer.init(this.b.mo2430getEglBaseContext(), new b(str));
                } catch (Exception unused) {
                }
                surfaceViewRenderer.setIsRemote(true);
                surfaceViewRenderer.setMirror(false);
                surfaceViewRenderer.setEnableHardwareScaler(true);
                this.f.put(str, surfaceViewRenderer);
                if (this.j != null && this.j.g() != null) {
                    surfaceViewRenderer.setVideoCapturer(this.j.g());
                }
                TrtcLog.d("TrtcVideoDeivce", "add remote view, for id: " + str);
            }
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void muteLocalVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0fc204", new Object[]{this, new Boolean(z)});
            return;
        }
        d dVar = this.j;
        if (dVar == null) {
            return;
        }
        dVar.d(z);
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void enableTorch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585a4294", new Object[]{this, new Boolean(z)});
            return;
        }
        d dVar = this.j;
        if (dVar == null) {
            return;
        }
        dVar.c(z);
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public boolean isFrontFacing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bb723e4", new Object[]{this})).booleanValue();
        }
        d dVar = this.j;
        if (dVar != null && dVar.g() != null) {
            return this.j.g().isFrontFacing();
        }
        return false;
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public Bitmap takeRemoteSnapshot(String str) {
        SurfaceViewRenderer surfaceViewRenderer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("28c76540", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (surfaceViewRenderer = this.f.get(str)) == null) {
            return null;
        }
        return surfaceViewRenderer.takeSnapshot();
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void setSubCaptureParams(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb9666e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.p == null) {
            this.p = new a();
        }
        a.a(this.p, i3);
        this.p.b = i2;
        this.p.f23147a = i;
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void preferredFront(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a4e05", new Object[]{this, new Boolean(z)});
        } else {
            e().config.setPreferFrontCamera(z);
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public ITrtcInputStream startScreenCapture(TrtcStreamConfig trtcStreamConfig, Intent intent) throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("1392ffd5", new Object[]{this, trtcStreamConfig, intent});
        }
        com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "API - startScreenCapture, " + trtcStreamConfig.ToString());
        if (!this.f23145a.f("startScreenCapture") || intent == null) {
            return null;
        }
        TrtcLog.d("TrtcVideoDeivce", "start capture for screen stream: " + trtcStreamConfig.ToString());
        if (this.k == null) {
            this.k = new j(this.f23145a.w(), this, trtcStreamConfig, this.l.get(this.f23145a.w()));
        }
        this.k.a(intent);
        return this.k.c();
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void stopScreenCapture() throws TrtcException {
        j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2284e0df", new Object[]{this});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "API - stopScreenCapture");
        if (!this.f23145a.f("stopScreenCapture") || (jVar = this.k) == null) {
            return;
        }
        jVar.a();
        this.k.b();
        this.k = null;
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void pauseScreenCapture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331f6c9", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "API - pauseScreenCapture - " + z);
        j jVar = this.k;
        if (jVar == null) {
            return;
        }
        jVar.a(z);
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized ITrtcInputStream startCapture(TrtcStreamConfig trtcStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("390a1a66", new Object[]{this, trtcStreamConfig});
        }
        com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "API - startCapture, " + trtcStreamConfig.ToString());
        if (!this.f23145a.f("startCapture")) {
            return null;
        }
        if (this.f23145a.i().config.isUseExternalVideoCapture() && this.o != null) {
            TrtcLog.d("TrtcVideoDeivce", "start capture for external stream");
            if (this.e != null) {
                this.o.a(this.e);
            }
            return this.o.a(trtcStreamConfig, e().config.getUserId());
        }
        TrtcLog.d("TrtcVideoDeivce", "start capture for camera stream");
        if (this.j == null) {
            this.j = new d(this.f23145a.w(), this, trtcStreamConfig, this.l.get(this.f23145a.w()));
        }
        if (this.e != null) {
            this.j.a(this.e);
        }
        this.j.a();
        setVideoMirror(this.h, this.i);
        return this.j.c();
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void stopCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba6236b", new Object[]{this});
            return;
        }
        com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "API - stopCapture");
        if (!this.f23145a.f("stopCapture")) {
            return;
        }
        if (this.j != null) {
            this.j.b();
        }
        if (this.o != null) {
            this.o.b();
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized ITrtcInputStream startSubCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream) ipChange.ipc$dispatch("bf168a5e", new Object[]{this});
        } else if (!this.f23145a.f("startSubCapture")) {
            return null;
        } else {
            if (this.f23145a.i().config.isUseExternalVideoCapture() && this.o != null) {
                TrtcLog.d("TrtcVideoDeivce", "start sub capture for external stream");
                return this.o.b(new TrtcStreamConfig.a().d(true).a(this.p.f23147a, this.p.b, a.a(this.p)).a(), e().config.getUserId());
            }
            TrtcLog.d("TrtcVideoDeivce", "start sub capture for camera stream");
            if (this.j == null) {
                return null;
            }
            this.j.e();
            return this.j.d();
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public synchronized void stopSubCapture() throws TrtcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9498630f", new Object[]{this});
        } else if (!this.f23145a.f("stopSubCapture")) {
        } else {
            if (this.f23145a.i().config.isUseExternalVideoCapture() && this.o != null) {
                TrtcLog.d("TrtcVideoDeivce", "stop sub capture for external stream");
                this.o.c();
                this.o.a(0);
            }
            if (this.j != null) {
                TrtcLog.d("TrtcVideoDeivce", "stop sub capture for camera stream");
                this.j.f();
                this.j.a(false);
            }
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public void enableBeauty(boolean z) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20499eae", new Object[]{this, new Boolean(z)});
        } else if (!this.f23145a.f("enableBeauty") || (dVar = this.j) == null) {
        } else {
            dVar.b(z);
        }
    }

    @Override // com.taobao.trtc.api.TrtcVideoDevice
    public boolean switchCamera() {
        d dVar;
        CameraVideoCapturer g;
        SurfaceViewRenderer surfaceViewRenderer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46484f84", new Object[]{this})).booleanValue();
        }
        if (!this.f23145a.f("enableBeauty") || (dVar = this.j) == null || (g = dVar.g()) == null) {
            return false;
        }
        if (g.isFrontFacing() && (surfaceViewRenderer = this.e) != null) {
            surfaceViewRenderer.setMirror(false);
            g.setVideoContentMirror(false);
        } else {
            setVideoMirror(this.h, this.i);
        }
        g.switchCamera(new CameraVideoCapturer.CameraSwitchHandler() { // from class: com.taobao.trtc.impl.l.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
            public void onCameraSwitchDone(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5c85993", new Object[]{this, new Boolean(z)});
                    return;
                }
                TrtcLog.d("TrtcVideoDeivce", "camera switch done");
                l.a(l.this).a(z);
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
            public void onCameraSwitchError(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("297c5941", new Object[]{this, str});
                    return;
                }
                com.taobao.trtc.utils.h.a("TrtcVideoDeivce", "camera switch error: " + str);
                l.a(l.this).c(str);
            }
        });
        return true;
    }

    public void a(com.taobao.trtc.video.b bVar, com.taobao.trtc.video.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a5cd07", new Object[]{this, bVar, cVar});
        } else if (bVar == null && cVar == null) {
        } else {
            this.o = new g();
            this.o.a(this, bVar, cVar);
        }
    }

    public void a(TrtcInnerDefines.TrtcVideoLayoutParams trtcVideoLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1359e950", new Object[]{this, trtcVideoLayoutParams});
            return;
        }
        TrtcLog.d("TrtcVideoDeivce", "setVideoLayout");
        g gVar = this.o;
        if (gVar == null) {
            return;
        }
        gVar.a(trtcVideoLayoutParams);
    }

    public g h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("6d30778f", new Object[]{this}) : this.o;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.o;
        if (gVar == null) {
            return;
        }
        gVar.a(z);
    }
}
