package com.alibaba.android.split.core.missingsplits;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import tb.bgu;
import tb.kge;

/* loaded from: classes2.dex */
public final class d implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bgu f2437a;
    private Context b;
    private Runtime c;
    private a d;
    private AtomicReference e;

    public d(Context context, Runtime runtime, a aVar, AtomicReference atomicReference) {
        this.b = context;
        this.c = runtime;
        this.d = aVar;
        this.e = atomicReference;
    }

    @Override // com.alibaba.android.split.core.missingsplits.b
    public final boolean a() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if (!b()) {
            if (this.d.a()) {
                this.d.c();
                this.c.exit(0);
            }
            return false;
        }
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ActivityManager.AppTask appTask = (ActivityManager.AppTask) it.next();
            if (appTask.getTaskInfo() != null && appTask.getTaskInfo().baseIntent != null && appTask.getTaskInfo().baseIntent.getComponent() != null && MissingSplitsActivity.class.getName().equals(appTask.getTaskInfo().baseIntent.getComponent().getClassName())) {
                z = true;
                break;
            }
        }
        if (!z) {
            Iterator it2 = e().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) it2.next()).getTaskInfo();
                if (taskInfo != null && taskInfo.baseIntent != null && taskInfo.baseIntent.getComponent() != null && a(taskInfo.baseIntent.getComponent())) {
                    z2 = true;
                    break;
                }
            }
            this.d.b();
            for (ActivityManager.AppTask appTask2 : e()) {
                appTask2.finishAndRemoveTask();
            }
            if (z2) {
                this.b.getPackageManager().setComponentEnabledSetting(new ComponentName(this.b, MissingSplitsActivity.class), 1, 1);
                this.b.startActivity(new Intent(this.b, MissingSplitsActivity.class).addFlags(884998144));
            }
            this.c.exit(0);
        }
        return true;
    }

    public final boolean b() {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        synchronized (this.e) {
            if (((Boolean) this.e.get()) == null) {
                AtomicReference atomicReference = this.e;
                if (Build.VERSION.SDK_INT >= 21 && c()) {
                    Set d = d();
                    if (d.isEmpty() || (d.size() == 1 && d.contains(""))) {
                        z = true;
                    }
                }
                atomicReference.set(Boolean.valueOf(z));
            }
            booleanValue = ((Boolean) this.e.get()).booleanValue();
        }
        return booleanValue;
    }

    private final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Boolean.TRUE.equals(applicationInfo.metaData.get("com.android.vending.splits.required"))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            f2437a.c("App '%s' is not found in the PackageManager", this.b.getPackageName());
            return false;
        }
    }

    private final Set d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("916979a", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT < 21) {
            return Collections.emptySet();
        }
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            if (packageInfo.splitNames != null) {
                Collections.addAll(hashSet, packageInfo.splitNames);
            }
            return hashSet;
        } catch (PackageManager.NameNotFoundException unused) {
            f2437a.c("App '%s' is not found in PackageManager", this.b.getPackageName());
            return Collections.emptySet();
        }
    }

    private final boolean a(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26bfdd0b", new Object[]{this, componentName})).booleanValue();
        }
        String className = componentName.getClassName();
        try {
            Class<?> cls = Class.forName(className);
            while (cls != null) {
                if (cls.equals(Activity.class)) {
                    return true;
                }
                Class<? super Object> superclass = cls.getSuperclass();
                cls = superclass != cls ? superclass : null;
            }
            return false;
        } catch (ClassNotFoundException unused) {
            f2437a.c("ClassNotFoundException when scanning class hierarchy of '%s'", className);
            return this.b.getPackageManager().getActivityInfo(componentName, 0) != null;
        }
    }

    private final List e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.b.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }

    static {
        kge.a(1528521304);
        kge.a(445798424);
        f2437a = (bgu) com.alibaba.android.split.a.b(bgu.class, "MissingSplitsManagerImpl");
    }
}
