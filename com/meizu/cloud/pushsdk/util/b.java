package com.meizu.cloud.pushsdk.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes4.dex */
public class b {
    public static String a(Context context, String str) {
        return d(context, "mz_push_preference", "push_alias_" + str);
    }

    public static void a(Context context, int i, String str) {
        a(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str + "_" + PushConstants.KEY_PUSH_ID_EXPIRE_TIME, i);
    }

    public static void a(Context context, String str, int i) {
        a(context, "mz_push_preference", str + ".notification_id", i);
    }

    public static void a(Context context, String str, long j) {
        a(context, "mz_push_preference_new", str + ".ad_last_close_time", j);
    }

    public static void a(Context context, String str, String str2, int i) {
        j(context, str).edit().putInt(str2, i).apply();
    }

    public static void a(Context context, String str, String str2, long j) {
        j(context, str).edit().putLong(str2, j).apply();
    }

    public static void a(Context context, String str, String str2, String str3) {
        j(context, str).edit().putString(str2, str3).apply();
    }

    public static void a(Context context, String str, String str2, boolean z) {
        j(context, str).edit().putBoolean(str2, z).apply();
    }

    public static void a(Context context, String str, boolean z) {
        a(context, "mz_push_preference", str + ".first_request_publicKey", z);
    }

    public static boolean a(Context context, String str, String str2) {
        return j(context, str).getBoolean(str2, true);
    }

    public static int b(Context context, String str) {
        SharedPreferences j = j(context, "mz_push_preference");
        return j.getInt(str + ".notification_id", 0);
    }

    public static int b(Context context, String str, String str2) {
        return j(context, str).getInt(str2, 0);
    }

    public static void b(Context context, String str, int i) {
        a(context, "mz_push_preference", str + ".notification_push_task_id", i);
    }

    public static void b(Context context, String str, String str2, int i) {
        a(context, "mz_push_preference", str + "." + str2, i);
    }

    public static void b(Context context, String str, boolean z) {
        a(context, "mz_push_preference", "switch_notification_message_" + str, z);
    }

    public static int c(Context context, String str) {
        SharedPreferences j = j(context, "mz_push_preference");
        return j.getInt(str + ".notification_push_task_id", 0);
    }

    public static int c(Context context, String str, String str2) {
        return b(context, "mz_push_preference", str + "." + str2);
    }

    public static void c(Context context, String str, int i) {
        a(context, "mz_push_preference", str + ".message_seq", i);
    }

    public static void c(Context context, String str, boolean z) {
        a(context, "mz_push_preference", "switch_through_message_" + str, z);
    }

    public static String d(Context context, String str, String str2) {
        return j(context, str).getString(str2, "");
    }

    public static boolean d(Context context, String str) {
        return a(context, "mz_push_preference", str + ".first_request_publicKey");
    }

    public static int e(Context context, String str) {
        int b = b(context, "mz_push_preference", str + ".message_seq") + 1;
        c(context, str, b);
        DebugLogger.e("mz_push_preference", "current messageSeq " + b);
        return b;
    }

    public static boolean e(Context context, String str, String str2) {
        return j(context, str).contains(str2);
    }

    public static void f(Context context, String str, String str2) {
        a(context, "mz_push_preference", str + ".encryption_public_key", str2);
    }

    public static boolean f(Context context, String str) {
        return a(context, "mz_push_preference", "switch_notification_message_" + str);
    }

    public static String g(Context context, String str) {
        return d(context, "mz_push_preference", str + ".encryption_public_key");
    }

    public static void g(Context context, String str, String str2) {
        a(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str2 + "_" + PushConstants.KEY_PUSH_ID, str);
    }

    public static String h(Context context, String str) {
        return d(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str + "_" + PushConstants.KEY_PUSH_ID);
    }

    public static boolean h(Context context, String str, String str2) {
        return j(context, str).edit().remove(str2).commit();
    }

    public static int i(Context context, String str) {
        return b(context, PushConstants.PUSH_ID_PREFERENCE_NAME, str + "_" + PushConstants.KEY_PUSH_ID_EXPIRE_TIME);
    }

    public static boolean i(Context context, String str, String str2) {
        return h(context, "mz_push_preference", str + "." + str2);
    }

    private static SharedPreferences j(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    public static void j(Context context, String str, String str2) {
        a(context, "mz_push_preference", "push_alias_" + str, str2);
    }

    public static boolean k(Context context, String str) {
        return a(context, "mz_push_preference", "switch_through_message_" + str);
    }

    public static boolean l(Context context, String str) {
        return e(context, "mz_push_preference", "switch_notification_message_" + str);
    }

    public static boolean m(Context context, String str) {
        return e(context, "mz_push_preference", "switch_through_message_" + str);
    }
}
