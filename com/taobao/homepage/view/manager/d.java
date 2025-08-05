package com.taobao.homepage.view.manager;

import android.os.AsyncTask;
import android.os.Looper;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.utils.n;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.lan;
import tb.lbq;
import tb.ldf;
import tb.oqq;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LocationManager";
    private TBLocationDTO b;
    private AtomicBoolean c = new AtomicBoolean(false);
    private lbq d;
    private Map<String, TBLocationOption.Accuracy> e;

    static {
        kge.a(1648047738);
    }

    private double a(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{this, new Double(d)})).doubleValue() : (d * 3.141592653589793d) / 180.0d;
    }

    public static /* synthetic */ String a(d dVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b88571f", new Object[]{dVar, tBLocationDTO}) : dVar.c(tBLocationDTO);
    }

    public d(lbq lbqVar) {
        this.d = lbqVar;
        if (n.o()) {
            this.b = f.a();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!com.taobao.tao.homepage.a.a()) {
            ldf.d(TAG, "updateLocationGetRefreshData enablePosition false");
        } else {
            b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ldf.d(TAG, "executeLocation ");
        if (!this.c.compareAndSet(false, true)) {
            return;
        }
        TBLocationOption.TimeLimit valueOf = TBLocationOption.TimeLimit.valueOf(j.b());
        if (valueOf == TBLocationOption.TimeLimit.DEFAULT) {
            valueOf = TBLocationOption.TimeLimit.TEN_MIN;
        }
        ldf.d(TAG, "获取定位信息 缓存定位时限" + valueOf);
        TBLocationOption tBLocationOption = new TBLocationOption();
        tBLocationOption.setTimeLimit(valueOf);
        tBLocationOption.setAccuracy(d());
        tBLocationOption.setTimeout(TBLocationOption.Timeout.DEFAULT);
        a aVar = new a(this.d);
        lan.a();
        TBLocationClient.a(this.d.getCurActivity()).a(tBLocationOption, aVar, Looper.getMainLooper());
        AppMonitor.Counter.commit("Page_Home", "getReadTimeLoacation", 1.0d);
        ldf.d(TAG, "try to get realTime location ..");
    }

    public void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{this, tBLocationDTO});
        } else if (!HomePageUtility.a(j.a("homeLocationRequestEnable", "true"))) {
            ldf.d(TAG, "updateLocationGetRefreshData homeLocationRequestEnable false");
        } else {
            TBLocationDTO tBLocationDTO2 = this.b;
            if (tBLocationDTO2 == null) {
                ldf.d(TAG, "RealLocation=" + tBLocationDTO.getLongitude() + "-" + tBLocationDTO.getLatitude());
                oqq.a(tBLocationDTO);
                com.taobao.tao.topmultitab.c.a().a(tBLocationDTO);
                return;
            }
            double a2 = a(tBLocationDTO2, tBLocationDTO);
            double d = j.d();
            ldf.d(TAG, "两地点位置差距" + a2 + "米。 阀值" + d + "米。");
            if (a2 <= d) {
                return;
            }
            ldf.d(TAG, "RealLocation=" + this.b.getLongitude() + "-" + this.b.getLatitude());
            oqq.a(tBLocationDTO);
            com.taobao.tao.topmultitab.c.a().a(tBLocationDTO);
        }
    }

    private double a(TBLocationDTO tBLocationDTO, TBLocationDTO tBLocationDTO2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad6f82f6", new Object[]{this, tBLocationDTO, tBLocationDTO2})).doubleValue();
        }
        try {
            return a(Double.parseDouble(tBLocationDTO.getLatitude()), Double.parseDouble(tBLocationDTO.getLongitude()), Double.parseDouble(tBLocationDTO2.getLatitude()), Double.parseDouble(tBLocationDTO2.getLongitude()));
        } catch (NumberFormatException e) {
            ldf.a(TAG, "location distance parseDouble error", e);
            return -1.0d;
        }
    }

    private double a(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("944517d6", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Double(d4)})).doubleValue();
        }
        double a2 = a(d);
        double a3 = a(d3);
        return Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((a2 - a3) / 2.0d), 2.0d) + ((Math.cos(a2) * Math.cos(a3)) * Math.pow(Math.sin((a(d2) - a(d4)) / 2.0d), 2.0d)))) * 2.0d) * 6378137.0d) * 10000.0d) / 10000;
    }

    private String c(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("894ad9a6", new Object[]{this, tBLocationDTO});
        }
        if (this.b == null) {
            return "oldlong=无\noldlat=无\nnewlong=" + tBLocationDTO.getLongitude() + "\noldlat=" + tBLocationDTO.getLatitude() + "\n精度" + tBLocationDTO.getAccuracy();
        }
        return "oldlong=" + this.b.getLongitude() + "\noldlat=" + this.b.getLatitude() + "\nold精度" + this.b.getAccuracy() + "\nnewlong=" + tBLocationDTO.getLongitude() + "\nnewlat=" + tBLocationDTO.getLatitude() + "\n精度" + tBLocationDTO.getAccuracy();
    }

    /* loaded from: classes7.dex */
    public static class a implements com.taobao.location.client.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<lbq> f17319a;

        static {
            kge.a(-1791072220);
            kge.a(-394465787);
        }

        public static /* synthetic */ WeakReference a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("85ca842", new Object[]{aVar}) : aVar.f17319a;
        }

        public a(lbq lbqVar) {
            this.f17319a = new WeakReference<>(lbqVar);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.homepage.view.manager.d$a$1] */
        @Override // com.taobao.location.client.a
        public void onLocationChanged(final TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                return;
            }
            ldf.d(d.TAG, "home_location_update");
            new AsyncTask<Void, Void, Void>() { // from class: com.taobao.homepage.view.manager.d.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    ldf.d(d.TAG, "onLocationChanged doInBackground");
                    lan.b();
                    lbq lbqVar = (lbq) a.a(a.this).get();
                    if (lbqVar != null && lbqVar.getCurActivity() != null) {
                        d l = lbqVar.getHomePageManager().l();
                        l.c().set(false);
                        TBLocationDTO tBLocationDTO2 = tBLocationDTO;
                        if (tBLocationDTO2 == null) {
                            lan.a((TBLocationDTO) null);
                            ldf.d(d.TAG, "位置获取失败 location 为空");
                            return null;
                        } else if (!tBLocationDTO2.isNavSuccess()) {
                            lan.a(tBLocationDTO);
                            ldf.d(d.TAG, "位置获取失败" + tBLocationDTO.getErrorCode());
                            return null;
                        } else {
                            ldf.d(d.TAG, d.a(l, tBLocationDTO));
                            l.a(tBLocationDTO);
                        }
                    }
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void b(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc50eff9", new Object[]{this, tBLocationDTO});
        } else {
            this.b = tBLocationDTO;
        }
    }

    public AtomicBoolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("34e62c2a", new Object[]{this}) : this.c;
    }

    private TBLocationOption.Accuracy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption.Accuracy) ipChange.ipc$dispatch("f0b8432", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new HashMap();
            this.e.put("DEFAULT", TBLocationOption.Accuracy.DEFAULT);
            this.e.put("TENMETER", TBLocationOption.Accuracy.TENMETER);
            this.e.put("HEKTOMETER", TBLocationOption.Accuracy.HEKTOMETER);
            this.e.put("KILOMETER", TBLocationOption.Accuracy.KILOMETER);
        }
        return this.e.get(j.a("home_location_accuracy_switch", "DEFAULT"));
    }
}
