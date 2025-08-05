package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.CallResponse;
import com.taobao.message.message_open_api_adapter.Constants;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class OpenAPI4ARiver implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OpenAPI4ARiver";

    static {
        kge.a(-774446346);
        kge.a(1806634212);
    }

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

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void mpmopenapi(@BindingNode(Page.class) Page page, @BindingParam(name = {"api"}) String str, @BindingParam(name = {"params"}) Map<String, Object> map, @BindingCallback final BridgeCallback bridgeCallback) {
        final String str2;
        Context application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cf79c0", new Object[]{this, page, str, map, bridgeCallback});
            return;
        }
        if (page != null) {
            str2 = page.getOriginalURI();
            page.setExitListener(new Page.ExitListener() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4ARiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.ariver.app.api.Page.ExitListener
                public void onExit() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2681a1a4", new Object[]{this});
                    } else {
                        CallService.INSTANCE.unsubscribe(str2);
                    }
                }
            });
        } else {
            str2 = "default";
        }
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(map));
        Map<String, ? extends Object> hashMap = parseObject.getJSONObject("ext") == null ? new HashMap<>() : parseObject.getJSONObject("ext").getInnerMap();
        JSONObject jSONObject = parseObject.getJSONObject("data") == null ? new JSONObject() : parseObject.getJSONObject("data");
        hashMap.put(Constants.KEY_SUBSCRIBE_TAG, str2);
        hashMap.put(Constants.KEY_CHANNEL_TAG, Constants.Modules.API_ARIVER);
        CallService callService = CallService.INSTANCE;
        if (page == null) {
            application = ApplicationUtil.getApplication();
        } else {
            application = page.getPageContext() == null ? ApplicationUtil.getApplication() : page.getPageContext().getActivity();
        }
        callService.call(application, str, jSONObject, null, hashMap, new IObserver<Object>() { // from class: com.taobao.message.message_open_api_adapter.OpenAPI4ARiver.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onNext(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                    return;
                }
                try {
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.next(obj))), true);
                } catch (Exception e) {
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.error("-10013", "ariver callback json error!"))));
                    TLog.loge(OpenAPI4ARiver.TAG, e.toString());
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                } else if (th instanceof CallException) {
                    CallException callException = (CallException) th;
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.error(callException.errCode, callException.errMsg))));
                } else {
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.error("-1", th.toString()))));
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    bridgeCallback.sendJSONResponse(JSON.parseObject(JSON.toJSONString(CallResponse.complete())));
                }
            }
        });
    }
}
