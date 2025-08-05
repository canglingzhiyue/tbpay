package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.AlarmObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.a;
import com.taobao.adaemon.TriggerInstrumentation;
import com.taobao.atools.StaticHook;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import tb.syk;

/* loaded from: classes9.dex */
public class rud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public static rud f33385a;
    public boolean b;

    static {
        kge.a(277939618);
    }

    public void a() {
        Method method;
        if (TriggerInstrumentation.triggered.get()) {
            rty.f33380a.d("ProcessAdjuster", "schedule triggered", new Object[0]);
            return;
        }
        Iterator it = ((ArrayList) rtx.a(kaq.a())).iterator();
        while (it.hasNext()) {
            if (((ActivityManager.RunningAppProcessInfo) it.next()).processName.equals(kaq.a().getPackageName())) {
                rty.f33380a.d("ProcessAdjuster", "schedule exit by running process", new Object[0]);
                return;
            }
        }
        if (a.a().a(kaq.a())) {
            rty.f33380a.d("ProcessAdjuster", "schedule exit by proc machine", new Object[0]);
            return;
        }
        Context a2 = kaq.a();
        rty.f33380a.d("ProcessAdjuster", "adjustAdj start", new Object[0]);
        try {
            Method declaredMethod = Application.class.getSuperclass().getDeclaredMethod("getBaseContext", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(a2, new Object[0]);
            Method b = StaticHook.b(Class.forName("android.app.ContextImpl"), "getUserId", new Class[0]);
            b.setAccessible(true);
            int intValue = ((Integer) b.invoke(invoke, new Object[0])).intValue();
            Method declaredMethod2 = Class.forName("android.app.ActivityManager").getDeclaredMethod("getService", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(null, new Object[0]);
            try {
                method = StaticHook.a(invoke2.getClass(), "startInstrumentation", ComponentName.class, String.class, Integer.TYPE, Bundle.class, Class.forName("android.app.IInstrumentationWatcher"), Class.forName("android.app.IUiAutomationConnection"), Integer.TYPE, String.class);
            } catch (Throwable unused) {
                method = null;
            }
            boolean z = method != null;
            rty.f33380a.d("ProcessAdjuster", "adjustAdj ready", "reflectSuccess", Boolean.valueOf(z));
            if (z) {
                AlarmObject alarmObject = new AlarmObject();
                alarmObject.module = "keepalive";
                alarmObject.modulePoint = "hide_api";
                alarmObject.arg = "";
                alarmObject.isSuccess = true;
                AppMonitor.getInstance().commitAlarm(alarmObject);
                method.setAccessible(true);
                method.invoke(invoke2, new ComponentName(a2.getPackageName(), "com.taobao.adaemon.TriggerInstrumentation"), null, 0, null, null, null, Integer.valueOf(intValue), null);
                return;
            }
            AlarmObject alarmObject2 = new AlarmObject();
            alarmObject2.module = "keepalive";
            alarmObject2.modulePoint = "hide_api";
            alarmObject2.arg = "";
            alarmObject2.errorCode = null;
            alarmObject2.errorMsg = null;
            alarmObject2.isSuccess = false;
            AppMonitor.getInstance().commitAlarm(alarmObject2);
        } catch (Throwable th) {
            this.b = true;
            rty.f33380a.b("ProcessAdjuster", "adjustAdj err", th, new Object[0]);
            rty.f33380a.b("ProcessAdjuster", "adjustAdj err Cause", th.getCause(), new Object[0]);
        }
    }

    public static /* synthetic */ void lambda$J1uKM2yvlCZzizxkhy_9eDNIcrI(rud rudVar) {
        rudVar.a();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        rty.f33380a.d("ProcessAdjuster", "schedule", new Object[0]);
        if (this.b) {
            return;
        }
        rtz.b().schedule(new Runnable() { // from class: tb.-$$Lambda$rud$J1uKM2yvlCZzizxkhy_9eDNIcrI
            @Override // java.lang.Runnable
            public final void run() {
                rud.lambda$J1uKM2yvlCZzizxkhy_9eDNIcrI(rud.this);
            }
        }, syk.a.f33954a.b(kaq.a()) ? 30 : 60, TimeUnit.SECONDS);
    }
}
