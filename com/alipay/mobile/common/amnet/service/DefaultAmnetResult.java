package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.amnet.api.AmnetResult;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DefaultAmnetResult implements AmnetResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.amnet.api.AmnetResult
    public void notifyResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z)});
        }
    }
}
