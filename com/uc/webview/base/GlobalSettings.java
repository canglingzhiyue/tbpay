package com.uc.webview.base;

import mtopsdk.common.util.StringUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public class GlobalSettings extends d {
    private static Set<Observer> sObservers = new HashSet();

    /* loaded from: classes9.dex */
    public interface Observer {
        void onValueChanged(int i, String str);
    }

    public static void addObserver(Observer observer) {
        synchronized (sObservers) {
            sObservers.add(observer);
        }
    }

    public static float get(int i, float f) {
        return (i < 0 || i >= f.f23779a.length) ? f : Float.valueOf(get(i, Float.toString(f))).floatValue();
    }

    public static int get(int i, int i2) {
        return (i < 0 || i >= f.f23779a.length) ? i2 : Integer.valueOf(get(i, Integer.toString(i2))).intValue();
    }

    public static String get(int i, String str) {
        if (i < 0 || i >= f.f23779a.length) {
            return str;
        }
        String str2 = sImpl.get().get(i);
        return StringUtils.isEmpty(str2) ? str : str2;
    }

    public static boolean get(int i, boolean z) {
        return (i < 0 || i >= f.f23779a.length) ? z : Boolean.valueOf(get(i, Boolean.toString(z))).booleanValue();
    }

    public static boolean getBoolValue(int i) {
        return get(i, false);
    }

    public static float getFloatValue(int i) {
        return get(i, 0.0f);
    }

    public static int getIntValue(int i) {
        return get(i, 0);
    }

    public static String getStringValue(int i) {
        return get(i, "");
    }

    public static boolean isAccessible(int i, String str) {
        if (i < 0 || i >= f.f23779a.length) {
            return false;
        }
        return sImpl.get().isAccessible(i, str);
    }

    private static String listToString(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                sb.append(trim);
                sb.append("^^");
            }
        }
        return sb.toString();
    }

    public static boolean set(int i, float f) {
        if (i < 0 || i >= f.f23779a.length) {
            return false;
        }
        return setValue(i, Float.toString(f));
    }

    public static boolean set(int i, int i2) {
        if (i < 0 || i >= f.f23779a.length) {
            return false;
        }
        int[] iArr = f.e.get(Integer.valueOf(i));
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (i3 < iArr.length && i2 != iArr[i3]) {
                i3++;
            }
            if (i3 == iArr.length) {
                Log.e("GlobalSettings", String.format("set %s setting failure, \"%d\" is not one of %s", f.f23779a[i], Integer.valueOf(i2), Arrays.toString(iArr)));
                return false;
            }
        }
        return setImpl(i, Integer.toString(i2));
    }

    public static boolean set(int i, String str) {
        if (i < 0 || i >= f.f23779a.length) {
            return false;
        }
        return setValue(i, str);
    }

    public static boolean set(int i, boolean z) {
        if (i < 0 || i >= f.f23779a.length) {
            return false;
        }
        return setValue(i, Boolean.toString(z));
    }

    private static boolean setImpl(int i, String str) {
        boolean z = sImpl.get().set(i, str);
        if (z) {
            synchronized (sObservers) {
                for (Observer observer : sObservers) {
                    observer.onValueChanged(i, str);
                }
            }
            String str2 = "set: " + f.f23779a[i] + " = \"" + Log.a(str) + "\"";
        }
        return z;
    }

    public static boolean setValue(int i, String str) {
        if (i < 0 || i >= f.f23779a.length) {
            return false;
        }
        int[] iArr = f.c[1];
        return (i < iArr[0] || i >= iArr[1]) ? setImpl(i, str) : set(i, Integer.valueOf(str).intValue());
    }

    public static boolean setValue(int i, String[] strArr) {
        return setValue(i, listToString(strArr));
    }
}
