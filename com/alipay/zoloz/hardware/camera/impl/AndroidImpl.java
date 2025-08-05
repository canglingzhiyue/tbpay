package com.alipay.zoloz.hardware.camera.impl;

import android.content.Context;
import com.alipay.zoloz.hardware.camera.AbsCameraImpl;
import com.alipay.zoloz.hardware.camera.AndroidCamera;
import com.alipay.zoloz.hardware.camera.CameraParams;
import com.alipay.zoloz.hardware.camera.data.CameraData;
import com.alipay.zoloz.hardware.camera.utils.DisplayUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class AndroidImpl extends AbsCameraImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public CameraParams getCameraParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraParams) ipChange.ipc$dispatch("db963687", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public String getCameraSN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7152703", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public String getFirmwareVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ad6d0f2", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public Object getUVCCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2739913a", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public boolean setDrawCapturing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a32904f4", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void setScanCodeMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebb4d56", new Object[]{this});
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void setScanFaceMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0505c6", new Object[]{this});
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.CameraCallback
    public /* synthetic */ void b(int i, CameraData cameraData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), cameraData});
        } else {
            a(i, cameraData);
        }
    }

    public AndroidImpl(Context context) {
        super(context);
        this.c = new AndroidCamera(this.f6214a.getLooper(), this.m, this);
        ((AndroidCamera) this.c).setScreenRation(DisplayUtil.getScreenRate(context));
    }

    public AndroidCamera getAndroidCamera() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidCamera) ipChange.ipc$dispatch("96398ad3", new Object[]{this}) : (AndroidCamera) this.c;
    }

    public void a(int i, CameraData cameraData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864b55bd", new Object[]{this, new Integer(i), cameraData});
        } else if (i != 1) {
        } else {
            a(cameraData.data);
            a(cameraData.data, (ByteBuffer) null, (ByteBuffer) null);
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getCameraViewRotation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1da0f878", new Object[]{this})).intValue() : this.c.getCameraParam().rotate;
    }
}
