package com.taobao.detail.rate.vivid.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.util.m;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.eventchain.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.taobao.R;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.fvb;
import tb.fve;
import tb.gbg;
import tb.kim;
import tb.kin;
import tb.kio;
import tb.kip;
import tb.kpz;
import tb.ses;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010%2\u0006\u0010.\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u00010\u001fH\u0016J0\u00100\u001a\u00020+2\u0006\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H\u0014J\b\u00106\u001a\u00020+H\u0002J\u000e\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\u001cR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00069"}, d2 = {"Lcom/taobao/detail/rate/vivid/widget/RateRootFragment;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultHeightSpec", "getDefaultHeightSpec", "()I", "setDefaultHeightSpec", "(I)V", "defaultWidthSpec", "getDefaultWidthSpec", "setDefaultWidthSpec", "dxResult", "Lcom/taobao/android/dinamicx/DXResult;", "Lcom/taobao/android/dinamicx/DXRootView;", "mDxEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "getMDxEngine", "()Lcom/taobao/android/dinamicx/DinamicXEngine;", "setMDxEngine", "(Lcom/taobao/android/dinamicx/DinamicXEngine;)V", "mHeight", "mIsAdaptByViewSize", "", "mWidth", "renderOptions", "Lcom/taobao/android/dinamicx/DXRenderOptions$Builder;", "getRenderOptions", "()Lcom/taobao/android/dinamicx/DXRenderOptions$Builder;", "setRenderOptions", "(Lcom/taobao/android/dinamicx/DXRenderOptions$Builder;)V", "templeFieldsData", "Lcom/alibaba/fastjson/JSONObject;", "getTempleFieldsData", "()Lcom/alibaba/fastjson/JSONObject;", "setTempleFieldsData", "(Lcom/alibaba/fastjson/JSONObject;)V", "initDinamicX", "", "dxEngine", "dxInfo", "paramsInfo", "dxRender", "onLayout", "changed", "left", "top", "right", "bottom", "renderTemplate", "setAdaptByViewSize", "enable", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class RateRootFragment extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int defaultHeightSpec;
    private int defaultWidthSpec;
    private DXResult<DXRootView> dxResult;
    private DinamicXEngine mDxEngine;
    private int mHeight;
    private boolean mIsAdaptByViewSize;
    private int mWidth;
    private DXRenderOptions.a renderOptions;
    private JSONObject templeFieldsData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "result", "Lcom/taobao/android/dinamicx/notification/DXNotificationResult;", "kotlin.jvm.PlatformType", "onNotificationListener", "com/taobao/detail/rate/vivid/widget/RateRootFragment$initDinamicX$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f17051a;
        public final /* synthetic */ RateRootFragment b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ DinamicXEngine d;
        public final /* synthetic */ long e;

        public a(Ref.BooleanRef booleanRef, long j, RateRootFragment rateRootFragment, JSONObject jSONObject, DinamicXEngine dinamicXEngine) {
            this.f17051a = booleanRef;
            this.e = j;
            this.b = rateRootFragment;
            this.c = jSONObject;
            this.d = dinamicXEngine;
        }

        @Override // tb.fve
        public final void onNotificationListener(fvb fvbVar) {
            DXRootView dXRootView;
            Object obj;
            RateRootFragment rateRootFragment;
            DXResult<DXRootView> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            } else if (fvbVar.f28139a == null || fvbVar.f28139a.isEmpty()) {
                kim.a(com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_load_failed_retry_later));
            } else {
                List<DXTemplateItem> list = fvbVar.f28139a;
                q.b(list, "result.finishedTemplateItems");
                Iterator<T> it = list.iterator();
                while (true) {
                    dXRootView = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((DXTemplateItem) obj).f11925a.equals(kio.INSTANCE.n())) {
                        break;
                    }
                }
                DXTemplateItem dXTemplateItem = (DXTemplateItem) obj;
                if (dXTemplateItem != null && !this.f17051a.element) {
                    long currentTimeMillis = System.currentTimeMillis() - this.e;
                    JSONObject jSONObject = this.b.getTempleFieldsData().getJSONObject("params");
                    if (jSONObject != null) {
                        jSONObject.put("dxDownloadTime", (Object) Long.valueOf(currentTimeMillis));
                    }
                    DXTemplateItem a2 = this.d.a(dXTemplateItem);
                    if (ses.INSTANCE.a()) {
                        rateRootFragment = this.b;
                        b = this.d.a(rateRootFragment.getContext(), a2);
                    } else {
                        rateRootFragment = this.b;
                        b = this.d.b(rateRootFragment.getContext(), a2);
                    }
                    RateRootFragment.access$setDxResult$p(rateRootFragment, b);
                    RateRootFragment rateRootFragment2 = this.b;
                    DXResult access$getDxResult$p = RateRootFragment.access$getDxResult$p(rateRootFragment2);
                    if (access$getDxResult$p != null) {
                        dXRootView = (DXRootView) access$getDxResult$p.f11780a;
                    }
                    rateRootFragment2.addView(dXRootView);
                    this.f17051a.element = true;
                    RateRootFragment.access$renderTemplate(this.b);
                    m.e(kin.INSTANCE.a(), com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_no_history_refresh_template));
                }
                kpz.INSTANCE.a(fvbVar);
            }
        }
    }

    public RateRootFragment(Context context) {
        this(context, null, 0, 6, null);
    }

    public RateRootFragment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static /* synthetic */ Object ipc$super(RateRootFragment rateRootFragment, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ DXResult access$getDxResult$p(RateRootFragment rateRootFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXResult) ipChange.ipc$dispatch("cef67c80", new Object[]{rateRootFragment}) : rateRootFragment.dxResult;
    }

    public static final /* synthetic */ void access$renderTemplate(RateRootFragment rateRootFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54dc1e1e", new Object[]{rateRootFragment});
        } else {
            rateRootFragment.renderTemplate();
        }
    }

    public static final /* synthetic */ void access$setDxResult$p(RateRootFragment rateRootFragment, DXResult dXResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff11d98", new Object[]{rateRootFragment, dXResult});
        } else {
            rateRootFragment.dxResult = dXResult;
        }
    }

    public /* synthetic */ RateRootFragment(Context context, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateRootFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.d(context, "context");
        this.templeFieldsData = new JSONObject();
        this.defaultWidthSpec = -1;
        this.defaultHeightSpec = -1;
    }

    public final DinamicXEngine getMDxEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("ff60e0b3", new Object[]{this}) : this.mDxEngine;
    }

    public final void setMDxEngine(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11946a79", new Object[]{this, dinamicXEngine});
        } else {
            this.mDxEngine = dinamicXEngine;
        }
    }

    public final JSONObject getTempleFieldsData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b1ce8a4d", new Object[]{this}) : this.templeFieldsData;
    }

    public final void setTempleFieldsData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a623d7", new Object[]{this, jSONObject});
            return;
        }
        q.d(jSONObject, "<set-?>");
        this.templeFieldsData = jSONObject;
    }

    public final int getDefaultWidthSpec() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59df9a50", new Object[]{this})).intValue() : this.defaultWidthSpec;
    }

    public final void setDefaultWidthSpec(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b226d6ba", new Object[]{this, new Integer(i)});
        } else {
            this.defaultWidthSpec = i;
        }
    }

    public final int getDefaultHeightSpec() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("276ff3e7", new Object[]{this})).intValue() : this.defaultHeightSpec;
    }

    public final void setDefaultHeightSpec(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d2999b", new Object[]{this, new Integer(i)});
        } else {
            this.defaultHeightSpec = i;
        }
    }

    public final DXRenderOptions.a getRenderOptions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRenderOptions.a) ipChange.ipc$dispatch("6244696c", new Object[]{this}) : this.renderOptions;
    }

    public final void setRenderOptions(DXRenderOptions.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d69a8af6", new Object[]{this, aVar});
        } else {
            this.renderOptions = aVar;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight <= 0 || measuredWidth <= 0) {
            return;
        }
        if (this.mHeight == measuredHeight && this.mWidth == measuredWidth) {
            return;
        }
        this.mHeight = measuredHeight;
        this.mWidth = measuredWidth;
        renderTemplate();
    }

    private final void renderTemplate() {
        DXRootView dXRootView;
        DXWidgetNode expandWidgetNode;
        m.e(kin.INSTANCE.a(), "renderTemplate.Start");
        DXResult<DXRootView> dXResult = this.dxResult;
        bn bnVar = null;
        if (dXResult != null) {
            this.defaultWidthSpec = DXWidgetNode.DXMeasureSpec.a(getMeasuredWidth(), 1073741824);
            this.defaultHeightSpec = DXWidgetNode.DXMeasureSpec.a(getMeasuredHeight(), 1073741824);
            DXRenderOptions.a aVar = this.renderOptions;
            if (aVar != null) {
                aVar.a(this.defaultWidthSpec).b(this.defaultHeightSpec);
            }
            DinamicXEngine dinamicXEngine = this.mDxEngine;
            if (dinamicXEngine != null) {
                if (this.mIsAdaptByViewSize) {
                    DXEngineConfig b = dinamicXEngine.b();
                    q.b(b, "engine.config");
                    b.a(getMeasuredWidth());
                }
                Context context = getContext();
                DXRootView dXRootView2 = dXResult.f11780a;
                DXRootView dXRootView3 = dXResult.f11780a;
                q.b(dXRootView3, "it.result");
                DXTemplateItem dxTemplateItem = dXRootView3.getDxTemplateItem();
                JSONObject jSONObject = this.templeFieldsData;
                DXRenderOptions.a aVar2 = this.renderOptions;
                dinamicXEngine.a(context, dXRootView2, dxTemplateItem, jSONObject, 0, aVar2 != null ? aVar2.a() : null);
            }
        }
        m.e(kin.INSTANCE.a(), "renderTemplate.End");
        if (kio.INSTANCE.e()) {
            DXResult<DXRootView> dXResult2 = this.dxResult;
            DXWidgetNode queryWTByUserId = (dXResult2 == null || (dXRootView = dXResult2.f11780a) == null || (expandWidgetNode = dXRootView.getExpandWidgetNode()) == null) ? null : expandWidgetNode.queryWTByUserId(WXBasicComponentType.RECYCLER);
            if (queryWTByUserId instanceof DXRecyclerLayout) {
                try {
                    DXRuntimeContext dXRuntimeContext = ((DXRecyclerLayout) queryWTByUserId).getDXRuntimeContext();
                    if (dXRuntimeContext != null) {
                        bnVar = dXRuntimeContext.a(f.DX_EVENT_EVENTCHAIN);
                    }
                    if (bnVar instanceof kip) {
                        WaterfallLayout m = ((DXRecyclerLayout) queryWTByUserId).m();
                        q.b(m, "recycler.waterfallLayout");
                        ((kip) bnVar).a(m.b());
                    }
                    Field field = RecyclerView.class.getDeclaredField("mMaxFlingVelocity");
                    q.b(field, "field");
                    field.setAccessible(true);
                    WaterfallLayout m2 = ((DXRecyclerLayout) queryWTByUserId).m();
                    q.b(m2, "recycler.waterfallLayout");
                    field.set(m2.b(), Integer.valueOf(gbg.a(getContext(), kio.INSTANCE.d())));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        m.e(kin.INSTANCE.a(), "renderTemplate.End1");
    }

    public void initDinamicX(DinamicXEngine dxEngine, JSONObject jSONObject, JSONObject paramsInfo, DXRenderOptions.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b329ead2", new Object[]{this, dxEngine, jSONObject, paramsInfo, aVar});
            return;
        }
        q.d(dxEngine, "dxEngine");
        q.d(paramsInfo, "paramsInfo");
        this.mDxEngine = dxEngine;
        this.renderOptions = aVar;
        if (jSONObject == null) {
            return;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        Long l = jSONObject.getLong("version");
        q.b(l, "it.getLong(\"version\")");
        dXTemplateItem.b = l.longValue();
        dXTemplateItem.f11925a = jSONObject.getString("name");
        dXTemplateItem.c = jSONObject.getString("url");
        this.templeFieldsData.put((JSONObject) "params", (String) paramsInfo);
        DXTemplateItem a2 = dxEngine.a(dXTemplateItem);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        long currentTimeMillis = System.currentTimeMillis();
        if (a2 == null || a2.b != dXTemplateItem.b) {
            m.e(kin.INSTANCE.a(), com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_download_new_version));
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            dxEngine.a(arrayList);
            if (a2 == null) {
                dxEngine.a(new a(booleanRef, currentTimeMillis, this, paramsInfo, dxEngine));
            }
        }
        if (a2 == null) {
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        JSONObject jSONObject2 = this.templeFieldsData.getJSONObject("params");
        if (jSONObject2 != null) {
            jSONObject2.put("dxDownloadTime", (Object) Long.valueOf(currentTimeMillis2));
        }
        if (ses.INSTANCE.a()) {
            this.dxResult = dxEngine.a(getContext(), a2);
        } else {
            this.dxResult = dxEngine.b(getContext(), a2);
        }
        DXResult<DXRootView> dXResult = this.dxResult;
        addView(dXResult != null ? dXResult.f11780a : null);
        m.e(kin.INSTANCE.a(), com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_history_direct_render));
    }

    public final void setAdaptByViewSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518d5390", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsAdaptByViewSize = z;
        }
    }
}
