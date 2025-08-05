package com.taobao.tao.welcome;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes8.dex */
public class i implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Intent f21201a;
    private final WeakReference<Activity> b;

    static {
        kge.a(840205033);
        kge.a(-1390502639);
    }

    public i(Activity activity, Intent intent) {
        this.b = new WeakReference<>(activity);
        this.f21201a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Activity activity = this.b.get();
        if (activity == null) {
            return;
        }
        com.taobao.linkmanager.afc.utils.e.a(activity, this.f21201a);
    }
}
