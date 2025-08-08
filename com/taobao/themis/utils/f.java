package com.taobao.themis.utils;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import java.security.MessageDigest;
import tb.kge;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CommonUtils";

    static {
        kge.a(-2052298400);
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (str2 != null && str2.length() != 0) {
                        if (!str.contains("*") && !str2.contains("*")) {
                            String[] split = str.split("\\.");
                            String[] split2 = str2.split("\\.");
                            int length = split.length;
                            int length2 = split2.length;
                            int min = Math.min(length, length2);
                            for (int i = 0; i < min; i++) {
                                int i2 = (m.a(split[i]) > m.a(split2[i]) ? 1 : (m.a(split[i]) == m.a(split2[i]) ? 0 : -1));
                                if (i2 > 0) {
                                    return 1;
                                }
                                if (i2 < 0) {
                                    return -1;
                                }
                            }
                            if (length > length2) {
                                while (min < length) {
                                    if (m.a(split[min]) > 0) {
                                        return 1;
                                    }
                                    min++;
                                }
                            } else if (length < length2) {
                                while (min < length2) {
                                    if (m.a(split2[min]) > 0) {
                                        return -1;
                                    }
                                    min++;
                                }
                            }
                        }
                        return 0;
                    }
                    return 1;
                }
            } catch (Exception e) {
                Log.e("CommonUtils", "compareVersion exception!", e);
            }
        }
        return (str2 == null || str2.length() == 0) ? 0 : -1;
    }

    public static boolean a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c56f7b", new Object[]{application})).booleanValue();
        }
        if (application != null) {
            try {
                if ((application.getApplicationInfo().flags & 2) != 0) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static Integer a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("eb7402d9", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Exception unused) {
                return Integer.valueOf(Integer.parseInt(str));
            }
        } catch (Exception e) {
            Log.e("CommonUtils", "parseColor", e);
            return null;
        }
    }

    public static String b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls.newInstance(), str);
        } catch (Exception unused) {
            return "";
        }
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue();
        }
        long j = -1;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return a(j);
    }

    public static long f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6b", new Object[]{str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue();
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : j > 0 ? j - (System.currentTimeMillis() - SystemClock.uptimeMillis()) : j;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static <T extends View> T a(ViewGroup viewGroup, Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f96e038", new Object[]{viewGroup, cls});
        }
        if (viewGroup != null && cls != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (cls.isInstance(childAt)) {
                    return cls.cast(childAt);
                }
                if ((childAt instanceof ViewGroup) && (t = (T) a((ViewGroup) childAt, cls)) != null) {
                    return t;
                }
            }
        }
        return null;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && !"app".equals(str) && !NativeCallContext.DOMAIN_APPX.equals(str);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : l.b(context) || l.d(context);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : l.d(context);
    }
}
