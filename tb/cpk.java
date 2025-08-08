package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.a;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.scan.DecodeState;
import com.etao.feimagesearch.capture.scan.f;
import com.etao.feimagesearch.capture.scan.j;
import com.etao.feimagesearch.capture.scan.k;
import com.etao.feimagesearch.capture.scan.m;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.intelli.ClientModelType;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.p;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.g;
import com.etao.feimagesearch.util.af;
import com.etao.feimagesearch.util.n;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cpe;

/* loaded from: classes3.dex */
public final class cpk extends ctb<cpl> implements f, com.etao.feimagesearch.structure.capture.d, ctg, cth {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALBUM_PAGE_NAME = "Page_PhotoSearchAlbum";
    @Deprecated
    public static final a Companion;
    public static final String PAI_SPM = "a2141.7631739.0.0";
    public static final String TAG = "_scancode_CapturePaiPresenterV2";
    private boolean c;
    private boolean d;
    private boolean e;
    private com.etao.feimagesearch.structure.capture.e f;
    private g g;
    private j h;
    private com.etao.feimagesearch.album.e i;
    private amd j;
    private AlertDialog k;
    private boolean l;
    private Boolean m;
    private Boolean n;
    private dqg r;

    /* loaded from: classes3.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ctj b;

        public c(ctj ctjVar) {
            this.b = ctjVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            cpk.f();
            coy.a(cpk.ALBUM_PAGE_NAME, "GoScanPic", 2101, new String[0]);
            cpk.a(cpk.this, this.b);
            cpk.a(cpk.this, (AlertDialog) null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ctj c;

        public d(boolean z, ctj ctjVar) {
            this.b = z;
            this.c = ctjVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            com.etao.feimagesearch.newresult.perf.a.H();
            cpk.f();
            coy.a(cpk.ALBUM_PAGE_NAME, "GoPhotoTake", 2101, new String[0]);
            cpk cpkVar = cpk.this;
            boolean z = this.b;
            cti e = this.c.e();
            q.a((Object) e, "scanCodeFoundEvent.qrCodeNotFoundEvent");
            cpkVar.a(z, e);
            cpk.c(cpk.this).a(DecodeState.IDLE);
            cpk.c(cpk.this).a(false);
            cpk.a(cpk.this, (AlertDialog) null);
        }
    }

    static {
        kge.a(-1760077522);
        kge.a(1680162042);
        kge.a(129786070);
        kge.a(-208765815);
        kge.a(1206774849);
        Companion = new a(null);
    }

    public static final /* synthetic */ a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c4df2cfe", new Object[0]) : Companion;
    }

    public static /* synthetic */ Object ipc$super(cpk cpkVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -713066196:
                super.z_();
                return null;
            case 90991720:
                super.a();
                return null;
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ void a(cpk cpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e0a07a", new Object[]{cpkVar});
        } else {
            cpkVar.q();
        }
    }

    public static final /* synthetic */ void a(cpk cpkVar, AlertDialog alertDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989656b1", new Object[]{cpkVar, alertDialog});
        } else {
            cpkVar.k = alertDialog;
        }
    }

    public static final /* synthetic */ void a(cpk cpkVar, com.etao.feimagesearch.album.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd586b33", new Object[]{cpkVar, eVar});
        } else {
            cpkVar.i = eVar;
        }
    }

    public static final /* synthetic */ void a(cpk cpkVar, ctj ctjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e88c31", new Object[]{cpkVar, ctjVar});
        } else {
            cpkVar.a(ctjVar);
        }
    }

    public static final /* synthetic */ cpl b(cpk cpkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpl) ipChange.ipc$dispatch("b8a3a16c", new Object[]{cpkVar}) : (cpl) cpkVar.f26504a;
    }

    public static final /* synthetic */ j c(cpk cpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("11f2e7d", new Object[]{cpkVar});
        }
        j jVar = cpkVar.h;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        return jVar;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1490803978);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.ctb
    public void z_() {
        String str;
        ClientModelType f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f792c", new Object[]{this});
            return;
        }
        super.z_();
        T view = this.f26504a;
        q.a((Object) view, "view");
        Activity s = ((cpl) view).s();
        q.a((Object) s, "view.activity");
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        CaptureManager j = ((cpl) view2).j();
        q.a((Object) j, "view.manager");
        this.j = new amd(s, j);
        T view3 = this.f26504a;
        q.a((Object) view3, "view");
        CaptureManager j2 = ((cpl) view3).j();
        q.a((Object) j2, "view.manager");
        g i = j2.i();
        if (i == null || (f = i.f()) == null || (str = f.getType()) == null) {
            str = "";
        }
        T view4 = this.f26504a;
        q.a((Object) view4, "view");
        Activity s2 = ((cpl) view4).s();
        if (s2 != null) {
            T view5 = this.f26504a;
            q.a((Object) view5, "view");
            Activity s3 = ((cpl) view5).s();
            T view6 = this.f26504a;
            q.a((Object) view6, "view");
            T view7 = this.f26504a;
            q.a((Object) view7, "view");
            this.h = new j((FragmentActivity) s2, this, new k(s3, ((cpl) view6).h(), str, ((cpl) view7).j()));
            T view8 = this.f26504a;
            q.a((Object) view8, "view");
            ((cpl) view8).j().a((ctg) this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @Override // tb.ctb
    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        this.e = true;
        if (!this.c || this.b) {
            z = false;
        }
        e(z);
        this.e = false;
        T view = this.f26504a;
        q.a((Object) view, "view");
        ((cpl) view).h().updateSessionId();
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        ((cpl) view2).j().u();
        j jVar = this.h;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        jVar.d();
        d();
    }

    @Override // tb.ctb
    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        com.etao.feimagesearch.structure.capture.e eVar = this.f;
        if (eVar != null) {
            eVar.g();
        }
        if (this.c && !this.b) {
            z = true;
        }
        e(z);
        j jVar = this.h;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        jVar.f();
        AlertDialog alertDialog = this.k;
        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
        this.i = null;
        dqg dqgVar = this.r;
        if (dqgVar != null) {
            dqgVar.b();
        }
        q();
    }

    @Override // tb.ctb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        j jVar = this.h;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        jVar.b();
        T view = this.f26504a;
        q.a((Object) view, "view");
        ((cpl) view).j().b((ctg) this);
        com.etao.feimagesearch.nn.f.Companion.a().b();
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        CaptureManager j = ((cpl) view2).j();
        q.a((Object) j, "view.manager");
        if (!j.V()) {
            return;
        }
        com.etao.feimagesearch.mnn.featureextract.c cVar = com.etao.feimagesearch.mnn.featureextract.c.INSTANCE;
        T view3 = this.f26504a;
        q.a((Object) view3, "view");
        cVar.b(String.valueOf(((cpl) view3).s().hashCode()));
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (!z || this.b) {
            z2 = false;
        }
        e(z2);
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (z) {
            cpp cppVar = cpp.INSTANCE;
            T view = this.f26504a;
            q.a((Object) view, "view");
            Activity s = ((cpl) view).s();
            q.a((Object) s, "view.activity");
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            CaptureManager j = ((cpl) view2).j();
            q.a((Object) j, "view.manager");
            cppVar.b(s, j, true);
        } else {
            cpp cppVar2 = cpp.INSTANCE;
            T view3 = this.f26504a;
            q.a((Object) view3, "view");
            Activity s2 = ((cpl) view3).s();
            q.a((Object) s2, "view.activity");
            T view4 = this.f26504a;
            q.a((Object) view4, "view");
            CaptureManager j2 = ((cpl) view4).j();
            q.a((Object) j2, "view.manager");
            cppVar2.a(s2, j2, true);
        }
    }

    public final void a(MusOuterAlbumBean albumBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40d1b01", new Object[]{this, albumBean});
            return;
        }
        q.c(albumBean, "albumBean");
        if (StringUtils.isEmpty(albumBean.getImgKey())) {
            return;
        }
        String imgKey = albumBean.getImgKey();
        Float imgRotation = albumBean.getImgRotation();
        a(imgKey, (int) (imgRotation != null ? imgRotation.floatValue() : 0.0f), true, "");
    }

    public final void a(com.etao.feimagesearch.album.o oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2482dd", new Object[]{this, oVar, new Boolean(z)});
            return;
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        Activity s = ((cpl) view).s();
        q.a((Object) s, "view.activity");
        if (s.isFinishing() || oVar == null) {
            return;
        }
        if (oVar.c()) {
            a(oVar);
        } else {
            a(oVar.j().toString(), oVar.i(), z, oVar.n());
        }
    }

    @Override // tb.cth
    public void a(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1ee23", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6)});
            return;
        }
        try {
            if (k() || l()) {
                return;
            }
            j jVar = this.h;
            if (jVar == null) {
                q.b("scancodeBizManager");
            }
            if (jVar.g()) {
                return;
            }
            b(bArr, i, i2, i3, i4, i5, z, i6);
        } catch (Exception e2) {
            cot.a("TaoPaiPresenter", "onPreFrameDetect", e2);
        }
    }

    private final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (!k()) {
            j jVar = this.h;
            if (jVar == null) {
                q.b("scancodeBizManager");
            }
            if (!jVar.g()) {
                return false;
            }
        }
        return true;
    }

    private final void b(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        boolean cS;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8fb7c2", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6)});
            return;
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        CaptureManager j = ((cpl) view).j();
        q.a((Object) j, "view.manager");
        g i7 = j.i();
        if (i7 == null) {
            return;
        }
        i7.a(i3, i4);
        Boolean bool = this.m;
        if (bool != null) {
            cS = bool.booleanValue();
        } else {
            cS = b.cS();
            this.m = Boolean.valueOf(cS);
        }
        if (cS) {
            return;
        }
        i7.a(bArr, z, i, i2, i6);
    }

    @Override // com.etao.feimagesearch.structure.capture.d
    public void a(Bitmap snapshot, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8065b3c6", new Object[]{this, snapshot, new Boolean(z), new Boolean(z2)});
            return;
        }
        q.c(snapshot, "snapshot");
        ((cpl) this.f26504a).b(true);
        dqg dqgVar = this.r;
        if (dqgVar == null) {
            j jVar = this.h;
            if (jVar == null) {
                q.b("scancodeBizManager");
            }
            T view = this.f26504a;
            q.a((Object) view, "view");
            Activity s = ((cpl) view).s();
            q.a((Object) s, "view.activity");
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            CaptureManager j = ((cpl) view2).j();
            q.a((Object) j, "view.manager");
            T view3 = this.f26504a;
            q.a((Object) view3, "view");
            com.etao.feimagesearch.model.b h = ((cpl) view3).h();
            q.a((Object) h, "view.pageModel");
            dqgVar = new dqg(jVar, s, j, h, ((cpl) this.f26504a).g());
            this.r = dqgVar;
        }
        dqgVar.a(snapshot, z, z2);
    }

    private final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        cot.c("_scancode__scancode_CapturePaiPresenterV2", "onVisibilityChange: visible=" + z);
        boolean z2 = z && !this.b;
        if (z2 != this.d) {
            if (z2) {
                T view = this.f26504a;
                q.a((Object) view, "view");
                cox.a(((cpl) view).s(), com.etao.feimagesearch.structure.capture.a.f6987a);
                T view2 = this.f26504a;
                q.a((Object) view2, "view");
                T view3 = this.f26504a;
                q.a((Object) view3, "view");
                com.etao.feimagesearch.model.b h = ((cpl) view3).h();
                q.a((Object) h, "view.pageModel");
                cox.a(((cpl) view2).s(), "spm-cnt", "a2141.7631739", "rainbow", cof.a(), "pssource", h.getPssource(), p.KEY_DEVICE_TYPE, p.a());
                T view4 = this.f26504a;
                q.a((Object) view4, "view");
                af.a(((cpl) view4).s());
                T view5 = this.f26504a;
                q.a((Object) view5, "view");
                com.etao.feimagesearch.model.b h2 = ((cpl) view5).h();
                q.a((Object) h2, "view.pageModel");
                h2.setPageSpm(PAI_SPM);
                UTAnalytics uTAnalytics = UTAnalytics.getInstance();
                q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
                UTTracker defaultTracker = uTAnalytics.getDefaultTracker();
                T view6 = this.f26504a;
                q.a((Object) view6, "view");
                defaultTracker.pageAppearDonotSkip(((cpl) view6).s(), com.etao.feimagesearch.structure.capture.a.f6987a);
            } else {
                if (!b.cM()) {
                    T view7 = this.f26504a;
                    q.a((Object) view7, "view");
                    cox.a(((cpl) view7).s(), "rainbow", cof.a());
                }
                UTAnalytics uTAnalytics2 = UTAnalytics.getInstance();
                q.a((Object) uTAnalytics2, "UTAnalytics.getInstance()");
                UTTracker defaultTracker2 = uTAnalytics2.getDefaultTracker();
                T view8 = this.f26504a;
                q.a((Object) view8, "view");
                defaultTracker2.pageDisAppear(((cpl) view8).s());
            }
            this.d = z2;
        }
        if (z) {
            T view9 = this.f26504a;
            q.a((Object) view9, "view");
            CaptureManager j = ((cpl) view9).j();
            q.a((Object) j, "view.manager");
            this.g = j.i();
            r();
            return;
        }
        s();
    }

    private final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        AlertDialog alertDialog = this.k;
        if (alertDialog == null) {
            return false;
        }
        return alertDialog.isShowing();
    }

    private final boolean l() {
        boolean bk;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.n;
        if (bool != null) {
            bk = bool.booleanValue();
        } else {
            bk = b.bk();
            this.n = Boolean.valueOf(bk);
        }
        if (bk) {
            j jVar = this.h;
            if (jVar == null) {
                q.b("scancodeBizManager");
            }
            if (jVar.c()) {
                return true;
            }
        }
        return false;
    }

    private final void r() {
        cpj cpjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        com.etao.feimagesearch.model.b h = ((cpl) view).h();
        q.a((Object) h, "view.pageModel");
        if (h.isDisableAutoDetect()) {
            return;
        }
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        com.etao.feimagesearch.model.b h2 = ((cpl) view2).h();
        q.a((Object) h2, "view.pageModel");
        if (h2.isInShop() || this.f != null || this.g == null) {
            return;
        }
        T view3 = this.f26504a;
        q.a((Object) view3, "view");
        if (((cpl) view3).j().w()) {
            T view4 = this.f26504a;
            q.a((Object) view4, "view");
            Activity s = ((cpl) view4).s();
            q.a((Object) s, "view.activity");
            j jVar = this.h;
            if (jVar == null) {
                q.b("scancodeBizManager");
            }
            com.etao.feimagesearch.capture.dynamic.a aVar = new com.etao.feimagesearch.capture.dynamic.a(s, this, jVar);
            g gVar = this.g;
            if (gVar != null) {
                gVar.a(aVar);
            }
            cpjVar = aVar;
        } else {
            T view5 = this.f26504a;
            q.a((Object) view5, "view");
            Activity s2 = ((cpl) view5).s();
            q.a((Object) s2, "view.activity");
            Activity activity = s2;
            j jVar2 = this.h;
            if (jVar2 == null) {
                q.b("scancodeBizManager");
            }
            cpj cpjVar2 = new cpj(activity, this, jVar2);
            g gVar2 = this.g;
            if (gVar2 != null) {
                gVar2.a(cpjVar2);
            }
            cpjVar = cpjVar2;
        }
        this.f = cpjVar;
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.g = null;
        com.etao.feimagesearch.structure.capture.e eVar = this.f;
        if (eVar != null) {
            eVar.i();
        }
        this.f = null;
    }

    private final void b(boolean z, ctj ctjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6676c2", new Object[]{this, new Boolean(z), ctjVar});
            return;
        }
        AlertDialog alertDialog = this.k;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            this.k = null;
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        this.k = new AlertDialog.Builder(((cpl) view).s()).setMessage(com.alibaba.ability.localization.b.a(R.string.feis_album_scan_dialog_title)).setPositiveButton(com.alibaba.ability.localization.b.a(R.string.feis_album_scan_dialog_confirm), new c(ctjVar)).setNegativeButton(com.alibaba.ability.localization.b.a(R.string.feis_album_scan_dialog_cancel), new d(z, ctjVar)).setCancelable(false).show();
        coy.a(ALBUM_PAGE_NAME, "GoScanPicExpose", 2101, new String[0]);
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : !this.b && this.c;
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        com.etao.feimagesearch.model.b h = ((cpl) view).h();
        q.a((Object) h, "view.pageModel");
        String pageSpm = h.getPageSpm();
        return pageSpm == null ? PAI_SPM : pageSpm;
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        com.etao.feimagesearch.model.b h = ((cpl) view).h();
        q.a((Object) h, "view.pageModel");
        String pssource = h.getPssource();
        return pssource == null ? "unknown_pai_pssource" : pssource;
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public void a(boolean z, ctj multiCodeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db88ad23", new Object[]{this, new Boolean(z), multiCodeData});
            return;
        }
        q.c(multiCodeData, "multiCodeData");
        cot.c(TAG, "onGetScanResult " + z);
        if (multiCodeData.a() == null || multiCodeData.b() == null) {
            return;
        }
        if (i()) {
            cot.c(TAG, "onGetScanResult isShowingDecodeResultUI");
        } else if (z) {
            q();
            cot.c(TAG, "directNav=" + multiCodeData.d());
            dqg dqgVar = this.r;
            if (dqgVar != null) {
                com.etao.feimagesearch.capture.dynamic.bean.a a2 = dqgVar.a();
                if (q.a(a2 != null ? a2.b() : null, multiCodeData.e().c)) {
                    coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "findCodeAfterTakePhoto", 19999, new String[0]);
                }
            }
            if (multiCodeData.d()) {
                a(multiCodeData);
            } else {
                b(z, multiCodeData);
            }
        } else {
            a(multiCodeData);
        }
    }

    private final void a(ctj ctjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4188a1f", new Object[]{this, ctjVar});
            return;
        }
        ((cpl) this.f26504a).a(ctjVar);
        j jVar = this.h;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        jVar.a(true);
        com.etao.feimagesearch.structure.capture.e eVar = this.f;
        if (eVar == null) {
            return;
        }
        eVar.g();
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public void a(boolean z, cti qrCodeNotFoundEvent) {
        KakaLibImageWrapper e2;
        ClientModelType f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8838c4", new Object[]{this, new Boolean(z), qrCodeNotFoundEvent});
            return;
        }
        q.c(qrCodeNotFoundEvent, "qrCodeNotFoundEvent");
        cot.c(TAG, "onScanFailed isAlbumDecoding=" + z + '}');
        if (!z) {
            return;
        }
        q();
        com.etao.feimagesearch.album.e eVar = this.i;
        if (eVar != null && (e2 = eVar.e()) != null && q.a(e2, qrCodeNotFoundEvent.c)) {
            cox.b(ALBUM_PAGE_NAME, "scanPicFail", "scene", "paiAlbum");
            T view = this.f26504a;
            q.a((Object) view, "view");
            com.etao.feimagesearch.model.b h = ((cpl) view).h();
            q.a((Object) h, "view.pageModel");
            Map<String, String> extraParams = h.getExtraParams();
            q.a((Object) extraParams, "view.pageModel.extraParams");
            extraParams.put("screenshotsAppSrc", eVar.f());
            Uri parse = Uri.parse(eVar.a());
            Bitmap c2 = eVar.c();
            int b = eVar.b();
            PhotoFrom.Values d2 = eVar.d();
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            com.etao.feimagesearch.model.b h2 = ((cpl) view2).h();
            T view3 = this.f26504a;
            q.a((Object) view3, "view");
            Activity s = ((cpl) view3).s();
            int hashCode = eVar.c().hashCode();
            int g = eVar.g();
            T view4 = this.f26504a;
            q.a((Object) view4, "view");
            CaptureManager j = ((cpl) view4).j();
            q.a((Object) j, "view.manager");
            g i = j.i();
            cpf.a(parse, c2, b, d2, h2, s, hashCode, g, (i == null || (f = i.f()) == null) ? null : f.getType());
            this.i = null;
            return;
        }
        dqg dqgVar = this.r;
        if (dqgVar == null || dqgVar.a(z, qrCodeNotFoundEvent)) {
        }
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : cpe.a.a(cpe.a.SCENE_AUTO_DETECT);
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        cot.c(TAG, "onScanSuccess " + z);
        if (!z) {
            return;
        }
        this.i = null;
        dqg dqgVar = this.r;
        if (dqgVar == null) {
            return;
        }
        dqgVar.a(true);
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i != 2 && i != 1) {
        } else {
            j jVar = this.h;
            if (jVar == null) {
                q.b("scancodeBizManager");
            }
            jVar.m();
            AlertDialog alertDialog = this.k;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            alertDialog.dismiss();
        }
    }

    @Override // tb.ctg
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        j jVar = this.h;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        jVar.a();
        com.etao.feimagesearch.capture.scan.irp.c a2 = com.etao.feimagesearch.capture.scan.irp.c.Companion.a();
        T view = this.f26504a;
        q.a((Object) view, "view");
        a2.a(String.valueOf(((cpl) view).s().hashCode()));
        com.etao.feimagesearch.mnn.featureextract.c cVar = com.etao.feimagesearch.mnn.featureextract.c.INSTANCE;
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        cVar.a(String.valueOf(((cpl) view2).s().hashCode()));
    }

    private final void a(com.etao.feimagesearch.album.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238d8ad7", new Object[]{this, oVar});
        } else if (!oVar.a(b.l())) {
            csz.a(oVar.e(), false);
            T view = this.f26504a;
            q.a((Object) view, "view");
            Toast.makeText(((cpl) view).s(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_not_supported_now) + b.l() + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19050), 0).show();
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(oVar.e()));
        } else if (oVar.a()) {
            csz.a(oVar.e(), false);
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            Toast.makeText(((cpl) view2).s(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19054), 0).show();
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(oVar.e()));
        } else {
            ((cpl) this.f26504a).b(true);
            csz.a(oVar.e(), true);
            try {
                com.etao.feimagesearch.history.a a2 = com.etao.feimagesearch.history.a.a();
                T view3 = this.f26504a;
                q.a((Object) view3, "view");
                a2.a(((cpl) view3).s(), oVar.h(), oVar.d(), oVar.b());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            coy.b(ALBUM_PAGE_NAME, "SelectedVideo", new String[0]);
            Uri.Builder appendQueryParameter = Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(oVar.h()));
            T view4 = this.f26504a;
            q.a((Object) view4, "view");
            com.etao.feimagesearch.model.b h = ((cpl) view4).h();
            q.a((Object) h, "view.pageModel");
            String uri = appendQueryParameter.appendQueryParameter("pssource", h.getPssource()).build().toString();
            q.a((Object) uri, "Uri.parse(\"https://m.tao…ource).build().toString()");
            T view5 = this.f26504a;
            q.a((Object) view5, "view");
            cou.a(((cpl) view5).s(), uri);
        }
    }

    private final void a(String str, int i, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3970beed", new Object[]{this, str, new Integer(i), new Boolean(z), str2});
        } else if (str == null || StringUtils.isEmpty(str)) {
        } else {
            cot.a("PltCameraPai", "processAlbumImageItem", String.valueOf(str));
            ((cpl) this.f26504a).b(true);
            com.etao.feimagesearch.newresult.perf.a.H();
            PhotoFrom.Values values = z ? PhotoFrom.Values.OUTER_ALBUM_LOCAL : PhotoFrom.Values.ALBUM;
            if (a(str, values)) {
                return;
            }
            T view = this.f26504a;
            q.a((Object) view, "view");
            n.a aVar = new n.a(((cpl) view).s(), str, i, new e(str2, str, i, values), true);
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            CaptureManager j = ((cpl) view2).j();
            q.a((Object) j, "view.manager");
            if (j.G()) {
                T view3 = this.f26504a;
                q.a((Object) view3, "view");
                ((cpl) view3).j().a(aVar);
                return;
            }
            com.etao.feimagesearch.pipline.c.a(aVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ PhotoFrom.Values e;

        public e(String str, String str2, int i, PhotoFrom.Values values) {
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = values;
        }

        @Override // com.etao.feimagesearch.util.n.b
        public void a(Bitmap bitmap, long j) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb5ddcbe", new Object[]{this, bitmap, new Long(j)});
                return;
            }
            q.c(bitmap, "bitmap");
            cpl view = cpk.b(cpk.this);
            q.a((Object) view, "view");
            CaptureManager j2 = view.j();
            q.a((Object) j2, "view.manager");
            if (j2.U()) {
                fkj.a().a(bitmap);
                i = 16;
            }
            cpl view2 = cpk.b(cpk.this);
            q.a((Object) view2, "view");
            CaptureManager j3 = view2.j();
            q.a((Object) j3, "view.manager");
            if (j3.C()) {
                com.etao.feimagesearch.capture.scan.irp.c.Companion.a().a(new com.etao.feimagesearch.mnn.channel.a(bitmap, this.b));
                i |= 256;
            }
            cpl view3 = cpk.b(cpk.this);
            q.a((Object) view3, "view");
            CaptureManager j4 = view3.j();
            q.a((Object) j4, "view.manager");
            if (j4.V()) {
                com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.a(new com.etao.feimagesearch.mnn.featureextract.a(bitmap));
                i |= 261;
            }
            com.etao.feimagesearch.album.e eVar = new com.etao.feimagesearch.album.e(this.c, bitmap, this.d, this.e, i | 1, this.b, null, 64, null);
            cpk.a(cpk.this, eVar);
            cpl view4 = cpk.b(cpk.this);
            q.a((Object) view4, "view");
            long b = m.b(view4.s());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("loadCostTime", String.valueOf(j));
            j c = cpk.c(cpk.this);
            cpl view5 = cpk.b(cpk.this);
            q.a((Object) view5, "view");
            eVar.a(c.a(view5.s(), eVar.a(), bitmap, eVar.b(), eVar.d(), cpk.b(cpk.this).l(), b, linkedHashMap));
        }

        @Override // com.etao.feimagesearch.util.n.b
        public void a(String errorCode, String errorMsg) {
            ClientModelType f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
                return;
            }
            q.c(errorCode, "errorCode");
            q.c(errorMsg, "errorMsg");
            cpk.a(cpk.this);
            Uri parse = Uri.parse(this.c);
            int i = this.d;
            PhotoFrom.Values values = this.e;
            cpl view = cpk.b(cpk.this);
            q.a((Object) view, "view");
            com.etao.feimagesearch.model.b h = view.h();
            cpl view2 = cpk.b(cpk.this);
            q.a((Object) view2, "view");
            Activity s = view2.s();
            cpl view3 = cpk.b(cpk.this);
            q.a((Object) view3, "view");
            CaptureManager j = view3.j();
            q.a((Object) j, "view.manager");
            g i2 = j.i();
            cpf.a(parse, (Bitmap) null, i, values, h, s, -1, 0, (i2 == null || (f = i2.f()) == null) ? null : f.getType());
        }
    }

    private final boolean a(String str, PhotoFrom.Values values) {
        ClientModelType f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5768c94", new Object[]{this, str, values})).booleanValue();
        }
        try {
            T view = this.f26504a;
            q.a((Object) view, "view");
            CaptureManager j = ((cpl) view).j();
            q.a((Object) j, "view.manager");
            a.C0207a a2 = j.B().a(str);
            if (a2 != null) {
                int g = a2.g();
                T view2 = this.f26504a;
                q.a((Object) view2, "view");
                CaptureManager j2 = ((cpl) view2).j();
                q.a((Object) j2, "view.manager");
                if (j2.U() && (a2.g() & 16) <= 0) {
                    cot.a("PltCameraPai", TAG, "retry detectFaceAsync");
                    fkj.a().a(a2.c());
                    g |= 16;
                }
                T view3 = this.f26504a;
                q.a((Object) view3, "view");
                CaptureManager j3 = ((cpl) view3).j();
                q.a((Object) j3, "view.manager");
                if (j3.C() && (a2.g() & 256) <= 0) {
                    cot.a("PltCameraPai", TAG, "retry channel detect");
                    com.etao.feimagesearch.capture.scan.irp.c.Companion.a().a(new com.etao.feimagesearch.mnn.channel.a(a2.c(), a2.f()));
                    g |= 256;
                }
                T view4 = this.f26504a;
                q.a((Object) view4, "view");
                CaptureManager j4 = ((cpl) view4).j();
                q.a((Object) j4, "view.manager");
                if (j4.V() && (a2.g() & 261) <= 0) {
                    cot.a("PltCameraPai", TAG, "retry feature extract");
                    com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.a(new com.etao.feimagesearch.mnn.featureextract.a(a2.c()));
                    g |= 261;
                }
                int i = g;
                Uri parse = Uri.parse(a2.a());
                Bitmap c2 = a2.c();
                int b = a2.b();
                PhotoFrom.Values values2 = values;
                T view5 = this.f26504a;
                q.a((Object) view5, "view");
                com.etao.feimagesearch.model.b h = ((cpl) view5).h();
                T view6 = this.f26504a;
                q.a((Object) view6, "view");
                Activity s = ((cpl) view6).s();
                int hashCode = a2.c().hashCode();
                T view7 = this.f26504a;
                q.a((Object) view7, "view");
                CaptureManager j5 = ((cpl) view7).j();
                q.a((Object) j5, "view.manager");
                g i2 = j5.i();
                cpf.a(parse, c2, b, values2, h, s, hashCode, i, (i2 == null || (f = i2.f()) == null) ? null : f.getType());
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "firstAlbumCacheBingoPai", 19999, new String[0]);
                cot.a("PltCameraPai", TAG, "hit cache " + str);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        amd amdVar = this.j;
        if (amdVar == null) {
            return;
        }
        amdVar.b();
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.l) {
        } else {
            this.l = true;
            T view = this.f26504a;
            q.a((Object) view, "view");
            CaptureManager j = ((cpl) view).j();
            q.a((Object) j, "view.manager");
            if (!j.V()) {
                return;
            }
            com.etao.feimagesearch.mnn.featureextract.c cVar = com.etao.feimagesearch.mnn.featureextract.c.INSTANCE;
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            cVar.a(String.valueOf(((cpl) view2).s().hashCode()));
        }
    }
}
