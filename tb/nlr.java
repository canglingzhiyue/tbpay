package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.h;
import com.taobao.taolive.room.utils.aw;

/* loaded from: classes7.dex */
public class nlr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2008048205);
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            jSONObject3.put(aw.PARAM_PVID, (Object) jSONObject.getJSONObject("args").getString(aw.PARAM_PVID));
        }
        String str2 = "";
        String string = (jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) ? str2 : jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
        if (jSONObject2 == null || jSONObject2.getJSONObject("clickParam") == null) {
            str = "click_recommend_item_similar";
        } else {
            str = jSONObject2.getJSONObject("clickParam").getString("arg1");
            str2 = jSONObject2.getJSONObject("clickParam").getString("page");
        }
        h.a(str2, str, (String) null, string, b(jSONObject3));
    }

    public static void a(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            jSONObject2.put(aw.PARAM_PVID, (Object) jSONObject.getJSONObject("args").getString(aw.PARAM_PVID));
        }
        String string = (jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) ? null : jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
        if (jSONObject.getJSONObject("subSection") == null || jSONObject.getJSONObject("subSection").getJSONObject("overlay") == null || jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject(com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM) == null) {
            str = "click_recommend_item_overlay";
            str2 = "";
        } else {
            str = jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject(com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM).getString("arg1");
            str2 = jSONObject.getJSONObject("subSection").getJSONObject("overlay").getJSONObject(com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM).getString("page");
        }
        h.a(str2, str, (String) null, string, b(jSONObject2));
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e83a9", new Object[]{jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            jSONObject3.put(aw.PARAM_PVID, (Object) jSONObject.getJSONObject("args").getString(aw.PARAM_PVID));
        }
        String str2 = "";
        String string = (jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) ? str2 : jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
        if (jSONObject2 == null || jSONObject2.getJSONObject("clickParam") == null) {
            str = "click_recommend_item_delete";
        } else {
            str = jSONObject2.getJSONObject("clickParam").getString("arg1");
            str2 = jSONObject2.getJSONObject("clickParam").getString("page");
            if (jSONObject2.getJSONObject("clickParam").getJSONObject("args") != null) {
                jSONObject3.put("reasonArgs", (Object) jSONObject2.getJSONObject("clickParam").getJSONObject("args").getString("reasonArgs"));
            }
        }
        h.a(str2, str, (String) null, string, b(jSONObject3));
    }

    public static String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (!StringUtils.isEmpty(string)) {
                sb.append(str);
                sb.append("=");
                sb.append(string);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static String[] b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1d085036", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return null;
        }
        String[] strArr = new String[jSONObject.size()];
        int i = 0;
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                strArr[i] = String.format("%s=%s", str, string);
                i++;
            }
        }
        return strArr;
    }
}
