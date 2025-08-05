package com.taobao.themis.open.ability;

import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.extension.IJSRuntimeFactoryExtension;
import com.taobao.themis.open.extension.c;
import com.taobao.themis.open.extension.d;
import com.taobao.themis.open.extension.e;
import tb.kge;

/* loaded from: classes9.dex */
public class TMSSubPackageBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-655714667);
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

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public void loadSubPackage(@BindingApiContext ApiContext apiContext, @BindingParam(required = true, value = {"packages"}) JSONArray jSONArray, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5942a864", new Object[]{this, apiContext, jSONArray, bridgeCallback});
        } else if (apiContext == null || !(apiContext.c() instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            f c = apiContext.c();
            d dVar = (d) c.b(d.class);
            if (dVar == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                return;
            }
            JSONObject e = dVar.e();
            if (e == null || jSONArray == null || jSONArray.size() <= 0) {
                TMSLogger.d("TMSSubPackageBridge", "loadSubPackage...non getSubPackages" + c.v());
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "非分包模式_3"));
                return;
            }
            String string = jSONArray.getString(0);
            if (TextUtils.isEmpty(string)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                return;
            }
            String string2 = e.getString(string);
            if (TextUtils.isEmpty(string2)) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                return;
            }
            com.taobao.themis.open.packages.downloader.b bVar = new com.taobao.themis.open.packages.downloader.b(c.h(), c.h(), "*", string2, null);
            com.taobao.themis.open.extension.c cVar = (com.taobao.themis.open.extension.c) c.b(com.taobao.themis.open.extension.c.class);
            if (cVar == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            } else {
                cVar.a(bVar, new c.b() { // from class: com.taobao.themis.open.ability.TMSSubPackageBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.themis.open.extension.c.b
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.themis.open.extension.c.b
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        } else {
                            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                        }
                    }

                    @Override // com.taobao.themis.open.extension.c.b
                    public void a(int i, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                        } else {
                            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(i, str));
                        }
                    }
                });
            }
        }
    }

    @ThreadType(ExecutorType.SYNC)
    @APIMethod
    public void requireSubPackage(@BindingApiContext ApiContext apiContext, @BindingParam({"name"}) String str, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337538e3", new Object[]{this, apiContext, str, bridgeCallback});
        } else if (apiContext == null || !(apiContext.c() instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            f c = apiContext.c();
            if (c == null || c.b(d.class) == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                return;
            }
            ITMSPage d = apiContext.d();
            if (d == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            } else if (TextUtils.isEmpty(str)) {
                TMSLogger.d("TMSSubPackageBridge", "loadSubPackage...non getSubPackages" + c.v());
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "非分包模式_3"));
            } else {
                e eVar = (e) c.b(e.class);
                if (eVar == null) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    return;
                }
                IJSRuntimeFactoryExtension iJSRuntimeFactoryExtension = (IJSRuntimeFactoryExtension) c.b(IJSRuntimeFactoryExtension.class);
                if (iJSRuntimeFactoryExtension != null && iJSRuntimeFactoryExtension.a() == IJSRuntimeFactoryExtension.Type.V8) {
                    com.taobao.themis.open.resource.c b = eVar.b(str + "/gm.js");
                    if (b == null || b.b() == null) {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                        return;
                    }
                    String b2 = b.b();
                    d.a(b2, str + "/gm.js");
                    bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                    return;
                }
                com.taobao.themis.open.resource.c b3 = eVar.b(str + "/gm.v20.wlm");
                if (b3 == null || b3.a() == null) {
                    bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                    return;
                }
                byte[] a2 = b3.a();
                d.a(a2, str + "/gm.v20.wlm");
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }
}
