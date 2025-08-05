package com.etao.feimagesearch.album;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.etao.feimagesearch.capture.scan.ScanMode;
import com.etao.feimagesearch.capture.scan.c;
import com.etao.feimagesearch.capture.scan.i;
import com.etao.feimagesearch.capture.scan.l;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.n;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import java.util.Objects;
import tb.cok;
import tb.coo;
import tb.cot;
import tb.fkj;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private C0207a f6486a = null;

    /* renamed from: com.etao.feimagesearch.album.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0207a extends e {

        /* renamed from: a  reason: collision with root package name */
        public i f6492a;

        static {
            kge.a(-1372166090);
        }

        public C0207a(String str, Bitmap bitmap, int i, PhotoFrom.Values values, int i2, String str2, KakaLibImageWrapper kakaLibImageWrapper) {
            super(str, bitmap, i, values, i2, str2, kakaLibImageWrapper);
            this.f6492a = null;
        }
    }

    static {
        kge.a(311584527);
    }

    public static /* synthetic */ C0207a a(a aVar, C0207a c0207a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0207a) ipChange.ipc$dispatch("35eb6291", new Object[]{aVar, c0207a});
        }
        aVar.f6486a = c0207a;
        return c0207a;
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23872da5", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    public static /* synthetic */ void a(a aVar, KakaLibImageWrapper kakaLibImageWrapper, int i, PhotoFrom.Values values, String str, String str2, C0207a c0207a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c331d0d2", new Object[]{aVar, kakaLibImageWrapper, new Integer(i), values, str, str2, c0207a});
        } else {
            aVar.a(kakaLibImageWrapper, i, values, str, str2, c0207a);
        }
    }

    public static /* synthetic */ C0207a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0207a) ipChange.ipc$dispatch("1035fc10", new Object[]{aVar}) : aVar.f6486a;
    }

    public void a(final Activity activity, final String str, final int i, final CaptureManager captureManager, final String str2, final Rect rect, final boolean z, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b254516", new Object[]{this, activity, str, new Integer(i), captureManager, str2, rect, new Boolean(z), str3});
            return;
        }
        cot.c("_scancode_AlbumPreprocessor", "preProcess path:" + str + ", pssource:" + str3);
        if (str == null || TextUtils.isEmpty(str)) {
            cot.b("_scancode_AlbumPreprocessor", "path is null");
            return;
        }
        C0207a c0207a = this.f6486a;
        if (c0207a != null && Objects.equals(c0207a.a(), str)) {
            cot.c("_scancode_AlbumPreprocessor", "path is already in cache");
        } else {
            VExecutors.defaultSharedThreadPool().submit(new n.a(activity, str, i, new n.b() { // from class: com.etao.feimagesearch.album.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.n.b
                public void a(Bitmap bitmap, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eb5ddcbe", new Object[]{this, bitmap, new Long(j)});
                        return;
                    }
                    cot.c("_scancode_AlbumPreprocessor", "onSuccess");
                    KakaLibImageWrapper kakaLibImageWrapper = new KakaLibImageWrapper(str, com.etao.feimagesearch.capture.scan.m.a(activity) ? ScanFromEnum.SYS_ALBUM.getScanFrom() : ScanFromEnum.PLT_ALBUM.getScanFrom());
                    kakaLibImageWrapper.a(str);
                    kakaLibImageWrapper.a(bitmap);
                    kakaLibImageWrapper.a(bitmap.getWidth());
                    kakaLibImageWrapper.b(bitmap.getHeight());
                    kakaLibImageWrapper.a(activity);
                    kakaLibImageWrapper.f21284a = rect;
                    PhotoFrom.Values values = z ? PhotoFrom.Values.OUTER_ALBUM_LOCAL : PhotoFrom.Values.ALBUM;
                    C0207a c0207a2 = new C0207a(str, bitmap, i, values, 1, str2, kakaLibImageWrapper);
                    a.a(a.this, kakaLibImageWrapper, i, values, "a2141.7631739", str3, c0207a2);
                    a.a(a.this, c0207a2);
                    cot.c("_scancode_AlbumPreprocessor", "cache result");
                    if (captureManager.U()) {
                        a.a(a.this);
                    }
                    if (captureManager.C()) {
                        a.this.a();
                    }
                    if (!captureManager.V()) {
                        return;
                    }
                    a.this.c();
                }

                @Override // com.etao.feimagesearch.util.n.b
                public void a(String str4, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str4, str5});
                        return;
                    }
                    cot.a("IrpPipLine", "_scancode_AlbumPreprocessor", "onFail: errorCode " + str4 + ", errorMsg " + str5);
                }
            }, false));
        }
    }

    public C0207a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0207a) ipChange.ipc$dispatch("2a914284", new Object[]{this, str});
        }
        if (this.f6486a != null && !TextUtils.isEmpty(str) && Objects.equals(this.f6486a.a(), str)) {
            return this.f6486a;
        }
        return null;
    }

    private void a(KakaLibImageWrapper kakaLibImageWrapper, int i, PhotoFrom.Values values, String str, String str2, final C0207a c0207a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8121415", new Object[]{this, kakaLibImageWrapper, new Integer(i), values, str, str2, c0207a});
            return;
        }
        final c cVar = new c(kakaLibImageWrapper, ScanMode.ACCURATE_MODE, com.etao.feimagesearch.capture.scan.m.a(str, str2), 3, (l) null, values, true, i);
        VExecutors.defaultSharedThreadPool().submit(new ac("asyncDecode") { // from class: com.etao.feimagesearch.album.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                i c = cVar.c();
                if (c == null || c.c() == null || c.c().length == 0) {
                    return;
                }
                c0207a.f6492a = c;
                com.etao.feimagesearch.capture.scan.irp.b.a().a(cVar, c);
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        final coo a2 = cok.a();
        if (a2 == null) {
            return;
        }
        a2.b(new com.etao.feimagesearch.mnn.k() { // from class: com.etao.feimagesearch.album.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.mnn.k
            public void a(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                }
            }

            @Override // com.etao.feimagesearch.mnn.k
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                a2.c(this);
                try {
                    if (a.b(a.this) == null) {
                        return;
                    }
                    cot.c("_scancode_AlbumPreprocessor", "asyncDetectFace: onPrepareSuccess " + a2.getClass().getSimpleName());
                    if (!fkj.a().a(a.b(a.this).c())) {
                        return;
                    }
                    a.b(a.this).a(a.b(a.this).g() | 16);
                } catch (Exception unused) {
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.etao.feimagesearch.capture.scan.irp.c.Companion.a().a(new com.etao.feimagesearch.mnn.k() { // from class: com.etao.feimagesearch.album.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.mnn.k
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    com.etao.feimagesearch.capture.scan.irp.c.Companion.a().b(this);
                    if (a.b(a.this) == null) {
                        return;
                    }
                    cot.c("_scancode_AlbumPreprocessor", "asyncDetectChannel: onPrepareSuccess");
                    try {
                        com.etao.feimagesearch.capture.scan.irp.c.Companion.a().a(new com.etao.feimagesearch.mnn.channel.a(a.b(a.this).c(), a.b(a.this).f()));
                        a.b(a.this).a(a.b(a.this).g() | 256);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.etao.feimagesearch.mnn.k
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    } else {
                        com.etao.feimagesearch.capture.scan.irp.c.Companion.a().b(this);
                    }
                }
            });
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.a(new com.etao.feimagesearch.mnn.k() { // from class: com.etao.feimagesearch.album.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.mnn.k
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.b(this);
                    if (a.b(a.this) == null) {
                        return;
                    }
                    cot.c("_scancode_AlbumPreprocessor", "asyncFeatureExtract: onPrepareSuccess");
                    try {
                        com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.a(new com.etao.feimagesearch.mnn.featureextract.a(a.b(a.this).c()));
                        a.b(a.this).a(a.b(a.this).g() | 261);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.etao.feimagesearch.mnn.k
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    } else {
                        com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.b(this);
                    }
                }
            });
        }
    }
}
