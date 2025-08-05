package com.taobao.trtc.video;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcDecodedTextureHelper implements VideoSink {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TrtcDecodedTextureHelper";
    private static EglBase eglBase;
    private boolean hasBufferToRender;
    private VideoFrame.Buffer pendingBuffer;
    private VideoFrame.Buffer renderedBuffer;
    private Surface surface;
    private final Object newFrameLock = new Object();
    private final SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.create("DecodeSTH", eglBase.mo2430getEglBaseContext());

    static {
        kge.a(2133408291);
        kge.a(-1747124137);
    }

    public TrtcDecodedTextureHelper(int i, int i2) {
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.setTextureSize(i, i2);
            this.surfaceTextureHelper.startListening(this);
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            TrtcLog.d(TAG, "CTOR");
        }
    }

    public static TrtcDecodedTextureHelper create(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrtcDecodedTextureHelper) ipChange.ipc$dispatch("b98ea63f", new Object[]{new Integer(i), new Integer(i2)}) : new TrtcDecodedTextureHelper(i, i2);
    }

    public static void setEglBase(EglBase.Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b55b40", new Object[]{context});
            return;
        }
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            eglBase2.release();
        }
        eglBase = EglBase.StaticMethod.create(context);
        TrtcLog.d(TAG, "setEglBase");
    }

    public static void disposeEglContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e3304b", new Object[0]);
            return;
        }
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            eglBase2.release();
            eglBase = null;
        }
        TrtcLog.d(TAG, "disposeEglContext");
    }

    public Surface getSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Surface) ipChange.ipc$dispatch("91c7c0e4", new Object[]{this});
        }
        TrtcLog.d(TAG, "getSurface");
        return this.surface;
    }

    public VideoFrame.Buffer dequeueTextureBuffer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame.Buffer) ipChange.ipc$dispatch("ab9e3f79", new Object[]{this, new Integer(i)});
        }
        synchronized (this.newFrameLock) {
            if (this.renderedBuffer == null && i > 0) {
                try {
                    this.newFrameLock.wait(i);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            if (this.renderedBuffer == null) {
                return null;
            }
            this.pendingBuffer = this.renderedBuffer;
            this.renderedBuffer = null;
            return this.pendingBuffer;
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6055243", new Object[]{this, videoFrame});
            return;
        }
        synchronized (this.newFrameLock) {
            if (this.renderedBuffer != null) {
                TrtcLog.a(TAG, "already have renderBuffer, drop the old");
                this.renderedBuffer.release();
            }
            this.renderedBuffer = videoFrame.getBuffer();
            this.newFrameLock.notifyAll();
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        TrtcLog.d(TAG, "release");
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.stopListening();
        }
        synchronized (this.newFrameLock) {
            if (this.renderedBuffer != null) {
                this.renderedBuffer.release();
                this.renderedBuffer = null;
            }
            this.hasBufferToRender = false;
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (surfaceTextureHelper2 == null) {
            return;
        }
        surfaceTextureHelper2.dispose();
    }
}
