package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.support.v4.net.ConnectivityManagerCompat;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.update.framework.UpdateRuntime;
import java.io.File;
import java.io.FileFilter;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public class rgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int SilentDownloadSpaceSize;
    public static String TAG;
    public static String sCurrentProcessName;

    public static String getFreeSizeRange(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0fd989d", new Object[]{new Long(j)}) : j < 50 ? ">50M" : j < 100 ? "50M<n<100M" : j < 200 ? "100M<n<200M" : j < 500 ? "200M<n<500M" : ">500M";
    }

    static {
        kge.a(-1491847593);
        TAG = "UpdateUtils";
        SilentDownloadSpaceSize = 200;
    }

    public static String getApkPath(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f7bea8a", new Object[]{context});
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).publicSourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void killChildProcesses(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac96b4e2", new Object[]{context});
            return;
        }
        try {
            long j = context.getApplicationInfo().uid;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            for (int i = 0; i < runningAppProcesses.size(); i++) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                if (runningAppProcessInfo.uid == j && !runningAppProcessInfo.processName.equals(context.getPackageName())) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static String getProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        if (!StringUtils.isEmpty(sCurrentProcessName)) {
            return sCurrentProcessName;
        }
        int myPid = Process.myPid();
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    sCurrentProcessName = runningAppProcessInfo.processName;
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean hasEnoughSpace(Context context, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("637d2b43", new Object[]{context, new Long(j)})).booleanValue() : hasEnoughSpace(getStorePath(context), j);
    }

    public static String getStorePath(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1516638f", new Object[]{context});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir.getAbsolutePath();
    }

    public static boolean hasEnoughSpace(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db6d145b", new Object[]{str, new Long(j)})).booleanValue();
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StatFs statFs = null;
        try {
            statFs = new StatFs(file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        long j2 = 0;
        if (statFs != null) {
            j2 = statFs.getAvailableBlocks() * statFs.getBlockSize();
        }
        return j2 >= j + 2097152;
    }

    /* loaded from: classes9.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1745321348);
            kge.a(-1123682416);
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue() : Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public static int getNumCores() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e7ecbe", new Object[0])).intValue();
        }
        try {
            String str = "CPU Count: " + listFiles.length;
            return new File("/sys/devices/system/cpu/").listFiles(new a()).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public static long getLastPopTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc8d6b8d", new Object[0])).longValue();
        }
        try {
            return UpdateRuntime.getContext().getSharedPreferences(rfx.LAST_POP_TIME_CONFIG, 0).getLong("last_pop_time", 0L);
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static String getVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[0]);
        }
        if (UpdateRuntime.getContext() != null) {
            try {
                return UpdateRuntime.getContext().getPackageManager().getPackageInfo(UpdateRuntime.getContext().getPackageName(), 0).versionName;
            } catch (Exception e) {
                e.printStackTrace();
                return "1.0.0";
            }
        }
        throw new RuntimeException("application is null");
    }

    public static String getAppNameString(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cead3801", new Object[]{new Integer(i), str}) : UpdateRuntime.getContext().getString(i).replaceAll("\\{app_name\\}", str);
    }

    public static String getAppNameString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2dac894b", new Object[]{new Integer(i)}) : UpdateRuntime.getContext().getString(i);
    }

    public static boolean shouldSilentDownload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5824c51b", new Object[0])).booleanValue();
        }
        return getUsableSpace(Environment.getDataDirectory()) > ((long) SilentDownloadSpaceSize);
    }

    public static long getUsableSpace(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e035156a", new Object[]{file})).longValue();
        }
        if (file == null) {
            return -1L;
        }
        if (Build.VERSION.SDK_INT >= 9) {
            return (file.getUsableSpace() / 1024) / 1024;
        }
        if (!file.exists()) {
            return 0L;
        }
        StatFs statFs = new StatFs(file.getPath());
        return ((statFs.getBlockSize() * statFs.getAvailableBlocks()) / 1024) / 1024;
    }

    public static boolean isNotificationPermissioned() {
        NotificationManager notificationManager;
        Application context = UpdateRuntime.getContext();
        try {
            notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return notificationManager.areNotificationsEnabled();
        }
        if (Build.VERSION.SDK_INT >= 14) {
            Object systemService = context.getSystemService("appops");
            return ((Integer) systemService.getClass().getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(systemService, Integer.valueOf(((Integer) systemService.getClass().getDeclaredField("OP_POST_NOTIFICATION").get(null)).intValue()), Integer.valueOf(context.getApplicationInfo().uid), context.getApplicationContext().getPackageName())).intValue() == 0;
        }
        return true;
    }

    public static boolean isProguard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ed4baed", new Object[0])).booleanValue();
        }
        try {
            Class.forName("com.taobao.update.framework.UpdateRuntime");
            return false;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }

    public static final <T> T toJavaObject(JSON json, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("36b5e941", new Object[]{json, cls});
        }
        try {
            return (T) JSON.toJavaObject(json, cls);
        } catch (Throwable unused) {
            try {
                return (T) JSON.parseObject(json.toJSONString(), cls);
            } catch (Throwable unused2) {
                return null;
            }
        }
    }

    public static boolean greaterThen(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5202056", new Object[]{str, str2})).booleanValue();
        }
        try {
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            for (int i = 0; i < split.length; i++) {
                if (i >= split2.length) {
                    return true;
                }
                if (!split[i].equals(split2[i])) {
                    return Integer.valueOf(split[i]).intValue() > Integer.valueOf(split2[i]).intValue();
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int getNetworkType() {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("700d68cc", new Object[0])).intValue();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) UpdateRuntime.getContext().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            if (activeNetworkInfo.getType() == 9) {
                return 2;
            }
            if (activeNetworkInfo.getType() != 1) {
                return 3;
            }
            return a(connectivityManager) ? 1 : 2;
        } catch (Throwable unused) {
            return 2;
        }
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9dbef19", new Object[]{connectivityManager})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                return connectivityManager.isActiveNetworkMetered();
            }
            return ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue() : (context.getApplicationInfo().flags & 2) != 0;
    }
}
