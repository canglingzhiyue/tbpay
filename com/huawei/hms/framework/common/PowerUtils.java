package com.huawei.hms.framework.common;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;

/* loaded from: classes4.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    /* loaded from: classes4.dex */
    public static final class PowerMode {
        static int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static int POWER_SAVER_MODE = 4;
        static String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "isAppIdleMode Context is null!");
            return false;
        }
        String packageName = context.getPackageName();
        UsageStatsManager usageStatsManager = null;
        if (Build.VERSION.SDK_INT < 21) {
            Logger.i(TAG, "isAppIdleMode statsManager is null!");
        } else if (Build.VERSION.SDK_INT >= 22) {
            Object systemService = context.getSystemService("usagestats");
            if (!(systemService instanceof UsageStatsManager)) {
                return false;
            }
            usageStatsManager = (UsageStatsManager) systemService;
        }
        if (usageStatsManager == null) {
            Logger.i(TAG, "isAppIdleMode statsManager is null!");
            return false;
        } else if (Build.VERSION.SDK_INT < 23) {
            return false;
        } else {
            return usageStatsManager.isAppInactive(packageName);
        }
    }

    public static boolean isDozeIdleMode(Context context) {
        String str;
        if (context == null) {
            Logger.i(TAG, "isDozeIdleMode Context is null!");
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            str = "isDozeIdleMode powerManager is null!";
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                return powerManager.isDeviceIdleMode();
            } catch (RuntimeException e) {
                Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                return false;
            }
        } else {
            str = "isDozeIdleMode is version control state!";
        }
        Logger.i(TAG, str);
        return false;
    }

    public static boolean isInteractive(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                PowerManager powerManager = (PowerManager) systemService;
                if (Build.VERSION.SDK_INT >= 20) {
                    try {
                        return powerManager.isInteractive();
                    } catch (RuntimeException e) {
                        Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName() + e.getMessage());
                    }
                }
            }
        }
        return false;
    }

    public static boolean isWhilteList(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            String packageName = context.getPackageName();
            if (powerManager != null && Build.VERSION.SDK_INT >= 23) {
                try {
                    return powerManager.isIgnoringBatteryOptimizations(packageName);
                } catch (RuntimeException e) {
                    Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                }
            }
        }
        return false;
    }

    public static int readDataSaverMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "readDataSaverMode manager is null!");
            return 0;
        }
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            Logger.i(TAG, "readDataSaverMode Context is null!");
            return 0;
        } else if (Build.VERSION.SDK_INT < 16 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        } else {
            if (!connectivityManager.isActiveNetworkMetered()) {
                Logger.v(TAG, "ConnectType is not Mobile Network!");
                return 0;
            } else if (Build.VERSION.SDK_INT < 24) {
                return 0;
            } else {
                return connectivityManager.getRestrictBackgroundStatus();
            }
        }
    }

    public static int readPowerSaverMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "readPowerSaverMode Context is null!");
            return 0;
        }
        int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), PowerMode.SMART_MODE_STATUS, PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE);
        if (systemInt != PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE) {
            return systemInt;
        }
        PowerManager powerManager = null;
        Object systemService = ContextCompat.getSystemService(context, "power");
        if (systemService instanceof PowerManager) {
            powerManager = (PowerManager) systemService;
        }
        if (powerManager == null) {
            return systemInt;
        }
        if (Build.VERSION.SDK_INT < 21) {
            Logger.i(TAG, "readPowerSaverMode is control by version!");
            return systemInt;
        }
        try {
            systemInt = powerManager.isPowerSaveMode() ? PowerMode.POWER_SAVER_MODE : PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE;
            return systemInt;
        } catch (RuntimeException e) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
            return systemInt;
        }
    }
}
