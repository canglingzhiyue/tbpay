package com.taobao.activelocation.location.impl;

import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.UmidtokenInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.NetWorkUtils;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import tb.dcq;
import tb.dcr;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends dcr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AMapLocationClient c;
    private boolean d;

    static {
        kge.a(1506941416);
    }

    public static /* synthetic */ void a(a aVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb8e79e", new Object[]{aVar, tBLocationDTO});
        } else {
            aVar.a(tBLocationDTO);
        }
    }

    public static /* synthetic */ void a(a aVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200fc925", new Object[]{aVar, hashMap});
        } else {
            aVar.a(hashMap);
        }
    }

    public static /* synthetic */ void b(a aVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd144e6", new Object[]{aVar, hashMap});
        } else {
            aVar.a(hashMap);
        }
    }

    public static /* synthetic */ void c(a aVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d792c0a7", new Object[]{aVar, hashMap});
        } else {
            aVar.a(hashMap);
        }
    }

    public a(Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, HashMap<String, String> hashMap) {
        super(handler, tBLocationOption, iTBLocationCallback, LocationTypeEnum.GDLOCATION, hashMap);
        this.d = false;
        this.c = null;
    }

    @Override // tb.dcr
    public void a() {
        IpChange ipChange = $ipChange;
        final boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        final HashMap<String, String> hashMap = new HashMap<>();
        AppMonitor.Counter.commit("passivelocation", "GDLocation", 1.0d);
        hashMap.put(dcq.d, "12");
        if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "gdLocation", "on"))) {
            a(hashMap);
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 23 && !((LocationManager) Globals.getApplication().getSystemService("location")).isProviderEnabled("gps")) {
                hashMap.put(dcq.d, "10");
                z = true;
            }
            if (ActivityCompat.checkSelfPermission(this.b.getApplicationContext(), com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION) != 0 && ActivityCompat.checkSelfPermission(this.b.getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                hashMap.put(dcq.d, "11");
                a(hashMap);
                return;
            }
        } catch (Exception unused) {
        }
        if (!this.d) {
            this.d = true;
            try {
                UmidtokenInfo.setUmidtoken(Globals.getApplication().getApplicationContext(), SecurityGuardManager.getInstance(Globals.getApplication().getApplicationContext()).getUMIDComp().getSecurityToken());
            } catch (Exception unused2) {
            }
        }
        AMapLocationClientOption.setLocationProtocol(AMapLocationClientOption.AMapLocationProtocol.HTTPS);
        try {
            this.c = new AMapLocationClient(this.b);
        } catch (Exception e) {
            TLog.loge("lbs_GDLocation", "高德定位失败,初始化异常: " + e.toString());
            AppMonitor.Counter.commit("passivelocation", "GD_AMapClientInitFailed", 1.0d);
            AMapLocationClient.updatePrivacyShow(Globals.getApplication(), true, true);
            AMapLocationClient.updatePrivacyAgree(Globals.getApplication(), true);
        }
        AMapLocationClient aMapLocationClient = this.c;
        if (aMapLocationClient == null) {
            a(hashMap);
            return;
        }
        aMapLocationClient.setLocationListener(new AMapLocationListener() { // from class: com.taobao.activelocation.location.impl.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.amap.api.location.AMapLocationListener
            public void onLocationChanged(AMapLocation aMapLocation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9853887", new Object[]{this, aMapLocation});
                    return;
                }
                if (aMapLocation == null) {
                    if (!z) {
                        hashMap.put(dcq.d, AgooConstants.ACK_PACK_NOBIND);
                    }
                    Log.e("lbs_GDLocation", "高德定位失败, amapLocation == null");
                    a.c(a.this, hashMap);
                } else if (aMapLocation.getErrorCode() == 0) {
                    TBLocationDTO tBLocationDTO = new TBLocationDTO();
                    if (a.this.a(aMapLocation, tBLocationDTO)) {
                        if ("gps".equals(aMapLocation.getProvider())) {
                            a.this.a(LocationTypeEnum.GPSLOCATION);
                        }
                        a.a(a.this, tBLocationDTO);
                    } else {
                        if (!z) {
                            hashMap.put(dcq.d, "12");
                        }
                        a.a(a.this, hashMap);
                    }
                } else {
                    Log.e("lbs_GDLocation", "高德定位失败");
                    Log.e("lbs_GDLocation", JSON.toJSONString(aMapLocation));
                    HashMap hashMap2 = hashMap;
                    String str = dcq.e;
                    hashMap2.put(str, aMapLocation.getErrorCode() + "");
                    a.b(a.this, hashMap);
                }
                if (a.this.c == null) {
                    return;
                }
                a.this.c.stopLocation();
                a.this.c.onDestroy();
            }
        });
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        if (this.f26693a.getAccuracy() == TBLocationOption.Accuracy.TENMETER) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        } else {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        }
        aMapLocationClientOption.setNeedAddress(true).setOnceLocation(true).setMockEnable(true).setInterval(2000L);
        this.c.setLocationOption(aMapLocationClientOption);
        this.c.startLocation();
        AppMonitor.Counter.commit("passivelocation", "GDLocation", 1.0d);
    }

    @Override // tb.dcr
    public LocationTypeEnum c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationTypeEnum) ipChange.ipc$dispatch("9e2d796e", new Object[]{this});
        }
        if (!NetWorkUtils.isNetworkAvailable(Globals.getApplication())) {
            return null;
        }
        return LocationTypeEnum.NLPLOCATION;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r5.endsWith("市") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.amap.api.location.AMapLocation r12, com.taobao.location.common.TBLocationDTO r13) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.activelocation.location.impl.a.a(com.amap.api.location.AMapLocation, com.taobao.location.common.TBLocationDTO):boolean");
    }
}
