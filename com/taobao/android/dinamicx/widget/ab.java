package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.tab.DXOnTabChangeEvent;
import com.taobao.android.dinamicx.expression.event.tab.DXOnTabClickEvent;
import com.taobao.android.dinamicx.widget.viewpager.tab.view.DXTabItem;
import com.taobao.android.dinamicx.widget.viewpager.tab.view.DXTabLayout;
import com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.fuo;
import tb.fuw;
import tb.gbk;
import tb.kge;

/* loaded from: classes5.dex */
public class ab extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTABHEADERLAYOUT_DATASOURCE = -5948810534719014123L;
    public static final long DXTABHEADERLAYOUT_ENABLESCROLL = -8426770838617723422L;
    public static final long DXTABHEADERLAYOUT_INDICATORBOTTOMGAP = 1170909693104794716L;
    public static final long DXTABHEADERLAYOUT_INDICATORCOLOR = -5151416374116397110L;
    public static final long DXTABHEADERLAYOUT_INDICATORCOLORMAP = -9087820153495724821L;
    public static final long DXTABHEADERLAYOUT_INDICATORHEIGHT = -3761529437537503451L;
    public static final long DXTABHEADERLAYOUT_INDICATORIMAGEURL = 5400402516109499876L;
    public static final long DXTABHEADERLAYOUT_INDICATORRADIUS = -3394712782565958860L;
    public static final long DXTABHEADERLAYOUT_INDICATORWIDTH = -5149988469975039285L;
    public static final long DXTABHEADERLAYOUT_INDICATORZINDEX = -3104225124614969570L;
    public static final long DXTABHEADERLAYOUT_ITEMMATCHPARENTHEIGHT_ANDROID = -2388227689824506212L;
    public static final long DXTABHEADERLAYOUT_ITEMWIDTH = -5480582194049152328L;
    public static final long DXTABHEADERLAYOUT_LAZYLOADITEM = -8415387862592909349L;
    public static final long DXTABHEADERLAYOUT_ONCHANGE = 5288679823228297259L;
    public static final long DXTABHEADERLAYOUT_ONTABCLICK = 5327268914103406564L;
    public static final long DXTABHEADERLAYOUT_RELATEDCOMPONENTANIMATED = 1821589090930999503L;
    public static final long DXTABHEADERLAYOUT_RELATEDCOMPONENTID = -4472384284971071661L;
    public static final long DXTABHEADERLAYOUT_SELECTEDINDEX = 4437946449641611086L;
    public static final long DXTABHEADERLAYOUT_SHOWINDICATOR = -3765027987112450965L;
    public static final int DXTABHEADERLAYOUT_SHOWINDICATOR_FALSE = 1;
    public static final int DXTABHEADERLAYOUT_SHOWINDICATOR_TRUE = 0;
    public static final long DXTABHEADERLAYOUT_TABHEADERLAYOUT = 5297988424120091629L;
    private boolean A;
    private int b;
    private int c;
    private int d;
    private String e;
    private int f;
    private int g;
    private int i;
    private String j;
    private int l;
    private boolean m;
    private JSONObject n;
    private JSONObject o;
    private List<DXTabItem> q;
    private List<View> r;
    private List<View> s;
    private com.taobao.android.dinamicx.as t;
    private ag u;
    private TabLayout.c v;
    private TabLayout.b w;
    private int x;
    private ArrayList<DXWidgetNode> y;
    private Map<Integer, Boolean> z;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12035a = false;
    private int h = 1;
    private boolean k = false;
    private boolean p = false;

    static {
        kge.a(1633225574);
    }

    public static /* synthetic */ Object ipc$super(ab abVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 28626114:
                super.onEndParser();
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1524202196:
                return super.getNodePropByKey((String) objArr[0]);
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int a(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bae57793", new Object[]{abVar})).intValue() : abVar.x;
    }

    public static /* synthetic */ int a(ab abVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1c9ef56", new Object[]{abVar, new Integer(i)})).intValue();
        }
        abVar.x = i;
        return i;
    }

    public static /* synthetic */ void a(ab abVar, DXTabLayout dXTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90f4d3d", new Object[]{abVar, dXTabLayout});
        } else {
            abVar.b(dXTabLayout);
        }
    }

    public static /* synthetic */ JSONObject b(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1074d01f", new Object[]{abVar}) : abVar.n;
    }

    public static /* synthetic */ Map c(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("fd37e013", new Object[]{abVar}) : abVar.z;
    }

    public static /* synthetic */ ag d(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ag) ipChange.ipc$dispatch("c9d55c10", new Object[]{abVar}) : abVar.u;
    }

    public static /* synthetic */ com.taobao.android.dinamicx.as e(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.as) ipChange.ipc$dispatch("f1a34244", new Object[]{abVar}) : abVar.t;
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.al
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX.equals(str)) {
            return Integer.valueOf(this.x);
        }
        return super.getNodePropByKey(str);
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(151591997);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ab();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ab();
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof ab)) {
        } else {
            super.onClone(dXWidgetNode, z);
            ab abVar = (ab) dXWidgetNode;
            this.b = abVar.b;
            this.c = abVar.c;
            this.d = abVar.d;
            this.e = abVar.e;
            this.f = abVar.f;
            this.g = abVar.g;
            this.h = abVar.h;
            this.i = abVar.i;
            this.j = abVar.j;
            this.k = abVar.k;
            this.l = abVar.l;
            this.m = abVar.m;
            this.t = abVar.t;
            this.r = abVar.r;
            this.s = abVar.s;
            this.q = abVar.q;
            this.x = abVar.x;
            this.z = abVar.z;
            this.y = abVar.y;
            this.w = abVar.w;
            this.v = abVar.v;
            this.u = abVar.u;
            this.n = abVar.n;
            this.o = abVar.o;
            this.f12035a = abVar.f12035a;
            this.p = abVar.p;
            this.A = abVar.A;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXTabLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        if (getChildren() != null && this.originItems == null) {
            if (!bx.o()) {
                this.originItems = new ArrayList();
                this.originItems.addAll(getChildren());
            } else if (this.originInfo != null && this.originInfo.f12081a != null) {
                this.originItems = this.originInfo.f12081a.getChildren();
            }
        }
        if (this.z == null) {
            this.z = new HashMap();
        }
        if ((this.propertyInitFlag & 2) == 0) {
            return;
        }
        if (this.listData == null || this.listData.isEmpty() || getChildren() == null) {
            removeAllChild();
            return;
        }
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.originItems.size(); i++) {
            arrayList.add(this.originItems.get(i).deepClone(getDXRuntimeContext()));
        }
        ArrayList<DXWidgetNode> generateWidgetNodeByData = generateWidgetNodeByData(0, getListData(), arrayList);
        this.y = new ArrayList<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.y.add((DXWidgetNode) arrayList.get(i2));
        }
        for (int i3 = 0; i3 < generateWidgetNodeByData.size(); i3++) {
            this.y.add(generateWidgetNodeByData.get(i3));
        }
        removeAllChild();
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXWidgetNode I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof DXTabLayout) || (I = getDXRuntimeContext().I()) == null) {
            return;
        }
        final DXTabLayout dXTabLayout = (DXTabLayout) view;
        dXTabLayout.clearOnTabClickListeners();
        dXTabLayout.clearOnTabSelectedListeners();
        dXTabLayout.setViewPagerSmoothScroll(this.k);
        c(dXTabLayout);
        a(dXTabLayout);
        this.v = new TabLayout.c() { // from class: com.taobao.android.dinamicx.widget.ab.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
            public void a(TabLayout.e eVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("72ab2ec3", new Object[]{this, eVar, new Integer(i)});
                    return;
                }
                int a2 = ab.a(ab.this);
                int c = eVar.c();
                if (eVar.a() == null) {
                    return;
                }
                ((DXTabItem) eVar.a()).setSelected(true);
                ab.a(ab.this, c);
                if (ab.b(ab.this) != null) {
                    ab.a(ab.this, dXTabLayout);
                }
                ab abVar = ab.this;
                if (abVar == null) {
                    return;
                }
                JSONArray listData = abVar.getListData();
                boolean booleanValue = ab.c(ab.this).containsKey(Integer.valueOf(c)) ? ((Boolean) ab.c(ab.this).get(Integer.valueOf(c))).booleanValue() : false;
                if (!booleanValue) {
                    ab.c(ab.this).put(Integer.valueOf(c), Boolean.valueOf(!booleanValue));
                }
                JSONObject jSONObject = null;
                if (listData != null && listData.size() > c) {
                    jSONObject = listData.getJSONObject(c);
                }
                abVar.postEvent(new DXOnTabChangeEvent(c, a2, jSONObject, !booleanValue, eVar.e(), i));
            }

            @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
            public void a(TabLayout.e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f32ecc40", new Object[]{this, eVar});
                } else if (eVar.a() == null) {
                } else {
                    ((DXTabItem) eVar.a()).setSelected(false);
                }
            }

            @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.c
            public void b(TabLayout.e eVar, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("39b715c4", new Object[]{this, eVar, new Integer(i)});
                    return;
                }
                int c = eVar.c();
                if (eVar.a() == null || ab.d(ab.this) == null) {
                    return;
                }
                ab.d(ab.this).a(c, false, i);
            }
        };
        dXTabLayout.addOnTabSelectedListener(this.v);
        TabLayout.b bVar = this.w;
        if (bVar != null) {
            dXTabLayout.removeOnTabClickListener(bVar);
        }
        this.w = new TabLayout.b() { // from class: com.taobao.android.dinamicx.widget.ab.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.widget.viewpager.tab.view.TabLayout.b
            public void a(TabLayout.e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f32ecc40", new Object[]{this, eVar});
                    return;
                }
                int c = eVar.c();
                ab abVar = ab.this;
                if (abVar == null) {
                    return;
                }
                JSONArray listData = abVar.getListData();
                abVar.postEvent(new DXOnTabClickEvent(c, ab.a(ab.this), listData == null ? null : listData.getJSONObject(c)));
            }
        };
        dXTabLayout.addOnTabClickListener(this.w);
        this.u = (ag) I.queryWidgetNodeByUserId(this.j);
        ag agVar = this.u;
        if (agVar == null) {
            return;
        }
        agVar.a(this);
        if (this.u.getDXRuntimeContext().v() == null) {
            return;
        }
        fuw.a("DXTabHeaderLayoutWidgetNode", "触发重新绑定");
        a(this.u);
    }

    private void a(DXTabLayout dXTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43410375", new Object[]{this, dXTabLayout});
            return;
        }
        d();
        if (this.m) {
            b(dXTabLayout);
            dXTabLayout.setSelectedTabIndicatorHeight(this.d);
            dXTabLayout.setSelectedTabIndicatorWidth(this.g);
            dXTabLayout.setSelectedTabIndicatorRadius(this.f);
            dXTabLayout.setSelectedTabIndicatorBottomGap(this.b);
            dXTabLayout.setSelectedTabIndicatorZIndex(this.h);
            return;
        }
        b(dXTabLayout);
        dXTabLayout.setSelectedTabIndicatorHeight(this.d);
    }

    private void b(DXTabLayout dXTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58bb854", new Object[]{this, dXTabLayout});
        } else if (this.m) {
            if (this.n == null) {
                dXTabLayout.setSelectedTabIndicatorColor(this.c);
                return;
            }
            String valueOf = String.valueOf(this.x);
            if (this.n.containsKey(valueOf)) {
                dXTabLayout.setSelectedTabIndicatorColor(this.n.getInteger(valueOf).intValue());
            } else {
                dXTabLayout.setSelectedTabIndicatorColor(this.c);
            }
        } else {
            dXTabLayout.setSelectedTabIndicatorColor(0);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        } else {
            super.onEndParser();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.o != null && this.y != null) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : this.o.entrySet()) {
                try {
                    String key = entry.getKey();
                    if (!StringUtils.isEmpty(key)) {
                        int i = 0;
                        while (true) {
                            if (i >= this.y.size()) {
                                break;
                            } else if (key.equals(this.y.get(i).getUserId())) {
                                jSONObject.put(String.valueOf(i / 2), (Object) Integer.valueOf(Color.parseColor(String.valueOf(entry.getValue()))));
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                } catch (Exception e) {
                    com.taobao.android.dinamicx.exception.a.b(e);
                }
            }
            this.n = jSONObject;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0204  */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(com.taobao.android.dinamicx.widget.viewpager.tab.view.DXTabLayout r29) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.ab.c(com.taobao.android.dinamicx.widget.viewpager.tab.view.DXTabLayout):void");
    }

    public void a(ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae7bd7b", new Object[]{this, agVar});
            return;
        }
        DXTabLayout dXTabLayout = (DXTabLayout) getDXRuntimeContext().v();
        if (dXTabLayout == null) {
            return;
        }
        if (agVar instanceof ag) {
            dXTabLayout.setupWithViewPager((ViewPager) agVar.getDXRuntimeContext().v());
        }
        if (agVar == null || agVar.d() == null) {
            return;
        }
        int size = agVar.d().size();
        for (int i = 0; i < size; i++) {
            TabLayout.e tabAt = dXTabLayout.getTabAt(i);
            if (i == this.x) {
                if (i >= this.q.size()) {
                    break;
                }
                DXTabItem dXTabItem = this.q.get(i);
                dXTabItem.setSelected(true);
                tabAt.a(dXTabItem);
                fuw.a("DXTabHeaderLayoutWidgetNode", "bindViewPager set " + i + " view " + tabAt.a());
            } else if (i >= this.q.size()) {
                break;
            } else {
                DXTabItem dXTabItem2 = this.q.get(i);
                dXTabItem2.setSelected(false);
                tabAt.a(dXTabItem2);
                fuw.a("DXTabHeaderLayoutWidgetNode", "bindViewPager set " + i + " view " + tabAt.a());
            }
        }
        int i2 = this.x;
        if (i2 != 0) {
            this.u.a(i2, false, 1);
        } else {
            this.z.put(0, true);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.t == null) {
            this.t = new com.taobao.android.dinamicx.as(getDXRuntimeContext().C(), 3, UUID.randomUUID().toString());
        }
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (fuo.DX_PARSER_LISTDATA == j) {
            setListData(jSONArray);
            setStatFlag(2);
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTABHEADERLAYOUT_INDICATORIMAGEURL) {
            this.e = str;
        } else if (j == DXTABHEADERLAYOUT_RELATEDCOMPONENTID) {
            this.j = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j != DXTABHEADERLAYOUT_INDICATORCOLORMAP) {
            super.onSetMapAttribute(j, jSONObject);
        } else if (jSONObject == null) {
        } else {
            this.o = jSONObject;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTABHEADERLAYOUT_INDICATORBOTTOMGAP) {
            if (i <= 0) {
                this.b = 0;
            } else {
                this.b = i;
            }
        } else if (j == -5151416374116397110L) {
            this.c = i;
        } else if (j == DXTABHEADERLAYOUT_INDICATORHEIGHT) {
            if (i <= 0) {
                this.d = 0;
            } else {
                this.d = i;
            }
        } else if (j == DXTABHEADERLAYOUT_INDICATORRADIUS) {
            if (i <= 0) {
                this.f = 0;
            } else {
                this.f = i;
            }
        } else if (j == DXTABHEADERLAYOUT_INDICATORWIDTH) {
            if (i <= 0) {
                this.g = 0;
            } else {
                this.g = i;
            }
        } else if (j == -5480582194049152328L) {
            if (i <= 0) {
                this.i = 0;
            } else {
                this.i = i;
            }
        } else if (j == DXTABHEADERLAYOUT_SELECTEDINDEX) {
            if (i <= 0) {
                this.l = 0;
            } else {
                this.l = i;
            }
            this.x = this.l;
        } else if (j == -3765027987112450965L) {
            if (i != 1) {
                z = false;
            }
            this.m = z;
        } else if (j == DXTABHEADERLAYOUT_ENABLESCROLL) {
            if (i == 0) {
                z = false;
            }
            this.f12035a = z;
        } else if (j == DXTABHEADERLAYOUT_INDICATORZINDEX) {
            this.h = i;
        } else if (j == DXTABHEADERLAYOUT_RELATEDCOMPONENTANIMATED) {
            if (i == 0) {
                z = false;
            }
            this.k = z;
        } else if (j == DXTABHEADERLAYOUT_ITEMMATCHPARENTHEIGHT_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.p = z;
        } else if (j == DXTABHEADERLAYOUT_LAZYLOADITEM) {
            if (i == 0) {
                z = false;
            }
            this.A = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTABHEADERLAYOUT_ENABLESCROLL) {
            return 0;
        }
        if (j == DXTABHEADERLAYOUT_INDICATORZINDEX) {
            return 1;
        }
        if (j != DXTABHEADERLAYOUT_RELATEDCOMPONENTANIMATED && j != DXTABHEADERLAYOUT_ITEMMATCHPARENTHEIGHT_ANDROID) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Map<Integer, Boolean> map = this.z;
        if (map == null) {
            this.z = new HashMap();
            return;
        }
        map.clear();
        this.z.put(Integer.valueOf(this.x), true);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f12035a;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (dXEvent == null) {
        } else {
            if (getReferenceNode() != null && isSelfResponseEvent()) {
                postEvent(dXEvent);
            }
            ArrayList<DXWidgetNode> arrayList = this.y;
            if (arrayList == null) {
                return;
            }
            Iterator<DXWidgetNode> it = arrayList.iterator();
            while (it.hasNext()) {
                DXWidgetNode next = it.next();
                if (isChildResponseEvent()) {
                    next.sendBroadcastEvent(dXEvent);
                }
            }
        }
    }

    public List<DXWidgetNode> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.y;
    }

    private gbk e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbk) ipChange.ipc$dispatch("2dcb89aa", new Object[]{this});
        }
        if (this.y == null) {
            return null;
        }
        for (int i = 0; i < this.y.size(); i++) {
            gbk gbkVar = (gbk) this.y.get(i);
            if (gbkVar.a()) {
                return gbkVar;
            }
        }
        return null;
    }
}
