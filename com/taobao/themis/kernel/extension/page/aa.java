package com.taobao.themis.kernel.extension.page;

import android.os.SystemClock;
import android.taobao.windvane.export.network.Request;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.z;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import tb.kge;
import tb.qqa;
import tb.shc;
import tb.suj;
import tb.thk;
import tb.toa;

/* loaded from: classes9.dex */
public final class aa implements z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f22513a;
    private final String b;
    private final ITMSPage c;

    static {
        kge.a(-1079610726);
        kge.a(-1315431813);
    }

    public aa(ITMSPage page) {
        kotlin.jvm.internal.q.d(page, "page");
        this.c = page;
        this.f22513a = "ssr";
        this.b = "RUMPageExtension";
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            z.a.a(this);
        }
    }

    /* loaded from: classes9.dex */
    public static final class a implements qqa.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f22514a;

        @Override // tb.qqa.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public a(ITMSPage iTMSPage) {
            this.f22514a = iTMSPage;
        }

        @Override // tb.qqa.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            thk a2 = com.taobao.themis.kernel.utils.a.a(this.f22514a.b());
            if (a2 == null) {
                return;
            }
            a2.a("containerInitEnd");
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        kotlin.jvm.internal.q.d(page, "page");
        z.a.a(this, page);
        page.a(new a(page));
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        shc a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        z.a.b(this);
        thk thkVar = (thk) this.c.b().b(thk.class);
        if (thkVar == null || (a2 = thkVar.a()) == null) {
            return;
        }
        a2.c();
    }

    private final shc a() {
        long e;
        shc a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shc) ipChange.ipc$dispatch("f0a7e30", new Object[]{this});
        }
        com.taobao.analysis.v3.r rVar = FalcoGlobalTracer.get();
        if (this.c.b().i() == TMSContainerType.EMBEDDED) {
            toa toaVar = (toa) this.c.b().b(toa.class);
            return (toaVar == null || (a2 = toaVar.a()) == null) ? rVar.a(shc.MODULE, shc.SCENE_TAP).av_() : a2;
        }
        com.taobao.analysis.v3.r rVar2 = FalcoGlobalTracer.get();
        kotlin.jvm.internal.q.b(rVar2, "FalcoGlobalTracer.get()");
        shc h = rVar2.h();
        shc shcVar = h;
        shc span = rVar.a(shc.MODULE, shc.SCENE_TAP).a(shcVar).av_();
        span.a(h);
        if (!kotlin.jvm.internal.q.a((Object) b(this.c), (Object) "tab")) {
            return span;
        }
        thk thkVar = (thk) this.c.b().b(thk.class);
        if (thkVar != null) {
            kotlin.jvm.internal.q.b(span, "span");
            thkVar.a(span);
        }
        o oVar = (o) this.c.a(o.class);
        if (oVar == null || !oVar.a()) {
            thk a3 = com.taobao.themis.kernel.utils.a.a(this.c.b());
            e = a3 != null ? a3.e("startSwitchTime") : System.currentTimeMillis();
        } else {
            e = span.k();
        }
        return rVar.a(shc.MODULE, shc.SCENE_TAP).a(e).a(shcVar).av_();
    }

    @Override // com.taobao.themis.kernel.extension.page.z
    public void a(boolean z) {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            if (!com.taobao.themis.kernel.utils.n.aB()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.uptimeMillis();
            thk a2 = com.taobao.themis.kernel.utils.a.a(this.c.b());
            if (a2 == null) {
                return;
            }
            com.taobao.themis.kernel.entity.a c = this.c.c();
            shc a3 = a();
            if (a3 == null) {
                return;
            }
            if (kotlin.jvm.internal.q.a((Object) b(this.c), (Object) "tab") && (oVar = (o) this.c.a(o.class)) != null && oVar.a()) {
                a2.a(a3);
            }
            a3.p(this.c.b().h());
            a3.q(b(this.c));
            if (!StringUtils.isEmpty(c.e().e())) {
                a3.g_(c.e().e());
            }
            a3.n(this.f22513a);
            o oVar2 = (o) this.c.a(o.class);
            if (oVar2 != null && oVar2.a()) {
                if (a2.b("containerStart")) {
                    a3.j(Long.valueOf(com.taobao.themis.utils.f.f(a2.c("containerStart"))));
                }
                if (a2.b("containerInitEnd")) {
                    a3.o(Long.valueOf(com.taobao.themis.utils.f.f(a2.c("containerInitEnd"))));
                }
                if (a2.d("engineInitStart")) {
                    a3.a_(Long.valueOf(a2.e("engineInitStart")));
                }
                if (a2.d("engineInitEnd")) {
                    a3.n(Long.valueOf(a2.e("engineInitEnd")));
                }
            }
            if (a2.d("H5_JST_FCP")) {
                a3.r(Long.valueOf(a2.e("H5_JST_FCP") + currentTimeMillis));
            }
            if (kotlin.jvm.internal.q.a((Object) this.f22513a, (Object) "ssr") && a2.d("H5_JST_displayedTime_SSR")) {
                a3.s(Long.valueOf(a2.e("H5_JST_displayedTime_SSR") + currentTimeMillis));
            } else if (a2.d("H5_JST_displayedTime")) {
                a3.s(Long.valueOf(a2.e("H5_JST_displayedTime") + currentTimeMillis));
            }
            if (a2.b("renderStrategy")) {
                a3.n(a2.c("renderStrategy"));
            }
            if (a2.d("pageCreateEnd")) {
                a3.j(Long.valueOf(a2.e("pageCreateEnd")));
            }
            if (a2.b("mainDocumentRequestStart")) {
                a3.p(Long.valueOf(com.taobao.themis.utils.f.f(a2.c("mainDocumentRequestStart"))));
            } else if (a2.d(Request.StageName.DOCUMENT_REQUEST_START)) {
                a3.p(Long.valueOf(a2.e(Request.StageName.DOCUMENT_REQUEST_START) + currentTimeMillis));
            }
            if (a2.b("mainDocumentRequestFinish")) {
                a3.q(Long.valueOf(com.taobao.themis.utils.f.f(a2.c("mainDocumentRequestFinish"))));
            } else if (a2.d(Request.StageName.DOCUMENT_REQUEST_END)) {
                a3.q(Long.valueOf(a2.e(Request.StageName.DOCUMENT_REQUEST_END) + currentTimeMillis));
            }
            if (a2.b("kernelType")) {
                a3.o(a2.c("kernelType"));
            }
            a(a3, currentTimeMillis);
            a(a3);
            if (!z) {
                return;
            }
            a3.c();
        } catch (Exception e) {
            String str = this.b;
            TMSLogger.d(str, "commitPageRUM error " + e.getMessage());
        }
    }

    public static /* synthetic */ long a(aa aaVar, shc shcVar, thk thkVar, String str, long j, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7b2dc1b", new Object[]{aaVar, shcVar, thkVar, str, new Long(j), new Boolean(z), new Integer(i), obj})).longValue();
        }
        return aaVar.a(shcVar, thkVar, str, j, (i & 16) != 0 ? true : z);
    }

    private final long a(shc shcVar, thk thkVar, String str, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de8b5851", new Object[]{this, shcVar, thkVar, str, new Long(j), new Boolean(z)})).longValue();
        }
        long e = thkVar.e(str);
        if (!z) {
            j = 0;
        }
        return (e + j) - shcVar.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x012c, code lost:
        if (r0.a() == true) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(tb.shc r19, long r20) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.kernel.extension.page.aa.a(tb.shc, long):void");
    }

    private final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        TMSSolutionType j = this.c.b().j();
        if (j != null) {
            switch (ad.$EnumSwitchMapping$0[j.ordinal()]) {
                case 2:
                    return "MINIGAME";
                case 3:
                    return "CLUSTER_WIDGET";
                case 4:
                    return "UNIAPP";
                case 5:
                    return "WIDGET";
                case 6:
                    return "MIX";
                case 7:
                    return AbsInputFrame2.CALL_BACK_TYPE_WEEX;
            }
        }
        return "WEB_SINGLE_PAGE";
    }

    private final void a(shc shcVar) {
        thk thkVar;
        shc a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb9cb6a", new Object[]{this, shcVar});
        } else if (!StringUtils.equals(b(this.c), "tab") || (thkVar = (thk) this.c.b().b(thk.class)) == null || (a2 = thkVar.a()) == null) {
        } else {
            shcVar.a(a2);
        }
    }

    private final String b(ITMSPage iTMSPage) {
        ITMSPage a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e6dda8c", new Object[]{this, iTMSPage});
        }
        if (iTMSPage.b().i() == TMSContainerType.EMBEDDED) {
            return "embed";
        }
        n nVar = (n) iTMSPage.a(n.class);
        return ((nVar == null || (a2 = nVar.a()) == null) ? null : (suj) a2.a(suj.class)) != null ? "tab" : "page";
    }

    @Override // com.taobao.themis.kernel.extension.page.z
    public void a(String renderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, renderType});
            return;
        }
        kotlin.jvm.internal.q.d(renderType, "renderType");
        this.f22513a = renderType;
    }
}
