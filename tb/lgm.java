package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.lks;

/* loaded from: classes.dex */
public class lgm implements lgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ITopViewService f30574a;
    private final IMainFeedsViewService<?> b;
    private final IMainFeedsLoopStartStopService.a c;
    private ITopViewService.a d;
    private lks.b e;
    private boolean f = false;
    private boolean g = true;

    static {
        kge.a(-2132784524);
        kge.a(1227300292);
    }

    public static /* synthetic */ IMainFeedsLoopStartStopService.a a(lgm lgmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("fe90cedb", new Object[]{lgmVar}) : lgmVar.c;
    }

    public static /* synthetic */ boolean a(lgm lgmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("650cc852", new Object[]{lgmVar, new Boolean(z)})).booleanValue();
        }
        lgmVar.f = z;
        return z;
    }

    public static /* synthetic */ boolean b(lgm lgmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e14159cb", new Object[]{lgmVar})).booleanValue() : lgmVar.f;
    }

    public static /* synthetic */ boolean b(lgm lgmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ea91f1", new Object[]{lgmVar, new Boolean(z)})).booleanValue();
        }
        lgmVar.g = z;
        return z;
    }

    public lgm(ljs ljsVar, IMainFeedsLoopStartStopService.a aVar) {
        this.c = aVar;
        this.f30574a = (ITopViewService) ljsVar.a(ITopViewService.class);
        this.b = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
    }

    @Override // tb.lgn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d();
        g();
    }

    @Override // tb.lgn
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e();
        h();
    }

    @Override // tb.lgn
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.g;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f30574a == null || this.d != null) {
        } else {
            this.d = f();
            this.f30574a.addTopViewShowListener(this.d);
        }
    }

    private void e() {
        ITopViewService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ITopViewService iTopViewService = this.f30574a;
        if (iTopViewService == null || (aVar = this.d) == null) {
            return;
        }
        iTopViewService.removeTopViewShowListener(aVar);
    }

    private ITopViewService.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITopViewService.a) ipChange.ipc$dispatch("490e26b4", new Object[]{this}) : new ITopViewService.a() { // from class: tb.lgm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                lgm.a(lgm.this, true);
                lgm.b(lgm.this, false);
                lgm.a(lgm.this).b(IMainFeedsLoopStartStopService.a.TOP_VIEW_COLD_START);
            }

            @Override // com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                lgm.a(lgm.this, false);
                lgm.b(lgm.this, true);
                lgm.a(lgm.this).a(IMainFeedsLoopStartStopService.a.TOP_VIEW_COLD_START);
            }
        };
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.b == null) {
        } else {
            this.e = i();
            this.b.mo1084getLifeCycleRegister().a(this.e);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null || this.e == null) {
            return;
        }
        iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.e);
    }

    private lks.b i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.b) ipChange.ipc$dispatch("79915504", new Object[]{this}) : new lks.b() { // from class: tb.lgm.2
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
                } else if (!lgm.b(lgm.this)) {
                } else {
                    lgm.b(lgm.this, false);
                    lgm.a(lgm.this).b(IMainFeedsLoopStartStopService.a.TOP_VIEW_COLD_START);
                }
            }
        };
    }
}
