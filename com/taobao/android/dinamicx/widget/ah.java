package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.component.DXWebView;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import kotlin.Metadata;
import tb.fux;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u0000 82\u00020\u00012\u00020\u0002:\u0004789:B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0014J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0011J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\bH\u0002J\u0006\u0010\u001e\u001a\u00020\u0005J\u0012\u0010\u0007\u001a\u00020\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\bJ \u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\fH\u0014J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0005H\u0016J\u0010\u0010)\u001a\u00020$2\u0006\u0010!\u001a\u00020\"H\u0014J\u0018\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0014J\u0018\u0010.\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0015J\u0018\u0010/\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00100\u001a\u00020,H\u0014J\u0018\u00101\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00102\u001a\u00020\bH\u0014J\u0006\u00103\u001a\u00020\u0011J\u0006\u00104\u001a\u00020\u0011J\u0006\u00105\u001a\u00020\u0011J\u001a\u00106\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "Lcom/taobao/android/dinamicx/widget/IDXNodePropProvider;", "()V", "enableAutoLoad", "", "enableInterceptTopScroll_Android", "loadUrl", "", "scrollControlConfig", "Lcom/alibaba/fastjson/JSONObject;", "startTime", "", CartRecommendRefreshScene.build, "object", "", "callJS", "", "funcString", "callback", "Landroid/webkit/ValueCallback;", "delayRunUI", "func", "Lkotlin/Function0;", "destroy", "getNodePropByKey", "key", "getWebView", "Lcom/taobao/android/dinamicx/component/DXWebView;", "from", "isReachTop", "url", "onBindEvent", "context", "Landroid/content/Context;", "weakView", "Landroid/view/View;", "eventId", "onClone", "widgetNode", "deepClone", "onCreateView", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onRenderView", "onSetIntAttribute", "value", "onSetStringAttribute", "attr", "reload", "resetAnchorState", "scrollToTop", "setMapAttribute", "Builder", "Companion", "WebViewAdapter", "WebViewViewHolder", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public class ah extends DXWidgetNode implements al {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long DXWEBVIEW = 4283113730865682368L;
    public static final long DXWEBVIEW_ENABLEAUTOLOAD = 2009636492692303246L;
    public static final long DXWEBVIEW_ENABLEINTERCEPTTOPSCROLL_ANDROID = -3398419110731210258L;
    public static final long DXWEBVIEW_ONSCROLL = 5288751146867425108L;
    public static final long DXWEBVIEW_ONWEBEVENT = 8869008963330847239L;
    public static final long DXWEBVIEW_URL = 528128262;

    /* renamed from: a  reason: collision with root package name */
    private String f12053a;
    private JSONObject b;
    private boolean c = true;
    private boolean d;
    private long e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode$Builder;", "Lcom/taobao/android/dinamicx/widget/IDXBuilderWidgetNode;", "()V", CartRecommendRefreshScene.build, "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "object", "", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return (DXWidgetNode) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ah());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode$Companion;", "", "()V", "DXWEBVIEW", "", "DXWEBVIEW_ENABLEAUTOLOAD", "DXWEBVIEW_ENABLEINTERCEPTTOPSCROLL_ANDROID", "DXWEBVIEW_ONSCROLL", "DXWEBVIEW_ONWEBEVENT", "DXWEBVIEW_URL", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode$WebViewViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Lcom/taobao/android/dinamicx/component/DXWebView;", "(Lcom/taobao/android/dinamicx/component/DXWebView;)V", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DXWebView view) {
            super(view);
            kotlin.jvm.internal.q.d(view, "view");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ruk b;

        public e(ruk rukVar) {
            this.b = rukVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.taobao.android.dinamicx.widget.ai] */
        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRuntimeContext dXRuntimeContext = ah.this.getDXRuntimeContext();
            if (dXRuntimeContext != null && dXRuntimeContext.v() != null) {
                this.b.mo2427invoke();
                return;
            }
            DXRuntimeContext dXRuntimeContext2 = ah.this.getDXRuntimeContext();
            View v = dXRuntimeContext2 != null ? dXRuntimeContext2.v() : null;
            if (!(v instanceof RecyclerView)) {
                v = null;
            }
            RecyclerView recyclerView = (RecyclerView) v;
            if (recyclerView == null) {
                return;
            }
            ruk rukVar = this.b;
            if (rukVar != null) {
                rukVar = new ai(rukVar);
            }
            recyclerView.post((Runnable) rukVar);
        }
    }

    public static /* synthetic */ Object ipc$super(ah ahVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 757047317:
                super.setMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ void b(ah ahVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b8c8c3", new Object[]{ahVar, str});
        } else {
            ahVar.f12053a = str;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ah();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode widgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, widgetNode, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.d(widgetNode, "widgetNode");
        if (!(widgetNode instanceof ah)) {
            return;
        }
        super.onClone(widgetNode, z);
        ah ahVar = (ah) widgetNode;
        this.f12053a = ahVar.f12053a;
        this.b = ahVar.b;
        this.d = ahVar.d;
        DXWebView b2 = b("onClone");
        if (b2 == null) {
            return;
        }
        b2.updateWidget(ahVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.dinamicx.widget.DXWebViewWidgetNode$onCreateView$rv$1] */
    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        kotlin.jvm.internal.q.d(context, "context");
        this.e = System.currentTimeMillis();
        ?? r0 = new RecyclerView(context) { // from class: com.taobao.android.dinamicx.widget.DXWebViewWidgetNode$onCreateView$rv$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(DXWebViewWidgetNode$onCreateView$rv$1 dXWebViewWidgetNode$onCreateView$rv$1, String str, Object... objArr) {
                if (str.hashCode() == -244855388) {
                    super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                try {
                    super.onLayout(z, i, i2, i3, i4);
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("dxWebRv onCreateView onLayout error : ");
                    e2.printStackTrace();
                    sb.append(kotlin.t.INSTANCE);
                    fux.b("dinamicx", "dinamicx", sb.toString());
                }
            }
        };
        r0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r0.setLayoutManager(new LinearLayoutManager(context));
        Integer num = null;
        r0.setItemAnimator(null);
        r0.setDescendantFocusability(393216);
        ViewGroup.LayoutParams layoutParams = r0.getLayoutParams();
        Integer valueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
        ViewGroup.LayoutParams layoutParams2 = r0.getLayoutParams();
        if (layoutParams2 != null) {
            num = Integer.valueOf(layoutParams2.height);
        }
        r0.setAdapter(new c(valueOf, num));
        return (View) r0;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View weakView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, weakView});
            return;
        }
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(weakView, "weakView");
        super.onRenderView(context, weakView);
        a(new DXWebViewWidgetNode$onRenderView$1(this));
    }

    private final void a(ruk<kotlin.t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        View v = dXRuntimeContext != null ? dXRuntimeContext.v() : null;
        if (!(v instanceof RecyclerView)) {
            v = null;
        }
        RecyclerView recyclerView = (RecyclerView) v;
        if (recyclerView != null) {
            recyclerView.postDelayed(new e(rukVar), 50L);
        } else {
            fux.b("delayRunUI dxRuntimeContext?.nativeView = null");
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(new DXWebViewWidgetNode$reload$1(this));
        }
    }

    public static /* synthetic */ void a(ah ahVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bbf47b", new Object[]{ahVar, str, new Integer(i), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadUrl");
        } else {
            if ((i & 1) != 0) {
                str = null;
            }
            ahVar.a(str);
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(new DXWebViewWidgetNode$loadUrl$1(this, str));
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(new DXWebViewWidgetNode$destroy$1(this));
        }
    }

    public final void a(String funcString, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4d5078", new Object[]{this, funcString, valueCallback});
            return;
        }
        kotlin.jvm.internal.q.d(funcString, "funcString");
        a(new DXWebViewWidgetNode$callJS$1(this, funcString, valueCallback));
    }

    private final DXWebView b(String str) {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWebView) ipChange.ipc$dispatch("1be27c04", new Object[]{this, str});
        }
        try {
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            View v = dXRuntimeContext != null ? dXRuntimeContext.v() : null;
            if (!(v instanceof RecyclerView)) {
                v = null;
            }
            RecyclerView recyclerView = (RecyclerView) v;
            View findViewByPosition = (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) ? null : layoutManager.findViewByPosition(0);
            if (!(findViewByPosition instanceof DXWebView)) {
                findViewByPosition = null;
            }
            DXWebView dXWebView = (DXWebView) findViewByPosition;
            if (dXWebView == null) {
                fux.b("getWebView == null from " + str);
            }
            return dXWebView;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebView == null error:");
            e2.printStackTrace();
            sb.append(kotlin.t.INSTANCE);
            sb.append(" from ");
            sb.append(str);
            fux.b(sb.toString());
            return null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View weakView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, weakView, new Long(j)});
            return;
        }
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(weakView, "weakView");
        super.onBindEvent(context, weakView, j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), attr});
            return;
        }
        kotlin.jvm.internal.q.d(attr, "attr");
        if (j == 528128262) {
            this.f12053a = attr;
        } else {
            super.onSetStringAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1fa015", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXRecyclerLayout.DXRECYCLERLAYOUT_SCROLLCONTROLCONFIG) {
            this.b = jSONObject;
        } else {
            super.setMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXWEBVIEW_ENABLEAUTOLOAD) {
            if (i == 1) {
                z = true;
            }
            this.c = z;
        } else if (DXWEBVIEW_ENABLEINTERCEPTTOPSCROLL_ANDROID == j) {
            if (i == 1) {
                z = true;
            }
            this.d = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\b\u001a\u00020\u0004H\u0016J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode$WebViewAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/taobao/android/dinamicx/widget/DXWebViewWidgetNode$WebViewViewHolder;", "width", "", "height", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemCount", "onBindViewHolder", "", "viewHolder", p1.d, "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static class c extends RecyclerView.Adapter<d> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Integer f12054a;
        private final Integer b;

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public /* synthetic */ void onBindViewHolder(d dVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, dVar, new Integer(i)});
            } else {
                a(dVar, i);
            }
        }

        /* JADX WARN: Type inference failed for: r4v6, types: [com.taobao.android.dinamicx.widget.ah$d, android.support.v7.widget.RecyclerView$ViewHolder] */
        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public /* synthetic */ d mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
        }

        public c(Integer num, Integer num2) {
            this.f12054a = num;
            this.b = num2;
        }

        public d a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("48fe8aee", new Object[]{this, viewGroup, new Integer(i)});
            }
            kotlin.jvm.internal.q.d(viewGroup, "viewGroup");
            Context context = viewGroup.getContext();
            kotlin.jvm.internal.q.b(context, "viewGroup.context");
            d dVar = new d(new DXWebView(context, null, 2, null));
            dVar.setIsRecyclable(false);
            return dVar;
        }

        public void a(d dVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6eb60da9", new Object[]{this, dVar, new Integer(i)});
                return;
            }
            View view = dVar != null ? dVar.itemView : null;
            if (!(view instanceof DXWebView)) {
                view = null;
            }
            DXWebView dXWebView = (DXWebView) view;
            if (dXWebView == null) {
                return;
            }
            Integer num = this.f12054a;
            int i2 = -1;
            int intValue = num != null ? num.intValue() : -1;
            Integer num2 = this.b;
            if (num2 != null) {
                i2 = num2.intValue();
            }
            dXWebView.setLayoutParams(new ViewGroup.LayoutParams(intValue, i2));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.al
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        DXWebView.STATUS status = null;
        if (!kotlin.text.n.a(str, "isLoadSucceed", false, 2, (Object) null)) {
            return null;
        }
        DXWebView b2 = b("getNodePropByKey");
        if (b2 != null) {
            status = b2.getRequestStatus();
        }
        if (status != DXWebView.STATUS.SUCCEED) {
            z = false;
        }
        return String.valueOf(z);
    }
}
