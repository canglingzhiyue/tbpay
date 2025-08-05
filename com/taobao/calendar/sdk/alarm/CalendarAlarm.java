package com.taobao.calendar.sdk.alarm;

import android.content.Context;
import android.content.Intent;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarAlarm {
    public static String INTENT_ACCEPT;
    public static String INTENT_KILL;
    public static String INTENT_PLAY;
    public static String INTENT_RESET;
    public static String INTENT_STOP;
    public static String INTENT_SYN;
    public static String INTENT_TIMEOUT;
    public static int NOTIFY_ID;
    public static int TIMEOUT;

    static {
        kge.a(262507362);
        NOTIFY_ID = 1;
        INTENT_PLAY = "com.taobao.calendar.sdk.alarm.headline.PLAY";
        INTENT_STOP = "com.taobao.calendar.sdk.alarm.headline.STOP";
        INTENT_KILL = "com.taobao.calendar.sdk.alarm.headline.KILL";
        INTENT_RESET = "com.taobao.calendar.sdk.alarm.headline.RESET";
        INTENT_SYN = "com.taobao.calendar.sdk.alarm.headline.SYN";
        INTENT_TIMEOUT = "com.taobao.calendar.sdk.alarm.headline.TIMEOUT";
        INTENT_ACCEPT = "com.taobao.calendar.sdk.alarm.headline.ACCEPT";
        TIMEOUT = 20000;
    }

    public static void play(Context context) {
        context.sendBroadcast(new Intent(INTENT_PLAY));
    }

    public static void reset(Context context) {
        context.sendBroadcast(new Intent(INTENT_RESET));
    }

    public static void stop(Context context) {
        context.sendBroadcast(new Intent(INTENT_KILL));
    }

    public static void syn(Context context, String str) {
        Intent intent = new Intent(INTENT_SYN);
        intent.putExtra("userId", str);
        context.sendBroadcast(intent);
    }

    public static void timeout(Context context) {
        context.sendBroadcast(new Intent(INTENT_TIMEOUT));
    }
}
