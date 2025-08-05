package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.message.message_open_api_adapter.Constants;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/OpenAPI4Weex;", "Lcom/taobao/weex/common/WXModule;", "()V", "call", "", "api", "", "request", "", "", "subscriber", "Lcom/taobao/weex/bridge/JSCallback;", "getUrl", "getVersions", "onActivityDestroy", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class OpenAPI4Weex extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(688135052);
    }

    public static /* synthetic */ Object ipc$super(OpenAPI4Weex openAPI4Weex, String str, Object... objArr) {
        if (str.hashCode() == -17468269) {
            super.onActivityDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @JSMethod
    public final void call(String api, Map<String, ? extends Object> request, final JSCallback subscriber) {
        LinkedHashMap linkedHashMap;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43291f92", new Object[]{this, api, request, subscriber});
            return;
        }
        q.c(api, "api");
        q.c(request, "request");
        q.c(subscriber, "subscriber");
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(request));
        String url = getUrl();
        if (parseObject == null || (jSONObject2 = parseObject.getJSONObject("ext")) == null || (linkedHashMap = jSONObject2.getInnerMap()) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map<String, ? extends Object> map = linkedHashMap;
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject3 = jSONObject;
        map.put(Constants.KEY_SUBSCRIBE_TAG, url);
        map.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_WEEX);
        CallService callService = CallService.INSTANCE;
        WXSDKInstance mWXSDKInstance = this.mWXSDKInstance;
        q.a((Object) mWXSDKInstance, "mWXSDKInstance");
        Context O = mWXSDKInstance.O();
        q.a((Object) O, "mWXSDKInstance.context");
        callService.call(O, api, jSONObject3, null, map, new IObserver<Object>() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4Weex$call$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onNext(Object value) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b8495", new Object[]{this, value});
                    return;
                }
                q.c(value, "value");
                JSCallback.this.invokeAndKeepAlive(CallResponse.next(value));
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable e) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, e});
                    return;
                }
                q.c(e, "e");
                if (e instanceof CallException) {
                    CallException callException = (CallException) e;
                    JSCallback.this.invoke(CallResponse.error(callException.errCode, callException.errMsg));
                    return;
                }
                JSCallback.this.invoke(CallResponse.error("-1", e.toString()));
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    JSCallback.this.invoke(CallResponse.complete());
                }
            }
        });
    }

    private final String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null && wXSDKInstance.ak() != null) {
            OpenAPIUtils openAPIUtils = OpenAPIUtils.INSTANCE;
            WXSDKInstance wXSDKInstance2 = this.mWXSDKInstance;
            String urlWithoutParameters = openAPIUtils.getUrlWithoutParameters(wXSDKInstance2 != null ? wXSDKInstance2.ak() : null);
            if (urlWithoutParameters != null) {
                return urlWithoutParameters;
            }
        }
        return "default";
    }

    @JSMethod
    public final void getVersions(JSCallback subscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34c2970", new Object[]{this, subscriber});
            return;
        }
        q.c(subscriber, "subscriber");
        subscriber.invoke(CallService.INSTANCE.getVersions());
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        CallService.INSTANCE.unsubscribe(getUrl());
    }
}
