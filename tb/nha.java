package tb;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import java.util.Map;

/* loaded from: classes.dex */
public class nha implements nfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(510065699);
        kge.a(-1442430675);
    }

    public nha() {
        try {
            a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tb.nfc
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, jSONObject.toJSONString());
        }
    }

    @Override // tb.nfc
    public void a(String str, String str2, JSONObject jSONObject, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e621808", new Object[]{this, str, str2, jSONObject, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, jSONObject.toJSONString(), str3, str4);
        }
    }

    @Override // tb.nfc
    public void a(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{this, str, str2, map, map2});
            return;
        }
        if (map != null && map2 != null) {
            try {
                AppMonitor.Stat.commit(str, str2, DimensionValueSet.fromStringMap(map), MeasureValueSet.create(map2));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.nfc
    public void a(String str, Map<String, Object> map, long j, Fragment fragment) {
        g a2;
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543462c1", new Object[]{this, str, map, new Long(j), fragment});
        } else if (j != 0 && map != null) {
            try {
                if (fragment != null) {
                    a2 = s.f18233a.b(fragment);
                } else {
                    a2 = s.f18233a.a();
                }
                if (a2 == null || !a2.c()) {
                    return;
                }
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key) && (value = entry.getValue()) != null) {
                        a2.a(key, value);
                    }
                }
                a2.a(str, j);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.nfc
    public void a(String str, Object obj, Fragment fragment) {
        g a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67666e4", new Object[]{this, str, obj, fragment});
            return;
        }
        if (fragment != null) {
            a2 = s.f18233a.b(fragment);
        } else {
            a2 = s.f18233a.a();
        }
        if (a2 == null || !a2.c()) {
            return;
        }
        a2.a(str, obj);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension(nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL);
        create.addDimension(nfc.PHA_MONITOR_DIMENSION_PRELOAD_URL);
        create.addDimension(nfc.PHA_MONITOR_DIMENSION_PAGE_URL);
        create.addDimension(nfc.PHA_MONITOR_DIMENSION_IS_HIT);
        create.addDimension("errorCode");
        create.addDimension("errorMsg");
        create.addDimension(nfc.PHA_MONITOR_DIMENSION_IS_MANIFEST);
        create.addDimension("isFragment");
        create.addDimension("values");
        MeasureSet create2 = MeasureSet.create();
        create2.addMeasure("status");
        AppMonitor.register(nfc.PHA_MONITOR_MODULE, nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, create2, create);
    }
}
