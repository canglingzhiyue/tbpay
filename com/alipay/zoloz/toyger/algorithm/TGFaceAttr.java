package com.alipay.zoloz.toyger.algorithm;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class TGFaceAttr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float brightness;
    public float confidence;
    public float deepLiveness;
    public float depthQuality;
    public short distance;
    public boolean eyeBlink;
    public boolean eyeOpen;
    public int faceCount;
    public int faceId;
    public RectF faceRegion;
    public float gaussian;
    public boolean hasFace;
    public float integrity;
    public float iodRatio;
    public float[] keypts10;
    public float leftEyeBlinkRatio;
    public float leftEyeBlinkRatioMax;
    public float leftEyeBlinkRatioMin;
    public float leftEyeOcclusionScore;
    public float motion;
    public int otherFaceCount;
    public float[] otherFacePos;
    public float pitch;
    public float quality;
    public float rightEyeBlinkRatio;
    public float rightEyeBlinkRatioMax;
    public float rightEyeBlinkRatioMin;
    public float rightEyeOcclusionScore;
    public float roll;
    public float yaw;

    public TGFaceAttr() {
        this.faceId = -1;
        this.depthQuality = -1.0f;
        this.faceRegion = new RectF();
    }

    public TGFaceAttr(boolean z, int i, boolean z2, boolean z3, RectF rectF, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, short s, float[] fArr, float f14, float f15, float f16, float f17, float f18) {
        this.faceId = -1;
        this.depthQuality = -1.0f;
        this.hasFace = z;
        this.eyeOpen = z3;
        this.faceId = i;
        this.eyeBlink = z2;
        this.faceRegion = rectF;
        this.quality = f;
        this.yaw = f2;
        this.pitch = f3;
        this.gaussian = f4;
        this.motion = f5;
        this.brightness = f6;
        this.integrity = f7;
        this.leftEyeBlinkRatio = f8;
        this.leftEyeBlinkRatioMin = f9;
        this.leftEyeBlinkRatioMax = f10;
        this.rightEyeBlinkRatio = f11;
        this.rightEyeBlinkRatioMin = f12;
        this.rightEyeBlinkRatioMax = f13;
        this.distance = s;
        this.keypts10 = fArr;
        this.confidence = f14;
        this.roll = f15;
        this.iodRatio = f16;
        this.deepLiveness = f17;
        this.depthQuality = f18;
        this.faceCount = 0;
        this.otherFaceCount = 0;
        this.otherFacePos = null;
    }

    public TGFaceAttr(TGFaceAttr tGFaceAttr) {
        this.faceId = -1;
        this.depthQuality = -1.0f;
        if (tGFaceAttr != null) {
            this.hasFace = tGFaceAttr.hasFace;
            this.faceId = tGFaceAttr.faceId;
            this.eyeOpen = tGFaceAttr.eyeOpen;
            this.eyeBlink = tGFaceAttr.eyeBlink;
            this.faceRegion = new RectF(tGFaceAttr.faceRegion);
            this.quality = tGFaceAttr.quality;
            this.yaw = tGFaceAttr.yaw;
            this.pitch = tGFaceAttr.pitch;
            this.gaussian = tGFaceAttr.gaussian;
            this.motion = tGFaceAttr.motion;
            this.brightness = tGFaceAttr.brightness;
            this.integrity = tGFaceAttr.integrity;
            this.leftEyeBlinkRatio = tGFaceAttr.leftEyeBlinkRatio;
            this.leftEyeBlinkRatioMin = tGFaceAttr.leftEyeBlinkRatioMin;
            this.leftEyeBlinkRatioMax = tGFaceAttr.leftEyeBlinkRatioMax;
            this.leftEyeOcclusionScore = tGFaceAttr.leftEyeOcclusionScore;
            this.rightEyeBlinkRatio = tGFaceAttr.rightEyeBlinkRatio;
            this.rightEyeBlinkRatioMin = tGFaceAttr.rightEyeBlinkRatioMin;
            this.rightEyeBlinkRatioMax = tGFaceAttr.rightEyeBlinkRatioMax;
            this.rightEyeOcclusionScore = tGFaceAttr.rightEyeOcclusionScore;
            this.distance = tGFaceAttr.distance;
            this.keypts10 = tGFaceAttr.keypts10;
            this.confidence = tGFaceAttr.confidence;
            this.roll = tGFaceAttr.roll;
            this.iodRatio = tGFaceAttr.iodRatio;
            this.deepLiveness = tGFaceAttr.deepLiveness;
            this.depthQuality = tGFaceAttr.depthQuality;
            this.faceCount = tGFaceAttr.faceCount;
            this.otherFaceCount = tGFaceAttr.otherFaceCount;
            float[] fArr = tGFaceAttr.otherFacePos;
            if (fArr == null) {
                return;
            }
            this.otherFacePos = new float[fArr.length];
            float[] fArr2 = tGFaceAttr.otherFacePos;
            float[] fArr3 = this.otherFacePos;
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TGFaceAttr{hasFace=");
        sb.append(this.hasFace);
        sb.append(", faceId=");
        sb.append(this.faceId);
        sb.append(", eyeBlink=");
        sb.append(this.eyeBlink);
        sb.append(", eyeOpen=");
        sb.append(this.eyeOpen);
        sb.append(", faceRegion=");
        sb.append(this.faceRegion);
        sb.append(", quality=");
        sb.append(this.quality);
        sb.append(", yaw=");
        sb.append(this.yaw);
        sb.append(", pitch=");
        sb.append(this.pitch);
        sb.append(", gaussian=");
        sb.append(this.gaussian);
        sb.append(", motion=");
        sb.append(this.motion);
        sb.append(", brightness=");
        sb.append(this.brightness);
        sb.append(", integrity=");
        sb.append(this.integrity);
        sb.append(", leftEyeBlinkRatio=");
        sb.append(this.leftEyeBlinkRatio);
        sb.append(", leftEyeBlinkRatioMin=");
        sb.append(this.leftEyeBlinkRatioMin);
        sb.append(", leftEyeBlinkRatioMax=");
        sb.append(this.leftEyeBlinkRatioMax);
        sb.append(", rightEyeBlinkRatio=");
        sb.append(this.rightEyeBlinkRatio);
        sb.append(", rightEyeBlinkRatioMin=");
        sb.append(this.rightEyeBlinkRatioMin);
        sb.append(", rightEyeBlinkRatioMax=");
        sb.append(this.rightEyeBlinkRatioMax);
        sb.append(", distance=");
        sb.append((int) this.distance);
        sb.append(", keypts10=");
        sb.append(Arrays.toString(this.keypts10));
        sb.append(", confidence=");
        sb.append(this.confidence);
        sb.append(", roll=");
        sb.append(this.roll);
        sb.append(", iodRatio=");
        sb.append(this.iodRatio);
        sb.append(", deepLiveness=");
        sb.append(this.deepLiveness);
        sb.append(", depthQuality=");
        sb.append(this.depthQuality);
        sb.append(", faceCount=");
        sb.append(this.faceCount);
        sb.append(", otherFacePos =");
        float[] fArr = this.otherFacePos;
        sb.append(fArr == null ? "null" : Arrays.toString(fArr));
        sb.append(", otherFaceCount =");
        sb.append(this.otherFaceCount);
        sb.append('}');
        return sb.toString();
    }
}
