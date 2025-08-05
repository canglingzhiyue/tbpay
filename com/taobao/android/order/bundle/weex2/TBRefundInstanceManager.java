package com.taobao.android.order.bundle.weex2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.j;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.d;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.adh;
import tb.alz;
import tb.cup;
import tb.eau;
import tb.eby;
import tb.ifn;
import tb.iro;
import tb.jqg;
import tb.kge;
import tb.ljl;
import tb.riy;
import tb.spk;
import tb.tbt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001BB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0002J8\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010\u00042\b\u0010:\u001a\u0004\u0018\u00010\u00042\u0010\u0010;\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010<H\u0007J\b\u0010=\u001a\u000206H\u0003J&\u0010>\u001a\u0002062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00101\u001a\u0002022\u0006\u0010?\u001a\u00020#J*\u0010@\u001a\u00020#2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u00101\u001a\u000202H\u0007J\b\u0010A\u001a\u000206H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR!\u0010\u0010\u001a\u00020\f8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u000eR$\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u000e¨\u0006C"}, d2 = {"Lcom/taobao/android/order/bundle/weex2/TBRefundInstanceManager;", "", "()V", "PREFETCH_CODE", "", RPCDataItems.SWITCH_TAG_LOG, "defaultRefundUrl", "getDefaultRefundUrl", "()Ljava/lang/String;", "defaultRefundUrl$delegate", "Lkotlin/Lazy;", "enableImagePrefetch", "", "getEnableImagePrefetch", "()Z", "enableImagePrefetch$delegate", "enablePreRequest", "getEnablePreRequest$annotations", "getEnablePreRequest", "enablePreRequest$delegate", "isNetStart", "isNetStart$annotations", "setNetStart", "(Z)V", "netStartTime", "getNetStartTime", "setNetStartTime", "(Ljava/lang/String;)V", "refundResponseData", "Lcom/alibaba/fastjson/JSONObject;", "getRefundResponseData", "()Lcom/alibaba/fastjson/JSONObject;", "setRefundResponseData", "(Lcom/alibaba/fastjson/JSONObject;)V", "temporaryInstance", "Lcom/taobao/android/weex_framework/MUSInstance;", "getTemporaryInstance", "()Lcom/taobao/android/weex_framework/MUSInstance;", "setTemporaryInstance", "(Lcom/taobao/android/weex_framework/MUSInstance;)V", "useSurfaceView", "getUseSurfaceView$annotations", "getUseSurfaceView", "createNewInstance", "context", "Landroid/content/Context;", "rootView", "Landroid/view/ViewGroup;", "refundUrl", "refundParams", "Lcom/taobao/android/order/bundle/weex2/TBRefundInstanceManager$RefundParams;", "decideUrl", eby.KEY_PIC_URL, "hybridStage", "", "activity", "Landroid/app/Activity;", "stage", TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, "params", "", "prefetchImage", "prepareReloadInstance", "instance", "refundWeex2PreRender", "startPreRequestOnIdle", "RefundParams", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public final class TBRefundInstanceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final TBRefundInstanceManager INSTANCE;
    private static final String PREFETCH_CODE = "refundPrefetch";
    private static final String TAG = "TBRefundInstanceManager";
    private static final d defaultRefundUrl$delegate;
    private static final d enableImagePrefetch$delegate;
    private static final d enablePreRequest$delegate;
    private static boolean isNetStart;
    private static String netStartTime;
    private static JSONObject refundResponseData;
    private static p temporaryInstance;
    private static final boolean useSurfaceView;

    private final String getDefaultRefundUrl() {
        IpChange ipChange = $ipChange;
        return (String) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("63f0496d", new Object[]{this}) : defaultRefundUrl$delegate.getValue());
    }

    private final boolean getEnableImagePrefetch() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("847ed884", new Object[]{this}) : enableImagePrefetch$delegate.getValue())).booleanValue();
    }

    public static final boolean getEnablePreRequest() {
        IpChange ipChange = $ipChange;
        return ((Boolean) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("e5e5e5d0", new Object[0]) : enablePreRequest$delegate.getValue())).booleanValue();
    }

    @JvmStatic
    public static /* synthetic */ void getEnablePreRequest$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a3a2cc", new Object[0]);
        }
    }

    @JvmStatic
    public static /* synthetic */ void getUseSurfaceView$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6960e8", new Object[0]);
        }
    }

    @JvmStatic
    public static /* synthetic */ void isNetStart$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf04f16", new Object[0]);
        }
    }

    static {
        kge.a(1990160795);
        INSTANCE = new TBRefundInstanceManager();
        defaultRefundUrl$delegate = kotlin.e.a(TBRefundInstanceManager$defaultRefundUrl$2.INSTANCE);
        if (spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableRegisterPreRequestCallback", true)) {
            com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a a2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a();
            q.b(a2, "UltronTradeHybridManager.getInstance()");
            a2.h().a(new com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a() { // from class: com.taobao.android.order.bundle.weex2.TBRefundInstanceManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a
                public void a(String p0, String p1) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("d9378d7c", new Object[]{this, p0, p1});
                        return;
                    }
                    q.d(p0, "p0");
                    q.d(p1, "p1");
                }

                @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a
                public void a(JSONObject p0) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("266fb88", new Object[]{this, p0});
                        return;
                    }
                    q.d(p0, "p0");
                    if (!q.a((Object) "mtop.com.alibaba.refundface2.disputeservice.renderlist.noultron", (Object) p0.getString("url"))) {
                        return;
                    }
                    TBRefundInstanceManager.access$prefetchImage(TBRefundInstanceManager.INSTANCE);
                }
            });
        }
        useSurfaceView = cup.Companion.a();
        enablePreRequest$delegate = kotlin.e.a(TBRefundInstanceManager$enablePreRequest$2.INSTANCE);
        enableImagePrefetch$delegate = kotlin.e.a(TBRefundInstanceManager$enableImagePrefetch$2.INSTANCE);
    }

    private TBRefundInstanceManager() {
    }

    public static final /* synthetic */ void access$prefetchImage(TBRefundInstanceManager tBRefundInstanceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d804143b", new Object[]{tBRefundInstanceManager});
        } else {
            tBRefundInstanceManager.prefetchImage();
        }
    }

    public static final boolean getUseSurfaceView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("75a2edec", new Object[0])).booleanValue() : useSurfaceView;
    }

    @TradeHybridCustomAnnotation
    @JvmStatic
    public static final void hybridStage(Activity activity, String str, String str2, Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f70396", new Object[]{activity, str, str2, map});
        } else if (!spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableHybridStage", true) || !adh.b(str, str2)) {
        } else {
            jqg.b(TAG, "hybridStage: " + str2 + '_' + str);
            if (activity == null || str2 == null || str == null) {
                return;
            }
            int hashCode = str2.hashCode();
            if (hashCode != -391817972) {
                if (hashCode != 120528346 || !str2.equals("mytaobao") || !q.a((Object) str, (Object) UltronTradeHybridStage.ON_CONTAINER_RESUME)) {
                    return;
                }
                INSTANCE.prefetchImage();
                com.alibaba.android.ultron.vfw.storage.b.INSTANCE.d("first_data", alz.BizKeyRefund);
            } else if (!str2.equals(alz.BizKeyOrderList) || !q.a((Object) str, (Object) UltronTradeHybridStage.ON_CONTAINER_DESTROY)) {
            } else {
                INSTANCE.prefetchImage();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ:\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0007\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/taobao/android/order/bundle/weex2/TBRefundInstanceManager$RefundParams;", "", "clickTime", "", "isFromWotao", "", "isFragment", "isListV4", "(Ljava/lang/String;ZZLjava/lang/Boolean;)V", "getClickTime", "()Ljava/lang/String;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ZZLjava/lang/Boolean;)Lcom/taobao/android/order/bundle/weex2/TBRefundInstanceManager$RefundParams;", eau.PARSER_TAG, "other", "hashCode", "", "toString", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f14579a;
        private final boolean b;
        private final boolean c;
        private final Boolean d;

        static {
            kge.a(-572404825);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!q.a((Object) this.f14579a, (Object) aVar.f14579a) || this.b != aVar.b || this.c != aVar.c || !q.a(this.d, aVar.d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f14579a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = (hashCode + i2) * 31;
            boolean z2 = this.c;
            if (z2) {
                z2 = true;
            }
            int i5 = z2 ? 1 : 0;
            int i6 = z2 ? 1 : 0;
            int i7 = (i4 + i5) * 31;
            Boolean bool = this.d;
            if (bool != null) {
                i = bool.hashCode();
            }
            return i7 + i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "RefundParams(clickTime=" + this.f14579a + ", isFromWotao=" + this.b + ", isFragment=" + this.c + ", isListV4=" + this.d + riy.BRACKET_END_STR;
        }

        public a(String str, boolean z, boolean z2, Boolean bool) {
            this.f14579a = str;
            this.b = z;
            this.c = z2;
            this.d = bool;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f14579a;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
        }

        public final Boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("3a0effa8", new Object[]{this}) : this.d;
        }
    }

    @JvmStatic
    public static final p refundWeex2PreRender(Context context, ViewGroup rootView, String str, a refundParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("efb5469c", new Object[]{context, rootView, str, refundParams});
        }
        q.d(context, "context");
        q.d(rootView, "rootView");
        q.d(refundParams, "refundParams");
        rootView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        TBRefundInstanceManager tBRefundInstanceManager = INSTANCE;
        if (str == null) {
            str = tBRefundInstanceManager.getDefaultRefundUrl();
        }
        return tBRefundInstanceManager.createNewInstance(context, rootView, str, refundParams);
    }

    public final void prepareReloadInstance(Context context, ViewGroup rootView, a refundParams, p instance) {
        SurfaceHolder holder;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a8d80f", new Object[]{this, context, rootView, refundParams, instance});
            return;
        }
        q.d(context, "context");
        q.d(rootView, "rootView");
        q.d(refundParams, "refundParams");
        q.d(instance, "instance");
        try {
            instance.resetContext(context);
            View renderRoot = instance.getRenderRoot();
            q.b(renderRoot, "instance.renderRoot");
            if (renderRoot.getParent() != null) {
                View renderRoot2 = instance.getRenderRoot();
                q.b(renderRoot2, "instance.renderRoot");
                ViewParent parent = renderRoot2.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(instance.getRenderRoot());
                }
            }
            rootView.addView(instance.getRenderRoot());
            if (useSurfaceView) {
                View renderView = instance.getRenderView();
                if (!(renderView instanceof SurfaceView)) {
                    renderView = null;
                }
                SurfaceView surfaceView = (SurfaceView) renderView;
                if (surfaceView != null) {
                    surfaceView.setZOrderMediaOverlay(true);
                }
                View renderView2 = instance.getRenderView();
                if (!(renderView2 instanceof SurfaceView)) {
                    renderView2 = null;
                }
                SurfaceView surfaceView2 = (SurfaceView) renderView2;
                if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
                    holder.setFormat(-3);
                }
            }
            jqg.b(TAG, "step3 : 有预热实例存在的情况，直接使用");
            JSONObject jSONObject = new JSONObject();
            if (getEnablePreRequest()) {
                String str = netStartTime;
                if (str != null) {
                    jSONObject.put((JSONObject) "netStartTime", str);
                }
                if (refundResponseData != null) {
                    isNetStart = false;
                    jqg.b(TAG, "step4 : 有预热实例存在的情况，路由请求已经回来了，传真实数据");
                    jSONObject.put((JSONObject) "dataType", "net");
                    jSONObject.put((JSONObject) ZimMessageChannel.K_RPC_RES, (String) refundResponseData);
                } else {
                    jqg.b(TAG, "step4 : 有预热实例存在的情况，路由请求没有回来，并且临时实例存起来");
                    if (!isNetStart) {
                        jSONObject.put((JSONObject) "dataType", "net");
                    } else {
                        temporaryInstance = instance;
                    }
                }
            }
            jSONObject.put((JSONObject) "jt_pt_navStartTime", refundParams.a());
            jSONObject.put((JSONObject) "isFragment", String.valueOf(refundParams.c()));
            String a2 = refundParams.a();
            if (a2 != null && a2.length() != 0) {
                z = false;
            }
            if (z) {
                jSONObject.put((JSONObject) "openFrom", "other");
            } else if (refundParams.b()) {
                jSONObject.put((JSONObject) "openFrom", "wotao");
            } else {
                jSONObject.put((JSONObject) "openFrom", "order");
            }
            instance.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.update", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final p createNewInstance(Context context, ViewGroup viewGroup, String str, a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("9c33ca75", new Object[]{this, context, viewGroup, str, aVar});
        }
        jqg.b(TAG, "step3 : 没有预热实例存在，新建");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        String a2 = aVar.a();
        if (a2 == null || a2.length() == 0) {
            buildUpon.appendQueryParameter("openFrom", "other");
        } else if (aVar.b()) {
            buildUpon.appendQueryParameter("openFrom", "wotao");
        } else {
            buildUpon.appendQueryParameter("openFrom", "order");
        }
        buildUpon.appendQueryParameter("prefetch", "true");
        buildUpon.appendQueryParameter("jt_pt_navStartTime", aVar.a());
        buildUpon.appendQueryParameter("isFragment", String.valueOf(aVar.c()));
        if (aVar.d() != null) {
            buildUpon.appendQueryParameter("disputeListNewStyle", String.valueOf(aVar.d().booleanValue()));
        }
        if (getEnablePreRequest() && isNetStart) {
            buildUpon.appendQueryParameter(tbt.PRE_REQUEST, "true");
        }
        String a3 = aVar.a();
        if (a3 != null && a3.length() != 0) {
            z = false;
        }
        if (z) {
            buildUpon.appendQueryParameter("openFrom", "other");
        }
        if (iro.c()) {
            buildUpon.appendQueryParameter("hitRefundDetailHybridContainer", "true");
        }
        String uri = buildUpon.build().toString();
        q.b(uri, "uriBuilder.build().toString()");
        p mRefundMUSInstance = com.alibaba.android.ultron.vfw.weex2.f.a().a(context, uri, useSurfaceView ? UltronTradeHybridInstanceRenderMode.SURFACE : UltronTradeHybridInstanceRenderMode.TEXTURE);
        mRefundMUSInstance.initWithURL(Uri.parse(uri));
        mRefundMUSInstance.setTag("bizLifecycleListener", new e(mRefundMUSInstance));
        mRefundMUSInstance.registerRenderListener(new c(viewGroup));
        mRefundMUSInstance.render(null, null);
        jqg.b(PREFETCH_CODE, "refundPrefetch success");
        q.b(mRefundMUSInstance, "mRefundMUSInstance");
        return mRefundMUSInstance;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/taobao/android/order/bundle/weex2/TBRefundInstanceManager$createNewInstance$listener$1", "Lcom/alibaba/android/ultron/vfw/weex2/UltronWeex2BizLifecycleListener;", "onBizFailed", "", "p0", "", p1.d, "onBizReady", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class e implements com.alibaba.android.ultron.vfw.weex2.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f14581a;

        @Override // com.alibaba.android.ultron.vfw.weex2.c
        public void onBizFailed(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1435fd2c", new Object[]{this, str, str2});
            }
        }

        public e(p pVar) {
            this.f14581a = pVar;
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.c
        public void onBizReady() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a730856", new Object[]{this});
            } else if (!TBRefundInstanceManager.getEnablePreRequest()) {
            } else {
                JSONObject jSONObject = new JSONObject();
                String netStartTime = TBRefundInstanceManager.INSTANCE.getNetStartTime();
                if (netStartTime != null) {
                    jSONObject.put((JSONObject) "netStartTime", netStartTime);
                }
                if (TBRefundInstanceManager.INSTANCE.getRefundResponseData() != null) {
                    TBRefundInstanceManager.setNetStart(false);
                    jqg.b(TBRefundInstanceManager.TAG, "step4 : 没有预热实例存在，路由请求已经回来，传真实数据");
                    JSONObject jSONObject2 = jSONObject;
                    jSONObject2.put((JSONObject) "dataType", "net");
                    jSONObject2.put((JSONObject) ZimMessageChannel.K_RPC_RES, (String) TBRefundInstanceManager.INSTANCE.getRefundResponseData());
                    p pVar = this.f14581a;
                    if (pVar == null) {
                        return;
                    }
                    pVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", jSONObject);
                    return;
                }
                jqg.b(TBRefundInstanceManager.TAG, "step4 : 没有预热实例存在，路由请求没有回来，传缓存数据，并且临时实例存起来");
                if (!TBRefundInstanceManager.isNetStart()) {
                    jSONObject.put((JSONObject) "dataType", "net");
                    p pVar2 = this.f14581a;
                    if (pVar2 == null) {
                        return;
                    }
                    pVar2.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", jSONObject);
                    return;
                }
                TBRefundInstanceManager.INSTANCE.setTemporaryInstance(this.f14581a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J(\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¨\u0006\u0015"}, d2 = {"com/taobao/android/order/bundle/weex2/TBRefundInstanceManager$createNewInstance$1", "Lcom/taobao/android/weex_framework/IMUSRenderListener;", "onDestroyed", "", "instance", "Lcom/taobao/android/weex_framework/MUSDKInstance;", "onFatalException", "Lcom/taobao/android/weex_framework/MUSInstance;", "type", "", "errorMsg", "", "onForeground", "onJSException", "onPrepareSuccess", "onRefreshFailed", "isFatal", "", "onRefreshSuccess", "onRenderFailed", ljl.RENDER_SUCCESS_TIME, "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class c implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f14580a;

        @Override // com.taobao.android.weex_framework.g
        public void onDestroyed(MUSDKInstance instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, instance});
            } else {
                q.d(instance, "instance");
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshSuccess(p instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, instance});
            } else {
                q.d(instance, "instance");
            }
        }

        public c(ViewGroup viewGroup) {
            this.f14580a = viewGroup;
        }

        @Override // com.taobao.android.weex_framework.g
        public void onForeground(p instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fafc624", new Object[]{this, instance});
                return;
            }
            q.d(instance, "instance");
            UnifyLog.b("Weex2ViewHolder.onForeground", "");
        }

        @Override // com.taobao.android.weex_framework.g
        public void onPrepareSuccess(p instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9635d60b", new Object[]{this, instance});
                return;
            }
            q.d(instance, "instance");
            UnifyLog.b("Weex2ViewHolder.onPrepareSuccess", "");
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderSuccess(p instance) {
            SurfaceHolder holder;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdf238", new Object[]{this, instance});
                return;
            }
            q.d(instance, "instance");
            this.f14580a.addView(instance.getRenderRoot());
            if (TBRefundInstanceManager.getUseSurfaceView()) {
                View renderView = instance.getRenderView();
                if (!(renderView instanceof SurfaceView)) {
                    renderView = null;
                }
                SurfaceView surfaceView = (SurfaceView) renderView;
                if (surfaceView != null) {
                    surfaceView.setZOrderMediaOverlay(true);
                }
                View renderView2 = instance.getRenderView();
                if (!(renderView2 instanceof SurfaceView)) {
                    renderView2 = null;
                }
                SurfaceView surfaceView2 = (SurfaceView) renderView2;
                if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
                    holder.setFormat(-3);
                }
            }
            UnifyLog.b("Weex2ViewHolder.onRenderSuccess", "");
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderFailed(p instance, int i, String errorMsg, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4253181b", new Object[]{this, instance, new Integer(i), errorMsg, new Boolean(z)});
                return;
            }
            q.d(instance, "instance");
            q.d(errorMsg, "errorMsg");
            UnifyLog.d("Weex2ViewHolder.onRenderFailed", errorMsg + ",isFatal:" + z);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshFailed(p instance, int i, String errorMsg, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f63c5f14", new Object[]{this, instance, new Integer(i), errorMsg, new Boolean(z)});
                return;
            }
            q.d(instance, "instance");
            q.d(errorMsg, "errorMsg");
            UnifyLog.d("Weex2ViewHolder.onRefreshFailed", errorMsg + ",isFatal:" + z);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onJSException(p instance, int i, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831fc52e", new Object[]{this, instance, new Integer(i), errorMsg});
                return;
            }
            q.d(instance, "instance");
            q.d(errorMsg, "errorMsg");
            UnifyLog.d("Weex2ViewHolder.onJSException", errorMsg);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onFatalException(p instance, int i, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd71451", new Object[]{this, instance, new Integer(i), errorMsg});
                return;
            }
            q.d(instance, "instance");
            q.d(errorMsg, "errorMsg");
            UnifyLog.d("Weex2ViewHolder.onFatalException", errorMsg);
        }
    }

    public final JSONObject getRefundResponseData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b27d0c40", new Object[]{this}) : refundResponseData;
    }

    public final void setRefundResponseData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97591344", new Object[]{this, jSONObject});
        } else {
            refundResponseData = jSONObject;
        }
    }

    public final p getTemporaryInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("9a8427d4", new Object[]{this}) : temporaryInstance;
    }

    public final void setTemporaryInstance(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d93722", new Object[]{this, pVar});
        } else {
            temporaryInstance = pVar;
        }
    }

    public static final boolean isNetStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88eb311a", new Object[0])).booleanValue() : isNetStart;
    }

    public static final void setNetStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63727046", new Object[]{new Boolean(z)});
        } else {
            isNetStart = z;
        }
    }

    public final String getNetStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41367451", new Object[]{this}) : netStartTime;
    }

    public final void setNetStartTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76368a45", new Object[]{this, str});
        } else {
            netStartTime = str;
        }
    }

    @JvmStatic
    public static final void startPreRequestOnIdle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b082c068", new Object[0]);
        } else if (!getEnablePreRequest()) {
        } else {
            netStartTime = String.valueOf(System.currentTimeMillis());
            isNetStart = true;
            jqg.b(TAG, "step1 : 导航阶段发起预请求: ");
            temporaryInstance = null;
            refundResponseData = null;
            ifn.a aVar = ifn.Companion;
            com.alibaba.android.ultron.vfw.weex2.highPerformance.model.b a2 = new b.a().a("mtop.com.alibaba.refundface2.disputeservice.renderlist.noultron").b("1.0").a(true).b(false).c(true).d(true).c("UNIT_TRADE").a(JSONObject.parseObject("{'curPage':'1','inThirtyDays':'false','pageSize':'10','terminal':'wireless'}")).a();
            q.b(a2, "UltronTradeHybridMTopMod…l':'wireless'}\")).build()");
            aVar.a(a2, null, "refundList", false, new f());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/taobao/android/order/bundle/weex2/TBRefundInstanceManager$startPreRequestOnIdle$1", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/pre/request/IUltronTradeHybridPreRequestCallback;", "onFailed", "", "p0", "", p1.d, "onSuccess", "data", "Lcom/alibaba/fastjson/JSONObject;", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class f implements com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a
        public void a(JSONObject data) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, data});
                return;
            }
            q.d(data, "data");
            try {
                jSONObject = data.getJSONObject("data");
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                return;
            }
            if (TBRefundInstanceManager.INSTANCE.getTemporaryInstance() != null) {
                TBRefundInstanceManager.setNetStart(false);
                try {
                    p temporaryInstance = TBRefundInstanceManager.INSTANCE.getTemporaryInstance();
                    if (temporaryInstance != null && temporaryInstance.isDestroyed()) {
                        jqg.b(TBRefundInstanceManager.TAG, "step5 : 实例已经被销毁了");
                    } else {
                        jqg.b(TBRefundInstanceManager.TAG, "step5 : 请求在实例创建之后回来了,且数据不相同，再传一次");
                        p temporaryInstance2 = TBRefundInstanceManager.INSTANCE.getTemporaryInstance();
                        if (temporaryInstance2 != null) {
                            MUSEventTarget mUSEventTarget = MUSEventTarget.MUS_DOCUMENT_TARGET;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put((JSONObject) "dataType", "net");
                            jSONObject2.put((JSONObject) ZimMessageChannel.K_RPC_RES, (String) jSONObject);
                            jSONObject2.put((JSONObject) "netStartTime", TBRefundInstanceManager.INSTANCE.getNetStartTime());
                            t tVar = t.INSTANCE;
                            temporaryInstance2.dispatchEvent(mUSEventTarget, "preload.background", jSONObject2);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                TBRefundInstanceManager.INSTANCE.setTemporaryInstance(null);
            } else {
                TBRefundInstanceManager.INSTANCE.setRefundResponseData(jSONObject);
            }
            com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a a2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a();
            q.b(a2, "UltronTradeHybridManager.getInstance()");
            j f = a2.f();
            String jSONString = jSONObject.toJSONString();
            q.b(jSONString, "responseData.toJSONString()");
            f.a("first_data", jSONString, alz.BizKeyRefund);
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.a
        public void a(String p0, String p1) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, p0, p1});
                return;
            }
            q.d(p0, "p0");
            q.d(p1, "p1");
            TBRefundInstanceManager.setNetStart(false);
            jqg.b(TBRefundInstanceManager.TAG, "step5 : 请求失败了，不处理");
            if (TBRefundInstanceManager.INSTANCE.getTemporaryInstance() == null) {
                return;
            }
            try {
                p temporaryInstance = TBRefundInstanceManager.INSTANCE.getTemporaryInstance();
                if (temporaryInstance != null && temporaryInstance.isDestroyed()) {
                    jqg.b(TBRefundInstanceManager.TAG, "step5 : 实例已经被销毁了");
                } else {
                    jqg.b(TBRefundInstanceManager.TAG, "step5 : 请求在实例创建之后回来了,且失败了");
                    p temporaryInstance2 = TBRefundInstanceManager.INSTANCE.getTemporaryInstance();
                    if (temporaryInstance2 != null) {
                        MUSEventTarget mUSEventTarget = MUSEventTarget.MUS_DOCUMENT_TARGET;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "dataType", "net");
                        t tVar = t.INSTANCE;
                        temporaryInstance2.dispatchEvent(mUSEventTarget, "preload.background", jSONObject);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            TBRefundInstanceManager.INSTANCE.setTemporaryInstance(null);
        }
    }

    private final void prefetchImage() {
        List<String> i;
        String str;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab4ec2b", new Object[]{this});
        } else if (getEnableImagePrefetch()) {
            com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a a2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a();
            q.b(a2, "UltronTradeHybridManager.getInstance()");
            String a3 = a2.f().a("first_data", alz.BizKeyRefund);
            if (a3 == null) {
                return;
            }
            try {
                JSONArray data = JSONObject.parseObject(a3).getJSONObject("resultData").getJSONObject("data").getJSONArray("disputeContainerList");
                q.b(data, "data");
                JSONArray jSONArray = data;
                ArrayList arrayList = new ArrayList(kotlin.collections.p.a((Iterable) jSONArray, 10));
                for (Object obj : jSONArray) {
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("itemInfoVO")) == null || (str = jSONObject.getString(eby.KEY_PIC_URL)) == null) {
                        str = "";
                    }
                    arrayList.add(INSTANCE.decideUrl(str));
                }
                List g = kotlin.collections.p.g((Iterable) arrayList);
                if (g.size() > 4) {
                    i = kotlin.collections.p.i((Iterable) g.subList(0, 4));
                } else {
                    i = kotlin.collections.p.i((Iterable) g);
                }
                com.taobao.phenix.intf.b h = com.taobao.phenix.intf.b.h();
                if (h == null) {
                    return;
                }
                h.a("trade-module", i).a();
                jqg.a(TAG, "asyncPrefetchImg:", "=== phenix.preload ===" + i.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private final String decideUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84d82f68", new Object[]{this, str});
        }
        int a2 = spk.a(iro.ORANGE_KEY_MY_TAOBAO, "prefetchImgSize", 320);
        String decideUrl = ImageStrategyDecider.decideUrl(str, Integer.valueOf(a2), Integer.valueOf(a2), ImageStrategyConfig.a("default").a(a2).b(a2).a(TaobaoImageUrlStrategy.ImageQuality.q90).a());
        return decideUrl == null ? "" : decideUrl;
    }
}
