package com.alipay.mobile.security.bio.service;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BioExtService extends BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract boolean isPreparing();

    public abstract void loadingResource();
}
