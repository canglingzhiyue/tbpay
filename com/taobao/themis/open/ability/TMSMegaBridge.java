package com.taobao.themis.open.ability;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.Window;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.d;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.alo;
import tb.alu;
import tb.dkt;
import tb.dkx;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002JF\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J<\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0015\u001a\u00020\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/open/ability/TMSMegaBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "mAbilityHubAdapter", "Lcom/alibaba/ability/hub/AbilityHubAdapter;", "abilityHub", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "megaAbilityName", "", "megaApiName", "bindingID", "megaParams", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "onFinalized", "onInitialized", "openLightPage", "url", "tapEnable", "", "appxParams", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSMegaBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private alu f22594a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/open/ability/TMSMegaBridge$abilityHub$2", "Lcom/alibaba/ability/callback/IOnCallbackListener;", "onCallback", "", "result", "Lcom/alibaba/ability/result/ExecuteResult;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements alo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22595a;

        public b(BridgeCallback bridgeCallback) {
            this.f22595a = bridgeCallback;
        }

        @Override // tb.alo
        public void onCallback(ExecuteResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, result});
                return;
            }
            q.d(result, "result");
            if (result.d() == 0) {
                if (n.ay()) {
                    this.f22595a.sendJSONResponse(new JSONObject(result.c()), true);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "result", (String) result.c());
                this.f22595a.sendJSONResponse(jSONObject, true);
            } else if (result.d() != 1) {
                if (result.d() == 99 || result.d() <= 100) {
                    return;
                }
                this.f22595a.sendBridgeResponse(new BridgeResponse.Error(-1, JSON.toJSONString(result.c())));
            } else if (result.f() == "result" && result.e() == null) {
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "result", (String) result.c());
                this.f22595a.sendJSONResponse(jSONObject2, true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032&\u0010\u0005\u001a\"\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u000b\u0012\u0002\b\u0003\u0018\u00010\u0006¨\u0006\u00010\u0006¨\u0006\u0001H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Lcom/taobao/android/abilitykit/AKAbilityExecuteResult;", "", "callback"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements dll {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22596a;

        public c(BridgeCallback bridgeCallback) {
            this.f22596a = bridgeCallback;
        }

        @Override // tb.dll
        public final void callback(String str, dkx<Object> dkxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
            } else {
                this.f22596a.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    static {
        kge.a(994715809);
        kge.a(-86622547);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    @com.taobao.themis.kernel.ability.base.annotation.ThreadType(com.taobao.themis.kernel.executor.ExecutorType.NORMAL)
    @com.taobao.themis.kernel.ability.base.annotation.APIMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void abilityHub(@com.taobao.themis.kernel.ability.base.annotation.BindingApiContext com.taobao.themis.kernel.ability.base.ApiContext r16, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"megaAbilityName"}) java.lang.String r17, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"megaApiName"}) java.lang.String r18, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"bindingID"}) java.lang.String r19, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"megaParams"}) com.alibaba.fastjson.JSONObject r20, @com.taobao.themis.kernel.ability.base.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.open.ability.TMSMegaBridge.abilityHub(com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void openLightPage(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"url"}) String url, @BindingParam(booleanDefault = true, name = {"tapEnable"}) boolean z, @BindingParam(name = {"params"}) JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        Double d;
        Double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ca6297", new Object[]{this, apiContext, url, new Boolean(z), jSONObject, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(url, "url");
        q.d(bridgeCallback, "bridgeCallback");
        if (apiContext.a() == null || StringUtils.isEmpty(url)) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10, "params error"));
            return;
        }
        if (n.bb()) {
            Uri parse = Uri.parse(url);
            if (apiContext.c() != null) {
                q.a(parse);
                f c2 = apiContext.c();
                q.a(c2);
                q.b(c2, "apiContext.invokeInstance!!");
                parse = com.taobao.themis.kernel.utils.q.a(parse, c2);
            }
            url = parse.toString();
            q.b(url, "uri.toString()");
        }
        dlr dlrVar = new dlr();
        dlrVar.a(apiContext.a());
        Activity a2 = apiContext.a();
        q.b(a2, "apiContext.activity");
        Window window = a2.getWindow();
        q.b(window, "apiContext.activity.window");
        dlrVar.a(window.getDecorView());
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "type", com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c.actionShowWindVanePop);
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject4;
        jSONObject5.put((JSONObject) "url", url);
        f c3 = apiContext.c();
        jSONObject5.put((JSONObject) "popId", c3 != null ? c3.h() : null);
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = jSONObject6;
        jSONObject7.put((JSONObject) "animation", d.KEY_BOTTOM_IN_OUT);
        jSONObject7.put((JSONObject) "tapEnable", (String) Boolean.valueOf(z));
        jSONObject7.put((JSONObject) "pushType", "outterJump");
        double d3 = 0.6d;
        jSONObject7.put((JSONObject) "originHeight", (String) Double.valueOf((jSONObject == null || (d2 = jSONObject.getDouble("pageHeight")) == null) ? 0.6d : d2.doubleValue()));
        if (jSONObject != null && (d = jSONObject.getDouble("pageHeight")) != null) {
            d3 = d.doubleValue();
        }
        jSONObject7.put((JSONObject) "maxHeight", (String) Double.valueOf(d3));
        t tVar = t.INSTANCE;
        jSONObject5.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) jSONObject6);
        t tVar2 = t.INSTANCE;
        jSONObject3.put((JSONObject) "params", (String) jSONObject4);
        new dkt().a(new dlh(jSONObject2), dlrVar, new c(bridgeCallback));
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
            return;
        }
        alu aluVar = this.f22594a;
        if (aluVar != null) {
            aluVar.a();
        }
        this.f22594a = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/ability/TMSMegaBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(68976297);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
