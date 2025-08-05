package com.taobao.themis.open.permission.auth;

import android.app.Activity;
import android.graphics.Color;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPageFactory;
import com.taobao.themis.kernel.utils.f;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.open.permission.auth.c;
import com.taobao.themis.open.permission.sendmtop.SendMtopParams;
import com.taobao.themis.open.permission.sendmtop.SendMtopResponse;
import com.taobao.themis.open.permission.sendmtop.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001c\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007JZ\u0010\u0012\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007JN\u0010\u0013\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007JN\u0010\u0014\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J(\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00172\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J(\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00172\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/open/permission/auth/TMSAuthBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "authorize", "", "callMethod", "", "scopeNicks", "isvAppId", MtopJSBridge.MtopJSParam.ACCOUNT_SITE, ParamsConstants.Key.PARAM_SCENE_CODE, "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "extInfo", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "getAuthUserInfo", "getAuthorize", "getBusinessAuth", "getComponentAuth", "getSetting", "withSubscriptions", "", "onFinalized", "onInitialized", "openSetting", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSAuthBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/open/permission/auth/TMSAuthBridge$authorize$1", "Lcom/taobao/themis/open/permission/auth/TMSAuthHelper$AuthCallback;", "onCallBack", "", "success", "", "result", "Lcom/alibaba/fastjson/JSONObject;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22680a;

        public a(BridgeCallback bridgeCallback) {
            this.f22680a = bridgeCallback;
        }

        @Override // com.taobao.themis.open.permission.auth.c.a
        public void a(boolean z, JSONObject result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), result});
                return;
            }
            q.d(result, "result");
            this.f22680a.sendJSONResponse(result);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/open/permission/auth/TMSAuthBridge$getAuthUserInfo$1", "Lcom/taobao/themis/open/permission/sendmtop/SendMtopUtils$Callback;", "onResult", "", "sendMtopResponse", "Lcom/taobao/themis/open/permission/sendmtop/SendMtopResponse;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements a.InterfaceC0967a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22681a;

        public b(BridgeCallback bridgeCallback) {
            this.f22681a = bridgeCallback;
        }

        @Override // com.taobao.themis.open.permission.sendmtop.a.InterfaceC0967a
        public void a(SendMtopResponse sendMtopResponse) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5815e19a", new Object[]{this, sendMtopResponse});
            } else if (sendMtopResponse != null && sendMtopResponse.getSuccess() && sendMtopResponse.getData() != null) {
                byte[] data = sendMtopResponse.getData();
                q.a(data);
                JSONObject a2 = f.a(new String(data, d.UTF_8));
                this.f22681a.sendJSONResponse(a2 != null ? a2.getJSONObject("data") : null);
            } else {
                BridgeCallback bridgeCallback = this.f22681a;
                Pair[] pairArr = new Pair[4];
                pairArr[0] = j.a("success", false);
                pairArr[1] = j.a("error", -1);
                if (sendMtopResponse == null || (str = sendMtopResponse.getErrorCode()) == null) {
                    str = "invalid parameter!";
                }
                pairArr[2] = j.a("errorCode", str);
                if (sendMtopResponse == null || (str2 = sendMtopResponse.getErrorMsg()) == null) {
                    str2 = "invalid parameter!";
                }
                pairArr[3] = j.a("errorMessage", str2);
                bridgeCallback.sendJSONResponse(f.a(pairArr));
            }
        }
    }

    static {
        kge.a(1890543765);
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
    public final void getAuthorize(@BindingParam({"scopeNicks"}) String str, @BindingParam({"isvAppId"}) String str2, @BindingParam({"accountSite"}) String str3, @BindingParam({"sceneCode"}) String str4, @BindingParam({"extInfo"}) JSONObject jSONObject, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf08d11", new Object[]{this, str, str2, str3, str4, jSONObject, apiContext, bridgeCallback});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        a("getAuthorize", str, str2, str3, str4, apiContext, jSONObject, bridgeCallback);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getAuthUserInfo(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da776781", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c = apiContext.c();
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        SendMtopParams sendMtopParams = new SendMtopParams();
        sendMtopParams.setApi("mtop.taobao.openlink.fusionapp.user.get");
        sendMtopParams.setV("1.0");
        sendMtopParams.setNeedLogin(true);
        sendMtopParams.setAddISVHeader(AuthUtils.INSTANCE.a(c, "", sendMtopParams.getApi()));
        sendMtopParams.setHeaders(com.taobao.themis.open.permission.sendmtop.a.a(c));
        com.taobao.themis.kernel.f c2 = apiContext.c();
        q.a(c2);
        q.b(c2, "apiContext.invokeInstance!!");
        com.taobao.themis.open.permission.sendmtop.a.a(c2, sendMtopParams, new b(bridgeCallback));
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getBusinessAuth(@BindingParam({"scopeNicks"}) String str, @BindingParam({"isvAppId"}) String str2, @BindingParam({"accountSite"}) String str3, @BindingParam({"extInfo"}) JSONObject jSONObject, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf80212", new Object[]{this, str, str2, str3, jSONObject, apiContext, bridgeCallback});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        a("getBusinessAuth", str, str2, str3, null, apiContext, jSONObject, bridgeCallback);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getComponentAuth(@BindingParam({"scopeNicks"}) String str, @BindingParam({"isvAppId"}) String str2, @BindingParam({"accountSite"}) String str3, @BindingParam({"extInfo"}) JSONObject jSONObject, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34783923", new Object[]{this, str, str2, str3, jSONObject, apiContext, bridgeCallback});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        a("getComponentAuth", str, str2, str3, null, apiContext, jSONObject, bridgeCallback);
    }

    private final void a(String str, String str2, String str3, String str4, String str5, ApiContext apiContext, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46059a3", new Object[]{this, str, str2, str3, str4, str5, apiContext, jSONObject, bridgeCallback});
            return;
        }
        Activity activity = null;
        if ((apiContext != null ? apiContext.c() : null) != null) {
            com.taobao.themis.kernel.f c = apiContext.c();
            if (c != null) {
                activity = c.o();
            }
            if (activity != null) {
                com.taobao.themis.kernel.f c2 = apiContext.c();
                q.a(c2);
                if (!o.d(c2)) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(4, "Authorization cannot be initiated before interaction"));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                List a2 = f.a(str2, String.class);
                if (a2 == null) {
                    a2 = p.a();
                }
                arrayList.addAll(a2);
                com.taobao.themis.open.permission.auth.model.c cVar = new com.taobao.themis.open.permission.auth.model.c();
                cVar.b(str4);
                cVar.c(str5);
                cVar.a(str);
                cVar.d(str3);
                cVar.a(jSONObject);
                cVar.a(arrayList);
                Activity o = c2.o();
                q.b(o, "instance.activity");
                new c(o, cVar, c2, apiContext.d(), new a(bridgeCallback)).a();
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getSetting(@BindingParam({"withSubscriptions"}) boolean z, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da66b2c", new Object[]{this, new Boolean(z), apiContext, bridgeCallback});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        if ((apiContext != null ? apiContext.c() : null) == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        com.taobao.themis.kernel.f c = apiContext.c();
        q.a(c);
        q.b(c, "apiContext.invokeInstance!!");
        AuthUtils authUtils = AuthUtils.INSTANCE;
        String o = k.o(c);
        String h = c.h();
        q.b(h, "instance.appId");
        bridgeCallback.sendJSONResponse(authUtils.a(c, o, h, z));
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public final void openSetting(@BindingParam({"withSubscriptions"}) boolean z, @BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6b98b8", new Object[]{this, new Boolean(z), apiContext, bridgeCallback});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        com.taobao.themis.kernel.f c = apiContext != null ? apiContext.c() : null;
        if (c == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        ITMSPageFactory m = c.m();
        String a2 = m.a();
        q.b(a2, "TMSAppUtils.getAuthUrl()");
        c.b().a(ITMSPageFactory.a.a(m, a2, new Window(null, null, null, null, Integer.valueOf(Color.parseColor("#ffffff")), false, null, null, null, null, null, null, null, null, null, null, 65487, null), null, null, 8, null));
        getSetting(z, apiContext, bridgeCallback);
    }
}
