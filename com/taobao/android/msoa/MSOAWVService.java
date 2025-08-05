package com.taobao.android.msoa;

import android.content.Context;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.taobao.windvane.connect.HttpConnector;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.n;
import com.taobao.avplayer.TBPlayerConst;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class MSOAWVService extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "MSOAWVService";
    public static final String SP_NAME = "msoa_debug_data";

    public static /* synthetic */ Object ipc$super(MSOAWVService mSOAWVService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context access$000(MSOAWVService mSOAWVService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75aef648", new Object[]{mSOAWVService}) : mSOAWVService.mContext;
    }

    public static /* synthetic */ void access$100(MSOAWVService mSOAWVService, JSONObject jSONObject, Map map) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e364bf76", new Object[]{mSOAWVService, jSONObject, map});
        } else {
            mSOAWVService.setUserInfoToResultJson(jSONObject, map);
        }
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [com.taobao.android.msoa.MSOAWVService$1] */
    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        HashMap hashMap;
        HashMap hashMap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("debugSwitch".equals(str)) {
            com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(str2);
            if (parseObject != null) {
                final String string = parseObject.getString("configUrl");
                if (!TextUtils.isEmpty(string)) {
                    new AsyncTask() { // from class: com.taobao.android.msoa.MSOAWVService.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str3, Object... objArr) {
                            if (str3.hashCode() == -1325021319) {
                                super.onPostExecute(objArr[0]);
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                        }

                        @Override // android.os.AsyncTask
                        public Object doInBackground(Object[] objArr) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                            }
                            android.taobao.windvane.connect.f a2 = new HttpConnector().a(new android.taobao.windvane.connect.e(string));
                            if (a2 == null || a2.b() != 200) {
                                return null;
                            }
                            try {
                                String str3 = new String(a2.d(), "utf-8");
                                PreferenceManager.getDefaultSharedPreferences(MSOAWVService.access$000(MSOAWVService.this)).edit().putString(MSOAWVService.SP_NAME, str3).apply();
                                return str3;
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                                return null;
                            }
                        }

                        @Override // android.os.AsyncTask
                        public void onPostExecute(Object obj) {
                            WVCallBackContext wVCallBackContext2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("b105c779", new Object[]{this, obj});
                                return;
                            }
                            super.onPostExecute(obj);
                            if (obj == null || (wVCallBackContext2 = wVCallBackContext) == null) {
                                return;
                            }
                            wVCallBackContext2.success(obj.toString());
                            m.a();
                        }
                    }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                }
            }
            return true;
        } else if ("exitDebugSwitch".equals(str)) {
            PreferenceManager.getDefaultSharedPreferences(this.mContext).edit().remove(SP_NAME).apply();
            m.a();
            return true;
        } else if ("requestService".equals(str)) {
            com.alibaba.fastjson.JSONObject parseObject2 = JSON.parseObject(str2);
            if (parseObject2 != null) {
                String string2 = parseObject2.getString("serviceId");
                String string3 = parseObject2.getString("version");
                String string4 = parseObject2.getString(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName);
                com.alibaba.fastjson.JSONObject parseObject3 = JSON.parseObject(parseObject2.getString("params"));
                if (parseObject3 != null) {
                    hashMap2 = new HashMap();
                    for (Map.Entry<String, Object> entry : parseObject3.entrySet()) {
                        hashMap2.put(entry.getKey(), entry.getValue());
                    }
                    if (!hashMap2.containsKey("context")) {
                        hashMap2.put("context", this.mContext);
                    }
                } else {
                    hashMap2 = null;
                }
                n.a a2 = n.a(string2, string3, hashMap2);
                String str3 = a2.f14440a;
                Map<String, Object> a3 = n.a(a2.b, parseObject2);
                n.a(string2, a3, this.mWebView);
                c.a().a(new g(string2, str3, "msoa.taobao.privilege.windvane", string4, a3, MSOAServiceDefinition.Platform.WINDVANE.value()), new MSOAServiceListener() { // from class: com.taobao.android.msoa.MSOAWVService.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onSuccess(Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                            return;
                        }
                        String jSONString = new com.alibaba.fastjson.JSONObject(map).toJSONString();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("data", jSONString);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        r rVar = new r("HY_SUCCESS");
                        rVar.a(jSONObject);
                        wVCallBackContext.success(rVar);
                    }

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onFail(String str4, String str5, boolean z, Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str4, str5, new Boolean(z), map});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("errorCode", str4);
                            jSONObject.put("errorMsg", str5);
                            jSONObject.put("isMSOAFail", z);
                            MSOAWVService.access$100(MSOAWVService.this, jSONObject, map);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        r rVar = new r("HY_FAILED");
                        rVar.a(jSONObject);
                        wVCallBackContext.error(rVar);
                    }
                });
            } else {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("errorCode", "msoa_error_invalid_param");
                hashMap3.put("errorMsg", "invalid parameter");
                hashMap3.put("isMSOAFail", true);
                wVCallBackContext.error(hashMap3.toString());
            }
            return true;
        } else if (!"requestServiceV2".equals(str)) {
            return false;
        } else {
            com.alibaba.fastjson.JSONObject parseObject4 = JSON.parseObject(str2);
            if (parseObject4 != null) {
                String string5 = parseObject4.getString("serviceId");
                String string6 = parseObject4.getString("version");
                String string7 = parseObject4.getString("invokePageUrl");
                String string8 = parseObject4.getString(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName);
                com.alibaba.fastjson.JSONObject parseObject5 = JSON.parseObject(parseObject4.getString("params"));
                if (parseObject5 != null) {
                    hashMap = new HashMap();
                    for (Map.Entry<String, Object> entry2 : parseObject5.entrySet()) {
                        hashMap.put(entry2.getKey(), entry2.getValue());
                    }
                    if (!hashMap.containsKey("context")) {
                        hashMap.put("context", this.mContext);
                    }
                } else {
                    hashMap = null;
                }
                if (TextUtils.isEmpty(string5) || TextUtils.isEmpty(string6) || TextUtils.isEmpty(string7) || TextUtils.isEmpty(string8)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errorCode", "msoa_error_invalid_param");
                        jSONObject.put("errorMsg", "params serviceId version invokePageUrl sceneName all can not be null or empty");
                        jSONObject.put("isMSOAFail", false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    r rVar = new r("HY_FAILED");
                    rVar.a(jSONObject);
                    wVCallBackContext.error(rVar);
                    return true;
                }
                n.a a4 = n.a(string5, string6, hashMap);
                String str4 = a4.f14440a;
                Map<String, Object> a5 = n.a(a4.b, parseObject4);
                n.a(string5, a5, this.mWebView);
                c.a().a(new h("msoa.taobao.privilege.windvane", string5, str4, string7, string8, a5, MSOAServiceDefinition.Platform.WINDVANE.value()), new MSOAServiceListener() { // from class: com.taobao.android.msoa.MSOAWVService.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onSuccess(Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                            return;
                        }
                        String jSONString = new com.alibaba.fastjson.JSONObject(map).toJSONString();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("data", jSONString);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        r rVar2 = new r("HY_SUCCESS");
                        rVar2.a(jSONObject2);
                        wVCallBackContext.success(rVar2);
                    }

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onFail(String str5, String str6, boolean z, Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str5, str6, new Boolean(z), map});
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("errorCode", str5);
                            jSONObject2.put("errorMsg", str6);
                            jSONObject2.put("isMSOAFail", z);
                            MSOAWVService.access$100(MSOAWVService.this, jSONObject2, map);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        r rVar2 = new r("HY_FAILED");
                        rVar2.a(jSONObject2);
                        wVCallBackContext.error(rVar2);
                    }
                });
            } else {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("errorCode", "msoa_error_invalid_param");
                hashMap4.put("errorMsg", "invalid parameter");
                hashMap4.put("isMSOAFail", true);
                wVCallBackContext.error(hashMap4.toString());
            }
            return true;
        }
    }

    private void setUserInfoToResultJson(JSONObject jSONObject, Map<String, Object> map) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f114c9", new Object[]{this, jSONObject, map});
        } else if (!(map instanceof com.alibaba.fastjson.JSONObject)) {
        } else {
            try {
                com.alibaba.fastjson.JSONObject jSONObject2 = ((com.alibaba.fastjson.JSONObject) map).getJSONObject("userInfo");
                if (jSONObject2 == null || !jSONObject2.getBooleanValue("MSOAErrorWVUserInfo")) {
                    return;
                }
                jSONObject.put("userInfo", new JSONObject(jSONObject2));
            } catch (Exception unused) {
            }
        }
    }
}
