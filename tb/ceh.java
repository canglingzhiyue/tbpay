package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.k;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ceh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1424600660);
    }

    public static void a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f7f865", new Object[]{str, str2, jSONObject, jSONObject2, dVar});
        } else if (jSONObject != null) {
            try {
                if (jSONObject.size() > 0 && jSONObject2 != null) {
                    DimensionSet create = DimensionSet.create();
                    DimensionValueSet create2 = DimensionValueSet.create();
                    for (String str3 : jSONObject.keySet()) {
                        create.addDimension(new Dimension(str3));
                        create2.setValue(str3, jSONObject.getString(str3));
                    }
                    MeasureSet create3 = MeasureSet.create();
                    MeasureValueSet create4 = MeasureValueSet.create();
                    for (String str4 : jSONObject2.keySet()) {
                        create3.addMeasure(new Measure(str4));
                        create4.setValue(str4, jSONObject2.getDoubleValue(str4));
                    }
                    AppMonitor.register(str, str2, create3, create, true);
                    AppMonitor.Stat.commit(str, str2, create2, create4);
                }
            } catch (Throwable th) {
                ceg.a(th.getMessage());
                if (dVar == null) {
                    return;
                }
                k.a(dVar, th.getMessage());
            }
        }
    }
}
