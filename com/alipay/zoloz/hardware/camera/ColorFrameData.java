package com.alipay.zoloz.hardware.camera;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.riy;

/* loaded from: classes3.dex */
public class ColorFrameData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f6230a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public ColorFrameData() {
        this.e = 1;
    }

    public ColorFrameData(ByteBuffer byteBuffer, int i, int i2, int i3, boolean z) {
        this.e = 1;
        this.f6230a = byteBuffer;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = z;
    }

    public ColorFrameData(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z) {
        this.e = 1;
        this.f6230a = byteBuffer;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z;
    }

    public void setColorData(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c220e1f", new Object[]{this, byteBuffer});
        } else {
            this.f6230a = byteBuffer;
        }
    }

    public ByteBuffer getColorData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("4536ce3f", new Object[]{this}) : this.f6230a;
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

    public int getScanMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e4424b0", new Object[]{this})).intValue() : this.e;
    }

    public void setScanMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd174c5a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void setMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5728d0c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public boolean getMirror() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5629b0c0", new Object[]{this})).booleanValue() : this.f;
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ColorFrameData{mColorData=");
        if (this.f6230a == null) {
            str = "null";
        } else {
            str = riy.ARRAY_START_STR + this.f6230a.remaining() + riy.ARRAY_END_STR;
        }
        sb.append(str);
        sb.append(", mColorWidth=");
        sb.append(this.b);
        sb.append(", mColorHeight=");
        sb.append(this.c);
        sb.append(", mColorFrameMode=");
        sb.append(this.d);
        sb.append(", mScanMode='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", mMirror=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
