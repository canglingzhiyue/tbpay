package com.taobao.android.launcher.bootstrap.tao.ability;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.gtk;

/* loaded from: classes5.dex */
public class k extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f13076a;

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == 672660543) {
            return super.a((ClassLoader) objArr[0], (String) objArr[1], (Intent) objArr[2]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public k(gtk gtkVar, Instrumentation instrumentation, Context context) {
        super(gtkVar, instrumentation);
        this.f13076a = context;
    }

    private ComponentName a() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("8654ec07", new Object[]{this});
        }
        String b = com.taobao.android.autosize.api.a.b();
        if (TextUtils.isEmpty(b)) {
            com.taobao.android.launcher.bootstrap.tao.h.b("EasyGoLifeCycleManagerImpl", " getTargetComponentName targetUrl is null");
            return null;
        }
        try {
            intent = Nav.from(this.f13076a).intentForUri(Uri.parse(b));
        } catch (Throwable th) {
            com.taobao.android.launcher.bootstrap.tao.h.b("EasyGoLifeCycleManagerImpl", " getTargetComponentName error " + th.getMessage());
            intent = null;
        }
        if (intent == null) {
            com.taobao.android.launcher.bootstrap.tao.h.b("EasyGoLifeCycleManagerImpl", " getTargetComponentName newIntent is null");
            return null;
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            com.taobao.android.launcher.bootstrap.tao.h.b("EasyGoLifeCycleManagerImpl", " getTargetComponentName targetComponent is null");
            return null;
        }
        String packageName = component.getPackageName();
        String className = component.getClassName();
        if (!TextUtils.isEmpty(packageName) && !TextUtils.isEmpty(className)) {
            return component;
        }
        com.taobao.android.launcher.bootstrap.tao.h.b("EasyGoLifeCycleManagerImpl", " getTargetComponentName packageName or className is null packageName: " + packageName + " className: " + className);
        return null;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.g, com.taobao.android.launcher.bootstrap.tao.ability.d
    public Activity a(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2817fc3f", new Object[]{this, classLoader, str, intent});
        }
        if (!TextUtils.equals(com.taobao.android.autosize.api.a.c(), str)) {
            return super.a(classLoader, str, intent);
        }
        if (intent == null) {
            com.taobao.android.launcher.bootstrap.tao.h.b("EasyGoLifeCycleManagerImpl", " newActivity intent is null");
            return super.a(classLoader, str, intent);
        }
        ComponentName a2 = a();
        if (a2 != null) {
            intent.setClassName(a2.getPackageName(), a2.getClassName());
            intent.putExtra(com.taobao.android.autosize.api.a.d(), "true");
            str = a2.getClassName();
            com.taobao.android.launcher.bootstrap.tao.h.b("EasyGoLifeCycleManagerImpl", " override newActivity  targetActivity: " + a2.getClassName());
        }
        return super.a(classLoader, str, intent);
    }
}
