package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.tab.DXViewPageOnTabChangeEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.view.DXNativeViewPagerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.fqi;
import tb.fxe;
import tb.gbi;
import tb.gbj;
import tb.gbk;
import tb.kge;
import tb.kkr;

/* loaded from: classes5.dex */
public class ag extends DXAbsContainerBaseLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXVIEWPAGER_DATASOURCE = -5948810534719014123L;
    public static final long DXVIEWPAGER_ENABLELAZYLOAD = 4265396554456303765L;
    public static final int DXVIEWPAGER_ENABLELAZYLOAD_TRUE = 1;
    public static final long DXVIEWPAGER_ENABLESCROLL_ANDROID = -5660415192656710902L;
    public static final long DXVIEWPAGER_FIXMULTINESTEDSCROLL_ANDROID = -8291848680749278880L;
    public static final long DXVIEWPAGER_ONCREATE = 5288680013941347641L;
    public static final long DXVIEWPAGER_ONTABCHANGED = -7836695228328867158L;
    public static final long DXVIEWPAGER_PAGELIMITKEEPINDEXES = 5075676565731354373L;
    public static final long DXVIEWPAGER_PAGELIMITSIZE = 3249025493328468804L;
    public static final long DXVIEWPAGER_RECURSIVESEARCHRL = -6303840311879476771L;
    public static final long DXVIEWPAGER_SCROLLENABLED = -8352681166307095225L;
    public static final int DXVIEWPAGER_SCROLLENABLED_TRUE = 1;
    public static final long DXVIEWPAGER_SELECTED = 6456471229575806289L;
    public static final long DXVIEWPAGER_VIEWPAGER = -4553855868367056749L;
    private String h;
    private Set<Integer> i;
    private boolean k;
    private int m;
    private int n;
    private int p;
    private WeakReference<ViewPager> s;
    private JSONArray t;
    private ab u;
    private SparseBooleanArray v;
    private int f = 1;
    private boolean g = false;
    private int j = Integer.MAX_VALUE;
    private boolean l = true;
    private boolean w = false;
    private int o = -1;
    private int q = 3;
    private int r = 0;

    static {
        kge.a(143026098);
    }

    public static /* synthetic */ Object ipc$super(ag agVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -954312630:
                super.a((DXRuntimeContext) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -630327606:
                super.sendBroadcastEvent((DXEvent) objArr[0]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 425430012:
                return super.d();
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1524202196:
                return super.getNodePropByKey((String) objArr[0]);
            case 1825628053:
                return super.invokeRefMethod((String) objArr[0], (JSONArray) objArr[1]);
            case 2091670201:
                return super.exportMethods();
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int a(ag agVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a21064db", new Object[]{agVar, new Integer(i)})).intValue();
        }
        agVar.n = i;
        return i;
    }

    public static /* synthetic */ WeakReference a(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("efd473c9", new Object[]{agVar}) : agVar.s;
    }

    public static /* synthetic */ void a(ag agVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffcab1b", new Object[]{agVar, new Integer(i), new Integer(i2)});
        } else {
            agVar.a(i, i2);
        }
    }

    public static /* synthetic */ void a(ag agVar, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba481714", new Object[]{agVar, dXWidgetNode});
        } else {
            agVar.d(dXWidgetNode);
        }
    }

    public static /* synthetic */ int b(ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7dd426cd", new Object[]{agVar})).intValue();
        }
        int i = agVar.r;
        agVar.r = i + 1;
        return i;
    }

    public static /* synthetic */ int b(ag agVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cb1275c", new Object[]{agVar, new Integer(i)})).intValue();
        }
        agVar.p = i;
        return i;
    }

    public static /* synthetic */ int c(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40c0902c", new Object[]{agVar})).intValue() : agVar.q;
    }

    public static /* synthetic */ int c(ag agVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d751e9dd", new Object[]{agVar, new Integer(i)})).intValue();
        }
        agVar.o = i;
        return i;
    }

    public static /* synthetic */ int d(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3acf98b", new Object[]{agVar})).intValue() : agVar.n;
    }

    public static /* synthetic */ int d(ag agVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71f2ac5e", new Object[]{agVar, new Integer(i)})).intValue();
        }
        agVar.r = i;
        return i;
    }

    public static /* synthetic */ int e(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c69962ea", new Object[]{agVar})).intValue() : agVar.o;
    }

    public static /* synthetic */ SparseBooleanArray f(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseBooleanArray) ipChange.ipc$dispatch("1dafff49", new Object[]{agVar}) : agVar.v;
    }

    public static /* synthetic */ int g(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c7235a8", new Object[]{agVar})).intValue() : agVar.p;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-815043447);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ag();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ag();
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof ag)) {
        } else {
            super.onClone(dXWidgetNode, z);
            ag agVar = (ag) dXWidgetNode;
            this.f11994a = agVar.f11994a;
            this.m = agVar.m;
            this.v = agVar.v;
            this.u = agVar.u;
            this.t = agVar.t;
            this.s = agVar.s;
            this.n = agVar.n;
            this.o = agVar.o;
            this.p = agVar.p;
            this.q = agVar.q;
            this.r = agVar.r;
            this.f = agVar.f;
            this.g = agVar.g;
            this.h = agVar.h;
            this.i = agVar.i;
            this.j = agVar.j;
            this.k = agVar.k;
            this.l = agVar.l;
            this.w = agVar.w;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList<>();
            this.c.addAll(getChildren());
        }
        if (this.f11994a == null) {
            this.f11994a = new JSONArray();
        }
        if (this.v == null) {
            this.v = new SparseBooleanArray();
        }
        Iterator<DXWidgetNode> it = this.c.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        ArrayList<DXWidgetNode> a2 = a(0, this.f11994a, this.c);
        a(a2);
        removeAllChild();
        setDisableFlatten(true);
        if (a2 != null && a2.size() != 0) {
            return;
        }
        a(com.taobao.android.dinamicx.s.DX_ERROR_CODE_RECYCLER_LAYOUT_231001, "生成的子节点为空，或者数量为 0");
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public List<DXWidgetNode> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : super.d();
    }

    public ArrayList<DXWidgetNode> a(int i, List<Object> list, List<DXWidgetNode> list2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("acc8c2d7", new Object[]{this, new Integer(i), list, list2});
        }
        Iterator<DXWidgetNode> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof ac) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                bg b = getDxv3VariableInfo() != null ? getDxv3VariableInfo().b() : null;
                for (DXWidgetNode dXWidgetNode : list2) {
                    DXRuntimeContext a2 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode);
                    a2.a(obj);
                    a2.b(i2);
                    if (getDxv3VariableInfo() != null) {
                        a2.a(b);
                    }
                    if (this.k) {
                        a2.e(i2);
                    }
                    HashMap hashMap = new HashMap();
                    a2.a((Map<String, com.taobao.android.dinamicx.expression.expr_v2.f>) hashMap);
                    hashMap.put(com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, com.taobao.android.dinamicx.expression.expr_v2.f.a(i2));
                    if (this.f11994a instanceof JSONArray) {
                        hashMap.put(com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, com.taobao.android.dinamicx.expression.expr_v2.f.a((JSONArray) this.f11994a));
                    } else if (a2.M() != null && (this.f11994a instanceof Object)) {
                        hashMap.put(com.taobao.android.fluid.framework.data.remote.c.KEY_DATA_SOURCE, com.taobao.android.dinamicx.expression.expr_v2.f.a(this.f11994a));
                    }
                    DXWidgetNode a3 = n.a(dXWidgetNode, a2, false);
                    a3.setParentWidget(this);
                    arrayList.add(a3);
                }
            }
            return arrayList;
        }
        ArrayList<DXWidgetNode> arrayList2 = new ArrayList<>();
        if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj2 = list.get(i3);
                DXWidgetNode dXWidgetNode2 = null;
                for (int i4 = 0; i4 < list2.size() && (dXWidgetNode2 = a(list2.get(i4), obj2, i3, (com.taobao.analysis.v3.n) null)) == null; i4++) {
                }
                if (dXWidgetNode2 == null) {
                    dXWidgetNode2 = new DXWidgetNode();
                    DXRuntimeContext a4 = getDXRuntimeContext().a((DXWidgetNode) this);
                    if (this.k) {
                        a4.e(i3);
                    }
                    dXWidgetNode2.setDXRuntimeContext(a4);
                    dXWidgetNode2.setVisibility(2);
                }
                arrayList2.add(dXWidgetNode2);
            }
        }
        return arrayList2;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public void a(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71e584a", new Object[]{this, dXRuntimeContext, new Integer(i)});
            return;
        }
        super.a(dXRuntimeContext, i);
        if (!this.k) {
            return;
        }
        dXRuntimeContext.e(i);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public JSONObject invokeRefMethod(String str, final JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6cd0df95", new Object[]{this, str, jSONArray});
        }
        char c = 65535;
        if (str.hashCode() == 1432416843 && str.equals("changeTo")) {
            c = 0;
        }
        if (c == 0) {
            if (jSONArray != null && !jSONArray.isEmpty()) {
                fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.ag.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        boolean z = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int i = -1;
                        try {
                            i = jSONArray.getIntValue(0);
                            if (jSONArray.size() > 1) {
                                z = jSONArray.getBooleanValue(1);
                            }
                        } catch (Throwable th) {
                            com.taobao.android.dinamicx.exception.a.b(th);
                        }
                        if (i < 0 || ag.a(ag.this) == null || ag.a(ag.this).get() == null) {
                            return;
                        }
                        ((ViewPager) ag.a(ag.this).get()).setCurrentItem(i, z);
                    }
                });
            }
            return null;
        }
        return super.invokeRefMethod(str, jSONArray);
    }

    public ViewPager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("adaa23d8", new Object[]{this});
        }
        WeakReference<ViewPager> weakReference = this.s;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        postEvent(new DXEvent(5288680013941347641L));
        DXNativeViewPagerView dXNativeViewPagerView = new DXNativeViewPagerView(context);
        a(dXNativeViewPagerView);
        this.s = new WeakReference<>(dXNativeViewPagerView);
        if (getDXRuntimeContext().s().getDxNestedScrollerView(getDXRuntimeContext()) != null) {
            getDXRuntimeContext().s().getDxNestedScrollerView(getDXRuntimeContext()).clearChildList();
        }
        return dXNativeViewPagerView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (DXWidgetNode.DXMeasureSpec.a(i2) != 1073741824) {
            super.onMeasure(i, DXWidgetNode.DXMeasureSpec.a(getDXRuntimeContext().I().getMeasuredHeight(), 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    private void a(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2029c714", new Object[]{this, viewPager});
        } else {
            viewPager.setOffscreenPageLimit(99);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof ViewPager)) {
        } else {
            DXRootView s = getDXRuntimeContext().s();
            if (s != null && this.k) {
                s.initDxNestedScrollerViewMap();
            }
            ViewPager viewPager = (ViewPager) view;
            boolean z = viewPager instanceof DXNativeViewPagerView;
            if (z) {
                DXNativeViewPagerView dXNativeViewPagerView = (DXNativeViewPagerView) viewPager;
                dXNativeViewPagerView.setScrollable(this.f == 1);
                dXNativeViewPagerView.setEnableScroll_Android(this.l);
            }
            this.s = new WeakReference<>(viewPager);
            a(viewPager, context);
            if (this.n == 0) {
                this.v.put(0, true);
            }
            this.o = this.n;
            final int size = (d() != null ? d().size() : 0) - 1;
            viewPager.clearOnPageChangeListeners();
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.dinamicx.widget.ag.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    } else if (f <= 0.0f || ag.b(ag.this) % ag.c(ag.this) != 0) {
                    } else {
                        a((f + i) / size);
                    }
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    } else if (i >= ag.this.d().size()) {
                    } else {
                        ag agVar = ag.this;
                        ag.a(agVar, ag.d(agVar), i);
                        ag.a(ag.this, i);
                        if (ag.d(ag.this) != ag.e(ag.this)) {
                            a();
                        }
                        if (ag.this.dXRuntimeContext.s().getDxNestedScrollerView(ag.this.getDXRuntimeContext()) == null) {
                            return;
                        }
                        ag.a(ag.this, ag.this.d().get(i));
                    }
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                        return;
                    }
                    if (i == 0 && ag.d(ag.this) != ag.e(ag.this)) {
                        a();
                    }
                    ag.b(ag.this, i);
                }

                private void a() {
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = null;
                    if (ag.this.f11994a != null && (ag.this.f11994a instanceof JSONArray) && ag.d(ag.this) < ag.this.f11994a.size()) {
                        jSONObject = ((JSONArray) ag.this.f11994a).getJSONObject(ag.d(ag.this));
                    }
                    JSONObject jSONObject2 = jSONObject;
                    boolean z2 = ag.f(ag.this).get(ag.d(ag.this));
                    if (!z2) {
                        ag.f(ag.this).put(ag.d(ag.this), true);
                    }
                    if (ag.g(ag.this) == 2 || ag.g(ag.this) == 1) {
                        i = 2;
                    } else {
                        DXRuntimeContext dXRuntimeContext = ag.this.getDXRuntimeContext();
                        if (dXRuntimeContext != null) {
                            View v = dXRuntimeContext.v();
                            if (v instanceof DXNativeViewPagerView) {
                                i = ((DXNativeViewPagerView) v).getIndexChangeType();
                            }
                        }
                        i = 0;
                    }
                    ag.this.postEvent(new DXViewPageOnTabChangeEvent(ag.d(ag.this), ag.e(ag.this), jSONObject2, !z2, i));
                    ag agVar = ag.this;
                    ag.c(agVar, ag.d(agVar));
                    ag.d(ag.this, 0);
                }

                private void a(float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                        return;
                    }
                    DXEvent dXEvent = new DXEvent(5288751146867425108L);
                    HashMap hashMap = new HashMap();
                    hashMap.put(kkr.PERCENT, com.taobao.android.dinamicx.expression.expr_v2.f.a(f));
                    dXEvent.setArgs(hashMap);
                    ag.this.postEvent(dXEvent);
                }
            });
            if (this.k && getDXRuntimeContext() != null) {
                getDXRuntimeContext().h(e() == null ? -1 : e().hashCode());
            }
            ab abVar = this.u;
            if (abVar != null) {
                abVar.a(this);
            }
            fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.ag.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ag.a(ag.this, ag.this.d().get(ag.d(ag.this)));
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                    }
                }
            }, 100L);
            if (z) {
                ((DXNativeViewPagerView) viewPager).setCurrentItem(this.n, false, 1);
            } else {
                viewPager.setCurrentItem(this.n, false);
            }
        }
    }

    public void a(ViewPager viewPager, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73d2334", new Object[]{this, viewPager, context});
            return;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            viewPager.setAdapter(a(context));
        } else if (adapter.getCount() != d().size()) {
            viewPager.setAdapter(a(context));
        } else if (!(adapter instanceof gbj)) {
        } else {
            gbj gbjVar = (gbj) adapter;
            gbjVar.a(d());
            adapter.notifyDataSetChanged();
            gbjVar.a(this);
        }
    }

    private void d(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af8e6fa4", new Object[]{this, dXWidgetNode});
            return;
        }
        DXNestedScrollerView dxNestedScrollerView = getDXRuntimeContext().s().getDxNestedScrollerView(dXWidgetNode == null ? null : dXWidgetNode.getDXRuntimeContext());
        if (dxNestedScrollerView == null) {
            return;
        }
        if (dXWidgetNode instanceof DXRecyclerLayout) {
            a(dxNestedScrollerView);
            a((DXRecyclerLayout) dXWidgetNode, dxNestedScrollerView);
            return;
        }
        if (dXWidgetNode != null && dXWidgetNode.children != null && dXWidgetNode.children.size() > 0) {
            if (this.w) {
                if (a(dXWidgetNode, dxNestedScrollerView)) {
                    return;
                }
            } else {
                for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.children) {
                    View v = dXWidgetNode2.getDXRuntimeContext().v();
                    if ((dXWidgetNode2 instanceof DXRecyclerLayout) && dXWidgetNode2.getVisibility() == 0) {
                        a(dxNestedScrollerView);
                        a((DXRecyclerLayout) dXWidgetNode2, dxNestedScrollerView);
                        return;
                    } else if (dXWidgetNode2.getVisibility() == 0 && (v instanceof RecyclerView)) {
                        a(dxNestedScrollerView);
                        dxNestedScrollerView.setCurrentChild((RecyclerView) v);
                        return;
                    }
                }
            }
        }
        if (this.k) {
            return;
        }
        dxNestedScrollerView.clearChildList();
    }

    private void a(DXNestedScrollerView dXNestedScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cc0b4f", new Object[]{this, dXNestedScrollerView});
        } else if (!fqi.ak()) {
        } else {
            dXNestedScrollerView.setChildReachTop(false);
        }
    }

    private boolean a(DXWidgetNode dXWidgetNode, DXNestedScrollerView dXNestedScrollerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c228d6d4", new Object[]{this, dXWidgetNode, dXNestedScrollerView})).booleanValue();
        }
        if (dXWidgetNode != null) {
            View v = dXWidgetNode.getDXRuntimeContext().v();
            if ((dXWidgetNode instanceof DXRecyclerLayout) && dXWidgetNode.getVisibility() == 0) {
                a(dXNestedScrollerView);
                a((DXRecyclerLayout) dXWidgetNode, dXNestedScrollerView);
                return true;
            } else if (dXWidgetNode.getVisibility() == 0 && (v instanceof RecyclerView) && v.canScrollVertically(-1)) {
                a(dXNestedScrollerView);
                dXNestedScrollerView.setCurrentChild((RecyclerView) v);
                return true;
            } else if (dXWidgetNode.children != null && dXWidgetNode.getChildrenCount() > 0) {
                for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.children) {
                    if (a(dXWidgetNode2, dXNestedScrollerView)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void a(DXRecyclerLayout dXRecyclerLayout, DXNestedScrollerView dXNestedScrollerView) {
        WaterfallLayout m;
        RecyclerView b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5726eb3", new Object[]{this, dXRecyclerLayout, dXNestedScrollerView});
        } else if (dXRecyclerLayout == null || (m = dXRecyclerLayout.m()) == null || (b = m.b()) == null) {
        } else {
            dXNestedScrollerView.setCurrentChild(b);
        }
    }

    public gbj a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbj) ipChange.ipc$dispatch("34c39517", new Object[]{this, context});
        }
        if (this.g) {
            return new gbi(this, d(), context);
        }
        return new gbj(this, d(), context);
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (d() == null || d().size() == 0) {
        } else {
            int size = d().size();
            if (i >= 0 && i < size) {
                DXWidgetNode dXWidgetNode = d().get(i);
                if (this.w) {
                    dXWidgetNode = e(dXWidgetNode);
                }
                if (dXWidgetNode instanceof DXRecyclerLayout) {
                    ((DXRecyclerLayout) dXWidgetNode).o();
                }
            }
            if (i2 < 0 || i2 >= size) {
                return;
            }
            final DXWidgetNode dXWidgetNode2 = d().get(i2);
            if (this.w) {
                dXWidgetNode2 = e(dXWidgetNode2);
            }
            if (!(dXWidgetNode2 instanceof DXRecyclerLayout)) {
                return;
            }
            ((DXRecyclerLayout) dXWidgetNode2).triggerExposure();
            fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.ag.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    DXWidgetNode dXWidgetNode3 = dXWidgetNode2;
                    if (dXWidgetNode3 == null) {
                        return;
                    }
                    ((DXRecyclerLayout) dXWidgetNode3).p();
                }
            }, 300L);
        }
    }

    private DXWidgetNode e(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("3f84f962", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode instanceof DXRecyclerLayout) {
            return dXWidgetNode;
        }
        if (dXWidgetNode.getChildrenCount() <= 0 || dXWidgetNode.children == null) {
            return null;
        }
        for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.children) {
            DXWidgetNode e = e(dXWidgetNode2);
            if (e instanceof DXRecyclerLayout) {
                return e;
            }
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXVIEWPAGER_PAGELIMITKEEPINDEXES) {
            this.h = str;
            g();
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (fqi.ay()) {
            super.onSetListAttribute(j, jSONArray);
        } else if (j == -5948810534719014123L) {
            this.f11994a = jSONArray;
            this.propertyInitFlag |= 2;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public JSONArray exportMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7cac5ab9", new Object[]{this});
        }
        if (this.t == null) {
            this.t = new JSONArray() { // from class: com.taobao.android.dinamicx.widget.DXViewPager$5
                {
                    add("changeTo");
                }
            };
            this.t.addAll(super.exportMethods());
        }
        return this.t;
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.al
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (gbk.TYPE_SELECTED.equals(str)) {
            return Integer.valueOf(this.m);
        }
        return super.getNodePropByKey(str);
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 6456471229575806289L) {
            this.m = i;
            this.n = this.m;
        } else if (j == -8352681166307095225L) {
            this.f = i;
        } else if (j == DXVIEWPAGER_ENABLELAZYLOAD) {
            if (i == 1) {
                z = true;
            }
            this.g = z;
        } else if (j == DXVIEWPAGER_PAGELIMITSIZE) {
            this.j = i;
        } else if (j == DXVIEWPAGER_FIXMULTINESTEDSCROLL_ANDROID) {
            if (i != 0) {
                z = true;
            }
            this.k = z;
        } else if (j == DXVIEWPAGER_ENABLESCROLL_ANDROID) {
            if (i != 0) {
                z = true;
            }
            this.l = z;
        } else if (j == DXVIEWPAGER_RECURSIVESEARCHRL) {
            if (i != 0) {
                z = true;
            }
            this.w = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == DXVIEWPAGER_PAGELIMITKEEPINDEXES ? "" : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != DXVIEWPAGER_PAGELIMITSIZE) {
            return super.getDefaultValueForIntAttr(j);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (!fqi.A()) {
            super.sendBroadcastEvent(dXEvent);
        } else {
            postEvent(dXEvent);
            List<DXWidgetNode> d = d();
            if (d == null || d.isEmpty() || (i = this.n) < 0 || i >= d.size()) {
                return;
            }
            d.get(this.n).sendBroadcastEvent(dXEvent);
        }
    }

    public void a(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae577a0", new Object[]{this, abVar});
        } else {
            this.u = abVar;
        }
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            a(i, z, 0);
        }
    }

    public void a(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621338a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (v instanceof DXNativeViewPagerView) {
            ((DXNativeViewPagerView) v).setCurrentItem(i, z, i2);
        } else if (!(v instanceof ViewPager)) {
        } else {
            ((ViewPager) v).setCurrentItem(i, z);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        SparseBooleanArray sparseBooleanArray = this.v;
        if (sparseBooleanArray == null) {
            return;
        }
        sparseBooleanArray.clear();
        this.v.put(this.n, true);
    }

    public void g() {
        HashSet hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            hashSet = new HashSet();
            if (this.h != null) {
                for (String str : this.h.split(",")) {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                }
            }
        } catch (Throwable unused) {
            hashSet = new HashSet();
        }
        this.i = hashSet;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.j;
    }

    public Set<Integer> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("d6a805f", new Object[]{this}) : this.i;
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else {
            a(i, str, DXMonitorConstant.DX_MONITOR_VIEWPAGER, DXMonitorConstant.DX_MONITOR_VIEWPAGER_ERROR);
        }
    }
}
