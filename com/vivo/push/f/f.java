package com.vivo.push.f;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24193a;
    final /* synthetic */ Map b;
    final /* synthetic */ e c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(e eVar, Context context, Map map) {
        this.c = eVar;
        this.f24193a = context;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String packageName = this.f24193a.getPackageName();
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f24193a.getSystemService("activity")).getRunningTasks(100);
            if (runningTasks != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    ComponentName componentName = runningTaskInfo.topActivity;
                    if (componentName.getPackageName().equals(packageName)) {
                        com.vivo.push.util.u.d("NotifyOpenClientTask", "topClassName=" + componentName.getClassName());
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        intent.setFlags(335544320);
                        e.b(intent, this.b);
                        this.f24193a.startActivity(intent);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            com.vivo.push.util.u.a("NotifyOpenClientTask", "start recentIntent is error", e);
        }
        Intent launchIntentForPackage = this.f24193a.getPackageManager().getLaunchIntentForPackage(this.f24193a.getPackageName());
        if (launchIntentForPackage == null) {
            com.vivo.push.util.u.a("NotifyOpenClientTask", "LaunchIntent is null");
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        e.b(launchIntentForPackage, this.b);
        this.f24193a.startActivity(launchIntentForPackage);
    }
}
