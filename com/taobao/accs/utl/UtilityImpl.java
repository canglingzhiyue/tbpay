package com.taobao.accs.utl;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import anet.channel.util.HMacUtil;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.base.APIRequestListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import tb.bzj;
import tb.gvk;
import tb.kap;
import tb.kaq;
import tb.kge;
import tb.mto;
import tb.riy;

/* loaded from: classes.dex */
public class UtilityImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LEN_INDEX = 2;
    private static final int LEN_IP = 12;
    private static final int LEN_IP_TRUE = 6;
    private static final int LEN_TIMESTAMP = 14;
    private static final long MIN = 1609430400001L;
    public static final String NET_TYPE_2G = "2g";
    public static final String NET_TYPE_3G = "3g";
    public static final String NET_TYPE_4G = "4g";
    public static final String NET_TYPE_UNKNOWN = "unknown";
    public static final String NET_TYPE_WIFI = "wifi";
    private static final char PADDING = '0';
    private static final String PADDING_DIGITS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Random PADDING_RANDOM;
    private static final String REG_ID_PREFIX = "reg0";
    private static final String TAG = "UtilityImpl";
    private static String appVersionName;
    public static File file;
    private static final char[] hexDigits;
    private static Boolean isAppKeepAlive;
    public static Boolean isHarmonyOs;
    private static Boolean isReleaseApp;
    private static int keepAliveBucketId;
    private static final byte[] mLock;
    private static volatile String oaid;

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : oaid;
    }

    public static /* synthetic */ String access$002(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fc06fd", new Object[]{str});
        }
        oaid = str;
        return str;
    }

    static {
        kge.a(311962336);
        mLock = new byte[0];
        hexDigits = new char[]{PADDING, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        keepAliveBucketId = -1;
        isReleaseApp = null;
        file = null;
        PADDING_RANDOM = new Random();
    }

    public static String getProxyHost(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72fcbc1f", new Object[]{context});
        }
        d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "getProxyHost", mto.a.GEO_NOT_SUPPORT);
        String string = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getString(Constants.KEY_PROXY_HOST, null);
        if (!StringUtils.isEmpty(string)) {
            return string;
        }
        String proxyIp = getProxyIp();
        if (!StringUtils.isEmpty(proxyIp)) {
            return proxyIp;
        }
        return null;
    }

    public static int getProxyPort(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e33465b", new Object[]{context})).intValue();
        }
        d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "getProxyPort(ctx)", mto.a.GEO_NOT_SUPPORT);
        int i = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getInt(Constants.KEY_PROXY_PORT, -1);
        if (i > 0) {
            return i;
        }
        if (getProxyHost(context) == null) {
            return -1;
        }
        try {
            return getProxyPort();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean isServiceIdPrintLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c520af2", new Object[]{str})).booleanValue();
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            return true;
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return Constants.IMPAAS.equals(str) || Constants.HD_DDZ.equals(str) || "powermsg".equals(str) || "pmmonitor".equals(str) || "powermsg3".equals(str) || GlobalClientInfo.AGOO_SERVICE_ID.equals(str) || "amp-sync".equals(str);
    }

    public static boolean appVersionChanged(Context context) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16cd6f08", new Object[]{context})).booleanValue();
        }
        synchronized (mLock) {
            PackageInfo packageInfo = GlobalClientInfo.getInstance(context).getPackageInfo();
            int i2 = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getInt(Constants.KEY_APP_VERSION_CODE, -1);
            String string = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString(Constants.KEY_APP_VERSION_NAME, "");
            if (packageInfo != null) {
                i = packageInfo.versionCode;
                str = packageInfo.versionName;
            } else {
                str = null;
                i = 0;
            }
            if (i2 == i && string.equals(str)) {
                return false;
            }
            saveAppVersion(context);
            ALog.i(TAG, "appVersionChanged", "oldV", Integer.valueOf(i2), "nowV", Integer.valueOf(i), "oldN", string, "nowN", str);
            return true;
        }
    }

    private static void saveAppVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259c14cd", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.putInt(Constants.KEY_APP_VERSION_CODE, GlobalClientInfo.getInstance(context).getPackageInfo().versionCode);
            edit.putString(Constants.KEY_APP_VERSION_NAME, GlobalClientInfo.getInstance(context).getPackageInfo().versionName);
            edit.apply();
        } catch (Throwable th) {
            ALog.e(TAG, "saveAppVersion", th, new Object[0]);
        }
    }

    public static void focusDisableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da72ad9c", new Object[]{context});
            return;
        }
        try {
            synchronized (mLock) {
                SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
                edit.putBoolean(Constants.KEY_FOUCE_DISABLE, true);
                edit.apply();
                disableService(context);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "focusDisableService", th, new Object[0]);
        }
    }

    public static void focusEnableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5837a5a7", new Object[]{context});
            return;
        }
        try {
            synchronized (mLock) {
                SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
                edit.putBoolean(Constants.KEY_FOUCE_DISABLE, false);
                edit.apply();
                enableService(context);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "focusEnableService", th, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static boolean getFocusDisableStatus(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6e4332d", new Object[]{context})).booleanValue();
        }
        if (context == 0) {
            return false;
        }
        try {
        } catch (Exception e) {
            e = e;
            context = false;
        }
        try {
            synchronized (mLock) {
                try {
                    context = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getBoolean(Constants.KEY_FOUCE_DISABLE, false);
                    return context;
                } catch (Throwable th) {
                    th = th;
                    context = 0;
                    try {
                        throw th;
                    } catch (Exception e2) {
                        e = e2;
                        ALog.e(TAG, "getFocusDisableStatus", e, new Object[0]);
                        return context;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean getServiceEnabled(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff9b28a3", new Object[]{context})).booleanValue() : getServiceEnabled(context, new ComponentName(context, c.channelService));
    }

    public static boolean getServiceEnabled(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("181759f4", new Object[]{context, componentName})).booleanValue();
        }
        if (context != null && componentName != null) {
            try {
                if (context.getPackageManager().getServiceInfo(componentName, 128).enabled) {
                    return true;
                }
            } catch (Throwable th) {
                ALog.e(TAG, "getServiceEnabled err", th, new Object[0]);
            }
        }
        return false;
    }

    public static boolean getAgooServiceEnabled(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ba55b3d", new Object[]{context})).booleanValue();
        }
        ComponentName componentName = new ComponentName(context, com.taobao.accs.client.a.a(context.getPackageName()));
        PackageManager packageManager = context.getPackageManager();
        if (!componentName.getPackageName().equals(riy.AND_NOT)) {
            return packageManager.getServiceInfo(componentName, 128).enabled;
        }
        ALog.e(TAG, "getAgooServiceEnabled,exception,comptName.getPackageName()=" + componentName.getPackageName(), new Object[0]);
        return false;
    }

    public static void enableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc082af", new Object[]{context});
        } else {
            enableService(context, new ComponentName(context, c.channelService));
        }
    }

    public static void enableService(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcabde0", new Object[]{context, componentName});
        } else if (context == null || componentName == null) {
        } else {
            ALog.d(TAG, "enableService", "comptName", componentName);
            try {
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            } catch (Throwable th) {
                ALog.w(TAG, "enableService", th, new Object[0]);
            }
        }
    }

    public static void disableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97057194", new Object[]{context});
            return;
        }
        ComponentName componentName = new ComponentName(context, c.channelService);
        PackageManager packageManager = context.getPackageManager();
        try {
            ALog.d(TAG, "disableService,comptName=" + componentName.toString(), new Object[0]);
            if (!packageManager.getServiceInfo(componentName, 128).enabled) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
            killService(context);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void disableComponent(Context context, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d58ea3", new Object[]{context, componentName});
            return;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ALog.e(TAG, "disableComponent", "componentName", componentName);
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable th) {
            ALog.e(TAG, "disableComponent err", th, new Object[0]);
        }
    }

    public static void killService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c9070a", new Object[]{context});
            return;
        }
        try {
            int myUid = Process.myUid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : GlobalClientInfo.getInstance(context).getActivityManager().getRunningAppProcesses()) {
                if (runningAppProcessInfo.uid == myUid) {
                    if (!StringUtils.isEmpty(com.taobao.accs.client.a.e) && com.taobao.accs.client.a.e.equals(runningAppProcessInfo.processName)) {
                        ALog.e(TAG, "killService", "processName", runningAppProcessInfo.processName);
                        Process.killProcess(runningAppProcessInfo.pid);
                        return;
                    } else if (runningAppProcessInfo.processName.endsWith(":channel")) {
                        ALog.e(TAG, "killService", "processName", runningAppProcessInfo.processName);
                        Process.killProcess(runningAppProcessInfo.pid);
                        return;
                    }
                }
            }
            ALog.e(TAG, "kill nothing", new Object[0]);
        } catch (Throwable th) {
            ALog.e(TAG, "killService", th, new Object[0]);
        }
    }

    public static String getNetworkType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("794dbb71", new Object[]{context});
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "unknown";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "wifi";
        }
        String subtypeName = activeNetworkInfo.getSubtypeName();
        return !StringUtils.isEmpty(subtypeName) ? subtypeName.replaceAll(" ", "") : "";
    }

    public static String getNetworkTypeExt(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2bf0ece", new Object[]{context});
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2g";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3g";
                case 13:
                    return "4g";
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    if (StringUtils.isEmpty(subtypeName)) {
                        return "unknown";
                    }
                    if (!subtypeName.equalsIgnoreCase("td-scdma") && !subtypeName.equalsIgnoreCase("td_scdma")) {
                        if (!subtypeName.equalsIgnoreCase("tds_hsdpa")) {
                            return "unknown";
                        }
                    }
                    return "3g";
            }
        } catch (Exception e) {
            ALog.e(TAG, "getNetworkTypeExt", e, new Object[0]);
            return null;
        }
    }

    public static boolean isForeground(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b036e38", new Object[]{context})).booleanValue() : kap.d();
    }

    private static boolean isSecurityOff(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eff6b5a", new Object[]{str})).booleanValue();
        }
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        return (configByTag == null ? 0 : configByTag.getSecurity()) == 2;
    }

    public static String getAppsign(Context context, String str, String str2, String str3, String str4, int i) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86433de", new Object[]{context, str, str2, str3, str4, new Integer(i)});
        }
        if (StringUtils.isEmpty(str)) {
            ALog.e(TAG, "getAppsign appkey null", new Object[0]);
            return null;
        }
        try {
            if (isSecurityOff(str4)) {
                if (!StringUtils.isEmpty(str2)) {
                    byte[] bytes = str2.getBytes();
                    if (l.s(context)) {
                        str6 = "2&" + str + "&" + l.q(context) + "&" + i;
                    } else {
                        str6 = str + str3;
                    }
                    return HMacUtil.hmacSha1Hex(bytes, str6.getBytes());
                }
                ALog.e(TAG, "getAppsign secret null", new Object[0]);
                return null;
            }
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager != null) {
                ALog.d(TAG, "getAppsign SecurityGuardManager not null!", new Object[0]);
                ISecureSignatureComponent secureSignatureComp = securityGuardManager.getSecureSignatureComp();
                SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                securityGuardParamContext.appKey = str;
                Map<String, String> map = securityGuardParamContext.paramMap;
                if (l.s(context)) {
                    str5 = "2&" + l.q(context) + "&" + str + "&" + i;
                } else {
                    str5 = str3 + str;
                }
                map.put("INPUT", str5);
                securityGuardParamContext.requestType = 3;
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str4);
                return secureSignatureComp.signRequest(securityGuardParamContext, configByTag != null ? configByTag.getAuthCode() : null);
            }
            ALog.d(TAG, "getAppsign SecurityGuardManager is null", new Object[0]);
            return null;
        } catch (Throwable th) {
            ALog.e(TAG, "getAppsign", th, new Object[0]);
            return null;
        }
    }

    public static String getCreateRegIdAppSign(Context context, String str, String str2, String str3, String str4, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9337a25", new Object[]{context, str, str2, str3, str4, new Integer(i)});
        }
        if (StringUtils.isEmpty(str)) {
            ALog.e(TAG, "getCreateRegIdAppSign appkey null", new Object[0]);
            return null;
        }
        try {
            if (isSecurityOff(str4)) {
                if (!StringUtils.isEmpty(str2)) {
                    byte[] bytes = str2.getBytes();
                    return HMacUtil.hmacSha1Hex(bytes, ("1&" + str + "&" + str3 + "&" + i).getBytes());
                }
                ALog.e(TAG, "getCreateRegIdAppSign secret null", new Object[0]);
                return null;
            }
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager != null) {
                ALog.d(TAG, "getCreateRegIdAppSign SecurityGuardManager not null!", new Object[0]);
                ISecureSignatureComponent secureSignatureComp = securityGuardManager.getSecureSignatureComp();
                SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                securityGuardParamContext.appKey = str;
                Map<String, String> map = securityGuardParamContext.paramMap;
                map.put("INPUT", "1&" + str3 + "&" + str + "&" + i);
                securityGuardParamContext.requestType = 3;
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str4);
                return secureSignatureComp.signRequest(securityGuardParamContext, configByTag != null ? configByTag.getAuthCode() : null);
            }
            ALog.d(TAG, "getCreateRegIdAppSign SecurityGuardManager is null", new Object[0]);
            return null;
        } catch (Throwable th) {
            ALog.e(TAG, "getCreateRegIdAppSign", th, new Object[0]);
            return null;
        }
    }

    public static boolean isNetworkConnected(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e6e0580", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = GlobalClientInfo.getInstance(context).getConnectivityManager().getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (Exception e) {
                ALog.e(TAG, "isNetworkConnected", e, new Object[0]);
            }
        }
        return false;
    }

    public static String getDeviceId(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ad7270e6", new Object[]{context}) : c.d(context);
    }

    public static boolean debug(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d98b2bb2", new Object[]{context})).booleanValue() : kap.a();
    }

    public static boolean isServiceRunning(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e598fc91", new Object[]{context})).booleanValue();
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : GlobalClientInfo.getInstance(context).getActivityManager().getRunningServices(Integer.MAX_VALUE)) {
            if (runningServiceInfo.service.getClassName().equals(c.channelService)) {
                return true;
            }
        }
        return false;
    }

    public static boolean packageExist(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b3cd63e", new Object[]{context, str})).booleanValue();
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            ALog.e(TAG, "package not exist", "pkg", str);
            return false;
        }
    }

    public static boolean utdidChanged(String str, Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db48dec7", new Object[]{str, context})).booleanValue();
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        synchronized (mLock) {
            try {
                String deviceId = getDeviceId(context);
                if (APreferencesManager.getSharedPreferences(context, str, 0).getString("utdid", deviceId).equals(deviceId)) {
                    z = false;
                }
                return z;
            } catch (Throwable th3) {
                th = th3;
                z = false;
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    ALog.e(TAG, "utdidChanged", th, new Object[0]);
                    return z;
                }
            }
        }
    }

    public static boolean notificationStateChanged(String str, Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dadd9f2d", new Object[]{str, context})).booleanValue();
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        synchronized (mLock) {
            try {
                String isNotificationEnabled = isNotificationEnabled(context);
                if (APreferencesManager.getSharedPreferences(context, str, 0).getString("notification_state", isNotificationEnabled).equals(isNotificationEnabled)) {
                    z = false;
                }
                return z;
            } catch (Throwable th3) {
                th = th3;
                z = false;
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    ALog.e(TAG, "notificationStateChanged", th, new Object[0]);
                    return z;
                }
            }
        }
    }

    public static void saveUtdid(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("632199f4", new Object[]{str, context});
            return;
        }
        try {
            synchronized (mLock) {
                SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, str, 0).edit();
                edit.putString("utdid", getDeviceId(context));
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e(TAG, "saveUtdid", th, new Object[0]);
        }
    }

    public static String getUtdid(String str, Context context) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da0f3af3", new Object[]{str, context});
        }
        try {
            synchronized (mLock) {
                string = APreferencesManager.getSharedPreferences(context, str, 0).getString("utdid", getDeviceId(context));
            }
            return string;
        } catch (Throwable th) {
            ALog.e(TAG, "getUtdid", th, new Object[0]);
            return "";
        }
    }

    public static void setServiceTime(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d9450d9", new Object[]{context, str, new Long(j)});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_CHANNEL_FILE_NAME, 0).edit();
            edit.putLong(str, j);
            edit.apply();
            ALog.d(TAG, "setServiceTime:" + j, new Object[0]);
        } catch (Throwable th) {
            ALog.e(TAG, "setServiceTime:", th, new Object[0]);
        }
    }

    public static void saveNotificationState(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9316bc6c", new Object[]{context, str, str2});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, str, 4).edit();
            edit.putString("notification_state", str2);
            edit.apply();
        } catch (Exception e) {
            ALog.e(TAG, "saveNotificationState fail", e, new Object[0]);
        }
    }

    public static long getServiceAliveTime(Context context) {
        long j;
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb61457a", new Object[]{context})).longValue();
        }
        try {
            sharedPreferences = APreferencesManager.getSharedPreferences(context, Constants.SP_CHANNEL_FILE_NAME, 0);
            long j2 = sharedPreferences.getLong(Constants.SP_KEY_SERVICE_START, 0L);
            j = j2 > 0 ? sharedPreferences.getLong(Constants.SP_KEY_SERVICE_END, 0L) - j2 : 0L;
        } catch (Throwable th) {
            th = th;
            j = 0;
        }
        try {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(Constants.SP_KEY_SERVICE_START, 0L);
            edit.putLong(Constants.SP_KEY_SERVICE_END, 0L);
            edit.apply();
        } catch (Throwable th2) {
            th = th2;
            ALog.e(TAG, "getServiceAliveTime:", th, new Object[0]);
            return j;
        }
        return j;
    }

    public static String getAppVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e616e24c", new Object[]{context});
        }
        try {
            return GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getMainProcessName(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78984e4a", new Object[]{context}) : context.getPackageName();
    }

    public static String getChannelProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1205896c", new Object[]{context});
        }
        return context.getPackageName() + ":channel";
    }

    public static boolean isMainProcess(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue() : c.b(context);
    }

    public static boolean isChannelProcess(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d915192f", new Object[]{context})).booleanValue() : c.c(context);
    }

    public static boolean isMainProcessAlive(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83c60f84", new Object[]{context})).booleanValue() : c.a(context, context.getPackageName());
    }

    public static boolean isChannelProcessAlive(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e3be9ce", new Object[]{context})).booleanValue() : c.a(context, getChannelProcessName(context));
    }

    public static int getByteLen(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e97c8efb", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("utf-8").length;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String getStackMsg(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38cdb21", new Object[]{th}) : c.a(th);
    }

    public static void storeCookie(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5cf366", new Object[]{context, str});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            GlobalClientInfo.mCookieSec = str;
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_COOKIE_FILE_NAME, 0).edit();
            edit.putString(Constants.SP_KEY_COOKIE_SEC, str);
            edit.apply();
        } catch (Exception e) {
            ALog.e(TAG, "storeCookie fail", e, new Object[0]);
        }
    }

    public static String restoreCookie(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e273d4b1", new Object[]{context});
        }
        try {
            return APreferencesManager.getSharedPreferences(context, Constants.SP_COOKIE_FILE_NAME, 4).getString(Constants.SP_KEY_COOKIE_SEC, null);
        } catch (Exception e) {
            ALog.e(TAG, "reStoreCookie fail", e, new Object[0]);
            return null;
        }
    }

    public static int getMainProcessPid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6ef44c9", new Object[]{context})).intValue();
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return -1;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (Throwable th) {
            ALog.e(TAG, "getMainProcessPid err", th, new Object[0]);
            return -1;
        }
    }

    public static void clearCookie(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d223b0", new Object[]{context});
            return;
        }
        try {
            GlobalClientInfo.mCookieSec = null;
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_COOKIE_FILE_NAME, 0).edit();
            edit.clear();
            edit.apply();
        } catch (Throwable th) {
            ALog.e(TAG, "clearCookie fail", th, new Object[0]);
        }
    }

    public static long getUsableSpace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2deb6633", new Object[0])).longValue() : c.a();
    }

    public static String getProxyIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7f4c85a", new Object[0]);
        }
        d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "getProxyIp", mto.a.GEO_NOT_SUPPORT);
        if (Build.VERSION.SDK_INT < 11) {
            return Proxy.getDefaultHost();
        }
        return System.getProperty("http.proxyHost");
    }

    public static int getProxyPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8ef9153", new Object[0])).intValue();
        }
        d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "getProxyPort", mto.a.GEO_NOT_SUPPORT);
        if (Build.VERSION.SDK_INT < 11) {
            return Proxy.getDefaultPort();
        }
        try {
            return Integer.parseInt(System.getProperty("http.proxyPort"));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String getProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6431e141", new Object[0]);
        }
        d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "getProxy", mto.a.GEO_NOT_SUPPORT);
        String str = getProxyIp() + ":" + getProxyPort();
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(TAG, "getProxy:" + str, new Object[0]);
        }
        return str;
    }

    public static String isNotificationEnabled(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5acdcaeb", new Object[]{context}) : c.f(context);
    }

    public static String[] getAppkey(Context context) {
        String[] appkey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8ad0389c", new Object[]{context});
        }
        synchronized (mLock) {
            appkey = ACCSManager.getAppkey(context);
        }
        return appkey;
    }

    public static String getOAID(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e11ddb22", new Object[]{context});
        }
        if (!StringUtils.isEmpty(oaid)) {
            return oaid;
        }
        if (context == null) {
            context = GlobalClientInfo.getContext();
        }
        String string = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString("oaid", "");
        oaid = string;
        return string;
    }

    public static void asyncGetOAID(final Context context, final APIRequestListener aPIRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2447094a", new Object[]{context, aPIRequestListener});
        } else {
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.utl.UtilityImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String a2 = bzj.a(context);
                        if (!StringUtils.isEmpty(a2)) {
                            UtilityImpl.access$002(a2);
                            APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit().putString("oaid", UtilityImpl.access$000()).apply();
                        }
                        if (aPIRequestListener != null) {
                            aPIRequestListener.onResult(UtilityImpl.access$000());
                        }
                        ALog.e(UtilityImpl.TAG, "getoaid = " + UtilityImpl.access$000(), new Object[0]);
                    } catch (Throwable th) {
                        ALog.e(UtilityImpl.TAG, "getOAID err", th, new Object[0]);
                    }
                }
            });
        }
    }

    public static boolean isAppKeepAlive(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8a7e954", new Object[]{context})).booleanValue();
        }
        kaq.a(context);
        return isAppKeepAlive();
    }

    public static boolean isAppKeepAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4d7b97c", new Object[0])).booleanValue();
        }
        if (isAppKeepAlive == null) {
            if (StringUtils.isEmpty(getOAID(GlobalClientInfo.getContext()))) {
                ALog.e(TAG, "empty oaid", new Object[0]);
                return false;
            }
            int appKeepAliveBucketId = getAppKeepAliveBucketId(GlobalClientInfo.getContext());
            if ("OPPO".equals(Build.BRAND)) {
                Pair<Integer, Integer> e = l.e();
                isAppKeepAlive = Boolean.valueOf(appKeepAliveBucketId >= ((Integer) e.first).intValue() && appKeepAliveBucketId <= ((Integer) e.second).intValue());
            } else {
                isAppKeepAlive = false;
            }
            ALog.e(TAG, "isAppKeepAlive = " + isAppKeepAlive, new Object[0]);
        }
        return isAppKeepAlive.booleanValue();
    }

    public static boolean isCurExperimentalBucket(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5af52ddd", new Object[]{context})).booleanValue();
        }
        int appKeepAliveBucketId = getAppKeepAliveBucketId(context);
        return "OPPO".equals(Build.BRAND) && (appKeepAliveBucketId == 95 || appKeepAliveBucketId == 96);
    }

    public static boolean isCurControlBucket(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d4b9e34", new Object[]{context})).booleanValue();
        }
        return "OPPO".equals(Build.BRAND) && getAppKeepAliveBucketId(context) == 98;
    }

    public static boolean needPeriodicReport(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1759c02a", new Object[]{context, str})).booleanValue();
        }
        if (isKeepAliveReport()) {
            long currentTimeMillis = System.currentTimeMillis() - context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getLong(str, 0L);
            if (currentTimeMillis > m.f() || currentTimeMillis < 0) {
                ALog.e(TAG, "needPeriodicReport return true", new Object[0]);
                return true;
            }
            ALog.e(TAG, "needPeriodicReport interval check failed", new Object[0]);
        } else {
            ALog.e(TAG, "needPeriodicReport keepAliveReport check failed", new Object[0]);
        }
        return false;
    }

    public static boolean isKeepAliveReport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abbdf09d", new Object[0])).booleanValue() : isAppKeepAlive() && gvk.a(gvk.a()) == -2 && m.m();
    }

    public static int getAppKeepAliveBucketId(Context context) {
        String oaid2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a042f2", new Object[]{context})).intValue();
        }
        if (keepAliveBucketId < 0) {
            try {
                if (StringUtils.isEmpty(getOAID(context))) {
                    return -1;
                }
                String l = m.l();
                if (StringUtils.isEmpty(l)) {
                    l = Build.BRAND.equals("vivo") ? "abtestlayer88" : "abtestlayer0";
                }
                String str = l + oaid2.toLowerCase();
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                char[] cArr = new char[digest.length << 1];
                int i = 0;
                for (byte b : digest) {
                    int i2 = i + 1;
                    cArr[i] = hexDigits[(b >>> 4) & 15];
                    i = i2 + 1;
                    cArr[i2] = hexDigits[b & 15];
                }
                String str2 = new String(cArr).hashCode() + "";
                keepAliveBucketId = Integer.parseInt(str2.substring(str2.length() - 2));
                ALog.e(TAG, "getAppKeepAliveBucketId", "bucketId", Integer.valueOf(keepAliveBucketId), "source", str);
            } catch (Throwable th) {
                ALog.e(TAG, "isAppKeepAlive err", th, new Object[0]);
            }
        }
        return keepAliveBucketId;
    }

    public static String getVersionName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("904e852c", new Object[]{context});
        }
        if (StringUtils.isEmpty(appVersionName)) {
            try {
                appVersionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                ALog.e(TAG, "getVersionName = " + appVersionName, new Object[0]);
            } catch (Exception e) {
                ALog.e(TAG, "getVersionName err", e, new Object[0]);
            }
        }
        return appVersionName;
    }

    public static boolean isReleaseAppVersion(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1597a6d1", new Object[]{context})).booleanValue();
        }
        Boolean bool = isReleaseApp;
        if (bool != null) {
            return bool.booleanValue();
        }
        String versionName = getVersionName(context);
        if (!StringUtils.isEmpty(versionName) && versionName.split("\\.").length <= 3) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        isReleaseApp = valueOf;
        return valueOf.booleanValue();
    }

    public static void saveAppKey(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("930822f0", new Object[]{context, str});
            return;
        }
        try {
            synchronized (mLock) {
                SharedPreferences sharedPreferences = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0);
                String string = sharedPreferences.getString("appkey", "");
                if (!StringUtils.isEmpty(str) && !string.equals(str) && !string.contains(str)) {
                    if (!StringUtils.isEmpty(string)) {
                        str = string + "|" + str;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("appkey", str);
                    edit.apply();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void clearSharePreferences(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85097cdb", new Object[]{context});
            return;
        }
        try {
            synchronized (mLock) {
                SharedPreferences sharedPreferences = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0);
                String string = sharedPreferences.getString("appkey", null);
                String string2 = sharedPreferences.getString("app_sercet", null);
                String string3 = sharedPreferences.getString(Constants.KEY_PROXY_HOST, null);
                int i = sharedPreferences.getInt(Constants.KEY_PROXY_PORT, -1);
                int i2 = sharedPreferences.getInt("version", -1);
                int i3 = sharedPreferences.getInt(Constants.SP_KEY_DEBUG_MODE, 0);
                SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
                edit.clear();
                if (!StringUtils.isEmpty(string)) {
                    edit.putString("appkey", string);
                }
                if (!StringUtils.isEmpty(string2)) {
                    edit.putString("app_sercet", string2);
                }
                if (!StringUtils.isEmpty(string3)) {
                    edit.putString(Constants.KEY_PROXY_HOST, string3);
                }
                if (i > 0) {
                    edit.putInt(Constants.KEY_PROXY_PORT, i);
                }
                if (i2 > 0) {
                    edit.putInt("version", i2);
                }
                if (i3 == 2 || i3 == 1) {
                    edit.putInt(Constants.SP_KEY_DEBUG_MODE, i3);
                }
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.e(TAG, "clearSharePreferences", th, new Object[0]);
        }
    }

    public static String getEmuiVersion() {
        Class<?>[] clsArr = {String.class};
        Object[] objArr = {com.alibaba.security.realidentity.m.v};
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", clsArr).invoke(cls, objArr);
            ALog.d(TAG, "getEmuiVersion", "result", str);
            return !StringUtils.isEmpty(str) ? str : "";
        } catch (Exception e) {
            ALog.e(TAG, "getEmuiVersion", e, new Object[0]);
            return "";
        }
    }

    public static final Map<String, String> getHeader(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aa0854b0", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!StringUtils.isEmpty(key)) {
                    String list2String = list2String(entry.getValue());
                    if (!StringUtils.isEmpty(list2String)) {
                        if (!key.startsWith(":")) {
                            key = key.toLowerCase(Locale.US);
                        }
                        hashMap.put(key, list2String);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public static final String list2String(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("341aaec3", new Object[]{list});
        }
        StringBuffer stringBuffer = new StringBuffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append(list.get(i));
            if (i < size - 1) {
                stringBuffer.append(",");
            }
        }
        return stringBuffer.toString();
    }

    public static String urlEncode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9986362a", new Object[]{str});
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static boolean isSameDay(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66eb7f17", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j2));
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static boolean isDualApp(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4380c38a", new Object[]{context})).booleanValue() : kap.e();
    }

    public static boolean isTestMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8301daa", new Object[0])).booleanValue();
        }
        d.a("accs", BaseMonitor.COUNT_FULL_VERIFY, "isTestMode", mto.a.GEO_NOT_SUPPORT);
        return ALog.isPrintLog(ALog.Level.I);
    }

    public static boolean isHarmonyOs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c5ec00b", new Object[0])).booleanValue();
        }
        if (isHarmonyOs == null) {
            try {
                Class.forName("ohos.utils.system.SystemCapability");
                isHarmonyOs = true;
            } catch (Exception unused) {
                isHarmonyOs = false;
            }
        }
        return isHarmonyOs.booleanValue();
    }

    public static synchronized String createRegId() {
        synchronized (UtilityImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("306263a6", new Object[0]);
            }
            return REG_ID_PREFIX + leftPadding(e.a(PADDING_RANDOM.nextInt(Integer.MAX_VALUE) + MIN), Boolean.TRUE.booleanValue(), 14) + leftPadding(leftPadding(e.a(ipToLong(PADDING_RANDOM.nextInt(256) + "." + PADDING_RANDOM.nextInt(256) + "." + PADDING_RANDOM.nextInt(256) + "." + PADDING_RANDOM.nextInt(256))), Boolean.FALSE.booleanValue(), 6), Boolean.TRUE.booleanValue(), 12) + leftPadding(e.a((long) PADDING_RANDOM.nextInt(3844)), Boolean.FALSE.booleanValue(), 2);
        }
    }

    private static String leftPadding(String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f3304d6", new Object[]{str, new Boolean(z), new Integer(i)});
        }
        int length = StringUtils.isEmpty(str) ? 0 : str.length();
        if (length >= i) {
            return str;
        }
        int i2 = i - length;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(z ? PADDING_DIGITS.charAt(PADDING_RANDOM.nextInt(62)) : PADDING);
        }
        sb.append(str);
        return sb.toString();
    }

    private static long ipToLong(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7463a3", new Object[]{str})).longValue();
        }
        String[] split = str.split("\\.");
        if (split.length == 4) {
            return ((Long.parseLong(split[0]) & 255) << 24) | ((Long.parseLong(split[1]) & 255) << 16) | ((Long.parseLong(split[2]) & 255) << 8) | (Long.parseLong(split[3]) & 255);
        }
        return 0L;
    }

    public static String getExceptionMsg(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ce619ba", new Object[]{th});
        }
        try {
            return th.toString() + "\n Cause:" + th.getCause();
        } catch (Throwable unused) {
            return th == null ? "null" : th.toString();
        }
    }

    public static void saveStringPairsToSp(Context context, String str, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d74a880d", new Object[]{context, str, pairArr});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, str, 0).edit();
            for (Pair<String, String> pair : pairArr) {
                edit.putString((String) pair.first, (String) pair.second);
            }
            edit.apply();
        } catch (Throwable th) {
            ALog.e(TAG, "saveStringPairsToSp err", th, new Object[0]);
        }
    }

    public static String getLanguageTag(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ae17c8b", new Object[]{context});
        }
        try {
            return com.alibaba.ability.localization.b.a().getTag();
        } catch (Throwable th) {
            ALog.e(TAG, "getLanguageTag err", th, new Object[0]);
            return "";
        }
    }

    public static String getSite(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f0ca29c", new Object[]{context});
        }
        try {
            return com.alibaba.ability.localization.b.d();
        } catch (Throwable th) {
            ALog.e(TAG, "getSite err", th, new Object[0]);
            return "";
        }
    }

    public static boolean isLanguageOrSiteChanged(String str, Context context) {
        String languageTag;
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6a81d53", new Object[]{str, context})).booleanValue();
        }
        try {
            languageTag = getLanguageTag(context);
            sharedPreferences = APreferencesManager.getSharedPreferences(context, str, 0);
        } catch (Throwable th) {
            ALog.e(TAG, "isLanguageOrSiteChanged", th, new Object[0]);
        }
        if (!sharedPreferences.getString(Constants.KEY_LANGUAGE_TAG, "").equals(languageTag)) {
            return true;
        }
        return !sharedPreferences.getString("site", "").equals(getSite(context));
    }
}
