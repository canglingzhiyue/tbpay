package com.taobao.themis.kernel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IInstanceLifecycleAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.extension.page.ae;
import com.taobao.themis.kernel.extension.page.s;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import tb.kge;
import tb.qpm;
import tb.qpp;
import tb.qpr;
import tb.qpt;
import tb.qpu;
import tb.qqb;
import tb.qqc;
import tb.qqg;
import tb.qqp;
import tb.rnc;
import tb.suc;
import tb.sud;
import tb.teh;
import tb.tei;
import tb.tej;

/* loaded from: classes9.dex */
public class f extends j implements com.taobao.themis.kernel.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicInteger f;
    public final String c;
    public final String d;
    public volatile boolean e;
    private TMSBaseSolution g;
    private final Activity h;
    private String i;
    private String j;
    private String k;
    private TMSMetaInfoWrapper l;
    private TMSMetaInfoWrapper m;
    private qqb n;
    private final InstanceStartParams o;
    private final List<String> p;
    private final tei q;
    private final String r;
    private d s;
    private final qpu t;
    private final List<sud> u;
    private c v;
    private TMSContainerType w;
    private final List<b> x;

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    /* loaded from: classes9.dex */
    public interface b {
        void a();

        void b();

        void c();
    }

    /* loaded from: classes9.dex */
    public interface c {
        void a();

        void a(e eVar);

        void b();

        void c();
    }

    /* loaded from: classes9.dex */
    public interface d {
        void a(String str, String str2);
    }

    public static /* synthetic */ c a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a4f373af", new Object[]{fVar}) : fVar.v;
    }

    public static /* synthetic */ TMSBaseSolution b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSBaseSolution) ipChange.ipc$dispatch("a8cba9f5", new Object[]{fVar}) : fVar.g;
    }

    public static /* synthetic */ qpu c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpu) ipChange.ipc$dispatch("8b636201", new Object[]{fVar}) : fVar.t;
    }

    static {
        kge.a(1710596723);
        kge.a(1370847198);
        f = new AtomicInteger(0);
    }

    public f(Activity activity, InstanceStartParams instanceStartParams, TMSContainerType tMSContainerType) {
        this.p = new ArrayList();
        this.t = new qpu();
        this.q = new tej();
        this.u = new CopyOnWriteArrayList();
        this.w = TMSContainerType.GENERIC;
        this.x = new CopyOnWriteArrayList();
        this.e = false;
        this.o = instanceStartParams;
        this.c = "instance_" + f.incrementAndGet();
        this.j = instanceStartParams.getAppId();
        this.r = instanceStartParams.getUniAppId();
        this.i = instanceStartParams.getStartUrl();
        this.h = activity;
        this.d = t();
        this.w = tMSContainerType;
        this.t.a("instanceCreate");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) this.i);
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) qpt.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onCreate(this);
        }
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_INSTANCE, com.taobao.themis.kernel.logger.a.EVENT_ON_INIT, "", com.taobao.themis.kernel.logger.b.a(this), jSONObject);
    }

    public f() {
        this.p = new ArrayList();
        this.t = new qpu();
        this.q = new tej();
        this.u = new CopyOnWriteArrayList();
        this.w = TMSContainerType.GENERIC;
        this.x = new CopyOnWriteArrayList();
        this.e = false;
        this.h = null;
        this.o = new InstanceStartParams("", new Bundle(), new Bundle());
        this.c = "instance_" + f.incrementAndGet();
        this.r = "";
        this.d = t();
        this.w = TMSContainerType.EMBEDDED;
        this.t.a("instanceCreate");
    }

    private String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this});
        }
        String utdid = ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).getUtdid(this.h);
        if (StringUtils.isEmpty(utdid)) {
            utdid = String.valueOf(Math.random() * 100000.0d);
        }
        return com.taobao.themis.utils.f.d(utdid + this.j + System.currentTimeMillis());
    }

    public void a(qqb qqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbce7956", new Object[]{this, qqbVar});
        } else {
            this.n = qqbVar;
        }
    }

    public qqb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqb) ipChange.ipc$dispatch("16bb5c7b", new Object[]{this}) : this.n;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.k;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    @Deprecated
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (this.n.c() != null) {
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_NATIVE_EVENT, com.taobao.themis.kernel.logger.a.EVEN_ON_NEVENT_REGISTER, com.taobao.themis.kernel.logger.b.a(this.n.c()), com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(this.n.c())), com.taobao.themis.kernel.utils.f.a(new Pair("name", str)));
        }
        this.p.add(str);
    }

    public d B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("84c89fb2", new Object[]{this}) : this.s;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae8082d", new Object[]{this, dVar});
        } else {
            this.s = dVar;
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae793ce", new Object[]{this, cVar});
        } else {
            this.v = cVar;
        }
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae6ab10", new Object[]{this, aVar});
            return;
        }
        qpr launcher = this.g.getLauncher();
        final String a2 = com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(this));
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH, com.taobao.themis.kernel.logger.a.EVENT_ON_INIT, com.taobao.themis.kernel.logger.b.a(this), a2, com.taobao.themis.kernel.utils.f.a(new Pair("url", this.i), new Pair("instanceId", this.c), new Pair("class", launcher.getClass().getSimpleName())));
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH, com.taobao.themis.kernel.logger.a.EVENT_ON_START, com.taobao.themis.kernel.logger.b.a(this), a2, new JSONObject());
        launcher.a(new qpp() { // from class: com.taobao.themis.kernel.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qpp
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.b();
            }

            @Override // tb.qpp
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.c();
                }
                if (f.a(f.this) != null) {
                    f.a(f.this).a();
                }
                com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH, com.taobao.themis.kernel.logger.a.EVENT_ON_FINISH, com.taobao.themis.kernel.logger.b.a(f.this), a2, new JSONObject());
            }

            @Override // tb.qpp
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                } else if (f.a(f.this) == null) {
                } else {
                    f.a(f.this).b();
                }
            }

            @Override // tb.qpp
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.d();
                }
                if (f.a(f.this) == null) {
                    return;
                }
                f.a(f.this).c();
            }

            @Override // tb.qpp
            public void a(e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f0cb15ce", new Object[]{this, eVar});
                    return;
                }
                if (n.bG() && TMSContainerType.GENERIC.equals(f.this.i()) && f.b(f.this).getSolutionType() == TMSSolutionType.UNIAPP && (eVar.d.startsWith(e.a.TMS_ERR_MANIFEST_PREFIX) || eVar.d.equals(e.g.d))) {
                    o.m(f.this);
                }
                if (f.b(f.this) != null && f.b(f.this).getSplashView() != null) {
                    f.b(f.this).getSplashView().a(eVar, null);
                }
                if (f.a(f.this) != null) {
                    f.a(f.this).a(eVar);
                }
                f.c(f.this).d(eVar.d);
                f.c(f.this).e(eVar.e);
                f.c(f.this).a(f.this);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) eVar.d);
                jSONObject.put("errorMsg", (Object) eVar.e);
                com.taobao.themis.kernel.logger.a.c(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH, com.taobao.themis.kernel.logger.a.EVENT_ON_ERROR, com.taobao.themis.kernel.logger.b.a(f.this), a2, jSONObject);
            }
        });
    }

    public void a(e eVar) {
        ITMSPage c2;
        qpm f2;
        rnc pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb15ce", new Object[]{this, eVar});
            return;
        }
        TMSBaseSolution tMSBaseSolution = this.g;
        if (tMSBaseSolution != null && tMSBaseSolution.getSplashView() != null) {
            this.g.getSplashView().a(eVar, null);
        }
        TMSBaseSolution tMSBaseSolution2 = this.g;
        if (tMSBaseSolution2 != null && tMSBaseSolution2.getSolutionType() == TMSSolutionType.WEB_SINGLE_PAGE && (c2 = this.n.c()) != null && (f2 = c2.f()) != null && (pageContainer = f2.getPageContainer()) != null) {
            pageContainer.a(eVar);
        }
        c cVar = this.v;
        if (cVar != null) {
            cVar.a(eVar);
        }
        try {
            this.t.d(eVar.d);
            this.t.e(eVar.e);
            this.t.a(this);
        } catch (Throwable th) {
            TMSLogger.a("TMSInstance", th);
        }
    }

    public void a(qqp qqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd4d688", new Object[]{this, qqpVar});
            return;
        }
        TMSBaseSolution tMSBaseSolution = this.g;
        if (tMSBaseSolution == null) {
            return;
        }
        tMSBaseSolution.reload(qqpVar);
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        TMSBaseSolution tMSBaseSolution = this.g;
        if (tMSBaseSolution == null) {
            return;
        }
        tMSBaseSolution.reload(null);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        TMSBaseSolution tMSBaseSolution = this.g;
        if (tMSBaseSolution == null || tMSBaseSolution.getSplashView() == null) {
            return;
        }
        this.g.getSplashView().c();
    }

    public void a(TMSBaseSolution tMSBaseSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d10fd2f", new Object[]{this, tMSBaseSolution});
            return;
        }
        this.g = tMSBaseSolution;
        List<sud> instanceExtension = tMSBaseSolution.getInstanceExtension();
        if (instanceExtension == null) {
            return;
        }
        for (sud sudVar : instanceExtension) {
            a(sudVar);
        }
    }

    public qqg d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qqg) ipChange.ipc$dispatch("261ea7d4", new Object[]{this}) : this.g.getRenderFactory();
    }

    public ITMSPageFactory m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPageFactory) ipChange.ipc$dispatch("3cf314ff", new Object[]{this}) : this.g.getPageFactory();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.i;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.j;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.r;
    }

    public TMSSolutionType j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("368c152f", new Object[]{this});
        }
        TMSBaseSolution tMSBaseSolution = this.g;
        if (tMSBaseSolution != null) {
            return tMSBaseSolution.getSolutionType();
        }
        return TMSSolutionType.getType(this);
    }

    public TMSBaseSolution A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSBaseSolution) ipChange.ipc$dispatch("e4b9658f", new Object[]{this}) : this.g;
    }

    public void a(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05ed5b1", new Object[]{this, tMSMetaInfoWrapper});
            return;
        }
        this.l = tMSMetaInfoWrapper;
        if (tMSMetaInfoWrapper == null || !o.f(this)) {
            return;
        }
        this.j = tMSMetaInfoWrapper.a();
    }

    public qpu k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qpu) ipChange.ipc$dispatch("5bfa2b5e", new Object[]{this}) : this.t;
    }

    public tei D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tei) ipChange.ipc$dispatch("2feb2c43", new Object[]{this}) : this.q;
    }

    public TMSMetaInfoWrapper v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSMetaInfoWrapper) ipChange.ipc$dispatch("84b8da82", new Object[]{this}) : this.l;
    }

    public TMSMetaInfoWrapper w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSMetaInfoWrapper) ipChange.ipc$dispatch("11a5f1a1", new Object[]{this}) : this.m;
    }

    public com.taobao.themis.kernel.container.a x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.container.a) ipChange.ipc$dispatch("4ae7ca2f", new Object[]{this}) : this.g.getContainerModel();
    }

    public void b(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114a272", new Object[]{this, tMSMetaInfoWrapper});
        } else {
            this.m = tMSMetaInfoWrapper;
        }
    }

    public Activity o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("3b454af2", new Object[]{this}) : this.h;
    }

    @Override // com.taobao.themis.kernel.d
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public TMSContainerType i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSContainerType) ipChange.ipc$dispatch("97adbc84", new Object[]{this}) : this.w;
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            com.taobao.themis.kernel.ability.a.a().a(this);
        }
    }

    public boolean a(TMSBackPressedType tMSBackPressedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b947806", new Object[]{this, tMSBackPressedType})).booleanValue();
        }
        ITMSPage c2 = this.n.c();
        if (c2 == null) {
            TMSLogger.d("TMSInstance", "can't find current top active page");
            return false;
        }
        if (n.bT()) {
            c2 = ae.Companion.a(this.n.c());
        }
        if (c2 == null) {
            TMSLogger.d("TMSInstance", "can't find current top active page");
            return false;
        }
        s sVar = (s) c2.a(s.class);
        if (sVar != null && sVar.a(tMSBackPressedType)) {
            return true;
        }
        if (qqc.a(c2) && n.f(this.j) && this.p.contains("closeWindow") && this.n.d() == 1) {
            TMSLogger.a("TMSInstance", "can't backPressed due to closeWindow event");
            c2.a("closeWindow", new JSONObject());
            return true;
        }
        return this.n.a(true);
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : a((TMSBackPressedType) null);
    }

    public InstanceStartParams q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InstanceStartParams) ipChange.ipc$dispatch("b02548e6", new Object[]{this}) : this.o;
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (b().c() == null) {
        } else {
            b().c().a(i, i2, intent);
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) qpt.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onStart(this);
        }
        for (b bVar : this.x) {
            bVar.a();
        }
        suc sucVar = (suc) b(suc.class);
        if (sucVar == null) {
            return;
        }
        sucVar.d();
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) qpt.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onPause(this);
        }
        Iterator<b> it = this.x.iterator();
        while (it.hasNext()) {
            it.next();
        }
        suc sucVar = (suc) b(suc.class);
        if (sucVar == null) {
            return;
        }
        sucVar.b();
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) qpt.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onResume(this);
        }
        for (b bVar : this.x) {
            bVar.c();
        }
        suc sucVar = (suc) b(suc.class);
        if (sucVar == null) {
            return;
        }
        sucVar.a();
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) qpt.b(IInstanceLifecycleAdapter.class);
        if (iInstanceLifecycleAdapter != null) {
            iInstanceLifecycleAdapter.onStop(this);
        }
        for (b bVar : this.x) {
            bVar.b();
        }
        suc sucVar = (suc) b(suc.class);
        if (sucVar == null) {
            return;
        }
        sucVar.dJ_();
    }

    public void a(sud sudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff717156", new Object[]{this, sudVar});
            return;
        }
        com.taobao.themis.kernel.utils.d.a("TMSInstance#registerExtension", new Pair("extensionName:", sudVar.getClass().getName()), new Pair("instance", this.c));
        this.u.add(sudVar);
        sudVar.a(this);
        com.taobao.themis.kernel.utils.d.a("TMSInstance#registerExtension");
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae71f6f", new Object[]{this, bVar});
        } else {
            this.x.add(bVar);
        }
    }

    public <T> T b(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d4d5cb3e", new Object[]{this, cls});
        }
        Iterator<sud> it = this.u.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (!this.e) {
            this.e = true;
            u();
            TMSLogger.a("TMSInstance", "instance triggers destroy");
            IInstanceLifecycleAdapter iInstanceLifecycleAdapter = (IInstanceLifecycleAdapter) qpt.b(IInstanceLifecycleAdapter.class);
            if (iInstanceLifecycleAdapter != null) {
                iInstanceLifecycleAdapter.onDestroy(this);
            }
            com.taobao.themis.kernel.ability.c.a();
            this.n.a();
            TMSBaseSolution tMSBaseSolution = this.g;
            if (tMSBaseSolution != null) {
                tMSBaseSolution.destroy();
            }
            for (sud sudVar : this.u) {
                sudVar.bQ_();
            }
            this.u.clear();
            this.p.clear();
            this.t.a(this);
            teh.a(this);
            l();
        }
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.e;
    }
}
