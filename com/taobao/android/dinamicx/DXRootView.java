package com.taobao.android.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.expression.event.DXViewAppearEvent;
import com.taobao.android.dinamicx.expression.event.DXViewDisappearEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import tb.fqb;
import tb.gbh;
import tb.kge;

/* loaded from: classes.dex */
public class DXRootView extends DXNativeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<DXWidgetNode> animationWidgets;
    public WeakReference<fqb> bindingXManagerWeakReference;
    public JSONObject data;
    public DXNestedScrollerView dxNestedScrollerView;
    public Map<Integer, DXNestedScrollerView> dxNestedScrollerViewMap;
    public DXTemplateItem dxTemplateItem;
    public boolean isRendering;
    public int parentHeightSpec;
    public int parentWidthSpec;
    private Stack<cg> pendingRenderInfoStack;
    private Map<String, String> perfromTrackData;
    private int position;
    public a rootViewLifeCycle;

    /* loaded from: classes5.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1572870151);
        }

        public void a(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            }
        }

        public void a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
            }
        }

        public void a(DXRootView dXRootView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfd963a", new Object[]{this, dXRootView, new Integer(i)});
            }
        }

        public void b(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4766dc6a", new Object[]{this, dXRootView});
            }
        }

        public void b(DXRootView dXRootView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a57523d9", new Object[]{this, dXRootView, new Integer(i)});
            }
        }
    }

    static {
        kge.a(-2073157778);
        kge.a(-1389889251);
    }

    public static /* synthetic */ Object ipc$super(DXRootView dXRootView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 327977732:
                super.dispatchWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public DXRootView(Context context) {
        super(context);
    }

    public DXRootView(Context context, DXWidgetNode dXWidgetNode) {
        super(context);
        setExpandWidgetNode(dXWidgetNode);
    }

    public void setMeasureDimension(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aee25d1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(i, i2);
        }
    }

    public DXTemplateItem getDxTemplateItem() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("e3552b21", new Object[]{this}) : this.dxTemplateItem;
    }

    public void setDxTemplateItem(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213e393", new Object[]{this, dXTemplateItem});
        } else {
            this.dxTemplateItem = dXTemplateItem;
        }
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }

    public int getPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue() : this.position;
    }

    public void setPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
        } else {
            this.position = i;
        }
    }

    public DXWidgetNode getExpandWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("d0f19cbc", new Object[]{this});
        }
        Object tag = getTag(ae.f11799a);
        if (!(tag instanceof DXWidgetNode)) {
            return null;
        }
        return (DXWidgetNode) tag;
    }

    public void setExpandWidgetNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31df1a6", new Object[]{this, dXWidgetNode});
        } else {
            setTag(ae.f11799a, dXWidgetNode);
        }
    }

    public DXWidgetNode getFlattenWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5ac407a", new Object[]{this});
        }
        if (!bx.p()) {
            return gbh.b(this);
        }
        return gbh.b(this);
    }

    public void setFlattenWidgetNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec61f40", new Object[]{this, dXWidgetNode});
        } else {
            gbh.a((View) this, (com.taobao.android.dinamicx.widget.bi) dXWidgetNode);
        }
    }

    public fqb getBindingXManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fqb) ipChange.ipc$dispatch("4049b404", new Object[]{this});
        }
        WeakReference<fqb> weakReference = this.bindingXManagerWeakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setBindingXManagerWeakReference(fqb fqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471f3bb", new Object[]{this, fqbVar});
        } else {
            this.bindingXManagerWeakReference = new WeakReference<>(fqbVar);
        }
    }

    public void postMessage(Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b814caa", new Object[]{this, obj});
            return;
        }
        try {
            if (!(obj instanceof JSONObject)) {
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            String string = jSONObject2.getString("type");
            if ("BNDX".equalsIgnoreCase(string) && getBindingXManager() != null) {
                getBindingXManager().a(this, jSONObject2);
                return;
            }
            DXWidgetNode expandWidgetNode = getExpandWidgetNode();
            if (expandWidgetNode == null || (jSONObject = jSONObject2.getJSONObject("params")) == null) {
                return;
            }
            String string2 = jSONObject.getString("targetId");
            DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
            dXMsgCenterEvent.setParams(jSONObject);
            dXMsgCenterEvent.setTargetId(string2);
            dXMsgCenterEvent.setType(string);
            DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(string2);
            if (queryWidgetNodeByUserId != null && queryWidgetNodeByUserId.getReferenceNode() != null) {
                queryWidgetNodeByUserId.postEvent(dXMsgCenterEvent);
            } else {
                expandWidgetNode.sendBroadcastEvent(dXMsgCenterEvent);
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            String str = null;
            if (getBindingXManager() != null) {
                str = getBindingXManager().f11887a;
            }
            if (TextUtils.isEmpty(str)) {
                str = "dinamicx";
            }
            com.taobao.android.dinamicx.monitor.b.a(str, null, DXMonitorConstant.DX_MONITOR_BINDINGX, DXMonitorConstant.DX_BINDINGX_CRASH, s.BINDINGX_POST_MSG_CRASH, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public void onRootViewAppear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22be1961", new Object[]{this, new Integer(i)});
            return;
        }
        DXTraceUtil.a("RootView#onRootViewAppear");
        DXViewAppearEvent dXViewAppearEvent = new DXViewAppearEvent(5288671110273408574L);
        dXViewAppearEvent.setItemIndex(i);
        DXWidgetNode expandWidgetNode = getExpandWidgetNode();
        if (expandWidgetNode == null) {
            return;
        }
        expandWidgetNode.sendBroadcastEvent(dXViewAppearEvent);
        DXTraceUtil.a();
    }

    public void onRootViewDisappear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7223a0df", new Object[]{this, new Integer(i)});
            return;
        }
        DXTraceUtil.a("RootView#onRootViewDisappear");
        DXViewDisappearEvent dXViewDisappearEvent = new DXViewDisappearEvent(5388973340095122049L);
        dXViewDisappearEvent.setItemIndex(i);
        DXWidgetNode expandWidgetNode = getExpandWidgetNode();
        if (expandWidgetNode == null) {
            return;
        }
        expandWidgetNode.sendBroadcastEvent(dXViewDisappearEvent);
        DXTraceUtil.a();
    }

    public void registerDXRootViewLifeCycle(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82726d7", new Object[]{this, aVar});
        } else {
            this.rootViewLifeCycle = aVar;
        }
    }

    public boolean hasDXRootViewLifeCycle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a4e9b60", new Object[]{this})).booleanValue() : this.rootViewLifeCycle != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138c8b04", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.dispatchWindowVisibilityChanged(i);
            if (this.rootViewLifeCycle == null) {
                return;
            }
            this.rootViewLifeCycle.a(this, i);
        } catch (Throwable th) {
            trackError(s.DX_NATIVE_CRASH_7, th);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.onWindowVisibilityChanged(i);
            if (this.rootViewLifeCycle == null) {
                return;
            }
            this.rootViewLifeCycle.b(this, i);
        } catch (Throwable th) {
            trackError(s.DX_NATIVE_CRASH_8, th);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        try {
            super.onVisibilityChanged(view, i);
            if (this.rootViewLifeCycle == null) {
                return;
            }
            this.rootViewLifeCycle.a(view, i);
        } catch (Throwable th) {
            trackError(s.DX_NATIVE_CRASH_9, th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
            if (this.rootViewLifeCycle == null) {
                return;
            }
            this.rootViewLifeCycle.a(this);
        } catch (Throwable th) {
            trackError(s.DX_NATIVE_CRASH_10, th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        try {
            super.onAttachedToWindow();
            if (this.rootViewLifeCycle == null) {
                return;
            }
            this.rootViewLifeCycle.b(this);
        } catch (Throwable th) {
            trackError(s.DX_NATIVE_CRASH_11, th);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        try {
            super.onStartTemporaryDetach();
        } catch (Throwable th) {
            trackError(s.DX_NATIVE_CRASH_12, th);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        try {
            super.onFinishTemporaryDetach();
        } catch (Throwable th) {
            trackError(s.DX_NATIVE_CRASH_13, th);
        }
    }

    public Object getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("24024602", new Object[]{this}) : this.data;
    }

    public void _addAnimationWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772916a2", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            if (this.animationWidgets == null) {
                this.animationWidgets = new ArrayList();
            }
            if (this.animationWidgets.contains(dXWidgetNode)) {
                return;
            }
            this.animationWidgets.add(dXWidgetNode);
        }
    }

    public void _removeAnimationWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705e13e3", new Object[]{this, dXWidgetNode});
            return;
        }
        List<DXWidgetNode> list = this.animationWidgets;
        if (list == null) {
            return;
        }
        list.remove(dXWidgetNode);
    }

    public boolean _containAnimationWidget(DXWidgetNode dXWidgetNode) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31e910d9", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode != null && (list = this.animationWidgets) != null && list.size() != 0) {
            return this.animationWidgets.contains(dXWidgetNode);
        }
        return false;
    }

    public List<DXWidgetNode> _getAnimationWidgets() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f6fd105e", new Object[]{this}) : this.animationWidgets;
    }

    public void _clearAnimationWidgets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf91000", new Object[]{this});
        } else {
            this.animationWidgets = new ArrayList();
        }
    }

    public DXNestedScrollerView getDxNestedScrollerView(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXNestedScrollerView) ipChange.ipc$dispatch("e117d81f", new Object[]{this, dXRuntimeContext});
        }
        if (this.dxNestedScrollerViewMap == null || dXRuntimeContext == null || dXRuntimeContext.Q() < 0) {
            if (this.dxNestedScrollerView == null) {
                this.dxNestedScrollerView = new DXNestedScrollerView(getContext());
            }
            return this.dxNestedScrollerView;
        }
        DXNestedScrollerView dXNestedScrollerView = this.dxNestedScrollerViewMap.get(Integer.valueOf(dXRuntimeContext.Q()));
        if (dXNestedScrollerView != null) {
            return dXNestedScrollerView;
        }
        DXNestedScrollerView dXNestedScrollerView2 = new DXNestedScrollerView(getContext());
        this.dxNestedScrollerViewMap.put(Integer.valueOf(dXRuntimeContext.Q()), dXNestedScrollerView2);
        return dXNestedScrollerView2;
    }

    public DXNestedScrollerView getDxNestedScrollerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXNestedScrollerView) ipChange.ipc$dispatch("366fe5ee", new Object[]{this}) : getDxNestedScrollerView(null);
    }

    public Map<Integer, DXNestedScrollerView> getDxNestedScrollerViewMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("58fdf3f8", new Object[]{this}) : this.dxNestedScrollerViewMap;
    }

    public void initDxNestedScrollerViewMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f754909", new Object[]{this});
        } else if (this.dxNestedScrollerViewMap != null) {
        } else {
            this.dxNestedScrollerViewMap = new HashMap();
        }
    }

    public void removeDxNestedScrollerViewMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45af2d15", new Object[]{this});
        } else {
            this.dxNestedScrollerViewMap = null;
        }
    }

    private void trackError(int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1f5b56", new Object[]{this, new Integer(i), th});
            return;
        }
        com.taobao.android.dinamicx.exception.a.b(th);
        String str = null;
        if (getBindingXManager() != null) {
            str = getBindingXManager().f11887a;
        }
        if (TextUtils.isEmpty(str)) {
            str = "dinamicx";
        }
        com.taobao.android.dinamicx.monitor.b.a(str, getDxTemplateItem(), "native", DXMonitorConstant.NATIVE_CRASH, i, com.taobao.android.dinamicx.exception.a.a(th));
    }

    public Map<String, String> getPerfromTrackData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1f64f200", new Object[]{this}) : this.perfromTrackData;
    }

    public void setPerfromTrackData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54da4c8e", new Object[]{this, map});
        } else {
            this.perfromTrackData = map;
        }
    }

    public void addPendingInfo(cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d3901e3", new Object[]{this, cgVar});
        } else if (cgVar == null) {
        } else {
            if (this.pendingRenderInfoStack == null) {
                this.pendingRenderInfoStack = new Stack<>();
            }
            this.pendingRenderInfoStack.push(cgVar);
        }
    }

    public cg popPendingInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cg) ipChange.ipc$dispatch("c61f3b33", new Object[]{this});
        }
        Stack<cg> stack = this.pendingRenderInfoStack;
        if (stack != null) {
            return stack.pop();
        }
        return null;
    }
}
