package com.taobao.android.launcher.bootstrap.tao.ability;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Instrumentation f13066a;

    public e(Instrumentation instrumentation) {
        this.f13066a = instrumentation;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.d
    public void a(Activity activity, Bundle bundle, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("576ada58", new Object[]{this, activity, bundle, runnable});
        } else {
            this.f13066a.callActivityOnCreate(activity, bundle);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.d
    public Activity a(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2817fc3f", new Object[]{this, classLoader, str, intent}) : this.f13066a.newActivity(classLoader, str, intent);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.d
    public void a(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13e9f77", new Object[]{this, activity, intent});
        } else {
            this.f13066a.callActivityOnNewIntent(activity, intent);
        }
    }
}
