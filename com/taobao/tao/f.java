package com.taobao.tao;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.a;

/* loaded from: classes.dex */
public class f extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f(Application application, String str, String str2) {
        super(application, str, str2);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        android.taobao.safemode.h a2 = android.taobao.safemode.h.a();
        a2.a(TaobaoApplication.sAppVersion);
        a2.b(this.f20679a);
        a2.a(this.f20679a);
    }

    @Override // com.taobao.tao.d, com.taobao.tao.l
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c();
        a();
        a.a(this.f20679a);
        d();
    }
}
