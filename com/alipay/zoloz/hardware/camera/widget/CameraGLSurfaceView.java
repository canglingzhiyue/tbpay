package com.alipay.zoloz.hardware.camera.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.ImageView;
import com.alipay.android.phone.zoloz.camera.BuildConfig;
import com.alipay.zoloz.hardware.camera.AbsCameraImpl;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.IGLSurfaceViewListener;
import com.alipay.zoloz.hardware.camera.preview.CameraSurfaceViewRender;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class CameraGLSurfaceView extends GLSurfaceView implements IGLSurfaceViewListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CameraSurfaceView";
    private static AbsCameraImpl mCameraImpl;
    private static final ImageView.ScaleType[] sScaleTypeArray = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private final CameraSurfaceViewRender mCameraSurfaceViewRender;

    public static /* synthetic */ Object ipc$super(CameraGLSurfaceView cameraGLSurfaceView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2063758590:
                super.surfaceCreated((SurfaceHolder) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1481161357:
                super.surfaceDestroyed((SurfaceHolder) objArr[0]);
                return null;
            case -1477262059:
                super.surfaceChanged((SurfaceHolder) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Deprecated
    public void setCameraCallback(ICameraCallback iCameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29fe22b6", new Object[]{this, iCameraCallback});
        }
    }

    public CameraGLSurfaceView(Context context) {
        this(context, null);
    }

    public CameraGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageView.ScaleType scaleType;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        ImageView.ScaleType scaleType2;
        ImageView.ScaleType scaleType3 = ImageView.ScaleType.CENTER_CROP;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CameraSurfaceView);
        if (obtainStyledAttributes != null) {
            boolean z5 = obtainStyledAttributes.getBoolean(R.styleable.CameraSurfaceView_renderCapturing, true);
            boolean z6 = obtainStyledAttributes.getBoolean(R.styleable.CameraSurfaceView_renderPromptMask, true);
            boolean z7 = obtainStyledAttributes.getBoolean(R.styleable.CameraSurfaceView_renderFaceRegions, true);
            boolean z8 = obtainStyledAttributes.getBoolean(R.styleable.CameraSurfaceView_beauty, true);
            int i = obtainStyledAttributes.getInt(R.styleable.CameraSurfaceView_android_scaleType, -1);
            if (i >= 0) {
                scaleType2 = sScaleTypeArray[i];
            } else {
                scaleType2 = ImageView.ScaleType.CENTER_CROP;
            }
            f = obtainStyledAttributes.getFloat(R.styleable.CameraSurfaceView_cornerRationX, 0.0f);
            float f3 = obtainStyledAttributes.getFloat(R.styleable.CameraSurfaceView_cornerRationY, 0.0f);
            obtainStyledAttributes.recycle();
            f2 = f3;
            scaleType = scaleType2;
            z4 = z8;
            z3 = z7;
            z2 = z6;
            z = z5;
        } else {
            scaleType = scaleType3;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            f = 0.0f;
            f2 = 0.0f;
        }
        Log.d(TAG, "new CameraSurfaceView() scaleType=" + scaleType + ", renderCapturing=" + z + ", renderPromptMask=" + z2 + ", renderFaceRegions=" + z3 + ", beauty=" + z4 + ", renderCapturing=" + z + ", cornerRationX=" + f + ", cornerRationY=" + f);
        setEGLContextClientVersion(2);
        this.mCameraSurfaceViewRender = new CameraSurfaceViewRender(this, scaleType, z, z2, z3, z4, f, f2);
        setZOrderOnTop(false);
        setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        getHolder().setFormat(1);
        setRenderer(this.mCameraSurfaceViewRender);
        setRenderMode(0);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        super.surfaceCreated(surfaceHolder);
        Log.d(TAG, "surfaceCreated() holder=" + surfaceHolder);
        getCameraImpl(getContext());
        mCameraImpl.startCamera();
        mCameraImpl.onSurfaceCreated();
    }

    public AbsCameraImpl getCameraImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsCameraImpl) ipChange.ipc$dispatch("87a09d73", new Object[]{this}) : mCameraImpl;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.mCameraSurfaceViewRender.setDeviceSetting(mCameraImpl.getDeviceSetting());
        Log.d(TAG, "surfaceChanged() holder=" + surfaceHolder + ", format=" + i + ", width=" + i2 + ", height=" + i3);
        mCameraImpl.onSurfaceChanged((double) i2, (double) i3);
        super.surfaceChanged(surfaceHolder, i, i2, i3);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        this.mCameraSurfaceViewRender.onSurfaceDestroy();
        mCameraImpl.onSurfaceDestroy();
        mCameraImpl.removeOnFrameAvailableListener(1, this.mCameraSurfaceViewRender);
        mCameraImpl.stopCamera();
        mCameraImpl = null;
        Log.d(TAG, "surfaceDestroyed() holder=" + surfaceHolder);
        super.surfaceDestroyed(surfaceHolder);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1c4360", new Object[]{this, surfaceHolder});
            return;
        }
        super.surfaceRedrawNeeded(surfaceHolder);
        Log.d(TAG, "surfaceRedrawNeededAsync() holder=" + surfaceHolder);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0c8328", new Object[]{this, surfaceHolder, runnable});
            return;
        }
        super.surfaceRedrawNeededAsync(surfaceHolder, runnable);
        Log.d(TAG, "surfaceRedrawNeededAsync() holder=" + surfaceHolder + ", finishDrawing=" + runnable);
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Log.d(TAG, "onResume()");
        super.onResume();
        this.mCameraSurfaceViewRender.startRenderFpsTask();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Log.d(TAG, "onAttachedToWindow()");
        this.mCameraSurfaceViewRender.onAttachedToWindow();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        Log.d(TAG, "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        this.mCameraSurfaceViewRender.onDetachedFromWindow();
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        Log.d(TAG, "onPause()");
        this.mCameraSurfaceViewRender.stopRenderFpsTask();
    }

    public static ICameraInterface getCameraImpl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICameraInterface) ipChange.ipc$dispatch("fafd2945", new Object[]{context});
        }
        if (mCameraImpl == null) {
            mCameraImpl = AbsCameraImpl.getCameraImpl(context);
        }
        return mCameraImpl;
    }

    @Deprecated
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
    @java.lang.Deprecated
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
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.hardware.camera.widget.CameraGLSurfaceView.getCameraId():int");
    }

    @Override // com.alipay.zoloz.hardware.camera.IGLSurfaceViewListener
    public void runOnGLThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b69519e", new Object[]{this, runnable});
        } else {
            queueEvent(runnable);
        }
    }
}
