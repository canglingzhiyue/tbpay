package com.taobao.geofence.aidl;

import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.fence.common.ResultEnums;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.client.a;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import tb.kfs;
import tb.kge;
import tb.nea;

/* loaded from: classes7.dex */
public class LocationGather {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG = "lbs_sdk.fence_LocationGather";
    public a callback = new a() { // from class: com.taobao.geofence.aidl.LocationGather.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.location.client.a
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            GatherManager access$200;
            TBFenceClient.TypeEnum typeEnum;
            Looper access$000;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                return;
            }
            String str = null;
            try {
                if (tBLocationDTO == null) {
                    nea.d(LocationGather.LOG, "[onLocationChanged] data=null");
                    LocationGather.access$200(LocationGather.this).setGatherData(TBFenceClient.TypeEnum.GEOMETRY, null);
                    if (access$000 == null) {
                        return;
                    }
                    return;
                }
                if (tBLocationDTO.isNavSuccess) {
                    String str2 = tBLocationDTO.latitude;
                    String str3 = tBLocationDTO.longitude;
                    Integer num = tBLocationDTO.accuracy;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(";");
                    sb.append(str3);
                    sb.append(";");
                    if (num != null) {
                        i = num.intValue();
                    }
                    sb.append(i);
                    String sb2 = sb.toString();
                    nea.d(LocationGather.LOG, "[onLocationChanged] data=" + sb2 + "; locationType=" + tBLocationDTO.locationType);
                    if (num != null) {
                        access$200 = LocationGather.access$200(LocationGather.this);
                        typeEnum = TBFenceClient.TypeEnum.GEOMETRY;
                        str = JSON.toJSONString(new Loction(Double.parseDouble(str2), Double.parseDouble(str3), num.intValue()));
                    } else {
                        access$200 = LocationGather.access$200(LocationGather.this);
                        typeEnum = TBFenceClient.TypeEnum.GEOMETRY;
                        str = JSON.toJSONString(new Loction(Double.parseDouble(str2), Double.parseDouble(str3), 0));
                    }
                } else {
                    nea.a(LocationGather.LOG, "[onLocationChanged] error,errorCode=" + tBLocationDTO.getErrorCode());
                    access$200 = LocationGather.access$200(LocationGather.this);
                    typeEnum = TBFenceClient.TypeEnum.GEOMETRY;
                }
                access$200.setGatherData(typeEnum, str);
                if (LocationGather.access$000(LocationGather.this) == null) {
                    return;
                }
                LocationGather.access$000(LocationGather.this).quit();
            } finally {
                if (LocationGather.access$000(LocationGather.this) != null) {
                    LocationGather.access$000(LocationGather.this).quit();
                }
            }
        }
    };
    private GatherManager gatherManager;
    private Looper looper;

    static {
        kge.a(246887955);
    }

    public ResultEnums check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultEnums) ipChange.ipc$dispatch("d8c6307e", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ Looper access$000(LocationGather locationGather) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Looper) ipChange.ipc$dispatch("ee7ef34c", new Object[]{locationGather}) : locationGather.looper;
    }

    public static /* synthetic */ Looper access$002(LocationGather locationGather, Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("238c15e5", new Object[]{locationGather, looper});
        }
        locationGather.looper = looper;
        return looper;
    }

    public static /* synthetic */ TBLocationOption access$100(LocationGather locationGather) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLocationOption) ipChange.ipc$dispatch("aa6e14d2", new Object[]{locationGather}) : locationGather.createOption();
    }

    public static /* synthetic */ GatherManager access$200(LocationGather locationGather) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GatherManager) ipChange.ipc$dispatch("9f7d7901", new Object[]{locationGather}) : locationGather.gatherManager;
    }

    public LocationGather(GatherManager gatherManager) {
        this.gatherManager = gatherManager;
        AppMonitor.Counter.commit("passivelocation", "LocationGather", 1.0d);
    }

    public void startGather() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b047b04", new Object[]{this});
        } else {
            new Thread(new Runnable() { // from class: com.taobao.geofence.aidl.LocationGather.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TBLocationClient a2 = TBLocationClient.a(kfs.a());
                    LocationGather.access$002(LocationGather.this, Looper.myLooper());
                    if (LocationGather.access$000(LocationGather.this) == null) {
                        Looper.prepare();
                    }
                    LocationGather.access$002(LocationGather.this, Looper.myLooper());
                    nea.d(LocationGather.LOG, "[startGather] start");
                    a2.a(LocationGather.access$100(LocationGather.this), LocationGather.this.callback, Looper.getMainLooper());
                    Looper.loop();
                }
            }, "locaton_gather_thread").start();
        }
    }

    private TBLocationOption createOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("cf0a0e54", new Object[]{this});
        }
        TBLocationOption tBLocationOption = new TBLocationOption();
        tBLocationOption.setDataModel(TBLocationOption.DataModel.DEFAULT);
        tBLocationOption.setAccuracy(TBLocationOption.Accuracy.DEFAULT);
        tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.NO_CACHE);
        return tBLocationOption;
    }

    /* loaded from: classes7.dex */
    public static class Loction {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int accuracy;
        public final double latitude;
        public final double longitude;

        static {
            kge.a(-347295581);
        }

        public double getLatitude() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b6fad57", new Object[]{this})).doubleValue() : this.latitude;
        }

        public double getLongitude() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b61adaee", new Object[]{this})).doubleValue() : this.longitude;
        }

        public int getAccuracy() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1891ab69", new Object[]{this})).intValue() : this.accuracy;
        }

        public Loction(double d, double d2, int i) {
            this.latitude = d;
            this.longitude = d2;
            this.accuracy = i;
        }
    }
}
