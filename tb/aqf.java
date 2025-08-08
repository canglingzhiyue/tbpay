package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.analytics.core.model.UTMCLogFields;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.analytics.core.network.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class aqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f25513a;
    private static boolean b;
    private static boolean c;

    static {
        kge.a(-379955053);
        f25513a = null;
        b = false;
        c = false;
    }

    public static synchronized void a(Context context) {
        synchronized (aqf.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            } else {
                a(context, f25513a);
            }
        }
    }

    private static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else if (context == null || map == null) {
        } else {
            apr.b("UTMCDevice", "updateDeviceNetworkStatus");
            try {
                String[] b2 = NetworkUtil.b(context);
                map.put(LogField.ACCESS.toString(), b2[0]);
                if (b2[0].equals(NetworkUtil.NETWORK_CLASS_2_3_G)) {
                    map.put(LogField.ACCESS_SUBTYPE.toString(), b2[1]);
                } else if (b2[1].equals("5G")) {
                    map.put(LogField.ACCESS_SUBTYPE.toString(), "5G");
                } else {
                    map.put(LogField.ACCESS_SUBTYPE.toString(), "Unknown");
                }
            } catch (Exception unused) {
                map.put(LogField.ACCESS.toString(), "Unknown");
                map.put(LogField.ACCESS_SUBTYPE.toString(), "Unknown");
            }
            map.put(LogField.CARRIER.toString(), a.a());
        }
    }

    public static synchronized Map<String, String> b(Context context) {
        synchronized (aqf.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("c7c4b7f4", new Object[]{context});
            } else if (f25513a != null) {
                return f25513a;
            } else if (context == null) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                try {
                    try {
                        hashMap.put(LogField.UTDID.toString(), UTDevice.getUtdid(context));
                    } catch (Exception unused) {
                        Log.e("", "utdid4all jar doesn't exist");
                    }
                    hashMap.put(LogField.IMEI.toString(), apw.a(context));
                    hashMap.put(LogField.IMSI.toString(), apw.b(context));
                    hashMap.put(LogField.DEVICE_MODEL.toString(), Build.MODEL);
                    hashMap.put(LogField.BRAND.toString(), Build.BRAND);
                    hashMap.put(LogField.OSVERSION.toString(), Build.VERSION.RELEASE);
                    hashMap.put(LogField.OS.toString(), "a");
                    try {
                        hashMap.put(LogField.APPVERSION.toString(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        hashMap.put(LogField.APPVERSION.toString(), "Unknown");
                    }
                    if (a()) {
                        hashMap.put(LogField.OS.toString(), "y");
                        String c2 = c();
                        if (!aqc.e(c2)) {
                            hashMap.put(UTMCLogFields.DEVICE_ID.toString(), c2);
                        }
                        String property = System.getProperty("ro.yunos.version");
                        if (!aqc.e(property)) {
                            hashMap.put(LogField.OSVERSION.toString(), property);
                        }
                        String e = e();
                        if (!aqc.e(e)) {
                            hashMap.put(LogField.OSVERSION.toString(), e);
                        }
                    }
                    if (b()) {
                        hashMap.put(LogField.OS.toString(), "a");
                    }
                    try {
                        Configuration configuration = new Configuration();
                        Settings.System.getConfiguration(context.getContentResolver(), configuration);
                        if (configuration.locale != null) {
                            hashMap.put(LogField.LANGUAGE.toString(), configuration.locale.toString());
                        } else {
                            hashMap.put(LogField.LANGUAGE.toString(), "Unknown");
                        }
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        int i = displayMetrics.widthPixels;
                        int i2 = displayMetrics.heightPixels;
                        if (i2 > i) {
                            String logField = LogField.RESOLUTION.toString();
                            hashMap.put(logField, i2 + "*" + i);
                        } else {
                            String logField2 = LogField.RESOLUTION.toString();
                            hashMap.put(logField2, i + "*" + i2);
                        }
                    } catch (Exception unused3) {
                        hashMap.put(LogField.RESOLUTION.toString(), "Unknown");
                    }
                    a(context, hashMap);
                    f25513a = hashMap;
                    return hashMap;
                } catch (Exception unused4) {
                    return null;
                }
            }
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if ((System.getProperty("java.vm.name") != null && System.getProperty("java.vm.name").toLowerCase().contains("lemur")) || !StringUtils.isEmpty(System.getProperty("ro.yunos.version")) || !StringUtils.isEmpty(aqd.a("ro.yunos.build.version"))) {
            return true;
        }
        return b();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : !StringUtils.isEmpty(aqd.a("ro.yunos.product.chip")) || !StringUtils.isEmpty(aqd.a("ro.yunos.hardware"));
    }

    private static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        String a2 = aqd.a("ro.aliyun.clouduuid");
        if (aqc.e(a2)) {
            a2 = aqd.a("ro.sys.aliyun.clouduuid");
        }
        return aqc.e(a2) ? d() : a2;
    }

    private static String d() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String e() {
        try {
            Field declaredField = Build.class.getDeclaredField("YUNOS_BUILD_VERSION");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (String) declaredField.get(new String());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (c) {
            return b;
        }
        if (context == null) {
            return false;
        }
        if (e(context) || d(context)) {
            z = true;
        }
        b = z;
        c = true;
        return b;
    }

    private static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : ((TelephonyManager) context.getSystemService("phone")).getPhoneType() == 0;
    }
}
