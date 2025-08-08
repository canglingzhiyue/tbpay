package com.alibaba.security.realidentity;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.service.sensor.api.RpSecException;
import com.alibaba.security.realidentity.service.sensor.model.DisplayInfo;
import com.alibaba.security.realidentity.service.sensor.model.MotionEventData;
import com.alibaba.security.realidentity.service.sensor.model.RpCollectInfo;
import com.alibaba.security.realidentity.service.sensor.model.SensorData;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class r3 implements t3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String l = "DataCollectorManager";
    public static final String m = "key_need_collect";
    public static final String n = "key_enabled_sensors";
    public static final String o = "key_interval";
    public static final String p = "key_max_click_count";
    public static final String q = "key_max_sensor_count";
    public static final String r = "processResult";
    public static final String s = "data";
    public final v3 e;
    public final w3 f;
    public final x3 g;
    public final String h;
    public final RPBizConfig i;
    public volatile boolean j = false;
    public u4 k;

    public r3(Activity activity, RPBizConfig rPBizConfig, u4 u4Var) {
        this.i = rPBizConfig;
        this.k = u4Var;
        this.e = new v3(activity);
        this.f = new w3(activity);
        this.g = new x3(activity);
        this.h = activity.getClass().getSimpleName();
        e();
    }

    private List<RpCollectInfo> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        RpCollectInfo rpCollectInfo = new RpCollectInfo();
        List<DisplayInfo> f = this.e.f();
        List<MotionEventData> f2 = this.f.f();
        List<SensorData> g = this.g.g();
        rpCollectInfo.activityName = this.h;
        rpCollectInfo.displayInfoArray = f;
        rpCollectInfo.displayModelSize = f.size();
        rpCollectInfo.sensorDataArray = g;
        rpCollectInfo.sensorListSize = g.size();
        rpCollectInfo.motionDataArray = f2;
        rpCollectInfo.motionListSize = f2.size();
        rpCollectInfo.timestamp = System.currentTimeMillis();
        arrayList.add(rpCollectInfo);
        return arrayList;
    }

    private HashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.i.getScConfig() == null) {
            return hashMap;
        }
        hashMap.put(m, String.valueOf(this.i.getScConfig().needCollect));
        hashMap.put(n, this.i.getScConfig().enableSensors);
        hashMap.put(o, String.valueOf(this.i.getScConfig().interval));
        hashMap.put(p, String.valueOf(this.i.getScConfig().maxClickCnt));
        hashMap.put(q, String.valueOf(this.i.getScConfig().clickSensorCnt));
        return hashMap;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            a(d());
        } catch (RpSecException e) {
            a("Data Collect init failed: " + e.getErrorCode() + "::" + e.getMessage());
        }
    }

    @Override // com.alibaba.security.realidentity.t3
    public void a(HashMap<String, String> hashMap) throws RpSecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        String str = hashMap.get(m);
        if (!StringUtils.isEmpty(str)) {
            this.j = Boolean.parseBoolean(str);
        }
        z3 z3Var = new z3(hashMap);
        this.e.a(z3Var);
        this.f.a(z3Var);
        this.g.a(z3Var);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            return (String) a(2).get("data");
        } catch (RpSecException e) {
            a("Data Collect failed: " + e.getErrorCode() + "::" + e.getMessage());
            return null;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            a(1);
            a(true);
        } catch (RpSecException e) {
            a("Data Collect start failed: " + e.getErrorCode() + "::" + e.getMessage());
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            a(3);
            a(false);
        } catch (RpSecException e) {
            a("Data Collect stop failed: " + e.getErrorCode() + "::" + e.getMessage());
        }
    }

    @Override // com.alibaba.security.realidentity.t3
    public HashMap<String, Object> a(int i) throws RpSecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ebc7383e", new Object[]{this, new Integer(i)});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!this.j) {
            return hashMap;
        }
        if (i == 1) {
            this.e.d();
            this.f.d();
            this.g.d();
            hashMap.put(r, Boolean.TRUE);
            hashMap.put("data", null);
        } else if (i == 2) {
            List<RpCollectInfo> c = c();
            hashMap.put(r, Boolean.TRUE);
            hashMap.put("data", b.a(c));
        } else if (i == 3) {
            this.e.e();
            this.f.e();
            this.g.e();
            hashMap.put(r, Boolean.TRUE);
            hashMap.put("data", null);
        } else if (i == 4) {
            this.e.c();
            this.f.c();
            this.g.c();
            hashMap.put(r, Boolean.TRUE);
            hashMap.put("data", null);
        }
        return hashMap;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TrackLog createDataCollectionExceptionLog = TrackLog.createDataCollectionExceptionLog(str);
        createDataCollectionExceptionLog.addTag9(g2.f3421a + "/" + g2.b);
        createDataCollectionExceptionLog.addTag10("Android");
        this.k.a(this.i.getBasicsConfig().verifyToken, createDataCollectionExceptionLog);
    }

    private void a(boolean z) {
        TrackLog createCollectSensorEndLog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            createCollectSensorEndLog = TrackLog.createCollectSensorStartLog(this.h);
        } else {
            createCollectSensorEndLog = TrackLog.createCollectSensorEndLog(this.h);
        }
        createCollectSensorEndLog.addTag9(g2.f3421a + "/" + g2.b);
        createCollectSensorEndLog.addTag10("Android");
        this.k.a(this.i.getBasicsConfig().verifyToken, createCollectSensorEndLog);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            a(4);
        } catch (RpSecException e) {
            a("Data Collect reset failed: " + e.getErrorCode() + "::" + e.getMessage());
        }
    }
}
