package com.alipay.mobile.security.bio.service;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class DeviceMaintenanceService extends BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void registerQREvent(Context context, View view);
}
