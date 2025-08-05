package android.taobao.windvane.jsbridge.api;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.i;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.noa;

/* loaded from: classes2.dex */
public class WVLocation extends e implements LocationListener, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GPS_TIMEOUT = 15000;
    private static final String TAG = "WVLocation";
    private Handler mHandler;
    private int MIN_TIME = 20000;
    private int MIN_DISTANCE = 30;
    private ArrayList<WVCallBackContext> mCallbacks = new ArrayList<>();
    private boolean getLocationSuccess = false;
    private boolean enableAddress = false;
    private LocationManager locationManager = null;

    static {
        kge.a(2090271778);
        kge.a(454207267);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Object ipc$super(WVLocation wVLocation, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Handler access$000(WVLocation wVLocation) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("2bc8a1fe", new Object[]{wVLocation}) : wVLocation.mHandler;
    }

    public static /* synthetic */ boolean access$100(WVLocation wVLocation) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53797aab", new Object[]{wVLocation})).booleanValue() : wVLocation.enableAddress;
    }

    public static /* synthetic */ Address access$200(WVLocation wVLocation, double d, double d2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Address) ipChange.ipc$dispatch("d4f36025", new Object[]{wVLocation, new Double(d), new Double(d2)}) : wVLocation.getAddress(d, d2);
    }

    public static /* synthetic */ ArrayList access$300(WVLocation wVLocation) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("6bd9dfbf", new Object[]{wVLocation}) : wVLocation.mCallbacks;
    }

    public WVLocation() {
        this.mHandler = null;
        this.mHandler = new Handler(Looper.getMainLooper(), this);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"getLocation".equals(str)) {
            return false;
        }
        getLocation(wVCallBackContext, str2);
        return true;
    }

    public synchronized void getLocation(final WVCallBackContext wVCallBackContext, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc2f279", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            android.taobao.windvane.runtimepermission.b.a(this.mContext, new String[]{com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION, "android.permission.ACCESS_COARSE_LOCATION"}).a(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVLocation.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVLocation.this.requestLocation(wVCallBackContext, str);
                    }
                }
            }).b(new i(wVCallBackContext, "no permission")).b();
        } catch (Exception unused) {
        }
    }

    public void requestLocation(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b991172", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                z = jSONObject.optBoolean("enableHighAcuracy");
                this.enableAddress = jSONObject.optBoolean("address");
            } catch (JSONException unused) {
                m.e(TAG, "getLocation: param parse to JSON error, param=" + str);
                r rVar = new r();
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return;
            }
        }
        if (this.mCallbacks == null) {
            this.mCallbacks = new ArrayList<>();
        }
        this.mCallbacks.add(wVCallBackContext);
        registerLocation(z);
        WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVLocation.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    WVLocation.access$000(WVLocation.this).sendEmptyMessageDelayed(1, 15000L);
                }
            }
        });
    }

    private void registerLocation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac9cab5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.locationManager == null) {
            this.locationManager = (LocationManager) this.mContext.getSystemService("location");
        }
        try {
            this.getLocationSuccess = false;
            this.locationManager.requestLocationUpdates("network", this.MIN_TIME, this.MIN_DISTANCE, this);
            this.locationManager.requestLocationUpdates("gps", this.MIN_TIME, this.MIN_DISTANCE, this);
            if (!m.a()) {
                return;
            }
            m.b(TAG, " registerLocation start provider GPS and NETWORK");
        } catch (Exception e) {
            m.e(TAG, "registerLocation error: " + e.getMessage());
        }
    }

    private Address getAddress(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Address) ipChange.ipc$dispatch("3140106", new Object[]{this, new Double(d), new Double(d2)});
        }
        try {
            List<Address> fromLocation = new Geocoder(this.mContext).getFromLocation(d, d2, 1);
            if (fromLocation != null && fromLocation.size() > 0) {
                return fromLocation.get(0);
            }
            return null;
        } catch (Exception e) {
            m.e(TAG, "getAddress: getFromLocation error. " + e.getMessage());
            return null;
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d13e08b", new Object[]{this, location});
            return;
        }
        if (m.a()) {
            m.b(TAG, " onLocationChanged. ");
        }
        if (this.locationManager == null) {
            return;
        }
        wrapResult(location);
        this.locationManager.removeUpdates(this);
        this.getLocationSuccess = true;
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf45405", new Object[]{this, str, new Integer(i), bundle});
        } else if (!m.a()) {
        } else {
            m.b(TAG, " onStatusChanged. provider: " + str + ";status: " + i);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf9c02", new Object[]{this, str});
        } else if (!m.a()) {
        } else {
            m.b(TAG, " onProviderEnabled. provider: " + str);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eea11d", new Object[]{this, str});
        } else if (!m.a()) {
        } else {
            m.b(TAG, " onProviderDisabled. provider: " + str);
        }
    }

    private void wrapResult(final Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d8c04", new Object[]{this, location});
            return;
        }
        ArrayList<WVCallBackContext> arrayList = this.mCallbacks;
        if (arrayList == null || arrayList.isEmpty()) {
            m.b(TAG, "GetLocation wrapResult callbackContext is null");
        } else if (location == null) {
            m.d(TAG, "getLocation: location is null");
            Iterator<WVCallBackContext> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().error(new r());
            }
            this.mCallbacks.clear();
        } else {
            AsyncTask.execute(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVLocation.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    r rVar = new r();
                    JSONObject jSONObject = new JSONObject();
                    double longitude = location.getLongitude();
                    double latitude = location.getLatitude();
                    try {
                        jSONObject.put("longitude", longitude);
                        jSONObject.put("latitude", latitude);
                        jSONObject.put("altitude", location.getAltitude());
                        jSONObject.put(UserLocation.KEY_DOUBLE_ACCURACY, location.getAccuracy());
                        jSONObject.put("heading", location.getBearing());
                        jSONObject.put("speed", location.getSpeed());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    rVar.a("coords", jSONObject);
                    if (m.a()) {
                        m.b(WVLocation.TAG, " getLocation success. latitude: " + latitude + "; longitude: " + longitude);
                    }
                    if (WVLocation.access$100(WVLocation.this)) {
                        Address access$200 = WVLocation.access$200(WVLocation.this, latitude, longitude);
                        JSONObject jSONObject2 = new JSONObject();
                        if (access$200 != null) {
                            try {
                                jSONObject2.put("country", access$200.getCountryName());
                                jSONObject2.put("province", access$200.getAdminArea());
                                jSONObject2.put("city", access$200.getLocality());
                                jSONObject2.put(noa.KEY_CITY_CODE, access$200.getPostalCode());
                                jSONObject2.put("area", access$200.getSubLocality());
                                jSONObject2.put("road", access$200.getThoroughfare());
                                StringBuilder sb = new StringBuilder();
                                for (int i = 1; i <= 2; i++) {
                                    if (!TextUtils.isEmpty(access$200.getAddressLine(i))) {
                                        sb.append(access$200.getAddressLine(i));
                                    }
                                }
                                jSONObject2.put("addressLine", sb.toString());
                                if (m.a()) {
                                    m.b(WVLocation.TAG, " getAddress success. " + access$200.getAddressLine(0));
                                }
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        } else if (m.a()) {
                            m.d(WVLocation.TAG, " getAddress fail. ");
                        }
                        rVar.a("address", jSONObject2);
                    }
                    try {
                        Iterator it2 = WVLocation.access$300(WVLocation.this).iterator();
                        while (it2.hasNext()) {
                            ((WVCallBackContext) it2.next()).success(rVar);
                        }
                        WVLocation.access$300(WVLocation.this).clear();
                        if (!m.a()) {
                            return;
                        }
                        m.b(WVLocation.TAG, "callback success. retString: " + rVar.d());
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            if (!this.getLocationSuccess) {
                try {
                    locationManager.removeUpdates(this);
                } catch (Exception unused) {
                }
            }
            this.locationManager = null;
        }
        ArrayList<WVCallBackContext> arrayList = this.mCallbacks;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1) {
            LocationManager locationManager = this.locationManager;
            if (locationManager != null) {
                try {
                    locationManager.removeUpdates(this);
                    if (this.mCallbacks != null && !this.mCallbacks.isEmpty()) {
                        if (!this.getLocationSuccess) {
                            Iterator<WVCallBackContext> it = this.mCallbacks.iterator();
                            while (it.hasNext()) {
                                it.next().error(new r());
                            }
                            this.mCallbacks.clear();
                        }
                    }
                    m.b(TAG, "GetLocation wrapResult callbackContext is null");
                } catch (Exception e) {
                    m.e(TAG, "GetLocation timeout" + e.getMessage());
                    Iterator<WVCallBackContext> it2 = this.mCallbacks.iterator();
                    while (it2.hasNext()) {
                        it2.next().error(new r());
                    }
                    this.mCallbacks.clear();
                }
            }
            return true;
        }
        return false;
    }
}
