package com.alibaba.security.ccrc.service.build;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;

/* renamed from: com.alibaba.security.ccrc.service.build.yb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1266yb implements com.taobao.android.mnncv.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1251tb f3338a;
    public final /* synthetic */ Bb b;

    public C1266yb(Bb bb, InterfaceC1251tb interfaceC1251tb) {
        this.b = bb;
        this.f3338a = interfaceC1251tb;
    }

    @Override // com.taobao.android.mnncv.c
    public void onCompletion(String str, MRTRuntimeException mRTRuntimeException) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de5f2e6", new Object[]{this, str, mRTRuntimeException});
            return;
        }
        InterfaceC1251tb interfaceC1251tb = this.f3338a;
        if (interfaceC1251tb == null) {
            return;
        }
        if (mRTRuntimeException != null) {
            z = false;
        }
        interfaceC1251tb.a(z, Log.getStackTraceString(mRTRuntimeException));
    }
}
