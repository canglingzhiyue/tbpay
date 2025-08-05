package com.taobao.passivelocation.gathering.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.passivelocation.gathering.service.LocationGatheringService;
import com.taobao.tao.Globals;
import tb.kfs;
import tb.kge;
import tb.ndr;
import tb.ndv;
import tb.ndw;
import tb.nea;

/* loaded from: classes7.dex */
public class LocationChangedReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REPORT_SOURCE = "locationreport";
    private String b = null;
    private a c = null;
    private long d = 0;
    private long e = 0;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.location.client.a f18672a = new com.taobao.location.client.a() { // from class: com.taobao.passivelocation.gathering.receiver.LocationChangedReceiver.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.location.client.a
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
            } else {
                LocationChangedReceiver.a(LocationChangedReceiver.this, tBLocationDTO);
            }
        }
    };

    static {
        kge.a(1765509532);
    }

    public static /* synthetic */ Object ipc$super(LocationChangedReceiver locationChangedReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(LocationChangedReceiver locationChangedReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b7047d", new Object[]{locationChangedReceiver});
        } else {
            locationChangedReceiver.a();
        }
    }

    public static /* synthetic */ void a(LocationChangedReceiver locationChangedReceiver, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c1778d", new Object[]{locationChangedReceiver, tBLocationDTO});
        } else {
            locationChangedReceiver.a(tBLocationDTO);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        AppMonitor.Counter.commit("passivelocation", "LocationChangedReceiver", 1.0d);
        ndw.d = System.currentTimeMillis();
        nea.d("lbs_passive.loc_LCRE", "[onReceive] invoked begin, start_time=" + ndw.d);
        String str = null;
        if (intent != null) {
            if (intent.hasExtra("alarm")) {
                str = intent.getStringExtra("alarm");
                nea.d("lbs_passive.loc_LCRE", "[onReceive] location source: " + str);
            } else if (intent.hasExtra(ndv.REQUEST_UPDATES)) {
                str = intent.getStringExtra(ndv.REQUEST_UPDATES);
                nea.d("lbs_passive.loc_LCRE", "[onReceive] location source: " + str);
            } else if (intent.hasExtra(REPORT_SOURCE)) {
                str = intent.getStringExtra(REPORT_SOURCE);
                nea.d("lbs_passive.loc_LCRE", "[onReceive] location source: " + str);
            } else {
                nea.c("lbs_passive.loc_LCRE", "[onReceive] location " + intent.toString());
            }
            this.b = str;
            try {
                c();
                this.d = System.currentTimeMillis();
                this.c = new a("passiveGatherLocationTask");
                Coordinator.postTask(this.c);
                return;
            } catch (Exception e) {
                nea.a("lbs_passive.loc_LCRE", "[onReceive] error", e);
                return;
            }
        }
        nea.c("lbs_passive.loc_LCRE", "intent is null");
    }

    /* loaded from: classes7.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2110247873);
        }

        public a(String str) {
            super(str);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LocationChangedReceiver.a(LocationChangedReceiver.this);
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (!new ndr(kfs.a()).a()) {
                return;
            }
            if (ndr.f31372a) {
                nea.d("lbs_passive.loc_LCRE", "[onReceive] 电量低不采集位置信息");
                return;
            }
            nea.d("lbs_passive.loc_LCRE", "[onReceive] 开始定位 ");
            if (ndr.b) {
                AppMonitor.Counter.commit("passivelocation", "backlocationtotal", 1.0d);
            } else {
                AppMonitor.Counter.commit("passivelocation", "locationtotal", 1.0d);
            }
            TBLocationClient a2 = TBLocationClient.a(kfs.a());
            nea.d("lbs_passive.loc_LCRE", "[startGather] start");
            a2.a(b(), this.f18672a, Looper.getMainLooper());
        } catch (Exception unused) {
        }
    }

    private TBLocationOption b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("43b76025", new Object[]{this});
        }
        TBLocationOption tBLocationOption = new TBLocationOption();
        tBLocationOption.setDataModel(TBLocationOption.DataModel.DEFAULT);
        tBLocationOption.setAccuracy(TBLocationOption.Accuracy.DEFAULT);
        tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.SEC_MIN);
        tBLocationOption.setTimeout(TBLocationOption.Timeout.DEFAULT);
        return tBLocationOption;
    }

    private void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{this, tBLocationDTO});
            return;
        }
        try {
            if (tBLocationDTO == null) {
                if (this.c != null) {
                    this.c = null;
                }
                AppMonitor.Counter.commit("passivelocation", "locationfailed", 1.0d);
                nea.d("lbs_passive.loc_LCRE", "[onReceive] 被定定位失败");
                return;
            }
            if (tBLocationDTO.isNavSuccess()) {
                AppMonitor.Counter.commit("passivelocation", "locationsuccess", 1.0d);
                String latitude = tBLocationDTO.getLatitude();
                String longitude = tBLocationDTO.getLongitude();
                Integer accuracy = tBLocationDTO.getAccuracy();
                Location location = new Location("gps");
                location.setLatitude(Double.parseDouble(latitude));
                location.setLongitude(Double.parseDouble(longitude));
                if (accuracy != null) {
                    location.setAccuracy(accuracy.floatValue());
                } else {
                    location.setAccuracy(0.0f);
                }
                Intent intent = new Intent(LocationGatheringService.LOCATION_CHANGED_ACTION);
                intent.setPackage(Globals.getApplication().getPackageName());
                intent.putExtra(ndw.EXTRA_KEY_LOCATION, location);
                intent.putExtra("location_source_key", this.b);
                Globals.getApplication().startService(intent);
                nea.d("lbs_passive.loc_LCRE", "[onReceive] 被定定位采集结果: " + location.toString());
            } else {
                AppMonitor.Counter.commit("passivelocation", "locationfailed", 1.0d);
                if (tBLocationDTO.getErrorCode() != null) {
                    String num = tBLocationDTO.getErrorCode().toString();
                    nea.d("lbs_passive.loc_LCRE", "[onReceive] 被定定位失败, errorcode:" + num);
                }
            }
            this.e = System.currentTimeMillis();
            d();
        } catch (Exception unused) {
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("locationtime");
        MeasureSet create2 = MeasureSet.create();
        create2.addMeasure("timevalue");
        AppMonitor.register("passivelocation", "locationtime", create2, create);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            AppMonitor.Stat.commit("network", "responeTime", DimensionValueSet.create().setValue("locationtime", "locationtime"), MeasureValueSet.create().setValue("timevalue", this.e - this.d));
        }
    }
}
