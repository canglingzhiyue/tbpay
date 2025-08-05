package org.webrtc;

import android.view.SurfaceHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import mtopsdk.network.impl.ResponseProtocolType;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;
import tb.kge;

/* loaded from: classes9.dex */
public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SurfaceEglRenderer";
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock;
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    static {
        kge.a(1485545335);
        kge.a(632307482);
    }

    public static /* synthetic */ Object ipc$super(SurfaceEglRenderer surfaceEglRenderer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577188839:
                super.disableFpsReduction();
                return null;
            case -1241165245:
                super.onFrame((VideoFrame) objArr[0]);
                return null;
            case -1083755988:
                super.pauseVideo();
                return null;
            case -781585779:
                super.setFpsReduction(((Number) objArr[0]).floatValue());
                return null;
            case -258370977:
                super.init((EglBase.Context) objArr[0], (int[]) objArr[1], (RendererCommon.GlDrawer) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public SurfaceEglRenderer(String str) {
        super(str);
        this.layoutLock = new Object();
        this.isRenderingPaused = false;
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac24bd3", new Object[]{this, context, rendererEvents, iArr, glDrawer});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        synchronized (this.layoutLock) {
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f099925f", new Object[]{this, context, iArr, glDrawer});
        } else {
            init(context, null, iArr, glDrawer);
        }
    }

    @Override // org.webrtc.EglRenderer
    public void setFpsReduction(float f) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d169f28d", new Object[]{this, new Float(f)});
            return;
        }
        synchronized (this.layoutLock) {
            if (f != 0.0f) {
                z = false;
            }
            this.isRenderingPaused = z;
        }
        super.setFpsReduction(f);
    }

    @Override // org.webrtc.EglRenderer
    public void disableFpsReduction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fe0219", new Object[]{this});
            return;
        }
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    @Override // org.webrtc.EglRenderer
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
            return;
        }
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new Runnable() { // from class: org.webrtc.SurfaceEglRenderer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    countDownLatch.countDown();
                }
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ThreadUtils.checkIsOnMainThread();
        logD("surfaceChanged: format: " + i + " size: " + i2 + "x" + i3);
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca5105e", new Object[]{this, videoFrame});
            return;
        }
        synchronized (this.layoutLock) {
            if (this.isRenderingPaused) {
                return;
            }
            if (!this.isFirstFrameRendered) {
                this.isFirstFrameRendered = true;
                logD("Reporting first rendered frame.");
                if (this.rendererEvents != null) {
                    this.rendererEvents.onFirstFrameRendered();
                }
            }
            if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                logD("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation());
                if (this.rendererEvents != null) {
                    this.rendererEvents.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                }
                this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                this.frameRotation = videoFrame.getRotation();
            }
        }
    }

    private void logD(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948e011", new Object[]{this, str});
            return;
        }
        Logging.d(TAG, this.name + ResponseProtocolType.COMMENT + str);
    }
}
