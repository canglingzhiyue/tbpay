package com.alipay.mobile.security.faceauth.circle.protocol;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DeviceSetting {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5836a = true;
    public int b = 90;
    public boolean c = true;
    public int d = 1;
    public boolean e = true;
    public int f = 270;
    public int g = 100;
    public int h = 0;

    public boolean isDisplayAuto() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d37ff12", new Object[]{this})).booleanValue() : this.f5836a;
    }

    public void setDisplayAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4d4be", new Object[]{this, new Boolean(z)});
        } else {
            this.f5836a = z;
        }
    }

    public int getDisplayAngle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dec984a1", new Object[]{this})).intValue() : this.b;
    }

    public void setDisplayAngle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5fd9089", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public boolean isCameraAuto() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b41facc9", new Object[]{this})).booleanValue() : this.c;
    }

    public void setCameraAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc499877", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public int getCameraID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("157a2df0", new Object[]{this})).intValue() : this.d;
    }

    public void setCameraID(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca26b1a", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public int getAlgorithmAngle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("201b614", new Object[]{this})).intValue() : this.f;
    }

    public void setAlgorithmAngle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7a4076", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public boolean isAlgorithmAuto() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1e1183f", new Object[]{this})).booleanValue() : this.e;
    }

    public void setAlgorithmAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221bf331", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public int getMaxApiLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e832f652", new Object[]{this})).intValue() : this.g;
    }

    public void setMaxApiLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c228dd90", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public int getMinApiLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6030240", new Object[]{this})).intValue() : this.h;
    }

    public void setMinApiLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5a4f62", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DeviceSetting{displayAuto=" + this.f5836a + ", displayAngle=" + this.b + ", cameraAuto=" + this.c + ", cameraID=" + this.d + ", algorithmAuto=" + this.e + ", algorithmAngle=" + this.f + ", maxApiLevel=" + this.g + ", minApiLevel=" + this.h + '}';
    }
}
