package com.alipay.android.msp.utils;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.a;
import org.json.JSONObject;
import tb.nom;

/* loaded from: classes3.dex */
public class UserLocation {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DOUBLE_ACCURACY = "accuracy";
    public static final String KEY_DOUBLE_LATITUDE = "latitude";
    public static final String KEY_DOUBLE_LONGITUDE = "longitude";
    public static final String KEY_LONG_TIME = "time";
    private static double mAccuracy = -1.0d;
    private static long mElapsedNano = -1;
    private static double mLatitude = -1.0d;
    private static boolean mLocationSuccess = false;
    private static long mLocationTimestamp = -1;
    private static double mLongitude = -1.0d;
    private static long mWalletTimeStamp = -1;
    private static boolean sEnabled = false;
    private static long sOtherLocationTime = -1;

    public static void locationInit(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34a1178", new Object[]{context, new Boolean(z)});
            return;
        }
        try {
            sEnabled = z;
            if (!z || PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(context) || StringUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_disable_location_10556"), nom.VALUE_YES)) {
                return;
            }
            if (!GlobalSdkConstant.getSdkType()) {
                processAtWallet();
            } else {
                processAtOthers(context);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private static void processAtWallet() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d30fca2", new Object[0]);
        } else if (!sEnabled) {
        } else {
            JSONObject jSONObject = new JSONObject(PhoneCashierMspEngine.getMspWallet().getLBSLocation());
            if (!jSONObject.has("latitude") || !jSONObject.has("longitude") || !jSONObject.has(KEY_DOUBLE_ACCURACY) || !jSONObject.has("time")) {
                return;
            }
            double d = jSONObject.getDouble("latitude");
            double d2 = jSONObject.getDouble("longitude");
            double d3 = jSONObject.getDouble(KEY_DOUBLE_ACCURACY);
            long j = jSONObject.getLong("time");
            mLatitude = d;
            mLongitude = d2;
            mAccuracy = d3;
            mWalletTimeStamp = j;
            mLocationSuccess = true;
        }
    }

    private static void processAtOthers(Context context) {
        Location lastKnownLocation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e20a3c", new Object[]{context});
        } else if (!sEnabled || SystemClock.elapsedRealtime() - sOtherLocationTime < 30000) {
        } else {
            sOtherLocationTime = SystemClock.elapsedRealtime();
            if (ContextCompat.checkSelfPermission(context, a.ACCESS_FINE_LOCATION) != 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return;
            }
            LogUtil.record(2, "processAtOthers", "yes go on");
            LocationManager locationManager = PhoneCashierMspEngine.getMspWallet().getLocationManager(context);
            if (locationManager == null || !locationManager.isProviderEnabled("gps") || (lastKnownLocation = locationManager.getLastKnownLocation("gps")) == null) {
                return;
            }
            mLatitude = lastKnownLocation.getLatitude();
            mLongitude = lastKnownLocation.getLongitude();
            mAccuracy = lastKnownLocation.getAccuracy();
            mLocationSuccess = true;
            if (Build.VERSION.SDK_INT >= 17) {
                mElapsedNano = lastKnownLocation.getElapsedRealtimeNanos();
            } else {
                mLocationTimestamp = lastKnownLocation.getTime();
            }
        }
    }

    public static boolean isLocationSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5883668f", new Object[0])).booleanValue() : mLocationSuccess;
    }

    public static double getAccuracy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1891ab64", new Object[0])).doubleValue() : mAccuracy;
    }

    public static double getLatitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b6fad57", new Object[0])).doubleValue() : mLatitude;
    }

    public static double getLongitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b61adaee", new Object[0])).doubleValue() : mLongitude;
    }

    public static String getLocationInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84b53c20", new Object[0]);
        }
        long locationMilliSinceNow = locationMilliSinceNow();
        LogUtil.record(1, "getLocationInfo", "time:".concat(String.valueOf(locationMilliSinceNow)));
        return mLongitude + "^" + locationMilliSinceNow + ";" + mLatitude;
    }

    public static long locationMilliSinceNow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97670cef", new Object[0])).longValue();
        }
        if (!GlobalSdkConstant.getSdkType()) {
            return getTimeSpanAtWallet();
        }
        return getTimeSpanAtOthers();
    }

    private static long getTimeSpanAtWallet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c557e54", new Object[0])).longValue();
        }
        if (mWalletTimeStamp == -1) {
            return -1L;
        }
        LogUtil.record(1, "getTimeSpanAtWallet", "currentTimeMillis:");
        return (System.currentTimeMillis() - mWalletTimeStamp) / 1000;
    }

    private static long getTimeSpanAtOthers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df6ec8be", new Object[0])).longValue();
        }
        if ((Build.VERSION.SDK_INT >= 17 && mElapsedNano == -1) || (Build.VERSION.SDK_INT < 17 && mLocationTimestamp == -1)) {
            return -1L;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            LogUtil.record(1, "getTimeSpanAtOthers", "elapsedRealtimeNanos:");
            return (SystemClock.elapsedRealtimeNanos() - mElapsedNano) / 1000000000;
        }
        LogUtil.record(1, "getTimeSpanAtOthers", "currentTimeMillis:");
        return (System.currentTimeMillis() - mLocationTimestamp) / 1000;
    }
}
