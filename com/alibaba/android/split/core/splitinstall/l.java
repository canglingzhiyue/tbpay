package com.alibaba.android.split.core.splitinstall;

import android.os.IBinder;
import android.os.IInterface;
import com.alibaba.android.split.core.internal.BinderCreator;
import com.alibaba.android.split.core.internal.SplitInstallServiceStub;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class l implements BinderCreator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final BinderCreator f2475a;

    @Override // com.alibaba.android.split.core.internal.BinderCreator
    public /* synthetic */ Object createBinder(IBinder iBinder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("81bd8c7e", new Object[]{this, iBinder}) : a(iBinder);
    }

    static {
        kge.a(20971196);
        kge.a(-878084470);
        f2475a = new l();
    }

    public final IInterface a(IBinder iBinder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IInterface) ipChange.ipc$dispatch("ea153445", new Object[]{this, iBinder}) : SplitInstallServiceStub.asInterface(iBinder);
    }
}
