package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.ccrc.service.CcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import java.util.Map;

/* loaded from: classes3.dex */
public interface B extends C, E {
    void a(CcrcService.Config config);

    void a(CcrcService.Config config, InitState initState, InitResult initResult, Map<String, Object> map, OnCcrcCallback onCcrcCallback, long j);

    void a(CcrcService.Config config, SampleData sampleData, CcrcDetectResult ccrcDetectResult);

    void a(CcrcService.Config config, SampleData sampleData, String str, boolean z, int i);

    void a(CcrcService.Config config, CCRCRiskSample cCRCRiskSample, boolean z, String str);

    void a(String str, String str2);

    void a(String str, String str2, boolean z, String str3, long j);

    void b(CcrcService.Config config);
}
