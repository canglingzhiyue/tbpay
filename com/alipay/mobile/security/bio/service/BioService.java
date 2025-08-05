package com.alipay.mobile.security.bio.service;

import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BioService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BioServiceManager e;

    public void onCreate(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final void create(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5422488c", new Object[]{this, bioServiceManager});
            return;
        }
        this.e = bioServiceManager;
        BioLog.i(getClass().getName() + ".onCreate() start.");
        onCreate(bioServiceManager);
        BioLog.i(getClass().getName() + ".onCreate() end.");
    }

    public final void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        BioLog.i(getClass().getName() + ".onDestroy() start.");
        onDestroy();
        this.e = null;
        BioLog.i(getClass().getName() + ".onDestroy() end.");
    }
}
