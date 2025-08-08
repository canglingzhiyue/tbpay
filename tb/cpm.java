package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.a;
import com.etao.feimagesearch.album.e;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.scan.f;
import com.etao.feimagesearch.capture.scan.j;
import com.etao.feimagesearch.capture.scan.k;
import com.etao.feimagesearch.capture.scan.m;
import com.etao.feimagesearch.intelli.ClientModelType;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.d;
import com.etao.feimagesearch.structure.capture.g;
import com.etao.feimagesearch.util.af;
import com.etao.feimagesearch.util.n;
import com.etao.feimagesearch.util.p;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cpe;

/* loaded from: classes3.dex */
public final class cpm extends ctb<cpn> implements f, d, ctg, cth {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final c Companion;
    public static final String TAG = "CaptureScanPresenterV2";
    private e c;
    private amd d;
    private j e;
    private final a f = new a();
    private boolean g;
    private boolean h;
    private dqg i;
    private boolean j;

    static {
        kge.a(-566170843);
        kge.a(1680162042);
        kge.a(129786070);
        kge.a(-208765815);
        kge.a(1206774849);
        Companion = new c(null);
    }

    public static /* synthetic */ Object ipc$super(cpm cpmVar, String str, Object... objArr) {
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

    public static final /* synthetic */ cpn a(cpm cpmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpn) ipChange.ipc$dispatch("facb30cd", new Object[]{cpmVar}) : (cpn) cpmVar.f26504a;
    }

    public static final /* synthetic */ void a(cpm cpmVar, Bitmap bitmap, long j, PhotoFrom.Values values, String str, int i, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebdc939", new Object[]{cpmVar, bitmap, new Long(j), values, str, new Integer(i), new Boolean(z), str2});
        } else {
            cpmVar.a(bitmap, j, values, str, i, z, str2);
        }
    }

    public static final /* synthetic */ void c(cpm cpmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e7963a", new Object[]{cpmVar});
        } else {
            cpmVar.f();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        static {
            kge.a(16051245);
        }

        private c() {
        }

        public /* synthetic */ c(o oVar) {
            this();
        }
    }

    @Override // tb.ctb
    public void z_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f792c", new Object[]{this});
            return;
        }
        super.z_();
        T view = this.f26504a;
        q.a((Object) view, "view");
        Activity s = ((cpn) view).s();
        q.a((Object) s, "view.activity");
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        CaptureManager j = ((cpn) view2).j();
        q.a((Object) j, "view.manager");
        this.d = new amd(s, j);
        T view3 = this.f26504a;
        q.a((Object) view3, "view");
        ((cpn) view3).j().a((ctg) this);
        T view4 = this.f26504a;
        q.a((Object) view4, "view");
        Activity s2 = ((cpn) view4).s();
        if (s2 != null) {
            T view5 = this.f26504a;
            q.a((Object) view5, "view");
            Activity s3 = ((cpn) view5).s();
            T view6 = this.f26504a;
            q.a((Object) view6, "view");
            T view7 = this.f26504a;
            q.a((Object) view7, "view");
            this.e = new j((FragmentActivity) s2, this, new k(s3, ((cpn) view6).h(), "", ((cpn) view7).j()));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @Override // tb.ctb
    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.g && !this.b) {
            z = true;
        }
        c(z);
        j jVar = this.e;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        jVar.d();
        this.f.a();
        i();
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
        if (!this.g && !this.b) {
            z = true;
        }
        c(z);
        j jVar = this.e;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        jVar.f();
        dqg dqgVar = this.i;
        if (dqgVar != null) {
            dqgVar.b();
        }
        f();
    }

    @Override // tb.ctb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        j jVar = this.e;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        jVar.b();
        if (!com.etao.feimagesearch.config.b.dN()) {
            return;
        }
        cqd.INSTANCE.a();
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        if (!z || this.b) {
            z2 = false;
        }
        c(z2);
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
        Activity s = ((cpn) view).s();
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

    private final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z != this.h) {
            af.a(this.f26504a, z);
            this.h = z;
        }
        if (!z) {
            return;
        }
        cox.c("Page_PhotoSearchScan", "PageShow_Scan", new String[0]);
    }

    private final void a(com.etao.feimagesearch.album.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238d8ad7", new Object[]{this, oVar});
        } else if (!oVar.a(com.etao.feimagesearch.config.b.l())) {
            csz.a(oVar.e(), false);
            T view = this.f26504a;
            q.a((Object) view, "view");
            Toast.makeText(((cpn) view).s(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_not_supported_now) + com.etao.feimagesearch.config.b.l() + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19050), 0).show();
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(oVar.e()));
        } else if (oVar.a()) {
            csz.a(oVar.e(), false);
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            Toast.makeText(((cpn) view2).s(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19054), 0).show();
            cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(oVar.e()));
        } else {
            cox.a("SelectedVideo", new String[0]);
            csz.a(oVar.e(), true);
            try {
                com.etao.feimagesearch.history.a a2 = com.etao.feimagesearch.history.a.a();
                T view3 = this.f26504a;
                q.a((Object) view3, "view");
                a2.a(((cpn) view3).s(), oVar.h(), oVar.d(), oVar.b());
            } catch (Exception e) {
                e.printStackTrace();
            }
            coy.b(cpk.ALBUM_PAGE_NAME, "SelectedVideo", new String[0]);
            Uri.Builder appendQueryParameter = Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(oVar.h()));
            T view4 = this.f26504a;
            q.a((Object) view4, "view");
            com.etao.feimagesearch.model.b h = ((cpn) view4).h();
            q.a((Object) h, "view.pageModel");
            String uri = appendQueryParameter.appendQueryParameter("pssource", h.getPssource()).build().toString();
            q.a((Object) uri, "Uri.parse(\"https://m.tao…ource).build().toString()");
            T view5 = this.f26504a;
            q.a((Object) view5, "view");
            cou.a(((cpn) view5).s(), uri);
        }
    }

    private final void a(String str, int i, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3970beed", new Object[]{this, str, new Integer(i), new Boolean(z), str2});
        } else if (str == null || StringUtils.isEmpty(str)) {
        } else {
            cot.a("PltCameraScan", "processAlbumImageItem", String.valueOf(str));
            d();
            PhotoFrom.Values values = z ? PhotoFrom.Values.OUTER_ALBUM_LOCAL : PhotoFrom.Values.ALBUM;
            T view = this.f26504a;
            q.a((Object) view, "view");
            CaptureManager j = ((cpn) view).j();
            q.a((Object) j, "view.manager");
            a.C0207a a2 = j.B().a(str);
            if (a2 != null) {
                cot.a("PltCameraScan", "processAlbumImageItem: wangn_", "use preprocess album bitmap");
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "firstAlbumCacheBingoScan", 19999, new String[0]);
                a(a2.c(), 0L, values, str, i, z, str2);
                return;
            }
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            n.a aVar = new n.a(((cpn) view2).s(), str, i, new b(values, str, i, z, str2), true);
            T view3 = this.f26504a;
            q.a((Object) view3, "view");
            CaptureManager j2 = ((cpn) view3).j();
            q.a((Object) j2, "view.manager");
            if (j2.G()) {
                T view4 = this.f26504a;
                q.a((Object) view4, "view");
                ((cpn) view4).j().a(aVar);
                return;
            }
            com.etao.feimagesearch.pipline.c.a(aVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ PhotoFrom.Values e;
        public final /* synthetic */ boolean f;

        public b(PhotoFrom.Values values, String str, int i, boolean z, String str2) {
            this.e = values;
            this.c = str;
            this.d = i;
            this.f = z;
            this.b = str2;
        }

        @Override // com.etao.feimagesearch.util.n.b
        public void a(Bitmap bitmap, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb5ddcbe", new Object[]{this, bitmap, new Long(j)});
                return;
            }
            q.c(bitmap, "bitmap");
            cpm.a(cpm.this, bitmap, j, this.e, this.c, this.d, this.f, this.b);
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
            cpm.c(cpm.this);
            Uri parse = Uri.parse(this.c);
            if (parse == null) {
                return;
            }
            com.etao.feimagesearch.newresult.perf.a.H();
            cpn view = cpm.a(cpm.this);
            q.a((Object) view, "view");
            com.etao.feimagesearch.model.b h = view.h();
            q.a((Object) h, "view.pageModel");
            Map<String, String> extraParams = h.getExtraParams();
            q.a((Object) extraParams, "view.pageModel.extraParams");
            extraParams.put("screenshotsAppSrc", this.b);
            int i = this.d;
            PhotoFrom.Values values = PhotoFrom.Values.ALBUM_SYS;
            cpn view2 = cpm.a(cpm.this);
            q.a((Object) view2, "view");
            com.etao.feimagesearch.model.b h2 = view2.h();
            cpn view3 = cpm.a(cpm.this);
            q.a((Object) view3, "view");
            Activity s = view3.s();
            cpn view4 = cpm.a(cpm.this);
            q.a((Object) view4, "view");
            CaptureManager j = view4.j();
            q.a((Object) j, "view.manager");
            g i2 = j.i();
            cpf.a(parse, (Bitmap) null, i, values, h2, s, -1, 0, (i2 == null || (f = i2.f()) == null) ? null : f.getType());
        }
    }

    private final void a(Bitmap bitmap, long j, PhotoFrom.Values values, String str, int i, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5c6009", new Object[]{this, bitmap, new Long(j), values, str, new Integer(i), new Boolean(z), str2});
            return;
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        CaptureManager j2 = ((cpn) view).j();
        q.a((Object) j2, "view.manager");
        if (j2.U()) {
            fkj.a().a(bitmap);
            i2 = 16;
        }
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        CaptureManager j3 = ((cpn) view2).j();
        q.a((Object) j3, "view.manager");
        if (j3.C()) {
            com.etao.feimagesearch.capture.scan.irp.c.Companion.a().a(new com.etao.feimagesearch.mnn.channel.a(bitmap, str2));
            i2 |= 256;
        }
        T view3 = this.f26504a;
        q.a((Object) view3, "view");
        CaptureManager j4 = ((cpn) view3).j();
        q.a((Object) j4, "view.manager");
        if (j4.V()) {
            com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.a(new com.etao.feimagesearch.mnn.featureextract.a(bitmap));
            i2 |= 261;
        }
        e eVar = new e(str, bitmap, i, values, i2 | 1, str2, null);
        this.c = eVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("loadCostTime", String.valueOf(j));
        T view4 = this.f26504a;
        q.a((Object) view4, "view");
        long b2 = m.b(((cpn) view4).s());
        j jVar = this.e;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        T view5 = this.f26504a;
        q.a((Object) view5, "view");
        eVar.a(jVar.a(((cpn) view5).s(), str, bitmap, i, values, ((cpn) this.f26504a).l(), b2, linkedHashMap));
    }

    @Override // tb.cth
    public void a(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1ee23", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6)});
            return;
        }
        this.f.b();
        T view = this.f26504a;
        q.a((Object) view, "view");
        CaptureManager j = ((cpn) view).j();
        q.a((Object) j, "view.manager");
        if (p.a(bArr, i, i2, j.M()) == 1) {
            cpp cppVar = cpp.INSTANCE;
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            Activity s = ((cpn) view2).s();
            q.a((Object) s, "view.activity");
            T view3 = this.f26504a;
            q.a((Object) view3, "view");
            CaptureManager j2 = ((cpn) view3).j();
            q.a((Object) j2, "view.manager");
            cppVar.b(s, j2, false);
        } else {
            cpp cppVar2 = cpp.INSTANCE;
            T view4 = this.f26504a;
            q.a((Object) view4, "view");
            Activity s2 = ((cpn) view4).s();
            q.a((Object) s2, "view.activity");
            T view5 = this.f26504a;
            q.a((Object) view5, "view");
            CaptureManager j3 = ((cpn) view5).j();
            q.a((Object) j3, "view.manager");
            cppVar2.a(s2, j3, false);
        }
        j jVar = this.e;
        if (jVar == null) {
            q.b("scancodeBizManager");
        }
        jVar.a(bArr, i, i2, i3, i4, i5, z, i6, false);
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : !this.b && this.g;
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        com.etao.feimagesearch.model.b h = ((cpn) view).h();
        q.a((Object) h, "view.pageModel");
        String pageSpm = h.getPageSpm();
        return pageSpm == null ? af.SCAN_SPM : pageSpm;
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        T view = this.f26504a;
        q.a((Object) view, "view");
        com.etao.feimagesearch.model.b h = ((cpn) view).h();
        q.a((Object) h, "view.pageModel");
        String pssource = h.getPssource();
        return pssource == null ? "unknown_scan_pssource" : pssource;
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public void a(boolean z, ctj multiCodeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db88ad23", new Object[]{this, new Boolean(z), multiCodeData});
            return;
        }
        q.c(multiCodeData, "multiCodeData");
        f();
        ((cpn) this.f26504a).a(multiCodeData);
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public void a(boolean z, cti event) {
        ClientModelType f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8838c4", new Object[]{this, new Boolean(z), event});
            return;
        }
        q.c(event, "event");
        if (!z) {
            return;
        }
        f();
        dqg dqgVar = this.i;
        if (dqgVar != null && dqgVar.a(z, event)) {
            return;
        }
        cox.b(cpk.ALBUM_PAGE_NAME, "scanPicFail", "scene", "scanAlbum");
        T view = this.f26504a;
        q.a((Object) view, "view");
        cuk.a(((cpn) view).s(), com.etao.feimagesearch.config.b.ah(), 0);
        e eVar = this.c;
        if (eVar == null || !q.a(eVar.e(), event.c)) {
            return;
        }
        Uri parse = Uri.parse(event.f26510a);
        if (parse != null) {
            com.etao.feimagesearch.newresult.perf.a.H();
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            com.etao.feimagesearch.model.b h = ((cpn) view2).h();
            q.a((Object) h, "view.pageModel");
            Map<String, String> extraParams = h.getExtraParams();
            q.a((Object) extraParams, "view.pageModel.extraParams");
            extraParams.put("screenshotsAppSrc", eVar.f());
            Bitmap c2 = eVar.c();
            int i = event.b;
            PhotoFrom.Values values = PhotoFrom.Values.ALBUM_SYS;
            T view3 = this.f26504a;
            q.a((Object) view3, "view");
            com.etao.feimagesearch.model.b h2 = ((cpn) view3).h();
            T view4 = this.f26504a;
            q.a((Object) view4, "view");
            Activity s = ((cpn) view4).s();
            int hashCode = eVar.c().hashCode();
            int g = eVar.g();
            T view5 = this.f26504a;
            q.a((Object) view5, "view");
            CaptureManager j = ((cpn) view5).j();
            q.a((Object) j, "view.manager");
            g i2 = j.i();
            cpf.a(parse, c2, i, values, h2, s, hashCode, g, (i2 == null || (f = i2.f()) == null) ? null : f.getType());
        }
        this.c = null;
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : cpe.a.a("scan");
    }

    @Override // com.etao.feimagesearch.capture.scan.f
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.c = null;
            dqg dqgVar = this.i;
            if (dqgVar == null) {
                return;
            }
            dqgVar.a(true);
        } else {
            this.f.c();
        }
    }

    /* loaded from: classes3.dex */
    public final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long b;
        private long c;

        static {
            kge.a(-155264499);
        }

        public a() {
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.b = System.currentTimeMillis();
            this.c = 0L;
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            long j = this.c;
            if (j >= Long.MAX_VALUE) {
                return;
            }
            this.c = j + 1;
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (this.c <= 0) {
            } else {
                cox.a("Page_PhotoSearchScan", "Button-HuoyanRecognize", "count", String.valueOf(this.c), "totalTime", String.valueOf(System.currentTimeMillis() - this.b));
                a();
            }
        }
    }

    @Override // tb.ctg
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (com.etao.feimagesearch.config.b.cw()) {
            j jVar = this.e;
            if (jVar == null) {
                q.b("scancodeBizManager");
            }
            jVar.a();
        }
        com.etao.feimagesearch.capture.scan.irp.c a2 = com.etao.feimagesearch.capture.scan.irp.c.Companion.a();
        T view = this.f26504a;
        q.a((Object) view, "view");
        a2.a(String.valueOf(((cpn) view).s().hashCode()));
        com.etao.feimagesearch.mnn.featureextract.c cVar = com.etao.feimagesearch.mnn.featureextract.c.INSTANCE;
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        cVar.a(String.valueOf(((cpn) view2).s().hashCode()));
    }

    @Override // com.etao.feimagesearch.structure.capture.d
    public void a(Bitmap snapshot, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8065b3c6", new Object[]{this, snapshot, new Boolean(z), new Boolean(z2)});
            return;
        }
        q.c(snapshot, "snapshot");
        dqg dqgVar = this.i;
        if (dqgVar == null) {
            j jVar = this.e;
            if (jVar == null) {
                q.b("scancodeBizManager");
            }
            T view = this.f26504a;
            q.a((Object) view, "view");
            Activity s = ((cpn) view).s();
            q.a((Object) s, "view.activity");
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            CaptureManager j = ((cpn) view2).j();
            q.a((Object) j, "view.manager");
            T view3 = this.f26504a;
            q.a((Object) view3, "view");
            com.etao.feimagesearch.model.b h = ((cpn) view3).h();
            q.a((Object) h, "view.pageModel");
            dqgVar = new dqg(jVar, s, j, h, ((cpn) this.f26504a).g());
            this.i = dqgVar;
        }
        dqgVar.a(snapshot, z, z2);
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        amd amdVar = this.d;
        if (amdVar == null) {
            return;
        }
        amdVar.a();
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        amd amdVar = this.d;
        if (amdVar == null) {
            return;
        }
        amdVar.b();
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.j) {
        } else {
            this.j = true;
            if (com.etao.feimagesearch.config.b.dS()) {
                j jVar = this.e;
                if (jVar == null) {
                    q.b("scancodeBizManager");
                }
                jVar.a();
            }
            com.etao.feimagesearch.capture.scan.irp.c a2 = com.etao.feimagesearch.capture.scan.irp.c.Companion.a();
            T view = this.f26504a;
            q.a((Object) view, "view");
            a2.a(String.valueOf(((cpn) view).s().hashCode()));
            com.etao.feimagesearch.mnn.featureextract.c cVar = com.etao.feimagesearch.mnn.featureextract.c.INSTANCE;
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            cVar.a(String.valueOf(((cpn) view2).s().hashCode()));
        }
    }
}
