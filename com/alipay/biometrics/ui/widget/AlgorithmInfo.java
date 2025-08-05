package com.alipay.biometrics.ui.widget;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlgorithmInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5249a;
    private boolean c;
    public float deepLiveness;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private short n;
    private int b = -1;
    private RectF d = new RectF();

    public boolean isHasFace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74d23d98", new Object[]{this})).booleanValue() : this.f5249a;
    }

    public void setHasFace(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea12c2f8", new Object[]{this, new Boolean(z)});
        } else {
            this.f5249a = z;
        }
    }

    public int getFaceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe840cc8", new Object[]{this})).intValue() : this.b;
    }

    public void setFaceId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68637442", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public boolean isEyeBlink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1d879500", new Object[]{this})).booleanValue() : this.c;
    }

    public void setEyeBlink(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62628920", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public RectF getFaceRegion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("99c674f9", new Object[]{this}) : this.d;
    }

    public void setFaceRegion(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85eb9cb", new Object[]{this, rectF});
        } else {
            this.d = rectF;
        }
    }

    public float getQuality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b865f4c0", new Object[]{this})).floatValue() : this.e;
    }

    public void setQuality(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa207fc", new Object[]{this, new Float(f)});
        } else {
            this.e = f;
        }
    }

    public float getYaw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eac7c330", new Object[]{this})).floatValue() : this.f;
    }

    public void setYaw(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e96d8c", new Object[]{this, new Float(f)});
        } else {
            this.f = f;
        }
    }

    public float getPitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1fcb1901", new Object[]{this})).floatValue() : this.g;
    }

    public void setPitch(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcbedb", new Object[]{this, new Float(f)});
        } else {
            this.g = f;
        }
    }

    public float getGaussian() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ca18f68", new Object[]{this})).floatValue() : this.h;
    }

    public void setGaussian(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa672dbc", new Object[]{this, new Float(f)});
        } else {
            this.h = f;
        }
    }

    public float getMotion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c3363123", new Object[]{this})).floatValue() : this.i;
    }

    public void setMotion(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f5d061", new Object[]{this, new Float(f)});
        } else {
            this.i = f;
        }
    }

    public float getBrightness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64ceed3e", new Object[]{this})).floatValue() : this.j;
    }

    public void setBrightness(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be5bda6", new Object[]{this, new Float(f)});
        } else {
            this.j = f;
        }
    }

    public float getIntegrity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20fad18e", new Object[]{this})).floatValue() : this.k;
    }

    public void setIntegrity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65631ee", new Object[]{this, new Float(f)});
        } else {
            this.k = f;
        }
    }

    public float getLeftEyeBlinkRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("358d9c9a", new Object[]{this})).floatValue() : this.l;
    }

    public void setLeftEyeBlinkRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae69fc62", new Object[]{this, new Float(f)});
        } else {
            this.l = f;
        }
    }

    public float getRightEyeBlinkRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c00aebd1", new Object[]{this})).floatValue() : this.m;
    }

    public void setRightEyeBlinkRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5782dd73", new Object[]{this, new Float(f)});
        } else {
            this.m = f;
        }
    }

    public short getDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25f8a06f", new Object[]{this})).shortValue() : this.n;
    }

    public void setDistance(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf26ccf", new Object[]{this, new Short(s)});
        } else {
            this.n = s;
        }
    }

    public float getDeepLiveness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6dd9c6bc", new Object[]{this})).floatValue() : this.deepLiveness;
    }

    public void setDeepLiveness(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f586e8", new Object[]{this, new Float(f)});
        } else {
            this.deepLiveness = f;
        }
    }
}
