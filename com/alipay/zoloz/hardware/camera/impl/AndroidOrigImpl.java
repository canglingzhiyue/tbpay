package com.alipay.zoloz.hardware.camera.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.alipay.zoloz.hardware.DeviceSetting;
import com.alipay.zoloz.hardware.camera.CameraData;
import com.alipay.zoloz.hardware.camera.CameraParams;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.IGLSurfaceViewListener;
import com.alipay.zoloz.hardware.camera.utils.AndroidCameraUtil;
import com.alipay.zoloz.hardware.camera.utils.DisplayUtil;
import com.alipay.zoloz.hardware.camera.utils.RecordUtil;
import com.alipay.zoloz.hardware.log.Log;
import com.alipay.zoloz.hardware.utils.EnvCheck;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AndroidOrigImpl implements ICameraInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AndroidOrigImpl f6235a;
    private Context b;
    private Camera c;
    private Camera.Parameters d;
    private int h;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private SparseArray<ICameraCallback> e = new SparseArray<>();
    private int f = 90;
    private int g = 90;
    private DeviceSetting i = new DeviceSetting();
    private final Object j = new Object();
    private final Object k = new Object();
    private int l = 0;
    private int m = 0;
    private int n = 0;
    private int o = 0;
    private final int t = 20;
    private final int u = 5;
    private final int v = 1;
    private int w = 0;
    private int x = 0;

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public boolean beautifyAvatar(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0206a13", new Object[]{this, bitmap})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public PointF colorToDepth(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("8494bbd2", new Object[]{this, pointF});
        }
        return null;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public PointF depthToColor(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("69d74692", new Object[]{this, pointF});
        }
        return null;
    }

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
    public int getColorMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1b6716a", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getDepthHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce74b0e", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getDepthWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca68ecb3", new Object[]{this})).intValue();
        }
        return 0;
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
    public Rect getROI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("7535dda6", new Object[]{this});
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
    public boolean isMirror() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e953f594", new Object[]{this})).booleanValue();
        }
        return false;
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
    public void setFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1c2087", new Object[]{this, onFrameAvailableListener});
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void setGLSurfaceViewListener(IGLSurfaceViewListener iGLSurfaceViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4df939c", new Object[]{this, iGLSurfaceViewListener});
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void setRenderLayers(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288f49e4", new Object[]{this, map});
        }
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

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void startColorCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9178fc2d", new Object[]{this});
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void startDepthCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283fdf8d", new Object[]{this});
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void stopColorCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4aa048d", new Object[]{this});
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void stopDepthCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b70e7ed", new Object[]{this});
        }
    }

    public static /* synthetic */ DeviceSetting a(AndroidOrigImpl androidOrigImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeviceSetting) ipChange.ipc$dispatch("94eb748b", new Object[]{androidOrigImpl}) : androidOrigImpl.i;
    }

    public static /* synthetic */ void a(AndroidOrigImpl androidOrigImpl, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ee78d8", new Object[]{androidOrigImpl, bArr});
        } else {
            androidOrigImpl.a(bArr);
        }
    }

    public static /* synthetic */ int b(AndroidOrigImpl androidOrigImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a7f9fa3", new Object[]{androidOrigImpl})).intValue();
        }
        int i = androidOrigImpl.x;
        androidOrigImpl.x = i + 1;
        return i;
    }

    public static /* synthetic */ int c(AndroidOrigImpl androidOrigImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30836b02", new Object[]{androidOrigImpl})).intValue() : androidOrigImpl.x;
    }

    public static /* synthetic */ int d(AndroidOrigImpl androidOrigImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("36873661", new Object[]{androidOrigImpl})).intValue() : androidOrigImpl.w;
    }

    public static /* synthetic */ int e(AndroidOrigImpl androidOrigImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c8b01c0", new Object[]{androidOrigImpl})).intValue();
        }
        int i = androidOrigImpl.w;
        androidOrigImpl.w = i + 1;
        return i;
    }

    public static /* synthetic */ Object f(AndroidOrigImpl androidOrigImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5ccec786", new Object[]{androidOrigImpl}) : androidOrigImpl.k;
    }

    public static /* synthetic */ SparseArray g(AndroidOrigImpl androidOrigImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("782b274e", new Object[]{androidOrigImpl}) : androidOrigImpl.e;
    }

    private AndroidOrigImpl(Context context) {
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        this.b = context;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
    }

    public static synchronized AndroidOrigImpl getInstance(Context context) {
        synchronized (AndroidOrigImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AndroidOrigImpl) ipChange.ipc$dispatch("37255edf", new Object[]{context});
            }
            if (f6235a == null) {
                f6235a = new AndroidOrigImpl(context);
            }
            f6235a.a(context);
            return f6235a;
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void initCamera(DeviceSetting deviceSetting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841340ae", new Object[]{this, deviceSetting});
            return;
        }
        if (deviceSetting != null) {
            this.i = deviceSetting;
        }
        if (this.p) {
            return;
        }
        this.p = true;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void releaseCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c11493", new Object[]{this});
        } else if (!this.p) {
        } else {
            this.p = false;
            this.b = null;
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void openCamera(DeviceSetting deviceSetting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6845d934", new Object[]{this, deviceSetting});
        } else if (this.q) {
        } else {
            if (deviceSetting != null) {
                this.i = deviceSetting;
            }
            this.q = true;
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void closeCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a613d144", new Object[]{this});
        } else if (!this.q) {
        } else {
            this.q = false;
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void startCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9433b2e", new Object[]{this});
        } else if (this.r) {
        } else {
            int findFacingCamera = AndroidCameraUtil.findFacingCamera();
            Log.d("open cameraID=" + findFacingCamera);
            DeviceSetting deviceSetting = this.i;
            if (deviceSetting != null && !deviceSetting.isCameraAuto()) {
                findFacingCamera = this.i.getCameraID();
            }
            if (a(findFacingCamera)) {
                this.r = true;
            }
            DeviceSetting deviceSetting2 = this.i;
            if (deviceSetting2 == null) {
                return;
            }
            EnvCheck.check(deviceSetting2.checkHook());
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void stopCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e676ce", new Object[]{this});
        } else if (!this.r) {
        } else {
            stopPreview();
            if (this.c == null) {
                return;
            }
            synchronized (this.j) {
                try {
                    this.c.release();
                    this.c = null;
                    this.r = false;
                } catch (Exception e) {
                    Log.e(e);
                }
            }
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void startPreview(SurfaceHolder surfaceHolder, float f, int i, int i2) {
        Camera camera;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4b2a73", new Object[]{this, surfaceHolder, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        Log.d("startPreview...");
        if (this.s || (camera = this.c) == null) {
            return;
        }
        try {
            this.x = 0;
            this.w = 0;
            camera.setPreviewDisplay(surfaceHolder);
            this.c.startPreview();
            this.s = true;
        } catch (Exception e) {
            Log.e(e);
            d(101);
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
        } else if (!this.s || this.c == null) {
        } else {
            synchronized (this.j) {
                try {
                    this.c.setOneShotPreviewCallback(null);
                    this.c.setPreviewCallback(null);
                    this.c.stopPreview();
                } catch (Exception e) {
                    Log.e(e);
                }
            }
            this.s = false;
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void addCallback(ICameraCallback iCameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ee07b0", new Object[]{this, iCameraCallback});
        } else if (iCameraCallback == null) {
        } else {
            synchronized (this.k) {
                this.e.put(iCameraCallback.hashCode(), iCameraCallback);
            }
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void removeCallback(ICameraCallback iCameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c558c53", new Object[]{this, iCameraCallback});
        } else if (iCameraCallback == null) {
        } else {
            synchronized (this.k) {
                this.e.remove(iCameraCallback.hashCode());
            }
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getCameraViewRotation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1da0f878", new Object[]{this})).intValue() : this.g;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getColorWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd49bc13", new Object[]{this})).intValue() : this.l;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getColorHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a62067ae", new Object[]{this})).intValue() : this.m;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getPreviewWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50ccc3ce", new Object[]{this})).intValue() : this.n;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getPreviewHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("82fe5753", new Object[]{this})).intValue() : this.o;
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.b = context;
        }
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Log.i("realStartCamera: cameraId=" + i);
        try {
            this.c = Camera.open(i);
        } catch (Exception e) {
            Log.w(e);
            d(101);
        } catch (Throwable unused) {
            d(101);
        }
        if (this.c == null) {
            d(101);
            return false;
        }
        this.h = i;
        if (this.c != null) {
            this.d = this.c.getParameters();
            a();
            this.c.setParameters(this.d);
            this.c.setPreviewCallback(new Camera.PreviewCallback() { // from class: com.alipay.zoloz.hardware.camera.impl.AndroidOrigImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.hardware.Camera.PreviewCallback
                public void onPreviewFrame(byte[] bArr, Camera camera) {
                    IpChange ipChange2 = $ipChange;
                    int i2 = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("83a13143", new Object[]{this, bArr, camera});
                    } else if (bArr == null) {
                        Log.i("onPreviewFrame...data is null and ignore");
                    } else {
                        if (AndroidOrigImpl.a(AndroidOrigImpl.this) != null && AndroidOrigImpl.a(AndroidOrigImpl.this).checkHook()) {
                            AndroidOrigImpl.b(AndroidOrigImpl.this);
                            if (AndroidOrigImpl.c(AndroidOrigImpl.this) >= 5 && AndroidOrigImpl.d(AndroidOrigImpl.this) <= 0 && (AndroidOrigImpl.c(AndroidOrigImpl.this) - 5) % 20 == 0) {
                                String stackTraceString = android.util.Log.getStackTraceString(new Exception());
                                if (stackTraceString != null && (stackTraceString.contains("xposed") || stackTraceString.contains("Xposed"))) {
                                    i2 = 1;
                                }
                                RecordUtil recordUtil = RecordUtil.getInstance();
                                HashMap hashMap = new HashMap();
                                hashMap.put("result", i2 + "");
                                if (AndroidOrigImpl.a(AndroidOrigImpl.this).checkHook() || i2 == 1) {
                                    hashMap.put("content", stackTraceString);
                                }
                                recordUtil.write(RecordUtil.CHECK_STACKS, hashMap);
                                AndroidOrigImpl.e(AndroidOrigImpl.this);
                            }
                        }
                        AndroidOrigImpl.a(AndroidOrigImpl.this, bArr);
                    }
                }
            });
            return true;
        }
        return false;
    }

    private int a(DeviceSetting deviceSetting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bd4ec15", new Object[]{this, deviceSetting})).intValue();
        }
        if (deviceSetting == null) {
            throw new IllegalArgumentException("deviceSetting can't be null");
        }
        if (deviceSetting.isDisplayAuto()) {
            return b(this.h);
        }
        return deviceSetting.getDisplayAngle();
    }

    private int b(DeviceSetting deviceSetting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("354c79b4", new Object[]{this, deviceSetting})).intValue();
        }
        if (deviceSetting == null) {
            throw new IllegalArgumentException("deviceSetting can't be null");
        }
        if (deviceSetting.isAlgorithmAuto()) {
            return c(this.h);
        }
        return deviceSetting.getAlgorithmAngle();
    }

    private void a() {
        Camera.Size propPreviewSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d == null) {
        } else {
            DeviceSetting deviceSetting = this.i;
            if (deviceSetting != null && !deviceSetting.isWidthAuto()) {
                propPreviewSize = AndroidCameraUtil.getInstance().getPropPreviewSizeWithServerConfig(this.c.getParameters().getSupportedPreviewSizes(), this.i.getCameraRatio(), this.i.getWidth());
            } else {
                propPreviewSize = AndroidCameraUtil.getInstance().getPropPreviewSize(this.c.getParameters().getSupportedPreviewSizes(), DisplayUtil.getScreenRate(this.b), 600);
            }
            if (propPreviewSize != null) {
                this.n = propPreviewSize.width;
                this.o = propPreviewSize.height;
                int i = this.n;
                this.l = i;
                int i2 = this.o;
                this.m = i2;
                this.d.setPreviewSize(i, i2);
            }
            DeviceSetting deviceSetting2 = this.i;
            if (deviceSetting2 != null) {
                this.f = a(deviceSetting2);
                Log.d("AndroidOrigImpl", "mCameraViewRotationAngle=" + this.f);
                this.c.setDisplayOrientation(this.f);
                this.g = b(this.i);
                Log.d("AndroidOrigImpl", "mAlgorithmRotationAngle=" + this.g);
            }
            List<String> supportedFocusModes = this.d.getSupportedFocusModes();
            if (supportedFocusModes == null) {
                return;
            }
            if (supportedFocusModes.contains("continuous-video")) {
                this.d.setFocusMode("continuous-video");
            } else {
                supportedFocusModes.contains("auto");
            }
        }
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) this.b.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i2) + 360) % 360;
    }

    private int c(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) this.b.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i2) + 360) % 360;
    }

    private void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            return;
        }
        synchronized (this.k) {
            if (this.r && this.e != null && this.e.size() > 0) {
                for (int i = 0; i < this.e.size(); i++) {
                    ICameraCallback valueAt = this.e.valueAt(i);
                    if (valueAt != null) {
                        valueAt.onPreviewFrame(new CameraData(ByteBuffer.wrap(bArr), this.l, this.m, 0, null, 0, 0, this.n, this.o));
                    }
                }
            }
        }
    }

    private void d(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.zoloz.hardware.camera.impl.AndroidOrigImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (AndroidOrigImpl.f(AndroidOrigImpl.this)) {
                        if (AndroidOrigImpl.g(AndroidOrigImpl.this) != null && AndroidOrigImpl.g(AndroidOrigImpl.this).size() > 0) {
                            for (int i2 = 0; i2 < AndroidOrigImpl.g(AndroidOrigImpl.this).size(); i2++) {
                                ICameraCallback iCameraCallback = (ICameraCallback) AndroidOrigImpl.g(AndroidOrigImpl.this).valueAt(i2);
                                if (iCameraCallback != null) {
                                    iCameraCallback.onError(i);
                                }
                            }
                        }
                    }
                }
            }).start();
        }
    }
}
