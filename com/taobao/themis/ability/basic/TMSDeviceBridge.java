package com.taobao.themis.ability.basic;

import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.a;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import tb.kge;
import tb.nfc;
import tb.qoq;
import tb.qor;
import tb.qox;
import tb.qoy;
import tb.qpt;

/* loaded from: classes9.dex */
public class TMSDeviceBridge implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-218671811);
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
    @APIMethod
    public void getNetworkType(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62733c66", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (bridgeCallback == null) {
        } else {
            bridgeCallback.sendJSONResponse(qor.a(apiContext.a()));
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void getHAMemoryInfo(@BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ef8f97", new Object[]{this, bridgeCallback});
        } else if (bridgeCallback == null) {
        } else {
            bridgeCallback.sendJSONResponse(qoq.a());
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void getHADeviceInfo(@BindingApiContext ApiContext apiContext, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c2a405", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext.c() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            final JSONObject jSONObject = new JSONObject();
            com.taobao.themis.kernel.ability.a.a().a(apiContext.c(), TMSCalendarBridge.namespace, apiContext.f(), null, nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, PerformanceAbility.API_GET_DEVICE_LEVEL, new JSONObject(), new qox() { // from class: com.taobao.themis.ability.basic.TMSDeviceBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qox
                public void a(qoy qoyVar, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z)});
                        return;
                    }
                    if (qoyVar.d() && qoyVar.a() != null && qoyVar.a().getJSONObject("data") != null) {
                        jSONObject.put("deviceLevel", (Object) qoyVar.a().getJSONObject("data").getString("result"));
                    }
                    bridgeCallback.sendJSONResponse(jSONObject);
                }
            });
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void getAppBaseInfo(@BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext, @BindingParam(name = {"requireAppInfo"}) boolean z) {
        TMSMetaInfoWrapper v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea226ac", new Object[]{this, bridgeCallback, apiContext, new Boolean(z)});
            return;
        }
        try {
            f c = apiContext.c();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", (Object) c.h());
            jSONObject.put("version", (Object) ((IEnvironmentService) qpt.a(IEnvironmentService.class)).getAppVersion());
            jSONObject.put("theme", "light");
            jSONObject.put("appName", (Object) ((IEnvironmentService) qpt.a(IEnvironmentService.class)).getAppName());
            if (z && (v = c.v()) != null && v.z() != null) {
                jSONObject.put(RVConstants.EXTRA_APPINFO, JSONObject.toJSON(c.v().z()));
            }
            bridgeCallback.sendJSONResponse(jSONObject);
        } catch (Exception unused) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, TLogTracker.SCENE_EXCEPTION));
        }
    }
}
