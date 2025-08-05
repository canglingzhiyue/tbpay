package com.alipay.zoloz.hardware.camera.data;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CameraDatas {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ColorCameraData colorData;
    public CameraData depthData;
    public CameraData slirData;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CameraDatas{colorData=" + this.colorData + ", depthData=" + this.depthData + ", slirData=" + this.slirData + '}';
    }
}
