package com.taobao.android.megadesign.dx.view;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.android.megadesign.anim.lottie.MALottieView;
import com.taobao.android.megadesign.anim.lottie.a;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u0000 -2\u00020\u0001:\u0002,-B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0014J\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0014J\u0018\u0010'\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001cH\u0014J\u0018\u0010)\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u000fH\u0014J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/taobao/android/megadesign/dx/view/DXMALottieViewWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "font", "isBold", "jsonString", "jsonUrl", "loopCount", "playControl", "renderMode", "replacementImages", "tapAreaDebuggable", "tapAreas", "Lcom/alibaba/fastjson/JSONArray;", "textDelegate", CartRecommendRefreshScene.build, "object", "", "getDefaultValueForStringAttr", "key", "", "onBindEvent", "", "context", "Landroid/content/Context;", "weakView", "Landroid/view/View;", "eventId", "onClone", "widgetNode", "deepClone", "", "onCreateView", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onRenderView", "animationView", "onSetListAttribute", "attr", "onSetStringAttribute", "Builder", "Companion", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes6.dex */
public class a extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long DXMALOTTIEVIEW_FONT = 34149272427L;
    public static final long DXMALOTTIEVIEW_ISBOLD = 9423384817756195L;
    public static final long DXMALOTTIEVIEW_JSONSTRING = 9091485043305760827L;
    public static final long DXMALOTTIEVIEW_JSONURL = 4991369220069624564L;
    public static final long DXMALOTTIEVIEW_LOOPCOUNT = 2086518323790794956L;
    public static final long DXMALOTTIEVIEW_MALOTTIEVIEW = -7827222248633552986L;
    public static final long DXMALOTTIEVIEW_ONAREATAPED = -2582590095492756913L;
    public static final long DXMALOTTIEVIEW_ONCANCEL = 5288679758315475755L;
    public static final long DXMALOTTIEVIEW_ONCOMPLETED = 2873651788935849093L;
    public static final long DXMALOTTIEVIEW_ONREPEAT = 5288746714156027718L;
    public static final long DXMALOTTIEVIEW_ONSTART = 5176478572008687858L;
    public static final long DXMALOTTIEVIEW_PLAYCONTROL = 681874255820305570L;
    public static final long DXMALOTTIEVIEW_RENDERMODE = 8819004586453307919L;
    public static final long DXMALOTTIEVIEW_REPLACEMENTIMAGES = -686869780255228937L;
    public static final long DXMALOTTIEVIEW_TAPAREADEBUGGABLE = 6421984658367506097L;
    public static final long DXMALOTTIEVIEW_TAPAREAS = 6746385450873234233L;
    public static final long DXMALOTTIEVIEW_TEXTDELEGATE = -3611250641858826260L;

    /* renamed from: a  reason: collision with root package name */
    private String f14255a;
    private String b;
    private String d;
    private String e;
    private String f;
    private String g;
    private String i;
    private JSONArray k;
    private String l;
    private String c = "1";
    private String h = "false";
    private final String j = "MALottie";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/megadesign/dx/view/DXMALottieViewWidgetNode$Builder;", "Lcom/taobao/android/dinamicx/widget/IDXBuilderWidgetNode;", "()V", CartRecommendRefreshScene.build, "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "object", "", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.android.megadesign.dx.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0549a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return (DXWidgetNode) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/android/megadesign/dx/view/DXMALottieViewWidgetNode$Companion;", "", "()V", "DXMALOTTIEVIEW_FONT", "", "DXMALOTTIEVIEW_ISBOLD", "DXMALOTTIEVIEW_JSONSTRING", "DXMALOTTIEVIEW_JSONURL", "DXMALOTTIEVIEW_LOOPCOUNT", "DXMALOTTIEVIEW_MALOTTIEVIEW", "DXMALOTTIEVIEW_ONAREATAPED", "DXMALOTTIEVIEW_ONCANCEL", "DXMALOTTIEVIEW_ONCOMPLETED", "DXMALOTTIEVIEW_ONREPEAT", "DXMALOTTIEVIEW_ONSTART", "DXMALOTTIEVIEW_PLAYCONTROL", "DXMALOTTIEVIEW_RENDERMODE", "DXMALOTTIEVIEW_REPLACEMENTIMAGES", "DXMALOTTIEVIEW_TAPAREADEBUGGABLE", "DXMALOTTIEVIEW_TAPAREAS", "DXMALOTTIEVIEW_TEXTDELEGATE", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/android/megadesign/dx/view/DXMALottieViewWidgetNode$onBindEvent$2", "Lcom/taobao/android/megadesign/anim/lottie/MALottieView$OnAreaClickEventListener;", "onAreaClick", "", "index", "", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class d implements MALottieView.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.megadesign.anim.lottie.MALottieView.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            DXEvent dXEvent = new DXEvent(a.DXMALOTTIEVIEW_ONAREATAPED);
            HashMap hashMap = new HashMap();
            com.taobao.android.dinamicx.expression.expr_v2.f a2 = com.taobao.android.dinamicx.expression.expr_v2.f.a(String.valueOf(i));
            q.b(a2, "DXExprVar.ofString(index.toString())");
            hashMap.put("tapIndex", a2);
            dXEvent.setArgs(hashMap);
            a.this.postEvent(dXEvent);
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode widgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, widgetNode, new Boolean(z)});
            return;
        }
        q.d(widgetNode, "widgetNode");
        if (!(widgetNode instanceof a)) {
            return;
        }
        super.onClone(widgetNode, z);
        a aVar = (a) widgetNode;
        this.g = aVar.g;
        this.h = aVar.h;
        this.f14255a = aVar.f14255a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.i = aVar.i;
        this.l = aVar.l;
        this.k = aVar.k;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        q.d(context, "context");
        f.INSTANCE.a("DXMALottieViewWidgetNode", ai.a(j.a("ctxName", context.getClass().getName())));
        MALottieView mALottieView = new MALottieView(context);
        try {
            a.C0548a b2 = com.taobao.android.megadesign.anim.lottie.a.Builder.b(this.g);
            Integer d2 = n.d(this.c);
            String str = null;
            a.C0548a c2 = b2.a(d2 != null ? d2.intValue() : 0).c(this.b).a(this.d != null ? JSONArray.parseArray(this.d) : null).d(this.e).b(this.f != null ? JSONArray.parseArray(this.f) : null).a(Boolean.parseBoolean(this.h)).c(this.i != null ? JSON.parseArray(this.i) : null);
            DXWidgetNode sourceWidget = getSourceWidget();
            if (sourceWidget != null && (dXRuntimeContext = sourceWidget.getDXRuntimeContext()) != null) {
                str = dXRuntimeContext.A();
            }
            a.C0548a d3 = c2.a(str).d(this.k);
            String str2 = this.l;
            if (str2 == null || !Boolean.parseBoolean(str2)) {
                z = false;
            }
            mALottieView.setUpWithConfig(d3.b(z).a());
        } catch (Throwable th) {
            String str3 = this.j;
            TLog.loge("MegaDesign", str3, "DXMALottieViewWidgetNode render error " + th);
        }
        return mALottieView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View animationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, animationView});
            return;
        }
        q.d(context, "context");
        q.d(animationView, "animationView");
        super.onRenderView(context, animationView);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        q.d(context, "context");
        if (view == null || !(view instanceof MALottieView)) {
            return;
        }
        if (j == DXMALOTTIEVIEW_ONCOMPLETED) {
            MALottieView mALottieView = (MALottieView) view;
            mALottieView.removeAllAnimatorListeners();
            mALottieView.addAnimatorListener(new c(view));
        } else if (j == DXMALOTTIEVIEW_ONAREATAPED) {
            ((MALottieView) view).setOnAreaClickEventListener(new d());
        }
        super.onBindEvent(context, view, j);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/taobao/android/megadesign/dx/view/DXMALottieViewWidgetNode$onBindEvent$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes6.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public c(View view) {
            this.b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                a.this.postEvent(new DXEvent(a.DXMALOTTIEVIEW_ONSTART));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            Object tag = this.b.getTag(R.string.tag_lottie_play_control);
            if (!(tag instanceof JSONArray)) {
                tag = null;
            }
            JSONArray jSONArray = (JSONArray) tag;
            JSONArray jSONArray2 = jSONArray;
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                z = false;
            }
            if (z) {
                a.this.postEvent(new DXEvent(a.DXMALOTTIEVIEW_ONCOMPLETED));
                return;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject == null) {
                return;
            }
            try {
                String string = jSONObject.getString("start");
                q.b(string, "config.getString(\"start\")");
                int parseInt = Integer.parseInt(string);
                String string2 = jSONObject.getString("end");
                q.b(string2, "config.getString(\"end\")");
                ((MALottieView) this.b).setMinAndMaxFrame(parseInt, Integer.parseInt(string2));
                MALottieView mALottieView = (MALottieView) this.b;
                String string3 = jSONObject.getString("loopCount");
                q.b(string3, "config.getString(\"loopCount\")");
                Integer d = n.d(string3);
                if (d != null) {
                    i = d.intValue();
                }
                mALottieView.setRepeatCount(i);
            } catch (NumberFormatException unused) {
            }
            jSONArray.remove(jSONObject);
            ((MALottieView) this.b).playAnimation();
            this.b.setTag(R.string.tag_lottie_play_control, jSONArray);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                a.this.postEvent(new DXEvent(a.DXMALOTTIEVIEW_ONCANCEL));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                a.this.postEvent(new DXEvent(a.DXMALOTTIEVIEW_ONREPEAT));
            }
        }
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
    public void onSetListAttribute(long j, JSONArray attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == DXMALOTTIEVIEW_TAPAREAS) {
            this.k = attr;
        } else {
            super.onSetListAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == DXMALOTTIEVIEW_JSONSTRING) {
            this.f14255a = attr;
        } else if (j == DXMALOTTIEVIEW_JSONURL) {
            this.b = attr;
        } else if (j == DXMALOTTIEVIEW_LOOPCOUNT) {
            this.c = attr;
        } else if (j == DXMALOTTIEVIEW_PLAYCONTROL) {
            this.d = attr;
        } else if (j == DXMALOTTIEVIEW_RENDERMODE) {
            this.e = attr;
        } else if (j == DXMALOTTIEVIEW_REPLACEMENTIMAGES) {
            this.i = attr;
        } else if (j == DXMALOTTIEVIEW_TEXTDELEGATE) {
            this.f = attr;
        } else if (j == 34149272427L) {
            this.g = attr;
        } else if (j == DXMALOTTIEVIEW_TAPAREADEBUGGABLE) {
            this.l = attr;
        } else if (j == 9423384817756195L) {
            this.h = attr;
        } else {
            super.onSetStringAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == 9423384817756195L ? "false" : j == DXMALOTTIEVIEW_LOOPCOUNT ? "0" : super.getDefaultValueForStringAttr(j);
    }
}
