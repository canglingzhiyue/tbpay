package com.taobao.tao.log.interceptor;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f20692a;
    private static boolean b;
    private static boolean c;
    private static f d;

    static {
        kge.a(480988585);
        b = false;
        c = false;
        f20692a = 0;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!com.taobao.tao.log.d.f()) {
        } else {
            if (!RealTimeLogMessageManager.a(context)) {
                Log.e("RealTimeLogManager", "RealTimeMessageManager init failed!");
            } else if (!e(context)) {
                Log.e("RealTimeLogManager", "Init, RealTimeLog is forbidden!");
                f20692a = 3;
                c(context);
            } else {
                String d2 = d(context);
                Log.e("RealTimeLogManager", "Read RealTime Config from local: " + d2);
                int a2 = a(context, d2, true);
                f20692a = a2;
                if (a2 == 1) {
                    return;
                }
                if (a2 == 7) {
                    c = true;
                }
                c(context);
            }
        }
    }

    public static synchronized int a(Context context, String str) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{context, str})).intValue();
            } else if (!e(context)) {
                Log.e("RealTimeLogManager", "handleConfig, RealTimeLog is forbidden");
                a(context, 3);
                return 3;
            } else {
                Log.e("RealTimeLogManager", "Receive RealTime Config from server: " + str);
                int a2 = a(context, str, false);
                f20692a = a2;
                if (a2 != 1) {
                    a(context, a2);
                }
                return a2;
            }
        }
    }

    private static synchronized int a(Context context, String str, boolean z) {
        RealTimeLogConfig realTimeLogConfig;
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d51141dd", new Object[]{context, str, new Boolean(z)})).intValue();
            } else if (StringUtils.isEmpty(str)) {
                Log.e("RealTimeLogManager", "The config is empty!");
                return 4;
            } else {
                try {
                    realTimeLogConfig = (RealTimeLogConfig) JSON.parseObject(str, RealTimeLogConfig.class);
                } catch (Exception e) {
                    Log.e("RealTimeLogManager", "parse config exception!", e);
                    realTimeLogConfig = null;
                }
                if (realTimeLogConfig == null) {
                    return 5;
                }
                if (!realTimeLogConfig.enable) {
                    Log.e("RealTimeLogManager", "The config is disable!");
                    return 2;
                } else if (StringUtils.isEmpty(realTimeLogConfig.token)) {
                    Log.e("RealTimeLogManager", "The config token is empty!");
                    return 5;
                } else if (z && realTimeLogConfig.expireTime == -1) {
                    Log.e("RealTimeLogManager", "The config only use once!");
                    return 7;
                } else if (realTimeLogConfig.expireTime != -1 && System.currentTimeMillis() > realTimeLogConfig.expireTime) {
                    Log.e("RealTimeLogManager", "The config is expire!");
                    return 6;
                } else if (!a(context, realTimeLogConfig)) {
                    Log.e("RealTimeLogManager", "start real time log failed!");
                    return 8;
                } else {
                    if (!z) {
                        b(context, JSON.toJSONString(realTimeLogConfig));
                    }
                    return 1;
                }
            }
        }
    }

    private static synchronized boolean a(Context context, RealTimeLogConfig realTimeLogConfig) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("47dfd7cd", new Object[]{context, realTimeLogConfig})).booleanValue();
            }
            String str = "Start RealTimeLog with config: " + realTimeLogConfig.toString();
            b t = com.taobao.tao.log.f.a().t();
            if (t == null) {
                Log.e("RealTimeLogManager", "logUploader is null");
                return false;
            }
            if (d == null) {
                f fVar = new f(context.getApplicationContext(), realTimeLogConfig, t);
                d = fVar;
                fVar.a();
            } else {
                d.a(realTimeLogConfig);
            }
            b = true;
            return true;
        }
    }

    public static synchronized void a(Context context, int i) {
        synchronized (d.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
                return;
            }
            String str = "Stop RealTimeLog: " + i;
            if (d != null) {
                d.b();
                d = null;
            }
            f20692a = i;
            c(context);
            if (b) {
                b = false;
                RealTimeLogMessageManager.b(i);
            }
        }
    }

    private static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("real_time_log", 0).edit();
            edit.putString("config", str);
            edit.apply();
        } catch (Exception e) {
            Log.e("RealTimeLogManager", "SaveConfig exception", e);
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("real_time_log", 0);
            if (!sharedPreferences.contains("config")) {
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove("config");
            edit.apply();
        } catch (Exception e) {
            Log.e("RealTimeLogManager", "deleteConfig exception", e);
        }
    }

    private static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("real_time_log", 0);
            if (sharedPreferences.contains("config")) {
                return sharedPreferences.getString("config", "");
            }
        } catch (Exception e) {
            Log.e("RealTimeLogManager", "readConfig exception", e);
        }
        return "";
    }

    private static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : PreferenceManager.getDefaultSharedPreferences(context).getBoolean("tlog_real_time", com.taobao.tao.log.d.h());
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (!c) {
        } else {
            RealTimeLogMessageManager.a();
            c = false;
        }
    }
}
