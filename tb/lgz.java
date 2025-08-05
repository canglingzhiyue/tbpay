package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.h;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes.dex */
public class lgz implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30594a;

    static {
        kge.a(-98443294);
        kge.a(-689375790);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.h
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public lgz(ljs ljsVar) {
        this.f30594a = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.h
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) this.f30594a.a(IMulticlassTabService.class);
        if (iMulticlassTabService != null && iMulticlassTabService.isShowTabContent()) {
            return false;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30594a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.isReachTopEdge();
        }
        return true;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30594a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("PullDownRefreshInvokerImpl", "onPullRefresh dataService == null");
            return;
        }
        iContainerDataService.triggerEvent("PullToRefresh", null, new lje("PullToRefresh" + SystemClock.uptimeMillis()));
        h();
        ldl.a(this.f30594a.a().c(), 2101, "Page_Home_Button-Refresh-down", "", "", null);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.h
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        IPullRefreshService iPullRefreshService = (IPullRefreshService) this.f30594a.a(IPullRefreshService.class);
        if (iPullRefreshService == null) {
            return;
        }
        iPullRefreshService.onPullDistance(i);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.h
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        IPullRefreshService iPullRefreshService = (IPullRefreshService) this.f30594a.a(IPullRefreshService.class);
        if (iPullRefreshService == null) {
            return;
        }
        iPullRefreshService.onRefreshStateChanged(str, str2);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.h
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = (IPullSecondFloorService) this.f30594a.a(IPullSecondFloorService.class);
        if (iPullSecondFloorService == null) {
            return;
        }
        iPullSecondFloorService.onEnterPullSecondFloor();
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = (IPullSecondFloorService) this.f30594a.a(IPullSecondFloorService.class);
        if (iPullSecondFloorService == null) {
            return;
        }
        iPullSecondFloorService.onExitPullSecondFloor();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        IPullRefreshService iPullRefreshService = (IPullRefreshService) this.f30594a.a(IPullRefreshService.class);
        if (iPullRefreshService == null) {
            return;
        }
        iPullRefreshService.onRefresh();
    }
}
