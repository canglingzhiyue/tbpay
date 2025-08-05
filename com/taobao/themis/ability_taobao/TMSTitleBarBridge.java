package com.taobao.themis.ability_taobao;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.themis.container.title.action.base.d;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.ui.titlebar.IMenuAction;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub.titlebar.action.e;
import com.taobao.themis.utils.k;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpm;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J*\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007Jk\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010\u001fJ;\u0010 \u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0002\u0010$J\u0012\u0010%\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u001e\u0010&\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0004H\u0007J*\u0010(\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006*"}, d2 = {"Lcom/taobao/themis/ability_taobao/TMSTitleBarBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "getActionLocationAndSize", "Lcom/alibaba/fastjson/JSONObject;", "titleBar", "Lcom/taobao/themis/kernel/container/ui/titlebar/ITitleBar;", "actionView", "Landroid/view/View;", "hideBackButton", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "hideNavigatorBar", "animationType", "", "animation", "onFinalized", "", "onInitialized", "resetIndexBadge", "scaleIndexBadge", "setNavigationBarStyle", "backgroundColor", "backgroundBg", "barTextStyle", "title", "image", "borderBottomColor", DMComponent.RESET, "", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "setRightItem", "icon", "event", "hidden", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "showBackButton", "showGlobalMenu", "itemConfig", "showNavigatorBar", "Companion", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTitleBarBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22309a;
        public final /* synthetic */ ITMSPage b;

        public b(String str, ITMSPage iTMSPage) {
            this.f22309a = str;
            this.b = iTMSPage;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String str = this.f22309a;
            if (str == null) {
                return;
            }
            this.b.a(str, new JSONObject());
        }
    }

    static {
        kge.a(-576084088);
        kge.a(-86622547);
        Companion = new a(null);
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

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse hideNavigatorBar(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"animationType"}) String str, @BindingParam(name = {"animation"}) String str2) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        NavigatorBarAnimType navigatorBarAnimType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("94072526", new Object[]{this, apiContext, str, str2});
        }
        q.d(apiContext, "apiContext");
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        if (!(d instanceof ITMSPage)) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        qpm f = d.f();
        if (f == null || (titleBar = f.getTitleBar()) == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        if (q.a((Object) "true", (Object) str2)) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode == 92909918) {
                    if (str.equals("alpha")) {
                        navigatorBarAnimType = NavigatorBarAnimType.ALPHA;
                    }
                } else if (hashCode == 1052832078 && str.equals("translate")) {
                    navigatorBarAnimType = NavigatorBarAnimType.TRANS;
                }
            }
            navigatorBarAnimType = NavigatorBarAnimType.OTHER;
        } else {
            navigatorBarAnimType = NavigatorBarAnimType.NULL;
        }
        if (titleBar.hideTitleBar(navigatorBarAnimType)) {
            BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
            q.b(bridgeResponse4, "BridgeResponse.SUCCESS");
            return bridgeResponse4;
        }
        BridgeResponse bridgeResponse5 = BridgeResponse.FORBIDDEN_ERROR;
        q.b(bridgeResponse5, "BridgeResponse.FORBIDDEN_ERROR");
        return bridgeResponse5;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse showNavigatorBar(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"animationType"}) String str, @BindingParam(name = {"animation"}) String str2) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        NavigatorBarAnimType navigatorBarAnimType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("7aea7161", new Object[]{this, apiContext, str, str2});
        }
        q.d(apiContext, "apiContext");
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        if (!(d instanceof ITMSPage)) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        qpm f = d.f();
        if (f == null || (titleBar = f.getTitleBar()) == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        if (q.a((Object) "true", (Object) str2)) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode == 92909918) {
                    if (str.equals("alpha")) {
                        navigatorBarAnimType = NavigatorBarAnimType.ALPHA;
                    }
                } else if (hashCode == 1052832078 && str.equals("translate")) {
                    navigatorBarAnimType = NavigatorBarAnimType.TRANS;
                }
            }
            navigatorBarAnimType = NavigatorBarAnimType.OTHER;
        } else {
            navigatorBarAnimType = NavigatorBarAnimType.NULL;
        }
        if (titleBar.showTitleBar(navigatorBarAnimType)) {
            BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
            q.b(bridgeResponse4, "BridgeResponse.SUCCESS");
            return bridgeResponse4;
        }
        BridgeResponse bridgeResponse5 = BridgeResponse.FORBIDDEN_ERROR;
        q.b(bridgeResponse5, "BridgeResponse.FORBIDDEN_ERROR");
        return bridgeResponse5;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse showBackButton(@BindingApiContext ApiContext apiContext) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("e075214a", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        if (!(d instanceof ITMSPage)) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        qpm f = d.f();
        if (f == null || (titleBar = f.getTitleBar()) == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        com.taobao.themis.container.title.action.base.b bVar = (com.taobao.themis.container.title.action.base.b) titleBar.getAction(com.taobao.themis.container.title.action.base.b.class);
        if (bVar != null) {
            z = bVar.b();
        }
        if (z) {
            BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
            q.b(bridgeResponse4, "BridgeResponse.SUCCESS");
            return bridgeResponse4;
        }
        BridgeResponse bridgeResponse5 = BridgeResponse.FORBIDDEN_ERROR;
        q.b(bridgeResponse5, "BridgeResponse.FORBIDDEN_ERROR");
        return bridgeResponse5;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse hideBackButton(@BindingApiContext ApiContext apiContext) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("fa8a0cf", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        if (!(d instanceof ITMSPage)) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        qpm f = d.f();
        if (f == null || (titleBar = f.getTitleBar()) == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        com.taobao.themis.container.title.action.base.b bVar = (com.taobao.themis.container.title.action.base.b) titleBar.getAction(com.taobao.themis.container.title.action.base.b.class);
        if (bVar != null) {
            z = bVar.a();
        }
        if (z) {
            BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
            q.b(bridgeResponse4, "BridgeResponse.SUCCESS");
            return bridgeResponse4;
        }
        BridgeResponse bridgeResponse5 = BridgeResponse.FORBIDDEN_ERROR;
        q.b(bridgeResponse5, "BridgeResponse.FORBIDDEN_ERROR");
        return bridgeResponse5;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse scaleIndexBadge(@BindingApiContext ApiContext apiContext) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("d6a489cf", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        if (!(d instanceof ITMSPage)) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        qpm f = d.f();
        if (f == null || (titleBar = f.getTitleBar()) == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        } else if (((d) titleBar.getAction(d.class)) == null) {
            BridgeResponse bridgeResponse4 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse4, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse4;
        } else {
            BridgeResponse bridgeResponse5 = BridgeResponse.SUCCESS;
            q.b(bridgeResponse5, "BridgeResponse.SUCCESS");
            return bridgeResponse5;
        }
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse resetIndexBadge(@BindingApiContext ApiContext apiContext) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("4a4d8b14", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        if (!(d instanceof ITMSPage)) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        qpm f = d.f();
        if (f == null || (titleBar = f.getTitleBar()) == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        } else if (((d) titleBar.getAction(d.class)) == null) {
            BridgeResponse bridgeResponse4 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse4, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse4;
        } else {
            BridgeResponse bridgeResponse5 = BridgeResponse.SUCCESS;
            q.b(bridgeResponse5, "BridgeResponse.SUCCESS");
            return bridgeResponse5;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.alibaba.fastjson.JSONObject] */
    @ThreadType(ExecutorType.IO)
    @AutoCallback
    @APIMethod
    public final BridgeResponse setRightItem(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"icon"}) String str, @BindingParam(name = {"event"}) String str2, @BindingParam(name = {"hidden"}) Boolean bool) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("15beac38", new Object[]{this, apiContext, str, str2, bool});
        }
        q.d(apiContext, "apiContext");
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        qpm f = d.f();
        if (f == null || (titleBar = f.getTitleBar()) == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        e eVar = (e) titleBar.getAction(e.class);
        if (q.a((Object) bool, (Object) true)) {
            if (eVar == null) {
                BridgeResponse bridgeResponse3 = BridgeResponse.INVALID_PARAM;
                q.b(bridgeResponse3, "BridgeResponse.INVALID_PARAM");
                return bridgeResponse3;
            }
            com.taobao.themis.kernel.utils.a.a(new TMSTitleBarBridge$setRightItem$1(eVar));
            BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
            q.b(bridgeResponse4, "BridgeResponse.SUCCESS");
            return bridgeResponse4;
        } else if (eVar == null && TextUtils.isEmpty(str)) {
            BridgeResponse bridgeResponse5 = BridgeResponse.INVALID_PARAM;
            q.b(bridgeResponse5, "BridgeResponse.INVALID_PARAM");
            return bridgeResponse5;
        } else {
            com.taobao.themis.kernel.utils.a.a(new TMSTitleBarBridge$setRightItem$2(eVar));
            b bVar = new b(str2, d);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (JSONObject) 0;
            try {
                com.taobao.themis.kernel.utils.a.a(new TMSTitleBarBridge$setRightItem$3(this, titleBar, objectRef, d, countDownLatch, str, bVar));
            } catch (Throwable th) {
                TMSLogger.b("TMSTitleBarBridge", th.getMessage(), th);
                countDownLatch.countDown();
            }
            try {
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                TMSLogger.b("TMSTitleBarBridge", th2.getMessage(), th2);
            }
            if (((JSONObject) objectRef.element) == null) {
                BridgeResponse bridgeResponse6 = BridgeResponse.SUCCESS;
                q.b(bridgeResponse6, "BridgeResponse.SUCCESS");
                return bridgeResponse6;
            }
            BridgeResponse.NamedValue newValue = BridgeResponse.newValue("frame", (JSONObject) objectRef.element);
            q.b(newValue, "BridgeResponse.newValue(\"frame\", frame)");
            return newValue;
        }
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse showGlobalMenu(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"itemConfig"}) JSONObject jSONObject) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("d5a1fa3d", new Object[]{this, apiContext, jSONObject});
        }
        q.d(apiContext, "apiContext");
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        if (!(d instanceof ITMSPage)) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        qpm f = d.f();
        if (f == null || (titleBar = f.getTitleBar()) == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        IMenuAction iMenuAction = (IMenuAction) titleBar.getAction(IMenuAction.class);
        if (iMenuAction == null) {
            BridgeResponse bridgeResponse4 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse4, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse4;
        }
        iMenuAction.a();
        BridgeResponse bridgeResponse5 = BridgeResponse.SUCCESS;
        q.b(bridgeResponse5, "BridgeResponse.SUCCESS");
        return bridgeResponse5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0149, code lost:
        if (r9.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_white) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0153, code lost:
        if (r9.equals("light") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
        r1 = com.taobao.themis.kernel.container.Window.Theme.LIGHT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015e, code lost:
        if (r9.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_black) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0167, code lost:
        if (r9.equals("dark") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
        r1 = com.taobao.themis.kernel.container.Window.Theme.DARK;
     */
    @com.taobao.themis.kernel.ability.base.annotation.ThreadType(com.taobao.themis.kernel.executor.ExecutorType.UI)
    @com.taobao.themis.kernel.ability.base.annotation.AutoCallback
    @com.taobao.themis.kernel.ability.base.annotation.APIMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse setNavigationBarStyle(@com.taobao.themis.kernel.ability.base.annotation.BindingApiContext com.taobao.themis.kernel.ability.base.ApiContext r6, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"backgroundColor"}) java.lang.String r7, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"backgroundBg"}) java.lang.String r8, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"barTextStyle"}) java.lang.String r9, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"title"}, stringDefault = "notSetTitle") java.lang.String r10, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"image"}) java.lang.String r11, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"borderBottomColor"}) java.lang.String r12, @com.taobao.themis.kernel.ability.base.annotation.BindingParam(name = {"reset"}) java.lang.Boolean r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability_taobao.TMSTitleBarBridge.setNavigationBarStyle(com.taobao.themis.kernel.ability.base.ApiContext, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse");
    }

    private final JSONObject a(com.taobao.themis.kernel.container.ui.titlebar.b bVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a3ad141a", new Object[]{this, bVar, view});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (!bVar.mo1497isTranslucent()) {
            int i = iArr[1];
            View contentView = bVar.getContentView();
            iArr[1] = i - (contentView != null ? contentView.getHeight() : 0);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "x", (String) Integer.valueOf(k.a(view.getContext(), iArr[0])));
        jSONObject2.put((JSONObject) "y", (String) Integer.valueOf(k.a(view.getContext(), iArr[1])));
        jSONObject2.put((JSONObject) "width", (String) Integer.valueOf(k.a(view.getContext(), view.getWidth())));
        jSONObject2.put((JSONObject) "height", (String) Integer.valueOf(k.a(view.getContext(), view.getHeight())));
        return jSONObject;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/ability_taobao/TMSTitleBarBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1712572624);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
