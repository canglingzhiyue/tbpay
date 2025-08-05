package com.taobao.activelocation.location.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.List;
import tb.dcr;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends dcr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String c;
    private LocationManager d;
    private PendingIntent e;
    private BroadcastReceiver f;

    static {
        kge.a(796118193);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dcr
    public LocationTypeEnum c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationTypeEnum) ipChange.ipc$dispatch("9e2d796e", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ void a(c cVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a93649", new Object[]{cVar, intent});
        } else {
            cVar.a(intent);
        }
    }

    public c(Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, HashMap<String, String> hashMap) {
        super(handler, tBLocationOption, iTBLocationCallback, LocationTypeEnum.NLPLOCATION, hashMap);
        this.c = "lbs_NLPLocation";
    }

    @Override // tb.dcr
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "nlpLocation", "off"))) {
            b();
        } else {
            AppMonitor.Counter.commit("passivelocation", "NLPLocation", 1.0d);
            try {
                if (ActivityCompat.checkSelfPermission(this.b.getApplicationContext(), com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION) != 0 && ActivityCompat.checkSelfPermission(this.b.getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    b();
                    return;
                }
            } catch (Exception unused) {
            }
            this.d = (LocationManager) this.b.getSystemService("location");
            Criteria criteria = new Criteria();
            criteria.setPowerRequirement(1);
            List<String> providers = this.d.getProviders(criteria, true);
            if (providers == null || providers.size() == 0) {
                b();
                return;
            }
            this.f = new BroadcastReceiver() { // from class: com.taobao.activelocation.location.impl.NLPLocation$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else {
                        c.a(c.this, intent);
                    }
                }
            };
            try {
                Globals.getApplication().registerReceiver(this.f, new IntentFilter("com.taobao.passivelocation.business.PL_SINGLE_LOCATION_UPDATE_ACTION"));
                this.e = com.android.taobao.aop.a.b(this.b, 0, new Intent("com.taobao.passivelocation.business.PL_SINGLE_LOCATION_UPDATE_ACTION"), 134217728);
                this.d.requestSingleUpdate("network", this.e);
            } catch (Exception unused2) {
                b();
            }
        }
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        TBLocationDTO tBLocationDTO = null;
        if (extras != null) {
            tBLocationDTO = a((Location) extras.get("location"));
        }
        if (tBLocationDTO == null) {
            b();
        } else {
            a(tBLocationDTO);
            AppMonitor.Counter.commit("passivelocation", "NLPLocationSuccess", 1.0d);
        }
        try {
            this.d.removeUpdates(this.e);
            Globals.getApplication().unregisterReceiver(this.f);
        } catch (Exception e) {
            String str = "释放定位资源错误： " + e.getMessage();
        }
    }

    private TBLocationDTO a(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("871a747c", new Object[]{this, location});
        }
        if (location == null) {
            return null;
        }
        TBLocationDTO tBLocationDTO = new TBLocationDTO();
        try {
            tBLocationDTO.latitude = String.valueOf(location.getLatitude());
            tBLocationDTO.longitude = String.valueOf(location.getLongitude());
            tBLocationDTO.accuracy = Integer.valueOf((int) location.getAccuracy());
            return tBLocationDTO;
        } catch (Exception unused) {
            return null;
        }
    }
}
