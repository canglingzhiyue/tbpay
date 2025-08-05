package com.taobao.trtc.video;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.webrtc.GlRectDrawer;
import org.webrtc.GlTextureFrameBuffer;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import tb.kge;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f23219a = new Matrix();
    private final GlTextureFrameBuffer b = new GlTextureFrameBuffer(6408);
    private final VideoFrameDrawer c = new VideoFrameDrawer();
    private final RendererCommon.GlDrawer d = new GlRectDrawer();

    static {
        kge.a(-1757968942);
    }

    public Bitmap a(VideoFrame videoFrame, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e34a13ce", new Object[]{this, videoFrame, new Float(f)});
        }
        this.f23219a.reset();
        this.f23219a.preTranslate(0.5f, 0.5f);
        this.f23219a.preScale(1.0f, -1.0f);
        this.f23219a.preTranslate(-0.5f, -0.5f);
        int rotatedWidth = (int) (videoFrame.getRotatedWidth() * f);
        int rotatedHeight = (int) (f * videoFrame.getRotatedHeight());
        if (rotatedWidth == 0 || rotatedHeight == 0) {
            return null;
        }
        this.b.setSize(rotatedWidth, rotatedHeight);
        GLES20.glBindFramebuffer(36160, this.b.getFrameBufferId());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.b.getTextureId(), 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.c.drawFrame(videoFrame, this.d, this.f23219a, 0, 0, rotatedWidth, rotatedHeight);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((rotatedWidth * rotatedHeight) << 2);
        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        return createBitmap;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d.release();
        this.c.release();
        this.b.release();
    }
}
