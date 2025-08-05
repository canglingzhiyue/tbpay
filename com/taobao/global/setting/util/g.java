package com.taobao.global.setting.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Object> f17229a = new HashMap<>();

    public static SharedPreferences a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("67e9dc7e", new Object[]{context, str});
        }
        e(context, str);
        return d(context, str);
    }

    private static SharedPreferences d(Context context, String str) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("f3fe1adb", new Object[]{context, str});
        }
        synchronized (f17229a) {
            if (!f17229a.containsKey(str)) {
                f17229a.put(str, new f(b(context, str)));
            }
            sharedPreferences = (SharedPreferences) f17229a.get(str);
        }
        return sharedPreferences;
    }

    public static File b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4a8e03a4", new Object[]{context, str});
        }
        String absolutePath = c(context, str).getAbsolutePath();
        return new File(absolutePath.substring(0, absolutePath.length() - 4) + ".sp");
    }

    public static File c(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("503a425", new Object[]{context, str}) : (File) a(context, "getSharedPrefsFile", new Class[]{String.class}, new Object[]{str});
    }

    private static synchronized void e(Context context, String str) {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48e0bda6", new Object[]{context, str});
            } else if (context != null) {
                SharedPreferences d = d(context, "sp_replace_flag");
                if (!d.contains(str)) {
                    SharedPreferences d2 = d(context, str);
                    SharedPreferences.Editor edit = d2.edit();
                    if (((f) d2).a() <= 1) {
                        Map<String, ?> all = context.getSharedPreferences(str, 0).getAll();
                        if (all.size() > 0) {
                            for (Map.Entry<String, ?> entry : all.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (key != null && key.trim().length() > 0 && value != null) {
                                    if (value instanceof String) {
                                        edit.putString(key, (String) value);
                                    } else if (value instanceof Long) {
                                        edit.putLong(key, ((Long) value).longValue());
                                    } else if (value instanceof Integer) {
                                        edit.putInt(key, ((Integer) value).intValue());
                                    } else if (value instanceof Float) {
                                        edit.putFloat(key, ((Float) value).floatValue());
                                    } else if (value instanceof Boolean) {
                                        edit.putBoolean(key, ((Boolean) value).booleanValue());
                                    }
                                }
                            }
                            edit.apply();
                        }
                    }
                    d.edit().putBoolean(str, true).apply();
                }
            }
        }
    }

    private static Object a(Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            Method method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
