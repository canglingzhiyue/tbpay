package com.alipay.mobile.security.bio.service;

import com.alipay.biometrics.common.proguard.INotProguard;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BioUploadServiceCore<Request> extends BioService implements INotProguard {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract BioUploadResult upload(Request request, boolean z);
}
