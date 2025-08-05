package com.taobao.themis.ability_taobao;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.a;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import tb.kge;

/* loaded from: classes9.dex */
public class TMSTBLoginBridge implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1142092576);
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
    public void tbLogin(@BindingApiContext ApiContext apiContext, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135f37bd", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            TMSTBLoginAbility.a(apiContext.a(), new TMSTBLoginAbility.a() { // from class: com.taobao.themis.ability_taobao.TMSTBLoginBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility.a
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    BridgeCallback bridgeCallback2 = bridgeCallback;
                    if (bridgeCallback2 == null) {
                        return;
                    }
                    bridgeCallback2.sendJSONResponse(jSONObject);
                }

                @Override // com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility.a
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    } else {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newError(i, str));
                    }
                }
            });
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public void tbIsLogin(@BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b58fa24", new Object[]{this, bridgeCallback});
        } else {
            TMSTBLoginAbility.a(new TMSTBLoginAbility.a() { // from class: com.taobao.themis.ability_taobao.TMSTBLoginBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility.a
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    BridgeCallback bridgeCallback2 = bridgeCallback;
                    if (bridgeCallback2 == null) {
                        return;
                    }
                    bridgeCallback2.sendJSONResponse(jSONObject);
                }

                @Override // com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility.a
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    } else {
                        bridgeCallback.sendBridgeResponse(BridgeResponse.newError(i, str));
                    }
                }
            });
        }
    }
}
