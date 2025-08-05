package com.alipay.mobile.security.faceauth.api;

import android.graphics.Rect;
import android.graphics.RectF;
import com.alipay.mobile.security.faceauth.FaceDetectType;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;

/* loaded from: classes3.dex */
public abstract class FaceFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FaceInfo f5835a;
    private int b = 0;
    private float c = 0.0f;
    private double d = mto.a.GEO_NOT_SUPPORT;
    private int e;
    private int f;
    private int g;
    private FaceDetectType h;
    private FaceFrameType i;

    public abstract byte[] getImageData(Rect rect, boolean z, int i, int i2, boolean z2, boolean z3, int i3);

    public abstract byte[] getYuvData();

    public void setFaceInfo(FaceInfo faceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba59e8d2", new Object[]{this, faceInfo});
        } else {
            this.f5835a = faceInfo;
        }
    }

    public synchronized Rect getFaceSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("71766f04", new Object[]{this});
        } else if (this.f5835a == null) {
            return null;
        } else {
            return this.f5835a.faceSize;
        }
    }

    public boolean isEyeBlink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d879500", new Object[]{this})).booleanValue();
        }
        FaceInfo faceInfo = this.f5835a;
        return faceInfo != null && faceInfo.eyeBlink;
    }

    public boolean isMouthOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("445db6b2", new Object[]{this})).booleanValue();
        }
        FaceInfo faceInfo = this.f5835a;
        return faceInfo != null && faceInfo.mouthOpen;
    }

    public RectF getFacePos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b5bf7ddf", new Object[]{this});
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.position;
        }
        return null;
    }

    public float getYawAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b688891", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.yaw;
        }
        return -1.0f;
    }

    public float getPitchAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30d72d60", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.pitch;
        }
        return -1.0f;
    }

    public float getGaussianBlur() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87ecb7ef", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.gaussianBlur;
        }
        return -1.0f;
    }

    public float getMouthDet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fec616b9", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.mouthDet;
        }
        return -1.0f;
    }

    public float getMotionBlur() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b94042a", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.motionBlur;
        }
        return -1.0f;
    }

    public float getBrightness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64ceed3e", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.brightness;
        }
        return -1.0f;
    }

    public float getFaceQuality() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce92a523", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.faceQuality;
        }
        return -1.0f;
    }

    public boolean hasFace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8dda122", new Object[]{this})).booleanValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo == null) {
            return false;
        }
        return faceInfo.hasFace;
    }

    public float getLeftEyeHwratio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("943545bf", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.leftEyeHWRatio;
        }
        return -1.0f;
    }

    public float getRightEyeHwratio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85aa19e8", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.rightEyeHWRatio;
        }
        return -1.0f;
    }

    @Deprecated
    public float getMouthHwratio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99f0eb02", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.mouthHWRatio;
        }
        return -1.0f;
    }

    public float getEyeLeftDet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a414b08", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.eyeLeftDet;
        }
        return 0.0f;
    }

    public float getEyeRightDet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("138833e9", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.eyeRightDet;
        }
        return 0.0f;
    }

    public float getMouthOcclusion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b49ebf3", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.mouthOcclussion;
        }
        return 0.0f;
    }

    public float getEyeLeftOcclussion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84568089", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.eyeLeftOcclussion;
        }
        return 0.0f;
    }

    public float getEyeRightOcclussion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3de30888", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.eyeRightOcclussion;
        }
        return 0.0f;
    }

    public boolean isNoVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58e47b3b", new Object[]{this})).booleanValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.notVideo;
        }
        return false;
    }

    public float getIntegrity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20fad18e", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.integrity;
        }
        return 0.0f;
    }

    public float getWearGlass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a097a97e", new Object[]{this})).floatValue();
        }
        FaceInfo faceInfo = this.f5835a;
        if (faceInfo != null) {
            return faceInfo.wearGlass;
        }
        return 0.0f;
    }

    public FaceFrameType getFaceFrameType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceFrameType) ipChange.ipc$dispatch("dd4ee508", new Object[]{this}) : this.i;
    }

    public void setFaceFrameType(FaceFrameType faceFrameType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30957fce", new Object[]{this, faceFrameType});
        } else {
            this.i = faceFrameType;
        }
    }

    public int getDeviceAngle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76f7efe1", new Object[]{this})).intValue() : this.b;
    }

    public void setDeviceAngle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0315e1", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public int getYuvWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e9711fc", new Object[]{this})).intValue() : this.e;
    }

    public void setYuvWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4722088e", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public int getYuvHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6e7dcee5", new Object[]{this})).intValue() : this.f;
    }

    public void setYuvHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2932ea5d", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public int getYuvAngle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8fd0e89", new Object[]{this})).intValue() : this.g;
    }

    public void setYuvAngle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97b9da1", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public float getDeviceLight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c882d2a1", new Object[]{this})).floatValue() : this.c;
    }

    public void setDeviceLight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd4803b", new Object[]{this, new Float(f)});
        } else {
            this.c = f;
        }
    }

    public double getFgyroangle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9795ec49", new Object[]{this})).doubleValue() : this.d;
    }

    public void setFgyroangle(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fe98b7", new Object[]{this, new Double(d)});
        } else {
            this.d = d;
        }
    }

    public FaceDetectType getFaceDetectType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceDetectType) ipChange.ipc$dispatch("7ec5aa23", new Object[]{this}) : this.h;
    }

    public void setFaceDetectType(FaceDetectType faceDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9430de7", new Object[]{this, faceDetectType});
        } else {
            this.h = faceDetectType;
        }
    }
}
