package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import com.taobao.trtc.video.f;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;
import tb.kge;

/* loaded from: classes9.dex */
public class EglRenderer implements VideoSink {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private float layoutAspectRatio;
    private long minRenderPeriodNs;
    private boolean mirror;
    public final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private Handler renderThreadHandler;
    private long renderTimeNs;
    public Bitmap snapshot;
    private long statisticsStartTimeNs;
    private final Object snapshotLock = new Object();
    private boolean takeSnapshot = false;
    private final Object handlerLock = new Object();
    private final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final Matrix drawMatrix = new Matrix();
    private final Object frameLock = new Object();
    private final Object layoutLock = new Object();
    private final Object statisticsLock = new Object();
    private final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    private final Runnable logStatisticsRunnable = new Runnable() { // from class: org.webrtc.EglRenderer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            EglRenderer.access$100(EglRenderer.this);
            synchronized (EglRenderer.access$200(EglRenderer.this)) {
                if (EglRenderer.access$300(EglRenderer.this) != null) {
                    EglRenderer.access$300(EglRenderer.this).removeCallbacks(EglRenderer.access$400(EglRenderer.this));
                    EglRenderer.access$300(EglRenderer.this).postDelayed(EglRenderer.access$400(EglRenderer.this), TimeUnit.SECONDS.toMillis(4L));
                }
            }
        }
    };
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();

    /* loaded from: classes9.dex */
    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    /* loaded from: classes9.dex */
    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        static {
            kge.a(-1308962006);
        }

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    static {
        kge.a(1376963414);
        kge.a(-1747124137);
    }

    public static /* synthetic */ EglBase access$000(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EglBase) ipChange.ipc$dispatch("959f4f11", new Object[]{eglRenderer}) : eglRenderer.eglBase;
    }

    public static /* synthetic */ EglBase access$002(EglRenderer eglRenderer, EglBase eglBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EglBase) ipChange.ipc$dispatch("2e0a8e24", new Object[]{eglRenderer, eglBase});
        }
        eglRenderer.eglBase = eglBase;
        return eglBase;
    }

    public static /* synthetic */ void access$100(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e76951", new Object[]{eglRenderer});
        } else {
            eglRenderer.logStatistics();
        }
    }

    public static /* synthetic */ ArrayList access$1000(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("a2877f99", new Object[]{eglRenderer}) : eglRenderer.frameListeners;
    }

    public static /* synthetic */ void access$1100(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f237980", new Object[]{eglRenderer});
        } else {
            eglRenderer.renderFrameOnRenderThread();
        }
    }

    public static /* synthetic */ void access$1200(EglRenderer eglRenderer, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5f6941", new Object[]{eglRenderer, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else {
            eglRenderer.clearSurfaceOnRenderThread(f, f2, f3, f4);
        }
    }

    public static /* synthetic */ Object access$200(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7d21fbe0", new Object[]{eglRenderer}) : eglRenderer.handlerLock;
    }

    public static /* synthetic */ Handler access$300(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1e01c613", new Object[]{eglRenderer}) : eglRenderer.renderThreadHandler;
    }

    public static /* synthetic */ Runnable access$400(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("f53a6300", new Object[]{eglRenderer}) : eglRenderer.logStatisticsRunnable;
    }

    public static /* synthetic */ void access$600(EglRenderer eglRenderer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9d42e0", new Object[]{eglRenderer, str});
        } else {
            eglRenderer.logD(str);
        }
    }

    public static /* synthetic */ RendererCommon.GlDrawer access$700(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RendererCommon.GlDrawer) ipChange.ipc$dispatch("667f3059", new Object[]{eglRenderer}) : eglRenderer.drawer;
    }

    public static /* synthetic */ RendererCommon.GlDrawer access$702(EglRenderer eglRenderer, RendererCommon.GlDrawer glDrawer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RendererCommon.GlDrawer) ipChange.ipc$dispatch("2f260fdd", new Object[]{eglRenderer, glDrawer});
        }
        eglRenderer.drawer = glDrawer;
        return glDrawer;
    }

    public static /* synthetic */ VideoFrameDrawer access$800(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrameDrawer) ipChange.ipc$dispatch("5c480f0f", new Object[]{eglRenderer}) : eglRenderer.frameDrawer;
    }

    public static /* synthetic */ GlTextureFrameBuffer access$900(EglRenderer eglRenderer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GlTextureFrameBuffer) ipChange.ipc$dispatch("e1fe7ddc", new Object[]{eglRenderer}) : eglRenderer.bitmapTextureFramebuffer;
    }

    /* loaded from: classes9.dex */
    public class EglSurfaceCreation implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object surface;

        static {
            kge.a(-1589743248);
            kge.a(-1390502639);
        }

        private EglSurfaceCreation() {
        }

        public synchronized void setSurface(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccb4644e", new Object[]{this, obj});
            } else {
                this.surface = obj;
            }
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.surface != null && EglRenderer.access$000(EglRenderer.this) != null && !EglRenderer.access$000(EglRenderer.this).hasSurface()) {
                if (this.surface instanceof Surface) {
                    EglRenderer.access$000(EglRenderer.this).createSurface((Surface) this.surface);
                } else if (this.surface instanceof SurfaceTexture) {
                    EglRenderer.access$000(EglRenderer.this).createSurface((SurfaceTexture) this.surface);
                } else {
                    throw new IllegalStateException("Invalid surface: " + this.surface);
                }
                EglRenderer.access$000(EglRenderer.this).makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    public void init(final EglBase.Context context, final int[] iArr, RendererCommon.GlDrawer glDrawer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f099925f", new Object[]{this, context, iArr, glDrawer});
            return;
        }
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                throw new IllegalStateException(this.name + "Already initialized");
            }
            logD("Initializing EglRenderer");
            this.drawer = glDrawer;
            HandlerThread handlerThread = new HandlerThread(this.name + " EglRenderer");
            handlerThread.start();
            this.renderThreadHandler = new Handler(handlerThread.getLooper());
            ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, new Runnable() { // from class: org.webrtc.EglRenderer.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (context == null) {
                        EglRenderer.access$600(EglRenderer.this, "EglBase10.create context");
                        EglRenderer.access$002(EglRenderer.this, EglBase.StaticMethod.createEgl10(iArr));
                    } else {
                        EglRenderer.access$600(EglRenderer.this, "EglBase.StaticMethod.create shared context");
                        EglRenderer.access$002(EglRenderer.this, EglBase.StaticMethod.create(context, iArr));
                    }
                }
            });
            this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
            resetStatistics(System.nanoTime());
            this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
        }
    }

    public void createEglSurface(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1321b2", new Object[]{this, surface});
        } else {
            createEglSurfaceInternal(surface);
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb126a9", new Object[]{this, surfaceTexture});
        } else {
            createEglSurfaceInternal(surfaceTexture);
        }
    }

    private void createEglSurfaceInternal(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a336df", new Object[]{this, obj});
            return;
        }
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        logD("Releasing.");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Already released");
                return;
            }
            this.renderThreadHandler.removeCallbacks(this.logStatisticsRunnable);
            this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (EglRenderer.access$700(EglRenderer.this) != null) {
                        EglRenderer.access$700(EglRenderer.this).release();
                        EglRenderer.access$702(EglRenderer.this, null);
                    }
                    EglRenderer.access$800(EglRenderer.this).release();
                    EglRenderer.access$900(EglRenderer.this).release();
                    if (EglRenderer.access$000(EglRenderer.this) != null) {
                        EglRenderer.access$600(EglRenderer.this, "eglBase detach and release.");
                        EglRenderer.access$000(EglRenderer.this).detachCurrent();
                        EglRenderer.access$000(EglRenderer.this).release();
                        EglRenderer.access$002(EglRenderer.this, null);
                    }
                    EglRenderer.access$1000(EglRenderer.this).clear();
                    countDownLatch.countDown();
                }
            });
            final Looper looper = this.renderThreadHandler.getLooper();
            this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.EglRenderer.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    EglRenderer.access$600(EglRenderer.this, "Quitting render thread.");
                    looper.quit();
                }
            });
            this.renderThreadHandler = null;
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            synchronized (this.frameLock) {
                if (this.pendingFrame != null) {
                    this.pendingFrame.release();
                    this.pendingFrame = null;
                }
            }
            logD("Releasing done.");
        }
    }

    private void resetStatistics(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc1828b", new Object[]{this, new Long(j)});
            return;
        }
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    public void printStackTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78ccdb1", new Object[]{this});
            return;
        }
        synchronized (this.handlerLock) {
            Thread thread = this.renderThreadHandler == null ? null : this.renderThreadHandler.getLooper().getThread();
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logD("EglRenderer stack trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        logD(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    public void setMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5728d0c", new Object[]{this, new Boolean(z)});
            return;
        }
        logD("setMirror: " + z);
        synchronized (this.layoutLock) {
            this.mirror = z;
        }
    }

    public void setLayoutAspectRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200d93b2", new Object[]{this, new Float(f)});
            return;
        }
        synchronized (this.layoutLock) {
            if (this.layoutAspectRatio != f) {
                logD("setLayoutAspectRatio: " + f);
                this.layoutAspectRatio = f;
            }
        }
    }

    public void setFpsReduction(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d169f28d", new Object[]{this, new Float(f)});
            return;
        }
        logD("setFpsReduction: " + f);
        synchronized (this.fpsReductionLock) {
            long j = this.minRenderPeriodNs;
            if (f <= 0.0f) {
                this.minRenderPeriodNs = Long.MAX_VALUE;
            } else {
                this.minRenderPeriodNs = ((float) TimeUnit.SECONDS.toNanos(1L)) / f;
            }
            if (this.minRenderPeriodNs != j) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void disableFpsReduction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe0219", new Object[]{this});
        } else {
            setFpsReduction(Float.POSITIVE_INFINITY);
        }
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            setFpsReduction(0.0f);
        }
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ba27d", new Object[]{this, frameListener, new Float(f)});
        } else {
            addFrameListener(frameListener, f, null, false);
        }
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae803677", new Object[]{this, frameListener, new Float(f), glDrawer});
        } else {
            addFrameListener(frameListener, f, glDrawer, false);
        }
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21874b3d", new Object[]{this, frameListener, new Float(f), glDrawer, new Boolean(z)});
        } else {
            postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RendererCommon.GlDrawer glDrawer2 = glDrawer;
                    if (glDrawer2 == null) {
                        glDrawer2 = EglRenderer.access$700(EglRenderer.this);
                    }
                    EglRenderer.access$1000(EglRenderer.this).add(new FrameListenerAndParams(frameListener, f, glDrawer2, z));
                }
            });
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1531660", new Object[]{this, frameListener});
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                return;
            }
            if (Thread.currentThread() == this.renderThreadHandler.getLooper().getThread()) {
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            }
            postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    countDownLatch.countDown();
                    Iterator it = EglRenderer.access$1000(EglRenderer.this).iterator();
                    while (it.hasNext()) {
                        if (((FrameListenerAndParams) it.next()).listener == frameListener) {
                            it.remove();
                        }
                    }
                }
            });
            ThreadUtils.awaitUninterruptibly(countDownLatch);
        }
    }

    public Bitmap takeSnapshot() {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ef386750", new Object[]{this});
        }
        synchronized (this.snapshotLock) {
            this.takeSnapshot = true;
            try {
                this.snapshotLock.wait();
                Logging.e(TAG, "takeSnapshot done");
                bitmap = this.snapshot;
            } catch (InterruptedException unused) {
                Logging.w(TAG, "takeBitmapSnapshot interrupted while waiting for snapshot done");
                Thread.currentThread().interrupt();
                return null;
            }
        }
        return bitmap;
    }

    public final void checkNeedTakeSnapshot(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a7fe8", new Object[]{this, videoFrame});
            return;
        }
        synchronized (this.snapshotLock) {
            if (!this.takeSnapshot) {
                return;
            }
            this.takeSnapshot = false;
            f fVar = new f();
            this.snapshot = fVar.a(videoFrame, 1.0f);
            this.snapshotLock.notifyAll();
            fVar.a();
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
            return;
        }
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.frameLock) {
                if (this.pendingFrame != null) {
                    z = true;
                }
                if (z) {
                    this.pendingFrame.release();
                }
                this.pendingFrame = videoFrame;
                this.pendingFrame.retain();
                this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.EglRenderer.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            EglRenderer.access$1100(EglRenderer.this);
                        }
                    }
                });
            }
            if (!z) {
                return;
            }
            synchronized (this.statisticsLock) {
                this.framesDropped++;
            }
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b0ac2f", new Object[]{this, runnable});
            return;
        }
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                this.renderThreadHandler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (EglRenderer.access$000(EglRenderer.this) != null) {
                            EglRenderer.access$000(EglRenderer.this).detachCurrent();
                            EglRenderer.access$000(EglRenderer.this).releaseSurface();
                        }
                        runnable.run();
                    }
                });
                return;
            }
            runnable.run();
        }
    }

    private void postToRenderThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468786a0", new Object[]{this, runnable});
            return;
        }
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                this.renderThreadHandler.post(runnable);
            }
        }
    }

    private void clearSurfaceOnRenderThread(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8623aa86", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        GLES20.glClearColor(f, f2, f3, f4);
        GLES20.glClear(16384);
        this.eglBase.swapBuffers();
    }

    public void clearImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77863895", new Object[]{this});
        } else {
            clearImage(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9299d615", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                return;
            }
            this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        EglRenderer.access$1200(EglRenderer.this, f, f2, f3, f4);
                    }
                }
            });
        }
    }

    private void renderFrameOnRenderThread() {
        float f;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28bbd9d", new Object[]{this});
            return;
        }
        synchronized (this.frameLock) {
            if (this.pendingFrame == null) {
                return;
            }
            VideoFrame videoFrame = this.pendingFrame;
            this.pendingFrame = null;
            EglBase eglBase = this.eglBase;
            if (eglBase == null || !eglBase.hasSurface()) {
                logD("Dropping frame - No surface");
                videoFrame.release();
                return;
            }
            checkNeedTakeSnapshot(videoFrame);
            synchronized (this.fpsReductionLock) {
                if (this.minRenderPeriodNs != Long.MAX_VALUE) {
                    if (this.minRenderPeriodNs > 0) {
                        long nanoTime = System.nanoTime();
                        if (nanoTime < this.nextFrameTimeNs) {
                            logD("Skipping frame rendering - fps reduction is active.");
                        } else {
                            this.nextFrameTimeNs += this.minRenderPeriodNs;
                            this.nextFrameTimeNs = Math.max(this.nextFrameTimeNs, nanoTime);
                        }
                    }
                    z = true;
                }
            }
            long nanoTime2 = System.nanoTime();
            float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
            synchronized (this.layoutLock) {
                f = this.layoutAspectRatio != 0.0f ? this.layoutAspectRatio : rotatedWidth;
            }
            if (rotatedWidth > f) {
                f3 = f / rotatedWidth;
                f2 = 1.0f;
            } else {
                f2 = rotatedWidth / f;
                f3 = 1.0f;
            }
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            if (this.mirror) {
                this.drawMatrix.preScale(-1.0f, 1.0f);
            }
            this.drawMatrix.preScale(f3, f2);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            if (z) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                long nanoTime3 = System.nanoTime();
                this.eglBase.swapBuffers();
                long nanoTime4 = System.nanoTime();
                synchronized (this.statisticsLock) {
                    this.framesRendered++;
                    this.renderTimeNs += nanoTime4 - nanoTime2;
                    this.renderSwapBufferTimeNs += nanoTime4 - nanoTime3;
                }
            }
            notifyCallbacks(videoFrame, z);
            videoFrame.release();
        }
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1411528", new Object[]{this, videoFrame, new Boolean(z)});
        } else if (this.frameListeners.isEmpty()) {
        } else {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            if (this.mirror) {
                this.drawMatrix.preScale(-1.0f, 1.0f);
            }
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams next = it.next();
                if (z || !next.applyFpsReduction) {
                    it.remove();
                    int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                    int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                    if (rotatedWidth == 0 || rotatedHeight == 0) {
                        next.listener.onFrame(null);
                    } else {
                        this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                        GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(16384);
                        this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((rotatedWidth * rotatedHeight) << 2);
                        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        next.listener.onFrame(createBitmap);
                    }
                }
            }
        }
    }

    private String averageTimeAsString(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ed43bad", new Object[]{this, new Long(j), new Integer(i)});
        }
        if (i <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j / i) + " μs";
    }

    private void logStatistics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee16548e", new Object[]{this});
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j = nanoTime - this.statisticsStartTimeNs;
            if (j <= 0) {
                return;
            }
            float nanos = ((float) (this.framesRendered * TimeUnit.SECONDS.toNanos(1L))) / ((float) j);
            logD("Duration: " + TimeUnit.NANOSECONDS.toMillis(j) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format(nanos) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
            resetStatistics(nanoTime);
        }
    }

    private void logD(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948e011", new Object[]{this, str});
            return;
        }
        TrtcLog.d(TAG, this.name + " " + str);
    }
}
