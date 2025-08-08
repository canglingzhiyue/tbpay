package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class ndz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG = "lbs_sdk.Utils";

    /* renamed from: a  reason: collision with root package name */
    private static String f31378a;
    private static String b;

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        return null;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) ndw.f31376a.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo == null) {
                return null;
            }
            return a(connectionInfo.getIpAddress());
        } catch (Throwable unused) {
            nea.a(LOG, "error: fail to get phone ip address");
            return null;
        }
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + (i >>> 24);
    }

    static {
        kge.a(-2053075766);
        f31378a = null;
        b = null;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : UTDevice.getUtdid(ndw.f31376a);
    }

    public static String a(Context context, String str, String str2) {
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            if (securityGuardManager != null && (staticDataEncryptComp = securityGuardManager.getStaticDataEncryptComp()) != null) {
                return staticDataEncryptComp.staticSafeEncrypt(16, str, str2, "");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(30);
        if (runningServices == null || runningServices.size() <= 0) {
            return false;
        }
        for (int i = 0; i < runningServices.size(); i++) {
            if (runningServices.get(i).service.getClassName().equals(str)) {
                nea.d(LOG, "running_service_name=" + runningServices.get(i).service.getClassName());
                return true;
            }
        }
        return false;
    }

    public static List<ScanResult> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[0]) : new ArrayList(0);
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        if (a("deviceId")) {
            return null;
        }
        if (b != null) {
            return b;
        }
        TelephonyManager telephonyManager = (TelephonyManager) Globals.getApplication().getSystemService("phone");
        if (ActivityCompat.checkSelfPermission(Globals.getApplication(), "android.permission.READ_PHONE_STATE") != 0 || telephonyManager == null) {
            return null;
        }
        String proxy_getDeviceId = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getDeviceId(telephonyManager);
        b = proxy_getDeviceId;
        if (StringUtils.isEmpty(proxy_getDeviceId)) {
            b = "";
        }
        return b;
    }

    private static boolean a(String str) {
        String config;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : (str == null || (config = OrangeConfig.getInstance().getConfig("gps", "privacy_disallow_list", "")) == null || !config.toLowerCase().contains(str.toLowerCase())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[Catch: Throwable -> 0x00ee, LOOP:0: B:26:0x007f->B:28:0x0083, LOOP_END, TryCatch #0 {Throwable -> 0x00ee, blocks: (B:9:0x001a, B:11:0x002d, B:13:0x0033, B:15:0x0038, B:17:0x003e, B:20:0x0045, B:25:0x0055, B:26:0x007f, B:28:0x0083, B:23:0x004e, B:30:0x00b7, B:32:0x00bb), top: B:36:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.passivelocation.domain.LBSCellDTO[] f() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ndz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "66bcaedc"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            com.taobao.passivelocation.domain.LBSCellDTO[] r0 = (com.taobao.passivelocation.domain.LBSCellDTO[]) r0
            return r0
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r3 = 0
            if (r0 < r1) goto L1a
            return r3
        L1a:
            android.app.Application r0 = com.taobao.tao.Globals.getApplication()     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> Lee
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> Lee
            int r1 = r0.getSimState()     // Catch: java.lang.Throwable -> Lee
            r4 = 5
            if (r1 != r4) goto Lee
            android.telephony.CellLocation r1 = r0.getCellLocation()     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto Lee
            boolean r4 = r1 instanceof android.telephony.gsm.GsmCellLocation     // Catch: java.lang.Throwable -> Lee
            r5 = 1
            if (r4 == 0) goto Lb7
            java.util.List r0 = r0.getNeighboringCellInfo()     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto L54
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lee
            if (r4 != 0) goto L45
            goto L54
        L45:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lee
            r6 = 2
            if (r4 <= r6) goto L4e
            r4 = 3
            goto L55
        L4e:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lee
            int r4 = r4 + r5
            goto L55
        L54:
            r4 = 1
        L55:
            com.taobao.passivelocation.domain.LBSCellDTO[] r6 = new com.taobao.passivelocation.domain.LBSCellDTO[r4]     // Catch: java.lang.Throwable -> Lee
            android.telephony.gsm.GsmCellLocation r1 = (android.telephony.gsm.GsmCellLocation) r1     // Catch: java.lang.Throwable -> Lee
            com.taobao.passivelocation.domain.LBSCellDTO r7 = new com.taobao.passivelocation.domain.LBSCellDTO     // Catch: java.lang.Throwable -> Lee
            r7.<init>()     // Catch: java.lang.Throwable -> Lee
            int r8 = r1.getCid()     // Catch: java.lang.Throwable -> Lee
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lee
            r7.setCellId(r8)     // Catch: java.lang.Throwable -> Lee
            int r1 = r1.getLac()     // Catch: java.lang.Throwable -> Lee
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lee
            r7.setLac(r1)     // Catch: java.lang.Throwable -> Lee
            short r1 = tb.nds.f31373a     // Catch: java.lang.Throwable -> Lee
            java.lang.Short r1 = java.lang.Short.valueOf(r1)     // Catch: java.lang.Throwable -> Lee
            r7.setRssi(r1)     // Catch: java.lang.Throwable -> Lee
            r6[r2] = r7     // Catch: java.lang.Throwable -> Lee
        L7f:
            int r1 = r4 + (-1)
            if (r2 >= r1) goto Lb5
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> Lee
            android.telephony.NeighboringCellInfo r1 = (android.telephony.NeighboringCellInfo) r1     // Catch: java.lang.Throwable -> Lee
            com.taobao.passivelocation.domain.LBSCellDTO r7 = new com.taobao.passivelocation.domain.LBSCellDTO     // Catch: java.lang.Throwable -> Lee
            r7.<init>()     // Catch: java.lang.Throwable -> Lee
            int r8 = r1.getCid()     // Catch: java.lang.Throwable -> Lee
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lee
            r7.setCellId(r8)     // Catch: java.lang.Throwable -> Lee
            int r8 = r1.getLac()     // Catch: java.lang.Throwable -> Lee
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lee
            r7.setLac(r8)     // Catch: java.lang.Throwable -> Lee
            int r1 = r1.getRssi()     // Catch: java.lang.Throwable -> Lee
            short r1 = (short) r1     // Catch: java.lang.Throwable -> Lee
            java.lang.Short r1 = java.lang.Short.valueOf(r1)     // Catch: java.lang.Throwable -> Lee
            r7.setRssi(r1)     // Catch: java.lang.Throwable -> Lee
            int r2 = r2 + 1
            r6[r2] = r7     // Catch: java.lang.Throwable -> Lee
            goto L7f
        Lb5:
            r3 = r6
            goto Lee
        Lb7:
            boolean r0 = r1 instanceof android.telephony.cdma.CdmaCellLocation     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto Lee
            android.telephony.cdma.CdmaCellLocation r1 = (android.telephony.cdma.CdmaCellLocation) r1     // Catch: java.lang.Throwable -> Lee
            com.taobao.passivelocation.domain.LBSCellDTO[] r0 = new com.taobao.passivelocation.domain.LBSCellDTO[r5]     // Catch: java.lang.Throwable -> Lee
            com.taobao.passivelocation.domain.LBSCellDTO r4 = new com.taobao.passivelocation.domain.LBSCellDTO     // Catch: java.lang.Throwable -> Lee
            r4.<init>()     // Catch: java.lang.Throwable -> Lee
            r0[r2] = r4     // Catch: java.lang.Throwable -> Lee
            r4 = r0[r2]     // Catch: java.lang.Throwable -> Lee
            int r5 = r1.getNetworkId()     // Catch: java.lang.Throwable -> Lee
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lee
            r4.setNetworkId(r5)     // Catch: java.lang.Throwable -> Lee
            r4 = r0[r2]     // Catch: java.lang.Throwable -> Lee
            int r5 = r1.getBaseStationId()     // Catch: java.lang.Throwable -> Lee
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lee
            r4.setBaseStationId(r5)     // Catch: java.lang.Throwable -> Lee
            r2 = r0[r2]     // Catch: java.lang.Throwable -> Lee
            int r1 = r1.getSystemId()     // Catch: java.lang.Throwable -> Lee
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lee
            r2.setSystemId(r1)     // Catch: java.lang.Throwable -> Lee
            r3 = r0
        Lee:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ndz.f():com.taobao.passivelocation.domain.LBSCellDTO[]");
    }
}
