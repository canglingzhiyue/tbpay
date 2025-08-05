package com.taobao.calendar.bridge.jsbridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.taobao.windvane.jsbridge.c;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import tb.kge;

/* loaded from: classes6.dex */
public class DynamicJsbridgeService extends Service implements c {
    static {
        kge.a(275033497);
        kge.a(-1332442189);
    }

    @Override // android.taobao.windvane.jsbridge.c
    public Class<? extends e> getBridgeClass(String str) {
        if (!TextUtils.isEmpty(str) && str.equals("TBCalendar")) {
            return CalendarJsBridge.class;
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }
}
