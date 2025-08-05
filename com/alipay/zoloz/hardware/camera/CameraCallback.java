package com.alipay.zoloz.hardware.camera;

import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class CameraCallback<Param, Data> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CAMERA_ASTRA_USB_DEVICE_DETACH = 401;
    public static final int CAMERA_COLOR_STREAM_ERROR = 300;
    public static final int CAMERA_COLOR_USB_DEVICE_DETACH = 400;
    public static final int CAMERA_DEPTH_STREAM_ERROR = 301;
    public static final int CAMERA_NO_DEVICE_ASTRA = 101;
    public static final int CAMERA_NO_DEVICE_COLOR = 100;
    public static final int CAMERA_OK = 0;
    public static final int CAMERA_OPEN_ASTRA_DEVICE_FAILED = 201;
    public static final int CAMERA_OPEN_COLOR_DEVICE_FAILED = 200;
    public static final int CAMERA_SLIR_STREAM_ERROR = 302;

    public abstract void a(int i);

    public abstract void a(int i, int i2, String str);

    public abstract void a(int i, Param param);

    public abstract void b(int i, Data data);

    public final void cameraConnected(int i, Param param) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf7654", new Object[]{this, new Integer(i), param});
            return;
        }
        try {
            a(i, param);
        } catch (Throwable th) {
            Log.w(th);
        }
    }

    public final void cameraFrame(int i, Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13439f0", new Object[]{this, new Integer(i), data});
            return;
        }
        try {
            b(i, data);
        } catch (Throwable th) {
            Log.w(th);
        }
    }

    public final void cameraError(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ffc214", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        try {
            a(i, i2, str);
        } catch (Throwable th) {
            Log.w(th);
        }
    }

    public final void cameraDisconnect(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd8ce5b", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            a(i);
        } catch (Throwable th) {
            Log.w(th);
        }
    }
}
