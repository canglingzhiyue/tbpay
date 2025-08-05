package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UserLocation;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.File;
import tb.riy;

/* loaded from: classes3.dex */
public class MspConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile MspConfig f4789a;
    private String b = null;

    private MspConfig() {
    }

    public static MspConfig getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspConfig) ipChange.ipc$dispatch("d5eb2f8b", new Object[0]);
        }
        if (f4789a == null) {
            synchronized (MspConfig.class) {
                if (f4789a == null) {
                    f4789a = new MspConfig();
                }
            }
        }
        return f4789a;
    }

    public String getSdkUserAgent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9579c75", new Object[]{this, context});
        }
        String osInfo = DeviceInfo.getOsInfo();
        String kernelVersion = Utils.getKernelVersion();
        String defaultLocale = Utils.getDefaultLocale(context);
        String screenResolution = Utils.getScreenResolution(context);
        return " (" + osInfo + ";" + kernelVersion + ";" + defaultLocale + ";;" + screenResolution + ")(sdk android)";
    }

    public String getLastMspParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac8c0975", new Object[]{this});
        }
        if (this.b == null) {
            EventLogUtil.logPayEvent("1010970", "value", "use_cached_msp_param");
            Context context = GlobalHelper.getInstance().getContext();
            if (context != null) {
                this.b = context.getSharedPreferences(GlobalConstant.GLOBAL_SETTINGS, 0).getString(GlobalConstant.LAST_MSP_PARAMS, "");
            } else {
                LogUtil.record(4, "MspConfig:getLastMspParams", "ctx = null");
            }
        }
        return this.b;
    }

    public void updateLastMspParams(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94b942", new Object[]{this, str});
            return;
        }
        this.b = str;
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.helper.MspConfig.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    GlobalHelper.getInstance().getContext().getSharedPreferences(GlobalConstant.GLOBAL_SETTINGS, 0).edit().putString(GlobalConstant.LAST_MSP_PARAMS, str).apply();
                }
            }
        });
    }

    public String getLogsPathV2() {
        File filesDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0ceab3", new Object[]{this});
        }
        String str = null;
        try {
            Context context = GlobalHelper.getInstance().getContext();
            if (context != null && (filesDir = context.getFilesDir()) != null) {
                str = filesDir.getAbsolutePath();
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        String str2 = str + File.separator + "alipaymsp" + File.separator + "logs" + File.separator;
        LogUtil.record(2, "MspConfig:getLogsPathV2", "folder=".concat(String.valueOf(str2)));
        return str2;
    }

    public boolean isDebug() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue() : GlobalConstant.DEBUG;
    }

    public String getRsaPublicKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("315b872d", new Object[]{this});
        }
        LogUtil.record(4, "phonecashiermsp#publickey", "MspConfig.getRsaPublicKey", GlobalConstant.RSA_PUBLIC);
        return GlobalConstant.RSA_PUBLIC;
    }

    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || TextUtils.equals(str, GlobalConstant.RSA_PUBLIC)) {
        } else {
            PreferenceManager.getDefaultSharedPreferences(GlobalHelper.getInstance().getContext()).edit().putString(GlobalConstant.KEY_RSA, str).apply();
            GlobalConstant.RSA_PUBLIC = str;
            EventBusManager.getInstance().post(str, MspGlobalDefine.EVENT_PUBLIC_KEY_CHANGE);
            LogUtil.record(1, "MspConfig.setRsaPublicKey", "public_key:".concat(String.valueOf(str)));
        }
    }

    public String getPa(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a59bd46", new Object[]{this, context});
        }
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            sb.append(riy.BRACKET_START_STR);
            sb.append(packageName);
            sb.append(";");
            sb.append(packageInfo.versionName);
            sb.append(riy.BRACKET_END_STR);
            return sb.toString();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }

    public String getUserAgentByType(boolean z, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("82db69b5", new Object[]{this, new Boolean(z), new Integer(i)}) : getUserAgentByType(z, i, false);
    }

    public String getUserAgentByType(boolean z, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bcff1d7", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
        }
        Context context = GlobalHelper.getInstance().getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalSdkConstant.getMspVersion());
        sb.append(riy.BRACKET_START_STR);
        sb.append("a ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(";");
        sb.append("6;");
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspConfig.getUserAgentByType", "clientkey startPay msms");
        sb.append(TidStorage.getInstance().getClientKey());
        sb.append(";");
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspConfig.getUserAgentByType", "clientkey end msms");
        DeviceInfo deviceInfo = DeviceInfo.getInstance(context);
        sb.append(deviceInfo.getIMEI(context));
        sb.append(";");
        sb.append(deviceInfo.getIMSI(context));
        sb.append(";");
        sb.append(getVirtualImei());
        sb.append(";");
        sb.append(getVirtualImsi());
        sb.append(";");
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspConfig.getUserAgentByType", "net startPay msms");
        String name = DeviceInfo.getNetConnectionType().getName();
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspConfig.getUserAgentByType", "net end msms");
        sb.append(name);
        sb.append(";");
        String str = "";
        sb.append(z2 ? str : deviceInfo.getMacAddress(context));
        sb.append(";");
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspConfig.getUserAgentByType", "root startPay msms");
        boolean isDeviceRooted = Utils.isDeviceRooted();
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "MspConfig.getUserAgentByType", "root end msms");
        if (isDeviceRooted) {
            sb.append("1");
        } else {
            sb.append("0");
        }
        sb.append(";");
        sb.append(a(Build.MANUFACTURER));
        sb.append(";");
        sb.append(Build.MODEL);
        sb.append(riy.BRACKET_END_STR);
        if (i == 1) {
            sb.append("(1)");
            sb.append(riy.BRACKET_START_STR);
            sb.append(PhoneCashierMspEngine.getMspBase().getApdidToken(context));
            sb.append(riy.BRACKET_END_STR);
        } else if (i == 2) {
            sb.append("(2)");
            sb.append(riy.BRACKET_START_STR);
            sb.append(Utils.getDefaultLocale(context));
            sb.append(";");
            sb.append((z || z2) ? "-1;-1" : Utils.getCellInfo(context));
            sb.append(";");
            sb.append(z2 ? str : UserLocation.getLocationInfo());
            sb.append(";");
            sb.append(z2 ? str : a(b(DeviceInfo.getWifiSSID(context))));
            sb.append(";");
            if (!z2) {
                str = a(a(context));
            }
            sb.append(str);
            sb.append(riy.BRACKET_END_STR);
        }
        return sb.toString();
    }

    public String getClientKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ebb8d9db", new Object[]{this}) : TidStorage.getInstance().getClientKey();
    }

    public String getVimeiAndVimsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfb77498", new Object[]{this});
        }
        return getVirtualImei() + ";" + getVirtualImsi();
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : TextUtils.isEmpty(str) ? "" : str.replace(riy.BRACKET_START_STR, "（").replace(riy.BRACKET_END_STR, "）").replace(";", "；").replace("&", "");
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : !TextUtils.isEmpty(str) ? str.replaceAll(";", "").replaceAll(riy.MOD, "") : str;
    }

    public String getMemoUserCancel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bf426a24", new Object[]{this}) : LanguageHelper.localizedStringForKey("msp_memo_user_cancel", GlobalHelper.getInstance().getStringById(GlobalHelper.getInstance().getContext(), R.string.msp_memo_user_cancel), new Object[0]);
    }

    public boolean isSimImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d14b1072", new Object[]{this})).booleanValue();
        }
        Context context = GlobalHelper.getInstance().getContext();
        if (context != null) {
            return context.getSharedPreferences(GlobalConstant.GLOBAL_SETTINGS, 0).getBoolean("is_sim_imsi", false);
        }
        return false;
    }

    public boolean isSimNoImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dabc4a13", new Object[]{this})).booleanValue();
        }
        Context context = GlobalHelper.getInstance().getContext();
        if (context != null) {
            return context.getSharedPreferences(GlobalConstant.GLOBAL_SETTINGS, 0).getBoolean("is_sim_no_imsi", false);
        }
        return false;
    }

    public String getVirtualImei() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("945b09dc", new Object[]{this}) : TidStorage.getInstance().getVirtualImei();
    }

    public String getVirtualImsi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3116b6a", new Object[]{this}) : TidStorage.getInstance().getVirtualImsi();
    }

    private static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : DeviceInfo.getWifiSSID(context).replaceAll(";", "");
    }

    public String getUserAgentC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bbfada", new Object[]{this});
        }
        Context context = GlobalHelper.getInstance().getContext();
        return Utils.getDefaultLocale(context) + ";" + Utils.getCellInfo(context) + ";" + UserLocation.getLocationInfo() + ";" + a(b(DeviceInfo.getWifiSSID(context))) + ";" + a(a(context));
    }
}
