package android.support.v4.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class AlarmManagerCompat {
    private AlarmManagerCompat() {
    }

    public static void setAlarmClock(AlarmManager alarmManager, long j, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        if (Build.VERSION.SDK_INT >= 21) {
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent2);
        } else {
            setExact(alarmManager, 0, j, pendingIntent2);
        }
    }

    public static void setAndAllowWhileIdle(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    public static void setExact(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    public static void setExactAndAllowWhileIdle(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Method declaredMethod = AlarmManager.class.getDeclaredMethod("canScheduleExactAlarms", new Class[0]);
                declaredMethod.setAccessible(true);
                z = ((Boolean) declaredMethod.invoke(alarmManager, new Object[0])).booleanValue();
            } catch (Throwable th) {
                Log.wtf("exception", th);
            }
        }
        if (z) {
            if (Build.VERSION.SDK_INT < 23) {
                setExact(alarmManager, i, j, pendingIntent);
                return;
            }
            try {
                alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
            } catch (Throwable unused) {
            }
        }
    }
}
