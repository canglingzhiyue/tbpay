package com.taobao.orange.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f18613a;

    static {
        kge.a(1876540350);
        f18613a = new ConcurrentHashMap();
    }

    public static void a(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840caf86", new Object[]{context, str, obj});
        } else if (context == null) {
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("orange", 0).edit();
                if (obj instanceof String) {
                    edit.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    edit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    edit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    edit.putLong(str, ((Long) obj).longValue());
                } else {
                    edit.putString(str, obj.toString());
                }
                if (Build.VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
            } catch (Throwable th) {
                OLog.e("SPUtil", "save to share preference failed", th.toString());
            }
        }
    }

    public static Object b(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("31567e2d", new Object[]{context, str, obj});
        }
        if (context == null) {
            return obj;
        }
        try {
            sharedPreferences = context.getSharedPreferences("orange", 0);
        } catch (Throwable th) {
            OLog.e("SPUtil", "get from share preference failed", th.toString());
        }
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return obj;
    }

    public static void a(Context context, String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450e8f55", new Object[]{context, str, set});
        } else if (context == null) {
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("orange", 0).edit();
                edit.putStringSet(str, set);
                if (Build.VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
            } catch (Throwable th) {
                OLog.e("SPUtil", "save set to share preference failed", th.toString());
            }
        }
    }

    public static Set<String> b(Context context, String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3145f105", new Object[]{context, str, set});
        }
        if (context == null) {
            return set;
        }
        try {
            return new HashSet(context.getSharedPreferences("orange", 0).getStringSet(str, set));
        } catch (Throwable th) {
            OLog.e("SPUtil", "get set from share preference failed", th.toString());
            return set;
        }
    }

    public static void c(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586bbfc4", new Object[]{context, str, obj});
        } else if (context == null) {
        } else {
            try {
                f18613a.put(str, obj);
                SharedPreferences.Editor edit = context.getSharedPreferences("orange", 0).edit();
                if (obj instanceof String) {
                    edit.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    edit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    edit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    edit.putLong(str, ((Long) obj).longValue());
                } else {
                    edit.putString(str, obj.toString());
                }
                if (Build.VERSION.SDK_INT >= 9) {
                    edit.apply();
                } else {
                    edit.commit();
                }
            } catch (Throwable th) {
                OLog.e("SPUtil", "save to share preference failed", th.toString());
            }
        }
    }

    public static Object d(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("804e31af", new Object[]{context, str, obj});
        }
        if (context == null) {
            return obj;
        }
        Object obj2 = f18613a.get(str);
        if (obj2 != null) {
            return obj2;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("orange", 0);
            if (obj instanceof String) {
                obj2 = sharedPreferences.getString(str, (String) obj);
            } else if (obj instanceof Integer) {
                obj2 = Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            } else if (obj instanceof Boolean) {
                obj2 = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            } else if (obj instanceof Float) {
                obj2 = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            } else if (obj instanceof Long) {
                obj2 = Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
            if (obj2 != null) {
                f18613a.put(str, obj2);
                return obj2;
            }
        } catch (Throwable th) {
            OLog.e("SPUtil", "get from share preference failed", th.toString());
        }
        return obj;
    }
}
