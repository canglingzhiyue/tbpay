package com.alipay.zoloz.hardware.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import com.alipay.android.phone.zoloz.camera.BuildConfig;
import com.alipay.zoloz.hardware.DeviceSetting;
import com.alipay.zoloz.hardware.camera.abs.AbsCamera;
import com.alipay.zoloz.hardware.camera.abs.AbsColorCamera;
import com.alipay.zoloz.hardware.camera.abs.AbsDepthCamera;
import com.alipay.zoloz.hardware.camera.abs.AbsSlirCamera;
import com.alipay.zoloz.hardware.camera.data.ColorCameraData;
import com.alipay.zoloz.hardware.camera.fps.FpsCallback;
import com.alipay.zoloz.hardware.camera.fps.FpsMonitor;
import com.alipay.zoloz.hardware.camera.param.AbsCameraParam;
import com.alipay.zoloz.hardware.camera.param.ColorCameraParam;
import com.alipay.zoloz.hardware.camera.param.DepthCameraParam;
import com.alipay.zoloz.hardware.camera.param.SlirCameraParam;
import com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class AbsCameraImpl extends CameraCallback<AbsCameraParam, com.alipay.zoloz.hardware.camera.data.CameraData> implements ICameraInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AbsCameraImpl s;

    /* renamed from: a  reason: collision with root package name */
    public final HandlerThread f6214a;
    public AbsColorCamera c;
    public CameraSurfaceViewRender d;
    public Rect e;
    public Rect f;
    public AbsDepthCamera h;
    public CameraSurfaceViewRender i;
    public AbsSlirCamera j;
    public CameraSurfaceViewRender k;
    public final SparseArray<ICameraCallback> b = new SparseArray<>();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public DeviceSetting l = new DeviceSetting();
    public FpsCallback m = new FpsCallback() { // from class: com.alipay.zoloz.hardware.camera.AbsCameraImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.zoloz.hardware.camera.fps.FpsCallback
        public void onFps(String str, int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd6bf7f8", new Object[]{this, str, new Integer(i), new Float(f)});
            } else if (i % 5 != 0 || f > 0.0f) {
                Log.i(FpsMonitor.TAG, "onFps: color = " + f + ", times=" + i);
            } else {
                Log.e(FpsMonitor.TAG, "onFps: color = " + f + ", times=" + i + ", stream error");
                AbsCameraImpl.this.b(102);
            }
        }
    };
    public FpsCallback n = new FpsCallback() { // from class: com.alipay.zoloz.hardware.camera.AbsCameraImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.zoloz.hardware.camera.fps.FpsCallback
        public void onFps(String str, int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd6bf7f8", new Object[]{this, str, new Integer(i), new Float(f)});
            } else if (i % 5 != 0 || f > 0.0f) {
                Log.i(FpsMonitor.TAG, "onFps: depth = " + f + ", times=" + i);
            } else {
                Log.e(FpsMonitor.TAG, "onFps: depth = " + f + ", times=" + i + ", stream error");
                AbsCameraImpl.this.b(103);
            }
        }
    };
    public FpsCallback o = new FpsCallback() { // from class: com.alipay.zoloz.hardware.camera.AbsCameraImpl.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.zoloz.hardware.camera.fps.FpsCallback
        public void onFps(String str, int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd6bf7f8", new Object[]{this, str, new Integer(i), new Float(f)});
            } else if (i % 5 != 0 || f > 0.0f) {
                Log.i(FpsMonitor.TAG, "onFps: slir = " + f + ", times=" + i);
            } else {
                Log.e(FpsMonitor.TAG, "onFps: slir = " + f + ", times=" + i + ", stream error");
                AbsCameraImpl.this.b(104);
            }
        }
    };
    public CameraCallback<ColorCameraParam, ColorCameraData> p = new CameraCallback<ColorCameraParam, ColorCameraData>() { // from class: com.alipay.zoloz.hardware.camera.AbsCameraImpl.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public /* synthetic */ void b(int i, ColorCameraData colorCameraData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), colorCameraData});
            } else {
                a(i, colorCameraData);
            }
        }

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public void a(int i, ColorCameraParam colorCameraParam) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("680e6758", new Object[]{this, new Integer(i), colorCameraParam});
            } else {
                AbsCameraImpl.this.a(i, (AbsCameraParam) colorCameraParam);
            }
        }

        public void a(int i, ColorCameraData colorCameraData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91151612", new Object[]{this, new Integer(i), colorCameraData});
            } else {
                AbsCameraImpl.this.b(i, colorCameraData);
            }
        }

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public void a(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            } else {
                AbsCameraImpl.this.a(i, i2, str);
            }
        }

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                AbsCameraImpl.this.a(i);
            }
        }
    };
    public CameraCallback<DepthCameraParam, com.alipay.zoloz.hardware.camera.data.CameraData> q = new CameraCallback<DepthCameraParam, com.alipay.zoloz.hardware.camera.data.CameraData>() { // from class: com.alipay.zoloz.hardware.camera.AbsCameraImpl.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public /* synthetic */ void b(int i, com.alipay.zoloz.hardware.camera.data.CameraData cameraData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), cameraData});
            } else {
                a(i, cameraData);
            }
        }

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public void a(int i, DepthCameraParam depthCameraParam) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aff49ab8", new Object[]{this, new Integer(i), depthCameraParam});
            } else {
                AbsCameraImpl.this.a(i, (AbsCameraParam) depthCameraParam);
            }
        }

        public void a(int i, com.alipay.zoloz.hardware.camera.data.CameraData cameraData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("864b55bd", new Object[]{this, new Integer(i), cameraData});
            } else {
                AbsCameraImpl.this.b(i, cameraData);
            }
        }

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public void a(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            } else {
                AbsCameraImpl.this.a(i, i2, str);
            }
        }

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                AbsCameraImpl.this.a(i);
            }
        }
    };
    public CameraCallback<SlirCameraParam, com.alipay.zoloz.hardware.camera.data.CameraData> r = new CameraCallback<SlirCameraParam, com.alipay.zoloz.hardware.camera.data.CameraData>() { // from class: com.alipay.zoloz.hardware.camera.AbsCameraImpl.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public /* synthetic */ void b(int i, com.alipay.zoloz.hardware.camera.data.CameraData cameraData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), cameraData});
            } else {
                a(i, cameraData);
            }
        }

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public void a(int i, SlirCameraParam slirCameraParam) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e52a4ed", new Object[]{this, new Integer(i), slirCameraParam});
            } else {
                AbsCameraImpl.this.a(i, (AbsCameraParam) slirCameraParam);
            }
        }

        public void a(int i, com.alipay.zoloz.hardware.camera.data.CameraData cameraData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("864b55bd", new Object[]{this, new Integer(i), cameraData});
            } else {
                AbsCameraImpl.this.b(i, cameraData);
            }
        }

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public void a(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            } else {
                AbsCameraImpl.this.a(i, i2, str);
            }
        }

        @Override // com.alipay.zoloz.hardware.camera.CameraCallback
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                AbsCameraImpl.this.a(i);
            }
        }
    };

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public PointF colorToDepth(PointF pointF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("8494bbd2", new Object[]{this, pointF}) : pointF;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public PointF depthToColor(PointF pointF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("69d74692", new Object[]{this, pointF}) : pointF;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getPreviewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82fe5753", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getPreviewWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50ccc3ce", new Object[]{this})).intValue();
        }
        return 0;
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

    public static AbsCameraImpl getCameraImpl(Context context) {
        if (s == null) {
            try {
                Constructor<?> constructor = Class.forName(BuildConfig.CAMERA_IMPL_CLASS_NAME).getConstructor(Context.class);
                constructor.setAccessible(true);
                s = (AbsCameraImpl) constructor.newInstance(context);
            } catch (ClassNotFoundException e) {
                Log.w("CameraImpl", e);
            } catch (IllegalAccessException e2) {
                Log.w("CameraImpl", e2);
            } catch (InstantiationException e3) {
                Log.w("CameraImpl", e3);
            } catch (NoSuchMethodException e4) {
                Log.w("CameraImpl", e4);
            } catch (InvocationTargetException e5) {
                Log.w("CameraImpl", e5);
            }
        }
        return s;
    }

    public AbsCameraImpl(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        this.f6214a = new HandlerThread(getClass().getSimpleName());
        this.f6214a.setDaemon(true);
        this.f6214a.setPriority(10);
        this.f6214a.start();
    }

    @Override // com.alipay.zoloz.hardware.camera.CameraCallback
    public void a(int i, AbsCameraParam absCameraParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73669367", new Object[]{this, new Integer(i), absCameraParam});
            return;
        }
        Log.d("CameraImpl", "onCameraConnected() : frameType=" + i + ", cameraParam=" + absCameraParam);
    }

    @Override // com.alipay.zoloz.hardware.camera.CameraCallback
    public void a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
            return;
        }
        Log.e("CameraImpl", "onCameraError() : frameType=" + i + ", errorCode=" + i2 + ", errorMessage=" + str);
        if (i == 1) {
            b(201);
        } else if (i == 2) {
            b(101);
        } else if (i != 4) {
        } else {
            b(101);
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.CameraCallback
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Log.d("CameraImpl", "onCameraConnected() : frameType=" + i);
        if (i != 1) {
            return;
        }
        this.e = null;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void initCamera(DeviceSetting deviceSetting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841340ae", new Object[]{this, deviceSetting});
            return;
        }
        Log.i("CameraImpl", "initCamera : " + deviceSetting);
        if (deviceSetting == null) {
            return;
        }
        this.l = deviceSetting;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void openCamera(DeviceSetting deviceSetting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6845d934", new Object[]{this, deviceSetting});
            return;
        }
        Log.i("CameraImpl", "openCamera : " + deviceSetting);
        if (deviceSetting == null) {
            return;
        }
        this.l = deviceSetting;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void startCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9433b2e", new Object[]{this});
            return;
        }
        Log.i("CameraImpl", "startCamera");
        startColorCamera();
        if (this.h == null) {
            this.g.set(true);
        } else {
            startDepthCamera();
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void startColorCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9178fc2d", new Object[]{this});
            return;
        }
        Log.i("CameraImpl", "startColorCamera");
        this.c.addCallback(this.p);
        this.c.start();
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void startDepthCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283fdf8d", new Object[]{this});
            return;
        }
        Log.i("CameraImpl", "startDepthCamera");
        this.h.addCallback(this.q);
        this.h.start();
        if (!this.l.isSlir()) {
            return;
        }
        Log.i("CameraImpl", "startSlirCamera");
        this.j.addCallback(this.r);
        this.j.start();
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void startPreview(SurfaceHolder surfaceHolder, float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce4b2a73", new Object[]{this, surfaceHolder, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        Log.i("CameraImpl", "startPreview");
        this.c.start();
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
            return;
        }
        Log.i("CameraImpl", "stopPreview");
        this.c.stop();
        this.f = null;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void stopDepthCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b70e7ed", new Object[]{this});
            return;
        }
        Log.i("CameraImpl", "stopDepthCamera");
        this.h.removeCallback(this.q);
        this.h.stop();
        if (!this.l.isSlir()) {
            return;
        }
        Log.i("CameraImpl", "stopSlirCamera");
        this.j.removeCallback(this.r);
        this.j.stop();
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void stopColorCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4aa048d", new Object[]{this});
            return;
        }
        Log.i("CameraImpl", "stopColorCamera");
        this.c.removeCallback(this.p);
        this.c.stop();
        this.f = null;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void stopCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e676ce", new Object[]{this});
            return;
        }
        Log.i("CameraImpl", "stopCamera");
        stopColorCamera();
        if (this.h == null) {
            return;
        }
        stopDepthCamera();
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void closeCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a613d144", new Object[]{this});
        } else {
            Log.i("CameraImpl", "closeCamera");
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void releaseCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c11493", new Object[]{this});
        } else {
            Log.i("CameraImpl", "releaseCamera");
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void addCallback(ICameraCallback iCameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ee07b0", new Object[]{this, iCameraCallback});
        } else if (iCameraCallback == null) {
        } else {
            synchronized (this.b) {
                this.b.put(iCameraCallback.hashCode(), iCameraCallback);
                Log.d("CameraImpl", "addCallback(" + iCameraCallback + ") size=" + this.b.size());
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
            synchronized (this.b) {
                this.b.remove(iCameraCallback.hashCode());
                Log.d("CameraImpl", "removeCallback(" + iCameraCallback + ") size=" + this.b.size());
            }
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getColorWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd49bc13", new Object[]{this})).intValue() : this.c.getCameraParam().width;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getColorHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a62067ae", new Object[]{this})).intValue() : this.c.getCameraParam().height;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getColorMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1b6716a", new Object[]{this})).intValue() : this.c.getCameraParam().format;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getDepthWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca68ecb3", new Object[]{this})).intValue() : this.h.getCameraParam().width;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public int getDepthHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3ce74b0e", new Object[]{this})).intValue() : this.h.getCameraParam().height;
    }

    public Rect getColorRoi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("21b1aeaf", new Object[]{this});
        }
        if (this.e == null) {
            ColorCameraParam cameraParam = this.c.getCameraParam();
            this.e = new Rect(0, 0, cameraParam.width, cameraParam.height);
            Log.d("CameraImpl", "getColorROI(): mColorRoi=" + this.e);
        }
        return this.e;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public Rect getROI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("7535dda6", new Object[]{this});
        }
        getColorRoi();
        Rect rect = this.f;
        if (rect == null) {
            rect = this.e;
        }
        Log.d("CameraImpl", "getROI(): mColorRoi=" + this.e + ", mColorRenderRoi=" + this.f + " ===> roi=" + rect);
        return rect;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public boolean isMirror() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e953f594", new Object[]{this})).booleanValue() : this.c.getCameraParam().isMirror;
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public void setRenderLayers(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288f49e4", new Object[]{this, map});
            return;
        }
        CameraSurfaceViewRender cameraSurfaceViewRender = this.d;
        if (cameraSurfaceViewRender == null) {
            return;
        }
        cameraSurfaceViewRender.setRenderLayers(map);
    }

    @Override // com.alipay.zoloz.hardware.camera.ICameraInterface
    public boolean beautifyAvatar(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0206a13", new Object[]{this, bitmap})).booleanValue();
        }
        CameraSurfaceViewRender cameraSurfaceViewRender = this.d;
        if (cameraSurfaceViewRender != null) {
            return cameraSurfaceViewRender.beautifyAvatar(bitmap);
        }
        return false;
    }

    public void register(final CameraSurfaceViewRender cameraSurfaceViewRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5a204", new Object[]{this, cameraSurfaceViewRender});
        } else if (cameraSurfaceViewRender == null) {
            Log.w("CameraImpl", "register(render=null)");
        } else {
            this.d = cameraSurfaceViewRender;
            AbsColorCamera absColorCamera = this.c;
            if (absColorCamera == null) {
                Log.w("CameraImpl", "colorCamera not ready");
                return;
            }
            absColorCamera.addOnFrameAvailableListener(cameraSurfaceViewRender);
            AbsCamera.PreviewTexture preview = this.c.getPreview();
            if (preview == null) {
                this.c.postTask(new Runnable() { // from class: com.alipay.zoloz.hardware.camera.AbsCameraImpl.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        final AbsCamera.PreviewTexture preview2 = AbsCameraImpl.this.c == null ? null : AbsCameraImpl.this.c.getPreview();
                        Log.w("CameraImpl", "colorPreviewTexture 2 = " + preview2);
                        if (preview2 == null) {
                            Log.e("CameraImpl", "no chance to call render.startRender()......");
                        } else {
                            cameraSurfaceViewRender.runOnGLThread(new Runnable() { // from class: com.alipay.zoloz.hardware.camera.AbsCameraImpl.7.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    try {
                                        preview2.surfaceTexture.updateTexImage();
                                    } catch (Throwable th) {
                                        Log.w("CameraImpl", th);
                                    }
                                    cameraSurfaceViewRender.startRender(preview2);
                                }
                            });
                        }
                    }
                });
            } else {
                cameraSurfaceViewRender.startRender(preview);
            }
        }
    }

    public void unregister(CameraSurfaceViewRender cameraSurfaceViewRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b468dd", new Object[]{this, cameraSurfaceViewRender});
        } else if (cameraSurfaceViewRender == null) {
            Log.w("CameraImpl", "unregister(render=null)");
        } else {
            if (this.d == cameraSurfaceViewRender) {
                this.d = null;
            }
            if (this.c == null) {
                Log.w("CameraImpl", "unregister() render=" + cameraSurfaceViewRender + ": null == mColorCamera");
                return;
            }
            Log.d("CameraImpl", "unregister(render=" + cameraSurfaceViewRender + "), frameType=COLOR");
            this.c.removeOnFrameAvailableListener(cameraSurfaceViewRender);
        }
    }

    public void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc88349", new Object[]{this, byteBuffer, byteBuffer2, byteBuffer3});
            return;
        }
        synchronized (this.b) {
            if (this.b.size() > 0) {
                ColorCameraParam cameraParam = this.c.getCameraParam();
                if (this.h != null) {
                    DepthCameraParam cameraParam2 = this.h.getCameraParam();
                    int i7 = cameraParam2.width;
                    int i8 = cameraParam2.height;
                    i3 = cameraParam2.format;
                    i = i7;
                    i2 = i8;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                }
                if (this.l.isSlir()) {
                    SlirCameraParam cameraParam3 = this.j.getCameraParam();
                    int i9 = cameraParam3.width;
                    int i10 = cameraParam3.height;
                    i6 = cameraParam3.format;
                    i4 = i9;
                    i5 = i10;
                } else {
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                }
                CameraData cameraData = new CameraData(byteBuffer, cameraParam.width, cameraParam.height, cameraParam.format, byteBuffer2, i, i2, i3, byteBuffer3, i4, i5, i6, 0, 0, cameraParam.isMirror);
                for (int i11 = 0; i11 < this.b.size(); i11++) {
                    ICameraCallback valueAt = this.b.valueAt(i11);
                    if (valueAt != null) {
                        valueAt.onPreviewFrame(cameraData);
                    }
                }
            }
        }
    }

    public void a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d64c9e9", new Object[]{this, byteBuffer});
            return;
        }
        synchronized (this.b) {
            int size = this.b.size();
            if (size > 0) {
                ColorCameraParam cameraParam = this.c.getCameraParam();
                ColorFrameData colorFrameData = new ColorFrameData(byteBuffer, cameraParam.width, cameraParam.height, cameraParam.format, this.c.getScanMode(), cameraParam.isMirror);
                for (int i = 0; i < size; i++) {
                    ICameraCallback valueAt = this.b.valueAt(i);
                    if (valueAt != null) {
                        valueAt.onColorFrame(colorFrameData);
                    }
                }
            }
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.b) {
            int size = this.b.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ICameraCallback valueAt = this.b.valueAt(i2);
                    if (valueAt != null) {
                        valueAt.onError(i);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r6 != 4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addOnFrameAvailableListener(int r6, android.graphics.SurfaceTexture.OnFrameAvailableListener r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.zoloz.hardware.camera.AbsCameraImpl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r5
            r3 = 1
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r6)
            r1[r3] = r4
            r1[r2] = r7
            java.lang.String r6 = "ec7a55ba"
            r0.ipc$dispatch(r6, r1)
            return
        L1d:
            if (r6 == r2) goto L23
            r0 = 4
            if (r6 == r0) goto L31
            goto L3f
        L23:
            boolean r6 = r7 instanceof com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender
            if (r6 == 0) goto L2c
            r6 = r7
            com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender r6 = (com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender) r6
            r5.i = r6
        L2c:
            com.alipay.zoloz.hardware.camera.abs.AbsDepthCamera r6 = r5.h
            r6.addOnFrameAvailableListener(r7)
        L31:
            boolean r6 = r7 instanceof com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender
            if (r6 == 0) goto L3a
            r6 = r7
            com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender r6 = (com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender) r6
            r5.k = r6
        L3a:
            com.alipay.zoloz.hardware.camera.abs.AbsSlirCamera r6 = r5.j
            r6.addOnFrameAvailableListener(r7)
        L3f:
            boolean r6 = r7 instanceof com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender
            if (r6 == 0) goto L48
            r6 = r7
            com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender r6 = (com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender) r6
            r5.d = r6
        L48:
            com.alipay.zoloz.hardware.camera.abs.AbsColorCamera r6 = r5.c
            r6.addOnFrameAvailableListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.hardware.camera.AbsCameraImpl.addOnFrameAvailableListener(int, android.graphics.SurfaceTexture$OnFrameAvailableListener):void");
    }

    public void removeOnFrameAvailableListener(int i, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112f3e77", new Object[]{this, new Integer(i), onFrameAvailableListener});
        } else if (i == 2) {
            if (this.i == onFrameAvailableListener) {
                this.i = null;
            }
            this.h.removeOnFrameAvailableListener(onFrameAvailableListener);
        } else if (i == 4) {
            if (this.k == onFrameAvailableListener) {
                this.k = null;
            }
            this.j.removeOnFrameAvailableListener(onFrameAvailableListener);
        } else {
            if (this.d == onFrameAvailableListener) {
                this.d = null;
            }
            this.c.removeOnFrameAvailableListener(onFrameAvailableListener);
            this.f = null;
        }
    }

    public AbsCameraParam getCameraParam(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsCameraParam) ipChange.ipc$dispatch("35cdc23c", new Object[]{this, new Integer(i)});
        }
        if (i == 2) {
            return this.h.getCameraParam();
        }
        if (i == 4) {
            if (!this.l.isSlir()) {
                return null;
            }
            return this.j.getCameraParam();
        }
        return this.c.getCameraParam();
    }

    public DeviceSetting getDeviceSetting() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeviceSetting) ipChange.ipc$dispatch("4f74825", new Object[]{this}) : this.l;
    }

    public void setColorRenderRoi(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1d97dd", new Object[]{this, rect});
            return;
        }
        this.f = rect;
        Log.d("CameraImpl", "setColorRenderRoi(): mColorRenderRoi=" + this.f);
    }

    public void onSurfaceDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fab44d3", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            int size = this.b.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    ICameraCallback valueAt = this.b.valueAt(i);
                    if (valueAt != null) {
                        valueAt.onSurfaceDestroyed();
                    }
                }
            }
        }
    }

    public void onSurfaceCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a0fcc1", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            int size = this.b.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    ICameraCallback valueAt = this.b.valueAt(i);
                    if (valueAt != null) {
                        valueAt.onSurfaceCreated();
                    }
                }
            }
        }
    }

    public void onSurfaceChanged(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641eb30d", new Object[]{this, new Double(d), new Double(d2)});
            return;
        }
        synchronized (this.b) {
            int size = this.b.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    ICameraCallback valueAt = this.b.valueAt(i);
                    if (valueAt != null) {
                        valueAt.onSurfaceChanged(d, d2);
                    }
                }
            }
        }
    }
}
