package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.message.message_open_api_adapter.Constants;
import com.uc.webview.export.media.MessageID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ&\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016¨\u0006\u0013"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/OpenAPI4WindVane;", "Landroid/taobao/windvane/jsbridge/WVApiPlugin;", "()V", "call", "", "api", "", "request", "", "", "subscriber", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", e.RECORD_EXECUTE, "", "action", "params", "callback", "getUrl", MessageID.onDestroy, "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class OpenAPI4WindVane extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1832303573);
    }

    public static /* synthetic */ Object ipc$super(OpenAPI4WindVane openAPI4WindVane, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (q.a((Object) "call", (Object) str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            String string = parseObject.getString("api");
            q.a((Object) string, "jsonObject.getString(\"api\")");
            JSONObject jSONObject = parseObject.getJSONObject("request");
            q.a((Object) jSONObject, "jsonObject.getJSONObject(\"request\")");
            Map<String, ? extends Object> innerMap = jSONObject.getInnerMap();
            q.a((Object) innerMap, "jsonObject.getJSONObject(\"request\").innerMap");
            call(string, innerMap, wVCallBackContext);
        } else if (q.a((Object) "getVersions", (Object) str) && wVCallBackContext != null) {
            wVCallBackContext.success(JSON.toJSONString(CallService.INSTANCE.getVersions()));
        }
        return true;
    }

    public final void call(String api, Map<String, ? extends Object> request, final WVCallBackContext wVCallBackContext) {
        LinkedHashMap linkedHashMap;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be45ad73", new Object[]{this, api, request, wVCallBackContext});
            return;
        }
        q.c(api, "api");
        q.c(request, "request");
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(request));
        String url = getUrl();
        if (parseObject == null || (jSONObject2 = parseObject.getJSONObject("ext")) == null || (linkedHashMap = jSONObject2.getInnerMap()) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Map<String, ? extends Object> map = linkedHashMap;
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            jSONObject = new JSONObject();
        }
        map.put(Constants.KEY_SUBSCRIBE_TAG, url);
        map.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_WINDVANE);
        CallService callService = CallService.INSTANCE;
        Context mContext = this.mContext;
        q.a((Object) mContext, "mContext");
        callService.call(mContext, api, jSONObject, null, map, new IObserver<Object>() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4WindVane$call$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onNext(Object value) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b8495", new Object[]{this, value});
                    return;
                }
                q.c(value, "value");
                WVCallBackContext wVCallBackContext2 = WVCallBackContext.this;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.successAndKeepAlive(JSON.toJSONString(CallResponse.next(value)));
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
                    WVCallBackContext wVCallBackContext2 = WVCallBackContext.this;
                    if (wVCallBackContext2 == null) {
                        return;
                    }
                    CallException callException = (CallException) e;
                    wVCallBackContext2.success(JSON.toJSONString(CallResponse.error(callException.errCode, callException.errMsg)));
                    return;
                }
                WVCallBackContext wVCallBackContext3 = WVCallBackContext.this;
                if (wVCallBackContext3 == null) {
                    return;
                }
                wVCallBackContext3.success(JSON.toJSONString(CallResponse.error("-1", e.toString())));
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    return;
                }
                WVCallBackContext wVCallBackContext2 = WVCallBackContext.this;
                if (wVCallBackContext2 == null) {
                    return;
                }
                wVCallBackContext2.success(JSON.toJSONString(CallResponse.complete()));
            }
        });
    }

    private final String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        IWVWebView iWVWebView = this.mWebView;
        if (iWVWebView != null && iWVWebView.getUrl() != null) {
            OpenAPIUtils openAPIUtils = OpenAPIUtils.INSTANCE;
            IWVWebView mWebView = this.mWebView;
            q.a((Object) mWebView, "mWebView");
            String urlWithoutParameters = openAPIUtils.getUrlWithoutParameters(mWebView.getUrl());
            if (urlWithoutParameters != null) {
                return urlWithoutParameters;
            }
        }
        return "default";
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        CallService.INSTANCE.unsubscribe(getUrl());
    }
}
