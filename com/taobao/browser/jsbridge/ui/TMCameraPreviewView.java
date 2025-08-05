package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class TMCameraPreviewView extends SurfaceView implements SurfaceHolder.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Camera camera;
    private SurfaceHolder holder;
    private boolean isCameraFront;
    private OnCameraStatusListener listener;
    private Camera.PictureCallback pictureCallback;

    /* loaded from: classes6.dex */
    public interface OnCameraStatusListener {
        void onAutoFocus(boolean z);

        void onCameraStopped(byte[] bArr);
    }

    static {
        kge.a(-1122709289);
        kge.a(632307482);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public static /* synthetic */ OnCameraStatusListener access$000(TMCameraPreviewView tMCameraPreviewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnCameraStatusListener) ipChange.ipc$dispatch("64753b69", new Object[]{tMCameraPreviewView}) : tMCameraPreviewView.listener;
    }

    public static /* synthetic */ Camera.PictureCallback access$100(TMCameraPreviewView tMCameraPreviewView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Camera.PictureCallback) ipChange.ipc$dispatch("d9803ef6", new Object[]{tMCameraPreviewView}) : tMCameraPreviewView.pictureCallback;
    }

    public TMCameraPreviewView(Context context) {
        this(context, null);
    }

    public TMCameraPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TMCameraPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isCameraFront = false;
        this.pictureCallback = new Camera.PictureCallback() { // from class: com.taobao.browser.jsbridge.ui.TMCameraPreviewView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.hardware.Camera.PictureCallback
            public void onPictureTaken(byte[] bArr, Camera camera) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a4928df", new Object[]{this, bArr, camera});
                    return;
                }
                try {
                    camera.stopPreview();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TMCameraPreviewView.access$000(TMCameraPreviewView.this) == null) {
                    return;
                }
                TMCameraPreviewView.access$000(TMCameraPreviewView.this).onCameraStopped(bArr);
            }
        };
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        this.holder = getHolder();
        this.holder.setFormat(-3);
        this.holder.addCallback(this);
        this.holder.setType(3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        try {
            if (this.camera == null) {
                setCameraFront(false);
                return;
            }
            this.camera.setPreviewDisplay(surfaceHolder);
            this.camera.startPreview();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final String getOptimalFocusMode(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19c28ed9", new Object[]{list});
        }
        if (list == null) {
            return "auto";
        }
        for (String str : list) {
            if ("continuous-picture".equals(str)) {
                return str;
            }
        }
        for (String str2 : list) {
            if ("auto".equals(str2)) {
                return str2;
            }
        }
        return list.size() > 0 ? list.get(0) : "auto";
    }

    private static final Camera.Size getMaxSize(List<Camera.Size> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("519edb25", new Object[]{list});
        }
        Camera.Size size = null;
        for (Camera.Size size2 : list) {
            int i2 = size2.width * size2.height;
            if (i2 > i) {
                size = size2;
                i = i2;
            }
        }
        return size;
    }

    private static final Camera.Size getOptimalPreviewSize(List<Camera.Size> list, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("3f2ff614", new Object[]{list, new Float(f), new Integer(i)});
        }
        Camera.Size size = null;
        float f2 = Float.MAX_VALUE;
        for (Camera.Size size2 : list) {
            float f3 = size2.width / size2.height;
            if (f < 1.0f && f3 > 1.0f) {
                f3 = size2.height / size2.width;
            }
            float abs = Math.abs(f3 - f);
            if (abs < f2) {
                size = size2;
                f2 = abs;
            }
        }
        return size;
    }

    private static final Camera.Size getOptimalSaveSize(List<Camera.Size> list, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera.Size) ipChange.ipc$dispatch("4a3a86ce", new Object[]{list, new Float(f)});
        }
        Camera.Size size = null;
        float f2 = Float.MAX_VALUE;
        for (Camera.Size size2 : list) {
            float f3 = size2.width / size2.height;
            if (f < 1.0f && f3 > 1.0f) {
                f3 = size2.height / size2.width;
            }
            float abs = Math.abs(f3 - f);
            if (abs < f2) {
                size = size2;
                f2 = abs;
            }
        }
        return size;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        try {
            if (this.camera == null) {
                return;
            }
            this.camera.setPreviewCallback(null);
            this.camera.stopPreview();
            this.camera.release();
            this.camera = null;
        } catch (Exception unused) {
        }
    }

    public void autoFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fc1e470", new Object[]{this});
            return;
        }
        try {
            if (this.camera == null) {
                return;
            }
            this.camera.autoFocus(null);
        } catch (Exception unused) {
        }
    }

    public void takePicture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dcc5b7e", new Object[]{this});
            return;
        }
        try {
            if (this.camera == null) {
                return;
            }
            this.camera.autoFocus(new Camera.AutoFocusCallback() { // from class: com.taobao.browser.jsbridge.ui.TMCameraPreviewView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.hardware.Camera.AutoFocusCallback
                public void onAutoFocus(boolean z, Camera camera) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dedbc0d2", new Object[]{this, new Boolean(z), camera});
                        return;
                    }
                    if (TMCameraPreviewView.access$000(TMCameraPreviewView.this) != null) {
                        TMCameraPreviewView.access$000(TMCameraPreviewView.this).onAutoFocus(z);
                    }
                    try {
                        camera.takePicture(null, null, TMCameraPreviewView.access$100(TMCameraPreviewView.this));
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public boolean isFrontCamera() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c08c79af", new Object[]{this})).booleanValue() : this.isCameraFront;
    }

    public void setOnCameraStatusListener(OnCameraStatusListener onCameraStatusListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee53f97", new Object[]{this, onCameraStatusListener});
        } else {
            this.listener = onCameraStatusListener;
        }
    }

    public boolean hasFlash() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aced701", new Object[]{this})).booleanValue();
        }
        try {
            if (this.camera == null) {
                this.camera = Camera.open();
            }
            if (this.camera == null) {
                return false;
            }
            return this.camera.getParameters().getSupportedFlashModes() != null;
        } catch (Throwable unused) {
            Toast.makeText(getContext(), "相机打开失败！请检查权限设置，稍后再试", 1).show();
            return false;
        }
    }

    public boolean turnLightOn() {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cc3eae3", new Object[]{this})).booleanValue();
        }
        Camera camera = this.camera;
        if (camera == null) {
            return false;
        }
        try {
            parameters = camera.getParameters();
        } catch (Exception unused) {
        }
        if (parameters == null || (supportedFlashModes = parameters.getSupportedFlashModes()) == null) {
            return false;
        }
        if (!"torch".equals(parameters.getFlashMode()) && supportedFlashModes.contains("torch")) {
            parameters.setFlashMode("torch");
            this.camera.setParameters(parameters);
        }
        return true;
    }

    public boolean turnLightOff() {
        Camera.Parameters parameters;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("512a81a1", new Object[]{this})).booleanValue();
        }
        Camera camera = this.camera;
        if (camera == null) {
            return false;
        }
        try {
            parameters = camera.getParameters();
        } catch (Exception unused) {
        }
        if (parameters == null) {
            return false;
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String flashMode = parameters.getFlashMode();
        if (supportedFlashModes == null) {
            return false;
        }
        if (!"off".equals(flashMode) && supportedFlashModes.contains("off")) {
            parameters.setFlashMode("off");
            this.camera.setParameters(parameters);
        }
        return true;
    }

    public void setCameraFront(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f1042b", new Object[]{this, new Boolean(z)});
            return;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if ((z && cameraInfo.facing == 1) || (!z && cameraInfo.facing == 0)) {
                try {
                    if (this.camera != null) {
                        this.camera.stopPreview();
                        this.camera.release();
                    }
                    this.camera = null;
                    this.camera = Camera.open(i);
                    if (this.camera == null) {
                        return;
                    }
                    try {
                        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                        float f = displayMetrics.widthPixels / displayMetrics.heightPixels;
                        int i2 = displayMetrics.widthPixels * displayMetrics.heightPixels;
                        Camera.Parameters parameters = this.camera.getParameters();
                        this.camera.setDisplayOrientation(90);
                        String optimalFocusMode = getOptimalFocusMode(parameters.getSupportedFocusModes());
                        Camera.Size optimalPreviewSize = getOptimalPreviewSize(parameters.getSupportedPreviewSizes(), f, i2);
                        Camera.Size optimalSaveSize = getOptimalSaveSize(parameters.getSupportedPictureSizes(), f);
                        parameters.setJpegQuality(80);
                        parameters.setFocusMode(optimalFocusMode);
                        parameters.setPictureFormat(256);
                        if ("Nexus 4".equalsIgnoreCase(Build.MODEL)) {
                            parameters.setPictureSize(optimalSaveSize.height, optimalSaveSize.width);
                        } else {
                            parameters.setPictureSize(optimalSaveSize.width, optimalSaveSize.height);
                        }
                        parameters.setPreviewSize(optimalPreviewSize.width, optimalPreviewSize.height);
                        try {
                            this.camera.setParameters(parameters);
                        } catch (Exception unused) {
                        }
                        this.camera.setPreviewDisplay(this.holder);
                        this.camera.startPreview();
                        if ("auto".equals(optimalFocusMode)) {
                            this.camera.autoFocus(null);
                        }
                        this.isCameraFront = z;
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                } catch (Throwable unused2) {
                    Toast.makeText(getContext(), "相机打开失败！请检查权限设置，稍后再试", 1).show();
                    return;
                }
            }
        }
    }
}
