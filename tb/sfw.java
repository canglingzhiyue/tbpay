package tb;

import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.utils.n;
import com.taobao.global.setting.util.e;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import tb.lks;
import tb.lkx;

/* loaded from: classes7.dex */
public class sfw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ND_ANIM_FEATURE_LIST = "clientAbNdAnimFeatureList";
    private static String p;

    /* renamed from: a  reason: collision with root package name */
    private final IMainFeedsViewService<?> f33536a;
    private final IContainerDataService<?> b;
    private final IMainLifecycleService c;
    private lks.c<ViewGroup> d;
    private lks.b e;
    private IContainerDataService.b f;
    private llb g;
    private sga h;
    private sfz i;
    private sgb j;
    private swb k;
    private boolean m;
    private lkx.a o;
    private lks.e q;
    private int l = -1;
    private int n = 10;

    public static /* synthetic */ int a(sfw sfwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fea6b3c7", new Object[]{sfwVar})).intValue() : sfwVar.l;
    }

    public static /* synthetic */ int a(sfw sfwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d63039a2", new Object[]{sfwVar, new Integer(i)})).intValue();
        }
        sfwVar.l = i;
        return i;
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        p = str;
        return str;
    }

    public static /* synthetic */ void a(sfw sfwVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22362ce7", new Object[]{sfwVar, iContainerDataModel});
        } else {
            sfwVar.a(iContainerDataModel);
        }
    }

    public static /* synthetic */ boolean a(sfw sfwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6307984", new Object[]{sfwVar, new Boolean(z)})).booleanValue();
        }
        sfwVar.m = z;
        return z;
    }

    public static /* synthetic */ int b(sfw sfwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b80e0341", new Object[]{sfwVar, new Integer(i)})).intValue();
        }
        sfwVar.n = i;
        return i;
    }

    public static /* synthetic */ sga b(sfw sfwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sga) ipChange.ipc$dispatch("4ea317a4", new Object[]{sfwVar}) : sfwVar.h;
    }

    public static /* synthetic */ swb c(sfw sfwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (swb) ipChange.ipc$dispatch("36452a32", new Object[]{sfwVar}) : sfwVar.k;
    }

    public static /* synthetic */ sfz d(sfw sfwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sfz) ipChange.ipc$dispatch("1de6c3a8", new Object[]{sfwVar}) : sfwVar.i;
    }

    public static /* synthetic */ sgb e(sfw sfwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sgb) ipChange.ipc$dispatch("5889ae0", new Object[]{sfwVar}) : sfwVar.j;
    }

    public static /* synthetic */ IContainerDataService f(sfw sfwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService) ipChange.ipc$dispatch("5fd7f62b", new Object[]{sfwVar}) : sfwVar.b;
    }

    public static /* synthetic */ void g(sfw sfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b8dada", new Object[]{sfwVar});
        } else {
            sfwVar.q();
        }
    }

    public static /* synthetic */ String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : p;
    }

    static {
        kge.a(516059949);
        p = null;
    }

    public sfw(ljs ljsVar) {
        this.f33536a = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.b = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.c = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (!ObjectUtils.a(this.f33536a, this.b, this.c)) {
            ldf.d("NextPagePreLoader", "mMainFeedsViewService || mContainerDataService || mMainLifecycleService is null");
            return;
        }
        this.h = new sga(this.b, this.f33536a);
        this.i = new sfz();
        this.j = new sgb();
        this.k = new swb(this.b, this.f33536a);
        f();
        h();
        j();
        m();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        g();
        i();
        k();
        n();
    }

    private lks.c<ViewGroup> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.c) ipChange.ipc$dispatch("4c80d1ca", new Object[]{this}) : new lks.c<ViewGroup>() { // from class: tb.sfw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.c
            public void a(ViewGroup viewGroup, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
                }
            }

            @Override // tb.lks.c
            public void a(boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                }
            }

            @Override // tb.lks.c
            public void a(ViewGroup viewGroup, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
                } else if (i == sfw.a(sfw.this)) {
                } else {
                    sfw.a(sfw.this, i);
                    if (i != 0 || sfw.b(sfw.this) == null) {
                        return;
                    }
                    sfw.b(sfw.this).a();
                    sfw.c(sfw.this).a();
                }
            }
        };
    }

    private IContainerDataService.b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("2b51aafe", new Object[]{this}) : new IContainerDataService.b() { // from class: tb.sfw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                } else if (sfw.d(sfw.this) == null) {
                } else {
                    sfw.a(sfw.this, iContainerDataModel);
                    if (StringUtils.equals(str, Constant.KEY_PAGEBACK) && Login.checkSessionValid()) {
                        if (sfw.c(sfw.this) != null) {
                            sfw.c(sfw.this).a();
                        }
                        if (sfw.b(sfw.this) != null) {
                            sfw.b(sfw.this).a();
                        }
                    }
                    if (iContainerDataModel == null || iContainerDataModel.getBase() == null) {
                        return;
                    }
                    boolean equals = StringUtils.equals(str, "coldStart");
                    if (equals && ldj.a("enableColdStartPreRequestND", true)) {
                        sfw.b(sfw.this, 0);
                    } else {
                        sfw.b(sfw.this, 10);
                    }
                    sfw.a(sfw.this, !equals);
                    sfw.e(sfw.this).a(iContainerDataModel);
                    sfw.d(sfw.this).a(iContainerDataModel);
                }
            }
        };
    }

    private llb d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("261c4e99", new Object[]{this}) : new bxp() { // from class: tb.sfw.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bxp, tb.llb
            public void onDestroy() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6532022", new Object[]{this});
                } else if (sfw.d(sfw.this) == null || sfw.f(sfw.this) == null) {
                } else {
                    sfw.d(sfw.this).b(sfw.f(sfw.this).getContainerData());
                }
            }
        };
    }

    private lks.e p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.e) ipChange.ipc$dispatch("a6a1d8ba", new Object[]{this}) : new lks.e() { // from class: tb.sfw.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    sfw.g(sfw.this);
                }
            }
        };
    }

    private lks.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.b) ipChange.ipc$dispatch("f21a2e88", new Object[]{this}) : new lks.b() { // from class: tb.sfw.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.b
            public void dM_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32a48a9d", new Object[]{this});
                }
            }

            @Override // tb.lks.b
            public void dT_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e9676f6", new Object[]{this});
                } else {
                    sfw.g(sfw.this);
                }
            }
        };
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        boolean a2 = thd.a(this.f33536a);
        ldf.d("NextPagePreLoader", "onDataChangeLayoutFinish: coldStartNumber: " + this.n + " isAllowDataChangePreLoad: " + this.m + " isCacheCard: " + a2);
        if ((this.n >= 2 && !this.m) || a2) {
            return;
        }
        this.n++;
        ldf.d("NextPagePreLoader", "onDataChangeLayoutFinish preLoadNewDetailOnScreen");
        this.h.a();
        this.k.a();
    }

    private lkx.a l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkx.a) ipChange.ipc$dispatch("1f2cf79d", new Object[]{this}) : new lkx.a() { // from class: tb.sfw.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkx.a
            public void a(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6090f25", new Object[]{this, viewHolder});
                }
            }

            @Override // tb.lkx.a
            public void c(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d875b4e3", new Object[]{this, viewHolder});
                }
            }

            @Override // tb.lkx.a
            public void b(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d73f6204", new Object[]{this, viewHolder});
                } else {
                    ldf.d("NextPagePreLoader", "onItemRemoveFinished preload");
                }
            }

            @Override // tb.lkx.a
            public void d(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9ac07c2", new Object[]{this, viewHolder});
                    return;
                }
                ldf.d("NextPagePreLoader", "onItemAddFinished preload");
                sfw.b(sfw.this).a();
                sfw.c(sfw.this).a();
            }
        };
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f33536a;
        if (iMainFeedsViewService == null) {
            ldf.d("NextPagePreLoader", "registerFeedsListener mMainFeedsViewService is null");
            return;
        }
        lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
        this.d = b();
        mo1084getLifeCycleRegister.a(this.d);
        this.e = e();
        mo1084getLifeCycleRegister.a(this.e);
        this.q = p();
        mo1084getLifeCycleRegister.a(this.q);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f33536a;
        if (iMainFeedsViewService == null) {
            ldf.d("NextPagePreLoader", "unRegisterOnScrollListener mMainFeedsViewService is null");
            return;
        }
        lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
        lks.c<ViewGroup> cVar = this.d;
        if (cVar != null) {
            mo1084getLifeCycleRegister.b(cVar);
            this.d = null;
        }
        lks.b bVar = this.e;
        if (bVar != null) {
            mo1084getLifeCycleRegister.b(bVar);
            this.e = null;
        }
        lks.e eVar = this.q;
        if (eVar == null) {
            return;
        }
        mo1084getLifeCycleRegister.b(eVar);
        this.q = null;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.b == null) {
            ldf.d("NextPagePreLoader", "registerRequestListener mContainerDataService is null");
        } else {
            this.f = c();
            this.b.addRequestListener(this.f);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            ldf.d("NextPagePreLoader", "unRegisterRequestListener mContainerDataService is null");
            return;
        }
        IContainerDataService.b bVar = this.f;
        if (bVar == null) {
            return;
        }
        iContainerDataService.removeRequestListener(bVar);
        this.f = null;
    }

    private void m() {
        lks mo1084getLifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f33536a;
        if (iMainFeedsViewService == null || (mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister()) == null) {
            return;
        }
        this.o = l();
        mo1084getLifeCycleRegister.a(this.o);
    }

    private void n() {
        lks mo1084getLifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f33536a;
        if (iMainFeedsViewService == null || this.o == null || (mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister()) == null) {
            return;
        }
        mo1084getLifeCycleRegister.b(this.o);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.c == null) {
            ldf.d("NextPagePreLoader", "registerPageLifeCycleListener mMainLifecycleService is null");
        } else {
            this.g = d();
            this.c.getPageLifeCycleRegister().a(this.g);
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService == null) {
            ldf.d("NextPagePreLoader", "unRegisterPageLifeCycleListener mMainLifecycleService is null");
        } else if (this.g == null) {
        } else {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.g);
            this.g = null;
        }
    }

    private void a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
            return;
        }
        JSONObject b = b(iContainerDataModel);
        a(b);
        b(b);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            ldf.d("NextPagePreLoader", "updateNdLowFeatureList homeGlobalAbTest == null");
        } else {
            final String string = jSONObject.getString(h.KEY_ND_LOW_FEATURE_LIST);
            if (string == null) {
                return;
            }
            n.a(string);
            ljd.a().a(new Runnable() { // from class: tb.sfw.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SharedPreferences a2 = e.a(Globals.getApplication()).a();
                    if (a2 == null) {
                        return;
                    }
                    SharedPreferences.Editor edit = a2.edit();
                    edit.putString(h.KEY_ND_LOW_FEATURE_LIST, string);
                    edit.apply();
                }
            });
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            ldf.d("NextPagePreLoader", "updateNdAnimFeatureList homeGlobalAbTest == null");
        } else {
            final String string = jSONObject.getString("clientAbNdAnimFeatureList");
            if (string == null) {
                return;
            }
            n.b(string);
            ljd.a().a(new Runnable() { // from class: tb.sfw.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    SharedPreferences a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (string.equals(sfw.o()) || (a2 = e.a(Globals.getApplication()).a()) == null) {
                    } else {
                        SharedPreferences.Editor edit = a2.edit();
                        edit.putString("clientAbNdAnimFeatureList", string);
                        edit.apply();
                        sfw.a(string);
                    }
                }
            });
        }
    }

    private JSONObject b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("50f278d2", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            ldf.d("NextPagePreLoader", "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            ldf.d("NextPagePreLoader", "baseData == null");
            return null;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            ldf.d("NextPagePreLoader", "ext == null");
            return null;
        }
        return ext.getJSONObject("homeGlobalABTest");
    }
}
