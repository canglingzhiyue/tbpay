package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.os.Build;
import android.support.v4.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bx;
import com.taobao.weex.common.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fqi;
import tb.fqp;
import tb.fuo;
import tb.gay;
import tb.kge;

/* loaded from: classes.dex */
public class m extends DXWidgetNode implements al {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXLAYOUT_MARKCONTAINER = 8182691489212564827L;
    public boolean disableFlatten;
    public Map<String, WeakReference<DXWidgetNode>> dxUserIdMap;
    public JSONArray listData;
    public List<DXWidgetNode> originItems;
    public a recycledPool;
    public boolean markContainer = false;
    public boolean dataSizeChange = false;
    public boolean isLayoutFlat = true;
    public int templateSize = 0;

    static {
        kge.a(-1041039338);
        kge.a(-1596224485);
        kge.a(-438135182);
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -428783541:
                super.onSetUserDefinedListAttribute(((Number) objArr[0]).longValue(), (List) objArr[1]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 695001847:
                super.layoutWithButter(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1534704233:
                super.changeVisibility();
                return null;
            case 1568407179:
                super.measureWithButter(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeginSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad746430", new Object[]{this, context});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getNativeView() != null) {
            getNativeView().forceLayout();
            getNativeView().measure(i, i2);
        } else {
            super.measureWithButter(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getNativeView() != null) {
            getNativeView().layout(i, i2, i3, i4);
        } else {
            super.layoutWithButter(i, i2, i3, i4);
        }
    }

    public boolean isDisableFlatten() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e18ffb51", new Object[]{this})).booleanValue() : this.disableFlatten;
    }

    public void setDisableFlatten(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c0f6ef", new Object[]{this, new Boolean(z)});
        } else {
            this.disableFlatten = z;
        }
    }

    public boolean isLayoutFlat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb473c98", new Object[]{this})).booleanValue() : this.isLayoutFlat;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6436122", new Object[]{this, context});
            return;
        }
        boolean checkLayoutFlat = checkLayoutFlat();
        this.isLayoutFlat = checkLayoutFlat;
        if (checkLayoutFlat) {
            return;
        }
        createNativeView(context);
    }

    public boolean checkLayoutFlat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2cf7f6", new Object[]{this})).booleanValue();
        }
        if (!bx.r()) {
            return false;
        }
        boolean z = getDXRuntimeContext().B().f() || isDisableFlatten() || hasCornerRadius() || getAccessibility() != -1 || getEnabled() == 0 || getAlpha() != 1.0f || getBackGroundColor() != 0 || (getBorderWidth() > 0 && getBorderColor() != 0) || hasEvent(this);
        if (z) {
            return false;
        }
        LongSparseArray<fqp> dataParsersExprNode = getDataParsersExprNode();
        if (dataParsersExprNode != null && dataParsersExprNode.size() > 0) {
            z = dataParsersExprNode.indexOfKey(gay.DXIMAGESPAN_CORNERRADIUS) >= 0 || dataParsersExprNode.indexOfKey(-7043958449911898942L) >= 0 || dataParsersExprNode.indexOfKey(8679583519247168310L) >= 0 || dataParsersExprNode.indexOfKey(-3738348576243028217L) >= 0 || dataParsersExprNode.indexOfKey(1691221861925381243L) >= 0 || dataParsersExprNode.indexOfKey(16887479372907L) >= 0 || dataParsersExprNode.indexOfKey(-2819959685970048978L) >= 0 || dataParsersExprNode.indexOfKey(-8019934667170236535L) >= 0 || dataParsersExprNode.indexOfKey(-8020113231441560440L) >= 0 || dataParsersExprNode.indexOfKey(3436950829494956384L) >= 0;
        }
        return !z;
    }

    public boolean hasEvent(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64f94d6c", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode == null) {
            return false;
        }
        return dXWidgetNode.isV4Node() ? dXWidgetNode.getDxv4Properties().a() != null && dXWidgetNode.getDxv4Properties().a().size() > 0 : dXWidgetNode.getEventHandlersExprNode() != null && dXWidgetNode.getEventHandlersExprNode().size() > 0;
    }

    public void measureChildWithMargins(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c425c7", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            dXWidgetNode.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight() + i2, dXWidgetNode.layoutWidth), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + dXWidgetNode.getMarginTop() + dXWidgetNode.getMarginBottom() + i4, dXWidgetNode.layoutHeight));
        }
    }

    public boolean isLayoutRtl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9cdea61", new Object[]{this})).booleanValue() : getDirection() == 1;
    }

    public List<DXWidgetNode> getOriginItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6c10b15c", new Object[]{this}) : this.originItems;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -7485666501444237648L) {
            if (i == 1) {
                z = true;
            }
            this.disableFlatten = z;
        } else if (j == DXLAYOUT_MARKCONTAINER) {
            if (i != 0) {
                z = true;
            }
            this.markContainer = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (fuo.DX_PARSER_LISTDATA == j) {
            setListData(jSONArray);
            this.propertyInitFlag |= 2;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetUserDefinedListAttribute(long j, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e671484b", new Object[]{this, new Long(j), list});
        } else if (fuo.DX_PARSER_LISTDATA == j) {
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : list) {
                    jSONArray.add(obj);
                }
                onSetListAttribute(j, jSONArray);
            }
            this.propertyInitFlag |= 2;
        } else {
            super.onSetUserDefinedListAttribute(j, list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r7 == (-2)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r7 == (-2)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r7 == (-2)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getChildMeasureSpec(int r5, int r6, int r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.widget.m.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L2e
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            r1[r2] = r3
            r5 = 1
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            r1[r5] = r2
            r5 = 2
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r1[r5] = r6
            java.lang.String r5 = "3ebe8e5c"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L2e:
            int r0 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.a(r5)
            int r5 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.b(r5)
            int r5 = r5 - r6
            int r5 = java.lang.Math.max(r2, r5)
            r6 = -2
            r1 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L5a
            if (r0 == 0) goto L51
            if (r0 == r4) goto L48
            goto L66
        L48:
            if (r7 < 0) goto L4b
            goto L5c
        L4b:
            if (r7 != r1) goto L4e
            goto L68
        L4e:
            if (r7 != r6) goto L66
            goto L60
        L51:
            if (r7 < 0) goto L54
            goto L5c
        L54:
            if (r7 != r1) goto L57
        L56:
            goto L67
        L57:
            if (r7 != r6) goto L66
            goto L56
        L5a:
            if (r7 < 0) goto L5e
        L5c:
            r5 = r7
            goto L68
        L5e:
            if (r7 != r1) goto L63
        L60:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L68
        L63:
            if (r7 != r6) goto L66
            goto L60
        L66:
            r5 = 0
        L67:
            r4 = 0
        L68:
            int r5 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.a(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.m.getChildMeasureSpec(int, int, int):int");
    }

    public ViewGroup.LayoutParams generateLayoutParams(com.taobao.android.dinamicx.model.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("be7b699a", new Object[]{this, aVar}) : new ViewGroup.LayoutParams(aVar.f11888a, aVar.b);
    }

    public ViewGroup.LayoutParams generateLayoutParams(com.taobao.android.dinamicx.model.a aVar, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("a8eee9bd", new Object[]{this, aVar, layoutParams});
        }
        layoutParams.width = aVar.f11888a;
        layoutParams.height = aVar.b;
        return layoutParams;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean isClipChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df8b07c4", new Object[]{this})).booleanValue();
        }
        if (this.dxNodeLowFrequencyProperty != null) {
            return this.dxNodeLowFrequencyProperty.e;
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setClipChildren(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad724adc", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.dxNodeLowFrequencyProperty == null) {
            this.dxNodeLowFrequencyProperty = new bc();
        }
        this.dxNodeLowFrequencyProperty.e = z;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof m)) {
            return;
        }
        m mVar = (m) dXWidgetNode;
        this.disableFlatten = mVar.disableFlatten;
        this.listData = mVar.listData;
        this.originItems = mVar.originItems;
        this.markContainer = mVar.markContainer;
        this.dataSizeChange = mVar.dataSizeChange;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null) {
        } else {
            if (view instanceof ViewGroup) {
                if (Build.VERSION.SDK_INT >= 18) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (viewGroup.getClipChildren() != isClipChildren()) {
                        viewGroup.setClipChildren(isClipChildren());
                    }
                } else {
                    ((ViewGroup) view).setClipChildren(isClipChildren());
                }
            }
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindAccessibilityToView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0dfc7a9", new Object[]{this, view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 16) {
            String accessibilityText = getAccessibilityText();
            if (i == -1) {
                return;
            }
            if (i == 3) {
                view.setImportantForAccessibility(1);
                view.setContentDescription(null);
                return;
            }
            if (accessibilityText != null) {
                view.setContentDescription(accessibilityText);
            }
            if (i == 1) {
                view.setImportantForAccessibility(1);
                view.setFocusable(true);
            } else if (i == 2) {
                view.setImportantForAccessibility(4);
            } else {
                view.setImportantForAccessibility(2);
            }
        } else {
            view.setContentDescription("");
        }
    }

    public JSONArray getListData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("b9d49539", new Object[]{this}) : this.listData;
    }

    public void setListData(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8518899", new Object[]{this, jSONArray});
            return;
        }
        int size = jSONArray != null ? jSONArray.size() : 0;
        if (jSONArray != null) {
            i = jSONArray.size();
        }
        if (i != size) {
            this.dataSizeChange = true;
        }
        this.listData = jSONArray;
        this.propertyInitFlag |= 2;
    }

    public boolean isHandleListData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cea7f05", new Object[]{this})).booleanValue() : (this.propertyInitFlag & 2) != 0;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
        } else if ((this.propertyInitFlag & 2) != 0) {
            if (bx.o()) {
                onBeforeBindNew();
                return;
            }
            if (getChildren() != null && this.originItems == null) {
                this.originItems = new ArrayList();
                for (DXWidgetNode dXWidgetNode : getChildren()) {
                    this.originItems.add(dXWidgetNode.deepClone(getDXRuntimeContext()));
                }
            }
            JSONArray jSONArray = this.listData;
            if (jSONArray == null || jSONArray.isEmpty() || getChildren() == null) {
                removeAllChild();
                return;
            }
            if (this.originItems == null || getChildrenCount() == this.originItems.size() || com.taobao.android.dinamicx.model.f.e()) {
                z = true;
            } else {
                removeAllChild();
                for (DXWidgetNode dXWidgetNode2 : this.originItems) {
                    addChild(dXWidgetNode2.deepClone(getDXRuntimeContext()));
                }
                z = false;
            }
            new ArrayList();
            if (getDXRuntimeContext().G() && z) {
                removeAllChild();
                if (fqi.aj()) {
                    for (DXWidgetNode dXWidgetNode3 : this.originItems) {
                        addChild(dXWidgetNode3.deepClone(getDXRuntimeContext()));
                    }
                } else {
                    boolean z2 = getDXRuntimeContext() != null && fqi.u(getDXRuntimeContext().A());
                    for (DXWidgetNode dXWidgetNode4 : this.originItems) {
                        DXWidgetNode deepClone = dXWidgetNode4.deepClone(getDXRuntimeContext());
                        if (z2 && getStatInPrivateFlags(1)) {
                            deepClone.setStatFlag(1);
                        }
                        addChild(deepClone);
                    }
                }
            }
            ArrayList<DXWidgetNode> generateWidgetNodeByData = generateWidgetNodeByData(0, getListData(), getChildren());
            for (int i = 0; i < generateWidgetNodeByData.size(); i++) {
                addChild(generateWidgetNodeByData.get(i), false);
            }
        }
    }

    private void onBeforeBindNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1981e20c", new Object[]{this});
        } else if ((this.propertyInitFlag & 2) != 0) {
            JSONArray jSONArray = this.listData;
            if (jSONArray == null || jSONArray.isEmpty() || getOriginNode() == null || getOriginNode().getChildren() == null) {
                removeAllChild();
                return;
            }
            new ArrayList();
            ArrayList<DXWidgetNode> generateWidgetNodeByDataNew = generateWidgetNodeByDataNew(0, getListData(), getOriginNode().getChildren());
            if (generateWidgetNodeByDataNew == null) {
                return;
            }
            removeAllChild();
            for (int i = 0; i < generateWidgetNodeByDataNew.size(); i++) {
                addChild(generateWidgetNodeByDataNew.get(i), false);
            }
        }
    }

    public ArrayList<DXWidgetNode> generateWidgetNodeByData(int i, JSONArray jSONArray, List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8458aa13", new Object[]{this, new Integer(i), jSONArray, list});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            Object obj = jSONArray.get(i2);
            int i3 = i2 + i;
            bg bgVar = null;
            if (getDxv3VariableInfo() != null) {
                bgVar = getDxv3VariableInfo().b();
            }
            if (i3 == 0) {
                for (DXWidgetNode dXWidgetNode : list) {
                    bindContext(dXWidgetNode, obj, i3, bgVar);
                }
            } else {
                for (DXWidgetNode dXWidgetNode2 : list) {
                    DXRuntimeContext a2 = dXWidgetNode2.getDXRuntimeContext().a(dXWidgetNode2);
                    a2.a(obj);
                    a2.b(i3);
                    if (getDxv3VariableInfo() != null) {
                        a2.a(bgVar);
                    }
                    HashMap hashMap = new HashMap();
                    a2.a((Map<String, com.taobao.android.dinamicx.expression.expr_v2.f>) hashMap);
                    hashMap.put(com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, com.taobao.android.dinamicx.expression.expr_v2.f.a(i3));
                    hashMap.put(Constants.Name.Recycler.LIST_DATA, com.taobao.android.dinamicx.expression.expr_v2.f.a(jSONArray));
                    DXWidgetNode a3 = n.a(dXWidgetNode2, a2);
                    a3.setParentWidget(this);
                    arrayList.add(a3);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<DXWidgetNode> generateWidgetNodeByDataNew(int i, JSONArray jSONArray, List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8b4ba78b", new Object[]{this, new Integer(i), jSONArray, list});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            Object obj = jSONArray.get(i2);
            int i3 = i2 + i;
            bg bgVar = null;
            if (getDxv3VariableInfo() != null) {
                bgVar = getDxv3VariableInfo().b();
            }
            for (DXWidgetNode dXWidgetNode : list) {
                DXRuntimeContext a2 = getDXRuntimeContext().a(dXWidgetNode);
                a2.a(obj);
                a2.b(i3);
                a2.a(bgVar);
                HashMap hashMap = new HashMap();
                a2.a((Map<String, com.taobao.android.dinamicx.expression.expr_v2.f>) hashMap);
                hashMap.put(com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, com.taobao.android.dinamicx.expression.expr_v2.f.a(i3));
                hashMap.put(Constants.Name.Recycler.LIST_DATA, com.taobao.android.dinamicx.expression.expr_v2.f.a(jSONArray));
                if (com.taobao.android.dinamicx.ax.a(dXWidgetNode, a2) == 0) {
                    DXWidgetNode a3 = n.a(dXWidgetNode, a2);
                    a3.getDXRuntimeContext().a(bgVar);
                    a3.setParentWidget(this);
                    arrayList.add(a3);
                }
            }
        }
        return arrayList;
    }

    public void bindContext(DXWidgetNode dXWidgetNode, Object obj, int i, bg bgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74674c73", new Object[]{this, dXWidgetNode, obj, new Integer(i), bgVar});
            return;
        }
        dXWidgetNode.getDXRuntimeContext().a(obj);
        dXWidgetNode.getDXRuntimeContext().b(i);
        HashMap hashMap = new HashMap();
        dXWidgetNode.getDXRuntimeContext().a((Map<String, com.taobao.android.dinamicx.expression.expr_v2.f>) hashMap);
        hashMap.put(com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, com.taobao.android.dinamicx.expression.expr_v2.f.a(i));
        hashMap.put(Constants.Name.Recycler.LIST_DATA, com.taobao.android.dinamicx.expression.expr_v2.f.a(getListData()));
        if (bgVar != null) {
            dXWidgetNode.getDXRuntimeContext().a(bgVar);
        }
        if (dXWidgetNode.getSourceWidget() == null) {
            dXWidgetNode.setSourceWidget(dXWidgetNode);
        } else if (fqi.G() && dXWidgetNode.getDXRuntimeContext().G()) {
            dXWidgetNode.setSourceWidget(dXWidgetNode);
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children == null || children.size() == 0) {
            return;
        }
        for (DXWidgetNode dXWidgetNode2 : children) {
            bindContext(dXWidgetNode2, obj, i, bgVar);
        }
    }

    public boolean isMarkContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("73f9f2b5", new Object[]{this})).booleanValue() : this.markContainer;
    }

    public void setMarkContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31e677b", new Object[]{this, new Boolean(z)});
        } else {
            this.markContainer = z;
        }
    }

    public Map<String, WeakReference<DXWidgetNode>> getDxUserIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("60c39548", new Object[]{this});
        }
        if (this.dxUserIdMap == null) {
            this.dxUserIdMap = new HashMap();
        }
        return this.dxUserIdMap;
    }

    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (!Constants.Name.Recycler.LIST_DATA.equals(str)) {
            return null;
        }
        return this.listData;
    }

    public boolean isDataSizeChange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd7a4c30", new Object[]{this})).booleanValue() : this.dataSizeChange;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildDataWithButter() {
        DXWidgetNode originNode;
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355dbe58", new Object[]{this});
        } else if (isHandleListData() && (originNode = getOriginNode()) != null && (children = originNode.getChildren()) != null) {
            if (this.recycledPool == null) {
                this.recycledPool = new a();
                this.templateSize = originNode.getChildrenCount();
            }
            int childrenCount = getChildrenCount();
            JSONArray listData = getListData();
            if (listData == null || listData.isEmpty()) {
                for (int i = childrenCount - 1; i >= 0; i--) {
                    recycleView(i);
                }
                return;
            }
            int size = listData.size() * this.templateSize;
            if (childrenCount > size) {
                for (int i2 = childrenCount - 1; i2 >= size; i2--) {
                    recycleView(i2);
                }
            }
            for (int i3 = 0; i3 < listData.size(); i3++) {
                Object obj = listData.get(i3);
                int i4 = 0;
                while (true) {
                    int i5 = this.templateSize;
                    if (i4 < i5) {
                        int i6 = (i5 * i3) + i4;
                        bg bgVar = null;
                        if (i6 < getChildrenCount()) {
                            DXWidgetNode childAt = getChildAt(i6);
                            if (getDxv3VariableInfo() != null) {
                                bgVar = getDxv3VariableInfo().b();
                            }
                            if (childAt.getVisibility() == 2) {
                                childAt.setVisibility(0);
                            }
                            bindContextWithButter(childAt, obj, i3, bgVar);
                        } else {
                            DXWidgetNode cacheView = getCacheView(i4);
                            if (cacheView == null) {
                                DXWidgetNode dXWidgetNode = children.get(i4);
                                DXRuntimeContext a2 = getDXRuntimeContext().a(dXWidgetNode);
                                a2.a(obj);
                                a2.b(i3);
                                if (getDxv3VariableInfo() != null) {
                                    a2.a(getDxv3VariableInfo().b());
                                }
                                cacheView = dXWidgetNode.shallowButterClone(a2);
                            } else {
                                if (getDxv3VariableInfo() != null) {
                                    bgVar = getDxv3VariableInfo().b();
                                }
                                if (cacheView.getVisibility() == 2) {
                                    cacheView.setVisibility(0);
                                }
                                bindContextWithButter(cacheView, obj, i3, bgVar);
                            }
                            addChild(cacheView, false);
                        }
                        i4++;
                    }
                }
            }
        }
    }

    public void bindContextWithButter(DXWidgetNode dXWidgetNode, Object obj, int i, bg bgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76268bad", new Object[]{this, dXWidgetNode, obj, new Integer(i), bgVar});
            return;
        }
        dXWidgetNode.getDXRuntimeContext().a(obj);
        dXWidgetNode.getDXRuntimeContext().b(i);
        if (bgVar != null) {
            dXWidgetNode.getDXRuntimeContext().a(bgVar);
        }
        dXWidgetNode.setSourceWidget(dXWidgetNode);
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children == null || children.size() == 0) {
            return;
        }
        for (DXWidgetNode dXWidgetNode2 : children) {
            bindContextWithButter(dXWidgetNode2, obj, i, bgVar);
        }
    }

    public void recycleView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3b0684", new Object[]{this, new Integer(i)});
            return;
        }
        DXWidgetNode childAt = getChildAt(i);
        removeChildAt(i);
        ViewGroup viewContainer = childAt.getViewContainer();
        if (viewContainer != null) {
            removeNativeView(viewContainer, childAt);
        }
        this.recycledPool.a(i % this.templateSize, childAt);
    }

    public void removeNativeView(ViewGroup viewGroup, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a83929", new Object[]{this, viewGroup, dXWidgetNode});
            return;
        }
        View nativeView = dXWidgetNode.getNativeView();
        if (nativeView != null) {
            viewGroup.removeView(nativeView);
        } else if (dXWidgetNode.getChildrenCount() > 0) {
            for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.getChildren()) {
                removeNativeView(viewGroup, dXWidgetNode2);
            }
        }
    }

    public void cloneChildNode(DXRuntimeContext dXRuntimeContext) {
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bff9d9", new Object[]{this, dXRuntimeContext});
            return;
        }
        DXWidgetNode originNode = getOriginNode();
        if (originNode == null || (children = originNode.getChildren()) == null) {
            return;
        }
        for (int i = 0; i < children.size(); i++) {
            addChild(children.get(i).shallowButterClone(dXRuntimeContext), false);
        }
    }

    public DXWidgetNode getCacheView(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("924ece8a", new Object[]{this, new Integer(i)}) : this.recycledPool.a(i);
    }

    public void dispatchMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4307ab", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            onMeasure(i, i2);
        }
    }

    public void dispatchLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d2da9", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            onLayout(z, i, i2, i3, i4);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private SparseArray<ArrayList<DXWidgetNode>> f12109a = new SparseArray<>();
        private SparseIntArray b = new SparseIntArray();

        static {
            kge.a(1759107744);
        }

        public DXWidgetNode a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("3b8b8eba", new Object[]{this, new Integer(i)});
            }
            ArrayList<DXWidgetNode> arrayList = this.f12109a.get(i);
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            int size = arrayList.size() - 1;
            DXWidgetNode dXWidgetNode = arrayList.get(size);
            arrayList.remove(size);
            return dXWidgetNode;
        }

        public void a(int i, DXWidgetNode dXWidgetNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7041c4f4", new Object[]{this, new Integer(i), dXWidgetNode});
                return;
            }
            ArrayList<DXWidgetNode> b = b(i);
            if (this.b.get(i) <= b.size()) {
                return;
            }
            b.add(dXWidgetNode);
        }

        private ArrayList<DXWidgetNode> b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("b2faef14", new Object[]{this, new Integer(i)});
            }
            ArrayList<DXWidgetNode> arrayList = this.f12109a.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f12109a.put(i, arrayList);
                if (this.b.indexOfKey(i) < 0) {
                    this.b.put(i, 10);
                }
            }
            return arrayList;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void changeVisibility() {
        int childrenCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b79ba69", new Object[]{this});
            return;
        }
        super.changeVisibility();
        if (getNativeView() != null || (childrenCount = getChildrenCount()) <= 0) {
            return;
        }
        for (int i = 0; i < childrenCount; i++) {
            getChildAt(i).changeVisibility();
        }
    }
}
