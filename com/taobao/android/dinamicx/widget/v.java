package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.fqi;
import tb.fxe;
import tb.fxy;
import tb.fyl;
import tb.fym;
import tb.fyu;
import tb.fyx;
import tb.kge;

/* loaded from: classes.dex */
public class v extends o implements fyl, fym, fyu, fyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSCROLLLAYOUTBASE_ENABLENESTEDPLAYCONTROL = -8291646690741297832L;
    public static final long DXSCROLLLAYOUTBASE_EXPOSURECONFIG = 6442732320864020959L;
    public static final long DXSCROLLLAYOUTBASE_VIDEOCONTROLCONFIG = -7801350391660369312L;
    public static final long DX_SCROLL_LAYOUT_BASE = -116275953006946184L;
    public static final long DX_SCROLL_LAYOUT_BASE_INDICATOR_ID = 7196296497982840181L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_PAGE_APPEAR = -8975334121118753601L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_PAGE_DISAPPEAR = -5201408949358043646L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_SCROLL = 5288751146867425108L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_SCROLL_BEGIN = 9144262755562405950L;
    public static final long DX_SCROLL_LAYOUT_BASE_ON_SCROLL_END = 2691126191158604142L;
    public static final long DX_SCROLL_LAYOUT_BASE_SCROLL_ENABLED = -8352681166307095225L;
    public static final long DX_SCROLL_LAYOUT_BASE_SHOW_INDICATOR = -3765027987112450965L;
    private List<DXWidgetNode> appearWidgets;
    public int contentHorizontalLength;
    public int contentVerticalLength;
    private JSONObject exposeConfig;
    public String indicatorId;
    public DXWidgetNode indicatorWidgetNode;
    public ArrayList<DXWidgetNode> itemWidgetNodes;
    public com.taobao.android.dinamicx.as pipeline;
    private Object videoControlConfig;
    private com.taobao.android.dinamicx.videoc.b videoControlManager;
    public Map<Integer, a> viewModels;
    private boolean enableNestedPlayControl = false;
    public boolean showIndicator = true;
    public boolean scrollEnabled = true;

    static {
        kge.a(1245709748);
        kge.a(1698107197);
        kge.a(-1973314344);
        kge.a(-1594984463);
        kge.a(-1475344968);
    }

    public static /* synthetic */ Object ipc$super(v vVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1756697323:
                return super.queryWTByAutoId(((Number) objArr[0]).intValue());
            case -1399192248:
                super.bindRuntimeContext((DXRuntimeContext) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -857616453:
                super.setBackground((View) objArr[0]);
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
            case 895336024:
                super.onBeforeBindChildDataWithButter();
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1172714098:
                return super.queryWTByUserId((String) objArr[0]);
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void onCanPlay(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcb3bff", new Object[]{this, fxyVar, str});
        }
    }

    @Override // tb.fyl
    public void onDidFinishPlayingLastItem(int i, boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2206a3f", new Object[]{this, new Integer(i), new Boolean(z), str, map});
        }
    }

    @Override // tb.fym
    public void onShouldStop(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198f0e", new Object[]{this, fxyVar, str});
        }
    }

    public static /* synthetic */ void access$000(v vVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0b015b", new Object[]{vVar, new Integer(i)});
        } else {
            vVar.saveExposed(i);
        }
    }

    public static /* synthetic */ void access$100(v vVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad0031a", new Object[]{vVar, new Integer(i), new Boolean(z)});
        } else {
            vVar.saveCanRepeatExpose(i, z);
        }
    }

    public v() {
        this.markContainer = true;
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof v)) {
            return;
        }
        v vVar = (v) dXWidgetNode;
        this.indicatorId = vVar.indicatorId;
        this.scrollEnabled = vVar.scrollEnabled;
        this.showIndicator = vVar.showIndicator;
        this.itemWidgetNodes = vVar.itemWidgetNodes;
        this.indicatorWidgetNode = vVar.indicatorWidgetNode;
        this.pipeline = vVar.pipeline;
        this.contentHorizontalLength = vVar.contentHorizontalLength;
        this.contentVerticalLength = vVar.contentVerticalLength;
        this.appearWidgets = vVar.appearWidgets;
        this.exposeConfig = vVar.exposeConfig;
        this.videoControlConfig = vVar.videoControlConfig;
        this.videoControlManager = vVar.videoControlManager;
        this.enableNestedPlayControl = vVar.enableNestedPlayControl;
        this.viewModels = vVar.viewModels;
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.pipeline == null) {
            this.pipeline = new com.taobao.android.dinamicx.as(getDXRuntimeContext().C(), 3, UUID.randomUUID().toString(), isPipelineDefaultCreateRootView());
        }
        ArrayList arrayList = new ArrayList();
        if (this.listData == null) {
            arrayList.addAll(this.children);
        }
        removeAllChild();
        super.onMeasure(i, i2);
        if (this.listData != null) {
            return;
        }
        this.children.addAll(arrayList);
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildDataWithButter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355dbe58", new Object[]{this});
        } else {
            super.onBeforeBindChildDataWithButter();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        super.onBeforeBindChildData();
        DXWidgetNode queryIndicatorNodeByUserId = queryIndicatorNodeByUserId(this.indicatorId);
        if (queryIndicatorNodeByUserId != null) {
            com.taobao.android.dinamicx.bc.c(queryIndicatorNodeByUserId);
            if (this.showIndicator) {
                queryIndicatorNodeByUserId.setVisibility(0);
                this.indicatorWidgetNode = queryIndicatorNodeByUserId;
            } else {
                queryIndicatorNodeByUserId.setVisibility(2);
            }
        }
        if (getChildren() != null) {
            this.itemWidgetNodes = new ArrayList<>();
            this.itemWidgetNodes.addAll(getChildren());
        } else {
            this.itemWidgetNodes = new ArrayList<>();
        }
        this.viewModels = new HashMap();
        setDisableFlatten(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (getDxv4Properties().a().get(com.taobao.android.dinamicx.widget.DXRecyclerLayout.DXRECYCLERLAYOUT_ONREPEATEXPOSE) != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (getEventHandlersExprNode().get(com.taobao.android.dinamicx.widget.DXRecyclerLayout.DXRECYCLERLAYOUT_ONREPEATEXPOSE) != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRenderView(android.content.Context r7, android.view.View r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.widget.v.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            r7 = 2
            r1[r7] = r8
            java.lang.String r7 = "ede516ab"
            r0.ipc$dispatch(r7, r1)
            return
        L18:
            super.onRenderView(r7, r8)
            boolean r7 = r8 instanceof com.taobao.android.dinamicx.view.DXNativeRecyclerView
            if (r7 == 0) goto La4
            boolean r7 = r6.isV4Node()
            r0 = 7221816040243224000(0x64390b6cffea5dc0, double:6.194298875674411E174)
            r4 = 6278152710403332930(0x57207aa0853f1b42, double:4.953812614132487E111)
            if (r7 == 0) goto L65
            tb.gfl r7 = r6.getDxv4Properties()
            com.taobao.android.dinamicx.model.c r7 = r7.a()
            if (r7 == 0) goto L49
            tb.gfl r7 = r6.getDxv4Properties()
            com.taobao.android.dinamicx.model.c r7 = r7.a()
            java.lang.Object r7 = r7.get(r4)
            if (r7 == 0) goto L49
            r7 = 1
            goto L4a
        L49:
            r7 = 0
        L4a:
            tb.gfl r4 = r6.getDxv4Properties()
            com.taobao.android.dinamicx.model.c r4 = r4.a()
            if (r4 == 0) goto L63
            tb.gfl r4 = r6.getDxv4Properties()
            com.taobao.android.dinamicx.model.c r4 = r4.a()
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L63
            goto L88
        L63:
            r2 = 0
            goto L88
        L65:
            android.support.v4.util.LongSparseArray r7 = r6.getEventHandlersExprNode()
            if (r7 == 0) goto L77
            android.support.v4.util.LongSparseArray r7 = r6.getEventHandlersExprNode()
            java.lang.Object r7 = r7.get(r4)
            if (r7 == 0) goto L77
            r7 = 1
            goto L78
        L77:
            r7 = 0
        L78:
            android.support.v4.util.LongSparseArray r4 = r6.getEventHandlersExprNode()
            if (r4 == 0) goto L63
            android.support.v4.util.LongSparseArray r4 = r6.getEventHandlersExprNode()
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L63
        L88:
            if (r7 == 0) goto L97
            r7 = r8
            com.taobao.android.dinamicx.view.DXNativeRecyclerView r7 = (com.taobao.android.dinamicx.view.DXNativeRecyclerView) r7
            com.alibaba.fastjson.JSONObject r0 = r6.exposeConfig
            com.taobao.android.dinamicx.widget.v$1 r1 = new com.taobao.android.dinamicx.widget.v$1
            r1.<init>()
            r7.initExposeHelper(r0, r1)
        L97:
            com.taobao.android.dinamicx.widget.v$2 r7 = new com.taobao.android.dinamicx.widget.v$2
            r7.<init>()
            r8.post(r7)
            android.support.v7.widget.RecyclerView r8 = (android.support.v7.widget.RecyclerView) r8
            r6.initVideoPlayControl(r8)
        La4:
            int r7 = r6.getChildrenCount()
            if (r7 <= 0) goto Lbb
            com.taobao.android.dinamicx.DXRuntimeContext r7 = r6.getDXRuntimeContext()
            com.taobao.android.dinamicx.widget.DXWidgetNode r7 = r7.d()
            if (r7 != 0) goto Lb5
            return
        Lb5:
            r7.removeAllChild()
            r6.removeAllChild()
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.v.onRenderView(android.content.Context, android.view.View):void");
    }

    private void initVideoPlayControl(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c78ef3", new Object[]{this, recyclerView});
        } else if (recyclerView == null) {
        } else {
            try {
                if (this.videoControlManager != null) {
                    return;
                }
                DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
                this.videoControlManager = dXRuntimeContext.C().b().u();
                if (this.videoControlManager == null || !(this.videoControlConfig instanceof DXVideoControlConfig) || !this.videoControlManager.b()) {
                    return;
                }
                String str = (StringUtils.isEmpty(dXRuntimeContext.A()) ? "" : dXRuntimeContext.A()) + "_" + (StringUtils.isEmpty(this.userId) ? "DXScrollLayoutBase" : this.userId);
                this.videoControlManager.e(recyclerView);
                this.videoControlManager.a(recyclerView, (DXVideoControlConfig) this.videoControlConfig, str);
                this.videoControlManager.a(recyclerView);
                this.videoControlManager.c(recyclerView);
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
            }
        }
    }

    @Override // tb.fyu
    public void triggerExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b318fbe6", new Object[]{this});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXNativeRecyclerView)) {
            return;
        }
        ((DXNativeRecyclerView) v).triggerExpose();
    }

    @Override // tb.fyu
    public void clearExposureCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972e4af5", new Object[]{this});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXNativeRecyclerView)) {
            return;
        }
        ((DXNativeRecyclerView) v).clearExposeCache();
    }

    public void triggerVideoPlayControl() {
        com.taobao.android.dinamicx.videoc.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421036d", new Object[]{this});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXNativeRecyclerView) || (bVar = this.videoControlManager) == null) {
            return;
        }
        bVar.b((RecyclerView) v);
    }

    public void stopVideoPlayControl() {
        com.taobao.android.dinamicx.videoc.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6dacb7", new Object[]{this});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXNativeRecyclerView) || (bVar = this.videoControlManager) == null) {
            return;
        }
        bVar.d((RecyclerView) v);
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        com.taobao.android.dinamicx.view.a cLipRadiusHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        if (hasCornerRadius()) {
            DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) view;
            com.taobao.android.dinamicx.view.a aVar = new com.taobao.android.dinamicx.view.a();
            if (getCornerRadius() > 0) {
                aVar.a(view, getCornerRadius());
            } else {
                aVar.a(view, getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom());
            }
            dXNativeRecyclerView.setClipRadiusHandler(aVar);
        } else if ((view instanceof DXNativeRecyclerView) && (cLipRadiusHandler = ((DXNativeRecyclerView) view).getCLipRadiusHandler()) != null) {
            cLipRadiusHandler.a(view, 0.0f);
        }
        super.setBackground(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    @Override // com.taobao.android.dinamicx.widget.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureHorizontal(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.v.measureHorizontal(int, int):void");
    }

    private void forceUniformHeight(List<DXWidgetNode> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d065bb", new Object[]{this, list, new Integer(i)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(getMeasuredHeight(), 1073741824);
        for (DXWidgetNode dXWidgetNode : list) {
            if (dXWidgetNode != null && dXWidgetNode.getVisibility() != 2 && dXWidgetNode.layoutHeight == -1) {
                int i2 = dXWidgetNode.layoutWidth;
                dXWidgetNode.layoutWidth = dXWidgetNode.getMeasuredWidth();
                measureChildWithMargins(dXWidgetNode, i, 0, a2, 0);
                dXWidgetNode.layoutWidth = i2;
            }
        }
    }

    public int measureSpecForChild(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e582946", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : i == -2 ? DXWidgetNode.DXMeasureSpec.a(8388607, 0) : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    @Override // com.taobao.android.dinamicx.widget.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureVertical(int r22, int r23) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.v.measureVertical(int, int):void");
    }

    public boolean isPipelineDefaultCreateRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d04cd663", new Object[]{this})).booleanValue() : this.videoControlConfig instanceof DXVideoControlConfig;
    }

    private void forceUniformWidth(List<DXWidgetNode> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571a43ae", new Object[]{this, list, new Integer(i)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(getMeasuredWidth(), 1073741824);
        for (DXWidgetNode dXWidgetNode : list) {
            if (dXWidgetNode != null && dXWidgetNode.getVisibility() != 2 && dXWidgetNode.layoutWidth == -1) {
                int i2 = dXWidgetNode.layoutHeight;
                dXWidgetNode.layoutHeight = dXWidgetNode.getMeasuredHeight();
                measureChildWithMargins(dXWidgetNode, a2, 0, i, 0);
                dXWidgetNode.layoutHeight = i2;
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1fa015", new Object[]{this, new Long(j), jSONObject});
        } else if (j == 6442732320864020959L) {
            this.exposeConfig = jSONObject;
        } else {
            super.setMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == -7801350391660369312L) {
            this.videoControlConfig = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -3765027987112450965L) {
            if (i == 0) {
                z = false;
            }
            this.showIndicator = z;
        } else if (j == -8352681166307095225L) {
            if (i == 0) {
                z = false;
            }
            this.scrollEnabled = z;
        } else if (j == DXSCROLLLAYOUTBASE_ENABLENESTEDPLAYCONTROL) {
            if (i == 0) {
                z = false;
            }
            this.enableNestedPlayControl = z;
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
        if (j == -8352681166307095225L || j == -3765027987112450965L) {
            return 1;
        }
        if (j != DXSCROLLLAYOUTBASE_ENABLENESTEDPLAYCONTROL) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DX_SCROLL_LAYOUT_BASE_INDICATOR_ID) {
            this.indicatorId = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("974aed15", new Object[]{this, new Integer(i)});
        }
        DXWidgetNode queryWTByAutoId = super.queryWTByAutoId(i);
        if (queryWTByAutoId == null) {
            ArrayList<DXWidgetNode> arrayList = this.itemWidgetNodes;
            if (arrayList == null) {
                return null;
            }
            Iterator<DXWidgetNode> it = arrayList.iterator();
            while (it.hasNext() && (queryWTByAutoId = it.next().queryWTByAutoId(i)) == null) {
            }
        }
        return queryWTByAutoId;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str});
        }
        DXWidgetNode queryWTByUserId = super.queryWTByUserId(str);
        if (queryWTByUserId == null) {
            ArrayList<DXWidgetNode> arrayList = this.itemWidgetNodes;
            if (arrayList == null) {
                return null;
            }
            Iterator<DXWidgetNode> it = arrayList.iterator();
            while (it.hasNext() && (queryWTByUserId = it.next().queryWTByUserId(str)) == null) {
            }
        }
        return queryWTByUserId;
    }

    public DXWidgetNode queryIndicatorNodeByUserId(String str) {
        DXWidgetNode parentWidget;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("a788e96", new Object[]{this, str});
        }
        if (str == null || (parentWidget = getParentWidget()) == null) {
            return null;
        }
        DXWidgetNode dXWidgetNode = null;
        int i2 = -1;
        int i3 = -1;
        for (DXWidgetNode dXWidgetNode2 : parentWidget.getChildren()) {
            if (dXWidgetNode2 == this) {
                i2 = i;
            } else if (str.equals(dXWidgetNode2.getUserId())) {
                i3 = i;
                dXWidgetNode = dXWidgetNode2;
            }
            if (i2 != -1 && i3 != -1) {
                return dXWidgetNode;
            }
            i++;
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
            return;
        }
        super.bindRuntimeContext(dXRuntimeContext, z);
        if (dXRuntimeContext == null || (arrayList = this.itemWidgetNodes) == null) {
            return;
        }
        Iterator<DXWidgetNode> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().bindRuntimeContext(dXRuntimeContext, z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (dXEvent != null) {
            if (5288671110273408574L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                List<DXWidgetNode> list = this.appearWidgets;
                if (list == null || list.size() == 0) {
                    return;
                }
                for (DXWidgetNode dXWidgetNode : this.appearWidgets) {
                    DXViewEvent dXViewEvent = new DXViewEvent(-8975334121118753601L);
                    dXViewEvent.setItemIndex(dXWidgetNode.getDXRuntimeContext().i());
                    dXWidgetNode.sendBroadcastEvent(dXViewEvent);
                }
            } else if (5388973340095122049L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                List<DXWidgetNode> list2 = this.appearWidgets;
                if (list2 == null || list2.size() == 0) {
                    return;
                }
                for (DXWidgetNode dXWidgetNode2 : this.appearWidgets) {
                    DXViewEvent dXViewEvent2 = new DXViewEvent(-5201408949358043646L);
                    dXViewEvent2.setItemIndex(dXWidgetNode2.getDXRuntimeContext().i());
                    dXWidgetNode2.sendBroadcastEvent(dXViewEvent2);
                }
            } else {
                postEvent(dXEvent);
                List<DXWidgetNode> list3 = this.appearWidgets;
                if (list3 == null || list3.size() <= 0) {
                    return;
                }
                for (DXWidgetNode dXWidgetNode3 : this.appearWidgets) {
                    dXWidgetNode3.sendBroadcastEvent(dXEvent);
                }
            }
        }
    }

    public void addAppearWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d17e4e", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            if (this.appearWidgets == null) {
                this.appearWidgets = new ArrayList();
            }
            this.appearWidgets.add(dXWidgetNode);
        }
    }

    public boolean removeAppearWidget(DXWidgetNode dXWidgetNode) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5592cf", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode != null && (list = this.appearWidgets) != null) {
            return list.remove(dXWidgetNode);
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void updateRefreshType(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22ac2b0", new Object[]{this, new Integer(i)});
        } else if (fqi.G() && getDXRuntimeContext().G() && i == 0) {
            fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.v.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (v.this.dXRuntimeContext != null) {
                        v.this.dXRuntimeContext.d(i);
                    }
                    if (v.this.itemWidgetNodes == null) {
                        return;
                    }
                    Iterator<DXWidgetNode> it = v.this.itemWidgetNodes.iterator();
                    while (it.hasNext()) {
                        it.next().updateRefreshType(i);
                    }
                }
            });
        } else {
            if (this.dXRuntimeContext != null) {
                this.dXRuntimeContext.d(i);
            }
            ArrayList<DXWidgetNode> arrayList = this.itemWidgetNodes;
            if (arrayList == null) {
                return;
            }
            Iterator<DXWidgetNode> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().updateRefreshType(i);
            }
        }
    }

    public boolean isEnableNestedPlayControl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("496cec50", new Object[]{this})).booleanValue() : this.enableNestedPlayControl;
    }

    public a getViewModel(int i) {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6f5fce5c", new Object[]{this, new Integer(i)});
        }
        if (!fqi.ac() || (arrayList = this.itemWidgetNodes) == null || this.viewModels == null || i < 0 || i > arrayList.size() - 1) {
            return null;
        }
        if (this.viewModels.get(Integer.valueOf(i)) == null) {
            this.viewModels.put(Integer.valueOf(i), new a());
        }
        return this.viewModels.get(Integer.valueOf(i));
    }

    private void saveExposed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b61059", new Object[]{this, new Integer(i)});
            return;
        }
        a viewModel = getViewModel(i);
        if (viewModel == null) {
            return;
        }
        viewModel.a(true);
    }

    private void saveCanRepeatExpose(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7776a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        a viewModel = getViewModel(i);
        if (viewModel == null) {
            return;
        }
        viewModel.b(z);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f12188a;
        private boolean b;

        static {
            kge.a(-517306784);
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f12188a = z;
            }
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f12188a;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }
    }

    public ArrayList<DXWidgetNode> _getItemWidgetNodes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("49e2a404", new Object[]{this}) : this.itemWidgetNodes;
    }
}
