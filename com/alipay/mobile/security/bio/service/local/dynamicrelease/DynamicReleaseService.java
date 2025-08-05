package com.alipay.mobile.security.bio.service.local.dynamicrelease;

import android.content.Context;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public abstract class DynamicReleaseService extends LocalService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void trigDynamicRelease(Context context, String str);

    public void monitorCoverage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cc557d", new Object[]{this, str, str2});
            return;
        }
        BioLog.d("DynamicReleaseService.monitorCoverage(bundleName=" + str + ", bizCode=" + str2 + riy.BRACKET_END_STR);
    }
}
