package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;

/* loaded from: classes7.dex */
public class bxq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f26163a;
    private llb b;
    private IDxItemClickService.a c;
    private IContainerDataService.a d;
    private IContainerDataService.b e;
    private final bxr f;
    private final IMainLifecycleService g;
    private final IDxItemClickService h;
    private final IContainerDataService<?> i;

    static {
        kge.a(-1198785200);
    }

    public static /* synthetic */ void a(bxq bxqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7148f886", new Object[]{bxqVar, new Integer(i)});
        } else {
            bxqVar.a(i);
        }
    }

    public static /* synthetic */ void a(bxq bxqVar, lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31374404", new Object[]{bxqVar, lliVar});
        } else {
            bxqVar.a(lliVar);
        }
    }

    public static /* synthetic */ boolean a(bxq bxqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e29f3e21", new Object[]{bxqVar})).booleanValue() : bxqVar.h();
    }

    public static /* synthetic */ ljs b(bxq bxqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("850df813", new Object[]{bxqVar}) : bxqVar.f26163a;
    }

    public static /* synthetic */ bxr c(bxq bxqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bxr) ipChange.ipc$dispatch("6cab772b", new Object[]{bxqVar}) : bxqVar.f;
    }

    public bxq(ljs ljsVar) {
        this.f26163a = ljsVar;
        this.g = (IMainLifecycleService) this.f26163a.a(IMainLifecycleService.class);
        this.h = (IDxItemClickService) this.f26163a.a(IDxItemClickService.class);
        this.i = (IContainerDataService) this.f26163a.a(IContainerDataService.class);
        this.f = new bxr(ljsVar);
        f();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        g();
        ljd.a().c(this.f);
    }

    private llb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llb) ipChange.ipc$dispatch("16b903db", new Object[]{this}) : new bxp() { // from class: tb.bxq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bxp, tb.llb
            public void onResume() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a5d6cd73", new Object[]{this});
                } else if (bxq.a(bxq.this)) {
                } else {
                    bxq.a(bxq.this, 500);
                }
            }
        };
    }

    private IContainerDataService.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("2b51aadf", new Object[]{this}) : new IContainerDataService.a() { // from class: tb.bxq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                } else {
                    bxq.a(bxq.this, lliVar);
                }
            }
        };
    }

    private IContainerDataService.b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("327a8d3f", new Object[]{this}) : new IContainerDataService.b() { // from class: tb.bxq.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                }
            }

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
                } else {
                    bxq.a(bxq.this, lliVar);
                }
            }
        };
    }

    private IDxItemClickService.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDxItemClickService.a) ipChange.ipc$dispatch("a6c00062", new Object[]{this}) : new IDxItemClickService.a() { // from class: tb.bxq.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.a
            public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b6a38c", new Object[]{this, baseSectionModel, baseSubItemModel, view});
                } else {
                    bxq.c(bxq.this).a(lix.a(baseSectionModel, bxn.c(bxq.b(bxq.this))));
                }
            }
        };
    }

    private void a(lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
        } else if (!h() || lliVar == null || !lliVar.a().contains(Constant.KEY_PAGEBACK)) {
        } else {
            a(250);
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!a(this.f26163a)) {
            ldf.d("JumpToBanner", "自动滚动到首焦开关关闭，不执行");
            this.f.a();
        } else {
            ljd.a().c(this.f);
            ljd.a().a(this.f, i);
        }
    }

    private boolean a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2eb5407", new Object[]{this, ljsVar})).booleanValue();
        }
        JSONObject a2 = bxn.a(ljsVar);
        if (a2 == null || !a2.getBooleanValue("enableBackHomeScrollToBanner")) {
            ldf.d("JumpToBanner", "服务端开关未开");
            return false;
        } else if (bxn.b(ljsVar)) {
            ldf.d("JumpToBanner", "数据过期，不执行");
            return false;
        } else if (this.f.b()) {
            return true;
        } else {
            ldf.d("JumpToBanner", "任务自检，不执行");
            return false;
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.g == null || this.h == null || this.i == null) {
        } else {
            this.b = b();
            this.g.getPageLifeCycleRegister().a(this.b);
            this.c = e();
            this.h.addDxItemClickListener(this.c);
            this.d = c();
            this.i.addDataProcessListener(this.d);
            this.e = d();
            this.i.addRequestListener(this.e);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.g;
        if (iMainLifecycleService == null || this.h == null || this.i == null) {
            return;
        }
        iMainLifecycleService.getPageLifeCycleRegister().b(this.b);
        this.h.removeDxItemClickListener(this.c);
        this.i.removeDataProcessListener(this.d);
        this.i.removeRequestListener(this.e);
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : ldj.a("homePageBackRequestEnable", true);
    }
}
