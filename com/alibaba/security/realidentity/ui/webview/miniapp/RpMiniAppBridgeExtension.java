package com.alibaba.security.realidentity.ui.webview.miniapp;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.NativePermissionRequire;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.RPDetail;
import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.RPVerify;
import com.alibaba.security.realidentity.g1;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.speech.util.e;
import java.util.List;

/* loaded from: classes3.dex */
public class RpMiniAppBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RpMiniAppBridgeExtension";

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

    @NativePermissionRequire({e.CAMERA})
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void rpStartByH5(@BindingNode(Page.class) Page page, @BindingParam(name = {"verifyToken"}, required = true) String str, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf69775", new Object[]{this, page, str, bridgeCallback});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(102, "invalid verifyToken"));
            } else if (page != null && page.getApp() != null && page.getApp().getAppContext() != null) {
                Context context = page.getApp().getAppContext().getContext();
                if (context == null) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(102, "null context found"));
                } else {
                    RPVerify.start(context, str, null, "miniApp", new RPEventListener() { // from class: com.alibaba.security.realidentity.ui.webview.miniapp.RpMiniAppBridgeExtension.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alibaba.security.realidentity.RPEventListener
                        public void onFinish(RPResult rPResult, RPDetail rPDetail) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a2f654c3", new Object[]{this, rPResult, rPDetail});
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("state", (Object) Integer.valueOf(rPResult.code));
                            jSONObject.put("errorCode", (Object) (TextUtils.isEmpty(rPDetail.getCode()) ? "invalidParams" : rPDetail.getCode()));
                            jSONObject.put("subErrorCode", (Object) (TextUtils.isEmpty(rPDetail.getSubCode()) ? null : rPDetail.getSubCode()));
                            jSONObject.put("message", (Object) rPDetail.getMsg());
                            bridgeCallback.sendJSONResponse(jSONObject);
                        }
                    });
                }
            } else {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(102, "null app context found"));
            }
        } catch (Exception e) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(102, e.getMessage()));
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void rpTraceLink(@BindingNode(Page.class) Page page, @BindingParam(name = {"token"}) String str, @BindingParam(name = {"service"}) String str2, @BindingParam(name = {"method"}) String str3, @BindingParam(name = {"code"}) int i, @BindingParam(name = {"msg"}) String str4, @BindingParam(name = {"params"}) String str5, @BindingParam(name = {"result"}) String str6, @BindingParam(name = {"tags"}) List<String> list, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f710ec", new Object[]{this, page, str, str2, str3, new Integer(i), str4, str5, str6, list, bridgeCallback});
            return;
        }
        try {
            TrackLog trackLog = new TrackLog();
            trackLog.setVerifyToken(str);
            trackLog.setService(str2);
            trackLog.setMethod(str3);
            trackLog.setCode(i);
            trackLog.setParams(str5);
            trackLog.setResult(str6);
            trackLog.setTags(list);
            trackLog.setMsg(str4);
            trackLog.setLayer("miniApp");
            g1.f().a(str, trackLog);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) 0);
            jSONObject.put("message", "success");
            bridgeCallback.sendJSONResponse(jSONObject);
        } catch (Exception e) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(102, e.getMessage()));
        }
    }
}
