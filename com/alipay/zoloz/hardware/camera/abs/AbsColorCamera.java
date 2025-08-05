package com.alipay.zoloz.hardware.camera.abs;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import com.alipay.zoloz.hardware.camera.CameraCallback;
import com.alipay.zoloz.hardware.camera.data.ColorCameraData;
import com.alipay.zoloz.hardware.camera.fps.FpsCallback;
import com.alipay.zoloz.hardware.camera.param.ColorCameraParam;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class AbsColorCamera extends AbsCamera<ColorCameraParam, ColorCameraData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SCAN_CODE = 1;
    public static final int SCAN_FACE = 0;
    public static final int SCAN_NONE = -1;
    public int e;

    public static /* synthetic */ Object ipc$super(AbsColorCamera absColorCamera, String str, Object... objArr) {
        if (str.hashCode() == 542271365) {
            super.addOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public String b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)}) : i != 0 ? i != 1 ? "SCAN_NONE" : "SCAN_CODE" : "SCAN_FACE";
    }

    public abstract void setScanMode(int i);

    public AbsColorCamera(Looper looper, FpsCallback fpsCallback) {
        super(looper, "color", fpsCallback);
        this.e = 0;
        this.d = new ColorCameraParam(640, 480, 0, 90, false);
    }

    public int getScanMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e4424b0", new Object[]{this})).intValue() : this.e;
    }

    @Override // com.alipay.zoloz.hardware.camera.abs.AbsCamera
    public void addOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20526785", new Object[]{this, onFrameAvailableListener});
        } else if (this.e == 0) {
            super.addOnFrameAvailableListener(onFrameAvailableListener);
        } else {
            Log.w(AbsCamera.TAG, getClass().getSimpleName() + ".addOnFrameAvailableListener() listener=" + onFrameAvailableListener + " ignore, because mScanMode=" + b(this.e));
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.abs.AbsCamera
    public final void a(int i, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e23096", new Object[]{this, new Integer(i), byteBuffer});
            return;
        }
        Log.d(AbsCamera.TAG, "onFrame called for AbsColorCamera" + System.identityHashCode(this));
        synchronized (this.f6231a) {
            if (!this.f6231a.isEmpty()) {
                ColorCameraData colorCameraData = new ColorCameraData();
                colorCameraData.data = byteBuffer;
                colorCameraData.timestamp = System.currentTimeMillis();
                colorCameraData.scanMode = this.e;
                Iterator it = this.f6231a.iterator();
                while (it.hasNext()) {
                    CameraCallback cameraCallback = (CameraCallback) it.next();
                    Log.d(AbsCamera.TAG, "onFrame called for callback " + cameraCallback + "@" + System.identityHashCode(cameraCallback));
                    cameraCallback.cameraFrame(i, colorCameraData);
                }
            }
        }
    }
}
