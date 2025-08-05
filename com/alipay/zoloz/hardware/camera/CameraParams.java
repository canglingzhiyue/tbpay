package com.alipay.zoloz.hardware.camera;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class CameraParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float[] color_intrin;
    public float[] depth_intrin;
    public float[] extrin;
    public boolean isAligned = true;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CameraParams{color_intrin=" + Arrays.toString(this.color_intrin) + ", depth_intrin=" + Arrays.toString(this.depth_intrin) + ", extrin=" + Arrays.toString(this.extrin) + ", isAligned=" + this.isAligned + '}';
    }
}
