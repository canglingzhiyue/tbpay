package com.etao.feimagesearch.cip.camera;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import tb.com;
import tb.cot;
import tb.coy;
import tb.cqe;
import tb.cqf;
import tb.cqg;
import tb.cqh;
import tb.dau;
import tb.jbg;
import tb.kge;

/* loaded from: classes3.dex */
public class c implements Camera.AutoFocusCallback, Camera.PreviewCallback, cqe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_PREFIX = "Camera1_";

    /* renamed from: a  reason: collision with root package name */
    private final Activity f6619a;
    private volatile Camera b;
    private final boolean f;
    private SurfaceHolder g;
    private Handler i;
    private Handler j;
    private com.etao.feimagesearch.cip.camera.a k;
    private volatile cqh l;
    private cqf m;
    private cqg n;
    private volatile byte[] o;
    private volatile boolean c = false;
    private volatile boolean d = false;
    private volatile boolean e = false;
    private boolean p = false;
    private Camera.Size q = null;
    private int r = -1;
    private volatile int s = 0;
    private int t = -1;
    private HandlerThread h = jbg.a("CameraWrapperThread" + hashCode());

    /* loaded from: classes3.dex */
    public interface a {
        void a(byte[] bArr, int i, int i2, int i3, boolean z);
    }

    static {
        kge.a(-890614536);
        kge.a(-265020139);
        kge.a(271854262);
        kge.a(695887560);
    }

    public static /* synthetic */ com.etao.feimagesearch.cip.camera.a a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.cip.camera.a) ipChange.ipc$dispatch("25135bb2", new Object[]{cVar}) : cVar.k;
    }

    public static /* synthetic */ void a(c cVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54376354", new Object[]{cVar, new Float(f)});
        } else {
            cVar.b(f);
        }
    }

    public static /* synthetic */ void a(c cVar, Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3038f", new Object[]{cVar, point});
        } else {
            cVar.b(point);
        }
    }

    public static /* synthetic */ void a(c cVar, SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b69d6c", new Object[]{cVar, surfaceHolder});
        } else {
            cVar.b(surfaceHolder);
        }
    }

    public static /* synthetic */ void a(c cVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5532d0b", new Object[]{cVar, aVar});
        } else {
            cVar.b(aVar);
        }
    }

    public static /* synthetic */ void a(c cVar, a aVar, byte[] bArr, Camera camera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad9b671", new Object[]{cVar, aVar, bArr, camera, new Boolean(z)});
        } else {
            cVar.a(aVar, bArr, camera, z);
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a48b6", new Object[]{cVar, str});
        } else {
            cVar.a(str);
        }
    }

    public static /* synthetic */ cqf b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cqf) ipChange.ipc$dispatch("b7f9a263", new Object[]{cVar}) : cVar.m;
    }

    public static /* synthetic */ void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8bbac2a", new Object[]{cVar});
        } else {
            cVar.h();
        }
    }

    public static /* synthetic */ void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e149", new Object[]{cVar});
        } else {
            cVar.k();
        }
    }

    public static /* synthetic */ void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7861668", new Object[]{cVar});
        } else {
            cVar.l();
        }
    }

    public static /* synthetic */ Camera f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Camera) ipChange.ipc$dispatch("a421308c", new Object[]{cVar}) : cVar.b;
    }

    public c(Activity activity, boolean z) {
        this.f6619a = activity;
        this.f = z;
        this.h.start();
        this.k = new com.etao.feimagesearch.cip.camera.a();
        this.i = new Handler(this.h.getLooper());
        this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    c.a(c.this).b();
                }
            }
        });
        this.j = new Handler(Looper.getMainLooper());
    }

    @Override // tb.cqe
    public void a(cqf cqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ec7220", new Object[]{this, cqfVar});
        } else {
            this.m = cqfVar;
        }
    }

    @Override // tb.cqe
    public void a(cqg cqgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ece67f", new Object[]{this, cqgVar});
        } else {
            this.n = cqgVar;
        }
    }

    @Override // tb.cqe
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    private synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.c) {
        } else {
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "tryOpenCamera", 19999, new String[0]);
            cot.a("PltCamera", "Camera1_CameraWrapper", "tryOpenCamera");
            this.b = this.k.a(500, 1000);
            Camera camera = this.b;
            if (camera == null) {
                cot.a("PltCamera", "Camera1_CameraWrapper", "open failed");
                j();
                return;
            }
            cot.a("PltCamera", "Camera1_CameraWrapper", "open success");
            this.e = this.k.d();
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                parameters.setFocusMode("continuous-picture");
            }
            Point c = c(camera);
            parameters.setPreviewFormat(17);
            parameters.setPreviewSize(c.x, c.y);
            if (com.etao.feimagesearch.config.b.m623do()) {
                parameters.setWhiteBalance("auto");
            }
            if (parameters.isZoomSupported()) {
                parameters.setZoom(0);
            }
            camera.setParameters(parameters);
            a(this.f6619a, this.d, camera);
            this.s = a(camera);
            a((Camera.PreviewCallback) this, this.s);
            i();
        }
    }

    private void a(Activity activity, boolean z, Camera camera) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a225c7b", new Object[]{this, activity, new Boolean(z), camera});
            return;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(z ? 1 : 0, cameraInfo);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
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
            i = (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        } else {
            i = ((cameraInfo.orientation - i2) + 360) % 360;
        }
        camera.setDisplayOrientation(i);
    }

    private int a(Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c770c020", new Object[]{this, camera})).intValue();
        }
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        this.p = false;
        return ((previewSize.width * previewSize.height) * 3) / 2;
    }

    private synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.c = true;
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "openCameraSuccess", 19999, new String[0]);
        Camera.Size previewSize = this.b.getParameters().getPreviewSize();
        int i = previewSize.width;
        int i2 = previewSize.height;
        this.j.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (c.b(c.this) == null) {
                } else {
                    c.b(c.this).a();
                }
            }
        });
        if (this.n != null) {
            this.n.a(i, i2);
        }
        if (this.f && this.g != null) {
            cot.c("Camera1_CameraWrapper", "prepare startPreviewInternal");
            b(this.g);
        }
    }

    private synchronized void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.c = false;
        this.j.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (c.b(c.this) == null) {
                } else {
                    c.b(c.this).b();
                }
            }
        });
    }

    private synchronized void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Camera camera = this.b;
        if (camera != null) {
            try {
                camera.setPreviewCallbackWithBuffer(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                camera.release();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.b = null;
        }
        this.c = false;
        this.j.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (c.b(c.this) == null) {
                } else {
                    c.b(c.this).c();
                }
            }
        });
    }

    private synchronized void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            a(f, false);
        }
    }

    @Override // tb.cqe
    public void a(final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.a(c.this, f);
                    }
                }
            });
        }
    }

    private boolean a(float f, boolean z) {
        Camera camera;
        Camera.Parameters parameters;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c103580", new Object[]{this, new Float(f), new Boolean(z)})).booleanValue();
        }
        if (this.b == null || (camera = this.b) == null) {
            return false;
        }
        int max = Math.max(Math.min(Math.round(b(camera) * f), b(camera)), 0);
        try {
            parameters = camera.getParameters();
        } catch (Exception e) {
            cot.a("PltCamera", "Camera1_CameraWrapper", cot.a("changeZoom", e));
        }
        if (z && parameters.isSmoothZoomSupported()) {
            camera.startSmoothZoom(max);
            return true;
        }
        if (parameters != null && parameters.isZoomSupported()) {
            parameters.setZoom(max);
            camera.setParameters(parameters);
            return true;
        }
        return false;
    }

    private int b(Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c81d6bbf", new Object[]{this, camera})).intValue();
        }
        Camera.Parameters parameters = camera.getParameters();
        if (parameters != null && parameters.isZoomSupported()) {
            return parameters.getMaxZoom();
        }
        return -1;
    }

    private synchronized void l() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.k.b() <= 1) {
        } else {
            if (!this.d) {
                z = true;
            }
            this.d = z;
            this.k.a(this.d);
            k();
            h();
        }
    }

    private synchronized void b(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b931e9", new Object[]{this, surfaceHolder});
            return;
        }
        try {
            if (this.f) {
                this.g = surfaceHolder;
            }
            Camera camera = this.b;
            if (camera == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            camera.setPreviewDisplay(surfaceHolder);
            camera.startPreview();
            dau.a();
            cot.a("PltCamera", "Camera1_CameraWrapper", "startPreviewInternal cost:" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            cot.a("PltCamera", "Camera1_CameraWrapper", cot.a("startPreviewInternal error", e));
        }
    }

    private synchronized void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f469d86e", new Object[]{this, aVar});
        } else if (this.p) {
            a(aVar, this.o, this.b, this.e);
        } else {
            a(aVar, null, null, this.e);
        }
    }

    @Override // tb.cqe
    public synchronized void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317d6f0f", new Object[]{this, aVar});
        } else {
            this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.a(c.this, aVar);
                    }
                }

                @Override // com.etao.feimagesearch.util.ac
                public void a(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    } else {
                        c.a(c.this, aVar, null, null, false);
                    }
                }
            });
        }
    }

    private void a(Camera.PreviewCallback previewCallback, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e33115f", new Object[]{this, previewCallback, new Integer(i)});
            return;
        }
        Camera camera = this.b;
        if (camera == null) {
            return;
        }
        if (previewCallback != null) {
            camera.addCallbackBuffer(new byte[i]);
            camera.addCallbackBuffer(new byte[i]);
            camera.addCallbackBuffer(new byte[i]);
        }
        camera.setPreviewCallbackWithBuffer(previewCallback);
    }

    @Override // tb.cqe
    public void a(cqh cqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ed5ade", new Object[]{this, cqhVar});
        } else {
            this.l = cqhVar;
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public synchronized void onPreviewFrame(byte[] bArr, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a13143", new Object[]{this, bArr, camera});
        } else if (!this.c) {
        } else {
            if (bArr == null || camera == null || this.s <= 0) {
                return;
            }
            try {
                if (this.q == null) {
                    this.q = camera.getParameters().getPreviewSize();
                }
                if (this.r <= 0) {
                    this.r = camera.getParameters().getPreviewFormat();
                }
                byte[] bArr2 = new byte[this.s];
                System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
                this.o = bArr2;
                this.p = true;
                camera.addCallbackBuffer(bArr);
                cqh cqhVar = this.l;
                if (cqhVar == null) {
                    return;
                }
                cqhVar.a(bArr2, this.q.width, this.q.height, this.r, this.e, m());
            } catch (Exception e) {
                cot.a("PltCamera", "Camera1_CameraWrapper", cot.a("frame preview error", e));
            }
        }
    }

    @Override // tb.cqe
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.c(c.this);
                    }
                }
            });
        }
    }

    @Override // tb.cqe
    public void a(final SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e175e8", new Object[]{this, surfaceHolder});
        } else {
            this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.a(c.this, surfaceHolder);
                    }
                }
            });
        }
    }

    @Override // tb.cqe
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.d(c.this);
                    }
                }
            });
        }
    }

    @Override // tb.cqe
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.e(c.this);
                    }
                }
            });
        }
    }

    @Override // tb.cqe
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            if (this.d) {
                return;
            }
            d();
        } else if (!this.d) {
        } else {
            d();
        }
    }

    @Override // tb.cqe
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (c.f(c.this) == null) {
                    } else {
                        try {
                            c.f(c.this).stopPreview();
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    @Override // tb.cqe
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.d;
    }

    private synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Camera camera = this.b;
        if (camera == null) {
            return;
        }
        if (Build.MODEL.contains("G750")) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            return;
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null && !supportedFlashModes.isEmpty()) {
            if (!supportedFlashModes.contains(str)) {
                return;
            }
            parameters.setFlashMode(str);
            camera.setParameters(parameters);
        }
    }

    @Override // tb.cqe
    public void b(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.a(c.this, z ? "torch" : "off");
                    }
                }
            });
        }
    }

    private Point c(Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("b773fcae", new Object[]{this, camera});
        }
        Camera.Parameters parameters = camera.getParameters();
        com.c(this.f6619a);
        com.d(this.f6619a);
        Point a2 = a(parameters);
        String str = Build.MODEL;
        if (str.contains("HTC") && str.contains("One")) {
            return new Point(1280, 720);
        }
        if (str.contains("GT-N7100")) {
            return new Point(1280, 720);
        }
        if (str.contains("M2-A01L")) {
            return new Point(1280, 720);
        }
        if (str.contains("JGS")) {
            return new Point(1280, 720);
        }
        if (str.contains("T1-A21L")) {
            return new Point(1280, 720);
        }
        if (str.contains("GT-I9300")) {
            return new Point(1280, 720);
        }
        return str.equals("u8800") ? new Point(720, 480) : a2;
    }

    private static Point a(Camera.Parameters parameters) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("331a8084", new Object[]{parameters});
        }
        int i2 = 1280;
        if (parameters == null) {
            return new Point(1280, 720);
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null || supportedPreviewSizes.isEmpty()) {
            return new Point(1280, 720);
        }
        Collections.sort(supportedPreviewSizes, new Comparator<Camera.Size>() { // from class: com.etao.feimagesearch.cip.camera.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, size, size2})).intValue() : a(size, size2);
            }

            public int a(Camera.Size size, Camera.Size size2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("c970e147", new Object[]{this, size, size2})).intValue() : size.width - size2.width;
            }
        });
        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 720;
                break;
            }
            Camera.Size next = it.next();
            if (next.width >= 1280) {
                i2 = next.width;
                i = next.height;
                break;
            }
        }
        if (i > 720) {
            i = 720;
        }
        return new Point(i2, i);
    }

    @Override // tb.cqe
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        cot.c("Camera1_CameraWrapper", "release");
        this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    c.d(c.this);
                }
            }
        });
        HandlerThread handlerThread = this.h;
        if (handlerThread == null) {
            return;
        }
        handlerThread.quitSafely();
    }

    private Rect a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("dc25c9a1", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
        int intValue = Float.valueOf(300 * f3).intValue();
        int b = b(Float.valueOf(((f2 / com.d(this.f6619a)) * 2000.0f) - 1000.0f).intValue(), intValue);
        int b2 = b(Float.valueOf((((com.c(this.f6619a) - f) / com.c(this.f6619a)) * 2000.0f) - 1000.0f).intValue(), intValue);
        return new Rect(b, b2, b + intValue, intValue + b2);
    }

    private static int b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90f78dfc", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (Math.abs(i) + i2 <= 1000) {
            return i - (i2 / 2);
        }
        return i > 0 ? 1000 - i2 : i2 - 1000;
    }

    private synchronized void b(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39755e8c", new Object[]{this, point});
            return;
        }
        Camera camera = this.b;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (parameters.getMaxNumFocusAreas() <= 0) {
            try {
                camera.autoFocus(this);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            camera.cancelAutoFocus();
        } catch (Exception unused2) {
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Rect a2 = a(point.x, point.y, 1.0f);
        Rect a3 = a(point.x, point.y, 1.5f);
        arrayList.add(new Camera.Area(a2, 1000));
        arrayList2.add(new Camera.Area(a3, 1000));
        parameters.setMeteringAreas(arrayList2);
        parameters.setFocusMode("auto");
        parameters.setFocusAreas(arrayList);
        try {
            camera.setParameters(parameters);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            camera.autoFocus(this);
        } catch (Exception unused3) {
        }
    }

    @Override // tb.cqe
    public void a(final Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10257a0b", new Object[]{this, point});
        } else {
            this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.a(c.this, point);
                    }
                }
            });
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedbc0d2", new Object[]{this, new Boolean(z), camera});
        } else if (z) {
        } else {
            cot.b("Camera1_CameraWrapper", "failed to onAutoFocus", new Object[0]);
        }
    }

    private void a(a aVar, byte[] bArr, Camera camera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22c8a75", new Object[]{this, aVar, bArr, camera, new Boolean(z)});
        } else if (aVar == null) {
        } else {
            if (camera == null) {
                aVar.a(bArr, 0, 0, 0, z);
                return;
            }
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            int i = previewSize.width;
            int i2 = previewSize.height;
            int m = m();
            cot.a("PltCamera", "Camera1_CameraWrapper", "--onTakePicture front=" + z + ", rotate=" + m);
            aVar.a(bArr, i, i2, m, z);
        }
    }

    @Override // tb.cqe
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        if (!com.etao.feimagesearch.config.b.aM()) {
            return 0;
        }
        if (this.t < 0) {
            this.t = g.a(this.f6619a);
        }
        return this.t;
    }

    @Override // tb.cqe
    public boolean a(int i, int i2) {
        Camera.Parameters parameters;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Camera camera = this.b;
        if (camera == null || (parameters = camera.getParameters()) == null || !parameters.isZoomSupported() || i < 0 || (b = b(camera)) < 0) {
            return false;
        }
        final int min = Math.min((i * b) / 15, b);
        int zoom = parameters.getZoom();
        if (i2 == 1) {
            if (min <= zoom) {
                return false;
            }
        } else if (i2 == 2) {
            if (min >= zoom) {
                return false;
            }
        } else if (min == zoom) {
            return false;
        }
        this.i.post(new ac() { // from class: com.etao.feimagesearch.cip.camera.c.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                Camera f = c.f(c.this);
                if (f == null) {
                    return;
                }
                try {
                    Camera.Parameters parameters2 = f.getParameters();
                    if (parameters2 == null) {
                        return;
                    }
                    parameters2.setZoom(min);
                    f.setParameters(parameters2);
                } catch (Exception e) {
                    cot.a("PltCamera", "Camera1_CameraWrapper", cot.a("changeZoom", e));
                }
            }
        });
        return true;
    }
}
