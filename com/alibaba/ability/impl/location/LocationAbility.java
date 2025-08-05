package com.alibaba.ability.impl.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsLocationAbility;
import com.taobao.android.abilityidl.ability.LocationData;
import com.taobao.android.abilityidl.ability.ca;
import com.taobao.android.abilityidl.ability.db;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.runtimepermission.d;
import com.taobao.runtimepermission.f;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public final class LocationAbility extends AbsLocationAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static final class b implements com.taobao.location.client.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ca b;
        public final /* synthetic */ Context c;

        public b(ca caVar, Context context) {
            this.b = caVar;
            this.c = context;
        }

        @Override // com.taobao.location.client.a
        public final void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
            } else if (tBLocationDTO == null || !tBLocationDTO.isNavSuccess) {
                LocationAbility.access$getLocationByLocationService(LocationAbility.this, this.c, this.b);
            } else {
                this.b.a(LocationAbility.access$convert2LocationData(LocationAbility.this, tBLocationDTO));
            }
        }
    }

    static {
        kge.a(-2112148572);
    }

    public static /* synthetic */ Object ipc$super(LocationAbility locationAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ LocationData access$convert2LocationData(LocationAbility locationAbility, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocationData) ipChange.ipc$dispatch("db9883e4", new Object[]{locationAbility, tBLocationDTO}) : locationAbility.a(tBLocationDTO);
    }

    public static final /* synthetic */ void access$getLocationByLocationService(LocationAbility locationAbility, Context context, ca caVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721f4707", new Object[]{locationAbility, context, caVar});
        } else {
            locationAbility.a(context, caVar);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocationAbility
    public void request(als abilityContext, db params, ca events) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd40faec", new Object[]{this, abilityContext, params, events});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(events, "events");
        Context f = abilityContext.f().f();
        if (f == null) {
            events.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
            return;
        }
        d a2 = f.a(f, params.f8807a, new String[]{com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION});
        if ((a2 != null ? a2.b : null) != null) {
            int[] iArr = a2.b;
            q.b(iArr, "permissionResult.grantResults");
            if ((true ^ (iArr.length == 0)) && a2.b[0] != 0) {
                events.a(new ErrorResult("NO_PERMISSION", "permission ACCESS_FINE_LOCATION required", (Map) null, 4, (o) null));
                return;
            }
        }
        if (params.d) {
            TBLocationOption tBLocationOption = new TBLocationOption();
            try {
                String str = params.b;
                q.b(str, "params.expires");
                tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.valueOf(str));
                tBLocationOption.setAccuracy(q.a((Object) "HIGH_MODE", (Object) params.c) ? TBLocationOption.Accuracy.TENMETER : TBLocationOption.Accuracy.DEFAULT);
                TBLocationClient.a(abilityContext.f().f()).a(tBLocationOption, new b(events, f), Looper.getMainLooper());
                return;
            } catch (IllegalArgumentException unused) {
                events.a(new ErrorResult("400", "expires \"" + params + ".expires\" dose not exist", (Map) null, 4, (o) null));
                return;
            }
        }
        a(f, events);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocationAbility
    public g<LocationData, ErrorResult> getCache(als abilityContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("40bf4ecf", new Object[]{this, abilityContext});
        }
        q.d(abilityContext, "abilityContext");
        TBLocationDTO b2 = TBLocationClient.b();
        if (b2 == null) {
            return new g<>(new LocationData(), null, 2, null);
        }
        if (b2.isNavSuccess) {
            return new g<>(a(b2), null, 2, null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "errorCode", (String) b2.errorCode);
        t tVar = t.INSTANCE;
        String jSONObject2 = jSONObject.toString();
        q.b(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
        return new g<>(null, new ErrorResult("500", jSONObject2, (Map) null, 4, (o) null));
    }

    private final void a(Context context, ca caVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b13717", new Object[]{this, context, caVar});
            return;
        }
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            LocationManager locationManager = (LocationManager) systemService;
            if (locationManager == null) {
                caVar.a(new ErrorResult("400", "request location by location service fail", (Map) null, 4, (o) null));
                return;
            }
            a aVar = new a(caVar, locationManager);
            locationManager.requestLocationUpdates("network", 1000L, 1.0f, aVar, Looper.getMainLooper());
            locationManager.requestLocationUpdates("gps", 1000L, 1.0f, aVar, Looper.getMainLooper());
        } catch (Exception unused) {
            caVar.a(new ErrorResult("400", "request location by location service fail", (Map) null, 4, (o) null));
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements LocationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ca f1907a;
        public final /* synthetic */ LocationManager b;

        /* renamed from: com.alibaba.ability.impl.location.LocationAbility$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class RunnableC0053a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Location b;

            public RunnableC0053a(Location location) {
                this.b = location;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ca caVar = a.this.f1907a;
                LocationData locationData = new LocationData();
                locationData.longitude = String.valueOf(this.b.getLongitude());
                locationData.latitude = String.valueOf(this.b.getLatitude());
                t tVar = t.INSTANCE;
                caVar.a(locationData);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String provider) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20eea11d", new Object[]{this, provider});
            } else {
                q.d(provider, "provider");
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String provider) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf9c02", new Object[]{this, provider});
            } else {
                q.d(provider, "provider");
            }
        }

        @Override // android.location.LocationListener
        @Deprecated(message = "Deprecated in Java")
        public void onStatusChanged(String str, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adf45405", new Object[]{this, str, new Integer(i), bundle});
            }
        }

        public a(ca caVar, LocationManager locationManager) {
            this.f1907a = caVar;
            this.b = locationManager;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d13e08b", new Object[]{this, location});
                return;
            }
            q.d(location, "location");
            e.c((Runnable) new RunnableC0053a(location));
            this.b.removeUpdates(this);
        }
    }

    private final LocationData a(TBLocationDTO tBLocationDTO) {
        Long l;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationData) ipChange.ipc$dispatch("97927274", new Object[]{this, tBLocationDTO});
        }
        LocationData locationData = new LocationData();
        String str = null;
        locationData.longitude = tBLocationDTO != null ? tBLocationDTO.longitude : null;
        locationData.latitude = tBLocationDTO != null ? tBLocationDTO.latitude : null;
        locationData.accuracy = (tBLocationDTO == null || (num = tBLocationDTO.accuracy) == null) ? null : String.valueOf(num.intValue());
        locationData.address = tBLocationDTO != null ? tBLocationDTO.address : null;
        locationData.city = tBLocationDTO != null ? tBLocationDTO.cityName : null;
        locationData.area = tBLocationDTO != null ? tBLocationDTO.areaName : null;
        locationData.country = tBLocationDTO != null ? tBLocationDTO.countryName : null;
        locationData.province = tBLocationDTO != null ? tBLocationDTO.provinceName : null;
        locationData.cityCode = tBLocationDTO != null ? tBLocationDTO.cityCode : null;
        locationData.areaCode = tBLocationDTO != null ? tBLocationDTO.areaCode : null;
        if (tBLocationDTO != null && (l = tBLocationDTO.timeStamp) != null) {
            str = String.valueOf(l.longValue());
        }
        locationData.timeStamp = str;
        return locationData;
    }
}
