package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 A2\u00020\u0001:\u0002@AB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0018H\u0002J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020&H\u0002J\u001a\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010*\u001a\u00020+H\u0016J\u0014\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0018\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u0012H\u0014J\u001a\u00103\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00104\u001a\u00020-H\u0014J\u0018\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0012H\u0014J\u001a\u00108\u001a\u00020(2\u0006\u00106\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u0014H\u0014J\u001a\u0010:\u001a\u00020(2\u0006\u00106\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u0018H\u0014J\"\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010<2\u0006\u0010=\u001a\u00020&2\b\u0010>\u001a\u0004\u0018\u00010\u0016H\u0002J\u000e\u0010?\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXTemplateViewWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "()V", "DXTEMPLATEVIEW_CACHESIZE", "", "getDXTEMPLATEVIEW_CACHESIZE", "()J", "DXTEMPLATEVIEW_DATA", "getDXTEMPLATEVIEW_DATA", "DXTEMPLATEVIEW_NAME", "getDXTEMPLATEVIEW_NAME", "DXTEMPLATEVIEW_URL", "getDXTEMPLATEVIEW_URL", "DXTEMPLATEVIEW_USERCACHEKEY", "getDXTEMPLATEVIEW_USERCACHEKEY", "DXTEMPLATEVIEW_VERSION", "getDXTEMPLATEVIEW_VERSION", "cacheSize", "", "data", "Lcom/alibaba/fastjson/JSONObject;", "measuredDxRootView", "Lcom/taobao/android/dinamicx/DXRootView;", "name", "", "renderOpts", "Lcom/taobao/android/dinamicx/DXRenderOptions;", "url", "userCacheKey", "version", CartRecommendRefreshScene.build, "object", "", "getCacheKey", "getCacheList", "", "cacheKey", "getTemplateInfo", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "onClone", "", "widgetNode", "deepClone", "", "onCreateView", "Landroid/view/View;", "context", "Landroid/content/Context;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRenderView", "weakView", "onSetIntAttribute", "key", "value", "onSetMapAttribute", "attr", "onSetStringAttribute", "renderTemplate", "Lcom/taobao/android/dinamicx/DXResult;", "dxTemplateItem", "dxRootView", "updateTemplate", "Builder", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kjm extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final long o = -5448475105793543453L;
    private JSONObject g;
    private String h;
    private String i;
    private String j;
    private String l;
    private DXRenderOptions m;
    private DXRootView n;

    /* renamed from: a  reason: collision with root package name */
    private final long f30120a = 33556442494L;
    private final long b = ac.DXTEMPLATE_NAME;
    private final long c = 528128262;
    private final long d = 5435381891761953165L;
    private final long e = -726802512773548392L;
    private final long f = -1961630536223192376L;
    private int k = 5;

    public static /* synthetic */ Object ipc$super(kjm kjmVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
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

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : o;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXTemplateViewWidgetNode$Companion;", "", "()V", "DXTEMPLATEVIEW_TEMPLATEVIEW", "", "getDXTEMPLATEVIEW_TEMPLATEVIEW", "()J", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : kjm.a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kjm();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof kjm)) {
        } else {
            super.onClone(dXWidgetNode, z);
            kjm kjmVar = (kjm) dXWidgetNode;
            this.g = kjmVar.g;
            this.h = kjmVar.h;
            this.i = kjmVar.i;
            this.j = kjmVar.j;
            this.l = kjmVar.l;
            this.k = kjmVar.k;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new FrameLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View weakView) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, weakView});
            return;
        }
        q.d(weakView, "weakView");
        super.onRenderView(context, weakView);
        DXTemplateItem b = b();
        String c = c();
        FrameLayout frameLayout = (FrameLayout) weakView;
        View childAt = frameLayout.getChildAt(0);
        if (!(childAt instanceof DXRootView)) {
            childAt = null;
        }
        DXRootView dXRootView2 = (DXRootView) childAt;
        Object tag = dXRootView2 != null ? dXRootView2.getTag(R.id.dx_template_view_cache_key) : null;
        if (!(tag instanceof String)) {
            tag = null;
        }
        String str = (String) tag;
        if (q.a((Object) str, (Object) c)) {
            dXRootView = dXRootView2;
        } else {
            dXRootView = this.n;
            if (dXRootView == null) {
                dXRootView = (DXRootView) p.f((List<Object>) a(c));
            }
        }
        DXRootView dXRootView3 = this.n;
        if (dXRootView3 == null || !q.a(dXRootView, dXRootView3)) {
            DXResult<DXRootView> a2 = a(b, dXRootView);
            dXRootView = a2 != null ? a2.f11780a : null;
        }
        this.n = null;
        if (dXRootView != null && (!q.a(dXRootView2, dXRootView))) {
            if (dXRootView2 != null) {
                frameLayout.removeAllViews();
                if (str != null) {
                    List<DXRootView> a3 = a(str);
                    if (a3.size() < this.k) {
                        a3.add(dXRootView2);
                    }
                }
            }
            dXRootView.setTag(R.id.dx_template_view_cache_key, c);
            frameLayout.addView(dXRootView);
        }
        if (dXRootView == null) {
            return;
        }
        dXRootView.setTag(R.id.dx_template_view_parent_widget, this);
    }

    private final DXTemplateItem b() {
        Long e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("c1b42276", new Object[]{this});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = this.h;
        String str = this.j;
        dXTemplateItem.b = (str == null || (e = n.e(str)) == null) ? 1L : e.longValue();
        dXTemplateItem.c = this.i;
        return dXTemplateItem;
    }

    private final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append('|');
        sb.append(this.j);
        sb.append('|');
        String str = this.l;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    private final List<DXRootView> a(String str) {
        DXRootView s;
        DXRootView s2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        Object tag = (dXRuntimeContext == null || (s2 = dXRuntimeContext.s()) == null) ? null : s2.getTag(R.id.dx_template_view_cache_pool_key);
        if (!x.h(tag)) {
            tag = null;
        }
        LinkedHashMap linkedHashMap = (Map) tag;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            DXRuntimeContext dXRuntimeContext2 = getDXRuntimeContext();
            if (dXRuntimeContext2 != null && (s = dXRuntimeContext2.s()) != null) {
                s.setTag(R.id.dx_template_view_cache_pool_key, linkedHashMap);
            }
        }
        List<DXRootView> list = (List) linkedHashMap.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(str, arrayList);
        return arrayList;
    }

    private final DXResult<DXRootView> a(DXTemplateItem dXTemplateItem, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("2d6f148f", new Object[]{this, dXTemplateItem, dXRootView});
        }
        DXRuntimeContext dxRuntimeContext = getDXRuntimeContext();
        q.b(dxRuntimeContext, "dxRuntimeContext");
        r C = dxRuntimeContext.C();
        q.b(C, "dxRuntimeContext.engineContext");
        DinamicXEngine b = C.b();
        if (b == null) {
            return null;
        }
        DXTemplateItem a2 = b.a(dXTemplateItem);
        if (a2 == null || a2.b != dXTemplateItem.b) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(dXTemplateItem);
            b.a(arrayList);
        }
        if (a2 == null) {
            return null;
        }
        if (dXRootView == null) {
            if (!ses.INSTANCE.a()) {
                DXRuntimeContext dxRuntimeContext2 = getDXRuntimeContext();
                q.b(dxRuntimeContext2, "dxRuntimeContext");
                dXRootView = b.a(dxRuntimeContext2.m(), a2).f11780a;
            } else {
                DXRuntimeContext dxRuntimeContext3 = getDXRuntimeContext();
                q.b(dxRuntimeContext3, "dxRuntimeContext");
                dXRootView = b.b(dxRuntimeContext3.m(), a2).f11780a;
            }
        }
        DXRuntimeContext dxRuntimeContext4 = getDXRuntimeContext();
        q.b(dxRuntimeContext4, "dxRuntimeContext");
        return b.a(dxRuntimeContext4.m(), dXRootView, a2, this.g, -1, this.m);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        DXRootView dXRootView;
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.m = new DXRenderOptions.a().b(i2).a(i).a();
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(i, i2);
            return;
        }
        DXResult<DXRootView> a2 = a(b(), (DXRootView) p.f((List<Object>) a(c())));
        if (a2 == null || (dXRootView = a2.f11780a) == null) {
            return;
        }
        this.n = dXRootView;
        if (dXRootView == null || (expandWidgetNode = dXRootView.getExpandWidgetNode()) == null) {
            return;
        }
        setMeasuredDimension(expandWidgetNode.getMeasuredWidth(), expandWidgetNode.getMeasuredHeight());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == this.f30120a) {
            this.g = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == this.b) {
            this.h = str;
        } else if (j == this.c) {
            this.i = str;
        } else if (j == this.d) {
            this.j = str;
        } else if (j == this.f) {
            this.l = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == this.e) {
            this.k = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }
}
