package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.ieh;

/* loaded from: classes4.dex */
public class iei {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_ALL = "all";
    public static final String LOCATION_FIRST = "first";
    public static final String LOCATION_SECOND = "second";

    static {
        kge.a(-2094077181);
        emu.a("com.taobao.android.detail.core.standard.mainscreen.barrage.BarrageFloatingDataParser");
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue() : jSONObject.containsKey(ieg.KEY_FLOATING_BARRAGE);
    }

    public static ieh b(JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ieh) ipChange.ipc$dispatch("c3a2d733", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(ieg.KEY_FLOATING_BARRAGE);
        ieh iehVar = new ieh();
        iehVar.b = jSONObject2.getIntValue("maxShowCount");
        iehVar.f28966a = jSONObject2.getFloatValue("scrollTimeInterval");
        JSONArray jSONArray = jSONObject2.getJSONArray("data");
        iehVar.e.addAll(jSONArray);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("template");
        if (jSONArray != null) {
            i = 0;
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                ieh.a c = c((JSONObject) jSONArray.get(i2));
                iehVar.d.add(c);
                if ("all".equals(c.b)) {
                    iehVar.f = true;
                } else if ("first".equals(c.b)) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if (!iehVar.f) {
            if (jSONArray.size() == i || i == 0) {
                z = true;
            }
            iehVar.f = z;
        }
        if (jSONObject3 != null) {
            iehVar.c = d(jSONObject3);
        }
        return iehVar;
    }

    private static ieh.a c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ieh.a) ipChange.ipc$dispatch("dbc3b257", new Object[]{jSONObject});
        }
        ieh.a aVar = new ieh.a();
        aVar.f28967a = jSONObject.getString("type");
        aVar.b = jSONObject.getString("location");
        return aVar;
    }

    public static DXTemplateItem d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("a121067a", new Object[]{jSONObject});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = jSONObject.getString("name");
        dXTemplateItem.b = jSONObject.getLongValue("version");
        dXTemplateItem.c = jSONObject.getString("url");
        return dXTemplateItem;
    }
}
