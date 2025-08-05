package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.camera.AutoFitSurfaceView;
import com.etao.feimagesearch.cip.camera.e;
import com.etao.feimagesearch.cip.camera.f;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.view.CameraZoomView;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.taobao.taobao.R;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cpd extends ctc<cpc, com.etao.feimagesearch.model.b, CaptureManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion;

    /* renamed from: a  reason: collision with root package name */
    private com.etao.feimagesearch.cip.camera.d f26378a;
    private CameraZoomView f;
    public FrameLayout g;
    private long h;

    /* loaded from: classes3.dex */
    public static final class a implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: tb.cpd$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C1098a extends ac {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Bitmap b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ boolean d;

            public C1098a(Bitmap bitmap, boolean z, boolean z2) {
                this.b = bitmap;
                this.c = z;
                this.d = z2;
            }

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                com.etao.feimagesearch.structure.capture.d r;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                CaptureManager j = cpd.this.j();
                if (j == null || (r = j.r()) == null) {
                    return;
                }
                r.a(this.b, this.c, this.d);
            }
        }

        public a() {
        }

        @Override // com.etao.feimagesearch.cip.camera.e
        public void a(Bitmap bitmap, boolean z, f fVar, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa1524d1", new Object[]{this, bitmap, new Boolean(z), fVar, new Boolean(z2)});
                return;
            }
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "onPictureTake", 19999, new String[0]);
            Activity activity = cpd.a(cpd.this);
            q.a((Object) activity, "activity");
            if (activity.isFinishing()) {
                return;
            }
            if (bitmap == null) {
                cot.c("AutoSize_CaptureCameraViewV2", "snapshot or yuvImage is null");
            } else {
                ad.c("onCaptureFinished", new C1098a(bitmap, z, z2));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public static final class a extends ac {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CameraZoomView f26382a;
            public final /* synthetic */ d b;

            public a(CameraZoomView cameraZoomView, d dVar) {
                this.f26382a = cameraZoomView;
                this.b = dVar;
            }

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                ((FrameLayout) cpd.this.s().findViewById(R.id.view_zoom_container)).addView(this.f26382a, new FrameLayout.LayoutParams(-1, -1));
                this.f26382a.setCallback(new CameraZoomView.a() { // from class: tb.cpd.d.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.structure.capture.view.CameraZoomView.a
                    public final void a(float f) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                        } else {
                            cpd.this.a(f);
                        }
                    }
                });
            }
        }

        public d() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cpd cpdVar = cpd.this;
            CameraZoomView cameraZoomView = new CameraZoomView(cpdVar.s());
            ad.a("addZoomView", new a(cameraZoomView, this), 1000L);
            cpd.a(cpdVar, cameraZoomView);
        }
    }

    static {
        kge.a(-373049180);
        Companion = new b(null);
    }

    public static /* synthetic */ Object ipc$super(cpd cpdVar, String str, Object... objArr) {
        if (str.hashCode() == 93762283) {
            super.d();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ Activity a(cpd cpdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("956c0f67", new Object[]{cpdVar}) : cpdVar.d;
    }

    public static final /* synthetic */ void a(cpd cpdVar, CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff0d4bd", new Object[]{cpdVar, cameraZoomView});
        } else {
            cpdVar.f = cameraZoomView;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tb.cpc, tb.ctb] */
    @Override // tb.ctc
    public /* synthetic */ cpc b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : a();
    }

    /* loaded from: classes3.dex */
    public static final class b {
        static {
            kge.a(311437036);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpd(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> parent) {
        super(activity, parent);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    public cpc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpc) ipChange.ipc$dispatch("f035648", new Object[]{this}) : new cpc();
    }

    @Override // tb.ctc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View findViewById = s().findViewById(R.id.fl_camera_container);
        if (findViewById == null) {
            q.a();
        }
        this.g = (FrameLayout) findViewById;
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            q.b("rootView");
        }
        AutoFitSurfaceView autoFitSurfaceView = (AutoFitSurfaceView) frameLayout.findViewById(R.id.camera_surface_view);
        Activity activity = this.d;
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        com.etao.feimagesearch.cip.camera.d dVar = new com.etao.feimagesearch.cip.camera.d(activity, frameLayout2, autoFitSurfaceView, j());
        dVar.a((cqh) this.b);
        this.f26378a = dVar;
        j().a(new d());
    }

    @Override // tb.ctc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null) {
            return;
        }
        dVar.a((cqh) this.b);
    }

    public final void t_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb426572", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null) {
            return;
        }
        dVar.d();
    }

    public final void u_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf73e11", new Object[]{this});
            return;
        }
        cot.c("AutoSize_CaptureCameraViewV2", "resumeCamera");
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar != null) {
            dVar.g();
        }
        CameraZoomView cameraZoomView = this.f;
        if (cameraZoomView == null) {
            return;
        }
        cameraZoomView.reset();
        cameraZoomView.setVisibility(0);
    }

    public final void v_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceac16b0", new Object[]{this});
            return;
        }
        cpc cpcVar = (cpc) this.b;
        if (cpcVar == null) {
            return;
        }
        cpcVar.s_();
    }

    public final void w_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d060ef4f", new Object[]{this});
            return;
        }
        cpc cpcVar = (cpc) this.b;
        if (cpcVar == null) {
            return;
        }
        cpcVar.e();
    }

    public final void x_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d215c7ee", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null) {
            return;
        }
        dVar.i();
        dVar.h();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null) {
            return;
        }
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        manager.e(true ^ dVar.j());
        dVar.k();
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null) {
            return;
        }
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        manager.e(z);
        dVar.a(z);
        if (!com.etao.feimagesearch.config.b.cy()) {
            return;
        }
        y_();
    }

    public final void y_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3caa08d", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null || !dVar.n()) {
            return;
        }
        dVar.m();
        j().f(false);
        coy.a("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "5");
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null || dVar.n()) {
            return;
        }
        cox.b("PhotoSearchTake", "FlashLamp", new String[0]);
        dVar.l();
        j().f(true);
        coy.a("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "5");
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null) {
            return 0;
        }
        return dVar.f();
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null) {
            return 0;
        }
        return dVar.o();
    }

    public final void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f22aaa", new Object[]{this, eVar});
            return;
        }
        cot.a("PltCamera", "AutoSize_CaptureCameraViewV2", "takePicture");
        if (Math.abs(System.currentTimeMillis() - this.h) < 1000) {
            if (eVar != null) {
                eVar.a(null, false, null, false);
            }
            cot.a("PltCamera", "AutoSize_CaptureCameraViewV2", "takePicture too often");
            return;
        }
        this.h = System.currentTimeMillis();
        if (eVar == null) {
            eVar = new a();
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null) {
            eVar.a(null, false, null, false);
            return;
        }
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        dVar.a(eVar, true, manager.D());
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        com.etao.feimagesearch.cip.camera.d dVar = this.f26378a;
        if (dVar == null || !dVar.e()) {
            return;
        }
        try {
            coy.a("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "2");
            j().d(true);
            dVar.a(f);
        } catch (Exception e) {
            cot.a("PltCamera", "AutoSize_CaptureCameraViewV2", cot.a("zoom", e));
        }
    }

    @Override // tb.ctc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        cot.a("PltCamera", "AutoSize_CaptureCameraViewV2", "execScreenChanged screenType=" + i);
        cpc cpcVar = (cpc) this.b;
        if (cpcVar != null && cpcVar.d()) {
            w_();
            t_();
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            q.b("rootView");
        }
        frameLayout.removeAllViews();
        Activity activity = this.d;
        q.a((Object) activity, "activity");
        AutoFitSurfaceView autoFitSurfaceView = new AutoFitSurfaceView(activity, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        autoFitSurfaceView.setLayoutParams(layoutParams);
        frameLayout.addView(autoFitSurfaceView, new FrameLayout.LayoutParams(-1, -1));
        com.etao.feimagesearch.cip.camera.d dVar = new com.etao.feimagesearch.cip.camera.d(this.d, frameLayout, autoFitSurfaceView, j());
        this.f26378a = dVar;
        dVar.a((cqh) this.b);
        cpc cpcVar2 = (cpc) this.b;
        if (cpcVar2 == null) {
            return;
        }
        cpcVar2.s_();
        cpcVar2.a();
    }
}
