package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.f;
import com.taobao.statistic.TBS;
import com.ut.device.UTDevice;

/* loaded from: classes6.dex */
public class ket {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String S_UT_ARG1 = "arg1";
    public static final String S_UT_ARG2 = "arg2";
    public static final String S_UT_ARG3 = "arg3";
    public static final String S_UT_ARGS = "args";
    public static final String S_UT_EVENT_ID = "eventId";
    public static final String S_UT_PAGE_NAME = "page";

    /* renamed from: a  reason: collision with root package name */
    public static String f30019a;

    static {
        kge.a(1157348574);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject != null && jSONObject.size() > 0 && jSONObject.containsKey("page") && jSONObject.containsKey("eventId")) {
            try {
                String string = jSONObject.getString("page");
                String string2 = jSONObject.getString("eventId");
                String string3 = jSONObject.getString("arg1");
                String string4 = jSONObject.getString("arg2");
                String string5 = jSONObject.getString("arg3");
                String a2 = a(string, jSONObject.getJSONObject("args"));
                TBS.Ext.commitEvent(string, Integer.parseInt(string2), string3, string4, string5, a2);
                kej.a("UTUtils", "UT-commitEvent, pageName = " + string + ", eventId = " + string2 + ", arg1 = " + string3 + ", arg2 = " + string4 + ", arg3 = " + string5 + ", trackString = " + a2);
            } catch (Exception e) {
                kej.a("UTUtils", "UT-commitEvent", e);
            }
        } else {
            kej.a("UTUtils", "UT-commitEvent, illegal trackParams ");
        }
    }

    public static void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{jSONObject, new Boolean(z)});
        } else if (z) {
            kej.a("UTUtils", "addHotStartExposeIntervalArgs, isColdStart");
        } else {
            long l = kem.a().l();
            if (l == -1) {
                kej.a("UTUtils", "addHotStartExposeParamArgs, lastHotStartTime -1");
            } else if (jSONObject == null) {
                kej.a("UTUtils", "addHotStartExposeParamArgs, exposureParam null");
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                    jSONObject.put("args", (Object) jSONObject2);
                }
                try {
                    jSONObject2.put("hotStartInterval", (Object) Integer.valueOf((int) ((System.currentTimeMillis() - l) / 1000)));
                } catch (Exception e) {
                    kej.a("UTUtils", "addHotStartExposeParamArgs, error", e);
                }
            }
        }
    }

    public static String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{str, jSONObject});
        }
        if (jSONObject != null) {
            try {
                if (jSONObject.size() != 0) {
                    StringBuilder sb = new StringBuilder(600);
                    for (String str2 : jSONObject.keySet()) {
                        String string = jSONObject.getString(str2);
                        if (!StringUtils.isEmpty(string)) {
                            if (string.length() > 2048) {
                                TBS.Ext.commitEvent(str, 19999, "super_long_args", str2);
                            }
                            sb.append(str2);
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
            } catch (Throwable th) {
                kej.a("UTUtils", "toTrackString", th);
                return "toTrackString_exception";
            }
        }
        return "";
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String str = "bootimage_" + System.currentTimeMillis() + "_" + UTDevice.getUtdid(f.b());
        f30019a = str;
        return str;
    }
}
