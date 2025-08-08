package com.taobao.keepalive.periodic;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.a;
import tb.iao;
import tb.kge;
import tb.rty;

/* loaded from: classes7.dex */
public class AliveReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static PendingIntent f17650a;

    static {
        kge.a(-1861712638);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        rty.f33380a.d("AliveReceiver", "rescheduleAlarm", new Object[0]);
        try {
            if (Build.VERSION.SDK_INT < 31) {
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis() + 10800000;
            if (f17650a == null) {
                Intent intent = new Intent();
                intent.setPackage(context.getPackageName());
                intent.addFlags(32);
                intent.setAction("com.taobao.alive.action.schedule");
                f17650a = a.b(context, 0, intent, z ? 67108864 : 0);
            }
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (z && !alarmManager.canScheduleExactAlarms()) {
                alarmManager.set(0, currentTimeMillis, f17650a);
            } else if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, currentTimeMillis, f17650a);
            } else {
                alarmManager.setExact(0, currentTimeMillis, f17650a);
            }
        } catch (Throwable th) {
            rty.f33380a.b("AliveReceiver", "rescheduleAlarm err", th, new Object[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent == null ? null : intent.getAction();
        if (StringUtils.isEmpty(action)) {
            rty.f33380a.d("AliveReceiver", "empty action", new Object[0]);
            return;
        }
        rty.f33380a.d("AliveReceiver", iao.NEXT_TAG_RECEIVER, "action", action);
        if (!"com.taobao.alive.action.schedule".equals(action)) {
            return;
        }
        a(context);
    }
}
