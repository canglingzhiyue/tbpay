package com.taobao.themis.ability.basic;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.a;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.q;
import com.taobao.themis.utils.i;
import com.taobao.themis.utils.o;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class TMSNavigatorBridge implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(442244162);
        kge.a(-86622547);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @APIMethod
    public void originalRouteUrl(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862c6381", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (apiContext.c() instanceof f) {
            String g = apiContext.c().g();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) g);
            bridgeCallback.sendJSONResponse(jSONObject);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void navigateToHomePage(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40db1ebe", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (apiContext.c() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            apiContext.c().b().a(0);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void exit(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f2881a", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            apiContext.a().finish();
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void exitApp(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59caf635", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            apiContext.a().finish();
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void exitTinyApp(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528d1e55", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            apiContext.a().finish();
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void navigateToOutside(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam({"url"}) String str, @BindingParam({"params"}) JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a61f027", new Object[]{this, apiContext, bridgeCallback, str, jSONObject});
        } else if (apiContext == null || apiContext.a() == null || StringUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            if (n.bb()) {
                Uri b = o.b(str);
                if (apiContext.c() != null) {
                    b = q.a(b, apiContext.c());
                }
                String uri = b.toString();
                HashMap hashMap = new HashMap();
                hashMap.put("url", uri);
                hashMap.put("miniapp_id", apiContext.c().h());
                hashMap.put("spm_ori", apiContext.c().c());
                hashMap.put("logkey", "/mapp.guide.pdp");
                ((IUserTrackerAdapter) qpt.a(IUserTrackerAdapter.class)).customAdvance("2101", "TRVTbApiPage", "TRVnavigateToOutside", null, null, hashMap);
                str2 = uri;
            } else {
                str2 = str;
            }
            Bundle bundle = null;
            if (jSONObject != null) {
                bundle = i.a(jSONObject);
            }
            ((INavigatorAdapter) qpt.a(INavigatorAdapter.class)).openURL(apiContext.a(), str2, bundle, null, null);
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public BridgeResponse navigateToMiniProgram(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingParam({"appId"}) String str, @BindingParam({"path"}) String str2, @BindingParam({"query"}) String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("195c8a59", new Object[]{this, apiContext, jSONObject, str, str2, str3});
        }
        if (apiContext == null || apiContext.a() == null || apiContext.c() == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        f c = apiContext.c();
        a(jSONObject);
        Uri a2 = a(apiContext.a(), c, str, str2, jSONObject, str3);
        if (a2 != null) {
            ((INavigatorAdapter) qpt.a(INavigatorAdapter.class)).openURL(apiContext.a(), a2.toString(), null, null, null);
            return BridgeResponse.SUCCESS;
        }
        return BridgeResponse.UNKNOWN_ERROR;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        b(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("param");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("referrerInfo");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        JSONObject jSONObject3 = null;
        try {
            jSONObject3 = JSONObject.parseObject(string);
            b(jSONObject3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONObject3 == null) {
            return;
        }
        jSONObject2.put("referrerInfo", (Object) jSONObject3.toJSONString());
    }

    private void b(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("extraData") || (obj = jSONObject.get("extraData")) == null || obj.toString().length() <= 100) {
        } else {
            jSONObject.remove("extraData");
        }
    }

    private static Uri a(Context context, f fVar, String str, String str2, JSONObject jSONObject, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("bde35a98", new Object[]{context, fVar, str, str2, jSONObject, str3});
        }
        if (fVar == null || context == null) {
            return null;
        }
        Uri.Builder appendQueryParameter = o.b("https://m.duanqu.com").buildUpon().appendQueryParameter(com.taobao.themis.kernel.i.APP_ID, str).appendQueryParameter("page", str2);
        if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("envVersion");
            if (!StringUtils.isEmpty(string) && !fVar.q().isMiniAppDebug()) {
                if ("develop".equals(string)) {
                    str4 = "DEBUG";
                } else if ("trial".equals(string)) {
                    str4 = "TRIAL";
                } else {
                    str4 = "examine".equals(string) ? "REVIEW" : "ONLINE";
                }
                String str5 = "ONLINE".equals(str4) ? "online" : "debug";
                String string2 = jSONObject.getString("version");
                appendQueryParameter.appendQueryParameter("nbsn", str4);
                appendQueryParameter.appendQueryParameter("nbsource", str5);
                appendQueryParameter.appendQueryParameter("nbsv", string2);
            }
        }
        try {
            StringBuilder sb = new StringBuilder();
            if (str3 != null) {
                sb.append(URLDecoder.decode(str3));
            }
            JSONObject c = c(jSONObject);
            if (c != null) {
                for (Map.Entry<String, Object> entry : c.entrySet()) {
                    if (!StringUtils.isEmpty(entry.getKey()) && (entry.getValue() instanceof String)) {
                        if (sb.length() != 0) {
                            sb.append("&");
                        }
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(entry.getValue());
                    }
                }
            }
            if (sb.length() != 0) {
                appendQueryParameter.appendQueryParameter("query", sb.toString());
            }
        } catch (Throwable th) {
            TMSLogger.d("query parse error occurred, msg: " + th.getMessage(), th.getLocalizedMessage());
        }
        return appendQueryParameter.build();
    }

    private static JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("param")) != null && (jSONObject3 = jSONObject2.getJSONObject("referrerInfo")) != null) {
            return jSONObject3.getJSONObject("extraData");
        }
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void push(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam({"url"}) String str, @BindingParam({"type"}) String str2, @BindingParam({"windowInfo"}) JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aefc37e", new Object[]{this, apiContext, bridgeCallback, str, str2, jSONObject});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            f c = apiContext.c();
            if (c == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else if (c.j() == TMSSolutionType.UNIAPP) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "params invalid"));
            } else {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                if (!n.J()) {
                    ((INavigatorAdapter) qpt.a(INavigatorAdapter.class)).openURL(apiContext.a(), str, null, null, null);
                    return;
                }
                Window a2 = jSONObject != null ? new Window.a().a(jSONObject, TMSMetaInfoWrapper.Type.AppInfo) : null;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(com.taobao.themis.kernel.i.MIX_RENDER_TYPE, (Object) str2);
                if (jSONObject == null) {
                    z = false;
                }
                jSONObject2.put(com.taobao.themis.kernel.i.PUSH_PAGE_WINDOW_TYPE, (Object) Boolean.valueOf(z));
                c.b().a(c.m().a(str, a2, jSONObject2, (String) null));
            }
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void pop(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c880c7", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null || apiContext.c() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            apiContext.c().b().a(false);
        }
    }
}
