package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class TGFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MODE_BGR = 2;
    public static final int MODE_BGRA = 1;
    public static final int MODE_DEPTH = 7;
    public static final int MODE_GRAY_16 = 6;
    public static final int MODE_GRAY_8 = 5;
    public static final int MODE_IRIS = 6;
    public static final int MODE_NV21 = 0;
    public static final int MODE_RGB = 4;
    public static final int MODE_RGBA = 3;
    public static final int TYPE_DARK = 1;
    public static final int TYPE_DEPTH = 2;
    public static final int TYPE_GRAY_NANO = 5;
    public static final int TYPE_IR = 3;
    public static final int TYPE_LIGHT = 0;
    public static final int TYPE_NANO = 4;
    public ByteBuffer byteBuffer;
    public byte[] data;
    public int frameMode;
    public int frameType;
    public int height;
    public int rotation;
    public int width;

    public TGFrame() {
    }

    public TGFrame(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.frameMode = i4;
        this.frameType = i5;
    }

    public TGFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) {
        this.byteBuffer = byteBuffer;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.frameMode = i4;
        this.frameType = i5;
    }

    public TGFrame(TGFrame tGFrame) {
        if (tGFrame != null) {
            byte[] bArr = tGFrame.data;
            if (bArr != null) {
                this.data = (byte[]) bArr.clone();
            }
            this.width = tGFrame.width;
            this.height = tGFrame.height;
            this.rotation = tGFrame.rotation;
            this.frameMode = tGFrame.frameMode;
            this.frameType = tGFrame.frameType;
            this.byteBuffer = tGFrame.byteBuffer;
        }
    }

    public TGFrame deepCopy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TGFrame) ipChange.ipc$dispatch("951fed94", new Object[]{this});
        }
        TGFrame tGFrame = new TGFrame((byte[]) null, this.width, this.height, this.rotation, this.frameMode, this.frameType);
        tGFrame.width = this.width;
        tGFrame.height = this.height;
        tGFrame.rotation = this.rotation;
        tGFrame.frameMode = this.frameMode;
        tGFrame.frameType = this.frameType;
        byte[] bArr = this.data;
        if (bArr != null && bArr.length != 0) {
            tGFrame.data = Arrays.copyOf(bArr, bArr.length);
        } else {
            ByteBuffer byteBuffer = this.byteBuffer;
            if (byteBuffer != null) {
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
                this.byteBuffer.rewind();
                allocate.put(this.byteBuffer);
                this.byteBuffer.rewind();
                allocate.rewind();
                tGFrame.data = allocate.array();
            }
        }
        return tGFrame;
    }

    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
            return;
        }
        this.data = null;
        this.byteBuffer = null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TGFrame{data=***, width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + ", frameMode=" + this.frameMode + ", frameType=" + this.frameType + '}';
    }
}
