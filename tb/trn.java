package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.jvm.internal.q;
import tb.trm;

/* loaded from: classes9.dex */
public final class trn implements trm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1722555860);
        kge.a(-1364959579);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            trm.a.a(this);
        }
    }

    @Override // tb.sud
    public void a(f instance) {
        IUserTrackerAdapter iUserTrackerAdapter;
        IUserTrackerAdapter iUserTrackerAdapter2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        trm.a.a(this, instance);
        if (instance.j() != TMSSolutionType.WEB_SINGLE_PAGE && (iUserTrackerAdapter2 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class)) != null) {
            iUserTrackerAdapter2.skipPage(instance.o());
        }
        if (instance.j() != TMSSolutionType.UNIAPP || instance.q().isFragmentContainer() || (iUserTrackerAdapter = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class)) == null) {
            return;
        }
        iUserTrackerAdapter.pvWithRouterIndex(instance.o());
    }
}
