package com.etao.feimagesearch.videosearch;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.VideoIrpActivity;
import com.etao.feimagesearch.jni.PailitaoCUtil;
import com.etao.feimagesearch.nn.optimize.c;
import com.etao.feimagesearch.videosearch.g;
import com.etao.feimagesearch.videosearch.i;
import com.taobao.avplayer.av;
import com.taobao.avplayer.bk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref;
import tb.com;
import tb.cox;
import tb.cqz;
import tb.csz;
import tb.cuk;
import tb.kge;

/* loaded from: classes4.dex */
public final class m implements av {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h Companion;

    /* renamed from: a  reason: collision with root package name */
    private com.etao.feimagesearch.nn.c f7066a;
    private final VideoIrpActivity b;
    private final ThreadPoolExecutor c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private long i;
    private int j;
    private com.etao.feimagesearch.videosearch.g k;
    private i l;
    private String m;
    private ViewGroup n;
    private boolean o;
    private bk p;

    /* loaded from: classes4.dex */
    public static final class d implements g.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.etao.feimagesearch.videosearch.g.a
        public final void a(Bitmap bitmap, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb5ddcbe", new Object[]{this, bitmap, new Long(j)});
                return;
            }
            kotlin.jvm.internal.q.c(bitmap, "bitmap");
            m.a(m.this, bitmap, j);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements g.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.etao.feimagesearch.videosearch.g.a
        public final void a(Bitmap bitmap, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb5ddcbe", new Object[]{this, bitmap, new Long(j)});
                return;
            }
            kotlin.jvm.internal.q.c(bitmap, "bitmap");
            m.a(m.this, bitmap, j);
        }
    }

    static {
        kge.a(1133422406);
        kge.a(688755897);
        Companion = new h(null);
    }

    @Override // com.taobao.avplayer.av
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.avplayer.av
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    /* loaded from: classes4.dex */
    public static final class h {
        static {
            kge.a(247640846);
        }

        private h() {
        }

        public /* synthetic */ h(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public m(VideoIrpActivity activity) {
        kotlin.jvm.internal.q.c(activity, "activity");
        this.b = activity;
        this.c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), c.INSTANCE);
        this.m = "";
        this.o = !com.etao.feimagesearch.config.b.y() || !PailitaoCUtil.d();
        this.c.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        this.c.allowCoreThreadTimeOut(true);
    }

    public static final /* synthetic */ void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749e50a5", new Object[]{mVar});
        } else {
            mVar.k();
        }
    }

    public static final /* synthetic */ void a(m mVar, Bitmap bitmap, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8bbebb", new Object[]{mVar, bitmap, new Long(j)});
        } else {
            mVar.a(bitmap, j);
        }
    }

    public static final /* synthetic */ void a(m mVar, com.etao.feimagesearch.nn.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784884d9", new Object[]{mVar, cVar});
        } else {
            mVar.f7066a = cVar;
        }
    }

    public static final /* synthetic */ void a(m mVar, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87e4da6", new Object[]{mVar, iVar});
        } else {
            mVar.l = iVar;
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.nn.c b(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.nn.c) ipChange.ipc$dispatch("d36f1bf4", new Object[]{mVar}) : mVar.f7066a;
    }

    public static final /* synthetic */ VideoIrpActivity c(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoIrpActivity) ipChange.ipc$dispatch("af4235ae", new Object[]{mVar}) : mVar.b;
    }

    public static final /* synthetic */ void d(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24629ce8", new Object[]{mVar});
        } else {
            mVar.o();
        }
    }

    public static final /* synthetic */ void e(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a40ba9", new Object[]{mVar});
        } else {
            mVar.m();
        }
    }

    public static final /* synthetic */ i f(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("d7040dad", new Object[]{mVar}) : mVar.l;
    }

    public static final /* synthetic */ ThreadPoolExecutor g(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("e5d7b50b", new Object[]{mVar}) : mVar.c;
    }

    public static final /* synthetic */ int h(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b96857df", new Object[]{mVar})).intValue() : mVar.j;
    }

    /* loaded from: classes4.dex */
    public static final class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "VideoDetector");
        }
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.h;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        kotlin.jvm.internal.q.c(str, "<set-?>");
        this.m = str;
    }

    public final void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.n = viewGroup;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.f7066a != null) {
        } else {
            cqz cqzVar = new cqz();
            cqzVar.name = "video_irp";
            cqzVar.type = "Video";
            this.f7066a = new com.etao.feimagesearch.nn.c(cqzVar.type);
            cox.a("ModelBuild", new String[0]);
            com.etao.feimagesearch.nn.c cVar = this.f7066a;
            if (cVar == null) {
                return;
            }
            cVar.a(cqzVar, new a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements com.etao.feimagesearch.nn.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.etao.feimagesearch.nn.e
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public a() {
        }

        @Override // com.etao.feimagesearch.nn.e
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                m.a(m.this);
            }
        }

        @Override // com.etao.feimagesearch.nn.e
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                cox.a("ModelNotAvailable", new String[0]);
            }
        }

        @Override // com.etao.feimagesearch.nn.e
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            com.etao.feimagesearch.nn.c b = m.b(m.this);
            if (b != null) {
                b.b();
            }
            m.a(m.this, (com.etao.feimagesearch.nn.c) null);
            m.c(m.this).m();
        }
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        i iVar = this.l;
        if (iVar == null) {
            return;
        }
        iVar.c();
    }

    public final TextureView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("cf10ae86", new Object[]{this});
        }
        TextureView a2 = this.b.a(this.n);
        if (a2 != null) {
            a2.setRotation(this.j);
        }
        return a2;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!this.d) {
        } else {
            if (z) {
                this.i = System.currentTimeMillis() - this.i;
                this.h += this.i;
                this.d = false;
                bk bkVar = this.p;
                if (bkVar != null) {
                    bkVar.pauseVideo();
                }
                j();
                com.etao.feimagesearch.nn.c cVar = this.f7066a;
                if (cVar != null) {
                    cVar.b();
                }
                this.f7066a = null;
                this.e = false;
                return;
            }
            g gVar = new g();
            com.etao.feimagesearch.nn.c cVar2 = this.f7066a;
            if (cVar2 == null) {
                return;
            }
            cVar2.a("video_irp", "videoDetect", null, gVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements com.etao.feimagesearch.nn.j<com.etao.feimagesearch.nn.optimize.b, com.etao.feimagesearch.nn.optimize.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.etao.feimagesearch.nn.j
        public /* bridge */ /* synthetic */ void a(com.etao.feimagesearch.nn.optimize.c cVar) {
        }

        @Override // com.etao.feimagesearch.nn.j
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public com.etao.feimagesearch.nn.optimize.c e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.etao.feimagesearch.nn.optimize.c) ipChange.ipc$dispatch("56c90528", new Object[]{this});
            }
            return null;
        }

        public g() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.etao.feimagesearch.nn.optimize.b] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.nn.optimize.b b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
        }

        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ void b(com.etao.feimagesearch.nn.optimize.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f056ab85", new Object[]{this, cVar});
            } else {
                a2(cVar);
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.etao.feimagesearch.nn.optimize.c, java.lang.Object] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.nn.optimize.c f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : e();
        }

        public com.etao.feimagesearch.nn.optimize.b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.etao.feimagesearch.nn.optimize.b) ipChange.ipc$dispatch("3934308d", new Object[]{this}) : new com.etao.feimagesearch.nn.optimize.b();
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void a2(com.etao.feimagesearch.nn.optimize.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d1ef226", new Object[]{this, cVar});
                return;
            }
            com.etao.feimagesearch.nn.c b = m.b(m.this);
            if (b != null) {
                b.a();
            }
            m.this.b(true);
            if (cVar == null) {
                return;
            }
            m.c(m.this).b(cVar.a());
        }

        @Override // com.etao.feimagesearch.nn.j
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            com.etao.feimagesearch.nn.c b = m.b(m.this);
            if (b != null) {
                b.a();
            }
            m.this.b(true);
        }
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.o) {
            com.etao.feimagesearch.videosearch.g gVar = this.k;
            if (gVar == null) {
                return;
            }
            gVar.a();
        } else {
            i iVar = this.l;
            if (iVar == null) {
                return;
            }
            iVar.b();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d || this.f) {
        } else {
            if (this.o) {
                m();
            } else {
                l();
            }
            this.i = System.currentTimeMillis();
            this.d = true;
            i();
        }
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (com.a()) {
            cuk.a().a(com.b(), "硬件解码");
        }
        if (this.l != null) {
            return;
        }
        this.l = new i(this.m, this.b.d(), new e(), new f());
    }

    /* loaded from: classes4.dex */
    public static final class f implements i.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes4.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (m.c(m.this).isFinishing()) {
                } else {
                    m.e(m.this);
                }
            }
        }

        public f() {
        }

        @Override // com.etao.feimagesearch.videosearch.i.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                m.d(m.this);
            }
        }

        @Override // com.etao.feimagesearch.videosearch.i.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            m.this.a(true);
            m.c(m.this).runOnUiThread(new a());
            i f = m.f(m.this);
            if (f != null) {
                f.c();
            }
            m.a(m.this, (i) null);
        }
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (com.a()) {
            cuk.a().a(com.b(), "软件解码");
        }
        n();
        if (this.k != null) {
            return;
        }
        this.k = new com.etao.feimagesearch.videosearch.g(this, this.b.d(), new d());
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        bk bkVar = this.p;
        if (bkVar != null) {
            if (bkVar == null) {
                return;
            }
            bkVar.playVideo();
            return;
        }
        VideoIrpActivity videoIrpActivity = this.b;
        this.p = videoIrpActivity.a(videoIrpActivity, this.m, 640, 640, this);
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            bk bkVar2 = this.p;
            viewGroup.addView(bkVar2 != null ? bkVar2.getView() : null, new FrameLayout.LayoutParams(-2, -2));
        }
        bk bkVar3 = this.p;
        if (bkVar3 != null) {
            bkVar3.setPlayRate(2.0f);
        }
        bk bkVar4 = this.p;
        if (bkVar4 == null) {
            return;
        }
        bkVar4.start();
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        bk bkVar = this.p;
        if (bkVar == null) {
            return 0;
        }
        return bkVar.getCurrentPosition();
    }

    /* loaded from: classes4.dex */
    public static final class b implements com.etao.feimagesearch.nn.j<com.etao.feimagesearch.nn.optimize.b, com.etao.feimagesearch.nn.optimize.c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ Bitmap c;

        /* loaded from: classes4.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.etao.feimagesearch.nn.optimize.c f7069a;
            public final /* synthetic */ b b;
            public final /* synthetic */ com.etao.feimagesearch.nn.optimize.c c;

            public a(com.etao.feimagesearch.nn.optimize.c cVar, b bVar, com.etao.feimagesearch.nn.optimize.c cVar2) {
                this.f7069a = cVar;
                this.b = bVar;
                this.c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [T, android.graphics.Bitmap] */
            /* JADX WARN: Type inference failed for: r0v33, types: [T, android.graphics.Bitmap] */
            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Bitmap a2 = com.etao.feimagesearch.util.d.a(this.b.c, 640, 320);
                final String a3 = com.etao.feimagesearch.util.l.a(m.c(m.this), a2, 90);
                this.b.c.recycle();
                if (a2 != null) {
                    a2.recycle();
                }
                List<c.a> c = this.f7069a.c();
                kotlin.jvm.internal.q.a((Object) c, "it.detectList");
                if (!(!c.isEmpty())) {
                    m.c(m.this).runOnUiThread(new Runnable() { // from class: com.etao.feimagesearch.videosearch.m.b.a.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Iterator<c.b> it = a.this.f7069a.d().iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                    });
                    return;
                }
                for (final c.a aVar : this.f7069a.c()) {
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = aVar.f6923a;
                    if (m.h(m.this) != 0) {
                        Matrix matrix = new Matrix();
                        Bitmap bitmap = aVar.f6923a;
                        kotlin.jvm.internal.q.a((Object) bitmap, "detect.bitmap");
                        Bitmap bitmap2 = aVar.f6923a;
                        kotlin.jvm.internal.q.a((Object) bitmap2, "detect.bitmap");
                        matrix.setRotate(m.h(m.this), bitmap.getWidth() / 2.0f, bitmap2.getHeight() / 2.0f);
                        Bitmap bitmap3 = aVar.f6923a;
                        Bitmap bitmap4 = aVar.f6923a;
                        kotlin.jvm.internal.q.a((Object) bitmap4, "detect.bitmap");
                        int width = bitmap4.getWidth();
                        Bitmap bitmap5 = aVar.f6923a;
                        kotlin.jvm.internal.q.a((Object) bitmap5, "detect.bitmap");
                        objectRef.element = Bitmap.createBitmap(bitmap3, 0, 0, width, bitmap5.getHeight(), matrix, false);
                        aVar.f6923a.recycle();
                    }
                    final String a4 = com.etao.feimagesearch.util.l.a(m.c(m.this), (Bitmap) objectRef.element, 70);
                    m.c(m.this).runOnUiThread(new Runnable() { // from class: com.etao.feimagesearch.videosearch.m.b.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            VideoIrpActivity c2 = m.c(m.this);
                            Bitmap bitmap6 = (Bitmap) objectRef.element;
                            kotlin.jvm.internal.q.a((Object) bitmap6, "bitmap");
                            String name = a4;
                            kotlin.jvm.internal.q.a((Object) name, "name");
                            String frame = a3;
                            kotlin.jvm.internal.q.a((Object) frame, "frame");
                            RectF rectF = aVar.b;
                            kotlin.jvm.internal.q.a((Object) rectF, "detect.rect");
                            c2.a(bitmap6, name, frame, rectF, a.this.c.b(), aVar.c);
                        }
                    });
                }
            }
        }

        @Override // com.etao.feimagesearch.nn.j
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public com.etao.feimagesearch.nn.optimize.c e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.etao.feimagesearch.nn.optimize.c) ipChange.ipc$dispatch("56c90528", new Object[]{this});
            }
            return null;
        }

        public b(long j, Bitmap bitmap) {
            this.b = j;
            this.c = bitmap;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.etao.feimagesearch.nn.optimize.b] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.nn.optimize.b b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.etao.feimagesearch.nn.optimize.c, java.lang.Object] */
        @Override // com.etao.feimagesearch.nn.j
        public /* synthetic */ com.etao.feimagesearch.nn.optimize.c f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : e();
        }

        public com.etao.feimagesearch.nn.optimize.b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.etao.feimagesearch.nn.optimize.b) ipChange.ipc$dispatch("3934308d", new Object[]{this}) : new com.etao.feimagesearch.nn.optimize.b((int) this.b, this.c);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void a(com.etao.feimagesearch.nn.optimize.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d1ef226", new Object[]{this, cVar});
            } else if (cVar == null) {
            } else {
                if (cVar.c().isEmpty() && cVar.d().isEmpty()) {
                    return;
                }
                m.g(m.this).execute(new a(cVar, this, cVar));
            }
        }

        @Override // com.etao.feimagesearch.nn.j
        public void b(com.etao.feimagesearch.nn.optimize.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("126060e7", new Object[]{this, cVar});
                return;
            }
            com.etao.feimagesearch.nn.c b = m.b(m.this);
            if (b != null) {
                b.a();
            }
            m.a(m.this);
        }

        @Override // com.etao.feimagesearch.nn.j
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            com.etao.feimagesearch.nn.c b = m.b(m.this);
            if (b != null) {
                b.a();
            }
            m.a(m.this);
        }
    }

    private final void a(Bitmap bitmap, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5ddcbe", new Object[]{this, bitmap, new Long(j)});
            return;
        }
        this.j = this.b.i();
        b bVar = new b(j, bitmap);
        com.etao.feimagesearch.nn.c cVar = this.f7066a;
        if (cVar == null) {
            return;
        }
        cVar.a("video_irp", "videoDetect", null, bVar);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            i();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        bk bkVar = this.p;
        if (bkVar != null) {
            bkVar.closeVideo();
        }
        bk bkVar2 = this.p;
        if (bkVar2 != null) {
            bkVar2.destroy();
        }
        this.p = null;
        this.c.shutdownNow();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if (this.g) {
        } else {
            this.g = true;
            csz.a(0L, 0L, false, this.b.c());
        }
    }

    private final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        if (com.etao.feimagesearch.config.b.x()) {
            b(true);
        } else {
            b(false);
        }
        this.f = true;
        this.b.n();
    }

    @Override // com.taobao.avplayer.av
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i < i3) {
        } else {
            o();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        bk bkVar = this.p;
        if (bkVar == null) {
            return;
        }
        bkVar.playVideo();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        bk bkVar = this.p;
        if (bkVar == null) {
            return;
        }
        bkVar.pauseVideo();
    }
}
