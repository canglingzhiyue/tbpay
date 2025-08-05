package tb;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.d;
import com.taobao.android.home.component.utils.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class ljh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1032359348);
    }

    public static /* synthetic */ void a(ljs ljsVar, d dVar, BaseSectionModel baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eab1b93", new Object[]{ljsVar, dVar, baseSectionModel, jSONObject, jSONObject2});
        } else {
            b(ljsVar, dVar, baseSectionModel, jSONObject, jSONObject2);
        }
    }

    public static /* synthetic */ void d(BaseSectionModel baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5c87f3", new Object[]{baseSectionModel, jSONObject, jSONObject2});
        } else {
            e(baseSectionModel, jSONObject, jSONObject2);
        }
    }

    public static void a(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22760340", new Object[]{baseSectionModel, jSONObject});
        } else {
            b(baseSectionModel, jSONObject);
        }
    }

    public static void a(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a359fb0", new Object[]{baseSectionModel, jSONObject, jSONObject2});
        } else {
            a((ljs) null, (View) null, baseSectionModel, jSONObject, jSONObject2);
        }
    }

    public static void a(final ljs ljsVar, View view, final BaseSectionModel<?> baseSectionModel, final JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f29f7", new Object[]{ljsVar, view, baseSectionModel, jSONObject, jSONObject2});
            return;
        }
        final d a2 = liw.a(view);
        ljd.a().d(new Runnable() { // from class: tb.ljh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ljh.a(ljs.this, a2, baseSectionModel, jSONObject, jSONObject2);
                }
            }
        });
    }

    public static void a(final JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else {
            ljd.a().d(new Runnable() { // from class: tb.ljh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ljh.d(null, JSONObject.this, jSONObject2);
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
        if (jSONObject != null && jSONObject.size() != 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putAll(jSONObject);
                StringBuilder sb = new StringBuilder(600);
                for (String str2 : jSONObject2.keySet()) {
                    String string = jSONObject2.getString(str2);
                    if (!TextUtils.isEmpty(string)) {
                        if (string.length() > 2048) {
                            ldf.d("UserTrackUtils", "toTrackString super_long_args value.length() > 2048 : " + string.length());
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
            } catch (Throwable th) {
                ldf.a("UserTrackUtils", "toTrackString error", th);
            }
        }
        return "";
    }

    private static void b(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe2c05f", new Object[]{baseSectionModel, jSONObject});
        } else if (baseSectionModel == null || (d = d(baseSectionModel.mo1096getExposureParam(), baseSectionModel.getArgs())) == null) {
        } else {
            JSONObject jSONObject2 = d.getJSONObject("args");
            tim.a(jSONObject2);
            c(baseSectionModel, jSONObject2);
            if (jSONObject != null && jSONObject.getBooleanValue("skipCheck")) {
                z = true;
            }
            if (!z && baseSectionModel.getBooleanValue("isTracked")) {
                return;
            }
            baseSectionModel.put("isTracked", (Object) true);
            e(baseSectionModel, d, jSONObject);
            if (qnl.h()) {
                tdk.a(baseSectionModel);
            }
            if (!qnl.i()) {
                return;
            }
            tdk.c(baseSectionModel);
        }
    }

    private static void b(ljs ljsVar, d dVar, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1413d1b2", new Object[]{ljsVar, dVar, baseSectionModel, jSONObject, jSONObject2});
        } else if (jSONObject == null) {
        } else {
            a(ljsVar, baseSectionModel, jSONObject);
            JSONObject jSONObject3 = jSONObject.getJSONObject("clickParam");
            d(jSONObject3, baseSectionModel == null ? null : baseSectionModel.getJSONObject("args"));
            if (jSONObject3 != null) {
                a(jSONObject3.getJSONObject("args"), dVar);
            }
            f(baseSectionModel, jSONObject3, jSONObject2);
            e(baseSectionModel, jSONObject3, jSONObject2);
        }
    }

    private static void e(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5142ab4", new Object[]{baseSectionModel, jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            ldf.c("UserTrackUtils", "commitEvent trackParams == null || trackParams.isEmpty()");
        } else if (!jSONObject.containsKey("page") || !jSONObject.containsKey("eventId")) {
            ldf.c("UserTrackUtils", "commitEvent 缺少埋点必要参数");
        } else {
            String b = b(jSONObject, jSONObject2, "page");
            String b2 = b(jSONObject, jSONObject2, "eventId");
            String b3 = b(jSONObject, jSONObject2, "arg1");
            String b4 = b(jSONObject, jSONObject2, "arg2");
            String b5 = b(jSONObject, jSONObject2, "arg3");
            JSONObject a2 = a(jSONObject, jSONObject2, "args");
            b(b3, a2);
            d(baseSectionModel, a2);
            c(a2);
            if (a2 != null) {
                a2.put("client_ts", (Object) Long.valueOf(System.currentTimeMillis()));
            }
            ldl.a(b, Integer.parseInt(b2), b3, b4, b5, a(b, a2));
            String string = a2 == null ? "" : a2.getString("ifs");
            JSONObject jSONObject3 = jSONObject.getJSONObject("args");
            if (jSONObject3 != null && TextUtils.equals(jSONObject3.getString("brandAd"), "1")) {
                return;
            }
            Application a3 = lcz.a();
            if (TextUtils.isEmpty(string) || a3 == null) {
                return;
            }
            lcy.a(a3, string, null, null, null);
            ldl.a("Page_Extend", 19999, "info_flow_commit_ifs", "microservice", b, "2");
        }
    }

    private static void c(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4f7d7e", new Object[]{baseSectionModel, jSONObject});
        } else if (jSONObject == null) {
            ldf.c("UserTrackUtils", "commitExposureAd exposureParamArgs == null");
        } else if (!TextUtils.equals(jSONObject.getString("brandAd"), "1")) {
        } else {
            Application a2 = lcz.a();
            String string = jSONObject.getString("ifs");
            String string2 = jSONObject.getString("ifsArr");
            String string3 = jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
            String string4 = baseSectionModel.getString("adNamespace");
            String page = baseSectionModel.mo1096getExposureParam() != null ? baseSectionModel.mo1096getExposureParam().getPage() : null;
            if (a2 != null && !TextUtils.isEmpty(string)) {
                ldf.d("UserTrackUtils", "commitExposureAd ifsUrl");
                lcy.a(a2, string, string3, string4, null);
                ldl.a("Page_Extend", 19999, "info_flow_commit_ifs", "microservice", page, "1");
            } else if (!TextUtils.isEmpty(string2)) {
                ldf.d("UserTrackUtils", "commitExposureAd ifsArr");
                lcy.a(string2, string3, string4, null);
                ldl.a("Page_Extend", 19999, "info_flow_commit_ifs_ifsArr", "microservice", page, "1");
            } else {
                ldf.d("UserTrackUtils", "commitExposureAd error");
            }
        }
    }

    private static void f(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fcbcd75", new Object[]{baseSectionModel, jSONObject, jSONObject2});
        } else if (baseSectionModel == null) {
            ldf.c("UserTrackUtils", "commitClickAd card == null");
        } else if (jSONObject == null) {
            ldf.c("UserTrackUtils", "commitClickAd clickParamArgs == null");
        } else {
            JSONObject a2 = a(jSONObject, jSONObject2, "args");
            if (a2 == null) {
                ldf.c("UserTrackUtils", "commitClickAd args == null");
            } else if (!TextUtils.equals(a2.getString("brandAd"), "1")) {
            } else {
                String string = a2.getString("clkArr");
                String string2 = a2.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
                String string3 = baseSectionModel.getString("adNamespace");
                String b = b(jSONObject, null, "page");
                if (!TextUtils.isEmpty(string)) {
                    ldf.d("UserTrackUtils", "commitExposureAd clkArr");
                    lcy.b(string, string2, string3, null);
                    ldl.a("Page_Extend", 19999, "info_flow_commit_ifs_clkArr", "microservice", b, "1");
                    return;
                }
                ldf.d("UserTrackUtils", "commitExposureAd 广告入参不合法 clkArr ： " + string);
            }
        }
    }

    private static void a(ljs ljsVar, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc3a885", new Object[]{ljsVar, baseSectionModel, jSONObject});
        } else if (baseSectionModel == null || baseSectionModel.getJSONObject("args") == null) {
        } else {
            JSONObject jSONObject2 = baseSectionModel.getJSONObject("args");
            String string = jSONObject2.getString("utLogMap");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                HashMap hashMap = (HashMap) JSON.parseObject(URLDecoder.decode(string, "UTF-8"), new TypeReference<HashMap<String, String>>() { // from class: tb.ljh.3
                }, new Feature[0]);
                ljf.a(hashMap, baseSectionModel.getExt());
                HashMap hashMap2 = new HashMap(hashMap);
                String string2 = jSONObject2.getString("realExposeIndex");
                if (!TextUtils.isEmpty(string2)) {
                    hashMap2.put("realExposeIndex", string2);
                }
                ldl.a(hashMap2);
                String string3 = jSONObject2.getString("recIndex");
                if (!TextUtils.isEmpty(string3)) {
                    hashMap.put("recIndex", string3);
                }
                xko.a(ljsVar, baseSectionModel, jSONObject, hashMap);
                ldl.a(JSON.toJSONString(hashMap));
            } catch (Throwable th) {
                ldf.a("UserTrackUtils", "RecommendUTUtils", th);
            }
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
        return !TextUtils.isEmpty(string) ? string : jSONObject.getString(str);
    }

    private static JSONObject d(JSONObject jSONObject, JSONObject jSONObject2) {
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
                ldf.a("UserTrackUtils", "AutoExposureUtils", th);
            }
        }
        return jSONObject;
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
            ldf.a("UserTrackUtils", "cleanUTArgs.", e);
        }
    }

    public static void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d586b86", new Object[]{baseSectionModel, baseSubItemModel});
        } else {
            a(baseSectionModel, (JSONObject) baseSubItemModel, "clickParam");
        }
    }

    public static void b(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7ec179", new Object[]{baseSectionModel, baseSectionModel2});
        } else {
            a(baseSectionModel, (JSONObject) baseSectionModel2, h.TRACK_EXPOSURE_PARAM);
        }
    }

    private static void a(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d78dd0a", new Object[]{baseSectionModel, jSONObject, str});
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        if (args == null || !TextUtils.equals("1", args.getString(tim.S_ARGS_IS_CLIENT_CACHE)) || (jSONObject2 = jSONObject.getJSONObject(str)) == null || (jSONObject3 = jSONObject2.getJSONObject("args")) == null) {
            return;
        }
        jSONObject3.put(tim.S_ARGS_IS_CLIENT_CACHE, "1");
    }

    private static void d(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abc3a9d", new Object[]{baseSectionModel, jSONObject});
            return;
        }
        String a2 = a(jSONObject);
        String b = b(baseSectionModel);
        if (a2 == null || b == null) {
            return;
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject2 = JSON.parseObject(URLDecoder.decode(a2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            ldf.a("UserTrackUtils", "addRecIndexToUtLogMap error: " + e.getMessage(), e);
        }
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put("recIndex", (Object) b);
        String jSONString = jSONObject2.toJSONString();
        try {
            jSONString = URLEncoder.encode(jSONString, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        jSONObject.put("utLogMap", (Object) jSONString);
    }

    private static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{jSONObject});
            return;
        }
        String a2 = ldj.a(fky.SP_KEY_ORANGE_CONFIG_VERSION, "0");
        if (TextUtils.equals(a2, "0")) {
            ldf.d("UserTrackUtils", "Orange版本获取失败");
        }
        jSONObject.put(fky.SP_KEY_ORANGE_CONFIG_VERSION, (Object) a2);
    }

    private static String b(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ad380f", new Object[]{baseSectionModel});
        }
        if (baseSectionModel != null && (args = baseSectionModel.getArgs()) != null) {
            return args.getString("recIndex");
        }
        return null;
    }

    private static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getString("utLogMap");
        }
        return null;
    }

    private static void a(JSONObject jSONObject, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baff2666", new Object[]{jSONObject, dVar});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putAll(dsi.a(dVar));
                if (jSONObject2.isEmpty()) {
                    return;
                }
                jSONObject.put("slideGesture", (Object) URLEncoder.encode(jSONObject2.toJSONString(), "UTF-8"));
            } catch (Throwable th) {
                ldf.a("UserTrackUtils", "BX提供的手势获取函数异常，", th);
            }
        }
    }
}
