package com.taobao.trtc.impl;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcDataStream;
import com.taobao.trtc.api.ITrtcInputStream;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.api.TrtcStreamConfig;
import com.taobao.trtc.utils.TrtcLog;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcInputStreamImpl implements ITrtcInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23090a;
    public TrtcStreamConfig b;
    private boolean c;
    private final l d;
    private SurfaceTextureHelper e;
    private Surface f;
    private Runnable g;
    private final AtomicBoolean h;
    private int i;
    private long j;
    private final Object k;
    private ITrtcInputStream.a l;
    private ITrtcDataStream.a m;
    private ITrtcInputStream.b n;
    private final AtomicBoolean o;
    private TrtcDefines.TrtcFrameType p;

    static {
        kge.a(-1890548099);
        kge.a(-575980392);
    }

    private native void nativeFrameCaptured(int i, int i2, int i3, long j, VideoFrame.Buffer buffer, int i4, String str);

    private native void nativeSendSei(int i, String str, String str2, boolean z, boolean z2);

    public static /* synthetic */ Surface a(TrtcInputStreamImpl trtcInputStreamImpl, Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("f8b6945c", new Object[]{trtcInputStreamImpl, surface});
        }
        trtcInputStreamImpl.f = surface;
        return surface;
    }

    public static /* synthetic */ ITrtcInputStream.a a(TrtcInputStreamImpl trtcInputStreamImpl, ITrtcInputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrtcInputStream.a) ipChange.ipc$dispatch("4209155c", new Object[]{trtcInputStreamImpl, aVar});
        }
        trtcInputStreamImpl.l = aVar;
        return aVar;
    }

    public static /* synthetic */ SurfaceTextureHelper a(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTextureHelper) ipChange.ipc$dispatch("e26e3098", new Object[]{trtcInputStreamImpl}) : trtcInputStreamImpl.e;
    }

    public static /* synthetic */ SurfaceTextureHelper a(TrtcInputStreamImpl trtcInputStreamImpl, SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceTextureHelper) ipChange.ipc$dispatch("24c89292", new Object[]{trtcInputStreamImpl, surfaceTextureHelper});
        }
        trtcInputStreamImpl.e = surfaceTextureHelper;
        return surfaceTextureHelper;
    }

    public static /* synthetic */ void a(TrtcInputStreamImpl trtcInputStreamImpl, int i, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101c295d", new Object[]{trtcInputStreamImpl, new Integer(i), str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            trtcInputStreamImpl.nativeSendSei(i, str, str2, z, z2);
        }
    }

    public static /* synthetic */ Object b(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a2ad997", new Object[]{trtcInputStreamImpl}) : trtcInputStreamImpl.k;
    }

    public static /* synthetic */ ITrtcInputStream.a c(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrtcInputStream.a) ipChange.ipc$dispatch("7f9e8214", new Object[]{trtcInputStreamImpl}) : trtcInputStreamImpl.l;
    }

    public static /* synthetic */ Surface d(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("1adfe045", new Object[]{trtcInputStreamImpl}) : trtcInputStreamImpl.f;
    }

    public static /* synthetic */ AtomicBoolean e(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("b0b70d7e", new Object[]{trtcInputStreamImpl}) : trtcInputStreamImpl.h;
    }

    public static /* synthetic */ TrtcDefines.TrtcFrameType f(TrtcInputStreamImpl trtcInputStreamImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcDefines.TrtcFrameType) ipChange.ipc$dispatch("a723bc53", new Object[]{trtcInputStreamImpl}) : trtcInputStreamImpl.p;
    }

    public TrtcInputStreamImpl(l lVar, String str, TrtcStreamConfig trtcStreamConfig) {
        this.c = false;
        this.h = new AtomicBoolean(false);
        this.i = 0;
        this.j = 0L;
        this.k = new Object();
        this.o = new AtomicBoolean(false);
        this.f23090a = str;
        this.b = trtcStreamConfig;
        this.d = lVar;
        this.c = true;
        this.e = null;
        this.h.set(true);
        this.p = trtcStreamConfig.getIsSub() ? TrtcDefines.TrtcFrameType.E_FRAME_SUB : TrtcDefines.TrtcFrameType.E_FRAME_PRI;
        com.taobao.trtc.utils.h.a("InputStream", "new inputstream for camera input, id:" + str + ", type:" + this.p + " ,config:" + trtcStreamConfig.ToString());
    }

    public TrtcInputStreamImpl(l lVar, final String str, TrtcStreamConfig trtcStreamConfig, final ITrtcInputStream.a aVar) {
        this.c = false;
        this.h = new AtomicBoolean(false);
        this.i = 0;
        this.j = 0L;
        this.k = new Object();
        this.o = new AtomicBoolean(false);
        this.f23090a = str;
        this.b = trtcStreamConfig;
        this.d = lVar;
        this.c = false;
        this.p = trtcStreamConfig.getIsSub() ? TrtcDefines.TrtcFrameType.E_FRAME_SUB : TrtcDefines.TrtcFrameType.E_FRAME_PRI;
        if (trtcStreamConfig.isVideoEnable()) {
            this.e = SurfaceTextureHelper.create("STH-" + str, lVar.d());
            com.taobao.trtc.utils.h.a("InputStream", "new inputstream for external video, id:" + str + " ,config:" + trtcStreamConfig.ToString());
            this.g = new Runnable() { // from class: com.taobao.trtc.impl.TrtcInputStreamImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TrtcInputStreamImpl.a(TrtcInputStreamImpl.this) == null) {
                    } else {
                        TrtcInputStreamImpl.a(TrtcInputStreamImpl.this).startListening(new VideoSink() { // from class: com.taobao.trtc.impl.TrtcInputStreamImpl.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // org.webrtc.VideoSink
                            public void onFrame(VideoFrame videoFrame) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
                                } else {
                                    TrtcInputStreamImpl.this.a(videoFrame);
                                }
                            }
                        });
                        TrtcInputStreamImpl.a(TrtcInputStreamImpl.this).setTextureSize(TrtcInputStreamImpl.this.b.getVideoWidth(), TrtcInputStreamImpl.this.b.getVideoHeight());
                        TrtcInputStreamImpl trtcInputStreamImpl = TrtcInputStreamImpl.this;
                        TrtcInputStreamImpl.a(trtcInputStreamImpl, new Surface(TrtcInputStreamImpl.a(trtcInputStreamImpl).getSurfaceTexture()));
                        synchronized (TrtcInputStreamImpl.b(TrtcInputStreamImpl.this)) {
                            TrtcInputStreamImpl.a(TrtcInputStreamImpl.this, aVar);
                            if (TrtcInputStreamImpl.c(TrtcInputStreamImpl.this) != null) {
                                TrtcLog.d("InputStream", "notify event: onVideoInputInitialized, and start input");
                                TrtcInputStreamImpl.c(TrtcInputStreamImpl.this);
                                TrtcInputStreamImpl.d(TrtcInputStreamImpl.this);
                                TrtcInputStreamImpl.c(TrtcInputStreamImpl.this);
                            }
                        }
                        TrtcInputStreamImpl.e(TrtcInputStreamImpl.this).set(true);
                        TrtcLog.d("InputStream", "external input stream initialize done, stream id: " + str);
                    }
                }
            };
            if (this.e.getHandler() == null) {
                TrtcLog.a("InputStream", "create inputstream error for surfaceTextureHelper create error");
                return;
            } else {
                this.e.getHandler().post(this.g);
                return;
            }
        }
        com.taobao.trtc.utils.h.a("InputStream", "new inputstream for no video, id:" + str + " ,config:" + trtcStreamConfig.ToString());
    }

    public void a(TrtcStreamConfig trtcStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e5f604", new Object[]{this, trtcStreamConfig});
        } else {
            this.b = trtcStreamConfig;
        }
    }

    public void a(VideoFrame videoFrame) {
        VideoFrame videoFrame2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fc6cd0", new Object[]{this, videoFrame});
            return;
        }
        int videoWidth = this.b.getVideoWidth();
        int videoHeight = this.b.getVideoHeight();
        if (videoWidth == videoFrame.getBuffer().getWidth() && videoHeight == videoFrame.getBuffer().getHeight()) {
            videoFrame2 = null;
            z = false;
        } else {
            videoFrame2 = new VideoFrame(videoFrame.getBuffer().cropAndScale(0, 0, videoWidth, videoHeight, videoWidth, videoHeight), 0, videoFrame.getTimestampNs());
            z = true;
        }
        if (videoFrame2 != null) {
            nativeFrameCaptured(videoFrame2.getBuffer().getWidth(), videoFrame2.getBuffer().getHeight(), videoFrame2.getRotation(), videoFrame2.getTimestampNs(), videoFrame2.getBuffer(), this.p.ordinal(), this.f23090a);
            videoFrame2.release();
        } else {
            nativeFrameCaptured(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer(), this.p.ordinal(), this.f23090a);
        }
        this.i++;
        if (this.j != 0 && System.currentTimeMillis() - this.j < 3000) {
            return;
        }
        this.j = System.currentTimeMillis();
        TrtcLog.d("InputStream", "stream id: " + this.f23090a + " onFrame | fps:" + (this.i / 3));
        this.i = 0;
        if (!z) {
            return;
        }
        TrtcLog.d("InputStream", "video crop, " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " -> " + videoWidth + "x" + videoHeight);
    }

    public void a(ITrtcInputStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2ce0a2", new Object[]{this, aVar});
            return;
        }
        synchronized (this.k) {
            this.l = aVar;
        }
    }

    public static void a(ITrtcInputStream iTrtcInputStream, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ada3e75", new Object[]{iTrtcInputStream, new Boolean(z)});
        } else if (iTrtcInputStream == null) {
        } else {
            TrtcInputStreamImpl trtcInputStreamImpl = (TrtcInputStreamImpl) iTrtcInputStream;
            trtcInputStreamImpl.o.set(z);
            TrtcLog.d("InputStream", "set input stream: " + trtcInputStreamImpl.f23090a + ", enable:" + z + ", type: " + trtcInputStreamImpl.p);
            synchronized (trtcInputStreamImpl.k) {
                if (trtcInputStreamImpl.m != null) {
                    if (z) {
                        TrtcLog.d("InputStream", "data channel available");
                    } else {
                        TrtcLog.d("InputStream", "data channel unavailable");
                    }
                }
            }
        }
    }

    public static void a(ITrtcInputStream iTrtcInputStream, boolean z, TrtcDefines.TrtcFrameType trtcFrameType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7683750f", new Object[]{iTrtcInputStream, new Boolean(z), trtcFrameType});
            return;
        }
        TrtcInputStreamImpl trtcInputStreamImpl = (TrtcInputStreamImpl) iTrtcInputStream;
        if (trtcInputStreamImpl == null) {
            return;
        }
        trtcInputStreamImpl.p = trtcFrameType;
        a(trtcInputStreamImpl, z);
    }

    public void a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
        } else if (this.m != null) {
            TrtcLog.d("InputStream", "notify data frame, len: " + bArr.length);
            TrtcDefines.f fVar = new TrtcDefines.f();
            fVar.f23038a = (byte[]) bArr.clone();
            fVar.b = i;
            this.m.a(fVar);
        } else {
            TrtcLog.a("InputStream", "notify data frame, but no observer");
        }
    }

    public void a(TrtcDefines.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1acd942d", new Object[]{this, iVar});
            return;
        }
        synchronized (this.k) {
            if (this.n != null) {
                this.n.a(iVar);
            }
        }
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public TrtcStreamConfig streamConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcStreamConfig) ipChange.ipc$dispatch("351ffaa9", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public void setStatsObserver(ITrtcInputStream.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8567c0f3", new Object[]{this, bVar});
            return;
        }
        synchronized (this.k) {
            this.n = bVar;
        }
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public Surface videoInputSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("2da5f59d", new Object[]{this});
        }
        if (this.c) {
            TrtcLog.a("InputStream", "can not input video by surface");
            return null;
        } else if (!this.h.get()) {
            TrtcLog.a("InputStream", "input stream not initialized");
            return null;
        } else {
            return this.f;
        }
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public void inputSei(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a988796", new Object[]{this, str, new Boolean(z)});
        } else {
            com.taobao.artc.utils.a.a(new Runnable() { // from class: com.taobao.trtc.impl.TrtcInputStreamImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TrtcLog.d("InputStream", "send sei, stream_id:" + TrtcInputStreamImpl.this.f23090a + ", len: " + str.length() + ", withKeyFrame:" + z);
                    TrtcInputStreamImpl trtcInputStreamImpl = TrtcInputStreamImpl.this;
                    TrtcInputStreamImpl.a(trtcInputStreamImpl, TrtcInputStreamImpl.f(trtcInputStreamImpl).ordinal(), TrtcInputStreamImpl.this.f23090a, str, z, false);
                    TrtcLog.d("InputStream", "send sei done");
                }
            }, 0L);
        }
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public String streamId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd16091e", new Object[]{this}) : this.f23090a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.h.get()) {
        } else {
            this.o.set(false);
            synchronized (this.k) {
            }
            SurfaceTextureHelper surfaceTextureHelper = this.e;
            if (surfaceTextureHelper != null) {
                if (this.g != null && surfaceTextureHelper.getHandler() != null) {
                    this.e.getHandler().removeCallbacks(this.g);
                }
                if (this.e.getHandler() != null) {
                    this.e.getHandler().post(new Runnable() { // from class: com.taobao.trtc.impl.TrtcInputStreamImpl.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            TrtcInputStreamImpl.a(TrtcInputStreamImpl.this).stopListening();
                            TrtcInputStreamImpl.a(TrtcInputStreamImpl.this).dispose();
                            TrtcInputStreamImpl.a(TrtcInputStreamImpl.this, (SurfaceTextureHelper) null);
                        }
                    });
                }
            }
            this.f = null;
            this.h.set(false);
            this.i = 0;
            this.j = 0L;
        }
    }

    @Override // com.taobao.trtc.api.ITrtcDataStream
    public void setDataStreamObserver(ITrtcDataStream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578ad2df", new Object[]{this, aVar});
            return;
        }
        synchronized (this.k) {
            this.m = aVar;
        }
        TrtcLog.d("InputStream", "set data observer: " + aVar);
    }

    @Override // com.taobao.trtc.api.ITrtcDataStream
    public void sendDataFrame(TrtcDefines.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9e88f6", new Object[]{this, fVar});
            return;
        }
        l lVar = this.d;
        if (lVar == null || lVar.f() == null) {
            return;
        }
        this.d.f().a(this.f23090a, fVar);
    }

    @Override // com.taobao.trtc.api.ITrtcInputStream
    public void update(boolean z, boolean z2, boolean z3) {
        TrtcEngineImpl f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c0584", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        l lVar = this.d;
        if (lVar == null || (f = lVar.f()) == null) {
            return;
        }
        this.b.update(z, z2, z3);
        f.b(this);
    }
}
