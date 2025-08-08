package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.d;
import com.taobao.bootimage.interact.pop.BootImageBigPopView;
import com.taobao.bootimage.interact.pop.e;
import com.taobao.bootimage.linked.h;
import com.taobao.bootimage.view.c;
import com.taobao.bootimage.view.i;
import com.taobao.bootimage.view.j;
import com.taobao.monitor.procedure.s;
import com.taobao.monitor.procedure.v;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class kdr implements njr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f29989a;
    private final String b = "AdColdStartViewController";
    private ViewGroup c;
    private ViewGroup d;
    private boolean e;
    private String g;
    private ViewGroup h;
    private BootImageBigPopView i;
    private String j;
    private String k;
    private keq l;

    static {
        kge.a(6185042);
        kge.a(1885639559);
    }

    @Override // tb.njr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : PopStrategy.IDENTIFIER_SPLASH;
    }

    @Override // tb.njr
    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public static /* synthetic */ String a(kdr kdrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7a9d881", new Object[]{kdrVar}) : kdrVar.k;
    }

    public static /* synthetic */ boolean a(kdr kdrVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c251c20d", new Object[]{kdrVar, str})).booleanValue() : kdrVar.a(str);
    }

    public static /* synthetic */ boolean a(kdr kdrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b4e78b9", new Object[]{kdrVar, new Boolean(z)})).booleanValue();
        }
        kdrVar.e = z;
        return z;
    }

    public static /* synthetic */ String b(kdr kdrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d8568420", new Object[]{kdrVar}) : kdrVar.j;
    }

    public static /* synthetic */ keq c(kdr kdrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (keq) ipChange.ipc$dispatch("ca4e48ee", new Object[]{kdrVar}) : kdrVar.l;
    }

    public static /* synthetic */ boolean d(kdr kdrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc6a8d86", new Object[]{kdrVar})).booleanValue() : kdrVar.e;
    }

    public static /* synthetic */ c e(kdr kdrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("42a70c22", new Object[]{kdrVar}) : kdrVar.f29989a;
    }

    public static /* synthetic */ ViewGroup f(kdr kdrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8bc4eb11", new Object[]{kdrVar}) : kdrVar.h;
    }

    public static /* synthetic */ BootImageBigPopView g(kdr kdrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageBigPopView) ipChange.ipc$dispatch("160e4cd5", new Object[]{kdrVar}) : kdrVar.i;
    }

    public static /* synthetic */ String h(kdr kdrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc6289da", new Object[]{kdrVar}) : kdrVar.g;
    }

    public void a(Activity activity, kdt kdtVar, j jVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af880319", new Object[]{this, activity, kdtVar, jVar});
        } else if (activity == null) {
        } else {
            this.g = activity.getLocalClassName();
            if (kdtVar == null || kdtVar.b == null) {
                return;
            }
            this.h = d.b(activity);
            try {
                this.h.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
                s.f18233a.d().a("advertisementType", PopStrategy.IDENTIFIER_SPLASH);
                s.f18233a.d().a("advertisementDuration", Long.valueOf((kdtVar.b.waitTime * 1000) + kdtVar.b.scaleAnimationDuration));
            } catch (Throwable th) {
                kej.a("AdColdStartViewController", "apm setTag error." + th);
            }
            kdtVar.b.isColdStart = true;
            this.f29989a = kek.a(kdtVar.b, this.h.getContext(), this.h);
            this.l = h.a(this.g).h();
            this.j = !StringUtils.isEmpty(kdtVar.b.bizType) ? kdtVar.b.bizType : "";
            this.k = !StringUtils.isEmpty(kdtVar.b.sceneType) ? kdtVar.b.sceneType : tiq.BIZ_CODE;
            c cVar = this.f29989a;
            if (cVar == null) {
                this.l.a(this.k, "ColdStart", keq.EXPOSE_ERROR, this.j, keq.CODE_VIEW_CREATE_FAIL, "bootImageContent null");
            } else if (!cVar.b()) {
                kej.a("AdColdStartViewController", "mBootImageContent.show() failed");
                this.l.a(this.k, "ColdStart", keq.EXPOSE_ERROR, this.j, keq.CODE_VIEW_CREATE_FAIL, "bootImageContent show fail");
            } else {
                Iterator<com.taobao.bootimage.linked.a> it = h().iterator();
                while (it.hasNext()) {
                    it.next();
                }
                ViewGroup viewGroup = this.f29989a.g;
                if (viewGroup == null) {
                    kej.a("AdColdStartViewController", "mBootImageContent.mRootView == null");
                    this.l.a(this.k, "ColdStart", keq.EXPOSE_ERROR, this.j, keq.CODE_VIEW_CREATE_FAIL, "contentView null");
                    jVar.a(106);
                    return;
                }
                try {
                    if (StringUtils.equals(kdtVar.b.actionResponse, "1") || StringUtils.equals(kdtVar.b.actionResponse, "2")) {
                        z = true;
                    }
                    if (kel.d() && z) {
                        i.a(activity, viewGroup);
                    }
                } catch (Throwable th2) {
                    kej.a("AdColdStartViewController", " CompatibleNaviBar error" + th2.getMessage());
                }
                kej.a("AdColdStartViewController", "bootImageMgr showContent success");
                this.h.addView(viewGroup);
                this.c = (ViewGroup) viewGroup.findViewById(R.id.layout_ad_logo);
                View findViewById = viewGroup.findViewById(R.id.boot_bg_view);
                this.d = (ViewGroup) viewGroup.findViewById(R.id.animation_view_container);
                this.f29989a.d = new a(jVar, this.d, findViewById);
                this.i = BootImageBigPopView.preBuildBigLottie(this.h.getContext(), kdtVar.b, kdtVar.f29996a, "", null);
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
        kej.a("AdColdStartViewController", "adLogo hideLogoView");
    }

    @Override // tb.njr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kej.a("AdColdStartViewController", " AdColdStartViewController State PopCenter show");
        this.e = true;
        for (com.taobao.bootimage.linked.a aVar : h()) {
            aVar.a(this.k);
        }
    }

    @Override // tb.njr
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        kej.a("AdColdStartViewController", " AdColdStartViewController State PopCenter isShown " + this.e);
        return !this.e;
    }

    /* loaded from: classes6.dex */
    public class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final j b;
        private final View c;
        private final View d;

        static {
            kge.a(-1977738779);
            kge.a(41956009);
        }

        @Override // com.taobao.bootimage.view.c.a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            }
        }

        public a(j jVar, View view, View view2) {
            this.b = jVar;
            this.c = view;
            this.d = view2;
        }

        @Override // com.taobao.bootimage.view.c.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            kdr.c(kdr.this).a(kdr.a(kdr.this), "ColdStart", keq.EXPOSE_SUCCESS, kdr.b(kdr.this), null, null);
            this.b.a();
            kej.a("AdColdStartViewController", " AdColdStartViewController State show: " + kdr.d(kdr.this));
            if (kdr.d(kdr.this)) {
                return;
            }
            kdr.a(kdr.this, true);
            kej.a("AdColdStartViewController", "PopCenter AdColdStartViewController State addPopOperation");
            njn.a("com.taobao.tao.homepage.HomepageFragment").a(kdr.this);
        }

        @Override // com.taobao.bootimage.view.c.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            kej.a("AdColdStartViewController", " onClose closeType = " + str);
            kdr.this.e();
            try {
                if (kdr.a(kdr.this, str) && kdr.e(kdr.this) != null && kdr.e(kdr.this).g != null) {
                    kej.a("AdColdStartViewController", "exitAdView");
                    kdr.e(kdr.this).g.setVisibility(8);
                    if (kdr.f(kdr.this) != null && kdr.g(kdr.this) != null) {
                        kdr.f(kdr.this).addView(kdr.g(kdr.this));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.b == null) {
                return;
            }
            if (kdr.g(kdr.this) == null || !kdr.g(kdr.this).isShowing()) {
                z = false;
            }
            this.b.a(str, this.c, this.d, z);
        }

        @Override // com.taobao.bootimage.view.c.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            kdr.c(kdr.this).a(kdr.a(kdr.this), "ColdStart", keq.EXPOSE_ERROR, kdr.b(kdr.this), String.valueOf(i), String.valueOf(i));
            kdr.this.f();
            this.b.a(i);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            kej.a("AdColdStartViewController", "animationContainerView GONE");
        }
        c cVar = this.f29989a;
        if (cVar != null && cVar.g.getParent() != null) {
            kej.a("AdColdStartViewController", "exitAdView");
            try {
                ((ViewGroup) this.f29989a.g.getParent()).removeView(this.f29989a.g);
            } catch (Throwable th) {
                kej.a("AdColdStartViewController", "exitAdView error ");
                th.printStackTrace();
            }
        }
        BootImageBigPopView bootImageBigPopView = this.i;
        if (bootImageBigPopView != null && bootImageBigPopView.getParent() != null && this.h != null) {
            kej.a("AdColdStartViewController", "exitAdView remove bigPopView");
            try {
                this.i.setVisibility(8);
                this.h.removeView(this.i);
            } catch (Throwable th2) {
                kej.a("AdColdStartViewController", "exitAdView remove bigPopView error ");
                th2.printStackTrace();
            }
        }
        kej.a("AdColdStartViewController", "PopCenter exitAdView finishPop");
        g();
        for (com.taobao.bootimage.linked.a aVar : h()) {
            aVar.c();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.e) {
        } else {
            this.e = false;
            kej.a("AdColdStartViewController", "PopCenter AdColdStartViewController State finishPopOperation");
            njn.a("com.taobao.tao.homepage.HomepageFragment").b(this);
        }
    }

    private List<com.taobao.bootimage.linked.a> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        kej.a("AdColdStartViewController", "pageBizCallback  getPageBizCallback");
        return h.b(this.g).h();
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.i == null) {
            return false;
        }
        kej.a(kem.TAG, "showBigPopLottie onClose:" + str);
        if (d.CLOSE_TYPE_SKIP.equals(str)) {
            return false;
        }
        return this.i.show(new e() { // from class: tb.kdr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.bootimage.interact.pop.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                kej.a(kem.TAG, "showBigPopLottie onEnd:");
                h.b(kdr.h(kdr.this)).g();
                kdr.this.f();
            }
        });
    }
}
