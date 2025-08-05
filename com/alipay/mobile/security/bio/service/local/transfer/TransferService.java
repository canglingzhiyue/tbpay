package com.alipay.mobile.security.bio.service.local.transfer;

import com.alipay.mobile.security.bio.service.local.LocalService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class TransferService<Source, Target, Result> extends LocalService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void transfer(Source source, Target target, boolean z, ProgressCallback<Source, Result> progressCallback);
}
