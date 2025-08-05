package com.taobao.calendar.sdk.synchronize;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.calendar.sdk.alarm.CalendarAlarm;
import com.taobao.calendar.sdk.db.TableSchedule;
import com.taobao.tao.TaobaoApplication;
import tb.kge;

/* loaded from: classes6.dex */
public class SynService extends Service {
    public static final String TAG = "TBCalendar";

    static {
        kge.a(-550734625);
    }

    public SynService() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        TableSchedule.SynIngFlag = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("userId");
        String stringExtra2 = intent.getStringExtra("ttid");
        if (action != null && action.equals(CalendarAlarm.INTENT_SYN)) {
            new SynBusinessProxy(getApplicationContext(), stringExtra, stringExtra2).submitAndUpdate();
        }
        return 1;
    }
}
