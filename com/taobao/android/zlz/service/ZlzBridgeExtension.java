package com.taobao.android.zlz.service;

import android.util.Log;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cjg;
import tb.cjh;
import tb.cji;
import tb.cjj;
import tb.cjk;

/* loaded from: classes6.dex */
public class ZlzBridgeExtension implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WebServiceImpl";
    public static final int ZLZ_CALLBACK_ERROR = 10000;

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
    public void zlzGetMetaInfo(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb6df78", new Object[]{this, page, bridgeCallback});
            return;
        }
        try {
            a.a().a(page.getApp().getAppContext().getContext());
            String b = cjg.b(page.getApp().getAppContext().getContext());
            if (b != null && !"".equals(b)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("metaInfo", (Object) b);
                bridgeCallback.sendJSONResponse(jSONObject);
                return;
            }
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "metainfo is null"));
        } catch (Exception e) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "exception when get metainfo:" + e.getMessage()));
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void zlzDownloadFaceModel(@BindingNode(Page.class) Page page, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebfc953", new Object[]{this, page, bridgeCallback});
            return;
        }
        try {
            cjg.c().a(page.getApp().getAppContext().getContext(), new cjk() { // from class: com.taobao.android.zlz.service.ZlzBridgeExtension.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cjk
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    String str = "zlzDownloadFaceModel: success=" + z;
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.NamedValue("result", Boolean.valueOf(z)));
                }
            });
        } catch (Exception e) {
            Log.e("WebServiceImpl", "zlzDownloadFaceModel: exception", e);
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "exception when get metainfo:" + e.getMessage()));
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public Boolean zlzCheckModelReady(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cd0e278e", new Object[]{this, page, bridgeCallback});
        }
        try {
            return Boolean.valueOf(cjg.c().e());
        } catch (Exception e) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "exception when get metainfo:" + e.getMessage()));
            return false;
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void zlzStartEkyc(@BindingNode(Page.class) Page page, @BindingParam(name = {"eKYCId"}) String str, @BindingParam(name = {"eKYCConfig"}) String str2, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331576cd", new Object[]{this, page, str, str2, bridgeCallback});
            return;
        }
        cjh cjhVar = new cjh();
        cjhVar.f26310a = str;
        cjhVar.d = str2;
        cjhVar.c.put("hummerContext", page.getApp().getAppContext().getContext());
        try {
            cjg.c().a(cjhVar, new cjj() { // from class: com.taobao.android.zlz.service.ZlzBridgeExtension.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cjj
                public void a(cji cjiVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e38b2ab6", new Object[]{this, cjiVar});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", (Object) Integer.valueOf(cjiVar.f26311a));
                    jSONObject.put("subCode", (Object) cjiVar.b);
                    jSONObject.put("result", (Object) cjiVar.c);
                    jSONObject.put("extInfo", (Object) cjiVar.e);
                    bridgeCallback.sendJSONResponse(jSONObject);
                }
            });
        } catch (Exception e) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10000, "exception when start ekyc:" + e.getMessage()));
        }
    }
}
