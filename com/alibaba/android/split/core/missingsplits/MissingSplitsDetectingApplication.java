package com.alibaba.android.split.core.missingsplits;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class MissingSplitsDetectingApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean onCreateCalled = false;

    static {
        kge.a(-1636892954);
    }

    public static /* synthetic */ Object ipc$super(MissingSplitsDetectingApplication missingSplitsDetectingApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void onCreateCustom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0791593", new Object[]{this});
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (this.onCreateCalled) {
            throw new IllegalStateException("The onCreate method must be invoked at most once.");
        } else {
            this.onCreateCalled = true;
            if (c.a(this).a()) {
                return;
            }
            super.onCreate();
            onCreateCustom();
        }
    }
}
