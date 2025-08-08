package com.taobao.calendar.sdk.alarm;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.NotificationCompat;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.calendar.sdk.TBCalendar;
import com.taobao.calendar.sdk.TBCalendarBase;
import com.taobao.calendar.sdk.common.DateUtils;
import com.taobao.calendar.sdk.db.ScheduleDO;
import com.taobao.calendar.sdk.db.TableSchedule;
import com.taobao.calendar.sdk.synchronize.SynService;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class CalendarAlarmReceiver extends BroadcastReceiver {
    private static int notifyId;

    /* loaded from: classes6.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final HandlerThread f16870a;
        private static final Handler b;

        static {
            kge.a(-1803374687);
            HandlerThread handlerThread = new HandlerThread("AsyncHandler");
            f16870a = handlerThread;
            handlerThread.start();
            b = new Handler(f16870a.getLooper());
        }

        public static void a(Runnable runnable) {
            b.post(runnable);
        }
    }

    static {
        kge.a(1489196913);
        notifyId = 0;
    }

    private static Notification createNotify(Context context, String str, String str2, long j, String str3, String str4) {
        Intent intent = new Intent("com.taobao.headline.calendar.NOTIFY");
        if (context == null) {
            return null;
        }
        intent.putExtra("myBrowserUrl", str2);
        intent.putExtra("sourceId", str3);
        intent.putExtra("eventId", str4);
        intent.putExtra("date", j);
        Intent intent2 = new Intent(NotificationLogSupport.INTENT_NOTIFY);
        intent2.putExtra("tao_calendar_realIntent", intent);
        return new NotificationCompat.Builder(context).setSmallIcon(TBCalendar.smallIcon).setContentTitle("淘宝巧刻历提醒您").setContentText(str).setWhen(0L).setAutoCancel(true).setDefaults(7).setContentIntent(com.android.taobao.aop.a.b(context, notifyId, intent2, 134217728)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void displayAlarm(Context context, String str, List<ScheduleDO> list) {
        CalendarAlarm.reset(context);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (list.size() == 0) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        Long valueOf = Long.valueOf(list.get(0).sourceId);
        if (list.size() == 1) {
            sb.append(valueOf);
            sb2.append(list.get(0).eventId);
            ScheduleDO scheduleDO = list.get(0);
            notificationManager.notify(scheduleDO.eventId, CalendarAlarm.NOTIFY_ID, createNotify(context, riy.ARRAY_START_STR + DateUtils.formatDate(scheduleDO.startTime, "HH:mm") + "] " + scheduleDO.getLable(), scheduleDO.link, scheduleDO.startTime, sb.toString(), str));
        } else {
            String str2 = "您有" + list.size() + "个消息提醒，请点击查看!";
            long j = list.get(0).startTime;
            for (ScheduleDO scheduleDO2 : list) {
                sb.append(scheduleDO2.sourceId);
                sb.append("_");
                sb2.append(scheduleDO2.eventId);
                sb2.append("_");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb2.deleteCharAt(sb2.length() - 1);
            notificationManager.notify(str, CalendarAlarm.NOTIFY_ID, createNotify(context, str2, "http://m.taobao.com/go/tbcalendar?date=" + j, j, sb.toString(), sb2.toString()));
        }
        TBS.Adv.ctrlClicked("Page_Calendar", CT.Button, "show_notify", "sourceId=" + sb.toString(), "eventId=" + sb2.toString());
        updateNotifyId();
    }

    private static void updateNotifyId() {
        int i = notifyId + 1;
        notifyId = i;
        if (i > 10000) {
            notifyId = 0;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        TBCalendarBase.init(context);
        if (StringUtils.isEmpty(action)) {
            return;
        }
        if (action.equals("android.intent.action.BOOT_COMPLETED") || action.equals("android.intent.action.TIMEZONE_CHANGED") || action.equals("android.intent.action.TIME_SET") || action.equals(CalendarAlarm.INTENT_RESET)) {
            a.a(new Runnable() { // from class: com.taobao.calendar.sdk.alarm.CalendarAlarmReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent2 = new Intent(context, CalendarAlarmService.class);
                    intent2.setAction(CalendarAlarm.INTENT_RESET);
                    try {
                        context.startService(intent2);
                    } catch (Exception unused) {
                    }
                }
            });
        } else if (action.equals(CalendarAlarm.INTENT_PLAY)) {
            a.a(new Runnable() { // from class: com.taobao.calendar.sdk.alarm.CalendarAlarmReceiver.2
                @Override // java.lang.Runnable
                public void run() {
                    final String stringExtra = intent.getStringExtra("id");
                    TableSchedule.getSchedule(stringExtra, new TableSchedule.QueryHandler() { // from class: com.taobao.calendar.sdk.alarm.CalendarAlarmReceiver.2.1
                        @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
                        public void callback(int i, List<ScheduleDO> list) {
                            CalendarAlarmReceiver.displayAlarm(context, stringExtra, list);
                        }
                    });
                }
            });
        } else if (action.equals(CalendarAlarm.INTENT_KILL) || action.equals(Integer.valueOf(CalendarAlarm.TIMEOUT))) {
            if (action.equals(CalendarAlarm.INTENT_KILL)) {
                ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).cancel(intent.getStringExtra("id"), CalendarAlarm.NOTIFY_ID);
            }
            a.a(new Runnable() { // from class: com.taobao.calendar.sdk.alarm.CalendarAlarmReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent2 = new Intent(context, CalendarAlarmService.class);
                    intent2.setAction(action);
                    try {
                        context.startService(intent2);
                    } catch (Exception unused) {
                    }
                }
            });
        } else if (!action.equals(CalendarAlarm.INTENT_SYN)) {
        } else {
            a.a(new Runnable() { // from class: com.taobao.calendar.sdk.alarm.CalendarAlarmReceiver.4
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent2 = new Intent(context, SynService.class);
                    intent2.putExtra("userId", intent.getStringExtra("userId"));
                    intent2.putExtra("ttid", intent.getStringExtra("ttid"));
                    intent2.setAction(CalendarAlarm.INTENT_SYN);
                    try {
                        context.startService(intent2);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
