package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes.dex */
public class lhk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30605a;

    static {
        kge.a(343725248);
    }

    public lhk(ljs ljsVar) {
        this.f30605a = ljsVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30605a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        a(iMainFeedsViewService);
    }

    private void a(IMainFeedsViewService iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5d7190", new Object[]{this, iMainFeedsViewService});
            return;
        }
        ldf.b("ScrollToController", "scrollToTop to 0");
        iMainFeedsViewService.scrollToTop();
    }
}
