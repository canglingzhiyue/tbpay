package com.taobao.calendar.aidl.business.alarm;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public class CalendarAlarm {
    public static String INTENT_ACCEPT = "com.taobao.calendar.sdk.alarm.ACCEPT";
    public static String INTENT_KILL = "com.taobao.calendar.sdk.alarm.KILL";
    public static String INTENT_PLAY = "com.taobao.calendar.sdk.alarm.PLAY";
    public static String INTENT_RESET = "com.taobao.calendar.sdk.alarm.RESET";
    public static String INTENT_STOP = "com.taobao.calendar.sdk.alarm.STOP";
    public static String INTENT_SYN = "com.taobao.calendar.sdk.alarm.SYN";
    public static String INTENT_TIMEOUT = "com.taobao.calendar.sdk.alarm.TIMEOUT";
    public static int NOTIFY_ID = 1;
    public static int TIMEOUT = 20000;

    public static void play(Context context) {
        context.sendBroadcast(new Intent(INTENT_PLAY));
    }

    public static void reset(Context context) {
        context.sendBroadcast(new Intent(INTENT_RESET));
    }

    public static void stop(Context context) {
        context.sendBroadcast(new Intent(INTENT_KILL));
    }

    public static void syn(Context context) {
        context.sendBroadcast(new Intent(INTENT_SYN));
    }

    public static void timeout(Context context) {
        context.sendBroadcast(new Intent(INTENT_TIMEOUT));
    }
}
