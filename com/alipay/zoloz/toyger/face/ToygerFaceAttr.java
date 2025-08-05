package com.alipay.zoloz.toyger.face;

import android.graphics.RectF;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.algorithm.TGFaceAttr;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerFaceAttr extends TGFaceAttr implements ToygerAttr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ToygerFaceAttr() {
    }

    public ToygerFaceAttr(TGFaceAttr tGFaceAttr) {
        super(tGFaceAttr);
    }

    public ToygerFaceAttr(ToygerFaceAttr toygerFaceAttr, boolean z) {
        super(toygerFaceAttr);
        if (!z) {
            this.faceRegion = new RectF(1.0f - toygerFaceAttr.faceRegion.right, toygerFaceAttr.faceRegion.top, 1.0f - toygerFaceAttr.faceRegion.left, toygerFaceAttr.faceRegion.bottom);
            for (int i = 0; i < this.otherFaceCount; i++) {
                int i2 = i * 4;
                this.otherFacePos[i2] = 1.0f - this.otherFacePos[i2];
                int i3 = i2 + 2;
                this.otherFacePos[i3] = 1.0f - this.otherFacePos[i3];
            }
        }
        if (toygerFaceAttr == null || toygerFaceAttr.keypts10 == null) {
            this.keypts10 = toygerFaceAttr != null ? toygerFaceAttr.keypts10 : new float[10];
        } else if (z) {
            this.keypts10 = new float[]{1.0f - toygerFaceAttr.keypts10[1], 1.0f - toygerFaceAttr.keypts10[0], 1.0f - toygerFaceAttr.keypts10[2], 1.0f - toygerFaceAttr.keypts10[4], 1.0f - toygerFaceAttr.keypts10[3], toygerFaceAttr.keypts10[5], toygerFaceAttr.keypts10[6], toygerFaceAttr.keypts10[7], toygerFaceAttr.keypts10[8], toygerFaceAttr.keypts10[9]};
        } else {
            this.keypts10 = toygerFaceAttr.keypts10;
        }
    }

    public ToygerFaceAttr(boolean z, int i, boolean z2, boolean z3, RectF rectF, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, short s, float[] fArr, float f14, float f15, float f16, float f17, float f18) {
        super(z, i, z2, z3, rectF, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, s, fArr, f14, f15, f16, f17, f18);
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public boolean hasTarget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46073bd6", new Object[]{this})).booleanValue() : this.hasFace;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public RectF region() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("91aecd8c", new Object[]{this}) : this.faceRegion;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float quality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("de8fadf6", new Object[]{this})).floatValue() : this.quality;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float gaussian() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cbaefcf2", new Object[]{this})).floatValue() : this.gaussian;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float motion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4f5792d", new Object[]{this})).floatValue() : this.motion;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float brightness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76372048", new Object[]{this})).floatValue() : this.brightness;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public float integrity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("639b1544", new Object[]{this})).floatValue() : this.integrity;
    }

    @Override // com.alipay.zoloz.toyger.ToygerAttr
    public short distance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5060df9", new Object[]{this})).shortValue() : this.distance;
    }

    public boolean eyeBlink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ae8a2b6", new Object[]{this})).booleanValue() : this.eyeBlink;
    }

    public float yaw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acfa8766", new Object[]{this})).floatValue() : this.yaw;
    }

    public float pitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("205da7b7", new Object[]{this})).floatValue() : this.pitch;
    }

    public float leftEyeBlinkRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("29e1ca50", new Object[]{this})).floatValue() : this.leftEyeBlinkRatio;
    }

    public float leftEyeBlinkRatioMin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b5048930", new Object[]{this})).floatValue() : this.leftEyeBlinkRatioMin;
    }

    public float leftEyeBlinkRatioMax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7eaaf42", new Object[]{this})).floatValue() : this.leftEyeBlinkRatioMax;
    }

    public float rightEyeBlinkRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("563c74db", new Object[]{this})).floatValue() : this.rightEyeBlinkRatio;
    }

    public float rightEyeBlinkRatioMin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3ff0cec5", new Object[]{this})).floatValue() : this.rightEyeBlinkRatioMin;
    }

    public float rightEyeOcclusionScore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8fa98651", new Object[]{this})).floatValue() : this.rightEyeOcclusionScore;
    }

    public float leftEyeOcclusionScore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd0d1946", new Object[]{this})).floatValue() : this.leftEyeOcclusionScore;
    }
}
