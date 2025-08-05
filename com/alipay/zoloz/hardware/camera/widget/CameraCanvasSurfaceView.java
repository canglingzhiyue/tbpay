package com.alipay.zoloz.hardware.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.alipay.android.phone.zoloz.camera.BuildConfig;
import com.alipay.zoloz.hardware.DeviceSetting;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.utils.DeviceSettingUtil;
import com.alipay.zoloz.hardware.camera.utils.DisplayUtil;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class CameraCanvasSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ICameraInterface mCameraInterface;
    public ICameraCallback mCameraCallback;
    public Context mContext;
    public float mPreviewRate;
    public SurfaceHolder mSurfaceHolder;

    public CameraCanvasSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context.getApplicationContext();
        this.mPreviewRate = DisplayUtil.getScreenRate(this.mContext);
        this.mSurfaceHolder = getHolder();
        this.mSurfaceHolder.setFormat(-2);
        this.mSurfaceHolder.setType(3);
        this.mSurfaceHolder.addCallback(this);
    }

    public void init(DeviceSetting[] deviceSettingArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99832d6c", new Object[]{this, deviceSettingArr});
            return;
        }
        DeviceSetting propertyDeviceSetting = DeviceSettingUtil.getPropertyDeviceSetting(deviceSettingArr);
        getCameraImpl(this.mContext);
        ICameraInterface iCameraInterface = mCameraInterface;
        if (iCameraInterface == null) {
            return;
        }
        iCameraInterface.initCamera(propertyDeviceSetting);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        Log.i("surfaceCreated...");
        ICameraInterface iCameraInterface = mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.startCamera();
        }
        ICameraCallback iCameraCallback = this.mCameraCallback;
        if (iCameraCallback == null) {
            return;
        }
        iCameraCallback.onSurfaceCreated();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        Log.i("surfaceChanged: format=" + i + ", width=" + i2 + ", height=" + i3);
        ICameraInterface iCameraInterface = mCameraInterface;
        if (iCameraInterface == null) {
            return;
        }
        iCameraInterface.startPreview(this.mSurfaceHolder, this.mPreviewRate, i2, i3);
        if (this.mCameraCallback == null) {
            return;
        }
        int cameraViewRotation = mCameraInterface.getCameraViewRotation();
        Log.i("surfaceChanged: angle=" + cameraViewRotation);
        if (cameraViewRotation == 90 || cameraViewRotation == 270) {
            i2 = mCameraInterface.getPreviewHeight();
            i3 = mCameraInterface.getPreviewWidth();
        } else if (cameraViewRotation == 0 || cameraViewRotation == 180) {
            i2 = mCameraInterface.getPreviewWidth();
            i3 = mCameraInterface.getPreviewHeight();
        }
        this.mCameraCallback.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        Log.i("surfaceDestroyed...");
        ICameraInterface iCameraInterface = mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.stopPreview();
            mCameraInterface.stopCamera();
        }
        ICameraCallback iCameraCallback = this.mCameraCallback;
        if (iCameraCallback == null) {
            return;
        }
        iCameraCallback.onSurfaceDestroyed();
    }

    public static synchronized ICameraInterface getCameraImpl(Context context) {
        ICameraInterface iCameraInterface;
        synchronized (CameraCanvasSurfaceView.class) {
            if (mCameraInterface == null) {
                try {
                    try {
                        try {
                            try {
                                mCameraInterface = (ICameraInterface) Class.forName("com.alipay.zoloz.hardware.camera.impl.AndroidOrigImpl").getMethod("getInstance", Context.class).invoke(null, context.getApplicationContext());
                            } catch (NoSuchMethodException e) {
                                Log.e(e);
                            }
                        } catch (ClassNotFoundException e2) {
                            Log.e(e2);
                        }
                    } catch (InvocationTargetException e3) {
                        Log.e(e3);
                    }
                } catch (IllegalAccessException e4) {
                    Log.e(e4);
                }
            }
            iCameraInterface = mCameraInterface;
        }
        return iCameraInterface;
    }

    public static String getCameraName() {
        try {
            Field field = BuildConfig.class.getField("CAMERA");
            field.setAccessible(true);
            return (String) field.get(BuildConfig.class);
        } catch (IllegalAccessException e) {
            Log.w(e);
            return "Android";
        } catch (NoSuchFieldException e2) {
            Log.w(e2);
            return "Android";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getCameraId() {
        /*
            r0 = 1
            java.lang.Class<com.alipay.android.phone.zoloz.camera.BuildConfig> r1 = com.alipay.android.phone.zoloz.camera.BuildConfig.class
            java.lang.String r2 = "BACKCAMERA"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.IllegalAccessException -> L1a java.lang.NoSuchFieldException -> L1f
            r1.setAccessible(r0)     // Catch: java.lang.IllegalAccessException -> L1a java.lang.NoSuchFieldException -> L1f
            java.lang.Class<com.alipay.android.phone.zoloz.camera.BuildConfig> r2 = com.alipay.android.phone.zoloz.camera.BuildConfig.class
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.IllegalAccessException -> L1a java.lang.NoSuchFieldException -> L1f
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.IllegalAccessException -> L1a java.lang.NoSuchFieldException -> L1f
            boolean r1 = r1.booleanValue()     // Catch: java.lang.IllegalAccessException -> L1a java.lang.NoSuchFieldException -> L1f
            r1 = r1 ^ r0
            goto L24
        L1a:
            r1 = move-exception
            com.alipay.zoloz.hardware.log.Log.w(r1)
            goto L23
        L1f:
            r1 = move-exception
            com.alipay.zoloz.hardware.log.Log.w(r1)
        L23:
            r1 = 1
        L24:
            if (r1 == 0) goto L27
            return r0
        L27:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.hardware.camera.widget.CameraCanvasSurfaceView.getCameraId():int");
    }

    public SurfaceHolder getSurfaceHolder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceHolder) ipChange.ipc$dispatch("ae0787cc", new Object[]{this}) : this.mSurfaceHolder;
    }

    public void setCameraCallback(ICameraCallback iCameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29fe22b6", new Object[]{this, iCameraCallback});
        } else {
            this.mCameraCallback = iCameraCallback;
        }
    }
}
