package com.alipay.mars.comm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.alipay.bifrost.BifrostEnvUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import tb.riy;

/* loaded from: classes3.dex */
public class Alarm extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f5321a;
    private static WakerLock b;
    private static Alarm c;
    private static TreeSet<Object[]> d = new TreeSet<>(new ComparatorAlarm());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum TSetData {
        ID,
        WAITTIME,
        PENDINGINTENT
    }

    public static /* synthetic */ Object ipc$super(Alarm alarm, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private native void onAlarm(long j);

    /* loaded from: classes3.dex */
    public static class ComparatorAlarm implements Comparator<Object[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private ComparatorAlarm() {
        }

        @Override // java.util.Comparator
        public int compare(Object[] objArr, Object[] objArr2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("295e3f", new Object[]{this, objArr, objArr2})).intValue() : (int) (((Long) objArr[TSetData.ID.ordinal()]).longValue() - ((Long) objArr2[TSetData.ID.ordinal()]).longValue());
        }
    }

    public static void resetAlarm(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fccf61f", new Object[]{context});
        } else if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
        } else {
            synchronized (d) {
                if (context == null) {
                    context = BifrostEnvUtils.getContext();
                }
                Iterator<Object[]> it = d.iterator();
                while (it.hasNext()) {
                    a(context, (PendingIntent) it.next()[TSetData.PENDINGINTENT.ordinal()]);
                }
                d.clear();
                if (c != null) {
                    context.unregisterReceiver(c);
                    c = null;
                }
            }
        }
    }

    public static boolean start(long j, int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c34a64", new Object[]{new Long(j), new Integer(i), context})).booleanValue();
        }
        try {
            if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (i < 0) {
                return false;
            }
            if (context == null) {
                context = BifrostEnvUtils.getContext();
            }
            if (context == null) {
                return false;
            }
            synchronized (d) {
                if (b == null) {
                    b = new WakerLock(context);
                    LogCatUtil.info("bifrost.Alarm", "start new wakerlock");
                }
                if (c == null) {
                    c = new Alarm();
                    Alarm alarm = c;
                    context.registerReceiver(alarm, new IntentFilter("ALARM_ACTION(" + String.valueOf(Process.myPid()) + riy.BRACKET_END_STR));
                }
                Iterator<Object[]> it = d.iterator();
                while (it.hasNext()) {
                    if (((Long) it.next()[TSetData.ID.ordinal()]).longValue() == j) {
                        return false;
                    }
                }
                if (i >= 0) {
                    elapsedRealtime += i;
                }
                PendingIntent a2 = a(j, elapsedRealtime, context);
                if (a2 == null) {
                    return false;
                }
                d.add(new Object[]{Long.valueOf(j), Long.valueOf(elapsedRealtime), a2});
                return true;
            }
        } catch (Throwable th) {
            LogCatUtil.error("bifrost.Alarm", "start error", th);
            return false;
        }
    }

    public static boolean stop(long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d646bd1", new Object[]{new Long(j), context})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error("bifrost.Alarm", "stop error", th);
        }
        if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            return false;
        }
        if (context == null) {
            context = BifrostEnvUtils.getContext();
        }
        if (context == null) {
            LogCatUtil.error("bifrost.Alarm", "context==null");
            return false;
        }
        synchronized (d) {
            if (b == null) {
                b = new WakerLock(context);
                LogCatUtil.info("bifrost.Alarm", "stop new wakerlock");
            }
            if (c == null) {
                c = new Alarm();
                context.registerReceiver(c, new IntentFilter());
                LogCatUtil.info("bifrost.Alarm", "stop new Alarm");
            }
            Iterator<Object[]> it = d.iterator();
            while (it.hasNext()) {
                Object[] next = it.next();
                if (((Long) next[TSetData.ID.ordinal()]).longValue() == j) {
                    a(context, (PendingIntent) next[TSetData.PENDINGINTENT.ordinal()]);
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public static final int getLastAlarmMiss() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("67b9513b", new Object[0])).intValue() : f5321a;
    }

    private static PendingIntent a(long j, long j2, Context context) {
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.Alarm", "setAlarmMgr error", th);
                return null;
            }
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            LogCatUtil.error("bifrost.Alarm", "am == null");
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("ALARM_ACTION(" + String.valueOf(Process.myPid()) + riy.BRACKET_END_STR);
        intent.putExtra("ID", j);
        intent.putExtra("PID", Process.myPid());
        PendingIntent b2 = a.b(context, (int) j, intent, a(268435456));
        if (Build.VERSION.SDK_INT < 19) {
            alarmManager.set(2, j2, b2);
        } else {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 31) {
                z = ((Boolean) Class.forName("android.app.AlarmManager").getMethod("canScheduleExactAlarms", new Class[0]).invoke(alarmManager, new Object[0])).booleanValue();
            }
            LogCatUtil.info("bifrost.Alarm", "canScheduleExactAlarms = " + z);
            if (z) {
                alarmManager.setExact(2, j2, b2);
            }
        }
        return b2;
    }

    private static boolean a(Context context, PendingIntent pendingIntent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eae56420", new Object[]{context, pendingIntent})).booleanValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.Alarm", "cancelAlarmMgr error", th);
                return false;
            }
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            LogCatUtil.error("bifrost.Alarm", "am == null");
            return false;
        } else if (pendingIntent == null) {
            LogCatUtil.error("bifrost.Alarm", "pendingIntent == null");
            return false;
        } else {
            alarmManager.cancel(pendingIntent);
            pendingIntent.cancel();
            return true;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (context == null || intent == null) {
        } else {
            try {
                Long valueOf = Long.valueOf(intent.getLongExtra("ID", 0L));
                Integer valueOf2 = Integer.valueOf(intent.getIntExtra("PID", 0));
                if (0 == valueOf.longValue() || valueOf2.intValue() == 0 || valueOf2.intValue() != Process.myPid()) {
                    return;
                }
                synchronized (d) {
                    Iterator<Object[]> it = d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        Object[] next = it.next();
                        if (((Long) next[TSetData.ID.ordinal()]).equals(valueOf)) {
                            a(next);
                            it.remove();
                            break;
                        }
                    }
                }
                if (b != null) {
                    b.lock(200L);
                }
                if (!z) {
                    return;
                }
                onAlarm(valueOf.longValue());
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.Alarm", "onReceive error", th);
            }
        }
    }

    private void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
            return;
        }
        try {
            f5321a = (int) (SystemClock.elapsedRealtime() - ((Long) objArr[TSetData.WAITTIME.ordinal()]).longValue());
        } catch (Throwable th) {
            LogCatUtil.warn("bifrost.Alarm", "[recordLastAlarmMiss] Exception: " + th.toString());
        }
    }

    private static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : Build.VERSION.SDK_INT >= 31 ? i | 67108864 : i;
    }
}
