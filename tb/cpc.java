package tb;

import android.content.DialogInterface;
import android.support.v4.app.ActivityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.view.CameraZoomView;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.al;
import com.taobao.runtimepermission.f;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cpc extends ctb<cpd> implements CameraZoomView.a, cqh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int PERMISSION_CODE = 100;
    public static final String TAG = "CaptureCameraPresenterV2";
    private boolean c;
    private boolean d;
    private boolean e;
    private final boolean g = com.etao.feimagesearch.config.b.aq();
    private final AtomicBoolean h = new AtomicBoolean(false);
    private Boolean i;

    /* loaded from: classes3.dex */
    public static final class b extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.a("PltCamera", cpc.TAG, "OnPermissionGranted");
            cpc.a(cpc.this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.a("PltCamera", cpc.TAG, "OnPermissionDenied");
            cpc.b(cpc.this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            cpd view = cpc.c(cpc.this);
            q.a((Object) view, "view");
            cou.a(view.s(), 0);
            cot.a("PltCamera", cpc.TAG, "jump to permission guide page");
        }
    }

    static {
        kge.a(-875517823);
        kge.a(-1040246050);
        kge.a(-1218673675);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(cpc cpcVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -713066196) {
            super.z_();
            return null;
        } else if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 91915241) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b();
            return null;
        }
    }

    public static final /* synthetic */ void a(cpc cpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3dcfd82", new Object[]{cpcVar});
        } else {
            cpcVar.j();
        }
    }

    public static final /* synthetic */ void b(cpc cpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2600403", new Object[]{cpcVar});
        } else {
            cpcVar.i();
        }
    }

    public static final /* synthetic */ cpd c(cpc cpcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpd) ipChange.ipc$dispatch("f91fe0cb", new Object[]{cpcVar}) : (cpd) cpcVar.f26504a;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-504584567);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // tb.ctb
    public void z_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f792c", new Object[]{this});
            return;
        }
        super.z_();
        if (!this.g) {
            return;
        }
        cot.a("PltCamera", TAG, "try openCameraImpl onCreate");
        s_();
    }

    @Override // tb.ctb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        s_();
    }

    @Override // tb.ctb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        if (!this.d) {
            return;
        }
        e();
    }

    @Override // tb.ctb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.d) {
        } else {
            ((cpd) this.f26504a).t_();
        }
    }

    public final void s_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98d8cd3", new Object[]{this});
            return;
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        if (al.b(((cpd) view).s())) {
            j();
        } else if (this.c) {
        } else {
            this.c = true;
            boolean aj = com.etao.feimagesearch.config.b.aj();
            cot.a("PltCamera", TAG, "request camera permission isPermissionReqOptEnable=" + aj);
            if (aj) {
                f.a(com.b(), new String[]{com.taobao.speech.util.e.CAMERA}).b("biz_imgsearch").a(new b()).b(new c()).a(true).a(com.alibaba.ability.localization.b.a(R.string.feis_request_camera_explain)).a(com.etao.feimagesearch.config.b.cZ()).a();
                return;
            }
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            ActivityCompat.requestPermissions(((cpd) view2).s(), new String[]{com.taobao.speech.util.e.CAMERA}, 100);
        }
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        com.taobao.search.common.util.d.a(((cpd) view).s(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_prompt), com.etao.feimagesearch.config.b.f(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18914)), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18965), new d(), com.alibaba.ability.localization.b.a(R.string.irp_error_message_cancel_text), e.INSTANCE, false, 128, null);
    }

    /* loaded from: classes3.dex */
    public static final class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else if (dialogInterface == null) {
            } else {
                dialogInterface.cancel();
            }
        }
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.d = true;
        k();
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        cot.a("PltCamera", TAG, "resumeCamera cameraRunning=" + this.e);
        if (this.e) {
            return;
        }
        this.e = true;
        ((cpd) this.f26504a).u_();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        cot.a("PltCamera", TAG, "pauseCamera cameraRunning=" + this.e);
        if (!this.e) {
            return;
        }
        ((cpd) this.f26504a).x_();
        this.e = false;
    }

    @Override // tb.cqh
    public void a(byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a9dac3", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
            return;
        }
        try {
            if (!this.h.get()) {
                this.h.set(true);
            }
            T view = this.f26504a;
            q.a((Object) view, "view");
            CaptureManager j = ((cpd) view).j();
            q.a((Object) j, "view.manager");
            if (!j.c()) {
                return;
            }
            Boolean bool = this.i;
            boolean booleanValue = bool != null ? bool.booleanValue() : com.etao.feimagesearch.config.b.di();
            if (this.b && booleanValue) {
                return;
            }
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            CaptureManager j2 = ((cpd) view2).j();
            q.a((Object) j2, "view.manager");
            for (cth cthVar : j2.s()) {
                cthVar.a(bArr, i, i2, ((cpd) this.f26504a).l(), ((cpd) this.f26504a).m(), i3, z, i4);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.view.CameraZoomView.a
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            ((cpd) this.f26504a).a(f);
        }
    }
}
