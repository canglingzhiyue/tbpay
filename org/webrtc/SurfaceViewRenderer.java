package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.network.impl.ResponseProtocolType;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import tb.kge;

/* loaded from: classes9.dex */
public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, RendererCommon.RendererEvents, VideoSink {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SurfaceViewRenderer";
    private final SurfaceEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private boolean isRemote;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;
    public VideoCapturer videoCapturer;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    static {
        kge.a(-1534206146);
        kge.a(632307482);
        kge.a(-1747124137);
        kge.a(176547547);
    }

    public static /* synthetic */ Object ipc$super(SurfaceViewRenderer surfaceViewRenderer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
        }
    }

    public static /* synthetic */ int access$002(SurfaceViewRenderer surfaceViewRenderer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27b28b0c", new Object[]{surfaceViewRenderer, new Integer(i)})).intValue();
        }
        surfaceViewRenderer.rotatedFrameWidth = i;
        return i;
    }

    public static /* synthetic */ int access$102(SurfaceViewRenderer surfaceViewRenderer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ed07beb", new Object[]{surfaceViewRenderer, new Integer(i)})).intValue();
        }
        surfaceViewRenderer.rotatedFrameHeight = i;
        return i;
    }

    public static /* synthetic */ void access$200(SurfaceViewRenderer surfaceViewRenderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af1d4aa", new Object[]{surfaceViewRenderer});
        } else {
            surfaceViewRenderer.updateSurfaceSize();
        }
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.isRemote = false;
        this.resourceName = getResourceName();
        this.eglRenderer = new SurfaceEglRenderer(this.resourceName);
        getHolder().addCallback(this);
        getHolder().addCallback(this.eglRenderer);
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.isRemote = false;
        this.resourceName = getResourceName();
        this.eglRenderer = new SurfaceEglRenderer(this.resourceName);
        getHolder().addCallback(this);
        getHolder().addCallback(this.eglRenderer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f5dd8b", new Object[]{this, context, rendererEvents});
        } else {
            init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
        }
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac24bd3", new Object[]{this, context, rendererEvents, iArr, glDrawer});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.eglRenderer.release();
        }
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae803677", new Object[]{this, frameListener, new Float(f), glDrawer});
        } else {
            this.eglRenderer.addFrameListener(frameListener, f, glDrawer);
        }
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ba27d", new Object[]{this, frameListener, new Float(f)});
        } else {
            this.eglRenderer.addFrameListener(frameListener, f);
        }
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1531660", new Object[]{this, frameListener});
        } else {
            this.eglRenderer.removeFrameListener(frameListener);
        }
    }

    public void setEnableHardwareScaler(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33254bf8", new Object[]{this, new Boolean(z)});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    public void setMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5728d0c", new Object[]{this, new Boolean(z)});
        } else {
            this.eglRenderer.setMirror(z);
        }
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d19bb9", new Object[]{this, scalingType});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11ffb46", new Object[]{this, scalingType, scalingType2});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public void setFpsReduction(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d169f28d", new Object[]{this, new Float(f)});
        } else {
            this.eglRenderer.setFpsReduction(f);
        }
    }

    public void disableFpsReduction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe0219", new Object[]{this});
        } else {
            this.eglRenderer.disableFpsReduction();
        }
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.eglRenderer.pauseVideo();
        }
    }

    public void setIsRemote(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e09c1db", new Object[]{this, new Boolean(z)});
        } else {
            this.isRemote = z;
        }
    }

    public void setVideoCapturer(VideoCapturer videoCapturer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5c98b", new Object[]{this, videoCapturer});
        } else {
            this.videoCapturer = videoCapturer;
        }
    }

    public Bitmap takeSnapshot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("ef386750", new Object[]{this}) : this.eglRenderer.takeSnapshot();
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
        } else if (this.isRemote) {
            VideoCapturer videoCapturer = this.videoCapturer;
            if (videoCapturer != null) {
                videoCapturer.onVideoFrame(videoFrame);
            }
            this.eglRenderer.onFrame(videoFrame);
        } else if (videoFrame.hasPreviewBuffer()) {
            this.eglRenderer.onFrame(new VideoFrame(videoFrame.getPreviewBuffer(), videoFrame.getRotation(), videoFrame.getTimestampNs()));
        } else {
            this.eglRenderer.onFrame(videoFrame);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((i3 - i) / (i4 - i2));
        updateSurfaceSize();
    }

    private void updateSurfaceSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20383cc", new Object[]{this});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        if (this.enableFixedSize && this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0 && getWidth() != 0 && getHeight() != 0) {
            float width = getWidth() / getHeight();
            int i = this.rotatedFrameWidth;
            int i2 = this.rotatedFrameHeight;
            if (i / i2 > width) {
                i = (int) (i2 * width);
            } else {
                i2 = (int) (i / width);
            }
            int min = Math.min(getWidth(), i);
            int min2 = Math.min(getHeight(), i2);
            logD("updateSurfaceSize. Layout size: " + getWidth() + "x" + getHeight() + ", frame size: " + this.rotatedFrameWidth + "x" + this.rotatedFrameHeight + ", requested surface size: " + min + "x" + min2 + ", old surface size: " + this.surfaceWidth + "x" + this.surfaceHeight);
            if (min == this.surfaceWidth && min2 == this.surfaceHeight) {
                return;
            }
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            getHolder().setFixedSize(min, min2);
            return;
        }
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        getHolder().setSizeFromLayout();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    private String getResourceName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed16a42a", new Object[]{this});
        }
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public void clearImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77863895", new Object[]{this});
        } else {
            this.eglRenderer.clearImage();
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6440b8", new Object[]{this});
            return;
        }
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents == null) {
            return;
        }
        rendererEvents.onFirstFrameRendered();
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(final int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c569a442", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i, i2, i3);
        }
        final int i4 = (i3 == 0 || i3 == 180) ? i : i2;
        if (i3 == 0 || i3 == 180) {
            i = i2;
        }
        postOrRun(new Runnable() { // from class: org.webrtc.SurfaceViewRenderer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SurfaceViewRenderer.access$002(SurfaceViewRenderer.this, i4);
                SurfaceViewRenderer.access$102(SurfaceViewRenderer.this, i);
                SurfaceViewRenderer.access$200(SurfaceViewRenderer.this);
                SurfaceViewRenderer.this.requestLayout();
            }
        });
    }

    private void postOrRun(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b929ce6d", new Object[]{this, runnable});
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    private void logD(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948e011", new Object[]{this, str});
            return;
        }
        Logging.d(TAG, this.resourceName + ResponseProtocolType.COMMENT + str);
    }
}
