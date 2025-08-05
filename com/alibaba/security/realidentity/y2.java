package com.alibaba.security.realidentity;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Pair;
import android.view.WindowManager;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class y2 extends x2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public Throwable B;
    public boolean C;
    public Throwable D;
    public Throwable E;
    public Camera q;
    public p3 r;
    public boolean s;
    public final int t;
    public int u;
    public Camera.CameraInfo v;
    public List<Camera.Size> w;
    public List<int[]> x;
    public int[] y;
    public Camera.Parameters z;

    /* loaded from: classes3.dex */
    public class a implements Camera.PreviewCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3606a;

        public a(int i) {
            this.f3606a = i;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83a13143", new Object[]{this, bArr, camera});
                return;
            }
            y2.this.a(bArr, this.f3606a);
            if (!y2.a(y2.this) || y2.b(y2.this) == null || bArr == null) {
                return;
            }
            y2.b(y2.this).a(bArr);
        }
    }

    public y2(Context context, RPBizConfig rPBizConfig) {
        super(context, rPBizConfig);
        this.t = 30;
    }

    public static /* synthetic */ boolean a(y2 y2Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3a1ec5d", new Object[]{y2Var})).booleanValue() : y2Var.s;
    }

    public static /* synthetic */ p3 b(y2 y2Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p3) ipChange.ipc$dispatch("43dcb283", new Object[]{y2Var}) : y2Var.r;
    }

    private Point c(Point point) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Point) ipChange.ipc$dispatch("cf14dacc", new Object[]{this, point}) : a(point);
    }

    public static /* synthetic */ Object ipc$super(y2 y2Var, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private Pair<Camera.CameraInfo, Integer> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("ec057640", new Object[]{this}) : a(1);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.C = false;
        this.A = false;
        this.E = null;
        this.D = null;
        this.B = null;
    }

    @Override // com.alibaba.security.realidentity.z2
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.q != null;
    }

    @Override // com.alibaba.security.realidentity.z2
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("previewNumber", Integer.valueOf(this.m));
        hashMap.put("finishCameraTime", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("isCameraClose", Boolean.valueOf(this.C));
        hashMap.put("closeException", d.b(this.D));
        hashMap.put("previewException", d.b(this.E));
        return b.a((Object) hashMap);
    }

    @Override // com.alibaba.security.realidentity.z2
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("displayRate", Integer.valueOf(this.f));
        hashMap.put("frameRate", Integer.valueOf(this.u));
        hashMap.put("cameraRotate", Integer.valueOf(this.g));
        hashMap.put("cameraInfo", b.a(this.v));
        hashMap.put("previewSize", b.a(this.b));
        hashMap.put("supportPreviewSize", b.a(this.w));
        hashMap.put("supportPreviewFpsRange", b.a(this.x));
        hashMap.put("currentPreviewFpsRange", b.a(this.y));
        hashMap.put("cameraParameters", b.a(this.z));
        hashMap.put("startCameraTime", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("isCameraOpen", Boolean.valueOf(this.A));
        hashMap.put("openException", d.b(this.B));
        return b.a((Object) hashMap);
    }

    @Override // com.alibaba.security.realidentity.x2, com.alibaba.security.realidentity.z2
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (this.q == null || !this.A) {
            return false;
        }
        return this.s;
    }

    @Override // com.alibaba.security.realidentity.x2
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (d()) {
            k();
        } else {
            p();
            try {
                Pair<Camera.CameraInfo, Integer> o = o();
                int intValue = o == null ? -1 : ((Integer) o.second).intValue();
                if (intValue == -1) {
                    a(e2.h, "find camera id fail");
                    return;
                }
                try {
                    Camera open = Camera.open(intValue);
                    this.q = open;
                    if (open == null) {
                        a(e2.h, "camera open fail by camera is null");
                        return;
                    }
                    Camera.Parameters parameters = open.getParameters();
                    this.z = parameters;
                    if (parameters == null) {
                        a(e2.h, "start preview fail by camera parameters get fail");
                        return;
                    }
                    try {
                        this.q.getParameters();
                        if (!a(this.q)) {
                            a(e2.i, "camera open fail by no permission");
                            return;
                        }
                        try {
                            this.z.setPictureFormat(256);
                            this.z.setPreviewFormat(17);
                            this.u = a(this.z, 30000) / 1000;
                            this.z.setRecordingHint(true);
                            a(this.z, 0.0f);
                            a(this.z);
                            a(this.c, true, intValue);
                            this.q.setDisplayOrientation(this.f);
                            List<String> supportedFocusModes = this.z.getSupportedFocusModes();
                            if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                                this.z.setFocusMode("continuous-video");
                            }
                            this.v = (Camera.CameraInfo) o.first;
                            this.q.setParameters(this.z);
                            this.g = this.v.orientation;
                            k();
                            n();
                            this.A = true;
                        } catch (Throwable th) {
                            this.B = th;
                            this.A = false;
                            f();
                            a(e2.h, "start preview fail: " + d.b(th));
                        }
                    } catch (Throwable th2) {
                        this.B = th2;
                        this.A = false;
                        a(e2.h, "camera open fail by parameters fail");
                    }
                } catch (Throwable th3) {
                    this.B = th3;
                    this.A = false;
                    a(e2.h, "camera open fail");
                }
            } catch (Exception unused) {
                a(e2.h, "find facing camera info fail");
            }
        }
    }

    @Override // com.alibaba.security.realidentity.x2
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Camera camera = this.q;
        if (camera == null) {
            return;
        }
        try {
            camera.stopPreview();
            this.q.setOneShotPreviewCallback(null);
            this.q.setPreviewCallback(null);
            this.q.release();
            a((q2) null, false);
            this.C = true;
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // com.alibaba.security.realidentity.x2
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.s = false;
        }
    }

    private boolean a(Camera camera) {
        try {
            Field declaredField = camera.getClass().getDeclaredField("mHasPermission");
            declaredField.setAccessible(true);
            return ((Boolean) declaredField.get(camera)).booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    private Point b(Point point) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Point) ipChange.ipc$dispatch("a13c406d", new Object[]{this, point}) : a(point);
    }

    private List<Point> b(List<Camera.Size> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            Point point = new Point();
            point.x = size.width;
            point.y = size.height;
            arrayList.add(point);
        }
        return arrayList;
    }

    @Override // com.alibaba.security.realidentity.z2
    public void a(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c82ee7", new Object[]{this, surfaceTexture});
        } else if (this.q == null || this.h) {
        } else {
            try {
                int i = this.v.orientation;
                this.q.setPreviewTexture(surfaceTexture);
                this.q.setPreviewCallback(new a(i));
                this.q.startPreview();
                this.h = true;
            } catch (Throwable th) {
                this.E = th;
            }
        }
    }

    @Override // com.alibaba.security.realidentity.z2
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.s) {
        } else {
            if (this.r == null) {
                this.r = new p3(this.c);
            }
            p3 p3Var = this.r;
            Point point = this.b;
            p3Var.a(point.x, point.y, this.u, this.g, this.j.getBasicsConfig().verifyToken);
            this.s = true;
        }
    }

    private void a(Camera.Parameters parameters, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faec460b", new Object[]{this, parameters, new Float(f)});
            return;
        }
        Point a2 = a(b(parameters.getSupportedPictureSizes()), f, 600);
        this.f3597a = a2;
        Point b = b(a2);
        this.f3597a = b;
        parameters.setPictureSize(b.x, b.y);
    }

    private void a(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce49ac55", new Object[]{this, parameters});
            return;
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        this.w = supportedPreviewSizes;
        Point a2 = a(b(supportedPreviewSizes));
        this.b = a2;
        Point c = c(a2);
        this.b = c;
        parameters.setPreviewSize(c.x, c.y);
    }

    private Pair<Camera.CameraInfo, Integer> a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a99f525", new Object[]{this, new Integer(i)});
        }
        Camera.CameraInfo cameraInfo = null;
        int i3 = -1;
        int numberOfCameras = Camera.getNumberOfCameras();
        while (true) {
            if (i2 >= numberOfCameras) {
                break;
            }
            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
            Camera.getCameraInfo(i2, cameraInfo2);
            if (cameraInfo2.facing == i) {
                i3 = i2;
                cameraInfo = cameraInfo2;
                break;
            }
            i2++;
        }
        return new Pair<>(cameraInfo, Integer.valueOf(i3));
    }

    private void a(Context context, boolean z, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6be70f", new Object[]{this, context, new Boolean(z), new Integer(i)});
            return;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i3 = 90;
            } else if (rotation == 2) {
                i3 = 180;
            } else if (rotation == 3) {
                i3 = 270;
            }
        }
        if (z) {
            i2 = (360 - ((cameraInfo.orientation + i3) % 360)) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i3) + 360) % 360;
        }
        this.f = i2;
    }

    @Override // com.alibaba.security.realidentity.z2
    public void a(q2 q2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f58ca3", new Object[]{this, q2Var, new Boolean(z)});
        } else if (!this.s) {
            if (q2Var == null) {
                return;
            }
            q2Var.a(null, this.g);
        } else {
            this.s = false;
            p3 p3Var = this.r;
            if (p3Var != null) {
                p3Var.a(q2Var, z);
            }
            this.r = null;
        }
    }

    private int a(Camera.Parameters parameters, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("faec5141", new Object[]{this, parameters, new Integer(i)})).intValue();
        }
        this.x = parameters.getSupportedPreviewFpsRange();
        int[] iArr = new int[2];
        this.y = iArr;
        parameters.getPreviewFpsRange(iArr);
        for (int[] iArr2 : this.x) {
            if (iArr2[0] == iArr2[1] && iArr2[0] == i) {
                parameters.setPreviewFpsRange(iArr2[0], iArr2[1]);
                return iArr2[0];
            }
        }
        int[] iArr3 = this.y;
        if (iArr3[0] == iArr3[1]) {
            return iArr3[0];
        }
        return iArr3[1] / 2;
    }
}
