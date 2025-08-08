package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.home.component.utils.e;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.Globals;
import com.taobao.tao.infoflow.multitab.d;
import com.taobao.tao.infoflow.multitab.f;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.topmultitab.a;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.c;
import com.taobao.themis.kernel.i;
import tb.suf;

/* loaded from: classes8.dex */
public class qzj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SUB_CONTAINER_TYPE = "recommend";

    /* renamed from: a  reason: collision with root package name */
    private final c f33070a;
    private final String b;
    private final IHomeSubTabController c;
    private suf.a d;
    private IHomeSubTabController e;
    private String f;

    static {
        kge.a(-1220615861);
    }

    public static /* synthetic */ IHomeSubTabController a(qzj qzjVar, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("f520733b", new Object[]{qzjVar, iHomeSubTabController});
        }
        qzjVar.e = iHomeSubTabController;
        return iHomeSubTabController;
    }

    public static /* synthetic */ String a(qzj qzjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bf89cda9", new Object[]{qzjVar}) : qzjVar.f;
    }

    public static /* synthetic */ String a(qzj qzjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49d160df", new Object[]{qzjVar, str});
        }
        qzjVar.f = str;
        return str;
    }

    public static /* synthetic */ void a(qzj qzjVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b33f904", new Object[]{qzjVar, iContainerDataModel});
        } else {
            qzjVar.c(iContainerDataModel);
        }
    }

    public static /* synthetic */ IHomeSubTabController b(qzj qzjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("3b98a269", new Object[]{qzjVar}) : qzjVar.e;
    }

    public static /* synthetic */ boolean b(qzj qzjVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd8f0fe7", new Object[]{qzjVar, iContainerDataModel})).booleanValue() : qzjVar.a(iContainerDataModel);
    }

    public static /* synthetic */ IHomeSubTabController c(qzj qzjVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("cad99a53", new Object[]{qzjVar, iContainerDataModel}) : qzjVar.b(iContainerDataModel);
    }

    public qzj(c cVar, String str, IHomeSubTabController iHomeSubTabController) {
        this.f33070a = cVar;
        this.b = str;
        this.c = iHomeSubTabController;
        IContainerDataModel<?> f = f();
        if (f == null || f.getBase() == null) {
            ldf.d("RecommendSwitchHelper", "containerDataModel is null");
        }
        this.f = a(f) ? "multiClass" : "homeMainLand";
        this.e = b(f);
        ldf.d("RecommendSwitchHelper", "current controller type: " + this.f);
        c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : StringUtils.equals("multiClass", this.f);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (g()) {
            IHomeSubTabController iHomeSubTabController = this.e;
            if (iHomeSubTabController instanceof d) {
                return ((d) iHomeSubTabController).c();
            }
        }
        return false;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (g()) {
            IHomeSubTabController iHomeSubTabController = this.e;
            if (iHomeSubTabController instanceof d) {
                return ((d) iHomeSubTabController).e();
            }
        }
        return false;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (g()) {
            IHomeSubTabController iHomeSubTabController = this.e;
            if (iHomeSubTabController instanceof d) {
                return ((d) iHomeSubTabController).f();
            }
        }
        return false;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (g()) {
            IHomeSubTabController iHomeSubTabController = this.e;
            if (iHomeSubTabController instanceof d) {
                return ((d) iHomeSubTabController).d();
            }
        }
        return false;
    }

    public IHomeSubTabController b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("337de8ba", new Object[]{this}) : this.e;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d != null) {
        } else {
            this.d = e();
            oql.a().i().a(this.d, ksk.NEW_FACE_PARENT.f30287a);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.d == null) {
        } else {
            oql.a().i().b(this.d, ksk.NEW_FACE_PARENT.f30287a);
        }
    }

    private suf.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (suf.a) ipChange.ipc$dispatch("fe931cf9", new Object[]{this}) : new suf.a() { // from class: tb.qzj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.suf.a
            public void a(IContainerDataModel<?> iContainerDataModel, JSONObject jSONObject, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fafb607", new Object[]{this, iContainerDataModel, jSONObject, str});
                    return;
                }
                if (jSONObject != null && "coldStart".equals(jSONObject.getString(i.CDN_REQUEST_TYPE))) {
                    f.u = true;
                    g.a("RecommendSwitchHelper", "冷启请求完成");
                }
                qzj.a(qzj.this, iContainerDataModel);
            }
        };
    }

    private boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        boolean z = iContainerDataModel == null || iContainerDataModel.getTotalData() == null || iContainerDataModel.getTotalData().isEmpty();
        e.e("RecommendSwitchHelper", "is empty data: " + z);
        if (z && !a.c()) {
            return c.a.a("multiClass", "multiClass", false);
        }
        return com.taobao.tao.infoflow.multitab.e.a(iContainerDataModel) != null;
    }

    private IHomeSubTabController b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("7100fd43", new Object[]{this, iContainerDataModel});
        }
        if (a(iContainerDataModel)) {
            return new d(this.f33070a, com.taobao.tao.infoflow.multitab.e.a(iContainerDataModel), this.c);
        }
        return new oji(this.f33070a, this.b, this.c);
    }

    private IContainerDataModel<?> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataModel) ipChange.ipc$dispatch("a86fad98", new Object[]{this});
        }
        ope f = com.taobao.tao.homepage.d.f(ksk.NEW_FACE_PARENT.f30287a);
        if (f != null) {
            return f.b(ksk.NEW_FACE_PARENT.f30287a);
        }
        return null;
    }

    private void c(final IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03a7b91", new Object[]{this, iContainerDataModel});
        } else {
            ljd.a().b(new Runnable() { // from class: tb.qzj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (l.d(Globals.getApplication())) {
                    } else {
                        String str = qzj.b(qzj.this, iContainerDataModel) ? "multiClass" : "homeMainLand";
                        if (StringUtils.equals(str, qzj.a(qzj.this))) {
                            return;
                        }
                        c.a.b("multiClass", "multiClass", StringUtils.equals("multiClass", str));
                        qzj.a(qzj.this, str);
                        qzj.b(qzj.this).onDestroy();
                        qzj.a(qzj.this, (IHomeSubTabController) null);
                        qzj qzjVar = qzj.this;
                        qzj.a(qzjVar, qzj.c(qzjVar, iContainerDataModel));
                        com.taobao.tao.topmultitab.c.a().j(ovr.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES);
                        e.e("RecommendSwitchHelper", "controller type changed: " + str);
                        if (!com.taobao.tao.topmultitab.c.a().w()) {
                            return;
                        }
                        qzj.b(qzj.this).onPageSelected();
                    }
                }
            });
        }
    }
}
