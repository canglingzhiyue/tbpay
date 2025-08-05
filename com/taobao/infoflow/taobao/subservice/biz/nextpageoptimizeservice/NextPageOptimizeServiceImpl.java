package com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.INextPageOptimizeService;
import tb.kge;
import tb.ljs;
import tb.sfw;

/* loaded from: classes7.dex */
public class NextPageOptimizeServiceImpl implements INextPageOptimizeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private sfw mNextPagePreLoader;

    static {
        kge.a(188627976);
        kge.a(-205539732);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
        } else {
            this.mNextPagePreLoader = new sfw(ljsVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        sfw sfwVar = this.mNextPagePreLoader;
        if (sfwVar == null) {
            return;
        }
        sfwVar.a();
    }
}
