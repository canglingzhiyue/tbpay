package com.taobao.tao.infoflow.commonsubservice.pullsecondfloor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ljs;

/* loaded from: classes.dex */
public class PullSecondFloorServiceImpl implements IPullSecondFloorService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isOnPullSecondFloor;
    private final List<IPullSecondFloorService.a> mPullSecondFloorLifeCycles = new CopyOnWriteArrayList();

    static {
        kge.a(-2064565094);
        kge.a(-1187716564);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mPullSecondFloorLifeCycles.clear();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
            return;
        }
        this.isOnPullSecondFloor = true;
        notifyPullSecondFloorState(this.isOnPullSecondFloor);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            return;
        }
        this.isOnPullSecondFloor = false;
        notifyPullSecondFloorState(this.isOnPullSecondFloor);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public boolean isOnPullSecondFloor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dde0d015", new Object[]{this})).booleanValue() : this.isOnPullSecondFloor;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public void addLifeCycleListener(IPullSecondFloorService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422b2674", new Object[]{this, aVar});
        } else {
            this.mPullSecondFloorLifeCycles.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public void removeLifeCycleListener(IPullSecondFloorService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14cb2bd7", new Object[]{this, aVar});
        } else {
            this.mPullSecondFloorLifeCycles.remove(aVar);
        }
    }

    private void notifyPullSecondFloorState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573716c6", new Object[]{this, new Boolean(z)});
            return;
        }
        for (IPullSecondFloorService.a aVar : this.mPullSecondFloorLifeCycles) {
            if (z) {
                aVar.a();
            } else {
                aVar.b();
            }
        }
    }
}
