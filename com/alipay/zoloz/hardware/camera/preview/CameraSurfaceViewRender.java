package com.alipay.zoloz.hardware.camera.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.widget.ImageView;
import com.alibaba.security.realidentity.x4;
import com.alipay.zoloz.hardware.DeviceSetting;
import com.alipay.zoloz.hardware.camera.AbsCameraImpl;
import com.alipay.zoloz.hardware.camera.abs.AbsCamera;
import com.alipay.zoloz.hardware.camera.fps.FpsCallback;
import com.alipay.zoloz.hardware.camera.fps.FpsMonitor;
import com.alipay.zoloz.hardware.camera.fps.FpsTask;
import com.alipay.zoloz.hardware.camera.param.AbsCameraParam;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.crashsdk.export.LogType;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public class CameraSurfaceViewRender implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer, FpsCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private GLSurfaceView f6239a;
    private AbsCameraImpl b;
    private AbsCamera.PreviewTexture c;
    private FilterTextureController e;
    private DeviceSetting g;
    private final SPManager h;
    private float j;
    private float k;
    private int l;
    private int m;
    private boolean d = false;
    private boolean i = false;
    private final FpsTask f = new FpsTask("render", this);

    public static /* synthetic */ AbsCameraImpl a(CameraSurfaceViewRender cameraSurfaceViewRender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsCameraImpl) ipChange.ipc$dispatch("dce48a13", new Object[]{cameraSurfaceViewRender}) : cameraSurfaceViewRender.b;
    }

    public static /* synthetic */ AbsCamera.PreviewTexture a(CameraSurfaceViewRender cameraSurfaceViewRender, AbsCamera.PreviewTexture previewTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsCamera.PreviewTexture) ipChange.ipc$dispatch("ef766068", new Object[]{cameraSurfaceViewRender, previewTexture});
        }
        cameraSurfaceViewRender.c = previewTexture;
        return previewTexture;
    }

    public static /* synthetic */ FilterTextureController b(CameraSurfaceViewRender cameraSurfaceViewRender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FilterTextureController) ipChange.ipc$dispatch("cffc9511", new Object[]{cameraSurfaceViewRender}) : cameraSurfaceViewRender.e;
    }

    public CameraSurfaceViewRender(GLSurfaceView gLSurfaceView, ImageView.ScaleType scaleType, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2) {
        this.f6239a = gLSurfaceView;
        this.j = f;
        this.k = f2;
        Context context = gLSurfaceView.getContext();
        this.h = SPManager.newInstance(context);
        this.e = new FilterTextureController(context, scaleType, z, z2, z3, z4);
    }

    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            Log.d(x4.p, "onAttachedToWindow()");
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ea8368", new Object[]{this, gl10, eGLConfig});
            return;
        }
        Log.d(x4.p, "onSurfaceCreated()");
        if (!this.g.isBeauty()) {
            return;
        }
        this.i = false;
        int intValue = ((Integer) this.h.get(SPManager.FPS_KEY, -1)).intValue();
        int intValue2 = ((Integer) this.h.get("level", 2)).intValue();
        if (intValue > 3.0f) {
            if (intValue > 25) {
                int i2 = intValue2 + 1;
                if (i2 > 3) {
                    i2 = 3;
                }
                CameraTextureRender.BEAUTY_LEVEL = i2;
            } else if (intValue > 18) {
                if (intValue2 > 3) {
                    intValue2 = 3;
                }
                if (intValue2 > 0) {
                    i = intValue2;
                }
                CameraTextureRender.BEAUTY_LEVEL = i;
            } else {
                int i3 = intValue2 - 1;
                if (i3 <= 0) {
                    i3 = 1;
                }
                CameraTextureRender.BEAUTY_LEVEL = i3;
            }
        }
        Log.i(x4.p, "onSurfaceCreated mSPManager fps  : " + intValue + " BEAUTY_LEVEL: " + CameraTextureRender.BEAUTY_LEVEL + " sp level : " + intValue2);
    }

    public void setDeviceSetting(DeviceSetting deviceSetting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c14e40b", new Object[]{this, deviceSetting});
        } else {
            this.g = deviceSetting;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893091d9", new Object[]{this, gl10, new Integer(i), new Integer(i2)});
            return;
        }
        Log.d(x4.p, "onSurfaceChanged(): width=" + i + ", height=" + i2);
        this.l = i;
        this.m = i2;
        GLES20.glViewport(0, 0, i, i2);
        this.b = AbsCameraImpl.getCameraImpl(this.f6239a.getContext());
        this.b.register(this);
        startRenderFpsTask();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d186971d", new Object[]{this, gl10});
            return;
        }
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glClear(LogType.UNEXP_RESTART);
        try {
            this.c.surfaceTexture.updateTexImage();
        } catch (Throwable th) {
            Log.w(x4.p, th);
            z = false;
        }
        if (!z) {
            return;
        }
        FilterTextureController filterTextureController = this.e;
        if (filterTextureController != null) {
            filterTextureController.drawFrame(false);
        }
        this.f.update();
    }

    public void onSurfaceDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fab44d3", new Object[]{this});
            return;
        }
        Log.d(x4.p, "onSurfaceDestroy()");
        stopRenderFpsTask();
        this.f6239a.queueEvent(new Runnable() { // from class: com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (CameraSurfaceViewRender.a(CameraSurfaceViewRender.this) != null) {
                    CameraSurfaceViewRender.a(CameraSurfaceViewRender.this).unregister(CameraSurfaceViewRender.this);
                }
                CameraSurfaceViewRender.a(CameraSurfaceViewRender.this, null);
            }
        });
    }

    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        Log.d(x4.p, "onDetachedFromWindow()");
        FilterTextureController filterTextureController = this.e;
        if (filterTextureController == null) {
            return;
        }
        filterTextureController.release();
        this.e = null;
    }

    public void startRenderFpsTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df199fdd", new Object[]{this});
            return;
        }
        FpsMonitor.getInstance().startFpsMonitor(this.f);
        this.f.setRender(true);
    }

    public void stopRenderFpsTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2a103d", new Object[]{this});
            return;
        }
        this.f.setRender(false);
        FpsMonitor.getInstance().stopFpsMonitor(this.f);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e997ed", new Object[]{this, surfaceTexture});
            return;
        }
        GLSurfaceView gLSurfaceView = this.f6239a;
        if (gLSurfaceView == null || this.c == null) {
            return;
        }
        gLSurfaceView.requestRender();
    }

    @Override // com.alipay.zoloz.hardware.camera.fps.FpsCallback
    public void onFps(String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6bf7f8", new Object[]{this, str, new Integer(i), new Float(f)});
            return;
        }
        Log.i(x4.p, "onFps: " + str + " = " + f + ", times=" + i);
        if (i % 5 != 0 || !this.g.isBeauty() || f <= 3.0f) {
            return;
        }
        Log.i(x4.p, "FpsMonitorCallback record fps  : " + f);
        this.h.put(SPManager.FPS_KEY, Integer.valueOf((int) f));
        Log.i(x4.p, "FpsMonitorCallback record fps mHasRecordBeautyLevel  : " + this.i);
        if (this.i) {
            return;
        }
        this.h.put("level", Integer.valueOf(CameraTextureRender.BEAUTY_LEVEL));
        this.i = true;
    }

    public boolean setDrawCapturing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a32904f4", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        FilterTextureController filterTextureController = this.e;
        if (filterTextureController != null) {
            filterTextureController.setDrawCapturing(z);
        }
        return true;
    }

    public void setRenderLayers(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288f49e4", new Object[]{this, map});
            return;
        }
        FilterTextureController filterTextureController = this.e;
        if (filterTextureController == null) {
            return;
        }
        filterTextureController.setRenderLayers(map);
    }

    public boolean beautifyAvatar(final Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0206a13", new Object[]{this, bitmap})).booleanValue();
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f6239a.queueEvent(new Runnable() { // from class: com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (CameraSurfaceViewRender.b(CameraSurfaceViewRender.this) != null) {
                    CameraSurfaceViewRender.b(CameraSurfaceViewRender.this).beautifyImage(bitmap);
                }
                countDownLatch.countDown();
                Log.d(x4.p, " beautifyAvatar countDown");
            }
        });
        try {
            countDownLatch.await();
            Log.d(x4.p, " beautifyAvatar await");
        } catch (InterruptedException e) {
            Log.e(x4.p, e);
        }
        return true;
    }

    public void startRender(AbsCamera.PreviewTexture previewTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1074753e", new Object[]{this, previewTexture});
            return;
        }
        this.c = previewTexture;
        if (this.c == null || this.d || this.e == null) {
            return;
        }
        Rect colorRoi = this.b.getColorRoi();
        AbsCameraParam cameraParam = this.b.getCameraParam(1);
        Rect surfaceCreated = this.e.surfaceCreated(this.g.isBeauty(), this.c, colorRoi, cameraParam.width, cameraParam.height, this.l, this.m, cameraParam.rotate, this.j, this.k);
        Log.d(x4.p, "colorRoi=" + colorRoi + " => colorPreviewRoi=" + surfaceCreated);
        this.b.setColorRenderRoi(surfaceCreated);
        this.d = true;
    }

    public void runOnGLThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b69519e", new Object[]{this, runnable});
        } else {
            this.f6239a.queueEvent(runnable);
        }
    }
}
