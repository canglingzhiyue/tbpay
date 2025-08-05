package com.taobao.calendar.sdk.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.calendar.sdk.common.DateUtils;
import com.taobao.calendar.sdk.db.ScheduleDO;
import com.taobao.calendar.sdk.db.TableSchedule;
import com.taobao.tao.TaobaoApplication;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarAlarmService extends Service {
    public static int PENDING_INTENT_ID;
    private boolean mPlaying;
    private boolean mReseting;

    static {
        kge.a(-574119693);
        PENDING_INTENT_ID = 1;
    }

    public CalendarAlarmService() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
        this.mPlaying = false;
        this.mReseting = false;
    }

    private void resetAlarm() {
        this.mReseting = true;
        TableSchedule.getRecentRemindSchedule(new TableSchedule.QueryHandler() { // from class: com.taobao.calendar.sdk.alarm.CalendarAlarmService.1
            @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
            public void callback(int i, List<ScheduleDO> list) {
                if (list.size() == 0) {
                    return;
                }
                Collections.sort(list, new a());
                CalendarAlarmService.this.setAlarmToSystem(list);
                if (!CalendarAlarmService.this.mPlaying) {
                    CalendarAlarmService.this.stopSelf();
                }
                CalendarAlarmService.this.mReseting = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmToSystem(List<ScheduleDO> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            int i = 0;
            while (i < list.size()) {
                ScheduleDO scheduleDO = list.get(i);
                if (scheduleDO != null) {
                    long j = scheduleDO.alartTime;
                    int hashCode = String.valueOf(scheduleDO.alartTime).hashCode();
                    StringBuilder sb = new StringBuilder();
                    sb.append(scheduleDO.eventId);
                    sb.append(",");
                    for (int i2 = i + 1; i2 < list.size(); i2++) {
                        ScheduleDO scheduleDO2 = list.get(i2);
                        if (scheduleDO2 != null) {
                            if (scheduleDO2.alartTime != j) {
                                break;
                            }
                            sb.append(scheduleDO2.eventId);
                            sb.append(",");
                            i = i2;
                        }
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    String sb2 = sb.toString();
                    Intent intent = new Intent(CalendarAlarm.INTENT_PLAY);
                    intent.putExtra("id", sb2);
                    PendingIntent b = com.android.taobao.aop.a.b(this, hashCode, intent, 134217728);
                    alarmManager.cancel(b);
                    Log.e("ALARM", "create" + DateUtils.formatDate(scheduleDO.alartTime));
                    if (Build.VERSION.SDK_INT >= 19) {
                        alarmManager.setExact(0, scheduleDO.alartTime, b);
                    } else {
                        alarmManager.set(0, scheduleDO.alartTime, b);
                    }
                }
                i++;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        if (intent != null && (action = intent.getAction()) != null && action.equals(CalendarAlarm.INTENT_RESET)) {
            resetAlarm();
        }
        return 1;
    }
}
