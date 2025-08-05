package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import tb.kge;

/* loaded from: classes9.dex */
public class DXObjectTriggerWidgetNode extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXOBJECTTRIGGER_DATA = 33556442494L;
    public static final long DXOBJECTTRIGGER_IGNOREFIRST = -5117848632570300777L;
    public static final int DXOBJECTTRIGGER_IGNOREFIRST_FALSE = 0;
    public static final int DXOBJECTTRIGGER_IGNOREFIRST_TRUE = 1;
    public static final long DXOBJECTTRIGGER_OBJECTTRIGGER = 6254774490434620216L;
    public static final long DXOBJECTTRIGGER_ONDATACHANGED = -6654049759731953906L;
    private Object data;
    private int ignoreFirst;

    static {
        kge.a(-1279756607);
    }

    public static /* synthetic */ Object ipc$super(DXObjectTriggerWidgetNode dXObjectTriggerWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
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
            case 1794007282:
                super.setObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes9.dex */
    public static class Builder implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-618595176);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXObjectTriggerWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXObjectTriggerWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXObjectTriggerWidgetNode)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXObjectTriggerWidgetNode dXObjectTriggerWidgetNode = (DXObjectTriggerWidgetNode) dXWidgetNode;
            this.data = dXObjectTriggerWidgetNode.data;
            this.ignoreFirst = dXObjectTriggerWidgetNode.ignoreFirst;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new ObjectTriggerView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        Object obj;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null) {
            return;
        }
        ObjectTriggerView objectTriggerView = (ObjectTriggerView) view;
        if (ObjectTriggerView.access$000(objectTriggerView)) {
            ObjectTriggerView.access$002(objectTriggerView, false);
            if (this.ignoreFirst == 1) {
                ObjectTriggerView.access$102(objectTriggerView, this.data);
                return;
            }
        }
        Object access$100 = ObjectTriggerView.access$100(objectTriggerView);
        if (access$100 != null || this.data != null) {
            z = (access$100 == null || (obj = this.data) == null) ? true : !obj.equals(access$100);
        }
        if (!z) {
            return;
        }
        ObjectTriggerView.access$102(objectTriggerView, this.data);
        postEvent(new DXEvent(DXOBJECTTRIGGER_ONDATACHANGED));
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 33556442494L) {
            this.data = obj;
        } else {
            super.setObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXOBJECTTRIGGER_IGNOREFIRST) {
            this.ignoreFirst = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    /* loaded from: classes9.dex */
    public static class ObjectTriggerView extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object data;
        private boolean isRenderFirst;

        static {
            kge.a(-195431301);
        }

        public static /* synthetic */ boolean access$000(ObjectTriggerView objectTriggerView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c151b9cf", new Object[]{objectTriggerView})).booleanValue() : objectTriggerView.isRenderFirst;
        }

        public static /* synthetic */ boolean access$002(ObjectTriggerView objectTriggerView, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("86699ab", new Object[]{objectTriggerView, new Boolean(z)})).booleanValue();
            }
            objectTriggerView.isRenderFirst = z;
            return z;
        }

        public static /* synthetic */ Object access$100(ObjectTriggerView objectTriggerView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9b68f6a6", new Object[]{objectTriggerView}) : objectTriggerView.data;
        }

        public static /* synthetic */ Object access$102(ObjectTriggerView objectTriggerView, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("d33edd08", new Object[]{objectTriggerView, obj});
            }
            objectTriggerView.data = obj;
            return obj;
        }

        public ObjectTriggerView(Context context) {
            super(context);
            this.data = null;
            this.isRenderFirst = true;
        }
    }
}
