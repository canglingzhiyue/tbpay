package com.taobao.pexode.decoder;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes7.dex */
public class GifImage implements com.taobao.pexode.animate.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LOOP_COUNT_FOREVER = 0;
    private static final int LOOP_COUNT_INFINITE = 0;
    private static final int LOOP_COUNT_MISSING = -1;
    private long mNativeContext;

    static {
        kge.a(2091469457);
        kge.a(1137538811);
    }

    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native GifImage nativeCreateFromFileDescriptor(FileDescriptor fileDescriptor);

    private static native GifImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i);

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

    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public static GifImage create(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GifImage) ipChange.ipc$dispatch("dc4df04a", new Object[]{bArr}) : create(bArr, 0, bArr.length);
    }

    public static GifImage create(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GifImage) ipChange.ipc$dispatch("c5427e6a", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
        allocateDirect.put(bArr, i, i2);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public static GifImage create(FileDescriptor fileDescriptor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GifImage) ipChange.ipc$dispatch("cf0f1ce9", new Object[]{fileDescriptor}) : nativeCreateFromFileDescriptor(fileDescriptor);
    }

    public static GifImage create(long j, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GifImage) ipChange.ipc$dispatch("2c7fcd52", new Object[]{new Long(j), new Integer(i)}) : nativeCreateFromNativeMemory(j, i);
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
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount == 0) {
            return 0;
        }
        return nativeGetLoopCount + 1;
    }

    @Override // com.taobao.pexode.animate.a
    /* renamed from: getFrame  reason: collision with other method in class */
    public GifFrame mo1201getFrame(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GifFrame) ipChange.ipc$dispatch("c498461d", new Object[]{this, new Integer(i)});
        }
        GifFrame nativeGetFrame = nativeGetFrame(i);
        nativeGetFrame.setFrameNumber(i);
        return nativeGetFrame;
    }

    @Override // com.taobao.pexode.animate.a
    public int getSizeInBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46062c9", new Object[]{this})).intValue() : nativeGetSizeInBytes();
    }
}
