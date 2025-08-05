package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import com.taobao.android.service.Services;
import com.taobao.calendar.bridge.jsbridge.CalendarJsBridge;
import com.taobao.calendar.bridge.listener.CalendarListener;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.bridge.service.ICalendarService;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;

/* loaded from: classes6.dex */
public class kff {

    /* renamed from: a  reason: collision with root package name */
    private static kff f30027a;
    private static Context b;
    private static String c;
    private static ICalendarService d;

    static {
        kge.a(-479728733);
        f30027a = new kff();
        c = "TBCalendar";
    }

    private kff() {
    }

    public static synchronized kff a() {
        kff kffVar;
        synchronized (kff.class) {
            if (f30027a == null) {
                f30027a = new kff();
            }
            kffVar = f30027a;
        }
        return kffVar;
    }

    public static void b() {
        try {
            q.a("TBCalendarAlias", (Class<? extends e>) CalendarJsBridge.class, true);
            q.a("TBCalendar", "addCalendarPlan", "TBCalendarAlias", "addCalendarPlan");
            q.a("TBCalendar", "cancelCalendarPlan", "TBCalendarAlias", "cancelCalendarPlan");
            q.a("TBCalendar", "checkCalendarPlanIsExist", "TBCalendarAlias", "checkCalendarPlanIsExist");
            q.a("TBCalendar", "checkCalendarPermission", "TBCalendarAlias", "checkCalendarPermission");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.kff$2] */
    private void d() {
        if (d != null) {
            return;
        }
        new AsyncTask<Object, Object, Boolean>() { // from class: tb.kff.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Boolean doInBackground(Object... objArr) {
                try {
                    if (kff.d == null) {
                        ICalendarService unused = kff.d = (ICalendarService) Services.get(Globals.getApplication(), ICalendarService.class);
                    }
                } catch (Exception e) {
                    TLog.loge("calendar init error", e.getMessage());
                }
                return true;
            }
        }.execute(new Object());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [tb.kff$1] */
    public void a(Context context) {
        if (context != null && d == null) {
            b = context;
            new AsyncTask<Object, Object, Boolean>() { // from class: tb.kff.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public Boolean doInBackground(Object... objArr) {
                    try {
                        if (kff.d == null) {
                            ICalendarService unused = kff.d = (ICalendarService) Services.get(Globals.getApplication(), ICalendarService.class);
                        }
                    } catch (Exception e) {
                        TLog.loge("calendar init error", e.getMessage());
                    }
                    return true;
                }
            }.execute(new Object());
        }
    }

    public void a(CalendarListener calendarListener) {
        try {
            if (d == null) {
                d();
            } else {
                d.registerListener(calendarListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(ScheduleDTOModule scheduleDTOModule) {
        try {
            if (d == null) {
                d();
            } else {
                d.addCalendar(scheduleDTOModule);
            }
        } catch (Exception e) {
            Log.e(c, "calendarService addCalendar exception");
            e.printStackTrace();
        }
    }

    public void a(String str) {
        try {
            if (d == null) {
                d();
            } else {
                d.checkReminderExist(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        try {
            if (d == null) {
                d();
            } else {
                d.cancelCalendar(str, str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
