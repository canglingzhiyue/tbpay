package com.alibaba.security.ccrc.service.build;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;

/* loaded from: classes3.dex */
public class zb implements MNNCVExecutor.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3340a;
    public final /* synthetic */ InterfaceC1254ub b;
    public final /* synthetic */ Bb c;

    public zb(Bb bb, String str, InterfaceC1254ub interfaceC1254ub) {
        this.c = bb;
        this.f3340a = str;
        this.b = interfaceC1254ub;
    }

    @Override // com.taobao.android.mnncv.MNNCVExecutor.a
    public void onResult(MRTRuntimeException mRTRuntimeException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
            return;
        }
        boolean z = mRTRuntimeException == null;
        String stackTraceString = z ? null : Log.getStackTraceString(mRTRuntimeException);
        Bb bb = this.c;
        Bb.a(bb, this.f3340a, bb.d.getCcrcCode(), this.c.c, stackTraceString, z, Bb.$ipChange);
        if (!z) {
            this.b.a(false, stackTraceString);
            return;
        }
        this.c.j = true;
        this.b.a(true, null);
        if (StringUtils.isEmpty(this.c.d())) {
            return;
        }
        Bb bb2 = this.c;
        bb2.d.a(bb2.d(), false);
    }
}
