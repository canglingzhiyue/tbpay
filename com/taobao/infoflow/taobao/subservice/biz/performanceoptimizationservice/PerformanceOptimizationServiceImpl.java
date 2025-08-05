package com.taobao.infoflow.taobao.subservice.biz.performanceoptimizationservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPerformanceOptimizationService;
import tb.kge;
import tb.ljs;
import tb.lqf;
import tb.xnl;

/* loaded from: classes.dex */
public class PerformanceOptimizationServiceImpl implements IPerformanceOptimizationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private xnl mInfoFlowCacheDataValidator;
    private lqf mPerformanceTraceDetector;

    static {
        kge.a(-1987259846);
        kge.a(-1799690334);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mPerformanceTraceDetector = new lqf(ljsVar);
        this.mPerformanceTraceDetector.a();
        this.mInfoFlowCacheDataValidator = new xnl(ljsVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        this.mPerformanceTraceDetector.b();
        this.mInfoFlowCacheDataValidator.a();
    }
}
