package tb;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import android.view.WindowManager;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.downgrade.e;
import com.zoloz.android.phone.zdoc.camera.widget.CameraSurfaceView;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class rrh implements Camera.AutoFocusMoveCallback, rrm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Camera f33331a;
    public rrl b;
    public boolean d;
    public boolean e;
    private Context g;
    private Camera.Parameters h;
    private int i;
    private int j;
    private boolean q;
    private boolean r;
    private Handler u;
    private HandlerThread v;
    private final int f = 5000;
    public int c = 90;
    private rrk k = new rrk();
    private final Object l = new Object();
    private int m = 0;
    private int n = 0;
    private int o = 0;
    private int p = 0;
    private boolean s = true;
    private boolean t = false;
    private Runnable w = new Runnable() { // from class: tb.rrh.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (rrh.this.f33331a == null) {
            } else {
                Camera.Parameters parameters = rrh.this.f33331a.getParameters();
                int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                if (maxNumFocusAreas > 0) {
                    parameters.setFocusAreas(null);
                }
                if (maxNumMeteringAreas > 0) {
                    parameters.setMeteringAreas(null);
                }
                rrh.a(rrh.this, parameters);
            }
        }
    };

    static {
        kge.a(1801944130);
        kge.a(-1119165248);
        kge.a(-1713845977);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    public static /* synthetic */ int a(rrh rrhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd9423a3", new Object[]{rrhVar})).intValue() : rrhVar.m;
    }

    public static /* synthetic */ void a(rrh rrhVar, Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e555f9d", new Object[]{rrhVar, parameters});
        } else {
            rrhVar.a(parameters);
        }
    }

    public static /* synthetic */ int b(rrh rrhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec172a24", new Object[]{rrhVar})).intValue() : rrhVar.n;
    }

    public static /* synthetic */ int c(rrh rrhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da9a30a5", new Object[]{rrhVar})).intValue() : rrhVar.o;
    }

    public static /* synthetic */ int d(rrh rrhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c91d3726", new Object[]{rrhVar})).intValue() : rrhVar.p;
    }

    public static /* synthetic */ boolean e(rrh rrhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7a03db8", new Object[]{rrhVar})).booleanValue() : rrhVar.t;
    }

    private void a(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce49ac55", new Object[]{this, parameters});
            return;
        }
        String a2 = a(parameters, this.s);
        if (!StringUtils.isEmpty(a2)) {
            parameters.setFocusMode(a2);
        }
        this.f33331a.setParameters(parameters);
        this.f33331a.setAutoFocusMoveCallback(this);
    }

    public rrh(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        this.g = context;
        this.q = false;
        this.r = false;
        this.d = false;
        this.e = false;
        this.v = new HandlerThread("Camera-work");
        this.v.start();
        this.u = new Handler(this.v.getLooper());
    }

    @Override // tb.rrm
    public void a(rrk rrkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9580cd", new Object[]{this, rrkVar});
        } else if (this.q) {
        } else {
            a(rrv.ZTECH_ENTER);
            if (rrkVar != null) {
                this.k = rrkVar;
            }
            this.q = true;
        }
    }

    @Override // tb.rrm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Handler handler = this.u;
        if (handler != null) {
            handler.removeCallbacks(this.w);
            if (Build.VERSION.SDK_INT >= 18) {
                this.v.quitSafely();
            }
        }
        c();
        if (!this.q) {
            return;
        }
        this.q = false;
        this.g = null;
        CameraSurfaceView.release();
    }

    private void a(String str) {
        ZimRecordService zimRecordService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (BioServiceManager.getCurrentInstance() == null || (zimRecordService = (ZimRecordService) BioServiceManager.getCurrentInstance().getBioService(ZimRecordService.class)) == null) {
                return;
            }
            MetaRecord metaRecord = new MetaRecord("UC-YWRLSB-161114-21", "event", "20000189", str, 1);
            HashMap hashMap = new HashMap();
            hashMap.put("module", e.HARDWARE);
            zimRecordService.write(metaRecord, hashMap);
        } catch (Exception e) {
            BioLog.e(e);
        }
    }

    @Override // tb.rrm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d) {
        } else {
            rrk rrkVar = this.k;
            int d = (rrkVar == null || rrkVar.c()) ? 1 : this.k.d();
            this.j = Camera.getNumberOfCameras();
            if (!a(rrn.a(this.g, d, this.j))) {
                return;
            }
            this.d = true;
        }
    }

    @Override // tb.rrm
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d();
        if (!this.d) {
            return;
        }
        Handler handler = this.u;
        if (handler != null) {
            handler.removeCallbacks(this.w);
        }
        if (this.f33331a != null) {
            synchronized (this.l) {
                try {
                    this.f33331a.release();
                    this.f33331a = null;
                    this.d = false;
                } catch (Exception e) {
                    BioLog.e(e.toString());
                }
            }
            return;
        }
        this.d = false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.e || this.f33331a == null) {
        } else {
            synchronized (this.l) {
                try {
                    this.f33331a.setOneShotPreviewCallback(null);
                    this.f33331a.setPreviewCallback(null);
                    this.f33331a.stopPreview();
                } catch (Exception e) {
                    BioLog.e(e.toString());
                }
            }
            this.b = null;
            this.e = false;
        }
    }

    @Override // tb.rrm
    public void a(rrl rrlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd95f52c", new Object[]{this, rrlVar});
        } else {
            this.b = rrlVar;
        }
    }

    @Override // tb.rrm
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.c;
    }

    @Override // tb.rrm
    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.m;
    }

    @Override // tb.rrm
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.n;
    }

    @Override // tb.rrm
    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.o;
    }

    @Override // tb.rrm
    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.p;
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        BioLog.i("realStartCamera");
        try {
            this.f33331a = Camera.open(i);
        } catch (Exception unused) {
            rrl rrlVar = this.b;
            if (rrlVar != null) {
                rrlVar.onError(-1);
            }
        } catch (Throwable unused2) {
            rrl rrlVar2 = this.b;
            if (rrlVar2 != null) {
                rrlVar2.onError(-1);
            }
        }
        if (this.f33331a == null) {
            if (this.b != null) {
                this.b.onError(-1);
            }
            return false;
        }
        this.i = i;
        if (this.f33331a != null) {
            this.h = this.f33331a.getParameters();
            k();
            if (this.b != null) {
                this.f33331a.setPreviewCallback(new Camera.PreviewCallback() { // from class: tb.rrh.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.hardware.Camera.PreviewCallback
                    public void onPreviewFrame(byte[] bArr, Camera camera) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("83a13143", new Object[]{this, bArr, camera});
                        } else if (bArr == null || rrh.this.b == null) {
                        } else {
                            rrj rrjVar = new rrj(ByteBuffer.wrap(bArr), rrh.a(rrh.this), rrh.b(rrh.this), 0, null, 0, 0, rrh.c(rrh.this), rrh.d(rrh.this));
                            rrjVar.a(rrh.e(rrh.this));
                            rrh.this.b.onPreviewFrame(rrjVar);
                        }
                    }
                });
            }
            return true;
        }
        return false;
    }

    private int b(rrk rrkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec188741", new Object[]{this, rrkVar})).intValue();
        }
        if (rrkVar == null) {
            throw new IllegalArgumentException("deviceSetting can't be null");
        }
        if (rrkVar.a()) {
            return b(this.i);
        }
        return rrkVar.b();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (this.h != null) {
            if (this.i == rrn.b()) {
                this.s = false;
                l();
            } else {
                this.s = true;
            }
        }
        j();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.h == null) {
        } else {
            Camera.Size a2 = rrn.a().a(this.h.getSupportedPreviewSizes(), DisplayUtil.getScreenRate(this.g), this.k.f(), this.k.e());
            if (a2 != null) {
                this.o = a2.width;
                this.p = a2.height;
                int i = this.o;
                this.m = i;
                int i2 = this.p;
                this.n = i2;
                this.h.setPreviewSize(i, i2);
            }
            rrk rrkVar = this.k;
            if (rrkVar != null) {
                this.c = b(rrkVar);
            }
            a(this.h);
        }
    }

    private String a(Camera.Parameters parameters, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("728be561", new Object[]{this, parameters, new Boolean(z)});
        }
        if (this.f33331a == null) {
            return null;
        }
        String str = z ? "continuous-video" : "continuous-picture";
        if (parameters.getSupportedFocusModes().contains(str)) {
            return str;
        }
        if (parameters.getSupportedFocusModes().contains("auto")) {
            return "auto";
        }
        if (parameters.getSupportedFocusModes().contains("macro")) {
            return "macro";
        }
        if (parameters.getSupportedFocusModes().contains("fixed")) {
            return "fixed";
        }
        if (parameters.getSupportedFocusModes().size() != 1) {
            return null;
        }
        return parameters.getSupportedFocusModes().get(0);
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) this.g.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getRotation();
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

    @Override // android.hardware.Camera.AutoFocusMoveCallback
    public void onAutoFocusMoving(boolean z, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5289e140", new Object[]{this, new Boolean(z), camera});
        } else {
            this.t = !z;
        }
    }
}
