package com.taobao.infoflow.taobao.subservice.biz.pullrefreshservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ljs;

/* loaded from: classes7.dex */
public class PullRefreshServiceImpl implements IPullRefreshService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<IPullRefreshService.a> mPullRefreshListenerList = new CopyOnWriteArrayList();

    static {
        kge.a(-1618678118);
        kge.a(1016861033);
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
            this.mPullRefreshListenerList.clear();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
        } else {
            notifyPullDistance(i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
        } else {
            notifyOnRefresh();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void onRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
        } else {
            notifyRefreshStateChanged(str, str2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void addPullRefreshListener(IPullRefreshService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f2248b", new Object[]{this, aVar});
        } else {
            this.mPullRefreshListenerList.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void removePullRefreshListener(IPullRefreshService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18a26ae", new Object[]{this, aVar});
        } else if (this.mPullRefreshListenerList.isEmpty()) {
        } else {
            this.mPullRefreshListenerList.remove(aVar);
        }
    }

    private void notifyPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510fc1f9", new Object[]{this, new Integer(i)});
            return;
        }
        for (IPullRefreshService.a aVar : this.mPullRefreshListenerList) {
            aVar.a(i);
        }
    }

    private void notifyOnRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ef31ba", new Object[]{this});
            return;
        }
        Iterator<IPullRefreshService.a> it = this.mPullRefreshListenerList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void notifyRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19461270", new Object[]{this, str, str2});
            return;
        }
        for (IPullRefreshService.a aVar : this.mPullRefreshListenerList) {
            aVar.a(str, str2);
        }
    }
}
