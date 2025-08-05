package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes.dex */
public abstract class lqi implements lqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30825a;

    static {
        kge.a(175452521);
        kge.a(819756510);
    }

    public lqi(ljs ljsVar) {
        this.f30825a = ljsVar;
    }

    public ljs c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("1e6aa3c7", new Object[]{this}) : this.f30825a;
    }

    public lks<?> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lks) ipChange.ipc$dispatch("261c4ce7", new Object[]{this});
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30825a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.mo1084getLifeCycleRegister();
        }
        return null;
    }
}
