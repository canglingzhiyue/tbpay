package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.p;
import tb.sit;

/* loaded from: classes4.dex */
public class sjg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_ALL = "all";
    public static final String LOCATION_FIRST = "first";
    public static final String LOCATION_INSIDE = "inside";
    public static final String LOCATION_SECOND = "second";

    static {
        kge.a(104702844);
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue() : jSONObject.get(ieg.KEY_FLOATING_BARRAGE) != null;
    }

    public static sit a(JSONObject jSONObject, BarrageFloatingView.BARRAGE_TYPE barrage_type) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (sit) ipChange.ipc$dispatch("f5126d4", new Object[]{jSONObject, barrage_type});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(ieg.KEY_FLOATING_BARRAGE);
        sit sitVar = new sit();
        sitVar.b = jSONObject2.getIntValue("maxShowCount");
        sitVar.f33614a = jSONObject2.getFloatValue("scrollTimeInterval");
        JSONArray jSONArray = jSONObject2.getJSONArray("data");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("template");
        if (jSONArray == null) {
            i.a("BarrageFloatingDataParser", "receive barrageArray is null");
            return sitVar;
        } else if (barrage_type == null) {
            i.a("BarrageFloatingDataParser", "transfer barrageType is null");
            return sitVar;
        } else {
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                Object obj = jSONArray.get(i2);
                sit.a c = c((JSONObject) obj);
                if (barrage_type.equals(barrage_type.convert(c.b))) {
                    sitVar.e.add(obj);
                    sitVar.d.add(c);
                    sitVar.f = "all".equals(c.b) || LOCATION_INSIDE.equals(c.b);
                    if ("first".equals(c.b)) {
                        i++;
                    }
                }
            }
            if (!sitVar.f) {
                if (sitVar.e.size() != i && i != 0) {
                    z = false;
                }
                sitVar.f = z;
            }
            if (jSONObject3 != null) {
                sitVar.c = p.b(jSONObject3);
            }
            return sitVar;
        }
    }

    private static sit.a c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sit.a) ipChange.ipc$dispatch("ed11fb05", new Object[]{jSONObject});
        }
        sit.a aVar = new sit.a();
        aVar.f33615a = jSONObject.getString("type");
        aVar.b = jSONObject.getString("location");
        aVar.c = jSONObject.getJSONObject("exposureArgs");
        return aVar;
    }
}
