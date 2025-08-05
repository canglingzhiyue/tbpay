package com.taobao.tao.log.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.f;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CHANGE_LOG_LEVEL = "com.taobao.tao.log.change.loglevel";
    public static final String ACTION_CHANGE_MODULE_LEVEL = "com.taobao.tao.log.change.modulelevel";
    public static final String ACTION_FLUSH = "com.taobao.tao.log.flush";
    public static final String PARAM_LOG_LEVEL = "tlog_log_level";
    public static final String PARAM_MODULE_LEVEL = "tlog_module_level";
    public static final String PARAM_PID = "tlog_pid";

    /* renamed from: a  reason: collision with root package name */
    private static TLogMultiProcessReceiver f20704a;
    private static AtomicBoolean b;

    static {
        kge.a(-842312217);
        f20704a = new TLogMultiProcessReceiver();
        b = new AtomicBoolean(false);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!b(context) || b.get()) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ACTION_FLUSH);
            intentFilter.addAction(ACTION_CHANGE_LOG_LEVEL);
            intentFilter.addAction(ACTION_CHANGE_MODULE_LEVEL);
            if (Build.VERSION.SDK_INT > 33) {
                context.registerReceiver(f20704a, intentFilter, 4);
            } else {
                context.registerReceiver(f20704a, intentFilter);
            }
            b.set(true);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(new Intent(ACTION_FLUSH));
        }
    }

    public static void a(LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fefee4e", new Object[]{logLevel});
            return;
        }
        Intent intent = new Intent(ACTION_CHANGE_LOG_LEVEL);
        intent.putExtra(PARAM_LOG_LEVEL, logLevel);
        a(intent);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        Intent intent = new Intent(ACTION_CHANGE_MODULE_LEVEL);
        intent.putExtra(PARAM_MODULE_LEVEL, str);
        a(intent);
    }

    private static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
            return;
        }
        Context j = f.a().j();
        if (j == null || intent == null || !b(j)) {
            return;
        }
        intent.putExtra(PARAM_PID, Process.myPid());
        intent.setPackage(j.getPackageName());
        j.sendBroadcast(intent);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            if (!defaultSharedPreferences.contains("tlog_multi_process_notify")) {
                return true;
            }
            return defaultSharedPreferences.getBoolean("tlog_multi_process_notify", true);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
