package com.taobao.pexode.decoder;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.entity.RewindableStream;
import java.io.FileDescriptor;

/* loaded from: classes7.dex */
public class APngImage implements com.taobao.pexode.animate.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LOOP_COUNT_MISSING = -1;
    private long mNativePtr;

    public static native APngImage nativeCreateFromBytes(byte[] bArr, int i, int i2);

    public static native APngImage nativeCreateFromFd(FileDescriptor fileDescriptor);

    public static native APngImage nativeCreateFromRewindableStream(RewindableStream rewindableStream, byte[] bArr);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native APngFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public static native int nativeLoadedVersionTest();

    public boolean doesRenderSupportScaling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265c9512", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public APngImage(long j) {
        this.mNativePtr = j;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            nativeFinalize();
        }
    }

    @Override // com.taobao.pexode.animate.a
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            nativeDispose();
        }
    }

    @Override // com.taobao.pexode.animate.a
    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : nativeGetWidth();
    }

    @Override // com.taobao.pexode.animate.a
    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : nativeGetHeight();
    }

    @Override // com.taobao.pexode.animate.a
    public int getFrameCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9bea4412", new Object[]{this})).intValue() : nativeGetFrameCount();
    }

    public int getDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue() : nativeGetDuration();
    }

    @Override // com.taobao.pexode.animate.a
    public int[] getFrameDurations() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("c862fad5", new Object[]{this}) : nativeGetFrameDurations();
    }

    @Override // com.taobao.pexode.animate.a
    public int getLoopCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9ea040f", new Object[]{this})).intValue();
        }
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount != -1) {
            return nativeGetLoopCount;
        }
        return 1;
    }

    @Override // com.taobao.pexode.animate.a
    /* renamed from: getFrame  reason: collision with other method in class */
    public APngFrame mo1201getFrame(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APngFrame) ipChange.ipc$dispatch("60950d2b", new Object[]{this, new Integer(i)}) : nativeGetFrame(i);
    }

    @Override // com.taobao.pexode.animate.a
    public int getSizeInBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46062c9", new Object[]{this})).intValue() : nativeGetSizeInBytes();
    }
}
