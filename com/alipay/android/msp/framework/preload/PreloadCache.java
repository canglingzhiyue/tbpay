package com.alipay.android.msp.framework.preload;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.UserLocation;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import java.util.HashMap;
import tb.riy;

/* loaded from: classes3.dex */
public class PreloadCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private long d;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, String> f4840a = new HashMap<>();
    private final HashMap<String, String> c = new HashMap<>();
    private long e = 60000;

    public synchronized void startCache(long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cf4b8b", new Object[]{this, new Long(j), context});
            return;
        }
        if (!this.b) {
            this.f4840a.put("ROOT", b());
            this.f4840a.put("LOCALE", Utils.getDefaultLocale(context));
            this.f4840a.put("UTDID", GlobalHelper.getInstance().getUtdid(context));
            this.f4840a.put("PA", MspConfig.getInstance().getPa(context));
            this.b = true;
        }
        this.c.put("HAS_ALIPAY", a(context));
        this.c.put("HAS_CERTPAY", b(context));
        this.c.put("NET_TYPE", DeviceInfo.getNetConnectionType().getName());
        String c = c();
        this.c.put("CHECK_USERID", c);
        this.c.put("VIDATA", b(c));
        this.d = SystemClock.elapsedRealtime();
        this.e = j;
        if (GlobalHelper.getInstance().getContext() == null) {
            GlobalHelper.getInstance().init(context);
        }
        TidStorage.getInstance();
        DeviceInfo.getInstance(context);
    }

    public String assembleLog(HashMap<String, String> hashMap, Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acb7dad2", new Object[]{this, hashMap, context});
        }
        String[] strArr = {"UTDID", "ROOT", "LOCALE", "WIFI_SSID", "WIFI_BSSID", "NET_TYPE", "WIFI_OBJ", "CELL_OBJ", "MAC_ADDRESS", "DEVICE_NAME", "LAC", "VIDATA", "HAS_ALIPAY", "HAS_CERTPAY", "PA", "BP"};
        String str2 = "0";
        if (hashMap != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 16; i++) {
                String str3 = hashMap.get(strArr[i]);
                if (StringUtils.isEmpty(str3)) {
                    str3 = str2;
                }
                sb.append(str3);
            }
            str = sb.toString();
        } else {
            str = EncryptUtils.IV_PARAMETER_SPEC;
        }
        StringBuilder sb2 = new StringBuilder("1");
        if (!DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_PRELOAD_NETWORK, false, context)) {
            str2 = "1";
        }
        sb2.append(str2);
        String sb3 = sb2.toString();
        return "V1(" + sb3 + "|" + str + riy.BRACKET_END_STR;
    }

    public String getCachedUserAgentByTypeV2(HashMap<String, String> hashMap, boolean z, String str) {
        String name;
        String str2;
        IpChange ipChange = $ipChange;
        char c = 2;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebb891bf", new Object[]{this, hashMap, new Boolean(z), str});
        }
        if (!StringUtils.isEmpty(str) && str.length() > 15) {
            c = 1;
        }
        Context context = GlobalHelper.getInstance().getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalSdkConstant.getMspVersion());
        sb.append(riy.BRACKET_START_STR);
        sb.append("a ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(";");
        sb.append("6;");
        sb.append("(a);");
        DeviceInfo deviceInfo = DeviceInfo.getInstance(context);
        sb.append(deviceInfo.getIMEI(context));
        sb.append(";");
        sb.append(deviceInfo.getIMSI(context));
        sb.append(";");
        sb.append("(b);");
        String str3 = this.c.get("NET_TYPE");
        String str4 = "0";
        if (StringUtils.isEmpty(str3) || a()) {
            name = DeviceInfo.getNetConnectionType().getName();
            str2 = str4;
        } else {
            name = str3;
            str2 = "1";
        }
        if (hashMap != null) {
            hashMap.put("NET_TYPE", str2);
        }
        sb.append(name);
        sb.append(";");
        sb.append(z ? "" : deviceInfo.getMacAddress(context));
        sb.append(";");
        String str5 = this.f4840a.get("ROOT");
        if (StringUtils.isEmpty(str5)) {
            str5 = b();
        } else {
            str4 = "1";
        }
        if (hashMap != null) {
            hashMap.put("ROOT", str4);
        }
        sb.append(str5);
        sb.append(";");
        sb.append("(c)");
        sb.append(riy.BRACKET_END_STR);
        if (c == 1) {
            sb.append("(1)");
            sb.append(riy.BRACKET_START_STR);
            sb.append(PhoneCashierMspEngine.getMspBase().getApdidToken(context));
            sb.append(riy.BRACKET_END_STR);
        }
        return sb.toString();
    }

    public String getCachedManufacturerAndModel(boolean z, HashMap<String, String> hashMap, boolean z2, String str) {
        String str2;
        String str3;
        String str4;
        String wifiSSID;
        String str5;
        String a2;
        String str6;
        IpChange ipChange = $ipChange;
        char c = 1;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("242d1b63", new Object[]{this, new Boolean(z), hashMap, new Boolean(z2), str});
        }
        if (StringUtils.isEmpty(str) || str.length() <= 15) {
            c = 2;
        }
        Context context = GlobalHelper.getInstance().getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(a(Build.MANUFACTURER));
        sb.append(";");
        sb.append(Build.MODEL);
        if (c == 2) {
            sb.append(riy.BRACKET_END_STR);
            sb.append("(2)");
            sb.append(riy.BRACKET_START_STR);
            String str7 = this.f4840a.get("LOCALE");
            String str8 = "0";
            if (StringUtils.isEmpty(str7)) {
                str2 = Utils.getDefaultLocale(context);
                str3 = str8;
            } else {
                str2 = str7;
                str3 = "1";
            }
            if (hashMap != null) {
                hashMap.put("LOCALE", str3);
            }
            sb.append(str2);
            sb.append(";");
            if (z || z2) {
                str4 = "-1;-1";
            } else {
                String str9 = this.c.get("LAC");
                if (StringUtils.isEmpty(str9) || a()) {
                    str4 = Utils.getCellInfo(context);
                    str6 = str8;
                } else {
                    str4 = str9;
                    str6 = "1";
                }
                if (hashMap != null) {
                    hashMap.put("LAC", str6);
                }
            }
            sb.append(str4);
            sb.append(";");
            String str10 = "";
            sb.append(z2 ? str10 : UserLocation.getLocationInfo());
            sb.append(";");
            if (z2) {
                a2 = str10;
            } else {
                String str11 = this.c.get("WIFI_SSID");
                if (StringUtils.isEmpty(str11) || a()) {
                    wifiSSID = DeviceInfo.getWifiSSID(context);
                    str5 = str8;
                } else {
                    wifiSSID = str11;
                    str5 = "1";
                }
                if (hashMap != null) {
                    hashMap.put("WIFI_SSID", str5);
                }
                if (!StringUtils.isEmpty(wifiSSID)) {
                    wifiSSID = wifiSSID.replaceAll(";", str10);
                }
                a2 = a(wifiSSID);
            }
            sb.append(a2);
            sb.append(";");
            if (!z2) {
                String str12 = this.c.get("WIFI_BSSID");
                if (StringUtils.isEmpty(str12) || a()) {
                    String wifiSSID2 = DeviceInfo.getWifiSSID(context);
                    str12 = !StringUtils.isEmpty(wifiSSID2) ? wifiSSID2.replaceAll(";", str10) : "-1";
                } else {
                    str8 = "1";
                }
                if (hashMap != null) {
                    hashMap.put("WIFI_BSSID", str8);
                }
                str10 = a(str12);
            }
            sb.append(str10);
        }
        return sb.toString();
    }

    public String getCachedUtdid(HashMap<String, String> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fce93c9c", new Object[]{this, hashMap});
        }
        String str2 = this.f4840a.get("UTDID");
        if (StringUtils.isEmpty(str2)) {
            str2 = GlobalHelper.getInstance().getUtdid(GlobalHelper.getInstance().getContext());
            str = "0";
        } else {
            str = "1";
        }
        if (hashMap != null) {
            hashMap.put("UTDID", str);
        }
        return str2;
    }

    public String getCachedPa(HashMap<String, String> hashMap, Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8587119b", new Object[]{this, hashMap, context});
        }
        String str2 = this.f4840a.get("PA");
        if (StringUtils.isEmpty(str2)) {
            str2 = MspConfig.getInstance().getPa(context);
            str = "0";
        } else {
            str = "1";
        }
        if (hashMap != null) {
            hashMap.put("PA", str);
        }
        return str2;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : StringUtils.isEmpty(str) ? "" : str.replace(riy.BRACKET_START_STR, "（").replace(riy.BRACKET_END_STR, "）").replace(";", "；");
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : SystemClock.elapsedRealtime() - this.d > this.e;
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : Utils.isDeviceRooted() ? "1" : "0";
    }

    private static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : DeviceInfo.hasAlipayWallet(context) ? "1" : "0";
    }

    public String getCachedHasAlipayString(Context context, HashMap<String, String> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74c95011", new Object[]{this, context, hashMap});
        }
        String str2 = this.c.get("HAS_ALIPAY");
        if (StringUtils.isEmpty(str2) || a()) {
            str2 = a(context);
            str = "0";
        } else {
            str = "1";
        }
        if (hashMap != null) {
            hashMap.put("HAS_ALIPAY", str);
        }
        return str2;
    }

    private static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        try {
            return PhoneCashierMspEngine.getMspWallet().getUserId();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : DeviceInfo.isSupportCertPay(context) ? "1" : "0";
    }

    public String getCachedVIData(String str, HashMap<String, String> hashMap) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb218033", new Object[]{this, str, hashMap});
        }
        String str3 = this.c.get("VIDATA");
        this.c.get("CHECK_USERID");
        if (StringUtils.isEmpty(str3) || a()) {
            str3 = b(str);
            str2 = "0";
        } else {
            str2 = "1";
        }
        if (hashMap != null) {
            hashMap.put("VIDATA", str2);
        }
        return str3;
    }

    public String getCachedHasCertPayString(Context context, HashMap<String, String> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fc6357b", new Object[]{this, context, hashMap});
        }
        String str2 = this.c.get("HAS_CERTPAY");
        if (StringUtils.isEmpty(str2) || a()) {
            str2 = b(context);
            str = "0";
        } else {
            str = "1";
        }
        if (hashMap != null) {
            hashMap.put("HAS_CERTPAY", str);
        }
        return str2;
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        try {
            return PhoneCashierMspEngine.getMspViSec().getVIData(str);
        } catch (Exception unused) {
            return "";
        }
    }
}
