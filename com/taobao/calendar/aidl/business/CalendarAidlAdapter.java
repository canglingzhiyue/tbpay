package com.taobao.calendar.aidl.business;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import com.android.taobao.aop.a;
import com.taobao.android.service.Services;
import com.taobao.calendar.aidl.business.alarm.CalendarAlarm;
import com.taobao.calendar.aidl.business.db.TableSchedule;
import com.taobao.calendar.aidl.jsbridge.calendarJsApi;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import com.taobao.calendar.aidl.service.ICalendarService;
import com.taobao.tao.Globals;
import java.util.List;

/* loaded from: classes6.dex */
public class CalendarAidlAdapter {
    private static ICalendarService calendarService;
    private static Context context;
    private static CalendarAidlAdapter instance = new CalendarAidlAdapter();
    private static String TAG = "TBCalendar";

    private CalendarAidlAdapter() {
    }

    public static synchronized CalendarAidlAdapter getInstance() {
        CalendarAidlAdapter calendarAidlAdapter;
        synchronized (CalendarAidlAdapter.class) {
            if (instance == null) {
                instance = new CalendarAidlAdapter();
            }
            calendarAidlAdapter = instance;
        }
        return calendarAidlAdapter;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.calendar.aidl.business.CalendarAidlAdapter$2] */
    private void init() {
        if (calendarService != null) {
            return;
        }
        new AsyncTask<Object, Object, Boolean>() { // from class: com.taobao.calendar.aidl.business.CalendarAidlAdapter.2
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.AsyncTask
            /* renamed from: doInBackground */
            public Boolean mo1041doInBackground(Object... objArr) {
                if (CalendarAidlAdapter.calendarService == null) {
                    ICalendarService unused = CalendarAidlAdapter.calendarService = (ICalendarService) Services.get(Globals.getApplication(), ICalendarService.class);
                }
                return true;
            }
        }.execute(new Object());
    }

    public static void initCalendarJS() {
        try {
            q.a("TBURLCacheAlias", (Class<? extends e>) calendarJsApi.class, true);
            q.a("TBURLCache", "setRemindFinish", "TBURLCacheAlias", "setRemindFinish");
            q.a("TBURLCache", "addCalendarPlan", "TBURLCacheAlias", "addCalendarPlan");
            q.a("TBURLCache", "cancelCalendarPlan", "TBURLCacheAlias", "cancelCalendarPlan");
            q.a("TBURLCache", "checkCalendarPlanIsExist", "TBURLCacheAlias", "checkCalendarPlanIsExist");
            q.a("TBURLCache", "getCalendarPlansBySourceId", "TBURLCacheAlias", "getReminds");
            q.a("TBURLCache", "addCalendarPlanByBatch", "TBURLCacheAlias", "addCalendarPlanByBatch");
            q.a("TBURLCache", "cancelCalendarPlanByBatch", "TBURLCacheAlias", "cancelCalendarPlanByBatch");
            q.a("TBURLCache", "checkCalendarPlanIsExistByBatch", "TBURLCacheAlias", "checkCalendarPlanIsExistByBatch");
            q.a("TBURLCache", "queryRemindList", "TBURLCacheAlias", "queryRemindList");
            q.a("TBURLCache", "queryRemindCount", "TBURLCacheAlias", "queryRemindCount");
        } catch (Exception e) {
            e.printStackTrace();
        }
        setAlarmToSystem(TableSchedule.getRecentRemindSchedule());
    }

    private static void setAlarmToSystem(List<ScheduleDTO> list) {
        AlarmManager alarmManager;
        if (list == null || list.size() <= 0 || Globals.getApplication() == null || (alarmManager = (AlarmManager) Globals.getApplication().getSystemService("alarm")) == null) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            ScheduleDTO scheduleDTO = list.get(i);
            if (scheduleDTO != null) {
                long alartTime = scheduleDTO.getAlartTime();
                int hashCode = String.valueOf(scheduleDTO.getAlartTime()).hashCode();
                StringBuilder sb = new StringBuilder();
                sb.append(scheduleDTO.getEventId());
                sb.append(",");
                for (int i2 = i + 1; i2 < list.size(); i2++) {
                    ScheduleDTO scheduleDTO2 = list.get(i2);
                    if (scheduleDTO2 != null) {
                        if (scheduleDTO2.getAlartTime() != alartTime) {
                            break;
                        }
                        sb.append(scheduleDTO2.getEventId());
                        sb.append(",");
                        i = i2;
                    }
                }
                sb.deleteCharAt(sb.length() - 1);
                String sb2 = sb.toString();
                alarmManager.cancel(a.b(Globals.getApplication(), hashCode, new Intent(CalendarAlarm.INTENT_PLAY), 268435456));
                Intent intent = new Intent(CalendarAlarm.INTENT_PLAY);
                intent.putExtra("id", sb2);
                alarmManager.set(0, scheduleDTO.getAlartTime(), a.b(Globals.getApplication(), hashCode, intent, 268435456));
            }
            i++;
        }
    }

    public void cancelReminder(int i, String str) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.cancelReminder(i, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cancelReminderNew(int i, String str, String str2) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.cancelReminderNew(i, str, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkReminderExist(int i, String str) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.checkReminderExist(i, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getReminds(int i, String str, String str2, String str3) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.getReminds(i, str, str2, str3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getRemindsNew(int i, String str, String str2, String str3) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.getRemindsNew(i, str, str2, str3);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService getReminders exception");
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.calendar.aidl.business.CalendarAidlAdapter$1] */
    public void init(Context context2) {
        if (context2 != null && calendarService == null) {
            context = context2;
            new AsyncTask<Object, Object, Boolean>() { // from class: com.taobao.calendar.aidl.business.CalendarAidlAdapter.1
                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                /* renamed from: doInBackground */
                public Boolean mo1040doInBackground(Object... objArr) {
                    if (CalendarAidlAdapter.calendarService == null) {
                        ICalendarService unused = CalendarAidlAdapter.calendarService = (ICalendarService) Services.get(Globals.getApplication(), ICalendarService.class);
                    }
                    return true;
                }
            }.execute(new Object());
        }
    }

    public void queryAllReminds(String str) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.queryAllReminds(str);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService queryAllReminds exception");
            e.printStackTrace();
        }
    }

    public void queryAllRemindsCount(String str) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.queryAllRemindsCount(str);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService queryAllRemindsCount exception");
            e.printStackTrace();
        }
    }

    public void registerListener(CalendarListener calendarListener) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.registerListener(calendarListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setReminder(ScheduleDTO scheduleDTO) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.setReminder(scheduleDTO);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService setReminder exception");
            e.printStackTrace();
        }
    }

    public void setReminderNew(ScheduleDTO scheduleDTO, String str) {
        try {
            if (calendarService == null) {
                init();
            } else {
                calendarService.setReminderNew(scheduleDTO, str);
            }
        } catch (Exception e) {
            Log.e(TAG, "calendarService setReminder exception");
            e.printStackTrace();
        }
    }
}
