package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import org.webrtc.VideoFrame;
import tb.kge;

/* loaded from: classes9.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int height;
    private final int id;
    private final RefCountDelegate refCountDelegate;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;
    private final YuvConverter yuvConverter;

    static {
        kge.a(300690340);
        kge.a(939926496);
    }

    private static native void nSetTextureBufferDescription(long j, int i, int i2, int i3, int i4, float[] fArr);

    public static /* synthetic */ YuvConverter access$000(TextureBufferImpl textureBufferImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (YuvConverter) ipChange.ipc$dispatch("338a34b6", new Object[]{textureBufferImpl}) : textureBufferImpl.yuvConverter;
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.type = type;
        this.id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame.TextureBuffer.Type) ipChange.ipc$dispatch("1d254cd0", new Object[]{this}) : this.type;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcda895a", new Object[]{this})).intValue() : this.id;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("5ed3a1aa", new Object[]{this}) : this.transformMatrix;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.height;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoFrame.I420Buffer) ipChange.ipc$dispatch("7a137356", new Object[]{this}) : (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable<VideoFrame.I420Buffer>() { // from class: org.webrtc.TextureBufferImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public VideoFrame.I420Buffer call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (VideoFrame.I420Buffer) ipChange2.ipc$dispatch("55a7aabc", new Object[]{this}) : TextureBufferImpl.access$000(TextureBufferImpl.this).convert(TextureBufferImpl.this);
            }
        });
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e496b0c", new Object[]{this});
        } else {
            this.refCountDelegate.retain();
        }
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.refCountDelegate.release();
        }
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame.Buffer) ipChange.ipc$dispatch("35ed0960", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        Matrix matrix = new Matrix();
        int i7 = this.height;
        matrix.preTranslate(i / this.width, (i7 - (i2 + i4)) / i7);
        matrix.preScale(i3 / this.width, i4 / this.height);
        return applyTransformMatrix(matrix, i5, i6);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int describe(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20545325", new Object[]{this, new Long(j)})).intValue();
        }
        int textureId = getTextureId();
        int glTarget = getType().getGlTarget();
        int width = getWidth();
        int height = getHeight();
        float[] fArr = new float[9];
        getTransformMatrix().getValues(fArr);
        nSetTextureBufferDescription(j, glTarget, textureId, width, height, fArr);
        return 0;
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureBufferImpl) ipChange.ipc$dispatch("a5c2eab", new Object[]{this, matrix, new Integer(i), new Integer(i2)});
        }
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i, i2, this.type, this.id, matrix2, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: org.webrtc.TextureBufferImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TextureBufferImpl.this.release();
                }
            }
        });
    }

    public TextureBufferImpl createBufferWithNewTexture(Matrix matrix, VideoFrame.TextureBuffer.Type type, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureBufferImpl) ipChange.ipc$dispatch("dabd6527", new Object[]{this, matrix, type, new Integer(i)});
        }
        retain();
        return new TextureBufferImpl(this.width, this.height, type, i, matrix, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: org.webrtc.TextureBufferImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TextureBufferImpl.this.release();
                }
            }
        });
    }
}
