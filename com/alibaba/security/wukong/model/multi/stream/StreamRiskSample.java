package com.alibaba.security.wukong.model.multi.stream;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.security.wukong.model.multi.MultiModelRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class StreamRiskSample<T extends Data> extends MultiModelRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public StreamRiskSample(String str) {
        super(str);
    }

    public void detect(CcrcService ccrcService, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314a9ddc", new Object[]{this, ccrcService, t});
        } else {
            detect(ccrcService, t, true);
        }
    }

    public abstract void detect(CcrcService ccrcService, T t, boolean z);

    public StreamRiskSample(String str, Map<String, Object> map) {
        super(str, map);
    }
}
