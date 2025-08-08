package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import java.util.List;
import tb.mto;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static volatile AMapLocation f7809a = null;
    private static String b = "CoarseLocation";
    private static long q = 0;
    private static boolean r = false;
    private static boolean s = false;
    private static boolean t = false;
    private static boolean u = false;
    private ev f;
    private Handler j;
    private Context k;
    private LocationManager n;
    private AMapLocationClientOption o;
    private long c = 0;
    private boolean d = false;
    private int e = 0;
    private int g = 240;
    private int h = 80;
    private int i = 0;
    private long l = 0;
    private int m = 0;
    private Object p = new Object();
    private boolean v = true;
    private AMapLocationClientOption.GeoLanguage w = AMapLocationClientOption.GeoLanguage.DEFAULT;
    private LocationListener x = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        private g f7810a;

        a(g gVar) {
            this.f7810a = gVar;
        }

        final void a() {
            this.f7810a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                if (this.f7810a == null) {
                    return;
                }
                this.f7810a.a(location);
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                if (this.f7810a == null) {
                    return;
                }
                this.f7810a.g();
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
            if ("gps".equalsIgnoreCase(str)) {
                new Object[1][0] = "CoarseLocation | onProviderEnabled  ";
            }
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                if (this.f7810a == null) {
                    return;
                }
                this.f7810a.a(i);
            } catch (Throwable unused) {
            }
        }
    }

    public g(Context context, Handler handler) {
        this.f = null;
        this.k = context;
        this.j = handler;
        try {
            this.n = (LocationManager) this.k.getSystemService("location");
        } catch (Throwable th) {
            fr.a(th, b, "<init>");
        }
        this.f = new ev();
    }

    private static ew a(int i, String str) {
        ew ewVar = new ew("");
        ewVar.setErrorCode(i);
        ewVar.setLocationDetail(str);
        return ewVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0) {
            try {
                new Object[1][0] = "CoarseLocation | gps is outOfService  ";
                this.i = 0;
            } catch (Throwable unused) {
            }
        }
    }

    private void a(int i, String str, long j) {
        try {
            if (this.j == null) {
                return;
            }
            Message obtain = Message.obtain();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setErrorCode(20);
            aMapLocation.setLocationDetail(str);
            aMapLocation.setLocationType(11);
            obtain.obj = aMapLocation;
            obtain.what = i;
            this.j.sendMessageDelayed(obtain, j);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        Handler handler = this.j;
        if (handler != null) {
            handler.removeMessages(100);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (!fy.a(aMapLocation)) {
                return;
            }
            aMapLocation.setProvider("gps".equals(location.getProvider()) ? "gps_coarse" : "network_coarse");
            aMapLocation.setLocationType(11);
            if (!this.d && fy.a(aMapLocation)) {
                fw.b(this.k, fy.b() - this.c, fr.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                this.d = true;
            }
            Boolean bool = Boolean.FALSE;
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    Boolean bool2 = (Boolean) fu.a(location, "isFromMockProvider", new Object[0]);
                    try {
                        new Object[1][0] = "CoarseLocation | isFromMock=".concat(String.valueOf(bool2));
                    } catch (Throwable unused) {
                    }
                    bool = bool2;
                } catch (Throwable unused2) {
                }
            }
            if (bool.booleanValue()) {
                aMapLocation.setMock(true);
                aMapLocation.setTrustedLevel(4);
                if (!this.o.isMockEnable()) {
                    if (this.m <= 3) {
                        this.m++;
                        return;
                    }
                    fw.a((String) null, 2152);
                    aMapLocation.setErrorCode(15);
                    aMapLocation.setLocationDetail("CoarseLocation has been mocked!#2007");
                    aMapLocation.setLatitude(mto.a.GEO_NOT_SUPPORT);
                    aMapLocation.setLongitude(mto.a.GEO_NOT_SUPPORT);
                    aMapLocation.setAltitude(mto.a.GEO_NOT_SUPPORT);
                    aMapLocation.setSpeed(0.0f);
                    aMapLocation.setAccuracy(0.0f);
                    aMapLocation.setBearing(0.0f);
                    aMapLocation.setExtras(null);
                    c(aMapLocation);
                    return;
                }
            } else {
                this.m = 0;
            }
            this.i = b(location);
            aMapLocation.setSatellites(this.i);
            e(aMapLocation);
            g(aMapLocation);
            AMapLocation f = f(aMapLocation);
            a(f);
            b(f);
            synchronized (this.p) {
                a(f, f7809a);
            }
            c(f);
        } catch (Throwable th) {
            fr.a(th, "CoarseLocation", "onLocationChanged");
        }
    }

    private void a(AMapLocation aMapLocation) {
        if (!fy.a(aMapLocation)) {
            return;
        }
        this.e++;
    }

    private void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.o.isNeedAddress() || fy.a(aMapLocation, aMapLocation2) >= this.g) {
            return;
        }
        fr.a(aMapLocation, aMapLocation2);
    }

    private static boolean a(LocationManager locationManager) {
        try {
            if (r) {
                return s;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders == null || allProviders.size() <= 0) {
                s = false;
            } else {
                s = allProviders.contains("gps");
            }
            r = true;
            return s;
        } catch (Throwable th) {
            new Object[1][0] = "CoarseLocation | hasProvider error: " + th.getMessage();
            return s;
        }
    }

    private static int b(Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.getInt("satellites");
        }
        return 0;
    }

    private void b(AMapLocation aMapLocation) {
        Handler handler;
        if (fy.a(aMapLocation) && this.j != null) {
            long b2 = fy.b();
            if (this.o.getInterval() > 8000 && b2 - this.l <= this.o.getInterval() - 8000) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putDouble(DispatchConstants.LATITUDE, aMapLocation.getLatitude());
            bundle.putDouble("lon", aMapLocation.getLongitude());
            bundle.putFloat("radius", aMapLocation.getAccuracy());
            bundle.putLong("time", aMapLocation.getTime());
            Message obtain = Message.obtain();
            obtain.setData(bundle);
            obtain.what = 102;
            synchronized (this.p) {
                if (f7809a == null) {
                    handler = this.j;
                } else if (fy.a(aMapLocation, f7809a) > this.h) {
                    handler = this.j;
                }
                handler.sendMessage(obtain);
            }
        }
    }

    private static boolean b(LocationManager locationManager) {
        try {
            if (t) {
                return u;
            }
            u = locationManager.isProviderEnabled("network");
            t = true;
            return u;
        } catch (Throwable th) {
            new Object[1][0] = "CoarseLocation | hasProvider error: " + th.getMessage();
            return u;
        }
    }

    private void c(AMapLocation aMapLocation) {
        if (this.o.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.o.getDeviceModeDistanceFilter() > 0.0f) {
            d(aMapLocation);
        } else if (fy.b() - this.l < this.o.getInterval() - 200) {
        } else {
            this.l = fy.b();
            d(aMapLocation);
        }
    }

    private boolean c() {
        boolean z;
        try {
            if (fy.c() >= 28) {
                if (this.n == null) {
                    this.n = (LocationManager) this.k.getApplicationContext().getSystemService("location");
                }
                z = ((Boolean) fu.a(this.n, "isLocationEnabled", new Object[0])).booleanValue();
            } else {
                z = true;
            }
            try {
                if (fy.c() >= 24 && fy.c() < 28) {
                    if (Settings.Secure.getInt(this.k.getContentResolver(), "location_mode", 0) == 0) {
                        return false;
                    }
                }
            } catch (Throwable unused) {
                new Object[1][0] = "CoarseLocation | isLocationSwitchOpen error";
                return z;
            }
        } catch (Throwable unused2) {
            z = true;
        }
        return z;
    }

    private void d() {
        c(a(12, "定位服务没有开启，请在设置中打开定位服务开关#1206"));
    }

    private void d(AMapLocation aMapLocation) {
        if (this.j != null) {
            new Object[1][0] = "CoarseLocation | callBackGpsResult";
            Message obtain = Message.obtain();
            obtain.obj = aMapLocation;
            obtain.what = 101;
            this.j.sendMessage(obtain);
        }
    }

    private void e() {
        c(a(20, "模糊权限下不支持连续定位#2006"));
    }

    private void e(AMapLocation aMapLocation) {
        try {
            if (!fr.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) || !this.o.isOffset()) {
                aMapLocation.setOffset(false);
                aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
                return;
            }
            DPoint a2 = ft.a(this.k, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
            aMapLocation.setLatitude(a2.getLatitude());
            aMapLocation.setLongitude(a2.getLongitude());
            aMapLocation.setOffset(this.o.isOffset());
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
        } catch (Throwable th) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
            new Object[1][0] = "CoarseLocation | offset error: " + th.getMessage();
        }
    }

    private AMapLocation f(AMapLocation aMapLocation) {
        if (fy.a(aMapLocation) && this.e >= 3) {
            if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
                aMapLocation.setAccuracy(0.0f);
            }
            if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
                aMapLocation.setSpeed(0.0f);
            }
            return this.f.a(aMapLocation);
        }
        return aMapLocation;
    }

    private void f() {
        if (this.n == null) {
            return;
        }
        try {
            this.v = true;
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = this.k.getMainLooper();
            }
            this.c = fy.b();
            if (b(this.n)) {
                if (this.x == null) {
                    this.x = new a(this);
                }
                this.n.requestLocationUpdates("network", this.o.getInterval(), this.o.getDeviceModeDistanceFilter(), this.x, myLooper);
            }
            if (a(this.n)) {
                try {
                    if (fy.a() - q >= 259200000) {
                        if (fy.c(this.k, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                            this.n.sendExtraCommand("gps", "force_xtra_injection", null);
                            q = fy.a();
                            SharedPreferences.Editor a2 = fx.a(this.k, "pref");
                            fx.a(a2, "lagt", q);
                            fx.a(a2);
                            new Object[1][0] = "CoarseLocation | sendExtraCommand";
                        } else {
                            fr.a(new Exception("n_alec"), "OPENSDK_CL", "rlu_n_alec");
                        }
                    }
                } catch (Throwable th) {
                    new Object[1][0] = "CoarseLocation | sendExtraCommand error: " + th.getMessage();
                }
                if (this.x == null) {
                    this.x = new a(this);
                }
                this.n.requestLocationUpdates("gps", this.o.getInterval(), this.o.getDeviceModeDistanceFilter(), this.x, myLooper);
                new Object[1][0] = "CoarseLocation | requestLocationUpdates";
            }
            if (s || u) {
                a(100, "系统返回定位结果超时#2002", this.o.getHttpTimeOut());
            }
            if (s || u) {
                return;
            }
            new Object[1][0] = "CoarseLocation | no GPS_provider";
            a(100, "系统定位当前不可用#2003", 0L);
        } catch (SecurityException e) {
            new Object[1][0] = "CoarseLocation | no location permission";
            this.v = false;
            fw.a((String) null, 2121);
            a(101, e.getMessage() + "#2004", 0L);
        } catch (Throwable th2) {
            new Object[1][0] = "CoarseLocation | requestLocationUpdates error: " + th2.getMessage();
            fr.a(th2, "CoarseLocation", "requestLocationUpdates part2");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            new Object[1][0] = "CoarseLocation | onProviderDisabled  ";
            this.i = 0;
        } catch (Throwable unused) {
        }
    }

    private static void g(AMapLocation aMapLocation) {
        if (fy.a(aMapLocation) && fq.r()) {
            long time = aMapLocation.getTime();
            long currentTimeMillis = System.currentTimeMillis();
            long a2 = fs.a(time, currentTimeMillis, fq.s());
            if (a2 == time) {
                return;
            }
            aMapLocation.setTime(a2);
            fw.a(time, currentTimeMillis);
        }
    }

    public final void a() {
        new Object[1][0] = "CoarseLocation | stopLocation ";
        LocationManager locationManager = this.n;
        if (locationManager == null) {
            return;
        }
        try {
            if (this.x != null) {
                locationManager.removeUpdates(this.x);
                ((a) this.x).a();
                this.x = null;
                new Object[1][0] = "CoarseLocation | removeUpdates ";
            }
        } catch (Throwable th) {
            new Object[1][0] = "CoarseLocation | removeUpdates error " + th.getMessage();
        }
        try {
            if (this.j != null) {
                this.j.removeMessages(100);
            }
        } catch (Throwable unused) {
        }
        this.i = 0;
        this.c = 0L;
        this.l = 0L;
        this.e = 0;
        this.m = 0;
        this.f.a();
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.g = bundle.getInt("I_MAX_GEO_DIS");
                this.h = bundle.getInt("I_MIN_GEO_DIS");
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable(MspEventTypes.ACTION_INVOKE_LOC);
                if (StringUtils.isEmpty(aMapLocation.getAdCode())) {
                    return;
                }
                synchronized (this.p) {
                    f7809a = aMapLocation;
                }
            } catch (Throwable th) {
                fr.a(th, "CoarseLocation", "setLastGeoLocation");
            }
        }
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.o = aMapLocationClientOption;
        if (this.o == null) {
            this.o = new AMapLocationClientOption();
        }
        Object[] objArr = {"CoarseLocation | startLocation ", "option: " + this.o.toString()};
        if (!this.o.isOnceLocation()) {
            e();
        } else if (!c()) {
            d();
        } else {
            try {
                q = fx.a(this.k, "pref", "lagt", q);
            } catch (Throwable unused) {
            }
            f();
        }
    }

    public final int b() {
        LocationManager locationManager = this.n;
        if (locationManager != null && a(locationManager)) {
            if (Build.VERSION.SDK_INT >= 19) {
                int i = Settings.Secure.getInt(this.k.getContentResolver(), "location_mode", 0);
                if (i == 0) {
                    return 2;
                }
                if (i == 2) {
                    return 3;
                }
            } else if (!this.n.isProviderEnabled("gps")) {
                return 2;
            }
            return !this.v ? 4 : 0;
        }
        return 1;
    }

    public final void b(AMapLocationClientOption aMapLocationClientOption) {
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        this.o = aMapLocationClientOption;
        Object[] objArr = {"CoarseLocation | setLocationOption ", "option: " + this.o.toString()};
        this.j.removeMessages(100);
        if (this.w != this.o.getGeoLanguage()) {
            synchronized (this.p) {
                f7809a = null;
            }
        }
        this.w = this.o.getGeoLanguage();
    }
}
