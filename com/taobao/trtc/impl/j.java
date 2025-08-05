package com.taobao.trtc.impl;

import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.CapturerObserver;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import tb.kge;

/* loaded from: classes9.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SurfaceTextureHelper f23138a;
    private final l b;
    private ScreenCapturerAndroid c;
    private String d;
    private TrtcStreamConfig e;
    private TrtcInputStreamImpl f;
    private int h;
    private boolean i;
    private long g = 0;
    private boolean j = false;
    private MediaProjection.Callback k = new MediaProjection.Callback() { // from class: com.taobao.trtc.impl.j.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 188604040) {
                super.onStop();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            } else {
                super.onStop();
            }
        }
    };

    static {
        kge.a(189290609);
    }

    public static /* synthetic */ long a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("434c1ac1", new Object[]{jVar})).longValue() : jVar.g;
    }

    public static /* synthetic */ long a(j jVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2637b58b", new Object[]{jVar, new Long(j)})).longValue();
        }
        jVar.g = j;
        return j;
    }

    public static /* synthetic */ SurfaceTextureHelper a(j jVar, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("cb3a5edf", new Object[]{jVar, surfaceTextureHelper});
        }
        jVar.f23138a = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public static /* synthetic */ boolean b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c9bff52", new Object[]{jVar})).booleanValue() : jVar.j;
    }

    public static /* synthetic */ int c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("95ebe3c2", new Object[]{jVar})).intValue() : jVar.h;
    }

    public static /* synthetic */ TrtcInputStreamImpl d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcInputStreamImpl) ipChange.ipc$dispatch("d11207d8", new Object[]{jVar}) : jVar.f;
    }

    public static /* synthetic */ SurfaceTextureHelper e(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTextureHelper) ipChange.ipc$dispatch("4cf6b4af", new Object[]{jVar}) : jVar.f23138a;
    }

    public j(String str, l lVar, TrtcStreamConfig trtcStreamConfig, TrtcInputStreamImpl trtcInputStreamImpl) {
        this.h = 0;
        this.i = false;
        this.d = str;
        this.b = lVar;
        this.e = trtcStreamConfig;
        this.h = trtcStreamConfig.getVideoFps() > 0 ? 1000 / trtcStreamConfig.getVideoFps() : 50;
        if (trtcInputStreamImpl != null) {
            this.f = trtcInputStreamImpl;
            return;
        }
        this.i = true;
        this.f = new TrtcInputStreamImpl(lVar, str, trtcStreamConfig);
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        com.taobao.trtc.utils.b.a("ScreenInputStream start error for ref is null", this.d, this.b);
        this.g = 0L;
        try {
            if (this.f23138a == null) {
                this.f23138a = SurfaceTextureHelper.create("STH-SCREEN-" + this.d, this.b.d());
            }
        } catch (Exception e) {
            com.taobao.trtc.utils.h.a("TrtcScreenInputStream", "start screen input stream, error: " + e.getMessage());
        }
        if (intent != null && this.c == null) {
            this.c = new ScreenCapturerAndroid(intent, this.k);
            this.c.initialize(this.f23138a, h.f23132a, new CapturerObserver() { // from class: com.taobao.trtc.impl.j.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
                public void onCapturerStarted(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("704937d7", new Object[]{this, new Boolean(z)});
                    } else {
                        TrtcLog.d("TrtcScreenInputStream", "onCapturerStarted");
                    }
                }

                @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
                public void onCapturerStopped() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("844419e9", new Object[]{this});
                    } else {
                        TrtcLog.d("TrtcScreenInputStream", "onCapturerStopped");
                    }
                }

                @Override // org.webrtc.CapturerObserver, org.webrtc.VideoCapturer.CapturerObserver
                public void onFrameCaptured(VideoFrame videoFrame) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("de456b85", new Object[]{this, videoFrame});
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (j.a(j.this) == 0) {
                        j.a(j.this, elapsedRealtime);
                    } else if (!j.b(j.this) && elapsedRealtime - j.a(j.this) >= j.c(j.this)) {
                        j.a(j.this, elapsedRealtime);
                        j.d(j.this).a(videoFrame);
                    }
                    videoFrame.release();
                }
            });
        }
        this.c.startCapture(this.e.getVideoWidth(), this.e.getVideoHeight(), this.e.getVideoFps(), 2);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ScreenCapturerAndroid screenCapturerAndroid = this.c;
        if (screenCapturerAndroid != null) {
            screenCapturerAndroid.stopCapture();
            this.c = null;
        }
        TrtcLog.d("TrtcScreenInputStream", "screen capture stop done");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = this.f;
        if (trtcInputStreamImpl != null) {
            if (this.i) {
                trtcInputStreamImpl.a();
            }
            this.f = null;
        }
        ScreenCapturerAndroid screenCapturerAndroid = this.c;
        if (screenCapturerAndroid != null) {
            screenCapturerAndroid.resetCapturerObserver();
            this.c.stopCapture();
            this.c.dispose();
            this.c = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.f23138a;
        if (surfaceTextureHelper != null && surfaceTextureHelper.getHandler() != null) {
            this.f23138a.getHandler().post(new Runnable() { // from class: com.taobao.trtc.impl.j.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    j.e(j.this).dispose();
                    j.a(j.this, (SurfaceTextureHelper) null);
                }
            });
        }
        TrtcLog.d("TrtcScreenInputStream", "screen capture dispose done");
    }

    public ITrtcInputStream c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcInputStream) ipChange.ipc$dispatch("ab035743", new Object[]{this}) : this.f;
    }
}
