package com.taobao.tao.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.preference.AppPreference;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes8.dex */
public class NetWorkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREF_VALUE_KEY_LOW_NETWORK_MODE = "pvk_low_network_mode";
    private static boolean firstRead;
    private static boolean lowNetworkMode;

    /* loaded from: classes8.dex */
    public enum ConnectType {
        CONNECT_TYPE_WIFI,
        CONNECT_TYPE_MOBILE,
        CONNECT_TYPE_OTHER,
        CONNECT_TYPE_DISCONNECT
    }

    /* loaded from: classes8.dex */
    public enum MobileNetworkType {
        MOBILE_NETWORK_TYPE_2G,
        MOBILE_NETWORK_TYPE_3G,
        MOBILE_NETWORK_TYPE_4G,
        MOBILE_NETWORK_TYPE_UNKNOWN
    }

    public static boolean isNetworkAvailable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue() : NetworkStatusHelper.isConnected();
    }

    public static String GetNetworkType(Context context) {
        NetworkInfo[] allNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8d44f91", new Object[]{context});
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
            return null;
        }
        for (int i = 0; i < allNetworkInfo.length; i++) {
            if (allNetworkInfo[i] != null && ((state = allNetworkInfo[i].getState()) == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                String extraInfo = allNetworkInfo[i].getExtraInfo();
                return allNetworkInfo[i].getTypeName() + " " + allNetworkInfo[i].getSubtypeName() + extraInfo;
            }
        }
        return null;
    }

    static {
        kge.a(1925133968);
        firstRead = true;
        lowNetworkMode = false;
    }

    @Deprecated
    public static boolean isLowNetworkMode(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("269c95be", new Object[]{context})).booleanValue();
        }
        if (firstRead) {
            updateIsLowNetworkMode(getConnectType(context));
            firstRead = false;
        }
        String str = "isLowNetworkMode = " + lowNetworkMode;
        return lowNetworkMode;
    }

    @Deprecated
    public static boolean isLowendPhone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f7e6f28", new Object[0])).booleanValue();
        }
        int numCores = getNumCores();
        int totalRAM = getTotalRAM();
        String str = "processorCore = " + numCores + " ram = " + totalRAM + " MB";
        return numCores == 1 && totalRAM < 800;
    }

    @Deprecated
    public static void updateIsLowNetworkMode(ConnectType connectType) {
        MobileNetworkType mobileNetworkType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe5b156", new Object[]{connectType});
            return;
        }
        String str = "updateIsLowNetworkMode:currentConnectType = " + connectType;
        if (AppPreference.getBoolean(PREF_VALUE_KEY_LOW_NETWORK_MODE, true)) {
            if (isLowendPhone()) {
                setLowNetworkMode(true);
                return;
            } else if (connectType == ConnectType.CONNECT_TYPE_MOBILE && ((mobileNetworkType = getMobileNetworkType(Globals.getApplication())) == MobileNetworkType.MOBILE_NETWORK_TYPE_2G || mobileNetworkType == MobileNetworkType.MOBILE_NETWORK_TYPE_3G)) {
                setLowNetworkMode(true);
                return;
            }
        }
        setLowNetworkMode(false);
    }

    private static void setLowNetworkMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a3c88e", new Object[]{new Boolean(z)});
        } else {
            lowNetworkMode = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getTotalRAM() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.util.NetWorkUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L16
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "83cbd42a"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L16:
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            java.lang.String r2 = "/proc/meminfo"
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            java.lang.String r0 = r1.readLine()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L5f
            r1.close()     // Catch: java.io.IOException -> L29
            goto L3c
        L29:
            r1 = move-exception
            r1.printStackTrace()
            goto L3c
        L2e:
            r2 = move-exception
            goto L34
        L30:
            r1 = move-exception
            goto L63
        L32:
            r2 = move-exception
            r1 = r0
        L34:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L3c
            r1.close()     // Catch: java.io.IOException -> L29
        L3c:
            if (r0 == 0) goto L5c
            java.lang.String r1 = ""
            java.lang.String r2 = "kB"
            java.lang.String r0 = r0.replace(r2, r1)
            java.lang.String r2 = "MemTotal:"
            java.lang.String r0 = r0.replace(r2, r1)
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L58
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L58
            int r0 = r0 / 1000
            return r0
        L58:
            r0 = move-exception
            r0.printStackTrace()
        L5c:
            r0 = 1024(0x400, float:1.435E-42)
            return r0
        L5f:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L63:
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r0 = move-exception
            r0.printStackTrace()
        L6d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.NetWorkUtils.getTotalRAM():int");
    }

    /* loaded from: classes8.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(435901603);
            kge.a(-1123682416);
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue() : Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public static int getNumCores() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e7ecbe", new Object[0])).intValue();
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            if (listFiles == null) {
                return 1;
            }
            return listFiles.length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public static ConnectType getConnectType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectType) ipChange.ipc$dispatch("5498b402", new Object[]{context});
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return ConnectType.CONNECT_TYPE_MOBILE;
            }
            if (type == 1) {
                return ConnectType.CONNECT_TYPE_WIFI;
            }
            return ConnectType.CONNECT_TYPE_OTHER;
        }
        return ConnectType.CONNECT_TYPE_DISCONNECT;
    }

    public static MobileNetworkType getMobileNetworkType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MobileNetworkType) ipChange.ipc$dispatch("419c7482", new Object[]{context});
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0 && activeNetworkInfo.isConnected()) {
            return getNetWorkType(activeNetworkInfo.getSubtype());
        }
        return MobileNetworkType.MOBILE_NETWORK_TYPE_UNKNOWN;
    }

    private static MobileNetworkType getNetWorkType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MobileNetworkType) ipChange.ipc$dispatch("95772e09", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_3G;
            case 13:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_4G;
            default:
                return MobileNetworkType.MOBILE_NETWORK_TYPE_UNKNOWN;
        }
    }
}
