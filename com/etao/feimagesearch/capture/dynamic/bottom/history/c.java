package com.etao.feimagesearch.capture.dynamic.bottom.history;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.g;
import com.etao.feimagesearch.history.AuctionItemVO;
import com.etao.feimagesearch.history.HistoryResult;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.util.i;
import com.taobao.android.searchbaseframe.util.o;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.gateway.util.ScancodeController;
import com.taobao.taobao.scancode.gateway.util.m;
import com.taobao.taobao.scancode.history.object.ScanDo;
import com.taobao.taobao.scancode.history.object.ScanList;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.TypeCastException;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import tb.com;
import tb.cou;
import tb.coy;
import tb.cpk;
import tb.css;
import tb.ctb;
import tb.cuk;
import tb.kge;
import tb.oyg;
import tb.rue;

/* loaded from: classes3.dex */
public final class c extends ctb<com.etao.feimagesearch.capture.dynamic.bottom.history.d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.taobao.scancode.gateway.util.d d;
    private final Handler c = new Handler(Looper.getMainLooper());
    private css e = new e();
    private volatile long f = -1;

    /* loaded from: classes3.dex */
    public static final class a implements m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taobao.scancode.gateway.util.m
        public void startPreview() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a34f68d", new Object[]{this});
            }
        }

        @Override // com.taobao.taobao.scancode.gateway.util.m
        public void stopPreview() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94f92eed", new Object[]{this});
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public static final class a<T> implements Comparator<T> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, t, t2})).intValue() : rue.a(((com.etao.feimagesearch.capture.dynamic.bottom.history.b) t2).a(), ((com.etao.feimagesearch.capture.dynamic.bottom.history.b) t).a());
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Object obj = c.a(c.this).get();
            Object obj2 = c.b(c.this).get();
            ArrayList arrayList = new ArrayList();
            if (obj != null) {
                arrayList.addAll(x.f(obj));
            }
            if (obj2 != null) {
                arrayList.addAll(x.f(obj2));
            }
            if (arrayList.isEmpty()) {
                c.c(c.this).post(new Runnable() { // from class: com.etao.feimagesearch.capture.dynamic.bottom.history.c.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            c.d(c.this).a(new ArrayList());
                        }
                    }
                });
                return;
            }
            List<com.etao.feimagesearch.capture.dynamic.bottom.history.b> a3 = p.a((Iterable) arrayList, (Comparator) new a());
            final ArrayList arrayList2 = new ArrayList();
            String str = "";
            for (com.etao.feimagesearch.capture.dynamic.bottom.history.b bVar : a3) {
                if (com.alibaba.ability.localization.b.c()) {
                    Long a4 = bVar.a();
                    a2 = com.alibaba.ability.localization.d.a(a4 != null ? a4.longValue() : System.currentTimeMillis(), 6);
                } else {
                    com.etao.feimagesearch.util.b bVar2 = com.etao.feimagesearch.util.b.INSTANCE;
                    Long a5 = bVar.a();
                    a2 = bVar2.a(a5 != null ? a5.longValue() : System.currentTimeMillis());
                }
                q.a((Object) a2, "if (Localization.isI18nE…ntTimeMillis())\n        }");
                if (!q.a((Object) str, (Object) a2)) {
                    arrayList2.add(a2);
                    str = a2;
                }
                arrayList2.add(bVar);
            }
            c.c(c.this).post(new Runnable() { // from class: com.etao.feimagesearch.capture.dynamic.bottom.history.c.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.d(c.this).a(arrayList2);
                    }
                }
            });
        }
    }

    /* renamed from: com.etao.feimagesearch.capture.dynamic.bottom.history.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class CallableC0214c implements Callable<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.Callable
        public Object call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            ScanList a2 = oyg.a(com.b());
            if (a2 == null || a2.getList() == null || a2.getList().isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (ScanDo item : a2.getList()) {
                com.etao.feimagesearch.capture.dynamic.bottom.history.b bVar = new com.etao.feimagesearch.capture.dynamic.bottom.history.b();
                q.a((Object) item, "item");
                bVar.a(Long.valueOf(item.getTime()));
                bVar.a(item);
                arrayList.add(bVar);
            }
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Callable<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            HistoryResult a2 = com.etao.feimagesearch.history.a.a().a("all", false, 50);
            if (a2.resultData == null || a2.resultData.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Map<Long, AuctionItemVO> map = a2.resultData;
            q.a((Object) map, "result.resultData");
            for (Map.Entry<Long, AuctionItemVO> entry : map.entrySet()) {
                AuctionItemVO value = entry.getValue();
                com.etao.feimagesearch.capture.dynamic.bottom.history.b bVar = new com.etao.feimagesearch.capture.dynamic.bottom.history.b();
                bVar.a(entry.getKey());
                bVar.a(value);
                arrayList.add(bVar);
                if (value.hasAllowance() && c.e(c.this) < 0) {
                    c cVar = c.this;
                    Long a3 = bVar.a();
                    c.b(cVar, a3 != null ? a3.longValue() : -1L);
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements css {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.css
        public final HashMap<String, String> a() {
            String str;
            String str2 = "";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
            }
            try {
                com.etao.feimagesearch.capture.dynamic.bottom.history.d view = c.d(c.this);
                q.a((Object) view, "view");
                com.etao.feimagesearch.model.b h = view.h();
                q.a((Object) h, "view.pageModel");
                String pageSpm = h.getPageSpm();
                q.a((Object) pageSpm, "view.pageModel.pageSpm");
                com.etao.feimagesearch.capture.dynamic.bottom.history.d view2 = c.d(c.this);
                q.a((Object) view2, "view");
                com.etao.feimagesearch.model.b h2 = view2.h();
                q.a((Object) h2, "view.pageModel");
                str = h2.getPssource();
                q.a((Object) str, "view.pageModel.pssource");
                str2 = pageSpm;
            } catch (Exception unused) {
                str = str2;
            }
            return com.etao.feimagesearch.capture.scan.m.a(str2, str);
        }
    }

    static {
        kge.a(875317635);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -713066196) {
            super.z_();
            return null;
        } else if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 92838762) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c();
            return null;
        }
    }

    public static final /* synthetic */ Future a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("daa17d03", new Object[]{cVar}) : cVar.j();
    }

    public static final /* synthetic */ Future b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("12925822", new Object[]{cVar}) : cVar.k();
    }

    public static final /* synthetic */ void b(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea985b8", new Object[]{cVar, new Long(j)});
        } else {
            cVar.f = j;
        }
    }

    public static final /* synthetic */ Handler c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("9373bebb", new Object[]{cVar}) : cVar.c;
    }

    public static final /* synthetic */ com.etao.feimagesearch.capture.dynamic.bottom.history.d d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.capture.dynamic.bottom.history.d) ipChange.ipc$dispatch("58ea74ae", new Object[]{cVar}) : (com.etao.feimagesearch.capture.dynamic.bottom.history.d) cVar.f26504a;
    }

    public static final /* synthetic */ long e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("95fa915d", new Object[]{cVar})).longValue() : cVar.f;
    }

    @Override // tb.ctb
    public void z_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57f792c", new Object[]{this});
            return;
        }
        super.z_();
        f();
    }

    @Override // tb.ctb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        i();
    }

    @Override // tb.ctb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        this.c.removeCallbacksAndMessages(null);
    }

    public final void a(AuctionItemVO item) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ea5232", new Object[]{this, item});
            return;
        }
        q.c(item, "item");
        coy.b(cpk.ALBUM_PAGE_NAME, "PicHistoryClick", new String[0]);
        if (item.isVideo) {
            if (item.fileUrl == null || !i.c(item.fileUrl)) {
                T view = this.f26504a;
                q.a((Object) view, "view");
                cuk.a(((com.etao.feimagesearch.capture.dynamic.bottom.history.d) view).s(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18953), 0);
                return;
            }
            String uri = Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(item.fileUrl)).build().toString();
            q.a((Object) uri, "Uri.parse(\"https://m.tao…d()\n          .toString()");
            T view2 = this.f26504a;
            q.a((Object) view2, "view");
            cou.a(((com.etao.feimagesearch.capture.dynamic.bottom.history.d) view2).s(), uri);
        }
        T view3 = this.f26504a;
        q.a((Object) view3, "view");
        IrpParamModel irpParamModel = new IrpParamModel(((com.etao.feimagesearch.capture.dynamic.bottom.history.d) view3).h());
        irpParamModel.setPicUrl(item.picPath);
        irpParamModel.setPhotoFrom(PhotoFrom.Values.HISTORY);
        if (item.mSource != null) {
            Integer num = item.mSource;
            q.a((Object) num, "item.mSource");
            i = num.intValue();
        }
        irpParamModel.setPhotoSource(i);
        if (item.mExtraJSKV != null) {
            for (Map.Entry<String, String> entry : item.mExtraJSKV.entrySet()) {
                irpParamModel.addJsExtraParam(entry.getKey(), entry.getValue());
            }
        }
        T view4 = this.f26504a;
        q.a((Object) view4, "view");
        cou.a(((com.etao.feimagesearch.capture.dynamic.bottom.history.d) view4).s(), irpParamModel);
    }

    public final void a(ScanDo item) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9453cb1", new Object[]{this, item});
            return;
        }
        q.c(item, "item");
        coy.b(cpk.ALBUM_PAGE_NAME, "ScanHistoryClick", new String[0]);
        boolean d2 = o.d();
        T view = this.f26504a;
        q.a((Object) view, "view");
        oyg.a(d2, ((com.etao.feimagesearch.capture.dynamic.bottom.history.d) view).s(), item, this.d, this.e);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        oyg.b(com.b());
        com.etao.feimagesearch.history.a.a().c();
        g.a().b();
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.f > 0) {
            return com.etao.feimagesearch.util.b.a(Long.valueOf(this.f));
        }
        return false;
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.capture.scan.g gVar = new com.etao.feimagesearch.capture.scan.g();
        T view = this.f26504a;
        q.a((Object) view, "view");
        gVar.a(((com.etao.feimagesearch.capture.dynamic.bottom.history.d) view).s());
        com.etao.feimagesearch.capture.scan.g gVar2 = gVar;
        ScancodeController scancodeController = new ScancodeController(new a());
        T view2 = this.f26504a;
        q.a((Object) view2, "view");
        Activity s = ((com.etao.feimagesearch.capture.dynamic.bottom.history.d) view2).s();
        if (s != null) {
            this.d = new com.taobao.taobao.scancode.gateway.util.d(gVar2, scancodeController, (FragmentActivity) s, this.e);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            com.etao.feimagesearch.pipline.c.a(new b());
        }
    }

    private final Future<Object> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("2215fc07", new Object[]{this});
        }
        this.f = -1L;
        return com.etao.feimagesearch.pipline.c.b(new d());
    }

    private final Future<Object> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("9fedb808", new Object[]{this}) : com.etao.feimagesearch.pipline.c.b(new CallableC0214c());
    }
}
