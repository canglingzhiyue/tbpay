package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.intelli.ClientModelType;
import com.etao.feimagesearch.intelli.ObjectDetectorWrapper;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.perf.IrpAvaRecord;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import tb.cpe;

/* loaded from: classes3.dex */
public final class cph extends ctc<cpg, com.etao.feimagesearch.model.b, CaptureManager> implements com.etao.feimagesearch.structure.capture.b, com.etao.feimagesearch.structure.capture.f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "AutoSize_CaptureViewV2";
    private static String r;
    private static int s;

    /* renamed from: a  reason: collision with root package name */
    private cpd f26385a;
    private com.etao.feimagesearch.capture.dynamic.hybrid.e f;
    private cpw g;
    private cpn h;
    private cpl i;
    private cpo j;
    private HashMap<String, b> k;
    private cpr l;
    private cpz m;
    private ScheduledExecutorService n;
    private com.etao.feimagesearch.capture.dynamic.msg.d o;
    private boolean p;
    private xiq q;
    private ScheduledFuture<?> t;
    private jqj u;

    /* loaded from: classes3.dex */
    public interface b {
        void a(String str, boolean z);

        void b(String str, boolean z);
    }

    /* loaded from: classes3.dex */
    public static final class c implements com.etao.feimagesearch.cip.camera.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cpx b;
        public final /* synthetic */ DynCaptureImgGotConfig c;

        public c(cpx cpxVar, DynCaptureImgGotConfig dynCaptureImgGotConfig) {
            this.b = cpxVar;
            this.c = dynCaptureImgGotConfig;
        }

        @Override // com.etao.feimagesearch.cip.camera.e
        public final void a(Bitmap bitmap, boolean z, com.etao.feimagesearch.cip.camera.f fVar, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa1524d1", new Object[]{this, bitmap, new Boolean(z), fVar, new Boolean(z2)});
            } else if (bitmap == null) {
                this.b.a(null, -1, "get preview data failed");
            } else {
                crq d = this.c.a().d();
                d.a(bitmap);
                Map<String, String> extraParams = cph.this.A_().getExtraParams();
                q.a((Object) extraParams, "pageModel.extraParams");
                d.a(ai.c(extraParams));
                new com.etao.feimagesearch.capture.dynamic.hybrid.d(this.c).a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements com.taobao.android.virtual_thread.face.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.android.virtual_thread.face.h
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return cph.TAG + cph.this.hashCode();
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements com.etao.feimagesearch.structure.capture.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // com.etao.feimagesearch.structure.capture.i
        public final com.etao.feimagesearch.structure.capture.g a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.etao.feimagesearch.structure.capture.g) ipChange.ipc$dispatch("a3b05852", new Object[]{this, context});
            }
            if (com.etao.feimagesearch.config.b.M()) {
                return null;
            }
            cph cphVar = cph.this;
            q.a((Object) context, "context");
            return cph.a(cphVar, context, cph.this.i());
        }
    }

    /* loaded from: classes3.dex */
    public static final class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (cph.a(cph.this).i()) {
            } else {
                cph.a(cph.this, true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class k extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (cph.a(cph.this).i()) {
            } else {
                cph.a(cph.this, true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FrameLayout b;

        public l(FrameLayout frameLayout) {
            this.b = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Activity activity = cph.b(cph.this);
            q.a((Object) activity, "activity");
            FrameLayout bottomAreaContainer = this.b;
            q.a((Object) bottomAreaContainer, "bottomAreaContainer");
            final cpr cprVar = new cpr(activity, cph.this, bottomAreaContainer, false);
            cot.c(cph.TAG, "onLoadFinish: CaptureBottomAreaView");
            ad.c("CaptureViewV2_addBottomView", new ac() { // from class: tb.cph.l.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (cph.e(cph.this) != null) {
                    } else {
                        l.this.b.addView(cprVar.m(), new FrameLayout.LayoutParams(-1, -1));
                        cph.a(cph.this, cprVar);
                        cph.this.a(cprVar);
                        xiq g = cph.g(cph.this);
                        if (g == null) {
                            return;
                        }
                        cprVar.a(g.a());
                        cprVar.a(g.b(), g.c());
                        int h = cph.h(cph.this);
                        if (h == 2) {
                            cprVar.d();
                        } else if (h == 3) {
                            cprVar.B_();
                        } else if (h == 4) {
                            cprVar.e();
                        } else if (h == 5) {
                            cprVar.f();
                        }
                        cph.a(cph.this, (xiq) null);
                    }
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static final class m extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            CaptureManager i = cph.this.i();
            i.a(cph.b(cph.this));
            i.d();
        }
    }

    /* loaded from: classes3.dex */
    public static final class n implements CaptureManager.RealtimeModelLoadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // com.etao.feimagesearch.structure.capture.CaptureManager.RealtimeModelLoadListener
        public final void a(CaptureManager.RealtimeModelLoadListener.LoadState loadState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b148e323", new Object[]{this, loadState});
            } else if (loadState == null) {
            } else {
                int i = cpi.$EnumSwitchMapping$0[loadState.ordinal()];
                String str = "open";
                if (i == 1) {
                    if (!cph.this.i().h()) {
                        str = "close";
                    }
                    cph.this.i().y().a(new com.etao.feimagesearch.capture.dynamic.msg.f("show", str));
                } else if (i == 2) {
                    if (!cph.this.i().h()) {
                        str = "close";
                    }
                    cph.this.i().y().a(new com.etao.feimagesearch.capture.dynamic.msg.f("hide", str));
                } else if (i != 3) {
                } else {
                    if (!cph.this.i().h()) {
                        str = "close";
                    }
                    cph.this.i().y().a(new com.etao.feimagesearch.capture.dynamic.msg.f("hide", str));
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class o implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animation});
            } else {
                q.c(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
            } else {
                q.c(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animation});
            } else {
                q.c(animation, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
            } else {
                q.c(animation, "animation");
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class p extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ cph c;

        public p(boolean z, cph cphVar) {
            this.b = z;
            this.c = cphVar;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (this.b && com.etao.feimagesearch.config.b.dv()) {
                cph.a(cph.this).f();
            }
            cph cphVar = cph.this;
            cph.a(cphVar, new cpw(cph.b(cphVar), this.c));
        }
    }

    public static /* synthetic */ Object ipc$super(cph cphVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1474194533:
                super.a(((Number) objArr[0]).intValue());
                return null;
            case 93762283:
                super.d();
                return null;
            case 95609325:
                super.f();
                return null;
            case 1978668644:
                super.B_();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.capture.dynamic.hybrid.e a(cph cphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.capture.dynamic.hybrid.e) ipChange.ipc$dispatch("2b480794", new Object[]{cphVar});
        }
        com.etao.feimagesearch.capture.dynamic.hybrid.e eVar = cphVar.f;
        if (eVar == null) {
            q.b("hybridView");
        }
        return eVar;
    }

    public static final /* synthetic */ com.etao.feimagesearch.structure.capture.g a(cph cphVar, Context context, CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.structure.capture.g) ipChange.ipc$dispatch("d134ecf7", new Object[]{cphVar, context, captureManager}) : cphVar.a(context, captureManager);
    }

    public static final /* synthetic */ void a(cph cphVar, cpo cpoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9d83eb", new Object[]{cphVar, cpoVar});
        } else {
            cphVar.j = cpoVar;
        }
    }

    public static final /* synthetic */ void a(cph cphVar, cpr cprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9ee108", new Object[]{cphVar, cprVar});
        } else {
            cphVar.l = cprVar;
        }
    }

    public static final /* synthetic */ void a(cph cphVar, cpw cpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa126e3", new Object[]{cphVar, cpwVar});
        } else {
            cphVar.g = cpwVar;
        }
    }

    public static final /* synthetic */ void a(cph cphVar, xiq xiqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e118d2d", new Object[]{cphVar, xiqVar});
        } else {
            cphVar.q = xiqVar;
        }
    }

    public static final /* synthetic */ void a(cph cphVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9809db17", new Object[]{cphVar, new Boolean(z)});
        } else {
            cphVar.e(z);
        }
    }

    public static final /* synthetic */ Activity b(cph cphVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("e34d078a", new Object[]{cphVar}) : cphVar.d;
    }

    public static final /* synthetic */ void b(cph cphVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e7a4b6", new Object[]{cphVar, new Boolean(z)});
        } else {
            cphVar.d(z);
        }
    }

    public static final /* synthetic */ cpn c(cph cphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpn) ipChange.ipc$dispatch("e1975fc6", new Object[]{cphVar});
        }
        cpn cpnVar = cphVar.h;
        if (cpnVar == null) {
            q.b("scanView");
        }
        return cpnVar;
    }

    public static final /* synthetic */ cpg d(cph cphVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpg) ipChange.ipc$dispatch("c939354c", new Object[]{cphVar}) : (cpg) cphVar.b;
    }

    public static final /* synthetic */ cpr e(cph cphVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpr) ipChange.ipc$dispatch("b0db0d00", new Object[]{cphVar}) : cphVar.l;
    }

    public static final /* synthetic */ cpl f(cph cphVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpl) ipChange.ipc$dispatch("987ce2a5", new Object[]{cphVar});
        }
        cpl cplVar = cphVar.i;
        if (cplVar == null) {
            q.b("paiView");
        }
        return cplVar;
    }

    public static final /* synthetic */ xiq g(cph cphVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xiq) ipChange.ipc$dispatch("80282b23", new Object[]{cphVar}) : cphVar.q;
    }

    public static final /* synthetic */ int h(cph cphVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("697470d7", new Object[]{cphVar})).intValue() : cphVar.M;
    }

    public static final /* synthetic */ int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[0])).intValue() : s;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tb.cpg, tb.ctb] */
    @Override // tb.ctc
    public /* synthetic */ cpg b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : a();
    }

    @Override // tb.ctc, tb.cte
    public /* synthetic */ com.etao.feimagesearch.model.e h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.model.e) ipChange.ipc$dispatch("b2c7c646", new Object[]{this}) : A_();
    }

    @Override // tb.ctc, tb.cte
    public /* synthetic */ Object j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("77e79761", new Object[]{this}) : i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cph(Activity activity) {
        super(activity);
        q.c(activity, "activity");
        r = com.f() ? "Page_PhotoSearchTakeY" : "Page_PhotoSearchTake";
        i().a((com.etao.feimagesearch.structure.capture.b) this);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(70228007);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : cph.r();
        }
    }

    static {
        kge.a(401172383);
        kge.a(-1520041669);
        kge.a(-2082492993);
        Companion = new a(null);
        r = "Page_PhotoSearchTake";
        s = Result.ALIPAY_VERIFY_UNREG_NODE_FAILED;
    }

    @Override // tb.ctc
    public void c() {
        com.etao.feimagesearch.capture.dynamic.hybrid.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        i().a((com.etao.feimagesearch.structure.capture.f) this);
        ScheduledExecutorService newSingleThreadScheduledExecutor = VExecutors.newSingleThreadScheduledExecutor(new h());
        q.a((Object) newSingleThreadScheduledExecutor, "VExecutors.newSingleThre…{ TAG + this.hashCode() }");
        this.n = newSingleThreadScheduledExecutor;
        this.m = new cpz();
        com.etao.feimagesearch.j.INSTANCE.c();
        if (i().I()) {
            Activity activity = this.d;
            q.a((Object) activity, "activity");
            bVar = new com.etao.feimagesearch.capture.dynamic.hybrid.f(activity, this);
        } else {
            Activity activity2 = this.d;
            q.a((Object) activity2, "activity");
            bVar = new com.etao.feimagesearch.capture.dynamic.hybrid.b(activity2, this);
        }
        this.f = bVar;
        com.etao.feimagesearch.capture.dynamic.hybrid.e eVar = this.f;
        if (eVar == null) {
            q.b("hybridView");
        }
        eVar.l();
        Activity activity3 = this.d;
        q.a((Object) activity3, "activity");
        cph cphVar = this;
        this.f26385a = new cpd(activity3, cphVar);
        View findViewById = s().findViewById(R.id.fl_smart_debug_container);
        q.a((Object) findViewById, "getActivity().findViewBy…fl_smart_debug_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        if (com.a()) {
            Activity activity4 = this.d;
            q.a((Object) activity4, "activity");
            this.u = new jqj(activity4, cphVar, frameLayout);
        }
        Activity activity5 = this.d;
        q.a((Object) activity5, "activity");
        this.i = new cpl(activity5, cphVar);
        Activity activity6 = this.d;
        q.a((Object) activity6, "activity");
        this.h = new cpn(activity6, cphVar);
        i().a((ViewGroup) s().findViewById(R.id.fl_intelli));
        i().a(new i());
        u();
        if (g()) {
            this.l = w();
            if (this.l == null) {
                this.q = new xiq(0, true, null, false);
            }
        }
        if (!this.p) {
            String initScene = A_().getInitScene();
            q.a((Object) initScene, "pageModel.initScene");
            a(initScene, true);
        }
        ScheduledExecutorService scheduledExecutorService = this.n;
        if (scheduledExecutorService == null) {
            q.b("scheduledExecutorService");
        }
        Long ce = com.etao.feimagesearch.config.b.ce();
        q.a((Object) ce, "ConfigModel.getDynamicCaptureLoadTimeLimit()");
        this.t = scheduledExecutorService.schedule(new j(), ce.longValue(), TimeUnit.MILLISECONDS);
        i().a(new n());
    }

    public cpg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpg) ipChange.ipc$dispatch("f0356c4", new Object[]{this}) : new cpg();
    }

    @Override // tb.ctc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ad.c("AutoSize_CaptureViewV2_execResume", new m());
        super.d();
        f(false);
    }

    @Override // tb.ctc
    public void B_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f01664", new Object[]{this});
            return;
        }
        super.B_();
        i().f();
        i().A();
        i().Q();
    }

    @Override // tb.ctc
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        if (i().D()) {
            dgh.a().a(String.valueOf(this.d.hashCode()));
        }
        i().g();
        ScheduledExecutorService scheduledExecutorService = this.n;
        if (scheduledExecutorService == null) {
            q.b("scheduledExecutorService");
        }
        scheduledExecutorService.shutdown();
        com.etao.feimagesearch.capture.dynamic.hybrid.e eVar = this.f;
        if (eVar == null) {
            q.b("hybridView");
        }
        if (!eVar.k()) {
            com.etao.feimagesearch.capture.dynamic.hybrid.e eVar2 = this.f;
            if (eVar2 == null) {
                q.b("hybridView");
            }
            eVar2.f();
        }
        com.etao.feimagesearch.capture.scan.irp.c.Companion.a().b(String.valueOf(this.d.hashCode()));
        fkj.a().b();
    }

    @Override // tb.ctc
    public void a(int i2) {
        CaptureManager d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
            return;
        }
        cot.a("Dynamic", TAG, "execScreenChanged " + i2);
        super.a(i2);
        cpg cpgVar = (cpg) this.b;
        if (cpgVar != null && (d2 = cpgVar.d()) != null) {
            d2.A();
        }
        if (com.a()) {
            cuk.a().a(com.b(), "screenChange " + i2);
        }
        if (g()) {
            cpr cprVar = this.l;
            if (cprVar != null) {
                cprVar.f();
                FrameLayout bottomAreaContainer = (FrameLayout) this.d.findViewById(R.id.fl_bottom_area_ui);
                Activity activity = this.d;
                q.a((Object) activity, "activity");
                q.a((Object) bottomAreaContainer, "bottomAreaContainer");
                this.l = new cpr(activity, this, bottomAreaContainer, false, 8, null);
                cpr cprVar2 = this.l;
                if (cprVar2 != null) {
                    cprVar2.d();
                }
            }
            this.q = null;
        }
        if (i().a()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.t = null;
        Long ce = com.etao.feimagesearch.config.b.ce();
        q.a((Object) ce, "ConfigModel.getDynamicCaptureLoadTimeLimit()");
        ad.a("AutoSize_CaptureViewV2_execScreenChanged", new k(), ce.longValue());
    }

    public com.etao.feimagesearch.model.b A_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.model.b) ipChange.ipc$dispatch("9a2b7e53", new Object[]{this});
        }
        T t = this.b;
        if (t == 0) {
            q.a();
        }
        return ((cpg) t).e();
    }

    public CaptureManager i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("58dd7ca6", new Object[]{this});
        }
        T t = this.b;
        if (t == 0) {
            q.a();
        }
        return ((cpg) t).d();
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.etao.feimagesearch.structure.capture.g i2 = i().i();
        if (i2 == null) {
            return;
        }
        i2.a(z);
    }

    public final void a(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        cpg cpgVar = (cpg) this.b;
        if (cpgVar == null) {
            return;
        }
        cpgVar.a(i2, i3, intent);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        cpr cprVar = this.l;
        if (cprVar != null) {
            cprVar.b(0);
        } else {
            b(0);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        cpr cprVar = this.l;
        if (cprVar != null) {
            cprVar.b(1);
        } else {
            b(1);
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            cpd cpdVar = this.f26385a;
            if (cpdVar == null) {
                q.b("cameraView");
            }
            cpdVar.k();
        } else {
            cpd cpdVar2 = this.f26385a;
            if (cpdVar2 == null) {
                q.b("cameraView");
            }
            cpdVar2.y_();
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        cpd cpdVar = this.f26385a;
        if (cpdVar == null) {
            q.b("cameraView");
        }
        cpdVar.i();
        cox.a(com.etao.feimagesearch.structure.capture.a.f6987a, "cameraFlip", "pssource", A_().getPssource());
        if (i().p() != 1) {
            return;
        }
        cox.b(com.etao.feimagesearch.structure.capture.a.f6987a, "SelfTake", new String[0]);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        cpd cpdVar = this.f26385a;
        if (cpdVar == null) {
            q.b("cameraView");
        }
        cpdVar.a((com.etao.feimagesearch.cip.camera.e) null);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            i().b(true);
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            i().b(false);
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            i().c(z);
        }
    }

    public final void a(List<MusOuterAlbumBean> albumData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, albumData});
            return;
        }
        q.c(albumData, "albumData");
        com.etao.feimagesearch.capture.dynamic.msg.d dVar = new com.etao.feimagesearch.capture.dynamic.msg.d(albumData);
        if (i().y().i()) {
            i().y().a(dVar);
            i().e();
            return;
        }
        this.o = dVar;
    }

    public final void a(MusOuterAlbumBean albumBean) {
        ClientModelType f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40d1b01", new Object[]{this, albumBean});
            return;
        }
        q.c(albumBean, "albumBean");
        if (StringUtils.isEmpty(albumBean.getImgKey())) {
            return;
        }
        if (albumBean.getRemote()) {
            com.etao.feimagesearch.newresult.perf.a.H();
            cox.b(com.etao.feimagesearch.structure.capture.a.f6987a, "OuterAlbumRemote", new String[0]);
            IrpParamModel irpParamModel = new IrpParamModel(A_());
            irpParamModel.updateSessionId();
            irpParamModel.setPhotoFrom(PhotoFrom.Values.OUTER_ALBUM_REMOTE);
            Uri parse = Uri.parse(albumBean.getImgKey());
            q.a((Object) parse, "Uri.parse(albumBean.imgKey)");
            Float imgRotation = albumBean.getImgRotation();
            int floatValue = (int) (imgRotation != null ? imgRotation.floatValue() : 0.0f);
            PhotoFrom.Values values = PhotoFrom.Values.OUTER_ALBUM_REMOTE;
            com.etao.feimagesearch.model.b A_ = A_();
            long sessionId = irpParamModel.getSessionId();
            com.etao.feimagesearch.structure.capture.g i2 = i().i();
            com.etao.feimagesearch.pipline.d.a(parse, null, floatValue, values, A_, sessionId, -1, 0, (i2 == null || (f2 = i2.f()) == null) ? null : f2.getType());
            cou.a(this.d, irpParamModel);
            return;
        }
        cpo cpoVar = this.j;
        if (cpoVar == null) {
            return;
        }
        cpoVar.a(albumBean);
    }

    public final void a(String targetScene, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, targetScene, new Boolean(z)});
            return;
        }
        q.c(targetScene, "targetScene");
        this.p = true;
        if (com.etao.feimagesearch.l.a(targetScene, z, i(), A_().getPssource())) {
            return;
        }
        if (q.a((Object) targetScene, (Object) cpe.a.SCENE_AUTO_DETECT) || q.a((Object) targetScene, (Object) cpe.a.SCENE_META_SIGHT)) {
            jqj jqjVar = this.u;
            if (jqjVar != null) {
                jqjVar.a(true);
            }
        } else {
            jqj jqjVar2 = this.u;
            if (jqjVar2 != null) {
                jqjVar2.a(false);
            }
        }
        boolean a2 = com.etao.feimagesearch.l.a(i().q(), targetScene);
        HashMap<String, b> hashMap = this.k;
        if (hashMap == null) {
            q.b("sceneCallbacks");
        }
        b bVar = hashMap.get(cpe.a.b(targetScene));
        if (bVar == null) {
            return;
        }
        q.a((Object) bVar, "sceneCallbacks[changeAss…e(targetScene)] ?: return");
        HashMap<String, b> hashMap2 = this.k;
        if (hashMap2 == null) {
            q.b("sceneCallbacks");
        }
        b bVar2 = hashMap2.get(cpe.a.b(i().q()));
        if (bVar2 != null) {
            String q = i().q();
            q.a((Object) q, "manager.currentScene");
            bVar2.b(q, a2);
        }
        HashMap<String, b> hashMap3 = this.k;
        if (hashMap3 == null) {
            q.b("sceneCallbacks");
        }
        b bVar3 = hashMap3.get(i().q());
        if (bVar3 != null) {
            String q2 = i().q();
            q.a((Object) q2, "manager.currentScene");
            bVar3.b(q2, a2);
        }
        bVar.a(targetScene, a2);
    }

    public final void a(DynCaptureImgGotConfig imgGotConfig, cpx callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d61e44d", new Object[]{this, imgGotConfig, callback});
            return;
        }
        q.c(imgGotConfig, "imgGotConfig");
        q.c(callback, "callback");
        cpd cpdVar = this.f26385a;
        if (cpdVar == null) {
            q.b("cameraView");
        }
        cpdVar.a(new c(callback, imgGotConfig));
    }

    public final void a(DynCaptureImgGotConfig imgGotConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a172c768", new Object[]{this, imgGotConfig});
            return;
        }
        q.c(imgGotConfig, "imgGotConfig");
        T t = this.b;
        if (t == 0) {
            q.a();
        }
        ((cpg) t).a(imgGotConfig);
    }

    public final void a(boolean z, boolean z2, cpx callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1eae9cd", new Object[]{this, new Boolean(z), new Boolean(z2), callback});
            return;
        }
        q.c(callback, "callback");
        if (z) {
            cpd cpdVar = this.f26385a;
            if (cpdVar == null) {
                q.b("cameraView");
            }
            cpdVar.v_();
            cpd cpdVar2 = this.f26385a;
            if (cpdVar2 == null) {
                q.b("cameraView");
            }
            cpdVar2.a(z2);
            return;
        }
        cpd cpdVar3 = this.f26385a;
        if (cpdVar3 == null) {
            q.b("cameraView");
        }
        cpdVar3.w_();
    }

    public final boolean a(adt adtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a6c5731", new Object[]{this, adtVar, new Boolean(z)})).booleanValue();
        }
        cpr cprVar = this.l;
        if (cprVar != null) {
            return cprVar.a(adtVar, z);
        }
        xiq xiqVar = this.q;
        if (xiqVar != null) {
            xiqVar.a(adtVar);
            xiqVar.b(z);
        } else if (xiqVar != null) {
            xiqVar.a(adtVar);
            xiqVar.b(z);
        }
        return false;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        View hintView = this.d.findViewById(R.id.view_jump_hint);
        if (z) {
            if (!i().J()) {
                return;
            }
            q.a((Object) hintView, "hintView");
            hintView.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hintView, "translationX", hintView.getWidth(), 0.0f);
            ofFloat.addListener(new o());
            q.a((Object) ofFloat, "this");
            ofFloat.setDuration(50L);
            ofFloat.start();
            return;
        }
        q.a((Object) hintView, "hintView");
        if (hintView.getVisibility() == 8) {
            return;
        }
        hintView.setVisibility(8);
    }

    private final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.k = new HashMap<>(5);
        HashMap<String, b> hashMap = this.k;
        if (hashMap == null) {
            q.b("sceneCallbacks");
        }
        hashMap.put("scan", new d());
        HashMap<String, b> hashMap2 = this.k;
        if (hashMap2 == null) {
            q.b("sceneCallbacks");
        }
        hashMap2.put(cpe.a.SCENE_AUTO_DETECT, new e());
        HashMap<String, b> hashMap3 = this.k;
        if (hashMap3 == null) {
            q.b("sceneCallbacks");
        }
        hashMap3.put(cpe.a.SCENE_META_SIGHT, new f());
        HashMap<String, b> hashMap4 = this.k;
        if (hashMap4 == null) {
            q.b("sceneCallbacks");
        }
        hashMap4.put(cpe.a.SCENE_MARKETING, new g());
    }

    /* loaded from: classes3.dex */
    public static final class d implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.cph.b
        public void a(String scene, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ece2", new Object[]{this, scene, new Boolean(z)});
                return;
            }
            q.c(scene, "scene");
            com.etao.feimagesearch.l.a(scene, cph.this.i());
            cph.this.i().a(scene);
            cph.this.i().a(cph.b(cph.this));
            if (z) {
                cph.c(cph.this).a(true);
                cpg d = cph.d(cph.this);
                if (d != null) {
                    d.a(scene);
                }
            }
            cph cphVar = cph.this;
            cph.a(cphVar, cph.c(cphVar));
            cph.b(cph.this, true);
        }

        @Override // tb.cph.b
        public void b(String scene, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d257bc1", new Object[]{this, scene, new Boolean(z)});
                return;
            }
            q.c(scene, "scene");
            if (!z) {
                return;
            }
            cph.c(cph.this).a(false);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.cph.b
        public void a(String scene, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ece2", new Object[]{this, scene, new Boolean(z)});
                return;
            }
            q.c(scene, "scene");
            com.etao.feimagesearch.l.a(scene, cph.this.i());
            cph.this.i().a(scene);
            cph.this.i().a(cph.b(cph.this));
            if (z) {
                cph.f(cph.this).a(true);
                cpg d = cph.d(cph.this);
                if (d != null) {
                    d.a(scene);
                }
            }
            cph cphVar = cph.this;
            cph.a(cphVar, cph.f(cphVar));
            cph.b(cph.this, true);
        }

        @Override // tb.cph.b
        public void b(String scene, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d257bc1", new Object[]{this, scene, new Boolean(z)});
                return;
            }
            q.c(scene, "scene");
            if (!z) {
                return;
            }
            cph.f(cph.this).a(false);
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.cph.b
        public void a(String scene, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ece2", new Object[]{this, scene, new Boolean(z)});
                return;
            }
            q.c(scene, "scene");
            com.etao.feimagesearch.l.a(scene, cph.this.i());
            cph.this.i().a(scene);
            cph.this.i().a(cph.b(cph.this));
            if (z) {
                cph.f(cph.this).a(true);
                cpg d = cph.d(cph.this);
                if (d != null) {
                    d.a(scene);
                }
            }
            cph cphVar = cph.this;
            cph.a(cphVar, cph.f(cphVar));
            cph.b(cph.this, false);
        }

        @Override // tb.cph.b
        public void b(String scene, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d257bc1", new Object[]{this, scene, new Boolean(z)});
                return;
            }
            q.c(scene, "scene");
            if (!z) {
                return;
            }
            cph.f(cph.this).a(false);
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.cph.b
        public void b(String scene, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d257bc1", new Object[]{this, scene, new Boolean(z)});
            } else {
                q.c(scene, "scene");
            }
        }

        public g() {
        }

        @Override // tb.cph.b
        public void a(String scene, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ece2", new Object[]{this, scene, new Boolean(z)});
                return;
            }
            q.c(scene, "scene");
            com.etao.feimagesearch.l.a(scene, cph.this.i());
            cph.this.i().a(scene);
            cph.this.i().g();
            cpg d = cph.d(cph.this);
            if (d != null) {
                d.a(scene);
            }
            cph.a(cph.this, (cpo) null);
            cph.b(cph.this, false);
        }
    }

    private final com.etao.feimagesearch.structure.capture.g a(Context context, CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.structure.capture.g) ipChange.ipc$dispatch("269607cc", new Object[]{this, context, captureManager});
        }
        if (com.etao.feimagesearch.config.b.N() && com.etao.feimagesearch.config.b.bS()) {
            coy.a(r, "createDetector4GapDevice", 19999, new String[0]);
            return new com.etao.feimagesearch.intelli.c(context, captureManager);
        } else if (captureManager.b()) {
            return new ObjectDetectorWrapper(context, captureManager);
        } else {
            if (captureManager.w()) {
                return new com.etao.feimagesearch.intelli.h(context, captureManager);
            }
            if (com.etao.feimagesearch.config.b.aO()) {
                return new com.etao.feimagesearch.intelli.b(context, captureManager);
            }
            return new com.etao.feimagesearch.intelli.c(context, captureManager);
        }
    }

    private final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (i().a()) {
        } else {
            i().a(true);
            dau.d();
            ad.c("uiContainerDegrade", new p(z, this));
            cpz cpzVar = this.m;
            if (cpzVar == null) {
                q.b("captureAvaRecord");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "timeout" : "render");
            sb.append(' ');
            cpzVar.a(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_DOWNGRADE, "-1", sb.toString(), A_().getPssource(), true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isTimeout", String.valueOf(z));
            TLogTracker.b("HybridDowngrade", linkedHashMap);
        }
    }

    private final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : !A_().scanOnly();
    }

    private final cpr w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpr) ipChange.ipc$dispatch("b8478e43", new Object[]{this});
        }
        FrameLayout bottomAreaContainer = (FrameLayout) this.d.findViewById(R.id.fl_bottom_area_ui);
        if (i().I()) {
            i().a(new l(bottomAreaContainer));
            return null;
        }
        Activity activity = this.d;
        q.a((Object) activity, "activity");
        q.a((Object) bottomAreaContainer, "bottomAreaContainer");
        return new cpr(activity, this, bottomAreaContainer, false, 8, null);
    }

    private final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        cpr cprVar = this.l;
        if (cprVar != null) {
            cprVar.a(z);
            return;
        }
        xiq xiqVar = this.q;
        if (xiqVar == null) {
            return;
        }
        xiqVar.a(z);
    }

    private final void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
            return;
        }
        xiq xiqVar = this.q;
        if (xiqVar == null) {
            return;
        }
        xiqVar.a(i2);
    }

    @Override // com.etao.feimagesearch.structure.capture.f
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (i().a()) {
        } else {
            TLogTracker.b("Default", "HybridLoad", "{\"load\":\"success\"}");
            cpg cpgVar = (cpg) this.b;
            if (cpgVar != null) {
                cpgVar.i();
            }
            ScheduledFuture<?> scheduledFuture = this.t;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.t = null;
            }
            com.etao.feimagesearch.capture.dynamic.msg.d dVar = this.o;
            if (dVar != null) {
                i().y().a(dVar);
                i().e();
            }
            this.o = null;
            cpz cpzVar = this.m;
            if (cpzVar == null) {
                q.b("captureAvaRecord");
            }
            cpzVar.a(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_MUISE_LOAD, A_().getPssource(), true);
            cpz cpzVar2 = this.m;
            if (cpzVar2 == null) {
                q.b("captureAvaRecord");
            }
            cpzVar2.a(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_DOWNGRADE, A_().getPssource(), true);
            if (i().X()) {
                i().y().a(new com.etao.feimagesearch.capture.dynamic.msg.j());
            }
            cpo cpoVar = this.j;
            if (cpoVar == null) {
                return;
            }
            cpoVar.k();
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.f
    public void a(Integer num, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de586919", new Object[]{this, num, str});
            return;
        }
        cpz cpzVar = this.m;
        if (cpzVar == null) {
            q.b("captureAvaRecord");
        }
        cpzVar.a(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_MUISE_LOAD, num != null ? String.valueOf(num.intValue()) : null, str, A_().getPssource(), true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
            str2 = "";
        }
        linkedHashMap.put("errCode", str2);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("errMsg", str);
        TLogTracker.b("HybridLoad", linkedHashMap);
        e(false);
    }

    @Override // com.etao.feimagesearch.structure.capture.f
    public void b(Integer num, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bd9e38", new Object[]{this, num, str});
            return;
        }
        cpz cpzVar = this.m;
        if (cpzVar == null) {
            q.b("captureAvaRecord");
        }
        cpzVar.a(IrpAvaRecord.AvaType.AVA_TYPE_PAGE_MUISE_RUN, num != null ? String.valueOf(num.intValue()) : null, str, A_().getPssource(), true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num == null || (str2 = String.valueOf(num.intValue())) == null) {
            str2 = "";
        }
        linkedHashMap.put("errCode", str2);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("errMsg", str);
        TLogTracker.b("HybridRun", linkedHashMap);
    }

    @Override // com.etao.feimagesearch.structure.capture.b
    public void a(com.etao.feimagesearch.album.o oVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2482dd", new Object[]{this, oVar, new Boolean(z)});
            return;
        }
        cpo cpoVar = this.j;
        if (cpoVar == null) {
            return;
        }
        cpoVar.a(oVar, !z);
    }
}
