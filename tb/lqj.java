package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.m;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class lqj extends lqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<lku> f30826a;

    static {
        kge.a(1326448608);
    }

    public static /* synthetic */ Object ipc$super(lqj lqjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String a(lqj lqjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91de3fcd", new Object[]{lqjVar}) : lqjVar.g();
    }

    public static /* synthetic */ boolean b(lqj lqjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1cce7b8", new Object[]{lqjVar})).booleanValue() : lqjVar.i();
    }

    public lqj(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.lqm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // tb.lqm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            f();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        lks<?> d = d();
        if (d == null) {
            return;
        }
        lku h = h();
        this.f30826a = new WeakReference<>(h);
        d.a(h);
    }

    private void f() {
        lku lkuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        lks<?> d = d();
        if (d == null || (lkuVar = this.f30826a.get()) == null) {
            return;
        }
        d.b(lkuVar);
    }

    private String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : c().a().a();
    }

    private lku h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lku) ipChange.ipc$dispatch("44e2e2a1", new Object[]{this}) : new lku() { // from class: tb.lqj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lku
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    lqe.a(lqj.a(lqj.this), true, lqj.b(lqj.this));
                }
            }

            @Override // tb.lku
            public void a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                } else {
                    lqe.a(lqj.a(lqj.this), false, true);
                }
            }

            @Override // tb.lku
            public void a(int i, int i2, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f8120a4", new Object[]{this, new Integer(i), new Integer(i2), obj});
                } else {
                    lqe.a(lqj.a(lqj.this), false, true);
                }
            }

            @Override // tb.lku
            public void b(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
                } else {
                    lqe.a(lqj.a(lqj.this), false, true);
                }
            }

            @Override // tb.lku
            public void c(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
                } else {
                    lqe.a(lqj.a(lqj.this), false, true);
                }
            }

            @Override // tb.lku
            public void a(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                } else {
                    m.a(lqj.a(lqj.this), false, true);
                }
            }
        };
    }

    private boolean i() {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) c().a(IContainerDataService.class);
        if (iContainerDataService != null && (containerData = iContainerDataService.getContainerData()) != null && (base = containerData.getBase()) != null) {
            return base.isRemote();
        }
        return false;
    }
}
