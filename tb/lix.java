package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.List;

/* loaded from: classes7.dex */
public class lix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1246764593);
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject}) : b(jSONObject, "sectionBizCode");
    }

    public static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject}) : a(jSONObject, "template");
    }

    public static String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6871249a", new Object[]{jSONObject}) : b(jSONObject, "isCacheData");
    }

    public static String d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91c579db", new Object[]{jSONObject}) : b(jSONObject, "isColdRemoteData");
    }

    private static String b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a29568f", new Object[]{jSONObject, str});
        }
        if (jSONObject != null) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{jSONObject, str});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static int a(BaseSectionModel baseSectionModel, List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7755da94", new Object[]{baseSectionModel, list})).intValue();
        }
        if (baseSectionModel == null || list == null || list.isEmpty()) {
            return -1;
        }
        int indexOf = list.indexOf(baseSectionModel);
        return indexOf >= 0 ? indexOf : a(baseSectionModel.getSectionBizCode(), list);
    }

    public static int a(String str, List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1aa3516", new Object[]{str, list})).intValue();
        }
        if (StringUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (a(list.get(i).getSectionBizCode(), str)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.equals(str, str2)) {
            if (!StringUtils.equals(str + "_delta", str2)) {
                if (!StringUtils.equals(str, str2 + "_delta")) {
                    return false;
                }
            }
        }
        return true;
    }
}
