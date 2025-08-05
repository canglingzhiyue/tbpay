package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.homepage.busniess.model.DeliverInfoBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class mwv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-548543502);
    }

    public static JSONObject a(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("294e5876", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            try {
                jSONObject2.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject2;
    }

    public static String a(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{list});
        }
        if (list == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            com.alibaba.fastjson.JSONObject jSONObject = (com.alibaba.fastjson.JSONObject) it.next();
            com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            String string = jSONObject.getString("jumpUrl");
            if (jSONObject2 != null && TextUtils.isEmpty(string)) {
                arrayList.add((DeliverInfoBean) JSON.toJavaObject(jSONObject2, DeliverInfoBean.class));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            DeliverInfoBean deliverInfoBean = (DeliverInfoBean) it2.next();
            if (deliverInfoBean.packageId == null || deliverInfoBean.packageId.longValue() == -1) {
                it2.remove();
            }
        }
        return com.alibaba.fastjson.JSONObject.toJSONString(arrayList);
    }

    public static JSONArray a(com.alibaba.fastjson.JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9bc1dcac", new Object[]{jSONObject, str});
        }
        Object obj = jSONObject.get(str);
        if (!(obj instanceof JSONArray)) {
            return null;
        }
        return (JSONArray) obj;
    }
}
