package com.etao.feimagesearch.capture.scan;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.util.Size;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.IDecodeTask;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.util.ao;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.taobao.scancode.gateway.util.ScancodeController;
import com.taobao.taobao.scancode.gateway.util.n;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.t;
import tb.cot;
import tb.cox;
import tb.coy;
import tb.cpk;
import tb.css;
import tb.cti;
import tb.ctj;
import tb.kge;
import tb.oyf;
import tb.rul;

/* loaded from: classes3.dex */
public class j implements d, com.taobao.taobao.scancode.gateway.util.m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int q;

    /* renamed from: a  reason: collision with root package name */
    private final FragmentActivity f6605a;
    private MaType[] b;
    private long c;
    private com.taobao.taobao.scancode.gateway.util.d d;
    private final f h;
    private HashMap<String, String> i;
    private IDecodeTask j;
    private b m;
    private final k n;
    private volatile boolean f = false;
    private volatile DecodeState g = DecodeState.IDLE;
    private a l = null;
    private Boolean k = null;
    public volatile boolean e = false;

    public static /* synthetic */ HashMap a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("edd1870c", new Object[]{jVar}) : jVar.j();
    }

    public static /* synthetic */ void a(j jVar, h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ece1fd4", new Object[]{jVar, hVar, str});
        } else {
            jVar.a(hVar, str);
        }
    }

    public static /* synthetic */ boolean a(j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("837c560f", new Object[]{jVar, new Boolean(z)})).booleanValue();
        }
        jVar.f = z;
        return z;
    }

    public static /* synthetic */ f b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("67b9cacd", new Object[]{jVar}) : jVar.h;
    }

    static {
        kge.a(2028301886);
        kge.a(1409154498);
        kge.a(1571819161);
        kge.a(1128699363);
        q = com.etao.feimagesearch.util.g.a(44.0f);
    }

    public j(FragmentActivity fragmentActivity, f fVar, k kVar) {
        this.f6605a = fragmentActivity;
        this.h = fVar;
        this.n = kVar;
        if (this.m == null) {
            this.m = new b(fragmentActivity);
        }
        if (!com.etao.feimagesearch.config.b.bw()) {
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.e) {
        } else {
            g gVar = new g();
            gVar.a(this.f6605a);
            this.b = a(gVar.d);
            this.d = new com.taobao.taobao.scancode.gateway.util.d(gVar, new ScancodeController(this), this.f6605a, a(this.h));
            this.d.a("Page_ScanHome");
            this.e = true;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        cot.c("_scancode_ScancodeBizManager", "prepareAlbumCodeDetect");
        if (this.h == null) {
            return;
        }
        e();
        if (!com.etao.feimagesearch.config.b.aN() || this.l != null) {
            return;
        }
        this.l = new a();
        this.l.a(String.valueOf(this.f6605a.hashCode()));
    }

    private css a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (css) ipChange.ipc$dispatch("f06067d6", new Object[]{this, fVar}) : new css() { // from class: com.etao.feimagesearch.capture.scan.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.css
            public HashMap<String, String> a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (HashMap) ipChange2.ipc$dispatch("be7c57cb", new Object[]{this}) : j.a(j.this);
            }
        };
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a aVar = this.l;
        if (aVar != null) {
            aVar.b(String.valueOf(this.f6605a.hashCode()));
        }
        this.m.b();
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (this.c != 0) {
            return SystemClock.elapsedRealtime() - this.c > 1000;
        }
        this.c = SystemClock.elapsedRealtime();
        return true;
    }

    public void a(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c8c8911", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6), new Boolean(z2)});
            return;
        }
        if (this.k == null) {
            this.k = Boolean.valueOf(com.etao.feimagesearch.config.b.cg());
        }
        if (this.k.booleanValue() || i3 == 0 || i4 == 0 || this.g != DecodeState.IDLE) {
            return;
        }
        e();
        if (!h()) {
            return;
        }
        a(DecodeState.PREVIEW_DECODE);
        KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(bArr, i, i2, i5, (m.a(this.f6605a) ? ScanFromEnum.SYS_CAMERA : ScanFromEnum.PLT_CAMERA).getScanFrom());
        kakaLibImageWrapper.a(this.b);
        kakaLibImageWrapper.f21284a = new Rect(0, 0, i3, i4);
        kakaLibImageWrapper.b = new Rect(0, q, i3, i4);
        c cVar = new c(z, kakaLibImageWrapper, i6, j(), 1, PhotoFrom.Values.Got_CODE, new e(this, this, this.n), z2);
        this.m.a(cVar, (a) null, 0L, (Map<String, String>) null);
        this.j = cVar;
    }

    public KakaLibImageWrapper a(Bitmap bitmap, Size size, long j, rul<Boolean, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibImageWrapper) ipChange.ipc$dispatch("79d50ed2", new Object[]{this, bitmap, size, new Long(j), rulVar});
        }
        e();
        a(DecodeState.ALBUM_DECODE);
        IDecodeTask iDecodeTask = this.j;
        if (iDecodeTask != null) {
            iDecodeTask.a(IDecodeTask.TaskStatus.CANCELLED);
            this.j = null;
        }
        KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(bitmap, ScanFromEnum.SMART_LENS.getScanFrom());
        kakaLibImageWrapper.b(bitmap.getHeight());
        kakaLibImageWrapper.a(bitmap.getWidth());
        kakaLibImageWrapper.a(this.b);
        kakaLibImageWrapper.a(this.f6605a.getApplicationContext());
        kakaLibImageWrapper.f21284a = new Rect(0, 0, size.getWidth(), size.getHeight());
        kakaLibImageWrapper.b = new Rect(0, 0, size.getWidth(), size.getHeight());
        c cVar = new c(kakaLibImageWrapper, ScanMode.ACCURATE_MODE, j(), 2, a(rulVar), PhotoFrom.Values.AUTO_DETECT, false, 0);
        this.m.a(cVar, (a) null, j, (Map<String, String>) null);
        this.j = cVar;
        cot.c("_scancode_ScancodeBizManager", "onGetAutoDetectBitmap: token=" + kakaLibImageWrapper.hashCode() + ", timeout=0");
        return kakaLibImageWrapper;
    }

    private l a(final rul<Boolean, t> rulVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("678f7eae", new Object[]{this, rulVar}) : new l() { // from class: com.etao.feimagesearch.capture.scan.j.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.capture.scan.l
            public void a(c cVar, i iVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("83afb1a2", new Object[]{this, cVar, iVar});
                } else if (iVar == null) {
                    rulVar.mo2421invoke(false);
                } else if (iVar.c() == null || iVar.b() == null) {
                    rulVar.mo2421invoke(false);
                } else if (!j.b(j.this).m()) {
                    rulVar.mo2421invoke(false);
                } else {
                    final h[] c = iVar.c();
                    KakaLibImageWrapper b = cVar.b();
                    final String j = b.j();
                    j.b(j.this).a(false, new ctj(iVar.a(), iVar.b(), new ctj.a() { // from class: com.etao.feimagesearch.capture.scan.j.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.ctj.a
                        public void a(int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                                return;
                            }
                            if (i >= 0) {
                                h[] hVarArr = c;
                                if (i <= hVarArr.length) {
                                    h hVar = hVarArr[i];
                                    if (hVar == null) {
                                        rulVar.mo2421invoke(true);
                                        return;
                                    } else if (hVar.b() == null) {
                                        rulVar.mo2421invoke(true);
                                        return;
                                    } else {
                                        if (!j.b(j.this).m()) {
                                            rulVar.mo2421invoke(true);
                                        }
                                        j.a(j.this, hVar, j);
                                        return;
                                    }
                                }
                            }
                            rulVar.mo2421invoke(true);
                        }

                        @Override // tb.ctj.a
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            rulVar.mo2421invoke(false);
                            j.this.startPreview();
                        }
                    }, j.a(j.b(j.this), iVar.b(), iVar.c(), iVar.a(), j), new cti(b.f(), cVar.l(), b)));
                }
            }

            @Override // com.etao.feimagesearch.capture.scan.l
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eb746b50", new Object[]{this, cVar});
                } else {
                    rulVar.mo2421invoke(true);
                }
            }
        };
    }

    public KakaLibImageWrapper a(Bitmap bitmap, Rect rect, PhotoFrom.Values values, long j, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibImageWrapper) ipChange.ipc$dispatch("6520d3fb", new Object[]{this, bitmap, rect, values, new Long(j), str, new Boolean(z)});
        }
        e();
        a(DecodeState.ALBUM_DECODE);
        IDecodeTask iDecodeTask = this.j;
        if (iDecodeTask != null) {
            iDecodeTask.a(IDecodeTask.TaskStatus.CANCELLED);
            this.j = null;
        }
        KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(bitmap, str);
        kakaLibImageWrapper.b(bitmap.getHeight());
        kakaLibImageWrapper.a(bitmap.getWidth());
        kakaLibImageWrapper.a(this.b);
        kakaLibImageWrapper.a(this.f6605a.getApplicationContext());
        kakaLibImageWrapper.f21284a = rect;
        c cVar = new c(kakaLibImageWrapper, ScanMode.ACCURATE_MODE, j(), 2, new e(this, this, this.n), values, z, 0);
        this.m.a(cVar, (a) null, j, (Map<String, String>) null);
        this.j = cVar;
        cot.c("_scancode_ScancodeBizManager", "onGetRealtimeBitmap: token=" + kakaLibImageWrapper.hashCode() + ", timeout=" + j);
        return kakaLibImageWrapper;
    }

    private MaType[] a(oyf oyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaType[]) ipChange.ipc$dispatch("da97e02", new Object[]{this, oyfVar});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ScancodeType> it = oyfVar.a().iterator();
        while (it.hasNext()) {
            switch (it.next()) {
                case PRODUCT:
                    arrayList.add(MaType.PRODUCT);
                    break;
                case QR:
                    arrayList.add(MaType.QR);
                    break;
                case EXPRESS:
                    arrayList.add(MaType.EXPRESS);
                    break;
                case MEDICINE:
                    arrayList.add(MaType.MEDICINE);
                    break;
                case ANTI_FAKE:
                    arrayList.add(MaType.TB_ANTI_FAKE);
                    break;
                case GEN3:
                    arrayList.add(MaType.GEN3);
                    break;
                case TB_4G:
                    if (!com.taobao.taobao.scancode.gateway.util.k.g()) {
                        arrayList.add(MaType.TB_4G);
                        break;
                    } else {
                        break;
                    }
                case DM:
                    arrayList.add(MaType.DM);
                    break;
            }
        }
        MaType[] maTypeArr = new MaType[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            maTypeArr[i] = (MaType) arrayList.get(i);
        }
        return maTypeArr;
    }

    @Override // com.etao.feimagesearch.capture.scan.d
    public void a(c cVar, i iVar) {
        Bitmap bitmap;
        Rect[] rectArr;
        h[] hVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83afb1a2", new Object[]{this, cVar, iVar});
            return;
        }
        KakaLibImageWrapper b = cVar.b();
        if (iVar != null) {
            Bitmap a2 = iVar.a();
            Rect[] b2 = iVar.b();
            hVarArr = iVar.c();
            bitmap = a2;
            rectArr = b2;
        } else {
            bitmap = null;
            rectArr = null;
            hVarArr = null;
        }
        if (hVarArr != null && hVarArr.length > 0) {
            e();
            a(hVarArr[0]);
            coy.a(cpk.ALBUM_PAGE_NAME, "ScanPicSuc", new String[0]);
            if (rectArr == null || rectArr.length != hVarArr.length || bitmap == null) {
                a(hVarArr[0], b.j());
            } else {
                a(b, bitmap, rectArr, hVarArr, b.j(), cVar.l());
            }
        } else if (c() && b.a() != null) {
        } else {
            a(b, cVar.l());
        }
    }

    private void a(KakaLibImageWrapper kakaLibImageWrapper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613baa41", new Object[]{this, kakaLibImageWrapper, new Integer(i)});
        } else if (c()) {
            a(DecodeState.IDLE);
            startPreview();
            f fVar = this.h;
            if (fVar == null) {
                return;
            }
            fVar.a(true, new cti(kakaLibImageWrapper.f(), i, kakaLibImageWrapper));
        } else {
            a(DecodeState.IDLE);
        }
    }

    private void a(KakaLibImageWrapper kakaLibImageWrapper, Bitmap bitmap, Rect[] rectArr, final h[] hVarArr, final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8084818b", new Object[]{this, kakaLibImageWrapper, bitmap, rectArr, hVarArr, str, new Integer(i)});
            return;
        }
        cot.c("_scancode_ScancodeBizManager", "processScanResultWithAnchor");
        if (rectArr == null || hVarArr == null || hVarArr.length == 0 || rectArr.length != hVarArr.length) {
            a(kakaLibImageWrapper, i);
        } else if (!this.h.m()) {
            a(DecodeState.IDLE);
        } else if (g()) {
        } else {
            this.h.a(c(), new ctj(bitmap, rectArr, new ctj.a() { // from class: com.etao.feimagesearch.capture.scan.j.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ctj.a
                public void a(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                        return;
                    }
                    cot.c("_scancode_ScancodeBizManager", "onScanCodeHasChosen: index = " + i2);
                    j.a(j.this, false);
                    if (i2 < 0) {
                        return;
                    }
                    h[] hVarArr2 = hVarArr;
                    if (i2 > hVarArr2.length) {
                        return;
                    }
                    j.a(j.this, hVarArr2[i2], str);
                }

                @Override // tb.ctj.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    cot.c("_scancode_ScancodeBizManager", "onBackButtonPressed");
                    j.this.startPreview();
                }
            }, (!c() || !com.etao.feimagesearch.config.b.cx()) ? false : a(this.h, rectArr, hVarArr, bitmap, kakaLibImageWrapper.j()), new cti(kakaLibImageWrapper.f(), i, kakaLibImageWrapper)));
        }
    }

    public static boolean a(f fVar, Rect[] rectArr, h[] hVarArr, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f353ded", new Object[]{fVar, rectArr, hVarArr, bitmap, str})).booleanValue();
        }
        if (fVar != null && ScanFromEnum.SYS_ALBUM.getScanFrom().equalsIgnoreCase(str)) {
            cot.c("_scancode_ScancodeBizManager", "scan from sys_album");
            return true;
        } else if (hVarArr.length != rectArr.length) {
            return false;
        } else {
            for (int i = 0; i < hVarArr.length; i++) {
                h hVar = hVarArr[i];
                Rect rect = rectArr[i];
                MaResult b = hVar.b();
                if (b != null) {
                    MaType type = b.getType();
                    if (type == MaType.GEN3 || ((type == MaType.QR || type == MaType.TB_ANTI_FAKE || type == MaType.TB_4G) && ((((long) rect.width()) * ((long) rect.height())) << 1) > ((long) bitmap.getWidth()) * ((long) bitmap.getHeight()))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private void a(h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f00635", new Object[]{this, hVar, str});
            return;
        }
        n.a a2 = hVar.a();
        if (a2 != null) {
            if (!this.h.m()) {
                a(DecodeState.IDLE);
                return;
            }
            MaResult a3 = a2.a();
            if (a3 == null) {
                a(DecodeState.IDLE);
                return;
            }
            if (a3.getType() != null && a3.getText() != null) {
                com.etao.feimagesearch.result.f.a("scan", "相机扫码 type " + a3.getType().name() + " content " + a3.getText());
            }
            a(a2.a(), false, str);
            if (hVar.a().a() == null) {
                return;
            }
            cox.b(com.etao.feimagesearch.structure.capture.a.f6987a, "scanSuccess", "content", hVar.a().a().getText());
        } else if (hVar.b() == null || !this.h.m()) {
        } else {
            if (hVar.b().getType() != null && hVar.b().getText() != null) {
                com.etao.feimagesearch.result.f.a("scan", "相册扫码 type " + hVar.b().getType().name() + " content " + hVar.b().getText());
            }
            cox.b(com.etao.feimagesearch.structure.capture.a.f6987a, "scanSuccess", "content", hVar.b().getText());
            a(hVar.b(), true, str);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.g == DecodeState.ALBUM_DECODE;
    }

    public void a(DecodeState decodeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f702d0", new Object[]{this, decodeState});
        } else if (this.g == decodeState) {
        } else {
            cot.c("_scancode_ScancodeBizManager", "changeDecodeState: old=" + this.g + ", new=" + decodeState);
            this.g = decodeState;
        }
    }

    private void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb76b12b", new Object[]{this, hVar});
        } else if (!this.h.m()) {
        } else {
            if (hVar.b() == null && hVar.a() == null) {
                return;
            }
            ao.a();
        }
    }

    private void a(MaResult maResult, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c75c8c", new Object[]{this, maResult, new Boolean(z), str});
            return;
        }
        stopPreview();
        this.h.b(z);
        if (!a(this.f6605a, maResult, str)) {
            return;
        }
        startPreview();
        this.c = SystemClock.elapsedRealtime();
    }

    public boolean a(FragmentActivity fragmentActivity, MaResult maResult, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57e4202d", new Object[]{this, fragmentActivity, maResult, str})).booleanValue() : this.d.b(maResult, null, str);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IDecodeTask iDecodeTask = this.j;
        if (iDecodeTask != null) {
            iDecodeTask.a(IDecodeTask.TaskStatus.CANCELLED);
            this.j = null;
        }
        startPreview();
    }

    @Override // com.taobao.taobao.scancode.gateway.util.m
    public void startPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
            return;
        }
        a(DecodeState.IDLE);
        this.f = false;
    }

    @Override // com.taobao.taobao.scancode.gateway.util.m
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
        } else {
            a(DecodeState.PREVIEW_DECODE);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        cot.c("_scancode_ScancodeBizManager", "onPause");
        IDecodeTask iDecodeTask = this.j;
        if (iDecodeTask != null && !iDecodeTask.i()) {
            this.j.a(IDecodeTask.TaskStatus.CANCELLED);
            this.j = null;
        }
        b bVar = this.m;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        f();
        d();
    }

    public KakaLibImageWrapper a(Context context, String str, Bitmap bitmap, int i, PhotoFrom.Values values, Rect rect, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibImageWrapper) ipChange.ipc$dispatch("946f11b9", new Object[]{this, context, str, bitmap, new Integer(i), values, rect, new Long(j), map});
        }
        cot.a("Scan", "_scancode_ScancodeBizManager", "onGetAlbumImage " + str + ", timeoutConfig=" + j);
        e();
        stopPreview();
        int p = this.h.p();
        String scanFrom = (m.a(this.f6605a) ? ScanFromEnum.SYS_ALBUM : ScanFromEnum.PLT_ALBUM).getScanFrom();
        if (c()) {
            KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(str, scanFrom);
            a(kakaLibImageWrapper, i);
            return kakaLibImageWrapper;
        }
        a(DecodeState.ALBUM_DECODE);
        IDecodeTask iDecodeTask = this.j;
        if (iDecodeTask != null) {
            iDecodeTask.a(IDecodeTask.TaskStatus.CANCELLED);
            this.j = null;
        }
        ScanMode a2 = a(p);
        KakaLibImageWrapper kakaLibImageWrapper2 = new KakaLibImageWrapper(str, scanFrom);
        kakaLibImageWrapper2.a(str);
        kakaLibImageWrapper2.a(bitmap);
        kakaLibImageWrapper2.a(bitmap.getWidth());
        kakaLibImageWrapper2.b(bitmap.getHeight());
        kakaLibImageWrapper2.a(context);
        kakaLibImageWrapper2.f21284a = rect;
        c cVar = new c(kakaLibImageWrapper2, a2, j(), 3, (l) new e(this, this, this.n), values, true, i);
        this.m.a(cVar, (a) null, j, map);
        this.j = cVar;
        cot.c("_scancode_ScancodeBizManager", "onGetAlbumImage: token=" + str.hashCode() + ", timeout=" + j);
        return kakaLibImageWrapper2;
    }

    private ScanMode a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScanMode) ipChange.ipc$dispatch("9f2c97b0", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return ScanMode.ACCURATE_MODE;
        }
        return ScanMode.TOUGH_MODE;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    private HashMap<String, String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5a3abb14", new Object[]{this});
        }
        if (this.i == null) {
            this.i = m.a(this.h.n(), this.h.o());
        }
        return this.i;
    }
}
