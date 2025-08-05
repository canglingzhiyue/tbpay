package com.alipay.zoloz.hardware.camera.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ColorCameraData extends CameraData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int scanMode = 1;

    public static /* synthetic */ Object ipc$super(ColorCameraData colorCameraData, String str, Object... objArr) {
        if (str.hashCode() == -2128160755) {
            return super.toString();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.zoloz.hardware.camera.data.CameraData
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ColorCameraData{" + super.toString() + ", scanMode=" + this.scanMode + '}';
    }
}
