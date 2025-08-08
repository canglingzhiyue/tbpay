package com.etao.feimagesearch.cip.camera2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import mtopsdk.common.util.StringUtils;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.camera.c;
import com.etao.feimagesearch.cip.camera2.a;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ae;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import tb.cot;
import tb.coy;
import tb.cqe;
import tb.cqf;
import tb.cqg;
import tb.cqh;
import tb.jbg;
import tb.kge;

/* loaded from: classes3.dex */
public final class Camera2Wrapper implements cqe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int IMAGE_BUFFER_SIZE = 1;
    public static final String TAG = "Camera2_Camera2Wrapper";
    public static final String TAG_PREFIX = "Camera2_";
    private static final Size w;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6636a;
    private cqg b;
    private cqf c;
    private volatile boolean d;
    private volatile boolean e;
    private volatile boolean f;
    private cqh g;
    private final CameraManager h;
    private final Handler i;
    private final HandlerThread j;
    private final Handler k;
    private volatile CameraOpenState l;
    private CameraDevice m;
    private CameraCharacteristics n;
    private String o;
    private CameraCaptureSession p;
    private SurfaceHolder q;
    private ImageReader r;
    private Size s;
    private final AtomicBoolean t;
    private CaptureRequest.Builder u;
    private com.etao.feimagesearch.cip.camera2.b v;
    private int x;
    private final Activity y;

    /* loaded from: classes3.dex */
    public enum CameraOpenState {
        IDLE,
        OPENING,
        OPENED,
        SESSION_CREATING,
        SESSION_CREATED
    }

    /* loaded from: classes3.dex */
    public static final class f extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Camera2Wrapper.n(Camera2Wrapper.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Size b;

        public h(Size size) {
            this.b = size;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cqg m = Camera2Wrapper.m(Camera2Wrapper.this);
            if (m == null) {
                return;
            }
            m.a(this.b.getWidth(), this.b.getHeight());
        }
    }

    /* loaded from: classes3.dex */
    public static final class i extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c.a f6643a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ boolean f;

        public i(c.a aVar, byte[] bArr, int i, int i2, int i3, boolean z) {
            this.f6643a = aVar;
            this.b = bArr;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = z;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f6643a.a(this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class j extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "callbackOnOpenFailedCamera2", 19999, new String[0]);
            cqf l = Camera2Wrapper.l(Camera2Wrapper.this);
            if (l == null) {
                return;
            }
            l.b();
        }
    }

    /* loaded from: classes3.dex */
    public static final class k extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cqf l = Camera2Wrapper.l(Camera2Wrapper.this);
            if (l != null) {
                l.a();
            }
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "callbackOpenSuccessCamera2", 19999, new String[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static final class m extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Camera2Wrapper.p(Camera2Wrapper.this).quitSafely();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class o extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.a("PltCamera", Camera2Wrapper.TAG, "call clearEnvironment");
            Camera2Wrapper.c(Camera2Wrapper.this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class p extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ c.a b;

        public p(c.a aVar) {
            this.b = aVar;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Camera2Wrapper.a(Camera2Wrapper.this, this.b);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class r extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Camera2Wrapper.o(Camera2Wrapper.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class s extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public s(boolean z) {
            this.b = z;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Camera2Wrapper.a(Camera2Wrapper.this, this.b);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class t extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;

        public t(float f) {
            this.b = f;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Camera2Wrapper.a(Camera2Wrapper.this, this.b);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class u extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public u(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Camera2Wrapper.a(Camera2Wrapper.this, this.b, this.c);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g<T> implements Comparator<Size> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final g INSTANCE = new g();

        @Override // java.util.Comparator
        public /* synthetic */ int compare(Size size, Size size2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, size, size2})).intValue() : a(size, size2);
        }

        public final int a(Size lhs, Size rhs) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("55d99f7b", new Object[]{this, lhs, rhs})).intValue();
            }
            kotlin.jvm.internal.q.a((Object) lhs, "lhs");
            int width = lhs.getWidth();
            kotlin.jvm.internal.q.a((Object) rhs, "rhs");
            return width - rhs.getWidth();
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(990362372);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public Camera2Wrapper(Activity outContext) {
        kotlin.jvm.internal.q.c(outContext, "outContext");
        this.y = outContext;
        this.f6636a = this.y.getApplicationContext();
        CameraManager cameraManager = (CameraManager) this.f6636a.getSystemService(BlobManager.BLOB_ELEM_TYPE_CAMERA);
        if (cameraManager != null) {
            this.h = cameraManager;
            this.i = new Handler(Looper.getMainLooper());
            HandlerThread a2 = jbg.a("Camera2Wrapper_" + hashCode());
            a2.start();
            this.j = a2;
            HandlerThread workerThread = this.j;
            kotlin.jvm.internal.q.a((Object) workerThread, "workerThread");
            this.k = new Handler(workerThread.getLooper());
            this.l = CameraOpenState.IDLE;
            this.o = "";
            this.t = new AtomicBoolean(false);
            this.x = -1;
            if (!com.etao.feimagesearch.cip.camera2.a.Companion.a()) {
                throw new RuntimeException("camera2 not supported");
            }
            if (StringUtils.isEmpty(a(this.h, false))) {
                throw new RuntimeException("cannot get prop cameraId");
            }
            return;
        }
        throw new RuntimeException("cannot get cameraManager");
    }

    public static final /* synthetic */ CameraOpenState a(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraOpenState) ipChange.ipc$dispatch("8949f7d4", new Object[]{camera2Wrapper}) : camera2Wrapper.l;
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92da6183", new Object[]{camera2Wrapper, new Float(f2)});
        } else {
            camera2Wrapper.b(f2);
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, float f2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c87241e0", new Object[]{camera2Wrapper, new Float(f2), new Integer(i2)});
        } else {
            camera2Wrapper.a(f2, i2);
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, CameraCaptureSession cameraCaptureSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9ede66", new Object[]{camera2Wrapper, cameraCaptureSession});
        } else {
            camera2Wrapper.p = cameraCaptureSession;
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, CameraDevice cameraDevice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50dd4c0", new Object[]{camera2Wrapper, cameraDevice});
        } else {
            camera2Wrapper.m = cameraDevice;
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, CameraDevice cameraDevice, CameraCharacteristics cameraCharacteristics, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e199794f", new Object[]{camera2Wrapper, cameraDevice, cameraCharacteristics, new Boolean(z)});
        } else {
            camera2Wrapper.a(cameraDevice, cameraCharacteristics, z);
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, CameraDevice cameraDevice, SurfaceHolder surfaceHolder, CameraCharacteristics cameraCharacteristics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f593a5", new Object[]{camera2Wrapper, cameraDevice, surfaceHolder, cameraCharacteristics});
        } else {
            camera2Wrapper.a(cameraDevice, surfaceHolder, cameraCharacteristics);
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, CaptureRequest.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734c127b", new Object[]{camera2Wrapper, builder});
        } else {
            camera2Wrapper.u = builder;
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98539dd", new Object[]{camera2Wrapper, surfaceHolder});
        } else {
            camera2Wrapper.q = surfaceHolder;
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f50ffa", new Object[]{camera2Wrapper, aVar});
        } else {
            camera2Wrapper.b(aVar);
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, c.a aVar, byte[] bArr, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3ace52", new Object[]{camera2Wrapper, aVar, bArr, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else {
            camera2Wrapper.a(aVar, bArr, i2, i3, i4, z);
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, CameraOpenState cameraOpenState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea1238a", new Object[]{camera2Wrapper, cameraOpenState});
        } else {
            camera2Wrapper.l = cameraOpenState;
        }
    }

    public static final /* synthetic */ void a(Camera2Wrapper camera2Wrapper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92daac97", new Object[]{camera2Wrapper, new Boolean(z)});
        } else {
            camera2Wrapper.c(z);
        }
    }

    public static final /* synthetic */ CameraDevice b(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraDevice) ipChange.ipc$dispatch("ae89caa9", new Object[]{camera2Wrapper}) : camera2Wrapper.m;
    }

    public static final /* synthetic */ void c(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5ae79b", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.j();
        }
    }

    public static final /* synthetic */ Context d(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3c144b72", new Object[]{camera2Wrapper}) : camera2Wrapper.f6636a;
    }

    public static final /* synthetic */ void e(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc78d59", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.i();
        }
    }

    public static final /* synthetic */ Handler f(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("57b0b38e", new Object[]{camera2Wrapper}) : camera2Wrapper.k;
    }

    public static final /* synthetic */ cqh g(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cqh) ipChange.ipc$dispatch("cffe8115", new Object[]{camera2Wrapper}) : camera2Wrapper.g;
    }

    public static final /* synthetic */ boolean h(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d36a85fa", new Object[]{camera2Wrapper})).booleanValue() : camera2Wrapper.e;
    }

    public static final /* synthetic */ ImageReader i(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageReader) ipChange.ipc$dispatch("271b9b13", new Object[]{camera2Wrapper}) : camera2Wrapper.r;
    }

    public static final /* synthetic */ CameraCharacteristics j(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraCharacteristics) ipChange.ipc$dispatch("5fa57587", new Object[]{camera2Wrapper}) : camera2Wrapper.n;
    }

    public static final /* synthetic */ void k(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70d7e93", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.h();
        }
    }

    public static final /* synthetic */ cqf l(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cqf) ipChange.ipc$dispatch("91cc161c", new Object[]{camera2Wrapper}) : camera2Wrapper.c;
    }

    public static final /* synthetic */ cqg m(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cqg) ipChange.ipc$dispatch("855b9a7c", new Object[]{camera2Wrapper}) : camera2Wrapper.b;
    }

    public static final /* synthetic */ void n(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab07730", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.dv_();
        }
    }

    public static final /* synthetic */ void o(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe6ca0f", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.n();
        }
    }

    public static final /* synthetic */ HandlerThread p(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("cdfa506e", new Object[]{camera2Wrapper}) : camera2Wrapper.j;
    }

    public static final /* synthetic */ int q(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("de536fc0", new Object[]{camera2Wrapper})).intValue() : camera2Wrapper.o();
    }

    static {
        kge.a(1573456572);
        kge.a(695887560);
        Companion = new a(null);
        w = new Size(1280, 720);
    }

    @Override // tb.cqe
    public void a(cqg listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ece67f", new Object[]{this, listener});
            return;
        }
        kotlin.jvm.internal.q.c(listener, "listener");
        cot.a("PltCamera", TAG, "setCameraSizeListener");
        this.b = listener;
    }

    @Override // tb.cqe
    public void a(cqf cameraCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ec7220", new Object[]{this, cameraCallback});
            return;
        }
        kotlin.jvm.internal.q.c(cameraCallback, "cameraCallback");
        cot.a("PltCamera", TAG, "setCameraCallback");
        this.c = cameraCallback;
    }

    @Override // tb.cqe
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f;
    }

    @Override // tb.cqe
    public void a(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f2)});
            return;
        }
        cot.a("PltCamera", TAG, "zoomIn " + f2);
        this.k.post(new t(f2));
    }

    @Override // tb.cqe
    public boolean a(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        this.k.post(new u(i2, i3));
        return true;
    }

    private final void b(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f2)});
        } else if (this.u == null) {
            cot.a("PltCamera", TAG, "previewBuilder is " + this.u);
        } else {
            com.etao.feimagesearch.cip.camera2.b bVar = this.v;
            if (bVar == null) {
                return;
            }
            cot.a("PltCamera", TAG, "zoomInInBackground " + bVar.b);
            CaptureRequest.Builder builder = this.u;
            if (builder == null) {
                kotlin.jvm.internal.q.a();
            }
            bVar.a(builder, f2);
            CameraCaptureSession cameraCaptureSession = this.p;
            if (cameraCaptureSession == null) {
                return;
            }
            cot.a("PltCamera", TAG, "setRepeatingRequest");
            CaptureRequest.Builder builder2 = this.u;
            if (builder2 == null) {
                kotlin.jvm.internal.q.a();
            }
            cameraCaptureSession.setRepeatingRequest(builder2.build(), null, this.k);
        }
    }

    private final void a(float f2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f2), new Integer(i2)});
            return;
        }
        CaptureRequest.Builder builder = this.u;
        if (builder == null) {
            cot.a("PltCamera", TAG, "previewBuilder is " + this.u);
            return;
        }
        com.etao.feimagesearch.cip.camera2.b bVar = this.v;
        if (bVar == null) {
            return;
        }
        cot.a("PltCamera", TAG, "zoomInInBackground " + bVar.b);
        bVar.a(builder, f2, i2);
        CameraCaptureSession cameraCaptureSession = this.p;
        if (cameraCaptureSession == null) {
            return;
        }
        cot.a("PltCamera", TAG, "setRepeatingRequest");
        cameraCaptureSession.setRepeatingRequest(builder.build(), null, this.k);
    }

    @Override // tb.cqe
    public void a(c.a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317d6f0f", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.c(callback, "callback");
        cot.a("PltCamera", TAG, "takePicture " + callback);
        this.k.post(new p(callback));
    }

    private final void b(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f469d86e", new Object[]{this, aVar});
        } else if (this.m == null || this.s == null || this.p == null || this.r == null) {
            a(aVar, null, 0, 0, 0, this.e);
        } else {
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(2);
            CameraDevice cameraDevice = this.m;
            if (cameraDevice == null) {
                kotlin.jvm.internal.q.a();
            }
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
            kotlin.jvm.internal.q.a((Object) createCaptureRequest, "cameraDevice!!.createCap…e.TEMPLATE_STILL_CAPTURE)");
            SurfaceHolder surfaceHolder = this.q;
            if (surfaceHolder != null) {
                createCaptureRequest.addTarget(surfaceHolder.getSurface());
            }
            ImageReader imageReader = this.r;
            if (imageReader != null) {
                createCaptureRequest.addTarget(imageReader.getSurface());
                imageReader.setOnImageAvailableListener(new e(this, arrayBlockingQueue), this.k);
            }
            q qVar = new q(aVar, arrayBlockingQueue);
            CameraCaptureSession cameraCaptureSession = this.p;
            if (cameraCaptureSession == null) {
                kotlin.jvm.internal.q.a();
            }
            cameraCaptureSession.capture(createCaptureRequest.build(), qVar, this.k);
        }
    }

    /* loaded from: classes3.dex */
    public static final class q extends CameraCaptureSession.CaptureCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ c.a b;
        public final /* synthetic */ ArrayBlockingQueue c;

        public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
            if (str.hashCode() == -2108141758) {
                super.onCaptureCompleted((CameraCaptureSession) objArr[0], (CaptureRequest) objArr[1], (TotalCaptureResult) objArr[2]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public q(c.a aVar, ArrayBlockingQueue arrayBlockingQueue) {
            this.b = aVar;
            this.c = arrayBlockingQueue;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("775f1a7d", new Object[]{this, session, request, failure});
                return;
            }
            kotlin.jvm.internal.q.c(session, "session");
            kotlin.jvm.internal.q.c(request, "request");
            kotlin.jvm.internal.q.c(failure, "failure");
            Camera2Wrapper camera2Wrapper = Camera2Wrapper.this;
            Camera2Wrapper.a(camera2Wrapper, this.b, null, 0, 0, 0, Camera2Wrapper.h(camera2Wrapper));
            ImageReader i = Camera2Wrapper.i(Camera2Wrapper.this);
            if (i == null) {
                return;
            }
            i.setOnImageAvailableListener(new d(), Camera2Wrapper.f(Camera2Wrapper.this));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82584f42", new Object[]{this, session, request, result});
                return;
            }
            kotlin.jvm.internal.q.c(session, "session");
            kotlin.jvm.internal.q.c(request, "request");
            kotlin.jvm.internal.q.c(result, "result");
            cot.a("PltCamera", Camera2Wrapper.TAG, "onCaptureCompleted");
            super.onCaptureCompleted(session, request, result);
            int q = Camera2Wrapper.j(Camera2Wrapper.this) != null ? Camera2Wrapper.q(Camera2Wrapper.this) : 0;
            Pair pair = (Pair) this.c.peek();
            if (pair != null) {
                cot.a("PltCamera", Camera2Wrapper.TAG, "take photo success realCameraFront = " + Camera2Wrapper.h(Camera2Wrapper.this) + ", orientation = " + q);
                Camera2Wrapper.a(Camera2Wrapper.this, this.b, (byte[]) pair.getFirst(), ((Size) pair.getSecond()).getWidth(), ((Size) pair.getSecond()).getHeight(), q, Camera2Wrapper.h(Camera2Wrapper.this));
            }
            this.c.clear();
            ImageReader i = Camera2Wrapper.i(Camera2Wrapper.this);
            if (i == null) {
                return;
            }
            i.setOnImageAvailableListener(new d(), Camera2Wrapper.f(Camera2Wrapper.this));
        }
    }

    private final void a(c.a aVar, byte[] bArr, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a2c9a7", new Object[]{this, aVar, bArr, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else {
            this.k.post(new i(aVar, bArr, i2, i3, i4, z));
        }
    }

    @Override // tb.cqe
    public void a(cqh callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ed5ade", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.c(callback, "callback");
        cot.a("PltCamera", TAG, "setPreviewFrameCallback");
        this.g = callback;
    }

    @Override // tb.cqe
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        if (!com.etao.feimagesearch.config.b.aM()) {
            cot.c(TAG, "getDisplayRotation 0");
            return 0;
        }
        if (this.x < 0) {
            this.x = com.etao.feimagesearch.cip.camera.g.a(this.y);
            cot.c(TAG, "getDisplayRotation displayRotation=" + this.x);
        }
        return this.x;
    }

    @Override // tb.cqe
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("openCamera: cameraNum ");
        sb.append(this.h.getCameraIdList().length);
        sb.append(" openState: ");
        sb.append(this.l);
        sb.append(", threadName ");
        Thread currentThread = Thread.currentThread();
        kotlin.jvm.internal.q.a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        cot.a("PltCamera", TAG, sb.toString());
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "callOpenCamera2", 19999, new String[0]);
        this.k.post(new l());
    }

    /* loaded from: classes3.dex */
    public static final class l extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            if (str.hashCode() == -73738099) {
                super.a((Throwable) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public l() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                Camera2Wrapper.k(Camera2Wrapper.this);
            }
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a(Throwable th) {
            String message;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                return;
            }
            super.a(th);
            if (th == null) {
                message = "throwable is null";
            } else {
                message = th.getMessage();
                if (message == null) {
                    message = "e.message is null";
                }
            }
            cot.a("PltCamera", Camera2Wrapper.TAG, "openCamera error " + message);
            a.C0223a c0223a = com.etao.feimagesearch.cip.camera2.a.Companion;
            Context context = Camera2Wrapper.d(Camera2Wrapper.this);
            kotlin.jvm.internal.q.a((Object) context, "context");
            c0223a.a(context, message);
            Camera2Wrapper.e(Camera2Wrapper.this);
        }
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (StringUtils.isEmpty(this.o)) {
            Size l2 = l();
            if (l2 != null) {
                this.s = l2;
            } else {
                cot.a("PltCamera", TAG, "openCameraInBackground: cannot get preview size");
                i();
                a.C0223a c0223a = com.etao.feimagesearch.cip.camera2.a.Companion;
                Context context = this.f6636a;
                kotlin.jvm.internal.q.a((Object) context, "context");
                c0223a.a(context, "openCameraInBackground: cannot get preview size");
                return;
            }
        }
        CameraCharacteristics cameraCharacteristics = this.n;
        if (cameraCharacteristics != null) {
            this.v = new com.etao.feimagesearch.cip.camera2.b(cameraCharacteristics);
            if (!k()) {
                i();
                return;
            } else if (this.l != CameraOpenState.IDLE) {
                return;
            } else {
                this.l = CameraOpenState.OPENING;
                if (StringUtils.isEmpty(this.o)) {
                    a.C0223a c0223a2 = com.etao.feimagesearch.cip.camera2.a.Companion;
                    Context context2 = this.f6636a;
                    kotlin.jvm.internal.q.a((Object) context2, "context");
                    c0223a2.a(context2, "cameraId is empty");
                    i();
                    return;
                }
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 0) {
                    z = true;
                }
                this.e = z;
                c cVar = new c(this, cameraCharacteristics, this.e);
                cot.a("PltCamera", TAG, "try open camera");
                this.h.openCamera(this.o, cVar, this.k);
                return;
            }
        }
        cot.a("PltCamera", TAG, "cannot get cameraCharacteristics");
        a.C0223a c0223a3 = com.etao.feimagesearch.cip.camera2.a.Companion;
        Context context3 = this.f6636a;
        kotlin.jvm.internal.q.a((Object) context3, "context");
        c0223a3.a(context3, "cameraCharacteristics is null");
        i();
    }

    private final String a(CameraManager cameraManager, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("405dcb84", new Object[]{this, cameraManager, new Boolean(z)});
        }
        String[] cameraIdList = cameraManager.getCameraIdList();
        kotlin.jvm.internal.q.a((Object) cameraIdList, "cameraManager.cameraIdList");
        if (cameraIdList.length == 0) {
            cot.a("PltCamera", TAG, "cameraIdList is empty");
            return "";
        }
        int i2 = !z ? 1 : 0;
        String[] cameraIdList2 = cameraManager.getCameraIdList();
        kotlin.jvm.internal.q.a((Object) cameraIdList2, "cameraManager.cameraIdList");
        List<String> a2 = a(cameraIdList2, cameraManager, i2, 0);
        String[] cameraIdList3 = cameraManager.getCameraIdList();
        kotlin.jvm.internal.q.a((Object) cameraIdList3, "cameraManager.cameraIdList");
        List<String> a3 = a(cameraIdList3, cameraManager, z ? 1 : 0, 0);
        AtomicBoolean atomicBoolean = this.t;
        List<String> list = a2;
        if ((!list.isEmpty()) && (!a3.isEmpty())) {
            z2 = true;
        }
        atomicBoolean.set(z2);
        if (!list.isEmpty()) {
            cot.a("PltCamera", TAG, "firstChoiceCameraList size " + a2.size());
            return (String) kotlin.collections.p.h((List<? extends Object>) a2);
        } else if (!(!a3.isEmpty())) {
            return "";
        } else {
            cot.a("PltCamera", TAG, "backupCameraList size " + a3.size());
            return (String) kotlin.collections.p.h((List<? extends Object>) a3);
        }
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        cot.a("PltCamera", TAG, "onCameraOpenFailed");
        j();
        this.i.post(new j());
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ImageReader imageReader = this.r;
        if (imageReader != null) {
            try {
                imageReader.close();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.r = null;
                throw th;
            }
            this.r = null;
        }
        CameraCaptureSession cameraCaptureSession = this.p;
        if (cameraCaptureSession != null) {
            try {
                cameraCaptureSession.close();
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                this.p = null;
                throw th2;
            }
            this.p = null;
        }
        CameraDevice cameraDevice = this.m;
        if (cameraDevice != null) {
            try {
                cameraDevice.close();
            } catch (Exception unused3) {
            } catch (Throwable th3) {
                this.m = null;
                throw th3;
            }
            this.m = null;
        }
        this.l = CameraOpenState.IDLE;
        this.o = "";
        this.n = null;
        this.q = null;
        this.f = false;
        this.u = null;
    }

    private final void a(CameraDevice cameraDevice, CameraCharacteristics cameraCharacteristics, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa19ada", new Object[]{this, cameraDevice, cameraCharacteristics, new Boolean(z)});
            return;
        }
        cot.a("PltCamera", TAG, "onCameraOpenSuccess " + z);
        this.f = true;
        this.i.post(new k());
        SurfaceHolder surfaceHolder = this.q;
        if (surfaceHolder != null) {
            try {
                this.e = z;
                a(cameraDevice, surfaceHolder, cameraCharacteristics);
                return;
            } catch (Exception e2) {
                cot.a("PltCamera", TAG, String.valueOf(e2.getMessage()));
                return;
            }
        }
        cot.a("PltCamera", TAG, "surfaceHolder is null");
    }

    private final Size a(CameraCharacteristics cameraCharacteristics, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("8b985b13", new Object[]{this, cameraCharacteristics, cls});
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(cls) : null;
        if (outputSizes != null) {
            List<Size> i2 = kotlin.collections.g.i(outputSizes);
            Collections.sort(i2, g.INSTANCE);
            Size size = null;
            Size size2 = size;
            for (Size size3 : i2) {
                if (kotlin.jvm.internal.q.a(size3, w)) {
                    return size3;
                }
                kotlin.jvm.internal.q.a((Object) size3, "size");
                if (size3.getWidth() >= w.getWidth()) {
                    size = size3;
                } else if (size2 == null) {
                    size2 = size3;
                }
            }
            if (size == null) {
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "noBigPreviewSizeCamera2", 19999, new String[0]);
                if (size2 == null) {
                    coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "previewSizeIsEmptyCamera2", 19999, new String[0]);
                }
            }
            return size == null ? size2 : size;
        }
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "supportedSizesIsNullCamera2", 19999, new String[0]);
        return null;
    }

    private final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : ActivityCompat.checkSelfPermission(this.f6636a, com.taobao.speech.util.e.CAMERA) == 0;
    }

    @Override // tb.cqe
    public void a(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e175e8", new Object[]{this, surfaceHolder});
            return;
        }
        cot.a("PltCamera", TAG, "startPreview-- openState: " + this.l + " holder: " + surfaceHolder);
        if (this.s == null) {
            this.s = l();
            kotlin.t tVar = kotlin.t.INSTANCE;
        }
        Size size = this.s;
        if (size != null) {
            a(size);
            this.k.post(new n(surfaceHolder));
            return;
        }
        cot.a("PltCamera", TAG, "startPreview: cannot get preview size");
        i();
        a.C0223a c0223a = com.etao.feimagesearch.cip.camera2.a.Companion;
        Context context = this.f6636a;
        kotlin.jvm.internal.q.a((Object) context, "context");
        c0223a.a(context, "startPreview: cannot get preview size");
    }

    /* loaded from: classes3.dex */
    public static final class n extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ SurfaceHolder b;

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            if (str.hashCode() == -73738099) {
                super.a((Throwable) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public n(SurfaceHolder surfaceHolder) {
            this.b = surfaceHolder;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Camera2Wrapper.a(Camera2Wrapper.this, this.b);
            if (Camera2Wrapper.b(Camera2Wrapper.this) == null || this.b == null || Camera2Wrapper.j(Camera2Wrapper.this) == null) {
                cot.a("PltCamera", Camera2Wrapper.TAG, "cameraDevice: " + Camera2Wrapper.b(Camera2Wrapper.this) + ", holder: " + this.b + ", cameraCharacteristics: " + Camera2Wrapper.j(Camera2Wrapper.this));
                return;
            }
            cot.a("PltCamera", Camera2Wrapper.TAG, "startPreview call startPreviewInBackground");
            Camera2Wrapper camera2Wrapper = Camera2Wrapper.this;
            CameraDevice b = Camera2Wrapper.b(camera2Wrapper);
            if (b == null) {
                kotlin.jvm.internal.q.a();
            }
            SurfaceHolder surfaceHolder = this.b;
            CameraCharacteristics j = Camera2Wrapper.j(Camera2Wrapper.this);
            if (j == null) {
                kotlin.jvm.internal.q.a();
            }
            Camera2Wrapper.a(camera2Wrapper, b, surfaceHolder, j);
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                return;
            }
            super.a(th);
            String str = "startPreview onError: ";
            if (th instanceof Exception) {
                str = cot.a(str, th);
            }
            cot.a("PltCamera", Camera2Wrapper.TAG, str);
        }
    }

    private final Size l() {
        Size a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("d9ed236", new Object[]{this});
        }
        cot.a("PltCamera", TAG, "initPreviewSize");
        CameraCharacteristics cameraCharacteristics = this.n;
        if (cameraCharacteristics != null && (a2 = a(cameraCharacteristics, SurfaceHolder.class)) != null) {
            return a2;
        }
        this.o = a(this.h, this.d);
        if (StringUtils.isEmpty(this.o)) {
            return null;
        }
        cot.a("PltCamera", TAG, "realCameraId " + this.o);
        CameraCharacteristics cameraCharacteristics2 = this.h.getCameraCharacteristics(this.o);
        kotlin.jvm.internal.q.a((Object) cameraCharacteristics2, "cameraManager.getCameraCharacteristics(cameraId)");
        this.n = cameraCharacteristics2;
        return a(cameraCharacteristics2, SurfaceHolder.class);
    }

    private final void a(Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c5f8eb", new Object[]{this, size});
        } else if (ae.INSTANCE.a()) {
            cqg cqgVar = this.b;
            if (cqgVar == null) {
                return;
            }
            cqgVar.a(size.getWidth(), size.getHeight());
        } else {
            this.i.post(new h(size));
        }
    }

    private final void a(CameraDevice cameraDevice, SurfaceHolder surfaceHolder, CameraCharacteristics cameraCharacteristics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55fd33a", new Object[]{this, cameraDevice, surfaceHolder, cameraCharacteristics});
            return;
        }
        cot.a("PltCamera", TAG, "startPreviewInBackground: " + this.l + ' ' + this.s);
        if (this.l != CameraOpenState.OPENED) {
            return;
        }
        Surface surface = surfaceHolder.getSurface();
        kotlin.jvm.internal.q.a((Object) surface, "holder.surface");
        if (!surface.isValid()) {
            cot.a("PltCamera", TAG, "surface is not valid");
            return;
        }
        Size size = this.s;
        if (size != null) {
            ImageReader newInstance = ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, 2);
            newInstance.setOnImageAvailableListener(new d(), this.k);
            kotlin.jvm.internal.q.a((Object) newInstance, "this");
            List<Surface> b2 = kotlin.collections.p.b(surfaceHolder.getSurface(), newInstance.getSurface());
            b bVar = new b(this, cameraDevice, b2, cameraCharacteristics);
            try {
                this.l = CameraOpenState.SESSION_CREATING;
                cameraDevice.createCaptureSession(b2, bVar, this.k);
            } catch (CameraAccessException e2) {
                String str = "exception when createCaptureSession " + e2.getMessage();
                cot.a("PltCamera", TAG, str);
                a.C0223a c0223a = com.etao.feimagesearch.cip.camera2.a.Companion;
                Context context = this.f6636a;
                kotlin.jvm.internal.q.a((Object) context, "context");
                c0223a.a(context, str);
                i();
            }
            this.r = newInstance;
            return;
        }
        i();
    }

    @Override // tb.cqe
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        cot.a("PltCamera", TAG, "closeCamera");
        this.k.post(new f());
    }

    private final void dv_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789b3c14", new Object[]{this});
            return;
        }
        cot.a("PltCamera", TAG, "closeCameraInBackground call clearEnvironment");
        j();
    }

    @Override // tb.cqe
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        cot.a("PltCamera", TAG, "toggleCamera");
        this.k.post(new r());
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
            n();
        } else if (!this.d) {
        } else {
            n();
        }
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        cot.a("PltCamera", TAG, "toggleCameraInBackground: call closeCameraInBackground");
        dv_();
        this.d = true ^ this.d;
        cot.a("PltCamera", TAG, "toggleCameraInBackground: call openCameraInBackground");
        h();
    }

    @Override // tb.cqe
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        cot.a("PltCamera", TAG, "stopPreview");
        this.k.post(new o());
    }

    @Override // tb.cqe
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.e;
    }

    @Override // tb.cqe
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        cot.a("PltCamera", TAG, "toggleFlashLight " + z);
        this.k.post(new s(z));
    }

    private final void c(boolean z) {
        CaptureRequest.Builder builder;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            i2 = 2;
        }
        CameraCharacteristics cameraCharacteristics = this.n;
        if (cameraCharacteristics == null || ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)) == null || (builder = this.u) == null) {
            return;
        }
        cot.a("PltCamera", TAG, "CaptureRequest.FLASH_MODE " + i2);
        builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(i2));
        CameraCaptureSession cameraCaptureSession = this.p;
        if (cameraCaptureSession == null) {
            return;
        }
        cameraCaptureSession.setRepeatingRequest(builder.build(), null, this.k);
    }

    @Override // tb.cqe
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        cot.a("PltCamera", TAG, "release");
        c();
        this.k.post(new m());
    }

    @Override // tb.cqe
    public void a(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10257a0b", new Object[]{this, point});
            return;
        }
        kotlin.jvm.internal.q.c(point, "point");
        cot.a("PltCamera", TAG, "manualFocus");
    }

    /* loaded from: classes3.dex */
    public final class c extends CameraDevice.StateCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Camera2Wrapper f6638a;
        private final CameraCharacteristics b;
        private final boolean c;

        static {
            kge.a(-1284663615);
        }

        public c(Camera2Wrapper camera2Wrapper, CameraCharacteristics cameraCharacteristics, boolean z) {
            kotlin.jvm.internal.q.c(cameraCharacteristics, "cameraCharacteristics");
            this.f6638a = camera2Wrapper;
            this.b = cameraCharacteristics;
            this.c = z;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice camera) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88acbeae", new Object[]{this, camera});
                return;
            }
            kotlin.jvm.internal.q.c(camera, "camera");
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "onOpenedCamera2", 19999, new String[0]);
            cot.a("PltCamera", Camera2Wrapper.TAG, "onOpened");
            Camera2Wrapper.a(this.f6638a, CameraOpenState.OPENED);
            Camera2Wrapper.a(this.f6638a, camera);
            Camera2Wrapper.a(this.f6638a, camera, this.b, this.c);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice camera) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18d0fcdc", new Object[]{this, camera});
                return;
            }
            kotlin.jvm.internal.q.c(camera, "camera");
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "onDisconnectedCamera2", 19999, new String[0]);
            cot.a("PltCamera", Camera2Wrapper.TAG, "onDisconnected");
            Camera2Wrapper.c(this.f6638a);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice camera, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfa2f4d6", new Object[]{this, camera, new Integer(i)});
                return;
            }
            kotlin.jvm.internal.q.c(camera, "camera");
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "onOpenErrorCamera2", 19999, new String[0]);
            cot.a("PltCamera", Camera2Wrapper.TAG, "PltCameraStateCallback: onError " + i);
            Camera2Wrapper.a(this.f6638a, CameraOpenState.IDLE);
            a.C0223a c0223a = com.etao.feimagesearch.cip.camera2.a.Companion;
            Context context = Camera2Wrapper.d(this.f6638a);
            kotlin.jvm.internal.q.a((Object) context, "context");
            c0223a.a(context, "PltCameraStateCallback onError: " + i);
            Camera2Wrapper.e(this.f6638a);
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends CameraCaptureSession.StateCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Camera2Wrapper f6637a;
        private final CameraDevice b;
        private final List<Surface> c;
        private final CameraCharacteristics d;

        static {
            kge.a(1680842709);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Camera2Wrapper camera2Wrapper, CameraDevice camera, List<? extends Surface> surfaceList, CameraCharacteristics characteristics) {
            kotlin.jvm.internal.q.c(camera, "camera");
            kotlin.jvm.internal.q.c(surfaceList, "surfaceList");
            kotlin.jvm.internal.q.c(characteristics, "characteristics");
            this.f6637a = camera2Wrapper;
            this.b = camera;
            this.c = surfaceList;
            this.d = characteristics;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession session) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f41541df", new Object[]{this, session});
                return;
            }
            kotlin.jvm.internal.q.c(session, "session");
            try {
                cot.a("PltCamera", Camera2Wrapper.TAG, "onConfigured: " + Camera2Wrapper.a(this.f6637a));
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "onConfiguredCamera2", 19999, new String[0]);
                if (Camera2Wrapper.a(this.f6637a) == CameraOpenState.SESSION_CREATING) {
                    Camera2Wrapper.a(this.f6637a, CameraOpenState.SESSION_CREATED);
                    Camera2Wrapper.a(this.f6637a, session);
                    Camera2Wrapper camera2Wrapper = this.f6637a;
                    CaptureRequest.Builder createCaptureRequest = this.b.createCaptureRequest(1);
                    for (Surface surface : this.c) {
                        createCaptureRequest.addTarget(surface);
                    }
                    createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    if (((Boolean) this.d.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)) != null) {
                        cot.a("PltCamera", Camera2Wrapper.TAG, "setAutoFlash");
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    }
                    session.setRepeatingRequest(createCaptureRequest.build(), null, Camera2Wrapper.f(this.f6637a));
                    Camera2Wrapper.a(camera2Wrapper, createCaptureRequest);
                    return;
                }
                cot.a("PltCamera", Camera2Wrapper.TAG, "onConfigured: openState " + Camera2Wrapper.a(this.f6637a));
            } catch (Exception e) {
                cot.a("PltCamera", Camera2Wrapper.TAG, cot.a("onConfigured:", e));
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession session) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e939a918", new Object[]{this, session});
                return;
            }
            kotlin.jvm.internal.q.c(session, "session");
            cot.a("PltCamera", Camera2Wrapper.TAG, "onConfigureFailed " + Camera2Wrapper.a(this.f6637a));
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "onConfigureFailedCamera2", 19999, new String[0]);
            a.C0223a c0223a = com.etao.feimagesearch.cip.camera2.a.Companion;
            Context context = Camera2Wrapper.d(this.f6637a);
            kotlin.jvm.internal.q.a((Object) context, "context");
            c0223a.a(context, "onConfigureFailed");
            Camera2Wrapper.e(this.f6637a);
        }
    }

    /* loaded from: classes3.dex */
    public final class e implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Camera2Wrapper f6640a;
        private final ArrayBlockingQueue<Pair<byte[], Size>> b;

        static {
            kge.a(-389708732);
            kge.a(387417682);
        }

        public e(Camera2Wrapper camera2Wrapper, ArrayBlockingQueue<Pair<byte[], Size>> imageQueue) {
            kotlin.jvm.internal.q.c(imageQueue, "imageQueue");
            this.f6640a = camera2Wrapper;
            this.b = imageQueue;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image acquireLatestImage;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
            } else if (imageReader == null || (acquireLatestImage = imageReader.acquireLatestImage()) == null) {
            } else {
                cot.a("PltCamera", Camera2Wrapper.TAG, "take photo success");
                if (this.b.size() <= 1) {
                    byte[] data = com.etao.feimagesearch.util.p.a(acquireLatestImage);
                    kotlin.jvm.internal.q.a((Object) data, "data");
                    this.b.add(new Pair<>(data, new Size(acquireLatestImage.getWidth(), acquireLatestImage.getHeight())));
                }
                acquireLatestImage.close();
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class d implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1277825301);
            kge.a(387417682);
        }

        public d() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image acquireLatestImage;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
            } else if (imageReader == null || (acquireLatestImage = imageReader.acquireLatestImage()) == null) {
            } else {
                byte[] a2 = com.etao.feimagesearch.util.p.a(acquireLatestImage);
                cqh g = Camera2Wrapper.g(Camera2Wrapper.this);
                if (g != null) {
                    g.a(a2, acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), 17, Camera2Wrapper.h(Camera2Wrapper.this), Camera2Wrapper.q(Camera2Wrapper.this));
                }
                acquireLatestImage.close();
            }
        }
    }

    private final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        if (this.x < 0) {
            this.x = com.etao.feimagesearch.cip.camera.g.a(this.y);
        }
        return this.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: AssertionError -> 0x0068, TRY_ENTER, TryCatch #0 {AssertionError -> 0x0068, blocks: (B:6:0x002b, B:8:0x0036, B:9:0x0038, B:12:0x004c, B:14:0x0052, B:19:0x005f, B:20:0x0062, B:21:0x0065), top: B:26:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<java.lang.String> a(java.lang.String[] r9, android.hardware.camera2.CameraManager r10, int r11, int r12) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.cip.camera2.Camera2Wrapper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2b
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            r9 = 2
            r1[r9] = r10
            r9 = 3
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            r1[r9] = r10
            r9 = 4
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r12)
            r1[r9] = r10
            java.lang.String r9 = "8fd35740"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.util.List r9 = (java.util.List) r9
            return r9
        L2b:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.AssertionError -> L68
            r0.<init>()     // Catch: java.lang.AssertionError -> L68
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.AssertionError -> L68
            int r1 = r9.length     // Catch: java.lang.AssertionError -> L68
            r4 = 0
        L34:
            if (r4 >= r1) goto L65
            r5 = r9[r4]     // Catch: java.lang.AssertionError -> L68
            android.hardware.camera2.CameraCharacteristics r6 = r10.getCameraCharacteristics(r5)     // Catch: java.lang.Exception -> L5c java.lang.AssertionError -> L68
            java.lang.String r7 = "cameraManager.getCameraCharacteristics(it)"
            kotlin.jvm.internal.q.a(r6, r7)     // Catch: java.lang.Exception -> L5c java.lang.AssertionError -> L68
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch: java.lang.Exception -> L5c java.lang.AssertionError -> L68
            java.lang.Object r7 = r6.get(r7)     // Catch: java.lang.Exception -> L5c java.lang.AssertionError -> L68
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> L5c java.lang.AssertionError -> L68
            if (r7 != 0) goto L4c
            goto L5c
        L4c:
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L5c java.lang.AssertionError -> L68
            if (r7 != r11) goto L5c
            com.etao.feimagesearch.cip.camera2.a$a r7 = com.etao.feimagesearch.cip.camera2.a.Companion     // Catch: java.lang.Exception -> L5c java.lang.AssertionError -> L68
            boolean r6 = r7.a(r12, r6)     // Catch: java.lang.Exception -> L5c java.lang.AssertionError -> L68
            if (r6 == 0) goto L5c
            r6 = 1
            goto L5d
        L5c:
            r6 = 0
        L5d:
            if (r6 == 0) goto L62
            r0.add(r5)     // Catch: java.lang.AssertionError -> L68
        L62:
            int r4 = r4 + 1
            goto L34
        L65:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.AssertionError -> L68
            goto L70
        L68:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            r0 = r9
            java.util.List r0 = (java.util.List) r0
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.cip.camera2.Camera2Wrapper.a(java.lang.String[], android.hardware.camera2.CameraManager, int, int):java.util.List");
    }
}
