package com.taobao.themis.open.ability;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.ariver.resource.api.models.TemplateExtModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.open.permission.check.PermissionResult;
import com.taobao.themis.open.permission.check.TMSPermissionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.iwj;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J \u0010\r\u001a\u00020\u00042\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0010"}, d2 = {"Lcom/taobao/themis/open/ability/TMSCommonBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "checkJSPermission", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiName", "", "getExtConfig", "onFinalized", "", "onInitialized", "requestRenderLayout", "callback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSCommonBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-276556326);
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
    @AutoCallback
    @APIMethod
    public final BridgeResponse checkJSPermission(@BindingApiContext ApiContext apiContext, @BindingParam({"checkJSName"}) String apiName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("8ba23abe", new Object[]{this, apiContext, apiName});
        }
        q.d(apiContext, "apiContext");
        q.d(apiName, "apiName");
        if (!TMSPermissionManager.INSTANCE.a(apiContext.c(), apiName, new JSONObject())) {
            BridgeResponse bridgeResponse = BridgeResponse.SUCCESS;
            q.b(bridgeResponse, "BridgeResponse.SUCCESS");
            return bridgeResponse;
        }
        PermissionResult a2 = TMSPermissionManager.INSTANCE.a(apiName, new JSONObject(), apiContext);
        if (a2 != PermissionResult.IGNORE && a2 != PermissionResult.ALLOW) {
            return new BridgeResponse.Error(4, BridgeResponse.ERROR_MSG_FORBIDDEN_ERROR, a2.getSignature());
        }
        BridgeResponse bridgeResponse2 = BridgeResponse.SUCCESS;
        q.b(bridgeResponse2, "BridgeResponse.SUCCESS");
        return bridgeResponse2;
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse getExtConfig(@BindingApiContext ApiContext apiContext) {
        TMSMetaInfoWrapper v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("415c2c01", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        f c = apiContext.c();
        if (c == null || (v = c.v()) == null) {
            BridgeResponse.Error newError = BridgeResponse.newError(20, "appModel is null");
            q.b(newError, "BridgeResponse.newError(…pModel is null\"\n        )");
            return newError;
        }
        q.b(v, "apiContext.invokeInstanc…pModel is null\"\n        )");
        TemplateConfigModel n = v.n();
        if (n == null || !n.isTemplateValid() || n.getExtModel() == null) {
            BridgeResponse.Error newError2 = BridgeResponse.newError(20, "templateConfigModel is null");
            q.b(newError2, "BridgeResponse.newError(…lateConfigModel is null\")");
            return newError2;
        }
        TemplateExtModel extModel = n.getExtModel();
        q.a(extModel);
        q.b(extModel, "templateConfigModel.extModel!!");
        if (!extModel.isExtEnable()) {
            return new BridgeResponse.Error(21, "templateConfig disabled");
        }
        JSONObject jSONObject = new JSONObject();
        TemplateExtModel extModel2 = n.getExtModel();
        q.a(extModel2);
        q.b(extModel2, "templateConfigModel.extModel!!");
        jSONObject.put((JSONObject) "data", (String) extModel2.getExtObj());
        t tVar = t.INSTANCE;
        return new BridgeResponse(jSONObject);
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse requestRenderLayout(@BindingCallback BridgeCallback bridgeCallback, @BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("552e42d3", new Object[]{this, bridgeCallback, apiContext});
        }
        if (apiContext == null || apiContext.a() == null || apiContext.d() == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        iwj iwjVar = (iwj) d.a(iwj.class);
        if (iwjVar == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        iwjVar.g();
        BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
        q.b(bridgeResponse4, "BridgeResponse.SUCCESS");
        return bridgeResponse4;
    }
}
