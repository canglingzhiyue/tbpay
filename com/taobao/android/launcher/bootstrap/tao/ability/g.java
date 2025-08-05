package com.taobao.android.launcher.bootstrap.tao.ability;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.launcher.common.g;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.tao.log.TLog;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gtk;
import tb.gve;

/* loaded from: classes.dex */
public class g implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final gtk f13067a;
    private final Instrumentation b;
    private final AtomicBoolean c = new AtomicBoolean(true);
    private final AtomicBoolean d = new AtomicBoolean(false);

    public g(gtk gtkVar, Instrumentation instrumentation) {
        this.f13067a = gtkVar;
        this.b = instrumentation;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.d
    public void a(Activity activity, Bundle bundle, Runnable runnable) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("576ada58", new Object[]{this, activity, bundle, runnable});
            return;
        }
        Intent intent = activity.getIntent();
        boolean a2 = com.taobao.flowcustoms.afc.a.a(intent);
        if (a2 && com.taobao.linkmanager.afc.utils.e.a(intent.getData())) {
            AfcLifeCycleCenter.instance().callLinkActivityCreate(activity, bundle);
            intent.putExtra(b.EXTRA_LINK_COLD_START, true);
            com.taobao.linkmanager.afc.utils.e.a(activity, intent);
            z = true;
        } else {
            com.taobao.android.launcher.bootstrap.tao.i.a(activity, intent);
            if (com.taobao.linkmanager.afc.utils.e.a(intent.getData())) {
                a(activity, intent, false);
            }
        }
        if (a2 && (activity instanceof c)) {
            ((c) activity).a();
            String a3 = b.a(intent, true);
            if (!TextUtils.isEmpty(a3)) {
                intent.setData(Uri.parse(a3));
            }
        }
        runnable.run();
        if (!z) {
            return;
        }
        intent.removeExtra(b.EXTRA_LINK_COLD_START);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.d
    public Activity a(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2817fc3f", new Object[]{this, classLoader, str, intent});
        }
        if (!LauncherRuntime.n) {
            return this.b.newActivity(classLoader, str, intent);
        }
        TLog.loge(gve.MODULE, "LinkOptimized", "newActivity=" + str);
        boolean z = this.c.get();
        this.c.compareAndSet(true, false);
        boolean a2 = com.taobao.flowcustoms.afc.a.a(intent);
        if (a2 && !z) {
            intent.removeExtra("cold_startup_h5");
            TLog.loge(gve.MODULE, "LinkOptimized", "the state of H5HCColdStartup went wrong");
            AppMonitor.Counter.commit(gve.MODULE, "LinkOptimized", "className=" + str + ",data=" + intent.getData(), 1.0d);
        }
        if (a2 && z) {
            a(str, intent);
        }
        TLog.loge(gve.MODULE, "LinkOptimized", "current state: isH5HCColdStartup=" + a2 + ", firstLink=" + z);
        if (z) {
            a(str);
            return this.b.newActivity(classLoader, b(str, intent), intent);
        }
        b(str);
        return this.b.newActivity(classLoader, str, intent);
    }

    private String b(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d515d670", new Object[]{this, str, intent});
        }
        ComponentName component = intent.getComponent();
        return component != null ? component.getClassName() : str;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        android.taobao.safemode.k c = android.taobao.safemode.h.a().c();
        if (c == null || c.f1531a) {
            return;
        }
        TLog.loge(gve.MODULE, "LinkOptimized", "restoreForBackground, pageName=" + str);
        a();
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TLog.loge(gve.MODULE, "LinkOptimized", "restoreByStrategy, firstLink=false， pageName=" + str);
        LinkRule b = h.b();
        if (b != null && b.strategy != null && !TextUtils.isEmpty(b.strategy.ignoredPages) && b.strategy.ignoredPages.contains(str)) {
            TLog.loge(gve.MODULE, "LinkOptimized", "restoreByStrategy, firstLink=false， ignored pageName=" + str);
            return;
        }
        a();
    }

    private void a() {
        com.taobao.android.launcher.common.e g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.d.compareAndSet(false, true) || (g = this.f13067a.g()) == null) {
        } else {
            g.k();
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.d
    public void a(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13e9f77", new Object[]{this, activity, intent});
        } else if (!com.taobao.flowcustoms.afc.a.a(activity.getIntent())) {
            com.taobao.android.launcher.bootstrap.tao.i.a(activity, intent);
            this.b.callActivityOnNewIntent(activity, intent);
        } else {
            if (intent != null && !TextUtils.isEmpty(intent.getDataString())) {
                z = b(activity, intent);
            }
            if (z) {
                return;
            }
            this.b.callActivityOnNewIntent(activity, intent);
        }
    }

    private boolean b(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14c9bd3c", new Object[]{this, activity, intent})).booleanValue();
        }
        if (intent != null && com.taobao.linkmanager.afc.utils.e.a(intent.getData())) {
            if (b.a(intent.getExtras())) {
                if (!(activity instanceof c)) {
                    return false;
                }
                String b = b.b(intent);
                if (!TextUtils.isEmpty(b)) {
                    intent.setData(Uri.parse(b));
                    a(activity.getIntent(), intent);
                }
                return false;
            } else if (a(activity, intent, true)) {
                com.taobao.linkmanager.afc.utils.e.a(activity, intent);
                return true;
            }
        }
        return false;
    }

    private void a(Intent intent, Intent intent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e85e4e2", new Object[]{this, intent, intent2});
            return;
        }
        Uri data = intent == null ? Uri.EMPTY : intent.getData();
        Uri data2 = intent2 == null ? Uri.EMPTY : intent2.getData();
        if (data == null) {
            return;
        }
        if (com.taobao.linkmanager.afc.utils.e.a(data)) {
            String queryParameter = data.getQueryParameter("h5Url");
            if (!TextUtils.isEmpty(queryParameter)) {
                data = Uri.parse(queryParameter);
            }
        }
        if (data2 == null) {
            return;
        }
        if (TextUtils.equals(data.getHost(), data2.getHost()) && TextUtils.equals(data.getPath(), data2.getPath())) {
            return;
        }
        LinkRule b = h.b();
        String str = b == null ? null : b.name;
        String str2 = "moduleName=" + str + ", old=" + data.toString() + ", new=" + data2.toString();
        TLog.loge(gve.MODULE, "LinkConsistency", "processURLRedirection, moduleName is" + str + ", url not equal: " + str2);
        AppMonitor.Counter.commit(gve.MODULE, "LinkConsistency", str2, 1.0d);
    }

    private void a(String str, Intent intent) {
        final LinkRule a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
            return;
        }
        String a3 = b.a(intent);
        if (TextUtils.isEmpty(a3)) {
            return;
        }
        com.taobao.android.launcher.common.e g = this.f13067a.g();
        if (!(g instanceof com.taobao.android.launcher.common.g) || (a2 = h.a(a3)) == null || a2.tasks == null || a2.tasks.length == 0) {
            return;
        }
        ((com.taobao.android.launcher.common.g) g).a(str, new g.a<String>() { // from class: com.taobao.android.launcher.bootstrap.tao.ability.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.common.g.a
            public void a(com.taobao.android.job.core.j<String> jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("707ae49a", new Object[]{this, jVar});
                } else {
                    jVar.a(a2.tasks).a("InitFastEmptyTask");
                }
            }
        });
    }

    private boolean a(Activity activity, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56960241", new Object[]{this, activity, intent, new Boolean(z)})).booleanValue();
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        String className = component.getClassName();
        if (!"com.taobao.tao.welcome.Welcome".equals(className)) {
            return false;
        }
        if (z && TextUtils.equals(activity.getClass().getName(), className)) {
            return false;
        }
        intent.putExtra(b.EXTRA_LINK_HOT_START, true);
        return true;
    }
}
