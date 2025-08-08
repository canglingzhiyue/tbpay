package com.taobao.homepage.pop.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.statistic.TBS;
import java.util.HashMap;
import java.util.Map;
import tb.lah;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void b(BasePopSectionModel basePopSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7cfd41", new Object[]{basePopSectionModel, jSONObject});
        } else {
            c(basePopSectionModel, jSONObject);
        }
    }

    public static /* synthetic */ void b(BasePopSectionModel basePopSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea95a9cf", new Object[]{basePopSectionModel, jSONObject, jSONObject2});
        } else {
            c(basePopSectionModel, jSONObject, jSONObject2);
        }
    }

    public static void a(final BasePopSectionModel basePopSectionModel, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0104022", new Object[]{basePopSectionModel, jSONObject});
        } else {
            lah.a().c(new Runnable() { // from class: com.taobao.homepage.pop.utils.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        f.b(BasePopSectionModel.this, jSONObject);
                    }
                }
            });
        }
    }

    public static void a(final BasePopSectionModel<?> basePopSectionModel, final JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fde070e", new Object[]{basePopSectionModel, jSONObject, jSONObject2});
        } else {
            lah.a().c(new Runnable() { // from class: com.taobao.homepage.pop.utils.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        f.b(BasePopSectionModel.this, jSONObject, jSONObject2);
                    }
                }
            });
        }
    }

    public static String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str2 : jSONObject.keySet()) {
            String string = jSONObject.getString(str2);
            if (!StringUtils.isEmpty(string)) {
                if (string.length() > 2048) {
                    c.a("UserTrackUtils", "toTrackString super_long_args value.length() > 2048 : " + string.length());
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

    private static void c(BasePopSectionModel<?> basePopSectionModel, JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae9ba60", new Object[]{basePopSectionModel, jSONObject});
        } else if (basePopSectionModel == null || (b = b(basePopSectionModel.mo1073getExposureParam(), basePopSectionModel.getArgs())) == null) {
        } else {
            b.getJSONObject("args");
            if (jSONObject != null && jSONObject.getBooleanValue("skipCheck")) {
                z = true;
            }
            if (!z && basePopSectionModel.getBooleanValue("isTracked")) {
                return;
            }
            basePopSectionModel.put("isTracked", (Object) true);
            a(b, jSONObject);
        }
    }

    private static void c(BasePopSectionModel<?> basePopSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54d4c90", new Object[]{basePopSectionModel, jSONObject, jSONObject2});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("clickParam");
            b(jSONObject3, basePopSectionModel == null ? null : basePopSectionModel.getJSONObject("args"));
            a(jSONObject3, jSONObject2);
        }
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            c.a("UserTrackUtils", "commitEvent trackParams == null || trackParams.isEmpty()");
        } else if (!jSONObject.containsKey("page") || !jSONObject.containsKey("eventId")) {
            c.a("UserTrackUtils", "commitEvent 缺少埋点必要参数");
        } else {
            String b = b(jSONObject, jSONObject2, "page");
            String b2 = b(jSONObject, jSONObject2, "eventId");
            String b3 = b(jSONObject, jSONObject2, "arg1");
            String b4 = b(jSONObject, jSONObject2, "arg2");
            String b5 = b(jSONObject, jSONObject2, "arg3");
            JSONObject a2 = a(jSONObject, jSONObject2, "args");
            b(b3, a2);
            TBS.Ext.commitEvent(b, Integer.parseInt(b2), b3, b4, b5, a(b, a2));
        }
    }

    private static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f7bd1352", new Object[]{jSONObject, jSONObject2, str});
        }
        JSONObject jSONObject3 = jSONObject2 == null ? null : jSONObject2.getJSONObject(str);
        return (jSONObject3 == null || jSONObject3.isEmpty()) ? jSONObject.getJSONObject(str) : jSONObject3;
    }

    private static String b(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9df2bcd", new Object[]{jSONObject, jSONObject2, str});
        }
        String string = jSONObject2 == null ? null : jSONObject2.getString(str);
        return !StringUtils.isEmpty(string) ? string : jSONObject.getString(str);
    }

    private static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb3c4ac9", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject2 != null && !jSONObject2.isEmpty() && jSONObject != null) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if (jSONObject3 == null) {
                    jSONObject.put("args", (Object) jSONObject2);
                } else {
                    boolean equals = "1".equals(jSONObject2.getString("argsType"));
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        if (equals) {
                            if (!jSONObject3.containsKey(entry.getKey())) {
                                jSONObject3.put(entry.getKey(), entry.getValue());
                            }
                        } else {
                            jSONObject3.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            } catch (Throwable th) {
                c.a("AutoExposureUtils", th);
            }
        }
        return jSONObject;
    }

    public static void a(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b578a2", new Object[]{str, str2, new Boolean(z), str3});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("ucpSignal", Boolean.valueOf(z));
            if (StringUtils.isEmpty(str3)) {
                str3 = "";
            }
            hashMap.put("businessId", str3);
            TBS.Ext.commitEvent("Page_Home", 19999, "ucpPopLink", str, str2, a("Page_Home", new JSONObject(hashMap)));
        } catch (Throwable th) {
            c.a("commitUcpPopEvent", th);
        }
    }

    private static void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{str, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("Page_Home_Show-guessitem-1001", "utLogMapEdge");
        hashMap.put("Page_Home_Button-guessitem-1001", "utLogMapEdge");
        try {
            if (!hashMap.containsKey(str)) {
                return;
            }
            jSONObject.remove(hashMap.get(str));
        } catch (Exception e) {
            c.a("cleanUTArgs.", e);
        }
    }
}
