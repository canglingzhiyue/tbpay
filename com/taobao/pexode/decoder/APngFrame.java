package com.taobao.pexode.decoder;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.animate.AnimatedDrawableFrameInfo;

/* loaded from: classes7.dex */
public class APngFrame implements com.taobao.pexode.animate.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int mFrameNumber;
    private final long mNativePtr;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetBlendMode();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public APngFrame(long j, int i) {
        this.mNativePtr = j;
        this.mFrameNumber = i;
    }

    private static AnimatedDrawableFrameInfo.DisposalMode transformNativeDisposalMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatedDrawableFrameInfo.DisposalMode) ipChange.ipc$dispatch("b3d57085", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND;
        }
        if (i == 2) {
            return AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_PREVIOUS;
        }
        return AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_DO_NOT;
    }

    private static AnimatedDrawableFrameInfo.BlendMode transformNativeBlendMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatedDrawableFrameInfo.BlendMode) ipChange.ipc$dispatch("f801e1ef", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return AnimatedDrawableFrameInfo.BlendMode.BLEND_WITH_PREVIOUS;
        }
        return AnimatedDrawableFrameInfo.BlendMode.NO_BLEND;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            nativeFinalize();
        }
    }

    @Override // com.taobao.pexode.animate.b
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            nativeDispose();
        }
    }

    @Override // com.taobao.pexode.animate.b
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12d090", new Object[]{this, new Integer(i), new Integer(i2), bitmap});
        } else {
            nativeRenderFrame(i, i2, bitmap);
        }
    }

    public int getDurationMs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d397d6ca", new Object[]{this})).intValue() : nativeGetDurationMs();
    }

    @Override // com.taobao.pexode.animate.b
    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : nativeGetWidth();
    }

    @Override // com.taobao.pexode.animate.b
    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : nativeGetHeight();
    }

    @Override // com.taobao.pexode.animate.b
    public int getXOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f4ee54ef", new Object[]{this})).intValue() : nativeGetXOffset();
    }

    @Override // com.taobao.pexode.animate.b
    public int getYOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("89d307b0", new Object[]{this})).intValue() : nativeGetYOffset();
    }

    @Override // com.taobao.pexode.animate.b
    public AnimatedDrawableFrameInfo getFrameInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatedDrawableFrameInfo) ipChange.ipc$dispatch("a6e84b80", new Object[]{this}) : new AnimatedDrawableFrameInfo(this.mFrameNumber, getXOffset(), getYOffset(), getWidth(), getHeight(), transformNativeBlendMode(nativeGetBlendMode()), transformNativeDisposalMode(nativeGetDisposalMode()));
    }
}
