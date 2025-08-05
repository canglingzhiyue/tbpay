package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class TGSensorFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float[] accelerateData;
    public float[] gyroData;
    public float[] rotationData;
    public long timeStamp;

    public TGSensorFrame(float[] fArr, float[] fArr2, float[] fArr3, long j) {
        this.gyroData = fArr;
        this.accelerateData = fArr2;
        this.rotationData = fArr3;
        this.timeStamp = j;
    }

    public TGSensorFrame(TGSensorFrame tGSensorFrame) {
        if (tGSensorFrame != null) {
            this.gyroData = tGSensorFrame.gyroData;
            this.accelerateData = tGSensorFrame.gyroData;
            this.rotationData = tGSensorFrame.rotationData;
            this.timeStamp = tGSensorFrame.timeStamp;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TGSensorFrame{gyroData=" + Arrays.toString(this.gyroData) + ", accelerateData=" + Arrays.toString(this.accelerateData) + ", rotationData=" + Arrays.toString(this.rotationData) + ", timeStamp=" + this.timeStamp + '}';
    }
}
