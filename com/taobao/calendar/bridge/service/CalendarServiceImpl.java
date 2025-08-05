package com.taobao.calendar.bridge.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.taobao.calendar.bridge.listener.CalendarListener;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.bridge.service.ICalendarService;
import com.taobao.calendar.exception.CalendarResult;
import tb.kfg;
import tb.kfi;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarServiceImpl extends Service {
    private Context b;
    private kfg c;

    /* renamed from: a  reason: collision with root package name */
    private final String f16855a = getClass().getSimpleName();
    private IBinder d = new ICalendarService.Stub() { // from class: com.taobao.calendar.bridge.service.CalendarServiceImpl.1
        private CalendarListener listener = null;

        @Override // com.taobao.calendar.bridge.service.ICalendarService
        public void addCalendar(ScheduleDTOModule scheduleDTOModule) throws RemoteException {
            if (this.listener == null) {
                return;
            }
            CalendarServiceImpl.this.c.a(scheduleDTOModule, new kfi() { // from class: com.taobao.calendar.bridge.service.CalendarServiceImpl.1.1
                @Override // tb.kfi
                public void a(CalendarResult calendarResult, String str) {
                    try {
                        if (calendarResult == CalendarResult.KTCALENDAR_SUCCESS) {
                            AnonymousClass1.this.listener.onSuccess(true, str);
                        } else {
                            AnonymousClass1.this.listener.onError(calendarResult.getCode(), calendarResult.getMessage());
                        }
                    } catch (RemoteException unused) {
                    }
                }
            });
        }

        @Override // com.taobao.calendar.bridge.service.ICalendarService
        public void cancelCalendar(String str, String str2) throws RemoteException {
            if (this.listener == null) {
                return;
            }
            CalendarServiceImpl.this.c.a(str, str2, new kfi() { // from class: com.taobao.calendar.bridge.service.CalendarServiceImpl.1.2
                @Override // tb.kfi
                public void a(CalendarResult calendarResult, String str3) {
                    try {
                        if (calendarResult == CalendarResult.KTCALENDAR_SUCCESS) {
                            AnonymousClass1.this.listener.onSuccess(true, str3);
                        } else {
                            AnonymousClass1.this.listener.onError(calendarResult.getCode(), calendarResult.getMessage());
                        }
                    } catch (RemoteException unused) {
                    }
                }
            });
        }

        @Override // com.taobao.calendar.bridge.service.ICalendarService
        public void checkReminderExist(String str) throws RemoteException {
            CalendarServiceImpl.this.c.a(str, new kfi() { // from class: com.taobao.calendar.bridge.service.CalendarServiceImpl.1.3
                @Override // tb.kfi
                public void a(CalendarResult calendarResult, String str2) {
                    try {
                        if (calendarResult == CalendarResult.KTCALENDAR_SUCCESS) {
                            AnonymousClass1.this.listener.onSuccess(true, str2);
                        } else {
                            AnonymousClass1.this.listener.onError(calendarResult.getCode(), calendarResult.getMessage());
                        }
                    } catch (RemoteException unused) {
                    }
                }
            });
        }

        @Override // com.taobao.calendar.bridge.service.ICalendarService
        public void registerListener(CalendarListener calendarListener) throws RemoteException {
            this.listener = calendarListener;
        }
    };

    static {
        kge.a(-148159307);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.d;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.b = getApplication();
        this.c = new kfg(this.b);
    }
}
