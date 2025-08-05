package com.taobao.android.dinamicx;

import android.content.Context;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bj;
import com.taobao.android.dinamicx.widget.bk;
import com.taobao.android.dinamicx.widget.bm;
import com.taobao.android.dinamicx.widget.bn;
import com.taobao.android.dinamicx.widget.bo;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import tb.fpy;
import tb.fqb;
import tb.fqp;
import tb.fux;
import tb.fva;
import tb.fvd;
import tb.gbg;
import tb.gff;
import tb.ghc;
import tb.ghh;
import tb.ivg;
import tb.ivh;
import tb.ivk;
import tb.kge;

/* loaded from: classes5.dex */
public class bo extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ax c;
    public al d;
    public aw e;
    public gff f;
    public ghh g;

    static {
        kge.a(-692006903);
    }

    public static /* synthetic */ Object ipc$super(bo boVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public bo(r rVar, aw awVar) {
        super(rVar);
        this.c = new ax();
        this.d = new al();
        this.e = awVar;
        this.g = new ghh();
        this.f = new gff((ghc) null, this.c);
    }

    public DXResult<DXRootView> a(Context context, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("1bd33d78", new Object[]{this, context, dXTemplateItem});
        }
        DXButterRootView dXButterRootView = new DXButterRootView(context);
        dXButterRootView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        dXButterRootView.setDxTemplateItem(dXTemplateItem);
        dXButterRootView.setBindingXManagerWeakReference(this.b.b().i);
        return new DXResult<>(dXButterRootView);
    }

    public DXResult<DXRootView> a(DXRootView dXRootView, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        DXResult<DXRootView> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("a750b56a", new Object[]{this, dXRootView, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        if (dXRootView == null) {
            return null;
        }
        fux.b("开始渲染 tpl: " + dXRuntimeContext.K() + " renderType: " + dXRenderOptions.g() + " isControlEvent: " + dXRenderOptions.e());
        a(dXRootView);
        dXRootView.data = dXRuntimeContext.e();
        dXRootView.setPosition(i);
        dXRootView.parentWidthSpec = dXRenderOptions.a();
        dXRootView.parentHeightSpec = dXRenderOptions.b();
        dXRootView.dxTemplateItem = dXRuntimeContext.c();
        if (dXRenderOptions.p() && dXRootView.getChildCount() == 0 && dXRenderOptions.g() == 0 && (a2 = a((DXButterRootView) dXRootView, dXRuntimeContext, i)) != null) {
            if (DinamicXEngine.j() || bx.i()) {
                Log.e("DinamicX", "命中 preRenderX" + dXRuntimeContext.c());
            }
            a2.a(2);
            return a2;
        }
        View a3 = a((DXButterRootView) dXRootView, dXRuntimeContext, dXRenderOptions);
        DXResult<DXRootView> dXResult = new DXResult<>();
        if (a3 instanceof DXRootView) {
            dXResult.a((DXResult<DXRootView>) ((DXRootView) a3));
        }
        dXResult.a(dXRuntimeContext.n());
        return dXResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0195, code lost:
        if (r26.o() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0273, code lost:
        if (r26.o() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0275, code lost:
        com.taobao.android.dinamicx.monitor.b.a(r26.n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x027c, code lost:
        return r25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View a(com.taobao.android.dinamicx.DXButterRootView r25, com.taobao.android.dinamicx.DXRuntimeContext r26, com.taobao.android.dinamicx.DXRenderOptions r27) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.bo.a(com.taobao.android.dinamicx.DXButterRootView, com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.DXRenderOptions):android.view.View");
    }

    private void a(DXButterRootView dXButterRootView, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed99486", new Object[]{this, dXButterRootView, dXWidgetNode});
            return;
        }
        ViewGroup.LayoutParams layoutParams = dXButterRootView.getLayoutParams();
        if (layoutParams == null) {
            dXButterRootView.setLayoutParams(new ViewGroup.LayoutParams(dXWidgetNode.getLayoutWidth(), dXWidgetNode.getLayoutHeight()));
            return;
        }
        layoutParams.width = dXWidgetNode.getLayoutWidth();
        layoutParams.height = dXWidgetNode.getLayoutHeight();
    }

    private DXWidgetNode a(DXRuntimeContext dXRuntimeContext, DXButterRootView dXButterRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("443f8a99", new Object[]{this, dXRuntimeContext, dXButterRootView});
        }
        DXWidgetNode expandWidgetNode = dXButterRootView.getExpandWidgetNode();
        if (expandWidgetNode != null) {
            return expandWidgetNode;
        }
        DXTraceUtil.a("DX-Choreographer-BinaryLoader");
        DXWidgetNode a2 = this.e.a(dXRuntimeContext);
        if (a2 == null) {
            a(dXRuntimeContext.n(), DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_RENDER, 40002, "获取原型树失败", null, false);
            fux.b("40002获取原型树失败");
            return null;
        }
        DXWidgetNode shallowButterClone = a2.shallowButterClone(dXRuntimeContext);
        dXButterRootView.setWidgetNode(shallowButterClone);
        DXTraceUtil.a();
        return shallowButterClone;
    }

    public void a(DXWidgetNode dXWidgetNode, ViewGroup viewGroup, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a861e19a", new Object[]{this, dXWidgetNode, viewGroup, dXRenderOptions});
            return;
        }
        if (DXTraceUtil.b()) {
            DXTraceUtil.a("DX-Choreographer-PROGRESSIVE-RENDER name=" + dXWidgetNode.getDXRuntimeContext().c().f11925a);
        }
        if (viewGroup instanceof ivh) {
            ((ivh) viewGroup).getFlattenHolder().c();
        }
        b(dXWidgetNode, viewGroup, dXRenderOptions);
        if (!DXTraceUtil.b()) {
            return;
        }
        DXTraceUtil.a();
    }

    public void a(DXWidgetNode dXWidgetNode, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf6f7b06", new Object[]{this, dXWidgetNode, viewGroup});
            return;
        }
        if (DXTraceUtil.b()) {
            DXTraceUtil.a("DX-Choreographer-PROGRESSIVE-RENDER name=" + dXWidgetNode.getDXRuntimeContext().c().f11925a);
        }
        if (viewGroup instanceof ivh) {
            ((ivh) viewGroup).getFlattenHolder().c();
        }
        b(dXWidgetNode, viewGroup, DXRenderOptions.DEFAULT_RENDER_OPTIONS);
        if (!DXTraceUtil.b()) {
            return;
        }
        DXTraceUtil.a();
    }

    public void b(DXWidgetNode dXWidgetNode, ViewGroup viewGroup, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c211265b", new Object[]{this, dXWidgetNode, viewGroup, dXRenderOptions});
            return;
        }
        boolean z = dXWidgetNode.getDataParsersExprNode() != null;
        DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
        if (DXTraceUtil.b()) {
            DXTraceUtil.a(dXWidgetNode.getClass().getSimpleName() + "handleNodeStatus");
        }
        if (a(dXWidgetNode, viewGroup, z, dXRuntimeContext, dXRenderOptions)) {
            if (!DXTraceUtil.b()) {
                return;
            }
            DXTraceUtil.a();
            return;
        }
        if (DXTraceUtil.b()) {
            DXTraceUtil.a();
        }
        if (DXTraceUtil.b()) {
            DXTraceUtil.a(dXWidgetNode.getClass().getSimpleName() + "parser");
        }
        dXWidgetNode.beginParser(z);
        if (z) {
            this.c.b(dXWidgetNode, dXRuntimeContext);
        }
        if (dXWidgetNode.needParseAP()) {
            dXWidgetNode.parseAp();
        }
        dXWidgetNode.beforeBindChildData();
        dXWidgetNode.endParser(z);
        if (DXTraceUtil.b()) {
            DXTraceUtil.a();
        }
        if (DXTraceUtil.b()) {
            DXTraceUtil.a(dXWidgetNode.getClass().getSimpleName() + "render");
        }
        dXWidgetNode.setViewContainer(viewGroup);
        dXWidgetNode.bindEventWithButter(viewGroup.getContext());
        dXWidgetNode.renderViewWithButter(viewGroup.getContext());
        if (DXTraceUtil.b()) {
            DXTraceUtil.a();
        }
        if (DXTraceUtil.b()) {
            DXTraceUtil.a(dXWidgetNode.getClass().getSimpleName() + "addView + recursiveChild");
        }
        if (dXWidgetNode instanceof com.taobao.android.dinamicx.widget.m) {
            com.taobao.android.dinamicx.widget.m mVar = (com.taobao.android.dinamicx.widget.m) dXWidgetNode;
            if (mVar.isLayoutFlat()) {
                if (mVar.getChildrenCount() == 0 && !mVar.isHandleListData()) {
                    mVar.cloneChildNode(dXRuntimeContext);
                }
                List<DXWidgetNode> children = mVar.getChildren();
                boolean isDisableDarkMode = mVar.isDisableDarkMode();
                if (children != null) {
                    int size = children.size();
                    while (i < size) {
                        DXWidgetNode dXWidgetNode2 = children.get(i);
                        if (isDisableDarkMode) {
                            dXWidgetNode2.setDisableDarkMode(true);
                        }
                        b(dXWidgetNode2, viewGroup, dXRenderOptions);
                        i++;
                    }
                }
            } else {
                View nativeView = dXWidgetNode.getNativeView();
                a(viewGroup, nativeView, dXWidgetNode);
                if (nativeView instanceof ivh) {
                    ivh ivhVar = (ivh) nativeView;
                    ivhVar.setWidgetNode(mVar);
                    if (mVar.getChildrenCount() == 0 && !mVar.isHandleListData()) {
                        mVar.cloneChildNode(dXRuntimeContext);
                    }
                    ivhVar.getFlattenHolder().c();
                    List<DXWidgetNode> children2 = mVar.getChildren();
                    boolean isDisableDarkMode2 = mVar.isDisableDarkMode();
                    if (children2 != null) {
                        int size2 = children2.size();
                        while (i < size2) {
                            DXWidgetNode dXWidgetNode3 = children2.get(i);
                            if (isDisableDarkMode2) {
                                dXWidgetNode3.setDisableDarkMode(true);
                            }
                            b(dXWidgetNode3, (ViewGroup) nativeView, dXRenderOptions);
                            i++;
                        }
                    }
                }
            }
        } else {
            View nativeView2 = dXWidgetNode.getNativeView();
            if (nativeView2 != null) {
                a(viewGroup, nativeView2, dXWidgetNode);
            }
        }
        if (!DXTraceUtil.b()) {
            return;
        }
        DXTraceUtil.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r9 != 2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.taobao.android.dinamicx.widget.DXWidgetNode r6, android.view.ViewGroup r7, boolean r8, com.taobao.android.dinamicx.DXRuntimeContext r9, com.taobao.android.dinamicx.DXRenderOptions r10) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.bo.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L2d
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r1[r3] = r6
            r1[r4] = r7
            r6 = 3
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r8)
            r1[r6] = r7
            r6 = 4
            r1[r6] = r9
            r6 = 5
            r1[r6] = r10
            java.lang.String r6 = "c0921dc5"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L2d:
            int r10 = r10.g()
            if (r10 == r4) goto L38
            int r8 = r5.a(r6, r8, r9)
            goto L39
        L38:
            r8 = 0
        L39:
            int r9 = r6.getStatus()
            r10 = -1
            r0 = 5802348655878590802(0x5086155c409bd152, double:8.182680092428053E79)
            if (r9 == r10) goto L4a
            if (r9 == r3) goto L64
            if (r9 == r4) goto L64
            goto L70
        L4a:
            if (r8 != r4) goto L50
            r6.setIntAttribute(r0, r8)
            return r3
        L50:
            android.content.Context r9 = r7.getContext()
            r6.beginSetConstAttribute(r9)
            r5.a(r6)
            android.content.Context r7 = r7.getContext()
            r6.endSetConstAttribute(r7)
            r6.updateStatus(r3)
        L64:
            boolean r7 = r6.isViewStub()
            if (r7 == 0) goto L6d
            r6.setIntAttribute(r0, r8)
        L6d:
            if (r8 != r4) goto L70
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.bo.a(com.taobao.android.dinamicx.widget.DXWidgetNode, android.view.ViewGroup, boolean, com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.DXRenderOptions):boolean");
    }

    private int a(DXWidgetNode dXWidgetNode, boolean z, DXRuntimeContext dXRuntimeContext) {
        int defaultValueForIntAttr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e79e4091", new Object[]{this, dXWidgetNode, new Boolean(z), dXRuntimeContext})).intValue();
        }
        if (!z || !dXWidgetNode.isViewStub()) {
            return 0;
        }
        fqp viewStubExprNode = dXWidgetNode.getViewStubExprNode();
        Object obj = null;
        try {
            com.taobao.android.preview.a.a();
            obj = viewStubExprNode.a(null, dXWidgetNode.getDXRuntimeContext());
            com.taobao.android.preview.a.a();
        } catch (Exception e) {
            if (DinamicXEngine.j()) {
                e.printStackTrace();
            }
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_PARSE_WT_EXPR_EVALUEATE_EXCEPTION));
        }
        try {
            if (obj instanceof String) {
                Integer num = dXWidgetNode.getEnumMap().get(5802348655878590802L).get(String.valueOf(obj));
                if (num == null) {
                    defaultValueForIntAttr = dXWidgetNode.getDefaultValueForIntAttr(5802348655878590802L);
                } else {
                    return num.intValue();
                }
            } else {
                defaultValueForIntAttr = dXWidgetNode.getDefaultValueForIntAttr(5802348655878590802L);
            }
            return defaultValueForIntAttr;
        } catch (Exception e2) {
            if (DinamicXEngine.j()) {
                e2.printStackTrace();
            }
            dXRuntimeContext.n().c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_PARSE_WT_EXPR_SET_VALUE));
            return 0;
        }
    }

    private void a(s sVar, String str, int i, String str2, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa313df9", new Object[]{this, sVar, str, new Integer(i), str2, map, new Boolean(z)});
        } else if (sVar == null || sVar.c == null) {
        } else {
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, str, i);
            aVar.e = str2;
            aVar.f = map;
            sVar.c.add(aVar);
            if (!z) {
                return;
            }
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        }
    }

    private void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext == null) {
        } else {
            try {
                DXTemplateItem c = dXRuntimeContext.c();
                DXEngineConfig b = b();
                if (b == null || b.C() || d() == null || c == null) {
                    return;
                }
                d().c(c);
                a(dXRuntimeContext, 1000);
            } catch (Exception e) {
                if (!DinamicXEngine.j()) {
                    return;
                }
                e.printStackTrace();
            }
        }
    }

    public aw d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aw) ipChange.ipc$dispatch("c6f4b311", new Object[]{this}) : this.e;
    }

    private void a(DXRuntimeContext dXRuntimeContext, int i) {
        fva fvaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71e584a", new Object[]{this, dXRuntimeContext, new Integer(i)});
        } else if (c().b() == null || (fvaVar = c().b().g) == null || dXRuntimeContext == null) {
        } else {
            fvd fvdVar = new fvd();
            fvdVar.f28145a = dXRuntimeContext.c();
            fvdVar.d = dXRuntimeContext.a();
            fvdVar.b = dXRuntimeContext.e();
            fvdVar.c = i;
            fvaVar.a(fvdVar);
        }
    }

    private void a(ViewGroup viewGroup, View view, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d6edc4", new Object[]{this, viewGroup, view, dXWidgetNode});
        } else if (!(viewGroup instanceof ivh)) {
        } else {
            ao flattenHolder = ((ivh) viewGroup).getFlattenHolder();
            if (view.getParent() == null) {
                viewGroup.addView(view, flattenHolder.a(), new ViewGroup.LayoutParams(dXWidgetNode.getLayoutWidth(), dXWidgetNode.getLayoutHeight()));
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = dXWidgetNode.getLayoutWidth();
                layoutParams.height = dXWidgetNode.getLayoutHeight();
                view.setLayoutParams(layoutParams);
            }
            flattenHolder.b();
        }
    }

    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
            return;
        }
        LongSparseArray<ivg> constAttributeMap = dXWidgetNode.getConstAttributeMap();
        if (constAttributeMap == null) {
            return;
        }
        int size = constAttributeMap.size();
        for (int i = 0; i < size; i++) {
            ivg valueAt = constAttributeMap.valueAt(i);
            short s = valueAt.b;
            if (s != 1) {
                if (s == 2) {
                    dXWidgetNode.setLongAttribute(valueAt.f29329a, valueAt.d);
                } else if (s == 4) {
                    dXWidgetNode.setDoubleAttribute(valueAt.f29329a, Double.longBitsToDouble(valueAt.d));
                } else if (s == 8) {
                    String str = valueAt.e;
                    if (TextUtils.isEmpty(valueAt.e)) {
                        List<s.a> list = dXWidgetNode.getDXRuntimeContext().n().c;
                        list.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_CREATE_WT_CREATE_NODE_STRING_ERROR, "className" + dXWidgetNode.getClass().getName() + " key " + valueAt.f29329a + " value " + valueAt.d));
                        fux.b(" DXBinaryLoader createWidgetTree error 70018");
                        return;
                    }
                    dXWidgetNode.setStringAttribute(valueAt.f29329a, str);
                } else if (s != 16) {
                    if (s == 32) {
                        double longBitsToDouble = Double.longBitsToDouble(valueAt.d);
                        dXWidgetNode.setIntAttribute(valueAt.f29329a, gbg.a(dXWidgetNode.getDXRuntimeContext().D(), dXWidgetNode.getDXRuntimeContext().m(), (float) longBitsToDouble));
                        dXWidgetNode.initScreenAttrNodeArray(size);
                        if (dXWidgetNode.getScreenAttrNodeArray() != null) {
                            dXWidgetNode.getScreenAttrNodeArray().put(valueAt.f29329a, Double.valueOf(longBitsToDouble));
                        }
                    } else if (s != 64) {
                        JSONObject jSONObject = null;
                        r13 = null;
                        JSONArray jSONArray = null;
                        jSONObject = null;
                        if (s == 128) {
                            try {
                                jSONArray = JSON.parseArray(valueAt.e);
                            } catch (Exception e) {
                                if (DinamicXEngine.j()) {
                                    e.printStackTrace();
                                }
                            }
                            if (jSONArray == null) {
                                List<s.a> list2 = dXWidgetNode.getDXRuntimeContext().n().c;
                                list2.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_CREATE_WT_CREATE_NODE_LIST_ERROR, "className" + dXWidgetNode.getClass().getName()));
                                fux.b(" DXBinaryLoader createWidgetTree error 70019");
                                return;
                            }
                            dXWidgetNode.setListAttribute(valueAt.f29329a, jSONArray);
                        } else if (s == 256) {
                            try {
                                jSONObject = JSON.parseObject(valueAt.e);
                            } catch (Exception e2) {
                                if (DinamicXEngine.j()) {
                                    e2.printStackTrace();
                                }
                            }
                            if (jSONObject == null) {
                                List<s.a> list3 = dXWidgetNode.getDXRuntimeContext().n().c;
                                list3.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", 70020, "className" + dXWidgetNode.getClass().getName() + " key " + valueAt.f29329a + " value " + valueAt.d));
                                fux.b(" DXBinaryLoader createWidgetTree error 70020");
                                return;
                            }
                            dXWidgetNode.setMapAttribute(valueAt.f29329a, jSONObject);
                        } else if (s != 512) {
                            if (s != 2048) {
                                continue;
                            } else {
                                String str2 = valueAt.e;
                                if (TextUtils.isEmpty(str2)) {
                                    List<s.a> list4 = dXWidgetNode.getDXRuntimeContext().n().c;
                                    list4.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, "Pipeline_Stage_Load_Binary", s.DXERROR_PIPELINE_CREATE_WT_CREATE_NODE_WIDGET_ERROR_70043, "className" + dXWidgetNode.getClass().getName() + " key " + valueAt.f29329a + " value " + valueAt.d));
                                    fux.b(" DXBinaryLoader createWidgetTree error 70043");
                                    return;
                                }
                                dXWidgetNode.setStringAttribute(valueAt.f29329a, str2);
                            }
                        }
                    } else {
                        dXWidgetNode.setIntAttribute(valueAt.f29329a, gbg.a(dXWidgetNode.getDXRuntimeContext().m(), (float) Double.longBitsToDouble(valueAt.d)));
                    }
                }
            }
            dXWidgetNode.setIntAttribute(valueAt.f29329a, valueAt.c);
        }
        if (dXWidgetNode.getScreenAttrNodeArray() == null) {
            return;
        }
        dXWidgetNode.setStatFlag(2097152);
    }

    private void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
            return;
        }
        try {
            fqb bindingXManager = dXRootView.getBindingXManager();
            if (bindingXManager == null) {
                return;
            }
            bindingXManager.a(dXRootView);
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            s sVar = new s(a());
            sVar.c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_STAGE_RESET_BINDINGX, s.RESET_ANIMATION_CRASH, com.taobao.android.dinamicx.exception.a.a(e)));
            com.taobao.android.dinamicx.monitor.b.a(sVar);
        }
    }

    public com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> a(com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.model.b) ipChange.ipc$dispatch("c5039df8", new Object[]{this, bVar});
        }
        if (bVar == null) {
            return null;
        }
        com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> bVar2 = new com.taobao.android.dinamicx.model.b<>(50);
        for (int i = 0; i < bVar.size(); i++) {
            long keyAt = bVar.keyAt(i);
            com.taobao.android.dinamicx.widget.ak valueAt = bVar.valueAt(i);
            if (keyAt == com.taobao.android.icart.widget.h.DXTEXTVIEW_TEXTVIEW) {
                bVar2.put(keyAt, new ivk(new bo.a(), this.g.a(keyAt)));
            } else if (keyAt == 6637736565700605658L) {
                bVar2.put(keyAt, new ivk(new bk.a(), this.g.a(keyAt)));
            } else if (keyAt == -7675176749284896753L) {
                bVar2.put(keyAt, new ivk(new bj.a(), this.g.a(keyAt)));
            } else if (keyAt == 7821310614898040L) {
                bVar2.put(keyAt, new ivk(new bn.a(), this.g.a(keyAt)));
            } else if (keyAt == 7700670404894374791L) {
                bVar2.put(keyAt, new ivk(new bm.a(), this.g.a(keyAt)));
            } else if (this.g.a(keyAt) != null) {
                bVar2.put(keyAt, new ivk(valueAt, this.g.a(keyAt)));
            }
        }
        if (u.l() != null) {
            com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> l = u.l();
            for (int i2 = 0; i2 < l.size(); i2++) {
                long keyAt2 = l.keyAt(i2);
                bVar2.put(keyAt2, new ivk(l.valueAt(i2), this.g.a(keyAt2)));
            }
        }
        return bVar2;
    }

    public com.taobao.android.dinamicx.widget.ak a(long j, com.taobao.android.dinamicx.widget.ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.ak) ipChange.ipc$dispatch("e060ddd2", new Object[]{this, new Long(j), akVar});
        }
        if (akVar == null) {
            return null;
        }
        com.taobao.android.dinamicx.widget.bq a2 = this.g.a(j);
        if (a2 != null) {
            return new ivk(akVar, a2);
        }
        return new ivk(akVar, this.g.a());
    }

    public DXResult<DXRootView> a(DXButterRootView dXButterRootView, DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("e95894b8", new Object[]{this, dXButterRootView, dXRuntimeContext, new Integer(i)});
        }
        DXRootView a2 = fpy.a().a(dXRuntimeContext.m(), dXRuntimeContext.A(), dXRuntimeContext.V());
        if (a2 == null || a2.getWidgetNode() == null) {
            return null;
        }
        dXButterRootView.cloneWithCacheView(a2);
        DXRuntimeContext dXRuntimeContext2 = a2.getWidgetNode().getDXRuntimeContext();
        dXRuntimeContext2.f11781a.q = new WeakReference<>(a2);
        dXRuntimeContext2.f11781a.r = new WeakReference<>(this);
        dXRuntimeContext2.c.f11782a = dXRuntimeContext.c();
        dXRuntimeContext2.c.c = dXRuntimeContext.n();
        dXRuntimeContext2.c.b = dXRuntimeContext.e();
        dXRuntimeContext2.f11781a.m = dXRuntimeContext.a();
        dXRuntimeContext2.f11781a.n = dXRuntimeContext.b();
        dXRuntimeContext2.f11781a.c = dXRuntimeContext.x();
        dXRuntimeContext2.f11781a.f11832a = dXRuntimeContext.y();
        dXRuntimeContext2.f11781a.b = dXRuntimeContext.z();
        return new DXResult<>(dXButterRootView);
    }
}
