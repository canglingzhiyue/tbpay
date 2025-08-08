package com.alibaba.triver.triver_shop.jsapi;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.triver.TriverActivity;
import com.alibaba.triver.kit.api.appmonitor.LaunchMonitorData;
import com.alibaba.triver.kit.api.appmonitor.b;
import com.alibaba.triver.kit.api.proxy.ITriverAppMonitorProxy;
import com.alibaba.triver.kit.api.utils.TRiverUrlUtils;
import com.alibaba.triver.kit.api.utils.m;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.ccx;
import tb.kge;
import tb.nfc;

/* loaded from: classes3.dex */
public class ShopMiniappBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, WXSDKInstance> f3778a = new ConcurrentHashMap();
    private Set<com.alibaba.triver.triver_shop.weexview.a> b = Collections.synchronizedSet(new HashSet());
    private a c = null;
    private Activity d;

    /* loaded from: classes3.dex */
    public interface a extends TriverActivity.a {
        void a(boolean z);
    }

    static {
        kge.a(-1881169624);
        kge.a(1806634212);
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.security.Guard
    public Permission permit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Permission) ipChange.ipc$dispatch("edbd77f9", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ a access$000(ShopMiniappBridgeExtension shopMiniappBridgeExtension) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e06683ee", new Object[]{shopMiniappBridgeExtension}) : shopMiniappBridgeExtension.c;
    }

    public static /* synthetic */ Activity access$102(ShopMiniappBridgeExtension shopMiniappBridgeExtension, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1d475617", new Object[]{shopMiniappBridgeExtension, activity});
        }
        shopMiniappBridgeExtension.d = activity;
        return activity;
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
            return;
        }
        for (Map.Entry<String, WXSDKInstance> entry : this.f3778a.entrySet()) {
            if (entry.getValue() != null) {
                try {
                    entry.getValue().e();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.f3778a.clear();
        for (com.alibaba.triver.triver_shop.weexview.a aVar : this.b) {
            try {
                aVar.dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.b.clear();
        TriverActivity triverActivity = this.d;
        if (triverActivity instanceof TriverActivity) {
            triverActivity.b(this.c);
        }
        this.c = null;
        this.d = null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void showWeexFloatLayer(@BindingNode(App.class) App app, @BindingParam(name = {"weexUrl"}) String str, @BindingParam(name = {"title"}) String str2, @BindingParam(name = {"height"}) int i, @BindingParam(name = {"duration"}) int i2, @BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5635c765", new Object[]{this, app, str, str2, new Integer(i), new Integer(i2), bridgeCallback, apiContext});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (app == null || app.getAppContext() == null || app.getAppContext().getContext() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.newError(5, "context is null"));
        } else if (StringUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            Map<String, WXSDKInstance> map = this.f3778a;
            WXSDKInstance wXSDKInstance2 = map.get(app.getAppId() + "@" + str);
            if (wXSDKInstance2 == null) {
                WXSDKInstance wXSDKInstance3 = new WXSDKInstance(app.getAppContext().getContext());
                wXSDKInstance3.c(true);
                RenderContainer renderContainer = new RenderContainer(app.getAppContext().getContext());
                renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                wXSDKInstance3.a(renderContainer);
                HashMap hashMap = new HashMap();
                hashMap.put("bundleUrl", str);
                wXSDKInstance = wXSDKInstance3;
                wXSDKInstance3.c("WeexFloatingWindowInShop", str, hashMap, "", WXRenderStrategy.APPEND_ASYNC);
                Map<String, WXSDKInstance> map2 = this.f3778a;
                map2.put(app.getAppId() + "@" + str, wXSDKInstance);
            } else {
                wXSDKInstance = wXSDKInstance2;
            }
            com.alibaba.triver.triver_shop.weexview.a aVar = new com.alibaba.triver.triver_shop.weexview.a(app.getAppContext().getContext());
            aVar.a(str2);
            aVar.a(apiContext);
            aVar.b(i2);
            aVar.a(i);
            aVar.a(wXSDKInstance);
            aVar.setContentView(R.layout.triver_view_weex_float_window);
            aVar.show();
            jSONObject.put("success", (Object) true);
            bridgeCallback.sendJSONResponse(jSONObject);
            this.b.add(aVar);
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void replaceMiniAppContainer(@BindingNode(App.class) final App app, @BindingParam(name = {"url"}) String str, @BindingParam(booleanDefault = true, name = {"animation"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("364ddc44", new Object[]{this, app, str, new Boolean(z)});
            return;
        }
        Uri parse = Uri.parse(str);
        Nav from = Nav.from(app.getAppContext().getContext());
        if (!z) {
            parse = parse.buildUpon().appendQueryParameter("nextPageAnimation", "false").build();
        }
        from.toUri(parse.toString());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alibaba.triver.triver_shop.jsapi.ShopMiniappBridgeExtension.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    app.exit();
                }
            }
        }, 500L);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void shopPageRenderFinished(@BindingNode(App.class) App app, @BindingParam(name = {"tabKey"}) String str, @BindingParam(name = {"timestamp"}) long j, @BindingParam(name = {"renderType"}) String str2, @BindingParam(name = {"url"}) String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe8b006", new Object[]{this, app, str, new Long(j), str2, str3});
        } else if (app == null) {
        } else {
            try {
                if (StringUtils.isEmpty(str3)) {
                    return;
                }
                b a2 = b.a().a(app).a(app.getStartParams()).i(nfc.PHA_MONITOR_MEASURE_PAGE_RENDER_FINISHED).a(Double.valueOf(1.0d)).a();
                long longValue = app.getLongValue("startContainerTime");
                if (longValue <= 0) {
                    return;
                }
                long j2 = j - longValue;
                if (j2 <= 0) {
                    return;
                }
                ((ITriverAppMonitorProxy) RVProxy.get(ITriverAppMonitorProxy.class)).commitTriverShopPerf(a2, str, str2, str3, j2);
                Log.e("ShopPageFinished", j2 + "");
            } catch (Exception unused) {
            }
        }
    }

    @ThreadType(ExecutorType.URGENT_DISPLAY)
    @ActionFilter
    public void getShopPIParams(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c19c5216", new Object[]{this, app, bridgeCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (app == null) {
            bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        boolean equals = "true".equals(app.getStringValue(g.KEY_ENABLE_NEW_START_AC_LOGIC));
        JSONObject jsonValue = app.getJsonValue("shopFetchData");
        jSONObject.put("minidata", (Object) app.getStringValue("shopMiniData"));
        jSONObject.put("datacenter", (Object) app.getStringValue("shopDataCenter"));
        jSONObject.put("downgradeConfig", (Object) app.getStringValue("shopDowngradeConfig"));
        String str = null;
        if (equals) {
            if (jsonValue != null) {
                str = JSONObject.toJSONString(jsonValue, SerializerFeature.DisableCircularReferenceDetect);
            }
            jSONObject.put(g.KEY_SHOP_FETCH, (Object) str);
        } else {
            if (jsonValue != null) {
                str = jsonValue.toJSONString();
            }
            jSONObject.put(g.KEY_SHOP_FETCH, (Object) str);
        }
        jSONObject.put("fetchDowngradeConfig", (Object) String.valueOf(ccx.t()));
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ThreadType(ExecutorType.URGENT_DISPLAY)
    @ActionFilter
    public void getShopFrameworkParams(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7a5729", new Object[]{this, app, bridgeCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Context context = null;
        if (app != null && app.getAppContext() != null) {
            context = app.getAppContext().getContext();
        }
        if (context == null) {
            bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        jSONObject.put("fetchData", (Object) app.getStringValue("shopFetchData"));
        jSONObject.put("originalRouteUrl", (Object) TRiverUrlUtils.g(app));
        jSONObject.put("HAMemoryInfo", (Object) m.a().toJSONString());
        jSONObject.put("HADeviceInfo", (Object) m.b().toJSONString());
        jSONObject.put("clientInfo", (Object) m.a(context).toJSONString());
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void closeWeexFloatLayer(@BindingCallback BridgeCallback bridgeCallback, @BindingNode(Page.class) Page page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f4a885", new Object[]{this, bridgeCallback, page});
            return;
        }
        for (com.alibaba.triver.triver_shop.weexview.a aVar : this.b) {
            try {
                aVar.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.b.clear();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) true);
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void addMonitorPoint(@BindingNode(Page.class) Page page, @BindingParam(name = {"pointName"}) String str, @BindingParam(name = {"timeStep"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31789a5a", new Object[]{this, page, str, str2, bridgeCallback});
            return;
        }
        try {
            LaunchMonitorData a2 = com.alibaba.triver.kit.api.appmonitor.a.a(page);
            if (a2 != null && !a2.containsKey(str)) {
                a2.addPoint(str, Long.valueOf(Long.parseLong(str2)));
            }
            bridgeCallback.sendJSONResponse(new JSONObject());
        } catch (Throwable th) {
            RVLogger.e("addMonitorPoint", th);
        }
    }

    @ActionFilter
    public void enableInterceptBack(@BindingCallback BridgeCallback bridgeCallback, @BindingApiContext final ApiContext apiContext, @BindingParam(name = {"enable"}) boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f091fc4", new Object[]{this, bridgeCallback, apiContext, new Boolean(z)});
            return;
        }
        if (this.c == null) {
            this.c = new a() { // from class: com.alibaba.triver.triver_shop.jsapi.ShopMiniappBridgeExtension.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public boolean f3780a = false;
                public BridgeCallback b = null;

                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (apiContext == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("success", (Object) true);
                        apiContext.sendEvent("interceptBackEvent", jSONObject, null);
                    }
                }

                public boolean a(KeyEvent keyEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5e8cd358", new Object[]{this, keyEvent})).booleanValue();
                    }
                    if (this.f3780a && keyEvent.getAction() == 1) {
                        a();
                    }
                    return this.f3780a;
                }

                @Override // com.alibaba.triver.triver_shop.jsapi.ShopMiniappBridgeExtension.a
                public void a(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                    } else {
                        this.f3780a = z2;
                    }
                }
            };
        }
        this.c.a(z);
        if (!z || apiContext.getRender() == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alibaba.triver.triver_shop.jsapi.ShopMiniappBridgeExtension.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    TriverActivity activity = apiContext.getRender().getActivity();
                    if (!(activity instanceof TriverActivity)) {
                        return;
                    }
                    activity.a(ShopMiniappBridgeExtension.access$000(ShopMiniappBridgeExtension.this));
                    ShopMiniappBridgeExtension.access$102(ShopMiniappBridgeExtension.this, activity);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
