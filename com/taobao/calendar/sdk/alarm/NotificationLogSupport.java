package com.taobao.calendar.sdk.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import tb.kge;

/* loaded from: classes6.dex */
public class NotificationLogSupport extends BroadcastReceiver {
    public static String INTENT_NOTIFY;

    static {
        kge.a(485476967);
        INTENT_NOTIFY = "com.taobao.calendar.sdk.alarm.headline.NOTIFY";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Parcelable parcelableExtra;
        if (context != null && intent != null) {
            try {
                String action = intent.getAction();
                if (action == null || !INTENT_NOTIFY.equals(action) || (parcelableExtra = intent.getParcelableExtra("tao_calendar_realIntent")) == null || !(parcelableExtra instanceof Intent)) {
                    return;
                }
                Intent intent2 = (Intent) parcelableExtra;
                intent2.setAction("com.taobao.headline.calendar.NOTIFY");
                String stringExtra = intent2.getStringExtra("sourceId");
                String stringExtra2 = intent2.getStringExtra("myBrowserUrl");
                String stringExtra3 = intent2.getStringExtra("eventId");
                CT ct = CT.Button;
                TBS.Adv.ctrlClicked("Page_Calendar", ct, "click_notify", "sourceId=" + stringExtra, "eventId=" + stringExtra3, "url=" + stringExtra2);
                context.startActivity(intent2);
            } catch (Exception unused) {
            }
        }
    }
}
