package com.alibaba.security.realidentity;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class b3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String h = "b3";

    /* renamed from: a  reason: collision with root package name */
    public final a3 f3367a;
    public Camera b;
    public boolean c;
    public boolean d;
    public int e = -1;
    public int f;
    public int g;

    public b3(Context context) {
        this.f3367a = new a3(context);
    }

    public synchronized void a(SurfaceHolder surfaceHolder, boolean z) throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74df9ec", new Object[]{this, surfaceHolder, new Boolean(z)});
            return;
        }
        TLog.loge("RPVerify", h, "openDriver");
        Camera camera = this.b;
        if (camera == null) {
            camera = a(this.e);
            if (camera != null) {
                this.b = camera;
            } else {
                throw new IOException();
            }
        }
        camera.setPreviewDisplay(surfaceHolder);
        if (!this.c) {
            TLog.loge("RPVerify", h, "openDriver 2");
            this.c = true;
            this.f3367a.a(camera, z);
            int i2 = this.f;
            if (i2 > 0 && (i = this.g) > 0) {
                a(i2, i);
                this.f = 0;
                this.g = 0;
            }
        }
        Camera.Parameters parameters = camera.getParameters();
        String flatten = parameters == null ? null : parameters.flatten();
        try {
            this.f3367a.b(camera, false);
        } catch (RuntimeException unused) {
            if (flatten == null) {
                return;
            }
            Camera.Parameters parameters2 = camera.getParameters();
            parameters2.unflatten(flatten);
            try {
                camera.setParameters(parameters2);
                this.f3367a.b(camera, true);
            } catch (RuntimeException unused2) {
                a.e(h, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
    }

    public synchronized void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public synchronized boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return this.b != null;
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TLog.loge("RPVerify", h, "startPreview");
        Camera camera = this.b;
        if (camera != null && !this.d) {
            TLog.loge("RPVerify", h, "startPreview 2");
            camera.startPreview();
            this.d = true;
        }
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TLog.loge("RPVerify", h, "stopPreview");
        if (this.b != null && this.d) {
            TLog.loge("RPVerify", h, "stopPreview 2");
            this.b.stopPreview();
            this.d = false;
        }
    }

    public Camera b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Camera) ipChange.ipc$dispatch("c905e2ee", new Object[]{this}) : this.b;
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TLog.loge("RPVerify", h, "closeDriver");
        try {
            if (this.b != null) {
                this.b.release();
                this.b = null;
                this.c = false;
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!this.c) {
            this.f = i;
            this.g = i2;
        }
    }

    public int a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{this, new Boolean(z)})).intValue();
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras < 0) {
            return -1;
        }
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == z) {
                return i;
            }
        }
        return -1;
    }

    public void a(Camera.AutoFocusCallback autoFocusCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad948a3", new Object[]{this, autoFocusCallback});
            return;
        }
        TLog.loge("RPVerify", h, "setCameraFocus");
        if (this.b == null || !this.c) {
            return;
        }
        try {
            TLog.loge("RPVerify", h, "setCameraFocus 2");
            String focusMode = this.b.getParameters().getFocusMode();
            if (!focusMode.equals("auto") && !focusMode.equals("macro")) {
                return;
            }
            this.b.autoFocus(autoFocusCallback);
        } catch (Throwable th) {
            String str = h;
            a.b(str, "camera setFocusMode not ready with " + th.getMessage());
        }
    }

    private Camera a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Camera) ipChange.ipc$dispatch("64c57ca0", new Object[]{this, new Integer(i)});
        }
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            a.e(h, "No cameras!");
            return null;
        }
        if (i < 0) {
            z = false;
        }
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            String str = h;
            a.c(str, "Opening camera #" + i);
            return Camera.open(i);
        } else if (z) {
            String str2 = h;
            a.e(str2, "Requested camera does not exist: " + i);
            return null;
        } else {
            a.c(h, "No camera facing back; returning camera #0");
            return Camera.open(0);
        }
    }
}
