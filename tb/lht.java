package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.lks;
import tb.lkx;
import tb.lkz;

/* loaded from: classes7.dex */
public class lht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30625a;
    private final lhv b;
    private final lks<RecyclerView> c;
    private final View.OnAttachStateChangeListener d = b();
    private lks.b e;
    private final IContainerDataService<?> f;
    private final IMainFeedsViewService<?> g;
    private lkx.a h;

    static {
        kge.a(-1554427665);
    }

    public static /* synthetic */ IMainFeedsViewService a(lht lhtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("2dc7388", new Object[]{lhtVar}) : lhtVar.g;
    }

    public static /* synthetic */ boolean a(lht lhtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67244578", new Object[]{lhtVar, new Boolean(z)})).booleanValue();
        }
        lhtVar.f30625a = z;
        return z;
    }

    public static /* synthetic */ boolean b(lht lhtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1529fe5", new Object[]{lhtVar})).booleanValue() : lhtVar.f30625a;
    }

    public static /* synthetic */ lhv c(lht lhtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lhv) ipChange.ipc$dispatch("161caaa", new Object[]{lhtVar}) : lhtVar.b;
    }

    public lht(ljs ljsVar, lks<RecyclerView> lksVar) {
        this.f = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.g = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.c = lksVar;
        this.b = new lhv(ljsVar);
        a(this.b, lksVar);
        this.e = c();
        this.c.a(this.e);
        d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.b((lks.c<RecyclerView>) this.b);
        this.c.b((lkz.a) this.b);
        this.c.b((lku) this.b);
        this.c.b(this.d);
        lks.b bVar = this.e;
        if (bVar != null) {
            this.c.b(bVar);
        }
        e();
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        this.f30625a = true;
        this.b.a(recyclerView, 0);
    }

    private void a(lhv lhvVar, lks<RecyclerView> lksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421f6b3a", new Object[]{this, lhvVar, lksVar});
            return;
        }
        lksVar.a((lks.c<RecyclerView>) lhvVar);
        lksVar.a((lkz.a) lhvVar);
        lksVar.a(this.d);
        lksVar.a((lku) lhvVar);
    }

    private lks.b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.b) ipChange.ipc$dispatch("2e5e9b4a", new Object[]{this}) : new lks.b() { // from class: tb.lht.1
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
                } else if (lht.a(lht.this) == null) {
                } else {
                    final RecyclerView recyclerView = (RecyclerView) lht.a(lht.this).mo1085getOriginalView();
                    if (!ldj.a("enableFirstScreenExpose", true) || recyclerView == null) {
                        return;
                    }
                    ljd.a().a(new Runnable() { // from class: tb.lht.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                lht.this.a(recyclerView);
                            }
                        }
                    }, 100L);
                }
            }
        };
    }

    private void d() {
        lks mo1084getLifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.g;
        if (iMainFeedsViewService == null || (mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister()) == null) {
            return;
        }
        this.h = f();
        mo1084getLifeCycleRegister.a(this.h);
    }

    private void e() {
        lks mo1084getLifeCycleRegister;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.g;
        if (iMainFeedsViewService == null || this.h == null || (mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister()) == null) {
            return;
        }
        mo1084getLifeCycleRegister.b(this.h);
    }

    private lkx.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkx.a) ipChange.ipc$dispatch("d3fa3de3", new Object[]{this}) : new lkx.a() { // from class: tb.lht.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkx.a
            public void a(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6090f25", new Object[]{this, viewHolder});
                }
            }

            @Override // tb.lkx.a
            public void b(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d73f6204", new Object[]{this, viewHolder});
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
            public void d(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9ac07c2", new Object[]{this, viewHolder});
                } else if (!ldj.a("enableInsertExposeBugfix", true) || lht.a(lht.this) == null) {
                } else {
                    lht.a(lht.this).forceExposure();
                }
            }
        };
    }

    private View.OnAttachStateChangeListener b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("ebd7947e", new Object[]{this}) : new View.OnAttachStateChangeListener() { // from class: tb.lht.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                } else if (!lht.b(lht.this)) {
                } else {
                    lht.c(lht.this).a((RecyclerView) view, 0);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    return;
                }
                try {
                    if (!lht.b(lht.this)) {
                        return;
                    }
                    lht.a(lht.this, false);
                    lht.c(lht.this).a((RecyclerView) view, 0);
                    lht.c(lht.this).bi_();
                } catch (Throwable unused) {
                    ldf.d("ExposureController", "onViewDetachedFromWindow error");
                }
            }
        };
    }
}
