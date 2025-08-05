package com.taobao.themis.ability_taobao;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub.titlebar.PubTitleBar;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.PubIconChangeGuide;
import com.taobao.themis.pub_kit.guide.i;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.utils.n;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qqc;
import tb.qrc;
import tb.qrd;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u001c\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J(\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u001c\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u001c\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\nH\u0007J*\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0007JE\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0007¨\u0006\u001e"}, d2 = {"Lcom/taobao/themis/ability_taobao/TMSPubBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "checkAddIconButton", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "checkMiniProgramFollowStatus", "", "callback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "checkTinyAppPermission", "apiName", "", "followMiniProgram", "hideAddIconButton", "onFinalized", "onInitialized", "showActiveReplacePopup", "bridgeCallback", "showAddIconGuideTips", "title", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "showICONChangeGuide", "guideType", "", "strongGuidePopTitle", "strongGuidePopDesc", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "unFollowMiniProgram", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSPubBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/themis/ability_taobao/TMSPubBridge$showActiveReplacePopup$2", "Lcom/taobao/themis/pub_kit/task/PubContainerConfigTask$PubContainerConfigTaskListener;", "onResult", "", "result", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements qrd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f22306a;
        public final /* synthetic */ BridgeCallback b;

        public c(ITMSPage iTMSPage, BridgeCallback bridgeCallback) {
            this.f22306a = iTMSPage;
            this.b = bridgeCallback;
        }

        @Override // tb.qrd.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule == null) {
                this.b.sendBridgeResponse(BridgeResponse.newError(100, "不支持添加到首页"));
            } else {
                Activity o = this.f22306a.b().o();
                q.b(o, "page.getInstance().activity");
                new i(o, pubUserGuideModule, null, 4, null).a();
                this.b.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    static {
        kge.a(-1181624094);
        kge.a(-86622547);
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void showICONChangeGuide(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback callback, @BindingParam(name = {"guideType"}) Integer num, @BindingParam(name = {"strongGuidePopTitle"}) String str, @BindingParam(name = {"strongGuidePopDesc"}) String str2) {
        qpm f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e423e9", new Object[]{this, apiContext, callback, num, str, str2});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        f c2 = apiContext.c();
        if (!(c2 instanceof f)) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (num == null) {
            callback.sendBridgeResponse(BridgeResponse.newError(2, "guideType null"));
        } else {
            ITMSPage c3 = c2.b().c();
            com.taobao.themis.kernel.container.ui.titlebar.b titleBar = (c3 == null || (f = c3.f()) == null) ? null : f.getTitleBar();
            if (!(titleBar instanceof PubTitleBar)) {
                callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                return;
            }
            PubIconChangeGuide.b showIconChangeStrongGuide = ((PubTitleBar) titleBar).showIconChangeStrongGuide(num.intValue(), str, str2);
            if (showIconChangeStrongGuide.a() == 0) {
                callback.sendBridgeResponse(BridgeResponse.SUCCESS);
            } else {
                callback.sendBridgeResponse(BridgeResponse.newError(showIconChangeStrongGuide.a(), showIconChangeStrongGuide.b()));
            }
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void followMiniProgram(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1506a23c", new Object[]{this, apiContext, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        f c2 = apiContext.c();
        if (!(c2 instanceof f)) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            com.taobao.themis.pub_kit.favor.a.a(c2.h(), n.a(c2.o(), c2.g()), false, new a(c2, callback));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/taobao/themis/ability_taobao/TMSPubBridge$followMiniProgram$1", "Lcom/taobao/themis/kernel/network/CommonListener;", "", "onFailure", "", "errorCode", "", "errorMsg", InputFrame3.TYPE_RESPONSE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "onSuccess", "(Ljava/lang/Boolean;)V", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements com.taobao.themis.kernel.network.b<Boolean, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f22304a;
        public final /* synthetic */ BridgeCallback b;

        public a(f fVar, BridgeCallback bridgeCallback) {
            this.f22304a = fVar;
            this.b = bridgeCallback;
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onFailure(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec067822", new Object[]{this, str, str2, bool});
            } else {
                a(str, str2, bool);
            }
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onSuccess(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, bool});
            } else {
                a(bool);
            }
        }

        public void a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                return;
            }
            com.taobao.themis.pub_kit.favor.a.a(this.f22304a.h(), (Boolean) true, (Context) this.f22304a.o());
            this.b.sendBridgeResponse(BridgeResponse.SUCCESS);
        }

        public void a(String errorCode, String errorMsg, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9fef851", new Object[]{this, errorCode, errorMsg, bool});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            try {
                this.b.sendBridgeResponse(BridgeResponse.newError(Integer.parseInt(errorCode), errorMsg));
            } catch (NumberFormatException unused) {
                this.b.sendBridgeResponse(BridgeResponse.newError(5, errorMsg));
            }
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void unFollowMiniProgram(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c9f635", new Object[]{this, apiContext, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        f c2 = apiContext.c();
        if (!(c2 instanceof f)) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            com.taobao.themis.pub_kit.favor.a.b(c2.h(), n.a(c2.o(), c2.g()), false, new b(c2, callback));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/taobao/themis/ability_taobao/TMSPubBridge$unFollowMiniProgram$1", "Lcom/taobao/themis/kernel/network/CommonListener;", "", "onFailure", "", "errorCode", "", "errorMsg", InputFrame3.TYPE_RESPONSE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "onSuccess", "(Ljava/lang/Boolean;)V", "themis_ability_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements com.taobao.themis.kernel.network.b<Boolean, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f22305a;
        public final /* synthetic */ BridgeCallback b;

        public b(f fVar, BridgeCallback bridgeCallback) {
            this.f22305a = fVar;
            this.b = bridgeCallback;
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onFailure(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec067822", new Object[]{this, str, str2, bool});
            } else {
                a(str, str2, bool);
            }
        }

        @Override // com.taobao.themis.kernel.network.b
        public /* synthetic */ void onSuccess(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, bool});
            } else {
                a(bool);
            }
        }

        public void a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                return;
            }
            com.taobao.themis.pub_kit.favor.a.a(this.f22305a.h(), (Boolean) false, (Context) this.f22305a.o());
            this.b.sendBridgeResponse(BridgeResponse.SUCCESS);
        }

        public void a(String errorCode, String errorMsg, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9fef851", new Object[]{this, errorCode, errorMsg, bool});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            try {
                this.b.sendBridgeResponse(BridgeResponse.newError(Integer.parseInt(errorCode), errorMsg));
            } catch (NumberFormatException unused) {
                this.b.sendBridgeResponse(BridgeResponse.newError(5, errorMsg));
            }
        }
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void checkMiniProgramFollowStatus(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00cfd0", new Object[]{this, apiContext, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        f c2 = apiContext.c();
        if (!(c2 instanceof f)) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else if (com.taobao.themis.pub_kit.favor.a.a(c2.h())) {
            callback.sendBridgeResponse(BridgeResponse.newValue("isFollowed", true));
        } else {
            callback.sendBridgeResponse(BridgeResponse.newValue("isFollowed", false));
        }
    }

    @ThreadType(ExecutorType.IDLE)
    @APIMethod
    public final void checkTinyAppPermission(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apiName"}) String str, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc6cfe6", new Object[]{this, apiContext, str, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        f c2 = apiContext.c();
        if (c2 == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            com.taobao.themis.ability_taobao.b.a(c2, callback, str);
        }
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse showAddIconGuideTips(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"subTitle"}) String str2) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("80453f5f", new Object[]{this, apiContext, str, str2});
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
        com.taobao.themis.pub.titlebar.action.a aVar = (com.taobao.themis.pub.titlebar.action.a) titleBar.getAction(com.taobao.themis.pub.titlebar.action.a.class);
        if (aVar == null) {
            BridgeResponse.Error newError = BridgeResponse.newError(100, "无添加上Icon按钮");
            q.b(newError, "BridgeResponse.newError(100, \"无添加上Icon按钮\")");
            return newError;
        }
        PubContainerContext pubContainerContext = (PubContainerContext) d.b().a(PubContainerContext.class);
        if (pubContainerContext == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.UNKNOWN_ERROR;
            q.b(bridgeResponse3, "BridgeResponse.UNKNOWN_ERROR");
            return bridgeResponse3;
        }
        q.b(pubContainerContext, "page.getInstance().getDa…dgeResponse.UNKNOWN_ERROR");
        PubAddIconGuide pubAddIconGuide = pubContainerContext.getPubAddIconGuide();
        if (pubAddIconGuide == null) {
            BridgeResponse.Error newError2 = BridgeResponse.newError(102, "无法展示添加上Icon引导");
            q.b(newError2, "BridgeResponse.newError(102, \"无法展示添加上Icon引导\")");
            return newError2;
        }
        String userId = ((IAccountAdapter) qpt.a(IAccountAdapter.class)).getUserId(d.b());
        if (userId == null) {
            BridgeResponse.Error newError3 = BridgeResponse.newError(101, "用户未登录");
            q.b(newError3, "BridgeResponse.newError(101, \"用户未登录\")");
            return newError3;
        }
        String h = d.b().h();
        q.b(h, "page.getInstance().appId");
        if (!pubAddIconGuide.a(h, userId)) {
            BridgeResponse.Error newError4 = BridgeResponse.newError(102, "无法展示添加上Icon引导");
            q.b(newError4, "BridgeResponse.newError(102, \"无法展示添加上Icon引导\")");
            return newError4;
        }
        Activity o = d.b().o();
        q.b(o, "page.getInstance().activity");
        View a2 = aVar.a(o);
        PubAddIconGuide.PubAddIconGuideType pubAddIconGuideType = PubAddIconGuide.PubAddIconGuideType.DETAIL_FAVOR_TIPS;
        String h2 = d.b().h();
        q.b(h2, "page.getInstance().appId");
        if (pubAddIconGuide.a(a2, pubAddIconGuideType, h2, userId, str, str2)) {
            PubContainerContext pubContainerContext2 = (PubContainerContext) d.b().a(PubContainerContext.class);
            if (pubContainerContext2 != null) {
                pubContainerContext2.setAddIconGuideIsShowing(true);
            }
            BridgeResponse bridgeResponse4 = BridgeResponse.SUCCESS;
            q.b(bridgeResponse4, "BridgeResponse.SUCCESS");
            return bridgeResponse4;
        }
        BridgeResponse bridgeResponse5 = BridgeResponse.UNKNOWN_ERROR;
        q.b(bridgeResponse5, "BridgeResponse.UNKNOWN_ERROR");
        return bridgeResponse5;
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse hideAddIconButton(@BindingApiContext ApiContext apiContext) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("fce22fde", new Object[]{this, apiContext});
        }
        q.d(apiContext, "apiContext");
        ITMSPage d = apiContext.d();
        if (d == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        q.b(d, "apiContext.invokePage ?:…eResponse.FORBIDDEN_ERROR");
        if (qqc.a(d)) {
            BridgeResponse.Error newError = BridgeResponse.newError(103, "首页不支持隐藏添加上Icon按钮");
            q.b(newError, "BridgeResponse.newError(103, \"首页不支持隐藏添加上Icon按钮\")");
            return newError;
        }
        qpm f = d.f();
        if (f == null || (titleBar = f.getTitleBar()) == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            q.b(bridgeResponse2, "BridgeResponse.FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        com.taobao.themis.pub.titlebar.action.a aVar = (com.taobao.themis.pub.titlebar.action.a) titleBar.getAction(com.taobao.themis.pub.titlebar.action.a.class);
        if (aVar == null) {
            BridgeResponse.Error newError2 = BridgeResponse.newError(100, "无添加上Icon按钮");
            q.b(newError2, "BridgeResponse.newError(100, \"无添加上Icon按钮\")");
            return newError2;
        }
        titleBar.removeAction(aVar);
        BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
        q.b(bridgeResponse3, "BridgeResponse.SUCCESS");
        return bridgeResponse3;
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse checkAddIconButton(@BindingApiContext ApiContext apiContext) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        BridgeResponse.NamedValue newValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("3f4680d8", new Object[]{this, apiContext});
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
        } else if (((IAccountAdapter) qpt.a(IAccountAdapter.class)).getUserId(d.b()) == null) {
            BridgeResponse.Error newError = BridgeResponse.newError(101, "用户未登录");
            q.b(newError, "BridgeResponse.newError(101, \"用户未登录\")");
            return newError;
        } else if (((com.taobao.themis.pub.titlebar.action.a) titleBar.getAction(com.taobao.themis.pub.titlebar.action.a.class)) != null && (newValue = BridgeResponse.newValue("isShowing", true)) != null) {
            return newValue;
        } else {
            BridgeResponse.NamedValue newValue2 = BridgeResponse.newValue("isShowing", false);
            q.b(newValue2, "BridgeResponse.newValue(\"isShowing\", false)");
            return newValue2;
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void showActiveReplacePopup(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f100eafd", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        ITMSPage d = apiContext.d();
        if (d != null) {
            q.b(d, "apiContext.invokePage ?:…         return\n        }");
            qpm f = d.f();
            if (f == null || (titleBar = f.getTitleBar()) == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                return;
            } else if (((com.taobao.themis.pub.titlebar.action.a) titleBar.getAction(com.taobao.themis.pub.titlebar.action.a.class)) == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.newError(100, "不支持添加到首页"));
                return;
            } else {
                qrc.a(d.b(), new c(d, bridgeCallback));
                return;
            }
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        } else {
            com.taobao.themis.ability_taobao.b.a();
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        } else {
            com.taobao.themis.ability_taobao.b.a();
        }
    }
}
