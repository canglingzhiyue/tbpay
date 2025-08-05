package com.taobao.android.fluid.framework.analysis;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.analysis.analysis.a;
import tb.pim;

/* loaded from: classes5.dex */
public interface IAnalysisService extends FluidService {
    public static final String SERVICE_NAME = "IAnalysisService";

    pim getConfig();

    a getFluidInstanceAnalysis();

    boolean isRetryFetchContent();

    void setRetryFetchContent(boolean z);
}
