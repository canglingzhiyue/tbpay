package com.taobao.accs.utl;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.NetworkInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ta.utdid2.device.UTDevice;
import com.taobao.accs.client.GlobalClientInfo;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import tb.kap;
import tb.kge;
import tb.mrg;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f8306a = null;
    public static String b = null;
    public static com.taobao.accs.b c = null;
    public static final String channelService = "com.taobao.accs.ChannelService";
    private static Boolean d = null;
    private static Boolean e = null;
    private static Boolean f = null;
    public static final String msgService = "com.taobao.accs.data.MsgDistributeService";

    static {
        kge.a(-1129471191);
        f8306a = "";
        d = null;
        e = null;
        f = null;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (d == null) {
            try {
                d = Boolean.valueOf("com.taobao.taobao".equals(context.getPackageName()));
                ALog.e("AdapterUtilityImpl", "isTaobao=" + d, new Object[0]);
            } catch (Exception e2) {
                ALog.e("AdapterUtilityImpl", "isTaobao err", e2, new Object[0]);
                return true;
            }
        }
        return d.booleanValue();
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(context.getPackageName().equals(com.taobao.aranger.utils.c.a()));
        e = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(UtilityImpl.getChannelProcessName(context).equals(com.taobao.aranger.utils.c.a()));
        f = valueOf;
        return valueOf.booleanValue();
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        try {
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory == null) {
                return -1L;
            }
            if (Build.VERSION.SDK_INT >= 9) {
                return dataDirectory.getUsableSpace();
            }
            if (!dataDirectory.exists()) {
                return -1L;
            }
            StatFs statFs = new StatFs(dataDirectory.getPath());
            return statFs.getBlockSize() * statFs.getAvailableBlocks();
        } catch (Throwable th) {
            ALog.e("AdapterUtilityImpl", "getUsableSpace", th, new Object[0]);
            return -1L;
        }
    }

    public static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th}) : a(th.getStackTrace());
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("935bc097", new Object[]{stackTraceElementArr}) : kap.a(stackTraceElementArr);
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        com.taobao.accs.b bVar = c;
        if (bVar == null) {
            return UTDevice.getUtdid(context);
        }
        return bVar.a(context);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = GlobalClientInfo.getInstance(context).getConnectivityManager().getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static final boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        StatFs statFs = new StatFs(str);
        int blockSize = statFs.getBlockSize();
        long availableBlocks = statFs.getAvailableBlocks();
        StringBuilder sb = new StringBuilder();
        sb.append("st.getAvailableBlocks()=");
        sb.append(statFs.getAvailableBlocks());
        sb.append(",st.getAvailableBlocks() * blockSize=");
        long j = blockSize;
        sb.append(statFs.getAvailableBlocks() * j);
        sb.toString();
        return statFs.getAvailableBlocks() > 10 && availableBlocks * j > ((long) i);
    }

    public static String f(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return String.valueOf(((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled());
            } catch (Throwable th) {
                ALog.e("AdapterUtilityImpl", "Android above 7.0 isNotificationEnabled", th, new Object[0]);
            }
        } else {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                boolean z = true;
                if (((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager)).intValue()), Integer.valueOf(i), packageName)).intValue() != 0) {
                    z = false;
                }
                return String.valueOf(z);
            } catch (Throwable th2) {
                ALog.e("AdapterUtilityImpl", "isNotificationEnabled", th2, new Object[0]);
            }
        }
        return "unknown";
    }

    public static boolean g(Context context) {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 19) {
            ALog.d("AdapterUtilityImpl", "AssistantUtils === checkFloatPermission === 小于19版本，返回true", new Object[0]);
            return true;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    if (appOpsManager == null) {
                        return false;
                    }
                    int checkOpNoThrow = appOpsManager.checkOpNoThrow("android:system_alert_window", Process.myUid(), context.getPackageName());
                    if (!Settings.canDrawOverlays(context) && checkOpNoThrow != 0) {
                        z = false;
                    }
                    ALog.d("AdapterUtilityImpl", "LinkUtils === checkFloatPermission === 大于26版本，返回" + z, new Object[0]);
                    return z;
                }
                boolean canDrawOverlays = Settings.canDrawOverlays(context);
                ALog.d("AdapterUtilityImpl", "LinkUtils === checkFloatPermission === 大于23  小于26版本，返回" + canDrawOverlays, new Object[0]);
                return canDrawOverlays;
            }
            Class<?> cls = Class.forName("android.content.Context");
            Field declaredField = cls.getDeclaredField("APP_OPS_SERVICE");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(cls);
            if (!(obj instanceof String)) {
                return false;
            }
            Object invoke = cls.getMethod("getSystemService", String.class).invoke(context, (String) obj);
            Class<?> cls2 = Class.forName("android.app.AppOpsManager");
            Field declaredField2 = cls2.getDeclaredField("MODE_ALLOWED");
            declaredField2.setAccessible(true);
            int intValue = ((Integer) cls2.getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke(invoke, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue();
            ALog.d("AdapterUtilityImpl", "LinkUtils === checkFloatPermission === 小于23版本，返回 = " + declaredField2.getInt(cls2), new Object[0]);
            return intValue == declaredField2.getInt(cls2);
        } catch (Throwable th) {
            ALog.e("AdapterUtilityImpl", mrg.CHECK_FLOAT_PERMISSION, th, new Object[0]);
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = GlobalClientInfo.getInstance(context).getActivityManager().getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (str.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            ALog.e("AdapterUtilityImpl", "isProcessAlive error ", e2, new Object[0]);
            return false;
        }
    }

    public static boolean h(Context context) {
        try {
            Method declaredMethod = Class.forName("org.android.agoo.huawei.HuaWeiRegister").getDeclaredMethod("isSupport", Context.class);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(null, context)).booleanValue();
        } catch (Throwable th) {
            ALog.e("AdapterUtilityImpl", "isSupportHMS err", th, new Object[0]);
            return false;
        }
    }
}
