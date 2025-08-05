package com.alipay.zoloz.hardware.camera.preview.utils;

import android.opengl.Matrix;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Stack;

/* loaded from: classes3.dex */
public class VaryTools {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float[] f6250a = new float[16];
    private float[] b = new float[16];
    private float[] c = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private Stack<float[]> d = new Stack<>();

    public void pushMatrix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7114682", new Object[]{this});
        } else {
            this.d.push(Arrays.copyOf(this.c, 16));
        }
    }

    public void popMatrix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d8f0f9", new Object[]{this});
        } else {
            this.c = this.d.pop();
        }
    }

    public void clearStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dbf342", new Object[]{this});
        } else {
            this.d.clear();
        }
    }

    public void translate(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b564cb", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            Matrix.translateM(this.c, 0, f, f2, f3);
        }
    }

    public void rotate(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80df2b62", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else {
            Matrix.rotateM(this.c, 0, f, f2, f3, f4);
        }
    }

    public void scale(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb63994f", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            Matrix.scaleM(this.c, 0, f, f2, f3);
        }
    }

    public void setCamera(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d40852", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8), new Float(f9)});
        } else {
            Matrix.setLookAtM(this.f6250a, 0, f, f2, f3, f4, f5, f6, f7, f8, f9);
        }
    }

    public void frustum(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8554b229", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
        } else {
            Matrix.frustumM(this.b, 0, f, f2, f3, f4, f5, f6);
        }
    }

    public void ortho(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77328ff", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
        } else {
            Matrix.orthoM(this.b, 0, f, f2, f3, f4, f5, f6);
        }
    }

    public float[] getFinalMatrix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("5a8e0e39", new Object[]{this});
        }
        float[] fArr = new float[16];
        Matrix.multiplyMM(fArr, 0, this.f6250a, 0, this.c, 0);
        Matrix.multiplyMM(fArr, 0, this.b, 0, fArr, 0);
        return fArr;
    }
}
