package com.taobao.mmad.render.dx.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.mmad.render.dx.event.DXSwipeInteractEvent;
import com.taobao.mmad.render.dx.widget.SwipeInteractionView;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends DXWidgetNode implements SwipeInteractionView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMMSWIPEINTERACTIONVIEW_MMSWIPEINTERACTIONVIEW = 1741968678668221171L;
    public static final long DXMMSWIPEINTERACTIONVIEW_ONINTERACTION = -57268497338027670L;
    public static final long DXMMSWIPEINTERACTIONVIEW_VALIDSLIDEDISTANCE = 127847132595251262L;

    /* renamed from: a  reason: collision with root package name */
    private double f18122a = 75.0d;
    private SwipeInteractionView b;

    static {
        kge.a(-111279961);
        kge.a(-1077595101);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* renamed from: com.taobao.mmad.render.dx.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0722a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2136391554);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof a)) {
        } else {
            super.onClone(dXWidgetNode, z);
            this.f18122a = ((a) dXWidgetNode).f18122a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new SwipeInteractionView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof SwipeInteractionView)) {
        } else {
            this.b = (SwipeInteractionView) view;
            this.b.setValidSlideDistance((int) this.f18122a);
            this.b.setSwipeInteractionListener(this);
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXMMSWIPEINTERACTIONVIEW_VALIDSLIDEDISTANCE) {
            this.f18122a = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j != DXMMSWIPEINTERACTIONVIEW_VALIDSLIDEDISTANCE) {
            return super.getDefaultValueForDoubleAttr(j);
        }
        return 75.0d;
    }

    @Override // com.taobao.mmad.render.dx.widget.SwipeInteractionView.a
    public void a(boolean z, float f, double d, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ebec16", new Object[]{this, new Boolean(z), new Float(f), new Double(d), new Float(f2)});
            return;
        }
        if (getDXRuntimeContext() != null && getDXRuntimeContext().e() != null) {
            getDXRuntimeContext().e().put("isInteractSuccess", (Object) String.valueOf(z));
        }
        postEvent(new DXSwipeInteractEvent(DXMMSWIPEINTERACTIONVIEW_ONINTERACTION, z, f, d, f2));
    }
}
