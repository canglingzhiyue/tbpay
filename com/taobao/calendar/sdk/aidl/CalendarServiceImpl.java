package com.taobao.calendar.sdk.aidl;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import com.taobao.calendar.aidl.service.ICalendarService;
import com.taobao.calendar.sdk.TBCalendar;
import com.taobao.calendar.sdk.common.DateUtils;
import com.taobao.calendar.sdk.common.Utils;
import com.taobao.calendar.sdk.db.ScheduleDO;
import com.taobao.calendar.sdk.db.TableSchedule;
import com.taobao.tao.TaobaoApplication;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarServiceImpl extends Service {
    public static final String TAG = "CalendarServiceImpl";
    public static boolean inited;

    /* loaded from: classes6.dex */
    class ServiceBinder extends ICalendarService.Stub {
        private CalendarListener listener = null;

        static {
            kge.a(-1864510170);
        }

        ServiceBinder() {
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void cancelReminder(int i, String str) throws RemoteException {
            cancelReminderNew(i, str, Utils.getUserIdByReflect());
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void cancelReminderNew(int i, String str, String str2) throws RemoteException {
            if (this.listener == null) {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
                return;
            }
            TableSchedule.QueryHandler queryHandler = new TableSchedule.QueryHandler() { // from class: com.taobao.calendar.sdk.aidl.CalendarServiceImpl.ServiceBinder.1
                @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
                public void callback(int i2) {
                    String str3 = "cancelReminder callback:" + i2;
                }
            };
            try {
                try {
                    if (CalendarServiceImpl.inited) {
                        TableSchedule.cancelSchedule(str, i, queryHandler, str2);
                        this.listener.onSuccess(true, str, null);
                    } else {
                        this.listener.onError("context is null!", str);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    this.listener.onError(e.getMessage(), str);
                }
            } finally {
                this.listener = null;
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void checkReminderExist(int i, String str) throws RemoteException {
            if (this.listener == null) {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
                return;
            }
            try {
                try {
                    if (CalendarServiceImpl.inited) {
                        this.listener.onSuccess(TableSchedule.CheckSchedule(str, String.valueOf(i)), str, null);
                    } else {
                        this.listener.onError("context is null!", str);
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                    this.listener.onError(e.toString(), str);
                }
            } finally {
                this.listener = null;
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void getReminds(int i, String str, String str2, String str3) throws RemoteException {
            CalendarListener calendarListener;
            String str4;
            String str5;
            if (this.listener == null) {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
            } else if (i <= 0 || str == null) {
            } else {
                if (!str3.equalsIgnoreCase("ASC") && !str3.equalsIgnoreCase("DESC")) {
                    return;
                }
                try {
                    try {
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        this.listener.onError(e.toString(), String.valueOf(i));
                    }
                    if (CalendarServiceImpl.inited) {
                        String[] schedulesBetween = TableSchedule.getSchedulesBetween(String.valueOf(i), str, str2, str3);
                        if (schedulesBetween != null) {
                            this.listener.onSuccess(true, null, schedulesBetween);
                        }
                        calendarListener = this.listener;
                        str4 = "strs is null!";
                        str5 = i + "";
                    } else {
                        calendarListener = this.listener;
                        str4 = "context is null!";
                        str5 = i + "";
                    }
                    calendarListener.onError(str4, str5);
                } finally {
                    this.listener = null;
                }
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void getRemindsNew(int i, String str, String str2, String str3) throws RemoteException {
            CalendarListener calendarListener;
            String str4;
            String str5;
            if (this.listener == null) {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
            } else if (i <= 0 || str == null) {
            } else {
                if (!str3.equalsIgnoreCase("ASC") && !str3.equalsIgnoreCase("DESC")) {
                    return;
                }
                try {
                    try {
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        this.listener.onError(e.toString(), String.valueOf(i));
                    }
                    if (CalendarServiceImpl.inited) {
                        String[] schedulesBetweenNew = TableSchedule.getSchedulesBetweenNew(String.valueOf(i), str, str2, str3);
                        if (schedulesBetweenNew != null) {
                            this.listener.onSuccess(true, null, schedulesBetweenNew);
                        }
                        calendarListener = this.listener;
                        str4 = "result is null!";
                        str5 = i + "";
                    } else {
                        calendarListener = this.listener;
                        str4 = "context is null!";
                        str5 = i + "";
                    }
                    calendarListener.onError(str4, str5);
                } finally {
                    this.listener = null;
                }
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void queryAllReminds(String str) throws RemoteException {
            if (this.listener == null) {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
                return;
            }
            try {
                if (StringUtils.isEmpty(str)) {
                    this.listener.onError("param error. param is empty", "");
                    return;
                }
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject == null) {
                    this.listener.onError("param error. param is empty", "");
                    return;
                }
                if (parseObject.containsKey("start_time") && parseObject.containsKey(ExperimentDO.COLUMN_END_TIME)) {
                    String string = parseObject.getString("start_time");
                    String string2 = parseObject.getString(ExperimentDO.COLUMN_END_TIME);
                    if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
                        String formatCompat = DateUtils.formatCompat(string, "yyyyMMddHHmmss", "yyyy-MM-dd");
                        String formatCompat2 = DateUtils.formatCompat(string2, "yyyyMMddHHmmss", "yyyy-MM-dd");
                        String string3 = parseObject.getString("source_id");
                        if (!StringUtils.isEmpty(string3) && "0".equals(string3)) {
                            string3 = "";
                        }
                        String string4 = parseObject.getString("user_id");
                        int intValue = parseObject.getIntValue("pageSize");
                        int intValue2 = parseObject.getIntValue("currentPage");
                        if (intValue <= 0) {
                            intValue = 10;
                        }
                        if (intValue2 <= 1) {
                            intValue2 = 1;
                        }
                        String str2 = ((intValue2 - 1) * intValue) + " , " + intValue;
                        String string5 = parseObject.getString("filterCancellation");
                        if (!CalendarServiceImpl.inited) {
                            this.listener.onError("context is null!", string3 + "");
                            return;
                        }
                        String[] queryAllReminds = TableSchedule.queryAllReminds(formatCompat, formatCompat2, string3, string4, string5, str2);
                        if (queryAllReminds != null) {
                            this.listener.onSuccess(true, null, queryAllReminds);
                            return;
                        }
                        this.listener.onError("result is null!", string3 + "");
                        return;
                    }
                    this.listener.onError("param error. startTime or endTime is empty!", "");
                    return;
                }
                this.listener.onError("param error. startTime or endTime is empty!", "");
            } catch (Exception e) {
                this.listener.onError(e.toString(), "");
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void queryAllRemindsCount(String str) throws RemoteException {
            if (this.listener == null) {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
                return;
            }
            try {
                if (StringUtils.isEmpty(str)) {
                    this.listener.onError("param error. param is empty", "");
                    return;
                }
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject == null) {
                    this.listener.onError("param error. param is empty", "");
                    return;
                }
                if (parseObject.containsKey("start_time") && parseObject.containsKey(ExperimentDO.COLUMN_END_TIME)) {
                    String string = parseObject.getString("start_time");
                    String string2 = parseObject.getString(ExperimentDO.COLUMN_END_TIME);
                    if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
                        String formatCompat = DateUtils.formatCompat(string, "yyyyMMddHHmmss", "yyyy-MM-dd");
                        String formatCompat2 = DateUtils.formatCompat(string2, "yyyyMMddHHmmss", "yyyy-MM-dd");
                        String string3 = parseObject.getString("source_id");
                        if (!StringUtils.isEmpty(string3) && "0".equals(string3)) {
                            string3 = "";
                        }
                        String string4 = parseObject.getString("user_id");
                        String string5 = parseObject.getString("filterCancellation");
                        if (!CalendarServiceImpl.inited) {
                            CalendarListener calendarListener = this.listener;
                            calendarListener.onError("context is null!", string3 + "");
                            return;
                        }
                        String[] queryAllRemindsCount = TableSchedule.queryAllRemindsCount(formatCompat, formatCompat2, string3, string4, string5);
                        if (queryAllRemindsCount != null) {
                            this.listener.onSuccess(true, null, queryAllRemindsCount);
                            return;
                        }
                        CalendarListener calendarListener2 = this.listener;
                        calendarListener2.onError("result is null!", string3 + "");
                        return;
                    }
                    this.listener.onError("param error. startTime or endTime is empty!", "");
                    return;
                }
                this.listener.onError("param error. startTime or endTime is empty!", "");
            } catch (Exception e) {
                this.listener.onError(e.toString(), "");
            }
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void registerListener(CalendarListener calendarListener) throws RemoteException {
            this.listener = calendarListener;
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void setReminder(ScheduleDTO scheduleDTO) throws RemoteException {
            setReminderNew(scheduleDTO, Utils.getUserIdByReflect());
        }

        @Override // com.taobao.calendar.aidl.service.ICalendarService
        public void setReminderNew(ScheduleDTO scheduleDTO, String str) throws RemoteException {
            CalendarListener calendarListener;
            String exc;
            String str2;
            if (this.listener == null) {
                Log.e(CalendarServiceImpl.TAG, "listener is null,please first use registerListener() method");
                return;
            }
            TableSchedule.QueryHandler queryHandler = new TableSchedule.QueryHandler() { // from class: com.taobao.calendar.sdk.aidl.CalendarServiceImpl.ServiceBinder.2
                @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
                public void callback(int i) {
                    String.valueOf(i);
                }
            };
            if (scheduleDTO == null) {
                return;
            }
            ScheduleDO scheduleDO = new ScheduleDO();
            scheduleDO.sourceId = scheduleDTO.getSourceId();
            scheduleDO.eventId = scheduleDTO.getEventId();
            try {
                try {
                    scheduleDO.setStartTime(Long.valueOf(CalendarServiceImpl.this.stringToDate(scheduleDTO.getStartTime(), "yyyyMMddHHmmss").getTime()));
                    scheduleDO.endTime = CalendarServiceImpl.this.stringToDate(scheduleDTO.getEndTime(), "yyyyMMddHHmmss").getTime();
                    scheduleDO.title = StringUtils.isEmpty(scheduleDTO.getTitle()) ? "title" : scheduleDTO.getTitle();
                    scheduleDO.description = scheduleDTO.getDescription();
                    boolean z = false;
                    scheduleDO.isAllDay = scheduleDTO.getIsallday() == 1;
                    String link = scheduleDTO.getLink();
                    String replaceOrAddQueryParameter = Utils.replaceOrAddQueryParameter(link, "spm", "a2141.7779397." + scheduleDTO.getSourceId());
                    if (StringUtils.isEmpty(replaceOrAddQueryParameter)) {
                        replaceOrAddQueryParameter = "link";
                    }
                    scheduleDO.link = replaceOrAddQueryParameter;
                    scheduleDO.isRepeat = scheduleDTO.getIsrepeat() == 1;
                    if (scheduleDTO.getIseditable() == 1) {
                        z = true;
                    }
                    scheduleDO.isEditable = z;
                    scheduleDO.remind = StringUtils.isEmpty(String.valueOf(scheduleDTO.getRemind())) ? 300L : scheduleDTO.getRemind();
                    if (CalendarServiceImpl.inited) {
                        TableSchedule.newSchedule(scheduleDO, queryHandler, str);
                        this.listener.onSuccess(true, scheduleDO.eventId, null);
                    } else {
                        this.listener.onError("context is null!", scheduleDTO.getEventId());
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                    calendarListener = this.listener;
                    exc = e.toString();
                    str2 = scheduleDO.eventId;
                    calendarListener.onError(exc, str2);
                } catch (Exception e2) {
                    calendarListener = this.listener;
                    exc = e2.toString();
                    str2 = scheduleDO.eventId;
                    calendarListener.onError(exc, str2);
                }
            } finally {
                this.listener = null;
            }
        }
    }

    static {
        kge.a(-154176149);
        inited = false;
    }

    public CalendarServiceImpl() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date stringToDate(String str, String str2) throws Exception {
        if (str == null) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return simpleDateFormat.parse(str, parsePosition);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new ServiceBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Application application = getApplication();
        if (application != null) {
            TBCalendar.init(application);
            inited = true;
        }
    }
}
