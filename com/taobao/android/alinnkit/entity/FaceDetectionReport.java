package com.taobao.android.alinnkit.entity;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class FaceDetectionReport {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NATIVE_EXTRA_FLOAT_OUT_LENGTH = 268;
    public static final int NATIVE_EYEBALL_FLOAT_OUT_LENGTH = 82;
    public static final int NATIVE_FLOAT_OUT_LENGTH = 322;
    public static final int NATIVE_INT_OUT_LENGTH = 5;
    public float[] extraFacePoints;
    public float[] eyeballCenterPoints;
    public float[] eyeballContourPoints;
    public long faceAction;
    public Map<String, Boolean> faceActionMap;
    public final int faceID;
    public float[] floatArray;
    public float[] floatExtra;
    public float[] floatEyeballs;
    public int[] intArray;
    public float leftEyeballScore;
    public final float pitch;
    public final Rect rect;
    public float rightEyeballScore;
    public final float roll;
    public final float score;
    public final float yaw;
    public final float[] keyPoints = new float[212];
    public final float[] visibilities = new float[106];

    static {
        kge.a(1432442420);
    }

    public void convertArrayForNative() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b700bc01", new Object[]{this});
            return;
        }
        Rect rect = this.rect;
        if (rect != null) {
            this.intArray = new int[5];
            this.intArray[0] = rect.left;
            this.intArray[1] = this.rect.top;
            this.intArray[2] = this.rect.right;
            this.intArray[3] = this.rect.bottom;
        }
        float[] fArr = this.keyPoints;
        if (fArr != null && this.visibilities != null) {
            this.floatArray = new float[NATIVE_FLOAT_OUT_LENGTH];
            System.arraycopy(fArr, 0, this.floatArray, 0, fArr.length);
            float[] fArr2 = this.visibilities;
            System.arraycopy(fArr2, 0, this.floatArray, this.keyPoints.length, fArr2.length);
            float[] fArr3 = this.floatArray;
            fArr3[318] = this.score;
            fArr3[319] = this.yaw;
            fArr3[320] = this.pitch;
            fArr3[321] = this.roll;
        }
        this.floatExtra = this.extraFacePoints;
        float[] fArr4 = this.eyeballContourPoints;
        if (fArr4 == null || this.eyeballCenterPoints == null) {
            return;
        }
        this.floatEyeballs = new float[82];
        System.arraycopy(fArr4, 0, this.floatEyeballs, 0, fArr4.length);
        float[] fArr5 = this.eyeballCenterPoints;
        System.arraycopy(fArr5, 0, this.floatEyeballs, this.eyeballContourPoints.length, fArr5.length);
        float[] fArr6 = this.floatEyeballs;
        fArr6[80] = this.leftEyeballScore;
        fArr6[81] = this.rightEyeballScore;
    }

    public FaceDetectionReport(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3, long j) {
        this.intArray = iArr;
        this.floatArray = fArr;
        this.floatExtra = fArr2;
        this.floatEyeballs = fArr3;
        this.rect = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
        this.faceID = iArr[4];
        for (int i = 0; i < 106; i++) {
            float[] fArr4 = this.keyPoints;
            int i2 = i * 2;
            fArr4[i2] = fArr[i2];
            int i3 = i2 + 1;
            fArr4[i3] = fArr[i3];
            this.visibilities[i] = fArr[i + 212];
        }
        this.score = fArr[318];
        this.yaw = fArr[319];
        this.pitch = fArr[320];
        this.roll = fArr[321];
        if (fArr2 != null && fArr2.length == 268) {
            this.extraFacePoints = new float[NATIVE_EXTRA_FLOAT_OUT_LENGTH];
            for (int i4 = 0; i4 < 134; i4++) {
                float[] fArr5 = this.extraFacePoints;
                int i5 = i4 * 2;
                fArr5[i5] = fArr2[i5];
                int i6 = i5 + 1;
                fArr5[i6] = fArr2[i6];
            }
        }
        if (fArr3 != null && fArr3.length == 82) {
            this.eyeballContourPoints = new float[76];
            this.eyeballCenterPoints = new float[4];
            for (int i7 = 0; i7 < 38; i7++) {
                float[] fArr6 = this.eyeballContourPoints;
                int i8 = i7 * 2;
                fArr6[i8] = fArr3[i8];
                int i9 = i8 + 1;
                fArr6[i9] = fArr3[i9];
            }
            for (int i10 = 0; i10 < 2; i10++) {
                float[] fArr7 = this.eyeballCenterPoints;
                int i11 = i10 * 2;
                int i12 = i11 + 76;
                fArr7[i11] = fArr3[i12];
                fArr7[i11 + 1] = fArr3[i12 + 1];
            }
            this.leftEyeballScore = fArr3[80];
            this.rightEyeballScore = fArr3[81];
        }
        this.faceAction = j;
        this.faceActionMap = new HashMap();
        if (this.faceAction != 0) {
            this.faceActionMap.put("EyeBlink", false);
            this.faceActionMap.put("MouthAh", false);
            this.faceActionMap.put("HeadYaw", false);
            this.faceActionMap.put("HeadPitch", false);
            this.faceActionMap.put("BrowJump", false);
            this.faceActionMap.put("Yawn", false);
            this.faceActionMap.put("EyeClose", false);
            this.faceActionMap.put("LipReading", false);
            if ((this.faceAction & 16) != 0) {
                this.faceActionMap.put("EyeBlink", true);
            }
            if ((this.faceAction & 32) != 0) {
                this.faceActionMap.put("MouthAh", true);
            }
            if ((this.faceAction & 64) != 0) {
                this.faceActionMap.put("HeadYaw", true);
            }
            if ((this.faceAction & 128) != 0) {
                this.faceActionMap.put("HeadPitch", true);
            }
            if ((this.faceAction & 256) != 0) {
                this.faceActionMap.put("BrowJump", true);
            }
            if ((this.faceAction & 512) != 0) {
                this.faceActionMap.put("Yawn", true);
            }
            if ((this.faceAction & 1024) != 0) {
                this.faceActionMap.put("EyeClose", true);
            }
            if ((this.faceAction & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) == 0) {
                return;
            }
            this.faceActionMap.put("LipReading", true);
        }
    }
}
