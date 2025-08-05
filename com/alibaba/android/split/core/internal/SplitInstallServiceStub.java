package com.alibaba.android.split.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.alibaba.android.split.api.ISplitInstallService;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class SplitInstallServiceStub extends Stub implements ISplitInstallService {
    static {
        kge.a(1117689482);
        kge.a(-2137992842);
    }

    protected SplitInstallServiceStub(String str) {
        super(str);
    }

    public static ISplitInstallService asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alibaba.android.split.core.splitinstall.protocol.ISplitInstallService");
        if (queryLocalInterface instanceof ISplitInstallService) {
            return (ISplitInstallService) queryLocalInterface;
        }
        return new SplitInstallServiceProxy(iBinder);
    }
}
