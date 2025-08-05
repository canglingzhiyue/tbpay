package com.alibaba.android.split.core.splitcompat;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class SplitCompatApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1930443073);
    }

    public static /* synthetic */ Object ipc$super(SplitCompatApplication splitCompatApplication, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.a(this);
    }
}
