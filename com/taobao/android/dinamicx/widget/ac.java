package com.taobao.android.dinamicx.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.model.DXJSONObjectForVM;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fwx;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class ac extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTEMPLATE_ASPECTRATIO = 7594222789952419722L;
    public static final long DXTEMPLATE_BINDSLOT = 1454898352104842311L;
    public static final long DXTEMPLATE_CELLTYPE = 1744786664651967082L;
    public static final long DXTEMPLATE_COLSPAN = 4730601489860228727L;
    public static final long DXTEMPLATE_HASPARAMS = -1664973152736847703L;
    public static final long DXTEMPLATE_HASSLOT = 4914428794176997221L;
    public static final long DXTEMPLATE_IF = 795925;
    public static final int DXTEMPLATE_IF_FALSE = 0;
    public static final int DXTEMPLATE_IF_TRUE = 1;
    public static final long DXTEMPLATE_I_F = 754805;
    public static final long DXTEMPLATE_NAME = 36442092789L;
    public static final long DXTEMPLATE_NEEDRESETSTICKYHEIGHT_ANDROID = -714078668611843156L;
    public static final long DXTEMPLATE_ONSTICKYCHANGE = 2228800223520853672L;
    public static final long DXTEMPLATE_REUSEIDENTIFIER = 7681326167334452278L;
    public static final long DXTEMPLATE_SLOTID = 10150200245776565L;
    public static final long DXTEMPLATE_STICKY = 10152462037879005L;
    public static final long DXTEMPLATE_STICKYOFFSET = 2669229465858660874L;
    public static final int DXTEMPLATE_STICKY_FALSE = 0;
    public static final int DXTEMPLATE_STICKY_TRUE = 1;
    public static final long DXTEMPLATE_TEMPLATE = -2672413305820574652L;
    public static final long DXTEMPLATE_UNIQUEID = 7055731275164326220L;
    public static final long DXTEMPLATE_URL = 528128262;
    public static final long DXTEMPLATE_VERSION = 5435381891761953165L;
    public static final long DXTEMPLATE__SLOTINFOLIST = 7864077457524918358L;
    public static final long DXTEMPLATE__TEMPLATEDATA = 324196793780517186L;
    public static final long DXTEMPLATE__TEMPLATEDATAV4 = -1939491623719046706L;
    public static final long DXTEMPLATE___STORAGETYPE = -4416109363904538046L;
    public static final int STORAGE_TYPE_RESULT_TYPE_CONSTANT_DESCRIPTION = 2;
    public static final int STORAGE_TYPE_RESULT_TYPE_DYNAMIC_DESCRIPTION = 3;
    public static final int STORAGE_TYPE_RESULT_TYPE_INLINE = 1;
    private static com.taobao.android.dinamicx.ai x;
    private String A;

    /* renamed from: a  reason: collision with root package name */
    public int f12039a;
    private String b;
    private int c;
    private String e;
    private int f;
    private int g;
    private String h;
    private String i;
    private int j;
    private com.taobao.analysis.v3.h k;
    private String l;
    private int m;
    private boolean n;
    private String o;
    private JSONObject p;
    private JSONArray q;
    private JSONObject r;
    private JSONObject s;
    private List<String> t;
    private boolean u;
    private String v;
    private boolean w;
    private boolean y;
    private int d = 1;
    private double z = mto.a.GEO_NOT_SUPPORT;

    public static /* synthetic */ Object ipc$super(ac acVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -1070855414:
                super.setDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
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

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 6;
    }

    static {
        kge.a(363107692);
        x = new com.taobao.android.dinamicx.ai();
    }

    public ac() {
        this.disableFlatten = true;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1614462909);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ac();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ac();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
        } else {
            super.onBeforeBindChildData();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof ac)) {
        } else {
            super.onClone(dXWidgetNode, z);
            ac acVar = (ac) dXWidgetNode;
            this.b = acVar.b;
            this.c = acVar.c;
            this.d = acVar.d;
            this.e = acVar.e;
            this.f = acVar.f;
            this.g = acVar.g;
            this.h = acVar.h;
            this.i = acVar.i;
            this.j = acVar.j;
            this.k = acVar.k;
            this.p = acVar.p;
            this.s = acVar.s;
            this.t = acVar.t;
            this.l = acVar.l;
            this.m = acVar.m;
            this.n = acVar.n;
            this.o = acVar.o;
            this.q = acVar.q;
            this.r = acVar.r;
            this.u = acVar.u;
            this.v = acVar.v;
            this.f12039a = acVar.f12039a;
            this.w = acVar.w;
            this.z = acVar.z;
            this.A = acVar.A;
        }
    }

    public double u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686426a", new Object[]{this})).doubleValue() : this.z;
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXRootView s;
        DXNestedScrollerView dxNestedScrollerView;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (getDXRuntimeContext() == null || (s = getDXRuntimeContext().s()) == null || (dxNestedScrollerView = s.getDxNestedScrollerView(getDXRuntimeContext())) == null) {
            return;
        }
        if (c()) {
            int measuredHeight = getMeasuredHeight() + this.g;
            if (!com.taobao.android.dinamicx.model.f.g() || !this.dXRuntimeContext.G()) {
                z = false;
            }
            dxNestedScrollerView.setStickyHeight(measuredHeight, z);
        } else if (!this.w) {
        } else {
            dxNestedScrollerView.resetStickyHeight();
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
        } else {
            super.onMeasure(i, i2);
        }
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        } else if (dXRuntimeContext == null) {
        } else {
            Object obj = null;
            if (z) {
                obj = this.dXRuntimeContext.f();
                i = this.dXRuntimeContext.i();
            } else {
                i = 0;
            }
            if (this.dXRuntimeContext != dXRuntimeContext) {
                Map<String, com.taobao.android.dinamicx.expression.expr_v2.f> g = this.dXRuntimeContext.g();
                this.dXRuntimeContext = dXRuntimeContext.a((DXWidgetNode) this);
                this.dXRuntimeContext.a(g);
                if (z) {
                    this.dXRuntimeContext.a(obj);
                    this.dXRuntimeContext.b(i);
                }
            }
            DXWidgetNode childAt = getChildAt(0);
            if (childAt != null && childAt.getDXRuntimeContext() != null) {
                DXRuntimeContext a2 = childAt.getDXRuntimeContext().a(childAt);
                a2.a(dXRuntimeContext);
                if (a2 != null && (a2.s() == null || a2.s() != dXRuntimeContext.s())) {
                    a2.a(dXRuntimeContext.s());
                }
                if (obj instanceof JSONObject) {
                    a2.a((JSONObject) obj);
                } else if (dXRuntimeContext.O() && (dXRuntimeContext.f() instanceof Object)) {
                    DXJSONObjectForVM dXJSONObjectForVM = new DXJSONObjectForVM();
                    dXJSONObjectForVM.setData(dXRuntimeContext.f());
                    a2.a((JSONObject) dXJSONObjectForVM);
                }
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f11925a = this.e;
                dXTemplateItem.b = Long.parseLong(this.i);
                a2.a(dXTemplateItem);
                childAt.bindRuntimeContext(a2, z);
                return;
            }
            fuw.d("DinamicX", "template deepCopyChildNode child or child runtimeContext is null!!!");
        }
    }

    public DXWidgetNode a(DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f6ee1cf8", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) shallowClone(dXRuntimeContext, true);
        dXWidgetNode.setSourceWidget(getSourceWidget());
        n.b(dXWidgetNode);
        if (!j() && (childAt = getChildAt(0)) != null && childAt.getDXRuntimeContext() != null) {
            DXRuntimeContext a2 = childAt.getDXRuntimeContext().a(childAt);
            if (dXRuntimeContext.f() instanceof JSONObject) {
                a2.a((JSONObject) dXRuntimeContext.f());
            } else if (dXRuntimeContext.O() && (dXRuntimeContext.f() instanceof Object)) {
                DXJSONObjectForVM dXJSONObjectForVM = new DXJSONObjectForVM();
                dXJSONObjectForVM.setData(dXRuntimeContext.f());
                a2.a((JSONObject) dXJSONObjectForVM);
            }
            if (a2.f() == null) {
                a2.a(dXRuntimeContext.f());
            }
            a2.b(dXRuntimeContext.i());
            dXWidgetNode.addChild(n.a(childAt, a2, false), false);
        }
        return dXWidgetNode;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object shallowClone(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("10620bbf", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        }
        DXWidgetNode build = build(null);
        if (build == null) {
            return null;
        }
        if (dXRuntimeContext != null) {
            build.dXRuntimeContext = dXRuntimeContext.a(build);
        }
        build.onClone(this, z);
        return build;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void updateRefreshType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22ac2b0", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.dXRuntimeContext != null) {
            this.dXRuntimeContext.d(i);
        }
        if (getChildrenCount() <= 0) {
            return;
        }
        for (DXWidgetNode dXWidgetNode : this.children) {
            dXWidgetNode.updateRefreshType(i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTEMPLATE_CELLTYPE) {
            this.b = str;
        } else if (j == DXTEMPLATE_NAME) {
            this.e = str;
        } else if (j == 528128262) {
            this.h = str;
        } else if (j == 5435381891761953165L) {
            this.i = str;
        } else if (j == DXTEMPLATE_BINDSLOT) {
            this.l = str;
        } else if (j == DXTEMPLATE_SLOTID) {
            this.o = str;
        } else if (j == DXTEMPLATE_REUSEIDENTIFIER) {
            this.v = str;
        } else if (j == DXTEMPLATE_UNIQUEID) {
            this.A = str;
        } else if (j != DXTEMPLATE__TEMPLATEDATAV4) {
            super.onSetStringAttribute(j, str);
        } else if (str == null) {
            onSetMapAttribute(DXTEMPLATE__TEMPLATEDATA, null);
        } else {
            onSetMapAttribute(DXTEMPLATE__TEMPLATEDATA, JSON.parseObject(str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == DXTEMPLATE__SLOTINFOLIST) {
            this.q = jSONArray;
            this.r = fwx.a(this.q);
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode deepClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("442ee468", new Object[]{this, dXRuntimeContext}) : a(dXRuntimeContext, false);
    }

    public DXWidgetNode a(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("77bd933a", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) shallowClone(dXRuntimeContext, true);
        DXRuntimeContext a2 = dXRuntimeContext.a((DXWidgetNode) this);
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = this.e;
        try {
            if (!StringUtils.isEmpty(this.i)) {
                dXTemplateItem.b = Long.valueOf(this.i).longValue();
            }
        } catch (NumberFormatException e) {
            com.taobao.android.dinamicx.exception.a.b(e);
        }
        dXTemplateItem.c = this.h;
        if (isV4Node() && getChildrenCount() > 0 && e() == 2) {
            DXWidgetNode childAt = getChildAt(0);
            if (childAt != null) {
                com.taobao.android.dinamicx.template.download.f fVar = new com.taobao.android.dinamicx.template.download.f();
                fVar.f11934a = childAt.getDXRuntimeContext().c().g.f11934a;
                fVar.b = childAt.getDXRuntimeContext().c().g.b;
                dXTemplateItem.g = fVar;
                DinamicXEngine.j();
            }
        } else if (dXRuntimeContext.c() != null && dXRuntimeContext.c().g != null) {
            com.taobao.android.dinamicx.template.download.f fVar2 = new com.taobao.android.dinamicx.template.download.f();
            fVar2.f11934a = dXRuntimeContext.c().g.f11934a;
            fVar2.b = dXRuntimeContext.c().g.b;
            dXTemplateItem.g = fVar2;
            DinamicXEngine.j();
        }
        a2.a(dXTemplateItem);
        if (this.children != null) {
            dXWidgetNode.children = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                if (z) {
                    dXWidgetNode.addChild(this.children.get(i).deepCloneForEmbed(a2), false);
                } else {
                    dXWidgetNode.addChild(this.children.get(i).deepClone(a2), false);
                }
            }
        }
        return dXWidgetNode;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode deepCloneForEmbed(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("5042318", new Object[]{this, dXRuntimeContext}) : a(dXRuntimeContext, true);
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTEMPLATE___STORAGETYPE) {
            fuw.a("onSetIntAttribute");
            this.j = i;
        } else if (j == 4730601489860228727L) {
            this.c = i;
        } else if (j == DXTEMPLATE_IF || j == 754805) {
            this.d = i;
        } else if (j == DXTEMPLATE_STICKY) {
            this.f = i;
        } else if (j == DXTEMPLATE_STICKYOFFSET) {
            this.g = i;
        } else if (j == DXTEMPLATE_HASPARAMS) {
            this.m = i;
        } else if (j == DXTEMPLATE_HASSLOT) {
            if (i == 1) {
                z = true;
            }
            this.n = z;
        } else if (j == DXTEMPLATE_NEEDRESETSTICKYHEIGHT_ANDROID) {
            if (i == 1) {
                z = true;
            }
            this.w = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXTEMPLATE__TEMPLATEDATA) {
            b(jSONObject);
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        this.s = null;
        this.t = null;
        if (jSONObject == null) {
            return;
        }
        this.p = jSONObject;
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        DXEvent dXEvent = new DXEvent(2228800223520853672L);
        HashMap hashMap = new HashMap();
        hashMap.put("index", com.taobao.android.dinamicx.expression.expr_v2.f.a(i));
        hashMap.put("sticky", com.taobao.android.dinamicx.expression.expr_v2.f.a(z));
        dXEvent.setArgs(hashMap);
        postEvent(dXEvent);
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (j() && getChildrenCount() <= 0) {
                if (!StringUtils.isEmpty(this.o)) {
                    b();
                }
                removeAllChild();
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f11925a = f();
                if (!StringUtils.isEmpty(h())) {
                    dXTemplateItem.b = Long.parseLong(h());
                }
                dXTemplateItem.c = g();
                com.taobao.android.dinamicx.ai t = t();
                if (t == null) {
                    return;
                }
                com.taobao.android.dinamicx.aw a2 = t.a(getDXRuntimeContext());
                if (a2 == null) {
                    fux.b("dxRemoteChildTemplateManager.getTemplateManger(getDXRuntimeContext()) == null");
                }
                DXTemplateItem a3 = t.a(a2, dXTemplateItem);
                if (t.a(a3, dXTemplateItem)) {
                    DXWidgetNode a4 = t.a(a3, getDXRuntimeContext(), a2, i);
                    if (a4 != null) {
                        addChild(a4, false);
                        return;
                    }
                    fux.b("同步获取模版失败" + dXTemplateItem.b());
                    return;
                }
                if (a3 != null) {
                    DXWidgetNode a5 = t.a(a3, getDXRuntimeContext(), a2, i);
                    if (a5 != null) {
                        addChild(a5, false);
                    } else {
                        fux.b("同步获取模版失败" + dXTemplateItem.b());
                    }
                }
                DXEngineConfig a6 = getDXRuntimeContext().C().a();
                if ((a6 == null ? 1 : a6.r()) == 1) {
                    t.a(dXTemplateItem, getDXRuntimeContext(), this, a2);
                } else {
                    t.a(dXTemplateItem, getDXRuntimeContext(), this, a2, i);
                }
            }
        } catch (Throwable th) {
            if (!DinamicXEngine.j()) {
                return;
            }
            th.printStackTrace();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.u && DinamicXEngine.j()) {
            fuw.b("hasProcessContainsSlotIdTemplate: " + o());
        }
        JSONObject a2 = a(this);
        if (a2 != null) {
            this.e = fwx.a(getDXRuntimeContext(), "name", a2);
            this.i = fwx.a(getDXRuntimeContext(), "version", a2);
            this.h = fwx.a(getDXRuntimeContext(), "url", a2);
            this.p = a2;
        }
        this.u = true;
    }

    private JSONObject a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("47a1c2e7", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
        if (queryRootWidgetNode == null || !(queryRootWidgetNode.parentWidget instanceof ac)) {
            fuw.b("坑位 " + this.o + " 发生错误 找不到slot信息");
            return null;
        }
        ac acVar = (ac) queryRootWidgetNode.parentWidget;
        JSONObject jSONObject = acVar.r;
        if (jSONObject != null) {
            String f = getDXRuntimeContext().c().f();
            JSONObject jSONObject2 = jSONObject.getJSONObject(f);
            if (jSONObject2 == null) {
                fux.b("对应的父节点 " + f + "找不到slot信息");
                return null;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(this.o);
            if (jSONObject3 == null) {
                fux.b("对应的slotId " + this.o + " 找不到slot信息");
            }
            fuw.a("找到slot信息" + JSON.toJSONString(jSONObject3));
            return jSONObject3;
        }
        return a(acVar);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeginParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f4e04", new Object[]{this, new Boolean(z)});
            return;
        }
        this.s = null;
        this.t = null;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f == 1;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c > 1 || c();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.j;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.h;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.i;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.g;
    }

    private com.taobao.android.dinamicx.ai t() {
        DXTemplateItem dxTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.ai) ipChange.ipc$dispatch("ae8374f", new Object[]{this});
        }
        if (fqi.I()) {
            return x;
        }
        if (getDXRuntimeContext() == null || getDXRuntimeContext().C() == null || getDXRuntimeContext().C().b() == null) {
            return null;
        }
        DinamicXEngine b = getDXRuntimeContext().C().b();
        DXRootView s = getDXRuntimeContext().s();
        if (s == null || (dxTemplateItem = s.getDxTemplateItem()) == null) {
            return null;
        }
        com.taobao.android.dinamicx.ai aiVar = b.t().get(dxTemplateItem.b());
        if (aiVar != null) {
            return aiVar;
        }
        com.taobao.android.dinamicx.ai aiVar2 = new com.taobao.android.dinamicx.ai();
        b.t().put(dxTemplateItem.b(), aiVar2);
        return aiVar2;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02c0b0a", new Object[]{this, new Long(j), new Double(d)});
        } else if (7594222789952419722L == j) {
            this.z = d;
        } else {
            super.setDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void processUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410f1b9c", new Object[]{this});
        } else if (StringUtils.isEmpty(this.userId)) {
        } else {
            DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
            if (!(queryRootWidgetNode instanceof m)) {
                return;
            }
            Map<String, WeakReference<DXWidgetNode>> dxUserIdMap = ((m) queryRootWidgetNode).getDxUserIdMap();
            WeakReference<DXWidgetNode> weakReference = dxUserIdMap.get(this.userId);
            if (weakReference != null) {
                DXWidgetNode dXWidgetNode = weakReference.get();
                if (dXWidgetNode == null || !(getParentWidget() instanceof DXAbsContainerBaseLayout)) {
                    return;
                }
                DXAbsContainerBaseLayout dXAbsContainerBaseLayout = (DXAbsContainerBaseLayout) getParentWidget();
                if (dXAbsContainerBaseLayout.d() != null && dXAbsContainerBaseLayout.d().indexOf(dXWidgetNode) != -1) {
                    return;
                }
                dxUserIdMap.put(this.userId, new WeakReference<>(this));
                return;
            }
            dxUserIdMap.put(this.userId, new WeakReference<>(this));
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.j == 3;
    }

    public com.taobao.analysis.v3.h k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.analysis.v3.h) ipChange.ipc$dispatch("141def3d", new Object[]{this}) : this.k;
    }

    public void a(com.taobao.analysis.v3.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d506d41", new Object[]{this, hVar});
        } else {
            this.k = hVar;
        }
    }

    public JSONObject l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("48d58e13", new Object[]{this}) : this.p;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this}) : this.s;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.s = jSONObject;
        }
    }

    public List<String> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("25adebb2", new Object[]{this}) : this.t;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        return this.e + "_" + this.i;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.n;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : this.o;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.v;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f12039a = i;
        }
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : c() || this.y;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != DXTEMPLATE_IF && j != 754805) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 1;
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == ac.class;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this}) : this.A;
    }
}
