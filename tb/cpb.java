package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.controller.CaptureV2Controller$updateScreenshotSearchFloatBarState$1;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.msg.g;
import com.etao.feimagesearch.k;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.h;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.etao.feimagesearch.util.al;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cpb extends cpt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "CaptureV2Controller";

    /* renamed from: a  reason: collision with root package name */
    private cph f26371a;
    private Dialog b;
    private boolean c;
    private fhr d;
    private boolean e;
    private boolean f;
    private int g;
    private boolean h;

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cpb cpbVar = cpb.this;
            cpb.a(cpbVar, new cph(cpbVar.o()));
            ad.c("execute_capture_view", new ac() { // from class: tb.cpb.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    cph a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    cot.c(cpb.TAG, "lifecycleState=" + cpb.d(cpb.this));
                    int d = cpb.d(cpb.this);
                    if (d == 2) {
                        cph a3 = cpb.a(cpb.this);
                        if (a3 == null) {
                            return;
                        }
                        a3.d();
                    } else if (d == 3) {
                        cph a4 = cpb.a(cpb.this);
                        if (a4 == null) {
                            return;
                        }
                        a4.B_();
                    } else if (d != 4) {
                        if (d != 5 || (a2 = cpb.a(cpb.this)) == null) {
                            return;
                        }
                        a2.f();
                    } else {
                        cph a5 = cpb.a(cpb.this);
                        if (a5 == null) {
                            return;
                        }
                        a5.e();
                    }
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else {
                cpb.this.e();
            }
        }
    }

    static {
        kge.a(-543126301);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(cpb cpbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.cpt
    public void a(JSONObject params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, params});
        } else {
            q.c(params, "params");
        }
    }

    @Override // tb.cpt
    public boolean a(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e8cd358", new Object[]{this, keyEvent})).booleanValue();
        }
        return false;
    }

    public static final /* synthetic */ cph a(cpb cpbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cph) ipChange.ipc$dispatch("94f781c8", new Object[]{cpbVar}) : cpbVar.f26371a;
    }

    public static final /* synthetic */ void a(cpb cpbVar, cph cphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c707518", new Object[]{cpbVar, cphVar});
        } else {
            cpbVar.f26371a = cphVar;
        }
    }

    public static final /* synthetic */ void a(cpb cpbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b54e11", new Object[]{cpbVar, new Boolean(z)});
        } else {
            cpbVar.e = z;
        }
    }

    public static final /* synthetic */ void c(cpb cpbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e29625", new Object[]{cpbVar});
        } else {
            cpbVar.n();
        }
    }

    public static final /* synthetic */ int d(cpb cpbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af659c99", new Object[]{cpbVar})).intValue() : cpbVar.g;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(1841035371);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpb(Activity activity, boolean z) {
        super(activity);
        q.c(activity, "activity");
        this.f = z;
        this.e = true;
        this.g = 1;
    }

    @Override // tb.cpt
    public View a(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ddc46abd", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.c(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.feis_activity_capture_v2, viewGroup, false);
        q.a((Object) inflate, "inflater.inflate(R.layou…ure_v2, container, false)");
        return inflate;
    }

    @Override // tb.cpt
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.h = com.etao.feimagesearch.config.b.Q();
        CaptureManager.n = this.f;
        if (this.h) {
            Thread thread = new Thread(new b(), "plt_capture" + hashCode());
            thread.setPriority(10);
            thread.start();
            return;
        }
        this.f26371a = new cph(o());
    }

    @Override // tb.cpt
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TLogTracker.a();
        this.g = 2;
        cph cphVar = this.f26371a;
        if (cphVar != null) {
            cphVar.d();
        }
        if (this.c) {
            this.c = false;
            n();
            return;
        }
        q();
    }

    @Override // tb.cpt
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TLogTracker.b();
        this.g = 3;
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.B_();
    }

    @Override // tb.cpt
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.g = 4;
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.e();
    }

    @Override // tb.cpt
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TLogTracker.c();
        this.g = 5;
        fhq.INSTANCE.b(this.d);
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.f();
    }

    @Override // tb.cpt
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        if (cphVar.A_().isOtherChannelPhotoSearch() && com.etao.feimagesearch.view.a.a(o())) {
            this.b = new com.etao.feimagesearch.view.a(o());
            Dialog dialog = this.b;
            if (dialog != null) {
                dialog.setOnDismissListener(new c());
            }
            Dialog dialog2 = this.b;
            if (dialog2 == null) {
                return;
            }
            dialog2.show();
            return;
        }
        cphVar.t();
    }

    @Override // tb.cpt
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.a(i, i2, intent);
    }

    @Override // tb.cpt
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.a(z);
    }

    @Override // tb.cpt
    public void a(int i, String[] strArr, int[] iArr) {
        cph cphVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6953b2", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (strArr == null || iArr == null || (cphVar = this.f26371a) == null) {
        } else {
            cphVar.a(i, strArr, iArr);
        }
    }

    @Override // tb.cpt
    public void a(Intent intent) {
        cph cphVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null || !com.etao.feimagesearch.config.b.bm() || (cphVar = this.f26371a) == null) {
        } else {
            cphVar.a(intent);
        }
    }

    @Override // tb.cpt
    public int f() {
        CaptureManager i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        cph cphVar = this.f26371a;
        if (cphVar != null && (i = cphVar.i()) != null) {
            return i.p();
        }
        return 1;
    }

    @Override // tb.cpt
    public void a(String scene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, scene});
            return;
        }
        q.c(scene, "scene");
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.a(scene, false);
    }

    @Override // tb.cpt
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.l();
    }

    @Override // tb.cpt
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.k();
    }

    @Override // tb.cpt
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.b(z);
    }

    @Override // tb.cpt
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.m();
    }

    @Override // tb.cpt
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.n();
    }

    @Override // tb.cpt
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.o();
    }

    @Override // tb.cpt
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.p();
    }

    @Override // tb.cpt
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.c(z);
    }

    @Override // tb.cpt
    public void a(MusOuterAlbumBean albumBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40d1b01", new Object[]{this, albumBean});
            return;
        }
        q.c(albumBean, "albumBean");
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.a(albumBean);
    }

    @Override // tb.cpt
    public void a(DynCaptureImgGotConfig imgGotConfig, cpy callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6258ac", new Object[]{this, imgGotConfig, callback});
            return;
        }
        q.c(imgGotConfig, "imgGotConfig");
        q.c(callback, "callback");
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.a(imgGotConfig, callback);
    }

    @Override // tb.cpt
    public void a(DynCaptureImgGotConfig imgGotConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a172c768", new Object[]{this, imgGotConfig});
            return;
        }
        q.c(imgGotConfig, "imgGotConfig");
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.a(imgGotConfig);
    }

    @Override // tb.cpt
    public void a(boolean z, boolean z2, cpx callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1eae9cd", new Object[]{this, new Boolean(z), new Boolean(z2), callback});
            return;
        }
        q.c(callback, "callback");
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return;
        }
        cphVar.a(z, z2, callback);
    }

    @Override // tb.cpt
    public boolean a(adt adtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a6c5731", new Object[]{this, adtVar, new Boolean(z)})).booleanValue();
        }
        cph cphVar = this.f26371a;
        if (cphVar == null) {
            return false;
        }
        return cphVar.a(adtVar, z);
    }

    @Override // tb.cpt
    public boolean p() {
        CaptureManager i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        cph cphVar = this.f26371a;
        return q.a((Object) ((cphVar == null || (i = cphVar.i()) == null) ? null : i.q()), (Object) "scan");
    }

    @Override // tb.cpt
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(com.b())) {
        } else {
            o().startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + o().getPackageName())));
            this.c = true;
        }
    }

    @Override // tb.cpt
    public void a(boolean z, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc7e183", new Object[]{this, new Boolean(z), bVar});
            return;
        }
        if (z) {
            fhq.INSTANCE.a();
        } else {
            fhq.INSTANCE.b();
        }
        k.a(com.b(), cpe.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT, String.valueOf(z));
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!al.c()) {
        } else {
            fhq.INSTANCE.a();
            k.a(com.b(), cpe.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT, "true");
        }
    }

    private final void q() {
        CaptureManager i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        cph cphVar = this.f26371a;
        h y = (cphVar == null || (i = cphVar.i()) == null) ? null : i.y();
        if (this.d == null && y != null) {
            this.d = new fhr(false, new CaptureV2Controller$updateScreenshotSearchFloatBarState$1(this, y));
            fhq.INSTANCE.a(this.d);
        }
        if (!com.etao.feimagesearch.config.b.cY()) {
            return;
        }
        if (al.c()) {
            fhq.INSTANCE.c();
        } else if (y == null) {
        } else {
            y.a(new g(false, 1, null));
        }
    }
}
