package com.ali.user.open.core.trace;

import android.content.Context;
import android.util.Log;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.text.SimpleDateFormat;
import java.util.Date;
import tb.kge;

/* loaded from: classes2.dex */
public class SDKLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG_PREFIX = "AliMemberSDK_";
    private static boolean isTlogValid;

    static {
        kge.a(-1561624880);
        isTlogValid = false;
        try {
            Class.forName(OConstant.REFLECT_TLOG);
            isTlogValid = true;
        } catch (ClassNotFoundException unused) {
            isTlogValid = false;
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        try {
            if (isDebugEnabled()) {
                if (isTlogValid) {
                    TLogAdapter.i(TAG_PREFIX + str, str2 + appendCurrentTime());
                } else {
                    String str3 = TAG_PREFIX + str;
                    String str4 = str2 + appendCurrentTime();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        try {
            if (isDebugEnabled()) {
                if (isTlogValid) {
                    TLogAdapter.d(TAG_PREFIX + str, str2 + appendCurrentTime());
                } else {
                    String str3 = TAG_PREFIX + str;
                    String str4 = str2 + appendCurrentTime();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        try {
            if (isDebugEnabled()) {
                if (isTlogValid) {
                    TLogAdapter.w(TAG_PREFIX + str, str2 + appendCurrentTime());
                } else {
                    String str3 = TAG_PREFIX + str;
                    String str4 = str2 + appendCurrentTime();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        try {
            if (isTlogValid) {
                TLogAdapter.e(TAG_PREFIX + str, str2 + appendCurrentTime(), th);
            } else {
                Log.e(TAG_PREFIX + str, str2 + appendCurrentTime(), th);
            }
        } catch (Throwable unused) {
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        try {
            if (isTlogValid) {
                TLogAdapter.e(TAG_PREFIX + str, str2 + appendCurrentTime());
            } else {
                Log.e(TAG_PREFIX + str, str2 + appendCurrentTime());
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean isDebugEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da1c3443", new Object[0])).booleanValue() : ConfigManager.DEBUG || isApkDebugable(KernelContext.getApplicationContext());
    }

    public static boolean isApkDebugable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27e7594a", new Object[]{context})).booleanValue() : (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String appendCurrentTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1be060d", new Object[0]);
        }
        return "\ntime =" + getDateStringByMill();
    }

    private static String getDateStringByMill() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b848c931", new Object[0]);
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date(System.currentTimeMillis()));
    }
}
