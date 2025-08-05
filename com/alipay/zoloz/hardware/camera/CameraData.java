package com.alipay.zoloz.hardware.camera;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class CameraData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MODE_BGR = 2;
    public static final int MODE_BGRA = 1;
    public static final int MODE_DEPTH_100UM = 51;
    public static final int MODE_DEPTH_1_MM = 50;
    public static final int MODE_GRAY_16 = 6;
    public static final int MODE_GRAY_8 = 5;
    public static final int MODE_IR_GRAY_16 = 6;
    public static final int MODE_IR_GRAY_8 = 5;
    public static final int MODE_NV21 = 0;
    public static final int MODE_RGB = 4;
    public static final int MODE_RGBA = 3;

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f6228a;
    public int b;
    public int c;
    public int d;
    public ByteBuffer e;
    public int f;
    public int g;
    public int h;
    public ByteBuffer i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;

    public CameraData() {
    }

    public CameraData(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6, int i7) {
        this(byteBuffer, i, i2, i3, byteBuffer2, i4, i5, i6, i7, false);
    }

    public CameraData(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6, int i7, boolean z) {
        this(byteBuffer, i, i2, i3, byteBuffer2, i4, i5, -1, null, 0, 0, -1, i6, i7, z);
    }

    public CameraData(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, int i9, int i10, int i11, boolean z) {
        this.f6228a = byteBuffer;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = byteBuffer2;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = byteBuffer3;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = i10;
        this.n = i11;
        this.o = z;
    }

    public void setColorData(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c220e1f", new Object[]{this, byteBuffer});
        } else {
            this.f6228a = byteBuffer;
        }
    }

    public ByteBuffer getColorData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("4536ce3f", new Object[]{this}) : this.f6228a;
    }

    public void setColorWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4d457", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public int getColorWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd49bc13", new Object[]{this})).intValue() : this.b;
    }

    public void setColorHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e997b4", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public int getColorHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a62067ae", new Object[]{this})).intValue() : this.c;
    }

    public void setColorFrameMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fb032d", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public int getColorFrameMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3692407d", new Object[]{this})).intValue() : this.d;
    }

    public void setDepthData(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e162aebf", new Object[]{this, byteBuffer});
        } else {
            this.e = byteBuffer;
        }
    }

    public ByteBuffer getDepthData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("2b0f999f", new Object[]{this}) : this.e;
    }

    public void setDepthWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98bb7b7", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public int getDepthWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca68ecb3", new Object[]{this})).intValue() : this.f;
    }

    public void setDepthHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff2054", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public int getDepthHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3ce74b0e", new Object[]{this})).intValue() : this.g;
    }

    public void setDepthFrameMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e1368d", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public int getDepthFrameMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4968211d", new Object[]{this})).intValue() : this.h;
    }

    public void setIRData(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7c2975", new Object[]{this, byteBuffer});
        } else {
            this.i = byteBuffer;
        }
    }

    public ByteBuffer getIRData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("fdfac491", new Object[]{this}) : this.i;
    }

    public void setIRWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bc7cc1", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public int getIRWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9f775301", new Object[]{this})).intValue() : this.j;
    }

    public void setIRHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde6fc8a", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public int getIRHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9a5ae80", new Object[]{this})).intValue() : this.k;
    }

    public void setIRFrameMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb46697", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public int getIRFrameMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("891eb06b", new Object[]{this})).intValue() : this.l;
    }

    public void setPreviewWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46236fc", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public int getPreviewWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50ccc3ce", new Object[]{this})).intValue() : this.m;
    }

    public void setPreviewHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f889af", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public int getPreviewHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("82fe5753", new Object[]{this})).intValue() : this.n;
    }

    public void setMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5728d0c", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public boolean getMirror() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5629b0c0", new Object[]{this})).booleanValue() : this.o;
    }

    public CameraData deepClone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraData) ipChange.ipc$dispatch("487e59b3", new Object[]{this});
        }
        CameraData cameraData = new CameraData();
        cameraData.f6228a = ByteBuffer.allocateDirect(this.f6228a.capacity());
        this.f6228a.rewind();
        cameraData.f6228a.put(this.f6228a);
        this.f6228a.rewind();
        cameraData.f6228a.rewind();
        cameraData.b = this.b;
        cameraData.c = this.c;
        cameraData.d = this.d;
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            cameraData.e = ByteBuffer.allocateDirect(byteBuffer.capacity());
            this.e.rewind();
            cameraData.e.put(this.e);
            this.e.rewind();
            cameraData.e.rewind();
        } else {
            cameraData.e = null;
        }
        cameraData.f = this.f;
        cameraData.g = this.g;
        cameraData.h = this.h;
        ByteBuffer byteBuffer2 = this.i;
        if (byteBuffer2 != null) {
            cameraData.i = ByteBuffer.allocateDirect(byteBuffer2.capacity());
            this.i.rewind();
            cameraData.i.put(this.i);
            this.i.rewind();
            cameraData.i.rewind();
        } else {
            cameraData.i = null;
        }
        cameraData.j = this.j;
        cameraData.k = this.k;
        cameraData.l = this.l;
        cameraData.m = this.m;
        cameraData.n = this.n;
        cameraData.o = this.o;
        return cameraData;
    }

    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
            return;
        }
        this.f6228a = null;
        this.e = null;
        this.i = null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CameraData{mColorWidth=");
        sb.append(this.b);
        sb.append(", mColorHeight=");
        sb.append(this.c);
        sb.append(", mColorFrameMode=");
        sb.append(this.d);
        sb.append(", mColorData=[");
        sb.append(this.f6228a.remaining());
        sb.append("], mDepthWidth=");
        sb.append(this.f);
        sb.append(", mDepthHeight=");
        sb.append(this.g);
        sb.append(", mDepthFrameMode=");
        sb.append(this.h);
        sb.append(", mDepthData=[");
        ByteBuffer byteBuffer = this.e;
        Object obj = "null";
        sb.append(byteBuffer == null ? obj : Integer.valueOf(byteBuffer.remaining()));
        sb.append("], mIRWidth=");
        sb.append(this.j);
        sb.append(", mIRHeight=");
        sb.append(this.k);
        sb.append(", mIRFrameMode=");
        sb.append(this.l);
        sb.append(", mIRData=[");
        ByteBuffer byteBuffer2 = this.i;
        if (byteBuffer2 != null) {
            obj = Integer.valueOf(byteBuffer2.remaining());
        }
        sb.append(obj);
        sb.append("], mPreviewWidth=");
        sb.append(this.m);
        sb.append(", mPreviewHeight=");
        sb.append(this.n);
        sb.append(", mMirror=");
        sb.append(this.o);
        sb.append('}');
        return sb.toString();
    }
}
