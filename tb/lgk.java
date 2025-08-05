package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;

/* loaded from: classes.dex */
public class lgk implements lgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IMainFeedsLoopStartStopService.a f30568a;
    private final IPullSecondFloorService b;
    private IPullSecondFloorService.a c;

    static {
        kge.a(340979403);
        kge.a(1227300292);
    }

    public static /* synthetic */ IMainFeedsLoopStartStopService.a a(lgk lgkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("3d9e22d9", new Object[]{lgkVar}) : lgkVar.f30568a;
    }

    public lgk(ljs ljsVar, IMainFeedsLoopStartStopService.a aVar) {
        this.f30568a = aVar;
        this.b = (IPullSecondFloorService) ljsVar.a(IPullSecondFloorService.class);
    }

    @Override // tb.lgn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            d();
        }
    }

    @Override // tb.lgn
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // tb.lgn
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        IPullSecondFloorService iPullSecondFloorService = this.b;
        return iPullSecondFloorService == null || !iPullSecondFloorService.isOnPullSecondFloor();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b == null) {
            ldf.d("PullSecondFloorStartStopDetectorImpl", "register pullSecondFloorService is null");
        } else {
            this.c = f();
            this.b.addLifeCycleListener(this.c);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        IPullSecondFloorService iPullSecondFloorService = this.b;
        if (iPullSecondFloorService == null) {
            ldf.d("PullSecondFloorStartStopDetectorImpl", "unRegister pullSecondFloorService is null");
            return;
        }
        IPullSecondFloorService.a aVar = this.c;
        if (aVar != null) {
            iPullSecondFloorService.removeLifeCycleListener(aVar);
        }
        this.c = null;
    }

    private IPullSecondFloorService.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPullSecondFloorService.a) ipChange.ipc$dispatch("719a8515", new Object[]{this}) : new IPullSecondFloorService.a() { // from class: tb.lgk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    lgk.a(lgk.this).b(IMainFeedsLoopStartStopService.a.SECOND_FLOOR_SWITCH);
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    lgk.a(lgk.this).a(IMainFeedsLoopStartStopService.a.SECOND_FLOOR_SWITCH);
                }
            }
        };
    }
}
