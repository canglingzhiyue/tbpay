package com.android.taobao.aop;

import android.os.Build;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes3.dex */
public class ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String sDeviceID;
    public static boolean sGetDeviceChecked;
    public static boolean sGetImeiChecked;
    public static boolean sGetMeidChecked;
    public static boolean sGetSimSerialNumberChecked;
    public static boolean sGetsSubscriberIdChecked;
    public static String sImei;
    public static String sMeid;
    public static String sSimSerialNumber;
    public static String sSubscriberId;

    static {
        kge.a(-680253509);
        sGetDeviceChecked = false;
        sGetImeiChecked = false;
        sGetSimSerialNumberChecked = false;
        sGetMeidChecked = false;
        sGetsSubscriberIdChecked = false;
    }

    public static String proxy_getDeviceId(TelephonyManager telephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c346000", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetDeviceChecked) {
            return sDeviceID;
        }
        if (telephonyManager != null) {
            try {
                sDeviceID = telephonyManager.getDeviceId();
            } catch (SecurityException unused) {
            }
        }
        sGetDeviceChecked = true;
        return sDeviceID;
    }

    public static String proxy_getDeviceId(TelephonyManager telephonyManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abd6889d", new Object[]{telephonyManager, new Integer(i)});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetDeviceChecked) {
            return sDeviceID;
        }
        if (telephonyManager != null) {
            try {
                sDeviceID = telephonyManager.getDeviceId(i);
            } catch (SecurityException unused) {
            }
        }
        sGetDeviceChecked = true;
        return sDeviceID;
    }

    private static boolean limitedOS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bee13689", new Object[0])).booleanValue() : Globals.getApplication().getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29;
    }

    public static int proxy_getNetworkType(TelephonyManager telephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81dc93a0", new Object[]{telephonyManager})).intValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (telephonyManager != null) {
                    return telephonyManager.getDataNetworkType();
                }
            } else if (telephonyManager != null) {
                return telephonyManager.getNetworkType();
            }
        } catch (SecurityException unused) {
        }
        return 0;
    }

    public static String proxy_getImei(TelephonyManager telephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5248a6a9", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetImeiChecked) {
            return sImei;
        }
        if (telephonyManager != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    sImei = telephonyManager.getImei();
                }
            } catch (SecurityException unused) {
            }
        }
        sGetImeiChecked = true;
        return sImei;
    }

    public static String proxy_getMeid(TelephonyManager telephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e368d1e", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetMeidChecked) {
            return sMeid;
        }
        if (telephonyManager != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    sMeid = telephonyManager.getMeid();
                }
            } catch (SecurityException unused) {
            }
        }
        sGetMeidChecked = true;
        return sMeid;
    }

    public static String proxy_getSimSerialNumber(TelephonyManager telephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6a26547", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetSimSerialNumberChecked) {
            return sSimSerialNumber;
        }
        if (telephonyManager != null) {
            try {
                sSimSerialNumber = telephonyManager.getSimSerialNumber();
            } catch (SecurityException unused) {
            }
        }
        sGetSimSerialNumberChecked = true;
        return sSimSerialNumber;
    }

    public static String proxy_getSubscriberId(TelephonyManager telephonyManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d485892e", new Object[]{telephonyManager});
        }
        if (limitedOS()) {
            return null;
        }
        if (sGetsSubscriberIdChecked) {
            return sSubscriberId;
        }
        if (telephonyManager != null) {
            try {
                sSubscriberId = telephonyManager.getSubscriberId();
            } catch (SecurityException unused) {
            }
        }
        sGetsSubscriberIdChecked = true;
        return sSubscriberId;
    }
}
