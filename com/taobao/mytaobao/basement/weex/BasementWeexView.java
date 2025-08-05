package com.taobao.mytaobao.basement.weex;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.DIConstants;
import com.taobao.android.weex.config.WeexApmCustomData;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.p;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.w;
import kotlin.reflect.k;
import tb.jvb;
import tb.jvs;
import tb.kge;
import tb.ljl;
import tb.mtx;
import tb.nwv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020#J\"\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\n2\b\u0010/\u001a\u0004\u0018\u000100J\u0006\u00101\u001a\u00020*J \u00102\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\n2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0003J\b\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020*H\u0002J(\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0002J\u000e\u0010<\u001a\u00020*2\u0006\u0010+\u001a\u00020#J\u000e\u0010=\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 JF\u0010>\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010\u00192\u0006\u0010@\u001a\u00020\u001e2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\nH\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010%R\u000e\u0010'\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/taobao/mytaobao/basement/weex/BasementWeexView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bundleUrl", "", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "getLayoutChangeListener", "()Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener$delegate", "Lkotlin/Lazy;", DIConstants.EVENT_NAME_LIFE_CYCLE, "Landroid/arch/lifecycle/Lifecycle;", "lifecycleObserver", "Landroid/arch/lifecycle/GenericLifecycleObserver;", "getLifecycleObserver", "()Landroid/arch/lifecycle/GenericLifecycleObserver;", "lifecycleObserver$delegate", "<set-?>", "Lcom/taobao/android/weex_framework/MUSInstance;", "mInstance", "getMInstance", "()Lcom/taobao/android/weex_framework/MUSInstance;", "mIsPresetViewSize", "", "overscrollListener", "Lcom/taobao/android/weex_framework/listeners/IWeexScrollListener;", "renderListenerList", "", "Lcom/taobao/android/weex_framework/IMUSRenderListener;", "getRenderListenerList", "()Ljava/util/List;", "renderListenerList$delegate", "renderViewHeight", "renderViewWidth", "addRenderListener", "", "renderListener", "dispatchEvent", "target", "eventName", "data", "Lcom/alibaba/fastjson/JSONObject;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "generateMUSInstance", "initWidthPx", "initHeightPx", "generateRenderDispatcher", "presetViewSize", "processOnLayoutChange", "left", "top", "right", "bottom", "removeRenderListener", "setOverScrollListener", "setUp", "wxInstance", "hasWeexAsyncRenderSuccess", "weexAsyncRenderErrorMsg", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BasementWeexView extends FrameLayout {
    public static final /* synthetic */ k[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap _$_findViewCache;
    private String bundleUrl;
    private final kotlin.d layoutChangeListener$delegate;
    private Lifecycle lifecycle;
    private final kotlin.d lifecycleObserver$delegate;
    private p mInstance;
    private boolean mIsPresetViewSize;
    private jvs overscrollListener;
    private final kotlin.d renderListenerList$delegate;
    private int renderViewHeight;
    private int renderViewWidth;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onCreateView"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements com.taobao.android.weex_framework.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.weex_framework.f
        public final void onCreateView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            q.a((Object) view, "view");
            view.setFitsSystemWindows(false);
            BasementWeexView.this.addView(view, -1, -1);
        }
    }

    static {
        kge.a(-1725323675);
        $$delegatedProperties = new k[]{t.a(new PropertyReference1Impl(t.b(BasementWeexView.class), "renderListenerList", "getRenderListenerList()Ljava/util/List;")), t.a(new PropertyReference1Impl(t.b(BasementWeexView.class), "layoutChangeListener", "getLayoutChangeListener()Landroid/view/View$OnLayoutChangeListener;")), t.a(new PropertyReference1Impl(t.b(BasementWeexView.class), "lifecycleObserver", "getLifecycleObserver()Landroid/arch/lifecycle/GenericLifecycleObserver;"))};
    }

    public BasementWeexView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BasementWeexView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final View.OnLayoutChangeListener getLayoutChangeListener() {
        IpChange ipChange = $ipChange;
        return (View.OnLayoutChangeListener) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("c1be978", new Object[]{this}) : this.layoutChangeListener$delegate.getValue());
    }

    private final GenericLifecycleObserver getLifecycleObserver() {
        IpChange ipChange = $ipChange;
        return (GenericLifecycleObserver) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("8faa2f1b", new Object[]{this}) : this.lifecycleObserver$delegate.getValue());
    }

    private final List<com.taobao.android.weex_framework.g> getRenderListenerList() {
        IpChange ipChange = $ipChange;
        return (List) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5b1c7802", new Object[]{this}) : this.renderListenerList$delegate.getValue());
    }

    public static /* synthetic */ Object ipc$super(BasementWeexView basementWeexView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* synthetic */ BasementWeexView(Context context, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final /* synthetic */ List access$getRenderListenerList$p(BasementWeexView basementWeexView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3baa470c", new Object[]{basementWeexView}) : basementWeexView.getRenderListenerList();
    }

    public static final /* synthetic */ void access$processOnLayoutChange(BasementWeexView basementWeexView, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87acabf9", new Object[]{basementWeexView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            basementWeexView.processOnLayoutChange(i, i2, i3, i4);
        }
    }

    public static final /* synthetic */ void access$setMInstance$p(BasementWeexView basementWeexView, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cab6d10", new Object[]{basementWeexView, pVar});
        } else {
            basementWeexView.mInstance = pVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasementWeexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.c(context, "context");
        this.renderListenerList$delegate = kotlin.e.a(BasementWeexView$renderListenerList$2.INSTANCE);
        this.layoutChangeListener$delegate = kotlin.e.a(new BasementWeexView$layoutChangeListener$2(this));
        this.lifecycleObserver$delegate = kotlin.e.a(new BasementWeexView$lifecycleObserver$2(this));
    }

    public final p getMInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("b8fb6bf0", new Object[]{this}) : this.mInstance;
    }

    public final void addRenderListener(com.taobao.android.weex_framework.g renderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18728604", new Object[]{this, renderListener});
            return;
        }
        q.c(renderListener, "renderListener");
        getRenderListenerList().add(renderListener);
    }

    public final void removeRenderListener(com.taobao.android.weex_framework.g renderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f851a2c1", new Object[]{this, renderListener});
            return;
        }
        q.c(renderListener, "renderListener");
        getRenderListenerList().remove(renderListener);
    }

    public static /* synthetic */ void setUp$default(BasementWeexView basementWeexView, Lifecycle lifecycle, String str, int i, int i2, p pVar, boolean z, String str2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8bc696", new Object[]{basementWeexView, lifecycle, str, new Integer(i), new Integer(i2), pVar, new Boolean(z), str2, new Integer(i3), obj});
        } else {
            basementWeexView.setUp(lifecycle, str, i, i2, pVar, z, (i3 & 64) != 0 ? null : str2);
        }
    }

    public final void setUp(Lifecycle lifecycle, String bundleUrl, int i, int i2, p pVar, boolean z, String str) {
        p generateMUSInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f3df2e2", new Object[]{this, lifecycle, bundleUrl, new Integer(i), new Integer(i2), pVar, new Boolean(z), str});
            return;
        }
        q.c(lifecycle, "lifecycle");
        q.c(bundleUrl, "bundleUrl");
        this.bundleUrl = bundleUrl;
        mtx.c().a("WebCreat");
        if (pVar != null) {
            nwv.a("createWxInstance");
            View v = pVar.getRenderRoot();
            q.a((Object) v, "v");
            v.setFitsSystemWindows(false);
            addView(v, -1, -1);
            nwv.a();
            generateMUSInstance = pVar;
        } else {
            nwv.a("createWxInstance");
            generateMUSInstance = generateMUSInstance(bundleUrl, i, i2);
            nwv.a();
            nwv.a("invokeRenderWeex");
            generateMUSInstance.initWithURL(Uri.parse(bundleUrl));
            generateMUSInstance.render(null, null);
            TLog.loge("mtbMainLink", "invoke MUSInstance.render");
            nwv.a();
            if (i <= 0 || i2 <= 0) {
                addOnLayoutChangeListener(getLayoutChangeListener());
                presetViewSize();
            }
        }
        if (com.taobao.mytaobao.base.c.w > 0) {
            WeexApmCustomData weexApmCustomData = new WeexApmCustomData();
            weexApmCustomData.setWxCustomStartTimeStamp(com.taobao.mytaobao.base.c.w);
            weexApmCustomData.setWxCustomContainerStartTimeStamp(com.taobao.mytaobao.base.c.w);
            if (generateMUSInstance != null) {
                ((jvb) generateMUSInstance).a().setWeexApmCustomData(weexApmCustomData);
                com.taobao.mytaobao.base.c.w = 0L;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.weex.musadapter.MUSDKAdapterInstance");
            }
        }
        mtx.c().a("WebCreat", null);
        mtx.c().a("WebLoad");
        com.taobao.android.weex_framework.g generateRenderDispatcher = generateRenderDispatcher();
        generateMUSInstance.registerRenderListener(generateRenderDispatcher);
        if (pVar != null) {
            if (z) {
                generateRenderDispatcher.onRenderSuccess(generateMUSInstance);
                TLog.loge("mtbMainLink", "补发success");
            } else if (str != null) {
                generateRenderDispatcher.onRenderFailed(generateMUSInstance, 0, str, false);
                TLog.loge("mtbMainLink", "补发error " + str);
            }
        }
        jvs jvsVar = this.overscrollListener;
        if (jvsVar != null) {
            generateMUSInstance.setWeexScrollListener(jvsVar);
        }
        this.mInstance = generateMUSInstance;
        lifecycle.addObserver(getLifecycleObserver());
        this.lifecycle = lifecycle;
    }

    public final void dispatchEvent(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f24c7ca", new Object[]{this, new Integer(i), str, jSONObject});
            return;
        }
        p pVar = this.mInstance;
        if (pVar == null) {
            return;
        }
        pVar.fireEvent(i, str, jSONObject);
    }

    public final void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            lifecycle.removeObserver(getLifecycleObserver());
        }
        this.lifecycle = null;
        getRenderListenerList().clear();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        p pVar = this.mInstance;
        if (pVar != null) {
            pVar.destroy();
        }
        this.mInstance = null;
    }

    public final void setOverScrollListener(jvs overscrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a05f807", new Object[]{this, overscrollListener});
            return;
        }
        q.c(overscrollListener, "overscrollListener");
        this.overscrollListener = overscrollListener;
        p pVar = this.mInstance;
        if (pVar == null) {
            return;
        }
        pVar.setWeexScrollListener(overscrollListener);
    }

    private final p generateMUSInstance(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("68eef1f9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.a(new a());
        mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.f(false);
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.c(str);
        p result = com.taobao.android.weex_framework.q.a().a(getContext(), mUSInstanceConfig);
        if (i > 0 && i2 > 0) {
            int px2dip = DensityUtil.px2dip(getContext(), i);
            int px2dip2 = DensityUtil.px2dip(getContext(), i2);
            result.addInstanceEnv("containerWidth", String.valueOf(px2dip));
            result.addInstanceEnv("containerHeight", String.valueOf(px2dip2));
            result.setConstrainedSize(new com.taobao.android.weex_framework.ui.a(i, i2));
        }
        q.a((Object) result, "result");
        return result;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016J,\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016J,\u0010\u0013\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0015"}, d2 = {"com/taobao/mytaobao/basement/weex/BasementWeexView$generateRenderDispatcher$1", "Lcom/taobao/android/weex_framework/IMUSRenderListener;", "onDestroyed", "", "instance", "Lcom/taobao/android/weex_framework/MUSDKInstance;", "onFatalException", "Lcom/taobao/android/weex_framework/MUSInstance;", "type", "", "errorMsg", "", "onForeground", "onJSException", "onPrepareSuccess", "onRefreshFailed", "isFatal", "", "onRefreshSuccess", "onRenderFailed", ljl.RENDER_SUCCESS_TIME, "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements com.taobao.android.weex_framework.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.weex_framework.g
        public void onForeground(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
                return;
            }
            for (com.taobao.android.weex_framework.g gVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                gVar.onForeground(pVar);
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onPrepareSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                return;
            }
            for (com.taobao.android.weex_framework.g gVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                gVar.onPrepareSuccess(pVar);
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                return;
            }
            for (com.taobao.android.weex_framework.g gVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                gVar.onRenderSuccess(pVar);
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            for (com.taobao.android.weex_framework.g gVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                gVar.onRenderFailed(pVar, i, str, z);
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
                return;
            }
            for (com.taobao.android.weex_framework.g gVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                gVar.onRefreshSuccess(pVar);
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            for (com.taobao.android.weex_framework.g gVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                gVar.onRefreshFailed(pVar, i, str, z);
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onJSException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
                return;
            }
            for (com.taobao.android.weex_framework.g gVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                gVar.onJSException(pVar, i, str);
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onFatalException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
                return;
            }
            for (com.taobao.android.weex_framework.g gVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                gVar.onFatalException(pVar, i, str);
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                return;
            }
            for (com.taobao.android.weex_framework.g gVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                gVar.onDestroyed(mUSDKInstance);
            }
            p mInstance = BasementWeexView.this.getMInstance();
            if (mInstance != null) {
                mInstance.destroy();
            }
            BasementWeexView.access$setMInstance$p(BasementWeexView.this, null);
        }
    }

    private final com.taobao.android.weex_framework.g generateRenderDispatcher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.g) ipChange.ipc$dispatch("1d5743df", new Object[]{this}) : new b();
    }

    private final void processOnLayoutChange(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc50f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.renderViewWidth == 0 || this.renderViewHeight == 0) {
            this.renderViewWidth = i3 - i;
            this.renderViewHeight = i4 - i2;
            presetViewSize();
        }
        removeOnLayoutChangeListener(getLayoutChangeListener());
    }

    private final void presetViewSize() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fc864c", new Object[]{this});
        } else if (this.renderViewHeight == 0 || this.renderViewWidth == 0 || this.mIsPresetViewSize || (pVar = this.mInstance) == null) {
        } else {
            int px2dip = DensityUtil.px2dip(getContext(), this.renderViewWidth);
            int px2dip2 = DensityUtil.px2dip(getContext(), this.renderViewHeight);
            w wVar = w.INSTANCE;
            Object[] objArr = {Integer.valueOf(px2dip2)};
            String format = String.format("presetViewSize,pre set Height: %s", Arrays.copyOf(objArr, objArr.length));
            q.b(format, "java.lang.String.format(format, *args)");
            TLog.loge(BasementConstants.TAG, format);
            pVar.addInstanceEnv("containerWidth", String.valueOf(px2dip));
            pVar.addInstanceEnv("containerHeight", String.valueOf(px2dip2));
            pVar.setConstrainedSize(new com.taobao.android.weex_framework.ui.a(this.renderViewWidth, this.renderViewHeight));
            this.mIsPresetViewSize = true;
        }
    }
}
