package com.taobao.android.behavix.service;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.d;
import java.io.File;
import java.util.Calendar;
import tb.dsb;
import tb.eoe;
import tb.kge;
import tb.mto;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HARDWARE_INFO_FEATURE = "all_df_hardware_info_json";
    public static final String HARDWARE_STATUS_FEATURE = "all_df_hardware_status_json";
    public static final String LIGHT_SENSOR_FEATURE = "all_df_light_sensor_lstf";
    public static final String TIME_SPARSE_FEATURE = "all_df_time_sparse_json";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9202a;
    private static int b;
    private static double c;
    private static SensorManager d;
    private static C0356a e;
    private static Sensor f;

    public static /* synthetic */ C0356a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0356a) ipChange.ipc$dispatch("5d40530e", new Object[0]) : e;
    }

    public static /* synthetic */ Sensor f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Sensor) ipChange.ipc$dispatch("c390f6fd", new Object[0]) : f;
    }

    public static /* synthetic */ SensorManager g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SensorManager) ipChange.ipc$dispatch("b3a4cdab", new Object[0]) : d;
    }

    static {
        kge.a(1003922110);
        b = 0;
        c = mto.a.GEO_NOT_SUPPORT;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        if (d == null && d.b() != null) {
            d = (SensorManager) d.b().getSystemService("sensor");
        }
        if (!str.equals(LIGHT_SENSOR_FEATURE)) {
            return;
        }
        Sensor defaultSensor = d.getDefaultSensor(5);
        f = defaultSensor;
        if (defaultSensor == null) {
            return;
        }
        e = new C0356a();
        d.registerListener(e, f, 0);
    }

    public static JSONArray b(String str) {
        C0356a c0356a;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{str});
        }
        if (str.equals(LIGHT_SENSOR_FEATURE) && (c0356a = e) != null) {
            return C0356a.a(c0356a);
        }
        return new JSONArray();
    }

    /* renamed from: com.taobao.android.behavix.service.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0356a implements SensorEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static float f9203a;

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            }
        }

        private C0356a() {
        }

        public static /* synthetic */ JSONArray a(C0356a c0356a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("ac1e9a72", new Object[]{c0356a}) : c0356a.a();
        }

        static {
            kge.a(84060500);
            kge.a(499746989);
            f9203a = -1.0f;
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
                return;
            }
            int i = sensorEvent.accuracy;
            f9203a = sensorEvent.values[0];
            a.g().unregisterListener(a.e(), a.f());
        }

        private JSONArray a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this});
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(Float.valueOf(f9203a));
            return jSONArray;
        }
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_root", (Object) Boolean.valueOf(h()));
        jSONObject.put("network", (Object) i());
        jSONObject.put("screen_brightness", (Object) Integer.valueOf(j()));
        jSONObject.put("cpu_core", (Object) Integer.valueOf(k()));
        jSONObject.put("total_rom_size_gb", (Object) Double.valueOf(l()));
        return jSONObject;
    }

    private static boolean h() {
        Boolean bool = f9202a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            if ("0".equals((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, "ro.secure", null))) {
                f9202a = true;
            } else {
                for (String str : new String[]{"/system/bin/su", "/system/xbin/su", "/system/sbin/su", "/sbin/su", "/vendor/bin/su"}) {
                    File file = new File(str);
                    if (file.exists() && file.isFile()) {
                        f9202a = true;
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            dsb.a("LocalFeature.isDeviceRooted", null, null, th);
        }
        if (f9202a != null) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f9202a = valueOf;
        return valueOf.booleanValue();
    }

    private static String i() {
        NetworkInfo activeNetworkInfo;
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
        }
        try {
            if (d.b() == null || (activeNetworkInfo = ((ConnectivityManager) d.b().getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return str2;
            }
            if ("WIFI".equalsIgnoreCase(activeNetworkInfo.getTypeName())) {
                return "WIFI";
            }
            if (!StringUtils.isEmpty(activeNetworkInfo.getSubtypeName())) {
                str = activeNetworkInfo.getSubtypeName();
            } else if (activeNetworkInfo.getSubtype() == 16) {
                str = NetUtil.TYPE_GSM;
            } else if (activeNetworkInfo.getSubtype() == 17) {
                str = NetUtil.TYPE_TD_CDMA;
            } else if (activeNetworkInfo.getSubtype() == 18) {
                str = NetUtil.TYPE_TDS_HSDPSA;
            } else {
                str = activeNetworkInfo.getSubtype() == 19 ? NetUtil.TYPE_TDS_HSUPA : str2;
            }
            try {
                if (str.equals(str2) || StringUtils.isEmpty(activeNetworkInfo.getExtraInfo())) {
                    return str;
                }
                return str + "|" + activeNetworkInfo.getExtraInfo();
            } catch (Throwable th) {
                str2 = str;
                th = th;
                dsb.a("LocalFeature.getNetworkType", null, null, th);
                return str2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b() {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        Application b2 = d.b();
        if (b2 == null || (activeNetworkInfo = ((ConnectivityManager) b2.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
            return "";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == 20) {
                return "";
            }
            switch (subtype) {
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
            }
        } else if (type == 1) {
            return "wifi";
        }
        return "unknown";
    }

    private static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue();
        }
        try {
            if (d.b() != null) {
                return Settings.System.getInt(d.b().getContentResolver(), "screen_brightness");
            }
            return -1;
        } catch (Throwable th) {
            dsb.a("LocalFeature.getScreenBrightness", null, null, th);
            return -1;
        }
    }

    private static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue();
        }
        if (b == 0) {
            b = Runtime.getRuntime().availableProcessors();
        }
        return b;
    }

    private static double l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee1", new Object[0])).doubleValue();
        }
        if (c > mto.a.GEO_NOT_SUPPORT || Build.VERSION.SDK_INT <= 18) {
            return c;
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            c = Math.round(((((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1024.0d) / 1024.0d) / 1024.0d) * 1000.0d) / 1000.0d;
        } catch (Throwable th) {
            dsb.a("LocalFeature.getTotalROMSizeGB", null, null, th);
        }
        return c;
    }

    public static JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_stamp", (Object) Long.valueOf(System.currentTimeMillis()));
        Calendar calendar = Calendar.getInstance();
        jSONObject.put("year", (Object) Integer.valueOf(calendar.get(1)));
        jSONObject.put(UiUtil.INPUT_TYPE_VALUE_MONTH, (Object) Integer.valueOf(calendar.get(2) + 1));
        jSONObject.put(eoe.c.KEY_DAY, (Object) Integer.valueOf(calendar.get(5)));
        jSONObject.put("hour", (Object) Integer.valueOf(calendar.get(11)));
        jSONObject.put("minute", (Object) Integer.valueOf(calendar.get(12)));
        jSONObject.put("second", (Object) Integer.valueOf(calendar.get(13)));
        jSONObject.put("week_seq", (Object) Integer.valueOf(calendar.get(4)));
        return jSONObject;
    }

    public static JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phone_brand", (Object) Build.BRAND);
        jSONObject.put("phone_model", (Object) Build.MODEL);
        jSONObject.put("platform", (Object) "android");
        jSONObject.put("platform_version", (Object) Build.VERSION.RELEASE);
        return jSONObject;
    }
}
