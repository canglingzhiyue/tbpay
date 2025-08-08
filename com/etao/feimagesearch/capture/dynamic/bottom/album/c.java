package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.k;
import com.etao.feimagesearch.album.o;
import com.etao.feimagesearch.album.q;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.al;
import com.etao.feimagesearch.util.t;
import com.taobao.android.litecreator.comprehension.f;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.collections.p;
import kotlin.text.n;
import tb.com;
import tb.cot;
import tb.cou;
import tb.ctb;
import tb.dau;
import tb.kge;

/* loaded from: classes3.dex */
public final class c extends ctb<d> implements q.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private q e;
    private boolean i;
    private boolean j;
    private boolean k;
    private ExecutorService p;
    private boolean q;
    private final String c = "CaptureAlbumPresenter";
    private com.etao.feimagesearch.album.b d = new com.etao.feimagesearch.album.b(new ArrayList(), new LinkedList());
    private volatile long f = -1;
    private Handler g = new Handler(Looper.getMainLooper());
    private int h = -2;
    private boolean m = true;
    private String l = "PltMediaPermissionRequestTime";
    private final boolean n = com.etao.feimagesearch.config.b.F();

    /* loaded from: classes3.dex */
    public static final class a implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f6522a;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append("plt_album_");
            sb.append(hashCode());
            sb.append('_');
            int i = this.f6522a;
            this.f6522a = i + 1;
            sb.append(i);
            return sb.toString();
        }
    }

    static {
        kge.a(1945076323);
        kge.a(-2103679651);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
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

    /* renamed from: com.etao.feimagesearch.capture.dynamic.bottom.album.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0211c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0211c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            final ArrayList arrayList = new ArrayList();
            d view = c.c(c.this);
            kotlin.jvm.internal.q.a((Object) view, "view");
            Activity s = view.s();
            kotlin.jvm.internal.q.a((Object) s, "view.activity");
            List<o> a2 = t.a(s, true, c.d(c.this));
            if (!a2.isEmpty()) {
                arrayList.addAll(a2);
            }
            d view2 = c.c(c.this);
            kotlin.jvm.internal.q.a((Object) view2, "view");
            Activity s2 = view2.s();
            kotlin.jvm.internal.q.a((Object) s2, "view.activity");
            List<o> a3 = t.a(s2, false, c.d(c.this));
            if (!a3.isEmpty()) {
                arrayList.addAll(a3);
                z = true;
            }
            c.a(c.this, -1L);
            if (arrayList.isEmpty()) {
                return;
            }
            if (z) {
                p.a((List) arrayList, (Comparator) AnonymousClass1.INSTANCE);
            }
            c.e(c.this).post(new Runnable() { // from class: com.etao.feimagesearch.capture.dynamic.bottom.album.c.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    k i2 = c.c(c.this).i();
                    k c = c.this.e().c();
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    for (o oVar : arrayList) {
                        String b = t.INSTANCE.b(oVar);
                        if (!StringUtils.isEmpty(b)) {
                            String str = null;
                            if (oVar.c()) {
                                String h = oVar.h();
                                kotlin.jvm.internal.q.a((Object) h, "mediaItem.path");
                                if (n.c(h, f.FILE_TYPE_VIDEO_MP4, false, 2, (Object) null)) {
                                }
                            }
                            if (oVar.c()) {
                                i6++;
                            }
                            i3++;
                            if (oVar.l()) {
                                i4++;
                                c.this.e().b().addFirst(oVar);
                            }
                            if (i2 != null) {
                                str = i2.b();
                            }
                            if (kotlin.jvm.internal.q.a((Object) b, (Object) str)) {
                                i5++;
                                i2.e().addFirst(oVar);
                                if (oVar.c()) {
                                    i2.g().addFirst(oVar);
                                }
                            } else {
                                k a4 = c.this.e().a(b);
                                if (a4 == null) {
                                    k kVar = new k(b);
                                    kVar.e().add(oVar);
                                    if (oVar.c()) {
                                        kVar.g().add(oVar);
                                    }
                                    c.this.e().a().add(kVar);
                                } else {
                                    a4.a(oVar);
                                }
                            }
                            if (c != null) {
                                c.a(oVar);
                            }
                        }
                    }
                    int k = c.c(c.this).k();
                    if (kotlin.jvm.internal.q.a(c, i2)) {
                        i = i3;
                    } else if (k == 2) {
                        i = i4;
                    } else if (k == 1) {
                        i = i6;
                    } else if (i5 > 0) {
                        i = i5;
                    }
                    c.c(c.this).h_(i);
                }
            });
        }

        /* renamed from: com.etao.feimagesearch.capture.dynamic.bottom.album.c$c$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass1<T> implements Comparator<o> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            @Override // java.util.Comparator
            public /* synthetic */ int compare(o oVar, o oVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, oVar, oVar2})).intValue() : a(oVar, oVar2);
            }

            public final int a(o o1, o o2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56412d39", new Object[]{this, o1, o2})).intValue();
                }
                kotlin.jvm.internal.q.a((Object) o2, "o2");
                long f = o2.f();
                kotlin.jvm.internal.q.a((Object) o1, "o1");
                return (int) (f - o1.f());
            }
        }
    }

    public c() {
        ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(2, new a());
        kotlin.jvm.internal.q.a((Object) newFixedThreadPool, "VExecutors.newFixedThrea…count++}\"\n      }\n\n    })");
        this.p = newFixedThreadPool;
    }

    public static final /* synthetic */ void a(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137e23d2", new Object[]{cVar, new Long(j)});
        } else {
            cVar.f = j;
        }
    }

    public static final /* synthetic */ d c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bc9ded99", new Object[]{cVar}) : (d) cVar.f26504a;
    }

    public static final /* synthetic */ long d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54bcdb43", new Object[]{cVar})).longValue() : cVar.f;
    }

    public static final /* synthetic */ Handler e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("9314fd58", new Object[]{cVar}) : cVar.g;
    }

    public final com.etao.feimagesearch.album.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.album.b) ipChange.ipc$dispatch("d6418bc6", new Object[]{this}) : this.d;
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
        kotlin.jvm.internal.q.a((Object) view, "view");
        this.h = al.b((Context) ((d) view).s());
    }

    @Override // tb.ctb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (!this.i) {
            this.i = true;
            int i = this.h;
            if (i == 0 || i == -1) {
                String str = this.c;
                com.etao.feimagesearch.result.f.a(str, "storage permission authorized, code:" + this.h);
                b(false);
                if (this.h != -1) {
                    return;
                }
                ((d) this.f26504a).g(true);
                return;
            }
            TLogTracker.a("PermissionRequest", "album permission denied");
            ((d) this.f26504a).b(true);
            return;
        }
        T view = this.f26504a;
        kotlin.jvm.internal.q.a((Object) view, "view");
        int b = al.b((Context) ((d) view).s());
        if (b == -2 && this.h != -2) {
            this.h = -2;
            ((d) this.f26504a).b(true);
            ((d) this.f26504a).g(false);
            return;
        }
        if (b == 0) {
            if (this.h != 0) {
                this.h = 0;
                ((d) this.f26504a).g(false);
                b(true);
            } else {
                j();
            }
        }
        if (b != -1) {
            return;
        }
        if (this.h != -1) {
            this.h = -1;
            ((d) this.f26504a).g(true);
            this.q = true;
            b(true);
            return;
        }
        if (this.j) {
            this.q = true;
            b(true);
            this.j = false;
        }
        if (!this.k) {
            return;
        }
        ((d) this.f26504a).g(false);
        this.k = false;
    }

    @Override // tb.ctb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.f = System.currentTimeMillis();
    }

    @Override // tb.ctb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        this.f = System.currentTimeMillis();
        com.etao.feimagesearch.album.f.a().b();
        q qVar = this.e;
        if (qVar != null) {
            qVar.b();
        }
        this.g.removeCallbacksAndMessages(null);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.k = true;
        T view = this.f26504a;
        kotlin.jvm.internal.q.a((Object) view, "view");
        cou.a(((d) view).s(), 1);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        T view = this.f26504a;
        kotlin.jvm.internal.q.a((Object) view, "view");
        boolean a2 = al.a(((d) view).s());
        T view2 = this.f26504a;
        kotlin.jvm.internal.q.a((Object) view2, "view");
        int b = com.etao.feimagesearch.k.b(((d) view2).s(), this.l, 0);
        if (a2) {
            if (b < ((kotlin.jvm.internal.q.a((Object) Build.BRAND, (Object) "HUAWEI") || kotlin.jvm.internal.q.a((Object) Build.BRAND, (Object) "HONOR")) ? 1 : 2)) {
                T view3 = this.f26504a;
                kotlin.jvm.internal.q.a((Object) view3, "view");
                al.a(((d) view3).s(), com.alibaba.ability.localization.b.a(R.string.tao_search_request_album_explain), (al.a) null);
                T view4 = this.f26504a;
                kotlin.jvm.internal.q.a((Object) view4, "view");
                com.etao.feimagesearch.k.a((Context) ((d) view4).s(), this.l, b + 1);
                return;
            }
            T view5 = this.f26504a;
            kotlin.jvm.internal.q.a((Object) view5, "view");
            cou.a(((d) view5).s(), 1);
            return;
        }
        T view6 = this.f26504a;
        kotlin.jvm.internal.q.a((Object) view6, "view");
        al.a(((d) view6).s(), com.alibaba.ability.localization.b.a(R.string.tao_search_request_album_explain), (al.a) null);
        T view7 = this.f26504a;
        kotlin.jvm.internal.q.a((Object) view7, "view");
        com.etao.feimagesearch.k.a((Context) ((d) view7).s(), this.l, b + 1);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j = true;
        al.a(com.alibaba.ability.localization.b.a(R.string.tao_search_request_album_explain), z, (al.a) null);
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.d.d();
            ((d) this.f26504a).p();
        }
        ((d) this.f26504a).c(true);
        if (this.m) {
            this.m = false;
            dau.f();
        }
        this.e = new q(this, com.etao.feimagesearch.config.b.n());
        this.p.submit(this.e);
    }

    @Override // com.etao.feimagesearch.album.q.a
    public void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238d8ad7", new Object[]{this, oVar});
        } else if (!this.n || oVar == null) {
        } else {
            b(oVar);
        }
    }

    @Override // com.etao.feimagesearch.album.q.a
    public void b(k kVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37338cdc", new Object[]{this, kVar});
        } else if (kVar == null) {
        } else {
            if (this.d.a().size() == 0) {
                d dVar = (d) this.f26504a;
                if (this.h != -1) {
                    z = false;
                }
                dVar.a(kVar, z, this.q);
                this.q = false;
            }
            this.d.a().add(kVar);
        }
    }

    @Override // com.etao.feimagesearch.album.q.a
    public void c(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adb605d", new Object[]{this, kVar});
        } else if (kVar == null) {
        } else {
            ((d) this.f26504a).b(kVar);
        }
    }

    @Override // com.etao.feimagesearch.album.q.a
    public void a(List<o> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            this.d.b().addAll(list);
            ((d) this.f26504a).a(this.d.b());
        }
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.h != 0 || this.f <= 0 || !com.etao.feimagesearch.config.b.cT()) {
        } else {
            com.etao.feimagesearch.pipline.c.a(new RunnableC0211c());
        }
    }

    private final void b(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37355e58", new Object[]{this, oVar});
            return;
        }
        cot.c(this.c, "postFirstImageItem");
        if (oVar == null) {
            return;
        }
        try {
            if (oVar.c()) {
                return;
            }
            Rect rect = new Rect(0, 0, com.p(), com.o());
            T view = this.f26504a;
            kotlin.jvm.internal.q.a((Object) view, "view");
            CaptureManager j = ((d) view).j();
            kotlin.jvm.internal.q.a((Object) j, "view.manager");
            com.etao.feimagesearch.album.a B = j.B();
            T view2 = this.f26504a;
            kotlin.jvm.internal.q.a((Object) view2, "view");
            Activity s = ((d) view2).s();
            String uri = oVar.j().toString();
            int i = oVar.i();
            T view3 = this.f26504a;
            kotlin.jvm.internal.q.a((Object) view3, "view");
            String n = oVar.n();
            T view4 = this.f26504a;
            kotlin.jvm.internal.q.a((Object) view4, "view");
            com.etao.feimagesearch.model.b h = ((d) view4).h();
            kotlin.jvm.internal.q.a((Object) h, "view.pageModel");
            B.a(s, uri, i, ((d) view3).j(), n, rect, true, h.getPssource());
        } catch (Exception e) {
            cot.a("PltCamera", this.c, cot.a("preprocessFirstImage", e));
        }
    }
}
