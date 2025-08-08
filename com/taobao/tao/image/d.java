package com.taobao.tao.image;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMON_TAG = "STRATEGY.ALL";

    /* renamed from: a  reason: collision with root package name */
    private static Integer f20624a;
    private static StringBuilder d;
    private static Formatter e;
    public static final char LEVEL_V = 'V';
    public static final char LEVEL_D = 'D';
    public static final char LEVEL_I = 'I';
    public static final char LEVEL_W = 'W';
    public static final char LEVEL_E = 'E';
    public static final char LEVEL_L = 'L';
    public static final char[] sLogTypes = {LEVEL_V, LEVEL_D, LEVEL_I, LEVEL_W, LEVEL_E, LEVEL_L};
    private static boolean b = AdapterForTLog.isValid();
    private static final Object c = new Object();

    private static int b(char c2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d655a7", new Object[]{new Character(c2)})).intValue();
        }
        while (true) {
            char[] cArr = sLogTypes;
            if (i >= cArr.length) {
                return -1;
            }
            if (cArr[i] == c2) {
                return i;
            }
            i++;
        }
    }

    public static boolean a(char c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8217d19", new Object[]{new Character(c2)})).booleanValue();
        }
        if (f20624a == null) {
            if (b) {
                String logLevel = AdapterForTLog.getLogLevel();
                f20624a = Integer.valueOf(b(StringUtils.isEmpty(logLevel) ? LEVEL_L : logLevel.charAt(0)));
            } else {
                f20624a = Integer.valueOf(b(LEVEL_V));
            }
        }
        return b(c2) >= f20624a.intValue();
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
        } else if (!a(LEVEL_D)) {
        } else {
            if (b) {
                AdapterForTLog.logd(str, a(str2, objArr));
            } else {
                a(str2, objArr);
            }
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
        } else if (!a(LEVEL_I)) {
        } else {
            if (b) {
                AdapterForTLog.logi(str, a(str2, objArr));
            } else {
                a(str2, objArr);
            }
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{str, str2, objArr});
        } else if (!a(LEVEL_W)) {
        } else {
            if (b) {
                AdapterForTLog.logw(str, a(str2, objArr));
            } else {
                a(str2, objArr);
            }
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (!a(LEVEL_E)) {
        } else {
            if (b) {
                AdapterForTLog.loge(str, a(str2, objArr));
            } else {
                Log.e(str, a(str2, objArr));
            }
        }
    }

    private static String a(String str, Object... objArr) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{str, objArr});
        }
        synchronized (c) {
            if (d == null) {
                d = new StringBuilder(250);
            } else {
                d.setLength(0);
            }
            if (e == null) {
                e = new Formatter(d, Locale.getDefault());
            }
            e.format(str, objArr);
            substring = d.substring(0);
        }
        return substring;
    }
}
