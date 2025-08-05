package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f26324a;
    private static Map<String, String> b = new HashMap();

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("locale", cjw.d((context == null ? Locale.getDefault() : context.getResources().getConfiguration().locale).toString()));
            Map<String, String> b2 = b(context);
            jSONObject.put("lac", cjw.d(b2.get("lac")));
            jSONObject.put("cellId", cjw.d(b2.get("cellId")));
            Map<String, String> c = c(context);
            jSONObject.put("longitude", cjw.d(c.get("longitude")));
            jSONObject.put("latitude", cjw.d(c.get("latitude")));
            jSONObject.put("locationTimestamp", cjw.d(c.get("locationTimestamp")));
            jSONObject.put("locationTimeInterval", cjw.d(c.get("locationTimeInterval")));
            HashMap hashMap = new HashMap();
            hashMap.put("wifiName", "-1");
            hashMap.put("wifiMac", "00");
            String str = (String) hashMap.get("wifiName");
            if (!TextUtils.isEmpty(str)) {
                str = str.replaceAll(";", "").replaceAll(riy.MOD, "");
            }
            jSONObject.put("wifiName", a(str));
            jSONObject.put("wifiMac", a((String) hashMap.get("wifiMac")));
            return jSONObject.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : TextUtils.isEmpty(str) ? "" : str.replace(riy.BRACKET_START_STR, "（").replace(riy.BRACKET_END_STR, "）").replace(";", "；").replace("&", "");
    }

    private static Map<String, String> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7c4b7f4", new Object[]{context});
        }
        if (b.size() == 0) {
            b.put("lac", "-1");
            b.put("cellId", "-1");
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f26324a < 15000) {
            return b;
        }
        f26324a = currentTimeMillis;
        try {
            context.getSystemService("phone");
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageManager.checkPermission(a.ACCESS_FINE_LOCATION, packageName) != 0) {
                packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packageName);
            }
            b.put("lac", "-1");
            b.put("cellId", "-1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    private static Map<String, String> c(Context context) {
        LocationManager locationManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("longitude", "-1");
        hashMap.put("latitude", "-1");
        hashMap.put("locationTimestamp", "-1");
        hashMap.put("locationTimeInterval", "-1");
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if ((packageManager.checkPermission(a.ACCESS_FINE_LOCATION, packageName) == 0 || packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packageName) == 0) && (locationManager = (LocationManager) context.getSystemService("location")) != null && locationManager.isProviderEnabled("gps")) {
                Location location = null;
                if (APSecuritySdk.getPermissionInfo() != null && APSecuritySdk.getPermissionInfo().canGetLocation() && (location = locationManager.getLastKnownLocation("gps")) == null && locationManager.isProviderEnabled("network")) {
                    location = locationManager.getLastKnownLocation("network");
                }
                if (location != null) {
                    hashMap.put("longitude", String.valueOf(location.getLongitude()));
                    hashMap.put("latitude", String.valueOf(location.getLatitude()));
                    hashMap.put("locationTimestamp", String.valueOf(location.getTime() / 1000));
                    hashMap.put("locationTimeInterval", Build.VERSION.SDK_INT >= 17 ? String.valueOf((SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000) : String.valueOf((System.currentTimeMillis() - location.getTime()) / 1000));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }
}
