package com.alibaba.android.split.core.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class StateUpdatedReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f2433a;

    static {
        kge.a(503030010);
    }

    public StateUpdatedReceiver(a aVar) {
        this.f2433a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            Log.e("StateUpdatedReceiver", "triggered_from_app_after_verification success");
        }
        this.f2433a.a(context, intent);
    }
}
