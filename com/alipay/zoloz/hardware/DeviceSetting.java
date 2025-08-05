package com.alipay.zoloz.hardware;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DeviceSetting {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String r;
    public byte[] sgsyBytes;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6213a = true;
    public int b = 90;
    public boolean c = true;
    public int d = 1;
    public boolean e = true;
    public int f = 270;
    public boolean g = true;
    public boolean h = false;
    public int i = 640;
    public int j = 100;
    public int k = 0;
    public boolean l = false;
    public boolean m = true;
    public boolean n = true;
    public float o = 1.33f;
    public boolean p = false;
    public boolean q = false;
    public int s = -1;
    public int t = -1;
    public int u = 10;
    public int v = 1;
    public boolean w = true;

    public boolean isDisplayAuto() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d37ff12", new Object[]{this})).booleanValue() : this.f6213a;
    }

    public void setDisplayAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4d4be", new Object[]{this, new Boolean(z)});
        } else {
            this.f6213a = z;
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e832f652", new Object[]{this})).intValue() : this.j;
    }

    public void setMaxApiLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c228dd90", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public int getMinApiLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6030240", new Object[]{this})).intValue() : this.k;
    }

    public void setMinApiLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5a4f62", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public boolean isSlir() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8588a417", new Object[]{this})).booleanValue() : this.l;
    }

    public void setSlir(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411080e9", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public boolean isMirrorAuto() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aca61b63", new Object[]{this})).booleanValue() : this.g;
    }

    public void setMirrorAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d490fd1d", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public boolean isMirror() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e953f594", new Object[]{this})).booleanValue() : this.h;
    }

    public void setMirror(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5728d0c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public int getSolutionWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b6f1d111", new Object[]{this})).intValue() : this.i;
    }

    public void setSolutionWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7447b1", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public boolean isBeauty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dac3f3d1", new Object[]{this})).booleanValue() : this.m;
    }

    public void setBeauty(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4202566f", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public boolean isFaceAE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8252b416", new Object[]{this})).booleanValue() : this.n;
    }

    public void setFaceAE(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4b9eca", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public String getSgsy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38a0ecc9", new Object[]{this}) : this.r;
    }

    public void setSgsy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffbeccd", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.s;
    }

    public void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.s = i;
        }
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.t;
    }

    public void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else {
            this.t = i;
        }
    }

    public int getQuality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b865f4c3", new Object[]{this})).intValue() : this.u;
    }

    public void setQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa2133f", new Object[]{this, new Integer(i)});
        } else {
            this.u = i;
        }
    }

    public int getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue() : this.v;
    }

    public void setMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b0557", new Object[]{this, new Integer(i)});
        } else {
            this.v = i;
        }
    }

    public boolean isWidthAuto() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7f7b596", new Object[]{this})).booleanValue() : this.w;
    }

    public void setWidthAuto(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e25cba", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public float getCameraRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("39bfbf27", new Object[]{this})).floatValue() : this.o;
    }

    public void setCameraRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2352475", new Object[]{this, new Float(f)});
        } else {
            this.o = f;
        }
    }

    public boolean useAutoFaceFocus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7726f50", new Object[]{this})).booleanValue() : this.p;
    }

    public void setAutoFaceFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fcc4323", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public boolean checkHook() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("769df156", new Object[]{this})).booleanValue() : this.q;
    }

    public void setHookCheck(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2cf5aa", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceSetting{displayAuto=");
        sb.append(this.f6213a);
        sb.append(", displayAngle=");
        sb.append(this.b);
        sb.append(", cameraAuto=");
        sb.append(this.c);
        sb.append(", cameraID=");
        sb.append(this.d);
        sb.append(", algorithmAuto=");
        sb.append(this.e);
        sb.append(", algorithmAngle=");
        sb.append(this.f);
        sb.append(", mirrorAuto=");
        sb.append(this.g);
        sb.append(", isMirror=");
        sb.append(this.h);
        sb.append(", solutionWidth=");
        sb.append(this.i);
        sb.append(", maxApiLevel=");
        sb.append(this.j);
        sb.append(", minApiLevel=");
        sb.append(this.k);
        sb.append(", slir=");
        sb.append(this.l);
        sb.append(", beauty=");
        sb.append(this.m);
        sb.append(", faceAE=");
        sb.append(this.n);
        sb.append(", sgsy=");
        sb.append(this.r == null ? "null" : "****");
        sb.append(", width=");
        sb.append(this.s);
        sb.append(", height=");
        sb.append(this.t);
        sb.append(", quality=");
        sb.append(this.u);
        sb.append(", mode=");
        sb.append(this.v);
        sb.append(", widthAuto=");
        sb.append(this.w);
        sb.append(", cameraRatio=");
        sb.append(this.o);
        sb.append(", useAutoFaceFocus");
        sb.append(this.p);
        sb.append(", hookCheck");
        sb.append(this.q);
        sb.append('}');
        return sb.toString();
    }
}
