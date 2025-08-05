package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.a;
import com.ap.zoloz.hummer.common.b;
import com.ap.zoloz.hummer.common.d;
import com.ap.zoloz.hummer.common.h;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class cjn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HUMMER_FOUNDATION_ADD = "add";
    public static final String HUMMER_FOUNDATION_DELETE = "delete";
    public static final String HUMMER_FOUNDATION_GET_INTPUT_PARAMS = "getInputParams";
    public static final String HUMMER_FOUNDATION_GET_LANGUAGE = "getLanguage";
    public static final String HUMMER_FOUNDATION_GET_OUTPUT_PARAMS = "getOutputParams";
    public static final String HUMMER_FOUNDATION_HIDE_LOADING_DIALOG = "hideLoadingDialog";
    public static final String HUMMER_FOUNDATION_LOGGING = "logging";
    public static final String HUMMER_FOUNDATION_LOG_MESS = "logMessage";
    public static final String HUMMER_FOUNDATION_LOG_SEED_ID = "logSeedID";
    public static final String HUMMER_FOUNDATION_MESSAGE = "message";
    public static final String HUMMER_FOUNDATION_NEED_RPC = "needRpc";
    public static final String HUMMER_FOUNDATION_NEGATIVE = "negative";
    public static final String HUMMER_FOUNDATION_POSITIVE = "positive";
    public static final String HUMMER_FOUNDATION_QUERY = "query";
    public static final String HUMMER_FOUNDATION_SEND_RPC = "sendRpc";
    public static final String HUMMER_FOUNDATION_SHOW_ALERT = "showAlert";
    public static final String HUMMER_FOUNDATION_SHOW_LOADING_DIALOG = "showLoadingDialog";
    public static final String HUMMER_FOUNDATION_TITLE = "title";
    public static final String TAG = "ZolozEkycH5Handler";
    public static final String ZIM_IDENTIFY_ACTION = "action";
    public static final String ZIM_IDENTIFY_BIZCONFIG = "bizParam";
    public static final String ZIM_IDENTIFY_EKYCID = "ekycId";
    public static final String ZIM_IDENTIFY_EKYCONFIG = "ekycConfig";
    public static final String ZIM_IDENTIFY_FINISH_WEB_TASK = "finishWebTask";
    public static final String ZIM_IDENTIFY_NEXTINDEX = "nextIndex";
    public static final String ZIM_IDENTIFY_START_EKYC = "startEkyc";
    public static final String ZIM_IDENTIFY_STATUS = "status";

    static {
        kge.a(-193499017);
    }

    public void a(JSONObject jSONObject, Context context, final cjl cjlVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26ddcab", new Object[]{this, jSONObject, context, cjlVar});
        } else if (jSONObject == null || context == null) {
        } else {
            BioLog.i(TAG, " jsapi" + jSONObject.toJSONString());
            String string = jSONObject.getString("action");
            if (StringUtil.isNullorEmpty(string)) {
                return;
            }
            cjg c = cjg.c();
            c.a(context);
            if (ZIM_IDENTIFY_START_EKYC.equals(string)) {
                String string2 = jSONObject.getString(ZIM_IDENTIFY_EKYCID);
                cjh cjhVar = new cjh();
                cjhVar.f26310a = string2;
                JSONObject jSONObject2 = jSONObject.getJSONObject("bizParam");
                Map<? extends String, ? extends Object> hashMap = new HashMap<>();
                if (jSONObject2 != null && jSONObject2.size() > 0) {
                    hashMap = (Map) JSONObject.toJavaObject(jSONObject2, Map.class);
                } else {
                    String string3 = jSONObject.getString("bizParam");
                    if (!StringUtil.isNullorEmpty(string3)) {
                        hashMap = (Map) JSON.parseObject(string3, Map.class);
                    }
                }
                cjhVar.c.putAll(hashMap);
                cjhVar.d = jSONObject.getString(ZIM_IDENTIFY_EKYCONFIG);
                c.a(cjhVar, new cjj() { // from class: tb.cjn.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.cjj
                    public void a(cji cjiVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e38b2ab6", new Object[]{this, cjiVar});
                            return;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("code", (Object) Integer.valueOf(cjiVar.f26311a));
                        jSONObject3.put("subCode", (Object) cjiVar.b);
                        jSONObject3.put("result", (Object) cjiVar.c);
                        if (cjiVar.e != null) {
                            jSONObject3.put("extInfo", (Object) cjiVar.e);
                        }
                        BioLog.i(cjn.TAG, " Ekyc response " + jSONObject3.toString());
                        cjlVar.a(jSONObject3);
                    }
                });
            } else if (ZIM_IDENTIFY_FINISH_WEB_TASK.equals(string)) {
                if (jSONObject.getInteger(ZIM_IDENTIFY_NEXTINDEX) != null) {
                    i = jSONObject.getInteger(ZIM_IDENTIFY_NEXTINDEX).intValue();
                }
                cjg.c().a(i, jSONObject.getString("status"));
                cjlVar.a(new JSONObject());
            } else if (HUMMER_FOUNDATION_LOGGING.equals(string)) {
                h.a().a(jSONObject.getString(HUMMER_FOUNDATION_LOG_SEED_ID), (Map) JSONObject.toJavaObject(jSONObject.getJSONObject(HUMMER_FOUNDATION_LOG_MESS), Map.class));
            } else if (HUMMER_FOUNDATION_SEND_RPC.equals(string)) {
                String string4 = jSONObject.getString("type");
                cjg.c().d().g();
                cjr.a().a(new cjo() { // from class: tb.cjn.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.cjo
                    public void a(cjt cjtVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e3902acb", new Object[]{this, cjtVar});
                            return;
                        }
                        b d = cjg.c().d();
                        if (cjtVar == null || "network_exception".equals(cjtVar.b)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("success", (Object) false);
                            cjlVar.a(jSONObject3);
                            return;
                        }
                        d.a(cjtVar.f26322a.zStack);
                        FactorNextResponse factorNextResponse = cjtVar.f26322a;
                        String str = factorNextResponse.versionToken;
                        if (!StringUtil.isNullorEmpty(str)) {
                            d.a("versionToken", "context", str);
                        }
                        for (int i2 = 0; i2 < factorNextResponse.response.size(); i2++) {
                            for (Map.Entry<String, Object> entry : factorNextResponse.response.get(i2).outParams.entrySet()) {
                                d.a(entry.getKey(), "serverResponse", entry.getValue());
                            }
                        }
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("success", (Object) true);
                        jSONObject4.put("nextResponse", (Object) factorNextResponse);
                        BioLog.i("ZolozEkycH5Handler sendBridgeResult " + jSONObject4.toString());
                        cjlVar.a(jSONObject4);
                    }
                }, cjr.a().a(cjg.c().d(), cjg.c().d().c(string4), false));
            } else if (HUMMER_FOUNDATION_SHOW_ALERT.equals(string)) {
                a.a().a(jSONObject.getString("title"), jSONObject.getString("message"), jSONObject.getString(HUMMER_FOUNDATION_POSITIVE), jSONObject.getString(HUMMER_FOUNDATION_NEGATIVE), new d() { // from class: tb.cjn.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ap.zoloz.hummer.common.d
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(cjn.HUMMER_FOUNDATION_POSITIVE, (Object) true);
                        cjlVar.a(jSONObject3);
                    }

                    @Override // com.ap.zoloz.hummer.common.d
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                            return;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(cjn.HUMMER_FOUNDATION_POSITIVE, (Object) false);
                        cjlVar.a(jSONObject3);
                    }
                });
            } else if (HUMMER_FOUNDATION_SHOW_LOADING_DIALOG.equals(string)) {
                a.a().a("", false, new DialogInterface.OnCancelListener() { // from class: tb.cjn.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        }
                    }
                }, true);
            } else if (HUMMER_FOUNDATION_HIDE_LOADING_DIALOG.equals(string)) {
                a.a().c();
            } else if ("add".equals(string)) {
                cjg.c().d().a(jSONObject.getString("key"), jSONObject.getString("pipeType"), jSONObject.getObject("value", Object.class));
                cjlVar.a(new JSONObject());
            } else if ("query".equals(string)) {
                String string5 = jSONObject.getString("key");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("value", cjg.c().d().a(string5));
                cjlVar.a(jSONObject3);
            } else if ("delete".equals(string)) {
                cjg.c().d().e(jSONObject.getString("key"));
                cjlVar.a(new JSONObject());
            } else if (HUMMER_FOUNDATION_NEED_RPC.equals(string)) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(HUMMER_FOUNDATION_NEED_RPC, (Object) Boolean.valueOf(cjg.c().d().b(jSONObject.getString("type"))));
                cjlVar.a(jSONObject4);
            } else if (HUMMER_FOUNDATION_GET_INTPUT_PARAMS.equals(string)) {
                JSONObject jSONObject5 = new JSONObject();
                Map<String, Object> d = cjg.c().d().d();
                if (d != null) {
                    jSONObject5.putAll(d);
                }
                cjlVar.a(jSONObject5);
            } else if (HUMMER_FOUNDATION_GET_OUTPUT_PARAMS.equals(string)) {
                JSONObject jSONObject6 = new JSONObject();
                JSONObject d2 = cjg.c().d().d(jSONObject.getString("type"));
                if (d2 == null) {
                    d2 = jSONObject6;
                }
                cjlVar.a(d2);
            } else if (!HUMMER_FOUNDATION_GET_LANGUAGE.equals(string)) {
            } else {
                String str = (String) cjg.c().d().a("hummerLocale");
                if (!StringUtil.isNullorEmpty(str)) {
                    a(context, str);
                } else {
                    Locale a2 = a(context);
                    str = a2.getLanguage() + "-" + a2.getCountry();
                }
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(LoggingSPCache.STORAGE_LANGUAGE, (Object) str);
                cjlVar.a(jSONObject7);
            }
        }
    }

    private Locale a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("b23a012b", new Object[]{this, context});
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (Build.VERSION.SDK_INT >= 24) {
                return context.getResources().getConfiguration().getLocales().get(0);
            }
            return context.getResources().getConfiguration().locale;
        }
        return context.getResources().getConfiguration().locale;
    }

    private void a(Context context, String str) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (str == null) {
        } else {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                if (str.contains("-")) {
                    String[] split = str.split("-");
                    if (split.length == 2) {
                        locale = new Locale(split[0], split[1]);
                    } else if (split.length == 1) {
                        locale = new Locale(split[0]);
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        locale = context.getResources().getConfiguration().getLocales().get(0);
                    } else {
                        locale = context.getResources().getConfiguration().locale;
                    }
                } else {
                    locale = new Locale(str);
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    configuration.setLocale(locale);
                } else {
                    configuration.locale = locale;
                }
                context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
            } catch (Exception e) {
                BioLog.e(e);
            }
        }
    }
}
