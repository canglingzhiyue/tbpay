package com.alipay.zoloz.hardware.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.android.phone.zoloz.camera.BuildConfig;
import com.alipay.zoloz.hardware.DeviceSetting;
import com.alipay.zoloz.hardware.camera.abs.AbsCamera;
import com.alipay.zoloz.hardware.camera.abs.AbsColorCamera;
import com.alipay.zoloz.hardware.camera.fps.FpsCallback;
import com.alipay.zoloz.hardware.camera.fps.FpsMonitor;
import com.alipay.zoloz.hardware.camera.fps.FpsTask;
import com.alipay.zoloz.hardware.camera.param.ColorCameraParam;
import com.alipay.zoloz.hardware.camera.utils.AndroidCameraUtil;
import com.alipay.zoloz.hardware.camera.utils.RecordUtil;
import com.alipay.zoloz.hardware.log.Log;
import com.alipay.zoloz.hardware.utils.EnvCheck;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.HashMap;
import tb.riy;

/* loaded from: classes3.dex */
public class AndroidCamera extends AbsColorCamera implements Camera.ErrorCallback, Camera.PreviewCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FACE_DETECTION_OFF = "off";
    public static final String FACE_DETECTION_ON = "on";
    public static final int HEIGHT_S1_CODE = 1080;
    public static final int HEIGHT_S1_FACE = 640;
    public static final String TAG = "AndroidCamera";
    public static final int WIDTH_S1_CODE = 1920;
    public static final int WIDTH_S1_FACE = 480;
    private static ByteBuffer i;
    private static byte[] j;
    private static ByteBuffer k;
    private static byte[] l;
    private Camera f;
    private AbsCameraImpl g;
    private AbsCamera.PreviewTexture h;
    private float m;
    private DeviceSetting n;
    private final int o;
    private final int p;
    private final int q;
    private int r;
    private int s;

    private int c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i2)})).intValue();
        }
        return 17;
    }

    public static /* synthetic */ Object ipc$super(AndroidCamera androidCamera, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2130491415) {
            super.start();
            return null;
        } else if (hashCode != 1713617801) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.stop();
            return null;
        }
    }

    public static /* synthetic */ Camera a(AndroidCamera androidCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Camera) ipChange.ipc$dispatch("15b2688f", new Object[]{androidCamera}) : androidCamera.f;
    }

    public static /* synthetic */ FpsTask b(AndroidCamera androidCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FpsTask) ipChange.ipc$dispatch("6c9a2bd9", new Object[]{androidCamera}) : androidCamera.c;
    }

    public static /* synthetic */ FpsTask c(AndroidCamera androidCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FpsTask) ipChange.ipc$dispatch("33c977f8", new Object[]{androidCamera}) : androidCamera.c;
    }

    public AndroidCamera(Looper looper, FpsCallback fpsCallback, AbsCameraImpl absCameraImpl) {
        super(looper, fpsCallback);
        this.h = null;
        this.m = 1.0f;
        this.n = null;
        this.o = 20;
        this.p = 5;
        this.q = 1;
        this.r = 0;
        this.s = 0;
        this.g = absCameraImpl;
    }

    @Override // com.alipay.zoloz.hardware.camera.abs.AbsCamera
    public AbsCamera.PreviewTexture getPreview() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsCamera.PreviewTexture) ipChange.ipc$dispatch("5fc92246", new Object[]{this}) : this.h;
    }

    @Override // com.alipay.zoloz.hardware.camera.abs.AbsCamera
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        AbsCameraImpl absCameraImpl = this.g;
        this.n = absCameraImpl == null ? null : absCameraImpl.getDeviceSetting();
        super.start();
    }

    @Override // com.alipay.zoloz.hardware.camera.abs.AbsCamera
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            super.stop();
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.abs.AbsCamera
    public synchronized void doStart() {
        Camera.Size propPreviewSize;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3479e", new Object[]{this});
        } else if (this.f == null) {
            RecordUtil.getInstance().write(RecordUtil.CAMERA_LAUNCH_START);
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = (this.n == null || this.n.getCameraID() != 0) ? 1 : 0;
            Log.d(TAG, "open cameraId: " + i2);
            this.f = Camera.open(i2);
            if (this.f == null) {
                throw new RuntimeException("camera is null");
            }
            this.f.setErrorCallback(this);
            Camera.Parameters parameters = this.f.getParameters();
            AndroidCameraUtil.dumpCameraParameters(parameters);
            parameters.setPreviewFormat(c(((ColorCameraParam) this.d).format));
            parameters.setRotation(((ColorCameraParam) this.d).rotate);
            if (TextUtils.equals("Android", BuildConfig.CAMERA_ASTRA_S1)) {
                if (this.e == 0) {
                    ((ColorCameraParam) this.d).width = 480;
                    ((ColorCameraParam) this.d).height = 640;
                    parameters.setPreviewSize(((ColorCameraParam) this.d).height, ((ColorCameraParam) this.d).width);
                    Log.i("SetMode KEY_SCAN_FACE");
                    parameters.setSceneMode("SCAN_FACE");
                    parameters.set("face-detection", "on");
                    if (i == null) {
                        int length = length(((ColorCameraParam) this.d).width, ((ColorCameraParam) this.d).height, ((ColorCameraParam) this.d).format);
                        i = ByteBuffer.allocateDirect(length);
                        j = new byte[length];
                    }
                    this.f.addCallbackBuffer(j);
                } else {
                    ((ColorCameraParam) this.d).width = 1920;
                    ((ColorCameraParam) this.d).height = 1080;
                    parameters.setPreviewSize(((ColorCameraParam) this.d).width, ((ColorCameraParam) this.d).height);
                    Log.i("SetMode KEY_SCAN_CODE");
                    parameters.setSceneMode("SCAN_CODE");
                    parameters.set("face-detection", "off");
                    if (k == null) {
                        int length2 = length(((ColorCameraParam) this.d).width, ((ColorCameraParam) this.d).height, ((ColorCameraParam) this.d).format);
                        k = ByteBuffer.allocateDirect(length2);
                        l = new byte[length2];
                    }
                    this.f.addCallbackBuffer(l);
                }
            } else {
                if (this.n != null && !this.n.isWidthAuto()) {
                    propPreviewSize = AndroidCameraUtil.getInstance().getPropPreviewSizeWithServerConfig(this.f.getParameters().getSupportedPreviewSizes(), this.n.getCameraRatio(), this.n.getWidth());
                } else {
                    propPreviewSize = AndroidCameraUtil.getInstance().getPropPreviewSize(this.f.getParameters().getSupportedPreviewSizes(), this.m, 600);
                }
                ((ColorCameraParam) this.d).width = propPreviewSize.width;
                ((ColorCameraParam) this.d).height = propPreviewSize.height;
                parameters.setPreviewSize(((ColorCameraParam) this.d).width, ((ColorCameraParam) this.d).height);
                int length3 = length(((ColorCameraParam) this.d).width, ((ColorCameraParam) this.d).height, ((ColorCameraParam) this.d).format);
                if (i == null || j == null || j.length != length3) {
                    i = ByteBuffer.allocateDirect(length3);
                    j = new byte[length3];
                }
                this.f.addCallbackBuffer(j);
            }
            this.f.setParameters(parameters);
            this.f.setPreviewCallbackWithBuffer(this);
            if (this.n != null) {
                EnvCheck.check(this.n.checkHook());
            }
            int a2 = a();
            this.h = new AbsCamera.PreviewTexture(a2, new SurfaceTexture(a2));
            this.h.surfaceTexture.setOnFrameAvailableListener(this);
            this.f.setPreviewTexture(this.h.surfaceTexture);
            this.s = 0;
            this.r = 0;
            this.f.startPreview();
            if (b()) {
                this.f.startFaceDetection();
            }
            Log.i(TAG, "mCamera.startPreview(): scanMode=" + b(this.e) + ", previewSize=[" + ((ColorCameraParam) this.d).width + " x " + ((ColorCameraParam) this.d).height + "], rotate=" + ((ColorCameraParam) this.d).rotate);
            FpsMonitor.getInstance().startFpsMonitor(this.c);
            FpsTask fpsTask = this.c;
            if (this.e == 0) {
                z = true;
            }
            fpsTask.setRender(z);
            Log.d(TAG, getClass().getSimpleName() + ".doStart() cost " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
            HashMap hashMap = new HashMap();
            hashMap.put("elapsedTime", "" + (System.currentTimeMillis() - currentTimeMillis));
            RecordUtil.getInstance().write(RecordUtil.CAMERA_LAUNCH_END, hashMap);
        } else {
            Log.v(TAG, getClass().getSimpleName() + ".doStart() null != mCamera");
        }
    }

    private boolean b() {
        Camera camera;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        DeviceSetting deviceSetting = this.n;
        return (deviceSetting == null || !deviceSetting.useAutoFaceFocus() || (camera = this.f) == null || camera.getParameters() == null || this.f.getParameters().getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    @Override // com.alipay.zoloz.hardware.camera.abs.AbsColorCamera
    public void setScanMode(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd174c5a", new Object[]{this, new Integer(i2)});
            return;
        }
        Log.i("SetMode scanMode:" + i2);
        if (!TextUtils.equals("Android", BuildConfig.CAMERA_ASTRA_S1)) {
            return;
        }
        String b = b(i2);
        if (this.f == null) {
            this.e = i2;
            Log.w(TAG, getClass().getSimpleName() + ".setScanMode(" + b + ") : null == mCamera : mScanMode=" + this.e);
        } else if (this.e == i2) {
            Log.d(TAG, getClass().getSimpleName() + ".setScanMode(" + b + ") ignore : mScanMode==scanMode==" + b);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            Log.d(TAG, getClass().getSimpleName() + ".setScanMode(" + b + ") begin.");
            doStop();
            this.e = i2;
            doStart();
            Log.d(TAG, getClass().getSimpleName() + ".setScanMode(" + b + ") end. total cost " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.abs.AbsCamera
    public synchronized void doStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205a7134", new Object[]{this});
        } else if (this.f == null) {
            Log.e(TAG, getClass().getSimpleName() + ".doStop() null == mCamera");
        } else {
            synchronized (this.f6231a) {
                if (!this.f6231a.isEmpty()) {
                    Log.d(TAG, getClass().getSimpleName() + ".doStop() begin: mCallbacks.clear()");
                    this.f6231a.clear();
                }
            }
            synchronized (this.b) {
                if (!this.b.isEmpty()) {
                    Log.d(TAG, getClass().getSimpleName() + ".doStop() begin: mListeners.clear()");
                    this.b.clear();
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.c.setRender(false);
            FpsMonitor.getInstance().stopFpsMonitor(this.c);
            Log.d(TAG, "mCamera.stopPreview()");
            if (b()) {
                this.f.stopFaceDetection();
            }
            this.f.stopPreview();
            this.f.setPreviewCallbackWithBuffer(null);
            this.f.release();
            this.f = null;
            Log.d(TAG, getClass().getSimpleName() + ".doStop() => mCamera.release()");
            if (this.h != null) {
                if (this.h.surfaceTexture != null) {
                    this.h.surfaceTexture.release();
                    this.h.surfaceTexture = null;
                }
                a(this.h.textureId);
                this.h = null;
            }
            Log.d(TAG, getClass().getSimpleName() + ".doStop() cost " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public synchronized void onPreviewFrame(byte[] bArr, Camera camera) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a13143", new Object[]{this, bArr, camera});
        } else if (bArr == null) {
            Log.w(TAG, "invalid camera data : null == data");
        } else {
            int length = length(((ColorCameraParam) this.d).width, ((ColorCameraParam) this.d).height, ((ColorCameraParam) this.d).format);
            if (bArr.length != length) {
                Log.e(TAG, "invalid camera data : data.length[" + bArr.length + "] != length[" + length + riy.ARRAY_END_STR);
                return;
            }
            this.c.update();
            if (this.n != null && this.n.checkHook()) {
                this.s++;
                if (this.s >= 5 && this.r <= 0 && (this.s - 5) % 20 == 0) {
                    String stackTraceString = android.util.Log.getStackTraceString(new Exception());
                    if (stackTraceString != null && (stackTraceString.contains("xposed") || stackTraceString.contains("Xposed"))) {
                        i2 = 1;
                    }
                    RecordUtil recordUtil = RecordUtil.getInstance();
                    HashMap hashMap = new HashMap();
                    hashMap.put("result", i2 + "");
                    if (this.n.checkHook() || i2 == 1) {
                        hashMap.put("content", stackTraceString);
                    }
                    recordUtil.write(RecordUtil.CHECK_STACKS, hashMap);
                    this.r++;
                }
            }
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.e == 0) {
                i.clear();
                i.put(bArr);
                i.flip();
                a(1, i);
                camera.addCallbackBuffer(j);
                return;
            }
            k.clear();
            k.put(bArr);
            k.flip();
            a(1, k);
            camera.addCallbackBuffer(l);
        }
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i2, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8843b162", new Object[]{this, new Integer(i2), camera});
            return;
        }
        Log.d(TAG, getClass().getSimpleName() + ".onError() : error=" + i2);
        a(1, 201, i2 != 2 ? i2 != 100 ? "Camera.CAMERA_ERROR_UNKNOWN" : "Camera.CAMERA_ERROR_SERVER_DIED" : "Camera.CAMERA_ERROR_EVICTED");
    }

    public void setScreenRation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e855a3e8", new Object[]{this, new Float(f)});
        } else {
            this.m = f;
        }
    }

    public Camera getCamera() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Camera) ipChange.ipc$dispatch("36b96927", new Object[]{this}) : this.f;
    }

    public void lockCameraWhiteBalanceAndExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d1c442", new Object[]{this});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.alipay.zoloz.hardware.camera.AndroidCamera.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Camera.Parameters parameters = AndroidCamera.a(AndroidCamera.this).getParameters();
                    parameters.setAutoExposureLock(true);
                    parameters.setAutoWhiteBalanceLock(true);
                    AndroidCamera.a(AndroidCamera.this).setParameters(parameters);
                } catch (Throwable unused) {
                }
            }
        };
        if (this.f == null && !willStart()) {
            return;
        }
        postTask(runnable);
    }

    public void unlockCameraWhiteBalanceAndExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c21149", new Object[]{this});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.alipay.zoloz.hardware.camera.AndroidCamera.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Camera.Parameters parameters = AndroidCamera.a(AndroidCamera.this).getParameters();
                    parameters.setAutoExposureLock(false);
                    parameters.setAutoWhiteBalanceLock(false);
                    AndroidCamera.a(AndroidCamera.this).setParameters(parameters);
                } catch (Throwable unused) {
                }
            }
        };
        if (this.f == null && !willStart()) {
            return;
        }
        postTask(runnable);
    }

    public void startPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.alipay.zoloz.hardware.camera.AndroidCamera.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AndroidCamera.a(AndroidCamera.this).startPreview();
                } catch (Throwable unused) {
                }
            }
        };
        if (this.f == null && !willStart()) {
            return;
        }
        postTask(runnable);
    }

    public void stopFpsCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3117c8", new Object[]{this});
        } else {
            postTask(new Runnable() { // from class: com.alipay.zoloz.hardware.camera.AndroidCamera.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FpsMonitor.getInstance().stopFpsMonitor(AndroidCamera.b(AndroidCamera.this));
                    }
                }
            });
        }
    }

    public void startFpsCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b16e4428", new Object[]{this});
        } else {
            postTask(new Runnable() { // from class: com.alipay.zoloz.hardware.camera.AndroidCamera.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FpsMonitor.getInstance().startFpsMonitor(AndroidCamera.c(AndroidCamera.this));
                    }
                }
            });
        }
    }
}
