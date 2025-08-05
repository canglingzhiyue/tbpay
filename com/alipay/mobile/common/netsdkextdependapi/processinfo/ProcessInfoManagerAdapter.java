package com.alipay.mobile.common.netsdkextdependapi.processinfo;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ProcessInfoManagerAdapter implements ProcessInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.processinfo.ProcessInfoManager
    public long getProcessStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[]{this})).longValue();
        }
        return -1L;
    }
}
