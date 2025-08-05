package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.security.wukong.model.multi.stream.StreamRiskSample;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class Wb<T extends StreamRiskSample, D extends Data> extends Vb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void a(CcrcService ccrcService, T t, D d);
}
