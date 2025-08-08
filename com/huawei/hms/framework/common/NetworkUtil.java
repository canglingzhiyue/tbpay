package com.huawei.hms.framework.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.UserManager;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.HwTelephonyManager;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.huawei.android.os.BuildEx;
import com.huawei.android.telephony.ServiceStateEx;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class NetworkUtil {
    private static final int INVALID_RSSI = -127;
    private static final String STR_NSA = "5G_NSA";
    private static final String STR_SA = "5G_SA";
    private static final String TAG = "NetworkUtil";
    private static final int TYPE_WIFI_P2P = 13;
    public static final int UNAVAILABLE = Integer.MAX_VALUE;

    /* loaded from: classes4.dex */
    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    /* loaded from: classes4.dex */
    public static final class SignalType {
        public static final String LTE_CQI = "lteCqi";
        public static final String LTE_DBM = "lteDbm";
        public static final String LTE_RSRP = "lteRsrp";
        public static final String LTE_RSRQ = "lteRsrq";
        public static final String LTE_RSSI = "lteRssi";
        public static final String LTE_RSSNR = "lteRssnr";
        public static final String NR_CSIRSRP = "nrCSIRsrp";
        public static final String NR_CSIRSRQ = "nrCSIRsrq";
        public static final String NR_CSISINR = "nrCSISinr";
        public static final String NR_DBM = "nrDbm";
        public static final String NR_SSRSRP = "nrSSRsrp";
        public static final String NR_SSRSRQ = "nrSSRsrq";
        public static final String NR_SSSINR = "nrSSSinr";
    }

    public static String getDnsServerIps(Context context) {
        return Arrays.toString(getDnsServerIpsFromConnectionManager(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] getDnsServerIpsFromConnectionManager(android.content.Context r10) {
        /*
            java.lang.String r0 = "getActiveNetworkInfo failed, exception:"
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r4 = 21
            if (r2 < r4) goto L87
            if (r10 == 0) goto L87
            java.lang.String r2 = "connectivity"
            java.lang.Object r10 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r10, r2)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            if (r10 == 0) goto L87
            android.net.NetworkInfo r2 = r10.getActiveNetworkInfo()     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            if (r2 == 0) goto L87
            android.net.Network[] r4 = r10.getAllNetworks()     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            int r5 = r4.length     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            r6 = 0
        L26:
            if (r6 >= r5) goto L87
            r7 = r4[r6]     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            if (r7 == 0) goto L5e
            android.net.NetworkInfo r8 = r10.getNetworkInfo(r7)     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            if (r8 == 0) goto L5e
            int r8 = r8.getType()     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            int r9 = r2.getType()     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            if (r8 != r9) goto L5e
            android.net.LinkProperties r7 = r10.getLinkProperties(r7)     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            if (r7 == 0) goto L5e
            java.util.List r7 = r7.getDnsServers()     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
        L4a:
            boolean r8 = r7.hasNext()     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            if (r8 == 0) goto L5e
            java.lang.Object r8 = r7.next()     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            java.net.InetAddress r8 = (java.net.InetAddress) r8     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            java.lang.String r8 = r8.getHostAddress()     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            r1.add(r8)     // Catch: java.lang.RuntimeException -> L61 java.lang.SecurityException -> L6a
            goto L4a
        L5e:
            int r6 = r6 + 1
            goto L26
        L61:
            r10 = move-exception
            java.lang.String r2 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L72
        L6a:
            r10 = move-exception
            java.lang.String r2 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L72:
            r4.append(r0)
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            com.huawei.hms.framework.common.Logger.i(r2, r10)
        L87:
            boolean r10 = r1.isEmpty()
            if (r10 == 0) goto L90
            java.lang.String[] r10 = new java.lang.String[r3]
            return r10
        L90:
            int r10 = r1.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r10 = r1.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.NetworkUtil.getDnsServerIpsFromConnectionManager(android.content.Context):java.lang.String[]");
    }

    public static String getHost(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new URI(str).getHost();
        } catch (URISyntaxException e) {
            Logger.w(TAG, e.getClass().getSimpleName());
            return "";
        }
    }

    private static int getHwNetworkType(Context context) {
        TelephonyManager telephonyManager;
        String str;
        String str2;
        ServiceState serviceState;
        if (!ReflectionUtils.checkCompatible(EmuiUtil.BUILDEX_VERSION) || context == null || (telephonyManager = (TelephonyManager) ContextCompat.getSystemService(context, "phone")) == null) {
            return 0;
        }
        try {
            if (BuildEx.VERSION.EMUI_SDK_INT >= 21 && (serviceState = telephonyManager.getServiceState()) != null) {
                return ServiceStateEx.getConfigRadioTechnology(serviceState);
            }
            return 0;
        } catch (NoClassDefFoundError unused) {
            str = TAG;
            str2 = "NoClassDefFoundError occur in method getHwNetworkType.";
            Logger.w(str, str2);
            return 0;
        } catch (NoSuchMethodError unused2) {
            str = TAG;
            str2 = "NoSuchMethodError occur in method getHwNetworkType.";
            Logger.w(str, str2);
            return 0;
        } catch (SecurityException unused3) {
            str = TAG;
            str2 = "requires permission maybe missing.";
            Logger.w(str, str2);
            return 0;
        }
    }

    public static int getInfoWithReflect(SignalStrength signalStrength, String str) {
        String str2;
        StringBuilder sb;
        String str3;
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return Integer.MAX_VALUE;
            }
            final Method declaredMethod = SignalStrength.class.getDeclaredMethod(str, new Class[0]);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.NetworkUtil.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    declaredMethod.setAccessible(true);
                    return null;
                }
            });
            return ((Integer) declaredMethod.invoke(signalStrength, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            str2 = TAG;
            sb = new StringBuilder();
            sb.append(str);
            str3 = " : cannot access";
            sb.append(str3);
            Logger.i(str2, sb.toString());
            return Integer.MAX_VALUE;
        } catch (NoSuchMethodException unused2) {
            str2 = TAG;
            sb = new StringBuilder();
            sb.append(str);
            str3 = " : function not found";
            sb.append(str3);
            Logger.i(str2, sb.toString());
            return Integer.MAX_VALUE;
        } catch (InvocationTargetException unused3) {
            str2 = TAG;
            sb = new StringBuilder();
            sb.append(str);
            str3 = " : InvocationTargetException";
            sb.append(str3);
            Logger.i(str2, sb.toString());
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            String str4 = TAG;
            Logger.i(str4, str + " : throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteCqi(Context context) {
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteCqi: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return getInfoWithReflect(signalStrength, "getLteCqi");
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRsrp(Context context) {
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRsrp: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return getInfoWithReflect(signalStrength, "getLteRsrp");
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRsrq(Context context) {
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRsrq: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return getInfoWithReflect(signalStrength, "getLteRsrq");
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssi(Context context) {
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                }
            }
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRssi: throwable:" + th.getClass());
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssnr(Context context) {
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRssnr: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28) {
            return getInfoWithReflect(signalStrength, "getLteRssnr");
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
        }
        return Integer.MAX_VALUE;
    }

    public static Map<String, Integer> getLteSignalInfo(Context context) {
        HashMap hashMap = new HashMap();
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return hashMap;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    hashMap.put(SignalType.LTE_DBM, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getDbm()));
                    hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp()));
                    hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq()));
                    hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr()));
                    hashMap.put(SignalType.LTE_CQI, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi()));
                    hashMap.put(SignalType.LTE_RSSI, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi()));
                }
            } else {
                hashMap.put(SignalType.LTE_DBM, Integer.valueOf(getInfoWithReflect(signalStrength, "getDbm")));
                hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRsrp")));
                hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRsrq")));
                hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRssnr")));
                hashMap.put(SignalType.LTE_CQI, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteCqi")));
            }
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRssi: throwable:" + th.getClass());
        }
        return hashMap;
    }

    public static String getMNC(Context context) {
        if (context != null && isSimReady(context)) {
            TelephonyManager telephonyManager = null;
            Object systemService = ContextCompat.getSystemService(context, "phone");
            if (systemService instanceof TelephonyManager) {
                telephonyManager = (TelephonyManager) systemService;
            }
            if (telephonyManager == null) {
                Logger.e(TAG, "getSubscriptionOperatorType: other error!");
                return "unknown";
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            return ("46001".equals(networkOperator) || "46006".equals(networkOperator) || "46009".equals(networkOperator)) ? "China_Unicom" : ("46000".equals(networkOperator) || "46002".equals(networkOperator) || "46004".equals(networkOperator) || "46007".equals(networkOperator)) ? "China_Mobile" : ("46003".equals(networkOperator) || "46005".equals(networkOperator) || "46011".equals(networkOperator)) ? "China_Telecom" : "other";
        }
        return "unknown";
    }

    public static int getMobileRsrp(Context context) {
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
            return Build.VERSION.SDK_INT > 28 ? getMobileSingalStrengthUpPPlatfrom(context) : getInfoWithReflect(signalStrength, "getDbm");
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getDbm: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    private static int getMobileSingalStrengthUpPPlatfrom(Context context) {
        SignalStrength signalStrength;
        int i = Integer.MAX_VALUE;
        if (Build.VERSION.SDK_INT > 28 && (signalStrength = getSignalStrength(context)) != null) {
            int networkType = getNetworkType(context);
            try {
            } catch (Throwable th) {
                String str = TAG;
                Logger.i(str, "getMobileSingalStrength: throwable:" + th.getClass());
            }
            if (networkType == 3) {
                List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthCdma.class);
                if (cellSignalStrengths.size() > 0) {
                    i = ((CellSignalStrengthCdma) cellSignalStrengths.get(0)).getDbm();
                } else {
                    List cellSignalStrengths2 = signalStrength.getCellSignalStrengths(CellSignalStrengthTdscdma.class);
                    if (cellSignalStrengths2.size() > 0) {
                        i = ((CellSignalStrengthTdscdma) cellSignalStrengths2.get(0)).getDbm();
                    } else {
                        List cellSignalStrengths3 = signalStrength.getCellSignalStrengths(CellSignalStrengthWcdma.class);
                        if (cellSignalStrengths3.size() > 0) {
                            i = ((CellSignalStrengthWcdma) cellSignalStrengths3.get(0)).getDbm();
                        }
                    }
                }
            } else if (networkType != 4) {
                if (networkType == 5) {
                    List cellSignalStrengths4 = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
                    if (cellSignalStrengths4.size() > 0) {
                        i = ((CellSignalStrengthNr) cellSignalStrengths4.get(0)).getDbm();
                    }
                }
                return i;
            } else {
                List cellSignalStrengths5 = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths5.size() > 0) {
                    i = ((CellSignalStrengthLte) cellSignalStrengths5.get(0)).getDbm();
                }
            }
            return i;
        }
        return Integer.MAX_VALUE;
    }

    public static String getNetWorkNSAorSA() {
        try {
            HwTelephonyManager hwTelephonyManager = HwTelephonyManager.getDefault();
            int default4GSlotId = hwTelephonyManager.getDefault4GSlotId();
            String str = TAG;
            Logger.v(str, "phoneId " + default4GSlotId);
            boolean isNsaState = hwTelephonyManager.isNsaState(default4GSlotId);
            String str2 = TAG;
            Logger.v(str2, "isNsa " + isNsaState);
            return isNsaState ? STR_NSA : STR_SA;
        } catch (Throwable unused) {
            Logger.v(TAG, "isNsaState error");
            return null;
        }
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (RuntimeException e) {
            String str = TAG;
            Logger.i(str, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName() + e.getMessage());
            return null;
        }
    }

    public static NetworkInfo.DetailedState getNetworkStatus(Context context) {
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                try {
                    if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                        return detailedState;
                    }
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        detailedState = activeNetworkInfo.getDetailedState();
                    } else {
                        Logger.i(TAG, "getNetworkStatus networkIsConnected netInfo is null!");
                    }
                } catch (RuntimeException e) {
                    String str = TAG;
                    Logger.i(str, "getNetworkStatus exception" + e.getClass().getSimpleName() + e.getMessage());
                }
            } else {
                Logger.i(TAG, "getNetworkStatus ConnectivityManager is null!");
            }
        }
        return detailedState;
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        return getNetworkType(networkInfo, null);
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        if (1 == type || 13 == type) {
            return 1;
        }
        if (type == 0) {
            int hwNetworkType = getHwNetworkType(context);
            String str = TAG;
            Logger.v(str, "getHwNetworkType return is: " + hwNetworkType);
            if (hwNetworkType == 0) {
                hwNetworkType = networkInfo.getSubtype();
            }
            if (hwNetworkType != 20) {
                switch (hwNetworkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        i = 2;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        i = 3;
                        break;
                    case 13:
                        i = 4;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 5;
            }
            if (i != 0 || Build.VERSION.SDK_INT < 25) {
                return i;
            }
            if (hwNetworkType == 16) {
                return 2;
            }
            if (hwNetworkType == 17) {
                return 3;
            }
        }
        return 0;
    }

    public static int getNrCsiRsrp(Context context) {
        SignalStrength signalStrength;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrCsiRsrp: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrp();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiRsrq(Context context) {
        SignalStrength signalStrength;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrCsiRsrq: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrq();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiSinr(Context context) {
        SignalStrength signalStrength;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrCsiSinr: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiSinr();
        }
        return Integer.MAX_VALUE;
    }

    public static Map<String, Integer> getNrSignalInfo(Context context) {
        HashMap hashMap = new HashMap();
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return hashMap;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
                if (cellSignalStrengths.size() > 0) {
                    hashMap.put(SignalType.NR_DBM, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getDbm()));
                    hashMap.put(SignalType.NR_CSIRSRP, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrp()));
                    hashMap.put(SignalType.NR_CSIRSRQ, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrq()));
                    hashMap.put(SignalType.NR_CSISINR, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiSinr()));
                    hashMap.put(SignalType.NR_SSRSRP, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrp()));
                    hashMap.put(SignalType.NR_SSRSRQ, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrq()));
                    hashMap.put(SignalType.NR_SSSINR, Integer.valueOf(((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsSinr()));
                }
            }
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getLteRssi: throwable:" + th.getClass());
        }
        return hashMap;
    }

    public static int getNrSsRsrp(Context context) {
        SignalStrength signalStrength;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrSsRsrp: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrp();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsRsrq(Context context) {
        SignalStrength signalStrength;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrSsRsrq: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrq();
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsSinr(Context context) {
        SignalStrength signalStrength;
        try {
        } catch (Throwable th) {
            String str = TAG;
            Logger.i(str, "getNrSsSinr: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        List cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            return ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsSinr();
        }
        return Integer.MAX_VALUE;
    }

    public static int getPrimaryNetworkType(Context context) {
        return groupNetworkType(getNetworkType(getNetworkInfo(context), context));
    }

    public static int getPrimaryNetworkType(NetworkInfo networkInfo) {
        return groupNetworkType(getNetworkType(networkInfo));
    }

    private static SignalStrength getSignalStrength(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        if (!(systemService instanceof TelephonyManager)) {
            return null;
        }
        return ((TelephonyManager) systemService).createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId()).getSignalStrength();
    }

    public static String getWifiGatewayIp(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
            if (!(systemService instanceof WifiManager)) {
                return " ";
            }
            try {
                int i = ((WifiManager) systemService).getDhcpInfo().gateway;
                return InetAddress.getByAddress(new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >>> 24)}).getHostAddress();
            } catch (RuntimeException | UnknownHostException e) {
                String str = TAG;
                Logger.i(str, "getWifiGatewayIp error!" + e.getClass().getSimpleName() + e.getMessage());
                return " ";
            }
        }
        return " ";
    }

    public static int getWifiRssi(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
            if (!(systemService instanceof WifiManager)) {
                return INVALID_RSSI;
            }
            try {
                WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
                return (connectionInfo == null || connectionInfo.getBSSID() == null) ? INVALID_RSSI : connectionInfo.getRssi();
            } catch (RuntimeException e) {
                String str = TAG;
                Logger.i(str, "getWifiRssiLevel did not has permission!" + e.getClass().getSimpleName() + e.getMessage());
                return INVALID_RSSI;
            }
        }
        return INVALID_RSSI;
    }

    public static int getWifiRssiLevel(Context context) {
        return WifiManager.calculateSignalLevel(getWifiRssi(context), 5);
    }

    private static int groupNetworkType(int i) {
        if (i != -1) {
            if (i == 1) {
                return 1;
            }
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 6 : 0;
        }
        return -1;
    }

    public static boolean isChangeToConnected(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if ((networkInfo == null || !networkInfo.isConnected()) && networkInfo2.isConnected()) {
            Logger.v(TAG, "Find network state changed to connected");
            return true;
        }
        return false;
    }

    public static boolean isConnectTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo2.isConnected() || getPrimaryNetworkType(networkInfo) == getPrimaryNetworkType(networkInfo2)) {
            return false;
        }
        Logger.v(TAG, "Find activity network changed");
        return true;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return ActivityUtil.isForeground(context);
    }

    public static boolean isNetworkAvailable(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo networkInfo = getNetworkInfo(context);
            return networkInfo != null && networkInfo.isConnected();
        }
        return true;
    }

    public static boolean isSimReady(Context context) {
        Object systemService = ContextCompat.getSystemService(context, "phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }

    public static boolean isUserUnlocked(Context context) {
        UserManager userManager;
        if (Build.VERSION.SDK_INT < 24 || (userManager = (UserManager) ContextCompat.getSystemService(context, "user")) == null) {
            return true;
        }
        try {
            return userManager.isUserUnlocked();
        } catch (RuntimeException e) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
            return true;
        }
    }

    public static int netWork(Context context) {
        int networkType = getNetworkType(context);
        String str = TAG;
        Logger.v(str, "newWorkType " + networkType);
        if (networkType == 4) {
            if (!StringUtils.equals(STR_NSA, getNetWorkNSAorSA())) {
                return networkType;
            }
            return 7;
        } else if (networkType == 5 && StringUtils.equals(STR_SA, getNetWorkNSAorSA())) {
            return 8;
        } else {
            return networkType;
        }
    }

    @Deprecated
    public static NetworkInfo.DetailedState networkStatus(Context context) {
        return getNetworkStatus(context);
    }

    public static int readDataSaverMode(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 24 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                try {
                    if (connectivityManager.isActiveNetworkMetered()) {
                        return connectivityManager.getRestrictBackgroundStatus();
                    }
                    Logger.v(TAG, "ConnectType is not Mobile Network!");
                } catch (RuntimeException e) {
                    Logger.e(TAG, "SystemServer error:", e);
                }
            }
        }
        return 0;
    }
}
