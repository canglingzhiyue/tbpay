package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.tao.recommend3.tracelog.b;
import tb.lks;

/* loaded from: classes.dex */
public class lqn implements lqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IMainFeedsViewService<?> f30835a;
    private lks.b b;

    static {
        kge.a(1557396377);
        kge.a(819756510);
    }

    public lqn(ljs ljsVar) {
        this.f30835a = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
    }

    @Override // tb.lqm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // tb.lqm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            d();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f30835a == null) {
        } else {
            this.b = e();
            this.f30835a.mo1084getLifeCycleRegister().a(this.b);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f30835a;
        if (iMainFeedsViewService == null || this.b == null) {
            return;
        }
        iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.b);
    }

    private lks.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.b) ipChange.ipc$dispatch("f21a2e88", new Object[]{this}) : new lks.b() { // from class: tb.lqn.1
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
                    return;
                }
                b.a().f(b.HOME_RENDER);
                b.a().f(b.HOME_VISIBLE_ONLY);
                b.a().f(b.HOME_VISIBLE);
            }
        };
    }
}
