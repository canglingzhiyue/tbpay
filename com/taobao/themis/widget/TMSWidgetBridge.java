package com.taobao.themis.widget;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.o;
import com.vivo.push.BuildConfig;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u001c\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u001e\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u001e\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J0\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u001b\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u00192\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u001d"}, d2 = {"Lcom/taobao/themis/widget/TMSWidgetBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "buildWidgetRelationMiniProgramUri", "Landroid/net/Uri;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "getBizData", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "getInitData", "getRelationAppId", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "getRelationAppInfo", "getSceneInfo", "navigateToRelationMiniProgram", "extraData", "Lcom/alibaba/fastjson/JSONObject;", "onFinalized", "onInitialized", "setGestureMode", "gestureMode", "", "widgetDowngrade", "errorCode", "errorMsg", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSWidgetBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1629042130);
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

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse getSceneInfo(@BindingApiContext ApiContext apiContext) {
        JSONObject sceneParamObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("80d65518", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        f c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(c, "apiContext.invokeInstanc…eResponse.FORBIDDEN_ERROR");
        WidgetStartParams widgetStartParams = (WidgetStartParams) c.a(WidgetStartParams.class);
        if (widgetStartParams == null || (sceneParamObject = widgetStartParams.getSceneParamObject()) == null) {
            return new BridgeResponse.Error(10, "sceneInfo format exception");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "sceneInfo", (String) sceneParamObject);
        return new BridgeResponse(jSONObject);
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void widgetDowngrade(@BindingApiContext ApiContext apiContext, @BindingParam({"errorCode"}) String errorCode, @BindingParam({"errorMsg"}) String errorMsg, @BindingCallback BridgeCallback bridgeCallback) {
        com.taobao.themis.widget.kernal.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9db8773", new Object[]{this, apiContext, errorCode, errorMsg, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(errorCode, "errorCode");
        q.d(errorMsg, "errorMsg");
        q.d(bridgeCallback, "bridgeCallback");
        ITMSPage d = apiContext.d();
        if (d != null && (aVar = (com.taobao.themis.widget.kernal.a) d.a(com.taobao.themis.widget.kernal.a.class)) != null) {
            String str = com.taobao.themis.kernel.e.h.d;
            q.b(str, "TMS_ERR_WIDGET_DOWNGRADE.errorCode");
            String str2 = com.taobao.themis.kernel.e.h.e;
            q.b(str2, "TMS_ERR_WIDGET_DOWNGRADE.errorMsg");
            aVar.b(str, str2);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "errorCode", com.taobao.themis.kernel.e.h.d);
        jSONObject2.put((JSONObject) "errorMessage", com.taobao.themis.kernel.e.h.e);
        jSONObject2.put((JSONObject) "bizErrorCode", errorCode);
        jSONObject2.put((JSONObject) "bizErrorMessage", errorMsg);
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public final void getInitData(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b77ae28", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        f c = apiContext.c();
        if (c != null) {
            q.b(c, "apiContext.invokeInstanc…         return\n        }");
            WidgetStartParams widgetStartParams = (WidgetStartParams) c.a(WidgetStartParams.class);
            String initData = widgetStartParams != null ? widgetStartParams.getInitData() : null;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "initData", (String) JSON.parseObject(initData));
                bridgeCallback.sendJSONResponse(jSONObject);
                return;
            } catch (Throwable th) {
                TMSLogger.b("TMSWidgetBridge", "getInitData fail", th);
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10, "InitData is null or format exception"));
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getBizData(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IMtopInnerAdapter.Response response;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ae61b1", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        f c = apiContext.c();
        if (c != null) {
            q.b(c, "apiContext.invokeInstanc…         return\n        }");
            WidgetStartParams widgetStartParams = (WidgetStartParams) c.a(WidgetStartParams.class);
            String str = null;
            String sceneParamValue = widgetStartParams != null ? widgetStartParams.getSceneParamValue("schemaDataId") : null;
            WidgetStartParams widgetStartParams2 = (WidgetStartParams) c.a(WidgetStartParams.class);
            String sceneParamValue2 = widgetStartParams2 != null ? widgetStartParams2.getSceneParamValue("sellerId") : null;
            if (sceneParamValue == null || sceneParamValue2 == null) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "sellerId or schemaDataId empty"));
                return;
            }
            IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) qpt.b(IMtopInnerAdapter.class);
            if (iMtopInnerAdapter != null) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject2;
                jSONObject3.put((JSONObject) "schemaDataId", sceneParamValue);
                jSONObject3.put((JSONObject) "sellerId", sceneParamValue2);
                t tVar = t.INSTANCE;
                jSONArray.add(jSONObject2);
                t tVar2 = t.INSTANCE;
                jSONObject.put((JSONObject) "queries", jSONArray.toJSONString());
                t tVar3 = t.INSTANCE;
                response = IMtopInnerAdapter.a.a(iMtopInnerAdapter, "mtop.com.taobao.miniapp.schema.data.runtime.get", "1.0", jSONObject, null, false, null, null, null, null, BuildConfig.VERSION_CODE, null);
            } else {
                response = null;
            }
            if (response != null && response.getSuccess()) {
                JSONObject data = response.getData();
                if ((data != null ? data.getJSONObject("data") : null) != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject data2 = response.getData();
                    q.a(data2);
                    jSONObject4.put((JSONObject) "bizData", (String) data2.getJSONObject("data"));
                    bridgeCallback.sendJSONResponse(jSONObject4);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(response != null ? response.getErrorCode() : null);
            sb.append(":");
            if (response != null) {
                str = response.getErrorMsg();
            }
            sb.append(str);
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(12, sb.toString()));
            return;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse setGestureMode(@BindingApiContext ApiContext apiContext, @BindingParam({"gestureMode"}) String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("24c71708", new Object[]{this, apiContext, str});
        }
        q.d(apiContext, "apiContext");
        f c = apiContext.c();
        if (c == null || !o.b(c)) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        } else if (str == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.INVALID_PARAM;
            q.b(bridgeResponse2, "BridgeResponse.INVALID_PARAM");
            return bridgeResponse2;
        } else {
            c.a(c, str);
            BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
            q.b(bridgeResponse3, "BridgeResponse.SUCCESS");
            return bridgeResponse3;
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse getRelationAppId(@BindingApiContext ApiContext apiContext) {
        String relationUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("ee3c703e", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        f c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(c, "apiContext.invokeInstanc…eResponse.FORBIDDEN_ERROR");
        WidgetStartParams widgetStartParams = (WidgetStartParams) c.a(WidgetStartParams.class);
        if (widgetStartParams == null || (relationUrl = widgetStartParams.getRelationUrl()) == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        String queryParameter = Uri.parse(relationUrl).getQueryParameter(i.APP_ID);
        if (queryParameter == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        q.b(queryParameter, "Uri.parse(relationUrl).g…eResponse.FORBIDDEN_ERROR");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "relationAppId", queryParameter);
        t tVar = t.INSTANCE;
        return new BridgeResponse(jSONObject);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse getRelationAppInfo(@BindingApiContext ApiContext apiContext) {
        String relationUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("becacc91", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        f c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(c, "apiContext.invokeInstanc…eResponse.FORBIDDEN_ERROR");
        WidgetStartParams widgetStartParams = (WidgetStartParams) c.a(WidgetStartParams.class);
        if (widgetStartParams == null || (relationUrl = widgetStartParams.getRelationUrl()) == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        String queryParameter = Uri.parse(relationUrl).getQueryParameter(i.APP_ID);
        if (queryParameter == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        q.b(queryParameter, "Uri.parse(relationUrl).g…eResponse.FORBIDDEN_ERROR");
        HashMap hashMap = new HashMap();
        String a2 = com.taobao.themis.utils.o.a(relationUrl, "query");
        if (!StringUtils.isEmpty(a2)) {
            String query = URLDecoder.decode(a2);
            q.b(query, "query");
            String str = query;
            List<String> b = n.b((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null);
            if (b.size() > 1) {
                for (String str2 : b) {
                    List b2 = n.b((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null);
                    if (b2.size() >= 2) {
                        hashMap.put(b2.get(0), b2.get(1));
                    }
                }
            } else {
                List b3 = n.b((CharSequence) str, new String[]{"="}, false, 0, 6, (Object) null);
                if (b3.size() >= 2) {
                    hashMap.put(b3.get(0), b3.get(1));
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "relationAppId", queryParameter);
        jSONObject2.put((JSONObject) "query", (String) hashMap);
        t tVar = t.INSTANCE;
        return new BridgeResponse(jSONObject);
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse navigateToRelationMiniProgram(@BindingApiContext ApiContext apiContext, @BindingParam({"extraData"}) JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("1a595157", new Object[]{this, apiContext, jSONObject});
        }
        q.d(apiContext, "apiContext");
        f c = apiContext.c();
        if (c == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(c, "apiContext.invokeInstanc…eResponse.FORBIDDEN_ERROR");
        d.INSTANCE.b(c);
        Uri a2 = a(c);
        if (a2 == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject3.put((JSONObject) "extraData", (String) jSONObject);
        t tVar = t.INSTANCE;
        bundle.putString("referrerInfo", jSONObject2.toJSONString());
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
        if (iNavigatorAdapter != null) {
            Activity a3 = apiContext.a();
            q.b(a3, "apiContext.activity");
            String uri = a2.toString();
            q.b(uri, "uri.toString()");
            INavigatorAdapter.b.a(iNavigatorAdapter, a3, uri, bundle, null, null, 16, null);
        }
        BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
        q.b(bridgeResponse3, "BridgeResponse.SUCCESS");
        return bridgeResponse3;
    }

    private final Uri a(f fVar) {
        String relationUrl;
        IUserTrackerAdapter iUserTrackerAdapter;
        String spmOri;
        String realSpmUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("70955964", new Object[]{this, fVar});
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) fVar.a(WidgetStartParams.class);
        if (widgetStartParams == null || (relationUrl = widgetStartParams.getRelationUrl()) == null) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(relationUrl).buildUpon();
        HashMap hashMap = new HashMap();
        WidgetStartParams widgetStartParams2 = (WidgetStartParams) fVar.a(WidgetStartParams.class);
        if (widgetStartParams2 != null && (realSpmUrl = widgetStartParams2.getRealSpmUrl()) != null) {
            hashMap.put("spm-url", realSpmUrl);
            buildUpon.appendQueryParameter("spm_ori", realSpmUrl);
        }
        WidgetStartParams widgetStartParams3 = (WidgetStartParams) fVar.a(WidgetStartParams.class);
        if (widgetStartParams3 != null && (spmOri = widgetStartParams3.getSpmOri()) != null) {
            hashMap.put("spm_ori", spmOri);
            buildUpon.appendQueryParameter("widget_ori", spmOri);
        }
        if ((!hashMap.isEmpty()) && (iUserTrackerAdapter = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class)) != null) {
            iUserTrackerAdapter.updateNextPageProperties(ai.b(hashMap));
        }
        return buildUpon.build();
    }
}
