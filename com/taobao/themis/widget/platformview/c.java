package com.taobao.themis.widget.platformview;

import android.content.Context;
import android.view.View;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.e;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010&\u001a\u00020\u001aH\u0016J\b\u0010'\u001a\u00020\u001aH\u0002J\u0012\u0010(\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010\u00112\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u000fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/taobao/themis/widget/platformview/TMSBasePlatformView;", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "Lcom/taobao/themis/widget/platformview/IEmbedPlatformView;", "context", "Landroid/content/Context;", "mId", "", "mEmbedView", "Lcom/alibaba/ariver/integration/embedview/BaseEmbedView;", com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.VIEW_TYPE, "", "(Landroid/content/Context;ILcom/alibaba/ariver/integration/embedview/BaseEmbedView;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "mJSEventDelegate", "Lcom/taobao/themis/widget/platformview/JSEventDelegate;", "mRenderParams", "Lcom/alibaba/fastjson/JSONObject;", "mRootView", "Lcom/taobao/themis/widget/platformview/TMSWidgetEmbedInnerFrameLayout;", "kotlin.jvm.PlatformType", "getMRootView", "()Lcom/taobao/themis/widget/platformview/TMSWidgetEmbedInnerFrameLayout;", "mRootView$delegate", "Lkotlin/Lazy;", "createEmbedView", "", "destroy", "getView", "Landroid/view/View;", "onAttach", "instance", "Lcom/taobao/android/weex_framework/MUSDKInstance;", "onBindData", "attrs", "onReceivedMessage", "action", "param", "reload", "renderEmbedView", "sendBridgeResponse", InputFrame3.TYPE_RESPONSE, "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "sendJSONResponse", "jsonObject", "keepCallback", "", "setJSEventDelegate", "delegate", "Companion", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public class c implements BridgeCallback, com.taobao.themis.widget.platformview.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "TMSBasePlatformView";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f22948a;
    private b b;
    private final kotlin.d c;
    private final Context d;
    private final int e;
    private final BaseEmbedView f;
    private final String g;

    static {
        kge.a(-1075763231);
        kge.a(-1724227419);
        kge.a(2003703434);
        Companion = new a(null);
    }

    private final TMSWidgetEmbedInnerFrameLayout b() {
        IpChange ipChange = $ipChange;
        return (TMSWidgetEmbedInnerFrameLayout) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6db3cb5e", new Object[]{this}) : this.c.getValue());
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendBridgeResponse(BridgeResponse bridgeResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9dfe87", new Object[]{this, bridgeResponse});
        }
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3456c918", new Object[]{this, jSONObject});
        }
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56830cbc", new Object[]{this, jSONObject, new Boolean(z)});
        }
    }

    public c(Context context, int i, BaseEmbedView baseEmbedView, String viewType) {
        q.d(context, "context");
        q.d(viewType, "viewType");
        this.d = context;
        this.e = i;
        this.f = baseEmbedView;
        this.g = viewType;
        this.f22948a = new JSONObject();
        this.c = e.a(new TMSBasePlatformView$mRootView$2(this));
    }

    public final Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/widget/platformview/TMSBasePlatformView$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1282239977);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.themis.widget.platformview.a
    public void onAttach(MUSDKInstance instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36039cb", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        d();
    }

    @Override // com.taobao.themis.widget.platformview.a
    public void onBindData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1fda83", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.f22948a.putAll(jSONObject);
            c();
        }
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (this.f == null) {
                TMSLogger.d(TAG, "embedView created failed! cannot do render");
                return;
            }
            BaseEmbedView baseEmbedView = this.f;
            TMSWidgetEmbedInnerFrameLayout mRootView = b();
            q.b(mRootView, "mRootView");
            int width = mRootView.getWidth();
            TMSWidgetEmbedInnerFrameLayout mRootView2 = b();
            q.b(mRootView2, "mRootView");
            View view = baseEmbedView.getView(width, mRootView2.getHeight(), String.valueOf(this.e), this.g, new HashMap());
            if (view == null) {
                return;
            }
            b().removeAllViews();
            b().addView(view);
            BaseEmbedView baseEmbedView2 = this.f;
            q.a(baseEmbedView2);
            baseEmbedView2.onReceivedRender(this.f22948a, this);
        } catch (Throwable th) {
            TMSLogger.b(TAG, "", th);
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            BaseEmbedView baseEmbedView = this.f;
            if (baseEmbedView == null) {
                return;
            }
            baseEmbedView.onCreate(ai.a());
        } catch (Throwable th) {
            TMSLogger.b(TAG, "", th);
        }
    }

    @Override // com.taobao.themis.widget.platformview.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        BaseEmbedView baseEmbedView = this.f;
        if (baseEmbedView == null) {
            return;
        }
        baseEmbedView.onDestroy();
    }

    @Override // com.taobao.themis.widget.platformview.a
    public void onReceivedMessage(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a306b98", new Object[]{this, str, jSONObject});
            return;
        }
        BaseEmbedView baseEmbedView = this.f;
        if (baseEmbedView == null) {
            TMSLogger.d(TAG, "onReceivedMessage but embedView is null");
        } else {
            baseEmbedView.onReceivedMessage(str, jSONObject, this);
        }
    }

    @Override // com.taobao.themis.widget.platformview.a
    public void setJSEventDelegate(b delegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9e4446", new Object[]{this, delegate});
            return;
        }
        q.d(delegate, "delegate");
        this.b = delegate;
    }

    @Override // com.taobao.themis.widget.platformview.a
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        TMSWidgetEmbedInnerFrameLayout mRootView = b();
        q.b(mRootView, "mRootView");
        return mRootView;
    }
}
