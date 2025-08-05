package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.lkz;
import tb.lsa;

/* loaded from: classes7.dex */
public class lrs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lkz.a f30869a;
    private IContainerDataService.a b;
    private IContainerDataService.b c;
    private lsa d;
    private ljs e;
    private lrt f;

    static {
        kge.a(-1633291069);
    }

    public static /* synthetic */ lrt a(lrs lrsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lrt) ipChange.ipc$dispatch("ea2a062d", new Object[]{lrsVar}) : lrsVar.f;
    }

    public lrs(ljs ljsVar) {
        this.e = ljsVar;
        this.f = new lrt(this.e);
        k();
        h();
        e();
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        l();
        i();
        f();
        c();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d != null) {
        } else {
            this.d = new lsa(this.e, d());
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        lsa lsaVar = this.d;
        if (lsaVar == null) {
            return;
        }
        lsaVar.d();
    }

    private lsa.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lsa.a) ipChange.ipc$dispatch("10a4f224", new Object[]{this}) : new lsa.a() { // from class: tb.lrs.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lsa.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : lrs.a(lrs.this).a();
            }
        };
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.e.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("SmartLoadingListenerController", "mainFeedsViewService == null");
            return;
        }
        lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
        this.f30869a = g();
        mo1084getLifeCycleRegister.a(this.f30869a);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.e.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("SmartLoadingListenerController", "mainFeedsViewService == null");
        } else {
            iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.f30869a);
        }
    }

    private lkz.a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkz.a) ipChange.ipc$dispatch("b5d8f040", new Object[]{this}) : new lkz.a() { // from class: tb.lrs.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkz.a
            public void a(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
                }
            }

            @Override // tb.lkz.a
            public void a_(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b34bf30d", new Object[]{this, view});
                }
            }

            @Override // tb.lkz.a
            public void b(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
                }
            }

            @Override // tb.lkz.a
            public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
                } else {
                    lrs.a(lrs.this).a(i);
                }
            }
        };
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.e.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingListenerController", "initRegisterRequestListener dataService is null");
            return;
        }
        this.c = j();
        iContainerDataService.addRequestListener(this.c);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.e.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingListenerController", "unRegisterRequestListener dataService is null");
        } else {
            iContainerDataService.removeRequestListener(this.c);
        }
    }

    private IContainerDataService.b j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("5d6fdac5", new Object[]{this}) : new IContainerDataService.b() { // from class: tb.lrs.3
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
                } else {
                    lrs.a(lrs.this).a(str);
                }
            }
        };
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.e.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingListenerController", "containerDataService == null");
            return;
        }
        this.b = m();
        iContainerDataService.addDataProcessListener(this.b);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.e.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingListenerController", "containerDataService == null");
        } else {
            iContainerDataService.removeDataProcessListener(this.b);
        }
    }

    private IContainerDataService.a m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("72ea8169", new Object[]{this}) : new IContainerDataService.a() { // from class: tb.lrs.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                } else {
                    lrs.a(lrs.this).b();
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                } else {
                    lrs.a(lrs.this).c();
                }
            }
        };
    }
}
