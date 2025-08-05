package com.alipay.mobile.security.bio.service.local;

import android.content.Context;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class LocalService extends BioService implements INotProguard {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f5818a;

    public static /* synthetic */ Object ipc$super(LocalService localService, String str, Object... objArr) {
        if (str.hashCode() == 548948747) {
            super.onCreate((BioServiceManager) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.security.bio.service.BioService
    public void onCreate(BioServiceManager bioServiceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
            return;
        }
        super.onCreate(bioServiceManager);
        if (bioServiceManager == null) {
            return;
        }
        this.f5818a = bioServiceManager.getBioApplicationContext();
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f5818a = context;
        }
    }
}
