package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class TGDepthFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ByteBuffer byteBuffer;
    public byte[] data;
    public int height;
    public int rotation;
    public int width;

    public TGDepthFrame() {
    }

    public TGDepthFrame(byte[] bArr, int i, int i2, int i3) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
    }

    public TGDepthFrame(byte b, int i, int i2, int i3) {
    }

    public TGDepthFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.byteBuffer = byteBuffer;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
    }

    public TGDepthFrame deepCopy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TGDepthFrame) ipChange.ipc$dispatch("dcec3bab", new Object[]{this});
        }
        TGDepthFrame tGDepthFrame = new TGDepthFrame((byte[]) null, this.width, this.height, this.rotation);
        tGDepthFrame.width = this.width;
        tGDepthFrame.height = this.height;
        tGDepthFrame.rotation = this.rotation;
        byte[] bArr = this.data;
        if (bArr != null && bArr.length != 0) {
            tGDepthFrame.data = Arrays.copyOf(bArr, bArr.length);
        } else {
            ByteBuffer byteBuffer = this.byteBuffer;
            if (byteBuffer != null) {
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
                this.byteBuffer.rewind();
                allocate.put(this.byteBuffer);
                this.byteBuffer.rewind();
                allocate.rewind();
                tGDepthFrame.data = allocate.array();
            }
        }
        return tGDepthFrame;
    }

    public TGDepthFrame(TGDepthFrame tGDepthFrame) {
        if (tGDepthFrame != null) {
            byte[] bArr = tGDepthFrame.data;
            if (bArr != null) {
                this.data = (byte[]) bArr.clone();
            }
            this.width = tGDepthFrame.width;
            this.height = tGDepthFrame.height;
            this.rotation = tGDepthFrame.rotation;
            this.byteBuffer = tGDepthFrame.byteBuffer;
        }
    }

    public void assign(TGDepthFrame tGDepthFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e90d3", new Object[]{this, tGDepthFrame});
            return;
        }
        this.width = tGDepthFrame.width;
        this.height = tGDepthFrame.height;
        this.rotation = tGDepthFrame.rotation;
        byte[] bArr = tGDepthFrame.data;
        if (bArr == null) {
            return;
        }
        this.data = Arrays.copyOf(bArr, bArr.length);
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
        return "TGDepthFrame{data=***, width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + '}';
    }
}
