package com.taobao.calendar.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import tb.kge;

/* loaded from: classes6.dex */
public class Preferences {
    private static final String APP_INITED = "appInited";
    private static final String DEF_EMPTY_STR = "";
    private static final String ENABLEREMINDSYNC = "enableRemindSync";
    private static final String LAST_ALARM = "lastAlarm";
    private static final String LAST_DATASOURCE = "lastDataSource";
    private static final String MAXSUBMITCOUNT = "maxSubmitCount";
    public static SharedPreferences.Editor mEditor;
    public static SharedPreferences mPref;

    static {
        kge.a(4046053);
    }

    public static boolean getEnableremindsync() {
        return mPref.getBoolean(ENABLEREMINDSYNC, true);
    }

    public static String getLastAlarm() {
        return mPref.getString(LAST_ALARM, "");
    }

    public static int getLastDataSource() {
        return mPref.getInt(LAST_DATASOURCE, 1);
    }

    public static int getMaxsubmitcount() {
        return mPref.getInt(MAXSUBMITCOUNT, 50);
    }

    public static void init(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.taobao.calendar.preference", 0);
        mPref = sharedPreferences;
        mEditor = sharedPreferences.edit();
    }

    public static boolean isAppInited() {
        return mPref.getBoolean(APP_INITED, false);
    }

    public static void markAppInited() {
        mEditor.putBoolean(APP_INITED, true);
        mEditor.commit();
    }

    public static void markEnableremindsync(boolean z) {
        mEditor.putBoolean(ENABLEREMINDSYNC, z);
        mEditor.commit();
    }

    public static void setLastAlarm(String str) {
        mEditor.putString(LAST_ALARM, str);
        mEditor.commit();
    }

    public static void setLastDataSource(int i) {
        mEditor.putInt(LAST_DATASOURCE, i);
        mEditor.commit();
    }

    public static void setMaxsubmitcount(int i) {
        mEditor.putInt(MAXSUBMITCOUNT, i);
        mEditor.apply();
    }
}
