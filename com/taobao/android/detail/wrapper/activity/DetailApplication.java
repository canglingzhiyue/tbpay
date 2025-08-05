package com.taobao.android.detail.wrapper.activity;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.fac;
import tb.kge;

/* loaded from: classes5.dex */
public class DetailApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1514395942);
    }

    public static /* synthetic */ Object ipc$super(DetailApplication detailApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        emu.a("com.taobao.android.detail.wrapper.activity.DetailApplication");
        if (emu.c()) {
            return;
        }
        fac.a();
    }
}
