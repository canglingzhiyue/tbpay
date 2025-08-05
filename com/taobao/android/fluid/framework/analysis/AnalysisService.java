package com.taobao.android.fluid.framework.analysis;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.analysis.analysis.a;
import tb.kge;
import tb.pim;

/* loaded from: classes5.dex */
public class AnalysisService implements IAnalysisService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a mFluidInstanceAnalysis;
    private boolean mIsRetryFetchContent;
    private final pim mServiceConfig = new pim();

    static {
        kge.a(-685014001);
        kge.a(-1895749766);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public AnalysisService(FluidContext fluidContext) {
        this.mFluidInstanceAnalysis = new FluidInstanceAnalysis(fluidContext, null);
    }

    @Override // com.taobao.android.fluid.framework.analysis.IAnalysisService
    public pim getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pim) ipChange.ipc$dispatch("febb43d3", new Object[]{this}) : this.mServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.analysis.IAnalysisService
    public a getFluidInstanceAnalysis() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a057801", new Object[]{this}) : this.mFluidInstanceAnalysis;
    }

    @Override // com.taobao.android.fluid.framework.analysis.IAnalysisService
    public boolean isRetryFetchContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("45a6f528", new Object[]{this})).booleanValue() : this.mIsRetryFetchContent;
    }

    @Override // com.taobao.android.fluid.framework.analysis.IAnalysisService
    public void setRetryFetchContent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b165768", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsRetryFetchContent = z;
        }
    }
}
