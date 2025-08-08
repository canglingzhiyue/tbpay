package com.taobao.android.address.miniapp;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.Remote;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.a;
import com.taobao.android.address.b;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;

/* loaded from: classes4.dex */
public class AddressBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f8978a = 11;
    private final int b = 12;
    private final int c = 13;
    private final int d = 14;

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
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

    public static /* synthetic */ void access$000(AddressBridgeExtension addressBridgeExtension, BridgeCallback bridgeCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66de09b1", new Object[]{addressBridgeExtension, bridgeCallback, str});
        } else {
            addressBridgeExtension.a(bridgeCallback, str);
        }
    }

    public static /* synthetic */ void access$100(AddressBridgeExtension addressBridgeExtension, BridgeCallback bridgeCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce0565", new Object[]{addressBridgeExtension, bridgeCallback, new Integer(i), str});
        } else {
            addressBridgeExtension.a(bridgeCallback, i, str);
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void changeRecommendAddress(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e338f7c", new Object[]{this, apiContext, jSONObject, bridgeCallback});
            return;
        }
        try {
            AddressTempActivity.b = bridgeCallback;
            Intent intent = new Intent();
            intent.putExtra("bizIdentity", jSONObject.getString("bizIdentity"));
            intent.putExtra("channel", jSONObject.getString("channel"));
            intent.putExtra(ag.KEY_TAOKE_BIZSCENE, jSONObject.getString(ag.KEY_TAOKE_BIZSCENE));
            intent.setClass(a(), AddressTempActivity.class);
            intent.setFlags(268435456);
            a().startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Remote
    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public void getRecommendAddress(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c12e816", new Object[]{this, apiContext, jSONObject, bridgeCallback});
        } else {
            a(14, jSONObject, bridgeCallback);
        }
    }

    @Remote
    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public void getAllRecommendAddressData(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3f4957", new Object[]{this, apiContext, jSONObject, bridgeCallback});
        } else {
            a(13, jSONObject, bridgeCallback);
        }
    }

    @Remote
    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void syncRecommendAddress(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143933b1", new Object[]{this, apiContext, jSONObject, bridgeCallback});
        } else {
            a(12, jSONObject, bridgeCallback);
        }
    }

    @Remote
    @ThreadType(ExecutorType.NETWORK)
    @ActionFilter
    public void asyncGetRecommendAddress(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6f7db2", new Object[]{this, apiContext, jSONObject, bridgeCallback});
        } else {
            a(11, jSONObject, bridgeCallback);
        }
    }

    private void a(int i, JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95bd5e7", new Object[]{this, new Integer(i), jSONObject, bridgeCallback});
            return;
        }
        try {
            String string = jSONObject.getString("bizIdentity");
            switch (i) {
                case 11:
                    b.a(a(), string, jSONObject.getString("channel"), StringUtils.equals(jSONObject.getString(aw.PARAM_FORCE_REFRESH), "true"), jSONObject.getString("bizName"), new a() { // from class: com.taobao.android.address.miniapp.AddressBridgeExtension.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.address.a
                        public void a(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            } else {
                                AddressBridgeExtension.access$000(AddressBridgeExtension.this, bridgeCallback, str);
                            }
                        }

                        @Override // com.taobao.android.address.a
                        public void a(int i2, String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i2), str});
                            } else {
                                AddressBridgeExtension.access$100(AddressBridgeExtension.this, bridgeCallback, i2, str);
                            }
                        }
                    });
                    return;
                case 12:
                    b.a(a(), string, jSONObject.getString("channel"), "frontInvoke", jSONObject.getString("bizName"));
                    if (bridgeCallback == null) {
                        return;
                    }
                    bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                    return;
                case 13:
                    a(bridgeCallback, b.b(a(), string));
                    return;
                case 14:
                    a(bridgeCallback, JSON.toJSONString(b.a(a(), string)));
                    return;
                default:
                    return;
            }
        } catch (Exception unused) {
            a(bridgeCallback, -1, "系统异常");
        }
    }

    private Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
    }

    private void a(BridgeCallback bridgeCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa2229e", new Object[]{this, bridgeCallback, str});
        } else if (bridgeCallback == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) str);
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    private void a(BridgeCallback bridgeCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97023b9", new Object[]{this, bridgeCallback, new Integer(i), str});
        } else if (bridgeCallback == null) {
        } else {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(i, str));
        }
    }
}
