package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.behavix.j;
import com.taobao.android.home.component.utils.h;
import com.taobao.munion.taosdk.CpmIfsCommitter;
import com.taobao.munion.taosdk.MunionCommitterFactory;
import com.taobao.statistic.TBS;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class kss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final transient String AD_VAL_MATCH_TYPE = "AD";

    /* renamed from: a  reason: collision with root package name */
    public static String f30292a;

    static {
        kge.a(1757617661);
        f30292a = "Page_Home";
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
        } else {
            a(jSONObject, (JSONObject) null);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || (d = d(jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM), jSONObject.getJSONObject("args"))) == null) {
        } else {
            JSONObject jSONObject3 = d.getJSONObject("args");
            e(jSONObject, jSONObject3);
            try {
                ora.a(jSONObject, jSONObject3);
            } catch (Throwable th) {
                TLog.loge("AdMonitorHelper", "checkBrandAdCard error.", th);
            }
            if (jSONObject2 != null && jSONObject2.getBooleanValue("skipCheck")) {
                z = true;
            }
            if (!z && jSONObject.getBooleanValue("isTracked")) {
                return;
            }
            jSONObject.put("isTracked", (Object) true);
            if (jSONObject3 != null) {
                String string = d.getString("page");
                if (!StringUtils.isEmpty(jSONObject3.getString("feedbackURL"))) {
                    onw.a(string);
                }
                if (StringUtils.equals(jSONObject3.getString("match_type"), "AD")) {
                    onw.b(string);
                }
            }
            c(d, jSONObject2);
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else {
            a((JSONObject) null, jSONObject, (JSONObject) null);
        }
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e83a9", new Object[]{jSONObject, jSONObject2});
        } else {
            a(jSONObject, jSONObject2, (JSONObject) null);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fd1788", new Object[]{jSONObject, jSONObject2, jSONObject3});
        } else if (jSONObject2 == null) {
        } else {
            f(jSONObject);
            JSONObject d = d(jSONObject2.getJSONObject("clickParam"), jSONObject == null ? null : jSONObject.getJSONObject("args"));
            b(jSONObject, d, jSONObject3);
            c(d, jSONObject3);
        }
    }

    public static void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{obj, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        } catch (Exception unused) {
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        } catch (Exception unused) {
        }
    }

    public static void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{obj, str});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(obj, str);
        } catch (Exception unused) {
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4196da5", new Object[]{str, new Integer(i), str2, str3});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, null, null, str3);
            if (i != 2101) {
                return;
            }
            com.taobao.android.behavix.h.a(str, str2 + "_BehaviX_UT", (String) null, (String) null, str3);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, int i, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb465b5", new Object[]{str, new Integer(i), str2, jSONObject});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, null, null, a(str, jSONObject));
            if (i != 2101) {
                return;
            }
            com.taobao.android.behavix.h.a(str, str2 + "_BehaviX_UT", (String) null, (String) null, j.b(jSONObject));
        } catch (Exception unused) {
        }
    }

    public static void a(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9fe4a1", new Object[]{str, new Integer(i), str2, str3, str4, jSONObject});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, a(str, jSONObject));
        } catch (Exception unused) {
        }
    }

    private static void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{jSONObject});
        } else if (jSONObject == null || jSONObject.getJSONObject("args") == null) {
        } else {
            String string = jSONObject.getJSONObject("args").getString("utLogMap");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            try {
                HashMap hashMap = (HashMap) JSON.parseObject(URLDecoder.decode(string, "UTF-8"), new TypeReference<HashMap<String, String>>() { // from class: tb.kss.1
                }, new Feature[0]);
                ljf.a(hashMap, jSONObject.getJSONObject("ext"));
                HashMap hashMap2 = new HashMap(hashMap);
                String string2 = jSONObject.getJSONObject("args").getString("realExposeIndex");
                if (!StringUtils.isEmpty(string2)) {
                    hashMap2.put("realExposeIndex", string2);
                    hashMap.put("realExposeIndex", string2);
                }
                a(hashMap2);
                a(JSON.toJSONString(hashMap));
            } catch (Throwable th) {
                ooa.a("RecommendUTUtils", th);
            }
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358a36ea", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject.size() <= 0 || !jSONObject.containsKey("page") || !jSONObject.containsKey("eventId")) {
        } else {
            try {
                String b = b(jSONObject, jSONObject2, "page");
                String b2 = b(jSONObject, jSONObject2, "eventId");
                String b3 = b(jSONObject, jSONObject2, "arg1");
                String b4 = b(jSONObject, jSONObject2, "arg2");
                String b5 = b(jSONObject, jSONObject2, "arg3");
                JSONObject b6 = b(b3, a(jSONObject, jSONObject2, "args"));
                TBS.Ext.commitEvent(b, Integer.parseInt(b2), b3, b4, b5, a(b, b6));
                String string = b6 == null ? "" : b6.getString("ifs");
                JSONObject jSONObject3 = jSONObject.getJSONObject("args");
                if ((jSONObject3 != null && StringUtils.equals(jSONObject3.getString("brandAd"), "1")) || StringUtils.isEmpty(string)) {
                    return;
                }
                MunionCommitterFactory.createIfsCommitter(g.a(), CpmIfsCommitter.class).commitEvent(string);
            } catch (Exception unused) {
            }
        }
    }

    private static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f7bd1352", new Object[]{jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            return jSONObject.getJSONObject(str);
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
        return (jSONObject3 == null || jSONObject3.isEmpty()) ? jSONObject.getJSONObject(str) : jSONObject3;
    }

    private static String b(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9df2bcd", new Object[]{jSONObject, jSONObject2, str});
        }
        if (jSONObject2 == null) {
            return jSONObject.getString(str);
        }
        String string = jSONObject2.getString(str);
        return StringUtils.isEmpty(string) ? jSONObject.getString(str) : string;
    }

    private static String a(String str, JSONObject jSONObject) {
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

    public static JSONObject d(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5209294b", new Object[]{jSONObject, jSONObject2});
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
                ooa.a("AutoExposureUtils", th);
            }
        }
        return jSONObject;
    }

    private static JSONObject b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f6ec06fd", new Object[]{str, jSONObject});
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("Page_Home_Show-guessitem-1001", "utLogMapEdge");
        hashMap.put("Page_Home_Button-guessitem-1001", "utLogMapEdge");
        try {
            if (hashMap.containsKey(str) && jSONObject.containsKey(hashMap.get(str))) {
                jSONObject.remove(hashMap.get(str));
            }
            return jSONObject;
        } catch (Exception e) {
            ooa.a("cleanUTArgs.", e);
            return jSONObject;
        }
    }

    public static void e(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe19d6c", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject2 == null || !StringUtils.equals(jSONObject2.getString("brandAd"), "1")) {
        } else {
            try {
                String string = jSONObject2.getString("ifs");
                String string2 = jSONObject2.getString("ifsArr");
                if (!StringUtils.isEmpty(string)) {
                    ldf.d("GatewayUTUtils", "commitExposureAd ifs");
                    AlimamaAdvertising.instance().buildIfsExposure(g.a(), string).withArgPid(jSONObject2.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID)).withArgNamespace(jSONObject.getString("adNamespace")).commit();
                } else if (!StringUtils.isEmpty(string2)) {
                    ldf.d("GatewayUTUtils", "commitExposureAd ifsArr");
                    AlimamaAdvertising.instance().commitIfsArrayExposure(string2, jSONObject2.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID), jSONObject.getString("adNamespace"), null);
                } else {
                    ldf.d("GatewayUTUtils", "commitExposureAd error");
                }
            } catch (Exception e) {
                ooa.a("Brand Ad's ifs track met problem.", e);
            }
        }
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb649067", new Object[]{jSONObject, jSONObject2, jSONObject3});
        } else if (jSONObject == null) {
            ldf.c("GatewayUTUtils", "commitClickAd card == null");
        } else if (jSONObject2 == null) {
            ldf.c("GatewayUTUtils", "commitClickAd clickParamArgs == null");
        } else {
            JSONObject a2 = a(jSONObject2, jSONObject3, "args");
            if (a2 == null) {
                ldf.c("GatewayUTUtils", "commitClickAd args == null");
            } else if (!StringUtils.equals(a2.getString("brandAd"), "1")) {
            } else {
                String string = a2.getString("clkArr");
                String string2 = a2.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
                String string3 = jSONObject.getString("adNamespace");
                if (!StringUtils.isEmpty(string)) {
                    ldf.d("GatewayUTUtils", "commitExposureAd clkArr");
                    AlimamaAdvertising.instance().buildTanxClickArrayTracking(string).a(string2).b(string3).a();
                    return;
                }
                ldf.d("GatewayUTUtils", "commitExposureAd 广告入参不合法 clkArr ： " + string);
            }
        }
    }
}
