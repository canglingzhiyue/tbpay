package com.alipay.mobile.security.bio.config.bean;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class Threshold {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float[] f5784a;
    private float[] b;

    public float[] getGeminiLiveness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("f75c726c", new Object[]{this}) : this.f5784a;
    }

    public void setGeminiLiveness(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9b72ac", new Object[]{this, fArr});
        } else {
            this.f5784a = fArr;
        }
    }

    public float[] getDragonflyLiveness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("b9745f2d", new Object[]{this}) : this.b;
    }

    public void setDragonflyLiveness(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5dd473", new Object[]{this, fArr});
        } else {
            this.b = fArr;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Threshold{GeminiLiveness=" + Arrays.toString(this.f5784a) + ", DragonflyLiveness=" + Arrays.toString(this.b) + '}';
    }
}
