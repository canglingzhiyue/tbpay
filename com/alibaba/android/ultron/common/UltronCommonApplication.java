package com.alibaba.android.ultron.common;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bio;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronCommonApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1019286809);
    }

    public static /* synthetic */ Object ipc$super(UltronCommonApplication ultronCommonApplication, String str, Object... objArr) {
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
        bio.a(getApplicationContext(), true);
    }
}
