package com.taobao.homepage.view.manager;

import android.content.Context;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.n;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ksp;
import tb.lan;
import tb.ldf;
import tb.oqq;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "chengyuNewLocationManager";
    private static TBLocationDTO b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, TBLocationOption.Accuracy> f17321a;

    static {
        kge.a(-1529698058);
    }

    public static /* synthetic */ TBLocationDTO a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("f9c29fee", new Object[]{tBLocationDTO});
        }
        b = tBLocationDTO;
        return tBLocationDTO;
    }

    public static /* synthetic */ String a(f fVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("82a75fa1", new Object[]{fVar, tBLocationDTO}) : fVar.c(tBLocationDTO);
    }

    public static /* synthetic */ void b(f fVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758828a0", new Object[]{fVar, tBLocationDTO});
        } else {
            fVar.b(tBLocationDTO);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        ldf.d(TAG, "updateLocationGetRefreshData");
        if (!HomePageUtility.a(j.a("homeLocationRequestEnable", "true"))) {
            ldf.d(TAG, "updateLocationGetRefreshData homeLocationRequestEnable false");
        } else if (!com.taobao.tao.homepage.a.a()) {
            ldf.d(TAG, "updateLocationGetRefreshData enablePosition false");
        } else {
            c(context);
        }
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        ldf.d(TAG, "executeLocation");
        TBLocationOption.TimeLimit valueOf = TBLocationOption.TimeLimit.valueOf(j.b());
        if (valueOf == TBLocationOption.TimeLimit.DEFAULT) {
            valueOf = TBLocationOption.TimeLimit.TEN_MIN;
        }
        ldf.d(TAG, "获取定位信息 缓存定位时限" + valueOf);
        TBLocationOption tBLocationOption = new TBLocationOption();
        tBLocationOption.setTimeLimit(valueOf);
        tBLocationOption.setAccuracy(c());
        tBLocationOption.setTimeout(TBLocationOption.Timeout.DEFAULT);
        a aVar = new a(this);
        Looper looper = com.taobao.gateway.dispatch.a.b().a().getLooper();
        lan.a();
        if (!n.o()) {
            return;
        }
        TBLocationDTO a2 = TBLocationClient.a(tBLocationOption);
        if (a2 != null) {
            aVar.onLocationChanged(a2);
            TBLocationClient.a(context).a(tBLocationOption, (com.taobao.location.client.a) null, looper);
            ldf.d(TAG, "LocationChange", "use location cache to request");
            return;
        }
        TBLocationClient.a(context).a(tBLocationOption, aVar, looper);
        ldf.d(TAG, "LocationChange", "try to get real location to request");
    }

    private void b(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc50eff9", new Object[]{this, tBLocationDTO});
            return;
        }
        ldf.d(TAG, "RealLocation=" + tBLocationDTO.getLongitude() + "-" + tBLocationDTO.getLatitude());
        oqq.a(tBLocationDTO);
        com.taobao.tao.topmultitab.c.a().a(tBLocationDTO);
    }

    private String c(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("894ad9a6", new Object[]{this, tBLocationDTO});
        }
        return "oldlong=无\noldlat=无\nnewlong=" + tBLocationDTO.getLongitude() + "\noldlat=" + tBLocationDTO.getLatitude() + "\n精度" + tBLocationDTO.getAccuracy();
    }

    /* loaded from: classes7.dex */
    public static class a implements com.taobao.location.client.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private SoftReference<f> f17322a;

        static {
            kge.a(551730472);
            kge.a(-394465787);
        }

        public a(f fVar) {
            this.f17322a = new SoftReference<>(fVar);
        }

        @Override // com.taobao.location.client.a
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                return;
            }
            ksp.a(f.TAG, "home_location_update");
            lan.b();
            f fVar = this.f17322a.get();
            if (fVar == null) {
                return;
            }
            if (tBLocationDTO == null) {
                lan.a((TBLocationDTO) null);
                ksp.c(f.TAG, "位置获取失败 location 为空");
            } else if (!tBLocationDTO.isNavSuccess()) {
                lan.a(tBLocationDTO);
                ksp.c(f.TAG, "位置获取失败" + tBLocationDTO.getErrorCode());
            } else {
                ksp.c(f.TAG, f.a(fVar, tBLocationDTO));
                f.a(tBLocationDTO);
                f.b(fVar, tBLocationDTO);
            }
        }
    }

    public static TBLocationDTO a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLocationDTO) ipChange.ipc$dispatch("17ffc33e", new Object[0]) : b;
    }

    private TBLocationOption.Accuracy c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption.Accuracy) ipChange.ipc$dispatch("821e6d13", new Object[]{this});
        }
        if (this.f17321a == null) {
            this.f17321a = new HashMap();
            this.f17321a.put("DEFAULT", TBLocationOption.Accuracy.DEFAULT);
            this.f17321a.put("TENMETER", TBLocationOption.Accuracy.TENMETER);
            this.f17321a.put("HEKTOMETER", TBLocationOption.Accuracy.HEKTOMETER);
            this.f17321a.put("KILOMETER", TBLocationOption.Accuracy.KILOMETER);
        }
        return this.f17321a.get(j.a("home_location_accuracy_switch", "DEFAULT"));
    }
}
