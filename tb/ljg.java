package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class ljg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1221946542);
    }

    public static /* synthetic */ void c(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e41c40", new Object[]{baseSubItemModel});
        } else {
            d(baseSubItemModel);
        }
    }

    public static void a(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cc4e3e", new Object[]{baseSubItemModel});
        } else if (baseSubItemModel != null) {
            BaseUtModel mo1100getClickParam = baseSubItemModel.mo1100getClickParam();
            if (mo1100getClickParam == null) {
                a();
                return;
            }
            JSONObject args = mo1100getClickParam.getArgs();
            if (args == null) {
                a();
                return;
            }
            String string = args.getString("spm");
            if (string == null || !string.startsWith("a2141")) {
                a();
            } else if (string.lastIndexOf(".") <= 0) {
                a();
            } else {
                String substring = string.substring(0, string.lastIndexOf("."));
                a("Page_Home", "track_center_action", "main_model_tap_" + substring);
            }
        } else {
            a();
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", (Object) str3);
        ldh.a(str, str2, ljh.a(str, jSONObject), 1.0d);
        if (!lcz.b()) {
            return;
        }
        ldf.a("HomeUserTrackUtils", "fieldName=" + str2 + "-point=" + str3);
    }

    public static void b(final BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed8353f", new Object[]{baseSubItemModel});
        } else {
            ljd.a().d(new Runnable() { // from class: tb.ljg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ljg.c(BaseSubItemModel.this);
                    }
                }
            });
        }
    }

    private static void d(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf00341", new Object[]{baseSubItemModel});
        } else if (baseSubItemModel == null) {
        } else {
            e(baseSubItemModel);
            a((JSONObject) baseSubItemModel);
        }
    }

    private static void e(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fbea42", new Object[]{baseSubItemModel});
            return;
        }
        JSONObject jSONObject = baseSubItemModel.getJSONObject("passOnTrack");
        if (jSONObject != null && jSONObject.size() > 0) {
            ldl.a((Map) JSON.parseObject(jSONObject.toJSONString(), new TypeReference<HashMap<String, String>>() { // from class: tb.ljg.2
            }, new Feature[0]));
        }
        JSONObject jSONObject2 = baseSubItemModel.getJSONObject("nextPageUtParam");
        if (jSONObject2 == null || jSONObject2.size() <= 0) {
            return;
        }
        ldl.a(JSON.toJSONString(jSONObject2));
    }

    private static void a(JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null || (b = b(jSONObject)) == null || !b.containsKey("page") || !b.containsKey("eventId")) {
        } else {
            String string = b.getString("page");
            String string2 = b.getString("eventId");
            String string3 = b.getString("arg1");
            String string4 = b.getString("arg2");
            String string5 = b.getString("arg3");
            JSONObject jSONObject2 = b.getJSONObject("args");
            ldl.a(string, Integer.parseInt(string2), string3, string4, string5, ljh.a(string, jSONObject2));
            try {
                if (!StringUtils.equals("2101", string2)) {
                    return;
                }
                liw.a(string, string3 + "_BehaviX_UT", (String) null, jSONObject2);
            } catch (Exception e) {
                ldf.a("homepage_track", "commitEvent error", e);
            }
        }
    }

    private static JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("trackParam");
        if (jSONObject2 != null && !jSONObject2.isEmpty() && jSONObject2.getJSONObject("clickParam") != null && !jSONObject2.getJSONObject("clickParam").isEmpty()) {
            return a(jSONObject2.getJSONObject("clickParam"), jSONObject2.getJSONObject("args"));
        }
        return jSONObject.getJSONObject("clickParam");
    }

    private static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject2 != null && !jSONObject2.isEmpty() && jSONObject != null) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                    jSONObject.put("args", (Object) jSONObject3);
                }
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    jSONObject3.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                ldf.a("AutoExposureUtils", th, new String[0]);
            }
        }
        return jSONObject;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a("Page_Home", "track_center_action", "main_model_spm_null_count");
        }
    }
}
