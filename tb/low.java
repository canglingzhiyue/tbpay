package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.tao.infoflow.multitab.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class low {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1104679153);
    }

    public String a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("category");
        if (!jSONObject4.containsKey("item")) {
            JSONObject jSONObject5 = jSONObject4.getJSONObject("content");
            if (jSONObject5 != null) {
                return jSONObject5.getString("jsUrl");
            }
            return null;
        }
        JSONObject jSONObject6 = jSONObject4.getJSONObject("item");
        if (jSONObject6 != null && (jSONObject2 = jSONObject6.getJSONObject("0")) != null && (jSONObject3 = jSONObject2.getJSONObject("content")) != null) {
            return jSONObject3.getString("jsUrl");
        }
        return null;
    }

    public String a(int i, List<loy> list) {
        JSONObject a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cce35394", new Object[]{this, new Integer(i), list});
        }
        loy loyVar = list.get(i);
        if (loyVar != null && (a2 = loyVar.a()) != null && (jSONObject = a2.getJSONObject("content")) != null) {
            return jSONObject.getString("title");
        }
        return null;
    }

    public List<loy> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cca20740", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= jSONObject.size(); i++) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i));
            if (jSONObject2 != null) {
                arrayList.add(c(jSONObject2));
            }
        }
        return arrayList;
    }

    public loj a(List<loy> list, int i) {
        JSONObject a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (loj) ipChange.ipc$dispatch("65ed9015", new Object[]{this, list, new Integer(i)});
        }
        if (list == null || list.get(i) == null || (a2 = list.get(i).a()) == null || (jSONObject = a2.getJSONObject("ext")) == null) {
            return null;
        }
        JSONObject jSONObject2 = a2.getJSONObject("content");
        String string = jSONObject2 != null ? jSONObject2.getString("title") : "首页";
        String string2 = jSONObject.getString("categoryId");
        String string3 = jSONObject.getString("passInfo");
        HashMap hashMap = new HashMap();
        hashMap.put(e.KEY_TAB_ID, string2);
        hashMap.put("tabInfo", string3);
        hashMap.put("timespan", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("title", string);
        return new loj(null, new JSONObject(hashMap));
    }

    private loy c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (loy) ipChange.ipc$dispatch("5e451e6a", new Object[]{this, jSONObject});
        }
        loy loyVar = new loy();
        if (!jSONObject.containsKey("item")) {
            loyVar.a(jSONObject);
            return loyVar;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 == null) {
            return null;
        }
        loyVar.a(jSONObject2.getJSONObject("0"));
        loyVar.b(jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM));
        return loyVar;
    }
}
